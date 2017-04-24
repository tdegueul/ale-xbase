package ale.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ale.xtext.services.AleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "'extends'", "','", "';'", "'import'", "'open'", "'class'", "'{'", "'}'", "'def'", "'void'", "'('", "')'", "'override'", "'debug'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'instanceof'", "'castto'", "'=='", "'*'", "'/'", "'+'", "'-'", "'.'", "'->'", "'not'", "'newSequence'", "'new'", "'|'", "'$'", "'['", "']'", "'self'", "'super'", "'Sequence'", "'OrderedSet'", "'Boolean'", "'Float'", "'Integer'", "'String'", "'Int'", "'nulltype'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
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
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=4;
    public static final int RULE_NULL=9;
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

        public InternalAleParser(TokenStream input, AleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected AleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalAle.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalAle.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalAle.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalAle.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_superAle_3_0 = null;

        AntlrDatatypeRuleToken lv_superAle_5_0 = null;

        EObject lv_imports_7_0 = null;

        EObject lv_classes_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:77:2: ( (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* ) )
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* )
            {
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )* )
            // InternalAle.g:79:3: otherlv_0= 'behavior' ( (lv_name_1_0= ruleQualified ) ) (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )? otherlv_6= ';' ( (lv_imports_7_0= ruleImport ) )* ( (lv_classes_8_0= ruleAleClass ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getBehaviorKeyword_0());
              		
            }
            // InternalAle.g:83:3: ( (lv_name_1_0= ruleQualified ) )
            // InternalAle.g:84:4: (lv_name_1_0= ruleQualified )
            {
            // InternalAle.g:84:4: (lv_name_1_0= ruleQualified )
            // InternalAle.g:85:5: lv_name_1_0= ruleQualified
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRootAccess().getNameQualifiedParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRootRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"ale.xtext.Ale.Qualified");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:102:3: (otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAle.g:103:4: otherlv_2= 'extends' ( (lv_superAle_3_0= ruleQualified ) ) (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalAle.g:107:4: ( (lv_superAle_3_0= ruleQualified ) )
                    // InternalAle.g:108:5: (lv_superAle_3_0= ruleQualified )
                    {
                    // InternalAle.g:108:5: (lv_superAle_3_0= ruleQualified )
                    // InternalAle.g:109:6: lv_superAle_3_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRootAccess().getSuperAleQualifiedParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_superAle_3_0=ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRootRule());
                      						}
                      						add(
                      							current,
                      							"superAle",
                      							lv_superAle_3_0,
                      							"ale.xtext.Ale.Qualified");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:126:4: (otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAle.g:127:5: otherlv_4= ',' ( (lv_superAle_5_0= ruleQualified ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getRootAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:131:5: ( (lv_superAle_5_0= ruleQualified ) )
                    	    // InternalAle.g:132:6: (lv_superAle_5_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:132:6: (lv_superAle_5_0= ruleQualified )
                    	    // InternalAle.g:133:7: lv_superAle_5_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRootAccess().getSuperAleQualifiedParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_5);
                    	    lv_superAle_5_0=ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRootRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superAle",
                    	      								lv_superAle_5_0,
                    	      								"ale.xtext.Ale.Qualified");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getRootAccess().getSemicolonKeyword_3());
              		
            }
            // InternalAle.g:156:3: ( (lv_imports_7_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAle.g:157:4: (lv_imports_7_0= ruleImport )
            	    {
            	    // InternalAle.g:157:4: (lv_imports_7_0= ruleImport )
            	    // InternalAle.g:158:5: lv_imports_7_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getImportsImportParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_imports_7_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_7_0,
            	      						"ale.xtext.Ale.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAle.g:175:3: ( (lv_classes_8_0= ruleAleClass ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAle.g:176:4: (lv_classes_8_0= ruleAleClass )
            	    {
            	    // InternalAle.g:176:4: (lv_classes_8_0= ruleAleClass )
            	    // InternalAle.g:177:5: lv_classes_8_0= ruleAleClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getClassesAleClassParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_classes_8_0=ruleAleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_8_0,
            	      						"ale.xtext.Ale.AleClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleImport"
    // InternalAle.g:198:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAle.g:198:47: (iv_ruleImport= ruleImport EOF )
            // InternalAle.g:199:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAle.g:205:1: ruleImport returns [EObject current=null] : ( ( () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' ) | ( () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_ref_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAle.g:211:2: ( ( ( () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' ) | ( () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            // InternalAle.g:212:2: ( ( () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' ) | ( () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            {
            // InternalAle.g:212:2: ( ( () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' ) | ( () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:213:3: ( () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' )
                    {
                    // InternalAle.g:213:3: ( () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';' )
                    // InternalAle.g:214:4: () otherlv_1= 'import' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ';'
                    {
                    // InternalAle.g:214:4: ()
                    // InternalAle.g:215:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getImportAccess().getImportSyntaxAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_0_1());
                      			
                    }
                    // InternalAle.g:225:4: ( (lv_ref_2_0= RULE_STRING ) )
                    // InternalAle.g:226:5: (lv_ref_2_0= RULE_STRING )
                    {
                    // InternalAle.g:226:5: (lv_ref_2_0= RULE_STRING )
                    // InternalAle.g:227:6: lv_ref_2_0= RULE_STRING
                    {
                    lv_ref_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ref_2_0, grammarAccess.getImportAccess().getRefSTRINGTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ref",
                      							lv_ref_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:249:3: ( () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
                    {
                    // InternalAle.g:249:3: ( () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
                    // InternalAle.g:250:4: () otherlv_5= 'import' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
                    {
                    // InternalAle.g:250:4: ()
                    // InternalAle.g:251:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getImportAccess().getImportSemanticsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getImportAccess().getImportKeyword_1_1());
                      			
                    }
                    // InternalAle.g:261:4: ( (otherlv_6= RULE_ID ) )
                    // InternalAle.g:262:5: (otherlv_6= RULE_ID )
                    {
                    // InternalAle.g:262:5: (otherlv_6= RULE_ID )
                    // InternalAle.g:263:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getImportAccess().getRefRootCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getImportAccess().getSemicolonKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAleClass"
    // InternalAle.g:283:1: entryRuleAleClass returns [EObject current=null] : iv_ruleAleClass= ruleAleClass EOF ;
    public final EObject entryRuleAleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAleClass = null;


        try {
            // InternalAle.g:283:49: (iv_ruleAleClass= ruleAleClass EOF )
            // InternalAle.g:284:2: iv_ruleAleClass= ruleAleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAleClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAleClass=ruleAleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAleClass"


    // $ANTLR start "ruleAleClass"
    // InternalAle.g:290:1: ruleAleClass returns [EObject current=null] : (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass ) ;
    public final EObject ruleAleClass() throws RecognitionException {
        EObject current = null;

        EObject this_OpenClass_0 = null;

        EObject this_NewClass_1 = null;



        	enterRule();

        try {
            // InternalAle.g:296:2: ( (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass ) )
            // InternalAle.g:297:2: (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass )
            {
            // InternalAle.g:297:2: (this_OpenClass_0= ruleOpenClass | this_NewClass_1= ruleNewClass )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAle.g:298:3: this_OpenClass_0= ruleOpenClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAleClassAccess().getOpenClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OpenClass_0=ruleOpenClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OpenClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:307:3: this_NewClass_1= ruleNewClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAleClassAccess().getNewClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NewClass_1=ruleNewClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NewClass_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAleClass"


    // $ANTLR start "entryRuleOpenClass"
    // InternalAle.g:319:1: entryRuleOpenClass returns [EObject current=null] : iv_ruleOpenClass= ruleOpenClass EOF ;
    public final EObject entryRuleOpenClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenClass = null;


        try {
            // InternalAle.g:319:50: (iv_ruleOpenClass= ruleOpenClass EOF )
            // InternalAle.g:320:2: iv_ruleOpenClass= ruleOpenClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpenClass=ruleOpenClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenClass"


    // $ANTLR start "ruleOpenClass"
    // InternalAle.g:326:1: ruleOpenClass returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) ;
    public final EObject ruleOpenClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_superClass_5_0 = null;

        AntlrDatatypeRuleToken lv_superClass_7_0 = null;

        EObject lv_methods_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:332:2: ( ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) )
            // InternalAle.g:333:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            {
            // InternalAle.g:333:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // InternalAle.g:334:3: () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // InternalAle.g:334:3: ()
            // InternalAle.g:335:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOpenClassAccess().getOpenClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOpenClassAccess().getOpenKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOpenClassAccess().getClassKeyword_2());
              		
            }
            // InternalAle.g:349:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:350:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:350:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:351:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getOpenClassAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOpenClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:367:3: (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAle.g:368:4: otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualified ) ) (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )*
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOpenClassAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAle.g:372:4: ( (lv_superClass_5_0= ruleQualified ) )
                    // InternalAle.g:373:5: (lv_superClass_5_0= ruleQualified )
                    {
                    // InternalAle.g:373:5: (lv_superClass_5_0= ruleQualified )
                    // InternalAle.g:374:6: lv_superClass_5_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassQualifiedParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_superClass_5_0=ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpenClassRule());
                      						}
                      						add(
                      							current,
                      							"superClass",
                      							lv_superClass_5_0,
                      							"ale.xtext.Ale.Qualified");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:391:4: (otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAle.g:392:5: otherlv_6= ',' ( (lv_superClass_7_0= ruleQualified ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getOpenClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:396:5: ( (lv_superClass_7_0= ruleQualified ) )
                    	    // InternalAle.g:397:6: (lv_superClass_7_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:397:6: (lv_superClass_7_0= ruleQualified )
                    	    // InternalAle.g:398:7: lv_superClass_7_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOpenClassAccess().getSuperClassQualifiedParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_superClass_7_0=ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOpenClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superClass",
                    	      								lv_superClass_7_0,
                    	      								"ale.xtext.Ale.Qualified");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:417:3: (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // InternalAle.g:418:4: otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            otherlv_8=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getOpenClassAccess().getLeftCurlyBracketKeyword_5_0());
              			
            }
            // InternalAle.g:422:4: ( (lv_methods_9_0= ruleMethod ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAle.g:423:5: (lv_methods_9_0= ruleMethod )
            	    {
            	    // InternalAle.g:423:5: (lv_methods_9_0= ruleMethod )
            	    // InternalAle.g:424:6: lv_methods_9_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOpenClassAccess().getMethodsMethodParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOpenClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"methods",
            	      							lv_methods_9_0,
            	      							"ale.xtext.Ale.Method");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getOpenClassAccess().getRightCurlyBracketKeyword_5_2());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenClass"


    // $ANTLR start "entryRuleNewClass"
    // InternalAle.g:450:1: entryRuleNewClass returns [EObject current=null] : iv_ruleNewClass= ruleNewClass EOF ;
    public final EObject entryRuleNewClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewClass = null;


        try {
            // InternalAle.g:450:49: (iv_ruleNewClass= ruleNewClass EOF )
            // InternalAle.g:451:2: iv_ruleNewClass= ruleNewClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNewClass=ruleNewClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewClass"


    // $ANTLR start "ruleNewClass"
    // InternalAle.g:457:1: ruleNewClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) ) ;
    public final EObject ruleNewClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_superClass_4_0 = null;

        AntlrDatatypeRuleToken lv_superClass_6_0 = null;

        EObject lv_methods_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:463:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) ) )
            // InternalAle.g:464:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) )
            {
            // InternalAle.g:464:2: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) )
            // InternalAle.g:465:3: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )? (otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' )
            {
            // InternalAle.g:465:3: ()
            // InternalAle.g:466:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNewClassAccess().getNewClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNewClassAccess().getClassKeyword_1());
              		
            }
            // InternalAle.g:476:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:477:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:477:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:478:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getNewClassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNewClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:494:3: (otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAle.g:495:4: otherlv_3= 'extends' ( (lv_superClass_4_0= ruleQualified ) ) (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNewClassAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalAle.g:499:4: ( (lv_superClass_4_0= ruleQualified ) )
                    // InternalAle.g:500:5: (lv_superClass_4_0= ruleQualified )
                    {
                    // InternalAle.g:500:5: (lv_superClass_4_0= ruleQualified )
                    // InternalAle.g:501:6: lv_superClass_4_0= ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassQualifiedParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_superClass_4_0=ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNewClassRule());
                      						}
                      						add(
                      							current,
                      							"superClass",
                      							lv_superClass_4_0,
                      							"ale.xtext.Ale.Qualified");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:518:4: (otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAle.g:519:5: otherlv_5= ',' ( (lv_superClass_6_0= ruleQualified ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNewClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:523:5: ( (lv_superClass_6_0= ruleQualified ) )
                    	    // InternalAle.g:524:6: (lv_superClass_6_0= ruleQualified )
                    	    {
                    	    // InternalAle.g:524:6: (lv_superClass_6_0= ruleQualified )
                    	    // InternalAle.g:525:7: lv_superClass_6_0= ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNewClassAccess().getSuperClassQualifiedParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_superClass_6_0=ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNewClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superClass",
                    	      								lv_superClass_6_0,
                    	      								"ale.xtext.Ale.Qualified");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:544:3: (otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' )
            // InternalAle.g:545:4: otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}'
            {
            otherlv_7=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getNewClassAccess().getLeftCurlyBracketKeyword_4_0());
              			
            }
            // InternalAle.g:549:4: ( (lv_methods_8_0= ruleMethod ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAle.g:550:5: (lv_methods_8_0= ruleMethod )
            	    {
            	    // InternalAle.g:550:5: (lv_methods_8_0= ruleMethod )
            	    // InternalAle.g:551:6: lv_methods_8_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNewClassAccess().getMethodsMethodParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_methods_8_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNewClassRule());
            	      						}
            	      						add(
            	      							current,
            	      							"methods",
            	      							lv_methods_8_0,
            	      							"ale.xtext.Ale.Method");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getNewClassAccess().getRightCurlyBracketKeyword_4_2());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewClass"


    // $ANTLR start "entryRuleMethod"
    // InternalAle.g:577:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalAle.g:577:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalAle.g:578:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalAle.g:584:1: ruleMethod returns [EObject current=null] : (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_DefMethod_0 = null;

        EObject this_OverrideMethod_1 = null;



        	enterRule();

        try {
            // InternalAle.g:590:2: ( (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) )
            // InternalAle.g:591:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            {
            // InternalAle.g:591:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAle.g:592:3: this_DefMethod_0= ruleDefMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodAccess().getDefMethodParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefMethod_0=ruleDefMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefMethod_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:601:3: this_OverrideMethod_1= ruleOverrideMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodAccess().getOverrideMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OverrideMethod_1=ruleOverrideMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OverrideMethod_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDefMethod"
    // InternalAle.g:613:1: entryRuleDefMethod returns [EObject current=null] : iv_ruleDefMethod= ruleDefMethod EOF ;
    public final EObject entryRuleDefMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMethod = null;


        try {
            // InternalAle.g:613:50: (iv_ruleDefMethod= ruleDefMethod EOF )
            // InternalAle.g:614:2: iv_ruleDefMethod= ruleDefMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefMethod=ruleDefMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefMethod"


    // $ANTLR start "ruleDefMethod"
    // InternalAle.g:620:1: ruleDefMethod returns [EObject current=null] : (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) ;
    public final EObject ruleDefMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_block_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:626:2: ( (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) )
            // InternalAle.g:627:2: (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            {
            // InternalAle.g:627:2: (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            // InternalAle.g:628:3: otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefMethodAccess().getDefKeyword_0());
              		
            }
            // InternalAle.g:632:3: ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=64 && LA14_0<=69)) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAle.g:633:4: ( (lv_type_1_0= ruleType ) )
                    {
                    // InternalAle.g:633:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:634:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:634:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:635:6: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefMethodAccess().getTypeTypeParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefMethodRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_1_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:653:4: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDefMethodAccess().getVoidKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:658:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:659:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:659:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:660:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getDefMethodAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:676:3: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' )
            // InternalAle.g:677:4: otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')'
            {
            otherlv_4=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_3_0());
              			
            }
            // InternalAle.g:681:4: ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=64 && LA16_0<=69)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAle.g:682:5: ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:682:5: ( (lv_params_5_0= ruleParam ) )
                    // InternalAle.g:683:6: (lv_params_5_0= ruleParam )
                    {
                    // InternalAle.g:683:6: (lv_params_5_0= ruleParam )
                    // InternalAle.g:684:7: lv_params_5_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_params_5_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDefMethodRule());
                      							}
                      							add(
                      								current,
                      								"params",
                      								lv_params_5_0,
                      								"ale.xtext.Ale.Param");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAle.g:701:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAle.g:702:6: otherlv_6= ',' ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_6, grammarAccess.getDefMethodAccess().getCommaKeyword_3_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:706:6: ( (lv_params_7_0= ruleParam ) )
                    	    // InternalAle.g:707:7: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalAle.g:707:7: (lv_params_7_0= ruleParam )
                    	    // InternalAle.g:708:8: lv_params_7_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDefMethodAccess().getParamsParamParserRuleCall_3_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_7_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getDefMethodRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"params",
                    	      									lv_params_7_0,
                    	      									"ale.xtext.Ale.Param");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_3_2());
              			
            }

            }

            // InternalAle.g:732:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalAle.g:733:4: (lv_block_9_0= ruleBlock )
            {
            // InternalAle.g:733:4: (lv_block_9_0= ruleBlock )
            // InternalAle.g:734:5: lv_block_9_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefMethodAccess().getBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_9_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefMethodRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_9_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefMethod"


    // $ANTLR start "entryRuleOverrideMethod"
    // InternalAle.g:755:1: entryRuleOverrideMethod returns [EObject current=null] : iv_ruleOverrideMethod= ruleOverrideMethod EOF ;
    public final EObject entryRuleOverrideMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideMethod = null;


        try {
            // InternalAle.g:755:55: (iv_ruleOverrideMethod= ruleOverrideMethod EOF )
            // InternalAle.g:756:2: iv_ruleOverrideMethod= ruleOverrideMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverrideMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOverrideMethod=ruleOverrideMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverrideMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOverrideMethod"


    // $ANTLR start "ruleOverrideMethod"
    // InternalAle.g:762:1: ruleOverrideMethod returns [EObject current=null] : (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) ) ;
    public final EObject ruleOverrideMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:768:2: ( (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:769:2: (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:769:2: (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:770:3: otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOverrideMethodAccess().getOverrideKeyword_0());
              		
            }
            // InternalAle.g:774:3: ( (lv_type_1_0= ruleType ) )
            // InternalAle.g:775:4: (lv_type_1_0= ruleType )
            {
            // InternalAle.g:775:4: (lv_type_1_0= ruleType )
            // InternalAle.g:776:5: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOverrideMethodAccess().getTypeTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:793:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:794:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:794:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:795:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getOverrideMethodAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOverrideMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:811:3: (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' )
            // InternalAle.g:812:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')'
            {
            otherlv_3=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_3_0());
              			
            }
            // InternalAle.g:816:4: ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=64 && LA18_0<=69)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAle.g:817:5: ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:817:5: ( (lv_params_4_0= ruleParam ) )
                    // InternalAle.g:818:6: (lv_params_4_0= ruleParam )
                    {
                    // InternalAle.g:818:6: (lv_params_4_0= ruleParam )
                    // InternalAle.g:819:7: lv_params_4_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_params_4_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
                      							}
                      							add(
                      								current,
                      								"params",
                      								lv_params_4_0,
                      								"ale.xtext.Ale.Param");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAle.g:836:5: (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAle.g:837:6: otherlv_5= ',' ( (lv_params_6_0= ruleParam ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getOverrideMethodAccess().getCommaKeyword_3_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:841:6: ( (lv_params_6_0= ruleParam ) )
                    	    // InternalAle.g:842:7: (lv_params_6_0= ruleParam )
                    	    {
                    	    // InternalAle.g:842:7: (lv_params_6_0= ruleParam )
                    	    // InternalAle.g:843:8: lv_params_6_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getOverrideMethodAccess().getParamsParamParserRuleCall_3_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_6_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"params",
                    	      									lv_params_6_0,
                    	      									"ale.xtext.Ale.Param");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_3_2());
              			
            }

            }

            // InternalAle.g:867:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:868:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:868:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:869:5: lv_block_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOverrideMethodAccess().getBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOverrideMethodRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_8_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverrideMethod"


    // $ANTLR start "entryRuleStatement"
    // InternalAle.g:890:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalAle.g:890:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalAle.g:891:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalAle.g:897:1: ruleStatement returns [EObject current=null] : ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_VarAssign_0 = null;

        EObject this_ForLoop_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_WhileStatement_4 = null;

        EObject this_LetStatement_5 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_Expression_9 = null;

        EObject this_DebugStatement_11 = null;



        	enterRule();

        try {
            // InternalAle.g:903:2: ( ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) ) )
            // InternalAle.g:904:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )
            {
            // InternalAle.g:904:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )
            int alt19=8;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalAle.g:905:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    {
                    // InternalAle.g:905:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    // InternalAle.g:906:4: this_VarAssign_0= ruleVarAssign otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_VarAssign_0=ruleVarAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarAssign_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:920:3: this_ForLoop_2= ruleForLoop
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForLoopParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForLoop_2=ruleForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForLoop_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:929:3: this_IfStatement_3= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_3=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:938:3: this_WhileStatement_4= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_4=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAle.g:947:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    {
                    // InternalAle.g:947:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    // InternalAle.g:948:4: this_LetStatement_5= ruleLetStatement otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_LetStatement_5=ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LetStatement_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:962:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    {
                    // InternalAle.g:962:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    // InternalAle.g:963:4: this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_ReturnStatement_7=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReturnStatement_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:977:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    {
                    // InternalAle.g:977:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    // InternalAle.g:978:4: this_Expression_9= ruleExpression otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Expression_9=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:992:3: (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' )
                    {
                    // InternalAle.g:992:3: (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' )
                    // InternalAle.g:993:4: this_DebugStatement_11= ruleDebugStatement otherlv_12= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getDebugStatementParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_DebugStatement_11=ruleDebugStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DebugStatement_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDebugStatement"
    // InternalAle.g:1010:1: entryRuleDebugStatement returns [EObject current=null] : iv_ruleDebugStatement= ruleDebugStatement EOF ;
    public final EObject entryRuleDebugStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDebugStatement = null;


        try {
            // InternalAle.g:1010:55: (iv_ruleDebugStatement= ruleDebugStatement EOF )
            // InternalAle.g:1011:2: iv_ruleDebugStatement= ruleDebugStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDebugStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDebugStatement=ruleDebugStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDebugStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDebugStatement"


    // $ANTLR start "ruleDebugStatement"
    // InternalAle.g:1017:1: ruleDebugStatement returns [EObject current=null] : ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDebugStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1023:2: ( ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalAle.g:1024:2: ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalAle.g:1024:2: ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalAle.g:1025:3: () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalAle.g:1025:3: ()
            // InternalAle.g:1026:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDebugStatementAccess().getDebugStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDebugStatementAccess().getDebugKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDebugStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1040:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalAle.g:1041:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalAle.g:1041:4: (lv_expr_3_0= ruleExpression )
            // InternalAle.g:1042:5: lv_expr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDebugStatementAccess().getExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_expr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDebugStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDebugStatementAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDebugStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAle.g:1067:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalAle.g:1067:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalAle.g:1068:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalAle.g:1074:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_returned_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1080:2: ( ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) )
            // InternalAle.g:1081:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:1081:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            // InternalAle.g:1082:3: () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) )
            {
            // InternalAle.g:1082:3: ()
            // InternalAle.g:1083:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
              		
            }
            // InternalAle.g:1093:3: ( (lv_returned_2_0= ruleExpression ) )
            // InternalAle.g:1094:4: (lv_returned_2_0= ruleExpression )
            {
            // InternalAle.g:1094:4: (lv_returned_2_0= ruleExpression )
            // InternalAle.g:1095:5: lv_returned_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnStatementAccess().getReturnedExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returned_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              					}
              					set(
              						current,
              						"returned",
              						lv_returned_2_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleLetStatement"
    // InternalAle.g:1116:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalAle.g:1116:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalAle.g:1117:2: iv_ruleLetStatement= ruleLetStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetStatement=ruleLetStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetStatement"


    // $ANTLR start "ruleLetStatement"
    // InternalAle.g:1123:1: ruleLetStatement returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) ;
    public final EObject ruleLetStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_bindings_2_0 = null;

        EObject lv_bindings_4_0 = null;

        EObject lv_block_6_1 = null;

        EObject lv_block_6_2 = null;



        	enterRule();

        try {
            // InternalAle.g:1129:2: ( ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) )
            // InternalAle.g:1130:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            {
            // InternalAle.g:1130:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            // InternalAle.g:1131:3: () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            {
            // InternalAle.g:1131:3: ()
            // InternalAle.g:1132:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetStatementAccess().getLetStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetStatementAccess().getLetKeyword_1());
              		
            }
            // InternalAle.g:1142:3: ( (lv_bindings_2_0= ruleVarAssign ) )
            // InternalAle.g:1143:4: (lv_bindings_2_0= ruleVarAssign )
            {
            // InternalAle.g:1143:4: (lv_bindings_2_0= ruleVarAssign )
            // InternalAle.g:1144:5: lv_bindings_2_0= ruleVarAssign
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_bindings_2_0=ruleVarAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetStatementRule());
              					}
              					add(
              						current,
              						"bindings",
              						lv_bindings_2_0,
              						"ale.xtext.Ale.VarAssign");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1161:3: (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAle.g:1162:4: otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getLetStatementAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAle.g:1166:4: ( (lv_bindings_4_0= ruleVarAssign ) )
            	    // InternalAle.g:1167:5: (lv_bindings_4_0= ruleVarAssign )
            	    {
            	    // InternalAle.g:1167:5: (lv_bindings_4_0= ruleVarAssign )
            	    // InternalAle.g:1168:6: lv_bindings_4_0= ruleVarAssign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetStatementAccess().getBindingsVarAssignParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_bindings_4_0=ruleVarAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetStatementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"bindings",
            	      							lv_bindings_4_0,
            	      							"ale.xtext.Ale.VarAssign");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLetStatementAccess().getInKeyword_4());
              		
            }
            // InternalAle.g:1190:3: ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            // InternalAle.g:1191:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            {
            // InternalAle.g:1191:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            // InternalAle.g:1192:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            {
            // InternalAle.g:1192:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_NULL)||LA21_0==25||LA21_0==52||(LA21_0>=55 && LA21_0<=57)||(LA21_0>=59 && LA21_0<=60)||(LA21_0>=62 && LA21_0<=65)) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAle.g:1193:6: lv_block_6_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetStatementAccess().getBlockExpressionParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_6_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetStatementRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_6_1,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:1209:6: lv_block_6_2= ruleLetStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetStatementAccess().getBlockLetStatementParserRuleCall_5_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_6_2=ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetStatementRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_6_2,
                      							"ale.xtext.Ale.LetStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalAle.g:1231:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalAle.g:1231:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalAle.g:1232:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalAle.g:1238:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_thenBranch_5_0 = null;

        EObject lv_elseBranch_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1244:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) )
            // InternalAle.g:1245:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            {
            // InternalAle.g:1245:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            // InternalAle.g:1246:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            {
            // InternalAle.g:1246:3: ()
            // InternalAle.g:1247:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1261:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1262:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1262:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1263:5: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_condition_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1284:3: ( (lv_thenBranch_5_0= ruleBlock ) )
            // InternalAle.g:1285:4: (lv_thenBranch_5_0= ruleBlock )
            {
            // InternalAle.g:1285:4: (lv_thenBranch_5_0= ruleBlock )
            // InternalAle.g:1286:5: lv_thenBranch_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBranchBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_thenBranch_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"thenBranch",
              						lv_thenBranch_5_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1303:3: (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAle.g:1304:4: otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                      			
                    }
                    // InternalAle.g:1308:4: ( (lv_elseBranch_7_0= ruleBlock ) )
                    // InternalAle.g:1309:5: (lv_elseBranch_7_0= ruleBlock )
                    {
                    // InternalAle.g:1309:5: (lv_elseBranch_7_0= ruleBlock )
                    // InternalAle.g:1310:6: lv_elseBranch_7_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBranchBlockParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBranch_7_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBranch",
                      							lv_elseBranch_7_0,
                      							"ale.xtext.Ale.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalAle.g:1332:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalAle.g:1332:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalAle.g:1333:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalAle.g:1339:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;

        EObject lv_whileBlock_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1345:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) )
            // InternalAle.g:1346:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            {
            // InternalAle.g:1346:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            // InternalAle.g:1347:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) )
            {
            // InternalAle.g:1347:3: ()
            // InternalAle.g:1348:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1362:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1363:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1363:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1364:5: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_condition_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1385:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalAle.g:1386:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalAle.g:1386:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalAle.g:1387:5: lv_whileBlock_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileBlockBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_whileBlock_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"whileBlock",
              						lv_whileBlock_5_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForLoop"
    // InternalAle.g:1408:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalAle.g:1408:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalAle.g:1409:2: iv_ruleForLoop= ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalAle.g:1415:1: ruleForLoop returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_3_0 = null;

        EObject lv_collection_6_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1421:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:1422:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:1422:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:1423:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            // InternalAle.g:1423:3: ()
            // InternalAle.g:1424:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForLoopAccess().getForLoopAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1438:3: ( (lv_type_3_0= ruleType ) )
            // InternalAle.g:1439:4: (lv_type_3_0= ruleType )
            {
            // InternalAle.g:1439:4: (lv_type_3_0= ruleType )
            // InternalAle.g:1440:5: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:1457:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:1458:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:1458:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:1459:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getForLoopAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForLoopRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getInKeyword_5());
              		
            }
            // InternalAle.g:1479:3: ( (lv_collection_6_0= ruleExpression ) )
            // InternalAle.g:1480:4: (lv_collection_6_0= ruleExpression )
            {
            // InternalAle.g:1480:4: (lv_collection_6_0= ruleExpression )
            // InternalAle.g:1481:5: lv_collection_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getCollectionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_collection_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"collection",
              						lv_collection_6_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalAle.g:1502:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:1503:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:1503:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:1504:5: lv_block_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_8_0,
              						"ale.xtext.Ale.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleBlock"
    // InternalAle.g:1525:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAle.g:1525:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalAle.g:1526:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalAle.g:1532:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1538:2: ( ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalAle.g:1539:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalAle.g:1539:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalAle.g:1540:3: () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalAle.g:1540:3: ()
            // InternalAle.g:1541:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAle.g:1551:3: ( (lv_body_2_0= ruleStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_NULL)||LA23_0==25||(LA23_0>=28 && LA23_0<=30)||LA23_0==32||(LA23_0>=34 && LA23_0<=35)||LA23_0==52||(LA23_0>=55 && LA23_0<=57)||(LA23_0>=59 && LA23_0<=60)||(LA23_0>=62 && LA23_0<=69)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAle.g:1552:4: (lv_body_2_0= ruleStatement )
            	    {
            	    // InternalAle.g:1552:4: (lv_body_2_0= ruleStatement )
            	    // InternalAle.g:1553:5: lv_body_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getBodyStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_body_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"body",
            	      						lv_body_2_0,
            	      						"ale.xtext.Ale.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVarAssign"
    // InternalAle.g:1578:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalAle.g:1578:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalAle.g:1579:2: iv_ruleVarAssign= ruleVarAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarAssign=ruleVarAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalAle.g:1585:1: ruleVarAssign returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) ) ;
    public final EObject ruleVarAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1591:2: ( ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) ) )
            // InternalAle.g:1592:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) )
            {
            // InternalAle.g:1592:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=64 && LA24_0<=69)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==RULE_ID) ) {
                    alt24=1;
                }
                else if ( (LA24_2==36) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAle.g:1593:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:1593:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    // InternalAle.g:1594:4: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
                    {
                    // InternalAle.g:1594:4: ()
                    // InternalAle.g:1595:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVarAssignAccess().getVarDeclarationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1601:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:1602:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:1602:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:1603:6: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAssignAccess().getTypeTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarAssignRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_1_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:1620:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAle.g:1621:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAle.g:1621:5: (lv_name_2_0= RULE_ID )
                    // InternalAle.g:1622:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarAssignRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_0_3());
                      			
                    }
                    // InternalAle.g:1642:4: ( (lv_value_4_0= ruleExpression ) )
                    // InternalAle.g:1643:5: (lv_value_4_0= ruleExpression )
                    {
                    // InternalAle.g:1643:5: (lv_value_4_0= ruleExpression )
                    // InternalAle.g:1644:6: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarAssignRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:1663:3: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:1663:3: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) )
                    // InternalAle.g:1664:4: () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) )
                    {
                    // InternalAle.g:1664:4: ()
                    // InternalAle.g:1665:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVarAssignAccess().getVarAssignAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1671:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalAle.g:1672:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalAle.g:1672:5: (lv_name_6_0= RULE_ID )
                    // InternalAle.g:1673:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_6_0, grammarAccess.getVarAssignAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarAssignRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAle.g:1693:4: ( (lv_value_8_0= ruleExpression ) )
                    // InternalAle.g:1694:5: (lv_value_8_0= ruleExpression )
                    {
                    // InternalAle.g:1694:5: (lv_value_8_0= ruleExpression )
                    // InternalAle.g:1695:6: lv_value_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarAssignAccess().getValueExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarAssignRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleExpression"
    // InternalAle.g:1717:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAle.g:1717:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAle.g:1718:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAle.g:1724:1: ruleExpression returns [EObject current=null] : this_ImpliesOperation_0= ruleImpliesOperation ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesOperation_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1730:2: (this_ImpliesOperation_0= ruleImpliesOperation )
            // InternalAle.g:1731:2: this_ImpliesOperation_0= ruleImpliesOperation
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getImpliesOperationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ImpliesOperation_0=ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ImpliesOperation_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImpliesOperation"
    // InternalAle.g:1742:1: entryRuleImpliesOperation returns [EObject current=null] : iv_ruleImpliesOperation= ruleImpliesOperation EOF ;
    public final EObject entryRuleImpliesOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesOperation = null;


        try {
            // InternalAle.g:1742:57: (iv_ruleImpliesOperation= ruleImpliesOperation EOF )
            // InternalAle.g:1743:2: iv_ruleImpliesOperation= ruleImpliesOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImpliesOperation=ruleImpliesOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesOperation"


    // $ANTLR start "ruleImpliesOperation"
    // InternalAle.g:1749:1: ruleImpliesOperation returns [EObject current=null] : (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) ;
    public final EObject ruleImpliesOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1755:2: ( (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) )
            // InternalAle.g:1756:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            {
            // InternalAle.g:1756:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            // InternalAle.g:1757:3: this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesOperationAccess().getBooleanOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_BooleanOperation_0=ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:1765:3: ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==37) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred1_InternalAle()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalAle.g:1766:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    {
            	    // InternalAle.g:1779:4: ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    // InternalAle.g:1780:5: ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) )
            	    {
            	    // InternalAle.g:1780:5: ( () otherlv_2= 'implies' )
            	    // InternalAle.g:1781:6: () otherlv_2= 'implies'
            	    {
            	    // InternalAle.g:1781:6: ()
            	    // InternalAle.g:1782:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1());
            	      					
            	    }

            	    }

            	    // InternalAle.g:1793:5: ( (lv_right_3_0= ruleBooleanOperation ) )
            	    // InternalAle.g:1794:6: (lv_right_3_0= ruleBooleanOperation )
            	    {
            	    // InternalAle.g:1794:6: (lv_right_3_0= ruleBooleanOperation )
            	    // InternalAle.g:1795:7: lv_right_3_0= ruleBooleanOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getImpliesOperationAccess().getRightBooleanOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleBooleanOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getImpliesOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"ale.xtext.Ale.BooleanOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesOperation"


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalAle.g:1818:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalAle.g:1818:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalAle.g:1819:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOperation=ruleBooleanOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalAle.g:1825:1: ruleBooleanOperation returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_CompareOperation_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1831:2: ( (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) )
            // InternalAle.g:1832:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            {
            // InternalAle.g:1832:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            // InternalAle.g:1833:3: this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanOperationAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:1841:3: ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA27_4 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt27=1;
                    }


                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalAle.g:1842:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    {
            	    // InternalAle.g:1869:4: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    // InternalAle.g:1870:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) )
            	    {
            	    // InternalAle.g:1870:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalAle.g:1871:6: ( () otherlv_2= 'or' )
            	            {
            	            // InternalAle.g:1871:6: ( () otherlv_2= 'or' )
            	            // InternalAle.g:1872:7: () otherlv_2= 'or'
            	            {
            	            // InternalAle.g:1872:7: ()
            	            // InternalAle.g:1873:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:1885:6: ( () otherlv_4= 'and' )
            	            {
            	            // InternalAle.g:1885:6: ( () otherlv_4= 'and' )
            	            // InternalAle.g:1886:7: () otherlv_4= 'and'
            	            {
            	            // InternalAle.g:1886:7: ()
            	            // InternalAle.g:1887:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:1899:6: ( () otherlv_6= 'xor' )
            	            {
            	            // InternalAle.g:1899:6: ( () otherlv_6= 'xor' )
            	            // InternalAle.g:1900:7: () otherlv_6= 'xor'
            	            {
            	            // InternalAle.g:1900:7: ()
            	            // InternalAle.g:1901:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,40,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:1913:5: ( (lv_right_7_0= ruleCompareOperation ) )
            	    // InternalAle.g:1914:6: (lv_right_7_0= ruleCompareOperation )
            	    {
            	    // InternalAle.g:1914:6: (lv_right_7_0= ruleCompareOperation )
            	    // InternalAle.g:1915:7: lv_right_7_0= ruleCompareOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getBooleanOperationAccess().getRightCompareOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_7_0=ruleCompareOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getBooleanOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_7_0,
            	      								"ale.xtext.Ale.CompareOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalAle.g:1938:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalAle.g:1938:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalAle.g:1939:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalAle.g:1945:1: ruleCompareOperation returns [EObject current=null] : (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_EqualityOperation_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1951:2: ( (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* ) )
            // InternalAle.g:1952:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* )
            {
            // InternalAle.g:1952:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )* )
            // InternalAle.g:1953:3: this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getEqualityOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_EqualityOperation_0=ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:1961:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalAle.g:1962:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) )
            	    {
            	    // InternalAle.g:2013:4: ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) )
            	    // InternalAle.g:2014:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) )
            	    {
            	    // InternalAle.g:2014:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) )
            	    int alt28=7;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt28=5;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt28=6;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt28=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalAle.g:2015:6: ( () otherlv_2= '<=' )
            	            {
            	            // InternalAle.g:2015:6: ( () otherlv_2= '<=' )
            	            // InternalAle.g:2016:7: () otherlv_2= '<='
            	            {
            	            // InternalAle.g:2016:7: ()
            	            // InternalAle.g:2017:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2029:6: ( () otherlv_4= '>=' )
            	            {
            	            // InternalAle.g:2029:6: ( () otherlv_4= '>=' )
            	            // InternalAle.g:2030:7: () otherlv_4= '>='
            	            {
            	            // InternalAle.g:2030:7: ()
            	            // InternalAle.g:2031:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,42,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:2043:6: ( () otherlv_6= '!=' )
            	            {
            	            // InternalAle.g:2043:6: ( () otherlv_6= '!=' )
            	            // InternalAle.g:2044:7: () otherlv_6= '!='
            	            {
            	            // InternalAle.g:2044:7: ()
            	            // InternalAle.g:2045:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,43,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalAle.g:2057:6: ( () otherlv_8= '<' )
            	            {
            	            // InternalAle.g:2057:6: ( () otherlv_8= '<' )
            	            // InternalAle.g:2058:7: () otherlv_8= '<'
            	            {
            	            // InternalAle.g:2058:7: ()
            	            // InternalAle.g:2059:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,44,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalAle.g:2071:6: ( () otherlv_10= '>' )
            	            {
            	            // InternalAle.g:2071:6: ( () otherlv_10= '>' )
            	            // InternalAle.g:2072:7: () otherlv_10= '>'
            	            {
            	            // InternalAle.g:2072:7: ()
            	            // InternalAle.g:2073:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalAle.g:2085:6: ( () otherlv_12= 'instanceof' )
            	            {
            	            // InternalAle.g:2085:6: ( () otherlv_12= 'instanceof' )
            	            // InternalAle.g:2086:7: () otherlv_12= 'instanceof'
            	            {
            	            // InternalAle.g:2086:7: ()
            	            // InternalAle.g:2087:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getInstanceofOperationLeftAction_1_0_0_5_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_12=(Token)match(input,46,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_12, grammarAccess.getCompareOperationAccess().getInstanceofKeyword_1_0_0_5_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // InternalAle.g:2099:6: ( () otherlv_14= 'castto' )
            	            {
            	            // InternalAle.g:2099:6: ( () otherlv_14= 'castto' )
            	            // InternalAle.g:2100:7: () otherlv_14= 'castto'
            	            {
            	            // InternalAle.g:2100:7: ()
            	            // InternalAle.g:2101:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCasttoOperationLeftAction_1_0_0_6_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_14=(Token)match(input,47,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_14, grammarAccess.getCompareOperationAccess().getCasttoKeyword_1_0_0_6_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2113:5: ( (lv_right_15_0= ruleEqualityOperation ) )
            	    // InternalAle.g:2114:6: (lv_right_15_0= ruleEqualityOperation )
            	    {
            	    // InternalAle.g:2114:6: (lv_right_15_0= ruleEqualityOperation )
            	    // InternalAle.g:2115:7: lv_right_15_0= ruleEqualityOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_right_15_0=ruleEqualityOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_15_0,
            	      								"ale.xtext.Ale.EqualityOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleEqualityOperation"
    // InternalAle.g:2138:1: entryRuleEqualityOperation returns [EObject current=null] : iv_ruleEqualityOperation= ruleEqualityOperation EOF ;
    public final EObject entryRuleEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperation = null;


        try {
            // InternalAle.g:2138:58: (iv_ruleEqualityOperation= ruleEqualityOperation EOF )
            // InternalAle.g:2139:2: iv_ruleEqualityOperation= ruleEqualityOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperation=ruleEqualityOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityOperation"


    // $ANTLR start "ruleEqualityOperation"
    // InternalAle.g:2145:1: ruleEqualityOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) ;
    public final EObject ruleEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MultOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2151:2: ( (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) )
            // InternalAle.g:2152:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            {
            // InternalAle.g:2152:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            // InternalAle.g:2153:3: this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityOperationAccess().getMultOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MultOperation_0=ruleMultOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2161:3: ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==48) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred4_InternalAle()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:2162:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    {
            	    // InternalAle.g:2177:4: ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    // InternalAle.g:2178:5: () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) )
            	    {
            	    // InternalAle.g:2178:5: ()
            	    // InternalAle.g:2179:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalAle.g:2185:5: ( (lv_op_2_0= '==' ) )
            	    // InternalAle.g:2186:6: (lv_op_2_0= '==' )
            	    {
            	    // InternalAle.g:2186:6: (lv_op_2_0= '==' )
            	    // InternalAle.g:2187:7: lv_op_2_0= '=='
            	    {
            	    lv_op_2_0=(Token)match(input,48,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_op_2_0, grammarAccess.getEqualityOperationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getEqualityOperationRule());
            	      							}
            	      							setWithLastConsumed(current, "op", lv_op_2_0, "==");
            	      						
            	    }

            	    }


            	    }

            	    // InternalAle.g:2199:5: ( (lv_right_3_0= ruleMultOperation ) )
            	    // InternalAle.g:2200:6: (lv_right_3_0= ruleMultOperation )
            	    {
            	    // InternalAle.g:2200:6: (lv_right_3_0= ruleMultOperation )
            	    // InternalAle.g:2201:7: lv_right_3_0= ruleMultOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getEqualityOperationAccess().getRightMultOperationParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleMultOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getEqualityOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"ale.xtext.Ale.MultOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperation"


    // $ANTLR start "entryRuleMultOperation"
    // InternalAle.g:2224:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // InternalAle.g:2224:54: (iv_ruleMultOperation= ruleMultOperation EOF )
            // InternalAle.g:2225:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultOperation=ruleMultOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultOperation"


    // $ANTLR start "ruleMultOperation"
    // InternalAle.g:2231:1: ruleMultOperation returns [EObject current=null] : (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2237:2: ( (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) )
            // InternalAle.g:2238:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            {
            // InternalAle.g:2238:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            // InternalAle.g:2239:3: this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultOperationAccess().getAddOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_AddOperation_0=ruleAddOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2247:3: ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==50) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalAle.g:2248:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    {
            	    // InternalAle.g:2269:4: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    // InternalAle.g:2270:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) )
            	    {
            	    // InternalAle.g:2270:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==49) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==50) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAle.g:2271:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalAle.g:2271:6: ( () otherlv_2= '*' )
            	            // InternalAle.g:2272:7: () otherlv_2= '*'
            	            {
            	            // InternalAle.g:2272:7: ()
            	            // InternalAle.g:2273:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getMultOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,49,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getMultOperationAccess().getAsteriskKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2285:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalAle.g:2285:6: ( () otherlv_4= '/' )
            	            // InternalAle.g:2286:7: () otherlv_4= '/'
            	            {
            	            // InternalAle.g:2286:7: ()
            	            // InternalAle.g:2287:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getMultOperationAccess().getDivOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,50,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getMultOperationAccess().getSolidusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2299:5: ( (lv_right_5_0= ruleAddOperation ) )
            	    // InternalAle.g:2300:6: (lv_right_5_0= ruleAddOperation )
            	    {
            	    // InternalAle.g:2300:6: (lv_right_5_0= ruleAddOperation )
            	    // InternalAle.g:2301:7: lv_right_5_0= ruleAddOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getMultOperationAccess().getRightAddOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_right_5_0=ruleAddOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getMultOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_5_0,
            	      								"ale.xtext.Ale.AddOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultOperation"


    // $ANTLR start "entryRuleAddOperation"
    // InternalAle.g:2324:1: entryRuleAddOperation returns [EObject current=null] : iv_ruleAddOperation= ruleAddOperation EOF ;
    public final EObject entryRuleAddOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOperation = null;


        try {
            // InternalAle.g:2324:53: (iv_ruleAddOperation= ruleAddOperation EOF )
            // InternalAle.g:2325:2: iv_ruleAddOperation= ruleAddOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddOperation=ruleAddOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddOperation"


    // $ANTLR start "ruleAddOperation"
    // InternalAle.g:2331:1: ruleAddOperation returns [EObject current=null] : (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) ;
    public final EObject ruleAddOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ChaindedCall_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2337:2: ( (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) )
            // InternalAle.g:2338:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            {
            // InternalAle.g:2338:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            // InternalAle.g:2339:3: this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddOperationAccess().getChaindedCallParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_ChaindedCall_0=ruleChaindedCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ChaindedCall_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2347:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==51) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==52) ) {
                    int LA34_3 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalAle.g:2348:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    {
            	    // InternalAle.g:2369:4: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    // InternalAle.g:2370:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) )
            	    {
            	    // InternalAle.g:2370:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==51) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==52) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalAle.g:2371:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalAle.g:2371:6: ( () otherlv_2= '+' )
            	            // InternalAle.g:2372:7: () otherlv_2= '+'
            	            {
            	            // InternalAle.g:2372:7: ()
            	            // InternalAle.g:2373:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getAddOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getAddOperationAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2385:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalAle.g:2385:6: ( () otherlv_4= '-' )
            	            // InternalAle.g:2386:7: () otherlv_4= '-'
            	            {
            	            // InternalAle.g:2386:7: ()
            	            // InternalAle.g:2387:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getAddOperationAccess().getSubOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getAddOperationAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2399:5: ( (lv_right_5_0= ruleChaindedCall ) )
            	    // InternalAle.g:2400:6: (lv_right_5_0= ruleChaindedCall )
            	    {
            	    // InternalAle.g:2400:6: (lv_right_5_0= ruleChaindedCall )
            	    // InternalAle.g:2401:7: lv_right_5_0= ruleChaindedCall
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAddOperationAccess().getRightChaindedCallParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_right_5_0=ruleChaindedCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAddOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_5_0,
            	      								"ale.xtext.Ale.ChaindedCall");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOperation"


    // $ANTLR start "entryRuleChaindedCall"
    // InternalAle.g:2424:1: entryRuleChaindedCall returns [EObject current=null] : iv_ruleChaindedCall= ruleChaindedCall EOF ;
    public final EObject entryRuleChaindedCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaindedCall = null;


        try {
            // InternalAle.g:2424:53: (iv_ruleChaindedCall= ruleChaindedCall EOF )
            // InternalAle.g:2425:2: iv_ruleChaindedCall= ruleChaindedCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChaindedCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChaindedCall=ruleChaindedCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChaindedCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChaindedCall"


    // $ANTLR start "ruleChaindedCall"
    // InternalAle.g:2431:1: ruleChaindedCall returns [EObject current=null] : (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) ;
    public final EObject ruleChaindedCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_InfixOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2437:2: ( (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) )
            // InternalAle.g:2438:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            {
            // InternalAle.g:2438:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            // InternalAle.g:2439:3: this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChaindedCallAccess().getInfixOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_InfixOperation_0=ruleInfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InfixOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAle.g:2447:3: ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==53) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==54) ) {
                    int LA36_3 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalAle.g:2448:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    {
            	    // InternalAle.g:2469:4: ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    // InternalAle.g:2470:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) )
            	    {
            	    // InternalAle.g:2470:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==53) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==54) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAle.g:2471:6: ( () otherlv_2= '.' )
            	            {
            	            // InternalAle.g:2471:6: ( () otherlv_2= '.' )
            	            // InternalAle.g:2472:7: () otherlv_2= '.'
            	            {
            	            // InternalAle.g:2472:7: ()
            	            // InternalAle.g:2473:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,53,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getChaindedCallAccess().getFullStopKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:2485:6: ( () otherlv_4= '->' )
            	            {
            	            // InternalAle.g:2485:6: ( () otherlv_4= '->' )
            	            // InternalAle.g:2486:7: () otherlv_4= '->'
            	            {
            	            // InternalAle.g:2486:7: ()
            	            // InternalAle.g:2487:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getChaindedCallAccess().getChainedCallArrowLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,54,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getChaindedCallAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:2499:5: ( (lv_right_5_0= ruleInfixOperation ) )
            	    // InternalAle.g:2500:6: (lv_right_5_0= ruleInfixOperation )
            	    {
            	    // InternalAle.g:2500:6: (lv_right_5_0= ruleInfixOperation )
            	    // InternalAle.g:2501:7: lv_right_5_0= ruleInfixOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getChaindedCallAccess().getRightInfixOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_right_5_0=ruleInfixOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getChaindedCallRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_5_0,
            	      								"ale.xtext.Ale.InfixOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChaindedCall"


    // $ANTLR start "entryRuleInfixOperation"
    // InternalAle.g:2524:1: entryRuleInfixOperation returns [EObject current=null] : iv_ruleInfixOperation= ruleInfixOperation EOF ;
    public final EObject entryRuleInfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperation = null;


        try {
            // InternalAle.g:2524:55: (iv_ruleInfixOperation= ruleInfixOperation EOF )
            // InternalAle.g:2525:2: iv_ruleInfixOperation= ruleInfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfixOperation=ruleInfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfixOperation"


    // $ANTLR start "ruleInfixOperation"
    // InternalAle.g:2531:1: ruleInfixOperation returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral ) ;
    public final EObject ruleInfixOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject this_AtomicLiteral_23 = null;



        	enterRule();

        try {
            // InternalAle.g:2537:2: ( ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral ) )
            // InternalAle.g:2538:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral )
            {
            // InternalAle.g:2538:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt39=1;
                }
                break;
            case 52:
                {
                alt39=2;
                }
                break;
            case 56:
                {
                alt39=3;
                }
                break;
            case 57:
                {
                alt39=4;
                }
                break;
            case RULE_ID:
                {
                int LA39_5 = input.LA(2);

                if ( (LA39_5==EOF||(LA39_5>=16 && LA39_5<=17)||LA39_5==22||LA39_5==26||LA39_5==31||(LA39_5>=37 && LA39_5<=54)||LA39_5==61) ) {
                    alt39=6;
                }
                else if ( (LA39_5==25) ) {
                    alt39=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case 25:
            case 59:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAle.g:2539:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2539:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalAle.g:2540:4: () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalAle.g:2540:4: ()
                    // InternalAle.g:2541:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNotInfixOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,55,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInfixOperationAccess().getNotKeyword_0_1());
                      			
                    }
                    // InternalAle.g:2551:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalAle.g:2552:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalAle.g:2552:5: (lv_expression_2_0= ruleExpression )
                    // InternalAle.g:2553:6: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2572:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2572:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    // InternalAle.g:2573:4: () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    // InternalAle.g:2573:4: ()
                    // InternalAle.g:2574:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNegInfixOperationAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInfixOperationAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalAle.g:2584:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalAle.g:2585:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalAle.g:2585:5: (lv_expression_5_0= ruleExpression )
                    // InternalAle.g:2586:6: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInfixOperationAccess().getExpressionExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:2605:3: ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' )
                    {
                    // InternalAle.g:2605:3: ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' )
                    // InternalAle.g:2606:4: () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')'
                    {
                    // InternalAle.g:2606:4: ()
                    // InternalAle.g:2607:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getNewSequenceAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,56,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getInfixOperationAccess().getNewSequenceKeyword_2_1());
                      			
                    }
                    otherlv_8=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:2621:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAle.g:2622:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAle.g:2622:5: (lv_type_9_0= ruleType )
                    // InternalAle.g:2623:6: lv_type_9_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInfixOperationAccess().getTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_type_9_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_9_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2646:3: ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' )
                    {
                    // InternalAle.g:2646:3: ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' )
                    // InternalAle.g:2647:4: () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')'
                    {
                    // InternalAle.g:2647:4: ()
                    // InternalAle.g:2648:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getConstructorOperationAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getInfixOperationAccess().getNewKeyword_3_1());
                      			
                    }
                    // InternalAle.g:2658:4: ( (lv_name_13_0= RULE_ID ) )
                    // InternalAle.g:2659:5: (lv_name_13_0= RULE_ID )
                    {
                    // InternalAle.g:2659:5: (lv_name_13_0= RULE_ID )
                    // InternalAle.g:2660:6: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_13_0, grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_3_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfixOperationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_13_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_3());
                      			
                    }
                    otherlv_15=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2686:3: ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) )
                    {
                    // InternalAle.g:2686:3: ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) )
                    // InternalAle.g:2687:4: () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' )
                    {
                    // InternalAle.g:2687:4: ()
                    // InternalAle.g:2688:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2694:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalAle.g:2695:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalAle.g:2695:5: (lv_name_17_0= RULE_ID )
                    // InternalAle.g:2696:6: lv_name_17_0= RULE_ID
                    {
                    lv_name_17_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_17_0, grammarAccess.getInfixOperationAccess().getNameIDTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInfixOperationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_17_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalAle.g:2712:4: (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' )
                    // InternalAle.g:2713:5: otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')'
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_4_2_0());
                      				
                    }
                    // InternalAle.g:2717:5: ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_NULL)||LA38_0==25||LA38_0==52||(LA38_0>=55 && LA38_0<=57)||(LA38_0>=59 && LA38_0<=60)||(LA38_0>=62 && LA38_0<=65)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAle.g:2718:6: ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )*
                            {
                            // InternalAle.g:2718:6: ( (lv_parameters_19_0= ruleParamCall ) )
                            // InternalAle.g:2719:7: (lv_parameters_19_0= ruleParamCall )
                            {
                            // InternalAle.g:2719:7: (lv_parameters_19_0= ruleParamCall )
                            // InternalAle.g:2720:8: lv_parameters_19_0= ruleParamCall
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_17);
                            lv_parameters_19_0=ruleParamCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                              								}
                              								add(
                              									current,
                              									"parameters",
                              									lv_parameters_19_0,
                              									"ale.xtext.Ale.ParamCall");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAle.g:2737:6: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==16) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalAle.g:2738:7: otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) )
                            	    {
                            	    otherlv_20=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_20, grammarAccess.getInfixOperationAccess().getCommaKeyword_4_2_1_1_0());
                            	      						
                            	    }
                            	    // InternalAle.g:2742:7: ( (lv_parameters_21_0= ruleParamCall ) )
                            	    // InternalAle.g:2743:8: (lv_parameters_21_0= ruleParamCall )
                            	    {
                            	    // InternalAle.g:2743:8: (lv_parameters_21_0= ruleParamCall )
                            	    // InternalAle.g:2744:9: lv_parameters_21_0= ruleParamCall
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getInfixOperationAccess().getParametersParamCallParserRuleCall_4_2_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_17);
                            	    lv_parameters_21_0=ruleParamCall();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getInfixOperationRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"parameters",
                            	      										lv_parameters_21_0,
                            	      										"ale.xtext.Ale.ParamCall");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_22, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_4_2_2());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2770:3: this_AtomicLiteral_23= ruleAtomicLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInfixOperationAccess().getAtomicLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AtomicLiteral_23=ruleAtomicLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicLiteral_23;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixOperation"


    // $ANTLR start "entryRuleParamCall"
    // InternalAle.g:2782:1: entryRuleParamCall returns [EObject current=null] : iv_ruleParamCall= ruleParamCall EOF ;
    public final EObject entryRuleParamCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCall = null;


        try {
            // InternalAle.g:2782:50: (iv_ruleParamCall= ruleParamCall EOF )
            // InternalAle.g:2783:2: iv_ruleParamCall= ruleParamCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamCall=ruleParamCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamCall"


    // $ANTLR start "ruleParamCall"
    // InternalAle.g:2789:1: ruleParamCall returns [EObject current=null] : ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParamCall() throws RecognitionException {
        EObject current = null;

        Token lv_lambda_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2795:2: ( ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalAle.g:2796:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:2796:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalAle.g:2797:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalAle.g:2797:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==58) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalAle.g:2798:4: ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|'
                    {
                    // InternalAle.g:2798:4: ( (lv_lambda_0_0= RULE_ID ) )
                    // InternalAle.g:2799:5: (lv_lambda_0_0= RULE_ID )
                    {
                    // InternalAle.g:2799:5: (lv_lambda_0_0= RULE_ID )
                    // InternalAle.g:2800:6: lv_lambda_0_0= RULE_ID
                    {
                    lv_lambda_0_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lambda_0_0, grammarAccess.getParamCallAccess().getLambdaIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getParamCallRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lambda",
                      							lv_lambda_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,58,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParamCallAccess().getVerticalLineKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:2821:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalAle.g:2822:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalAle.g:2822:4: (lv_expression_2_0= ruleExpression )
            // InternalAle.g:2823:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamCallAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamCallRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"ale.xtext.Ale.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamCall"


    // $ANTLR start "entryRuleAtomicLiteral"
    // InternalAle.g:2844:1: entryRuleAtomicLiteral returns [EObject current=null] : iv_ruleAtomicLiteral= ruleAtomicLiteral EOF ;
    public final EObject entryRuleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicLiteral = null;


        try {
            // InternalAle.g:2844:54: (iv_ruleAtomicLiteral= ruleAtomicLiteral EOF )
            // InternalAle.g:2845:2: iv_ruleAtomicLiteral= ruleAtomicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicLiteral=ruleAtomicLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicLiteral"


    // $ANTLR start "ruleAtomicLiteral"
    // InternalAle.g:2851:1: ruleAtomicLiteral returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_value_13_0=null;
        Token lv_value_15_0=null;
        Token lv_value_17_0=null;
        Token lv_value_19_0=null;
        Token this_NULL_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token lv_value_44_0=null;
        EObject this_Expression_1 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_start_24_0 = null;

        EObject lv_stop_27_0 = null;

        EObject lv_expressions_32_0 = null;

        EObject lv_expressions_34_0 = null;

        EObject lv_expressions_39_0 = null;

        EObject lv_expressions_41_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2857:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) )
            // InternalAle.g:2858:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            {
            // InternalAle.g:2858:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            int alt45=13;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt45=1;
                }
                break;
            case 59:
                {
                alt45=2;
                }
                break;
            case 62:
                {
                alt45=3;
                }
                break;
            case 63:
                {
                alt45=4;
                }
                break;
            case RULE_STRING:
                {
                alt45=5;
                }
                break;
            case RULE_INT:
                {
                alt45=6;
                }
                break;
            case RULE_REAL:
                {
                alt45=7;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt45=8;
                }
                break;
            case RULE_NULL:
                {
                alt45=9;
                }
                break;
            case 60:
                {
                alt45=10;
                }
                break;
            case 64:
                {
                alt45=11;
                }
                break;
            case 65:
                {
                alt45=12;
                }
                break;
            case RULE_ID:
                {
                alt45=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAle.g:2859:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAle.g:2859:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAle.g:2860:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAtomicLiteralAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2878:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalAle.g:2878:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalAle.g:2879:4: () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalAle.g:2879:4: ()
                    // InternalAle.g:2880:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOADenotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicLiteralAccess().getDollarSignKeyword_1_1());
                      			
                    }
                    otherlv_5=(Token)match(input,60,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_1_2());
                      			
                    }
                    // InternalAle.g:2894:4: ( (lv_exp_6_0= ruleExpression ) )
                    // InternalAle.g:2895:5: (lv_exp_6_0= ruleExpression )
                    {
                    // InternalAle.g:2895:5: (lv_exp_6_0= ruleExpression )
                    // InternalAle.g:2896:6: lv_exp_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_exp_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_6_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:2919:3: ( () otherlv_9= 'self' )
                    {
                    // InternalAle.g:2919:3: ( () otherlv_9= 'self' )
                    // InternalAle.g:2920:4: () otherlv_9= 'self'
                    {
                    // InternalAle.g:2920:4: ()
                    // InternalAle.g:2921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSelfRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAtomicLiteralAccess().getSelfKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2933:3: ( () otherlv_11= 'super' )
                    {
                    // InternalAle.g:2933:3: ( () otherlv_11= 'super' )
                    // InternalAle.g:2934:4: () otherlv_11= 'super'
                    {
                    // InternalAle.g:2934:4: ()
                    // InternalAle.g:2935:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSuperRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAtomicLiteralAccess().getSuperKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2947:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    {
                    // InternalAle.g:2947:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    // InternalAle.g:2948:4: () ( (lv_value_13_0= RULE_STRING ) )
                    {
                    // InternalAle.g:2948:4: ()
                    // InternalAle.g:2949:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2955:4: ( (lv_value_13_0= RULE_STRING ) )
                    // InternalAle.g:2956:5: (lv_value_13_0= RULE_STRING )
                    {
                    // InternalAle.g:2956:5: (lv_value_13_0= RULE_STRING )
                    // InternalAle.g:2957:6: lv_value_13_0= RULE_STRING
                    {
                    lv_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_13_0, grammarAccess.getAtomicLiteralAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_13_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2975:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    {
                    // InternalAle.g:2975:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    // InternalAle.g:2976:4: () ( (lv_value_15_0= RULE_INT ) )
                    {
                    // InternalAle.g:2976:4: ()
                    // InternalAle.g:2977:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2983:4: ( (lv_value_15_0= RULE_INT ) )
                    // InternalAle.g:2984:5: (lv_value_15_0= RULE_INT )
                    {
                    // InternalAle.g:2984:5: (lv_value_15_0= RULE_INT )
                    // InternalAle.g:2985:6: lv_value_15_0= RULE_INT
                    {
                    lv_value_15_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_15_0, grammarAccess.getAtomicLiteralAccess().getValueINTTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_15_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:3003:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    {
                    // InternalAle.g:3003:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    // InternalAle.g:3004:4: () ( (lv_value_17_0= RULE_REAL ) )
                    {
                    // InternalAle.g:3004:4: ()
                    // InternalAle.g:3005:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3011:4: ( (lv_value_17_0= RULE_REAL ) )
                    // InternalAle.g:3012:5: (lv_value_17_0= RULE_REAL )
                    {
                    // InternalAle.g:3012:5: (lv_value_17_0= RULE_REAL )
                    // InternalAle.g:3013:6: lv_value_17_0= RULE_REAL
                    {
                    lv_value_17_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_17_0, grammarAccess.getAtomicLiteralAccess().getValueREALTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_17_0,
                      							"ale.xtext.Ale.REAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:3031:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalAle.g:3031:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    // InternalAle.g:3032:4: () ( (lv_value_19_0= RULE_BOOLEAN ) )
                    {
                    // InternalAle.g:3032:4: ()
                    // InternalAle.g:3033:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3039:4: ( (lv_value_19_0= RULE_BOOLEAN ) )
                    // InternalAle.g:3040:5: (lv_value_19_0= RULE_BOOLEAN )
                    {
                    // InternalAle.g:3040:5: (lv_value_19_0= RULE_BOOLEAN )
                    // InternalAle.g:3041:6: lv_value_19_0= RULE_BOOLEAN
                    {
                    lv_value_19_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_19_0, grammarAccess.getAtomicLiteralAccess().getValueBOOLEANTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_19_0,
                      							"ale.xtext.Ale.BOOLEAN");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAle.g:3059:3: ( () this_NULL_21= RULE_NULL )
                    {
                    // InternalAle.g:3059:3: ( () this_NULL_21= RULE_NULL )
                    // InternalAle.g:3060:4: () this_NULL_21= RULE_NULL
                    {
                    // InternalAle.g:3060:4: ()
                    // InternalAle.g:3061:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getNullLiteralAction_8_0(),
                      						current);
                      				
                    }

                    }

                    this_NULL_21=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_NULL_21, grammarAccess.getAtomicLiteralAccess().getNULLTerminalRuleCall_8_1());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAle.g:3073:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    {
                    // InternalAle.g:3073:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    // InternalAle.g:3074:4: () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']'
                    {
                    // InternalAle.g:3074:4: ()
                    // InternalAle.g:3075:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntRangeAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,60,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getAtomicLiteralAccess().getLeftSquareBracketKeyword_9_1());
                      			
                    }
                    // InternalAle.g:3085:4: ( (lv_start_24_0= ruleExpression ) )
                    // InternalAle.g:3086:5: (lv_start_24_0= ruleExpression )
                    {
                    // InternalAle.g:3086:5: (lv_start_24_0= ruleExpression )
                    // InternalAle.g:3087:6: lv_start_24_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStartExpressionParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_start_24_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"start",
                      							lv_start_24_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,53,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_3());
                      			
                    }
                    otherlv_26=(Token)match(input,53,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getAtomicLiteralAccess().getFullStopKeyword_9_4());
                      			
                    }
                    // InternalAle.g:3112:4: ( (lv_stop_27_0= ruleExpression ) )
                    // InternalAle.g:3113:5: (lv_stop_27_0= ruleExpression )
                    {
                    // InternalAle.g:3113:5: (lv_stop_27_0= ruleExpression )
                    // InternalAle.g:3114:6: lv_stop_27_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicLiteralAccess().getStopExpressionParserRuleCall_9_5_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_stop_27_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                      						}
                      						set(
                      							current,
                      							"stop",
                      							lv_stop_27_0,
                      							"ale.xtext.Ale.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getAtomicLiteralAccess().getRightSquareBracketKeyword_9_6());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalAle.g:3137:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    {
                    // InternalAle.g:3137:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    // InternalAle.g:3138:4: () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}'
                    {
                    // InternalAle.g:3138:4: ()
                    // InternalAle.g:3139:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getSequenceDeclAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_30=(Token)match(input,64,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getAtomicLiteralAccess().getSequenceKeyword_10_1());
                      			
                    }
                    otherlv_31=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2());
                      			
                    }
                    // InternalAle.g:3153:4: ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_NULL)||LA42_0==25||LA42_0==52||(LA42_0>=55 && LA42_0<=57)||(LA42_0>=59 && LA42_0<=60)||(LA42_0>=62 && LA42_0<=65)) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAle.g:3154:5: ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3154:5: ( (lv_expressions_32_0= ruleExpression ) )
                            // InternalAle.g:3155:6: (lv_expressions_32_0= ruleExpression )
                            {
                            // InternalAle.g:3155:6: (lv_expressions_32_0= ruleExpression )
                            // InternalAle.g:3156:7: lv_expressions_32_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
                            lv_expressions_32_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                              							}
                              							add(
                              								current,
                              								"expressions",
                              								lv_expressions_32_0,
                              								"ale.xtext.Ale.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAle.g:3173:5: (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==16) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalAle.g:3174:6: otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) )
                            	    {
                            	    otherlv_33=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_33, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3178:6: ( (lv_expressions_34_0= ruleExpression ) )
                            	    // InternalAle.g:3179:7: (lv_expressions_34_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3179:7: (lv_expressions_34_0= ruleExpression )
                            	    // InternalAle.g:3180:8: lv_expressions_34_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_10_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_41);
                            	    lv_expressions_34_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"expressions",
                            	      									lv_expressions_34_0,
                            	      									"ale.xtext.Ale.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalAle.g:3205:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    {
                    // InternalAle.g:3205:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    // InternalAle.g:3206:4: () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}'
                    {
                    // InternalAle.g:3206:4: ()
                    // InternalAle.g:3207:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getOrderedSetDeclAction_11_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_37=(Token)match(input,65,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getAtomicLiteralAccess().getOrderedSetKeyword_11_1());
                      			
                    }
                    otherlv_38=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_11_2());
                      			
                    }
                    // InternalAle.g:3221:4: ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_NULL)||LA44_0==25||LA44_0==52||(LA44_0>=55 && LA44_0<=57)||(LA44_0>=59 && LA44_0<=60)||(LA44_0>=62 && LA44_0<=65)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAle.g:3222:5: ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3222:5: ( (lv_expressions_39_0= ruleExpression ) )
                            // InternalAle.g:3223:6: (lv_expressions_39_0= ruleExpression )
                            {
                            // InternalAle.g:3223:6: (lv_expressions_39_0= ruleExpression )
                            // InternalAle.g:3224:7: lv_expressions_39_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
                            lv_expressions_39_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                              							}
                              							add(
                              								current,
                              								"expressions",
                              								lv_expressions_39_0,
                              								"ale.xtext.Ale.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAle.g:3241:5: (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==16) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalAle.g:3242:6: otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) )
                            	    {
                            	    otherlv_40=(Token)match(input,16,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_40, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_11_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3246:6: ( (lv_expressions_41_0= ruleExpression ) )
                            	    // InternalAle.g:3247:7: (lv_expressions_41_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3247:7: (lv_expressions_41_0= ruleExpression )
                            	    // InternalAle.g:3248:8: lv_expressions_41_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAtomicLiteralAccess().getExpressionsExpressionParserRuleCall_11_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_41);
                            	    lv_expressions_41_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getAtomicLiteralRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"expressions",
                            	      									lv_expressions_41_0,
                            	      									"ale.xtext.Ale.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_42=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_11_4());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalAle.g:3273:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3273:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    // InternalAle.g:3274:4: () ( (lv_value_44_0= RULE_ID ) )
                    {
                    // InternalAle.g:3274:4: ()
                    // InternalAle.g:3275:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getVarRefAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3281:4: ( (lv_value_44_0= RULE_ID ) )
                    // InternalAle.g:3282:5: (lv_value_44_0= RULE_ID )
                    {
                    // InternalAle.g:3282:5: (lv_value_44_0= RULE_ID )
                    // InternalAle.g:3283:6: lv_value_44_0= RULE_ID
                    {
                    lv_value_44_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_44_0, grammarAccess.getAtomicLiteralAccess().getValueIDTerminalRuleCall_12_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_44_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicLiteral"


    // $ANTLR start "entryRuleParam"
    // InternalAle.g:3304:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalAle.g:3304:46: (iv_ruleParam= ruleParam EOF )
            // InternalAle.g:3305:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalAle.g:3311:1: ruleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3317:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAle.g:3318:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAle.g:3318:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAle.g:3319:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAle.g:3319:3: ( (lv_type_0_0= ruleType ) )
            // InternalAle.g:3320:4: (lv_type_0_0= ruleType )
            {
            // InternalAle.g:3320:4: (lv_type_0_0= ruleType )
            // InternalAle.g:3321:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"ale.xtext.Ale.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAle.g:3338:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:3339:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:3339:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:3340:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleType"
    // InternalAle.g:3360:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAle.g:3360:45: (iv_ruleType= ruleType EOF )
            // InternalAle.g:3361:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAle.g:3367:1: ruleType returns [EObject current=null] : (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_externalClass_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_LiteralType_0 = null;

        EObject lv_subType_6_0 = null;

        EObject lv_subType_11_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3373:2: ( (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) )
            // InternalAle.g:3374:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            {
            // InternalAle.g:3374:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
                {
                alt46=2;
                }
                break;
            case 64:
                {
                alt46=3;
                }
                break;
            case 65:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalAle.g:3375:3: this_LiteralType_0= ruleLiteralType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getLiteralTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralType_0=ruleLiteralType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:3384:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3384:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    // InternalAle.g:3385:4: () ( (lv_externalClass_2_0= RULE_ID ) )
                    {
                    // InternalAle.g:3385:4: ()
                    // InternalAle.g:3386:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3392:4: ( (lv_externalClass_2_0= RULE_ID ) )
                    // InternalAle.g:3393:5: (lv_externalClass_2_0= RULE_ID )
                    {
                    // InternalAle.g:3393:5: (lv_externalClass_2_0= RULE_ID )
                    // InternalAle.g:3394:6: lv_externalClass_2_0= RULE_ID
                    {
                    lv_externalClass_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_externalClass_2_0, grammarAccess.getTypeAccess().getExternalClassIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"externalClass",
                      							lv_externalClass_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3412:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    {
                    // InternalAle.g:3412:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    // InternalAle.g:3413:4: () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')'
                    {
                    // InternalAle.g:3413:4: ()
                    // InternalAle.g:3414:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getSequenceTypeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,64,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getSequenceKeyword_2_1());
                      			
                    }
                    otherlv_5=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:3428:4: ( (lv_subType_6_0= ruleType ) )
                    // InternalAle.g:3429:5: (lv_subType_6_0= ruleType )
                    {
                    // InternalAle.g:3429:5: (lv_subType_6_0= ruleType )
                    // InternalAle.g:3430:6: lv_subType_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_subType_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeRule());
                      						}
                      						set(
                      							current,
                      							"subType",
                      							lv_subType_6_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3453:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    {
                    // InternalAle.g:3453:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    // InternalAle.g:3454:4: () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')'
                    {
                    // InternalAle.g:3454:4: ()
                    // InternalAle.g:3455:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOrderedSetTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,65,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getOrderedSetKeyword_3_1());
                      			
                    }
                    otherlv_10=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalAle.g:3469:4: ( (lv_subType_11_0= ruleType ) )
                    // InternalAle.g:3470:5: (lv_subType_11_0= ruleType )
                    {
                    // InternalAle.g:3470:5: (lv_subType_11_0= ruleType )
                    // InternalAle.g:3471:6: lv_subType_11_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSubTypeTypeParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_subType_11_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeRule());
                      						}
                      						set(
                      							current,
                      							"subType",
                      							lv_subType_11_0,
                      							"ale.xtext.Ale.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteralType"
    // InternalAle.g:3497:1: entryRuleLiteralType returns [EObject current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final EObject entryRuleLiteralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralType = null;


        try {
            // InternalAle.g:3497:52: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalAle.g:3498:2: iv_ruleLiteralType= ruleLiteralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralType=ruleLiteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralType"


    // $ANTLR start "ruleLiteralType"
    // InternalAle.g:3504:1: ruleLiteralType returns [EObject current=null] : ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) ) ;
    public final EObject ruleLiteralType() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_1=null;
        Token lv_lit_0_2=null;
        Token lv_lit_0_3=null;
        Token lv_lit_0_4=null;


        	enterRule();

        try {
            // InternalAle.g:3510:2: ( ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) ) )
            // InternalAle.g:3511:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) )
            {
            // InternalAle.g:3511:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) )
            // InternalAle.g:3512:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) )
            {
            // InternalAle.g:3512:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) )
            // InternalAle.g:3513:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' )
            {
            // InternalAle.g:3513:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt47=1;
                }
                break;
            case 67:
                {
                alt47=2;
                }
                break;
            case 68:
                {
                alt47=3;
                }
                break;
            case 69:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalAle.g:3514:5: lv_lit_0_1= 'Boolean'
                    {
                    lv_lit_0_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_1, grammarAccess.getLiteralTypeAccess().getLitBooleanKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAle.g:3525:5: lv_lit_0_2= 'Float'
                    {
                    lv_lit_0_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_2, grammarAccess.getLiteralTypeAccess().getLitFloatKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAle.g:3536:5: lv_lit_0_3= 'Integer'
                    {
                    lv_lit_0_3=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_3, grammarAccess.getLiteralTypeAccess().getLitIntegerKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalAle.g:3547:5: lv_lit_0_4= 'String'
                    {
                    lv_lit_0_4=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_lit_0_4, grammarAccess.getLiteralTypeAccess().getLitStringKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLiteralTypeRule());
                      					}
                      					setWithLastConsumed(current, "lit", lv_lit_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralType"


    // $ANTLR start "entryRuleQualified"
    // InternalAle.g:3563:1: entryRuleQualified returns [String current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final String entryRuleQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified = null;


        try {
            // InternalAle.g:3563:49: (iv_ruleQualified= ruleQualified EOF )
            // InternalAle.g:3564:2: iv_ruleQualified= ruleQualified EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualified=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualified.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalAle.g:3570:1: ruleQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAle.g:3576:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAle.g:3577:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAle.g:3577:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAle.g:3578:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAle.g:3585:3: (kw= '.' this_ID_2= RULE_ID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==53) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAle.g:3586:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualified"


    // $ANTLR start "entryRuleTypeSystem"
    // InternalAle.g:3603:1: entryRuleTypeSystem returns [EObject current=null] : iv_ruleTypeSystem= ruleTypeSystem EOF ;
    public final EObject entryRuleTypeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSystem = null;


        try {
            // InternalAle.g:3603:51: (iv_ruleTypeSystem= ruleTypeSystem EOF )
            // InternalAle.g:3604:2: iv_ruleTypeSystem= ruleTypeSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSystem=ruleTypeSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSystem"


    // $ANTLR start "ruleTypeSystem"
    // InternalAle.g:3610:1: ruleTypeSystem returns [EObject current=null] : ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) ;
    public final EObject ruleTypeSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_subType_12_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3616:2: ( ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) ) )
            // InternalAle.g:3617:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            {
            // InternalAle.g:3617:2: ( ( () otherlv_1= 'Boolean' ) | ( () otherlv_3= 'Float' ) | ( () otherlv_5= 'Int' ) | ( () otherlv_7= 'String' ) | ( () otherlv_9= 'nulltype' ) | ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) ) | ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) ) )
            int alt49=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt49=1;
                }
                break;
            case 67:
                {
                alt49=2;
                }
                break;
            case 70:
                {
                alt49=3;
                }
                break;
            case 69:
                {
                alt49=4;
                }
                break;
            case 71:
                {
                alt49=5;
                }
                break;
            case 64:
                {
                alt49=6;
                }
                break;
            case 20:
                {
                alt49=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalAle.g:3618:3: ( () otherlv_1= 'Boolean' )
                    {
                    // InternalAle.g:3618:3: ( () otherlv_1= 'Boolean' )
                    // InternalAle.g:3619:4: () otherlv_1= 'Boolean'
                    {
                    // InternalAle.g:3619:4: ()
                    // InternalAle.g:3620:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getBooleanTypeTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeSystemAccess().getBooleanKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:3632:3: ( () otherlv_3= 'Float' )
                    {
                    // InternalAle.g:3632:3: ( () otherlv_3= 'Float' )
                    // InternalAle.g:3633:4: () otherlv_3= 'Float'
                    {
                    // InternalAle.g:3633:4: ()
                    // InternalAle.g:3634:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getFLoatTypeTAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeSystemAccess().getFloatKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAle.g:3646:3: ( () otherlv_5= 'Int' )
                    {
                    // InternalAle.g:3646:3: ( () otherlv_5= 'Int' )
                    // InternalAle.g:3647:4: () otherlv_5= 'Int'
                    {
                    // InternalAle.g:3647:4: ()
                    // InternalAle.g:3648:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getIntTypeTAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeSystemAccess().getIntKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3660:3: ( () otherlv_7= 'String' )
                    {
                    // InternalAle.g:3660:3: ( () otherlv_7= 'String' )
                    // InternalAle.g:3661:4: () otherlv_7= 'String'
                    {
                    // InternalAle.g:3661:4: ()
                    // InternalAle.g:3662:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getStringTypeTAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeSystemAccess().getStringKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:3674:3: ( () otherlv_9= 'nulltype' )
                    {
                    // InternalAle.g:3674:3: ( () otherlv_9= 'nulltype' )
                    // InternalAle.g:3675:4: () otherlv_9= 'nulltype'
                    {
                    // InternalAle.g:3675:4: ()
                    // InternalAle.g:3676:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getNullTypeTAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTypeSystemAccess().getNulltypeKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:3688:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    {
                    // InternalAle.g:3688:3: ( () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) ) )
                    // InternalAle.g:3689:4: () otherlv_11= 'Sequence' ( (lv_subType_12_0= ruleTypeSystem ) )
                    {
                    // InternalAle.g:3689:4: ()
                    // InternalAle.g:3690:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getSequenceTypeTAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,64,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTypeSystemAccess().getSequenceKeyword_5_1());
                      			
                    }
                    // InternalAle.g:3700:4: ( (lv_subType_12_0= ruleTypeSystem ) )
                    // InternalAle.g:3701:5: (lv_subType_12_0= ruleTypeSystem )
                    {
                    // InternalAle.g:3701:5: (lv_subType_12_0= ruleTypeSystem )
                    // InternalAle.g:3702:6: lv_subType_12_0= ruleTypeSystem
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeSystemAccess().getSubTypeTypeSystemParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_subType_12_0=ruleTypeSystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeSystemRule());
                      						}
                      						set(
                      							current,
                      							"subType",
                      							lv_subType_12_0,
                      							"ale.xtext.Ale.TypeSystem");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:3721:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    {
                    // InternalAle.g:3721:3: ( () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) ) )
                    // InternalAle.g:3722:4: () otherlv_14= 'class' ( (otherlv_15= RULE_ID ) )
                    {
                    // InternalAle.g:3722:4: ()
                    // InternalAle.g:3723:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeSystemAccess().getClassTypeTAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTypeSystemAccess().getClassKeyword_6_1());
                      			
                    }
                    // InternalAle.g:3733:4: ( (otherlv_15= RULE_ID ) )
                    // InternalAle.g:3734:5: (otherlv_15= RULE_ID )
                    {
                    // InternalAle.g:3734:5: (otherlv_15= RULE_ID )
                    // InternalAle.g:3735:6: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeSystemRule());
                      						}
                      					
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_15, grammarAccess.getTypeSystemAccess().getClazzAleClassCrossReference_6_2_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSystem"

    // $ANTLR start synpred1_InternalAle
    public final void synpred1_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:1766:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )
        // InternalAle.g:1766:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        {
        // InternalAle.g:1766:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        // InternalAle.g:1767:5: ( () 'implies' ) ( ( ruleBooleanOperation ) )
        {
        // InternalAle.g:1767:5: ( () 'implies' )
        // InternalAle.g:1768:6: () 'implies'
        {
        // InternalAle.g:1768:6: ()
        // InternalAle.g:1769:6: 
        {
        }

        match(input,37,FOLLOW_20); if (state.failed) return ;

        }

        // InternalAle.g:1772:5: ( ( ruleBooleanOperation ) )
        // InternalAle.g:1773:6: ( ruleBooleanOperation )
        {
        // InternalAle.g:1773:6: ( ruleBooleanOperation )
        // InternalAle.g:1774:7: ruleBooleanOperation
        {
        pushFollow(FOLLOW_2);
        ruleBooleanOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalAle

    // $ANTLR start synpred2_InternalAle
    public final void synpred2_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:1842:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )
        // InternalAle.g:1842:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        {
        // InternalAle.g:1842:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        // InternalAle.g:1843:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) )
        {
        // InternalAle.g:1843:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) )
        int alt50=3;
        switch ( input.LA(1) ) {
        case 38:
            {
            alt50=1;
            }
            break;
        case 39:
            {
            alt50=2;
            }
            break;
        case 40:
            {
            alt50=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 50, 0, input);

            throw nvae;
        }

        switch (alt50) {
            case 1 :
                // InternalAle.g:1844:6: ( () 'or' )
                {
                // InternalAle.g:1844:6: ( () 'or' )
                // InternalAle.g:1845:7: () 'or'
                {
                // InternalAle.g:1845:7: ()
                // InternalAle.g:1846:7: 
                {
                }

                match(input,38,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1850:6: ( () 'and' )
                {
                // InternalAle.g:1850:6: ( () 'and' )
                // InternalAle.g:1851:7: () 'and'
                {
                // InternalAle.g:1851:7: ()
                // InternalAle.g:1852:7: 
                {
                }

                match(input,39,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1856:6: ( () 'xor' )
                {
                // InternalAle.g:1856:6: ( () 'xor' )
                // InternalAle.g:1857:7: () 'xor'
                {
                // InternalAle.g:1857:7: ()
                // InternalAle.g:1858:7: 
                {
                }

                match(input,40,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:1862:5: ( ( ruleCompareOperation ) )
        // InternalAle.g:1863:6: ( ruleCompareOperation )
        {
        // InternalAle.g:1863:6: ( ruleCompareOperation )
        // InternalAle.g:1864:7: ruleCompareOperation
        {
        pushFollow(FOLLOW_2);
        ruleCompareOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalAle

    // $ANTLR start synpred3_InternalAle
    public final void synpred3_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:1962:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )
        // InternalAle.g:1962:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) )
        {
        // InternalAle.g:1962:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) )
        // InternalAle.g:1963:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) )
        {
        // InternalAle.g:1963:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) )
        int alt51=7;
        switch ( input.LA(1) ) {
        case 41:
            {
            alt51=1;
            }
            break;
        case 42:
            {
            alt51=2;
            }
            break;
        case 43:
            {
            alt51=3;
            }
            break;
        case 44:
            {
            alt51=4;
            }
            break;
        case 45:
            {
            alt51=5;
            }
            break;
        case 46:
            {
            alt51=6;
            }
            break;
        case 47:
            {
            alt51=7;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 51, 0, input);

            throw nvae;
        }

        switch (alt51) {
            case 1 :
                // InternalAle.g:1964:6: ( () '<=' )
                {
                // InternalAle.g:1964:6: ( () '<=' )
                // InternalAle.g:1965:7: () '<='
                {
                // InternalAle.g:1965:7: ()
                // InternalAle.g:1966:7: 
                {
                }

                match(input,41,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1970:6: ( () '>=' )
                {
                // InternalAle.g:1970:6: ( () '>=' )
                // InternalAle.g:1971:7: () '>='
                {
                // InternalAle.g:1971:7: ()
                // InternalAle.g:1972:7: 
                {
                }

                match(input,42,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1976:6: ( () '!=' )
                {
                // InternalAle.g:1976:6: ( () '!=' )
                // InternalAle.g:1977:7: () '!='
                {
                // InternalAle.g:1977:7: ()
                // InternalAle.g:1978:7: 
                {
                }

                match(input,43,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalAle.g:1982:6: ( () '<' )
                {
                // InternalAle.g:1982:6: ( () '<' )
                // InternalAle.g:1983:7: () '<'
                {
                // InternalAle.g:1983:7: ()
                // InternalAle.g:1984:7: 
                {
                }

                match(input,44,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalAle.g:1988:6: ( () '>' )
                {
                // InternalAle.g:1988:6: ( () '>' )
                // InternalAle.g:1989:7: () '>'
                {
                // InternalAle.g:1989:7: ()
                // InternalAle.g:1990:7: 
                {
                }

                match(input,45,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 6 :
                // InternalAle.g:1994:6: ( () 'instanceof' )
                {
                // InternalAle.g:1994:6: ( () 'instanceof' )
                // InternalAle.g:1995:7: () 'instanceof'
                {
                // InternalAle.g:1995:7: ()
                // InternalAle.g:1996:7: 
                {
                }

                match(input,46,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 7 :
                // InternalAle.g:2000:6: ( () 'castto' )
                {
                // InternalAle.g:2000:6: ( () 'castto' )
                // InternalAle.g:2001:7: () 'castto'
                {
                // InternalAle.g:2001:7: ()
                // InternalAle.g:2002:7: 
                {
                }

                match(input,47,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2006:5: ( ( ruleEqualityOperation ) )
        // InternalAle.g:2007:6: ( ruleEqualityOperation )
        {
        // InternalAle.g:2007:6: ( ruleEqualityOperation )
        // InternalAle.g:2008:7: ruleEqualityOperation
        {
        pushFollow(FOLLOW_2);
        ruleEqualityOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalAle

    // $ANTLR start synpred4_InternalAle
    public final void synpred4_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2162:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )
        // InternalAle.g:2162:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        {
        // InternalAle.g:2162:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        // InternalAle.g:2163:5: () ( ( '==' ) ) ( ( ruleMultOperation ) )
        {
        // InternalAle.g:2163:5: ()
        // InternalAle.g:2164:5: 
        {
        }

        // InternalAle.g:2165:5: ( ( '==' ) )
        // InternalAle.g:2166:6: ( '==' )
        {
        // InternalAle.g:2166:6: ( '==' )
        // InternalAle.g:2167:7: '=='
        {
        match(input,48,FOLLOW_20); if (state.failed) return ;

        }


        }

        // InternalAle.g:2170:5: ( ( ruleMultOperation ) )
        // InternalAle.g:2171:6: ( ruleMultOperation )
        {
        // InternalAle.g:2171:6: ( ruleMultOperation )
        // InternalAle.g:2172:7: ruleMultOperation
        {
        pushFollow(FOLLOW_2);
        ruleMultOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalAle

    // $ANTLR start synpred5_InternalAle
    public final void synpred5_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2248:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )
        // InternalAle.g:2248:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        {
        // InternalAle.g:2248:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        // InternalAle.g:2249:5: ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) )
        {
        // InternalAle.g:2249:5: ( ( () '*' ) | ( () '/' ) )
        int alt52=2;
        int LA52_0 = input.LA(1);

        if ( (LA52_0==49) ) {
            alt52=1;
        }
        else if ( (LA52_0==50) ) {
            alt52=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 52, 0, input);

            throw nvae;
        }
        switch (alt52) {
            case 1 :
                // InternalAle.g:2250:6: ( () '*' )
                {
                // InternalAle.g:2250:6: ( () '*' )
                // InternalAle.g:2251:7: () '*'
                {
                // InternalAle.g:2251:7: ()
                // InternalAle.g:2252:7: 
                {
                }

                match(input,49,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2256:6: ( () '/' )
                {
                // InternalAle.g:2256:6: ( () '/' )
                // InternalAle.g:2257:7: () '/'
                {
                // InternalAle.g:2257:7: ()
                // InternalAle.g:2258:7: 
                {
                }

                match(input,50,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2262:5: ( ( ruleAddOperation ) )
        // InternalAle.g:2263:6: ( ruleAddOperation )
        {
        // InternalAle.g:2263:6: ( ruleAddOperation )
        // InternalAle.g:2264:7: ruleAddOperation
        {
        pushFollow(FOLLOW_2);
        ruleAddOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalAle

    // $ANTLR start synpred6_InternalAle
    public final void synpred6_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2348:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )
        // InternalAle.g:2348:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        {
        // InternalAle.g:2348:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        // InternalAle.g:2349:5: ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) )
        {
        // InternalAle.g:2349:5: ( ( () '+' ) | ( () '-' ) )
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( (LA53_0==51) ) {
            alt53=1;
        }
        else if ( (LA53_0==52) ) {
            alt53=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 53, 0, input);

            throw nvae;
        }
        switch (alt53) {
            case 1 :
                // InternalAle.g:2350:6: ( () '+' )
                {
                // InternalAle.g:2350:6: ( () '+' )
                // InternalAle.g:2351:7: () '+'
                {
                // InternalAle.g:2351:7: ()
                // InternalAle.g:2352:7: 
                {
                }

                match(input,51,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2356:6: ( () '-' )
                {
                // InternalAle.g:2356:6: ( () '-' )
                // InternalAle.g:2357:7: () '-'
                {
                // InternalAle.g:2357:7: ()
                // InternalAle.g:2358:7: 
                {
                }

                match(input,52,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2362:5: ( ( ruleChaindedCall ) )
        // InternalAle.g:2363:6: ( ruleChaindedCall )
        {
        // InternalAle.g:2363:6: ( ruleChaindedCall )
        // InternalAle.g:2364:7: ruleChaindedCall
        {
        pushFollow(FOLLOW_2);
        ruleChaindedCall();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalAle

    // $ANTLR start synpred7_InternalAle
    public final void synpred7_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:2448:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )
        // InternalAle.g:2448:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        {
        // InternalAle.g:2448:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        // InternalAle.g:2449:5: ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) )
        {
        // InternalAle.g:2449:5: ( ( () '.' ) | ( () '->' ) )
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( (LA54_0==53) ) {
            alt54=1;
        }
        else if ( (LA54_0==54) ) {
            alt54=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 54, 0, input);

            throw nvae;
        }
        switch (alt54) {
            case 1 :
                // InternalAle.g:2450:6: ( () '.' )
                {
                // InternalAle.g:2450:6: ( () '.' )
                // InternalAle.g:2451:7: () '.'
                {
                // InternalAle.g:2451:7: ()
                // InternalAle.g:2452:7: 
                {
                }

                match(input,53,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2456:6: ( () '->' )
                {
                // InternalAle.g:2456:6: ( () '->' )
                // InternalAle.g:2457:7: () '->'
                {
                // InternalAle.g:2457:7: ()
                // InternalAle.g:2458:7: 
                {
                }

                match(input,54,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2462:5: ( ( ruleInfixOperation ) )
        // InternalAle.g:2463:6: ( ruleInfixOperation )
        {
        // InternalAle.g:2463:6: ( ruleInfixOperation )
        // InternalAle.g:2464:7: ruleInfixOperation
        {
        pushFollow(FOLLOW_2);
        ruleInfixOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalAle

    // Delegated rules

    public final boolean synpred1_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalAle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalAle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\5\2\25\7\uffff";
    static final String dfa_3s = "\1\105\1\uffff\1\66\2\31\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\1\2\4\12\17\uffff\1\12\2\uffff\1\13\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\20\uffff\1\12\2\uffff\3\12\1\uffff\2\12\1\uffff\2\12\1\3\1\4\4\1",
            "",
            "\1\1\13\uffff\1\12\7\uffff\1\12\12\uffff\1\1\22\12",
            "\1\12\3\uffff\1\1",
            "\1\12\3\uffff\1\1",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "904:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\1\11\uffff";
    static final String dfa_9s = "\1\20\1\uffff\7\0\1\uffff";
    static final String dfa_10s = "\1\75\1\uffff\7\0\1\uffff";
    static final String dfa_11s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_12s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_13s = {
            "\2\1\4\uffff\1\1\3\uffff\1\1\4\uffff\1\1\5\uffff\4\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\1\6\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1961:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) | ( () 'instanceof' ) | ( () 'castto' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) | ( () otherlv_12= 'instanceof' ) | ( () otherlv_14= 'castto' ) ) ( (lv_right_15_0= ruleEqualityOperation ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAle()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000020L,0x000000000000003FL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000020L,0x000000000000003FL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L,0x000000000000003FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xDB900000020003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xDB900000420003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xDB90000D724003F0L,0x000000000000003FL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000FE0000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xDB900000060003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xDB900000024003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000EDL});

}