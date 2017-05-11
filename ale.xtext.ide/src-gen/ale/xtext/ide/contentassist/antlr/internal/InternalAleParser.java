package ale.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ale.xtext.services.AleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NULL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'void'", "'Boolean'", "'Float'", "'Integer'", "'String'", "'behavior'", "';'", "'import'", "'ale'", "'ecore'", "'open'", "'class'", "'extends'", "','", "'{'", "'}'", "'def'", "'('", "')'", "'override'", "'debug'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'*'", "'/'", "'+'", "'-'", "'.'", "'->'", "'not'", "'newSequence'", "'new'", "'|'", "'$'", "'['", "']'", "'self'", "'super'", "'Sequence'", "'OrderedSet'", "'=='"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_REAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_NULL=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAle.g"; }


    	private AleGrammarAccess grammarAccess;

    	public void setGrammarAccess(AleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRoot"
    // InternalAle.g:54:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalAle.g:55:1: ( ruleRoot EOF )
            // InternalAle.g:56:1: ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalAle.g:63:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:67:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalAle.g:68:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalAle.g:68:2: ( ( rule__Root__Group__0 ) )
            // InternalAle.g:69:3: ( rule__Root__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getGroup()); 
            }
            // InternalAle.g:70:3: ( rule__Root__Group__0 )
            // InternalAle.g:70:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleImportAle"
    // InternalAle.g:79:1: entryRuleImportAle : ruleImportAle EOF ;
    public final void entryRuleImportAle() throws RecognitionException {
        try {
            // InternalAle.g:80:1: ( ruleImportAle EOF )
            // InternalAle.g:81:1: ruleImportAle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportAle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportAle"


    // $ANTLR start "ruleImportAle"
    // InternalAle.g:88:1: ruleImportAle : ( ( rule__ImportAle__Group__0 ) ) ;
    public final void ruleImportAle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:92:2: ( ( ( rule__ImportAle__Group__0 ) ) )
            // InternalAle.g:93:2: ( ( rule__ImportAle__Group__0 ) )
            {
            // InternalAle.g:93:2: ( ( rule__ImportAle__Group__0 ) )
            // InternalAle.g:94:3: ( rule__ImportAle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getGroup()); 
            }
            // InternalAle.g:95:3: ( rule__ImportAle__Group__0 )
            // InternalAle.g:95:4: rule__ImportAle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportAle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportAle"


    // $ANTLR start "entryRuleImportEcore"
    // InternalAle.g:104:1: entryRuleImportEcore : ruleImportEcore EOF ;
    public final void entryRuleImportEcore() throws RecognitionException {
        try {
            // InternalAle.g:105:1: ( ruleImportEcore EOF )
            // InternalAle.g:106:1: ruleImportEcore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportEcore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportEcore"


    // $ANTLR start "ruleImportEcore"
    // InternalAle.g:113:1: ruleImportEcore : ( ( rule__ImportEcore__Group__0 ) ) ;
    public final void ruleImportEcore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:117:2: ( ( ( rule__ImportEcore__Group__0 ) ) )
            // InternalAle.g:118:2: ( ( rule__ImportEcore__Group__0 ) )
            {
            // InternalAle.g:118:2: ( ( rule__ImportEcore__Group__0 ) )
            // InternalAle.g:119:3: ( rule__ImportEcore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getGroup()); 
            }
            // InternalAle.g:120:3: ( rule__ImportEcore__Group__0 )
            // InternalAle.g:120:4: rule__ImportEcore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportEcore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportEcore"


    // $ANTLR start "entryRuleAleClass"
    // InternalAle.g:129:1: entryRuleAleClass : ruleAleClass EOF ;
    public final void entryRuleAleClass() throws RecognitionException {
        try {
            // InternalAle.g:130:1: ( ruleAleClass EOF )
            // InternalAle.g:131:1: ruleAleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAleClass"


    // $ANTLR start "ruleAleClass"
    // InternalAle.g:138:1: ruleAleClass : ( ( rule__AleClass__Group__0 ) ) ;
    public final void ruleAleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:142:2: ( ( ( rule__AleClass__Group__0 ) ) )
            // InternalAle.g:143:2: ( ( rule__AleClass__Group__0 ) )
            {
            // InternalAle.g:143:2: ( ( rule__AleClass__Group__0 ) )
            // InternalAle.g:144:3: ( rule__AleClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getGroup()); 
            }
            // InternalAle.g:145:3: ( rule__AleClass__Group__0 )
            // InternalAle.g:145:4: rule__AleClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAleClass"


    // $ANTLR start "entryRuleMethod"
    // InternalAle.g:154:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalAle.g:155:1: ( ruleMethod EOF )
            // InternalAle.g:156:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalAle.g:163:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:167:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalAle.g:168:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalAle.g:168:2: ( ( rule__Method__Alternatives ) )
            // InternalAle.g:169:3: ( rule__Method__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives()); 
            }
            // InternalAle.g:170:3: ( rule__Method__Alternatives )
            // InternalAle.g:170:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDefMethod"
    // InternalAle.g:179:1: entryRuleDefMethod : ruleDefMethod EOF ;
    public final void entryRuleDefMethod() throws RecognitionException {
        try {
            // InternalAle.g:180:1: ( ruleDefMethod EOF )
            // InternalAle.g:181:1: ruleDefMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefMethod"


    // $ANTLR start "ruleDefMethod"
    // InternalAle.g:188:1: ruleDefMethod : ( ( rule__DefMethod__Group__0 ) ) ;
    public final void ruleDefMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:192:2: ( ( ( rule__DefMethod__Group__0 ) ) )
            // InternalAle.g:193:2: ( ( rule__DefMethod__Group__0 ) )
            {
            // InternalAle.g:193:2: ( ( rule__DefMethod__Group__0 ) )
            // InternalAle.g:194:3: ( rule__DefMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup()); 
            }
            // InternalAle.g:195:3: ( rule__DefMethod__Group__0 )
            // InternalAle.g:195:4: rule__DefMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefMethod"


    // $ANTLR start "entryRuleOverrideMethod"
    // InternalAle.g:204:1: entryRuleOverrideMethod : ruleOverrideMethod EOF ;
    public final void entryRuleOverrideMethod() throws RecognitionException {
        try {
            // InternalAle.g:205:1: ( ruleOverrideMethod EOF )
            // InternalAle.g:206:1: ruleOverrideMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOverrideMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOverrideMethod"


    // $ANTLR start "ruleOverrideMethod"
    // InternalAle.g:213:1: ruleOverrideMethod : ( ( rule__OverrideMethod__Group__0 ) ) ;
    public final void ruleOverrideMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:217:2: ( ( ( rule__OverrideMethod__Group__0 ) ) )
            // InternalAle.g:218:2: ( ( rule__OverrideMethod__Group__0 ) )
            {
            // InternalAle.g:218:2: ( ( rule__OverrideMethod__Group__0 ) )
            // InternalAle.g:219:3: ( rule__OverrideMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup()); 
            }
            // InternalAle.g:220:3: ( rule__OverrideMethod__Group__0 )
            // InternalAle.g:220:4: rule__OverrideMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOverrideMethod"


    // $ANTLR start "entryRuleStatement"
    // InternalAle.g:229:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalAle.g:230:1: ( ruleStatement EOF )
            // InternalAle.g:231:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalAle.g:238:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:242:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalAle.g:243:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalAle.g:243:2: ( ( rule__Statement__Alternatives ) )
            // InternalAle.g:244:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalAle.g:245:3: ( rule__Statement__Alternatives )
            // InternalAle.g:245:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDebugStatement"
    // InternalAle.g:254:1: entryRuleDebugStatement : ruleDebugStatement EOF ;
    public final void entryRuleDebugStatement() throws RecognitionException {
        try {
            // InternalAle.g:255:1: ( ruleDebugStatement EOF )
            // InternalAle.g:256:1: ruleDebugStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDebugStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDebugStatement"


    // $ANTLR start "ruleDebugStatement"
    // InternalAle.g:263:1: ruleDebugStatement : ( ( rule__DebugStatement__Group__0 ) ) ;
    public final void ruleDebugStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:267:2: ( ( ( rule__DebugStatement__Group__0 ) ) )
            // InternalAle.g:268:2: ( ( rule__DebugStatement__Group__0 ) )
            {
            // InternalAle.g:268:2: ( ( rule__DebugStatement__Group__0 ) )
            // InternalAle.g:269:3: ( rule__DebugStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getGroup()); 
            }
            // InternalAle.g:270:3: ( rule__DebugStatement__Group__0 )
            // InternalAle.g:270:4: rule__DebugStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DebugStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDebugStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAle.g:279:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalAle.g:280:1: ( ruleReturnStatement EOF )
            // InternalAle.g:281:1: ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalAle.g:288:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:292:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalAle.g:293:2: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalAle.g:293:2: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalAle.g:294:3: ( rule__ReturnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getGroup()); 
            }
            // InternalAle.g:295:3: ( rule__ReturnStatement__Group__0 )
            // InternalAle.g:295:4: rule__ReturnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleLetStatement"
    // InternalAle.g:304:1: entryRuleLetStatement : ruleLetStatement EOF ;
    public final void entryRuleLetStatement() throws RecognitionException {
        try {
            // InternalAle.g:305:1: ( ruleLetStatement EOF )
            // InternalAle.g:306:1: ruleLetStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLetStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalAle.g:313:1: ruleLetStatement : ( ( rule__LetStatement__Group__0 ) ) ;
    public final void ruleLetStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:317:2: ( ( ( rule__LetStatement__Group__0 ) ) )
            // InternalAle.g:318:2: ( ( rule__LetStatement__Group__0 ) )
            {
            // InternalAle.g:318:2: ( ( rule__LetStatement__Group__0 ) )
            // InternalAle.g:319:3: ( rule__LetStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getGroup()); 
            }
            // InternalAle.g:320:3: ( rule__LetStatement__Group__0 )
            // InternalAle.g:320:4: rule__LetStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalAle.g:329:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalAle.g:330:1: ( ruleIfStatement EOF )
            // InternalAle.g:331:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalAle.g:338:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:342:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalAle.g:343:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalAle.g:343:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalAle.g:344:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalAle.g:345:3: ( rule__IfStatement__Group__0 )
            // InternalAle.g:345:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalAle.g:354:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalAle.g:355:1: ( ruleWhileStatement EOF )
            // InternalAle.g:356:1: ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalAle.g:363:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:367:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalAle.g:368:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalAle.g:368:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalAle.g:369:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalAle.g:370:3: ( rule__WhileStatement__Group__0 )
            // InternalAle.g:370:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForLoop"
    // InternalAle.g:379:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalAle.g:380:1: ( ruleForLoop EOF )
            // InternalAle.g:381:1: ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForLoop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalAle.g:388:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:392:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalAle.g:393:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalAle.g:393:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalAle.g:394:3: ( rule__ForLoop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getGroup()); 
            }
            // InternalAle.g:395:3: ( rule__ForLoop__Group__0 )
            // InternalAle.g:395:4: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleBlock"
    // InternalAle.g:404:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalAle.g:405:1: ( ruleBlock EOF )
            // InternalAle.g:406:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalAle.g:413:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:417:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalAle.g:418:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalAle.g:418:2: ( ( rule__Block__Group__0 ) )
            // InternalAle.g:419:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalAle.g:420:3: ( rule__Block__Group__0 )
            // InternalAle.g:420:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVarAssign"
    // InternalAle.g:429:1: entryRuleVarAssign : ruleVarAssign EOF ;
    public final void entryRuleVarAssign() throws RecognitionException {
        try {
            // InternalAle.g:430:1: ( ruleVarAssign EOF )
            // InternalAle.g:431:1: ruleVarAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalAle.g:438:1: ruleVarAssign : ( ( rule__VarAssign__Alternatives ) ) ;
    public final void ruleVarAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:442:2: ( ( ( rule__VarAssign__Alternatives ) ) )
            // InternalAle.g:443:2: ( ( rule__VarAssign__Alternatives ) )
            {
            // InternalAle.g:443:2: ( ( rule__VarAssign__Alternatives ) )
            // InternalAle.g:444:3: ( rule__VarAssign__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getAlternatives()); 
            }
            // InternalAle.g:445:3: ( rule__VarAssign__Alternatives )
            // InternalAle.g:445:4: rule__VarAssign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalAle.g:454:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAle.g:455:1: ( ruleExpression EOF )
            // InternalAle.g:456:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAle.g:463:1: ruleExpression : ( ruleImpliesOperation ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:467:2: ( ( ruleImpliesOperation ) )
            // InternalAle.g:468:2: ( ruleImpliesOperation )
            {
            // InternalAle.g:468:2: ( ruleImpliesOperation )
            // InternalAle.g:469:3: ruleImpliesOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getImpliesOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getImpliesOperationParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImpliesOperation"
    // InternalAle.g:479:1: entryRuleImpliesOperation : ruleImpliesOperation EOF ;
    public final void entryRuleImpliesOperation() throws RecognitionException {
        try {
            // InternalAle.g:480:1: ( ruleImpliesOperation EOF )
            // InternalAle.g:481:1: ruleImpliesOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImpliesOperation"


    // $ANTLR start "ruleImpliesOperation"
    // InternalAle.g:488:1: ruleImpliesOperation : ( ( rule__ImpliesOperation__Group__0 ) ) ;
    public final void ruleImpliesOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:492:2: ( ( ( rule__ImpliesOperation__Group__0 ) ) )
            // InternalAle.g:493:2: ( ( rule__ImpliesOperation__Group__0 ) )
            {
            // InternalAle.g:493:2: ( ( rule__ImpliesOperation__Group__0 ) )
            // InternalAle.g:494:3: ( rule__ImpliesOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup()); 
            }
            // InternalAle.g:495:3: ( rule__ImpliesOperation__Group__0 )
            // InternalAle.g:495:4: rule__ImpliesOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesOperation"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalAle.g:504:1: entryRuleBooleanOperation : ruleBooleanOperation EOF ;
    public final void entryRuleBooleanOperation() throws RecognitionException {
        try {
            // InternalAle.g:505:1: ( ruleBooleanOperation EOF )
            // InternalAle.g:506:1: ruleBooleanOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalAle.g:513:1: ruleBooleanOperation : ( ( rule__BooleanOperation__Group__0 ) ) ;
    public final void ruleBooleanOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:517:2: ( ( ( rule__BooleanOperation__Group__0 ) ) )
            // InternalAle.g:518:2: ( ( rule__BooleanOperation__Group__0 ) )
            {
            // InternalAle.g:518:2: ( ( rule__BooleanOperation__Group__0 ) )
            // InternalAle.g:519:3: ( rule__BooleanOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getGroup()); 
            }
            // InternalAle.g:520:3: ( rule__BooleanOperation__Group__0 )
            // InternalAle.g:520:4: rule__BooleanOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalAle.g:529:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // InternalAle.g:530:1: ( ruleCompareOperation EOF )
            // InternalAle.g:531:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalAle.g:538:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:542:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // InternalAle.g:543:2: ( ( rule__CompareOperation__Group__0 ) )
            {
            // InternalAle.g:543:2: ( ( rule__CompareOperation__Group__0 ) )
            // InternalAle.g:544:3: ( rule__CompareOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // InternalAle.g:545:3: ( rule__CompareOperation__Group__0 )
            // InternalAle.g:545:4: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleEqualityOperation"
    // InternalAle.g:554:1: entryRuleEqualityOperation : ruleEqualityOperation EOF ;
    public final void entryRuleEqualityOperation() throws RecognitionException {
        try {
            // InternalAle.g:555:1: ( ruleEqualityOperation EOF )
            // InternalAle.g:556:1: ruleEqualityOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualityOperation"


    // $ANTLR start "ruleEqualityOperation"
    // InternalAle.g:563:1: ruleEqualityOperation : ( ( rule__EqualityOperation__Group__0 ) ) ;
    public final void ruleEqualityOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:567:2: ( ( ( rule__EqualityOperation__Group__0 ) ) )
            // InternalAle.g:568:2: ( ( rule__EqualityOperation__Group__0 ) )
            {
            // InternalAle.g:568:2: ( ( rule__EqualityOperation__Group__0 ) )
            // InternalAle.g:569:3: ( rule__EqualityOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getGroup()); 
            }
            // InternalAle.g:570:3: ( rule__EqualityOperation__Group__0 )
            // InternalAle.g:570:4: rule__EqualityOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityOperation"


    // $ANTLR start "entryRuleMultOperation"
    // InternalAle.g:579:1: entryRuleMultOperation : ruleMultOperation EOF ;
    public final void entryRuleMultOperation() throws RecognitionException {
        try {
            // InternalAle.g:580:1: ( ruleMultOperation EOF )
            // InternalAle.g:581:1: ruleMultOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultOperation"


    // $ANTLR start "ruleMultOperation"
    // InternalAle.g:588:1: ruleMultOperation : ( ( rule__MultOperation__Group__0 ) ) ;
    public final void ruleMultOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:592:2: ( ( ( rule__MultOperation__Group__0 ) ) )
            // InternalAle.g:593:2: ( ( rule__MultOperation__Group__0 ) )
            {
            // InternalAle.g:593:2: ( ( rule__MultOperation__Group__0 ) )
            // InternalAle.g:594:3: ( rule__MultOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup()); 
            }
            // InternalAle.g:595:3: ( rule__MultOperation__Group__0 )
            // InternalAle.g:595:4: rule__MultOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultOperation"


    // $ANTLR start "entryRuleAddOperation"
    // InternalAle.g:604:1: entryRuleAddOperation : ruleAddOperation EOF ;
    public final void entryRuleAddOperation() throws RecognitionException {
        try {
            // InternalAle.g:605:1: ( ruleAddOperation EOF )
            // InternalAle.g:606:1: ruleAddOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddOperation"


    // $ANTLR start "ruleAddOperation"
    // InternalAle.g:613:1: ruleAddOperation : ( ( rule__AddOperation__Group__0 ) ) ;
    public final void ruleAddOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:617:2: ( ( ( rule__AddOperation__Group__0 ) ) )
            // InternalAle.g:618:2: ( ( rule__AddOperation__Group__0 ) )
            {
            // InternalAle.g:618:2: ( ( rule__AddOperation__Group__0 ) )
            // InternalAle.g:619:3: ( rule__AddOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getGroup()); 
            }
            // InternalAle.g:620:3: ( rule__AddOperation__Group__0 )
            // InternalAle.g:620:4: rule__AddOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddOperation"


    // $ANTLR start "entryRuleChaindedCall"
    // InternalAle.g:629:1: entryRuleChaindedCall : ruleChaindedCall EOF ;
    public final void entryRuleChaindedCall() throws RecognitionException {
        try {
            // InternalAle.g:630:1: ( ruleChaindedCall EOF )
            // InternalAle.g:631:1: ruleChaindedCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChaindedCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChaindedCall"


    // $ANTLR start "ruleChaindedCall"
    // InternalAle.g:638:1: ruleChaindedCall : ( ( rule__ChaindedCall__Group__0 ) ) ;
    public final void ruleChaindedCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:642:2: ( ( ( rule__ChaindedCall__Group__0 ) ) )
            // InternalAle.g:643:2: ( ( rule__ChaindedCall__Group__0 ) )
            {
            // InternalAle.g:643:2: ( ( rule__ChaindedCall__Group__0 ) )
            // InternalAle.g:644:3: ( rule__ChaindedCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getGroup()); 
            }
            // InternalAle.g:645:3: ( rule__ChaindedCall__Group__0 )
            // InternalAle.g:645:4: rule__ChaindedCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChaindedCall"


    // $ANTLR start "entryRuleInfixOperation"
    // InternalAle.g:654:1: entryRuleInfixOperation : ruleInfixOperation EOF ;
    public final void entryRuleInfixOperation() throws RecognitionException {
        try {
            // InternalAle.g:655:1: ( ruleInfixOperation EOF )
            // InternalAle.g:656:1: ruleInfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfixOperation"


    // $ANTLR start "ruleInfixOperation"
    // InternalAle.g:663:1: ruleInfixOperation : ( ( rule__InfixOperation__Alternatives ) ) ;
    public final void ruleInfixOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:667:2: ( ( ( rule__InfixOperation__Alternatives ) ) )
            // InternalAle.g:668:2: ( ( rule__InfixOperation__Alternatives ) )
            {
            // InternalAle.g:668:2: ( ( rule__InfixOperation__Alternatives ) )
            // InternalAle.g:669:3: ( rule__InfixOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getAlternatives()); 
            }
            // InternalAle.g:670:3: ( rule__InfixOperation__Alternatives )
            // InternalAle.g:670:4: rule__InfixOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfixOperation"


    // $ANTLR start "entryRuleParamCall"
    // InternalAle.g:679:1: entryRuleParamCall : ruleParamCall EOF ;
    public final void entryRuleParamCall() throws RecognitionException {
        try {
            // InternalAle.g:680:1: ( ruleParamCall EOF )
            // InternalAle.g:681:1: ruleParamCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamCall"


    // $ANTLR start "ruleParamCall"
    // InternalAle.g:688:1: ruleParamCall : ( ( rule__ParamCall__Group__0 ) ) ;
    public final void ruleParamCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:692:2: ( ( ( rule__ParamCall__Group__0 ) ) )
            // InternalAle.g:693:2: ( ( rule__ParamCall__Group__0 ) )
            {
            // InternalAle.g:693:2: ( ( rule__ParamCall__Group__0 ) )
            // InternalAle.g:694:3: ( rule__ParamCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getGroup()); 
            }
            // InternalAle.g:695:3: ( rule__ParamCall__Group__0 )
            // InternalAle.g:695:4: rule__ParamCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamCall"


    // $ANTLR start "entryRuleAtomicLiteral"
    // InternalAle.g:704:1: entryRuleAtomicLiteral : ruleAtomicLiteral EOF ;
    public final void entryRuleAtomicLiteral() throws RecognitionException {
        try {
            // InternalAle.g:705:1: ( ruleAtomicLiteral EOF )
            // InternalAle.g:706:1: ruleAtomicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomicLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicLiteral"


    // $ANTLR start "ruleAtomicLiteral"
    // InternalAle.g:713:1: ruleAtomicLiteral : ( ( rule__AtomicLiteral__Alternatives ) ) ;
    public final void ruleAtomicLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:717:2: ( ( ( rule__AtomicLiteral__Alternatives ) ) )
            // InternalAle.g:718:2: ( ( rule__AtomicLiteral__Alternatives ) )
            {
            // InternalAle.g:718:2: ( ( rule__AtomicLiteral__Alternatives ) )
            // InternalAle.g:719:3: ( rule__AtomicLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getAlternatives()); 
            }
            // InternalAle.g:720:3: ( rule__AtomicLiteral__Alternatives )
            // InternalAle.g:720:4: rule__AtomicLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicLiteral"


    // $ANTLR start "entryRuleParam"
    // InternalAle.g:729:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalAle.g:730:1: ( ruleParam EOF )
            // InternalAle.g:731:1: ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalAle.g:738:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:742:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalAle.g:743:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalAle.g:743:2: ( ( rule__Param__Group__0 ) )
            // InternalAle.g:744:3: ( rule__Param__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getGroup()); 
            }
            // InternalAle.g:745:3: ( rule__Param__Group__0 )
            // InternalAle.g:745:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleType"
    // InternalAle.g:754:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalAle.g:755:1: ( ruleType EOF )
            // InternalAle.g:756:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAle.g:763:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:767:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalAle.g:768:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalAle.g:768:2: ( ( rule__Type__Alternatives ) )
            // InternalAle.g:769:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalAle.g:770:3: ( rule__Type__Alternatives )
            // InternalAle.g:770:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteralType"
    // InternalAle.g:779:1: entryRuleLiteralType : ruleLiteralType EOF ;
    public final void entryRuleLiteralType() throws RecognitionException {
        try {
            // InternalAle.g:780:1: ( ruleLiteralType EOF )
            // InternalAle.g:781:1: ruleLiteralType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralType"


    // $ANTLR start "ruleLiteralType"
    // InternalAle.g:788:1: ruleLiteralType : ( ( rule__LiteralType__LitAssignment ) ) ;
    public final void ruleLiteralType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:792:2: ( ( ( rule__LiteralType__LitAssignment ) ) )
            // InternalAle.g:793:2: ( ( rule__LiteralType__LitAssignment ) )
            {
            // InternalAle.g:793:2: ( ( rule__LiteralType__LitAssignment ) )
            // InternalAle.g:794:3: ( rule__LiteralType__LitAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralTypeAccess().getLitAssignment()); 
            }
            // InternalAle.g:795:3: ( rule__LiteralType__LitAssignment )
            // InternalAle.g:795:4: rule__LiteralType__LitAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralType__LitAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralTypeAccess().getLitAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralType"


    // $ANTLR start "entryRuleQualified"
    // InternalAle.g:804:1: entryRuleQualified : ruleQualified EOF ;
    public final void entryRuleQualified() throws RecognitionException {
        try {
            // InternalAle.g:805:1: ( ruleQualified EOF )
            // InternalAle.g:806:1: ruleQualified EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalAle.g:813:1: ruleQualified : ( ( rule__Qualified__Group__0 ) ) ;
    public final void ruleQualified() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:817:2: ( ( ( rule__Qualified__Group__0 ) ) )
            // InternalAle.g:818:2: ( ( rule__Qualified__Group__0 ) )
            {
            // InternalAle.g:818:2: ( ( rule__Qualified__Group__0 ) )
            // InternalAle.g:819:3: ( rule__Qualified__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getGroup()); 
            }
            // InternalAle.g:820:3: ( rule__Qualified__Group__0 )
            // InternalAle.g:820:4: rule__Qualified__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualified"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalAle.g:828:1: rule__Method__Alternatives : ( ( ruleDefMethod ) | ( ruleOverrideMethod ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:832:1: ( ( ruleDefMethod ) | ( ruleOverrideMethod ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAle.g:833:2: ( ruleDefMethod )
                    {
                    // InternalAle.g:833:2: ( ruleDefMethod )
                    // InternalAle.g:834:3: ruleDefMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getDefMethodParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDefMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getDefMethodParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:839:2: ( ruleOverrideMethod )
                    {
                    // InternalAle.g:839:2: ( ruleOverrideMethod )
                    // InternalAle.g:840:3: ruleOverrideMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getOverrideMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOverrideMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getOverrideMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__DefMethod__Alternatives_1"
    // InternalAle.g:849:1: rule__DefMethod__Alternatives_1 : ( ( ( rule__DefMethod__TypeAssignment_1_0 ) ) | ( 'void' ) );
    public final void rule__DefMethod__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:853:1: ( ( ( rule__DefMethod__TypeAssignment_1_0 ) ) | ( 'void' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=15 && LA2_0<=18)||(LA2_0>=67 && LA2_0<=68)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAle.g:854:2: ( ( rule__DefMethod__TypeAssignment_1_0 ) )
                    {
                    // InternalAle.g:854:2: ( ( rule__DefMethod__TypeAssignment_1_0 ) )
                    // InternalAle.g:855:3: ( rule__DefMethod__TypeAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefMethodAccess().getTypeAssignment_1_0()); 
                    }
                    // InternalAle.g:856:3: ( rule__DefMethod__TypeAssignment_1_0 )
                    // InternalAle.g:856:4: rule__DefMethod__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefMethod__TypeAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefMethodAccess().getTypeAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:860:2: ( 'void' )
                    {
                    // InternalAle.g:860:2: ( 'void' )
                    // InternalAle.g:861:3: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefMethodAccess().getVoidKeyword_1_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefMethodAccess().getVoidKeyword_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Alternatives_1"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalAle.g:870:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleForLoop ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:874:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleForLoop ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAle.g:875:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalAle.g:875:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalAle.g:876:3: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // InternalAle.g:877:3: ( rule__Statement__Group_0__0 )
                    // InternalAle.g:877:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:881:2: ( ruleForLoop )
                    {
                    // InternalAle.g:881:2: ( ruleForLoop )
                    // InternalAle.g:882:3: ruleForLoop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForLoopParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForLoopParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:887:2: ( ruleIfStatement )
                    {
                    // InternalAle.g:887:2: ( ruleIfStatement )
                    // InternalAle.g:888:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:893:2: ( ruleWhileStatement )
                    {
                    // InternalAle.g:893:2: ( ruleWhileStatement )
                    // InternalAle.g:894:3: ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:899:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalAle.g:899:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalAle.g:900:3: ( rule__Statement__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // InternalAle.g:901:3: ( rule__Statement__Group_4__0 )
                    // InternalAle.g:901:4: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:905:2: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // InternalAle.g:905:2: ( ( rule__Statement__Group_5__0 ) )
                    // InternalAle.g:906:3: ( rule__Statement__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // InternalAle.g:907:3: ( rule__Statement__Group_5__0 )
                    // InternalAle.g:907:4: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:911:2: ( ( rule__Statement__Group_6__0 ) )
                    {
                    // InternalAle.g:911:2: ( ( rule__Statement__Group_6__0 ) )
                    // InternalAle.g:912:3: ( rule__Statement__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_6()); 
                    }
                    // InternalAle.g:913:3: ( rule__Statement__Group_6__0 )
                    // InternalAle.g:913:4: rule__Statement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:917:2: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // InternalAle.g:917:2: ( ( rule__Statement__Group_7__0 ) )
                    // InternalAle.g:918:3: ( rule__Statement__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // InternalAle.g:919:3: ( rule__Statement__Group_7__0 )
                    // InternalAle.g:919:4: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__LetStatement__BlockAlternatives_5_0"
    // InternalAle.g:927:1: rule__LetStatement__BlockAlternatives_5_0 : ( ( ruleExpression ) | ( ruleLetStatement ) );
    public final void rule__LetStatement__BlockAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:931:1: ( ( ruleExpression ) | ( ruleLetStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_NULL && LA4_0<=RULE_BOOLEAN)||LA4_0==31||LA4_0==55||(LA4_0>=58 && LA4_0<=60)||(LA4_0>=62 && LA4_0<=63)||(LA4_0>=65 && LA4_0<=68)) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAle.g:932:2: ( ruleExpression )
                    {
                    // InternalAle.g:932:2: ( ruleExpression )
                    // InternalAle.g:933:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLetStatementAccess().getBlockExpressionParserRuleCall_5_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLetStatementAccess().getBlockExpressionParserRuleCall_5_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:938:2: ( ruleLetStatement )
                    {
                    // InternalAle.g:938:2: ( ruleLetStatement )
                    // InternalAle.g:939:3: ruleLetStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLetStatementAccess().getBlockLetStatementParserRuleCall_5_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLetStatementAccess().getBlockLetStatementParserRuleCall_5_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__BlockAlternatives_5_0"


    // $ANTLR start "rule__VarAssign__Alternatives"
    // InternalAle.g:948:1: rule__VarAssign__Alternatives : ( ( ( rule__VarAssign__Group_0__0 ) ) | ( ( rule__VarAssign__Group_1__0 ) ) );
    public final void rule__VarAssign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:952:1: ( ( ( rule__VarAssign__Group_0__0 ) ) | ( ( rule__VarAssign__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=18)||(LA5_0>=67 && LA5_0<=68)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==42) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_ID) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:953:2: ( ( rule__VarAssign__Group_0__0 ) )
                    {
                    // InternalAle.g:953:2: ( ( rule__VarAssign__Group_0__0 ) )
                    // InternalAle.g:954:3: ( rule__VarAssign__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAssignAccess().getGroup_0()); 
                    }
                    // InternalAle.g:955:3: ( rule__VarAssign__Group_0__0 )
                    // InternalAle.g:955:4: rule__VarAssign__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarAssign__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAssignAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:959:2: ( ( rule__VarAssign__Group_1__0 ) )
                    {
                    // InternalAle.g:959:2: ( ( rule__VarAssign__Group_1__0 ) )
                    // InternalAle.g:960:3: ( rule__VarAssign__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarAssignAccess().getGroup_1()); 
                    }
                    // InternalAle.g:961:3: ( rule__VarAssign__Group_1__0 )
                    // InternalAle.g:961:4: rule__VarAssign__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarAssign__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarAssignAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Alternatives"


    // $ANTLR start "rule__BooleanOperation__Alternatives_1_0_0"
    // InternalAle.g:969:1: rule__BooleanOperation__Alternatives_1_0_0 : ( ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) ) );
    public final void rule__BooleanOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:973:1: ( ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) ) | ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 46:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAle.g:974:2: ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:974:2: ( ( rule__BooleanOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:975:3: ( rule__BooleanOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:976:3: ( rule__BooleanOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:976:4: rule__BooleanOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:980:2: ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:980:2: ( ( rule__BooleanOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:981:3: ( rule__BooleanOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:982:3: ( rule__BooleanOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:982:4: rule__BooleanOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:986:2: ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) )
                    {
                    // InternalAle.g:986:2: ( ( rule__BooleanOperation__Group_1_0_0_2__0 ) )
                    // InternalAle.g:987:3: ( rule__BooleanOperation__Group_1_0_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_2()); 
                    }
                    // InternalAle.g:988:3: ( rule__BooleanOperation__Group_1_0_0_2__0 )
                    // InternalAle.g:988:4: rule__BooleanOperation__Group_1_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanOperation__Group_1_0_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__CompareOperation__Alternatives_1_0_0"
    // InternalAle.g:996:1: rule__CompareOperation__Alternatives_1_0_0 : ( ( ( rule__CompareOperation__Group_1_0_0_0__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_1__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_2__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_3__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_4__0 ) ) );
    public final void rule__CompareOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1000:1: ( ( ( rule__CompareOperation__Group_1_0_0_0__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_1__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_2__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_3__0 ) ) | ( ( rule__CompareOperation__Group_1_0_0_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 49:
                {
                alt7=3;
                }
                break;
            case 50:
                {
                alt7=4;
                }
                break;
            case 51:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAle.g:1001:2: ( ( rule__CompareOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1001:2: ( ( rule__CompareOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1002:3: ( rule__CompareOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1003:3: ( rule__CompareOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:1003:4: rule__CompareOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1007:2: ( ( rule__CompareOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1007:2: ( ( rule__CompareOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1008:3: ( rule__CompareOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1009:3: ( rule__CompareOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1009:4: rule__CompareOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1013:2: ( ( rule__CompareOperation__Group_1_0_0_2__0 ) )
                    {
                    // InternalAle.g:1013:2: ( ( rule__CompareOperation__Group_1_0_0_2__0 ) )
                    // InternalAle.g:1014:3: ( rule__CompareOperation__Group_1_0_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_2()); 
                    }
                    // InternalAle.g:1015:3: ( rule__CompareOperation__Group_1_0_0_2__0 )
                    // InternalAle.g:1015:4: rule__CompareOperation__Group_1_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1019:2: ( ( rule__CompareOperation__Group_1_0_0_3__0 ) )
                    {
                    // InternalAle.g:1019:2: ( ( rule__CompareOperation__Group_1_0_0_3__0 ) )
                    // InternalAle.g:1020:3: ( rule__CompareOperation__Group_1_0_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_3()); 
                    }
                    // InternalAle.g:1021:3: ( rule__CompareOperation__Group_1_0_0_3__0 )
                    // InternalAle.g:1021:4: rule__CompareOperation__Group_1_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1025:2: ( ( rule__CompareOperation__Group_1_0_0_4__0 ) )
                    {
                    // InternalAle.g:1025:2: ( ( rule__CompareOperation__Group_1_0_0_4__0 ) )
                    // InternalAle.g:1026:3: ( rule__CompareOperation__Group_1_0_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_4()); 
                    }
                    // InternalAle.g:1027:3: ( rule__CompareOperation__Group_1_0_0_4__0 )
                    // InternalAle.g:1027:4: rule__CompareOperation__Group_1_0_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareOperation__Group_1_0_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__MultOperation__Alternatives_1_0_0"
    // InternalAle.g:1035:1: rule__MultOperation__Alternatives_1_0_0 : ( ( ( rule__MultOperation__Group_1_0_0_0__0 ) ) | ( ( rule__MultOperation__Group_1_0_0_1__0 ) ) );
    public final void rule__MultOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1039:1: ( ( ( rule__MultOperation__Group_1_0_0_0__0 ) ) | ( ( rule__MultOperation__Group_1_0_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            else if ( (LA8_0==53) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAle.g:1040:2: ( ( rule__MultOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1040:2: ( ( rule__MultOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1041:3: ( rule__MultOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1042:3: ( rule__MultOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:1042:4: rule__MultOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1046:2: ( ( rule__MultOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1046:2: ( ( rule__MultOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1047:3: ( rule__MultOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1048:3: ( rule__MultOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1048:4: rule__MultOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultOperationAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__AddOperation__Alternatives_1_0_0"
    // InternalAle.g:1056:1: rule__AddOperation__Alternatives_1_0_0 : ( ( ( rule__AddOperation__Group_1_0_0_0__0 ) ) | ( ( rule__AddOperation__Group_1_0_0_1__0 ) ) );
    public final void rule__AddOperation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1060:1: ( ( ( rule__AddOperation__Group_1_0_0_0__0 ) ) | ( ( rule__AddOperation__Group_1_0_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                alt9=1;
            }
            else if ( (LA9_0==55) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAle.g:1061:2: ( ( rule__AddOperation__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1061:2: ( ( rule__AddOperation__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1062:3: ( rule__AddOperation__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddOperationAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1063:3: ( rule__AddOperation__Group_1_0_0_0__0 )
                    // InternalAle.g:1063:4: rule__AddOperation__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddOperation__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddOperationAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1067:2: ( ( rule__AddOperation__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1067:2: ( ( rule__AddOperation__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1068:3: ( rule__AddOperation__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddOperationAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1069:3: ( rule__AddOperation__Group_1_0_0_1__0 )
                    // InternalAle.g:1069:4: rule__AddOperation__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddOperation__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddOperationAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Alternatives_1_0_0"


    // $ANTLR start "rule__ChaindedCall__Alternatives_1_0_0"
    // InternalAle.g:1077:1: rule__ChaindedCall__Alternatives_1_0_0 : ( ( ( rule__ChaindedCall__Group_1_0_0_0__0 ) ) | ( ( rule__ChaindedCall__Group_1_0_0_1__0 ) ) );
    public final void rule__ChaindedCall__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1081:1: ( ( ( rule__ChaindedCall__Group_1_0_0_0__0 ) ) | ( ( rule__ChaindedCall__Group_1_0_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            else if ( (LA10_0==57) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAle.g:1082:2: ( ( rule__ChaindedCall__Group_1_0_0_0__0 ) )
                    {
                    // InternalAle.g:1082:2: ( ( rule__ChaindedCall__Group_1_0_0_0__0 ) )
                    // InternalAle.g:1083:3: ( rule__ChaindedCall__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChaindedCallAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalAle.g:1084:3: ( rule__ChaindedCall__Group_1_0_0_0__0 )
                    // InternalAle.g:1084:4: rule__ChaindedCall__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChaindedCall__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChaindedCallAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1088:2: ( ( rule__ChaindedCall__Group_1_0_0_1__0 ) )
                    {
                    // InternalAle.g:1088:2: ( ( rule__ChaindedCall__Group_1_0_0_1__0 ) )
                    // InternalAle.g:1089:3: ( rule__ChaindedCall__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChaindedCallAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalAle.g:1090:3: ( rule__ChaindedCall__Group_1_0_0_1__0 )
                    // InternalAle.g:1090:4: rule__ChaindedCall__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChaindedCall__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChaindedCallAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Alternatives_1_0_0"


    // $ANTLR start "rule__InfixOperation__Alternatives"
    // InternalAle.g:1098:1: rule__InfixOperation__Alternatives : ( ( ( rule__InfixOperation__Group_0__0 ) ) | ( ( rule__InfixOperation__Group_1__0 ) ) | ( ( rule__InfixOperation__Group_2__0 ) ) | ( ( rule__InfixOperation__Group_3__0 ) ) | ( ( rule__InfixOperation__Group_4__0 ) ) | ( ruleAtomicLiteral ) );
    public final void rule__InfixOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1102:1: ( ( ( rule__InfixOperation__Group_0__0 ) ) | ( ( rule__InfixOperation__Group_1__0 ) ) | ( ( rule__InfixOperation__Group_2__0 ) ) | ( ( rule__InfixOperation__Group_3__0 ) ) | ( ( rule__InfixOperation__Group_4__0 ) ) | ( ruleAtomicLiteral ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 59:
                {
                alt11=3;
                }
                break;
            case 60:
                {
                alt11=4;
                }
                break;
            case RULE_ID:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==31) ) {
                    alt11=5;
                }
                else if ( (LA11_5==EOF||LA11_5==20||LA11_5==27||LA11_5==29||LA11_5==32||LA11_5==37||(LA11_5>=43 && LA11_5<=57)||LA11_5==64||LA11_5==69) ) {
                    alt11=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NULL:
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case 31:
            case 62:
            case 63:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAle.g:1103:2: ( ( rule__InfixOperation__Group_0__0 ) )
                    {
                    // InternalAle.g:1103:2: ( ( rule__InfixOperation__Group_0__0 ) )
                    // InternalAle.g:1104:3: ( rule__InfixOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_0()); 
                    }
                    // InternalAle.g:1105:3: ( rule__InfixOperation__Group_0__0 )
                    // InternalAle.g:1105:4: rule__InfixOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1109:2: ( ( rule__InfixOperation__Group_1__0 ) )
                    {
                    // InternalAle.g:1109:2: ( ( rule__InfixOperation__Group_1__0 ) )
                    // InternalAle.g:1110:3: ( rule__InfixOperation__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_1()); 
                    }
                    // InternalAle.g:1111:3: ( rule__InfixOperation__Group_1__0 )
                    // InternalAle.g:1111:4: rule__InfixOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1115:2: ( ( rule__InfixOperation__Group_2__0 ) )
                    {
                    // InternalAle.g:1115:2: ( ( rule__InfixOperation__Group_2__0 ) )
                    // InternalAle.g:1116:3: ( rule__InfixOperation__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_2()); 
                    }
                    // InternalAle.g:1117:3: ( rule__InfixOperation__Group_2__0 )
                    // InternalAle.g:1117:4: rule__InfixOperation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1121:2: ( ( rule__InfixOperation__Group_3__0 ) )
                    {
                    // InternalAle.g:1121:2: ( ( rule__InfixOperation__Group_3__0 ) )
                    // InternalAle.g:1122:3: ( rule__InfixOperation__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_3()); 
                    }
                    // InternalAle.g:1123:3: ( rule__InfixOperation__Group_3__0 )
                    // InternalAle.g:1123:4: rule__InfixOperation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1127:2: ( ( rule__InfixOperation__Group_4__0 ) )
                    {
                    // InternalAle.g:1127:2: ( ( rule__InfixOperation__Group_4__0 ) )
                    // InternalAle.g:1128:3: ( rule__InfixOperation__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getGroup_4()); 
                    }
                    // InternalAle.g:1129:3: ( rule__InfixOperation__Group_4__0 )
                    // InternalAle.g:1129:4: rule__InfixOperation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1133:2: ( ruleAtomicLiteral )
                    {
                    // InternalAle.g:1133:2: ( ruleAtomicLiteral )
                    // InternalAle.g:1134:3: ruleAtomicLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomicLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Alternatives"


    // $ANTLR start "rule__AtomicLiteral__Alternatives"
    // InternalAle.g:1143:1: rule__AtomicLiteral__Alternatives : ( ( ( rule__AtomicLiteral__Group_0__0 ) ) | ( ( rule__AtomicLiteral__Group_1__0 ) ) | ( ( rule__AtomicLiteral__Group_2__0 ) ) | ( ( rule__AtomicLiteral__Group_3__0 ) ) | ( ( rule__AtomicLiteral__Group_4__0 ) ) | ( ( rule__AtomicLiteral__Group_5__0 ) ) | ( ( rule__AtomicLiteral__Group_6__0 ) ) | ( ( rule__AtomicLiteral__Group_7__0 ) ) | ( ( rule__AtomicLiteral__Group_8__0 ) ) | ( ( rule__AtomicLiteral__Group_9__0 ) ) | ( ( rule__AtomicLiteral__Group_10__0 ) ) | ( ( rule__AtomicLiteral__Group_11__0 ) ) | ( ( rule__AtomicLiteral__Group_12__0 ) ) );
    public final void rule__AtomicLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1147:1: ( ( ( rule__AtomicLiteral__Group_0__0 ) ) | ( ( rule__AtomicLiteral__Group_1__0 ) ) | ( ( rule__AtomicLiteral__Group_2__0 ) ) | ( ( rule__AtomicLiteral__Group_3__0 ) ) | ( ( rule__AtomicLiteral__Group_4__0 ) ) | ( ( rule__AtomicLiteral__Group_5__0 ) ) | ( ( rule__AtomicLiteral__Group_6__0 ) ) | ( ( rule__AtomicLiteral__Group_7__0 ) ) | ( ( rule__AtomicLiteral__Group_8__0 ) ) | ( ( rule__AtomicLiteral__Group_9__0 ) ) | ( ( rule__AtomicLiteral__Group_10__0 ) ) | ( ( rule__AtomicLiteral__Group_11__0 ) ) | ( ( rule__AtomicLiteral__Group_12__0 ) ) )
            int alt12=13;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 62:
                {
                alt12=2;
                }
                break;
            case 65:
                {
                alt12=3;
                }
                break;
            case 66:
                {
                alt12=4;
                }
                break;
            case RULE_STRING:
                {
                alt12=5;
                }
                break;
            case RULE_INT:
                {
                alt12=6;
                }
                break;
            case RULE_REAL:
                {
                alt12=7;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=8;
                }
                break;
            case RULE_NULL:
                {
                alt12=9;
                }
                break;
            case 63:
                {
                alt12=10;
                }
                break;
            case 67:
                {
                alt12=11;
                }
                break;
            case 68:
                {
                alt12=12;
                }
                break;
            case RULE_ID:
                {
                alt12=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAle.g:1148:2: ( ( rule__AtomicLiteral__Group_0__0 ) )
                    {
                    // InternalAle.g:1148:2: ( ( rule__AtomicLiteral__Group_0__0 ) )
                    // InternalAle.g:1149:3: ( rule__AtomicLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_0()); 
                    }
                    // InternalAle.g:1150:3: ( rule__AtomicLiteral__Group_0__0 )
                    // InternalAle.g:1150:4: rule__AtomicLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1154:2: ( ( rule__AtomicLiteral__Group_1__0 ) )
                    {
                    // InternalAle.g:1154:2: ( ( rule__AtomicLiteral__Group_1__0 ) )
                    // InternalAle.g:1155:3: ( rule__AtomicLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_1()); 
                    }
                    // InternalAle.g:1156:3: ( rule__AtomicLiteral__Group_1__0 )
                    // InternalAle.g:1156:4: rule__AtomicLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1160:2: ( ( rule__AtomicLiteral__Group_2__0 ) )
                    {
                    // InternalAle.g:1160:2: ( ( rule__AtomicLiteral__Group_2__0 ) )
                    // InternalAle.g:1161:3: ( rule__AtomicLiteral__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_2()); 
                    }
                    // InternalAle.g:1162:3: ( rule__AtomicLiteral__Group_2__0 )
                    // InternalAle.g:1162:4: rule__AtomicLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1166:2: ( ( rule__AtomicLiteral__Group_3__0 ) )
                    {
                    // InternalAle.g:1166:2: ( ( rule__AtomicLiteral__Group_3__0 ) )
                    // InternalAle.g:1167:3: ( rule__AtomicLiteral__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_3()); 
                    }
                    // InternalAle.g:1168:3: ( rule__AtomicLiteral__Group_3__0 )
                    // InternalAle.g:1168:4: rule__AtomicLiteral__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:1172:2: ( ( rule__AtomicLiteral__Group_4__0 ) )
                    {
                    // InternalAle.g:1172:2: ( ( rule__AtomicLiteral__Group_4__0 ) )
                    // InternalAle.g:1173:3: ( rule__AtomicLiteral__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_4()); 
                    }
                    // InternalAle.g:1174:3: ( rule__AtomicLiteral__Group_4__0 )
                    // InternalAle.g:1174:4: rule__AtomicLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:1178:2: ( ( rule__AtomicLiteral__Group_5__0 ) )
                    {
                    // InternalAle.g:1178:2: ( ( rule__AtomicLiteral__Group_5__0 ) )
                    // InternalAle.g:1179:3: ( rule__AtomicLiteral__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_5()); 
                    }
                    // InternalAle.g:1180:3: ( rule__AtomicLiteral__Group_5__0 )
                    // InternalAle.g:1180:4: rule__AtomicLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:1184:2: ( ( rule__AtomicLiteral__Group_6__0 ) )
                    {
                    // InternalAle.g:1184:2: ( ( rule__AtomicLiteral__Group_6__0 ) )
                    // InternalAle.g:1185:3: ( rule__AtomicLiteral__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_6()); 
                    }
                    // InternalAle.g:1186:3: ( rule__AtomicLiteral__Group_6__0 )
                    // InternalAle.g:1186:4: rule__AtomicLiteral__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:1190:2: ( ( rule__AtomicLiteral__Group_7__0 ) )
                    {
                    // InternalAle.g:1190:2: ( ( rule__AtomicLiteral__Group_7__0 ) )
                    // InternalAle.g:1191:3: ( rule__AtomicLiteral__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_7()); 
                    }
                    // InternalAle.g:1192:3: ( rule__AtomicLiteral__Group_7__0 )
                    // InternalAle.g:1192:4: rule__AtomicLiteral__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:1196:2: ( ( rule__AtomicLiteral__Group_8__0 ) )
                    {
                    // InternalAle.g:1196:2: ( ( rule__AtomicLiteral__Group_8__0 ) )
                    // InternalAle.g:1197:3: ( rule__AtomicLiteral__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_8()); 
                    }
                    // InternalAle.g:1198:3: ( rule__AtomicLiteral__Group_8__0 )
                    // InternalAle.g:1198:4: rule__AtomicLiteral__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAle.g:1202:2: ( ( rule__AtomicLiteral__Group_9__0 ) )
                    {
                    // InternalAle.g:1202:2: ( ( rule__AtomicLiteral__Group_9__0 ) )
                    // InternalAle.g:1203:3: ( rule__AtomicLiteral__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_9()); 
                    }
                    // InternalAle.g:1204:3: ( rule__AtomicLiteral__Group_9__0 )
                    // InternalAle.g:1204:4: rule__AtomicLiteral__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:1208:2: ( ( rule__AtomicLiteral__Group_10__0 ) )
                    {
                    // InternalAle.g:1208:2: ( ( rule__AtomicLiteral__Group_10__0 ) )
                    // InternalAle.g:1209:3: ( rule__AtomicLiteral__Group_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_10()); 
                    }
                    // InternalAle.g:1210:3: ( rule__AtomicLiteral__Group_10__0 )
                    // InternalAle.g:1210:4: rule__AtomicLiteral__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalAle.g:1214:2: ( ( rule__AtomicLiteral__Group_11__0 ) )
                    {
                    // InternalAle.g:1214:2: ( ( rule__AtomicLiteral__Group_11__0 ) )
                    // InternalAle.g:1215:3: ( rule__AtomicLiteral__Group_11__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_11()); 
                    }
                    // InternalAle.g:1216:3: ( rule__AtomicLiteral__Group_11__0 )
                    // InternalAle.g:1216:4: rule__AtomicLiteral__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalAle.g:1220:2: ( ( rule__AtomicLiteral__Group_12__0 ) )
                    {
                    // InternalAle.g:1220:2: ( ( rule__AtomicLiteral__Group_12__0 ) )
                    // InternalAle.g:1221:3: ( rule__AtomicLiteral__Group_12__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicLiteralAccess().getGroup_12()); 
                    }
                    // InternalAle.g:1222:3: ( rule__AtomicLiteral__Group_12__0 )
                    // InternalAle.g:1222:4: rule__AtomicLiteral__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicLiteralAccess().getGroup_12()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalAle.g:1230:1: rule__Type__Alternatives : ( ( ruleLiteralType ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1234:1: ( ( ruleLiteralType ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 67:
                {
                alt13=3;
                }
                break;
            case 68:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAle.g:1235:2: ( ruleLiteralType )
                    {
                    // InternalAle.g:1235:2: ( ruleLiteralType )
                    // InternalAle.g:1236:3: ruleLiteralType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getLiteralTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getLiteralTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1241:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalAle.g:1241:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalAle.g:1242:3: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // InternalAle.g:1243:3: ( rule__Type__Group_1__0 )
                    // InternalAle.g:1243:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1247:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalAle.g:1247:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalAle.g:1248:3: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // InternalAle.g:1249:3: ( rule__Type__Group_2__0 )
                    // InternalAle.g:1249:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1253:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalAle.g:1253:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalAle.g:1254:3: ( rule__Type__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_3()); 
                    }
                    // InternalAle.g:1255:3: ( rule__Type__Group_3__0 )
                    // InternalAle.g:1255:4: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__LiteralType__LitAlternatives_0"
    // InternalAle.g:1263:1: rule__LiteralType__LitAlternatives_0 : ( ( 'Boolean' ) | ( 'Float' ) | ( 'Integer' ) | ( 'String' ) );
    public final void rule__LiteralType__LitAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1267:1: ( ( 'Boolean' ) | ( 'Float' ) | ( 'Integer' ) | ( 'String' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt14=1;
                }
                break;
            case 16:
                {
                alt14=2;
                }
                break;
            case 17:
                {
                alt14=3;
                }
                break;
            case 18:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAle.g:1268:2: ( 'Boolean' )
                    {
                    // InternalAle.g:1268:2: ( 'Boolean' )
                    // InternalAle.g:1269:3: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitBooleanKeyword_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitBooleanKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1274:2: ( 'Float' )
                    {
                    // InternalAle.g:1274:2: ( 'Float' )
                    // InternalAle.g:1275:3: 'Float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitFloatKeyword_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitFloatKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:1280:2: ( 'Integer' )
                    {
                    // InternalAle.g:1280:2: ( 'Integer' )
                    // InternalAle.g:1281:3: 'Integer'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitIntegerKeyword_0_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitIntegerKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:1286:2: ( 'String' )
                    {
                    // InternalAle.g:1286:2: ( 'String' )
                    // InternalAle.g:1287:3: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralTypeAccess().getLitStringKeyword_0_3()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralTypeAccess().getLitStringKeyword_0_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralType__LitAlternatives_0"


    // $ANTLR start "rule__Root__Group__0"
    // InternalAle.g:1296:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1300:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalAle.g:1301:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalAle.g:1308:1: rule__Root__Group__0__Impl : ( 'behavior' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1312:1: ( ( 'behavior' ) )
            // InternalAle.g:1313:1: ( 'behavior' )
            {
            // InternalAle.g:1313:1: ( 'behavior' )
            // InternalAle.g:1314:2: 'behavior'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getBehaviorKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getBehaviorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalAle.g:1323:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1327:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalAle.g:1328:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalAle.g:1335:1: rule__Root__Group__1__Impl : ( ( rule__Root__NameAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1339:1: ( ( ( rule__Root__NameAssignment_1 ) ) )
            // InternalAle.g:1340:1: ( ( rule__Root__NameAssignment_1 ) )
            {
            // InternalAle.g:1340:1: ( ( rule__Root__NameAssignment_1 ) )
            // InternalAle.g:1341:2: ( rule__Root__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getNameAssignment_1()); 
            }
            // InternalAle.g:1342:2: ( rule__Root__NameAssignment_1 )
            // InternalAle.g:1342:3: rule__Root__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalAle.g:1350:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1354:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalAle.g:1355:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalAle.g:1362:1: rule__Root__Group__2__Impl : ( ';' ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1366:1: ( ( ';' ) )
            // InternalAle.g:1367:1: ( ';' )
            {
            // InternalAle.g:1367:1: ( ';' )
            // InternalAle.g:1368:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getSemicolonKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalAle.g:1377:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1381:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalAle.g:1382:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalAle.g:1389:1: rule__Root__Group__3__Impl : ( ( rule__Root__ImportEcoreAssignment_3 )? ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1393:1: ( ( ( rule__Root__ImportEcoreAssignment_3 )? ) )
            // InternalAle.g:1394:1: ( ( rule__Root__ImportEcoreAssignment_3 )? )
            {
            // InternalAle.g:1394:1: ( ( rule__Root__ImportEcoreAssignment_3 )? )
            // InternalAle.g:1395:2: ( rule__Root__ImportEcoreAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getImportEcoreAssignment_3()); 
            }
            // InternalAle.g:1396:2: ( rule__Root__ImportEcoreAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==23) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalAle.g:1396:3: rule__Root__ImportEcoreAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__ImportEcoreAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getImportEcoreAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalAle.g:1404:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1408:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalAle.g:1409:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalAle.g:1416:1: rule__Root__Group__4__Impl : ( ( rule__Root__ImportsAleAssignment_4 )* ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1420:1: ( ( ( rule__Root__ImportsAleAssignment_4 )* ) )
            // InternalAle.g:1421:1: ( ( rule__Root__ImportsAleAssignment_4 )* )
            {
            // InternalAle.g:1421:1: ( ( rule__Root__ImportsAleAssignment_4 )* )
            // InternalAle.g:1422:2: ( rule__Root__ImportsAleAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getImportsAleAssignment_4()); 
            }
            // InternalAle.g:1423:2: ( rule__Root__ImportsAleAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAle.g:1423:3: rule__Root__ImportsAleAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Root__ImportsAleAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getImportsAleAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalAle.g:1431:1: rule__Root__Group__5 : rule__Root__Group__5__Impl ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1435:1: ( rule__Root__Group__5__Impl )
            // InternalAle.g:1436:2: rule__Root__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalAle.g:1442:1: rule__Root__Group__5__Impl : ( ( rule__Root__ClassesAssignment_5 )* ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1446:1: ( ( ( rule__Root__ClassesAssignment_5 )* ) )
            // InternalAle.g:1447:1: ( ( rule__Root__ClassesAssignment_5 )* )
            {
            // InternalAle.g:1447:1: ( ( rule__Root__ClassesAssignment_5 )* )
            // InternalAle.g:1448:2: ( rule__Root__ClassesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getClassesAssignment_5()); 
            }
            // InternalAle.g:1449:2: ( rule__Root__ClassesAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAle.g:1449:3: rule__Root__ClassesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Root__ClassesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getClassesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__ImportAle__Group__0"
    // InternalAle.g:1458:1: rule__ImportAle__Group__0 : rule__ImportAle__Group__0__Impl rule__ImportAle__Group__1 ;
    public final void rule__ImportAle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1462:1: ( rule__ImportAle__Group__0__Impl rule__ImportAle__Group__1 )
            // InternalAle.g:1463:2: rule__ImportAle__Group__0__Impl rule__ImportAle__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ImportAle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportAle__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__0"


    // $ANTLR start "rule__ImportAle__Group__0__Impl"
    // InternalAle.g:1470:1: rule__ImportAle__Group__0__Impl : ( () ) ;
    public final void rule__ImportAle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1474:1: ( ( () ) )
            // InternalAle.g:1475:1: ( () )
            {
            // InternalAle.g:1475:1: ( () )
            // InternalAle.g:1476:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getImportAleAction_0()); 
            }
            // InternalAle.g:1477:2: ()
            // InternalAle.g:1477:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getImportAleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__0__Impl"


    // $ANTLR start "rule__ImportAle__Group__1"
    // InternalAle.g:1485:1: rule__ImportAle__Group__1 : rule__ImportAle__Group__1__Impl rule__ImportAle__Group__2 ;
    public final void rule__ImportAle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1489:1: ( rule__ImportAle__Group__1__Impl rule__ImportAle__Group__2 )
            // InternalAle.g:1490:2: rule__ImportAle__Group__1__Impl rule__ImportAle__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ImportAle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportAle__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__1"


    // $ANTLR start "rule__ImportAle__Group__1__Impl"
    // InternalAle.g:1497:1: rule__ImportAle__Group__1__Impl : ( 'import' ) ;
    public final void rule__ImportAle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1501:1: ( ( 'import' ) )
            // InternalAle.g:1502:1: ( 'import' )
            {
            // InternalAle.g:1502:1: ( 'import' )
            // InternalAle.g:1503:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getImportKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getImportKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__1__Impl"


    // $ANTLR start "rule__ImportAle__Group__2"
    // InternalAle.g:1512:1: rule__ImportAle__Group__2 : rule__ImportAle__Group__2__Impl rule__ImportAle__Group__3 ;
    public final void rule__ImportAle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1516:1: ( rule__ImportAle__Group__2__Impl rule__ImportAle__Group__3 )
            // InternalAle.g:1517:2: rule__ImportAle__Group__2__Impl rule__ImportAle__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ImportAle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportAle__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__2"


    // $ANTLR start "rule__ImportAle__Group__2__Impl"
    // InternalAle.g:1524:1: rule__ImportAle__Group__2__Impl : ( 'ale' ) ;
    public final void rule__ImportAle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1528:1: ( ( 'ale' ) )
            // InternalAle.g:1529:1: ( 'ale' )
            {
            // InternalAle.g:1529:1: ( 'ale' )
            // InternalAle.g:1530:2: 'ale'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getAleKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getAleKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__2__Impl"


    // $ANTLR start "rule__ImportAle__Group__3"
    // InternalAle.g:1539:1: rule__ImportAle__Group__3 : rule__ImportAle__Group__3__Impl rule__ImportAle__Group__4 ;
    public final void rule__ImportAle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1543:1: ( rule__ImportAle__Group__3__Impl rule__ImportAle__Group__4 )
            // InternalAle.g:1544:2: rule__ImportAle__Group__3__Impl rule__ImportAle__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ImportAle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportAle__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__3"


    // $ANTLR start "rule__ImportAle__Group__3__Impl"
    // InternalAle.g:1551:1: rule__ImportAle__Group__3__Impl : ( ( rule__ImportAle__RefAssignment_3 ) ) ;
    public final void rule__ImportAle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1555:1: ( ( ( rule__ImportAle__RefAssignment_3 ) ) )
            // InternalAle.g:1556:1: ( ( rule__ImportAle__RefAssignment_3 ) )
            {
            // InternalAle.g:1556:1: ( ( rule__ImportAle__RefAssignment_3 ) )
            // InternalAle.g:1557:2: ( rule__ImportAle__RefAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getRefAssignment_3()); 
            }
            // InternalAle.g:1558:2: ( rule__ImportAle__RefAssignment_3 )
            // InternalAle.g:1558:3: rule__ImportAle__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImportAle__RefAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getRefAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__3__Impl"


    // $ANTLR start "rule__ImportAle__Group__4"
    // InternalAle.g:1566:1: rule__ImportAle__Group__4 : rule__ImportAle__Group__4__Impl ;
    public final void rule__ImportAle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1570:1: ( rule__ImportAle__Group__4__Impl )
            // InternalAle.g:1571:2: rule__ImportAle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportAle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__4"


    // $ANTLR start "rule__ImportAle__Group__4__Impl"
    // InternalAle.g:1577:1: rule__ImportAle__Group__4__Impl : ( ';' ) ;
    public final void rule__ImportAle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1581:1: ( ( ';' ) )
            // InternalAle.g:1582:1: ( ';' )
            {
            // InternalAle.g:1582:1: ( ';' )
            // InternalAle.g:1583:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getSemicolonKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__Group__4__Impl"


    // $ANTLR start "rule__ImportEcore__Group__0"
    // InternalAle.g:1593:1: rule__ImportEcore__Group__0 : rule__ImportEcore__Group__0__Impl rule__ImportEcore__Group__1 ;
    public final void rule__ImportEcore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1597:1: ( rule__ImportEcore__Group__0__Impl rule__ImportEcore__Group__1 )
            // InternalAle.g:1598:2: rule__ImportEcore__Group__0__Impl rule__ImportEcore__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ImportEcore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportEcore__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__0"


    // $ANTLR start "rule__ImportEcore__Group__0__Impl"
    // InternalAle.g:1605:1: rule__ImportEcore__Group__0__Impl : ( () ) ;
    public final void rule__ImportEcore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1609:1: ( ( () ) )
            // InternalAle.g:1610:1: ( () )
            {
            // InternalAle.g:1610:1: ( () )
            // InternalAle.g:1611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getImportEcoreAction_0()); 
            }
            // InternalAle.g:1612:2: ()
            // InternalAle.g:1612:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getImportEcoreAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__0__Impl"


    // $ANTLR start "rule__ImportEcore__Group__1"
    // InternalAle.g:1620:1: rule__ImportEcore__Group__1 : rule__ImportEcore__Group__1__Impl rule__ImportEcore__Group__2 ;
    public final void rule__ImportEcore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1624:1: ( rule__ImportEcore__Group__1__Impl rule__ImportEcore__Group__2 )
            // InternalAle.g:1625:2: rule__ImportEcore__Group__1__Impl rule__ImportEcore__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ImportEcore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportEcore__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__1"


    // $ANTLR start "rule__ImportEcore__Group__1__Impl"
    // InternalAle.g:1632:1: rule__ImportEcore__Group__1__Impl : ( 'import' ) ;
    public final void rule__ImportEcore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1636:1: ( ( 'import' ) )
            // InternalAle.g:1637:1: ( 'import' )
            {
            // InternalAle.g:1637:1: ( 'import' )
            // InternalAle.g:1638:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getImportKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getImportKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__1__Impl"


    // $ANTLR start "rule__ImportEcore__Group__2"
    // InternalAle.g:1647:1: rule__ImportEcore__Group__2 : rule__ImportEcore__Group__2__Impl rule__ImportEcore__Group__3 ;
    public final void rule__ImportEcore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1651:1: ( rule__ImportEcore__Group__2__Impl rule__ImportEcore__Group__3 )
            // InternalAle.g:1652:2: rule__ImportEcore__Group__2__Impl rule__ImportEcore__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ImportEcore__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportEcore__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__2"


    // $ANTLR start "rule__ImportEcore__Group__2__Impl"
    // InternalAle.g:1659:1: rule__ImportEcore__Group__2__Impl : ( 'ecore' ) ;
    public final void rule__ImportEcore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1663:1: ( ( 'ecore' ) )
            // InternalAle.g:1664:1: ( 'ecore' )
            {
            // InternalAle.g:1664:1: ( 'ecore' )
            // InternalAle.g:1665:2: 'ecore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getEcoreKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getEcoreKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__2__Impl"


    // $ANTLR start "rule__ImportEcore__Group__3"
    // InternalAle.g:1674:1: rule__ImportEcore__Group__3 : rule__ImportEcore__Group__3__Impl rule__ImportEcore__Group__4 ;
    public final void rule__ImportEcore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1678:1: ( rule__ImportEcore__Group__3__Impl rule__ImportEcore__Group__4 )
            // InternalAle.g:1679:2: rule__ImportEcore__Group__3__Impl rule__ImportEcore__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ImportEcore__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportEcore__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__3"


    // $ANTLR start "rule__ImportEcore__Group__3__Impl"
    // InternalAle.g:1686:1: rule__ImportEcore__Group__3__Impl : ( ( rule__ImportEcore__RefAssignment_3 ) ) ;
    public final void rule__ImportEcore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1690:1: ( ( ( rule__ImportEcore__RefAssignment_3 ) ) )
            // InternalAle.g:1691:1: ( ( rule__ImportEcore__RefAssignment_3 ) )
            {
            // InternalAle.g:1691:1: ( ( rule__ImportEcore__RefAssignment_3 ) )
            // InternalAle.g:1692:2: ( rule__ImportEcore__RefAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getRefAssignment_3()); 
            }
            // InternalAle.g:1693:2: ( rule__ImportEcore__RefAssignment_3 )
            // InternalAle.g:1693:3: rule__ImportEcore__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImportEcore__RefAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getRefAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__3__Impl"


    // $ANTLR start "rule__ImportEcore__Group__4"
    // InternalAle.g:1701:1: rule__ImportEcore__Group__4 : rule__ImportEcore__Group__4__Impl ;
    public final void rule__ImportEcore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1705:1: ( rule__ImportEcore__Group__4__Impl )
            // InternalAle.g:1706:2: rule__ImportEcore__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportEcore__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__4"


    // $ANTLR start "rule__ImportEcore__Group__4__Impl"
    // InternalAle.g:1712:1: rule__ImportEcore__Group__4__Impl : ( ';' ) ;
    public final void rule__ImportEcore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1716:1: ( ( ';' ) )
            // InternalAle.g:1717:1: ( ';' )
            {
            // InternalAle.g:1717:1: ( ';' )
            // InternalAle.g:1718:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getSemicolonKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__Group__4__Impl"


    // $ANTLR start "rule__AleClass__Group__0"
    // InternalAle.g:1728:1: rule__AleClass__Group__0 : rule__AleClass__Group__0__Impl rule__AleClass__Group__1 ;
    public final void rule__AleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1732:1: ( rule__AleClass__Group__0__Impl rule__AleClass__Group__1 )
            // InternalAle.g:1733:2: rule__AleClass__Group__0__Impl rule__AleClass__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AleClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__0"


    // $ANTLR start "rule__AleClass__Group__0__Impl"
    // InternalAle.g:1740:1: rule__AleClass__Group__0__Impl : ( () ) ;
    public final void rule__AleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1744:1: ( ( () ) )
            // InternalAle.g:1745:1: ( () )
            {
            // InternalAle.g:1745:1: ( () )
            // InternalAle.g:1746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getAleClassAction_0()); 
            }
            // InternalAle.g:1747:2: ()
            // InternalAle.g:1747:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getAleClassAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__0__Impl"


    // $ANTLR start "rule__AleClass__Group__1"
    // InternalAle.g:1755:1: rule__AleClass__Group__1 : rule__AleClass__Group__1__Impl rule__AleClass__Group__2 ;
    public final void rule__AleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1759:1: ( rule__AleClass__Group__1__Impl rule__AleClass__Group__2 )
            // InternalAle.g:1760:2: rule__AleClass__Group__1__Impl rule__AleClass__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AleClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__1"


    // $ANTLR start "rule__AleClass__Group__1__Impl"
    // InternalAle.g:1767:1: rule__AleClass__Group__1__Impl : ( 'open' ) ;
    public final void rule__AleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1771:1: ( ( 'open' ) )
            // InternalAle.g:1772:1: ( 'open' )
            {
            // InternalAle.g:1772:1: ( 'open' )
            // InternalAle.g:1773:2: 'open'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getOpenKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getOpenKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__1__Impl"


    // $ANTLR start "rule__AleClass__Group__2"
    // InternalAle.g:1782:1: rule__AleClass__Group__2 : rule__AleClass__Group__2__Impl rule__AleClass__Group__3 ;
    public final void rule__AleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1786:1: ( rule__AleClass__Group__2__Impl rule__AleClass__Group__3 )
            // InternalAle.g:1787:2: rule__AleClass__Group__2__Impl rule__AleClass__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AleClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__2"


    // $ANTLR start "rule__AleClass__Group__2__Impl"
    // InternalAle.g:1794:1: rule__AleClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__AleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1798:1: ( ( 'class' ) )
            // InternalAle.g:1799:1: ( 'class' )
            {
            // InternalAle.g:1799:1: ( 'class' )
            // InternalAle.g:1800:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getClassKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getClassKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__2__Impl"


    // $ANTLR start "rule__AleClass__Group__3"
    // InternalAle.g:1809:1: rule__AleClass__Group__3 : rule__AleClass__Group__3__Impl rule__AleClass__Group__4 ;
    public final void rule__AleClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1813:1: ( rule__AleClass__Group__3__Impl rule__AleClass__Group__4 )
            // InternalAle.g:1814:2: rule__AleClass__Group__3__Impl rule__AleClass__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__AleClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__3"


    // $ANTLR start "rule__AleClass__Group__3__Impl"
    // InternalAle.g:1821:1: rule__AleClass__Group__3__Impl : ( ( rule__AleClass__NameAssignment_3 ) ) ;
    public final void rule__AleClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1825:1: ( ( ( rule__AleClass__NameAssignment_3 ) ) )
            // InternalAle.g:1826:1: ( ( rule__AleClass__NameAssignment_3 ) )
            {
            // InternalAle.g:1826:1: ( ( rule__AleClass__NameAssignment_3 ) )
            // InternalAle.g:1827:2: ( rule__AleClass__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getNameAssignment_3()); 
            }
            // InternalAle.g:1828:2: ( rule__AleClass__NameAssignment_3 )
            // InternalAle.g:1828:3: rule__AleClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__3__Impl"


    // $ANTLR start "rule__AleClass__Group__4"
    // InternalAle.g:1836:1: rule__AleClass__Group__4 : rule__AleClass__Group__4__Impl rule__AleClass__Group__5 ;
    public final void rule__AleClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1840:1: ( rule__AleClass__Group__4__Impl rule__AleClass__Group__5 )
            // InternalAle.g:1841:2: rule__AleClass__Group__4__Impl rule__AleClass__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__AleClass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__4"


    // $ANTLR start "rule__AleClass__Group__4__Impl"
    // InternalAle.g:1848:1: rule__AleClass__Group__4__Impl : ( ( rule__AleClass__Group_4__0 )? ) ;
    public final void rule__AleClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1852:1: ( ( ( rule__AleClass__Group_4__0 )? ) )
            // InternalAle.g:1853:1: ( ( rule__AleClass__Group_4__0 )? )
            {
            // InternalAle.g:1853:1: ( ( rule__AleClass__Group_4__0 )? )
            // InternalAle.g:1854:2: ( rule__AleClass__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getGroup_4()); 
            }
            // InternalAle.g:1855:2: ( rule__AleClass__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAle.g:1855:3: rule__AleClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AleClass__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__4__Impl"


    // $ANTLR start "rule__AleClass__Group__5"
    // InternalAle.g:1863:1: rule__AleClass__Group__5 : rule__AleClass__Group__5__Impl ;
    public final void rule__AleClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1867:1: ( rule__AleClass__Group__5__Impl )
            // InternalAle.g:1868:2: rule__AleClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__5"


    // $ANTLR start "rule__AleClass__Group__5__Impl"
    // InternalAle.g:1874:1: rule__AleClass__Group__5__Impl : ( ( rule__AleClass__Group_5__0 ) ) ;
    public final void rule__AleClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1878:1: ( ( ( rule__AleClass__Group_5__0 ) ) )
            // InternalAle.g:1879:1: ( ( rule__AleClass__Group_5__0 ) )
            {
            // InternalAle.g:1879:1: ( ( rule__AleClass__Group_5__0 ) )
            // InternalAle.g:1880:2: ( rule__AleClass__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getGroup_5()); 
            }
            // InternalAle.g:1881:2: ( rule__AleClass__Group_5__0 )
            // InternalAle.g:1881:3: rule__AleClass__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group__5__Impl"


    // $ANTLR start "rule__AleClass__Group_4__0"
    // InternalAle.g:1890:1: rule__AleClass__Group_4__0 : rule__AleClass__Group_4__0__Impl rule__AleClass__Group_4__1 ;
    public final void rule__AleClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1894:1: ( rule__AleClass__Group_4__0__Impl rule__AleClass__Group_4__1 )
            // InternalAle.g:1895:2: rule__AleClass__Group_4__0__Impl rule__AleClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__AleClass__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4__0"


    // $ANTLR start "rule__AleClass__Group_4__0__Impl"
    // InternalAle.g:1902:1: rule__AleClass__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__AleClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1906:1: ( ( 'extends' ) )
            // InternalAle.g:1907:1: ( 'extends' )
            {
            // InternalAle.g:1907:1: ( 'extends' )
            // InternalAle.g:1908:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getExtendsKeyword_4_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getExtendsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4__0__Impl"


    // $ANTLR start "rule__AleClass__Group_4__1"
    // InternalAle.g:1917:1: rule__AleClass__Group_4__1 : rule__AleClass__Group_4__1__Impl rule__AleClass__Group_4__2 ;
    public final void rule__AleClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1921:1: ( rule__AleClass__Group_4__1__Impl rule__AleClass__Group_4__2 )
            // InternalAle.g:1922:2: rule__AleClass__Group_4__1__Impl rule__AleClass__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__AleClass__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4__1"


    // $ANTLR start "rule__AleClass__Group_4__1__Impl"
    // InternalAle.g:1929:1: rule__AleClass__Group_4__1__Impl : ( ( rule__AleClass__SuperClassAssignment_4_1 ) ) ;
    public final void rule__AleClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1933:1: ( ( ( rule__AleClass__SuperClassAssignment_4_1 ) ) )
            // InternalAle.g:1934:1: ( ( rule__AleClass__SuperClassAssignment_4_1 ) )
            {
            // InternalAle.g:1934:1: ( ( rule__AleClass__SuperClassAssignment_4_1 ) )
            // InternalAle.g:1935:2: ( rule__AleClass__SuperClassAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getSuperClassAssignment_4_1()); 
            }
            // InternalAle.g:1936:2: ( rule__AleClass__SuperClassAssignment_4_1 )
            // InternalAle.g:1936:3: rule__AleClass__SuperClassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__SuperClassAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getSuperClassAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4__1__Impl"


    // $ANTLR start "rule__AleClass__Group_4__2"
    // InternalAle.g:1944:1: rule__AleClass__Group_4__2 : rule__AleClass__Group_4__2__Impl ;
    public final void rule__AleClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1948:1: ( rule__AleClass__Group_4__2__Impl )
            // InternalAle.g:1949:2: rule__AleClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4__2"


    // $ANTLR start "rule__AleClass__Group_4__2__Impl"
    // InternalAle.g:1955:1: rule__AleClass__Group_4__2__Impl : ( ( rule__AleClass__Group_4_2__0 )* ) ;
    public final void rule__AleClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1959:1: ( ( ( rule__AleClass__Group_4_2__0 )* ) )
            // InternalAle.g:1960:1: ( ( rule__AleClass__Group_4_2__0 )* )
            {
            // InternalAle.g:1960:1: ( ( rule__AleClass__Group_4_2__0 )* )
            // InternalAle.g:1961:2: ( rule__AleClass__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getGroup_4_2()); 
            }
            // InternalAle.g:1962:2: ( rule__AleClass__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAle.g:1962:3: rule__AleClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AleClass__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4__2__Impl"


    // $ANTLR start "rule__AleClass__Group_4_2__0"
    // InternalAle.g:1971:1: rule__AleClass__Group_4_2__0 : rule__AleClass__Group_4_2__0__Impl rule__AleClass__Group_4_2__1 ;
    public final void rule__AleClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1975:1: ( rule__AleClass__Group_4_2__0__Impl rule__AleClass__Group_4_2__1 )
            // InternalAle.g:1976:2: rule__AleClass__Group_4_2__0__Impl rule__AleClass__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AleClass__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4_2__0"


    // $ANTLR start "rule__AleClass__Group_4_2__0__Impl"
    // InternalAle.g:1983:1: rule__AleClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__AleClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:1987:1: ( ( ',' ) )
            // InternalAle.g:1988:1: ( ',' )
            {
            // InternalAle.g:1988:1: ( ',' )
            // InternalAle.g:1989:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__AleClass__Group_4_2__1"
    // InternalAle.g:1998:1: rule__AleClass__Group_4_2__1 : rule__AleClass__Group_4_2__1__Impl ;
    public final void rule__AleClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2002:1: ( rule__AleClass__Group_4_2__1__Impl )
            // InternalAle.g:2003:2: rule__AleClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4_2__1"


    // $ANTLR start "rule__AleClass__Group_4_2__1__Impl"
    // InternalAle.g:2009:1: rule__AleClass__Group_4_2__1__Impl : ( ( rule__AleClass__SuperClassAssignment_4_2_1 ) ) ;
    public final void rule__AleClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2013:1: ( ( ( rule__AleClass__SuperClassAssignment_4_2_1 ) ) )
            // InternalAle.g:2014:1: ( ( rule__AleClass__SuperClassAssignment_4_2_1 ) )
            {
            // InternalAle.g:2014:1: ( ( rule__AleClass__SuperClassAssignment_4_2_1 ) )
            // InternalAle.g:2015:2: ( rule__AleClass__SuperClassAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getSuperClassAssignment_4_2_1()); 
            }
            // InternalAle.g:2016:2: ( rule__AleClass__SuperClassAssignment_4_2_1 )
            // InternalAle.g:2016:3: rule__AleClass__SuperClassAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__SuperClassAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getSuperClassAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__AleClass__Group_5__0"
    // InternalAle.g:2025:1: rule__AleClass__Group_5__0 : rule__AleClass__Group_5__0__Impl rule__AleClass__Group_5__1 ;
    public final void rule__AleClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2029:1: ( rule__AleClass__Group_5__0__Impl rule__AleClass__Group_5__1 )
            // InternalAle.g:2030:2: rule__AleClass__Group_5__0__Impl rule__AleClass__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__AleClass__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_5__0"


    // $ANTLR start "rule__AleClass__Group_5__0__Impl"
    // InternalAle.g:2037:1: rule__AleClass__Group_5__0__Impl : ( '{' ) ;
    public final void rule__AleClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2041:1: ( ( '{' ) )
            // InternalAle.g:2042:1: ( '{' )
            {
            // InternalAle.g:2042:1: ( '{' )
            // InternalAle.g:2043:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getLeftCurlyBracketKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_5__0__Impl"


    // $ANTLR start "rule__AleClass__Group_5__1"
    // InternalAle.g:2052:1: rule__AleClass__Group_5__1 : rule__AleClass__Group_5__1__Impl rule__AleClass__Group_5__2 ;
    public final void rule__AleClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2056:1: ( rule__AleClass__Group_5__1__Impl rule__AleClass__Group_5__2 )
            // InternalAle.g:2057:2: rule__AleClass__Group_5__1__Impl rule__AleClass__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__AleClass__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_5__1"


    // $ANTLR start "rule__AleClass__Group_5__1__Impl"
    // InternalAle.g:2064:1: rule__AleClass__Group_5__1__Impl : ( ( rule__AleClass__MethodsAssignment_5_1 )* ) ;
    public final void rule__AleClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2068:1: ( ( ( rule__AleClass__MethodsAssignment_5_1 )* ) )
            // InternalAle.g:2069:1: ( ( rule__AleClass__MethodsAssignment_5_1 )* )
            {
            // InternalAle.g:2069:1: ( ( rule__AleClass__MethodsAssignment_5_1 )* )
            // InternalAle.g:2070:2: ( rule__AleClass__MethodsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getMethodsAssignment_5_1()); 
            }
            // InternalAle.g:2071:2: ( rule__AleClass__MethodsAssignment_5_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30||LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAle.g:2071:3: rule__AleClass__MethodsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AleClass__MethodsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getMethodsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_5__1__Impl"


    // $ANTLR start "rule__AleClass__Group_5__2"
    // InternalAle.g:2079:1: rule__AleClass__Group_5__2 : rule__AleClass__Group_5__2__Impl ;
    public final void rule__AleClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2083:1: ( rule__AleClass__Group_5__2__Impl )
            // InternalAle.g:2084:2: rule__AleClass__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AleClass__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_5__2"


    // $ANTLR start "rule__AleClass__Group_5__2__Impl"
    // InternalAle.g:2090:1: rule__AleClass__Group_5__2__Impl : ( '}' ) ;
    public final void rule__AleClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2094:1: ( ( '}' ) )
            // InternalAle.g:2095:1: ( '}' )
            {
            // InternalAle.g:2095:1: ( '}' )
            // InternalAle.g:2096:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getRightCurlyBracketKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__Group_5__2__Impl"


    // $ANTLR start "rule__DefMethod__Group__0"
    // InternalAle.g:2106:1: rule__DefMethod__Group__0 : rule__DefMethod__Group__0__Impl rule__DefMethod__Group__1 ;
    public final void rule__DefMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2110:1: ( rule__DefMethod__Group__0__Impl rule__DefMethod__Group__1 )
            // InternalAle.g:2111:2: rule__DefMethod__Group__0__Impl rule__DefMethod__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DefMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__0"


    // $ANTLR start "rule__DefMethod__Group__0__Impl"
    // InternalAle.g:2118:1: rule__DefMethod__Group__0__Impl : ( 'def' ) ;
    public final void rule__DefMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2122:1: ( ( 'def' ) )
            // InternalAle.g:2123:1: ( 'def' )
            {
            // InternalAle.g:2123:1: ( 'def' )
            // InternalAle.g:2124:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getDefKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getDefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__0__Impl"


    // $ANTLR start "rule__DefMethod__Group__1"
    // InternalAle.g:2133:1: rule__DefMethod__Group__1 : rule__DefMethod__Group__1__Impl rule__DefMethod__Group__2 ;
    public final void rule__DefMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2137:1: ( rule__DefMethod__Group__1__Impl rule__DefMethod__Group__2 )
            // InternalAle.g:2138:2: rule__DefMethod__Group__1__Impl rule__DefMethod__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DefMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__1"


    // $ANTLR start "rule__DefMethod__Group__1__Impl"
    // InternalAle.g:2145:1: rule__DefMethod__Group__1__Impl : ( ( rule__DefMethod__Alternatives_1 ) ) ;
    public final void rule__DefMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2149:1: ( ( ( rule__DefMethod__Alternatives_1 ) ) )
            // InternalAle.g:2150:1: ( ( rule__DefMethod__Alternatives_1 ) )
            {
            // InternalAle.g:2150:1: ( ( rule__DefMethod__Alternatives_1 ) )
            // InternalAle.g:2151:2: ( rule__DefMethod__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getAlternatives_1()); 
            }
            // InternalAle.g:2152:2: ( rule__DefMethod__Alternatives_1 )
            // InternalAle.g:2152:3: rule__DefMethod__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__1__Impl"


    // $ANTLR start "rule__DefMethod__Group__2"
    // InternalAle.g:2160:1: rule__DefMethod__Group__2 : rule__DefMethod__Group__2__Impl rule__DefMethod__Group__3 ;
    public final void rule__DefMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2164:1: ( rule__DefMethod__Group__2__Impl rule__DefMethod__Group__3 )
            // InternalAle.g:2165:2: rule__DefMethod__Group__2__Impl rule__DefMethod__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DefMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__2"


    // $ANTLR start "rule__DefMethod__Group__2__Impl"
    // InternalAle.g:2172:1: rule__DefMethod__Group__2__Impl : ( ( rule__DefMethod__NameAssignment_2 ) ) ;
    public final void rule__DefMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2176:1: ( ( ( rule__DefMethod__NameAssignment_2 ) ) )
            // InternalAle.g:2177:1: ( ( rule__DefMethod__NameAssignment_2 ) )
            {
            // InternalAle.g:2177:1: ( ( rule__DefMethod__NameAssignment_2 ) )
            // InternalAle.g:2178:2: ( rule__DefMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getNameAssignment_2()); 
            }
            // InternalAle.g:2179:2: ( rule__DefMethod__NameAssignment_2 )
            // InternalAle.g:2179:3: rule__DefMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__2__Impl"


    // $ANTLR start "rule__DefMethod__Group__3"
    // InternalAle.g:2187:1: rule__DefMethod__Group__3 : rule__DefMethod__Group__3__Impl rule__DefMethod__Group__4 ;
    public final void rule__DefMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2191:1: ( rule__DefMethod__Group__3__Impl rule__DefMethod__Group__4 )
            // InternalAle.g:2192:2: rule__DefMethod__Group__3__Impl rule__DefMethod__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DefMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__3"


    // $ANTLR start "rule__DefMethod__Group__3__Impl"
    // InternalAle.g:2199:1: rule__DefMethod__Group__3__Impl : ( ( rule__DefMethod__Group_3__0 ) ) ;
    public final void rule__DefMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2203:1: ( ( ( rule__DefMethod__Group_3__0 ) ) )
            // InternalAle.g:2204:1: ( ( rule__DefMethod__Group_3__0 ) )
            {
            // InternalAle.g:2204:1: ( ( rule__DefMethod__Group_3__0 ) )
            // InternalAle.g:2205:2: ( rule__DefMethod__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup_3()); 
            }
            // InternalAle.g:2206:2: ( rule__DefMethod__Group_3__0 )
            // InternalAle.g:2206:3: rule__DefMethod__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__3__Impl"


    // $ANTLR start "rule__DefMethod__Group__4"
    // InternalAle.g:2214:1: rule__DefMethod__Group__4 : rule__DefMethod__Group__4__Impl ;
    public final void rule__DefMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2218:1: ( rule__DefMethod__Group__4__Impl )
            // InternalAle.g:2219:2: rule__DefMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__4"


    // $ANTLR start "rule__DefMethod__Group__4__Impl"
    // InternalAle.g:2225:1: rule__DefMethod__Group__4__Impl : ( ( rule__DefMethod__BlockAssignment_4 ) ) ;
    public final void rule__DefMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2229:1: ( ( ( rule__DefMethod__BlockAssignment_4 ) ) )
            // InternalAle.g:2230:1: ( ( rule__DefMethod__BlockAssignment_4 ) )
            {
            // InternalAle.g:2230:1: ( ( rule__DefMethod__BlockAssignment_4 ) )
            // InternalAle.g:2231:2: ( rule__DefMethod__BlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getBlockAssignment_4()); 
            }
            // InternalAle.g:2232:2: ( rule__DefMethod__BlockAssignment_4 )
            // InternalAle.g:2232:3: rule__DefMethod__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__BlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group__4__Impl"


    // $ANTLR start "rule__DefMethod__Group_3__0"
    // InternalAle.g:2241:1: rule__DefMethod__Group_3__0 : rule__DefMethod__Group_3__0__Impl rule__DefMethod__Group_3__1 ;
    public final void rule__DefMethod__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2245:1: ( rule__DefMethod__Group_3__0__Impl rule__DefMethod__Group_3__1 )
            // InternalAle.g:2246:2: rule__DefMethod__Group_3__0__Impl rule__DefMethod__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__DefMethod__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3__0"


    // $ANTLR start "rule__DefMethod__Group_3__0__Impl"
    // InternalAle.g:2253:1: rule__DefMethod__Group_3__0__Impl : ( '(' ) ;
    public final void rule__DefMethod__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2257:1: ( ( '(' ) )
            // InternalAle.g:2258:1: ( '(' )
            {
            // InternalAle.g:2258:1: ( '(' )
            // InternalAle.g:2259:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3__0__Impl"


    // $ANTLR start "rule__DefMethod__Group_3__1"
    // InternalAle.g:2268:1: rule__DefMethod__Group_3__1 : rule__DefMethod__Group_3__1__Impl rule__DefMethod__Group_3__2 ;
    public final void rule__DefMethod__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2272:1: ( rule__DefMethod__Group_3__1__Impl rule__DefMethod__Group_3__2 )
            // InternalAle.g:2273:2: rule__DefMethod__Group_3__1__Impl rule__DefMethod__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__DefMethod__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3__1"


    // $ANTLR start "rule__DefMethod__Group_3__1__Impl"
    // InternalAle.g:2280:1: rule__DefMethod__Group_3__1__Impl : ( ( rule__DefMethod__Group_3_1__0 )? ) ;
    public final void rule__DefMethod__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2284:1: ( ( ( rule__DefMethod__Group_3_1__0 )? ) )
            // InternalAle.g:2285:1: ( ( rule__DefMethod__Group_3_1__0 )? )
            {
            // InternalAle.g:2285:1: ( ( rule__DefMethod__Group_3_1__0 )? )
            // InternalAle.g:2286:2: ( rule__DefMethod__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup_3_1()); 
            }
            // InternalAle.g:2287:2: ( rule__DefMethod__Group_3_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=15 && LA21_0<=18)||(LA21_0>=67 && LA21_0<=68)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAle.g:2287:3: rule__DefMethod__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefMethod__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3__1__Impl"


    // $ANTLR start "rule__DefMethod__Group_3__2"
    // InternalAle.g:2295:1: rule__DefMethod__Group_3__2 : rule__DefMethod__Group_3__2__Impl ;
    public final void rule__DefMethod__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2299:1: ( rule__DefMethod__Group_3__2__Impl )
            // InternalAle.g:2300:2: rule__DefMethod__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3__2"


    // $ANTLR start "rule__DefMethod__Group_3__2__Impl"
    // InternalAle.g:2306:1: rule__DefMethod__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DefMethod__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2310:1: ( ( ')' ) )
            // InternalAle.g:2311:1: ( ')' )
            {
            // InternalAle.g:2311:1: ( ')' )
            // InternalAle.g:2312:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3__2__Impl"


    // $ANTLR start "rule__DefMethod__Group_3_1__0"
    // InternalAle.g:2322:1: rule__DefMethod__Group_3_1__0 : rule__DefMethod__Group_3_1__0__Impl rule__DefMethod__Group_3_1__1 ;
    public final void rule__DefMethod__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2326:1: ( rule__DefMethod__Group_3_1__0__Impl rule__DefMethod__Group_3_1__1 )
            // InternalAle.g:2327:2: rule__DefMethod__Group_3_1__0__Impl rule__DefMethod__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__DefMethod__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1__0"


    // $ANTLR start "rule__DefMethod__Group_3_1__0__Impl"
    // InternalAle.g:2334:1: rule__DefMethod__Group_3_1__0__Impl : ( ( rule__DefMethod__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__DefMethod__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2338:1: ( ( ( rule__DefMethod__ParamsAssignment_3_1_0 ) ) )
            // InternalAle.g:2339:1: ( ( rule__DefMethod__ParamsAssignment_3_1_0 ) )
            {
            // InternalAle.g:2339:1: ( ( rule__DefMethod__ParamsAssignment_3_1_0 ) )
            // InternalAle.g:2340:2: ( rule__DefMethod__ParamsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsAssignment_3_1_0()); 
            }
            // InternalAle.g:2341:2: ( rule__DefMethod__ParamsAssignment_3_1_0 )
            // InternalAle.g:2341:3: rule__DefMethod__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__ParamsAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1__0__Impl"


    // $ANTLR start "rule__DefMethod__Group_3_1__1"
    // InternalAle.g:2349:1: rule__DefMethod__Group_3_1__1 : rule__DefMethod__Group_3_1__1__Impl ;
    public final void rule__DefMethod__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2353:1: ( rule__DefMethod__Group_3_1__1__Impl )
            // InternalAle.g:2354:2: rule__DefMethod__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1__1"


    // $ANTLR start "rule__DefMethod__Group_3_1__1__Impl"
    // InternalAle.g:2360:1: rule__DefMethod__Group_3_1__1__Impl : ( ( rule__DefMethod__Group_3_1_1__0 )* ) ;
    public final void rule__DefMethod__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2364:1: ( ( ( rule__DefMethod__Group_3_1_1__0 )* ) )
            // InternalAle.g:2365:1: ( ( rule__DefMethod__Group_3_1_1__0 )* )
            {
            // InternalAle.g:2365:1: ( ( rule__DefMethod__Group_3_1_1__0 )* )
            // InternalAle.g:2366:2: ( rule__DefMethod__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getGroup_3_1_1()); 
            }
            // InternalAle.g:2367:2: ( rule__DefMethod__Group_3_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAle.g:2367:3: rule__DefMethod__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DefMethod__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1__1__Impl"


    // $ANTLR start "rule__DefMethod__Group_3_1_1__0"
    // InternalAle.g:2376:1: rule__DefMethod__Group_3_1_1__0 : rule__DefMethod__Group_3_1_1__0__Impl rule__DefMethod__Group_3_1_1__1 ;
    public final void rule__DefMethod__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2380:1: ( rule__DefMethod__Group_3_1_1__0__Impl rule__DefMethod__Group_3_1_1__1 )
            // InternalAle.g:2381:2: rule__DefMethod__Group_3_1_1__0__Impl rule__DefMethod__Group_3_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__DefMethod__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1_1__0"


    // $ANTLR start "rule__DefMethod__Group_3_1_1__0__Impl"
    // InternalAle.g:2388:1: rule__DefMethod__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__DefMethod__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2392:1: ( ( ',' ) )
            // InternalAle.g:2393:1: ( ',' )
            {
            // InternalAle.g:2393:1: ( ',' )
            // InternalAle.g:2394:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__DefMethod__Group_3_1_1__1"
    // InternalAle.g:2403:1: rule__DefMethod__Group_3_1_1__1 : rule__DefMethod__Group_3_1_1__1__Impl ;
    public final void rule__DefMethod__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2407:1: ( rule__DefMethod__Group_3_1_1__1__Impl )
            // InternalAle.g:2408:2: rule__DefMethod__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1_1__1"


    // $ANTLR start "rule__DefMethod__Group_3_1_1__1__Impl"
    // InternalAle.g:2414:1: rule__DefMethod__Group_3_1_1__1__Impl : ( ( rule__DefMethod__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__DefMethod__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2418:1: ( ( ( rule__DefMethod__ParamsAssignment_3_1_1_1 ) ) )
            // InternalAle.g:2419:1: ( ( rule__DefMethod__ParamsAssignment_3_1_1_1 ) )
            {
            // InternalAle.g:2419:1: ( ( rule__DefMethod__ParamsAssignment_3_1_1_1 ) )
            // InternalAle.g:2420:2: ( rule__DefMethod__ParamsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsAssignment_3_1_1_1()); 
            }
            // InternalAle.g:2421:2: ( rule__DefMethod__ParamsAssignment_3_1_1_1 )
            // InternalAle.g:2421:3: rule__DefMethod__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefMethod__ParamsAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__0"
    // InternalAle.g:2430:1: rule__OverrideMethod__Group__0 : rule__OverrideMethod__Group__0__Impl rule__OverrideMethod__Group__1 ;
    public final void rule__OverrideMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2434:1: ( rule__OverrideMethod__Group__0__Impl rule__OverrideMethod__Group__1 )
            // InternalAle.g:2435:2: rule__OverrideMethod__Group__0__Impl rule__OverrideMethod__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__OverrideMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__0"


    // $ANTLR start "rule__OverrideMethod__Group__0__Impl"
    // InternalAle.g:2442:1: rule__OverrideMethod__Group__0__Impl : ( 'override' ) ;
    public final void rule__OverrideMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2446:1: ( ( 'override' ) )
            // InternalAle.g:2447:1: ( 'override' )
            {
            // InternalAle.g:2447:1: ( 'override' )
            // InternalAle.g:2448:2: 'override'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getOverrideKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getOverrideKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__1"
    // InternalAle.g:2457:1: rule__OverrideMethod__Group__1 : rule__OverrideMethod__Group__1__Impl rule__OverrideMethod__Group__2 ;
    public final void rule__OverrideMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2461:1: ( rule__OverrideMethod__Group__1__Impl rule__OverrideMethod__Group__2 )
            // InternalAle.g:2462:2: rule__OverrideMethod__Group__1__Impl rule__OverrideMethod__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OverrideMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__1"


    // $ANTLR start "rule__OverrideMethod__Group__1__Impl"
    // InternalAle.g:2469:1: rule__OverrideMethod__Group__1__Impl : ( ( rule__OverrideMethod__TypeAssignment_1 ) ) ;
    public final void rule__OverrideMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2473:1: ( ( ( rule__OverrideMethod__TypeAssignment_1 ) ) )
            // InternalAle.g:2474:1: ( ( rule__OverrideMethod__TypeAssignment_1 ) )
            {
            // InternalAle.g:2474:1: ( ( rule__OverrideMethod__TypeAssignment_1 ) )
            // InternalAle.g:2475:2: ( rule__OverrideMethod__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getTypeAssignment_1()); 
            }
            // InternalAle.g:2476:2: ( rule__OverrideMethod__TypeAssignment_1 )
            // InternalAle.g:2476:3: rule__OverrideMethod__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__2"
    // InternalAle.g:2484:1: rule__OverrideMethod__Group__2 : rule__OverrideMethod__Group__2__Impl rule__OverrideMethod__Group__3 ;
    public final void rule__OverrideMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2488:1: ( rule__OverrideMethod__Group__2__Impl rule__OverrideMethod__Group__3 )
            // InternalAle.g:2489:2: rule__OverrideMethod__Group__2__Impl rule__OverrideMethod__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__OverrideMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__2"


    // $ANTLR start "rule__OverrideMethod__Group__2__Impl"
    // InternalAle.g:2496:1: rule__OverrideMethod__Group__2__Impl : ( ( rule__OverrideMethod__NameAssignment_2 ) ) ;
    public final void rule__OverrideMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2500:1: ( ( ( rule__OverrideMethod__NameAssignment_2 ) ) )
            // InternalAle.g:2501:1: ( ( rule__OverrideMethod__NameAssignment_2 ) )
            {
            // InternalAle.g:2501:1: ( ( rule__OverrideMethod__NameAssignment_2 ) )
            // InternalAle.g:2502:2: ( rule__OverrideMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getNameAssignment_2()); 
            }
            // InternalAle.g:2503:2: ( rule__OverrideMethod__NameAssignment_2 )
            // InternalAle.g:2503:3: rule__OverrideMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__2__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__3"
    // InternalAle.g:2511:1: rule__OverrideMethod__Group__3 : rule__OverrideMethod__Group__3__Impl rule__OverrideMethod__Group__4 ;
    public final void rule__OverrideMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2515:1: ( rule__OverrideMethod__Group__3__Impl rule__OverrideMethod__Group__4 )
            // InternalAle.g:2516:2: rule__OverrideMethod__Group__3__Impl rule__OverrideMethod__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__OverrideMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__3"


    // $ANTLR start "rule__OverrideMethod__Group__3__Impl"
    // InternalAle.g:2523:1: rule__OverrideMethod__Group__3__Impl : ( ( rule__OverrideMethod__Group_3__0 ) ) ;
    public final void rule__OverrideMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2527:1: ( ( ( rule__OverrideMethod__Group_3__0 ) ) )
            // InternalAle.g:2528:1: ( ( rule__OverrideMethod__Group_3__0 ) )
            {
            // InternalAle.g:2528:1: ( ( rule__OverrideMethod__Group_3__0 ) )
            // InternalAle.g:2529:2: ( rule__OverrideMethod__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup_3()); 
            }
            // InternalAle.g:2530:2: ( rule__OverrideMethod__Group_3__0 )
            // InternalAle.g:2530:3: rule__OverrideMethod__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__3__Impl"


    // $ANTLR start "rule__OverrideMethod__Group__4"
    // InternalAle.g:2538:1: rule__OverrideMethod__Group__4 : rule__OverrideMethod__Group__4__Impl ;
    public final void rule__OverrideMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2542:1: ( rule__OverrideMethod__Group__4__Impl )
            // InternalAle.g:2543:2: rule__OverrideMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__4"


    // $ANTLR start "rule__OverrideMethod__Group__4__Impl"
    // InternalAle.g:2549:1: rule__OverrideMethod__Group__4__Impl : ( ( rule__OverrideMethod__BlockAssignment_4 ) ) ;
    public final void rule__OverrideMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2553:1: ( ( ( rule__OverrideMethod__BlockAssignment_4 ) ) )
            // InternalAle.g:2554:1: ( ( rule__OverrideMethod__BlockAssignment_4 ) )
            {
            // InternalAle.g:2554:1: ( ( rule__OverrideMethod__BlockAssignment_4 ) )
            // InternalAle.g:2555:2: ( rule__OverrideMethod__BlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getBlockAssignment_4()); 
            }
            // InternalAle.g:2556:2: ( rule__OverrideMethod__BlockAssignment_4 )
            // InternalAle.g:2556:3: rule__OverrideMethod__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__BlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group__4__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3__0"
    // InternalAle.g:2565:1: rule__OverrideMethod__Group_3__0 : rule__OverrideMethod__Group_3__0__Impl rule__OverrideMethod__Group_3__1 ;
    public final void rule__OverrideMethod__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2569:1: ( rule__OverrideMethod__Group_3__0__Impl rule__OverrideMethod__Group_3__1 )
            // InternalAle.g:2570:2: rule__OverrideMethod__Group_3__0__Impl rule__OverrideMethod__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__OverrideMethod__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3__0"


    // $ANTLR start "rule__OverrideMethod__Group_3__0__Impl"
    // InternalAle.g:2577:1: rule__OverrideMethod__Group_3__0__Impl : ( '(' ) ;
    public final void rule__OverrideMethod__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2581:1: ( ( '(' ) )
            // InternalAle.g:2582:1: ( '(' )
            {
            // InternalAle.g:2582:1: ( '(' )
            // InternalAle.g:2583:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3__1"
    // InternalAle.g:2592:1: rule__OverrideMethod__Group_3__1 : rule__OverrideMethod__Group_3__1__Impl rule__OverrideMethod__Group_3__2 ;
    public final void rule__OverrideMethod__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2596:1: ( rule__OverrideMethod__Group_3__1__Impl rule__OverrideMethod__Group_3__2 )
            // InternalAle.g:2597:2: rule__OverrideMethod__Group_3__1__Impl rule__OverrideMethod__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__OverrideMethod__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3__1"


    // $ANTLR start "rule__OverrideMethod__Group_3__1__Impl"
    // InternalAle.g:2604:1: rule__OverrideMethod__Group_3__1__Impl : ( ( rule__OverrideMethod__Group_3_1__0 )? ) ;
    public final void rule__OverrideMethod__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2608:1: ( ( ( rule__OverrideMethod__Group_3_1__0 )? ) )
            // InternalAle.g:2609:1: ( ( rule__OverrideMethod__Group_3_1__0 )? )
            {
            // InternalAle.g:2609:1: ( ( rule__OverrideMethod__Group_3_1__0 )? )
            // InternalAle.g:2610:2: ( rule__OverrideMethod__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup_3_1()); 
            }
            // InternalAle.g:2611:2: ( rule__OverrideMethod__Group_3_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=15 && LA23_0<=18)||(LA23_0>=67 && LA23_0<=68)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAle.g:2611:3: rule__OverrideMethod__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OverrideMethod__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3__2"
    // InternalAle.g:2619:1: rule__OverrideMethod__Group_3__2 : rule__OverrideMethod__Group_3__2__Impl ;
    public final void rule__OverrideMethod__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2623:1: ( rule__OverrideMethod__Group_3__2__Impl )
            // InternalAle.g:2624:2: rule__OverrideMethod__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3__2"


    // $ANTLR start "rule__OverrideMethod__Group_3__2__Impl"
    // InternalAle.g:2630:1: rule__OverrideMethod__Group_3__2__Impl : ( ')' ) ;
    public final void rule__OverrideMethod__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2634:1: ( ( ')' ) )
            // InternalAle.g:2635:1: ( ')' )
            {
            // InternalAle.g:2635:1: ( ')' )
            // InternalAle.g:2636:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3__2__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3_1__0"
    // InternalAle.g:2646:1: rule__OverrideMethod__Group_3_1__0 : rule__OverrideMethod__Group_3_1__0__Impl rule__OverrideMethod__Group_3_1__1 ;
    public final void rule__OverrideMethod__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2650:1: ( rule__OverrideMethod__Group_3_1__0__Impl rule__OverrideMethod__Group_3_1__1 )
            // InternalAle.g:2651:2: rule__OverrideMethod__Group_3_1__0__Impl rule__OverrideMethod__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OverrideMethod__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1__0"


    // $ANTLR start "rule__OverrideMethod__Group_3_1__0__Impl"
    // InternalAle.g:2658:1: rule__OverrideMethod__Group_3_1__0__Impl : ( ( rule__OverrideMethod__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__OverrideMethod__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2662:1: ( ( ( rule__OverrideMethod__ParamsAssignment_3_1_0 ) ) )
            // InternalAle.g:2663:1: ( ( rule__OverrideMethod__ParamsAssignment_3_1_0 ) )
            {
            // InternalAle.g:2663:1: ( ( rule__OverrideMethod__ParamsAssignment_3_1_0 ) )
            // InternalAle.g:2664:2: ( rule__OverrideMethod__ParamsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsAssignment_3_1_0()); 
            }
            // InternalAle.g:2665:2: ( rule__OverrideMethod__ParamsAssignment_3_1_0 )
            // InternalAle.g:2665:3: rule__OverrideMethod__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__ParamsAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3_1__1"
    // InternalAle.g:2673:1: rule__OverrideMethod__Group_3_1__1 : rule__OverrideMethod__Group_3_1__1__Impl ;
    public final void rule__OverrideMethod__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2677:1: ( rule__OverrideMethod__Group_3_1__1__Impl )
            // InternalAle.g:2678:2: rule__OverrideMethod__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1__1"


    // $ANTLR start "rule__OverrideMethod__Group_3_1__1__Impl"
    // InternalAle.g:2684:1: rule__OverrideMethod__Group_3_1__1__Impl : ( ( rule__OverrideMethod__Group_3_1_1__0 )* ) ;
    public final void rule__OverrideMethod__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2688:1: ( ( ( rule__OverrideMethod__Group_3_1_1__0 )* ) )
            // InternalAle.g:2689:1: ( ( rule__OverrideMethod__Group_3_1_1__0 )* )
            {
            // InternalAle.g:2689:1: ( ( rule__OverrideMethod__Group_3_1_1__0 )* )
            // InternalAle.g:2690:2: ( rule__OverrideMethod__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getGroup_3_1_1()); 
            }
            // InternalAle.g:2691:2: ( rule__OverrideMethod__Group_3_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAle.g:2691:3: rule__OverrideMethod__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__OverrideMethod__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1__1__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3_1_1__0"
    // InternalAle.g:2700:1: rule__OverrideMethod__Group_3_1_1__0 : rule__OverrideMethod__Group_3_1_1__0__Impl rule__OverrideMethod__Group_3_1_1__1 ;
    public final void rule__OverrideMethod__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2704:1: ( rule__OverrideMethod__Group_3_1_1__0__Impl rule__OverrideMethod__Group_3_1_1__1 )
            // InternalAle.g:2705:2: rule__OverrideMethod__Group_3_1_1__0__Impl rule__OverrideMethod__Group_3_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__OverrideMethod__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1_1__0"


    // $ANTLR start "rule__OverrideMethod__Group_3_1_1__0__Impl"
    // InternalAle.g:2712:1: rule__OverrideMethod__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__OverrideMethod__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2716:1: ( ( ',' ) )
            // InternalAle.g:2717:1: ( ',' )
            {
            // InternalAle.g:2717:1: ( ',' )
            // InternalAle.g:2718:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__OverrideMethod__Group_3_1_1__1"
    // InternalAle.g:2727:1: rule__OverrideMethod__Group_3_1_1__1 : rule__OverrideMethod__Group_3_1_1__1__Impl ;
    public final void rule__OverrideMethod__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2731:1: ( rule__OverrideMethod__Group_3_1_1__1__Impl )
            // InternalAle.g:2732:2: rule__OverrideMethod__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1_1__1"


    // $ANTLR start "rule__OverrideMethod__Group_3_1_1__1__Impl"
    // InternalAle.g:2738:1: rule__OverrideMethod__Group_3_1_1__1__Impl : ( ( rule__OverrideMethod__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__OverrideMethod__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2742:1: ( ( ( rule__OverrideMethod__ParamsAssignment_3_1_1_1 ) ) )
            // InternalAle.g:2743:1: ( ( rule__OverrideMethod__ParamsAssignment_3_1_1_1 ) )
            {
            // InternalAle.g:2743:1: ( ( rule__OverrideMethod__ParamsAssignment_3_1_1_1 ) )
            // InternalAle.g:2744:2: ( rule__OverrideMethod__ParamsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsAssignment_3_1_1_1()); 
            }
            // InternalAle.g:2745:2: ( rule__OverrideMethod__ParamsAssignment_3_1_1_1 )
            // InternalAle.g:2745:3: rule__OverrideMethod__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OverrideMethod__ParamsAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalAle.g:2754:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2758:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalAle.g:2759:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalAle.g:2766:1: rule__Statement__Group_0__0__Impl : ( ruleVarAssign ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2770:1: ( ( ruleVarAssign ) )
            // InternalAle.g:2771:1: ( ruleVarAssign )
            {
            // InternalAle.g:2771:1: ( ruleVarAssign )
            // InternalAle.g:2772:2: ruleVarAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalAle.g:2781:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2785:1: ( rule__Statement__Group_0__1__Impl )
            // InternalAle.g:2786:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalAle.g:2792:1: rule__Statement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2796:1: ( ( ';' ) )
            // InternalAle.g:2797:1: ( ';' )
            {
            // InternalAle.g:2797:1: ( ';' )
            // InternalAle.g:2798:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // InternalAle.g:2808:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2812:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalAle.g:2813:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // InternalAle.g:2820:1: rule__Statement__Group_4__0__Impl : ( ruleLetStatement ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2824:1: ( ( ruleLetStatement ) )
            // InternalAle.g:2825:1: ( ruleLetStatement )
            {
            // InternalAle.g:2825:1: ( ruleLetStatement )
            // InternalAle.g:2826:2: ruleLetStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLetStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // InternalAle.g:2835:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2839:1: ( rule__Statement__Group_4__1__Impl )
            // InternalAle.g:2840:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // InternalAle.g:2846:1: rule__Statement__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2850:1: ( ( ';' ) )
            // InternalAle.g:2851:1: ( ';' )
            {
            // InternalAle.g:2851:1: ( ';' )
            // InternalAle.g:2852:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // InternalAle.g:2862:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2866:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // InternalAle.g:2867:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // InternalAle.g:2874:1: rule__Statement__Group_5__0__Impl : ( ruleReturnStatement ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2878:1: ( ( ruleReturnStatement ) )
            // InternalAle.g:2879:1: ( ruleReturnStatement )
            {
            // InternalAle.g:2879:1: ( ruleReturnStatement )
            // InternalAle.g:2880:2: ruleReturnStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // InternalAle.g:2889:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2893:1: ( rule__Statement__Group_5__1__Impl )
            // InternalAle.g:2894:2: rule__Statement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // InternalAle.g:2900:1: rule__Statement__Group_5__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2904:1: ( ( ';' ) )
            // InternalAle.g:2905:1: ( ';' )
            {
            // InternalAle.g:2905:1: ( ';' )
            // InternalAle.g:2906:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Statement__Group_6__0"
    // InternalAle.g:2916:1: rule__Statement__Group_6__0 : rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 ;
    public final void rule__Statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2920:1: ( rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 )
            // InternalAle.g:2921:2: rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_6__0"


    // $ANTLR start "rule__Statement__Group_6__0__Impl"
    // InternalAle.g:2928:1: rule__Statement__Group_6__0__Impl : ( ruleExpression ) ;
    public final void rule__Statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2932:1: ( ( ruleExpression ) )
            // InternalAle.g:2933:1: ( ruleExpression )
            {
            // InternalAle.g:2933:1: ( ruleExpression )
            // InternalAle.g:2934:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_6__0__Impl"


    // $ANTLR start "rule__Statement__Group_6__1"
    // InternalAle.g:2943:1: rule__Statement__Group_6__1 : rule__Statement__Group_6__1__Impl ;
    public final void rule__Statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2947:1: ( rule__Statement__Group_6__1__Impl )
            // InternalAle.g:2948:2: rule__Statement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_6__1"


    // $ANTLR start "rule__Statement__Group_6__1__Impl"
    // InternalAle.g:2954:1: rule__Statement__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2958:1: ( ( ';' ) )
            // InternalAle.g:2959:1: ( ';' )
            {
            // InternalAle.g:2959:1: ( ';' )
            // InternalAle.g:2960:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_6_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_6__1__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // InternalAle.g:2970:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2974:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // InternalAle.g:2975:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0"


    // $ANTLR start "rule__Statement__Group_7__0__Impl"
    // InternalAle.g:2982:1: rule__Statement__Group_7__0__Impl : ( ruleDebugStatement ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:2986:1: ( ( ruleDebugStatement ) )
            // InternalAle.g:2987:1: ( ruleDebugStatement )
            {
            // InternalAle.g:2987:1: ( ruleDebugStatement )
            // InternalAle.g:2988:2: ruleDebugStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDebugStatementParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDebugStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDebugStatementParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0__Impl"


    // $ANTLR start "rule__Statement__Group_7__1"
    // InternalAle.g:2997:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3001:1: ( rule__Statement__Group_7__1__Impl )
            // InternalAle.g:3002:2: rule__Statement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__1"


    // $ANTLR start "rule__Statement__Group_7__1__Impl"
    // InternalAle.g:3008:1: rule__Statement__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3012:1: ( ( ';' ) )
            // InternalAle.g:3013:1: ( ';' )
            {
            // InternalAle.g:3013:1: ( ';' )
            // InternalAle.g:3014:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__1__Impl"


    // $ANTLR start "rule__DebugStatement__Group__0"
    // InternalAle.g:3024:1: rule__DebugStatement__Group__0 : rule__DebugStatement__Group__0__Impl rule__DebugStatement__Group__1 ;
    public final void rule__DebugStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3028:1: ( rule__DebugStatement__Group__0__Impl rule__DebugStatement__Group__1 )
            // InternalAle.g:3029:2: rule__DebugStatement__Group__0__Impl rule__DebugStatement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DebugStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DebugStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__0"


    // $ANTLR start "rule__DebugStatement__Group__0__Impl"
    // InternalAle.g:3036:1: rule__DebugStatement__Group__0__Impl : ( () ) ;
    public final void rule__DebugStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3040:1: ( ( () ) )
            // InternalAle.g:3041:1: ( () )
            {
            // InternalAle.g:3041:1: ( () )
            // InternalAle.g:3042:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getDebugStatementAction_0()); 
            }
            // InternalAle.g:3043:2: ()
            // InternalAle.g:3043:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getDebugStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__0__Impl"


    // $ANTLR start "rule__DebugStatement__Group__1"
    // InternalAle.g:3051:1: rule__DebugStatement__Group__1 : rule__DebugStatement__Group__1__Impl rule__DebugStatement__Group__2 ;
    public final void rule__DebugStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3055:1: ( rule__DebugStatement__Group__1__Impl rule__DebugStatement__Group__2 )
            // InternalAle.g:3056:2: rule__DebugStatement__Group__1__Impl rule__DebugStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__DebugStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DebugStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__1"


    // $ANTLR start "rule__DebugStatement__Group__1__Impl"
    // InternalAle.g:3063:1: rule__DebugStatement__Group__1__Impl : ( 'debug' ) ;
    public final void rule__DebugStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3067:1: ( ( 'debug' ) )
            // InternalAle.g:3068:1: ( 'debug' )
            {
            // InternalAle.g:3068:1: ( 'debug' )
            // InternalAle.g:3069:2: 'debug'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getDebugKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getDebugKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__1__Impl"


    // $ANTLR start "rule__DebugStatement__Group__2"
    // InternalAle.g:3078:1: rule__DebugStatement__Group__2 : rule__DebugStatement__Group__2__Impl rule__DebugStatement__Group__3 ;
    public final void rule__DebugStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3082:1: ( rule__DebugStatement__Group__2__Impl rule__DebugStatement__Group__3 )
            // InternalAle.g:3083:2: rule__DebugStatement__Group__2__Impl rule__DebugStatement__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__DebugStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DebugStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__2"


    // $ANTLR start "rule__DebugStatement__Group__2__Impl"
    // InternalAle.g:3090:1: rule__DebugStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__DebugStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3094:1: ( ( '(' ) )
            // InternalAle.g:3095:1: ( '(' )
            {
            // InternalAle.g:3095:1: ( '(' )
            // InternalAle.g:3096:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__2__Impl"


    // $ANTLR start "rule__DebugStatement__Group__3"
    // InternalAle.g:3105:1: rule__DebugStatement__Group__3 : rule__DebugStatement__Group__3__Impl rule__DebugStatement__Group__4 ;
    public final void rule__DebugStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3109:1: ( rule__DebugStatement__Group__3__Impl rule__DebugStatement__Group__4 )
            // InternalAle.g:3110:2: rule__DebugStatement__Group__3__Impl rule__DebugStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__DebugStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DebugStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__3"


    // $ANTLR start "rule__DebugStatement__Group__3__Impl"
    // InternalAle.g:3117:1: rule__DebugStatement__Group__3__Impl : ( ( rule__DebugStatement__ExprAssignment_3 ) ) ;
    public final void rule__DebugStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3121:1: ( ( ( rule__DebugStatement__ExprAssignment_3 ) ) )
            // InternalAle.g:3122:1: ( ( rule__DebugStatement__ExprAssignment_3 ) )
            {
            // InternalAle.g:3122:1: ( ( rule__DebugStatement__ExprAssignment_3 ) )
            // InternalAle.g:3123:2: ( rule__DebugStatement__ExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getExprAssignment_3()); 
            }
            // InternalAle.g:3124:2: ( rule__DebugStatement__ExprAssignment_3 )
            // InternalAle.g:3124:3: rule__DebugStatement__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DebugStatement__ExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getExprAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__3__Impl"


    // $ANTLR start "rule__DebugStatement__Group__4"
    // InternalAle.g:3132:1: rule__DebugStatement__Group__4 : rule__DebugStatement__Group__4__Impl ;
    public final void rule__DebugStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3136:1: ( rule__DebugStatement__Group__4__Impl )
            // InternalAle.g:3137:2: rule__DebugStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DebugStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__4"


    // $ANTLR start "rule__DebugStatement__Group__4__Impl"
    // InternalAle.g:3143:1: rule__DebugStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__DebugStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3147:1: ( ( ')' ) )
            // InternalAle.g:3148:1: ( ')' )
            {
            // InternalAle.g:3148:1: ( ')' )
            // InternalAle.g:3149:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__Group__4__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // InternalAle.g:3159:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3163:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalAle.g:3164:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // InternalAle.g:3171:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3175:1: ( ( () ) )
            // InternalAle.g:3176:1: ( () )
            {
            // InternalAle.g:3176:1: ( () )
            // InternalAle.g:3177:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            }
            // InternalAle.g:3178:2: ()
            // InternalAle.g:3178:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // InternalAle.g:3186:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3190:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalAle.g:3191:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ReturnStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // InternalAle.g:3198:1: rule__ReturnStatement__Group__1__Impl : ( 'return' ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3202:1: ( ( 'return' ) )
            // InternalAle.g:3203:1: ( 'return' )
            {
            // InternalAle.g:3203:1: ( 'return' )
            // InternalAle.g:3204:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__2"
    // InternalAle.g:3213:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3217:1: ( rule__ReturnStatement__Group__2__Impl )
            // InternalAle.g:3218:2: rule__ReturnStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__2"


    // $ANTLR start "rule__ReturnStatement__Group__2__Impl"
    // InternalAle.g:3224:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ReturnedAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3228:1: ( ( ( rule__ReturnStatement__ReturnedAssignment_2 ) ) )
            // InternalAle.g:3229:1: ( ( rule__ReturnStatement__ReturnedAssignment_2 ) )
            {
            // InternalAle.g:3229:1: ( ( rule__ReturnStatement__ReturnedAssignment_2 ) )
            // InternalAle.g:3230:2: ( rule__ReturnStatement__ReturnedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnedAssignment_2()); 
            }
            // InternalAle.g:3231:2: ( rule__ReturnStatement__ReturnedAssignment_2 )
            // InternalAle.g:3231:3: rule__ReturnStatement__ReturnedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__ReturnedAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnedAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__2__Impl"


    // $ANTLR start "rule__LetStatement__Group__0"
    // InternalAle.g:3240:1: rule__LetStatement__Group__0 : rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 ;
    public final void rule__LetStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3244:1: ( rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1 )
            // InternalAle.g:3245:2: rule__LetStatement__Group__0__Impl rule__LetStatement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__LetStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__0"


    // $ANTLR start "rule__LetStatement__Group__0__Impl"
    // InternalAle.g:3252:1: rule__LetStatement__Group__0__Impl : ( () ) ;
    public final void rule__LetStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3256:1: ( ( () ) )
            // InternalAle.g:3257:1: ( () )
            {
            // InternalAle.g:3257:1: ( () )
            // InternalAle.g:3258:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getLetStatementAction_0()); 
            }
            // InternalAle.g:3259:2: ()
            // InternalAle.g:3259:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getLetStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__0__Impl"


    // $ANTLR start "rule__LetStatement__Group__1"
    // InternalAle.g:3267:1: rule__LetStatement__Group__1 : rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 ;
    public final void rule__LetStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3271:1: ( rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2 )
            // InternalAle.g:3272:2: rule__LetStatement__Group__1__Impl rule__LetStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__LetStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__1"


    // $ANTLR start "rule__LetStatement__Group__1__Impl"
    // InternalAle.g:3279:1: rule__LetStatement__Group__1__Impl : ( 'let' ) ;
    public final void rule__LetStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3283:1: ( ( 'let' ) )
            // InternalAle.g:3284:1: ( 'let' )
            {
            // InternalAle.g:3284:1: ( 'let' )
            // InternalAle.g:3285:2: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getLetKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getLetKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__1__Impl"


    // $ANTLR start "rule__LetStatement__Group__2"
    // InternalAle.g:3294:1: rule__LetStatement__Group__2 : rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 ;
    public final void rule__LetStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3298:1: ( rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3 )
            // InternalAle.g:3299:2: rule__LetStatement__Group__2__Impl rule__LetStatement__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__LetStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__2"


    // $ANTLR start "rule__LetStatement__Group__2__Impl"
    // InternalAle.g:3306:1: rule__LetStatement__Group__2__Impl : ( ( rule__LetStatement__BindingsAssignment_2 ) ) ;
    public final void rule__LetStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3310:1: ( ( ( rule__LetStatement__BindingsAssignment_2 ) ) )
            // InternalAle.g:3311:1: ( ( rule__LetStatement__BindingsAssignment_2 ) )
            {
            // InternalAle.g:3311:1: ( ( rule__LetStatement__BindingsAssignment_2 ) )
            // InternalAle.g:3312:2: ( rule__LetStatement__BindingsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsAssignment_2()); 
            }
            // InternalAle.g:3313:2: ( rule__LetStatement__BindingsAssignment_2 )
            // InternalAle.g:3313:3: rule__LetStatement__BindingsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BindingsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__2__Impl"


    // $ANTLR start "rule__LetStatement__Group__3"
    // InternalAle.g:3321:1: rule__LetStatement__Group__3 : rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 ;
    public final void rule__LetStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3325:1: ( rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4 )
            // InternalAle.g:3326:2: rule__LetStatement__Group__3__Impl rule__LetStatement__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__LetStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__3"


    // $ANTLR start "rule__LetStatement__Group__3__Impl"
    // InternalAle.g:3333:1: rule__LetStatement__Group__3__Impl : ( ( rule__LetStatement__Group_3__0 )* ) ;
    public final void rule__LetStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3337:1: ( ( ( rule__LetStatement__Group_3__0 )* ) )
            // InternalAle.g:3338:1: ( ( rule__LetStatement__Group_3__0 )* )
            {
            // InternalAle.g:3338:1: ( ( rule__LetStatement__Group_3__0 )* )
            // InternalAle.g:3339:2: ( rule__LetStatement__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getGroup_3()); 
            }
            // InternalAle.g:3340:2: ( rule__LetStatement__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAle.g:3340:3: rule__LetStatement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__LetStatement__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__3__Impl"


    // $ANTLR start "rule__LetStatement__Group__4"
    // InternalAle.g:3348:1: rule__LetStatement__Group__4 : rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 ;
    public final void rule__LetStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3352:1: ( rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5 )
            // InternalAle.g:3353:2: rule__LetStatement__Group__4__Impl rule__LetStatement__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__LetStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__4"


    // $ANTLR start "rule__LetStatement__Group__4__Impl"
    // InternalAle.g:3360:1: rule__LetStatement__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3364:1: ( ( 'in' ) )
            // InternalAle.g:3365:1: ( 'in' )
            {
            // InternalAle.g:3365:1: ( 'in' )
            // InternalAle.g:3366:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getInKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getInKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__4__Impl"


    // $ANTLR start "rule__LetStatement__Group__5"
    // InternalAle.g:3375:1: rule__LetStatement__Group__5 : rule__LetStatement__Group__5__Impl ;
    public final void rule__LetStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3379:1: ( rule__LetStatement__Group__5__Impl )
            // InternalAle.g:3380:2: rule__LetStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__5"


    // $ANTLR start "rule__LetStatement__Group__5__Impl"
    // InternalAle.g:3386:1: rule__LetStatement__Group__5__Impl : ( ( rule__LetStatement__BlockAssignment_5 ) ) ;
    public final void rule__LetStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3390:1: ( ( ( rule__LetStatement__BlockAssignment_5 ) ) )
            // InternalAle.g:3391:1: ( ( rule__LetStatement__BlockAssignment_5 ) )
            {
            // InternalAle.g:3391:1: ( ( rule__LetStatement__BlockAssignment_5 ) )
            // InternalAle.g:3392:2: ( rule__LetStatement__BlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBlockAssignment_5()); 
            }
            // InternalAle.g:3393:2: ( rule__LetStatement__BlockAssignment_5 )
            // InternalAle.g:3393:3: rule__LetStatement__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBlockAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group__5__Impl"


    // $ANTLR start "rule__LetStatement__Group_3__0"
    // InternalAle.g:3402:1: rule__LetStatement__Group_3__0 : rule__LetStatement__Group_3__0__Impl rule__LetStatement__Group_3__1 ;
    public final void rule__LetStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3406:1: ( rule__LetStatement__Group_3__0__Impl rule__LetStatement__Group_3__1 )
            // InternalAle.g:3407:2: rule__LetStatement__Group_3__0__Impl rule__LetStatement__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__LetStatement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group_3__0"


    // $ANTLR start "rule__LetStatement__Group_3__0__Impl"
    // InternalAle.g:3414:1: rule__LetStatement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LetStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3418:1: ( ( ',' ) )
            // InternalAle.g:3419:1: ( ',' )
            {
            // InternalAle.g:3419:1: ( ',' )
            // InternalAle.g:3420:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getCommaKeyword_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group_3__0__Impl"


    // $ANTLR start "rule__LetStatement__Group_3__1"
    // InternalAle.g:3429:1: rule__LetStatement__Group_3__1 : rule__LetStatement__Group_3__1__Impl ;
    public final void rule__LetStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3433:1: ( rule__LetStatement__Group_3__1__Impl )
            // InternalAle.g:3434:2: rule__LetStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group_3__1"


    // $ANTLR start "rule__LetStatement__Group_3__1__Impl"
    // InternalAle.g:3440:1: rule__LetStatement__Group_3__1__Impl : ( ( rule__LetStatement__BindingsAssignment_3_1 ) ) ;
    public final void rule__LetStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3444:1: ( ( ( rule__LetStatement__BindingsAssignment_3_1 ) ) )
            // InternalAle.g:3445:1: ( ( rule__LetStatement__BindingsAssignment_3_1 ) )
            {
            // InternalAle.g:3445:1: ( ( rule__LetStatement__BindingsAssignment_3_1 ) )
            // InternalAle.g:3446:2: ( rule__LetStatement__BindingsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsAssignment_3_1()); 
            }
            // InternalAle.g:3447:2: ( rule__LetStatement__BindingsAssignment_3_1 )
            // InternalAle.g:3447:3: rule__LetStatement__BindingsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BindingsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__Group_3__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalAle.g:3456:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3460:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalAle.g:3461:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalAle.g:3468:1: rule__IfStatement__Group__0__Impl : ( () ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3472:1: ( ( () ) )
            // InternalAle.g:3473:1: ( () )
            {
            // InternalAle.g:3473:1: ( () )
            // InternalAle.g:3474:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfStatementAction_0()); 
            }
            // InternalAle.g:3475:2: ()
            // InternalAle.g:3475:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalAle.g:3483:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3487:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalAle.g:3488:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalAle.g:3495:1: rule__IfStatement__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3499:1: ( ( 'if' ) )
            // InternalAle.g:3500:1: ( 'if' )
            {
            // InternalAle.g:3500:1: ( 'if' )
            // InternalAle.g:3501:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalAle.g:3510:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3514:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalAle.g:3515:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalAle.g:3522:1: rule__IfStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3526:1: ( ( '(' ) )
            // InternalAle.g:3527:1: ( '(' )
            {
            // InternalAle.g:3527:1: ( '(' )
            // InternalAle.g:3528:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalAle.g:3537:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3541:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalAle.g:3542:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalAle.g:3549:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__ConditionAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3553:1: ( ( ( rule__IfStatement__ConditionAssignment_3 ) ) )
            // InternalAle.g:3554:1: ( ( rule__IfStatement__ConditionAssignment_3 ) )
            {
            // InternalAle.g:3554:1: ( ( rule__IfStatement__ConditionAssignment_3 ) )
            // InternalAle.g:3555:2: ( rule__IfStatement__ConditionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getConditionAssignment_3()); 
            }
            // InternalAle.g:3556:2: ( rule__IfStatement__ConditionAssignment_3 )
            // InternalAle.g:3556:3: rule__IfStatement__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getConditionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalAle.g:3564:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3568:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalAle.g:3569:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalAle.g:3576:1: rule__IfStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3580:1: ( ( ')' ) )
            // InternalAle.g:3581:1: ( ')' )
            {
            // InternalAle.g:3581:1: ( ')' )
            // InternalAle.g:3582:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalAle.g:3591:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3595:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalAle.g:3596:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalAle.g:3603:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__ThenBranchAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3607:1: ( ( ( rule__IfStatement__ThenBranchAssignment_5 ) ) )
            // InternalAle.g:3608:1: ( ( rule__IfStatement__ThenBranchAssignment_5 ) )
            {
            // InternalAle.g:3608:1: ( ( rule__IfStatement__ThenBranchAssignment_5 ) )
            // InternalAle.g:3609:2: ( rule__IfStatement__ThenBranchAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBranchAssignment_5()); 
            }
            // InternalAle.g:3610:2: ( rule__IfStatement__ThenBranchAssignment_5 )
            // InternalAle.g:3610:3: rule__IfStatement__ThenBranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ThenBranchAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBranchAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalAle.g:3618:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3622:1: ( rule__IfStatement__Group__6__Impl )
            // InternalAle.g:3623:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalAle.g:3629:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3633:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // InternalAle.g:3634:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // InternalAle.g:3634:1: ( ( rule__IfStatement__Group_6__0 )? )
            // InternalAle.g:3635:2: ( rule__IfStatement__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            }
            // InternalAle.g:3636:2: ( rule__IfStatement__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAle.g:3636:3: rule__IfStatement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__0"
    // InternalAle.g:3645:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3649:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // InternalAle.g:3650:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__IfStatement__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__0"


    // $ANTLR start "rule__IfStatement__Group_6__0__Impl"
    // InternalAle.g:3657:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3661:1: ( ( 'else' ) )
            // InternalAle.g:3662:1: ( 'else' )
            {
            // InternalAle.g:3662:1: ( 'else' )
            // InternalAle.g:3663:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__1"
    // InternalAle.g:3672:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3676:1: ( rule__IfStatement__Group_6__1__Impl )
            // InternalAle.g:3677:2: rule__IfStatement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__1"


    // $ANTLR start "rule__IfStatement__Group_6__1__Impl"
    // InternalAle.g:3683:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3687:1: ( ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) ) )
            // InternalAle.g:3688:1: ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) )
            {
            // InternalAle.g:3688:1: ( ( rule__IfStatement__ElseBranchAssignment_6_1 ) )
            // InternalAle.g:3689:2: ( rule__IfStatement__ElseBranchAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBranchAssignment_6_1()); 
            }
            // InternalAle.g:3690:2: ( rule__IfStatement__ElseBranchAssignment_6_1 )
            // InternalAle.g:3690:3: rule__IfStatement__ElseBranchAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseBranchAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBranchAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalAle.g:3699:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3703:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalAle.g:3704:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalAle.g:3711:1: rule__WhileStatement__Group__0__Impl : ( () ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3715:1: ( ( () ) )
            // InternalAle.g:3716:1: ( () )
            {
            // InternalAle.g:3716:1: ( () )
            // InternalAle.g:3717:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileStatementAction_0()); 
            }
            // InternalAle.g:3718:2: ()
            // InternalAle.g:3718:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalAle.g:3726:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3730:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalAle.g:3731:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalAle.g:3738:1: rule__WhileStatement__Group__1__Impl : ( 'while' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3742:1: ( ( 'while' ) )
            // InternalAle.g:3743:1: ( 'while' )
            {
            // InternalAle.g:3743:1: ( 'while' )
            // InternalAle.g:3744:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalAle.g:3753:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3757:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalAle.g:3758:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalAle.g:3765:1: rule__WhileStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3769:1: ( ( '(' ) )
            // InternalAle.g:3770:1: ( '(' )
            {
            // InternalAle.g:3770:1: ( '(' )
            // InternalAle.g:3771:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalAle.g:3780:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3784:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalAle.g:3785:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalAle.g:3792:1: rule__WhileStatement__Group__3__Impl : ( ( rule__WhileStatement__ConditionAssignment_3 ) ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3796:1: ( ( ( rule__WhileStatement__ConditionAssignment_3 ) ) )
            // InternalAle.g:3797:1: ( ( rule__WhileStatement__ConditionAssignment_3 ) )
            {
            // InternalAle.g:3797:1: ( ( rule__WhileStatement__ConditionAssignment_3 ) )
            // InternalAle.g:3798:2: ( rule__WhileStatement__ConditionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionAssignment_3()); 
            }
            // InternalAle.g:3799:2: ( rule__WhileStatement__ConditionAssignment_3 )
            // InternalAle.g:3799:3: rule__WhileStatement__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__ConditionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalAle.g:3807:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3811:1: ( rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 )
            // InternalAle.g:3812:2: rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalAle.g:3819:1: rule__WhileStatement__Group__4__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3823:1: ( ( ')' ) )
            // InternalAle.g:3824:1: ( ')' )
            {
            // InternalAle.g:3824:1: ( ')' )
            // InternalAle.g:3825:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__WhileStatement__Group__5"
    // InternalAle.g:3834:1: rule__WhileStatement__Group__5 : rule__WhileStatement__Group__5__Impl ;
    public final void rule__WhileStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3838:1: ( rule__WhileStatement__Group__5__Impl )
            // InternalAle.g:3839:2: rule__WhileStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__5"


    // $ANTLR start "rule__WhileStatement__Group__5__Impl"
    // InternalAle.g:3845:1: rule__WhileStatement__Group__5__Impl : ( ( rule__WhileStatement__WhileBlockAssignment_5 ) ) ;
    public final void rule__WhileStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3849:1: ( ( ( rule__WhileStatement__WhileBlockAssignment_5 ) ) )
            // InternalAle.g:3850:1: ( ( rule__WhileStatement__WhileBlockAssignment_5 ) )
            {
            // InternalAle.g:3850:1: ( ( rule__WhileStatement__WhileBlockAssignment_5 ) )
            // InternalAle.g:3851:2: ( rule__WhileStatement__WhileBlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileBlockAssignment_5()); 
            }
            // InternalAle.g:3852:2: ( rule__WhileStatement__WhileBlockAssignment_5 )
            // InternalAle.g:3852:3: rule__WhileStatement__WhileBlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__WhileBlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileBlockAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalAle.g:3861:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3865:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalAle.g:3866:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalAle.g:3873:1: rule__ForLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3877:1: ( ( () ) )
            // InternalAle.g:3878:1: ( () )
            {
            // InternalAle.g:3878:1: ( () )
            // InternalAle.g:3879:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForLoopAction_0()); 
            }
            // InternalAle.g:3880:2: ()
            // InternalAle.g:3880:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getForLoopAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalAle.g:3888:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3892:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalAle.g:3893:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalAle.g:3900:1: rule__ForLoop__Group__1__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3904:1: ( ( 'for' ) )
            // InternalAle.g:3905:1: ( 'for' )
            {
            // InternalAle.g:3905:1: ( 'for' )
            // InternalAle.g:3906:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getForKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getForKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalAle.g:3915:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3919:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalAle.g:3920:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalAle.g:3927:1: rule__ForLoop__Group__2__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3931:1: ( ( '(' ) )
            // InternalAle.g:3932:1: ( '(' )
            {
            // InternalAle.g:3932:1: ( '(' )
            // InternalAle.g:3933:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalAle.g:3942:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3946:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalAle.g:3947:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalAle.g:3954:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__TypeAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3958:1: ( ( ( rule__ForLoop__TypeAssignment_3 ) ) )
            // InternalAle.g:3959:1: ( ( rule__ForLoop__TypeAssignment_3 ) )
            {
            // InternalAle.g:3959:1: ( ( rule__ForLoop__TypeAssignment_3 ) )
            // InternalAle.g:3960:2: ( rule__ForLoop__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getTypeAssignment_3()); 
            }
            // InternalAle.g:3961:2: ( rule__ForLoop__TypeAssignment_3 )
            // InternalAle.g:3961:3: rule__ForLoop__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalAle.g:3969:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3973:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalAle.g:3974:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalAle.g:3981:1: rule__ForLoop__Group__4__Impl : ( ( rule__ForLoop__NameAssignment_4 ) ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:3985:1: ( ( ( rule__ForLoop__NameAssignment_4 ) ) )
            // InternalAle.g:3986:1: ( ( rule__ForLoop__NameAssignment_4 ) )
            {
            // InternalAle.g:3986:1: ( ( rule__ForLoop__NameAssignment_4 ) )
            // InternalAle.g:3987:2: ( rule__ForLoop__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getNameAssignment_4()); 
            }
            // InternalAle.g:3988:2: ( rule__ForLoop__NameAssignment_4 )
            // InternalAle.g:3988:3: rule__ForLoop__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalAle.g:3996:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4000:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalAle.g:4001:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalAle.g:4008:1: rule__ForLoop__Group__5__Impl : ( 'in' ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4012:1: ( ( 'in' ) )
            // InternalAle.g:4013:1: ( 'in' )
            {
            // InternalAle.g:4013:1: ( 'in' )
            // InternalAle.g:4014:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getInKeyword_5()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getInKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalAle.g:4023:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4027:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalAle.g:4028:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalAle.g:4035:1: rule__ForLoop__Group__6__Impl : ( ( rule__ForLoop__CollectionAssignment_6 ) ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4039:1: ( ( ( rule__ForLoop__CollectionAssignment_6 ) ) )
            // InternalAle.g:4040:1: ( ( rule__ForLoop__CollectionAssignment_6 ) )
            {
            // InternalAle.g:4040:1: ( ( rule__ForLoop__CollectionAssignment_6 ) )
            // InternalAle.g:4041:2: ( rule__ForLoop__CollectionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getCollectionAssignment_6()); 
            }
            // InternalAle.g:4042:2: ( rule__ForLoop__CollectionAssignment_6 )
            // InternalAle.g:4042:3: rule__ForLoop__CollectionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__CollectionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getCollectionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // InternalAle.g:4050:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4054:1: ( rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 )
            // InternalAle.g:4055:2: rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // InternalAle.g:4062:1: rule__ForLoop__Group__7__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4066:1: ( ( ')' ) )
            // InternalAle.g:4067:1: ( ')' )
            {
            // InternalAle.g:4067:1: ( ')' )
            // InternalAle.g:4068:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoop__Group__8"
    // InternalAle.g:4077:1: rule__ForLoop__Group__8 : rule__ForLoop__Group__8__Impl ;
    public final void rule__ForLoop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4081:1: ( rule__ForLoop__Group__8__Impl )
            // InternalAle.g:4082:2: rule__ForLoop__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8"


    // $ANTLR start "rule__ForLoop__Group__8__Impl"
    // InternalAle.g:4088:1: rule__ForLoop__Group__8__Impl : ( ( rule__ForLoop__BlockAssignment_8 ) ) ;
    public final void rule__ForLoop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4092:1: ( ( ( rule__ForLoop__BlockAssignment_8 ) ) )
            // InternalAle.g:4093:1: ( ( rule__ForLoop__BlockAssignment_8 ) )
            {
            // InternalAle.g:4093:1: ( ( rule__ForLoop__BlockAssignment_8 ) )
            // InternalAle.g:4094:2: ( rule__ForLoop__BlockAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getBlockAssignment_8()); 
            }
            // InternalAle.g:4095:2: ( rule__ForLoop__BlockAssignment_8 )
            // InternalAle.g:4095:3: rule__ForLoop__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__BlockAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getBlockAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalAle.g:4104:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4108:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAle.g:4109:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalAle.g:4116:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4120:1: ( ( () ) )
            // InternalAle.g:4121:1: ( () )
            {
            // InternalAle.g:4121:1: ( () )
            // InternalAle.g:4122:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalAle.g:4123:2: ()
            // InternalAle.g:4123:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalAle.g:4131:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4135:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAle.g:4136:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalAle.g:4143:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4147:1: ( ( '{' ) )
            // InternalAle.g:4148:1: ( '{' )
            {
            // InternalAle.g:4148:1: ( '{' )
            // InternalAle.g:4149:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalAle.g:4158:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4162:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAle.g:4163:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalAle.g:4170:1: rule__Block__Group__2__Impl : ( ( rule__Block__BodyAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4174:1: ( ( ( rule__Block__BodyAssignment_2 )* ) )
            // InternalAle.g:4175:1: ( ( rule__Block__BodyAssignment_2 )* )
            {
            // InternalAle.g:4175:1: ( ( rule__Block__BodyAssignment_2 )* )
            // InternalAle.g:4176:2: ( rule__Block__BodyAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBodyAssignment_2()); 
            }
            // InternalAle.g:4177:2: ( rule__Block__BodyAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_NULL && LA27_0<=RULE_BOOLEAN)||(LA27_0>=15 && LA27_0<=18)||LA27_0==31||(LA27_0>=34 && LA27_0<=36)||LA27_0==38||(LA27_0>=40 && LA27_0<=41)||LA27_0==55||(LA27_0>=58 && LA27_0<=60)||(LA27_0>=62 && LA27_0<=63)||(LA27_0>=65 && LA27_0<=68)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAle.g:4177:3: rule__Block__BodyAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Block__BodyAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBodyAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalAle.g:4185:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4189:1: ( rule__Block__Group__3__Impl )
            // InternalAle.g:4190:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalAle.g:4196:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4200:1: ( ( '}' ) )
            // InternalAle.g:4201:1: ( '}' )
            {
            // InternalAle.g:4201:1: ( '}' )
            // InternalAle.g:4202:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__VarAssign__Group_0__0"
    // InternalAle.g:4212:1: rule__VarAssign__Group_0__0 : rule__VarAssign__Group_0__0__Impl rule__VarAssign__Group_0__1 ;
    public final void rule__VarAssign__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4216:1: ( rule__VarAssign__Group_0__0__Impl rule__VarAssign__Group_0__1 )
            // InternalAle.g:4217:2: rule__VarAssign__Group_0__0__Impl rule__VarAssign__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__VarAssign__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__0"


    // $ANTLR start "rule__VarAssign__Group_0__0__Impl"
    // InternalAle.g:4224:1: rule__VarAssign__Group_0__0__Impl : ( () ) ;
    public final void rule__VarAssign__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4228:1: ( ( () ) )
            // InternalAle.g:4229:1: ( () )
            {
            // InternalAle.g:4229:1: ( () )
            // InternalAle.g:4230:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getVarDeclarationAction_0_0()); 
            }
            // InternalAle.g:4231:2: ()
            // InternalAle.g:4231:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getVarDeclarationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__0__Impl"


    // $ANTLR start "rule__VarAssign__Group_0__1"
    // InternalAle.g:4239:1: rule__VarAssign__Group_0__1 : rule__VarAssign__Group_0__1__Impl rule__VarAssign__Group_0__2 ;
    public final void rule__VarAssign__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4243:1: ( rule__VarAssign__Group_0__1__Impl rule__VarAssign__Group_0__2 )
            // InternalAle.g:4244:2: rule__VarAssign__Group_0__1__Impl rule__VarAssign__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__VarAssign__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__1"


    // $ANTLR start "rule__VarAssign__Group_0__1__Impl"
    // InternalAle.g:4251:1: rule__VarAssign__Group_0__1__Impl : ( ( rule__VarAssign__TypeAssignment_0_1 ) ) ;
    public final void rule__VarAssign__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4255:1: ( ( ( rule__VarAssign__TypeAssignment_0_1 ) ) )
            // InternalAle.g:4256:1: ( ( rule__VarAssign__TypeAssignment_0_1 ) )
            {
            // InternalAle.g:4256:1: ( ( rule__VarAssign__TypeAssignment_0_1 ) )
            // InternalAle.g:4257:2: ( rule__VarAssign__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getTypeAssignment_0_1()); 
            }
            // InternalAle.g:4258:2: ( rule__VarAssign__TypeAssignment_0_1 )
            // InternalAle.g:4258:3: rule__VarAssign__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__TypeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getTypeAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__1__Impl"


    // $ANTLR start "rule__VarAssign__Group_0__2"
    // InternalAle.g:4266:1: rule__VarAssign__Group_0__2 : rule__VarAssign__Group_0__2__Impl rule__VarAssign__Group_0__3 ;
    public final void rule__VarAssign__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4270:1: ( rule__VarAssign__Group_0__2__Impl rule__VarAssign__Group_0__3 )
            // InternalAle.g:4271:2: rule__VarAssign__Group_0__2__Impl rule__VarAssign__Group_0__3
            {
            pushFollow(FOLLOW_38);
            rule__VarAssign__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__2"


    // $ANTLR start "rule__VarAssign__Group_0__2__Impl"
    // InternalAle.g:4278:1: rule__VarAssign__Group_0__2__Impl : ( ( rule__VarAssign__NameAssignment_0_2 ) ) ;
    public final void rule__VarAssign__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4282:1: ( ( ( rule__VarAssign__NameAssignment_0_2 ) ) )
            // InternalAle.g:4283:1: ( ( rule__VarAssign__NameAssignment_0_2 ) )
            {
            // InternalAle.g:4283:1: ( ( rule__VarAssign__NameAssignment_0_2 ) )
            // InternalAle.g:4284:2: ( rule__VarAssign__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getNameAssignment_0_2()); 
            }
            // InternalAle.g:4285:2: ( rule__VarAssign__NameAssignment_0_2 )
            // InternalAle.g:4285:3: rule__VarAssign__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__NameAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getNameAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__2__Impl"


    // $ANTLR start "rule__VarAssign__Group_0__3"
    // InternalAle.g:4293:1: rule__VarAssign__Group_0__3 : rule__VarAssign__Group_0__3__Impl rule__VarAssign__Group_0__4 ;
    public final void rule__VarAssign__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4297:1: ( rule__VarAssign__Group_0__3__Impl rule__VarAssign__Group_0__4 )
            // InternalAle.g:4298:2: rule__VarAssign__Group_0__3__Impl rule__VarAssign__Group_0__4
            {
            pushFollow(FOLLOW_25);
            rule__VarAssign__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__3"


    // $ANTLR start "rule__VarAssign__Group_0__3__Impl"
    // InternalAle.g:4305:1: rule__VarAssign__Group_0__3__Impl : ( '=' ) ;
    public final void rule__VarAssign__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4309:1: ( ( '=' ) )
            // InternalAle.g:4310:1: ( '=' )
            {
            // InternalAle.g:4310:1: ( '=' )
            // InternalAle.g:4311:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_0_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__3__Impl"


    // $ANTLR start "rule__VarAssign__Group_0__4"
    // InternalAle.g:4320:1: rule__VarAssign__Group_0__4 : rule__VarAssign__Group_0__4__Impl ;
    public final void rule__VarAssign__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4324:1: ( rule__VarAssign__Group_0__4__Impl )
            // InternalAle.g:4325:2: rule__VarAssign__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__4"


    // $ANTLR start "rule__VarAssign__Group_0__4__Impl"
    // InternalAle.g:4331:1: rule__VarAssign__Group_0__4__Impl : ( ( rule__VarAssign__ValueAssignment_0_4 ) ) ;
    public final void rule__VarAssign__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4335:1: ( ( ( rule__VarAssign__ValueAssignment_0_4 ) ) )
            // InternalAle.g:4336:1: ( ( rule__VarAssign__ValueAssignment_0_4 ) )
            {
            // InternalAle.g:4336:1: ( ( rule__VarAssign__ValueAssignment_0_4 ) )
            // InternalAle.g:4337:2: ( rule__VarAssign__ValueAssignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getValueAssignment_0_4()); 
            }
            // InternalAle.g:4338:2: ( rule__VarAssign__ValueAssignment_0_4 )
            // InternalAle.g:4338:3: rule__VarAssign__ValueAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__ValueAssignment_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getValueAssignment_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_0__4__Impl"


    // $ANTLR start "rule__VarAssign__Group_1__0"
    // InternalAle.g:4347:1: rule__VarAssign__Group_1__0 : rule__VarAssign__Group_1__0__Impl rule__VarAssign__Group_1__1 ;
    public final void rule__VarAssign__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4351:1: ( rule__VarAssign__Group_1__0__Impl rule__VarAssign__Group_1__1 )
            // InternalAle.g:4352:2: rule__VarAssign__Group_1__0__Impl rule__VarAssign__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__VarAssign__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__0"


    // $ANTLR start "rule__VarAssign__Group_1__0__Impl"
    // InternalAle.g:4359:1: rule__VarAssign__Group_1__0__Impl : ( () ) ;
    public final void rule__VarAssign__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4363:1: ( ( () ) )
            // InternalAle.g:4364:1: ( () )
            {
            // InternalAle.g:4364:1: ( () )
            // InternalAle.g:4365:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getVarAssignAction_1_0()); 
            }
            // InternalAle.g:4366:2: ()
            // InternalAle.g:4366:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getVarAssignAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__0__Impl"


    // $ANTLR start "rule__VarAssign__Group_1__1"
    // InternalAle.g:4374:1: rule__VarAssign__Group_1__1 : rule__VarAssign__Group_1__1__Impl rule__VarAssign__Group_1__2 ;
    public final void rule__VarAssign__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4378:1: ( rule__VarAssign__Group_1__1__Impl rule__VarAssign__Group_1__2 )
            // InternalAle.g:4379:2: rule__VarAssign__Group_1__1__Impl rule__VarAssign__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__VarAssign__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__1"


    // $ANTLR start "rule__VarAssign__Group_1__1__Impl"
    // InternalAle.g:4386:1: rule__VarAssign__Group_1__1__Impl : ( ( rule__VarAssign__NameAssignment_1_1 ) ) ;
    public final void rule__VarAssign__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4390:1: ( ( ( rule__VarAssign__NameAssignment_1_1 ) ) )
            // InternalAle.g:4391:1: ( ( rule__VarAssign__NameAssignment_1_1 ) )
            {
            // InternalAle.g:4391:1: ( ( rule__VarAssign__NameAssignment_1_1 ) )
            // InternalAle.g:4392:2: ( rule__VarAssign__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getNameAssignment_1_1()); 
            }
            // InternalAle.g:4393:2: ( rule__VarAssign__NameAssignment_1_1 )
            // InternalAle.g:4393:3: rule__VarAssign__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__1__Impl"


    // $ANTLR start "rule__VarAssign__Group_1__2"
    // InternalAle.g:4401:1: rule__VarAssign__Group_1__2 : rule__VarAssign__Group_1__2__Impl rule__VarAssign__Group_1__3 ;
    public final void rule__VarAssign__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4405:1: ( rule__VarAssign__Group_1__2__Impl rule__VarAssign__Group_1__3 )
            // InternalAle.g:4406:2: rule__VarAssign__Group_1__2__Impl rule__VarAssign__Group_1__3
            {
            pushFollow(FOLLOW_25);
            rule__VarAssign__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__2"


    // $ANTLR start "rule__VarAssign__Group_1__2__Impl"
    // InternalAle.g:4413:1: rule__VarAssign__Group_1__2__Impl : ( '=' ) ;
    public final void rule__VarAssign__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4417:1: ( ( '=' ) )
            // InternalAle.g:4418:1: ( '=' )
            {
            // InternalAle.g:4418:1: ( '=' )
            // InternalAle.g:4419:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__2__Impl"


    // $ANTLR start "rule__VarAssign__Group_1__3"
    // InternalAle.g:4428:1: rule__VarAssign__Group_1__3 : rule__VarAssign__Group_1__3__Impl ;
    public final void rule__VarAssign__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4432:1: ( rule__VarAssign__Group_1__3__Impl )
            // InternalAle.g:4433:2: rule__VarAssign__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__3"


    // $ANTLR start "rule__VarAssign__Group_1__3__Impl"
    // InternalAle.g:4439:1: rule__VarAssign__Group_1__3__Impl : ( ( rule__VarAssign__ValueAssignment_1_3 ) ) ;
    public final void rule__VarAssign__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4443:1: ( ( ( rule__VarAssign__ValueAssignment_1_3 ) ) )
            // InternalAle.g:4444:1: ( ( rule__VarAssign__ValueAssignment_1_3 ) )
            {
            // InternalAle.g:4444:1: ( ( rule__VarAssign__ValueAssignment_1_3 ) )
            // InternalAle.g:4445:2: ( rule__VarAssign__ValueAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getValueAssignment_1_3()); 
            }
            // InternalAle.g:4446:2: ( rule__VarAssign__ValueAssignment_1_3 )
            // InternalAle.g:4446:3: rule__VarAssign__ValueAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__ValueAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getValueAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group_1__3__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group__0"
    // InternalAle.g:4455:1: rule__ImpliesOperation__Group__0 : rule__ImpliesOperation__Group__0__Impl rule__ImpliesOperation__Group__1 ;
    public final void rule__ImpliesOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4459:1: ( rule__ImpliesOperation__Group__0__Impl rule__ImpliesOperation__Group__1 )
            // InternalAle.g:4460:2: rule__ImpliesOperation__Group__0__Impl rule__ImpliesOperation__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ImpliesOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group__0"


    // $ANTLR start "rule__ImpliesOperation__Group__0__Impl"
    // InternalAle.g:4467:1: rule__ImpliesOperation__Group__0__Impl : ( ruleBooleanOperation ) ;
    public final void rule__ImpliesOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4471:1: ( ( ruleBooleanOperation ) )
            // InternalAle.g:4472:1: ( ruleBooleanOperation )
            {
            // InternalAle.g:4472:1: ( ruleBooleanOperation )
            // InternalAle.g:4473:2: ruleBooleanOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group__1"
    // InternalAle.g:4482:1: rule__ImpliesOperation__Group__1 : rule__ImpliesOperation__Group__1__Impl ;
    public final void rule__ImpliesOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4486:1: ( rule__ImpliesOperation__Group__1__Impl )
            // InternalAle.g:4487:2: rule__ImpliesOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group__1"


    // $ANTLR start "rule__ImpliesOperation__Group__1__Impl"
    // InternalAle.g:4493:1: rule__ImpliesOperation__Group__1__Impl : ( ( rule__ImpliesOperation__Group_1__0 )* ) ;
    public final void rule__ImpliesOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4497:1: ( ( ( rule__ImpliesOperation__Group_1__0 )* ) )
            // InternalAle.g:4498:1: ( ( rule__ImpliesOperation__Group_1__0 )* )
            {
            // InternalAle.g:4498:1: ( ( rule__ImpliesOperation__Group_1__0 )* )
            // InternalAle.g:4499:2: ( rule__ImpliesOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:4500:2: ( rule__ImpliesOperation__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred57_InternalAle()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalAle.g:4500:3: rule__ImpliesOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__ImpliesOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group__1__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1__0"
    // InternalAle.g:4509:1: rule__ImpliesOperation__Group_1__0 : rule__ImpliesOperation__Group_1__0__Impl ;
    public final void rule__ImpliesOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4513:1: ( rule__ImpliesOperation__Group_1__0__Impl )
            // InternalAle.g:4514:2: rule__ImpliesOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1__0"


    // $ANTLR start "rule__ImpliesOperation__Group_1__0__Impl"
    // InternalAle.g:4520:1: rule__ImpliesOperation__Group_1__0__Impl : ( ( rule__ImpliesOperation__Group_1_0__0 ) ) ;
    public final void rule__ImpliesOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4524:1: ( ( ( rule__ImpliesOperation__Group_1_0__0 ) ) )
            // InternalAle.g:4525:1: ( ( rule__ImpliesOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:4525:1: ( ( rule__ImpliesOperation__Group_1_0__0 ) )
            // InternalAle.g:4526:2: ( rule__ImpliesOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:4527:2: ( rule__ImpliesOperation__Group_1_0__0 )
            // InternalAle.g:4527:3: rule__ImpliesOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__0"
    // InternalAle.g:4536:1: rule__ImpliesOperation__Group_1_0__0 : rule__ImpliesOperation__Group_1_0__0__Impl rule__ImpliesOperation__Group_1_0__1 ;
    public final void rule__ImpliesOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4540:1: ( rule__ImpliesOperation__Group_1_0__0__Impl rule__ImpliesOperation__Group_1_0__1 )
            // InternalAle.g:4541:2: rule__ImpliesOperation__Group_1_0__0__Impl rule__ImpliesOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__ImpliesOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__0"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__0__Impl"
    // InternalAle.g:4548:1: rule__ImpliesOperation__Group_1_0__0__Impl : ( ( rule__ImpliesOperation__Group_1_0_0__0 ) ) ;
    public final void rule__ImpliesOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4552:1: ( ( ( rule__ImpliesOperation__Group_1_0_0__0 ) ) )
            // InternalAle.g:4553:1: ( ( rule__ImpliesOperation__Group_1_0_0__0 ) )
            {
            // InternalAle.g:4553:1: ( ( rule__ImpliesOperation__Group_1_0_0__0 ) )
            // InternalAle.g:4554:2: ( rule__ImpliesOperation__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getGroup_1_0_0()); 
            }
            // InternalAle.g:4555:2: ( rule__ImpliesOperation__Group_1_0_0__0 )
            // InternalAle.g:4555:3: rule__ImpliesOperation__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__1"
    // InternalAle.g:4563:1: rule__ImpliesOperation__Group_1_0__1 : rule__ImpliesOperation__Group_1_0__1__Impl ;
    public final void rule__ImpliesOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4567:1: ( rule__ImpliesOperation__Group_1_0__1__Impl )
            // InternalAle.g:4568:2: rule__ImpliesOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__1"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0__1__Impl"
    // InternalAle.g:4574:1: rule__ImpliesOperation__Group_1_0__1__Impl : ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__ImpliesOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4578:1: ( ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:4579:1: ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:4579:1: ( ( rule__ImpliesOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:4580:2: ( rule__ImpliesOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:4581:2: ( rule__ImpliesOperation__RightAssignment_1_0_1 )
            // InternalAle.g:4581:3: rule__ImpliesOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getRightAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__0"
    // InternalAle.g:4590:1: rule__ImpliesOperation__Group_1_0_0__0 : rule__ImpliesOperation__Group_1_0_0__0__Impl rule__ImpliesOperation__Group_1_0_0__1 ;
    public final void rule__ImpliesOperation__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4594:1: ( rule__ImpliesOperation__Group_1_0_0__0__Impl rule__ImpliesOperation__Group_1_0_0__1 )
            // InternalAle.g:4595:2: rule__ImpliesOperation__Group_1_0_0__0__Impl rule__ImpliesOperation__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
            rule__ImpliesOperation__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__0"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__0__Impl"
    // InternalAle.g:4602:1: rule__ImpliesOperation__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ImpliesOperation__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4606:1: ( ( () ) )
            // InternalAle.g:4607:1: ( () )
            {
            // InternalAle.g:4607:1: ( () )
            // InternalAle.g:4608:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0()); 
            }
            // InternalAle.g:4609:2: ()
            // InternalAle.g:4609:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__1"
    // InternalAle.g:4617:1: rule__ImpliesOperation__Group_1_0_0__1 : rule__ImpliesOperation__Group_1_0_0__1__Impl ;
    public final void rule__ImpliesOperation__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4621:1: ( rule__ImpliesOperation__Group_1_0_0__1__Impl )
            // InternalAle.g:4622:2: rule__ImpliesOperation__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesOperation__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__1"


    // $ANTLR start "rule__ImpliesOperation__Group_1_0_0__1__Impl"
    // InternalAle.g:4628:1: rule__ImpliesOperation__Group_1_0_0__1__Impl : ( 'implies' ) ;
    public final void rule__ImpliesOperation__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4632:1: ( ( 'implies' ) )
            // InternalAle.g:4633:1: ( 'implies' )
            {
            // InternalAle.g:4633:1: ( 'implies' )
            // InternalAle.g:4634:2: 'implies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group__0"
    // InternalAle.g:4644:1: rule__BooleanOperation__Group__0 : rule__BooleanOperation__Group__0__Impl rule__BooleanOperation__Group__1 ;
    public final void rule__BooleanOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4648:1: ( rule__BooleanOperation__Group__0__Impl rule__BooleanOperation__Group__1 )
            // InternalAle.g:4649:2: rule__BooleanOperation__Group__0__Impl rule__BooleanOperation__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__BooleanOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group__0"


    // $ANTLR start "rule__BooleanOperation__Group__0__Impl"
    // InternalAle.g:4656:1: rule__BooleanOperation__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BooleanOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4660:1: ( ( ruleCompareOperation ) )
            // InternalAle.g:4661:1: ( ruleCompareOperation )
            {
            // InternalAle.g:4661:1: ( ruleCompareOperation )
            // InternalAle.g:4662:2: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group__1"
    // InternalAle.g:4671:1: rule__BooleanOperation__Group__1 : rule__BooleanOperation__Group__1__Impl ;
    public final void rule__BooleanOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4675:1: ( rule__BooleanOperation__Group__1__Impl )
            // InternalAle.g:4676:2: rule__BooleanOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group__1"


    // $ANTLR start "rule__BooleanOperation__Group__1__Impl"
    // InternalAle.g:4682:1: rule__BooleanOperation__Group__1__Impl : ( ( rule__BooleanOperation__Group_1__0 )* ) ;
    public final void rule__BooleanOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4686:1: ( ( ( rule__BooleanOperation__Group_1__0 )* ) )
            // InternalAle.g:4687:1: ( ( rule__BooleanOperation__Group_1__0 )* )
            {
            // InternalAle.g:4687:1: ( ( rule__BooleanOperation__Group_1__0 )* )
            // InternalAle.g:4688:2: ( rule__BooleanOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:4689:2: ( rule__BooleanOperation__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred58_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred58_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred58_InternalAle()) ) {
                        alt29=1;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalAle.g:4689:3: rule__BooleanOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__BooleanOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1__0"
    // InternalAle.g:4698:1: rule__BooleanOperation__Group_1__0 : rule__BooleanOperation__Group_1__0__Impl ;
    public final void rule__BooleanOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4702:1: ( rule__BooleanOperation__Group_1__0__Impl )
            // InternalAle.g:4703:2: rule__BooleanOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1__0"


    // $ANTLR start "rule__BooleanOperation__Group_1__0__Impl"
    // InternalAle.g:4709:1: rule__BooleanOperation__Group_1__0__Impl : ( ( rule__BooleanOperation__Group_1_0__0 ) ) ;
    public final void rule__BooleanOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4713:1: ( ( ( rule__BooleanOperation__Group_1_0__0 ) ) )
            // InternalAle.g:4714:1: ( ( rule__BooleanOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:4714:1: ( ( rule__BooleanOperation__Group_1_0__0 ) )
            // InternalAle.g:4715:2: ( rule__BooleanOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:4716:2: ( rule__BooleanOperation__Group_1_0__0 )
            // InternalAle.g:4716:3: rule__BooleanOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__0"
    // InternalAle.g:4725:1: rule__BooleanOperation__Group_1_0__0 : rule__BooleanOperation__Group_1_0__0__Impl rule__BooleanOperation__Group_1_0__1 ;
    public final void rule__BooleanOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4729:1: ( rule__BooleanOperation__Group_1_0__0__Impl rule__BooleanOperation__Group_1_0__1 )
            // InternalAle.g:4730:2: rule__BooleanOperation__Group_1_0__0__Impl rule__BooleanOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__BooleanOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__0__Impl"
    // InternalAle.g:4737:1: rule__BooleanOperation__Group_1_0__0__Impl : ( ( rule__BooleanOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__BooleanOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4741:1: ( ( ( rule__BooleanOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:4742:1: ( ( rule__BooleanOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:4742:1: ( ( rule__BooleanOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:4743:2: ( rule__BooleanOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:4744:2: ( rule__BooleanOperation__Alternatives_1_0_0 )
            // InternalAle.g:4744:3: rule__BooleanOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__1"
    // InternalAle.g:4752:1: rule__BooleanOperation__Group_1_0__1 : rule__BooleanOperation__Group_1_0__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4756:1: ( rule__BooleanOperation__Group_1_0__1__Impl )
            // InternalAle.g:4757:2: rule__BooleanOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0__1__Impl"
    // InternalAle.g:4763:1: rule__BooleanOperation__Group_1_0__1__Impl : ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__BooleanOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4767:1: ( ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:4768:1: ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:4768:1: ( ( rule__BooleanOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:4769:2: ( rule__BooleanOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:4770:2: ( rule__BooleanOperation__RightAssignment_1_0_1 )
            // InternalAle.g:4770:3: rule__BooleanOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getRightAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__0"
    // InternalAle.g:4779:1: rule__BooleanOperation__Group_1_0_0_0__0 : rule__BooleanOperation__Group_1_0_0_0__0__Impl rule__BooleanOperation__Group_1_0_0_0__1 ;
    public final void rule__BooleanOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4783:1: ( rule__BooleanOperation__Group_1_0_0_0__0__Impl rule__BooleanOperation__Group_1_0_0_0__1 )
            // InternalAle.g:4784:2: rule__BooleanOperation__Group_1_0_0_0__0__Impl rule__BooleanOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_43);
            rule__BooleanOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:4791:1: rule__BooleanOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__BooleanOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4795:1: ( ( () ) )
            // InternalAle.g:4796:1: ( () )
            {
            // InternalAle.g:4796:1: ( () )
            // InternalAle.g:4797:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:4798:2: ()
            // InternalAle.g:4798:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__1"
    // InternalAle.g:4806:1: rule__BooleanOperation__Group_1_0_0_0__1 : rule__BooleanOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4810:1: ( rule__BooleanOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:4811:2: rule__BooleanOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:4817:1: rule__BooleanOperation__Group_1_0_0_0__1__Impl : ( 'or' ) ;
    public final void rule__BooleanOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4821:1: ( ( 'or' ) )
            // InternalAle.g:4822:1: ( 'or' )
            {
            // InternalAle.g:4822:1: ( 'or' )
            // InternalAle.g:4823:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__0"
    // InternalAle.g:4833:1: rule__BooleanOperation__Group_1_0_0_1__0 : rule__BooleanOperation__Group_1_0_0_1__0__Impl rule__BooleanOperation__Group_1_0_0_1__1 ;
    public final void rule__BooleanOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4837:1: ( rule__BooleanOperation__Group_1_0_0_1__0__Impl rule__BooleanOperation__Group_1_0_0_1__1 )
            // InternalAle.g:4838:2: rule__BooleanOperation__Group_1_0_0_1__0__Impl rule__BooleanOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_44);
            rule__BooleanOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:4845:1: rule__BooleanOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__BooleanOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4849:1: ( ( () ) )
            // InternalAle.g:4850:1: ( () )
            {
            // InternalAle.g:4850:1: ( () )
            // InternalAle.g:4851:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:4852:2: ()
            // InternalAle.g:4852:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__1"
    // InternalAle.g:4860:1: rule__BooleanOperation__Group_1_0_0_1__1 : rule__BooleanOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4864:1: ( rule__BooleanOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:4865:2: rule__BooleanOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:4871:1: rule__BooleanOperation__Group_1_0_0_1__1__Impl : ( 'and' ) ;
    public final void rule__BooleanOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4875:1: ( ( 'and' ) )
            // InternalAle.g:4876:1: ( 'and' )
            {
            // InternalAle.g:4876:1: ( 'and' )
            // InternalAle.g:4877:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__0"
    // InternalAle.g:4887:1: rule__BooleanOperation__Group_1_0_0_2__0 : rule__BooleanOperation__Group_1_0_0_2__0__Impl rule__BooleanOperation__Group_1_0_0_2__1 ;
    public final void rule__BooleanOperation__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4891:1: ( rule__BooleanOperation__Group_1_0_0_2__0__Impl rule__BooleanOperation__Group_1_0_0_2__1 )
            // InternalAle.g:4892:2: rule__BooleanOperation__Group_1_0_0_2__0__Impl rule__BooleanOperation__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_41);
            rule__BooleanOperation__Group_1_0_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__0"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__0__Impl"
    // InternalAle.g:4899:1: rule__BooleanOperation__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__BooleanOperation__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4903:1: ( ( () ) )
            // InternalAle.g:4904:1: ( () )
            {
            // InternalAle.g:4904:1: ( () )
            // InternalAle.g:4905:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0()); 
            }
            // InternalAle.g:4906:2: ()
            // InternalAle.g:4906:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__0__Impl"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__1"
    // InternalAle.g:4914:1: rule__BooleanOperation__Group_1_0_0_2__1 : rule__BooleanOperation__Group_1_0_0_2__1__Impl ;
    public final void rule__BooleanOperation__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4918:1: ( rule__BooleanOperation__Group_1_0_0_2__1__Impl )
            // InternalAle.g:4919:2: rule__BooleanOperation__Group_1_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperation__Group_1_0_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__1"


    // $ANTLR start "rule__BooleanOperation__Group_1_0_0_2__1__Impl"
    // InternalAle.g:4925:1: rule__BooleanOperation__Group_1_0_0_2__1__Impl : ( 'xor' ) ;
    public final void rule__BooleanOperation__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4929:1: ( ( 'xor' ) )
            // InternalAle.g:4930:1: ( 'xor' )
            {
            // InternalAle.g:4930:1: ( 'xor' )
            // InternalAle.g:4931:2: 'xor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__Group_1_0_0_2__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group__0"
    // InternalAle.g:4941:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4945:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalAle.g:4946:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__CompareOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__0"


    // $ANTLR start "rule__CompareOperation__Group__0__Impl"
    // InternalAle.g:4953:1: rule__CompareOperation__Group__0__Impl : ( ruleEqualityOperation ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4957:1: ( ( ruleEqualityOperation ) )
            // InternalAle.g:4958:1: ( ruleEqualityOperation )
            {
            // InternalAle.g:4958:1: ( ruleEqualityOperation )
            // InternalAle.g:4959:2: ruleEqualityOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group__1"
    // InternalAle.g:4968:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4972:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalAle.g:4973:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__1"


    // $ANTLR start "rule__CompareOperation__Group__1__Impl"
    // InternalAle.g:4979:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )* ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4983:1: ( ( ( rule__CompareOperation__Group_1__0 )* ) )
            // InternalAle.g:4984:1: ( ( rule__CompareOperation__Group_1__0 )* )
            {
            // InternalAle.g:4984:1: ( ( rule__CompareOperation__Group_1__0 )* )
            // InternalAle.g:4985:2: ( rule__CompareOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:4986:2: ( rule__CompareOperation__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred59_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred59_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred59_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred59_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA30_6 = input.LA(2);

                    if ( (synpred59_InternalAle()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:4986:3: rule__CompareOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__CompareOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1__0"
    // InternalAle.g:4995:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:4999:1: ( rule__CompareOperation__Group_1__0__Impl )
            // InternalAle.g:5000:2: rule__CompareOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1__0"


    // $ANTLR start "rule__CompareOperation__Group_1__0__Impl"
    // InternalAle.g:5006:1: rule__CompareOperation__Group_1__0__Impl : ( ( rule__CompareOperation__Group_1_0__0 ) ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5010:1: ( ( ( rule__CompareOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5011:1: ( ( rule__CompareOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5011:1: ( ( rule__CompareOperation__Group_1_0__0 ) )
            // InternalAle.g:5012:2: ( rule__CompareOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5013:2: ( rule__CompareOperation__Group_1_0__0 )
            // InternalAle.g:5013:3: rule__CompareOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0__0"
    // InternalAle.g:5022:1: rule__CompareOperation__Group_1_0__0 : rule__CompareOperation__Group_1_0__0__Impl rule__CompareOperation__Group_1_0__1 ;
    public final void rule__CompareOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5026:1: ( rule__CompareOperation__Group_1_0__0__Impl rule__CompareOperation__Group_1_0__1 )
            // InternalAle.g:5027:2: rule__CompareOperation__Group_1_0__0__Impl rule__CompareOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__CompareOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0__0__Impl"
    // InternalAle.g:5034:1: rule__CompareOperation__Group_1_0__0__Impl : ( ( rule__CompareOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__CompareOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5038:1: ( ( ( rule__CompareOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:5039:1: ( ( rule__CompareOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:5039:1: ( ( rule__CompareOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:5040:2: ( rule__CompareOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:5041:2: ( rule__CompareOperation__Alternatives_1_0_0 )
            // InternalAle.g:5041:3: rule__CompareOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0__1"
    // InternalAle.g:5049:1: rule__CompareOperation__Group_1_0__1 : rule__CompareOperation__Group_1_0__1__Impl ;
    public final void rule__CompareOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5053:1: ( rule__CompareOperation__Group_1_0__1__Impl )
            // InternalAle.g:5054:2: rule__CompareOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0__1__Impl"
    // InternalAle.g:5060:1: rule__CompareOperation__Group_1_0__1__Impl : ( ( rule__CompareOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__CompareOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5064:1: ( ( ( rule__CompareOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:5065:1: ( ( rule__CompareOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:5065:1: ( ( rule__CompareOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:5066:2: ( rule__CompareOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:5067:2: ( rule__CompareOperation__RightAssignment_1_0_1 )
            // InternalAle.g:5067:3: rule__CompareOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getRightAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__0"
    // InternalAle.g:5076:1: rule__CompareOperation__Group_1_0_0_0__0 : rule__CompareOperation__Group_1_0_0_0__0__Impl rule__CompareOperation__Group_1_0_0_0__1 ;
    public final void rule__CompareOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5080:1: ( rule__CompareOperation__Group_1_0_0_0__0__Impl rule__CompareOperation__Group_1_0_0_0__1 )
            // InternalAle.g:5081:2: rule__CompareOperation__Group_1_0_0_0__0__Impl rule__CompareOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_47);
            rule__CompareOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:5088:1: rule__CompareOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5092:1: ( ( () ) )
            // InternalAle.g:5093:1: ( () )
            {
            // InternalAle.g:5093:1: ( () )
            // InternalAle.g:5094:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:5095:2: ()
            // InternalAle.g:5095:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__1"
    // InternalAle.g:5103:1: rule__CompareOperation__Group_1_0_0_0__1 : rule__CompareOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5107:1: ( rule__CompareOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:5108:2: rule__CompareOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:5114:1: rule__CompareOperation__Group_1_0_0_0__1__Impl : ( '<=' ) ;
    public final void rule__CompareOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5118:1: ( ( '<=' ) )
            // InternalAle.g:5119:1: ( '<=' )
            {
            // InternalAle.g:5119:1: ( '<=' )
            // InternalAle.g:5120:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__0"
    // InternalAle.g:5130:1: rule__CompareOperation__Group_1_0_0_1__0 : rule__CompareOperation__Group_1_0_0_1__0__Impl rule__CompareOperation__Group_1_0_0_1__1 ;
    public final void rule__CompareOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5134:1: ( rule__CompareOperation__Group_1_0_0_1__0__Impl rule__CompareOperation__Group_1_0_0_1__1 )
            // InternalAle.g:5135:2: rule__CompareOperation__Group_1_0_0_1__0__Impl rule__CompareOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_48);
            rule__CompareOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:5142:1: rule__CompareOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5146:1: ( ( () ) )
            // InternalAle.g:5147:1: ( () )
            {
            // InternalAle.g:5147:1: ( () )
            // InternalAle.g:5148:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:5149:2: ()
            // InternalAle.g:5149:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__1"
    // InternalAle.g:5157:1: rule__CompareOperation__Group_1_0_0_1__1 : rule__CompareOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5161:1: ( rule__CompareOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:5162:2: rule__CompareOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:5168:1: rule__CompareOperation__Group_1_0_0_1__1__Impl : ( '>=' ) ;
    public final void rule__CompareOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5172:1: ( ( '>=' ) )
            // InternalAle.g:5173:1: ( '>=' )
            {
            // InternalAle.g:5173:1: ( '>=' )
            // InternalAle.g:5174:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__0"
    // InternalAle.g:5184:1: rule__CompareOperation__Group_1_0_0_2__0 : rule__CompareOperation__Group_1_0_0_2__0__Impl rule__CompareOperation__Group_1_0_0_2__1 ;
    public final void rule__CompareOperation__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5188:1: ( rule__CompareOperation__Group_1_0_0_2__0__Impl rule__CompareOperation__Group_1_0_0_2__1 )
            // InternalAle.g:5189:2: rule__CompareOperation__Group_1_0_0_2__0__Impl rule__CompareOperation__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_49);
            rule__CompareOperation__Group_1_0_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__0__Impl"
    // InternalAle.g:5196:1: rule__CompareOperation__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5200:1: ( ( () ) )
            // InternalAle.g:5201:1: ( () )
            {
            // InternalAle.g:5201:1: ( () )
            // InternalAle.g:5202:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0()); 
            }
            // InternalAle.g:5203:2: ()
            // InternalAle.g:5203:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__1"
    // InternalAle.g:5211:1: rule__CompareOperation__Group_1_0_0_2__1 : rule__CompareOperation__Group_1_0_0_2__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5215:1: ( rule__CompareOperation__Group_1_0_0_2__1__Impl )
            // InternalAle.g:5216:2: rule__CompareOperation__Group_1_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_2__1__Impl"
    // InternalAle.g:5222:1: rule__CompareOperation__Group_1_0_0_2__1__Impl : ( '!=' ) ;
    public final void rule__CompareOperation__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5226:1: ( ( '!=' ) )
            // InternalAle.g:5227:1: ( '!=' )
            {
            // InternalAle.g:5227:1: ( '!=' )
            // InternalAle.g:5228:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_2__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__0"
    // InternalAle.g:5238:1: rule__CompareOperation__Group_1_0_0_3__0 : rule__CompareOperation__Group_1_0_0_3__0__Impl rule__CompareOperation__Group_1_0_0_3__1 ;
    public final void rule__CompareOperation__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5242:1: ( rule__CompareOperation__Group_1_0_0_3__0__Impl rule__CompareOperation__Group_1_0_0_3__1 )
            // InternalAle.g:5243:2: rule__CompareOperation__Group_1_0_0_3__0__Impl rule__CompareOperation__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_50);
            rule__CompareOperation__Group_1_0_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__0__Impl"
    // InternalAle.g:5250:1: rule__CompareOperation__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5254:1: ( ( () ) )
            // InternalAle.g:5255:1: ( () )
            {
            // InternalAle.g:5255:1: ( () )
            // InternalAle.g:5256:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0()); 
            }
            // InternalAle.g:5257:2: ()
            // InternalAle.g:5257:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__1"
    // InternalAle.g:5265:1: rule__CompareOperation__Group_1_0_0_3__1 : rule__CompareOperation__Group_1_0_0_3__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5269:1: ( rule__CompareOperation__Group_1_0_0_3__1__Impl )
            // InternalAle.g:5270:2: rule__CompareOperation__Group_1_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_3__1__Impl"
    // InternalAle.g:5276:1: rule__CompareOperation__Group_1_0_0_3__1__Impl : ( '<' ) ;
    public final void rule__CompareOperation__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5280:1: ( ( '<' ) )
            // InternalAle.g:5281:1: ( '<' )
            {
            // InternalAle.g:5281:1: ( '<' )
            // InternalAle.g:5282:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_3__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__0"
    // InternalAle.g:5292:1: rule__CompareOperation__Group_1_0_0_4__0 : rule__CompareOperation__Group_1_0_0_4__0__Impl rule__CompareOperation__Group_1_0_0_4__1 ;
    public final void rule__CompareOperation__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5296:1: ( rule__CompareOperation__Group_1_0_0_4__0__Impl rule__CompareOperation__Group_1_0_0_4__1 )
            // InternalAle.g:5297:2: rule__CompareOperation__Group_1_0_0_4__0__Impl rule__CompareOperation__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_45);
            rule__CompareOperation__Group_1_0_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__0"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__0__Impl"
    // InternalAle.g:5304:1: rule__CompareOperation__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5308:1: ( ( () ) )
            // InternalAle.g:5309:1: ( () )
            {
            // InternalAle.g:5309:1: ( () )
            // InternalAle.g:5310:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0()); 
            }
            // InternalAle.g:5311:2: ()
            // InternalAle.g:5311:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__1"
    // InternalAle.g:5319:1: rule__CompareOperation__Group_1_0_0_4__1 : rule__CompareOperation__Group_1_0_0_4__1__Impl ;
    public final void rule__CompareOperation__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5323:1: ( rule__CompareOperation__Group_1_0_0_4__1__Impl )
            // InternalAle.g:5324:2: rule__CompareOperation__Group_1_0_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperation__Group_1_0_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__1"


    // $ANTLR start "rule__CompareOperation__Group_1_0_0_4__1__Impl"
    // InternalAle.g:5330:1: rule__CompareOperation__Group_1_0_0_4__1__Impl : ( '>' ) ;
    public final void rule__CompareOperation__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5334:1: ( ( '>' ) )
            // InternalAle.g:5335:1: ( '>' )
            {
            // InternalAle.g:5335:1: ( '>' )
            // InternalAle.g:5336:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1_0_0_4__1__Impl"


    // $ANTLR start "rule__EqualityOperation__Group__0"
    // InternalAle.g:5346:1: rule__EqualityOperation__Group__0 : rule__EqualityOperation__Group__0__Impl rule__EqualityOperation__Group__1 ;
    public final void rule__EqualityOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5350:1: ( rule__EqualityOperation__Group__0__Impl rule__EqualityOperation__Group__1 )
            // InternalAle.g:5351:2: rule__EqualityOperation__Group__0__Impl rule__EqualityOperation__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__EqualityOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group__0"


    // $ANTLR start "rule__EqualityOperation__Group__0__Impl"
    // InternalAle.g:5358:1: rule__EqualityOperation__Group__0__Impl : ( ruleMultOperation ) ;
    public final void rule__EqualityOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5362:1: ( ( ruleMultOperation ) )
            // InternalAle.g:5363:1: ( ruleMultOperation )
            {
            // InternalAle.g:5363:1: ( ruleMultOperation )
            // InternalAle.g:5364:2: ruleMultOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group__0__Impl"


    // $ANTLR start "rule__EqualityOperation__Group__1"
    // InternalAle.g:5373:1: rule__EqualityOperation__Group__1 : rule__EqualityOperation__Group__1__Impl ;
    public final void rule__EqualityOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5377:1: ( rule__EqualityOperation__Group__1__Impl )
            // InternalAle.g:5378:2: rule__EqualityOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group__1"


    // $ANTLR start "rule__EqualityOperation__Group__1__Impl"
    // InternalAle.g:5384:1: rule__EqualityOperation__Group__1__Impl : ( ( rule__EqualityOperation__Group_1__0 )* ) ;
    public final void rule__EqualityOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5388:1: ( ( ( rule__EqualityOperation__Group_1__0 )* ) )
            // InternalAle.g:5389:1: ( ( rule__EqualityOperation__Group_1__0 )* )
            {
            // InternalAle.g:5389:1: ( ( rule__EqualityOperation__Group_1__0 )* )
            // InternalAle.g:5390:2: ( rule__EqualityOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5391:2: ( rule__EqualityOperation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==69) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred60_InternalAle()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalAle.g:5391:3: rule__EqualityOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__EqualityOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group__1__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1__0"
    // InternalAle.g:5400:1: rule__EqualityOperation__Group_1__0 : rule__EqualityOperation__Group_1__0__Impl ;
    public final void rule__EqualityOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5404:1: ( rule__EqualityOperation__Group_1__0__Impl )
            // InternalAle.g:5405:2: rule__EqualityOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1__0"


    // $ANTLR start "rule__EqualityOperation__Group_1__0__Impl"
    // InternalAle.g:5411:1: rule__EqualityOperation__Group_1__0__Impl : ( ( rule__EqualityOperation__Group_1_0__0 ) ) ;
    public final void rule__EqualityOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5415:1: ( ( ( rule__EqualityOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5416:1: ( ( rule__EqualityOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5416:1: ( ( rule__EqualityOperation__Group_1_0__0 ) )
            // InternalAle.g:5417:2: ( rule__EqualityOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5418:2: ( rule__EqualityOperation__Group_1_0__0 )
            // InternalAle.g:5418:3: rule__EqualityOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__0"
    // InternalAle.g:5427:1: rule__EqualityOperation__Group_1_0__0 : rule__EqualityOperation__Group_1_0__0__Impl rule__EqualityOperation__Group_1_0__1 ;
    public final void rule__EqualityOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5431:1: ( rule__EqualityOperation__Group_1_0__0__Impl rule__EqualityOperation__Group_1_0__1 )
            // InternalAle.g:5432:2: rule__EqualityOperation__Group_1_0__0__Impl rule__EqualityOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_51);
            rule__EqualityOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__0"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__0__Impl"
    // InternalAle.g:5439:1: rule__EqualityOperation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__EqualityOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5443:1: ( ( () ) )
            // InternalAle.g:5444:1: ( () )
            {
            // InternalAle.g:5444:1: ( () )
            // InternalAle.g:5445:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0()); 
            }
            // InternalAle.g:5446:2: ()
            // InternalAle.g:5446:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__1"
    // InternalAle.g:5454:1: rule__EqualityOperation__Group_1_0__1 : rule__EqualityOperation__Group_1_0__1__Impl rule__EqualityOperation__Group_1_0__2 ;
    public final void rule__EqualityOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5458:1: ( rule__EqualityOperation__Group_1_0__1__Impl rule__EqualityOperation__Group_1_0__2 )
            // InternalAle.g:5459:2: rule__EqualityOperation__Group_1_0__1__Impl rule__EqualityOperation__Group_1_0__2
            {
            pushFollow(FOLLOW_25);
            rule__EqualityOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__1"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__1__Impl"
    // InternalAle.g:5466:1: rule__EqualityOperation__Group_1_0__1__Impl : ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) ) ;
    public final void rule__EqualityOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5470:1: ( ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) ) )
            // InternalAle.g:5471:1: ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) )
            {
            // InternalAle.g:5471:1: ( ( rule__EqualityOperation__OpAssignment_1_0_1 ) )
            // InternalAle.g:5472:2: ( rule__EqualityOperation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAle.g:5473:2: ( rule__EqualityOperation__OpAssignment_1_0_1 )
            // InternalAle.g:5473:3: rule__EqualityOperation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__2"
    // InternalAle.g:5481:1: rule__EqualityOperation__Group_1_0__2 : rule__EqualityOperation__Group_1_0__2__Impl ;
    public final void rule__EqualityOperation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5485:1: ( rule__EqualityOperation__Group_1_0__2__Impl )
            // InternalAle.g:5486:2: rule__EqualityOperation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__2"


    // $ANTLR start "rule__EqualityOperation__Group_1_0__2__Impl"
    // InternalAle.g:5492:1: rule__EqualityOperation__Group_1_0__2__Impl : ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) ) ;
    public final void rule__EqualityOperation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5496:1: ( ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) ) )
            // InternalAle.g:5497:1: ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) )
            {
            // InternalAle.g:5497:1: ( ( rule__EqualityOperation__RightAssignment_1_0_2 ) )
            // InternalAle.g:5498:2: ( rule__EqualityOperation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAle.g:5499:2: ( rule__EqualityOperation__RightAssignment_1_0_2 )
            // InternalAle.g:5499:3: rule__EqualityOperation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperation__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultOperation__Group__0"
    // InternalAle.g:5508:1: rule__MultOperation__Group__0 : rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5512:1: ( rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 )
            // InternalAle.g:5513:2: rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__MultOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group__0"


    // $ANTLR start "rule__MultOperation__Group__0__Impl"
    // InternalAle.g:5520:1: rule__MultOperation__Group__0__Impl : ( ruleAddOperation ) ;
    public final void rule__MultOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5524:1: ( ( ruleAddOperation ) )
            // InternalAle.g:5525:1: ( ruleAddOperation )
            {
            // InternalAle.g:5525:1: ( ruleAddOperation )
            // InternalAle.g:5526:2: ruleAddOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group__0__Impl"


    // $ANTLR start "rule__MultOperation__Group__1"
    // InternalAle.g:5535:1: rule__MultOperation__Group__1 : rule__MultOperation__Group__1__Impl ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5539:1: ( rule__MultOperation__Group__1__Impl )
            // InternalAle.g:5540:2: rule__MultOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group__1"


    // $ANTLR start "rule__MultOperation__Group__1__Impl"
    // InternalAle.g:5546:1: rule__MultOperation__Group__1__Impl : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5550:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // InternalAle.g:5551:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // InternalAle.g:5551:1: ( ( rule__MultOperation__Group_1__0 )* )
            // InternalAle.g:5552:2: ( rule__MultOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5553:2: ( rule__MultOperation__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==52) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred61_InternalAle()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==53) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred61_InternalAle()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalAle.g:5553:3: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__MultOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group__1__Impl"


    // $ANTLR start "rule__MultOperation__Group_1__0"
    // InternalAle.g:5562:1: rule__MultOperation__Group_1__0 : rule__MultOperation__Group_1__0__Impl ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5566:1: ( rule__MultOperation__Group_1__0__Impl )
            // InternalAle.g:5567:2: rule__MultOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1__0"


    // $ANTLR start "rule__MultOperation__Group_1__0__Impl"
    // InternalAle.g:5573:1: rule__MultOperation__Group_1__0__Impl : ( ( rule__MultOperation__Group_1_0__0 ) ) ;
    public final void rule__MultOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5577:1: ( ( ( rule__MultOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5578:1: ( ( rule__MultOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5578:1: ( ( rule__MultOperation__Group_1_0__0 ) )
            // InternalAle.g:5579:2: ( rule__MultOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5580:2: ( rule__MultOperation__Group_1_0__0 )
            // InternalAle.g:5580:3: rule__MultOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0__0"
    // InternalAle.g:5589:1: rule__MultOperation__Group_1_0__0 : rule__MultOperation__Group_1_0__0__Impl rule__MultOperation__Group_1_0__1 ;
    public final void rule__MultOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5593:1: ( rule__MultOperation__Group_1_0__0__Impl rule__MultOperation__Group_1_0__1 )
            // InternalAle.g:5594:2: rule__MultOperation__Group_1_0__0__Impl rule__MultOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__MultOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0__0"


    // $ANTLR start "rule__MultOperation__Group_1_0__0__Impl"
    // InternalAle.g:5601:1: rule__MultOperation__Group_1_0__0__Impl : ( ( rule__MultOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__MultOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5605:1: ( ( ( rule__MultOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:5606:1: ( ( rule__MultOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:5606:1: ( ( rule__MultOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:5607:2: ( rule__MultOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:5608:2: ( rule__MultOperation__Alternatives_1_0_0 )
            // InternalAle.g:5608:3: rule__MultOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0__1"
    // InternalAle.g:5616:1: rule__MultOperation__Group_1_0__1 : rule__MultOperation__Group_1_0__1__Impl ;
    public final void rule__MultOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5620:1: ( rule__MultOperation__Group_1_0__1__Impl )
            // InternalAle.g:5621:2: rule__MultOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0__1"


    // $ANTLR start "rule__MultOperation__Group_1_0__1__Impl"
    // InternalAle.g:5627:1: rule__MultOperation__Group_1_0__1__Impl : ( ( rule__MultOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__MultOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5631:1: ( ( ( rule__MultOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:5632:1: ( ( rule__MultOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:5632:1: ( ( rule__MultOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:5633:2: ( rule__MultOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:5634:2: ( rule__MultOperation__RightAssignment_1_0_1 )
            // InternalAle.g:5634:3: rule__MultOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getRightAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__0"
    // InternalAle.g:5643:1: rule__MultOperation__Group_1_0_0_0__0 : rule__MultOperation__Group_1_0_0_0__0__Impl rule__MultOperation__Group_1_0_0_0__1 ;
    public final void rule__MultOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5647:1: ( rule__MultOperation__Group_1_0_0_0__0__Impl rule__MultOperation__Group_1_0_0_0__1 )
            // InternalAle.g:5648:2: rule__MultOperation__Group_1_0_0_0__0__Impl rule__MultOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_55);
            rule__MultOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:5655:1: rule__MultOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5659:1: ( ( () ) )
            // InternalAle.g:5660:1: ( () )
            {
            // InternalAle.g:5660:1: ( () )
            // InternalAle.g:5661:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:5662:2: ()
            // InternalAle.g:5662:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__1"
    // InternalAle.g:5670:1: rule__MultOperation__Group_1_0_0_0__1 : rule__MultOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__MultOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5674:1: ( rule__MultOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:5675:2: rule__MultOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:5681:1: rule__MultOperation__Group_1_0_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5685:1: ( ( '*' ) )
            // InternalAle.g:5686:1: ( '*' )
            {
            // InternalAle.g:5686:1: ( '*' )
            // InternalAle.g:5687:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__0"
    // InternalAle.g:5697:1: rule__MultOperation__Group_1_0_0_1__0 : rule__MultOperation__Group_1_0_0_1__0__Impl rule__MultOperation__Group_1_0_0_1__1 ;
    public final void rule__MultOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5701:1: ( rule__MultOperation__Group_1_0_0_1__0__Impl rule__MultOperation__Group_1_0_0_1__1 )
            // InternalAle.g:5702:2: rule__MultOperation__Group_1_0_0_1__0__Impl rule__MultOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_53);
            rule__MultOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:5709:1: rule__MultOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5713:1: ( ( () ) )
            // InternalAle.g:5714:1: ( () )
            {
            // InternalAle.g:5714:1: ( () )
            // InternalAle.g:5715:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:5716:2: ()
            // InternalAle.g:5716:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__1"
    // InternalAle.g:5724:1: rule__MultOperation__Group_1_0_0_1__1 : rule__MultOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__MultOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5728:1: ( rule__MultOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:5729:2: rule__MultOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOperation__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__MultOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:5735:1: rule__MultOperation__Group_1_0_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5739:1: ( ( '/' ) )
            // InternalAle.g:5740:1: ( '/' )
            {
            // InternalAle.g:5740:1: ( '/' )
            // InternalAle.g:5741:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__AddOperation__Group__0"
    // InternalAle.g:5751:1: rule__AddOperation__Group__0 : rule__AddOperation__Group__0__Impl rule__AddOperation__Group__1 ;
    public final void rule__AddOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5755:1: ( rule__AddOperation__Group__0__Impl rule__AddOperation__Group__1 )
            // InternalAle.g:5756:2: rule__AddOperation__Group__0__Impl rule__AddOperation__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__AddOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group__0"


    // $ANTLR start "rule__AddOperation__Group__0__Impl"
    // InternalAle.g:5763:1: rule__AddOperation__Group__0__Impl : ( ruleChaindedCall ) ;
    public final void rule__AddOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5767:1: ( ( ruleChaindedCall ) )
            // InternalAle.g:5768:1: ( ruleChaindedCall )
            {
            // InternalAle.g:5768:1: ( ruleChaindedCall )
            // InternalAle.g:5769:2: ruleChaindedCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getChaindedCallParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChaindedCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getChaindedCallParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group__0__Impl"


    // $ANTLR start "rule__AddOperation__Group__1"
    // InternalAle.g:5778:1: rule__AddOperation__Group__1 : rule__AddOperation__Group__1__Impl ;
    public final void rule__AddOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5782:1: ( rule__AddOperation__Group__1__Impl )
            // InternalAle.g:5783:2: rule__AddOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group__1"


    // $ANTLR start "rule__AddOperation__Group__1__Impl"
    // InternalAle.g:5789:1: rule__AddOperation__Group__1__Impl : ( ( rule__AddOperation__Group_1__0 )* ) ;
    public final void rule__AddOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5793:1: ( ( ( rule__AddOperation__Group_1__0 )* ) )
            // InternalAle.g:5794:1: ( ( rule__AddOperation__Group_1__0 )* )
            {
            // InternalAle.g:5794:1: ( ( rule__AddOperation__Group_1__0 )* )
            // InternalAle.g:5795:2: ( rule__AddOperation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getGroup_1()); 
            }
            // InternalAle.g:5796:2: ( rule__AddOperation__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==54) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred62_InternalAle()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==55) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred62_InternalAle()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalAle.g:5796:3: rule__AddOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__AddOperation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group__1__Impl"


    // $ANTLR start "rule__AddOperation__Group_1__0"
    // InternalAle.g:5805:1: rule__AddOperation__Group_1__0 : rule__AddOperation__Group_1__0__Impl ;
    public final void rule__AddOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5809:1: ( rule__AddOperation__Group_1__0__Impl )
            // InternalAle.g:5810:2: rule__AddOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1__0"


    // $ANTLR start "rule__AddOperation__Group_1__0__Impl"
    // InternalAle.g:5816:1: rule__AddOperation__Group_1__0__Impl : ( ( rule__AddOperation__Group_1_0__0 ) ) ;
    public final void rule__AddOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5820:1: ( ( ( rule__AddOperation__Group_1_0__0 ) ) )
            // InternalAle.g:5821:1: ( ( rule__AddOperation__Group_1_0__0 ) )
            {
            // InternalAle.g:5821:1: ( ( rule__AddOperation__Group_1_0__0 ) )
            // InternalAle.g:5822:2: ( rule__AddOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getGroup_1_0()); 
            }
            // InternalAle.g:5823:2: ( rule__AddOperation__Group_1_0__0 )
            // InternalAle.g:5823:3: rule__AddOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0__0"
    // InternalAle.g:5832:1: rule__AddOperation__Group_1_0__0 : rule__AddOperation__Group_1_0__0__Impl rule__AddOperation__Group_1_0__1 ;
    public final void rule__AddOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5836:1: ( rule__AddOperation__Group_1_0__0__Impl rule__AddOperation__Group_1_0__1 )
            // InternalAle.g:5837:2: rule__AddOperation__Group_1_0__0__Impl rule__AddOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__AddOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0__0"


    // $ANTLR start "rule__AddOperation__Group_1_0__0__Impl"
    // InternalAle.g:5844:1: rule__AddOperation__Group_1_0__0__Impl : ( ( rule__AddOperation__Alternatives_1_0_0 ) ) ;
    public final void rule__AddOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5848:1: ( ( ( rule__AddOperation__Alternatives_1_0_0 ) ) )
            // InternalAle.g:5849:1: ( ( rule__AddOperation__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:5849:1: ( ( rule__AddOperation__Alternatives_1_0_0 ) )
            // InternalAle.g:5850:2: ( rule__AddOperation__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:5851:2: ( rule__AddOperation__Alternatives_1_0_0 )
            // InternalAle.g:5851:3: rule__AddOperation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0__1"
    // InternalAle.g:5859:1: rule__AddOperation__Group_1_0__1 : rule__AddOperation__Group_1_0__1__Impl ;
    public final void rule__AddOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5863:1: ( rule__AddOperation__Group_1_0__1__Impl )
            // InternalAle.g:5864:2: rule__AddOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0__1"


    // $ANTLR start "rule__AddOperation__Group_1_0__1__Impl"
    // InternalAle.g:5870:1: rule__AddOperation__Group_1_0__1__Impl : ( ( rule__AddOperation__RightAssignment_1_0_1 ) ) ;
    public final void rule__AddOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5874:1: ( ( ( rule__AddOperation__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:5875:1: ( ( rule__AddOperation__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:5875:1: ( ( rule__AddOperation__RightAssignment_1_0_1 ) )
            // InternalAle.g:5876:2: ( rule__AddOperation__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:5877:2: ( rule__AddOperation__RightAssignment_1_0_1 )
            // InternalAle.g:5877:3: rule__AddOperation__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getRightAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__0"
    // InternalAle.g:5886:1: rule__AddOperation__Group_1_0_0_0__0 : rule__AddOperation__Group_1_0_0_0__0__Impl rule__AddOperation__Group_1_0_0_0__1 ;
    public final void rule__AddOperation__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5890:1: ( rule__AddOperation__Group_1_0_0_0__0__Impl rule__AddOperation__Group_1_0_0_0__1 )
            // InternalAle.g:5891:2: rule__AddOperation__Group_1_0_0_0__0__Impl rule__AddOperation__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_58);
            rule__AddOperation__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__0"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__0__Impl"
    // InternalAle.g:5898:1: rule__AddOperation__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__AddOperation__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5902:1: ( ( () ) )
            // InternalAle.g:5903:1: ( () )
            {
            // InternalAle.g:5903:1: ( () )
            // InternalAle.g:5904:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:5905:2: ()
            // InternalAle.g:5905:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__1"
    // InternalAle.g:5913:1: rule__AddOperation__Group_1_0_0_0__1 : rule__AddOperation__Group_1_0_0_0__1__Impl ;
    public final void rule__AddOperation__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5917:1: ( rule__AddOperation__Group_1_0_0_0__1__Impl )
            // InternalAle.g:5918:2: rule__AddOperation__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__1"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_0__1__Impl"
    // InternalAle.g:5924:1: rule__AddOperation__Group_1_0_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddOperation__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5928:1: ( ( '+' ) )
            // InternalAle.g:5929:1: ( '+' )
            {
            // InternalAle.g:5929:1: ( '+' )
            // InternalAle.g:5930:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__0"
    // InternalAle.g:5940:1: rule__AddOperation__Group_1_0_0_1__0 : rule__AddOperation__Group_1_0_0_1__0__Impl rule__AddOperation__Group_1_0_0_1__1 ;
    public final void rule__AddOperation__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5944:1: ( rule__AddOperation__Group_1_0_0_1__0__Impl rule__AddOperation__Group_1_0_0_1__1 )
            // InternalAle.g:5945:2: rule__AddOperation__Group_1_0_0_1__0__Impl rule__AddOperation__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_56);
            rule__AddOperation__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__0"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__0__Impl"
    // InternalAle.g:5952:1: rule__AddOperation__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__AddOperation__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5956:1: ( ( () ) )
            // InternalAle.g:5957:1: ( () )
            {
            // InternalAle.g:5957:1: ( () )
            // InternalAle.g:5958:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:5959:2: ()
            // InternalAle.g:5959:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__1"
    // InternalAle.g:5967:1: rule__AddOperation__Group_1_0_0_1__1 : rule__AddOperation__Group_1_0_0_1__1__Impl ;
    public final void rule__AddOperation__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5971:1: ( rule__AddOperation__Group_1_0_0_1__1__Impl )
            // InternalAle.g:5972:2: rule__AddOperation__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOperation__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__1"


    // $ANTLR start "rule__AddOperation__Group_1_0_0_1__1__Impl"
    // InternalAle.g:5978:1: rule__AddOperation__Group_1_0_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddOperation__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5982:1: ( ( '-' ) )
            // InternalAle.g:5983:1: ( '-' )
            {
            // InternalAle.g:5983:1: ( '-' )
            // InternalAle.g:5984:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__ChaindedCall__Group__0"
    // InternalAle.g:5994:1: rule__ChaindedCall__Group__0 : rule__ChaindedCall__Group__0__Impl rule__ChaindedCall__Group__1 ;
    public final void rule__ChaindedCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:5998:1: ( rule__ChaindedCall__Group__0__Impl rule__ChaindedCall__Group__1 )
            // InternalAle.g:5999:2: rule__ChaindedCall__Group__0__Impl rule__ChaindedCall__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__ChaindedCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group__0"


    // $ANTLR start "rule__ChaindedCall__Group__0__Impl"
    // InternalAle.g:6006:1: rule__ChaindedCall__Group__0__Impl : ( ruleInfixOperation ) ;
    public final void rule__ChaindedCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6010:1: ( ( ruleInfixOperation ) )
            // InternalAle.g:6011:1: ( ruleInfixOperation )
            {
            // InternalAle.g:6011:1: ( ruleInfixOperation )
            // InternalAle.g:6012:2: ruleInfixOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getInfixOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getInfixOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group__0__Impl"


    // $ANTLR start "rule__ChaindedCall__Group__1"
    // InternalAle.g:6021:1: rule__ChaindedCall__Group__1 : rule__ChaindedCall__Group__1__Impl ;
    public final void rule__ChaindedCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6025:1: ( rule__ChaindedCall__Group__1__Impl )
            // InternalAle.g:6026:2: rule__ChaindedCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group__1"


    // $ANTLR start "rule__ChaindedCall__Group__1__Impl"
    // InternalAle.g:6032:1: rule__ChaindedCall__Group__1__Impl : ( ( rule__ChaindedCall__Group_1__0 )* ) ;
    public final void rule__ChaindedCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6036:1: ( ( ( rule__ChaindedCall__Group_1__0 )* ) )
            // InternalAle.g:6037:1: ( ( rule__ChaindedCall__Group_1__0 )* )
            {
            // InternalAle.g:6037:1: ( ( rule__ChaindedCall__Group_1__0 )* )
            // InternalAle.g:6038:2: ( rule__ChaindedCall__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getGroup_1()); 
            }
            // InternalAle.g:6039:2: ( rule__ChaindedCall__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==56) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred63_InternalAle()) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==57) ) {
                    int LA34_3 = input.LA(2);

                    if ( (synpred63_InternalAle()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalAle.g:6039:3: rule__ChaindedCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__ChaindedCall__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group__1__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1__0"
    // InternalAle.g:6048:1: rule__ChaindedCall__Group_1__0 : rule__ChaindedCall__Group_1__0__Impl ;
    public final void rule__ChaindedCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6052:1: ( rule__ChaindedCall__Group_1__0__Impl )
            // InternalAle.g:6053:2: rule__ChaindedCall__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1__0"


    // $ANTLR start "rule__ChaindedCall__Group_1__0__Impl"
    // InternalAle.g:6059:1: rule__ChaindedCall__Group_1__0__Impl : ( ( rule__ChaindedCall__Group_1_0__0 ) ) ;
    public final void rule__ChaindedCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6063:1: ( ( ( rule__ChaindedCall__Group_1_0__0 ) ) )
            // InternalAle.g:6064:1: ( ( rule__ChaindedCall__Group_1_0__0 ) )
            {
            // InternalAle.g:6064:1: ( ( rule__ChaindedCall__Group_1_0__0 ) )
            // InternalAle.g:6065:2: ( rule__ChaindedCall__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getGroup_1_0()); 
            }
            // InternalAle.g:6066:2: ( rule__ChaindedCall__Group_1_0__0 )
            // InternalAle.g:6066:3: rule__ChaindedCall__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1__0__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1_0__0"
    // InternalAle.g:6075:1: rule__ChaindedCall__Group_1_0__0 : rule__ChaindedCall__Group_1_0__0__Impl rule__ChaindedCall__Group_1_0__1 ;
    public final void rule__ChaindedCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6079:1: ( rule__ChaindedCall__Group_1_0__0__Impl rule__ChaindedCall__Group_1_0__1 )
            // InternalAle.g:6080:2: rule__ChaindedCall__Group_1_0__0__Impl rule__ChaindedCall__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__ChaindedCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0__0"


    // $ANTLR start "rule__ChaindedCall__Group_1_0__0__Impl"
    // InternalAle.g:6087:1: rule__ChaindedCall__Group_1_0__0__Impl : ( ( rule__ChaindedCall__Alternatives_1_0_0 ) ) ;
    public final void rule__ChaindedCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6091:1: ( ( ( rule__ChaindedCall__Alternatives_1_0_0 ) ) )
            // InternalAle.g:6092:1: ( ( rule__ChaindedCall__Alternatives_1_0_0 ) )
            {
            // InternalAle.g:6092:1: ( ( rule__ChaindedCall__Alternatives_1_0_0 ) )
            // InternalAle.g:6093:2: ( rule__ChaindedCall__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getAlternatives_1_0_0()); 
            }
            // InternalAle.g:6094:2: ( rule__ChaindedCall__Alternatives_1_0_0 )
            // InternalAle.g:6094:3: rule__ChaindedCall__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1_0__1"
    // InternalAle.g:6102:1: rule__ChaindedCall__Group_1_0__1 : rule__ChaindedCall__Group_1_0__1__Impl ;
    public final void rule__ChaindedCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6106:1: ( rule__ChaindedCall__Group_1_0__1__Impl )
            // InternalAle.g:6107:2: rule__ChaindedCall__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0__1"


    // $ANTLR start "rule__ChaindedCall__Group_1_0__1__Impl"
    // InternalAle.g:6113:1: rule__ChaindedCall__Group_1_0__1__Impl : ( ( rule__ChaindedCall__RightAssignment_1_0_1 ) ) ;
    public final void rule__ChaindedCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6117:1: ( ( ( rule__ChaindedCall__RightAssignment_1_0_1 ) ) )
            // InternalAle.g:6118:1: ( ( rule__ChaindedCall__RightAssignment_1_0_1 ) )
            {
            // InternalAle.g:6118:1: ( ( rule__ChaindedCall__RightAssignment_1_0_1 ) )
            // InternalAle.g:6119:2: ( rule__ChaindedCall__RightAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getRightAssignment_1_0_1()); 
            }
            // InternalAle.g:6120:2: ( rule__ChaindedCall__RightAssignment_1_0_1 )
            // InternalAle.g:6120:3: rule__ChaindedCall__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__RightAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getRightAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0__1__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_0__0"
    // InternalAle.g:6129:1: rule__ChaindedCall__Group_1_0_0_0__0 : rule__ChaindedCall__Group_1_0_0_0__0__Impl rule__ChaindedCall__Group_1_0_0_0__1 ;
    public final void rule__ChaindedCall__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6133:1: ( rule__ChaindedCall__Group_1_0_0_0__0__Impl rule__ChaindedCall__Group_1_0_0_0__1 )
            // InternalAle.g:6134:2: rule__ChaindedCall__Group_1_0_0_0__0__Impl rule__ChaindedCall__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_61);
            rule__ChaindedCall__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_0__0"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_0__0__Impl"
    // InternalAle.g:6141:1: rule__ChaindedCall__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__ChaindedCall__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6145:1: ( ( () ) )
            // InternalAle.g:6146:1: ( () )
            {
            // InternalAle.g:6146:1: ( () )
            // InternalAle.g:6147:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getChainedCallLeftAction_1_0_0_0_0()); 
            }
            // InternalAle.g:6148:2: ()
            // InternalAle.g:6148:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getChainedCallLeftAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_0__1"
    // InternalAle.g:6156:1: rule__ChaindedCall__Group_1_0_0_0__1 : rule__ChaindedCall__Group_1_0_0_0__1__Impl ;
    public final void rule__ChaindedCall__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6160:1: ( rule__ChaindedCall__Group_1_0_0_0__1__Impl )
            // InternalAle.g:6161:2: rule__ChaindedCall__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_0__1"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_0__1__Impl"
    // InternalAle.g:6167:1: rule__ChaindedCall__Group_1_0_0_0__1__Impl : ( '.' ) ;
    public final void rule__ChaindedCall__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6171:1: ( ( '.' ) )
            // InternalAle.g:6172:1: ( '.' )
            {
            // InternalAle.g:6172:1: ( '.' )
            // InternalAle.g:6173:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getFullStopKeyword_1_0_0_0_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getFullStopKeyword_1_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_1__0"
    // InternalAle.g:6183:1: rule__ChaindedCall__Group_1_0_0_1__0 : rule__ChaindedCall__Group_1_0_0_1__0__Impl rule__ChaindedCall__Group_1_0_0_1__1 ;
    public final void rule__ChaindedCall__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6187:1: ( rule__ChaindedCall__Group_1_0_0_1__0__Impl rule__ChaindedCall__Group_1_0_0_1__1 )
            // InternalAle.g:6188:2: rule__ChaindedCall__Group_1_0_0_1__0__Impl rule__ChaindedCall__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_59);
            rule__ChaindedCall__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_1__0"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_1__0__Impl"
    // InternalAle.g:6195:1: rule__ChaindedCall__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__ChaindedCall__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6199:1: ( ( () ) )
            // InternalAle.g:6200:1: ( () )
            {
            // InternalAle.g:6200:1: ( () )
            // InternalAle.g:6201:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getChainedCallArrowLeftAction_1_0_0_1_0()); 
            }
            // InternalAle.g:6202:2: ()
            // InternalAle.g:6202:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getChainedCallArrowLeftAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_1__1"
    // InternalAle.g:6210:1: rule__ChaindedCall__Group_1_0_0_1__1 : rule__ChaindedCall__Group_1_0_0_1__1__Impl ;
    public final void rule__ChaindedCall__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6214:1: ( rule__ChaindedCall__Group_1_0_0_1__1__Impl )
            // InternalAle.g:6215:2: rule__ChaindedCall__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChaindedCall__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_1__1"


    // $ANTLR start "rule__ChaindedCall__Group_1_0_0_1__1__Impl"
    // InternalAle.g:6221:1: rule__ChaindedCall__Group_1_0_0_1__1__Impl : ( '->' ) ;
    public final void rule__ChaindedCall__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6225:1: ( ( '->' ) )
            // InternalAle.g:6226:1: ( '->' )
            {
            // InternalAle.g:6226:1: ( '->' )
            // InternalAle.g:6227:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_0__0"
    // InternalAle.g:6237:1: rule__InfixOperation__Group_0__0 : rule__InfixOperation__Group_0__0__Impl rule__InfixOperation__Group_0__1 ;
    public final void rule__InfixOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6241:1: ( rule__InfixOperation__Group_0__0__Impl rule__InfixOperation__Group_0__1 )
            // InternalAle.g:6242:2: rule__InfixOperation__Group_0__0__Impl rule__InfixOperation__Group_0__1
            {
            pushFollow(FOLLOW_62);
            rule__InfixOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__0"


    // $ANTLR start "rule__InfixOperation__Group_0__0__Impl"
    // InternalAle.g:6249:1: rule__InfixOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6253:1: ( ( () ) )
            // InternalAle.g:6254:1: ( () )
            {
            // InternalAle.g:6254:1: ( () )
            // InternalAle.g:6255:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0()); 
            }
            // InternalAle.g:6256:2: ()
            // InternalAle.g:6256:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_0__1"
    // InternalAle.g:6264:1: rule__InfixOperation__Group_0__1 : rule__InfixOperation__Group_0__1__Impl rule__InfixOperation__Group_0__2 ;
    public final void rule__InfixOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6268:1: ( rule__InfixOperation__Group_0__1__Impl rule__InfixOperation__Group_0__2 )
            // InternalAle.g:6269:2: rule__InfixOperation__Group_0__1__Impl rule__InfixOperation__Group_0__2
            {
            pushFollow(FOLLOW_25);
            rule__InfixOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__1"


    // $ANTLR start "rule__InfixOperation__Group_0__1__Impl"
    // InternalAle.g:6276:1: rule__InfixOperation__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__InfixOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6280:1: ( ( 'not' ) )
            // InternalAle.g:6281:1: ( 'not' )
            {
            // InternalAle.g:6281:1: ( 'not' )
            // InternalAle.g:6282:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNotKeyword_0_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNotKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_0__2"
    // InternalAle.g:6291:1: rule__InfixOperation__Group_0__2 : rule__InfixOperation__Group_0__2__Impl ;
    public final void rule__InfixOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6295:1: ( rule__InfixOperation__Group_0__2__Impl )
            // InternalAle.g:6296:2: rule__InfixOperation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__2"


    // $ANTLR start "rule__InfixOperation__Group_0__2__Impl"
    // InternalAle.g:6302:1: rule__InfixOperation__Group_0__2__Impl : ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) ) ;
    public final void rule__InfixOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6306:1: ( ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) ) )
            // InternalAle.g:6307:1: ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) )
            {
            // InternalAle.g:6307:1: ( ( rule__InfixOperation__ExpressionAssignment_0_2 ) )
            // InternalAle.g:6308:2: ( rule__InfixOperation__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionAssignment_0_2()); 
            }
            // InternalAle.g:6309:2: ( rule__InfixOperation__ExpressionAssignment_0_2 )
            // InternalAle.g:6309:3: rule__InfixOperation__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_0__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_1__0"
    // InternalAle.g:6318:1: rule__InfixOperation__Group_1__0 : rule__InfixOperation__Group_1__0__Impl rule__InfixOperation__Group_1__1 ;
    public final void rule__InfixOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6322:1: ( rule__InfixOperation__Group_1__0__Impl rule__InfixOperation__Group_1__1 )
            // InternalAle.g:6323:2: rule__InfixOperation__Group_1__0__Impl rule__InfixOperation__Group_1__1
            {
            pushFollow(FOLLOW_63);
            rule__InfixOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__0"


    // $ANTLR start "rule__InfixOperation__Group_1__0__Impl"
    // InternalAle.g:6330:1: rule__InfixOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6334:1: ( ( () ) )
            // InternalAle.g:6335:1: ( () )
            {
            // InternalAle.g:6335:1: ( () )
            // InternalAle.g:6336:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0()); 
            }
            // InternalAle.g:6337:2: ()
            // InternalAle.g:6337:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_1__1"
    // InternalAle.g:6345:1: rule__InfixOperation__Group_1__1 : rule__InfixOperation__Group_1__1__Impl rule__InfixOperation__Group_1__2 ;
    public final void rule__InfixOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6349:1: ( rule__InfixOperation__Group_1__1__Impl rule__InfixOperation__Group_1__2 )
            // InternalAle.g:6350:2: rule__InfixOperation__Group_1__1__Impl rule__InfixOperation__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__InfixOperation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__1"


    // $ANTLR start "rule__InfixOperation__Group_1__1__Impl"
    // InternalAle.g:6357:1: rule__InfixOperation__Group_1__1__Impl : ( '-' ) ;
    public final void rule__InfixOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6361:1: ( ( '-' ) )
            // InternalAle.g:6362:1: ( '-' )
            {
            // InternalAle.g:6362:1: ( '-' )
            // InternalAle.g:6363:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_1__2"
    // InternalAle.g:6372:1: rule__InfixOperation__Group_1__2 : rule__InfixOperation__Group_1__2__Impl ;
    public final void rule__InfixOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6376:1: ( rule__InfixOperation__Group_1__2__Impl )
            // InternalAle.g:6377:2: rule__InfixOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__2"


    // $ANTLR start "rule__InfixOperation__Group_1__2__Impl"
    // InternalAle.g:6383:1: rule__InfixOperation__Group_1__2__Impl : ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) ) ;
    public final void rule__InfixOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6387:1: ( ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) ) )
            // InternalAle.g:6388:1: ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) )
            {
            // InternalAle.g:6388:1: ( ( rule__InfixOperation__ExpressionAssignment_1_2 ) )
            // InternalAle.g:6389:2: ( rule__InfixOperation__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionAssignment_1_2()); 
            }
            // InternalAle.g:6390:2: ( rule__InfixOperation__ExpressionAssignment_1_2 )
            // InternalAle.g:6390:3: rule__InfixOperation__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_1__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__0"
    // InternalAle.g:6399:1: rule__InfixOperation__Group_2__0 : rule__InfixOperation__Group_2__0__Impl rule__InfixOperation__Group_2__1 ;
    public final void rule__InfixOperation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6403:1: ( rule__InfixOperation__Group_2__0__Impl rule__InfixOperation__Group_2__1 )
            // InternalAle.g:6404:2: rule__InfixOperation__Group_2__0__Impl rule__InfixOperation__Group_2__1
            {
            pushFollow(FOLLOW_64);
            rule__InfixOperation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__0"


    // $ANTLR start "rule__InfixOperation__Group_2__0__Impl"
    // InternalAle.g:6411:1: rule__InfixOperation__Group_2__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6415:1: ( ( () ) )
            // InternalAle.g:6416:1: ( () )
            {
            // InternalAle.g:6416:1: ( () )
            // InternalAle.g:6417:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNewSequenceAction_2_0()); 
            }
            // InternalAle.g:6418:2: ()
            // InternalAle.g:6418:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNewSequenceAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__1"
    // InternalAle.g:6426:1: rule__InfixOperation__Group_2__1 : rule__InfixOperation__Group_2__1__Impl rule__InfixOperation__Group_2__2 ;
    public final void rule__InfixOperation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6430:1: ( rule__InfixOperation__Group_2__1__Impl rule__InfixOperation__Group_2__2 )
            // InternalAle.g:6431:2: rule__InfixOperation__Group_2__1__Impl rule__InfixOperation__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__InfixOperation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__1"


    // $ANTLR start "rule__InfixOperation__Group_2__1__Impl"
    // InternalAle.g:6438:1: rule__InfixOperation__Group_2__1__Impl : ( 'newSequence' ) ;
    public final void rule__InfixOperation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6442:1: ( ( 'newSequence' ) )
            // InternalAle.g:6443:1: ( 'newSequence' )
            {
            // InternalAle.g:6443:1: ( 'newSequence' )
            // InternalAle.g:6444:2: 'newSequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNewSequenceKeyword_2_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNewSequenceKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__2"
    // InternalAle.g:6453:1: rule__InfixOperation__Group_2__2 : rule__InfixOperation__Group_2__2__Impl rule__InfixOperation__Group_2__3 ;
    public final void rule__InfixOperation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6457:1: ( rule__InfixOperation__Group_2__2__Impl rule__InfixOperation__Group_2__3 )
            // InternalAle.g:6458:2: rule__InfixOperation__Group_2__2__Impl rule__InfixOperation__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__InfixOperation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__2"


    // $ANTLR start "rule__InfixOperation__Group_2__2__Impl"
    // InternalAle.g:6465:1: rule__InfixOperation__Group_2__2__Impl : ( '(' ) ;
    public final void rule__InfixOperation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6469:1: ( ( '(' ) )
            // InternalAle.g:6470:1: ( '(' )
            {
            // InternalAle.g:6470:1: ( '(' )
            // InternalAle.g:6471:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__3"
    // InternalAle.g:6480:1: rule__InfixOperation__Group_2__3 : rule__InfixOperation__Group_2__3__Impl rule__InfixOperation__Group_2__4 ;
    public final void rule__InfixOperation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6484:1: ( rule__InfixOperation__Group_2__3__Impl rule__InfixOperation__Group_2__4 )
            // InternalAle.g:6485:2: rule__InfixOperation__Group_2__3__Impl rule__InfixOperation__Group_2__4
            {
            pushFollow(FOLLOW_26);
            rule__InfixOperation__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__3"


    // $ANTLR start "rule__InfixOperation__Group_2__3__Impl"
    // InternalAle.g:6492:1: rule__InfixOperation__Group_2__3__Impl : ( ( rule__InfixOperation__TypeAssignment_2_3 ) ) ;
    public final void rule__InfixOperation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6496:1: ( ( ( rule__InfixOperation__TypeAssignment_2_3 ) ) )
            // InternalAle.g:6497:1: ( ( rule__InfixOperation__TypeAssignment_2_3 ) )
            {
            // InternalAle.g:6497:1: ( ( rule__InfixOperation__TypeAssignment_2_3 ) )
            // InternalAle.g:6498:2: ( rule__InfixOperation__TypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getTypeAssignment_2_3()); 
            }
            // InternalAle.g:6499:2: ( rule__InfixOperation__TypeAssignment_2_3 )
            // InternalAle.g:6499:3: rule__InfixOperation__TypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__TypeAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getTypeAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__3__Impl"


    // $ANTLR start "rule__InfixOperation__Group_2__4"
    // InternalAle.g:6507:1: rule__InfixOperation__Group_2__4 : rule__InfixOperation__Group_2__4__Impl ;
    public final void rule__InfixOperation__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6511:1: ( rule__InfixOperation__Group_2__4__Impl )
            // InternalAle.g:6512:2: rule__InfixOperation__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__4"


    // $ANTLR start "rule__InfixOperation__Group_2__4__Impl"
    // InternalAle.g:6518:1: rule__InfixOperation__Group_2__4__Impl : ( ')' ) ;
    public final void rule__InfixOperation__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6522:1: ( ( ')' ) )
            // InternalAle.g:6523:1: ( ')' )
            {
            // InternalAle.g:6523:1: ( ')' )
            // InternalAle.g:6524:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_2__4__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__0"
    // InternalAle.g:6534:1: rule__InfixOperation__Group_3__0 : rule__InfixOperation__Group_3__0__Impl rule__InfixOperation__Group_3__1 ;
    public final void rule__InfixOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6538:1: ( rule__InfixOperation__Group_3__0__Impl rule__InfixOperation__Group_3__1 )
            // InternalAle.g:6539:2: rule__InfixOperation__Group_3__0__Impl rule__InfixOperation__Group_3__1
            {
            pushFollow(FOLLOW_65);
            rule__InfixOperation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__0"


    // $ANTLR start "rule__InfixOperation__Group_3__0__Impl"
    // InternalAle.g:6546:1: rule__InfixOperation__Group_3__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6550:1: ( ( () ) )
            // InternalAle.g:6551:1: ( () )
            {
            // InternalAle.g:6551:1: ( () )
            // InternalAle.g:6552:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getConstructorOperationAction_3_0()); 
            }
            // InternalAle.g:6553:2: ()
            // InternalAle.g:6553:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getConstructorOperationAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__1"
    // InternalAle.g:6561:1: rule__InfixOperation__Group_3__1 : rule__InfixOperation__Group_3__1__Impl rule__InfixOperation__Group_3__2 ;
    public final void rule__InfixOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6565:1: ( rule__InfixOperation__Group_3__1__Impl rule__InfixOperation__Group_3__2 )
            // InternalAle.g:6566:2: rule__InfixOperation__Group_3__1__Impl rule__InfixOperation__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__InfixOperation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__1"


    // $ANTLR start "rule__InfixOperation__Group_3__1__Impl"
    // InternalAle.g:6573:1: rule__InfixOperation__Group_3__1__Impl : ( 'new' ) ;
    public final void rule__InfixOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6577:1: ( ( 'new' ) )
            // InternalAle.g:6578:1: ( 'new' )
            {
            // InternalAle.g:6578:1: ( 'new' )
            // InternalAle.g:6579:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNewKeyword_3_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNewKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__2"
    // InternalAle.g:6588:1: rule__InfixOperation__Group_3__2 : rule__InfixOperation__Group_3__2__Impl rule__InfixOperation__Group_3__3 ;
    public final void rule__InfixOperation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6592:1: ( rule__InfixOperation__Group_3__2__Impl rule__InfixOperation__Group_3__3 )
            // InternalAle.g:6593:2: rule__InfixOperation__Group_3__2__Impl rule__InfixOperation__Group_3__3
            {
            pushFollow(FOLLOW_20);
            rule__InfixOperation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__2"


    // $ANTLR start "rule__InfixOperation__Group_3__2__Impl"
    // InternalAle.g:6600:1: rule__InfixOperation__Group_3__2__Impl : ( ( rule__InfixOperation__NameAssignment_3_2 ) ) ;
    public final void rule__InfixOperation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6604:1: ( ( ( rule__InfixOperation__NameAssignment_3_2 ) ) )
            // InternalAle.g:6605:1: ( ( rule__InfixOperation__NameAssignment_3_2 ) )
            {
            // InternalAle.g:6605:1: ( ( rule__InfixOperation__NameAssignment_3_2 ) )
            // InternalAle.g:6606:2: ( rule__InfixOperation__NameAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameAssignment_3_2()); 
            }
            // InternalAle.g:6607:2: ( rule__InfixOperation__NameAssignment_3_2 )
            // InternalAle.g:6607:3: rule__InfixOperation__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__NameAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__3"
    // InternalAle.g:6615:1: rule__InfixOperation__Group_3__3 : rule__InfixOperation__Group_3__3__Impl rule__InfixOperation__Group_3__4 ;
    public final void rule__InfixOperation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6619:1: ( rule__InfixOperation__Group_3__3__Impl rule__InfixOperation__Group_3__4 )
            // InternalAle.g:6620:2: rule__InfixOperation__Group_3__3__Impl rule__InfixOperation__Group_3__4
            {
            pushFollow(FOLLOW_26);
            rule__InfixOperation__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__3"


    // $ANTLR start "rule__InfixOperation__Group_3__3__Impl"
    // InternalAle.g:6627:1: rule__InfixOperation__Group_3__3__Impl : ( '(' ) ;
    public final void rule__InfixOperation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6631:1: ( ( '(' ) )
            // InternalAle.g:6632:1: ( '(' )
            {
            // InternalAle.g:6632:1: ( '(' )
            // InternalAle.g:6633:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__3__Impl"


    // $ANTLR start "rule__InfixOperation__Group_3__4"
    // InternalAle.g:6642:1: rule__InfixOperation__Group_3__4 : rule__InfixOperation__Group_3__4__Impl ;
    public final void rule__InfixOperation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6646:1: ( rule__InfixOperation__Group_3__4__Impl )
            // InternalAle.g:6647:2: rule__InfixOperation__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__4"


    // $ANTLR start "rule__InfixOperation__Group_3__4__Impl"
    // InternalAle.g:6653:1: rule__InfixOperation__Group_3__4__Impl : ( ')' ) ;
    public final void rule__InfixOperation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6657:1: ( ( ')' ) )
            // InternalAle.g:6658:1: ( ')' )
            {
            // InternalAle.g:6658:1: ( ')' )
            // InternalAle.g:6659:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_3__4__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4__0"
    // InternalAle.g:6669:1: rule__InfixOperation__Group_4__0 : rule__InfixOperation__Group_4__0__Impl rule__InfixOperation__Group_4__1 ;
    public final void rule__InfixOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6673:1: ( rule__InfixOperation__Group_4__0__Impl rule__InfixOperation__Group_4__1 )
            // InternalAle.g:6674:2: rule__InfixOperation__Group_4__0__Impl rule__InfixOperation__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__InfixOperation__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4__0"


    // $ANTLR start "rule__InfixOperation__Group_4__0__Impl"
    // InternalAle.g:6681:1: rule__InfixOperation__Group_4__0__Impl : ( () ) ;
    public final void rule__InfixOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6685:1: ( ( () ) )
            // InternalAle.g:6686:1: ( () )
            {
            // InternalAle.g:6686:1: ( () )
            // InternalAle.g:6687:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_4_0()); 
            }
            // InternalAle.g:6688:2: ()
            // InternalAle.g:6688:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4__1"
    // InternalAle.g:6696:1: rule__InfixOperation__Group_4__1 : rule__InfixOperation__Group_4__1__Impl rule__InfixOperation__Group_4__2 ;
    public final void rule__InfixOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6700:1: ( rule__InfixOperation__Group_4__1__Impl rule__InfixOperation__Group_4__2 )
            // InternalAle.g:6701:2: rule__InfixOperation__Group_4__1__Impl rule__InfixOperation__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__InfixOperation__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4__1"


    // $ANTLR start "rule__InfixOperation__Group_4__1__Impl"
    // InternalAle.g:6708:1: rule__InfixOperation__Group_4__1__Impl : ( ( rule__InfixOperation__NameAssignment_4_1 ) ) ;
    public final void rule__InfixOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6712:1: ( ( ( rule__InfixOperation__NameAssignment_4_1 ) ) )
            // InternalAle.g:6713:1: ( ( rule__InfixOperation__NameAssignment_4_1 ) )
            {
            // InternalAle.g:6713:1: ( ( rule__InfixOperation__NameAssignment_4_1 ) )
            // InternalAle.g:6714:2: ( rule__InfixOperation__NameAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameAssignment_4_1()); 
            }
            // InternalAle.g:6715:2: ( rule__InfixOperation__NameAssignment_4_1 )
            // InternalAle.g:6715:3: rule__InfixOperation__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__NameAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4__2"
    // InternalAle.g:6723:1: rule__InfixOperation__Group_4__2 : rule__InfixOperation__Group_4__2__Impl ;
    public final void rule__InfixOperation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6727:1: ( rule__InfixOperation__Group_4__2__Impl )
            // InternalAle.g:6728:2: rule__InfixOperation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4__2"


    // $ANTLR start "rule__InfixOperation__Group_4__2__Impl"
    // InternalAle.g:6734:1: rule__InfixOperation__Group_4__2__Impl : ( ( rule__InfixOperation__Group_4_2__0 ) ) ;
    public final void rule__InfixOperation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6738:1: ( ( ( rule__InfixOperation__Group_4_2__0 ) ) )
            // InternalAle.g:6739:1: ( ( rule__InfixOperation__Group_4_2__0 ) )
            {
            // InternalAle.g:6739:1: ( ( rule__InfixOperation__Group_4_2__0 ) )
            // InternalAle.g:6740:2: ( rule__InfixOperation__Group_4_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getGroup_4_2()); 
            }
            // InternalAle.g:6741:2: ( rule__InfixOperation__Group_4_2__0 )
            // InternalAle.g:6741:3: rule__InfixOperation__Group_4_2__0
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2__0"
    // InternalAle.g:6750:1: rule__InfixOperation__Group_4_2__0 : rule__InfixOperation__Group_4_2__0__Impl rule__InfixOperation__Group_4_2__1 ;
    public final void rule__InfixOperation__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6754:1: ( rule__InfixOperation__Group_4_2__0__Impl rule__InfixOperation__Group_4_2__1 )
            // InternalAle.g:6755:2: rule__InfixOperation__Group_4_2__0__Impl rule__InfixOperation__Group_4_2__1
            {
            pushFollow(FOLLOW_66);
            rule__InfixOperation__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2__0"


    // $ANTLR start "rule__InfixOperation__Group_4_2__0__Impl"
    // InternalAle.g:6762:1: rule__InfixOperation__Group_4_2__0__Impl : ( '(' ) ;
    public final void rule__InfixOperation__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6766:1: ( ( '(' ) )
            // InternalAle.g:6767:1: ( '(' )
            {
            // InternalAle.g:6767:1: ( '(' )
            // InternalAle.g:6768:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_4_2_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2__1"
    // InternalAle.g:6777:1: rule__InfixOperation__Group_4_2__1 : rule__InfixOperation__Group_4_2__1__Impl rule__InfixOperation__Group_4_2__2 ;
    public final void rule__InfixOperation__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6781:1: ( rule__InfixOperation__Group_4_2__1__Impl rule__InfixOperation__Group_4_2__2 )
            // InternalAle.g:6782:2: rule__InfixOperation__Group_4_2__1__Impl rule__InfixOperation__Group_4_2__2
            {
            pushFollow(FOLLOW_66);
            rule__InfixOperation__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2__1"


    // $ANTLR start "rule__InfixOperation__Group_4_2__1__Impl"
    // InternalAle.g:6789:1: rule__InfixOperation__Group_4_2__1__Impl : ( ( rule__InfixOperation__Group_4_2_1__0 )? ) ;
    public final void rule__InfixOperation__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6793:1: ( ( ( rule__InfixOperation__Group_4_2_1__0 )? ) )
            // InternalAle.g:6794:1: ( ( rule__InfixOperation__Group_4_2_1__0 )? )
            {
            // InternalAle.g:6794:1: ( ( rule__InfixOperation__Group_4_2_1__0 )? )
            // InternalAle.g:6795:2: ( rule__InfixOperation__Group_4_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getGroup_4_2_1()); 
            }
            // InternalAle.g:6796:2: ( rule__InfixOperation__Group_4_2_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_NULL && LA35_0<=RULE_BOOLEAN)||LA35_0==31||LA35_0==55||(LA35_0>=58 && LA35_0<=60)||(LA35_0>=62 && LA35_0<=63)||(LA35_0>=65 && LA35_0<=68)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAle.g:6796:3: rule__InfixOperation__Group_4_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InfixOperation__Group_4_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getGroup_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2__2"
    // InternalAle.g:6804:1: rule__InfixOperation__Group_4_2__2 : rule__InfixOperation__Group_4_2__2__Impl ;
    public final void rule__InfixOperation__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6808:1: ( rule__InfixOperation__Group_4_2__2__Impl )
            // InternalAle.g:6809:2: rule__InfixOperation__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2__2"


    // $ANTLR start "rule__InfixOperation__Group_4_2__2__Impl"
    // InternalAle.g:6815:1: rule__InfixOperation__Group_4_2__2__Impl : ( ')' ) ;
    public final void rule__InfixOperation__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6819:1: ( ( ')' ) )
            // InternalAle.g:6820:1: ( ')' )
            {
            // InternalAle.g:6820:1: ( ')' )
            // InternalAle.g:6821:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_4_2_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2__2__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1__0"
    // InternalAle.g:6831:1: rule__InfixOperation__Group_4_2_1__0 : rule__InfixOperation__Group_4_2_1__0__Impl rule__InfixOperation__Group_4_2_1__1 ;
    public final void rule__InfixOperation__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6835:1: ( rule__InfixOperation__Group_4_2_1__0__Impl rule__InfixOperation__Group_4_2_1__1 )
            // InternalAle.g:6836:2: rule__InfixOperation__Group_4_2_1__0__Impl rule__InfixOperation__Group_4_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__InfixOperation__Group_4_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1__0"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1__0__Impl"
    // InternalAle.g:6843:1: rule__InfixOperation__Group_4_2_1__0__Impl : ( ( rule__InfixOperation__ParametersAssignment_4_2_1_0 ) ) ;
    public final void rule__InfixOperation__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6847:1: ( ( ( rule__InfixOperation__ParametersAssignment_4_2_1_0 ) ) )
            // InternalAle.g:6848:1: ( ( rule__InfixOperation__ParametersAssignment_4_2_1_0 ) )
            {
            // InternalAle.g:6848:1: ( ( rule__InfixOperation__ParametersAssignment_4_2_1_0 ) )
            // InternalAle.g:6849:2: ( rule__InfixOperation__ParametersAssignment_4_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersAssignment_4_2_1_0()); 
            }
            // InternalAle.g:6850:2: ( rule__InfixOperation__ParametersAssignment_4_2_1_0 )
            // InternalAle.g:6850:3: rule__InfixOperation__ParametersAssignment_4_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ParametersAssignment_4_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersAssignment_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1__1"
    // InternalAle.g:6858:1: rule__InfixOperation__Group_4_2_1__1 : rule__InfixOperation__Group_4_2_1__1__Impl ;
    public final void rule__InfixOperation__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6862:1: ( rule__InfixOperation__Group_4_2_1__1__Impl )
            // InternalAle.g:6863:2: rule__InfixOperation__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1__1"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1__1__Impl"
    // InternalAle.g:6869:1: rule__InfixOperation__Group_4_2_1__1__Impl : ( ( rule__InfixOperation__Group_4_2_1_1__0 )* ) ;
    public final void rule__InfixOperation__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6873:1: ( ( ( rule__InfixOperation__Group_4_2_1_1__0 )* ) )
            // InternalAle.g:6874:1: ( ( rule__InfixOperation__Group_4_2_1_1__0 )* )
            {
            // InternalAle.g:6874:1: ( ( rule__InfixOperation__Group_4_2_1_1__0 )* )
            // InternalAle.g:6875:2: ( rule__InfixOperation__Group_4_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getGroup_4_2_1_1()); 
            }
            // InternalAle.g:6876:2: ( rule__InfixOperation__Group_4_2_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAle.g:6876:3: rule__InfixOperation__Group_4_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InfixOperation__Group_4_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getGroup_4_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1_1__0"
    // InternalAle.g:6885:1: rule__InfixOperation__Group_4_2_1_1__0 : rule__InfixOperation__Group_4_2_1_1__0__Impl rule__InfixOperation__Group_4_2_1_1__1 ;
    public final void rule__InfixOperation__Group_4_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6889:1: ( rule__InfixOperation__Group_4_2_1_1__0__Impl rule__InfixOperation__Group_4_2_1_1__1 )
            // InternalAle.g:6890:2: rule__InfixOperation__Group_4_2_1_1__0__Impl rule__InfixOperation__Group_4_2_1_1__1
            {
            pushFollow(FOLLOW_25);
            rule__InfixOperation__Group_4_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1_1__0"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1_1__0__Impl"
    // InternalAle.g:6897:1: rule__InfixOperation__Group_4_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__InfixOperation__Group_4_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6901:1: ( ( ',' ) )
            // InternalAle.g:6902:1: ( ',' )
            {
            // InternalAle.g:6902:1: ( ',' )
            // InternalAle.g:6903:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getCommaKeyword_4_2_1_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getCommaKeyword_4_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1_1__0__Impl"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1_1__1"
    // InternalAle.g:6912:1: rule__InfixOperation__Group_4_2_1_1__1 : rule__InfixOperation__Group_4_2_1_1__1__Impl ;
    public final void rule__InfixOperation__Group_4_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6916:1: ( rule__InfixOperation__Group_4_2_1_1__1__Impl )
            // InternalAle.g:6917:2: rule__InfixOperation__Group_4_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__Group_4_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1_1__1"


    // $ANTLR start "rule__InfixOperation__Group_4_2_1_1__1__Impl"
    // InternalAle.g:6923:1: rule__InfixOperation__Group_4_2_1_1__1__Impl : ( ( rule__InfixOperation__ParametersAssignment_4_2_1_1_1 ) ) ;
    public final void rule__InfixOperation__Group_4_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6927:1: ( ( ( rule__InfixOperation__ParametersAssignment_4_2_1_1_1 ) ) )
            // InternalAle.g:6928:1: ( ( rule__InfixOperation__ParametersAssignment_4_2_1_1_1 ) )
            {
            // InternalAle.g:6928:1: ( ( rule__InfixOperation__ParametersAssignment_4_2_1_1_1 ) )
            // InternalAle.g:6929:2: ( rule__InfixOperation__ParametersAssignment_4_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersAssignment_4_2_1_1_1()); 
            }
            // InternalAle.g:6930:2: ( rule__InfixOperation__ParametersAssignment_4_2_1_1_1 )
            // InternalAle.g:6930:3: rule__InfixOperation__ParametersAssignment_4_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InfixOperation__ParametersAssignment_4_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersAssignment_4_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__Group_4_2_1_1__1__Impl"


    // $ANTLR start "rule__ParamCall__Group__0"
    // InternalAle.g:6939:1: rule__ParamCall__Group__0 : rule__ParamCall__Group__0__Impl rule__ParamCall__Group__1 ;
    public final void rule__ParamCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6943:1: ( rule__ParamCall__Group__0__Impl rule__ParamCall__Group__1 )
            // InternalAle.g:6944:2: rule__ParamCall__Group__0__Impl rule__ParamCall__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ParamCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group__0"


    // $ANTLR start "rule__ParamCall__Group__0__Impl"
    // InternalAle.g:6951:1: rule__ParamCall__Group__0__Impl : ( ( rule__ParamCall__Group_0__0 )? ) ;
    public final void rule__ParamCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6955:1: ( ( ( rule__ParamCall__Group_0__0 )? ) )
            // InternalAle.g:6956:1: ( ( rule__ParamCall__Group_0__0 )? )
            {
            // InternalAle.g:6956:1: ( ( rule__ParamCall__Group_0__0 )? )
            // InternalAle.g:6957:2: ( rule__ParamCall__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getGroup_0()); 
            }
            // InternalAle.g:6958:2: ( rule__ParamCall__Group_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==61) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalAle.g:6958:3: rule__ParamCall__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamCall__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group__0__Impl"


    // $ANTLR start "rule__ParamCall__Group__1"
    // InternalAle.g:6966:1: rule__ParamCall__Group__1 : rule__ParamCall__Group__1__Impl ;
    public final void rule__ParamCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6970:1: ( rule__ParamCall__Group__1__Impl )
            // InternalAle.g:6971:2: rule__ParamCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group__1"


    // $ANTLR start "rule__ParamCall__Group__1__Impl"
    // InternalAle.g:6977:1: rule__ParamCall__Group__1__Impl : ( ( rule__ParamCall__ExpressionAssignment_1 ) ) ;
    public final void rule__ParamCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6981:1: ( ( ( rule__ParamCall__ExpressionAssignment_1 ) ) )
            // InternalAle.g:6982:1: ( ( rule__ParamCall__ExpressionAssignment_1 ) )
            {
            // InternalAle.g:6982:1: ( ( rule__ParamCall__ExpressionAssignment_1 ) )
            // InternalAle.g:6983:2: ( rule__ParamCall__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getExpressionAssignment_1()); 
            }
            // InternalAle.g:6984:2: ( rule__ParamCall__ExpressionAssignment_1 )
            // InternalAle.g:6984:3: rule__ParamCall__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group__1__Impl"


    // $ANTLR start "rule__ParamCall__Group_0__0"
    // InternalAle.g:6993:1: rule__ParamCall__Group_0__0 : rule__ParamCall__Group_0__0__Impl rule__ParamCall__Group_0__1 ;
    public final void rule__ParamCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:6997:1: ( rule__ParamCall__Group_0__0__Impl rule__ParamCall__Group_0__1 )
            // InternalAle.g:6998:2: rule__ParamCall__Group_0__0__Impl rule__ParamCall__Group_0__1
            {
            pushFollow(FOLLOW_67);
            rule__ParamCall__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group_0__0"


    // $ANTLR start "rule__ParamCall__Group_0__0__Impl"
    // InternalAle.g:7005:1: rule__ParamCall__Group_0__0__Impl : ( ( rule__ParamCall__LambdaAssignment_0_0 ) ) ;
    public final void rule__ParamCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7009:1: ( ( ( rule__ParamCall__LambdaAssignment_0_0 ) ) )
            // InternalAle.g:7010:1: ( ( rule__ParamCall__LambdaAssignment_0_0 ) )
            {
            // InternalAle.g:7010:1: ( ( rule__ParamCall__LambdaAssignment_0_0 ) )
            // InternalAle.g:7011:2: ( rule__ParamCall__LambdaAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getLambdaAssignment_0_0()); 
            }
            // InternalAle.g:7012:2: ( rule__ParamCall__LambdaAssignment_0_0 )
            // InternalAle.g:7012:3: rule__ParamCall__LambdaAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__LambdaAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getLambdaAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group_0__0__Impl"


    // $ANTLR start "rule__ParamCall__Group_0__1"
    // InternalAle.g:7020:1: rule__ParamCall__Group_0__1 : rule__ParamCall__Group_0__1__Impl ;
    public final void rule__ParamCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7024:1: ( rule__ParamCall__Group_0__1__Impl )
            // InternalAle.g:7025:2: rule__ParamCall__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamCall__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group_0__1"


    // $ANTLR start "rule__ParamCall__Group_0__1__Impl"
    // InternalAle.g:7031:1: rule__ParamCall__Group_0__1__Impl : ( '|' ) ;
    public final void rule__ParamCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7035:1: ( ( '|' ) )
            // InternalAle.g:7036:1: ( '|' )
            {
            // InternalAle.g:7036:1: ( '|' )
            // InternalAle.g:7037:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_0__0"
    // InternalAle.g:7047:1: rule__AtomicLiteral__Group_0__0 : rule__AtomicLiteral__Group_0__0__Impl rule__AtomicLiteral__Group_0__1 ;
    public final void rule__AtomicLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7051:1: ( rule__AtomicLiteral__Group_0__0__Impl rule__AtomicLiteral__Group_0__1 )
            // InternalAle.g:7052:2: rule__AtomicLiteral__Group_0__0__Impl rule__AtomicLiteral__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_0__0"


    // $ANTLR start "rule__AtomicLiteral__Group_0__0__Impl"
    // InternalAle.g:7059:1: rule__AtomicLiteral__Group_0__0__Impl : ( '(' ) ;
    public final void rule__AtomicLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7063:1: ( ( '(' ) )
            // InternalAle.g:7064:1: ( '(' )
            {
            // InternalAle.g:7064:1: ( '(' )
            // InternalAle.g:7065:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_0__1"
    // InternalAle.g:7074:1: rule__AtomicLiteral__Group_0__1 : rule__AtomicLiteral__Group_0__1__Impl rule__AtomicLiteral__Group_0__2 ;
    public final void rule__AtomicLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7078:1: ( rule__AtomicLiteral__Group_0__1__Impl rule__AtomicLiteral__Group_0__2 )
            // InternalAle.g:7079:2: rule__AtomicLiteral__Group_0__1__Impl rule__AtomicLiteral__Group_0__2
            {
            pushFollow(FOLLOW_26);
            rule__AtomicLiteral__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_0__1"


    // $ANTLR start "rule__AtomicLiteral__Group_0__1__Impl"
    // InternalAle.g:7086:1: rule__AtomicLiteral__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7090:1: ( ( ruleExpression ) )
            // InternalAle.g:7091:1: ( ruleExpression )
            {
            // InternalAle.g:7091:1: ( ruleExpression )
            // InternalAle.g:7092:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_0__2"
    // InternalAle.g:7101:1: rule__AtomicLiteral__Group_0__2 : rule__AtomicLiteral__Group_0__2__Impl ;
    public final void rule__AtomicLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7105:1: ( rule__AtomicLiteral__Group_0__2__Impl )
            // InternalAle.g:7106:2: rule__AtomicLiteral__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_0__2"


    // $ANTLR start "rule__AtomicLiteral__Group_0__2__Impl"
    // InternalAle.g:7112:1: rule__AtomicLiteral__Group_0__2__Impl : ( ')' ) ;
    public final void rule__AtomicLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7116:1: ( ( ')' ) )
            // InternalAle.g:7117:1: ( ')' )
            {
            // InternalAle.g:7117:1: ( ')' )
            // InternalAle.g:7118:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__0"
    // InternalAle.g:7128:1: rule__AtomicLiteral__Group_1__0 : rule__AtomicLiteral__Group_1__0__Impl rule__AtomicLiteral__Group_1__1 ;
    public final void rule__AtomicLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7132:1: ( rule__AtomicLiteral__Group_1__0__Impl rule__AtomicLiteral__Group_1__1 )
            // InternalAle.g:7133:2: rule__AtomicLiteral__Group_1__0__Impl rule__AtomicLiteral__Group_1__1
            {
            pushFollow(FOLLOW_68);
            rule__AtomicLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__0"


    // $ANTLR start "rule__AtomicLiteral__Group_1__0__Impl"
    // InternalAle.g:7140:1: rule__AtomicLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7144:1: ( ( () ) )
            // InternalAle.g:7145:1: ( () )
            {
            // InternalAle.g:7145:1: ( () )
            // InternalAle.g:7146:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getOADenotAction_1_0()); 
            }
            // InternalAle.g:7147:2: ()
            // InternalAle.g:7147:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getOADenotAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__1"
    // InternalAle.g:7155:1: rule__AtomicLiteral__Group_1__1 : rule__AtomicLiteral__Group_1__1__Impl rule__AtomicLiteral__Group_1__2 ;
    public final void rule__AtomicLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7159:1: ( rule__AtomicLiteral__Group_1__1__Impl rule__AtomicLiteral__Group_1__2 )
            // InternalAle.g:7160:2: rule__AtomicLiteral__Group_1__1__Impl rule__AtomicLiteral__Group_1__2
            {
            pushFollow(FOLLOW_69);
            rule__AtomicLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__1"


    // $ANTLR start "rule__AtomicLiteral__Group_1__1__Impl"
    // InternalAle.g:7167:1: rule__AtomicLiteral__Group_1__1__Impl : ( '$' ) ;
    public final void rule__AtomicLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7171:1: ( ( '$' ) )
            // InternalAle.g:7172:1: ( '$' )
            {
            // InternalAle.g:7172:1: ( '$' )
            // InternalAle.g:7173:2: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getDollarSignKeyword_1_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getDollarSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__2"
    // InternalAle.g:7182:1: rule__AtomicLiteral__Group_1__2 : rule__AtomicLiteral__Group_1__2__Impl rule__AtomicLiteral__Group_1__3 ;
    public final void rule__AtomicLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7186:1: ( rule__AtomicLiteral__Group_1__2__Impl rule__AtomicLiteral__Group_1__3 )
            // InternalAle.g:7187:2: rule__AtomicLiteral__Group_1__2__Impl rule__AtomicLiteral__Group_1__3
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__2"


    // $ANTLR start "rule__AtomicLiteral__Group_1__2__Impl"
    // InternalAle.g:7194:1: rule__AtomicLiteral__Group_1__2__Impl : ( '[' ) ;
    public final void rule__AtomicLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7198:1: ( ( '[' ) )
            // InternalAle.g:7199:1: ( '[' )
            {
            // InternalAle.g:7199:1: ( '[' )
            // InternalAle.g:7200:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_1_2()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__3"
    // InternalAle.g:7209:1: rule__AtomicLiteral__Group_1__3 : rule__AtomicLiteral__Group_1__3__Impl rule__AtomicLiteral__Group_1__4 ;
    public final void rule__AtomicLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7213:1: ( rule__AtomicLiteral__Group_1__3__Impl rule__AtomicLiteral__Group_1__4 )
            // InternalAle.g:7214:2: rule__AtomicLiteral__Group_1__3__Impl rule__AtomicLiteral__Group_1__4
            {
            pushFollow(FOLLOW_70);
            rule__AtomicLiteral__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__3"


    // $ANTLR start "rule__AtomicLiteral__Group_1__3__Impl"
    // InternalAle.g:7221:1: rule__AtomicLiteral__Group_1__3__Impl : ( ( rule__AtomicLiteral__ExpAssignment_1_3 ) ) ;
    public final void rule__AtomicLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7225:1: ( ( ( rule__AtomicLiteral__ExpAssignment_1_3 ) ) )
            // InternalAle.g:7226:1: ( ( rule__AtomicLiteral__ExpAssignment_1_3 ) )
            {
            // InternalAle.g:7226:1: ( ( rule__AtomicLiteral__ExpAssignment_1_3 ) )
            // InternalAle.g:7227:2: ( rule__AtomicLiteral__ExpAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpAssignment_1_3()); 
            }
            // InternalAle.g:7228:2: ( rule__AtomicLiteral__ExpAssignment_1_3 )
            // InternalAle.g:7228:3: rule__AtomicLiteral__ExpAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_1__4"
    // InternalAle.g:7236:1: rule__AtomicLiteral__Group_1__4 : rule__AtomicLiteral__Group_1__4__Impl ;
    public final void rule__AtomicLiteral__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7240:1: ( rule__AtomicLiteral__Group_1__4__Impl )
            // InternalAle.g:7241:2: rule__AtomicLiteral__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__4"


    // $ANTLR start "rule__AtomicLiteral__Group_1__4__Impl"
    // InternalAle.g:7247:1: rule__AtomicLiteral__Group_1__4__Impl : ( ']' ) ;
    public final void rule__AtomicLiteral__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7251:1: ( ( ']' ) )
            // InternalAle.g:7252:1: ( ']' )
            {
            // InternalAle.g:7252:1: ( ']' )
            // InternalAle.g:7253:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_1_4()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_1__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_2__0"
    // InternalAle.g:7263:1: rule__AtomicLiteral__Group_2__0 : rule__AtomicLiteral__Group_2__0__Impl rule__AtomicLiteral__Group_2__1 ;
    public final void rule__AtomicLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7267:1: ( rule__AtomicLiteral__Group_2__0__Impl rule__AtomicLiteral__Group_2__1 )
            // InternalAle.g:7268:2: rule__AtomicLiteral__Group_2__0__Impl rule__AtomicLiteral__Group_2__1
            {
            pushFollow(FOLLOW_71);
            rule__AtomicLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_2__0"


    // $ANTLR start "rule__AtomicLiteral__Group_2__0__Impl"
    // InternalAle.g:7275:1: rule__AtomicLiteral__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7279:1: ( ( () ) )
            // InternalAle.g:7280:1: ( () )
            {
            // InternalAle.g:7280:1: ( () )
            // InternalAle.g:7281:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSelfRefAction_2_0()); 
            }
            // InternalAle.g:7282:2: ()
            // InternalAle.g:7282:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSelfRefAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_2__1"
    // InternalAle.g:7290:1: rule__AtomicLiteral__Group_2__1 : rule__AtomicLiteral__Group_2__1__Impl ;
    public final void rule__AtomicLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7294:1: ( rule__AtomicLiteral__Group_2__1__Impl )
            // InternalAle.g:7295:2: rule__AtomicLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_2__1"


    // $ANTLR start "rule__AtomicLiteral__Group_2__1__Impl"
    // InternalAle.g:7301:1: rule__AtomicLiteral__Group_2__1__Impl : ( 'self' ) ;
    public final void rule__AtomicLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7305:1: ( ( 'self' ) )
            // InternalAle.g:7306:1: ( 'self' )
            {
            // InternalAle.g:7306:1: ( 'self' )
            // InternalAle.g:7307:2: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSelfKeyword_2_1()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSelfKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_3__0"
    // InternalAle.g:7317:1: rule__AtomicLiteral__Group_3__0 : rule__AtomicLiteral__Group_3__0__Impl rule__AtomicLiteral__Group_3__1 ;
    public final void rule__AtomicLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7321:1: ( rule__AtomicLiteral__Group_3__0__Impl rule__AtomicLiteral__Group_3__1 )
            // InternalAle.g:7322:2: rule__AtomicLiteral__Group_3__0__Impl rule__AtomicLiteral__Group_3__1
            {
            pushFollow(FOLLOW_72);
            rule__AtomicLiteral__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_3__0"


    // $ANTLR start "rule__AtomicLiteral__Group_3__0__Impl"
    // InternalAle.g:7329:1: rule__AtomicLiteral__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7333:1: ( ( () ) )
            // InternalAle.g:7334:1: ( () )
            {
            // InternalAle.g:7334:1: ( () )
            // InternalAle.g:7335:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSuperRefAction_3_0()); 
            }
            // InternalAle.g:7336:2: ()
            // InternalAle.g:7336:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSuperRefAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_3__1"
    // InternalAle.g:7344:1: rule__AtomicLiteral__Group_3__1 : rule__AtomicLiteral__Group_3__1__Impl ;
    public final void rule__AtomicLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7348:1: ( rule__AtomicLiteral__Group_3__1__Impl )
            // InternalAle.g:7349:2: rule__AtomicLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_3__1"


    // $ANTLR start "rule__AtomicLiteral__Group_3__1__Impl"
    // InternalAle.g:7355:1: rule__AtomicLiteral__Group_3__1__Impl : ( 'super' ) ;
    public final void rule__AtomicLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7359:1: ( ( 'super' ) )
            // InternalAle.g:7360:1: ( 'super' )
            {
            // InternalAle.g:7360:1: ( 'super' )
            // InternalAle.g:7361:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSuperKeyword_3_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSuperKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_3__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_4__0"
    // InternalAle.g:7371:1: rule__AtomicLiteral__Group_4__0 : rule__AtomicLiteral__Group_4__0__Impl rule__AtomicLiteral__Group_4__1 ;
    public final void rule__AtomicLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7375:1: ( rule__AtomicLiteral__Group_4__0__Impl rule__AtomicLiteral__Group_4__1 )
            // InternalAle.g:7376:2: rule__AtomicLiteral__Group_4__0__Impl rule__AtomicLiteral__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__AtomicLiteral__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_4__0"


    // $ANTLR start "rule__AtomicLiteral__Group_4__0__Impl"
    // InternalAle.g:7383:1: rule__AtomicLiteral__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7387:1: ( ( () ) )
            // InternalAle.g:7388:1: ( () )
            {
            // InternalAle.g:7388:1: ( () )
            // InternalAle.g:7389:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_4_0()); 
            }
            // InternalAle.g:7390:2: ()
            // InternalAle.g:7390:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_4__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_4__1"
    // InternalAle.g:7398:1: rule__AtomicLiteral__Group_4__1 : rule__AtomicLiteral__Group_4__1__Impl ;
    public final void rule__AtomicLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7402:1: ( rule__AtomicLiteral__Group_4__1__Impl )
            // InternalAle.g:7403:2: rule__AtomicLiteral__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_4__1"


    // $ANTLR start "rule__AtomicLiteral__Group_4__1__Impl"
    // InternalAle.g:7409:1: rule__AtomicLiteral__Group_4__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) ) ;
    public final void rule__AtomicLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7413:1: ( ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) ) )
            // InternalAle.g:7414:1: ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) )
            {
            // InternalAle.g:7414:1: ( ( rule__AtomicLiteral__ValueAssignment_4_1 ) )
            // InternalAle.g:7415:2: ( rule__AtomicLiteral__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_4_1()); 
            }
            // InternalAle.g:7416:2: ( rule__AtomicLiteral__ValueAssignment_4_1 )
            // InternalAle.g:7416:3: rule__AtomicLiteral__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_4__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_5__0"
    // InternalAle.g:7425:1: rule__AtomicLiteral__Group_5__0 : rule__AtomicLiteral__Group_5__0__Impl rule__AtomicLiteral__Group_5__1 ;
    public final void rule__AtomicLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7429:1: ( rule__AtomicLiteral__Group_5__0__Impl rule__AtomicLiteral__Group_5__1 )
            // InternalAle.g:7430:2: rule__AtomicLiteral__Group_5__0__Impl rule__AtomicLiteral__Group_5__1
            {
            pushFollow(FOLLOW_73);
            rule__AtomicLiteral__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_5__0"


    // $ANTLR start "rule__AtomicLiteral__Group_5__0__Impl"
    // InternalAle.g:7437:1: rule__AtomicLiteral__Group_5__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7441:1: ( ( () ) )
            // InternalAle.g:7442:1: ( () )
            {
            // InternalAle.g:7442:1: ( () )
            // InternalAle.g:7443:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_5_0()); 
            }
            // InternalAle.g:7444:2: ()
            // InternalAle.g:7444:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_5__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_5__1"
    // InternalAle.g:7452:1: rule__AtomicLiteral__Group_5__1 : rule__AtomicLiteral__Group_5__1__Impl ;
    public final void rule__AtomicLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7456:1: ( rule__AtomicLiteral__Group_5__1__Impl )
            // InternalAle.g:7457:2: rule__AtomicLiteral__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_5__1"


    // $ANTLR start "rule__AtomicLiteral__Group_5__1__Impl"
    // InternalAle.g:7463:1: rule__AtomicLiteral__Group_5__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) ) ;
    public final void rule__AtomicLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7467:1: ( ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) ) )
            // InternalAle.g:7468:1: ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) )
            {
            // InternalAle.g:7468:1: ( ( rule__AtomicLiteral__ValueAssignment_5_1 ) )
            // InternalAle.g:7469:2: ( rule__AtomicLiteral__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_5_1()); 
            }
            // InternalAle.g:7470:2: ( rule__AtomicLiteral__ValueAssignment_5_1 )
            // InternalAle.g:7470:3: rule__AtomicLiteral__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_5__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_6__0"
    // InternalAle.g:7479:1: rule__AtomicLiteral__Group_6__0 : rule__AtomicLiteral__Group_6__0__Impl rule__AtomicLiteral__Group_6__1 ;
    public final void rule__AtomicLiteral__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7483:1: ( rule__AtomicLiteral__Group_6__0__Impl rule__AtomicLiteral__Group_6__1 )
            // InternalAle.g:7484:2: rule__AtomicLiteral__Group_6__0__Impl rule__AtomicLiteral__Group_6__1
            {
            pushFollow(FOLLOW_74);
            rule__AtomicLiteral__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_6__0"


    // $ANTLR start "rule__AtomicLiteral__Group_6__0__Impl"
    // InternalAle.g:7491:1: rule__AtomicLiteral__Group_6__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7495:1: ( ( () ) )
            // InternalAle.g:7496:1: ( () )
            {
            // InternalAle.g:7496:1: ( () )
            // InternalAle.g:7497:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_6_0()); 
            }
            // InternalAle.g:7498:2: ()
            // InternalAle.g:7498:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_6__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_6__1"
    // InternalAle.g:7506:1: rule__AtomicLiteral__Group_6__1 : rule__AtomicLiteral__Group_6__1__Impl ;
    public final void rule__AtomicLiteral__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7510:1: ( rule__AtomicLiteral__Group_6__1__Impl )
            // InternalAle.g:7511:2: rule__AtomicLiteral__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_6__1"


    // $ANTLR start "rule__AtomicLiteral__Group_6__1__Impl"
    // InternalAle.g:7517:1: rule__AtomicLiteral__Group_6__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) ) ;
    public final void rule__AtomicLiteral__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7521:1: ( ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) ) )
            // InternalAle.g:7522:1: ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) )
            {
            // InternalAle.g:7522:1: ( ( rule__AtomicLiteral__ValueAssignment_6_1 ) )
            // InternalAle.g:7523:2: ( rule__AtomicLiteral__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_6_1()); 
            }
            // InternalAle.g:7524:2: ( rule__AtomicLiteral__ValueAssignment_6_1 )
            // InternalAle.g:7524:3: rule__AtomicLiteral__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_6__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_7__0"
    // InternalAle.g:7533:1: rule__AtomicLiteral__Group_7__0 : rule__AtomicLiteral__Group_7__0__Impl rule__AtomicLiteral__Group_7__1 ;
    public final void rule__AtomicLiteral__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7537:1: ( rule__AtomicLiteral__Group_7__0__Impl rule__AtomicLiteral__Group_7__1 )
            // InternalAle.g:7538:2: rule__AtomicLiteral__Group_7__0__Impl rule__AtomicLiteral__Group_7__1
            {
            pushFollow(FOLLOW_75);
            rule__AtomicLiteral__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_7__0"


    // $ANTLR start "rule__AtomicLiteral__Group_7__0__Impl"
    // InternalAle.g:7545:1: rule__AtomicLiteral__Group_7__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7549:1: ( ( () ) )
            // InternalAle.g:7550:1: ( () )
            {
            // InternalAle.g:7550:1: ( () )
            // InternalAle.g:7551:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_7_0()); 
            }
            // InternalAle.g:7552:2: ()
            // InternalAle.g:7552:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_7__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_7__1"
    // InternalAle.g:7560:1: rule__AtomicLiteral__Group_7__1 : rule__AtomicLiteral__Group_7__1__Impl ;
    public final void rule__AtomicLiteral__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7564:1: ( rule__AtomicLiteral__Group_7__1__Impl )
            // InternalAle.g:7565:2: rule__AtomicLiteral__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_7__1"


    // $ANTLR start "rule__AtomicLiteral__Group_7__1__Impl"
    // InternalAle.g:7571:1: rule__AtomicLiteral__Group_7__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_7_1 ) ) ;
    public final void rule__AtomicLiteral__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7575:1: ( ( ( rule__AtomicLiteral__ValueAssignment_7_1 ) ) )
            // InternalAle.g:7576:1: ( ( rule__AtomicLiteral__ValueAssignment_7_1 ) )
            {
            // InternalAle.g:7576:1: ( ( rule__AtomicLiteral__ValueAssignment_7_1 ) )
            // InternalAle.g:7577:2: ( rule__AtomicLiteral__ValueAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_7_1()); 
            }
            // InternalAle.g:7578:2: ( rule__AtomicLiteral__ValueAssignment_7_1 )
            // InternalAle.g:7578:3: rule__AtomicLiteral__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_7__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__0"
    // InternalAle.g:7587:1: rule__AtomicLiteral__Group_8__0 : rule__AtomicLiteral__Group_8__0__Impl rule__AtomicLiteral__Group_8__1 ;
    public final void rule__AtomicLiteral__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7591:1: ( rule__AtomicLiteral__Group_8__0__Impl rule__AtomicLiteral__Group_8__1 )
            // InternalAle.g:7592:2: rule__AtomicLiteral__Group_8__0__Impl rule__AtomicLiteral__Group_8__1
            {
            pushFollow(FOLLOW_76);
            rule__AtomicLiteral__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_8__0"


    // $ANTLR start "rule__AtomicLiteral__Group_8__0__Impl"
    // InternalAle.g:7599:1: rule__AtomicLiteral__Group_8__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7603:1: ( ( () ) )
            // InternalAle.g:7604:1: ( () )
            {
            // InternalAle.g:7604:1: ( () )
            // InternalAle.g:7605:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_8_0()); 
            }
            // InternalAle.g:7606:2: ()
            // InternalAle.g:7606:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_8__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_8__1"
    // InternalAle.g:7614:1: rule__AtomicLiteral__Group_8__1 : rule__AtomicLiteral__Group_8__1__Impl ;
    public final void rule__AtomicLiteral__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7618:1: ( rule__AtomicLiteral__Group_8__1__Impl )
            // InternalAle.g:7619:2: rule__AtomicLiteral__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_8__1"


    // $ANTLR start "rule__AtomicLiteral__Group_8__1__Impl"
    // InternalAle.g:7625:1: rule__AtomicLiteral__Group_8__1__Impl : ( RULE_NULL ) ;
    public final void rule__AtomicLiteral__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7629:1: ( ( RULE_NULL ) )
            // InternalAle.g:7630:1: ( RULE_NULL )
            {
            // InternalAle.g:7630:1: ( RULE_NULL )
            // InternalAle.g:7631:2: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_8_1()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_8__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__0"
    // InternalAle.g:7641:1: rule__AtomicLiteral__Group_9__0 : rule__AtomicLiteral__Group_9__0__Impl rule__AtomicLiteral__Group_9__1 ;
    public final void rule__AtomicLiteral__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7645:1: ( rule__AtomicLiteral__Group_9__0__Impl rule__AtomicLiteral__Group_9__1 )
            // InternalAle.g:7646:2: rule__AtomicLiteral__Group_9__0__Impl rule__AtomicLiteral__Group_9__1
            {
            pushFollow(FOLLOW_69);
            rule__AtomicLiteral__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__0"


    // $ANTLR start "rule__AtomicLiteral__Group_9__0__Impl"
    // InternalAle.g:7653:1: rule__AtomicLiteral__Group_9__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7657:1: ( ( () ) )
            // InternalAle.g:7658:1: ( () )
            {
            // InternalAle.g:7658:1: ( () )
            // InternalAle.g:7659:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getIntRangeAction_9_0()); 
            }
            // InternalAle.g:7660:2: ()
            // InternalAle.g:7660:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getIntRangeAction_9_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__1"
    // InternalAle.g:7668:1: rule__AtomicLiteral__Group_9__1 : rule__AtomicLiteral__Group_9__1__Impl rule__AtomicLiteral__Group_9__2 ;
    public final void rule__AtomicLiteral__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7672:1: ( rule__AtomicLiteral__Group_9__1__Impl rule__AtomicLiteral__Group_9__2 )
            // InternalAle.g:7673:2: rule__AtomicLiteral__Group_9__1__Impl rule__AtomicLiteral__Group_9__2
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__1"


    // $ANTLR start "rule__AtomicLiteral__Group_9__1__Impl"
    // InternalAle.g:7680:1: rule__AtomicLiteral__Group_9__1__Impl : ( '[' ) ;
    public final void rule__AtomicLiteral__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7684:1: ( ( '[' ) )
            // InternalAle.g:7685:1: ( '[' )
            {
            // InternalAle.g:7685:1: ( '[' )
            // InternalAle.g:7686:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_9_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__2"
    // InternalAle.g:7695:1: rule__AtomicLiteral__Group_9__2 : rule__AtomicLiteral__Group_9__2__Impl rule__AtomicLiteral__Group_9__3 ;
    public final void rule__AtomicLiteral__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7699:1: ( rule__AtomicLiteral__Group_9__2__Impl rule__AtomicLiteral__Group_9__3 )
            // InternalAle.g:7700:2: rule__AtomicLiteral__Group_9__2__Impl rule__AtomicLiteral__Group_9__3
            {
            pushFollow(FOLLOW_61);
            rule__AtomicLiteral__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__2"


    // $ANTLR start "rule__AtomicLiteral__Group_9__2__Impl"
    // InternalAle.g:7707:1: rule__AtomicLiteral__Group_9__2__Impl : ( ( rule__AtomicLiteral__StartAssignment_9_2 ) ) ;
    public final void rule__AtomicLiteral__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7711:1: ( ( ( rule__AtomicLiteral__StartAssignment_9_2 ) ) )
            // InternalAle.g:7712:1: ( ( rule__AtomicLiteral__StartAssignment_9_2 ) )
            {
            // InternalAle.g:7712:1: ( ( rule__AtomicLiteral__StartAssignment_9_2 ) )
            // InternalAle.g:7713:2: ( rule__AtomicLiteral__StartAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStartAssignment_9_2()); 
            }
            // InternalAle.g:7714:2: ( rule__AtomicLiteral__StartAssignment_9_2 )
            // InternalAle.g:7714:3: rule__AtomicLiteral__StartAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__StartAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStartAssignment_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__3"
    // InternalAle.g:7722:1: rule__AtomicLiteral__Group_9__3 : rule__AtomicLiteral__Group_9__3__Impl rule__AtomicLiteral__Group_9__4 ;
    public final void rule__AtomicLiteral__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7726:1: ( rule__AtomicLiteral__Group_9__3__Impl rule__AtomicLiteral__Group_9__4 )
            // InternalAle.g:7727:2: rule__AtomicLiteral__Group_9__3__Impl rule__AtomicLiteral__Group_9__4
            {
            pushFollow(FOLLOW_61);
            rule__AtomicLiteral__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__3"


    // $ANTLR start "rule__AtomicLiteral__Group_9__3__Impl"
    // InternalAle.g:7734:1: rule__AtomicLiteral__Group_9__3__Impl : ( '.' ) ;
    public final void rule__AtomicLiteral__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7738:1: ( ( '.' ) )
            // InternalAle.g:7739:1: ( '.' )
            {
            // InternalAle.g:7739:1: ( '.' )
            // InternalAle.g:7740:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__4"
    // InternalAle.g:7749:1: rule__AtomicLiteral__Group_9__4 : rule__AtomicLiteral__Group_9__4__Impl rule__AtomicLiteral__Group_9__5 ;
    public final void rule__AtomicLiteral__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7753:1: ( rule__AtomicLiteral__Group_9__4__Impl rule__AtomicLiteral__Group_9__5 )
            // InternalAle.g:7754:2: rule__AtomicLiteral__Group_9__4__Impl rule__AtomicLiteral__Group_9__5
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_9__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__4"


    // $ANTLR start "rule__AtomicLiteral__Group_9__4__Impl"
    // InternalAle.g:7761:1: rule__AtomicLiteral__Group_9__4__Impl : ( '.' ) ;
    public final void rule__AtomicLiteral__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7765:1: ( ( '.' ) )
            // InternalAle.g:7766:1: ( '.' )
            {
            // InternalAle.g:7766:1: ( '.' )
            // InternalAle.g:7767:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_4()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__5"
    // InternalAle.g:7776:1: rule__AtomicLiteral__Group_9__5 : rule__AtomicLiteral__Group_9__5__Impl rule__AtomicLiteral__Group_9__6 ;
    public final void rule__AtomicLiteral__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7780:1: ( rule__AtomicLiteral__Group_9__5__Impl rule__AtomicLiteral__Group_9__6 )
            // InternalAle.g:7781:2: rule__AtomicLiteral__Group_9__5__Impl rule__AtomicLiteral__Group_9__6
            {
            pushFollow(FOLLOW_70);
            rule__AtomicLiteral__Group_9__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__5"


    // $ANTLR start "rule__AtomicLiteral__Group_9__5__Impl"
    // InternalAle.g:7788:1: rule__AtomicLiteral__Group_9__5__Impl : ( ( rule__AtomicLiteral__StopAssignment_9_5 ) ) ;
    public final void rule__AtomicLiteral__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7792:1: ( ( ( rule__AtomicLiteral__StopAssignment_9_5 ) ) )
            // InternalAle.g:7793:1: ( ( rule__AtomicLiteral__StopAssignment_9_5 ) )
            {
            // InternalAle.g:7793:1: ( ( rule__AtomicLiteral__StopAssignment_9_5 ) )
            // InternalAle.g:7794:2: ( rule__AtomicLiteral__StopAssignment_9_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStopAssignment_9_5()); 
            }
            // InternalAle.g:7795:2: ( rule__AtomicLiteral__StopAssignment_9_5 )
            // InternalAle.g:7795:3: rule__AtomicLiteral__StopAssignment_9_5
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__StopAssignment_9_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStopAssignment_9_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__5__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_9__6"
    // InternalAle.g:7803:1: rule__AtomicLiteral__Group_9__6 : rule__AtomicLiteral__Group_9__6__Impl ;
    public final void rule__AtomicLiteral__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7807:1: ( rule__AtomicLiteral__Group_9__6__Impl )
            // InternalAle.g:7808:2: rule__AtomicLiteral__Group_9__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_9__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__6"


    // $ANTLR start "rule__AtomicLiteral__Group_9__6__Impl"
    // InternalAle.g:7814:1: rule__AtomicLiteral__Group_9__6__Impl : ( ']' ) ;
    public final void rule__AtomicLiteral__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7818:1: ( ( ']' ) )
            // InternalAle.g:7819:1: ( ']' )
            {
            // InternalAle.g:7819:1: ( ']' )
            // InternalAle.g:7820:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_9_6()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_9_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_9__6__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__0"
    // InternalAle.g:7830:1: rule__AtomicLiteral__Group_10__0 : rule__AtomicLiteral__Group_10__0__Impl rule__AtomicLiteral__Group_10__1 ;
    public final void rule__AtomicLiteral__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7834:1: ( rule__AtomicLiteral__Group_10__0__Impl rule__AtomicLiteral__Group_10__1 )
            // InternalAle.g:7835:2: rule__AtomicLiteral__Group_10__0__Impl rule__AtomicLiteral__Group_10__1
            {
            pushFollow(FOLLOW_77);
            rule__AtomicLiteral__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__0"


    // $ANTLR start "rule__AtomicLiteral__Group_10__0__Impl"
    // InternalAle.g:7842:1: rule__AtomicLiteral__Group_10__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7846:1: ( ( () ) )
            // InternalAle.g:7847:1: ( () )
            {
            // InternalAle.g:7847:1: ( () )
            // InternalAle.g:7848:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_10_0()); 
            }
            // InternalAle.g:7849:2: ()
            // InternalAle.g:7849:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_10_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__1"
    // InternalAle.g:7857:1: rule__AtomicLiteral__Group_10__1 : rule__AtomicLiteral__Group_10__1__Impl rule__AtomicLiteral__Group_10__2 ;
    public final void rule__AtomicLiteral__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7861:1: ( rule__AtomicLiteral__Group_10__1__Impl rule__AtomicLiteral__Group_10__2 )
            // InternalAle.g:7862:2: rule__AtomicLiteral__Group_10__1__Impl rule__AtomicLiteral__Group_10__2
            {
            pushFollow(FOLLOW_21);
            rule__AtomicLiteral__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__1"


    // $ANTLR start "rule__AtomicLiteral__Group_10__1__Impl"
    // InternalAle.g:7869:1: rule__AtomicLiteral__Group_10__1__Impl : ( 'Sequence' ) ;
    public final void rule__AtomicLiteral__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7873:1: ( ( 'Sequence' ) )
            // InternalAle.g:7874:1: ( 'Sequence' )
            {
            // InternalAle.g:7874:1: ( 'Sequence' )
            // InternalAle.g:7875:2: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_10_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__2"
    // InternalAle.g:7884:1: rule__AtomicLiteral__Group_10__2 : rule__AtomicLiteral__Group_10__2__Impl rule__AtomicLiteral__Group_10__3 ;
    public final void rule__AtomicLiteral__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7888:1: ( rule__AtomicLiteral__Group_10__2__Impl rule__AtomicLiteral__Group_10__3 )
            // InternalAle.g:7889:2: rule__AtomicLiteral__Group_10__2__Impl rule__AtomicLiteral__Group_10__3
            {
            pushFollow(FOLLOW_78);
            rule__AtomicLiteral__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__2"


    // $ANTLR start "rule__AtomicLiteral__Group_10__2__Impl"
    // InternalAle.g:7896:1: rule__AtomicLiteral__Group_10__2__Impl : ( '{' ) ;
    public final void rule__AtomicLiteral__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7900:1: ( ( '{' ) )
            // InternalAle.g:7901:1: ( '{' )
            {
            // InternalAle.g:7901:1: ( '{' )
            // InternalAle.g:7902:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__3"
    // InternalAle.g:7911:1: rule__AtomicLiteral__Group_10__3 : rule__AtomicLiteral__Group_10__3__Impl rule__AtomicLiteral__Group_10__4 ;
    public final void rule__AtomicLiteral__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7915:1: ( rule__AtomicLiteral__Group_10__3__Impl rule__AtomicLiteral__Group_10__4 )
            // InternalAle.g:7916:2: rule__AtomicLiteral__Group_10__3__Impl rule__AtomicLiteral__Group_10__4
            {
            pushFollow(FOLLOW_78);
            rule__AtomicLiteral__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__3"


    // $ANTLR start "rule__AtomicLiteral__Group_10__3__Impl"
    // InternalAle.g:7923:1: rule__AtomicLiteral__Group_10__3__Impl : ( ( rule__AtomicLiteral__Group_10_3__0 )? ) ;
    public final void rule__AtomicLiteral__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7927:1: ( ( ( rule__AtomicLiteral__Group_10_3__0 )? ) )
            // InternalAle.g:7928:1: ( ( rule__AtomicLiteral__Group_10_3__0 )? )
            {
            // InternalAle.g:7928:1: ( ( rule__AtomicLiteral__Group_10_3__0 )? )
            // InternalAle.g:7929:2: ( rule__AtomicLiteral__Group_10_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_10_3()); 
            }
            // InternalAle.g:7930:2: ( rule__AtomicLiteral__Group_10_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_NULL && LA38_0<=RULE_BOOLEAN)||LA38_0==31||LA38_0==55||(LA38_0>=58 && LA38_0<=60)||(LA38_0>=62 && LA38_0<=63)||(LA38_0>=65 && LA38_0<=68)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAle.g:7930:3: rule__AtomicLiteral__Group_10_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_10_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10__4"
    // InternalAle.g:7938:1: rule__AtomicLiteral__Group_10__4 : rule__AtomicLiteral__Group_10__4__Impl ;
    public final void rule__AtomicLiteral__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7942:1: ( rule__AtomicLiteral__Group_10__4__Impl )
            // InternalAle.g:7943:2: rule__AtomicLiteral__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__4"


    // $ANTLR start "rule__AtomicLiteral__Group_10__4__Impl"
    // InternalAle.g:7949:1: rule__AtomicLiteral__Group_10__4__Impl : ( '}' ) ;
    public final void rule__AtomicLiteral__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7953:1: ( ( '}' ) )
            // InternalAle.g:7954:1: ( '}' )
            {
            // InternalAle.g:7954:1: ( '}' )
            // InternalAle.g:7955:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__0"
    // InternalAle.g:7965:1: rule__AtomicLiteral__Group_10_3__0 : rule__AtomicLiteral__Group_10_3__0__Impl rule__AtomicLiteral__Group_10_3__1 ;
    public final void rule__AtomicLiteral__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7969:1: ( rule__AtomicLiteral__Group_10_3__0__Impl rule__AtomicLiteral__Group_10_3__1 )
            // InternalAle.g:7970:2: rule__AtomicLiteral__Group_10_3__0__Impl rule__AtomicLiteral__Group_10_3__1
            {
            pushFollow(FOLLOW_15);
            rule__AtomicLiteral__Group_10_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__0"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__0__Impl"
    // InternalAle.g:7977:1: rule__AtomicLiteral__Group_10_3__0__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) ) ;
    public final void rule__AtomicLiteral__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7981:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) ) )
            // InternalAle.g:7982:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) )
            {
            // InternalAle.g:7982:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 ) )
            // InternalAle.g:7983:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_0()); 
            }
            // InternalAle.g:7984:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_0 )
            // InternalAle.g:7984:3: rule__AtomicLiteral__ExpressionsAssignment_10_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_10_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__1"
    // InternalAle.g:7992:1: rule__AtomicLiteral__Group_10_3__1 : rule__AtomicLiteral__Group_10_3__1__Impl ;
    public final void rule__AtomicLiteral__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:7996:1: ( rule__AtomicLiteral__Group_10_3__1__Impl )
            // InternalAle.g:7997:2: rule__AtomicLiteral__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__1"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3__1__Impl"
    // InternalAle.g:8003:1: rule__AtomicLiteral__Group_10_3__1__Impl : ( ( rule__AtomicLiteral__Group_10_3_1__0 )* ) ;
    public final void rule__AtomicLiteral__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8007:1: ( ( ( rule__AtomicLiteral__Group_10_3_1__0 )* ) )
            // InternalAle.g:8008:1: ( ( rule__AtomicLiteral__Group_10_3_1__0 )* )
            {
            // InternalAle.g:8008:1: ( ( rule__AtomicLiteral__Group_10_3_1__0 )* )
            // InternalAle.g:8009:2: ( rule__AtomicLiteral__Group_10_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_10_3_1()); 
            }
            // InternalAle.g:8010:2: ( rule__AtomicLiteral__Group_10_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAle.g:8010:3: rule__AtomicLiteral__Group_10_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AtomicLiteral__Group_10_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_10_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__0"
    // InternalAle.g:8019:1: rule__AtomicLiteral__Group_10_3_1__0 : rule__AtomicLiteral__Group_10_3_1__0__Impl rule__AtomicLiteral__Group_10_3_1__1 ;
    public final void rule__AtomicLiteral__Group_10_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8023:1: ( rule__AtomicLiteral__Group_10_3_1__0__Impl rule__AtomicLiteral__Group_10_3_1__1 )
            // InternalAle.g:8024:2: rule__AtomicLiteral__Group_10_3_1__0__Impl rule__AtomicLiteral__Group_10_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_10_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__0"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__0__Impl"
    // InternalAle.g:8031:1: rule__AtomicLiteral__Group_10_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicLiteral__Group_10_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8035:1: ( ( ',' ) )
            // InternalAle.g:8036:1: ( ',' )
            {
            // InternalAle.g:8036:1: ( ',' )
            // InternalAle.g:8037:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__1"
    // InternalAle.g:8046:1: rule__AtomicLiteral__Group_10_3_1__1 : rule__AtomicLiteral__Group_10_3_1__1__Impl ;
    public final void rule__AtomicLiteral__Group_10_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8050:1: ( rule__AtomicLiteral__Group_10_3_1__1__Impl )
            // InternalAle.g:8051:2: rule__AtomicLiteral__Group_10_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_10_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__1"


    // $ANTLR start "rule__AtomicLiteral__Group_10_3_1__1__Impl"
    // InternalAle.g:8057:1: rule__AtomicLiteral__Group_10_3_1__1__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) ) ;
    public final void rule__AtomicLiteral__Group_10_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8061:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) ) )
            // InternalAle.g:8062:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) )
            {
            // InternalAle.g:8062:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 ) )
            // InternalAle.g:8063:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_1_1()); 
            }
            // InternalAle.g:8064:2: ( rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 )
            // InternalAle.g:8064:3: rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_10_3_1__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__0"
    // InternalAle.g:8073:1: rule__AtomicLiteral__Group_11__0 : rule__AtomicLiteral__Group_11__0__Impl rule__AtomicLiteral__Group_11__1 ;
    public final void rule__AtomicLiteral__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8077:1: ( rule__AtomicLiteral__Group_11__0__Impl rule__AtomicLiteral__Group_11__1 )
            // InternalAle.g:8078:2: rule__AtomicLiteral__Group_11__0__Impl rule__AtomicLiteral__Group_11__1
            {
            pushFollow(FOLLOW_79);
            rule__AtomicLiteral__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__0"


    // $ANTLR start "rule__AtomicLiteral__Group_11__0__Impl"
    // InternalAle.g:8085:1: rule__AtomicLiteral__Group_11__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8089:1: ( ( () ) )
            // InternalAle.g:8090:1: ( () )
            {
            // InternalAle.g:8090:1: ( () )
            // InternalAle.g:8091:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_11_0()); 
            }
            // InternalAle.g:8092:2: ()
            // InternalAle.g:8092:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_11_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__1"
    // InternalAle.g:8100:1: rule__AtomicLiteral__Group_11__1 : rule__AtomicLiteral__Group_11__1__Impl rule__AtomicLiteral__Group_11__2 ;
    public final void rule__AtomicLiteral__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8104:1: ( rule__AtomicLiteral__Group_11__1__Impl rule__AtomicLiteral__Group_11__2 )
            // InternalAle.g:8105:2: rule__AtomicLiteral__Group_11__1__Impl rule__AtomicLiteral__Group_11__2
            {
            pushFollow(FOLLOW_21);
            rule__AtomicLiteral__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__1"


    // $ANTLR start "rule__AtomicLiteral__Group_11__1__Impl"
    // InternalAle.g:8112:1: rule__AtomicLiteral__Group_11__1__Impl : ( 'OrderedSet' ) ;
    public final void rule__AtomicLiteral__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8116:1: ( ( 'OrderedSet' ) )
            // InternalAle.g:8117:1: ( 'OrderedSet' )
            {
            // InternalAle.g:8117:1: ( 'OrderedSet' )
            // InternalAle.g:8118:2: 'OrderedSet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_11_1()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__2"
    // InternalAle.g:8127:1: rule__AtomicLiteral__Group_11__2 : rule__AtomicLiteral__Group_11__2__Impl rule__AtomicLiteral__Group_11__3 ;
    public final void rule__AtomicLiteral__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8131:1: ( rule__AtomicLiteral__Group_11__2__Impl rule__AtomicLiteral__Group_11__3 )
            // InternalAle.g:8132:2: rule__AtomicLiteral__Group_11__2__Impl rule__AtomicLiteral__Group_11__3
            {
            pushFollow(FOLLOW_78);
            rule__AtomicLiteral__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__2"


    // $ANTLR start "rule__AtomicLiteral__Group_11__2__Impl"
    // InternalAle.g:8139:1: rule__AtomicLiteral__Group_11__2__Impl : ( '{' ) ;
    public final void rule__AtomicLiteral__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8143:1: ( ( '{' ) )
            // InternalAle.g:8144:1: ( '{' )
            {
            // InternalAle.g:8144:1: ( '{' )
            // InternalAle.g:8145:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_11_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__2__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__3"
    // InternalAle.g:8154:1: rule__AtomicLiteral__Group_11__3 : rule__AtomicLiteral__Group_11__3__Impl rule__AtomicLiteral__Group_11__4 ;
    public final void rule__AtomicLiteral__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8158:1: ( rule__AtomicLiteral__Group_11__3__Impl rule__AtomicLiteral__Group_11__4 )
            // InternalAle.g:8159:2: rule__AtomicLiteral__Group_11__3__Impl rule__AtomicLiteral__Group_11__4
            {
            pushFollow(FOLLOW_78);
            rule__AtomicLiteral__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__3"


    // $ANTLR start "rule__AtomicLiteral__Group_11__3__Impl"
    // InternalAle.g:8166:1: rule__AtomicLiteral__Group_11__3__Impl : ( ( rule__AtomicLiteral__Group_11_3__0 )? ) ;
    public final void rule__AtomicLiteral__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8170:1: ( ( ( rule__AtomicLiteral__Group_11_3__0 )? ) )
            // InternalAle.g:8171:1: ( ( rule__AtomicLiteral__Group_11_3__0 )? )
            {
            // InternalAle.g:8171:1: ( ( rule__AtomicLiteral__Group_11_3__0 )? )
            // InternalAle.g:8172:2: ( rule__AtomicLiteral__Group_11_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_11_3()); 
            }
            // InternalAle.g:8173:2: ( rule__AtomicLiteral__Group_11_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_NULL && LA40_0<=RULE_BOOLEAN)||LA40_0==31||LA40_0==55||(LA40_0>=58 && LA40_0<=60)||(LA40_0>=62 && LA40_0<=63)||(LA40_0>=65 && LA40_0<=68)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAle.g:8173:3: rule__AtomicLiteral__Group_11_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicLiteral__Group_11_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__3__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11__4"
    // InternalAle.g:8181:1: rule__AtomicLiteral__Group_11__4 : rule__AtomicLiteral__Group_11__4__Impl ;
    public final void rule__AtomicLiteral__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8185:1: ( rule__AtomicLiteral__Group_11__4__Impl )
            // InternalAle.g:8186:2: rule__AtomicLiteral__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__4"


    // $ANTLR start "rule__AtomicLiteral__Group_11__4__Impl"
    // InternalAle.g:8192:1: rule__AtomicLiteral__Group_11__4__Impl : ( '}' ) ;
    public final void rule__AtomicLiteral__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8196:1: ( ( '}' ) )
            // InternalAle.g:8197:1: ( '}' )
            {
            // InternalAle.g:8197:1: ( '}' )
            // InternalAle.g:8198:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_11_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_11_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11__4__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3__0"
    // InternalAle.g:8208:1: rule__AtomicLiteral__Group_11_3__0 : rule__AtomicLiteral__Group_11_3__0__Impl rule__AtomicLiteral__Group_11_3__1 ;
    public final void rule__AtomicLiteral__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8212:1: ( rule__AtomicLiteral__Group_11_3__0__Impl rule__AtomicLiteral__Group_11_3__1 )
            // InternalAle.g:8213:2: rule__AtomicLiteral__Group_11_3__0__Impl rule__AtomicLiteral__Group_11_3__1
            {
            pushFollow(FOLLOW_15);
            rule__AtomicLiteral__Group_11_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3__0"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3__0__Impl"
    // InternalAle.g:8220:1: rule__AtomicLiteral__Group_11_3__0__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_0 ) ) ;
    public final void rule__AtomicLiteral__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8224:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_0 ) ) )
            // InternalAle.g:8225:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_0 ) )
            {
            // InternalAle.g:8225:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_0 ) )
            // InternalAle.g:8226:2: ( rule__AtomicLiteral__ExpressionsAssignment_11_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_11_3_0()); 
            }
            // InternalAle.g:8227:2: ( rule__AtomicLiteral__ExpressionsAssignment_11_3_0 )
            // InternalAle.g:8227:3: rule__AtomicLiteral__ExpressionsAssignment_11_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_11_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_11_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3__1"
    // InternalAle.g:8235:1: rule__AtomicLiteral__Group_11_3__1 : rule__AtomicLiteral__Group_11_3__1__Impl ;
    public final void rule__AtomicLiteral__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8239:1: ( rule__AtomicLiteral__Group_11_3__1__Impl )
            // InternalAle.g:8240:2: rule__AtomicLiteral__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3__1"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3__1__Impl"
    // InternalAle.g:8246:1: rule__AtomicLiteral__Group_11_3__1__Impl : ( ( rule__AtomicLiteral__Group_11_3_1__0 )* ) ;
    public final void rule__AtomicLiteral__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8250:1: ( ( ( rule__AtomicLiteral__Group_11_3_1__0 )* ) )
            // InternalAle.g:8251:1: ( ( rule__AtomicLiteral__Group_11_3_1__0 )* )
            {
            // InternalAle.g:8251:1: ( ( rule__AtomicLiteral__Group_11_3_1__0 )* )
            // InternalAle.g:8252:2: ( rule__AtomicLiteral__Group_11_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getGroup_11_3_1()); 
            }
            // InternalAle.g:8253:2: ( rule__AtomicLiteral__Group_11_3_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAle.g:8253:3: rule__AtomicLiteral__Group_11_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AtomicLiteral__Group_11_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getGroup_11_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3_1__0"
    // InternalAle.g:8262:1: rule__AtomicLiteral__Group_11_3_1__0 : rule__AtomicLiteral__Group_11_3_1__0__Impl rule__AtomicLiteral__Group_11_3_1__1 ;
    public final void rule__AtomicLiteral__Group_11_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8266:1: ( rule__AtomicLiteral__Group_11_3_1__0__Impl rule__AtomicLiteral__Group_11_3_1__1 )
            // InternalAle.g:8267:2: rule__AtomicLiteral__Group_11_3_1__0__Impl rule__AtomicLiteral__Group_11_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_11_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3_1__0"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3_1__0__Impl"
    // InternalAle.g:8274:1: rule__AtomicLiteral__Group_11_3_1__0__Impl : ( ',' ) ;
    public final void rule__AtomicLiteral__Group_11_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8278:1: ( ( ',' ) )
            // InternalAle.g:8279:1: ( ',' )
            {
            // InternalAle.g:8279:1: ( ',' )
            // InternalAle.g:8280:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_11_3_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getCommaKeyword_11_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3_1__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3_1__1"
    // InternalAle.g:8289:1: rule__AtomicLiteral__Group_11_3_1__1 : rule__AtomicLiteral__Group_11_3_1__1__Impl ;
    public final void rule__AtomicLiteral__Group_11_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8293:1: ( rule__AtomicLiteral__Group_11_3_1__1__Impl )
            // InternalAle.g:8294:2: rule__AtomicLiteral__Group_11_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_11_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3_1__1"


    // $ANTLR start "rule__AtomicLiteral__Group_11_3_1__1__Impl"
    // InternalAle.g:8300:1: rule__AtomicLiteral__Group_11_3_1__1__Impl : ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 ) ) ;
    public final void rule__AtomicLiteral__Group_11_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8304:1: ( ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 ) ) )
            // InternalAle.g:8305:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 ) )
            {
            // InternalAle.g:8305:1: ( ( rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 ) )
            // InternalAle.g:8306:2: ( rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_11_3_1_1()); 
            }
            // InternalAle.g:8307:2: ( rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 )
            // InternalAle.g:8307:3: rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_11_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_11_3_1__1__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_12__0"
    // InternalAle.g:8316:1: rule__AtomicLiteral__Group_12__0 : rule__AtomicLiteral__Group_12__0__Impl rule__AtomicLiteral__Group_12__1 ;
    public final void rule__AtomicLiteral__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8320:1: ( rule__AtomicLiteral__Group_12__0__Impl rule__AtomicLiteral__Group_12__1 )
            // InternalAle.g:8321:2: rule__AtomicLiteral__Group_12__0__Impl rule__AtomicLiteral__Group_12__1
            {
            pushFollow(FOLLOW_25);
            rule__AtomicLiteral__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_12__0"


    // $ANTLR start "rule__AtomicLiteral__Group_12__0__Impl"
    // InternalAle.g:8328:1: rule__AtomicLiteral__Group_12__0__Impl : ( () ) ;
    public final void rule__AtomicLiteral__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8332:1: ( ( () ) )
            // InternalAle.g:8333:1: ( () )
            {
            // InternalAle.g:8333:1: ( () )
            // InternalAle.g:8334:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getVarRefAction_12_0()); 
            }
            // InternalAle.g:8335:2: ()
            // InternalAle.g:8335:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getVarRefAction_12_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_12__0__Impl"


    // $ANTLR start "rule__AtomicLiteral__Group_12__1"
    // InternalAle.g:8343:1: rule__AtomicLiteral__Group_12__1 : rule__AtomicLiteral__Group_12__1__Impl ;
    public final void rule__AtomicLiteral__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8347:1: ( rule__AtomicLiteral__Group_12__1__Impl )
            // InternalAle.g:8348:2: rule__AtomicLiteral__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_12__1"


    // $ANTLR start "rule__AtomicLiteral__Group_12__1__Impl"
    // InternalAle.g:8354:1: rule__AtomicLiteral__Group_12__1__Impl : ( ( rule__AtomicLiteral__ValueAssignment_12_1 ) ) ;
    public final void rule__AtomicLiteral__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8358:1: ( ( ( rule__AtomicLiteral__ValueAssignment_12_1 ) ) )
            // InternalAle.g:8359:1: ( ( rule__AtomicLiteral__ValueAssignment_12_1 ) )
            {
            // InternalAle.g:8359:1: ( ( rule__AtomicLiteral__ValueAssignment_12_1 ) )
            // InternalAle.g:8360:2: ( rule__AtomicLiteral__ValueAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueAssignment_12_1()); 
            }
            // InternalAle.g:8361:2: ( rule__AtomicLiteral__ValueAssignment_12_1 )
            // InternalAle.g:8361:3: rule__AtomicLiteral__ValueAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicLiteral__ValueAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__Group_12__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalAle.g:8370:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8374:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalAle.g:8375:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Param__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalAle.g:8382:1: rule__Param__Group__0__Impl : ( ( rule__Param__TypeAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8386:1: ( ( ( rule__Param__TypeAssignment_0 ) ) )
            // InternalAle.g:8387:1: ( ( rule__Param__TypeAssignment_0 ) )
            {
            // InternalAle.g:8387:1: ( ( rule__Param__TypeAssignment_0 ) )
            // InternalAle.g:8388:2: ( rule__Param__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeAssignment_0()); 
            }
            // InternalAle.g:8389:2: ( rule__Param__TypeAssignment_0 )
            // InternalAle.g:8389:3: rule__Param__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalAle.g:8397:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8401:1: ( rule__Param__Group__1__Impl )
            // InternalAle.g:8402:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalAle.g:8408:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8412:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // InternalAle.g:8413:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // InternalAle.g:8413:1: ( ( rule__Param__NameAssignment_1 ) )
            // InternalAle.g:8414:2: ( rule__Param__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // InternalAle.g:8415:2: ( rule__Param__NameAssignment_1 )
            // InternalAle.g:8415:3: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalAle.g:8424:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8428:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalAle.g:8429:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalAle.g:8436:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8440:1: ( ( () ) )
            // InternalAle.g:8441:1: ( () )
            {
            // InternalAle.g:8441:1: ( () )
            // InternalAle.g:8442:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0()); 
            }
            // InternalAle.g:8443:2: ()
            // InternalAle.g:8443:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalAle.g:8451:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8455:1: ( rule__Type__Group_1__1__Impl )
            // InternalAle.g:8456:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalAle.g:8462:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__ExternalClassAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8466:1: ( ( ( rule__Type__ExternalClassAssignment_1_1 ) ) )
            // InternalAle.g:8467:1: ( ( rule__Type__ExternalClassAssignment_1_1 ) )
            {
            // InternalAle.g:8467:1: ( ( rule__Type__ExternalClassAssignment_1_1 ) )
            // InternalAle.g:8468:2: ( rule__Type__ExternalClassAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getExternalClassAssignment_1_1()); 
            }
            // InternalAle.g:8469:2: ( rule__Type__ExternalClassAssignment_1_1 )
            // InternalAle.g:8469:3: rule__Type__ExternalClassAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ExternalClassAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getExternalClassAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalAle.g:8478:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8482:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalAle.g:8483:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_77);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalAle.g:8490:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8494:1: ( ( () ) )
            // InternalAle.g:8495:1: ( () )
            {
            // InternalAle.g:8495:1: ( () )
            // InternalAle.g:8496:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSequenceTypeAction_2_0()); 
            }
            // InternalAle.g:8497:2: ()
            // InternalAle.g:8497:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSequenceTypeAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalAle.g:8505:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8509:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalAle.g:8510:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalAle.g:8517:1: rule__Type__Group_2__1__Impl : ( 'Sequence' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8521:1: ( ( 'Sequence' ) )
            // InternalAle.g:8522:1: ( 'Sequence' )
            {
            // InternalAle.g:8522:1: ( 'Sequence' )
            // InternalAle.g:8523:2: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSequenceKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalAle.g:8532:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8536:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalAle.g:8537:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalAle.g:8544:1: rule__Type__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8548:1: ( ( '(' ) )
            // InternalAle.g:8549:1: ( '(' )
            {
            // InternalAle.g:8549:1: ( '(' )
            // InternalAle.g:8550:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2__3"
    // InternalAle.g:8559:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl rule__Type__Group_2__4 ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8563:1: ( rule__Type__Group_2__3__Impl rule__Type__Group_2__4 )
            // InternalAle.g:8564:2: rule__Type__Group_2__3__Impl rule__Type__Group_2__4
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3"


    // $ANTLR start "rule__Type__Group_2__3__Impl"
    // InternalAle.g:8571:1: rule__Type__Group_2__3__Impl : ( ( rule__Type__SubTypeAssignment_2_3 ) ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8575:1: ( ( ( rule__Type__SubTypeAssignment_2_3 ) ) )
            // InternalAle.g:8576:1: ( ( rule__Type__SubTypeAssignment_2_3 ) )
            {
            // InternalAle.g:8576:1: ( ( rule__Type__SubTypeAssignment_2_3 ) )
            // InternalAle.g:8577:2: ( rule__Type__SubTypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeAssignment_2_3()); 
            }
            // InternalAle.g:8578:2: ( rule__Type__SubTypeAssignment_2_3 )
            // InternalAle.g:8578:3: rule__Type__SubTypeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SubTypeAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3__Impl"


    // $ANTLR start "rule__Type__Group_2__4"
    // InternalAle.g:8586:1: rule__Type__Group_2__4 : rule__Type__Group_2__4__Impl ;
    public final void rule__Type__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8590:1: ( rule__Type__Group_2__4__Impl )
            // InternalAle.g:8591:2: rule__Type__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4"


    // $ANTLR start "rule__Type__Group_2__4__Impl"
    // InternalAle.g:8597:1: rule__Type__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8601:1: ( ( ')' ) )
            // InternalAle.g:8602:1: ( ')' )
            {
            // InternalAle.g:8602:1: ( ')' )
            // InternalAle.g:8603:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__4__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalAle.g:8613:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8617:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalAle.g:8618:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalAle.g:8625:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8629:1: ( ( () ) )
            // InternalAle.g:8630:1: ( () )
            {
            // InternalAle.g:8630:1: ( () )
            // InternalAle.g:8631:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0()); 
            }
            // InternalAle.g:8632:2: ()
            // InternalAle.g:8632:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalAle.g:8640:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8644:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalAle.g:8645:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Type__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalAle.g:8652:1: rule__Type__Group_3__1__Impl : ( 'OrderedSet' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8656:1: ( ( 'OrderedSet' ) )
            // InternalAle.g:8657:1: ( 'OrderedSet' )
            {
            // InternalAle.g:8657:1: ( 'OrderedSet' )
            // InternalAle.g:8658:2: 'OrderedSet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_3__2"
    // InternalAle.g:8667:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl rule__Type__Group_3__3 ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8671:1: ( rule__Type__Group_3__2__Impl rule__Type__Group_3__3 )
            // InternalAle.g:8672:2: rule__Type__Group_3__2__Impl rule__Type__Group_3__3
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2"


    // $ANTLR start "rule__Type__Group_3__2__Impl"
    // InternalAle.g:8679:1: rule__Type__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8683:1: ( ( '(' ) )
            // InternalAle.g:8684:1: ( '(' )
            {
            // InternalAle.g:8684:1: ( '(' )
            // InternalAle.g:8685:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2__Impl"


    // $ANTLR start "rule__Type__Group_3__3"
    // InternalAle.g:8694:1: rule__Type__Group_3__3 : rule__Type__Group_3__3__Impl rule__Type__Group_3__4 ;
    public final void rule__Type__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8698:1: ( rule__Type__Group_3__3__Impl rule__Type__Group_3__4 )
            // InternalAle.g:8699:2: rule__Type__Group_3__3__Impl rule__Type__Group_3__4
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__3"


    // $ANTLR start "rule__Type__Group_3__3__Impl"
    // InternalAle.g:8706:1: rule__Type__Group_3__3__Impl : ( ( rule__Type__SubTypeAssignment_3_3 ) ) ;
    public final void rule__Type__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8710:1: ( ( ( rule__Type__SubTypeAssignment_3_3 ) ) )
            // InternalAle.g:8711:1: ( ( rule__Type__SubTypeAssignment_3_3 ) )
            {
            // InternalAle.g:8711:1: ( ( rule__Type__SubTypeAssignment_3_3 ) )
            // InternalAle.g:8712:2: ( rule__Type__SubTypeAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeAssignment_3_3()); 
            }
            // InternalAle.g:8713:2: ( rule__Type__SubTypeAssignment_3_3 )
            // InternalAle.g:8713:3: rule__Type__SubTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__SubTypeAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeAssignment_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__3__Impl"


    // $ANTLR start "rule__Type__Group_3__4"
    // InternalAle.g:8721:1: rule__Type__Group_3__4 : rule__Type__Group_3__4__Impl ;
    public final void rule__Type__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8725:1: ( rule__Type__Group_3__4__Impl )
            // InternalAle.g:8726:2: rule__Type__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__4"


    // $ANTLR start "rule__Type__Group_3__4__Impl"
    // InternalAle.g:8732:1: rule__Type__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Type__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8736:1: ( ( ')' ) )
            // InternalAle.g:8737:1: ( ')' )
            {
            // InternalAle.g:8737:1: ( ')' )
            // InternalAle.g:8738:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__4__Impl"


    // $ANTLR start "rule__Qualified__Group__0"
    // InternalAle.g:8748:1: rule__Qualified__Group__0 : rule__Qualified__Group__0__Impl rule__Qualified__Group__1 ;
    public final void rule__Qualified__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8752:1: ( rule__Qualified__Group__0__Impl rule__Qualified__Group__1 )
            // InternalAle.g:8753:2: rule__Qualified__Group__0__Impl rule__Qualified__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__Qualified__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__0"


    // $ANTLR start "rule__Qualified__Group__0__Impl"
    // InternalAle.g:8760:1: rule__Qualified__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Qualified__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8764:1: ( ( RULE_ID ) )
            // InternalAle.g:8765:1: ( RULE_ID )
            {
            // InternalAle.g:8765:1: ( RULE_ID )
            // InternalAle.g:8766:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__0__Impl"


    // $ANTLR start "rule__Qualified__Group__1"
    // InternalAle.g:8775:1: rule__Qualified__Group__1 : rule__Qualified__Group__1__Impl ;
    public final void rule__Qualified__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8779:1: ( rule__Qualified__Group__1__Impl )
            // InternalAle.g:8780:2: rule__Qualified__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__1"


    // $ANTLR start "rule__Qualified__Group__1__Impl"
    // InternalAle.g:8786:1: rule__Qualified__Group__1__Impl : ( ( rule__Qualified__Group_1__0 )* ) ;
    public final void rule__Qualified__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8790:1: ( ( ( rule__Qualified__Group_1__0 )* ) )
            // InternalAle.g:8791:1: ( ( rule__Qualified__Group_1__0 )* )
            {
            // InternalAle.g:8791:1: ( ( rule__Qualified__Group_1__0 )* )
            // InternalAle.g:8792:2: ( rule__Qualified__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getGroup_1()); 
            }
            // InternalAle.g:8793:2: ( rule__Qualified__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==56) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAle.g:8793:3: rule__Qualified__Group_1__0
            	    {
            	    pushFollow(FOLLOW_80);
            	    rule__Qualified__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__1__Impl"


    // $ANTLR start "rule__Qualified__Group_1__0"
    // InternalAle.g:8802:1: rule__Qualified__Group_1__0 : rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1 ;
    public final void rule__Qualified__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8806:1: ( rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1 )
            // InternalAle.g:8807:2: rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Qualified__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__0"


    // $ANTLR start "rule__Qualified__Group_1__0__Impl"
    // InternalAle.g:8814:1: rule__Qualified__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Qualified__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8818:1: ( ( '.' ) )
            // InternalAle.g:8819:1: ( '.' )
            {
            // InternalAle.g:8819:1: ( '.' )
            // InternalAle.g:8820:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__0__Impl"


    // $ANTLR start "rule__Qualified__Group_1__1"
    // InternalAle.g:8829:1: rule__Qualified__Group_1__1 : rule__Qualified__Group_1__1__Impl ;
    public final void rule__Qualified__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8833:1: ( rule__Qualified__Group_1__1__Impl )
            // InternalAle.g:8834:2: rule__Qualified__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__1"


    // $ANTLR start "rule__Qualified__Group_1__1__Impl"
    // InternalAle.g:8840:1: rule__Qualified__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Qualified__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8844:1: ( ( RULE_ID ) )
            // InternalAle.g:8845:1: ( RULE_ID )
            {
            // InternalAle.g:8845:1: ( RULE_ID )
            // InternalAle.g:8846:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__1__Impl"


    // $ANTLR start "rule__Root__NameAssignment_1"
    // InternalAle.g:8856:1: rule__Root__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Root__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8860:1: ( ( RULE_ID ) )
            // InternalAle.g:8861:2: ( RULE_ID )
            {
            // InternalAle.g:8861:2: ( RULE_ID )
            // InternalAle.g:8862:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__NameAssignment_1"


    // $ANTLR start "rule__Root__ImportEcoreAssignment_3"
    // InternalAle.g:8871:1: rule__Root__ImportEcoreAssignment_3 : ( ruleImportEcore ) ;
    public final void rule__Root__ImportEcoreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8875:1: ( ( ruleImportEcore ) )
            // InternalAle.g:8876:2: ( ruleImportEcore )
            {
            // InternalAle.g:8876:2: ( ruleImportEcore )
            // InternalAle.g:8877:3: ruleImportEcore
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getImportEcoreImportEcoreParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImportEcore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getImportEcoreImportEcoreParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ImportEcoreAssignment_3"


    // $ANTLR start "rule__Root__ImportsAleAssignment_4"
    // InternalAle.g:8886:1: rule__Root__ImportsAleAssignment_4 : ( ruleImportAle ) ;
    public final void rule__Root__ImportsAleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8890:1: ( ( ruleImportAle ) )
            // InternalAle.g:8891:2: ( ruleImportAle )
            {
            // InternalAle.g:8891:2: ( ruleImportAle )
            // InternalAle.g:8892:3: ruleImportAle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getImportsAleImportAleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImportAle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getImportsAleImportAleParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ImportsAleAssignment_4"


    // $ANTLR start "rule__Root__ClassesAssignment_5"
    // InternalAle.g:8901:1: rule__Root__ClassesAssignment_5 : ( ruleAleClass ) ;
    public final void rule__Root__ClassesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8905:1: ( ( ruleAleClass ) )
            // InternalAle.g:8906:2: ( ruleAleClass )
            {
            // InternalAle.g:8906:2: ( ruleAleClass )
            // InternalAle.g:8907:3: ruleAleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getClassesAleClassParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getClassesAleClassParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ClassesAssignment_5"


    // $ANTLR start "rule__ImportAle__RefAssignment_3"
    // InternalAle.g:8916:1: rule__ImportAle__RefAssignment_3 : ( ( ruleQualified ) ) ;
    public final void rule__ImportAle__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8920:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8921:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8921:2: ( ( ruleQualified ) )
            // InternalAle.g:8922:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getRefRootCrossReference_3_0()); 
            }
            // InternalAle.g:8923:3: ( ruleQualified )
            // InternalAle.g:8924:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAleAccess().getRefRootQualifiedParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getRefRootQualifiedParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAleAccess().getRefRootCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportAle__RefAssignment_3"


    // $ANTLR start "rule__ImportEcore__RefAssignment_3"
    // InternalAle.g:8935:1: rule__ImportEcore__RefAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ImportEcore__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8939:1: ( ( RULE_STRING ) )
            // InternalAle.g:8940:2: ( RULE_STRING )
            {
            // InternalAle.g:8940:2: ( RULE_STRING )
            // InternalAle.g:8941:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportEcoreAccess().getRefSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportEcoreAccess().getRefSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportEcore__RefAssignment_3"


    // $ANTLR start "rule__AleClass__NameAssignment_3"
    // InternalAle.g:8950:1: rule__AleClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AleClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8954:1: ( ( RULE_ID ) )
            // InternalAle.g:8955:2: ( RULE_ID )
            {
            // InternalAle.g:8955:2: ( RULE_ID )
            // InternalAle.g:8956:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__NameAssignment_3"


    // $ANTLR start "rule__AleClass__SuperClassAssignment_4_1"
    // InternalAle.g:8965:1: rule__AleClass__SuperClassAssignment_4_1 : ( ( ruleQualified ) ) ;
    public final void rule__AleClass__SuperClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8969:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8970:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8970:2: ( ( ruleQualified ) )
            // InternalAle.g:8971:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getSuperClassAleClassCrossReference_4_1_0()); 
            }
            // InternalAle.g:8972:3: ( ruleQualified )
            // InternalAle.g:8973:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getSuperClassAleClassQualifiedParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getSuperClassAleClassQualifiedParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getSuperClassAleClassCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__SuperClassAssignment_4_1"


    // $ANTLR start "rule__AleClass__SuperClassAssignment_4_2_1"
    // InternalAle.g:8984:1: rule__AleClass__SuperClassAssignment_4_2_1 : ( ( ruleQualified ) ) ;
    public final void rule__AleClass__SuperClassAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:8988:1: ( ( ( ruleQualified ) ) )
            // InternalAle.g:8989:2: ( ( ruleQualified ) )
            {
            // InternalAle.g:8989:2: ( ( ruleQualified ) )
            // InternalAle.g:8990:3: ( ruleQualified )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getSuperClassAleClassCrossReference_4_2_1_0()); 
            }
            // InternalAle.g:8991:3: ( ruleQualified )
            // InternalAle.g:8992:4: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getSuperClassAleClassQualifiedParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getSuperClassAleClassQualifiedParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getSuperClassAleClassCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__SuperClassAssignment_4_2_1"


    // $ANTLR start "rule__AleClass__MethodsAssignment_5_1"
    // InternalAle.g:9003:1: rule__AleClass__MethodsAssignment_5_1 : ( ruleMethod ) ;
    public final void rule__AleClass__MethodsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9007:1: ( ( ruleMethod ) )
            // InternalAle.g:9008:2: ( ruleMethod )
            {
            // InternalAle.g:9008:2: ( ruleMethod )
            // InternalAle.g:9009:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAleClassAccess().getMethodsMethodParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAleClassAccess().getMethodsMethodParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AleClass__MethodsAssignment_5_1"


    // $ANTLR start "rule__DefMethod__TypeAssignment_1_0"
    // InternalAle.g:9018:1: rule__DefMethod__TypeAssignment_1_0 : ( ruleType ) ;
    public final void rule__DefMethod__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9022:1: ( ( ruleType ) )
            // InternalAle.g:9023:2: ( ruleType )
            {
            // InternalAle.g:9023:2: ( ruleType )
            // InternalAle.g:9024:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getTypeTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getTypeTypeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__TypeAssignment_1_0"


    // $ANTLR start "rule__DefMethod__NameAssignment_2"
    // InternalAle.g:9033:1: rule__DefMethod__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9037:1: ( ( RULE_ID ) )
            // InternalAle.g:9038:2: ( RULE_ID )
            {
            // InternalAle.g:9038:2: ( RULE_ID )
            // InternalAle.g:9039:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__NameAssignment_2"


    // $ANTLR start "rule__DefMethod__ParamsAssignment_3_1_0"
    // InternalAle.g:9048:1: rule__DefMethod__ParamsAssignment_3_1_0 : ( ruleParam ) ;
    public final void rule__DefMethod__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9052:1: ( ( ruleParam ) )
            // InternalAle.g:9053:2: ( ruleParam )
            {
            // InternalAle.g:9053:2: ( ruleParam )
            // InternalAle.g:9054:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__ParamsAssignment_3_1_0"


    // $ANTLR start "rule__DefMethod__ParamsAssignment_3_1_1_1"
    // InternalAle.g:9063:1: rule__DefMethod__ParamsAssignment_3_1_1_1 : ( ruleParam ) ;
    public final void rule__DefMethod__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9067:1: ( ( ruleParam ) )
            // InternalAle.g:9068:2: ( ruleParam )
            {
            // InternalAle.g:9068:2: ( ruleParam )
            // InternalAle.g:9069:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__ParamsAssignment_3_1_1_1"


    // $ANTLR start "rule__DefMethod__BlockAssignment_4"
    // InternalAle.g:9078:1: rule__DefMethod__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__DefMethod__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9082:1: ( ( ruleBlock ) )
            // InternalAle.g:9083:2: ( ruleBlock )
            {
            // InternalAle.g:9083:2: ( ruleBlock )
            // InternalAle.g:9084:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefMethodAccess().getBlockBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefMethodAccess().getBlockBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMethod__BlockAssignment_4"


    // $ANTLR start "rule__OverrideMethod__TypeAssignment_1"
    // InternalAle.g:9093:1: rule__OverrideMethod__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__OverrideMethod__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9097:1: ( ( ruleType ) )
            // InternalAle.g:9098:2: ( ruleType )
            {
            // InternalAle.g:9098:2: ( ruleType )
            // InternalAle.g:9099:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getTypeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__TypeAssignment_1"


    // $ANTLR start "rule__OverrideMethod__NameAssignment_2"
    // InternalAle.g:9108:1: rule__OverrideMethod__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OverrideMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9112:1: ( ( RULE_ID ) )
            // InternalAle.g:9113:2: ( RULE_ID )
            {
            // InternalAle.g:9113:2: ( RULE_ID )
            // InternalAle.g:9114:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__NameAssignment_2"


    // $ANTLR start "rule__OverrideMethod__ParamsAssignment_3_1_0"
    // InternalAle.g:9123:1: rule__OverrideMethod__ParamsAssignment_3_1_0 : ( ruleParam ) ;
    public final void rule__OverrideMethod__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9127:1: ( ( ruleParam ) )
            // InternalAle.g:9128:2: ( ruleParam )
            {
            // InternalAle.g:9128:2: ( ruleParam )
            // InternalAle.g:9129:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__ParamsAssignment_3_1_0"


    // $ANTLR start "rule__OverrideMethod__ParamsAssignment_3_1_1_1"
    // InternalAle.g:9138:1: rule__OverrideMethod__ParamsAssignment_3_1_1_1 : ( ruleParam ) ;
    public final void rule__OverrideMethod__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9142:1: ( ( ruleParam ) )
            // InternalAle.g:9143:2: ( ruleParam )
            {
            // InternalAle.g:9143:2: ( ruleParam )
            // InternalAle.g:9144:3: ruleParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__ParamsAssignment_3_1_1_1"


    // $ANTLR start "rule__OverrideMethod__BlockAssignment_4"
    // InternalAle.g:9153:1: rule__OverrideMethod__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__OverrideMethod__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9157:1: ( ( ruleBlock ) )
            // InternalAle.g:9158:2: ( ruleBlock )
            {
            // InternalAle.g:9158:2: ( ruleBlock )
            // InternalAle.g:9159:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOverrideMethodAccess().getBlockBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOverrideMethodAccess().getBlockBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverrideMethod__BlockAssignment_4"


    // $ANTLR start "rule__DebugStatement__ExprAssignment_3"
    // InternalAle.g:9168:1: rule__DebugStatement__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__DebugStatement__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9172:1: ( ( ruleExpression ) )
            // InternalAle.g:9173:2: ( ruleExpression )
            {
            // InternalAle.g:9173:2: ( ruleExpression )
            // InternalAle.g:9174:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDebugStatementAccess().getExprExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDebugStatementAccess().getExprExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugStatement__ExprAssignment_3"


    // $ANTLR start "rule__ReturnStatement__ReturnedAssignment_2"
    // InternalAle.g:9183:1: rule__ReturnStatement__ReturnedAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ReturnedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9187:1: ( ( ruleExpression ) )
            // InternalAle.g:9188:2: ( ruleExpression )
            {
            // InternalAle.g:9188:2: ( ruleExpression )
            // InternalAle.g:9189:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnedExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__ReturnedAssignment_2"


    // $ANTLR start "rule__LetStatement__BindingsAssignment_2"
    // InternalAle.g:9198:1: rule__LetStatement__BindingsAssignment_2 : ( ruleVarAssign ) ;
    public final void rule__LetStatement__BindingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9202:1: ( ( ruleVarAssign ) )
            // InternalAle.g:9203:2: ( ruleVarAssign )
            {
            // InternalAle.g:9203:2: ( ruleVarAssign )
            // InternalAle.g:9204:3: ruleVarAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__BindingsAssignment_2"


    // $ANTLR start "rule__LetStatement__BindingsAssignment_3_1"
    // InternalAle.g:9213:1: rule__LetStatement__BindingsAssignment_3_1 : ( ruleVarAssign ) ;
    public final void rule__LetStatement__BindingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9217:1: ( ( ruleVarAssign ) )
            // InternalAle.g:9218:2: ( ruleVarAssign )
            {
            // InternalAle.g:9218:2: ( ruleVarAssign )
            // InternalAle.g:9219:3: ruleVarAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__BindingsAssignment_3_1"


    // $ANTLR start "rule__LetStatement__BlockAssignment_5"
    // InternalAle.g:9228:1: rule__LetStatement__BlockAssignment_5 : ( ( rule__LetStatement__BlockAlternatives_5_0 ) ) ;
    public final void rule__LetStatement__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9232:1: ( ( ( rule__LetStatement__BlockAlternatives_5_0 ) ) )
            // InternalAle.g:9233:2: ( ( rule__LetStatement__BlockAlternatives_5_0 ) )
            {
            // InternalAle.g:9233:2: ( ( rule__LetStatement__BlockAlternatives_5_0 ) )
            // InternalAle.g:9234:3: ( rule__LetStatement__BlockAlternatives_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLetStatementAccess().getBlockAlternatives_5_0()); 
            }
            // InternalAle.g:9235:3: ( rule__LetStatement__BlockAlternatives_5_0 )
            // InternalAle.g:9235:4: rule__LetStatement__BlockAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__LetStatement__BlockAlternatives_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLetStatementAccess().getBlockAlternatives_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetStatement__BlockAssignment_5"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_3"
    // InternalAle.g:9243:1: rule__IfStatement__ConditionAssignment_3 : ( ruleExpression ) ;
    public final void rule__IfStatement__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9247:1: ( ( ruleExpression ) )
            // InternalAle.g:9248:2: ( ruleExpression )
            {
            // InternalAle.g:9248:2: ( ruleExpression )
            // InternalAle.g:9249:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ConditionAssignment_3"


    // $ANTLR start "rule__IfStatement__ThenBranchAssignment_5"
    // InternalAle.g:9258:1: rule__IfStatement__ThenBranchAssignment_5 : ( ruleBlock ) ;
    public final void rule__IfStatement__ThenBranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9262:1: ( ( ruleBlock ) )
            // InternalAle.g:9263:2: ( ruleBlock )
            {
            // InternalAle.g:9263:2: ( ruleBlock )
            // InternalAle.g:9264:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ThenBranchAssignment_5"


    // $ANTLR start "rule__IfStatement__ElseBranchAssignment_6_1"
    // InternalAle.g:9273:1: rule__IfStatement__ElseBranchAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBranchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9277:1: ( ( ruleBlock ) )
            // InternalAle.g:9278:2: ( ruleBlock )
            {
            // InternalAle.g:9278:2: ( ruleBlock )
            // InternalAle.g:9279:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseBranchAssignment_6_1"


    // $ANTLR start "rule__WhileStatement__ConditionAssignment_3"
    // InternalAle.g:9288:1: rule__WhileStatement__ConditionAssignment_3 : ( ruleExpression ) ;
    public final void rule__WhileStatement__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9292:1: ( ( ruleExpression ) )
            // InternalAle.g:9293:2: ( ruleExpression )
            {
            // InternalAle.g:9293:2: ( ruleExpression )
            // InternalAle.g:9294:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__ConditionAssignment_3"


    // $ANTLR start "rule__WhileStatement__WhileBlockAssignment_5"
    // InternalAle.g:9303:1: rule__WhileStatement__WhileBlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__WhileStatement__WhileBlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9307:1: ( ( ruleBlock ) )
            // InternalAle.g:9308:2: ( ruleBlock )
            {
            // InternalAle.g:9308:2: ( ruleBlock )
            // InternalAle.g:9309:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__WhileBlockAssignment_5"


    // $ANTLR start "rule__ForLoop__TypeAssignment_3"
    // InternalAle.g:9318:1: rule__ForLoop__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__ForLoop__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9322:1: ( ( ruleType ) )
            // InternalAle.g:9323:2: ( ruleType )
            {
            // InternalAle.g:9323:2: ( ruleType )
            // InternalAle.g:9324:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getTypeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getTypeTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__TypeAssignment_3"


    // $ANTLR start "rule__ForLoop__NameAssignment_4"
    // InternalAle.g:9333:1: rule__ForLoop__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ForLoop__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9337:1: ( ( RULE_ID ) )
            // InternalAle.g:9338:2: ( RULE_ID )
            {
            // InternalAle.g:9338:2: ( RULE_ID )
            // InternalAle.g:9339:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__NameAssignment_4"


    // $ANTLR start "rule__ForLoop__CollectionAssignment_6"
    // InternalAle.g:9348:1: rule__ForLoop__CollectionAssignment_6 : ( ruleExpression ) ;
    public final void rule__ForLoop__CollectionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9352:1: ( ( ruleExpression ) )
            // InternalAle.g:9353:2: ( ruleExpression )
            {
            // InternalAle.g:9353:2: ( ruleExpression )
            // InternalAle.g:9354:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__CollectionAssignment_6"


    // $ANTLR start "rule__ForLoop__BlockAssignment_8"
    // InternalAle.g:9363:1: rule__ForLoop__BlockAssignment_8 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9367:1: ( ( ruleBlock ) )
            // InternalAle.g:9368:2: ( ruleBlock )
            {
            // InternalAle.g:9368:2: ( ruleBlock )
            // InternalAle.g:9369:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__BlockAssignment_8"


    // $ANTLR start "rule__Block__BodyAssignment_2"
    // InternalAle.g:9378:1: rule__Block__BodyAssignment_2 : ( ruleStatement ) ;
    public final void rule__Block__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9382:1: ( ( ruleStatement ) )
            // InternalAle.g:9383:2: ( ruleStatement )
            {
            // InternalAle.g:9383:2: ( ruleStatement )
            // InternalAle.g:9384:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__BodyAssignment_2"


    // $ANTLR start "rule__VarAssign__TypeAssignment_0_1"
    // InternalAle.g:9393:1: rule__VarAssign__TypeAssignment_0_1 : ( ruleType ) ;
    public final void rule__VarAssign__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9397:1: ( ( ruleType ) )
            // InternalAle.g:9398:2: ( ruleType )
            {
            // InternalAle.g:9398:2: ( ruleType )
            // InternalAle.g:9399:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__TypeAssignment_0_1"


    // $ANTLR start "rule__VarAssign__NameAssignment_0_2"
    // InternalAle.g:9408:1: rule__VarAssign__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__VarAssign__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9412:1: ( ( RULE_ID ) )
            // InternalAle.g:9413:2: ( RULE_ID )
            {
            // InternalAle.g:9413:2: ( RULE_ID )
            // InternalAle.g:9414:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__NameAssignment_0_2"


    // $ANTLR start "rule__VarAssign__ValueAssignment_0_4"
    // InternalAle.g:9423:1: rule__VarAssign__ValueAssignment_0_4 : ( ruleExpression ) ;
    public final void rule__VarAssign__ValueAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9427:1: ( ( ruleExpression ) )
            // InternalAle.g:9428:2: ( ruleExpression )
            {
            // InternalAle.g:9428:2: ( ruleExpression )
            // InternalAle.g:9429:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__ValueAssignment_0_4"


    // $ANTLR start "rule__VarAssign__NameAssignment_1_1"
    // InternalAle.g:9438:1: rule__VarAssign__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__VarAssign__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9442:1: ( ( RULE_ID ) )
            // InternalAle.g:9443:2: ( RULE_ID )
            {
            // InternalAle.g:9443:2: ( RULE_ID )
            // InternalAle.g:9444:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__NameAssignment_1_1"


    // $ANTLR start "rule__VarAssign__ValueAssignment_1_3"
    // InternalAle.g:9453:1: rule__VarAssign__ValueAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__VarAssign__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9457:1: ( ( ruleExpression ) )
            // InternalAle.g:9458:2: ( ruleExpression )
            {
            // InternalAle.g:9458:2: ( ruleExpression )
            // InternalAle.g:9459:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__ValueAssignment_1_3"


    // $ANTLR start "rule__ImpliesOperation__RightAssignment_1_0_1"
    // InternalAle.g:9468:1: rule__ImpliesOperation__RightAssignment_1_0_1 : ( ruleBooleanOperation ) ;
    public final void rule__ImpliesOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9472:1: ( ( ruleBooleanOperation ) )
            // InternalAle.g:9473:2: ( ruleBooleanOperation )
            {
            // InternalAle.g:9473:2: ( ruleBooleanOperation )
            // InternalAle.g:9474:3: ruleBooleanOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__BooleanOperation__RightAssignment_1_0_1"
    // InternalAle.g:9483:1: rule__BooleanOperation__RightAssignment_1_0_1 : ( ruleCompareOperation ) ;
    public final void rule__BooleanOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9487:1: ( ( ruleCompareOperation ) )
            // InternalAle.g:9488:2: ( ruleCompareOperation )
            {
            // InternalAle.g:9488:2: ( ruleCompareOperation )
            // InternalAle.g:9489:3: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__CompareOperation__RightAssignment_1_0_1"
    // InternalAle.g:9498:1: rule__CompareOperation__RightAssignment_1_0_1 : ( ruleEqualityOperation ) ;
    public final void rule__CompareOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9502:1: ( ( ruleEqualityOperation ) )
            // InternalAle.g:9503:2: ( ruleEqualityOperation )
            {
            // InternalAle.g:9503:2: ( ruleEqualityOperation )
            // InternalAle.g:9504:3: ruleEqualityOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__EqualityOperation__OpAssignment_1_0_1"
    // InternalAle.g:9513:1: rule__EqualityOperation__OpAssignment_1_0_1 : ( ( '==' ) ) ;
    public final void rule__EqualityOperation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9517:1: ( ( ( '==' ) ) )
            // InternalAle.g:9518:2: ( ( '==' ) )
            {
            // InternalAle.g:9518:2: ( ( '==' ) )
            // InternalAle.g:9519:3: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }
            // InternalAle.g:9520:3: ( '==' )
            // InternalAle.g:9521:4: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__OpAssignment_1_0_1"


    // $ANTLR start "rule__EqualityOperation__RightAssignment_1_0_2"
    // InternalAle.g:9532:1: rule__EqualityOperation__RightAssignment_1_0_2 : ( ruleMultOperation ) ;
    public final void rule__EqualityOperation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9536:1: ( ( ruleMultOperation ) )
            // InternalAle.g:9537:2: ( ruleMultOperation )
            {
            // InternalAle.g:9537:2: ( ruleMultOperation )
            // InternalAle.g:9538:3: ruleMultOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperation__RightAssignment_1_0_2"


    // $ANTLR start "rule__MultOperation__RightAssignment_1_0_1"
    // InternalAle.g:9547:1: rule__MultOperation__RightAssignment_1_0_1 : ( ruleAddOperation ) ;
    public final void rule__MultOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9551:1: ( ( ruleAddOperation ) )
            // InternalAle.g:9552:2: ( ruleAddOperation )
            {
            // InternalAle.g:9552:2: ( ruleAddOperation )
            // InternalAle.g:9553:3: ruleAddOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__AddOperation__RightAssignment_1_0_1"
    // InternalAle.g:9562:1: rule__AddOperation__RightAssignment_1_0_1 : ( ruleChaindedCall ) ;
    public final void rule__AddOperation__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9566:1: ( ( ruleChaindedCall ) )
            // InternalAle.g:9567:2: ( ruleChaindedCall )
            {
            // InternalAle.g:9567:2: ( ruleChaindedCall )
            // InternalAle.g:9568:3: ruleChaindedCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperationAccess().getRightChaindedCallParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChaindedCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOperationAccess().getRightChaindedCallParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOperation__RightAssignment_1_0_1"


    // $ANTLR start "rule__ChaindedCall__RightAssignment_1_0_1"
    // InternalAle.g:9577:1: rule__ChaindedCall__RightAssignment_1_0_1 : ( ruleInfixOperation ) ;
    public final void rule__ChaindedCall__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9581:1: ( ( ruleInfixOperation ) )
            // InternalAle.g:9582:2: ( ruleInfixOperation )
            {
            // InternalAle.g:9582:2: ( ruleInfixOperation )
            // InternalAle.g:9583:3: ruleInfixOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChaindedCallAccess().getRightInfixOperationParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChaindedCallAccess().getRightInfixOperationParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChaindedCall__RightAssignment_1_0_1"


    // $ANTLR start "rule__InfixOperation__ExpressionAssignment_0_2"
    // InternalAle.g:9592:1: rule__InfixOperation__ExpressionAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__InfixOperation__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9596:1: ( ( ruleExpression ) )
            // InternalAle.g:9597:2: ( ruleExpression )
            {
            // InternalAle.g:9597:2: ( ruleExpression )
            // InternalAle.g:9598:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__ExpressionAssignment_0_2"


    // $ANTLR start "rule__InfixOperation__ExpressionAssignment_1_2"
    // InternalAle.g:9607:1: rule__InfixOperation__ExpressionAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__InfixOperation__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9611:1: ( ( ruleExpression ) )
            // InternalAle.g:9612:2: ( ruleExpression )
            {
            // InternalAle.g:9612:2: ( ruleExpression )
            // InternalAle.g:9613:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__ExpressionAssignment_1_2"


    // $ANTLR start "rule__InfixOperation__TypeAssignment_2_3"
    // InternalAle.g:9622:1: rule__InfixOperation__TypeAssignment_2_3 : ( ruleType ) ;
    public final void rule__InfixOperation__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9626:1: ( ( ruleType ) )
            // InternalAle.g:9627:2: ( ruleType )
            {
            // InternalAle.g:9627:2: ( ruleType )
            // InternalAle.g:9628:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getTypeTypeParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getTypeTypeParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__TypeAssignment_2_3"


    // $ANTLR start "rule__InfixOperation__NameAssignment_3_2"
    // InternalAle.g:9637:1: rule__InfixOperation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__InfixOperation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9641:1: ( ( RULE_ID ) )
            // InternalAle.g:9642:2: ( RULE_ID )
            {
            // InternalAle.g:9642:2: ( RULE_ID )
            // InternalAle.g:9643:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__NameAssignment_3_2"


    // $ANTLR start "rule__InfixOperation__NameAssignment_4_1"
    // InternalAle.g:9652:1: rule__InfixOperation__NameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__InfixOperation__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9656:1: ( ( RULE_ID ) )
            // InternalAle.g:9657:2: ( RULE_ID )
            {
            // InternalAle.g:9657:2: ( RULE_ID )
            // InternalAle.g:9658:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__NameAssignment_4_1"


    // $ANTLR start "rule__InfixOperation__ParametersAssignment_4_2_1_0"
    // InternalAle.g:9667:1: rule__InfixOperation__ParametersAssignment_4_2_1_0 : ( ruleParamCall ) ;
    public final void rule__InfixOperation__ParametersAssignment_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9671:1: ( ( ruleParamCall ) )
            // InternalAle.g:9672:2: ( ruleParamCall )
            {
            // InternalAle.g:9672:2: ( ruleParamCall )
            // InternalAle.g:9673:3: ruleParamCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__ParametersAssignment_4_2_1_0"


    // $ANTLR start "rule__InfixOperation__ParametersAssignment_4_2_1_1_1"
    // InternalAle.g:9682:1: rule__InfixOperation__ParametersAssignment_4_2_1_1_1 : ( ruleParamCall ) ;
    public final void rule__InfixOperation__ParametersAssignment_4_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9686:1: ( ( ruleParamCall ) )
            // InternalAle.g:9687:2: ( ruleParamCall )
            {
            // InternalAle.g:9687:2: ( ruleParamCall )
            // InternalAle.g:9688:3: ruleParamCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOperation__ParametersAssignment_4_2_1_1_1"


    // $ANTLR start "rule__ParamCall__LambdaAssignment_0_0"
    // InternalAle.g:9697:1: rule__ParamCall__LambdaAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ParamCall__LambdaAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9701:1: ( ( RULE_ID ) )
            // InternalAle.g:9702:2: ( RULE_ID )
            {
            // InternalAle.g:9702:2: ( RULE_ID )
            // InternalAle.g:9703:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getLambdaIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getLambdaIDTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__LambdaAssignment_0_0"


    // $ANTLR start "rule__ParamCall__ExpressionAssignment_1"
    // InternalAle.g:9712:1: rule__ParamCall__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ParamCall__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9716:1: ( ( ruleExpression ) )
            // InternalAle.g:9717:2: ( ruleExpression )
            {
            // InternalAle.g:9717:2: ( ruleExpression )
            // InternalAle.g:9718:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCallAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCallAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCall__ExpressionAssignment_1"


    // $ANTLR start "rule__AtomicLiteral__ExpAssignment_1_3"
    // InternalAle.g:9727:1: rule__AtomicLiteral__ExpAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9731:1: ( ( ruleExpression ) )
            // InternalAle.g:9732:2: ( ruleExpression )
            {
            // InternalAle.g:9732:2: ( ruleExpression )
            // InternalAle.g:9733:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpExpressionParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ExpAssignment_1_3"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_4_1"
    // InternalAle.g:9742:1: rule__AtomicLiteral__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__AtomicLiteral__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9746:1: ( ( RULE_STRING ) )
            // InternalAle.g:9747:2: ( RULE_STRING )
            {
            // InternalAle.g:9747:2: ( RULE_STRING )
            // InternalAle.g:9748:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_4_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_5_1"
    // InternalAle.g:9757:1: rule__AtomicLiteral__ValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__AtomicLiteral__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9761:1: ( ( RULE_INT ) )
            // InternalAle.g:9762:2: ( RULE_INT )
            {
            // InternalAle.g:9762:2: ( RULE_INT )
            // InternalAle.g:9763:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_5_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_6_1"
    // InternalAle.g:9772:1: rule__AtomicLiteral__ValueAssignment_6_1 : ( RULE_REAL ) ;
    public final void rule__AtomicLiteral__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9776:1: ( ( RULE_REAL ) )
            // InternalAle.g:9777:2: ( RULE_REAL )
            {
            // InternalAle.g:9777:2: ( RULE_REAL )
            // InternalAle.g:9778:3: RULE_REAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_REAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_6_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_7_1"
    // InternalAle.g:9787:1: rule__AtomicLiteral__ValueAssignment_7_1 : ( RULE_BOOLEAN ) ;
    public final void rule__AtomicLiteral__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9791:1: ( ( RULE_BOOLEAN ) )
            // InternalAle.g:9792:2: ( RULE_BOOLEAN )
            {
            // InternalAle.g:9792:2: ( RULE_BOOLEAN )
            // InternalAle.g:9793:3: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_7_1"


    // $ANTLR start "rule__AtomicLiteral__StartAssignment_9_2"
    // InternalAle.g:9802:1: rule__AtomicLiteral__StartAssignment_9_2 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__StartAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9806:1: ( ( ruleExpression ) )
            // InternalAle.g:9807:2: ( ruleExpression )
            {
            // InternalAle.g:9807:2: ( ruleExpression )
            // InternalAle.g:9808:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_9_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__StartAssignment_9_2"


    // $ANTLR start "rule__AtomicLiteral__StopAssignment_9_5"
    // InternalAle.g:9817:1: rule__AtomicLiteral__StopAssignment_9_5 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__StopAssignment_9_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9821:1: ( ( ruleExpression ) )
            // InternalAle.g:9822:2: ( ruleExpression )
            {
            // InternalAle.g:9822:2: ( ruleExpression )
            // InternalAle.g:9823:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_9_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_9_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__StopAssignment_9_5"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_10_3_0"
    // InternalAle.g:9832:1: rule__AtomicLiteral__ExpressionsAssignment_10_3_0 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_10_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9836:1: ( ( ruleExpression ) )
            // InternalAle.g:9837:2: ( ruleExpression )
            {
            // InternalAle.g:9837:2: ( ruleExpression )
            // InternalAle.g:9838:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_10_3_0"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1"
    // InternalAle.g:9847:1: rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9851:1: ( ( ruleExpression ) )
            // InternalAle.g:9852:2: ( ruleExpression )
            {
            // InternalAle.g:9852:2: ( ruleExpression )
            // InternalAle.g:9853:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_11_3_0"
    // InternalAle.g:9862:1: rule__AtomicLiteral__ExpressionsAssignment_11_3_0 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_11_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9866:1: ( ( ruleExpression ) )
            // InternalAle.g:9867:2: ( ruleExpression )
            {
            // InternalAle.g:9867:2: ( ruleExpression )
            // InternalAle.g:9868:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_11_3_0"


    // $ANTLR start "rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1"
    // InternalAle.g:9877:1: rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1 : ( ruleExpression ) ;
    public final void rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9881:1: ( ( ruleExpression ) )
            // InternalAle.g:9882:2: ( ruleExpression )
            {
            // InternalAle.g:9882:2: ( ruleExpression )
            // InternalAle.g:9883:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1"


    // $ANTLR start "rule__AtomicLiteral__ValueAssignment_12_1"
    // InternalAle.g:9892:1: rule__AtomicLiteral__ValueAssignment_12_1 : ( RULE_ID ) ;
    public final void rule__AtomicLiteral__ValueAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9896:1: ( ( RULE_ID ) )
            // InternalAle.g:9897:2: ( RULE_ID )
            {
            // InternalAle.g:9897:2: ( RULE_ID )
            // InternalAle.g:9898:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_12_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicLiteral__ValueAssignment_12_1"


    // $ANTLR start "rule__Param__TypeAssignment_0"
    // InternalAle.g:9907:1: rule__Param__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Param__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9911:1: ( ( ruleType ) )
            // InternalAle.g:9912:2: ( ruleType )
            {
            // InternalAle.g:9912:2: ( ruleType )
            // InternalAle.g:9913:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__TypeAssignment_0"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // InternalAle.g:9922:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9926:1: ( ( RULE_ID ) )
            // InternalAle.g:9927:2: ( RULE_ID )
            {
            // InternalAle.g:9927:2: ( RULE_ID )
            // InternalAle.g:9928:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__Type__ExternalClassAssignment_1_1"
    // InternalAle.g:9937:1: rule__Type__ExternalClassAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Type__ExternalClassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9941:1: ( ( RULE_ID ) )
            // InternalAle.g:9942:2: ( RULE_ID )
            {
            // InternalAle.g:9942:2: ( RULE_ID )
            // InternalAle.g:9943:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getExternalClassIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getExternalClassIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ExternalClassAssignment_1_1"


    // $ANTLR start "rule__Type__SubTypeAssignment_2_3"
    // InternalAle.g:9952:1: rule__Type__SubTypeAssignment_2_3 : ( ruleType ) ;
    public final void rule__Type__SubTypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9956:1: ( ( ruleType ) )
            // InternalAle.g:9957:2: ( ruleType )
            {
            // InternalAle.g:9957:2: ( ruleType )
            // InternalAle.g:9958:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SubTypeAssignment_2_3"


    // $ANTLR start "rule__Type__SubTypeAssignment_3_3"
    // InternalAle.g:9967:1: rule__Type__SubTypeAssignment_3_3 : ( ruleType ) ;
    public final void rule__Type__SubTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9971:1: ( ( ruleType ) )
            // InternalAle.g:9972:2: ( ruleType )
            {
            // InternalAle.g:9972:2: ( ruleType )
            // InternalAle.g:9973:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SubTypeAssignment_3_3"


    // $ANTLR start "rule__LiteralType__LitAssignment"
    // InternalAle.g:9982:1: rule__LiteralType__LitAssignment : ( ( rule__LiteralType__LitAlternatives_0 ) ) ;
    public final void rule__LiteralType__LitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAle.g:9986:1: ( ( ( rule__LiteralType__LitAlternatives_0 ) ) )
            // InternalAle.g:9987:2: ( ( rule__LiteralType__LitAlternatives_0 ) )
            {
            // InternalAle.g:9987:2: ( ( rule__LiteralType__LitAlternatives_0 ) )
            // InternalAle.g:9988:3: ( rule__LiteralType__LitAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralTypeAccess().getLitAlternatives_0()); 
            }
            // InternalAle.g:9989:3: ( rule__LiteralType__LitAlternatives_0 )
            // InternalAle.g:9989:4: rule__LiteralType__LitAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralType__LitAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralTypeAccess().getLitAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralType__LitAssignment"

    // $ANTLR start synpred57_InternalAle
    public final void synpred57_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:4500:3: ( rule__ImpliesOperation__Group_1__0 )
        // InternalAle.g:4500:3: rule__ImpliesOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ImpliesOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalAle

    // $ANTLR start synpred58_InternalAle
    public final void synpred58_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:4689:3: ( rule__BooleanOperation__Group_1__0 )
        // InternalAle.g:4689:3: rule__BooleanOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__BooleanOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalAle

    // $ANTLR start synpred59_InternalAle
    public final void synpred59_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:4986:3: ( rule__CompareOperation__Group_1__0 )
        // InternalAle.g:4986:3: rule__CompareOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__CompareOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalAle

    // $ANTLR start synpred60_InternalAle
    public final void synpred60_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5391:3: ( rule__EqualityOperation__Group_1__0 )
        // InternalAle.g:5391:3: rule__EqualityOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__EqualityOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalAle

    // $ANTLR start synpred61_InternalAle
    public final void synpred61_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5553:3: ( rule__MultOperation__Group_1__0 )
        // InternalAle.g:5553:3: rule__MultOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__MultOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalAle

    // $ANTLR start synpred62_InternalAle
    public final void synpred62_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:5796:3: ( rule__AddOperation__Group_1__0 )
        // InternalAle.g:5796:3: rule__AddOperation__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__AddOperation__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalAle

    // $ANTLR start synpred63_InternalAle
    public final void synpred63_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:6039:3: ( rule__ChaindedCall__Group_1__0 )
        // InternalAle.g:6039:3: rule__ChaindedCall__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ChaindedCall__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalAle

    // Delegated rules

    public final boolean synpred59_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\5\2\34\7\uffff";
    static final String dfa_3s = "\1\104\1\uffff\1\105\2\37\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\1\2\4\12\5\uffff\4\1\14\uffff\1\12\2\uffff\1\13\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\15\uffff\1\12\2\uffff\3\12\1\uffff\2\12\1\uffff\2\12\1\3\1\4",
            "",
            "\1\1\16\uffff\1\12\12\uffff\1\12\12\uffff\1\1\17\12\13\uffff\1\12",
            "\1\12\2\uffff\1\1",
            "\1\12\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "870:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ruleForLoop ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000260000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000007C020L,0x0000000000000018L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100078020L,0x0000000000000018L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000078020L,0x0000000000000018L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xDC800000800003F0L,0x000000000000001EL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xDC800010800003F0L,0x000000000000001EL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xDC80035CA00783F0L,0x000000000000001EL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xDC80035C800783F2L,0x000000000000001EL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000F800000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xDC800001800003F0L,0x000000000000001EL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0xDC800000A00003F0L,0x000000000000001EL});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0100000000000002L});

}