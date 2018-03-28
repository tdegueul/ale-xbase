/*
 * generated by Xtext 2.12.0
 */
package brew.xtext.formatting2

import brew.xtext.brew.AleImport
import brew.xtext.brew.BrewRoot
import brew.xtext.services.BrewGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter

class BrewFormatter extends XbaseFormatter {
	
	@Inject extension BrewGrammarAccess

	def dispatch void format(BrewRoot brewRoot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (AleImport aleImport : brewRoot.getImportSemantics()) {
			aleImport.format;
		}
	}
	
	// TODO: implement for 
}