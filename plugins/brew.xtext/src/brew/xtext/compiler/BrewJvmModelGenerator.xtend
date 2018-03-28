package brew.xtext.compiler

import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import brew.xtext.brew.BrewRoot
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class BrewJvmModelGenerator extends JvmModelGenerator {
	@Inject extension AleUtils
	@Inject extension EcoreUtils

	override doGenerate(Resource input, IFileSystemAccess fsa) {

		this.generateEcore(input)
		this.generateGenmodel(input)

		super.doGenerate(input, fsa)
	}

	def generateGenmodel(Resource input) {

		val brewRoot = input.allContents.head as BrewRoot
		val projectName = input.URI.segmentsList.get(1)
		val mainPackage = '''/«projectName»/model/«brewRoot.name».ecore'''.toString.loadEPackage

		val ecoreFileUri = URI.createPlatformResourceURI('''/«projectName»/model/«brewRoot.name».genmodel''', true)

		val resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl);
		val resource = resourceSet.createResource(ecoreFileUri);

		(resource as XMIResource).defaultSaveOptions.put(XMLResource.OPTION_ENCODING, 'UTF-8')
		
		val is = brewRoot.importSemantics.map[it.ale.ecoreImport].map[it.uri.loadCorrespondingGenmodel].map[it.genPackages.toList].flatten

		val genmodelPackage = GenModelFactory.eINSTANCE.createGenModel => [
			modelDirectory = '''/«projectName»/src'''
			modelPluginID = projectName
			modelName = brewRoot.name.toFirstUpper
			complianceLevel = GenJDKLevel.JDK80_LITERAL
			copyrightFields = false
			it.usedGenPackages.addAll(is)
			operationReflection = true
			importOrganizing = true
			foreignModel += '''«brewRoot.name».ecore'''
			genPackages += GenModelFactory.eINSTANCE.createGenPackage => [
				prefix = brewRoot.name.toFirstUpper
				disposableProviderFactory = true

				ecorePackage = mainPackage
//				genClasses += mainPackage.EClassifiers.filter(EClass).map [ecs|
//					GenModelFactory.eINSTANCE.createGenClass => [
//						ecoreClass = ecs
//						genFeatures += GenModelFactory.eINSTANCE.createGenFeature => [
//							notify = false
//							propertySortChoices = true
//							
//						]
//					]
//				]
			]
		];

		resource.getContents().add(genmodelPackage)
		resource.save(null)

	}

	def void generateEcore(Resource input) {
		val brewRoot = input.allContents.head as BrewRoot

		val ecoreFileUri = URI.
			createPlatformResourceURI('''/«input.URI.segmentsList.get(1)»/model/«brewRoot.name».ecore''', true)

		val resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
			new EcoreResourceFactoryImpl());
		val resource = resourceSet.createResource(ecoreFileUri);

		val ecorePackage = EcoreFactory.eINSTANCE.createEPackage => [
			name = brewRoot.name
			nsPrefix = brewRoot.name
			nsURI = '''http://«brewRoot.name»'''
		];

		brewRoot.bound.forEach [ classBind |
			ecorePackage.EClassifiers += EcoreFactory.eINSTANCE.createEClass => [
				name = '''«classBind.requiredCls.name»Bind'''
				ESuperTypes += classBind.requiredCls.getMatchingEClass
				EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
					lowerBound = 1
					upperBound = 1
					EType = classBind.providedCls.matchingEClass
					name = 'delegate'
				]
			]
		]

		resource.getContents().add(ecorePackage)
		resource.save(null)
	}

}
