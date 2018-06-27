/*
 * generated by Xtext 2.12.0
 */
package iot.lua.xtext.parser.antlr;

import com.google.inject.Inject;
import iot.lua.xtext.parser.antlr.internal.InternalIotLuaXtextParser;
import iot.lua.xtext.services.IotLuaXtextGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IotLuaXtextParser extends AbstractAntlrParser {

	@Inject
	private IotLuaXtextGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIotLuaXtextParser createParser(XtextTokenStream stream) {
		return new InternalIotLuaXtextParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "System";
	}

	public IotLuaXtextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IotLuaXtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
