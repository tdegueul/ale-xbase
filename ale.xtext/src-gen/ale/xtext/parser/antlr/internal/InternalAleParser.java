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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "';'", "'import'", "'ale'", "'ecore'", "'open'", "'class'", "'extends'", "','", "'{'", "'}'", "'def'", "'void'", "'('", "')'", "'override'", "'debug'", "'return'", "'let'", "'in'", "'if'", "'else'", "'while'", "'for'", "'='", "'implies'", "'or'", "'and'", "'xor'", "'<='", "'>='", "'!='", "'<'", "'>'", "'=='", "'*'", "'/'", "'+'", "'-'", "'.'", "'->'", "'not'", "'newSequence'", "'new'", "'|'", "'$'", "'['", "']'", "'self'", "'super'", "'Sequence'", "'OrderedSet'", "'Boolean'", "'Float'", "'Integer'", "'String'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    // InternalAle.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_importsEcore_3_0= ruleImportEcore ) )* ( (lv_importsAle_4_0= ruleImportAle ) )* ( (lv_classes_5_0= ruleAleClass ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_importsEcore_3_0 = null;

        EObject lv_importsAle_4_0 = null;

        EObject lv_classes_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:77:2: ( (otherlv_0= 'behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_importsEcore_3_0= ruleImportEcore ) )* ( (lv_importsAle_4_0= ruleImportAle ) )* ( (lv_classes_5_0= ruleAleClass ) )* ) )
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_importsEcore_3_0= ruleImportEcore ) )* ( (lv_importsAle_4_0= ruleImportAle ) )* ( (lv_classes_5_0= ruleAleClass ) )* )
            {
            // InternalAle.g:78:2: (otherlv_0= 'behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_importsEcore_3_0= ruleImportEcore ) )* ( (lv_importsAle_4_0= ruleImportAle ) )* ( (lv_classes_5_0= ruleAleClass ) )* )
            // InternalAle.g:79:3: otherlv_0= 'behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_importsEcore_3_0= ruleImportEcore ) )* ( (lv_importsAle_4_0= ruleImportAle ) )* ( (lv_classes_5_0= ruleAleClass ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getBehaviorKeyword_0());
              		
            }
            // InternalAle.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRootAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRootRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getSemicolonKeyword_2());
              		
            }
            // InternalAle.g:105:3: ( (lv_importsEcore_3_0= ruleImportEcore ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==18) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalAle.g:106:4: (lv_importsEcore_3_0= ruleImportEcore )
            	    {
            	    // InternalAle.g:106:4: (lv_importsEcore_3_0= ruleImportEcore )
            	    // InternalAle.g:107:5: lv_importsEcore_3_0= ruleImportEcore
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getImportsEcoreImportEcoreParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_importsEcore_3_0=ruleImportEcore();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"importsEcore",
            	      						lv_importsEcore_3_0,
            	      						"ale.xtext.Ale.ImportEcore");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAle.g:124:3: ( (lv_importsAle_4_0= ruleImportAle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAle.g:125:4: (lv_importsAle_4_0= ruleImportAle )
            	    {
            	    // InternalAle.g:125:4: (lv_importsAle_4_0= ruleImportAle )
            	    // InternalAle.g:126:5: lv_importsAle_4_0= ruleImportAle
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getImportsAleImportAleParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_importsAle_4_0=ruleImportAle();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"importsAle",
            	      						lv_importsAle_4_0,
            	      						"ale.xtext.Ale.ImportAle");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAle.g:143:3: ( (lv_classes_5_0= ruleAleClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAle.g:144:4: (lv_classes_5_0= ruleAleClass )
            	    {
            	    // InternalAle.g:144:4: (lv_classes_5_0= ruleAleClass )
            	    // InternalAle.g:145:5: lv_classes_5_0= ruleAleClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRootAccess().getClassesAleClassParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_5_0=ruleAleClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_5_0,
            	      						"ale.xtext.Ale.AleClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleImportAle"
    // InternalAle.g:166:1: entryRuleImportAle returns [EObject current=null] : iv_ruleImportAle= ruleImportAle EOF ;
    public final EObject entryRuleImportAle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportAle = null;


        try {
            // InternalAle.g:166:50: (iv_ruleImportAle= ruleImportAle EOF )
            // InternalAle.g:167:2: iv_ruleImportAle= ruleImportAle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportAleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportAle=ruleImportAle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportAle; 
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
    // $ANTLR end "entryRuleImportAle"


    // $ANTLR start "ruleImportAle"
    // InternalAle.g:173:1: ruleImportAle returns [EObject current=null] : ( () otherlv_1= 'import' otherlv_2= 'ale' ( ( ruleQualified ) ) otherlv_4= ';' ) ;
    public final EObject ruleImportAle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAle.g:179:2: ( ( () otherlv_1= 'import' otherlv_2= 'ale' ( ( ruleQualified ) ) otherlv_4= ';' ) )
            // InternalAle.g:180:2: ( () otherlv_1= 'import' otherlv_2= 'ale' ( ( ruleQualified ) ) otherlv_4= ';' )
            {
            // InternalAle.g:180:2: ( () otherlv_1= 'import' otherlv_2= 'ale' ( ( ruleQualified ) ) otherlv_4= ';' )
            // InternalAle.g:181:3: () otherlv_1= 'import' otherlv_2= 'ale' ( ( ruleQualified ) ) otherlv_4= ';'
            {
            // InternalAle.g:181:3: ()
            // InternalAle.g:182:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImportAleAccess().getImportAleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportAleAccess().getImportKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAleAccess().getAleKeyword_2());
              		
            }
            // InternalAle.g:196:3: ( ( ruleQualified ) )
            // InternalAle.g:197:4: ( ruleQualified )
            {
            // InternalAle.g:197:4: ( ruleQualified )
            // InternalAle.g:198:5: ruleQualified
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportAleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAleAccess().getRefRootCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getImportAleAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleImportAle"


    // $ANTLR start "entryRuleImportEcore"
    // InternalAle.g:220:1: entryRuleImportEcore returns [EObject current=null] : iv_ruleImportEcore= ruleImportEcore EOF ;
    public final EObject entryRuleImportEcore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportEcore = null;


        try {
            // InternalAle.g:220:52: (iv_ruleImportEcore= ruleImportEcore EOF )
            // InternalAle.g:221:2: iv_ruleImportEcore= ruleImportEcore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportEcoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportEcore=ruleImportEcore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportEcore; 
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
    // $ANTLR end "entryRuleImportEcore"


    // $ANTLR start "ruleImportEcore"
    // InternalAle.g:227:1: ruleImportEcore returns [EObject current=null] : ( () otherlv_1= 'import' otherlv_2= 'ecore' ( (lv_ref_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleImportEcore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_ref_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAle.g:233:2: ( ( () otherlv_1= 'import' otherlv_2= 'ecore' ( (lv_ref_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalAle.g:234:2: ( () otherlv_1= 'import' otherlv_2= 'ecore' ( (lv_ref_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalAle.g:234:2: ( () otherlv_1= 'import' otherlv_2= 'ecore' ( (lv_ref_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalAle.g:235:3: () otherlv_1= 'import' otherlv_2= 'ecore' ( (lv_ref_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // InternalAle.g:235:3: ()
            // InternalAle.g:236:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImportEcoreAccess().getImportEcoreAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportEcoreAccess().getImportKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportEcoreAccess().getEcoreKeyword_2());
              		
            }
            // InternalAle.g:250:3: ( (lv_ref_3_0= RULE_STRING ) )
            // InternalAle.g:251:4: (lv_ref_3_0= RULE_STRING )
            {
            // InternalAle.g:251:4: (lv_ref_3_0= RULE_STRING )
            // InternalAle.g:252:5: lv_ref_3_0= RULE_STRING
            {
            lv_ref_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ref_3_0, grammarAccess.getImportEcoreAccess().getRefSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportEcoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ref",
              						lv_ref_3_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getImportEcoreAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleImportEcore"


    // $ANTLR start "entryRuleAleClass"
    // InternalAle.g:276:1: entryRuleAleClass returns [EObject current=null] : iv_ruleAleClass= ruleAleClass EOF ;
    public final EObject entryRuleAleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAleClass = null;


        try {
            // InternalAle.g:276:49: (iv_ruleAleClass= ruleAleClass EOF )
            // InternalAle.g:277:2: iv_ruleAleClass= ruleAleClass EOF
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
    // InternalAle.g:283:1: ruleAleClass returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) ;
    public final EObject ruleAleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_methods_9_0 = null;



        	enterRule();

        try {
            // InternalAle.g:289:2: ( ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) ) )
            // InternalAle.g:290:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            {
            // InternalAle.g:290:2: ( () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' ) )
            // InternalAle.g:291:3: () otherlv_1= 'open' otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )? (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            {
            // InternalAle.g:291:3: ()
            // InternalAle.g:292:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAleClassAccess().getAleClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAleClassAccess().getOpenKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAleClassAccess().getClassKeyword_2());
              		
            }
            // InternalAle.g:306:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:307:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:307:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:308:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getAleClassAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAleClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAle.g:324:3: (otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:325:4: otherlv_4= 'extends' ( ( ruleQualified ) ) (otherlv_6= ',' ( ( ruleQualified ) ) )*
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAleClassAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalAle.g:329:4: ( ( ruleQualified ) )
                    // InternalAle.g:330:5: ( ruleQualified )
                    {
                    // InternalAle.g:330:5: ( ruleQualified )
                    // InternalAle.g:331:6: ruleQualified
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAleClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAleClassAccess().getSuperClassAleClassCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    ruleQualified();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAle.g:345:4: (otherlv_6= ',' ( ( ruleQualified ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAle.g:346:5: otherlv_6= ',' ( ( ruleQualified ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getAleClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAle.g:350:5: ( ( ruleQualified ) )
                    	    // InternalAle.g:351:6: ( ruleQualified )
                    	    {
                    	    // InternalAle.g:351:6: ( ruleQualified )
                    	    // InternalAle.g:352:7: ruleQualified
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getAleClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAleClassAccess().getSuperClassAleClassCrossReference_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    ruleQualified();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAle.g:368:3: (otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}' )
            // InternalAle.g:369:4: otherlv_8= '{' ( (lv_methods_9_0= ruleMethod ) )* otherlv_10= '}'
            {
            otherlv_8=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getAleClassAccess().getLeftCurlyBracketKeyword_5_0());
              			
            }
            // InternalAle.g:373:4: ( (lv_methods_9_0= ruleMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAle.g:374:5: (lv_methods_9_0= ruleMethod )
            	    {
            	    // InternalAle.g:374:5: (lv_methods_9_0= ruleMethod )
            	    // InternalAle.g:375:6: lv_methods_9_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAleClassAccess().getMethodsMethodParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_methods_9_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAleClassRule());
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
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getAleClassAccess().getRightCurlyBracketKeyword_5_2());
              			
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
    // $ANTLR end "ruleAleClass"


    // $ANTLR start "entryRuleMethod"
    // InternalAle.g:401:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalAle.g:401:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalAle.g:402:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalAle.g:408:1: ruleMethod returns [EObject current=null] : (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_DefMethod_0 = null;

        EObject this_OverrideMethod_1 = null;



        	enterRule();

        try {
            // InternalAle.g:414:2: ( (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod ) )
            // InternalAle.g:415:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            {
            // InternalAle.g:415:2: (this_DefMethod_0= ruleDefMethod | this_OverrideMethod_1= ruleOverrideMethod )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAle.g:416:3: this_DefMethod_0= ruleDefMethod
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
                    // InternalAle.g:425:3: this_OverrideMethod_1= ruleOverrideMethod
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
    // InternalAle.g:437:1: entryRuleDefMethod returns [EObject current=null] : iv_ruleDefMethod= ruleDefMethod EOF ;
    public final EObject entryRuleDefMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMethod = null;


        try {
            // InternalAle.g:437:50: (iv_ruleDefMethod= ruleDefMethod EOF )
            // InternalAle.g:438:2: iv_ruleDefMethod= ruleDefMethod EOF
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
    // InternalAle.g:444:1: ruleDefMethod returns [EObject current=null] : (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:450:2: ( (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) ) )
            // InternalAle.g:451:2: (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            {
            // InternalAle.g:451:2: (otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) ) )
            // InternalAle.g:452:3: otherlv_0= 'def' ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' ) ( (lv_block_9_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefMethodAccess().getDefKeyword_0());
              		
            }
            // InternalAle.g:456:3: ( ( (lv_type_1_0= ruleType ) ) | otherlv_2= 'void' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=64 && LA8_0<=69)) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAle.g:457:4: ( (lv_type_1_0= ruleType ) )
                    {
                    // InternalAle.g:457:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:458:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:458:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:459:6: lv_type_1_0= ruleType
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
                    // InternalAle.g:477:4: otherlv_2= 'void'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDefMethodAccess().getVoidKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAle.g:482:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAle.g:483:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAle.g:483:4: (lv_name_3_0= RULE_ID )
            // InternalAle.g:484:5: lv_name_3_0= RULE_ID
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

            // InternalAle.g:500:3: (otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')' )
            // InternalAle.g:501:4: otherlv_4= '(' ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )? otherlv_8= ')'
            {
            otherlv_4=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDefMethodAccess().getLeftParenthesisKeyword_3_0());
              			
            }
            // InternalAle.g:505:4: ( ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=64 && LA10_0<=69)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAle.g:506:5: ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:506:5: ( (lv_params_5_0= ruleParam ) )
                    // InternalAle.g:507:6: (lv_params_5_0= ruleParam )
                    {
                    // InternalAle.g:507:6: (lv_params_5_0= ruleParam )
                    // InternalAle.g:508:7: lv_params_5_0= ruleParam
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

                    // InternalAle.g:525:5: (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAle.g:526:6: otherlv_6= ',' ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_6, grammarAccess.getDefMethodAccess().getCommaKeyword_3_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:530:6: ( (lv_params_7_0= ruleParam ) )
                    	    // InternalAle.g:531:7: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalAle.g:531:7: (lv_params_7_0= ruleParam )
                    	    // InternalAle.g:532:8: lv_params_7_0= ruleParam
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getDefMethodAccess().getRightParenthesisKeyword_3_2());
              			
            }

            }

            // InternalAle.g:556:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalAle.g:557:4: (lv_block_9_0= ruleBlock )
            {
            // InternalAle.g:557:4: (lv_block_9_0= ruleBlock )
            // InternalAle.g:558:5: lv_block_9_0= ruleBlock
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
    // InternalAle.g:579:1: entryRuleOverrideMethod returns [EObject current=null] : iv_ruleOverrideMethod= ruleOverrideMethod EOF ;
    public final EObject entryRuleOverrideMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverrideMethod = null;


        try {
            // InternalAle.g:579:55: (iv_ruleOverrideMethod= ruleOverrideMethod EOF )
            // InternalAle.g:580:2: iv_ruleOverrideMethod= ruleOverrideMethod EOF
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
    // InternalAle.g:586:1: ruleOverrideMethod returns [EObject current=null] : (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:592:2: ( (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:593:2: (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:593:2: (otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:594:3: otherlv_0= 'override' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' ) ( (lv_block_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOverrideMethodAccess().getOverrideKeyword_0());
              		
            }
            // InternalAle.g:598:3: ( (lv_type_1_0= ruleType ) )
            // InternalAle.g:599:4: (lv_type_1_0= ruleType )
            {
            // InternalAle.g:599:4: (lv_type_1_0= ruleType )
            // InternalAle.g:600:5: lv_type_1_0= ruleType
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

            // InternalAle.g:617:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAle.g:618:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAle.g:618:4: (lv_name_2_0= RULE_ID )
            // InternalAle.g:619:5: lv_name_2_0= RULE_ID
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

            // InternalAle.g:635:3: (otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')' )
            // InternalAle.g:636:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )? otherlv_7= ')'
            {
            otherlv_3=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getOverrideMethodAccess().getLeftParenthesisKeyword_3_0());
              			
            }
            // InternalAle.g:640:4: ( ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=64 && LA12_0<=69)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAle.g:641:5: ( (lv_params_4_0= ruleParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )*
                    {
                    // InternalAle.g:641:5: ( (lv_params_4_0= ruleParam ) )
                    // InternalAle.g:642:6: (lv_params_4_0= ruleParam )
                    {
                    // InternalAle.g:642:6: (lv_params_4_0= ruleParam )
                    // InternalAle.g:643:7: lv_params_4_0= ruleParam
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

                    // InternalAle.g:660:5: (otherlv_5= ',' ( (lv_params_6_0= ruleParam ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAle.g:661:6: otherlv_5= ',' ( (lv_params_6_0= ruleParam ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getOverrideMethodAccess().getCommaKeyword_3_1_1_0());
                    	      					
                    	    }
                    	    // InternalAle.g:665:6: ( (lv_params_6_0= ruleParam ) )
                    	    // InternalAle.g:666:7: (lv_params_6_0= ruleParam )
                    	    {
                    	    // InternalAle.g:666:7: (lv_params_6_0= ruleParam )
                    	    // InternalAle.g:667:8: lv_params_6_0= ruleParam
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getOverrideMethodAccess().getRightParenthesisKeyword_3_2());
              			
            }

            }

            // InternalAle.g:691:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:692:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:692:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:693:5: lv_block_8_0= ruleBlock
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
    // InternalAle.g:714:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalAle.g:714:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalAle.g:715:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalAle.g:721:1: ruleStatement returns [EObject current=null] : ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) ) ;
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
            // InternalAle.g:727:2: ( ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) ) )
            // InternalAle.g:728:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )
            {
            // InternalAle.g:728:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalAle.g:729:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    {
                    // InternalAle.g:729:3: (this_VarAssign_0= ruleVarAssign otherlv_1= ';' )
                    // InternalAle.g:730:4: this_VarAssign_0= ruleVarAssign otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_VarAssign_0=ruleVarAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_VarAssign_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:744:3: this_ForLoop_2= ruleForLoop
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
                    // InternalAle.g:753:3: this_IfStatement_3= ruleIfStatement
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
                    // InternalAle.g:762:3: this_WhileStatement_4= ruleWhileStatement
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
                    // InternalAle.g:771:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    {
                    // InternalAle.g:771:3: (this_LetStatement_5= ruleLetStatement otherlv_6= ';' )
                    // InternalAle.g:772:4: this_LetStatement_5= ruleLetStatement otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getLetStatementParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_LetStatement_5=ruleLetStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LetStatement_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:786:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    {
                    // InternalAle.g:786:3: (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' )
                    // InternalAle.g:787:4: this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ReturnStatement_7=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReturnStatement_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAle.g:801:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    {
                    // InternalAle.g:801:3: (this_Expression_9= ruleExpression otherlv_10= ';' )
                    // InternalAle.g:802:4: this_Expression_9= ruleExpression otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_6_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Expression_9=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_10=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAle.g:816:3: (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' )
                    {
                    // InternalAle.g:816:3: (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' )
                    // InternalAle.g:817:4: this_DebugStatement_11= ruleDebugStatement otherlv_12= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getDebugStatementParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_DebugStatement_11=ruleDebugStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DebugStatement_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_12=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:834:1: entryRuleDebugStatement returns [EObject current=null] : iv_ruleDebugStatement= ruleDebugStatement EOF ;
    public final EObject entryRuleDebugStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDebugStatement = null;


        try {
            // InternalAle.g:834:55: (iv_ruleDebugStatement= ruleDebugStatement EOF )
            // InternalAle.g:835:2: iv_ruleDebugStatement= ruleDebugStatement EOF
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
    // InternalAle.g:841:1: ruleDebugStatement returns [EObject current=null] : ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDebugStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:847:2: ( ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalAle.g:848:2: ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalAle.g:848:2: ( () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalAle.g:849:3: () otherlv_1= 'debug' otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalAle.g:849:3: ()
            // InternalAle.g:850:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDebugStatementAccess().getDebugStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDebugStatementAccess().getDebugKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDebugStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:864:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalAle.g:865:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalAle.g:865:4: (lv_expr_3_0= ruleExpression )
            // InternalAle.g:866:5: lv_expr_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:891:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalAle.g:891:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalAle.g:892:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalAle.g:898:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_returned_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:904:2: ( ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) ) )
            // InternalAle.g:905:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:905:2: ( () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) ) )
            // InternalAle.g:906:3: () otherlv_1= 'return' ( (lv_returned_2_0= ruleExpression ) )
            {
            // InternalAle.g:906:3: ()
            // InternalAle.g:907:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
              		
            }
            // InternalAle.g:917:3: ( (lv_returned_2_0= ruleExpression ) )
            // InternalAle.g:918:4: (lv_returned_2_0= ruleExpression )
            {
            // InternalAle.g:918:4: (lv_returned_2_0= ruleExpression )
            // InternalAle.g:919:5: lv_returned_2_0= ruleExpression
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
    // InternalAle.g:940:1: entryRuleLetStatement returns [EObject current=null] : iv_ruleLetStatement= ruleLetStatement EOF ;
    public final EObject entryRuleLetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetStatement = null;


        try {
            // InternalAle.g:940:53: (iv_ruleLetStatement= ruleLetStatement EOF )
            // InternalAle.g:941:2: iv_ruleLetStatement= ruleLetStatement EOF
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
    // InternalAle.g:947:1: ruleLetStatement returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) ;
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
            // InternalAle.g:953:2: ( ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) ) )
            // InternalAle.g:954:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            {
            // InternalAle.g:954:2: ( () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) ) )
            // InternalAle.g:955:3: () otherlv_1= 'let' ( (lv_bindings_2_0= ruleVarAssign ) ) (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )* otherlv_5= 'in' ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            {
            // InternalAle.g:955:3: ()
            // InternalAle.g:956:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetStatementAccess().getLetStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetStatementAccess().getLetKeyword_1());
              		
            }
            // InternalAle.g:966:3: ( (lv_bindings_2_0= ruleVarAssign ) )
            // InternalAle.g:967:4: (lv_bindings_2_0= ruleVarAssign )
            {
            // InternalAle.g:967:4: (lv_bindings_2_0= ruleVarAssign )
            // InternalAle.g:968:5: lv_bindings_2_0= ruleVarAssign
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

            // InternalAle.g:985:3: (otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAle.g:986:4: otherlv_3= ',' ( (lv_bindings_4_0= ruleVarAssign ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getLetStatementAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAle.g:990:4: ( (lv_bindings_4_0= ruleVarAssign ) )
            	    // InternalAle.g:991:5: (lv_bindings_4_0= ruleVarAssign )
            	    {
            	    // InternalAle.g:991:5: (lv_bindings_4_0= ruleVarAssign )
            	    // InternalAle.g:992:6: lv_bindings_4_0= ruleVarAssign
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
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLetStatementAccess().getInKeyword_4());
              		
            }
            // InternalAle.g:1014:3: ( ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) ) )
            // InternalAle.g:1015:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            {
            // InternalAle.g:1015:4: ( (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement ) )
            // InternalAle.g:1016:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            {
            // InternalAle.g:1016:5: (lv_block_6_1= ruleExpression | lv_block_6_2= ruleLetStatement )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_NULL)||LA15_0==27||LA15_0==52||(LA15_0>=55 && LA15_0<=57)||(LA15_0>=59 && LA15_0<=60)||(LA15_0>=62 && LA15_0<=65)) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAle.g:1017:6: lv_block_6_1= ruleExpression
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
                    // InternalAle.g:1033:6: lv_block_6_2= ruleLetStatement
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
    // InternalAle.g:1055:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalAle.g:1055:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalAle.g:1056:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalAle.g:1062:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) ;
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
            // InternalAle.g:1068:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? ) )
            // InternalAle.g:1069:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            {
            // InternalAle.g:1069:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )? )
            // InternalAle.g:1070:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenBranch_5_0= ruleBlock ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            {
            // InternalAle.g:1070:3: ()
            // InternalAle.g:1071:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1085:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1086:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1086:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1087:5: lv_condition_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1108:3: ( (lv_thenBranch_5_0= ruleBlock ) )
            // InternalAle.g:1109:4: (lv_thenBranch_5_0= ruleBlock )
            {
            // InternalAle.g:1109:4: (lv_thenBranch_5_0= ruleBlock )
            // InternalAle.g:1110:5: lv_thenBranch_5_0= ruleBlock
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

            // InternalAle.g:1127:3: (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAle.g:1128:4: otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                      			
                    }
                    // InternalAle.g:1132:4: ( (lv_elseBranch_7_0= ruleBlock ) )
                    // InternalAle.g:1133:5: (lv_elseBranch_7_0= ruleBlock )
                    {
                    // InternalAle.g:1133:5: (lv_elseBranch_7_0= ruleBlock )
                    // InternalAle.g:1134:6: lv_elseBranch_7_0= ruleBlock
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
    // InternalAle.g:1156:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalAle.g:1156:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalAle.g:1157:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalAle.g:1163:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;

        EObject lv_whileBlock_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1169:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) ) )
            // InternalAle.g:1170:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            {
            // InternalAle.g:1170:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) ) )
            // InternalAle.g:1171:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_whileBlock_5_0= ruleBlock ) )
            {
            // InternalAle.g:1171:3: ()
            // InternalAle.g:1172:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1186:3: ( (lv_condition_3_0= ruleExpression ) )
            // InternalAle.g:1187:4: (lv_condition_3_0= ruleExpression )
            {
            // InternalAle.g:1187:4: (lv_condition_3_0= ruleExpression )
            // InternalAle.g:1188:5: lv_condition_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalAle.g:1209:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalAle.g:1210:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalAle.g:1210:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalAle.g:1211:5: lv_whileBlock_5_0= ruleBlock
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
    // InternalAle.g:1232:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalAle.g:1232:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalAle.g:1233:2: iv_ruleForLoop= ruleForLoop EOF
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
    // InternalAle.g:1239:1: ruleForLoop returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
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
            // InternalAle.g:1245:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalAle.g:1246:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalAle.g:1246:2: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalAle.g:1247:3: () otherlv_1= 'for' otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( (lv_collection_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            // InternalAle.g:1247:3: ()
            // InternalAle.g:1248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForLoopAccess().getForLoopAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAle.g:1262:3: ( (lv_type_3_0= ruleType ) )
            // InternalAle.g:1263:4: (lv_type_3_0= ruleType )
            {
            // InternalAle.g:1263:4: (lv_type_3_0= ruleType )
            // InternalAle.g:1264:5: lv_type_3_0= ruleType
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

            // InternalAle.g:1281:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAle.g:1282:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAle.g:1282:4: (lv_name_4_0= RULE_ID )
            // InternalAle.g:1283:5: lv_name_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,33,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getInKeyword_5());
              		
            }
            // InternalAle.g:1303:3: ( (lv_collection_6_0= ruleExpression ) )
            // InternalAle.g:1304:4: (lv_collection_6_0= ruleExpression )
            {
            // InternalAle.g:1304:4: (lv_collection_6_0= ruleExpression )
            // InternalAle.g:1305:5: lv_collection_6_0= ruleExpression
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

            otherlv_7=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalAle.g:1326:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalAle.g:1327:4: (lv_block_8_0= ruleBlock )
            {
            // InternalAle.g:1327:4: (lv_block_8_0= ruleBlock )
            // InternalAle.g:1328:5: lv_block_8_0= ruleBlock
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
    // InternalAle.g:1349:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAle.g:1349:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalAle.g:1350:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalAle.g:1356:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1362:2: ( ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalAle.g:1363:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalAle.g:1363:2: ( () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalAle.g:1364:3: () otherlv_1= '{' ( (lv_body_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalAle.g:1364:3: ()
            // InternalAle.g:1365:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAle.g:1375:3: ( (lv_body_2_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_NULL)||LA17_0==27||(LA17_0>=30 && LA17_0<=32)||LA17_0==34||(LA17_0>=36 && LA17_0<=37)||LA17_0==52||(LA17_0>=55 && LA17_0<=57)||(LA17_0>=59 && LA17_0<=60)||(LA17_0>=62 && LA17_0<=69)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAle.g:1376:4: (lv_body_2_0= ruleStatement )
            	    {
            	    // InternalAle.g:1376:4: (lv_body_2_0= ruleStatement )
            	    // InternalAle.g:1377:5: lv_body_2_0= ruleStatement
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:1402:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalAle.g:1402:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalAle.g:1403:2: iv_ruleVarAssign= ruleVarAssign EOF
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
    // InternalAle.g:1409:1: ruleVarAssign returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) ) ;
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
            // InternalAle.g:1415:2: ( ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) ) )
            // InternalAle.g:1416:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) )
            {
            // InternalAle.g:1416:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=64 && LA18_0<=69)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==38) ) {
                    alt18=2;
                }
                else if ( (LA18_2==RULE_ID) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAle.g:1417:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:1417:3: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
                    // InternalAle.g:1418:4: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
                    {
                    // InternalAle.g:1418:4: ()
                    // InternalAle.g:1419:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVarAssignAccess().getVarDeclarationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1425:4: ( (lv_type_1_0= ruleType ) )
                    // InternalAle.g:1426:5: (lv_type_1_0= ruleType )
                    {
                    // InternalAle.g:1426:5: (lv_type_1_0= ruleType )
                    // InternalAle.g:1427:6: lv_type_1_0= ruleType
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

                    // InternalAle.g:1444:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAle.g:1445:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAle.g:1445:5: (lv_name_2_0= RULE_ID )
                    // InternalAle.g:1446:6: lv_name_2_0= RULE_ID
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

                    otherlv_3=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_0_3());
                      			
                    }
                    // InternalAle.g:1466:4: ( (lv_value_4_0= ruleExpression ) )
                    // InternalAle.g:1467:5: (lv_value_4_0= ruleExpression )
                    {
                    // InternalAle.g:1467:5: (lv_value_4_0= ruleExpression )
                    // InternalAle.g:1468:6: lv_value_4_0= ruleExpression
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
                    // InternalAle.g:1487:3: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:1487:3: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) ) )
                    // InternalAle.g:1488:4: () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= ruleExpression ) )
                    {
                    // InternalAle.g:1488:4: ()
                    // InternalAle.g:1489:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVarAssignAccess().getVarAssignAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:1495:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalAle.g:1496:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalAle.g:1496:5: (lv_name_6_0= RULE_ID )
                    // InternalAle.g:1497:6: lv_name_6_0= RULE_ID
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

                    otherlv_7=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalAle.g:1517:4: ( (lv_value_8_0= ruleExpression ) )
                    // InternalAle.g:1518:5: (lv_value_8_0= ruleExpression )
                    {
                    // InternalAle.g:1518:5: (lv_value_8_0= ruleExpression )
                    // InternalAle.g:1519:6: lv_value_8_0= ruleExpression
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
    // InternalAle.g:1541:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAle.g:1541:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAle.g:1542:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAle.g:1548:1: ruleExpression returns [EObject current=null] : this_ImpliesOperation_0= ruleImpliesOperation ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesOperation_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1554:2: (this_ImpliesOperation_0= ruleImpliesOperation )
            // InternalAle.g:1555:2: this_ImpliesOperation_0= ruleImpliesOperation
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
    // InternalAle.g:1566:1: entryRuleImpliesOperation returns [EObject current=null] : iv_ruleImpliesOperation= ruleImpliesOperation EOF ;
    public final EObject entryRuleImpliesOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesOperation = null;


        try {
            // InternalAle.g:1566:57: (iv_ruleImpliesOperation= ruleImpliesOperation EOF )
            // InternalAle.g:1567:2: iv_ruleImpliesOperation= ruleImpliesOperation EOF
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
    // InternalAle.g:1573:1: ruleImpliesOperation returns [EObject current=null] : (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) ;
    public final EObject ruleImpliesOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1579:2: ( (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* ) )
            // InternalAle.g:1580:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            {
            // InternalAle.g:1580:2: (this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )* )
            // InternalAle.g:1581:3: this_BooleanOperation_0= ruleBooleanOperation ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
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
            // InternalAle.g:1589:3: ( ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred1_InternalAle()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalAle.g:1590:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )=> ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    {
            	    // InternalAle.g:1603:4: ( ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) ) )
            	    // InternalAle.g:1604:5: ( () otherlv_2= 'implies' ) ( (lv_right_3_0= ruleBooleanOperation ) )
            	    {
            	    // InternalAle.g:1604:5: ( () otherlv_2= 'implies' )
            	    // InternalAle.g:1605:6: () otherlv_2= 'implies'
            	    {
            	    // InternalAle.g:1605:6: ()
            	    // InternalAle.g:1606:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getImpliesOperationAccess().getImpliesOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getImpliesOperationAccess().getImpliesKeyword_1_0_0_1());
            	      					
            	    }

            	    }

            	    // InternalAle.g:1617:5: ( (lv_right_3_0= ruleBooleanOperation ) )
            	    // InternalAle.g:1618:6: (lv_right_3_0= ruleBooleanOperation )
            	    {
            	    // InternalAle.g:1618:6: (lv_right_3_0= ruleBooleanOperation )
            	    // InternalAle.g:1619:7: lv_right_3_0= ruleBooleanOperation
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
            	    break loop19;
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
    // InternalAle.g:1642:1: entryRuleBooleanOperation returns [EObject current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final EObject entryRuleBooleanOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOperation = null;


        try {
            // InternalAle.g:1642:57: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalAle.g:1643:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
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
    // InternalAle.g:1649:1: ruleBooleanOperation returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) ;
    public final EObject ruleBooleanOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_CompareOperation_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1655:2: ( (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* ) )
            // InternalAle.g:1656:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            {
            // InternalAle.g:1656:2: (this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )* )
            // InternalAle.g:1657:3: this_CompareOperation_0= ruleCompareOperation ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
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
            // InternalAle.g:1665:3: ( ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred2_InternalAle()) ) {
                        alt21=1;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalAle.g:1666:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )=> ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    {
            	    // InternalAle.g:1693:4: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) ) )
            	    // InternalAle.g:1694:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) ) ( (lv_right_7_0= ruleCompareOperation ) )
            	    {
            	    // InternalAle.g:1694:5: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'and' ) | ( () otherlv_6= 'xor' ) )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalAle.g:1695:6: ( () otherlv_2= 'or' )
            	            {
            	            // InternalAle.g:1695:6: ( () otherlv_2= 'or' )
            	            // InternalAle.g:1696:7: () otherlv_2= 'or'
            	            {
            	            // InternalAle.g:1696:7: ()
            	            // InternalAle.g:1697:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanOrOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,40,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getBooleanOperationAccess().getOrKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:1709:6: ( () otherlv_4= 'and' )
            	            {
            	            // InternalAle.g:1709:6: ( () otherlv_4= 'and' )
            	            // InternalAle.g:1710:7: () otherlv_4= 'and'
            	            {
            	            // InternalAle.g:1710:7: ()
            	            // InternalAle.g:1711:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanAndOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getBooleanOperationAccess().getAndKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:1723:6: ( () otherlv_6= 'xor' )
            	            {
            	            // InternalAle.g:1723:6: ( () otherlv_6= 'xor' )
            	            // InternalAle.g:1724:7: () otherlv_6= 'xor'
            	            {
            	            // InternalAle.g:1724:7: ()
            	            // InternalAle.g:1725:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getBooleanOperationAccess().getBooleanXorOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,42,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getBooleanOperationAccess().getXorKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:1737:5: ( (lv_right_7_0= ruleCompareOperation ) )
            	    // InternalAle.g:1738:6: (lv_right_7_0= ruleCompareOperation )
            	    {
            	    // InternalAle.g:1738:6: (lv_right_7_0= ruleCompareOperation )
            	    // InternalAle.g:1739:7: lv_right_7_0= ruleCompareOperation
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
            	    break loop21;
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
    // InternalAle.g:1762:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalAle.g:1762:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalAle.g:1763:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalAle.g:1769:1: ruleCompareOperation returns [EObject current=null] : (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_EqualityOperation_0 = null;

        EObject lv_right_11_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1775:2: ( (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* ) )
            // InternalAle.g:1776:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* )
            {
            // InternalAle.g:1776:2: (this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )* )
            // InternalAle.g:1777:3: this_EqualityOperation_0= ruleEqualityOperation ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )*
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
            // InternalAle.g:1785:3: ( ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) ) )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA23_6 = input.LA(2);

                    if ( (synpred3_InternalAle()) ) {
                        alt23=1;
                    }


                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalAle.g:1786:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )=> ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) )
            	    {
            	    // InternalAle.g:1825:4: ( ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) ) )
            	    // InternalAle.g:1826:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) ) ( (lv_right_11_0= ruleEqualityOperation ) )
            	    {
            	    // InternalAle.g:1826:5: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '!=' ) | ( () otherlv_8= '<' ) | ( () otherlv_10= '>' ) )
            	    int alt22=5;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt22=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalAle.g:1827:6: ( () otherlv_2= '<=' )
            	            {
            	            // InternalAle.g:1827:6: ( () otherlv_2= '<=' )
            	            // InternalAle.g:1828:7: () otherlv_2= '<='
            	            {
            	            // InternalAle.g:1828:7: ()
            	            // InternalAle.g:1829:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLEOperationLeftAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAle.g:1841:6: ( () otherlv_4= '>=' )
            	            {
            	            // InternalAle.g:1841:6: ( () otherlv_4= '>=' )
            	            // InternalAle.g:1842:7: () otherlv_4= '>='
            	            {
            	            // InternalAle.g:1842:7: ()
            	            // InternalAle.g:1843:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGEOperationLeftAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalAle.g:1855:6: ( () otherlv_6= '!=' )
            	            {
            	            // InternalAle.g:1855:6: ( () otherlv_6= '!=' )
            	            // InternalAle.g:1856:7: () otherlv_6= '!='
            	            {
            	            // InternalAle.g:1856:7: ()
            	            // InternalAle.g:1857:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareNEOperationLeftAction_1_0_0_2_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_6=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_6, grammarAccess.getCompareOperationAccess().getExclamationMarkEqualsSignKeyword_1_0_0_2_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalAle.g:1869:6: ( () otherlv_8= '<' )
            	            {
            	            // InternalAle.g:1869:6: ( () otherlv_8= '<' )
            	            // InternalAle.g:1870:7: () otherlv_8= '<'
            	            {
            	            // InternalAle.g:1870:7: ()
            	            // InternalAle.g:1871:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareLOperationLeftAction_1_0_0_3_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_8=(Token)match(input,46,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_8, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1_0_0_3_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalAle.g:1883:6: ( () otherlv_10= '>' )
            	            {
            	            // InternalAle.g:1883:6: ( () otherlv_10= '>' )
            	            // InternalAle.g:1884:7: () otherlv_10= '>'
            	            {
            	            // InternalAle.g:1884:7: ()
            	            // InternalAle.g:1885:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getCompareOperationAccess().getCompareGOperationLeftAction_1_0_0_4_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_10=(Token)match(input,47,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_10, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_1_0_0_4_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAle.g:1897:5: ( (lv_right_11_0= ruleEqualityOperation ) )
            	    // InternalAle.g:1898:6: (lv_right_11_0= ruleEqualityOperation )
            	    {
            	    // InternalAle.g:1898:6: (lv_right_11_0= ruleEqualityOperation )
            	    // InternalAle.g:1899:7: lv_right_11_0= ruleEqualityOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getCompareOperationAccess().getRightEqualityOperationParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_right_11_0=ruleEqualityOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_11_0,
            	      								"ale.xtext.Ale.EqualityOperation");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAle.g:1922:1: entryRuleEqualityOperation returns [EObject current=null] : iv_ruleEqualityOperation= ruleEqualityOperation EOF ;
    public final EObject entryRuleEqualityOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperation = null;


        try {
            // InternalAle.g:1922:58: (iv_ruleEqualityOperation= ruleEqualityOperation EOF )
            // InternalAle.g:1923:2: iv_ruleEqualityOperation= ruleEqualityOperation EOF
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
    // InternalAle.g:1929:1: ruleEqualityOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) ;
    public final EObject ruleEqualityOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MultOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAle.g:1935:2: ( (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* ) )
            // InternalAle.g:1936:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            {
            // InternalAle.g:1936:2: (this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )* )
            // InternalAle.g:1937:3: this_MultOperation_0= ruleMultOperation ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
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
            // InternalAle.g:1945:3: ( ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred4_InternalAle()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalAle.g:1946:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )=> ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    {
            	    // InternalAle.g:1961:4: ( () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) ) )
            	    // InternalAle.g:1962:5: () ( (lv_op_2_0= '==' ) ) ( (lv_right_3_0= ruleMultOperation ) )
            	    {
            	    // InternalAle.g:1962:5: ()
            	    // InternalAle.g:1963:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualityOperationAccess().getEqualityOperationLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalAle.g:1969:5: ( (lv_op_2_0= '==' ) )
            	    // InternalAle.g:1970:6: (lv_op_2_0= '==' )
            	    {
            	    // InternalAle.g:1970:6: (lv_op_2_0= '==' )
            	    // InternalAle.g:1971:7: lv_op_2_0= '=='
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

            	    // InternalAle.g:1983:5: ( (lv_right_3_0= ruleMultOperation ) )
            	    // InternalAle.g:1984:6: (lv_right_3_0= ruleMultOperation )
            	    {
            	    // InternalAle.g:1984:6: (lv_right_3_0= ruleMultOperation )
            	    // InternalAle.g:1985:7: lv_right_3_0= ruleMultOperation
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
            	    break loop24;
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
    // InternalAle.g:2008:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // InternalAle.g:2008:54: (iv_ruleMultOperation= ruleMultOperation EOF )
            // InternalAle.g:2009:2: iv_ruleMultOperation= ruleMultOperation EOF
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
    // InternalAle.g:2015:1: ruleMultOperation returns [EObject current=null] : (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2021:2: ( (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* ) )
            // InternalAle.g:2022:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            {
            // InternalAle.g:2022:2: (this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )* )
            // InternalAle.g:2023:3: this_AddOperation_0= ruleAddOperation ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
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
            // InternalAle.g:2031:3: ( ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==50) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred5_InternalAle()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalAle.g:2032:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )=> ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    {
            	    // InternalAle.g:2053:4: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) ) )
            	    // InternalAle.g:2054:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleAddOperation ) )
            	    {
            	    // InternalAle.g:2054:5: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==49) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==50) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalAle.g:2055:6: ( () otherlv_2= '*' )
            	            {
            	            // InternalAle.g:2055:6: ( () otherlv_2= '*' )
            	            // InternalAle.g:2056:7: () otherlv_2= '*'
            	            {
            	            // InternalAle.g:2056:7: ()
            	            // InternalAle.g:2057:8: 
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
            	            // InternalAle.g:2069:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalAle.g:2069:6: ( () otherlv_4= '/' )
            	            // InternalAle.g:2070:7: () otherlv_4= '/'
            	            {
            	            // InternalAle.g:2070:7: ()
            	            // InternalAle.g:2071:8: 
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

            	    // InternalAle.g:2083:5: ( (lv_right_5_0= ruleAddOperation ) )
            	    // InternalAle.g:2084:6: (lv_right_5_0= ruleAddOperation )
            	    {
            	    // InternalAle.g:2084:6: (lv_right_5_0= ruleAddOperation )
            	    // InternalAle.g:2085:7: lv_right_5_0= ruleAddOperation
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
            	    break loop26;
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
    // InternalAle.g:2108:1: entryRuleAddOperation returns [EObject current=null] : iv_ruleAddOperation= ruleAddOperation EOF ;
    public final EObject entryRuleAddOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOperation = null;


        try {
            // InternalAle.g:2108:53: (iv_ruleAddOperation= ruleAddOperation EOF )
            // InternalAle.g:2109:2: iv_ruleAddOperation= ruleAddOperation EOF
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
    // InternalAle.g:2115:1: ruleAddOperation returns [EObject current=null] : (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) ;
    public final EObject ruleAddOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ChaindedCall_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2121:2: ( (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* ) )
            // InternalAle.g:2122:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            {
            // InternalAle.g:2122:2: (this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )* )
            // InternalAle.g:2123:3: this_ChaindedCall_0= ruleChaindedCall ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
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
            // InternalAle.g:2131:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==52) ) {
                    int LA28_3 = input.LA(2);

                    if ( (synpred6_InternalAle()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalAle.g:2132:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    {
            	    // InternalAle.g:2153:4: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) ) )
            	    // InternalAle.g:2154:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleChaindedCall ) )
            	    {
            	    // InternalAle.g:2154:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==51) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==52) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalAle.g:2155:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalAle.g:2155:6: ( () otherlv_2= '+' )
            	            // InternalAle.g:2156:7: () otherlv_2= '+'
            	            {
            	            // InternalAle.g:2156:7: ()
            	            // InternalAle.g:2157:8: 
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
            	            // InternalAle.g:2169:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalAle.g:2169:6: ( () otherlv_4= '-' )
            	            // InternalAle.g:2170:7: () otherlv_4= '-'
            	            {
            	            // InternalAle.g:2170:7: ()
            	            // InternalAle.g:2171:8: 
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

            	    // InternalAle.g:2183:5: ( (lv_right_5_0= ruleChaindedCall ) )
            	    // InternalAle.g:2184:6: (lv_right_5_0= ruleChaindedCall )
            	    {
            	    // InternalAle.g:2184:6: (lv_right_5_0= ruleChaindedCall )
            	    // InternalAle.g:2185:7: lv_right_5_0= ruleChaindedCall
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
            	    break loop28;
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
    // InternalAle.g:2208:1: entryRuleChaindedCall returns [EObject current=null] : iv_ruleChaindedCall= ruleChaindedCall EOF ;
    public final EObject entryRuleChaindedCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaindedCall = null;


        try {
            // InternalAle.g:2208:53: (iv_ruleChaindedCall= ruleChaindedCall EOF )
            // InternalAle.g:2209:2: iv_ruleChaindedCall= ruleChaindedCall EOF
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
    // InternalAle.g:2215:1: ruleChaindedCall returns [EObject current=null] : (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) ;
    public final EObject ruleChaindedCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_InfixOperation_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2221:2: ( (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* ) )
            // InternalAle.g:2222:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            {
            // InternalAle.g:2222:2: (this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )* )
            // InternalAle.g:2223:3: this_InfixOperation_0= ruleInfixOperation ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
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
            // InternalAle.g:2231:3: ( ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==54) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred7_InternalAle()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalAle.g:2232:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )=> ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    {
            	    // InternalAle.g:2253:4: ( ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) ) )
            	    // InternalAle.g:2254:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) ) ( (lv_right_5_0= ruleInfixOperation ) )
            	    {
            	    // InternalAle.g:2254:5: ( ( () otherlv_2= '.' ) | ( () otherlv_4= '->' ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==53) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==54) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAle.g:2255:6: ( () otherlv_2= '.' )
            	            {
            	            // InternalAle.g:2255:6: ( () otherlv_2= '.' )
            	            // InternalAle.g:2256:7: () otherlv_2= '.'
            	            {
            	            // InternalAle.g:2256:7: ()
            	            // InternalAle.g:2257:8: 
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
            	            // InternalAle.g:2269:6: ( () otherlv_4= '->' )
            	            {
            	            // InternalAle.g:2269:6: ( () otherlv_4= '->' )
            	            // InternalAle.g:2270:7: () otherlv_4= '->'
            	            {
            	            // InternalAle.g:2270:7: ()
            	            // InternalAle.g:2271:8: 
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

            	    // InternalAle.g:2283:5: ( (lv_right_5_0= ruleInfixOperation ) )
            	    // InternalAle.g:2284:6: (lv_right_5_0= ruleInfixOperation )
            	    {
            	    // InternalAle.g:2284:6: (lv_right_5_0= ruleInfixOperation )
            	    // InternalAle.g:2285:7: lv_right_5_0= ruleInfixOperation
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
    // $ANTLR end "ruleChaindedCall"


    // $ANTLR start "entryRuleInfixOperation"
    // InternalAle.g:2308:1: entryRuleInfixOperation returns [EObject current=null] : iv_ruleInfixOperation= ruleInfixOperation EOF ;
    public final EObject entryRuleInfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperation = null;


        try {
            // InternalAle.g:2308:55: (iv_ruleInfixOperation= ruleInfixOperation EOF )
            // InternalAle.g:2309:2: iv_ruleInfixOperation= ruleInfixOperation EOF
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
    // InternalAle.g:2315:1: ruleInfixOperation returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral ) ;
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
            // InternalAle.g:2321:2: ( ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral ) )
            // InternalAle.g:2322:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral )
            {
            // InternalAle.g:2322:2: ( ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) ) | ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) ) | ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' ) | ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' ) | ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) ) | this_AtomicLiteral_23= ruleAtomicLiteral )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt33=1;
                }
                break;
            case 52:
                {
                alt33=2;
                }
                break;
            case 56:
                {
                alt33=3;
                }
                break;
            case 57:
                {
                alt33=4;
                }
                break;
            case RULE_ID:
                {
                int LA33_5 = input.LA(2);

                if ( (LA33_5==EOF||LA33_5==15||LA33_5==22||LA33_5==24||LA33_5==28||LA33_5==33||(LA33_5>=39 && LA33_5<=54)||LA33_5==61) ) {
                    alt33=6;
                }
                else if ( (LA33_5==27) ) {
                    alt33=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case 27:
            case 59:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt33=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAle.g:2323:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2323:3: ( () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalAle.g:2324:4: () otherlv_1= 'not' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalAle.g:2324:4: ()
                    // InternalAle.g:2325:5: 
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
                    // InternalAle.g:2335:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalAle.g:2336:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalAle.g:2336:5: (lv_expression_2_0= ruleExpression )
                    // InternalAle.g:2337:6: lv_expression_2_0= ruleExpression
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
                    // InternalAle.g:2356:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    {
                    // InternalAle.g:2356:3: ( () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) ) )
                    // InternalAle.g:2357:4: () otherlv_4= '-' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    // InternalAle.g:2357:4: ()
                    // InternalAle.g:2358:5: 
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
                    // InternalAle.g:2368:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalAle.g:2369:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalAle.g:2369:5: (lv_expression_5_0= ruleExpression )
                    // InternalAle.g:2370:6: lv_expression_5_0= ruleExpression
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
                    // InternalAle.g:2389:3: ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' )
                    {
                    // InternalAle.g:2389:3: ( () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')' )
                    // InternalAle.g:2390:4: () otherlv_7= 'newSequence' otherlv_8= '(' ( (lv_type_9_0= ruleType ) ) otherlv_10= ')'
                    {
                    // InternalAle.g:2390:4: ()
                    // InternalAle.g:2391:5: 
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
                    otherlv_8=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:2405:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAle.g:2406:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAle.g:2406:5: (lv_type_9_0= ruleType )
                    // InternalAle.g:2407:6: lv_type_9_0= ruleType
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

                    otherlv_10=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:2430:3: ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' )
                    {
                    // InternalAle.g:2430:3: ( () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')' )
                    // InternalAle.g:2431:4: () otherlv_12= 'new' ( (lv_name_13_0= RULE_ID ) ) otherlv_14= '(' otherlv_15= ')'
                    {
                    // InternalAle.g:2431:4: ()
                    // InternalAle.g:2432:5: 
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
                    // InternalAle.g:2442:4: ( (lv_name_13_0= RULE_ID ) )
                    // InternalAle.g:2443:5: (lv_name_13_0= RULE_ID )
                    {
                    // InternalAle.g:2443:5: (lv_name_13_0= RULE_ID )
                    // InternalAle.g:2444:6: lv_name_13_0= RULE_ID
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

                    otherlv_14=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_3_3());
                      			
                    }
                    otherlv_15=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAle.g:2470:3: ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) )
                    {
                    // InternalAle.g:2470:3: ( () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' ) )
                    // InternalAle.g:2471:4: () ( (lv_name_17_0= RULE_ID ) ) (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' )
                    {
                    // InternalAle.g:2471:4: ()
                    // InternalAle.g:2472:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInfixOperationAccess().getOperationCallOperationAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2478:4: ( (lv_name_17_0= RULE_ID ) )
                    // InternalAle.g:2479:5: (lv_name_17_0= RULE_ID )
                    {
                    // InternalAle.g:2479:5: (lv_name_17_0= RULE_ID )
                    // InternalAle.g:2480:6: lv_name_17_0= RULE_ID
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

                    // InternalAle.g:2496:4: (otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')' )
                    // InternalAle.g:2497:5: otherlv_18= '(' ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )? otherlv_22= ')'
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getInfixOperationAccess().getLeftParenthesisKeyword_4_2_0());
                      				
                    }
                    // InternalAle.g:2501:5: ( ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_NULL)||LA32_0==27||LA32_0==52||(LA32_0>=55 && LA32_0<=57)||(LA32_0>=59 && LA32_0<=60)||(LA32_0>=62 && LA32_0<=65)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAle.g:2502:6: ( (lv_parameters_19_0= ruleParamCall ) ) (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )*
                            {
                            // InternalAle.g:2502:6: ( (lv_parameters_19_0= ruleParamCall ) )
                            // InternalAle.g:2503:7: (lv_parameters_19_0= ruleParamCall )
                            {
                            // InternalAle.g:2503:7: (lv_parameters_19_0= ruleParamCall )
                            // InternalAle.g:2504:8: lv_parameters_19_0= ruleParamCall
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

                            // InternalAle.g:2521:6: (otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==22) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // InternalAle.g:2522:7: otherlv_20= ',' ( (lv_parameters_21_0= ruleParamCall ) )
                            	    {
                            	    otherlv_20=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_20, grammarAccess.getInfixOperationAccess().getCommaKeyword_4_2_1_1_0());
                            	      						
                            	    }
                            	    // InternalAle.g:2526:7: ( (lv_parameters_21_0= ruleParamCall ) )
                            	    // InternalAle.g:2527:8: (lv_parameters_21_0= ruleParamCall )
                            	    {
                            	    // InternalAle.g:2527:8: (lv_parameters_21_0= ruleParamCall )
                            	    // InternalAle.g:2528:9: lv_parameters_21_0= ruleParamCall
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_22, grammarAccess.getInfixOperationAccess().getRightParenthesisKeyword_4_2_2());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAle.g:2554:3: this_AtomicLiteral_23= ruleAtomicLiteral
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
    // InternalAle.g:2566:1: entryRuleParamCall returns [EObject current=null] : iv_ruleParamCall= ruleParamCall EOF ;
    public final EObject entryRuleParamCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamCall = null;


        try {
            // InternalAle.g:2566:50: (iv_ruleParamCall= ruleParamCall EOF )
            // InternalAle.g:2567:2: iv_ruleParamCall= ruleParamCall EOF
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
    // InternalAle.g:2573:1: ruleParamCall returns [EObject current=null] : ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParamCall() throws RecognitionException {
        EObject current = null;

        Token lv_lambda_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAle.g:2579:2: ( ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalAle.g:2580:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalAle.g:2580:2: ( ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalAle.g:2581:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalAle.g:2581:3: ( ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==58) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalAle.g:2582:4: ( (lv_lambda_0_0= RULE_ID ) ) otherlv_1= '|'
                    {
                    // InternalAle.g:2582:4: ( (lv_lambda_0_0= RULE_ID ) )
                    // InternalAle.g:2583:5: (lv_lambda_0_0= RULE_ID )
                    {
                    // InternalAle.g:2583:5: (lv_lambda_0_0= RULE_ID )
                    // InternalAle.g:2584:6: lv_lambda_0_0= RULE_ID
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

            // InternalAle.g:2605:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalAle.g:2606:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalAle.g:2606:4: (lv_expression_2_0= ruleExpression )
            // InternalAle.g:2607:5: lv_expression_2_0= ruleExpression
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
    // InternalAle.g:2628:1: entryRuleAtomicLiteral returns [EObject current=null] : iv_ruleAtomicLiteral= ruleAtomicLiteral EOF ;
    public final EObject entryRuleAtomicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicLiteral = null;


        try {
            // InternalAle.g:2628:54: (iv_ruleAtomicLiteral= ruleAtomicLiteral EOF )
            // InternalAle.g:2629:2: iv_ruleAtomicLiteral= ruleAtomicLiteral EOF
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
    // InternalAle.g:2635:1: ruleAtomicLiteral returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) ;
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
            // InternalAle.g:2641:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) ) )
            // InternalAle.g:2642:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            {
            // InternalAle.g:2642:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' ) | ( () otherlv_9= 'self' ) | ( () otherlv_11= 'super' ) | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | ( () ( (lv_value_15_0= RULE_INT ) ) ) | ( () ( (lv_value_17_0= RULE_REAL ) ) ) | ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) ) | ( () this_NULL_21= RULE_NULL ) | ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' ) | ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' ) | ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' ) | ( () ( (lv_value_44_0= RULE_ID ) ) ) )
            int alt39=13;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt39=1;
                }
                break;
            case 59:
                {
                alt39=2;
                }
                break;
            case 62:
                {
                alt39=3;
                }
                break;
            case 63:
                {
                alt39=4;
                }
                break;
            case RULE_STRING:
                {
                alt39=5;
                }
                break;
            case RULE_INT:
                {
                alt39=6;
                }
                break;
            case RULE_REAL:
                {
                alt39=7;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt39=8;
                }
                break;
            case RULE_NULL:
                {
                alt39=9;
                }
                break;
            case 60:
                {
                alt39=10;
                }
                break;
            case 64:
                {
                alt39=11;
                }
                break;
            case 65:
                {
                alt39=12;
                }
                break;
            case RULE_ID:
                {
                alt39=13;
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
                    // InternalAle.g:2643:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAle.g:2643:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAle.g:2644:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
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
                    otherlv_2=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicLiteralAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAle.g:2662:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalAle.g:2662:3: ( () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalAle.g:2663:4: () otherlv_4= '$' otherlv_5= '[' ( (lv_exp_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalAle.g:2663:4: ()
                    // InternalAle.g:2664:5: 
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
                    // InternalAle.g:2678:4: ( (lv_exp_6_0= ruleExpression ) )
                    // InternalAle.g:2679:5: (lv_exp_6_0= ruleExpression )
                    {
                    // InternalAle.g:2679:5: (lv_exp_6_0= ruleExpression )
                    // InternalAle.g:2680:6: lv_exp_6_0= ruleExpression
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
                    // InternalAle.g:2703:3: ( () otherlv_9= 'self' )
                    {
                    // InternalAle.g:2703:3: ( () otherlv_9= 'self' )
                    // InternalAle.g:2704:4: () otherlv_9= 'self'
                    {
                    // InternalAle.g:2704:4: ()
                    // InternalAle.g:2705:5: 
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
                    // InternalAle.g:2717:3: ( () otherlv_11= 'super' )
                    {
                    // InternalAle.g:2717:3: ( () otherlv_11= 'super' )
                    // InternalAle.g:2718:4: () otherlv_11= 'super'
                    {
                    // InternalAle.g:2718:4: ()
                    // InternalAle.g:2719:5: 
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
                    // InternalAle.g:2731:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    {
                    // InternalAle.g:2731:3: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    // InternalAle.g:2732:4: () ( (lv_value_13_0= RULE_STRING ) )
                    {
                    // InternalAle.g:2732:4: ()
                    // InternalAle.g:2733:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getStringLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2739:4: ( (lv_value_13_0= RULE_STRING ) )
                    // InternalAle.g:2740:5: (lv_value_13_0= RULE_STRING )
                    {
                    // InternalAle.g:2740:5: (lv_value_13_0= RULE_STRING )
                    // InternalAle.g:2741:6: lv_value_13_0= RULE_STRING
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
                    // InternalAle.g:2759:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    {
                    // InternalAle.g:2759:3: ( () ( (lv_value_15_0= RULE_INT ) ) )
                    // InternalAle.g:2760:4: () ( (lv_value_15_0= RULE_INT ) )
                    {
                    // InternalAle.g:2760:4: ()
                    // InternalAle.g:2761:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getIntLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2767:4: ( (lv_value_15_0= RULE_INT ) )
                    // InternalAle.g:2768:5: (lv_value_15_0= RULE_INT )
                    {
                    // InternalAle.g:2768:5: (lv_value_15_0= RULE_INT )
                    // InternalAle.g:2769:6: lv_value_15_0= RULE_INT
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
                    // InternalAle.g:2787:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    {
                    // InternalAle.g:2787:3: ( () ( (lv_value_17_0= RULE_REAL ) ) )
                    // InternalAle.g:2788:4: () ( (lv_value_17_0= RULE_REAL ) )
                    {
                    // InternalAle.g:2788:4: ()
                    // InternalAle.g:2789:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getRealLiteralAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2795:4: ( (lv_value_17_0= RULE_REAL ) )
                    // InternalAle.g:2796:5: (lv_value_17_0= RULE_REAL )
                    {
                    // InternalAle.g:2796:5: (lv_value_17_0= RULE_REAL )
                    // InternalAle.g:2797:6: lv_value_17_0= RULE_REAL
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
                    // InternalAle.g:2815:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalAle.g:2815:3: ( () ( (lv_value_19_0= RULE_BOOLEAN ) ) )
                    // InternalAle.g:2816:4: () ( (lv_value_19_0= RULE_BOOLEAN ) )
                    {
                    // InternalAle.g:2816:4: ()
                    // InternalAle.g:2817:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getBooleanLiteralAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:2823:4: ( (lv_value_19_0= RULE_BOOLEAN ) )
                    // InternalAle.g:2824:5: (lv_value_19_0= RULE_BOOLEAN )
                    {
                    // InternalAle.g:2824:5: (lv_value_19_0= RULE_BOOLEAN )
                    // InternalAle.g:2825:6: lv_value_19_0= RULE_BOOLEAN
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
                    // InternalAle.g:2843:3: ( () this_NULL_21= RULE_NULL )
                    {
                    // InternalAle.g:2843:3: ( () this_NULL_21= RULE_NULL )
                    // InternalAle.g:2844:4: () this_NULL_21= RULE_NULL
                    {
                    // InternalAle.g:2844:4: ()
                    // InternalAle.g:2845:5: 
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
                    // InternalAle.g:2857:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    {
                    // InternalAle.g:2857:3: ( () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']' )
                    // InternalAle.g:2858:4: () otherlv_23= '[' ( (lv_start_24_0= ruleExpression ) ) otherlv_25= '.' otherlv_26= '.' ( (lv_stop_27_0= ruleExpression ) ) otherlv_28= ']'
                    {
                    // InternalAle.g:2858:4: ()
                    // InternalAle.g:2859:5: 
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
                    // InternalAle.g:2869:4: ( (lv_start_24_0= ruleExpression ) )
                    // InternalAle.g:2870:5: (lv_start_24_0= ruleExpression )
                    {
                    // InternalAle.g:2870:5: (lv_start_24_0= ruleExpression )
                    // InternalAle.g:2871:6: lv_start_24_0= ruleExpression
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
                    // InternalAle.g:2896:4: ( (lv_stop_27_0= ruleExpression ) )
                    // InternalAle.g:2897:5: (lv_stop_27_0= ruleExpression )
                    {
                    // InternalAle.g:2897:5: (lv_stop_27_0= ruleExpression )
                    // InternalAle.g:2898:6: lv_stop_27_0= ruleExpression
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
                    // InternalAle.g:2921:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    {
                    // InternalAle.g:2921:3: ( () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}' )
                    // InternalAle.g:2922:4: () otherlv_30= 'Sequence' otherlv_31= '{' ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )? otherlv_35= '}'
                    {
                    // InternalAle.g:2922:4: ()
                    // InternalAle.g:2923:5: 
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
                    otherlv_31=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_10_2());
                      			
                    }
                    // InternalAle.g:2937:4: ( ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_NULL)||LA36_0==27||LA36_0==52||(LA36_0>=55 && LA36_0<=57)||(LA36_0>=59 && LA36_0<=60)||(LA36_0>=62 && LA36_0<=65)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAle.g:2938:5: ( (lv_expressions_32_0= ruleExpression ) ) (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:2938:5: ( (lv_expressions_32_0= ruleExpression ) )
                            // InternalAle.g:2939:6: (lv_expressions_32_0= ruleExpression )
                            {
                            // InternalAle.g:2939:6: (lv_expressions_32_0= ruleExpression )
                            // InternalAle.g:2940:7: lv_expressions_32_0= ruleExpression
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

                            // InternalAle.g:2957:5: (otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==22) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalAle.g:2958:6: otherlv_33= ',' ( (lv_expressions_34_0= ruleExpression ) )
                            	    {
                            	    otherlv_33=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_33, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_10_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:2962:6: ( (lv_expressions_34_0= ruleExpression ) )
                            	    // InternalAle.g:2963:7: (lv_expressions_34_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:2963:7: (lv_expressions_34_0= ruleExpression )
                            	    // InternalAle.g:2964:8: lv_expressions_34_0= ruleExpression
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
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalAle.g:2989:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    {
                    // InternalAle.g:2989:3: ( () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}' )
                    // InternalAle.g:2990:4: () otherlv_37= 'OrderedSet' otherlv_38= '{' ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )? otherlv_42= '}'
                    {
                    // InternalAle.g:2990:4: ()
                    // InternalAle.g:2991:5: 
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
                    otherlv_38=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getAtomicLiteralAccess().getLeftCurlyBracketKeyword_11_2());
                      			
                    }
                    // InternalAle.g:3005:4: ( ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_NULL)||LA38_0==27||LA38_0==52||(LA38_0>=55 && LA38_0<=57)||(LA38_0>=59 && LA38_0<=60)||(LA38_0>=62 && LA38_0<=65)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAle.g:3006:5: ( (lv_expressions_39_0= ruleExpression ) ) (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            {
                            // InternalAle.g:3006:5: ( (lv_expressions_39_0= ruleExpression ) )
                            // InternalAle.g:3007:6: (lv_expressions_39_0= ruleExpression )
                            {
                            // InternalAle.g:3007:6: (lv_expressions_39_0= ruleExpression )
                            // InternalAle.g:3008:7: lv_expressions_39_0= ruleExpression
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

                            // InternalAle.g:3025:5: (otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==22) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalAle.g:3026:6: otherlv_40= ',' ( (lv_expressions_41_0= ruleExpression ) )
                            	    {
                            	    otherlv_40=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_40, grammarAccess.getAtomicLiteralAccess().getCommaKeyword_11_3_1_0());
                            	      					
                            	    }
                            	    // InternalAle.g:3030:6: ( (lv_expressions_41_0= ruleExpression ) )
                            	    // InternalAle.g:3031:7: (lv_expressions_41_0= ruleExpression )
                            	    {
                            	    // InternalAle.g:3031:7: (lv_expressions_41_0= ruleExpression )
                            	    // InternalAle.g:3032:8: lv_expressions_41_0= ruleExpression
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
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_42=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getAtomicLiteralAccess().getRightCurlyBracketKeyword_11_4());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalAle.g:3057:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3057:3: ( () ( (lv_value_44_0= RULE_ID ) ) )
                    // InternalAle.g:3058:4: () ( (lv_value_44_0= RULE_ID ) )
                    {
                    // InternalAle.g:3058:4: ()
                    // InternalAle.g:3059:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicLiteralAccess().getVarRefAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3065:4: ( (lv_value_44_0= RULE_ID ) )
                    // InternalAle.g:3066:5: (lv_value_44_0= RULE_ID )
                    {
                    // InternalAle.g:3066:5: (lv_value_44_0= RULE_ID )
                    // InternalAle.g:3067:6: lv_value_44_0= RULE_ID
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
    // InternalAle.g:3088:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalAle.g:3088:46: (iv_ruleParam= ruleParam EOF )
            // InternalAle.g:3089:2: iv_ruleParam= ruleParam EOF
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
    // InternalAle.g:3095:1: ruleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAle.g:3101:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAle.g:3102:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAle.g:3102:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAle.g:3103:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAle.g:3103:3: ( (lv_type_0_0= ruleType ) )
            // InternalAle.g:3104:4: (lv_type_0_0= ruleType )
            {
            // InternalAle.g:3104:4: (lv_type_0_0= ruleType )
            // InternalAle.g:3105:5: lv_type_0_0= ruleType
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

            // InternalAle.g:3122:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAle.g:3123:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAle.g:3123:4: (lv_name_1_0= RULE_ID )
            // InternalAle.g:3124:5: lv_name_1_0= RULE_ID
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
    // InternalAle.g:3144:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAle.g:3144:45: (iv_ruleType= ruleType EOF )
            // InternalAle.g:3145:2: iv_ruleType= ruleType EOF
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
    // InternalAle.g:3151:1: ruleType returns [EObject current=null] : (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) ;
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
            // InternalAle.g:3157:2: ( (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) ) )
            // InternalAle.g:3158:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            {
            // InternalAle.g:3158:2: (this_LiteralType_0= ruleLiteralType | ( () ( (lv_externalClass_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' ) | ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt40=1;
                }
                break;
            case RULE_ID:
                {
                alt40=2;
                }
                break;
            case 64:
                {
                alt40=3;
                }
                break;
            case 65:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalAle.g:3159:3: this_LiteralType_0= ruleLiteralType
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
                    // InternalAle.g:3168:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    {
                    // InternalAle.g:3168:3: ( () ( (lv_externalClass_2_0= RULE_ID ) ) )
                    // InternalAle.g:3169:4: () ( (lv_externalClass_2_0= RULE_ID ) )
                    {
                    // InternalAle.g:3169:4: ()
                    // InternalAle.g:3170:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getOutOfScopeTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAle.g:3176:4: ( (lv_externalClass_2_0= RULE_ID ) )
                    // InternalAle.g:3177:5: (lv_externalClass_2_0= RULE_ID )
                    {
                    // InternalAle.g:3177:5: (lv_externalClass_2_0= RULE_ID )
                    // InternalAle.g:3178:6: lv_externalClass_2_0= RULE_ID
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
                    // InternalAle.g:3196:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    {
                    // InternalAle.g:3196:3: ( () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')' )
                    // InternalAle.g:3197:4: () otherlv_4= 'Sequence' otherlv_5= '(' ( (lv_subType_6_0= ruleType ) ) otherlv_7= ')'
                    {
                    // InternalAle.g:3197:4: ()
                    // InternalAle.g:3198:5: 
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
                    otherlv_5=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalAle.g:3212:4: ( (lv_subType_6_0= ruleType ) )
                    // InternalAle.g:3213:5: (lv_subType_6_0= ruleType )
                    {
                    // InternalAle.g:3213:5: (lv_subType_6_0= ruleType )
                    // InternalAle.g:3214:6: lv_subType_6_0= ruleType
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

                    otherlv_7=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAle.g:3237:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    {
                    // InternalAle.g:3237:3: ( () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')' )
                    // InternalAle.g:3238:4: () otherlv_9= 'OrderedSet' otherlv_10= '(' ( (lv_subType_11_0= ruleType ) ) otherlv_12= ')'
                    {
                    // InternalAle.g:3238:4: ()
                    // InternalAle.g:3239:5: 
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
                    otherlv_10=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalAle.g:3253:4: ( (lv_subType_11_0= ruleType ) )
                    // InternalAle.g:3254:5: (lv_subType_11_0= ruleType )
                    {
                    // InternalAle.g:3254:5: (lv_subType_11_0= ruleType )
                    // InternalAle.g:3255:6: lv_subType_11_0= ruleType
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

                    otherlv_12=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalAle.g:3281:1: entryRuleLiteralType returns [EObject current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final EObject entryRuleLiteralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralType = null;


        try {
            // InternalAle.g:3281:52: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalAle.g:3282:2: iv_ruleLiteralType= ruleLiteralType EOF
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
    // InternalAle.g:3288:1: ruleLiteralType returns [EObject current=null] : ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) ) ;
    public final EObject ruleLiteralType() throws RecognitionException {
        EObject current = null;

        Token lv_lit_0_1=null;
        Token lv_lit_0_2=null;
        Token lv_lit_0_3=null;
        Token lv_lit_0_4=null;


        	enterRule();

        try {
            // InternalAle.g:3294:2: ( ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) ) )
            // InternalAle.g:3295:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) )
            {
            // InternalAle.g:3295:2: ( ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) ) )
            // InternalAle.g:3296:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) )
            {
            // InternalAle.g:3296:3: ( (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' ) )
            // InternalAle.g:3297:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' )
            {
            // InternalAle.g:3297:4: (lv_lit_0_1= 'Boolean' | lv_lit_0_2= 'Float' | lv_lit_0_3= 'Integer' | lv_lit_0_4= 'String' )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt41=1;
                }
                break;
            case 67:
                {
                alt41=2;
                }
                break;
            case 68:
                {
                alt41=3;
                }
                break;
            case 69:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalAle.g:3298:5: lv_lit_0_1= 'Boolean'
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
                    // InternalAle.g:3309:5: lv_lit_0_2= 'Float'
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
                    // InternalAle.g:3320:5: lv_lit_0_3= 'Integer'
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
                    // InternalAle.g:3331:5: lv_lit_0_4= 'String'
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
    // InternalAle.g:3347:1: entryRuleQualified returns [String current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final String entryRuleQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified = null;


        try {
            // InternalAle.g:3347:49: (iv_ruleQualified= ruleQualified EOF )
            // InternalAle.g:3348:2: iv_ruleQualified= ruleQualified EOF
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
    // InternalAle.g:3354:1: ruleQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAle.g:3360:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAle.g:3361:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAle.g:3361:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAle.g:3362:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAle.g:3369:3: (kw= '.' this_ID_2= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAle.g:3370:4: kw= '.' this_ID_2= RULE_ID
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
            	    break loop42;
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

    // $ANTLR start synpred1_InternalAle
    public final void synpred1_InternalAle_fragment() throws RecognitionException {   
        // InternalAle.g:1590:4: ( ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) ) )
        // InternalAle.g:1590:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        {
        // InternalAle.g:1590:5: ( ( () 'implies' ) ( ( ruleBooleanOperation ) ) )
        // InternalAle.g:1591:5: ( () 'implies' ) ( ( ruleBooleanOperation ) )
        {
        // InternalAle.g:1591:5: ( () 'implies' )
        // InternalAle.g:1592:6: () 'implies'
        {
        // InternalAle.g:1592:6: ()
        // InternalAle.g:1593:6: 
        {
        }

        match(input,39,FOLLOW_20); if (state.failed) return ;

        }

        // InternalAle.g:1596:5: ( ( ruleBooleanOperation ) )
        // InternalAle.g:1597:6: ( ruleBooleanOperation )
        {
        // InternalAle.g:1597:6: ( ruleBooleanOperation )
        // InternalAle.g:1598:7: ruleBooleanOperation
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
        // InternalAle.g:1666:4: ( ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) ) )
        // InternalAle.g:1666:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        {
        // InternalAle.g:1666:5: ( ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) ) )
        // InternalAle.g:1667:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) ) ( ( ruleCompareOperation ) )
        {
        // InternalAle.g:1667:5: ( ( () 'or' ) | ( () 'and' ) | ( () 'xor' ) )
        int alt43=3;
        switch ( input.LA(1) ) {
        case 40:
            {
            alt43=1;
            }
            break;
        case 41:
            {
            alt43=2;
            }
            break;
        case 42:
            {
            alt43=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 43, 0, input);

            throw nvae;
        }

        switch (alt43) {
            case 1 :
                // InternalAle.g:1668:6: ( () 'or' )
                {
                // InternalAle.g:1668:6: ( () 'or' )
                // InternalAle.g:1669:7: () 'or'
                {
                // InternalAle.g:1669:7: ()
                // InternalAle.g:1670:7: 
                {
                }

                match(input,40,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1674:6: ( () 'and' )
                {
                // InternalAle.g:1674:6: ( () 'and' )
                // InternalAle.g:1675:7: () 'and'
                {
                // InternalAle.g:1675:7: ()
                // InternalAle.g:1676:7: 
                {
                }

                match(input,41,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1680:6: ( () 'xor' )
                {
                // InternalAle.g:1680:6: ( () 'xor' )
                // InternalAle.g:1681:7: () 'xor'
                {
                // InternalAle.g:1681:7: ()
                // InternalAle.g:1682:7: 
                {
                }

                match(input,42,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:1686:5: ( ( ruleCompareOperation ) )
        // InternalAle.g:1687:6: ( ruleCompareOperation )
        {
        // InternalAle.g:1687:6: ( ruleCompareOperation )
        // InternalAle.g:1688:7: ruleCompareOperation
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
        // InternalAle.g:1786:4: ( ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) ) )
        // InternalAle.g:1786:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) )
        {
        // InternalAle.g:1786:5: ( ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) ) )
        // InternalAle.g:1787:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) ) ( ( ruleEqualityOperation ) )
        {
        // InternalAle.g:1787:5: ( ( () '<=' ) | ( () '>=' ) | ( () '!=' ) | ( () '<' ) | ( () '>' ) )
        int alt44=5;
        switch ( input.LA(1) ) {
        case 43:
            {
            alt44=1;
            }
            break;
        case 44:
            {
            alt44=2;
            }
            break;
        case 45:
            {
            alt44=3;
            }
            break;
        case 46:
            {
            alt44=4;
            }
            break;
        case 47:
            {
            alt44=5;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 44, 0, input);

            throw nvae;
        }

        switch (alt44) {
            case 1 :
                // InternalAle.g:1788:6: ( () '<=' )
                {
                // InternalAle.g:1788:6: ( () '<=' )
                // InternalAle.g:1789:7: () '<='
                {
                // InternalAle.g:1789:7: ()
                // InternalAle.g:1790:7: 
                {
                }

                match(input,43,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:1794:6: ( () '>=' )
                {
                // InternalAle.g:1794:6: ( () '>=' )
                // InternalAle.g:1795:7: () '>='
                {
                // InternalAle.g:1795:7: ()
                // InternalAle.g:1796:7: 
                {
                }

                match(input,44,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 3 :
                // InternalAle.g:1800:6: ( () '!=' )
                {
                // InternalAle.g:1800:6: ( () '!=' )
                // InternalAle.g:1801:7: () '!='
                {
                // InternalAle.g:1801:7: ()
                // InternalAle.g:1802:7: 
                {
                }

                match(input,45,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 4 :
                // InternalAle.g:1806:6: ( () '<' )
                {
                // InternalAle.g:1806:6: ( () '<' )
                // InternalAle.g:1807:7: () '<'
                {
                // InternalAle.g:1807:7: ()
                // InternalAle.g:1808:7: 
                {
                }

                match(input,46,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 5 :
                // InternalAle.g:1812:6: ( () '>' )
                {
                // InternalAle.g:1812:6: ( () '>' )
                // InternalAle.g:1813:7: () '>'
                {
                // InternalAle.g:1813:7: ()
                // InternalAle.g:1814:7: 
                {
                }

                match(input,47,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:1818:5: ( ( ruleEqualityOperation ) )
        // InternalAle.g:1819:6: ( ruleEqualityOperation )
        {
        // InternalAle.g:1819:6: ( ruleEqualityOperation )
        // InternalAle.g:1820:7: ruleEqualityOperation
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
        // InternalAle.g:1946:4: ( ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) ) )
        // InternalAle.g:1946:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        {
        // InternalAle.g:1946:5: ( () ( ( '==' ) ) ( ( ruleMultOperation ) ) )
        // InternalAle.g:1947:5: () ( ( '==' ) ) ( ( ruleMultOperation ) )
        {
        // InternalAle.g:1947:5: ()
        // InternalAle.g:1948:5: 
        {
        }

        // InternalAle.g:1949:5: ( ( '==' ) )
        // InternalAle.g:1950:6: ( '==' )
        {
        // InternalAle.g:1950:6: ( '==' )
        // InternalAle.g:1951:7: '=='
        {
        match(input,48,FOLLOW_20); if (state.failed) return ;

        }


        }

        // InternalAle.g:1954:5: ( ( ruleMultOperation ) )
        // InternalAle.g:1955:6: ( ruleMultOperation )
        {
        // InternalAle.g:1955:6: ( ruleMultOperation )
        // InternalAle.g:1956:7: ruleMultOperation
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
        // InternalAle.g:2032:4: ( ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) ) )
        // InternalAle.g:2032:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        {
        // InternalAle.g:2032:5: ( ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) ) )
        // InternalAle.g:2033:5: ( ( () '*' ) | ( () '/' ) ) ( ( ruleAddOperation ) )
        {
        // InternalAle.g:2033:5: ( ( () '*' ) | ( () '/' ) )
        int alt45=2;
        int LA45_0 = input.LA(1);

        if ( (LA45_0==49) ) {
            alt45=1;
        }
        else if ( (LA45_0==50) ) {
            alt45=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 45, 0, input);

            throw nvae;
        }
        switch (alt45) {
            case 1 :
                // InternalAle.g:2034:6: ( () '*' )
                {
                // InternalAle.g:2034:6: ( () '*' )
                // InternalAle.g:2035:7: () '*'
                {
                // InternalAle.g:2035:7: ()
                // InternalAle.g:2036:7: 
                {
                }

                match(input,49,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2040:6: ( () '/' )
                {
                // InternalAle.g:2040:6: ( () '/' )
                // InternalAle.g:2041:7: () '/'
                {
                // InternalAle.g:2041:7: ()
                // InternalAle.g:2042:7: 
                {
                }

                match(input,50,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2046:5: ( ( ruleAddOperation ) )
        // InternalAle.g:2047:6: ( ruleAddOperation )
        {
        // InternalAle.g:2047:6: ( ruleAddOperation )
        // InternalAle.g:2048:7: ruleAddOperation
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
        // InternalAle.g:2132:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) ) )
        // InternalAle.g:2132:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        {
        // InternalAle.g:2132:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) ) )
        // InternalAle.g:2133:5: ( ( () '+' ) | ( () '-' ) ) ( ( ruleChaindedCall ) )
        {
        // InternalAle.g:2133:5: ( ( () '+' ) | ( () '-' ) )
        int alt46=2;
        int LA46_0 = input.LA(1);

        if ( (LA46_0==51) ) {
            alt46=1;
        }
        else if ( (LA46_0==52) ) {
            alt46=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 46, 0, input);

            throw nvae;
        }
        switch (alt46) {
            case 1 :
                // InternalAle.g:2134:6: ( () '+' )
                {
                // InternalAle.g:2134:6: ( () '+' )
                // InternalAle.g:2135:7: () '+'
                {
                // InternalAle.g:2135:7: ()
                // InternalAle.g:2136:7: 
                {
                }

                match(input,51,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2140:6: ( () '-' )
                {
                // InternalAle.g:2140:6: ( () '-' )
                // InternalAle.g:2141:7: () '-'
                {
                // InternalAle.g:2141:7: ()
                // InternalAle.g:2142:7: 
                {
                }

                match(input,52,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2146:5: ( ( ruleChaindedCall ) )
        // InternalAle.g:2147:6: ( ruleChaindedCall )
        {
        // InternalAle.g:2147:6: ( ruleChaindedCall )
        // InternalAle.g:2148:7: ruleChaindedCall
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
        // InternalAle.g:2232:4: ( ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) ) )
        // InternalAle.g:2232:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        {
        // InternalAle.g:2232:5: ( ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) ) )
        // InternalAle.g:2233:5: ( ( () '.' ) | ( () '->' ) ) ( ( ruleInfixOperation ) )
        {
        // InternalAle.g:2233:5: ( ( () '.' ) | ( () '->' ) )
        int alt47=2;
        int LA47_0 = input.LA(1);

        if ( (LA47_0==53) ) {
            alt47=1;
        }
        else if ( (LA47_0==54) ) {
            alt47=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 47, 0, input);

            throw nvae;
        }
        switch (alt47) {
            case 1 :
                // InternalAle.g:2234:6: ( () '.' )
                {
                // InternalAle.g:2234:6: ( () '.' )
                // InternalAle.g:2235:7: () '.'
                {
                // InternalAle.g:2235:7: ()
                // InternalAle.g:2236:7: 
                {
                }

                match(input,53,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalAle.g:2240:6: ( () '->' )
                {
                // InternalAle.g:2240:6: ( () '->' )
                // InternalAle.g:2241:7: () '->'
                {
                // InternalAle.g:2241:7: ()
                // InternalAle.g:2242:7: 
                {
                }

                match(input,54,FOLLOW_20); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalAle.g:2246:5: ( ( ruleInfixOperation ) )
        // InternalAle.g:2247:6: ( ruleInfixOperation )
        {
        // InternalAle.g:2247:6: ( ruleInfixOperation )
        // InternalAle.g:2248:7: ruleInfixOperation
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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\2\27\7\uffff";
    static final String dfa_3s = "\1\105\1\uffff\1\66\2\33\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\5\12\21\uffff\1\12\2\uffff\1\13\1\11\1\10\1\uffff\1\6\1\uffff\1\7\1\5\16\uffff\1\12\2\uffff\3\12\1\uffff\2\12\1\uffff\2\12\1\3\1\4\4\1",
            "",
            "\1\1\12\uffff\1\12\13\uffff\1\12\12\uffff\1\1\20\12",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "728:2: ( (this_VarAssign_0= ruleVarAssign otherlv_1= ';' ) | this_ForLoop_2= ruleForLoop | this_IfStatement_3= ruleIfStatement | this_WhileStatement_4= ruleWhileStatement | (this_LetStatement_5= ruleLetStatement otherlv_6= ';' ) | (this_ReturnStatement_7= ruleReturnStatement otherlv_8= ';' ) | (this_Expression_9= ruleExpression otherlv_10= ';' ) | (this_DebugStatement_11= ruleDebugStatement otherlv_12= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000023000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xDB900000080003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xDB900001080003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xDB900035C90003F0L,0x000000000000003FL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000F80000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xDB900000180003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xDB900000090003F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000002L});

}