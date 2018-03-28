/*
 * generated by Xtext 2.12.0
 */
package brew.xtext.validation

import brew.xtext.brew.AleImport
import brew.xtext.brew.BrewPackage
import org.eclipse.xtext.validation.Check
import brew.xtext.brew.BrewRoot
import com.google.inject.Inject
import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BrewValidator extends AbstractBrewValidator {

	@Inject extension AleUtils
	@Inject extension EcoreUtils

	@Check
	def checkDuplicatedAleImports(AleImport aleImport) {
		if ((aleImport.eContainer as BrewRoot).importSemantics.filter[it.ale == aleImport.ale].size > 1) {
			error('''«aleImport.ale.name» is imported more than once''', BrewPackage.eINSTANCE.aleImport_Ale)
		}
	}

	@Check
	def checkRequiredBound(AleImport aleImport) {
		val required = aleImport.ale.classes.filter [
			it.getMatchingEClass.hasRequiredAnnotation
		]

		val plural = required.size > 1

		if (!required.empty) {
			error('''Class«IF plural»es«ENDIF» «FOR r : required SEPARATOR ', '»«r.name»«ENDFOR» of «aleImport.ale.name» «IF plural»are«ELSE»is«ENDIF» required''',
				BrewPackage.eINSTANCE.aleImport_Ale)
		}

	}

}
