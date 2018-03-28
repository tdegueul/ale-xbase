package brew.xtext.compiler

import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import brew.xtext.brew.BrewRoot
import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.generator.Generator
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.common.util.BasicMonitor
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

		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl);
		val resource = resourceSet.createResource(ecoreFileUri);

		(resource as XMIResource).defaultSaveOptions.put(XMLResource.OPTION_ENCODING, 'UTF-8')

		val is = brewRoot.importSemantics.map[it.ale.ecoreImport].map[it.uri.loadCorrespondingGenmodel].map [
			it.genPackages.toList
		].flatten

		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
			modelDirectory = '''/«projectName»/src'''
			modelPluginID = projectName
			modelName = brewRoot.name.toFirstUpper
			complianceLevel = GenJDKLevel.JDK80_LITERAL
			copyrightFields = false
			usedGenPackages += is
			operationReflection = true
			importOrganizing = true
			foreignModel += '''«brewRoot.name».ecore'''
			genPackages += GenModelFactory.eINSTANCE.createGenPackage => [
				prefix = brewRoot.name.toFirstUpper
				disposableProviderFactory = true
				ecorePackage = mainPackage
			]
		];

		resource.contents.add(genModel)
		resource.save(null)

		genModel.reconcile
		genModel.canGenerate = true
		genModel.updateClasspath = false

		val reg = GeneratorAdapterFactory.Descriptor.Registry.INSTANCE
		val generator = new Generator(reg) => [
			input = genModel
		]

		generator.generate(genModel, GenBaseGeneratorAdapter::MODEL_PROJECT_TYPE, new BasicMonitor.Printing(System.out))
	}

	def void generateEcore(Resource input) {
		val brewRoot = input.allContents.head as BrewRoot

		val ecoreFileUri = URI.
			createPlatformResourceURI('''/«input.URI.segmentsList.get(1)»/model/«brewRoot.name».ecore''', true)

		val resourceSet = new ResourceSetImpl
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl);
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

		resource.contents.add(ecorePackage)
		resource.save(null)
	}

}
