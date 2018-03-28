package brew.xtext.compiler

import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import brew.xtext.brew.BrewRoot
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class BrewJvmModelGenerator extends JvmModelGenerator {
	@Inject extension AleUtils
	@Inject extension EcoreUtils

	override doGenerate(Resource input, IFileSystemAccess fsa) {

		this.generateEcore(input)

		super.doGenerate(input, fsa)
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
