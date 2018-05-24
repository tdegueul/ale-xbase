package brew.xtext.compiler

import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import brew.xtext.brew.BrewRoot
import brew.xtext.util.NamingUtils
import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class BrewJvmModelGenerator extends JvmModelGenerator {
	@Inject extension AleUtils
	@Inject extension EcoreUtils
	@Inject extension NamingUtils

	override doGenerate(Resource input, IFileSystemAccess fsa) {

		val brewRoot = EcoreUtil2.copy(input.allContents.head) as BrewRoot
		val EPackage ePackage = this.generateEcore(input, brewRoot)
		this.generateGenmodel(input, ePackage, brewRoot)
		super.doGenerate(input, fsa)

	}

	def generateGenmodel(Resource input, EPackage mainPackage, BrewRoot brewRoot) {
		val projectName = input.URI.segmentsList.get(1)
		val ecoreFileUri = URI.createPlatformResourceURI('''/«projectName»/model/«brewRoot.name».genmodel''', true)

		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)
		val resource = resourceSet.createResource(ecoreFileUri)

		(resource as XMIResource).defaultSaveOptions.put(XMLResource.OPTION_ENCODING, 'UTF-8')

		val ugp = brewRoot.importSemantics.map[it.ale.ecoreImport].map[it.uri.loadCorrespondingGenmodel].map [
			genPackages.toList
		].flatten

		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
			modelDirectory = '''/«projectName»/src-gen'''
			modelPluginID = projectName
			modelName = brewRoot.name.toFirstUpper
			complianceLevel = GenJDKLevel.JDK80_LITERAL
			copyrightFields = false
			usedGenPackages += ugp
			operationReflection = true
			importOrganizing = true
			foreignModel += '''«brewRoot.name».ecore'''
			genPackages += GenModelFactory.eINSTANCE.createGenPackage => [
				prefix = brewRoot.name.toFirstUpper
				disposableProviderFactory = true
				ecorePackage = mainPackage
				genClasses += mainPackage.EClassifiers.filter(EClass).map [ eClass |
					GenModelFactory.eINSTANCE.createGenClass => [
						ecoreClass = eClass
					]
				]
			]
		]

		resource.contents.add(genModel)

		resource.save(null)

		genModel
	}

	def EPackage generateEcore(Resource input, BrewRoot brewRoot) {

		val extension factory = EcoreFactory.eINSTANCE

		val ecoreFileUri = URI.
			createPlatformResourceURI('''/«input.URI.segmentsList.get(1)»/model/«brewRoot.name».ecore''', true)

		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		val resource = resourceSet.createResource(ecoreFileUri)

		val ecorePackage = createEPackage => [
			name = brewRoot.name
			nsPrefix = brewRoot.name
			nsURI = '''http://«brewRoot.name»'''
			EAnnotations += createEAnnotation => [ annot |
				annot.source = "@BrewRequires"
				brewRoot.importSemantics.map[it.ale.ecoreImport].forEach [
					annot.details.put(it.uri, "ecoreUrl")
				]

			]
		]

		brewRoot.bound.forEach [ classBind |
			if (!classBind.nothing) {
				ecorePackage.EClassifiers += createEClass => [
					name = classBind.bindClassName
					ESuperTypes += classBind.requiredCls.getMatchingEClass
					EStructuralFeatures += createEReference => [
						lowerBound = 1
						upperBound = 1
						EType = classBind.providedCls.matchingEClass
						name = 'delegate'
					]
				]
			}
		]

		resource.contents.add(ecorePackage)
		resource.save(null)

		ecorePackage
	}

}
