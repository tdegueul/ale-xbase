package iot.simpleexpressions.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import iot.simpleexpressions.xtext.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INTEGER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'sensor'", "'provides'", "'actuator'", "'board'", "'['", "']'", "'sketch'", "'operation'", "'('", "','", "')'", "'long'", "'double'", "'unsigned'", "'short'", "'println'", "'='", "'if'", "'then'", "'else'", "'end'", "'=='", "'+'", "'-'", "'rand'", "'activity'", "'nodes'", "'edges'", "'action'", "'comp'", "'in'", "'out'", "'service'", "'initial'", "'final'", "'fork'", "'join'", "'merge'", "'decision'", "'int'", "'bool'", "'true'", "'false'", "'flow'", "'from'", "'to'", "'RaspberryPi'", "'Arduino'", "'BeagleBoard'", "'inout'", "'float'", "'char'", "'wchar'", "'string'", "'wstring'", "'boolean'", "'octet'", "'any'", "'<'", "'<='", "'>='", "'>'", "'!'", "'&'", "'|'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=6;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIoTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private IoTGrammarAccess grammarAccess;

        public InternalIoTParser(TokenStream input, IoTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected IoTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalIoT.g:71:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalIoT.g:71:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalIoT.g:72:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalIoT.g:78:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )* )? ( ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )* )? ( (lv_sketch_7_0= ruleSketch ) )? otherlv_8= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_components_3_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_boards_5_0 = null;

        EObject lv_boards_6_0 = null;

        EObject lv_sketch_7_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:84:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )* )? ( ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )* )? ( (lv_sketch_7_0= ruleSketch ) )? otherlv_8= '}' ) )
            // InternalIoT.g:85:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )* )? ( ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )* )? ( (lv_sketch_7_0= ruleSketch ) )? otherlv_8= '}' )
            {
            // InternalIoT.g:85:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )* )? ( ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )* )? ( (lv_sketch_7_0= ruleSketch ) )? otherlv_8= '}' )
            // InternalIoT.g:86:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )* )? ( ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )* )? ( (lv_sketch_7_0= ruleSketch ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
              		
            }
            // InternalIoT.g:90:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:91:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:91:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:92:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSystemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalIoT.g:112:3: ( ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15||LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIoT.g:113:4: ( (lv_components_3_0= ruleHWComponent ) ) ( (lv_components_4_0= ruleHWComponent ) )*
                    {
                    // InternalIoT.g:113:4: ( (lv_components_3_0= ruleHWComponent ) )
                    // InternalIoT.g:114:5: (lv_components_3_0= ruleHWComponent )
                    {
                    // InternalIoT.g:114:5: (lv_components_3_0= ruleHWComponent )
                    // InternalIoT.g:115:6: lv_components_3_0= ruleHWComponent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSystemAccess().getComponentsHWComponentParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_components_3_0=ruleHWComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSystemRule());
                      						}
                      						add(
                      							current,
                      							"components",
                      							lv_components_3_0,
                      							"iot.simpleexpressions.xtext.IoT.HWComponent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:132:4: ( (lv_components_4_0= ruleHWComponent ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15||LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIoT.g:133:5: (lv_components_4_0= ruleHWComponent )
                    	    {
                    	    // InternalIoT.g:133:5: (lv_components_4_0= ruleHWComponent )
                    	    // InternalIoT.g:134:6: lv_components_4_0= ruleHWComponent
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSystemAccess().getComponentsHWComponentParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_5);
                    	    lv_components_4_0=ruleHWComponent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"components",
                    	      							lv_components_4_0,
                    	      							"iot.simpleexpressions.xtext.IoT.HWComponent");
                    	      						afterParserOrEnumRuleCall();
                    	      					
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

            // InternalIoT.g:152:3: ( ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoT.g:153:4: ( (lv_boards_5_0= ruleBoard ) ) ( (lv_boards_6_0= ruleBoard ) )*
                    {
                    // InternalIoT.g:153:4: ( (lv_boards_5_0= ruleBoard ) )
                    // InternalIoT.g:154:5: (lv_boards_5_0= ruleBoard )
                    {
                    // InternalIoT.g:154:5: (lv_boards_5_0= ruleBoard )
                    // InternalIoT.g:155:6: lv_boards_5_0= ruleBoard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSystemAccess().getBoardsBoardParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_boards_5_0=ruleBoard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSystemRule());
                      						}
                      						add(
                      							current,
                      							"boards",
                      							lv_boards_5_0,
                      							"iot.simpleexpressions.xtext.IoT.Board");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:172:4: ( (lv_boards_6_0= ruleBoard ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIoT.g:173:5: (lv_boards_6_0= ruleBoard )
                    	    {
                    	    // InternalIoT.g:173:5: (lv_boards_6_0= ruleBoard )
                    	    // InternalIoT.g:174:6: lv_boards_6_0= ruleBoard
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSystemAccess().getBoardsBoardParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_boards_6_0=ruleBoard();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSystemRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"boards",
                    	      							lv_boards_6_0,
                    	      							"iot.simpleexpressions.xtext.IoT.Board");
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
                    break;

            }

            // InternalIoT.g:192:3: ( (lv_sketch_7_0= ruleSketch ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoT.g:193:4: (lv_sketch_7_0= ruleSketch )
                    {
                    // InternalIoT.g:193:4: (lv_sketch_7_0= ruleSketch )
                    // InternalIoT.g:194:5: lv_sketch_7_0= ruleSketch
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSystemAccess().getSketchSketchParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_sketch_7_0=ruleSketch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSystemRule());
                      					}
                      					set(
                      						current,
                      						"sketch",
                      						lv_sketch_7_0,
                      						"iot.simpleexpressions.xtext.IoT.Sketch");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleHWComponent"
    // InternalIoT.g:219:1: entryRuleHWComponent returns [EObject current=null] : iv_ruleHWComponent= ruleHWComponent EOF ;
    public final EObject entryRuleHWComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHWComponent = null;


        try {
            // InternalIoT.g:219:52: (iv_ruleHWComponent= ruleHWComponent EOF )
            // InternalIoT.g:220:2: iv_ruleHWComponent= ruleHWComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHWComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHWComponent=ruleHWComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHWComponent; 
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
    // $ANTLR end "entryRuleHWComponent"


    // $ANTLR start "ruleHWComponent"
    // InternalIoT.g:226:1: ruleHWComponent returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleHWComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalIoT.g:232:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalIoT.g:233:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalIoT.g:233:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
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
                    // InternalIoT.g:234:3: this_Sensor_0= ruleSensor
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHWComponentAccess().getSensorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sensor_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:246:3: this_Actuator_1= ruleActuator
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHWComponentAccess().getActuatorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Actuator_1;
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
    // $ANTLR end "ruleHWComponent"


    // $ANTLR start "entryRuleSensor"
    // InternalIoT.g:261:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoT.g:261:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoT.g:262:2: iv_ruleSensor= ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoT.g:268:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_services_4_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:274:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? ) )
            // InternalIoT.g:275:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? )
            {
            // InternalIoT.g:275:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? )
            // InternalIoT.g:276:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
              		
            }
            // InternalIoT.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:298:3: (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIoT.g:299:4: otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    // InternalIoT.g:303:4: (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalIoT.g:304:5: otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getProvidesKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:308:5: ( (lv_services_4_0= ruleIotOperationDef ) )
                    	    // InternalIoT.g:309:6: (lv_services_4_0= ruleIotOperationDef )
                    	    {
                    	    // InternalIoT.g:309:6: (lv_services_4_0= ruleIotOperationDef )
                    	    // InternalIoT.g:310:7: lv_services_4_0= ruleIotOperationDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSensorAccess().getServicesIotOperationDefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_services_4_0=ruleIotOperationDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSensorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"services",
                    	      								lv_services_4_0,
                    	      								"iot.simpleexpressions.xtext.IoT.IotOperationDef");
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

                    otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_2_2());
                      			
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalIoT.g:337:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalIoT.g:337:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalIoT.g:338:2: iv_ruleActuator= ruleActuator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActuatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalIoT.g:344:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_services_4_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:350:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? ) )
            // InternalIoT.g:351:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? )
            {
            // InternalIoT.g:351:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )? )
            // InternalIoT.g:352:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
              		
            }
            // InternalIoT.g:356:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:357:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:357:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:358:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActuatorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:374:3: (otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoT.g:375:4: otherlv_2= '{' (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    // InternalIoT.g:379:4: (otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalIoT.g:380:5: otherlv_3= 'provides' ( (lv_services_4_0= ruleIotOperationDef ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getProvidesKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:384:5: ( (lv_services_4_0= ruleIotOperationDef ) )
                    	    // InternalIoT.g:385:6: (lv_services_4_0= ruleIotOperationDef )
                    	    {
                    	    // InternalIoT.g:385:6: (lv_services_4_0= ruleIotOperationDef )
                    	    // InternalIoT.g:386:7: lv_services_4_0= ruleIotOperationDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActuatorAccess().getServicesIotOperationDefParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_services_4_0=ruleIotOperationDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActuatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"services",
                    	      								lv_services_4_0,
                    	      								"iot.simpleexpressions.xtext.IoT.IotOperationDef");
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

                    otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_2_2());
                      			
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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleBoard"
    // InternalIoT.g:413:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIoT.g:413:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIoT.g:414:2: iv_ruleBoard= ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoard; 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalIoT.g:420:1: ruleBoard returns [EObject current=null] : ( () otherlv_1= 'board' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_type_4_0= ruleBoardType ) ) otherlv_5= ']' (otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:426:2: ( ( () otherlv_1= 'board' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_type_4_0= ruleBoardType ) ) otherlv_5= ']' (otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? ) )
            // InternalIoT.g:427:2: ( () otherlv_1= 'board' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_type_4_0= ruleBoardType ) ) otherlv_5= ']' (otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? )
            {
            // InternalIoT.g:427:2: ( () otherlv_1= 'board' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_type_4_0= ruleBoardType ) ) otherlv_5= ']' (otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? )
            // InternalIoT.g:428:3: () otherlv_1= 'board' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_type_4_0= ruleBoardType ) ) otherlv_5= ']' (otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            {
            // InternalIoT.g:428:3: ()
            // InternalIoT.g:429:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoardAccess().getBoardAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getBoardKeyword_1());
              		
            }
            // InternalIoT.g:442:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:443:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:443:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:444:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getBoardAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBoardRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalIoT.g:464:3: ( (lv_type_4_0= ruleBoardType ) )
            // InternalIoT.g:465:4: (lv_type_4_0= ruleBoardType )
            {
            // InternalIoT.g:465:4: (lv_type_4_0= ruleBoardType )
            // InternalIoT.g:466:5: lv_type_4_0= ruleBoardType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoardAccess().getTypeBoardTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_type_4_0=ruleBoardType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoardRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"iot.simpleexpressions.xtext.IoT.BoardType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBoardAccess().getRightSquareBracketKeyword_5());
              		
            }
            // InternalIoT.g:487:3: (otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoT.g:488:4: otherlv_6= '{' (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_6_0());
                      			
                    }
                    // InternalIoT.g:492:4: (otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalIoT.g:493:5: otherlv_7= 'provides' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getProvidesKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:497:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalIoT.g:498:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalIoT.g:498:6: (otherlv_8= RULE_ID )
                    	    // InternalIoT.g:499:7: otherlv_8= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getBoardRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getComponentsHWCompCrossReference_6_1_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_6_2());
                      			
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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleSketch"
    // InternalIoT.g:523:1: entryRuleSketch returns [EObject current=null] : iv_ruleSketch= ruleSketch EOF ;
    public final EObject entryRuleSketch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSketch = null;


        try {
            // InternalIoT.g:523:47: (iv_ruleSketch= ruleSketch EOF )
            // InternalIoT.g:524:2: iv_ruleSketch= ruleSketch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSketchRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSketch=ruleSketch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSketch; 
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
    // $ANTLR end "entryRuleSketch"


    // $ANTLR start "ruleSketch"
    // InternalIoT.g:530:1: ruleSketch returns [EObject current=null] : ( () otherlv_1= 'sketch' otherlv_2= '{' ( (lv_activity_3_0= ruleIotActivity ) ) otherlv_4= '}' ) ;
    public final EObject ruleSketch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_activity_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:536:2: ( ( () otherlv_1= 'sketch' otherlv_2= '{' ( (lv_activity_3_0= ruleIotActivity ) ) otherlv_4= '}' ) )
            // InternalIoT.g:537:2: ( () otherlv_1= 'sketch' otherlv_2= '{' ( (lv_activity_3_0= ruleIotActivity ) ) otherlv_4= '}' )
            {
            // InternalIoT.g:537:2: ( () otherlv_1= 'sketch' otherlv_2= '{' ( (lv_activity_3_0= ruleIotActivity ) ) otherlv_4= '}' )
            // InternalIoT.g:538:3: () otherlv_1= 'sketch' otherlv_2= '{' ( (lv_activity_3_0= ruleIotActivity ) ) otherlv_4= '}'
            {
            // InternalIoT.g:538:3: ()
            // InternalIoT.g:539:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSketchAccess().getSketchAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSketchAccess().getSketchKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,13,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSketchAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalIoT.g:556:3: ( (lv_activity_3_0= ruleIotActivity ) )
            // InternalIoT.g:557:4: (lv_activity_3_0= ruleIotActivity )
            {
            // InternalIoT.g:557:4: (lv_activity_3_0= ruleIotActivity )
            // InternalIoT.g:558:5: lv_activity_3_0= ruleIotActivity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSketchAccess().getActivityIotActivityParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_activity_3_0=ruleIotActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSketchRule());
              					}
              					set(
              						current,
              						"activity",
              						lv_activity_3_0,
              						"iot.simpleexpressions.xtext.IoT.IotActivity");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSketchAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleSketch"


    // $ANTLR start "entryRuleIotOperationDef"
    // InternalIoT.g:583:1: entryRuleIotOperationDef returns [EObject current=null] : iv_ruleIotOperationDef= ruleIotOperationDef EOF ;
    public final EObject entryRuleIotOperationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIotOperationDef = null;


        try {
            // InternalIoT.g:583:56: (iv_ruleIotOperationDef= ruleIotOperationDef EOF )
            // InternalIoT.g:584:2: iv_ruleIotOperationDef= ruleIotOperationDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIotOperationDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIotOperationDef=ruleIotOperationDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIotOperationDef; 
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
    // $ANTLR end "entryRuleIotOperationDef"


    // $ANTLR start "ruleIotOperationDef"
    // InternalIoT.g:590:1: ruleIotOperationDef returns [EObject current=null] : ( () ( (lv_delegate_1_0= ruleOperationDef ) ) ) ;
    public final EObject ruleIotOperationDef() throws RecognitionException {
        EObject current = null;

        EObject lv_delegate_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:596:2: ( ( () ( (lv_delegate_1_0= ruleOperationDef ) ) ) )
            // InternalIoT.g:597:2: ( () ( (lv_delegate_1_0= ruleOperationDef ) ) )
            {
            // InternalIoT.g:597:2: ( () ( (lv_delegate_1_0= ruleOperationDef ) ) )
            // InternalIoT.g:598:3: () ( (lv_delegate_1_0= ruleOperationDef ) )
            {
            // InternalIoT.g:598:3: ()
            // InternalIoT.g:599:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIotOperationDefAccess().getIotOperationDefBindOperationDefAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:608:3: ( (lv_delegate_1_0= ruleOperationDef ) )
            // InternalIoT.g:609:4: (lv_delegate_1_0= ruleOperationDef )
            {
            // InternalIoT.g:609:4: (lv_delegate_1_0= ruleOperationDef )
            // InternalIoT.g:610:5: lv_delegate_1_0= ruleOperationDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIotOperationDefAccess().getDelegateOperationDefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_delegate_1_0=ruleOperationDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIotOperationDefRule());
              					}
              					set(
              						current,
              						"delegate",
              						lv_delegate_1_0,
              						"iot.simpleexpressions.xtext.IoT.OperationDef");
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
    // $ANTLR end "ruleIotOperationDef"


    // $ANTLR start "entryRuleOperationDef"
    // InternalIoT.g:631:1: entryRuleOperationDef returns [EObject current=null] : iv_ruleOperationDef= ruleOperationDef EOF ;
    public final EObject entryRuleOperationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDef = null;


        try {
            // InternalIoT.g:631:53: (iv_ruleOperationDef= ruleOperationDef EOF )
            // InternalIoT.g:632:2: iv_ruleOperationDef= ruleOperationDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationDef=ruleOperationDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDef; 
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
    // $ANTLR end "entryRuleOperationDef"


    // $ANTLR start "ruleOperationDef"
    // InternalIoT.g:638:1: ruleOperationDef returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_stmt_8_0= ruleIdlStmt ) ) otherlv_9= '}' ) ;
    public final EObject ruleOperationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_stmt_8_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:644:2: ( (otherlv_0= 'operation' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_stmt_8_0= ruleIdlStmt ) ) otherlv_9= '}' ) )
            // InternalIoT.g:645:2: (otherlv_0= 'operation' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_stmt_8_0= ruleIdlStmt ) ) otherlv_9= '}' )
            {
            // InternalIoT.g:645:2: (otherlv_0= 'operation' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_stmt_8_0= ruleIdlStmt ) ) otherlv_9= '}' )
            // InternalIoT.g:646:3: otherlv_0= 'operation' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_stmt_8_0= ruleIdlStmt ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationDefAccess().getOperationKeyword_0());
              		
            }
            // InternalIoT.g:650:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalIoT.g:651:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalIoT.g:651:4: (lv_identifier_1_0= RULE_ID )
            // InternalIoT.g:652:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_1_0, grammarAccess.getOperationDefAccess().getIdentifierIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperationDefAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalIoT.g:672:3: ( ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=45 && LA14_0<=46)||LA14_0==64) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoT.g:673:4: ( (lv_parameters_3_0= ruleParameterDef ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )*
                    {
                    // InternalIoT.g:673:4: ( (lv_parameters_3_0= ruleParameterDef ) )
                    // InternalIoT.g:674:5: (lv_parameters_3_0= ruleParameterDef )
                    {
                    // InternalIoT.g:674:5: (lv_parameters_3_0= ruleParameterDef )
                    // InternalIoT.g:675:6: lv_parameters_3_0= ruleParameterDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationDefAccess().getParametersParameterDefParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_parameters_3_0=ruleParameterDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationDefRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"iot.simpleexpressions.xtext.IoT.ParameterDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:692:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==24) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalIoT.g:693:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDef ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOperationDefAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:697:5: ( (lv_parameters_5_0= ruleParameterDef ) )
                    	    // InternalIoT.g:698:6: (lv_parameters_5_0= ruleParameterDef )
                    	    {
                    	    // InternalIoT.g:698:6: (lv_parameters_5_0= ruleParameterDef )
                    	    // InternalIoT.g:699:7: lv_parameters_5_0= ruleParameterDef
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationDefAccess().getParametersParameterDefParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_parameters_5_0=ruleParameterDef();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationDefRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"iot.simpleexpressions.xtext.IoT.ParameterDef");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOperationDefAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,13,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationDefAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalIoT.g:726:3: ( (lv_stmt_8_0= ruleIdlStmt ) )
            // InternalIoT.g:727:4: (lv_stmt_8_0= ruleIdlStmt )
            {
            // InternalIoT.g:727:4: (lv_stmt_8_0= ruleIdlStmt )
            // InternalIoT.g:728:5: lv_stmt_8_0= ruleIdlStmt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationDefAccess().getStmtIdlStmtParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_stmt_8_0=ruleIdlStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationDefRule());
              					}
              					set(
              						current,
              						"stmt",
              						lv_stmt_8_0,
              						"iot.simpleexpressions.xtext.IoT.IdlStmt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getOperationDefAccess().getRightCurlyBracketKeyword_7());
              		
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
    // $ANTLR end "ruleOperationDef"


    // $ANTLR start "entryRuleIdlStmt"
    // InternalIoT.g:753:1: entryRuleIdlStmt returns [EObject current=null] : iv_ruleIdlStmt= ruleIdlStmt EOF ;
    public final EObject entryRuleIdlStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdlStmt = null;


        try {
            // InternalIoT.g:753:48: (iv_ruleIdlStmt= ruleIdlStmt EOF )
            // InternalIoT.g:754:2: iv_ruleIdlStmt= ruleIdlStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdlStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdlStmt=ruleIdlStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdlStmt; 
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
    // $ANTLR end "entryRuleIdlStmt"


    // $ANTLR start "ruleIdlStmt"
    // InternalIoT.g:760:1: ruleIdlStmt returns [EObject current=null] : ( () ( (lv_delegate_1_0= ruleBlock ) ) ) ;
    public final EObject ruleIdlStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_delegate_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:766:2: ( ( () ( (lv_delegate_1_0= ruleBlock ) ) ) )
            // InternalIoT.g:767:2: ( () ( (lv_delegate_1_0= ruleBlock ) ) )
            {
            // InternalIoT.g:767:2: ( () ( (lv_delegate_1_0= ruleBlock ) ) )
            // InternalIoT.g:768:3: () ( (lv_delegate_1_0= ruleBlock ) )
            {
            // InternalIoT.g:768:3: ()
            // InternalIoT.g:769:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIdlStmtAccess().getIdlStmtBindBlockAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:778:3: ( (lv_delegate_1_0= ruleBlock ) )
            // InternalIoT.g:779:4: (lv_delegate_1_0= ruleBlock )
            {
            // InternalIoT.g:779:4: (lv_delegate_1_0= ruleBlock )
            // InternalIoT.g:780:5: lv_delegate_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIdlStmtAccess().getDelegateBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_delegate_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIdlStmtRule());
              					}
              					set(
              						current,
              						"delegate",
              						lv_delegate_1_0,
              						"iot.simpleexpressions.xtext.IoT.Block");
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
    // $ANTLR end "ruleIdlStmt"


    // $ANTLR start "entryRuleParameterDef"
    // InternalIoT.g:801:1: entryRuleParameterDef returns [EObject current=null] : iv_ruleParameterDef= ruleParameterDef EOF ;
    public final EObject entryRuleParameterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDef = null;


        try {
            // InternalIoT.g:801:53: (iv_ruleParameterDef= ruleParameterDef EOF )
            // InternalIoT.g:802:2: iv_ruleParameterDef= ruleParameterDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDef=ruleParameterDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDef; 
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
    // $ANTLR end "entryRuleParameterDef"


    // $ANTLR start "ruleParameterDef"
    // InternalIoT.g:808:1: ruleParameterDef returns [EObject current=null] : ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDef() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Enumerator lv_direction_0_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:814:2: ( ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // InternalIoT.g:815:2: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // InternalIoT.g:815:2: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( (lv_identifier_1_0= RULE_ID ) ) )
            // InternalIoT.g:816:3: ( (lv_direction_0_0= ruleparam_attribute ) ) ( (lv_identifier_1_0= RULE_ID ) )
            {
            // InternalIoT.g:816:3: ( (lv_direction_0_0= ruleparam_attribute ) )
            // InternalIoT.g:817:4: (lv_direction_0_0= ruleparam_attribute )
            {
            // InternalIoT.g:817:4: (lv_direction_0_0= ruleparam_attribute )
            // InternalIoT.g:818:5: lv_direction_0_0= ruleparam_attribute
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterDefAccess().getDirectionParam_attributeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_direction_0_0=ruleparam_attribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterDefRule());
              					}
              					set(
              						current,
              						"direction",
              						lv_direction_0_0,
              						"iot.simpleexpressions.xtext.IoT.param_attribute");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:835:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalIoT.g:836:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalIoT.g:836:4: (lv_identifier_1_0= RULE_ID )
            // InternalIoT.g:837:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifier_1_0, grammarAccess.getParameterDefAccess().getIdentifierIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"identifier",
              						lv_identifier_1_0,
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
    // $ANTLR end "ruleParameterDef"


    // $ANTLR start "entryRulefloating_pt_type"
    // InternalIoT.g:857:1: entryRulefloating_pt_type returns [EObject current=null] : iv_rulefloating_pt_type= rulefloating_pt_type EOF ;
    public final EObject entryRulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloating_pt_type = null;


        try {
            // InternalIoT.g:857:57: (iv_rulefloating_pt_type= rulefloating_pt_type EOF )
            // InternalIoT.g:858:2: iv_rulefloating_pt_type= rulefloating_pt_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloating_pt_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloating_pt_type=rulefloating_pt_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloating_pt_type; 
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
    // $ANTLR end "entryRulefloating_pt_type"


    // $ANTLR start "rulefloating_pt_type"
    // InternalIoT.g:864:1: rulefloating_pt_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) ;
    public final EObject rulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:870:2: ( ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) )
            // InternalIoT.g:871:2: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
            {
            // InternalIoT.g:871:2: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalIoT.g:872:3: ( (lv_kind_0_0= rulefloat_type ) )
                    {
                    // InternalIoT.g:872:3: ( (lv_kind_0_0= rulefloat_type ) )
                    // InternalIoT.g:873:4: (lv_kind_0_0= rulefloat_type )
                    {
                    // InternalIoT.g:873:4: (lv_kind_0_0= rulefloat_type )
                    // InternalIoT.g:874:5: lv_kind_0_0= rulefloat_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindFloat_typeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_0_0=rulefloat_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFloating_pt_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"iot.simpleexpressions.xtext.IoT.float_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:892:3: ( (lv_kind_1_0= ruledouble_type ) )
                    {
                    // InternalIoT.g:892:3: ( (lv_kind_1_0= ruledouble_type ) )
                    // InternalIoT.g:893:4: (lv_kind_1_0= ruledouble_type )
                    {
                    // InternalIoT.g:893:4: (lv_kind_1_0= ruledouble_type )
                    // InternalIoT.g:894:5: lv_kind_1_0= ruledouble_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindDouble_typeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_1_0=ruledouble_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFloating_pt_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"iot.simpleexpressions.xtext.IoT.double_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:912:3: ( (lv_kind_2_0= rulelongdouble_type ) )
                    {
                    // InternalIoT.g:912:3: ( (lv_kind_2_0= rulelongdouble_type ) )
                    // InternalIoT.g:913:4: (lv_kind_2_0= rulelongdouble_type )
                    {
                    // InternalIoT.g:913:4: (lv_kind_2_0= rulelongdouble_type )
                    // InternalIoT.g:914:5: lv_kind_2_0= rulelongdouble_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindLongdouble_typeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_2_0=rulelongdouble_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFloating_pt_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_2_0,
                      						"iot.simpleexpressions.xtext.IoT.longdouble_type");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "rulefloating_pt_type"


    // $ANTLR start "entryRulelongdouble_type"
    // InternalIoT.g:935:1: entryRulelongdouble_type returns [String current=null] : iv_rulelongdouble_type= rulelongdouble_type EOF ;
    public final String entryRulelongdouble_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelongdouble_type = null;


        try {
            // InternalIoT.g:935:55: (iv_rulelongdouble_type= rulelongdouble_type EOF )
            // InternalIoT.g:936:2: iv_rulelongdouble_type= rulelongdouble_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLongdouble_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelongdouble_type=rulelongdouble_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelongdouble_type.getText(); 
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
    // $ANTLR end "entryRulelongdouble_type"


    // $ANTLR start "rulelongdouble_type"
    // InternalIoT.g:942:1: rulelongdouble_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'double' ) ;
    public final AntlrDatatypeRuleToken rulelongdouble_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:948:2: ( (kw= 'long' kw= 'double' ) )
            // InternalIoT.g:949:2: (kw= 'long' kw= 'double' )
            {
            // InternalIoT.g:949:2: (kw= 'long' kw= 'double' )
            // InternalIoT.g:950:3: kw= 'long' kw= 'double'
            {
            kw=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLongdouble_typeAccess().getLongKeyword_0());
              		
            }
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLongdouble_typeAccess().getDoubleKeyword_1());
              		
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
    // $ANTLR end "rulelongdouble_type"


    // $ANTLR start "entryRuleinteger_type"
    // InternalIoT.g:964:1: entryRuleinteger_type returns [EObject current=null] : iv_ruleinteger_type= ruleinteger_type EOF ;
    public final EObject entryRuleinteger_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_type = null;


        try {
            // InternalIoT.g:964:53: (iv_ruleinteger_type= ruleinteger_type EOF )
            // InternalIoT.g:965:2: iv_ruleinteger_type= ruleinteger_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteger_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinteger_type=ruleinteger_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinteger_type; 
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
    // $ANTLR end "entryRuleinteger_type"


    // $ANTLR start "ruleinteger_type"
    // InternalIoT.g:971:1: ruleinteger_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) ;
    public final EObject ruleinteger_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:977:2: ( ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) )
            // InternalIoT.g:978:2: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            {
            // InternalIoT.g:978:2: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalIoT.g:979:3: ( (lv_kind_0_0= ruleshort_type ) )
                    {
                    // InternalIoT.g:979:3: ( (lv_kind_0_0= ruleshort_type ) )
                    // InternalIoT.g:980:4: (lv_kind_0_0= ruleshort_type )
                    {
                    // InternalIoT.g:980:4: (lv_kind_0_0= ruleshort_type )
                    // InternalIoT.g:981:5: lv_kind_0_0= ruleshort_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInteger_typeAccess().getKindShort_typeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_0_0=ruleshort_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"iot.simpleexpressions.xtext.IoT.short_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:999:3: ( (lv_kind_1_0= rulelong_type ) )
                    {
                    // InternalIoT.g:999:3: ( (lv_kind_1_0= rulelong_type ) )
                    // InternalIoT.g:1000:4: (lv_kind_1_0= rulelong_type )
                    {
                    // InternalIoT.g:1000:4: (lv_kind_1_0= rulelong_type )
                    // InternalIoT.g:1001:5: lv_kind_1_0= rulelong_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInteger_typeAccess().getKindLong_typeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_1_0=rulelong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"iot.simpleexpressions.xtext.IoT.long_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:1019:3: ( (lv_kind_2_0= rulelonglong_type ) )
                    {
                    // InternalIoT.g:1019:3: ( (lv_kind_2_0= rulelonglong_type ) )
                    // InternalIoT.g:1020:4: (lv_kind_2_0= rulelonglong_type )
                    {
                    // InternalIoT.g:1020:4: (lv_kind_2_0= rulelonglong_type )
                    // InternalIoT.g:1021:5: lv_kind_2_0= rulelonglong_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInteger_typeAccess().getKindLonglong_typeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_2_0=rulelonglong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_2_0,
                      						"iot.simpleexpressions.xtext.IoT.longlong_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:1039:3: ( (lv_kind_3_0= ruleushort_type ) )
                    {
                    // InternalIoT.g:1039:3: ( (lv_kind_3_0= ruleushort_type ) )
                    // InternalIoT.g:1040:4: (lv_kind_3_0= ruleushort_type )
                    {
                    // InternalIoT.g:1040:4: (lv_kind_3_0= ruleushort_type )
                    // InternalIoT.g:1041:5: lv_kind_3_0= ruleushort_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInteger_typeAccess().getKindUshort_typeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_3_0=ruleushort_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_3_0,
                      						"iot.simpleexpressions.xtext.IoT.ushort_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalIoT.g:1059:3: ( (lv_kind_4_0= ruleulong_type ) )
                    {
                    // InternalIoT.g:1059:3: ( (lv_kind_4_0= ruleulong_type ) )
                    // InternalIoT.g:1060:4: (lv_kind_4_0= ruleulong_type )
                    {
                    // InternalIoT.g:1060:4: (lv_kind_4_0= ruleulong_type )
                    // InternalIoT.g:1061:5: lv_kind_4_0= ruleulong_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlong_typeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_4_0=ruleulong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_4_0,
                      						"iot.simpleexpressions.xtext.IoT.ulong_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalIoT.g:1079:3: ( (lv_kind_5_0= ruleulonglong_type ) )
                    {
                    // InternalIoT.g:1079:3: ( (lv_kind_5_0= ruleulonglong_type ) )
                    // InternalIoT.g:1080:4: (lv_kind_5_0= ruleulonglong_type )
                    {
                    // InternalIoT.g:1080:4: (lv_kind_5_0= ruleulonglong_type )
                    // InternalIoT.g:1081:5: lv_kind_5_0= ruleulonglong_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlonglong_typeParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_5_0=ruleulonglong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_5_0,
                      						"iot.simpleexpressions.xtext.IoT.ulonglong_type");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleinteger_type"


    // $ANTLR start "entryRulelonglong_type"
    // InternalIoT.g:1102:1: entryRulelonglong_type returns [String current=null] : iv_rulelonglong_type= rulelonglong_type EOF ;
    public final String entryRulelonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelonglong_type = null;


        try {
            // InternalIoT.g:1102:53: (iv_rulelonglong_type= rulelonglong_type EOF )
            // InternalIoT.g:1103:2: iv_rulelonglong_type= rulelonglong_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLonglong_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelonglong_type=rulelonglong_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelonglong_type.getText(); 
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
    // $ANTLR end "entryRulelonglong_type"


    // $ANTLR start "rulelonglong_type"
    // InternalIoT.g:1109:1: rulelonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken rulelonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1115:2: ( (kw= 'long' kw= 'long' ) )
            // InternalIoT.g:1116:2: (kw= 'long' kw= 'long' )
            {
            // InternalIoT.g:1116:2: (kw= 'long' kw= 'long' )
            // InternalIoT.g:1117:3: kw= 'long' kw= 'long'
            {
            kw=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLonglong_typeAccess().getLongKeyword_0());
              		
            }
            kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLonglong_typeAccess().getLongKeyword_1());
              		
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
    // $ANTLR end "rulelonglong_type"


    // $ANTLR start "entryRuleushort_type"
    // InternalIoT.g:1131:1: entryRuleushort_type returns [String current=null] : iv_ruleushort_type= ruleushort_type EOF ;
    public final String entryRuleushort_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleushort_type = null;


        try {
            // InternalIoT.g:1131:51: (iv_ruleushort_type= ruleushort_type EOF )
            // InternalIoT.g:1132:2: iv_ruleushort_type= ruleushort_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUshort_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleushort_type=ruleushort_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleushort_type.getText(); 
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
    // $ANTLR end "entryRuleushort_type"


    // $ANTLR start "ruleushort_type"
    // InternalIoT.g:1138:1: ruleushort_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'short' ) ;
    public final AntlrDatatypeRuleToken ruleushort_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1144:2: ( (kw= 'unsigned' kw= 'short' ) )
            // InternalIoT.g:1145:2: (kw= 'unsigned' kw= 'short' )
            {
            // InternalIoT.g:1145:2: (kw= 'unsigned' kw= 'short' )
            // InternalIoT.g:1146:3: kw= 'unsigned' kw= 'short'
            {
            kw=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUshort_typeAccess().getUnsignedKeyword_0());
              		
            }
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUshort_typeAccess().getShortKeyword_1());
              		
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
    // $ANTLR end "ruleushort_type"


    // $ANTLR start "entryRuleulong_type"
    // InternalIoT.g:1160:1: entryRuleulong_type returns [String current=null] : iv_ruleulong_type= ruleulong_type EOF ;
    public final String entryRuleulong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulong_type = null;


        try {
            // InternalIoT.g:1160:50: (iv_ruleulong_type= ruleulong_type EOF )
            // InternalIoT.g:1161:2: iv_ruleulong_type= ruleulong_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUlong_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleulong_type=ruleulong_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleulong_type.getText(); 
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
    // $ANTLR end "entryRuleulong_type"


    // $ANTLR start "ruleulong_type"
    // InternalIoT.g:1167:1: ruleulong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1173:2: ( (kw= 'unsigned' kw= 'long' ) )
            // InternalIoT.g:1174:2: (kw= 'unsigned' kw= 'long' )
            {
            // InternalIoT.g:1174:2: (kw= 'unsigned' kw= 'long' )
            // InternalIoT.g:1175:3: kw= 'unsigned' kw= 'long'
            {
            kw=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUlong_typeAccess().getUnsignedKeyword_0());
              		
            }
            kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUlong_typeAccess().getLongKeyword_1());
              		
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
    // $ANTLR end "ruleulong_type"


    // $ANTLR start "entryRuleulonglong_type"
    // InternalIoT.g:1189:1: entryRuleulonglong_type returns [String current=null] : iv_ruleulonglong_type= ruleulonglong_type EOF ;
    public final String entryRuleulonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulonglong_type = null;


        try {
            // InternalIoT.g:1189:54: (iv_ruleulonglong_type= ruleulonglong_type EOF )
            // InternalIoT.g:1190:2: iv_ruleulonglong_type= ruleulonglong_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUlonglong_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleulonglong_type=ruleulonglong_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleulonglong_type.getText(); 
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
    // $ANTLR end "entryRuleulonglong_type"


    // $ANTLR start "ruleulonglong_type"
    // InternalIoT.g:1196:1: ruleulonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1202:2: ( (kw= 'unsigned' kw= 'long' kw= 'long' ) )
            // InternalIoT.g:1203:2: (kw= 'unsigned' kw= 'long' kw= 'long' )
            {
            // InternalIoT.g:1203:2: (kw= 'unsigned' kw= 'long' kw= 'long' )
            // InternalIoT.g:1204:3: kw= 'unsigned' kw= 'long' kw= 'long'
            {
            kw=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUlonglong_typeAccess().getUnsignedKeyword_0());
              		
            }
            kw=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUlonglong_typeAccess().getLongKeyword_1());
              		
            }
            kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getUlonglong_typeAccess().getLongKeyword_2());
              		
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
    // $ANTLR end "ruleulonglong_type"


    // $ANTLR start "entryRulecharstr_type"
    // InternalIoT.g:1223:1: entryRulecharstr_type returns [EObject current=null] : iv_rulecharstr_type= rulecharstr_type EOF ;
    public final EObject entryRulecharstr_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharstr_type = null;


        try {
            // InternalIoT.g:1223:53: (iv_rulecharstr_type= rulecharstr_type EOF )
            // InternalIoT.g:1224:2: iv_rulecharstr_type= rulecharstr_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharstr_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecharstr_type=rulecharstr_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecharstr_type; 
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
    // $ANTLR end "entryRulecharstr_type"


    // $ANTLR start "rulecharstr_type"
    // InternalIoT.g:1230:1: rulecharstr_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) ;
    public final EObject rulecharstr_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1236:2: ( ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) )
            // InternalIoT.g:1237:2: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
            {
            // InternalIoT.g:1237:2: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt17=1;
                }
                break;
            case 67:
                {
                alt17=2;
                }
                break;
            case 68:
                {
                alt17=3;
                }
                break;
            case 69:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalIoT.g:1238:3: ( (lv_kind_0_0= rulechar_type ) )
                    {
                    // InternalIoT.g:1238:3: ( (lv_kind_0_0= rulechar_type ) )
                    // InternalIoT.g:1239:4: (lv_kind_0_0= rulechar_type )
                    {
                    // InternalIoT.g:1239:4: (lv_kind_0_0= rulechar_type )
                    // InternalIoT.g:1240:5: lv_kind_0_0= rulechar_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindChar_typeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_0_0=rulechar_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"iot.simpleexpressions.xtext.IoT.char_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1258:3: ( (lv_kind_1_0= rulewide_char_type ) )
                    {
                    // InternalIoT.g:1258:3: ( (lv_kind_1_0= rulewide_char_type ) )
                    // InternalIoT.g:1259:4: (lv_kind_1_0= rulewide_char_type )
                    {
                    // InternalIoT.g:1259:4: (lv_kind_1_0= rulewide_char_type )
                    // InternalIoT.g:1260:5: lv_kind_1_0= rulewide_char_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_char_typeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_1_0=rulewide_char_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"iot.simpleexpressions.xtext.IoT.wide_char_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:1278:3: ( (lv_kind_2_0= rulestring_type ) )
                    {
                    // InternalIoT.g:1278:3: ( (lv_kind_2_0= rulestring_type ) )
                    // InternalIoT.g:1279:4: (lv_kind_2_0= rulestring_type )
                    {
                    // InternalIoT.g:1279:4: (lv_kind_2_0= rulestring_type )
                    // InternalIoT.g:1280:5: lv_kind_2_0= rulestring_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindString_typeEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_2_0=rulestring_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_2_0,
                      						"iot.simpleexpressions.xtext.IoT.string_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:1298:3: ( (lv_kind_3_0= rulewide_string_type ) )
                    {
                    // InternalIoT.g:1298:3: ( (lv_kind_3_0= rulewide_string_type ) )
                    // InternalIoT.g:1299:4: (lv_kind_3_0= rulewide_string_type )
                    {
                    // InternalIoT.g:1299:4: (lv_kind_3_0= rulewide_string_type )
                    // InternalIoT.g:1300:5: lv_kind_3_0= rulewide_string_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_string_typeEnumRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_3_0=rulewide_string_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_3_0,
                      						"iot.simpleexpressions.xtext.IoT.wide_string_type");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "rulecharstr_type"


    // $ANTLR start "entryRuleother_type"
    // InternalIoT.g:1321:1: entryRuleother_type returns [EObject current=null] : iv_ruleother_type= ruleother_type EOF ;
    public final EObject entryRuleother_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleother_type = null;


        try {
            // InternalIoT.g:1321:51: (iv_ruleother_type= ruleother_type EOF )
            // InternalIoT.g:1322:2: iv_ruleother_type= ruleother_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOther_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleother_type=ruleother_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleother_type; 
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
    // $ANTLR end "entryRuleother_type"


    // $ANTLR start "ruleother_type"
    // InternalIoT.g:1328:1: ruleother_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) ;
    public final EObject ruleother_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1334:2: ( ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) )
            // InternalIoT.g:1335:2: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
            {
            // InternalIoT.g:1335:2: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt18=1;
                }
                break;
            case 71:
                {
                alt18=2;
                }
                break;
            case 72:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalIoT.g:1336:3: ( (lv_kind_0_0= ruleboolean_type ) )
                    {
                    // InternalIoT.g:1336:3: ( (lv_kind_0_0= ruleboolean_type ) )
                    // InternalIoT.g:1337:4: (lv_kind_0_0= ruleboolean_type )
                    {
                    // InternalIoT.g:1337:4: (lv_kind_0_0= ruleboolean_type )
                    // InternalIoT.g:1338:5: lv_kind_0_0= ruleboolean_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOther_typeAccess().getKindBoolean_typeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_0_0=ruleboolean_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOther_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_0_0,
                      						"iot.simpleexpressions.xtext.IoT.boolean_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1356:3: ( (lv_kind_1_0= ruleoctet_type ) )
                    {
                    // InternalIoT.g:1356:3: ( (lv_kind_1_0= ruleoctet_type ) )
                    // InternalIoT.g:1357:4: (lv_kind_1_0= ruleoctet_type )
                    {
                    // InternalIoT.g:1357:4: (lv_kind_1_0= ruleoctet_type )
                    // InternalIoT.g:1358:5: lv_kind_1_0= ruleoctet_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOther_typeAccess().getKindOctet_typeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_1_0=ruleoctet_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOther_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_1_0,
                      						"iot.simpleexpressions.xtext.IoT.octet_type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:1376:3: ( (lv_kind_2_0= ruleany_type ) )
                    {
                    // InternalIoT.g:1376:3: ( (lv_kind_2_0= ruleany_type ) )
                    // InternalIoT.g:1377:4: (lv_kind_2_0= ruleany_type )
                    {
                    // InternalIoT.g:1377:4: (lv_kind_2_0= ruleany_type )
                    // InternalIoT.g:1378:5: lv_kind_2_0= ruleany_type
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOther_typeAccess().getKindAny_typeEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_kind_2_0=ruleany_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOther_typeRule());
                      					}
                      					set(
                      						current,
                      						"kind",
                      						lv_kind_2_0,
                      						"iot.simpleexpressions.xtext.IoT.any_type");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleother_type"


    // $ANTLR start "entryRuleBlock"
    // InternalIoT.g:1399:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalIoT.g:1399:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalIoT.g:1400:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalIoT.g:1406:1: ruleBlock returns [EObject current=null] : ( () ( (lv_stmts_1_0= ruleStatement ) )* ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_stmts_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1412:2: ( ( () ( (lv_stmts_1_0= ruleStatement ) )* ) )
            // InternalIoT.g:1413:2: ( () ( (lv_stmts_1_0= ruleStatement ) )* )
            {
            // InternalIoT.g:1413:2: ( () ( (lv_stmts_1_0= ruleStatement ) )* )
            // InternalIoT.g:1414:3: () ( (lv_stmts_1_0= ruleStatement ) )*
            {
            // InternalIoT.g:1414:3: ()
            // InternalIoT.g:1415:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:1424:3: ( (lv_stmts_1_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==30||LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIoT.g:1425:4: (lv_stmts_1_0= ruleStatement )
            	    {
            	    // InternalIoT.g:1425:4: (lv_stmts_1_0= ruleStatement )
            	    // InternalIoT.g:1426:5: lv_stmts_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStmtsStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_stmts_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"stmts",
            	      						lv_stmts_1_0,
            	      						"iot.simpleexpressions.xtext.IoT.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalIoT.g:1447:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalIoT.g:1447:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalIoT.g:1448:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalIoT.g:1454:1: ruleStatement returns [EObject current=null] : (this_Print_0= rulePrint | this_Assign_1= ruleAssign | this_IfStmt_2= ruleIfStmt ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_Assign_1 = null;

        EObject this_IfStmt_2 = null;



        	enterRule();

        try {
            // InternalIoT.g:1460:2: ( (this_Print_0= rulePrint | this_Assign_1= ruleAssign | this_IfStmt_2= ruleIfStmt ) )
            // InternalIoT.g:1461:2: (this_Print_0= rulePrint | this_Assign_1= ruleAssign | this_IfStmt_2= ruleIfStmt )
            {
            // InternalIoT.g:1461:2: (this_Print_0= rulePrint | this_Assign_1= ruleAssign | this_IfStmt_2= ruleIfStmt )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=2;
                }
                break;
            case 32:
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
                    // InternalIoT.g:1462:3: this_Print_0= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_0=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1474:3: this_Assign_1= ruleAssign
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getAssignParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assign_1=ruleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assign_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoT.g:1486:3: this_IfStmt_2= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmt_2=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStmt_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrint"
    // InternalIoT.g:1501:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalIoT.g:1501:46: (iv_rulePrint= rulePrint EOF )
            // InternalIoT.g:1502:2: iv_rulePrint= rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalIoT.g:1508:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIoT.g:1514:2: ( ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalIoT.g:1515:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalIoT.g:1515:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalIoT.g:1516:3: () otherlv_1= 'println' otherlv_2= '(' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalIoT.g:1516:3: ()
            // InternalIoT.g:1517:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPrintAccess().getPrintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintlnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalIoT.g:1534:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalIoT.g:1535:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalIoT.g:1535:4: (lv_name_3_0= RULE_STRING )
            // InternalIoT.g:1536:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getPrintAccess().getNameSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrintRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleAssign"
    // InternalIoT.g:1560:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalIoT.g:1560:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalIoT.g:1561:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalIoT.g:1567:1: ruleAssign returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleASPlus ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1573:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleASPlus ) ) ) )
            // InternalIoT.g:1574:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleASPlus ) ) )
            {
            // InternalIoT.g:1574:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleASPlus ) ) )
            // InternalIoT.g:1575:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleASPlus ) )
            {
            // InternalIoT.g:1575:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:1576:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:1576:4: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:1577:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAssignAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssignRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:1597:3: ( (lv_val_2_0= ruleASPlus ) )
            // InternalIoT.g:1598:4: (lv_val_2_0= ruleASPlus )
            {
            // InternalIoT.g:1598:4: (lv_val_2_0= ruleASPlus )
            // InternalIoT.g:1599:5: lv_val_2_0= ruleASPlus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignAccess().getValASPlusParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_val_2_0=ruleASPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignRule());
              					}
              					set(
              						current,
              						"val",
              						lv_val_2_0,
              						"iot.simpleexpressions.xtext.IoT.ASPlus");
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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleIfStmt"
    // InternalIoT.g:1620:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalIoT.g:1620:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalIoT.g:1621:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt; 
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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalIoT.g:1627:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_test_2_0= ruleEqualityTest ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_ifBranch_5_0= ruleAssign ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) ) )? otherlv_8= 'end' ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_test_2_0 = null;

        EObject lv_ifBranch_5_0 = null;

        EObject lv_elseBranch_7_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1633:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_test_2_0= ruleEqualityTest ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_ifBranch_5_0= ruleAssign ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) ) )? otherlv_8= 'end' ) )
            // InternalIoT.g:1634:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_test_2_0= ruleEqualityTest ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_ifBranch_5_0= ruleAssign ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) ) )? otherlv_8= 'end' )
            {
            // InternalIoT.g:1634:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_test_2_0= ruleEqualityTest ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_ifBranch_5_0= ruleAssign ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) ) )? otherlv_8= 'end' )
            // InternalIoT.g:1635:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_test_2_0= ruleEqualityTest ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_ifBranch_5_0= ruleAssign ) ) (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) ) )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalIoT.g:1643:3: ( (lv_test_2_0= ruleEqualityTest ) )
            // InternalIoT.g:1644:4: (lv_test_2_0= ruleEqualityTest )
            {
            // InternalIoT.g:1644:4: (lv_test_2_0= ruleEqualityTest )
            // InternalIoT.g:1645:5: lv_test_2_0= ruleEqualityTest
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtAccess().getTestEqualityTestParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_test_2_0=ruleEqualityTest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRule());
              					}
              					set(
              						current,
              						"test",
              						lv_test_2_0,
              						"iot.simpleexpressions.xtext.IoT.EqualityTest");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfStmtAccess().getThenKeyword_4());
              		
            }
            // InternalIoT.g:1670:3: ( (lv_ifBranch_5_0= ruleAssign ) )
            // InternalIoT.g:1671:4: (lv_ifBranch_5_0= ruleAssign )
            {
            // InternalIoT.g:1671:4: (lv_ifBranch_5_0= ruleAssign )
            // InternalIoT.g:1672:5: lv_ifBranch_5_0= ruleAssign
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtAccess().getIfBranchAssignParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_ifBranch_5_0=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRule());
              					}
              					set(
              						current,
              						"ifBranch",
              						lv_ifBranch_5_0,
              						"iot.simpleexpressions.xtext.IoT.Assign");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:1689:3: (otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIoT.g:1690:4: otherlv_6= 'else' ( (lv_elseBranch_7_0= ruleAssign ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIfStmtAccess().getElseKeyword_6_0());
                      			
                    }
                    // InternalIoT.g:1694:4: ( (lv_elseBranch_7_0= ruleAssign ) )
                    // InternalIoT.g:1695:5: (lv_elseBranch_7_0= ruleAssign )
                    {
                    // InternalIoT.g:1695:5: (lv_elseBranch_7_0= ruleAssign )
                    // InternalIoT.g:1696:6: lv_elseBranch_7_0= ruleAssign
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStmtAccess().getElseBranchAssignParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_elseBranch_7_0=ruleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                      						}
                      						set(
                      							current,
                      							"elseBranch",
                      							lv_elseBranch_7_0,
                      							"iot.simpleexpressions.xtext.IoT.Assign");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getIfStmtAccess().getEndKeyword_7());
              		
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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleEqualityTest"
    // InternalIoT.g:1722:1: entryRuleEqualityTest returns [EObject current=null] : iv_ruleEqualityTest= ruleEqualityTest EOF ;
    public final EObject entryRuleEqualityTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityTest = null;


        try {
            // InternalIoT.g:1722:53: (iv_ruleEqualityTest= ruleEqualityTest EOF )
            // InternalIoT.g:1723:2: iv_ruleEqualityTest= ruleEqualityTest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityTestRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityTest=ruleEqualityTest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityTest; 
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
    // $ANTLR end "entryRuleEqualityTest"


    // $ANTLR start "ruleEqualityTest"
    // InternalIoT.g:1729:1: ruleEqualityTest returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleASPlus ) ) otherlv_1= '==' ( (lv_rhs_2_0= ruleASPlus ) ) ) ;
    public final EObject ruleEqualityTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1735:2: ( ( ( (lv_lhs_0_0= ruleASPlus ) ) otherlv_1= '==' ( (lv_rhs_2_0= ruleASPlus ) ) ) )
            // InternalIoT.g:1736:2: ( ( (lv_lhs_0_0= ruleASPlus ) ) otherlv_1= '==' ( (lv_rhs_2_0= ruleASPlus ) ) )
            {
            // InternalIoT.g:1736:2: ( ( (lv_lhs_0_0= ruleASPlus ) ) otherlv_1= '==' ( (lv_rhs_2_0= ruleASPlus ) ) )
            // InternalIoT.g:1737:3: ( (lv_lhs_0_0= ruleASPlus ) ) otherlv_1= '==' ( (lv_rhs_2_0= ruleASPlus ) )
            {
            // InternalIoT.g:1737:3: ( (lv_lhs_0_0= ruleASPlus ) )
            // InternalIoT.g:1738:4: (lv_lhs_0_0= ruleASPlus )
            {
            // InternalIoT.g:1738:4: (lv_lhs_0_0= ruleASPlus )
            // InternalIoT.g:1739:5: lv_lhs_0_0= ruleASPlus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualityTestAccess().getLhsASPlusParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_lhs_0_0=ruleASPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualityTestRule());
              					}
              					set(
              						current,
              						"lhs",
              						lv_lhs_0_0,
              						"iot.simpleexpressions.xtext.IoT.ASPlus");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEqualityTestAccess().getEqualsSignEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:1760:3: ( (lv_rhs_2_0= ruleASPlus ) )
            // InternalIoT.g:1761:4: (lv_rhs_2_0= ruleASPlus )
            {
            // InternalIoT.g:1761:4: (lv_rhs_2_0= ruleASPlus )
            // InternalIoT.g:1762:5: lv_rhs_2_0= ruleASPlus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEqualityTestAccess().getRhsASPlusParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rhs_2_0=ruleASPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEqualityTestRule());
              					}
              					set(
              						current,
              						"rhs",
              						lv_rhs_2_0,
              						"iot.simpleexpressions.xtext.IoT.ASPlus");
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
    // $ANTLR end "ruleEqualityTest"


    // $ANTLR start "entryRuleASPlus"
    // InternalIoT.g:1783:1: entryRuleASPlus returns [EObject current=null] : iv_ruleASPlus= ruleASPlus EOF ;
    public final EObject entryRuleASPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASPlus = null;


        try {
            // InternalIoT.g:1783:47: (iv_ruleASPlus= ruleASPlus EOF )
            // InternalIoT.g:1784:2: iv_ruleASPlus= ruleASPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleASPlus=ruleASPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASPlus; 
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
    // $ANTLR end "entryRuleASPlus"


    // $ANTLR start "ruleASPlus"
    // InternalIoT.g:1790:1: ruleASPlus returns [EObject current=null] : (this_ASMinus_0= ruleASMinus ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) ) )? ) ;
    public final EObject ruleASPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ASMinus_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1796:2: ( (this_ASMinus_0= ruleASMinus ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) ) )? ) )
            // InternalIoT.g:1797:2: (this_ASMinus_0= ruleASMinus ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) ) )? )
            {
            // InternalIoT.g:1797:2: (this_ASMinus_0= ruleASMinus ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) ) )? )
            // InternalIoT.g:1798:3: this_ASMinus_0= ruleASMinus ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getASPlusAccess().getASMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_ASMinus_0=ruleASMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ASMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalIoT.g:1809:3: ( () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIoT.g:1810:4: () otherlv_2= '+' ( (lv_rhs_3_0= ruleArith ) )
                    {
                    // InternalIoT.g:1810:4: ()
                    // InternalIoT.g:1811:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getASPlusAccess().getArithPlusLhsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,37,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getASPlusAccess().getPlusSignKeyword_1_1());
                      			
                    }
                    // InternalIoT.g:1824:4: ( (lv_rhs_3_0= ruleArith ) )
                    // InternalIoT.g:1825:5: (lv_rhs_3_0= ruleArith )
                    {
                    // InternalIoT.g:1825:5: (lv_rhs_3_0= ruleArith )
                    // InternalIoT.g:1826:6: lv_rhs_3_0= ruleArith
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getASPlusAccess().getRhsArithParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_3_0=ruleArith();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getASPlusRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"iot.simpleexpressions.xtext.IoT.Arith");
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
    // $ANTLR end "ruleASPlus"


    // $ANTLR start "entryRuleASMinus"
    // InternalIoT.g:1848:1: entryRuleASMinus returns [EObject current=null] : iv_ruleASMinus= ruleASMinus EOF ;
    public final EObject entryRuleASMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASMinus = null;


        try {
            // InternalIoT.g:1848:48: (iv_ruleASMinus= ruleASMinus EOF )
            // InternalIoT.g:1849:2: iv_ruleASMinus= ruleASMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleASMinus=ruleASMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASMinus; 
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
    // $ANTLR end "entryRuleASMinus"


    // $ANTLR start "ruleASMinus"
    // InternalIoT.g:1855:1: ruleASMinus returns [EObject current=null] : (this_Arith_0= ruleArith ( () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) ) )? ) ;
    public final EObject ruleASMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Arith_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1861:2: ( (this_Arith_0= ruleArith ( () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) ) )? ) )
            // InternalIoT.g:1862:2: (this_Arith_0= ruleArith ( () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) ) )? )
            {
            // InternalIoT.g:1862:2: (this_Arith_0= ruleArith ( () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) ) )? )
            // InternalIoT.g:1863:3: this_Arith_0= ruleArith ( () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getASMinusAccess().getArithParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_Arith_0=ruleArith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Arith_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalIoT.g:1874:3: ( () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIoT.g:1875:4: () otherlv_2= '-' ( (lv_rhs_3_0= ruleArith ) )
                    {
                    // InternalIoT.g:1875:4: ()
                    // InternalIoT.g:1876:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getASMinusAccess().getArithMinusLhsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getASMinusAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalIoT.g:1889:4: ( (lv_rhs_3_0= ruleArith ) )
                    // InternalIoT.g:1890:5: (lv_rhs_3_0= ruleArith )
                    {
                    // InternalIoT.g:1890:5: (lv_rhs_3_0= ruleArith )
                    // InternalIoT.g:1891:6: lv_rhs_3_0= ruleArith
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getASMinusAccess().getRhsArithParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_3_0=ruleArith();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getASMinusRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"iot.simpleexpressions.xtext.IoT.Arith");
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
    // $ANTLR end "ruleASMinus"


    // $ANTLR start "entryRuleArith"
    // InternalIoT.g:1913:1: entryRuleArith returns [EObject current=null] : iv_ruleArith= ruleArith EOF ;
    public final EObject entryRuleArith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArith = null;


        try {
            // InternalIoT.g:1913:46: (iv_ruleArith= ruleArith EOF )
            // InternalIoT.g:1914:2: iv_ruleArith= ruleArith EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArith=ruleArith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArith; 
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
    // $ANTLR end "entryRuleArith"


    // $ANTLR start "ruleArith"
    // InternalIoT.g:1920:1: ruleArith returns [EObject current=null] : (this_ALLit_0= ruleALLit | this_VarRef_1= ruleVarRef | this_Rand_2= ruleRand | this_Parenthesis_3= ruleParenthesis ) ;
    public final EObject ruleArith() throws RecognitionException {
        EObject current = null;

        EObject this_ALLit_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_Rand_2 = null;

        EObject this_Parenthesis_3 = null;



        	enterRule();

        try {
            // InternalIoT.g:1926:2: ( (this_ALLit_0= ruleALLit | this_VarRef_1= ruleVarRef | this_Rand_2= ruleRand | this_Parenthesis_3= ruleParenthesis ) )
            // InternalIoT.g:1927:2: (this_ALLit_0= ruleALLit | this_VarRef_1= ruleVarRef | this_Rand_2= ruleRand | this_Parenthesis_3= ruleParenthesis )
            {
            // InternalIoT.g:1927:2: (this_ALLit_0= ruleALLit | this_VarRef_1= ruleVarRef | this_Rand_2= ruleRand | this_Parenthesis_3= ruleParenthesis )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt24=1;
                }
                break;
            case RULE_ID:
                {
                alt24=2;
                }
                break;
            case 39:
                {
                alt24=3;
                }
                break;
            case 23:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalIoT.g:1928:3: this_ALLit_0= ruleALLit
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithAccess().getALLitParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ALLit_0=ruleALLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ALLit_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1940:3: this_VarRef_1= ruleVarRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithAccess().getVarRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoT.g:1952:3: this_Rand_2= ruleRand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithAccess().getRandParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Rand_2=ruleRand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Rand_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIoT.g:1964:3: this_Parenthesis_3= ruleParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArithAccess().getParenthesisParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_3=ruleParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parenthesis_3;
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
    // $ANTLR end "ruleArith"


    // $ANTLR start "entryRuleParenthesis"
    // InternalIoT.g:1979:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalIoT.g:1979:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalIoT.g:1980:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalIoT.g:1986:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_ASPlus_1= ruleASPlus otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ASPlus_1 = null;



        	enterRule();

        try {
            // InternalIoT.g:1992:2: ( (otherlv_0= '(' this_ASPlus_1= ruleASPlus otherlv_2= ')' ) )
            // InternalIoT.g:1993:2: (otherlv_0= '(' this_ASPlus_1= ruleASPlus otherlv_2= ')' )
            {
            // InternalIoT.g:1993:2: (otherlv_0= '(' this_ASPlus_1= ruleASPlus otherlv_2= ')' )
            // InternalIoT.g:1994:3: otherlv_0= '(' this_ASPlus_1= ruleASPlus otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParenthesisAccess().getASPlusParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_25);
            this_ASPlus_1=ruleASPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ASPlus_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleALLit"
    // InternalIoT.g:2017:1: entryRuleALLit returns [EObject current=null] : iv_ruleALLit= ruleALLit EOF ;
    public final EObject entryRuleALLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALLit = null;


        try {
            // InternalIoT.g:2017:46: (iv_ruleALLit= ruleALLit EOF )
            // InternalIoT.g:2018:2: iv_ruleALLit= ruleALLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALLit=ruleALLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALLit; 
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
    // $ANTLR end "entryRuleALLit"


    // $ANTLR start "ruleALLit"
    // InternalIoT.g:2024:1: ruleALLit returns [EObject current=null] : ( () ( (lv_val_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleALLit() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:2030:2: ( ( () ( (lv_val_1_0= RULE_INTEGER ) ) ) )
            // InternalIoT.g:2031:2: ( () ( (lv_val_1_0= RULE_INTEGER ) ) )
            {
            // InternalIoT.g:2031:2: ( () ( (lv_val_1_0= RULE_INTEGER ) ) )
            // InternalIoT.g:2032:3: () ( (lv_val_1_0= RULE_INTEGER ) )
            {
            // InternalIoT.g:2032:3: ()
            // InternalIoT.g:2033:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getALLitAccess().getArithLitAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2042:3: ( (lv_val_1_0= RULE_INTEGER ) )
            // InternalIoT.g:2043:4: (lv_val_1_0= RULE_INTEGER )
            {
            // InternalIoT.g:2043:4: (lv_val_1_0= RULE_INTEGER )
            // InternalIoT.g:2044:5: lv_val_1_0= RULE_INTEGER
            {
            lv_val_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_val_1_0, grammarAccess.getALLitAccess().getValINTEGERTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getALLitRule());
              					}
              					setWithLastConsumed(
              						current,
              						"val",
              						lv_val_1_0,
              						"iot.simpleexpressions.xtext.IoT.INTEGER");
              				
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
    // $ANTLR end "ruleALLit"


    // $ANTLR start "entryRuleVarRef"
    // InternalIoT.g:2064:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // InternalIoT.g:2064:47: (iv_ruleVarRef= ruleVarRef EOF )
            // InternalIoT.g:2065:2: iv_ruleVarRef= ruleVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarRef; 
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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalIoT.g:2071:1: ruleVarRef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:2077:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIoT.g:2078:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIoT.g:2078:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIoT.g:2079:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalIoT.g:2079:3: ()
            // InternalIoT.g:2080:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVarRefAccess().getALVarRefAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2089:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:2090:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:2090:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:2091:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVarRefAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarRefRule());
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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleRand"
    // InternalIoT.g:2111:1: entryRuleRand returns [EObject current=null] : iv_ruleRand= ruleRand EOF ;
    public final EObject entryRuleRand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRand = null;


        try {
            // InternalIoT.g:2111:45: (iv_ruleRand= ruleRand EOF )
            // InternalIoT.g:2112:2: iv_ruleRand= ruleRand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRand=ruleRand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRand; 
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
    // $ANTLR end "entryRuleRand"


    // $ANTLR start "ruleRand"
    // InternalIoT.g:2118:1: ruleRand returns [EObject current=null] : (otherlv_0= 'rand' otherlv_1= '(' ( (lv_min_2_0= RULE_INTEGER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_INTEGER ) ) otherlv_5= ')' ) ;
    public final EObject ruleRand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_max_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoT.g:2124:2: ( (otherlv_0= 'rand' otherlv_1= '(' ( (lv_min_2_0= RULE_INTEGER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_INTEGER ) ) otherlv_5= ')' ) )
            // InternalIoT.g:2125:2: (otherlv_0= 'rand' otherlv_1= '(' ( (lv_min_2_0= RULE_INTEGER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_INTEGER ) ) otherlv_5= ')' )
            {
            // InternalIoT.g:2125:2: (otherlv_0= 'rand' otherlv_1= '(' ( (lv_min_2_0= RULE_INTEGER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_INTEGER ) ) otherlv_5= ')' )
            // InternalIoT.g:2126:3: otherlv_0= 'rand' otherlv_1= '(' ( (lv_min_2_0= RULE_INTEGER ) ) otherlv_3= ',' ( (lv_max_4_0= RULE_INTEGER ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRandAccess().getRandKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalIoT.g:2134:3: ( (lv_min_2_0= RULE_INTEGER ) )
            // InternalIoT.g:2135:4: (lv_min_2_0= RULE_INTEGER )
            {
            // InternalIoT.g:2135:4: (lv_min_2_0= RULE_INTEGER )
            // InternalIoT.g:2136:5: lv_min_2_0= RULE_INTEGER
            {
            lv_min_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_min_2_0, grammarAccess.getRandAccess().getMinINTEGERTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRandRule());
              					}
              					setWithLastConsumed(
              						current,
              						"min",
              						lv_min_2_0,
              						"iot.simpleexpressions.xtext.IoT.INTEGER");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRandAccess().getCommaKeyword_3());
              		
            }
            // InternalIoT.g:2156:3: ( (lv_max_4_0= RULE_INTEGER ) )
            // InternalIoT.g:2157:4: (lv_max_4_0= RULE_INTEGER )
            {
            // InternalIoT.g:2157:4: (lv_max_4_0= RULE_INTEGER )
            // InternalIoT.g:2158:5: lv_max_4_0= RULE_INTEGER
            {
            lv_max_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_max_4_0, grammarAccess.getRandAccess().getMaxINTEGERTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRandRule());
              					}
              					setWithLastConsumed(
              						current,
              						"max",
              						lv_max_4_0,
              						"iot.simpleexpressions.xtext.IoT.INTEGER");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRandAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleRand"


    // $ANTLR start "entryRuleIotActivity"
    // InternalIoT.g:2182:1: entryRuleIotActivity returns [EObject current=null] : iv_ruleIotActivity= ruleIotActivity EOF ;
    public final EObject entryRuleIotActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIotActivity = null;


        try {
            // InternalIoT.g:2182:52: (iv_ruleIotActivity= ruleIotActivity EOF )
            // InternalIoT.g:2183:2: iv_ruleIotActivity= ruleIotActivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIotActivityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIotActivity=ruleIotActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIotActivity; 
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
    // $ANTLR end "entryRuleIotActivity"


    // $ANTLR start "ruleIotActivity"
    // InternalIoT.g:2189:1: ruleIotActivity returns [EObject current=null] : ( () ( (lv_delegate_1_0= ruleActivity ) ) ) ;
    public final EObject ruleIotActivity() throws RecognitionException {
        EObject current = null;

        EObject lv_delegate_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:2195:2: ( ( () ( (lv_delegate_1_0= ruleActivity ) ) ) )
            // InternalIoT.g:2196:2: ( () ( (lv_delegate_1_0= ruleActivity ) ) )
            {
            // InternalIoT.g:2196:2: ( () ( (lv_delegate_1_0= ruleActivity ) ) )
            // InternalIoT.g:2197:3: () ( (lv_delegate_1_0= ruleActivity ) )
            {
            // InternalIoT.g:2197:3: ()
            // InternalIoT.g:2198:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIotActivityAccess().getIoTActivityBindActivityAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2207:3: ( (lv_delegate_1_0= ruleActivity ) )
            // InternalIoT.g:2208:4: (lv_delegate_1_0= ruleActivity )
            {
            // InternalIoT.g:2208:4: (lv_delegate_1_0= ruleActivity )
            // InternalIoT.g:2209:5: lv_delegate_1_0= ruleActivity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIotActivityAccess().getDelegateActivityParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_delegate_1_0=ruleActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIotActivityRule());
              					}
              					set(
              						current,
              						"delegate",
              						lv_delegate_1_0,
              						"iot.simpleexpressions.xtext.IoT.Activity");
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
    // $ANTLR end "ruleIotActivity"


    // $ANTLR start "entryRuleActivity"
    // InternalIoT.g:2230:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalIoT.g:2230:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalIoT.g:2231:2: iv_ruleActivity= ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalIoT.g:2237:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_locals_9_0 = null;

        EObject lv_locals_11_0 = null;

        EObject lv_nodes_14_0 = null;

        EObject lv_nodes_16_0 = null;

        EObject lv_edges_20_0 = null;

        EObject lv_edges_22_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:2243:2: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalIoT.g:2244:2: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalIoT.g:2244:2: ( () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalIoT.g:2245:3: () otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )? (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )? (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalIoT.g:2245:3: ()
            // InternalIoT.g:2246:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getActivityAccess().getActivityAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
              		
            }
            // InternalIoT.g:2259:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:2260:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:2260:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:2261:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActivityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:2277:3: (otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIoT.g:2278:4: otherlv_3= '(' ( (lv_inputs_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalIoT.g:2282:4: ( (lv_inputs_4_0= ruleVariable ) )
                    // InternalIoT.g:2283:5: (lv_inputs_4_0= ruleVariable )
                    {
                    // InternalIoT.g:2283:5: (lv_inputs_4_0= ruleVariable )
                    // InternalIoT.g:2284:6: lv_inputs_4_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActivityAccess().getInputsVariableParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_inputs_4_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActivityRule());
                      						}
                      						add(
                      							current,
                      							"inputs",
                      							lv_inputs_4_0,
                      							"iot.simpleexpressions.xtext.IoT.Variable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2301:4: (otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==24) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalIoT.g:2302:5: otherlv_5= ',' ( (lv_inputs_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2306:5: ( (lv_inputs_6_0= ruleVariable ) )
                    	    // InternalIoT.g:2307:6: (lv_inputs_6_0= ruleVariable )
                    	    {
                    	    // InternalIoT.g:2307:6: (lv_inputs_6_0= ruleVariable )
                    	    // InternalIoT.g:2308:7: lv_inputs_6_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActivityAccess().getInputsVariableParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_inputs_6_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"inputs",
                    	      								lv_inputs_6_0,
                    	      								"iot.simpleexpressions.xtext.IoT.Variable");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalIoT.g:2335:3: ( ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=54 && LA28_0<=55)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIoT.g:2336:4: ( (lv_locals_9_0= ruleVariable ) ) (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )*
                    {
                    // InternalIoT.g:2336:4: ( (lv_locals_9_0= ruleVariable ) )
                    // InternalIoT.g:2337:5: (lv_locals_9_0= ruleVariable )
                    {
                    // InternalIoT.g:2337:5: (lv_locals_9_0= ruleVariable )
                    // InternalIoT.g:2338:6: lv_locals_9_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActivityAccess().getLocalsVariableParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_locals_9_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActivityRule());
                      						}
                      						add(
                      							current,
                      							"locals",
                      							lv_locals_9_0,
                      							"iot.simpleexpressions.xtext.IoT.Variable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2355:4: (otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==24) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalIoT.g:2356:5: otherlv_10= ',' ( (lv_locals_11_0= ruleVariable ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getCommaKeyword_5_1_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2360:5: ( (lv_locals_11_0= ruleVariable ) )
                    	    // InternalIoT.g:2361:6: (lv_locals_11_0= ruleVariable )
                    	    {
                    	    // InternalIoT.g:2361:6: (lv_locals_11_0= ruleVariable )
                    	    // InternalIoT.g:2362:7: lv_locals_11_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActivityAccess().getLocalsVariableParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_locals_11_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"locals",
                    	      								lv_locals_11_0,
                    	      								"iot.simpleexpressions.xtext.IoT.Variable");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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
                    break;

            }

            // InternalIoT.g:2381:3: (otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIoT.g:2382:4: otherlv_12= 'nodes' otherlv_13= '{' ( (lv_nodes_14_0= ruleActivityNode ) ) (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getNodesKeyword_6_0());
                      			
                    }
                    otherlv_13=(Token)match(input,13,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalIoT.g:2390:4: ( (lv_nodes_14_0= ruleActivityNode ) )
                    // InternalIoT.g:2391:5: (lv_nodes_14_0= ruleActivityNode )
                    {
                    // InternalIoT.g:2391:5: (lv_nodes_14_0= ruleActivityNode )
                    // InternalIoT.g:2392:6: lv_nodes_14_0= ruleActivityNode
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_nodes_14_0=ruleActivityNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActivityRule());
                      						}
                      						add(
                      							current,
                      							"nodes",
                      							lv_nodes_14_0,
                      							"iot.simpleexpressions.xtext.IoT.ActivityNode");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2409:4: (otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==24) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalIoT.g:2410:5: otherlv_15= ',' ( (lv_nodes_16_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2414:5: ( (lv_nodes_16_0= ruleActivityNode ) )
                    	    // InternalIoT.g:2415:6: (lv_nodes_16_0= ruleActivityNode )
                    	    {
                    	    // InternalIoT.g:2415:6: (lv_nodes_16_0= ruleActivityNode )
                    	    // InternalIoT.g:2416:7: lv_nodes_16_0= ruleActivityNode
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_nodes_16_0=ruleActivityNode();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"nodes",
                    	      								lv_nodes_16_0,
                    	      								"iot.simpleexpressions.xtext.IoT.ActivityNode");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }

                    }
                    break;

            }

            // InternalIoT.g:2439:3: (otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIoT.g:2440:4: otherlv_18= 'edges' otherlv_19= '{' ( (lv_edges_20_0= ruleActivityEdge ) ) (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getEdgesKeyword_7_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalIoT.g:2448:4: ( (lv_edges_20_0= ruleActivityEdge ) )
                    // InternalIoT.g:2449:5: (lv_edges_20_0= ruleActivityEdge )
                    {
                    // InternalIoT.g:2449:5: (lv_edges_20_0= ruleActivityEdge )
                    // InternalIoT.g:2450:6: lv_edges_20_0= ruleActivityEdge
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_edges_20_0=ruleActivityEdge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActivityRule());
                      						}
                      						add(
                      							current,
                      							"edges",
                      							lv_edges_20_0,
                      							"iot.simpleexpressions.xtext.IoT.ActivityEdge");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2467:4: (otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==24) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalIoT.g:2468:5: otherlv_21= ',' ( (lv_edges_22_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_21=(Token)match(input,24,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getCommaKeyword_7_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2472:5: ( (lv_edges_22_0= ruleActivityEdge ) )
                    	    // InternalIoT.g:2473:6: (lv_edges_22_0= ruleActivityEdge )
                    	    {
                    	    // InternalIoT.g:2473:6: (lv_edges_22_0= ruleActivityEdge )
                    	    // InternalIoT.g:2474:7: lv_edges_22_0= ruleActivityEdge
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_7_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_edges_22_0=ruleActivityEdge();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"edges",
                    	      								lv_edges_22_0,
                    	      								"iot.simpleexpressions.xtext.IoT.ActivityEdge");
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

                    otherlv_23=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_24=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8());
              		
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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityNode"
    // InternalIoT.g:2505:1: entryRuleActivityNode returns [EObject current=null] : iv_ruleActivityNode= ruleActivityNode EOF ;
    public final EObject entryRuleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityNode = null;


        try {
            // InternalIoT.g:2505:53: (iv_ruleActivityNode= ruleActivityNode EOF )
            // InternalIoT.g:2506:2: iv_ruleActivityNode= ruleActivityNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActivityNode=ruleActivityNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivityNode; 
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
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalIoT.g:2512:1: ruleActivityNode returns [EObject current=null] : (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode ) ;
    public final EObject ruleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject this_OpaqueAction_0 = null;

        EObject this_InitialNode_1 = null;

        EObject this_ActivityFinalNode_2 = null;

        EObject this_ForkNode_3 = null;

        EObject this_JoinNode_4 = null;

        EObject this_MergeNode_5 = null;

        EObject this_DecisionNode_6 = null;



        	enterRule();

        try {
            // InternalIoT.g:2518:2: ( (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode ) )
            // InternalIoT.g:2519:2: (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode )
            {
            // InternalIoT.g:2519:2: (this_OpaqueAction_0= ruleOpaqueAction | this_InitialNode_1= ruleInitialNode | this_ActivityFinalNode_2= ruleActivityFinalNode | this_ForkNode_3= ruleForkNode | this_JoinNode_4= ruleJoinNode | this_MergeNode_5= ruleMergeNode | this_DecisionNode_6= ruleDecisionNode )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt33=1;
                }
                break;
            case 48:
                {
                alt33=2;
                }
                break;
            case 49:
                {
                alt33=3;
                }
                break;
            case 50:
                {
                alt33=4;
                }
                break;
            case 51:
                {
                alt33=5;
                }
                break;
            case 52:
                {
                alt33=6;
                }
                break;
            case 53:
                {
                alt33=7;
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
                    // InternalIoT.g:2520:3: this_OpaqueAction_0= ruleOpaqueAction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getOpaqueActionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OpaqueAction_0=ruleOpaqueAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OpaqueAction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:2532:3: this_InitialNode_1= ruleInitialNode
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getInitialNodeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InitialNode_1=ruleInitialNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitialNode_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoT.g:2544:3: this_ActivityFinalNode_2= ruleActivityFinalNode
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getActivityFinalNodeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ActivityFinalNode_2=ruleActivityFinalNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActivityFinalNode_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIoT.g:2556:3: this_ForkNode_3= ruleForkNode
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getForkNodeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForkNode_3=ruleForkNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForkNode_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalIoT.g:2568:3: this_JoinNode_4= ruleJoinNode
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getJoinNodeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JoinNode_4=ruleJoinNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JoinNode_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalIoT.g:2580:3: this_MergeNode_5= ruleMergeNode
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getMergeNodeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MergeNode_5=ruleMergeNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MergeNode_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalIoT.g:2592:3: this_DecisionNode_6= ruleDecisionNode
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActivityNodeAccess().getDecisionNodeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecisionNode_6=ruleDecisionNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecisionNode_6;
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
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleActivityEdge"
    // InternalIoT.g:2607:1: entryRuleActivityEdge returns [EObject current=null] : iv_ruleActivityEdge= ruleActivityEdge EOF ;
    public final EObject entryRuleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityEdge = null;


        try {
            // InternalIoT.g:2607:53: (iv_ruleActivityEdge= ruleActivityEdge EOF )
            // InternalIoT.g:2608:2: iv_ruleActivityEdge= ruleActivityEdge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityEdgeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActivityEdge=ruleActivityEdge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivityEdge; 
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
    // $ANTLR end "entryRuleActivityEdge"


    // $ANTLR start "ruleActivityEdge"
    // InternalIoT.g:2614:1: ruleActivityEdge returns [EObject current=null] : this_ControlFlow_0= ruleControlFlow ;
    public final EObject ruleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject this_ControlFlow_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:2620:2: (this_ControlFlow_0= ruleControlFlow )
            // InternalIoT.g:2621:2: this_ControlFlow_0= ruleControlFlow
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getActivityEdgeAccess().getControlFlowParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ControlFlow_0=ruleControlFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ControlFlow_0;
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
    // $ANTLR end "ruleActivityEdge"


    // $ANTLR start "entryRuleVariable"
    // InternalIoT.g:2635:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIoT.g:2635:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIoT.g:2636:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalIoT.g:2642:1: ruleVariable returns [EObject current=null] : (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVariable_0 = null;

        EObject this_BooleanVariable_1 = null;



        	enterRule();

        try {
            // InternalIoT.g:2648:2: ( (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable ) )
            // InternalIoT.g:2649:2: (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable )
            {
            // InternalIoT.g:2649:2: (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            else if ( (LA34_0==55) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalIoT.g:2650:3: this_IntegerVariable_0= ruleIntegerVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerVariable_0=ruleIntegerVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerVariable_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:2662:3: this_BooleanVariable_1= ruleBooleanVariable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanVariable_1=ruleBooleanVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanVariable_1;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleOpaqueAction"
    // InternalIoT.g:2677:1: entryRuleOpaqueAction returns [EObject current=null] : iv_ruleOpaqueAction= ruleOpaqueAction EOF ;
    public final EObject entryRuleOpaqueAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpaqueAction = null;


        try {
            // InternalIoT.g:2677:53: (iv_ruleOpaqueAction= ruleOpaqueAction EOF )
            // InternalIoT.g:2678:2: iv_ruleOpaqueAction= ruleOpaqueAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpaqueActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpaqueAction=ruleOpaqueAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpaqueAction; 
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
    // $ANTLR end "entryRuleOpaqueAction"


    // $ANTLR start "ruleOpaqueAction"
    // InternalIoT.g:2684:1: ruleOpaqueAction returns [EObject current=null] : ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? (otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) ) )? ) ;
    public final EObject ruleOpaqueAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_expressions_5_0 = null;

        EObject lv_expressions_7_0 = null;

        EObject lv_expressions_22_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:2690:2: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? (otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) ) )? ) )
            // InternalIoT.g:2691:2: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? (otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) ) )? )
            {
            // InternalIoT.g:2691:2: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? (otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) ) )? )
            // InternalIoT.g:2692:3: () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )? (otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) ) )?
            {
            // InternalIoT.g:2692:3: ()
            // InternalIoT.g:2693:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOpaqueActionAccess().getOpaqueActionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOpaqueActionAccess().getActionKeyword_1());
              		
            }
            // InternalIoT.g:2706:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:2707:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:2707:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:2708:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getOpaqueActionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOpaqueActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:2724:3: (otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIoT.g:2725:4: otherlv_3= 'comp' otherlv_4= '{' ( (lv_expressions_5_0= ruleExpBindStatement ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOpaqueActionAccess().getCompKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getOpaqueActionAccess().getLeftCurlyBracketKeyword_3_1());
                      			
                    }
                    // InternalIoT.g:2733:4: ( (lv_expressions_5_0= ruleExpBindStatement ) )
                    // InternalIoT.g:2734:5: (lv_expressions_5_0= ruleExpBindStatement )
                    {
                    // InternalIoT.g:2734:5: (lv_expressions_5_0= ruleExpBindStatement )
                    // InternalIoT.g:2735:6: lv_expressions_5_0= ruleExpBindStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpaqueActionAccess().getExpressionsExpBindStatementParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_expressions_5_0=ruleExpBindStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_5_0,
                      							"iot.simpleexpressions.xtext.IoT.ExpBindStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2752:4: (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==24) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalIoT.g:2753:5: otherlv_6= ',' ( (lv_expressions_7_0= ruleExpBindStatement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getOpaqueActionAccess().getCommaKeyword_3_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2757:5: ( (lv_expressions_7_0= ruleExpBindStatement ) )
                    	    // InternalIoT.g:2758:6: (lv_expressions_7_0= ruleExpBindStatement )
                    	    {
                    	    // InternalIoT.g:2758:6: (lv_expressions_7_0= ruleExpBindStatement )
                    	    // InternalIoT.g:2759:7: lv_expressions_7_0= ruleExpBindStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOpaqueActionAccess().getExpressionsExpBindStatementParserRuleCall_3_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_expressions_7_0=ruleExpBindStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"expressions",
                    	      								lv_expressions_7_0,
                    	      								"iot.simpleexpressions.xtext.IoT.ExpBindStatement");
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

                    otherlv_8=(Token)match(input,14,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getOpaqueActionAccess().getRightCurlyBracketKeyword_3_4());
                      			
                    }

                    }
                    break;

            }

            // InternalIoT.g:2782:3: (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIoT.g:2783:4: otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getOpaqueActionAccess().getInKeyword_4_0());
                      			
                    }
                    otherlv_10=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getOpaqueActionAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalIoT.g:2791:4: ( (otherlv_11= RULE_ID ) )
                    // InternalIoT.g:2792:5: (otherlv_11= RULE_ID )
                    {
                    // InternalIoT.g:2792:5: (otherlv_11= RULE_ID )
                    // InternalIoT.g:2793:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpaqueActionRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getOpaqueActionAccess().getIncomingActivityEdgeCrossReference_4_2_0());
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2807:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==24) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalIoT.g:2808:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getOpaqueActionAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2812:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalIoT.g:2813:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalIoT.g:2813:6: (otherlv_13= RULE_ID )
                    	    // InternalIoT.g:2814:7: otherlv_13= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOpaqueActionRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_13, grammarAccess.getOpaqueActionAccess().getIncomingActivityEdgeCrossReference_4_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,25,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getOpaqueActionAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalIoT.g:2834:3: (otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalIoT.g:2835:4: otherlv_15= 'out' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getOpaqueActionAccess().getOutKeyword_5_0());
                      			
                    }
                    otherlv_16=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getOpaqueActionAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalIoT.g:2843:4: ( (otherlv_17= RULE_ID ) )
                    // InternalIoT.g:2844:5: (otherlv_17= RULE_ID )
                    {
                    // InternalIoT.g:2844:5: (otherlv_17= RULE_ID )
                    // InternalIoT.g:2845:6: otherlv_17= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpaqueActionRule());
                      						}
                      					
                    }
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_17, grammarAccess.getOpaqueActionAccess().getOutgoingActivityEdgeCrossReference_5_2_0());
                      					
                    }

                    }


                    }

                    // InternalIoT.g:2859:4: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==24) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalIoT.g:2860:5: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_18, grammarAccess.getOpaqueActionAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:2864:5: ( (otherlv_19= RULE_ID ) )
                    	    // InternalIoT.g:2865:6: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalIoT.g:2865:6: (otherlv_19= RULE_ID )
                    	    // InternalIoT.g:2866:7: otherlv_19= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOpaqueActionRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_19, grammarAccess.getOpaqueActionAccess().getOutgoingActivityEdgeCrossReference_5_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,25,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getOpaqueActionAccess().getRightParenthesisKeyword_5_4());
                      			
                    }

                    }
                    break;

            }

            // InternalIoT.g:2886:3: (otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalIoT.g:2887:4: otherlv_21= 'service' ( (lv_expressions_22_0= ruleExpBindOpDef ) )
                    {
                    otherlv_21=(Token)match(input,47,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getOpaqueActionAccess().getServiceKeyword_6_0());
                      			
                    }
                    // InternalIoT.g:2891:4: ( (lv_expressions_22_0= ruleExpBindOpDef ) )
                    // InternalIoT.g:2892:5: (lv_expressions_22_0= ruleExpBindOpDef )
                    {
                    // InternalIoT.g:2892:5: (lv_expressions_22_0= ruleExpBindOpDef )
                    // InternalIoT.g:2893:6: lv_expressions_22_0= ruleExpBindOpDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpaqueActionAccess().getExpressionsExpBindOpDefParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressions_22_0=ruleExpBindOpDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_22_0,
                      							"iot.simpleexpressions.xtext.IoT.ExpBindOpDef");
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
    // $ANTLR end "ruleOpaqueAction"


    // $ANTLR start "entryRuleExpBindOpDef"
    // InternalIoT.g:2915:1: entryRuleExpBindOpDef returns [EObject current=null] : iv_ruleExpBindOpDef= ruleExpBindOpDef EOF ;
    public final EObject entryRuleExpBindOpDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBindOpDef = null;


        try {
            // InternalIoT.g:2915:53: (iv_ruleExpBindOpDef= ruleExpBindOpDef EOF )
            // InternalIoT.g:2916:2: iv_ruleExpBindOpDef= ruleExpBindOpDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpBindOpDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpBindOpDef=ruleExpBindOpDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpBindOpDef; 
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
    // $ANTLR end "entryRuleExpBindOpDef"


    // $ANTLR start "ruleExpBindOpDef"
    // InternalIoT.g:2922:1: ruleExpBindOpDef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExpBindOpDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalIoT.g:2928:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalIoT.g:2929:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalIoT.g:2929:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalIoT.g:2930:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalIoT.g:2930:3: ()
            // InternalIoT.g:2931:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpBindOpDefAccess().getExpressionBindOperationDefAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2940:3: ( (otherlv_1= RULE_ID ) )
            // InternalIoT.g:2941:4: (otherlv_1= RULE_ID )
            {
            // InternalIoT.g:2941:4: (otherlv_1= RULE_ID )
            // InternalIoT.g:2942:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExpBindOpDefRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getExpBindOpDefAccess().getDelegateOperationDefCrossReference_1_0());
              				
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
    // $ANTLR end "ruleExpBindOpDef"


    // $ANTLR start "entryRuleExpBindStatement"
    // InternalIoT.g:2960:1: entryRuleExpBindStatement returns [EObject current=null] : iv_ruleExpBindStatement= ruleExpBindStatement EOF ;
    public final EObject entryRuleExpBindStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBindStatement = null;


        try {
            // InternalIoT.g:2960:57: (iv_ruleExpBindStatement= ruleExpBindStatement EOF )
            // InternalIoT.g:2961:2: iv_ruleExpBindStatement= ruleExpBindStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpBindStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpBindStatement=ruleExpBindStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpBindStatement; 
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
    // $ANTLR end "entryRuleExpBindStatement"


    // $ANTLR start "ruleExpBindStatement"
    // InternalIoT.g:2967:1: ruleExpBindStatement returns [EObject current=null] : ( () ( (lv_delegate_1_0= ruleExpression ) ) ) ;
    public final EObject ruleExpBindStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_delegate_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:2973:2: ( ( () ( (lv_delegate_1_0= ruleExpression ) ) ) )
            // InternalIoT.g:2974:2: ( () ( (lv_delegate_1_0= ruleExpression ) ) )
            {
            // InternalIoT.g:2974:2: ( () ( (lv_delegate_1_0= ruleExpression ) ) )
            // InternalIoT.g:2975:3: () ( (lv_delegate_1_0= ruleExpression ) )
            {
            // InternalIoT.g:2975:3: ()
            // InternalIoT.g:2976:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExpBindStatementAccess().getExpressionBindSEExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2985:3: ( (lv_delegate_1_0= ruleExpression ) )
            // InternalIoT.g:2986:4: (lv_delegate_1_0= ruleExpression )
            {
            // InternalIoT.g:2986:4: (lv_delegate_1_0= ruleExpression )
            // InternalIoT.g:2987:5: lv_delegate_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpBindStatementAccess().getDelegateExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_delegate_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpBindStatementRule());
              					}
              					set(
              						current,
              						"delegate",
              						lv_delegate_1_0,
              						"iot.simpleexpressions.xtext.IoT.Expression");
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
    // $ANTLR end "ruleExpBindStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalIoT.g:3008:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIoT.g:3008:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIoT.g:3009:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIoT.g:3015:1: ruleExpression returns [EObject current=null] : (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerCalculationExpression_0 = null;

        EObject this_IntegerComparisonExpression_1 = null;

        EObject this_BooleanUnaryExpression_2 = null;

        EObject this_BooleanBinaryExpression_3 = null;



        	enterRule();

        try {
            // InternalIoT.g:3021:2: ( (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression ) )
            // InternalIoT.g:3022:2: (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression )
            {
            // InternalIoT.g:3022:2: (this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression | this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression | this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression | this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression )
            int alt42=4;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==31) ) {
                    int LA42_2 = input.LA(3);

                    if ( (LA42_2==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 37:
                        case 38:
                            {
                            alt42=1;
                            }
                            break;
                        case 36:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                            {
                            alt42=2;
                            }
                            break;
                        case 78:
                        case 79:
                            {
                            alt42=4;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA42_2==77) ) {
                        alt42=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalIoT.g:3023:3: this_IntegerCalculationExpression_0= ruleIntegerCalculationExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getIntegerCalculationExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerCalculationExpression_0=ruleIntegerCalculationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerCalculationExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:3035:3: this_IntegerComparisonExpression_1= ruleIntegerComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getIntegerComparisonExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerComparisonExpression_1=ruleIntegerComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerComparisonExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoT.g:3047:3: this_BooleanUnaryExpression_2= ruleBooleanUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanUnaryExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanUnaryExpression_2=ruleBooleanUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanUnaryExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIoT.g:3059:3: this_BooleanBinaryExpression_3= ruleBooleanBinaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanBinaryExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanBinaryExpression_3=ruleBooleanBinaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanBinaryExpression_3;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIntegerCalculationExpression"
    // InternalIoT.g:3074:1: entryRuleIntegerCalculationExpression returns [EObject current=null] : iv_ruleIntegerCalculationExpression= ruleIntegerCalculationExpression EOF ;
    public final EObject entryRuleIntegerCalculationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerCalculationExpression = null;


        try {
            // InternalIoT.g:3074:69: (iv_ruleIntegerCalculationExpression= ruleIntegerCalculationExpression EOF )
            // InternalIoT.g:3075:2: iv_ruleIntegerCalculationExpression= ruleIntegerCalculationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerCalculationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerCalculationExpression=ruleIntegerCalculationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerCalculationExpression; 
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
    // $ANTLR end "entryRuleIntegerCalculationExpression"


    // $ANTLR start "ruleIntegerCalculationExpression"
    // InternalIoT.g:3081:1: ruleIntegerCalculationExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleIntegerCalculationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:3087:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:3088:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:3088:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:3089:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerCalculationOperator ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalIoT.g:3089:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoT.g:3090:4: (otherlv_0= RULE_ID )
            {
            // InternalIoT.g:3090:4: (otherlv_0= RULE_ID )
            // InternalIoT.g:3091:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerCalculationExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getIntegerCalculationExpressionAccess().getAssigneeSEIntegerVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntegerCalculationExpressionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:3109:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoT.g:3110:4: (otherlv_2= RULE_ID )
            {
            // InternalIoT.g:3110:4: (otherlv_2= RULE_ID )
            // InternalIoT.g:3111:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerCalculationExpressionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getIntegerCalculationExpressionAccess().getOperand1SEIntegerVariableCrossReference_2_0());
              				
            }

            }


            }

            // InternalIoT.g:3125:3: ( (lv_operator_3_0= ruleIntegerCalculationOperator ) )
            // InternalIoT.g:3126:4: (lv_operator_3_0= ruleIntegerCalculationOperator )
            {
            // InternalIoT.g:3126:4: (lv_operator_3_0= ruleIntegerCalculationOperator )
            // InternalIoT.g:3127:5: lv_operator_3_0= ruleIntegerCalculationOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerCalculationExpressionAccess().getOperatorIntegerCalculationOperatorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_operator_3_0=ruleIntegerCalculationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerCalculationExpressionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_3_0,
              						"iot.simpleexpressions.xtext.IoT.IntegerCalculationOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:3144:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:3145:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:3145:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:3146:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerCalculationExpressionRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getIntegerCalculationExpressionAccess().getOperand2SEIntegerVariableCrossReference_4_0());
              				
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
    // $ANTLR end "ruleIntegerCalculationExpression"


    // $ANTLR start "entryRuleIntegerComparisonExpression"
    // InternalIoT.g:3164:1: entryRuleIntegerComparisonExpression returns [EObject current=null] : iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF ;
    public final EObject entryRuleIntegerComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerComparisonExpression = null;


        try {
            // InternalIoT.g:3164:68: (iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF )
            // InternalIoT.g:3165:2: iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerComparisonExpression=ruleIntegerComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerComparisonExpression; 
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
    // $ANTLR end "entryRuleIntegerComparisonExpression"


    // $ANTLR start "ruleIntegerComparisonExpression"
    // InternalIoT.g:3171:1: ruleIntegerComparisonExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleIntegerComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:3177:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:3178:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:3178:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:3179:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleIntegerComparisonOperator ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalIoT.g:3179:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoT.g:3180:4: (otherlv_0= RULE_ID )
            {
            // InternalIoT.g:3180:4: (otherlv_0= RULE_ID )
            // InternalIoT.g:3181:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getIntegerComparisonExpressionAccess().getAssigneeSEBooleanVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntegerComparisonExpressionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:3199:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoT.g:3200:4: (otherlv_2= RULE_ID )
            {
            // InternalIoT.g:3200:4: (otherlv_2= RULE_ID )
            // InternalIoT.g:3201:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getIntegerComparisonExpressionAccess().getOperand1SEIntegerVariableCrossReference_2_0());
              				
            }

            }


            }

            // InternalIoT.g:3215:3: ( (lv_operator_3_0= ruleIntegerComparisonOperator ) )
            // InternalIoT.g:3216:4: (lv_operator_3_0= ruleIntegerComparisonOperator )
            {
            // InternalIoT.g:3216:4: (lv_operator_3_0= ruleIntegerComparisonOperator )
            // InternalIoT.g:3217:5: lv_operator_3_0= ruleIntegerComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerComparisonExpressionAccess().getOperatorIntegerComparisonOperatorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_operator_3_0=ruleIntegerComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerComparisonExpressionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_3_0,
              						"iot.simpleexpressions.xtext.IoT.IntegerComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:3234:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:3235:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:3235:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:3236:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getIntegerComparisonExpressionAccess().getOperand2SEIntegerVariableCrossReference_4_0());
              				
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
    // $ANTLR end "ruleIntegerComparisonExpression"


    // $ANTLR start "entryRuleBooleanUnaryExpression"
    // InternalIoT.g:3254:1: entryRuleBooleanUnaryExpression returns [EObject current=null] : iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF ;
    public final EObject entryRuleBooleanUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnaryExpression = null;


        try {
            // InternalIoT.g:3254:63: (iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF )
            // InternalIoT.g:3255:2: iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanUnaryExpression=ruleBooleanUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnaryExpression; 
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
    // $ANTLR end "entryRuleBooleanUnaryExpression"


    // $ANTLR start "ruleBooleanUnaryExpression"
    // InternalIoT.g:3261:1: ruleBooleanUnaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleBooleanUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:3267:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoT.g:3268:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoT.g:3268:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalIoT.g:3269:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operator_2_0= ruleBooleanUnaryOperator ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalIoT.g:3269:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoT.g:3270:4: (otherlv_0= RULE_ID )
            {
            // InternalIoT.g:3270:4: (otherlv_0= RULE_ID )
            // InternalIoT.g:3271:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanUnaryExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getBooleanUnaryExpressionAccess().getAssigneeSEBooleanVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBooleanUnaryExpressionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:3289:3: ( (lv_operator_2_0= ruleBooleanUnaryOperator ) )
            // InternalIoT.g:3290:4: (lv_operator_2_0= ruleBooleanUnaryOperator )
            {
            // InternalIoT.g:3290:4: (lv_operator_2_0= ruleBooleanUnaryOperator )
            // InternalIoT.g:3291:5: lv_operator_2_0= ruleBooleanUnaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanUnaryExpressionAccess().getOperatorBooleanUnaryOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_operator_2_0=ruleBooleanUnaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanUnaryExpressionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"iot.simpleexpressions.xtext.IoT.BooleanUnaryOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:3308:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:3309:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:3309:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:3310:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanUnaryExpressionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getBooleanUnaryExpressionAccess().getOperandSEBooleanVariableCrossReference_3_0());
              				
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
    // $ANTLR end "ruleBooleanUnaryExpression"


    // $ANTLR start "entryRuleBooleanBinaryExpression"
    // InternalIoT.g:3328:1: entryRuleBooleanBinaryExpression returns [EObject current=null] : iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF ;
    public final EObject entryRuleBooleanBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanBinaryExpression = null;


        try {
            // InternalIoT.g:3328:64: (iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF )
            // InternalIoT.g:3329:2: iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanBinaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanBinaryExpression=ruleBooleanBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanBinaryExpression; 
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
    // $ANTLR end "entryRuleBooleanBinaryExpression"


    // $ANTLR start "ruleBooleanBinaryExpression"
    // InternalIoT.g:3335:1: ruleBooleanBinaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleBooleanBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:3341:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:3342:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:3342:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:3343:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleBooleanBinaryOperator ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalIoT.g:3343:3: ( (otherlv_0= RULE_ID ) )
            // InternalIoT.g:3344:4: (otherlv_0= RULE_ID )
            {
            // InternalIoT.g:3344:4: (otherlv_0= RULE_ID )
            // InternalIoT.g:3345:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getBooleanBinaryExpressionAccess().getAssigneeSEBooleanVariableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBooleanBinaryExpressionAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:3363:3: ( (otherlv_2= RULE_ID ) )
            // InternalIoT.g:3364:4: (otherlv_2= RULE_ID )
            {
            // InternalIoT.g:3364:4: (otherlv_2= RULE_ID )
            // InternalIoT.g:3365:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getBooleanBinaryExpressionAccess().getOperand1SEBooleanVariableCrossReference_2_0());
              				
            }

            }


            }

            // InternalIoT.g:3379:3: ( (lv_operator_3_0= ruleBooleanBinaryOperator ) )
            // InternalIoT.g:3380:4: (lv_operator_3_0= ruleBooleanBinaryOperator )
            {
            // InternalIoT.g:3380:4: (lv_operator_3_0= ruleBooleanBinaryOperator )
            // InternalIoT.g:3381:5: lv_operator_3_0= ruleBooleanBinaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanBinaryExpressionAccess().getOperatorBooleanBinaryOperatorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_operator_3_0=ruleBooleanBinaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanBinaryExpressionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_3_0,
              						"iot.simpleexpressions.xtext.IoT.BooleanBinaryOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:3398:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:3399:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:3399:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:3400:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getBooleanBinaryExpressionAccess().getOperand2SEBooleanVariableCrossReference_4_0());
              				
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
    // $ANTLR end "ruleBooleanBinaryExpression"


    // $ANTLR start "entryRuleInitialNode"
    // InternalIoT.g:3418:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalIoT.g:3418:52: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalIoT.g:3419:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitialNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitialNode; 
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
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalIoT.g:3425:1: ruleInitialNode returns [EObject current=null] : ( () otherlv_1= 'initial' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalIoT.g:3431:2: ( ( () otherlv_1= 'initial' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) )
            // InternalIoT.g:3432:2: ( () otherlv_1= 'initial' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            {
            // InternalIoT.g:3432:2: ( () otherlv_1= 'initial' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            // InternalIoT.g:3433:3: () otherlv_1= 'initial' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            {
            // InternalIoT.g:3433:3: ()
            // InternalIoT.g:3434:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInitialNodeAccess().getInitialNodeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitialNodeAccess().getInitialKeyword_1());
              		
            }
            // InternalIoT.g:3447:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:3448:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:3448:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:3449:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getInitialNodeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInitialNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:3465:3: (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            // InternalIoT.g:3466:4: otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
            {
            otherlv_3=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getInitialNodeAccess().getOutKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_3_1());
              			
            }
            // InternalIoT.g:3474:4: ( (otherlv_5= RULE_ID ) )
            // InternalIoT.g:3475:5: (otherlv_5= RULE_ID )
            {
            // InternalIoT.g:3475:5: (otherlv_5= RULE_ID )
            // InternalIoT.g:3476:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getInitialNodeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_3_2_0());
              					
            }

            }


            }

            // InternalIoT.g:3490:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==24) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalIoT.g:3491:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getInitialNodeAccess().getCommaKeyword_3_3_0());
            	      				
            	    }
            	    // InternalIoT.g:3495:5: ( (otherlv_7= RULE_ID ) )
            	    // InternalIoT.g:3496:6: (otherlv_7= RULE_ID )
            	    {
            	    // InternalIoT.g:3496:6: (otherlv_7= RULE_ID )
            	    // InternalIoT.g:3497:7: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInitialNodeRule());
            	      							}
            	      						
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_3_3_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_3_4());
              			
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
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleActivityFinalNode"
    // InternalIoT.g:3521:1: entryRuleActivityFinalNode returns [EObject current=null] : iv_ruleActivityFinalNode= ruleActivityFinalNode EOF ;
    public final EObject entryRuleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityFinalNode = null;


        try {
            // InternalIoT.g:3521:58: (iv_ruleActivityFinalNode= ruleActivityFinalNode EOF )
            // InternalIoT.g:3522:2: iv_ruleActivityFinalNode= ruleActivityFinalNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActivityFinalNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActivityFinalNode=ruleActivityFinalNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActivityFinalNode; 
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
    // $ANTLR end "entryRuleActivityFinalNode"


    // $ANTLR start "ruleActivityFinalNode"
    // InternalIoT.g:3528:1: ruleActivityFinalNode returns [EObject current=null] : ( () otherlv_1= 'final' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) ;
    public final EObject ruleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalIoT.g:3534:2: ( ( () otherlv_1= 'final' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) ) )
            // InternalIoT.g:3535:2: ( () otherlv_1= 'final' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            {
            // InternalIoT.g:3535:2: ( () otherlv_1= 'final' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ) )
            // InternalIoT.g:3536:3: () otherlv_1= 'final' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            {
            // InternalIoT.g:3536:3: ()
            // InternalIoT.g:3537:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getActivityFinalNodeAccess().getActivityFinalNodeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getActivityFinalNodeAccess().getFinalKeyword_1());
              		
            }
            // InternalIoT.g:3550:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:3551:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:3551:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:3552:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getActivityFinalNodeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActivityFinalNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:3568:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )
            // InternalIoT.g:3569:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
            {
            otherlv_3=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getActivityFinalNodeAccess().getInKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getActivityFinalNodeAccess().getLeftParenthesisKeyword_3_1());
              			
            }
            // InternalIoT.g:3577:4: ( (otherlv_5= RULE_ID ) )
            // InternalIoT.g:3578:5: (otherlv_5= RULE_ID )
            {
            // InternalIoT.g:3578:5: (otherlv_5= RULE_ID )
            // InternalIoT.g:3579:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getActivityFinalNodeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
              					
            }

            }


            }

            // InternalIoT.g:3593:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==24) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalIoT.g:3594:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getActivityFinalNodeAccess().getCommaKeyword_3_3_0());
            	      				
            	    }
            	    // InternalIoT.g:3598:5: ( (otherlv_7= RULE_ID ) )
            	    // InternalIoT.g:3599:6: (otherlv_7= RULE_ID )
            	    {
            	    // InternalIoT.g:3599:6: (otherlv_7= RULE_ID )
            	    // InternalIoT.g:3600:7: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getActivityFinalNodeRule());
            	      							}
            	      						
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getActivityFinalNodeAccess().getRightParenthesisKeyword_3_4());
              			
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
    // $ANTLR end "ruleActivityFinalNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalIoT.g:3624:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalIoT.g:3624:49: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalIoT.g:3625:2: iv_ruleForkNode= ruleForkNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForkNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForkNode; 
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
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalIoT.g:3631:1: ruleForkNode returns [EObject current=null] : ( () otherlv_1= 'fork' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalIoT.g:3637:2: ( ( () otherlv_1= 'fork' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
            // InternalIoT.g:3638:2: ( () otherlv_1= 'fork' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            {
            // InternalIoT.g:3638:2: ( () otherlv_1= 'fork' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            // InternalIoT.g:3639:3: () otherlv_1= 'fork' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            {
            // InternalIoT.g:3639:3: ()
            // InternalIoT.g:3640:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForkNodeAccess().getForkNodeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForkNodeAccess().getForkKeyword_1());
              		
            }
            // InternalIoT.g:3653:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:3654:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:3654:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:3655:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getForkNodeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForkNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:3671:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalIoT.g:3672:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getForkNodeAccess().getInKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_3_1());
              			
            }
            // InternalIoT.g:3680:4: ( (otherlv_5= RULE_ID ) )
            // InternalIoT.g:3681:5: (otherlv_5= RULE_ID )
            {
            // InternalIoT.g:3681:5: (otherlv_5= RULE_ID )
            // InternalIoT.g:3682:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getForkNodeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getForkNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
              					
            }

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_3_3());
              			
            }

            }

            // InternalIoT.g:3701:3: (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalIoT.g:3702:4: otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getForkNodeAccess().getOutKeyword_4_0());
                      			
                    }
                    otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalIoT.g:3710:4: ( (otherlv_9= RULE_ID ) )
                    // InternalIoT.g:3711:5: (otherlv_9= RULE_ID )
                    {
                    // InternalIoT.g:3711:5: (otherlv_9= RULE_ID )
                    // InternalIoT.g:3712:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getForkNodeRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
                      					
                    }

                    }


                    }

                    // InternalIoT.g:3726:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==24) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalIoT.g:3727:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getForkNodeAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:3731:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalIoT.g:3732:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalIoT.g:3732:6: (otherlv_11= RULE_ID )
                    	    // InternalIoT.g:3733:7: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getForkNodeRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_11, grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_4_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4_4());
                      			
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
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalIoT.g:3757:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalIoT.g:3757:49: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalIoT.g:3758:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinNode; 
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
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalIoT.g:3764:1: ruleJoinNode returns [EObject current=null] : ( () otherlv_1= 'join' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalIoT.g:3770:2: ( ( () otherlv_1= 'join' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) )
            // InternalIoT.g:3771:2: ( () otherlv_1= 'join' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            {
            // InternalIoT.g:3771:2: ( () otherlv_1= 'join' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            // InternalIoT.g:3772:3: () otherlv_1= 'join' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            {
            // InternalIoT.g:3772:3: ()
            // InternalIoT.g:3773:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJoinNodeAccess().getJoinNodeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJoinNodeAccess().getJoinKeyword_1());
              		
            }
            // InternalIoT.g:3786:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:3787:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:3787:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:3788:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getJoinNodeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJoinNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:3804:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalIoT.g:3805:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getJoinNodeAccess().getInKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalIoT.g:3813:4: ( (otherlv_5= RULE_ID ) )
                    // InternalIoT.g:3814:5: (otherlv_5= RULE_ID )
                    {
                    // InternalIoT.g:3814:5: (otherlv_5= RULE_ID )
                    // InternalIoT.g:3815:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getJoinNodeRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
                      					
                    }

                    }


                    }

                    // InternalIoT.g:3829:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==24) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalIoT.g:3830:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getJoinNodeAccess().getCommaKeyword_3_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:3834:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalIoT.g:3835:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalIoT.g:3835:6: (otherlv_7= RULE_ID )
                    	    // InternalIoT.g:3836:7: otherlv_7= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJoinNodeRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }
                    break;

            }

            // InternalIoT.g:3856:3: (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            // InternalIoT.g:3857:4: otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_9=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getJoinNodeAccess().getOutKeyword_4_0());
              			
            }
            otherlv_10=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_4_1());
              			
            }
            // InternalIoT.g:3865:4: ( (otherlv_11= RULE_ID ) )
            // InternalIoT.g:3866:5: (otherlv_11= RULE_ID )
            {
            // InternalIoT.g:3866:5: (otherlv_11= RULE_ID )
            // InternalIoT.g:3867:6: otherlv_11= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getJoinNodeRule());
              						}
              					
            }
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_11, grammarAccess.getJoinNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
              					
            }

            }


            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_12, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_4_3());
              			
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
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleMergeNode"
    // InternalIoT.g:3890:1: entryRuleMergeNode returns [EObject current=null] : iv_ruleMergeNode= ruleMergeNode EOF ;
    public final EObject entryRuleMergeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeNode = null;


        try {
            // InternalIoT.g:3890:50: (iv_ruleMergeNode= ruleMergeNode EOF )
            // InternalIoT.g:3891:2: iv_ruleMergeNode= ruleMergeNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMergeNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMergeNode=ruleMergeNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMergeNode; 
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
    // $ANTLR end "entryRuleMergeNode"


    // $ANTLR start "ruleMergeNode"
    // InternalIoT.g:3897:1: ruleMergeNode returns [EObject current=null] : ( () otherlv_1= 'merge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleMergeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalIoT.g:3903:2: ( ( () otherlv_1= 'merge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) )
            // InternalIoT.g:3904:2: ( () otherlv_1= 'merge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            {
            // InternalIoT.g:3904:2: ( () otherlv_1= 'merge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            // InternalIoT.g:3905:3: () otherlv_1= 'merge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            {
            // InternalIoT.g:3905:3: ()
            // InternalIoT.g:3906:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMergeNodeAccess().getMergeNodeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMergeNodeAccess().getMergeKeyword_1());
              		
            }
            // InternalIoT.g:3919:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:3920:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:3920:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:3921:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMergeNodeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMergeNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:3937:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalIoT.g:3938:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMergeNodeAccess().getInKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalIoT.g:3946:4: ( (otherlv_5= RULE_ID ) )
                    // InternalIoT.g:3947:5: (otherlv_5= RULE_ID )
                    {
                    // InternalIoT.g:3947:5: (otherlv_5= RULE_ID )
                    // InternalIoT.g:3948:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMergeNodeRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
                      					
                    }

                    }


                    }

                    // InternalIoT.g:3962:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalIoT.g:3963:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getMergeNodeAccess().getCommaKeyword_3_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:3967:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalIoT.g:3968:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalIoT.g:3968:6: (otherlv_7= RULE_ID )
                    	    // InternalIoT.g:3969:7: otherlv_7= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getMergeNodeRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }
                    break;

            }

            // InternalIoT.g:3989:3: (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            // InternalIoT.g:3990:4: otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_9=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_9, grammarAccess.getMergeNodeAccess().getOutKeyword_4_0());
              			
            }
            otherlv_10=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_4_1());
              			
            }
            // InternalIoT.g:3998:4: ( (otherlv_11= RULE_ID ) )
            // InternalIoT.g:3999:5: (otherlv_11= RULE_ID )
            {
            // InternalIoT.g:3999:5: (otherlv_11= RULE_ID )
            // InternalIoT.g:4000:6: otherlv_11= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getMergeNodeRule());
              						}
              					
            }
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_11, grammarAccess.getMergeNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
              					
            }

            }


            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_12, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_4_3());
              			
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
    // $ANTLR end "ruleMergeNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalIoT.g:4023:1: entryRuleDecisionNode returns [EObject current=null] : iv_ruleDecisionNode= ruleDecisionNode EOF ;
    public final EObject entryRuleDecisionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionNode = null;


        try {
            // InternalIoT.g:4023:53: (iv_ruleDecisionNode= ruleDecisionNode EOF )
            // InternalIoT.g:4024:2: iv_ruleDecisionNode= ruleDecisionNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecisionNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecisionNode=ruleDecisionNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecisionNode; 
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
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalIoT.g:4030:1: ruleDecisionNode returns [EObject current=null] : ( () otherlv_1= 'decision' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleDecisionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalIoT.g:4036:2: ( ( () otherlv_1= 'decision' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
            // InternalIoT.g:4037:2: ( () otherlv_1= 'decision' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            {
            // InternalIoT.g:4037:2: ( () otherlv_1= 'decision' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            // InternalIoT.g:4038:3: () otherlv_1= 'decision' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            {
            // InternalIoT.g:4038:3: ()
            // InternalIoT.g:4039:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDecisionNodeAccess().getDecisionKeyword_1());
              		
            }
            // InternalIoT.g:4052:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIoT.g:4053:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIoT.g:4053:4: (lv_name_2_0= RULE_ID )
            // InternalIoT.g:4054:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDecisionNodeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDecisionNodeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalIoT.g:4070:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalIoT.g:4071:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getDecisionNodeAccess().getInKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_3_1());
              			
            }
            // InternalIoT.g:4079:4: ( (otherlv_5= RULE_ID ) )
            // InternalIoT.g:4080:5: (otherlv_5= RULE_ID )
            {
            // InternalIoT.g:4080:5: (otherlv_5= RULE_ID )
            // InternalIoT.g:4081:6: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getDecisionNodeRule());
              						}
              					
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getDecisionNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
              					
            }

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_3_3());
              			
            }

            }

            // InternalIoT.g:4100:3: (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalIoT.g:4101:4: otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDecisionNodeAccess().getOutKeyword_4_0());
                      			
                    }
                    otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_4_1());
                      			
                    }
                    // InternalIoT.g:4109:4: ( (otherlv_9= RULE_ID ) )
                    // InternalIoT.g:4110:5: (otherlv_9= RULE_ID )
                    {
                    // InternalIoT.g:4110:5: (otherlv_9= RULE_ID )
                    // InternalIoT.g:4111:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDecisionNodeRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
                      					
                    }

                    }


                    }

                    // InternalIoT.g:4125:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==24) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalIoT.g:4126:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getDecisionNodeAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:4130:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalIoT.g:4131:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalIoT.g:4131:6: (otherlv_11= RULE_ID )
                    	    // InternalIoT.g:4132:7: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_11, grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_4_3_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_4_4());
                      			
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
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalIoT.g:4156:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // InternalIoT.g:4156:56: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // InternalIoT.g:4157:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerVariable; 
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
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalIoT.g:4163:1: ruleIntegerVariable returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_delegate_2_0= ruleIntegerVariableDecl ) ) ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_delegate_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:4169:2: ( ( () otherlv_1= 'int' ( (lv_delegate_2_0= ruleIntegerVariableDecl ) ) ) )
            // InternalIoT.g:4170:2: ( () otherlv_1= 'int' ( (lv_delegate_2_0= ruleIntegerVariableDecl ) ) )
            {
            // InternalIoT.g:4170:2: ( () otherlv_1= 'int' ( (lv_delegate_2_0= ruleIntegerVariableDecl ) ) )
            // InternalIoT.g:4171:3: () otherlv_1= 'int' ( (lv_delegate_2_0= ruleIntegerVariableDecl ) )
            {
            // InternalIoT.g:4171:3: ()
            // InternalIoT.g:4172:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerVariableAccess().getIntegerVariableBindSEIntegerVariableAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAccess().getIntKeyword_1());
              		
            }
            // InternalIoT.g:4185:3: ( (lv_delegate_2_0= ruleIntegerVariableDecl ) )
            // InternalIoT.g:4186:4: (lv_delegate_2_0= ruleIntegerVariableDecl )
            {
            // InternalIoT.g:4186:4: (lv_delegate_2_0= ruleIntegerVariableDecl )
            // InternalIoT.g:4187:5: lv_delegate_2_0= ruleIntegerVariableDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerVariableAccess().getDelegateIntegerVariableDeclParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_delegate_2_0=ruleIntegerVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
              					}
              					set(
              						current,
              						"delegate",
              						lv_delegate_2_0,
              						"iot.simpleexpressions.xtext.IoT.IntegerVariableDecl");
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
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleBooleanVariable"
    // InternalIoT.g:4208:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // InternalIoT.g:4208:56: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // InternalIoT.g:4209:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanVariable; 
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
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // InternalIoT.g:4215:1: ruleBooleanVariable returns [EObject current=null] : ( () otherlv_1= 'bool' ( (lv_delegate_2_0= ruleBooleanVariableDecl ) ) ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_delegate_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:4221:2: ( ( () otherlv_1= 'bool' ( (lv_delegate_2_0= ruleBooleanVariableDecl ) ) ) )
            // InternalIoT.g:4222:2: ( () otherlv_1= 'bool' ( (lv_delegate_2_0= ruleBooleanVariableDecl ) ) )
            {
            // InternalIoT.g:4222:2: ( () otherlv_1= 'bool' ( (lv_delegate_2_0= ruleBooleanVariableDecl ) ) )
            // InternalIoT.g:4223:3: () otherlv_1= 'bool' ( (lv_delegate_2_0= ruleBooleanVariableDecl ) )
            {
            // InternalIoT.g:4223:3: ()
            // InternalIoT.g:4224:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanVariableAccess().getBooleanVariableBindSEBooleanVariableAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBooleanVariableAccess().getBoolKeyword_1());
              		
            }
            // InternalIoT.g:4237:3: ( (lv_delegate_2_0= ruleBooleanVariableDecl ) )
            // InternalIoT.g:4238:4: (lv_delegate_2_0= ruleBooleanVariableDecl )
            {
            // InternalIoT.g:4238:4: (lv_delegate_2_0= ruleBooleanVariableDecl )
            // InternalIoT.g:4239:5: lv_delegate_2_0= ruleBooleanVariableDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanVariableAccess().getDelegateBooleanVariableDeclParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_delegate_2_0=ruleBooleanVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
              					}
              					set(
              						current,
              						"delegate",
              						lv_delegate_2_0,
              						"iot.simpleexpressions.xtext.IoT.BooleanVariableDecl");
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
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleBooleanVariableDecl"
    // InternalIoT.g:4260:1: entryRuleBooleanVariableDecl returns [EObject current=null] : iv_ruleBooleanVariableDecl= ruleBooleanVariableDecl EOF ;
    public final EObject entryRuleBooleanVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariableDecl = null;


        try {
            // InternalIoT.g:4260:60: (iv_ruleBooleanVariableDecl= ruleBooleanVariableDecl EOF )
            // InternalIoT.g:4261:2: iv_ruleBooleanVariableDecl= ruleBooleanVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanVariableDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVariableDecl=ruleBooleanVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanVariableDecl; 
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
    // $ANTLR end "entryRuleBooleanVariableDecl"


    // $ANTLR start "ruleBooleanVariableDecl"
    // InternalIoT.g:4267:1: ruleBooleanVariableDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleBooleanValue ) ) ) ;
    public final EObject ruleBooleanVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_initialValue_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:4273:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleBooleanValue ) ) ) )
            // InternalIoT.g:4274:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleBooleanValue ) ) )
            {
            // InternalIoT.g:4274:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleBooleanValue ) ) )
            // InternalIoT.g:4275:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleBooleanValue ) )
            {
            // InternalIoT.g:4275:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:4276:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:4276:4: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:4277:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getBooleanVariableDeclAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanVariableDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBooleanVariableDeclAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:4297:3: ( (lv_initialValue_2_0= ruleBooleanValue ) )
            // InternalIoT.g:4298:4: (lv_initialValue_2_0= ruleBooleanValue )
            {
            // InternalIoT.g:4298:4: (lv_initialValue_2_0= ruleBooleanValue )
            // InternalIoT.g:4299:5: lv_initialValue_2_0= ruleBooleanValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanVariableDeclAccess().getInitialValueBooleanValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialValue_2_0=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanVariableDeclRule());
              					}
              					set(
              						current,
              						"initialValue",
              						lv_initialValue_2_0,
              						"iot.simpleexpressions.xtext.IoT.BooleanValue");
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
    // $ANTLR end "ruleBooleanVariableDecl"


    // $ANTLR start "entryRuleIntegerVariableDecl"
    // InternalIoT.g:4320:1: entryRuleIntegerVariableDecl returns [EObject current=null] : iv_ruleIntegerVariableDecl= ruleIntegerVariableDecl EOF ;
    public final EObject entryRuleIntegerVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariableDecl = null;


        try {
            // InternalIoT.g:4320:60: (iv_ruleIntegerVariableDecl= ruleIntegerVariableDecl EOF )
            // InternalIoT.g:4321:2: iv_ruleIntegerVariableDecl= ruleIntegerVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerVariableDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVariableDecl=ruleIntegerVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerVariableDecl; 
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
    // $ANTLR end "entryRuleIntegerVariableDecl"


    // $ANTLR start "ruleIntegerVariableDecl"
    // InternalIoT.g:4327:1: ruleIntegerVariableDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleIntegerValue ) ) ) ;
    public final EObject ruleIntegerVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_initialValue_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:4333:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleIntegerValue ) ) ) )
            // InternalIoT.g:4334:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleIntegerValue ) ) )
            {
            // InternalIoT.g:4334:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleIntegerValue ) ) )
            // InternalIoT.g:4335:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_initialValue_2_0= ruleIntegerValue ) )
            {
            // InternalIoT.g:4335:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:4336:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:4336:4: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:4337:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getIntegerVariableDeclAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerVariableDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntegerVariableDeclAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalIoT.g:4357:3: ( (lv_initialValue_2_0= ruleIntegerValue ) )
            // InternalIoT.g:4358:4: (lv_initialValue_2_0= ruleIntegerValue )
            {
            // InternalIoT.g:4358:4: (lv_initialValue_2_0= ruleIntegerValue )
            // InternalIoT.g:4359:5: lv_initialValue_2_0= ruleIntegerValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerVariableDeclAccess().getInitialValueIntegerValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialValue_2_0=ruleIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerVariableDeclRule());
              					}
              					set(
              						current,
              						"initialValue",
              						lv_initialValue_2_0,
              						"iot.simpleexpressions.xtext.IoT.IntegerValue");
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
    // $ANTLR end "ruleIntegerVariableDecl"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalIoT.g:4380:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalIoT.g:4380:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalIoT.g:4381:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalIoT.g:4387:1: ruleBooleanValue returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalIoT.g:4393:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalIoT.g:4394:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalIoT.g:4394:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalIoT.g:4395:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalIoT.g:4395:3: ()
            // InternalIoT.g:4396:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanValueAccess().getSEBooleanValueAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:4405:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            else if ( (LA53_0==57) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalIoT.g:4406:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalIoT.g:4406:4: ( (lv_value_1_0= 'true' ) )
                    // InternalIoT.g:4407:5: (lv_value_1_0= 'true' )
                    {
                    // InternalIoT.g:4407:5: (lv_value_1_0= 'true' )
                    // InternalIoT.g:4408:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanValueRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:4421:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getFalseKeyword_1_1());
                      			
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalIoT.g:4430:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalIoT.g:4430:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalIoT.g:4431:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValue; 
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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalIoT.g:4437:1: ruleIntegerValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4443:2: ( ( () ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalIoT.g:4444:2: ( () ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalIoT.g:4444:2: ( () ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalIoT.g:4445:3: () ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalIoT.g:4445:3: ()
            // InternalIoT.g:4446:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerValueAccess().getSEIntegerValueAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:4455:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalIoT.g:4456:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalIoT.g:4456:4: (lv_value_1_0= RULE_INTEGER )
            // InternalIoT.g:4457:5: lv_value_1_0= RULE_INTEGER
            {
            lv_value_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getIntegerValueAccess().getValueINTEGERTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"iot.simpleexpressions.xtext.IoT.INTEGER");
              				
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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleControlFlow"
    // InternalIoT.g:4477:1: entryRuleControlFlow returns [EObject current=null] : iv_ruleControlFlow= ruleControlFlow EOF ;
    public final EObject entryRuleControlFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlow = null;


        try {
            // InternalIoT.g:4477:52: (iv_ruleControlFlow= ruleControlFlow EOF )
            // InternalIoT.g:4478:2: iv_ruleControlFlow= ruleControlFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlFlowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleControlFlow=ruleControlFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControlFlow; 
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
    // $ANTLR end "entryRuleControlFlow"


    // $ANTLR start "ruleControlFlow"
    // InternalIoT.g:4484:1: ruleControlFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? ) ;
    public final EObject ruleControlFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalIoT.g:4490:2: ( (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? ) )
            // InternalIoT.g:4491:2: (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? )
            {
            // InternalIoT.g:4491:2: (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? )
            // InternalIoT.g:4492:3: otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getControlFlowAccess().getFlowKeyword_0());
              		
            }
            // InternalIoT.g:4496:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:4497:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:4497:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:4498:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getControlFlowAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getControlFlowRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getControlFlowAccess().getFromKeyword_2());
              		
            }
            // InternalIoT.g:4518:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:4519:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:4519:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:4520:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getControlFlowRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getControlFlowAccess().getSourceActivityNodeCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getControlFlowAccess().getToKeyword_4());
              		
            }
            // InternalIoT.g:4538:3: ( (otherlv_5= RULE_ID ) )
            // InternalIoT.g:4539:4: (otherlv_5= RULE_ID )
            {
            // InternalIoT.g:4539:4: (otherlv_5= RULE_ID )
            // InternalIoT.g:4540:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getControlFlowRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getControlFlowAccess().getTargetActivityNodeCrossReference_5_0());
              				
            }

            }


            }

            // InternalIoT.g:4554:3: (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==19) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalIoT.g:4555:4: otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getControlFlowAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    // InternalIoT.g:4559:4: ( (otherlv_7= RULE_ID ) )
                    // InternalIoT.g:4560:5: (otherlv_7= RULE_ID )
                    {
                    // InternalIoT.g:4560:5: (otherlv_7= RULE_ID )
                    // InternalIoT.g:4561:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getControlFlowRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getControlFlowAccess().getGuardBooleanVariableCrossReference_6_1_0());
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getControlFlowAccess().getRightSquareBracketKeyword_6_2());
                      			
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
    // $ANTLR end "ruleControlFlow"


    // $ANTLR start "ruleBoardType"
    // InternalIoT.g:4584:1: ruleBoardType returns [Enumerator current=null] : ( (enumLiteral_0= 'RaspberryPi' ) | (enumLiteral_1= 'Arduino' ) | (enumLiteral_2= 'BeagleBoard' ) ) ;
    public final Enumerator ruleBoardType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIoT.g:4590:2: ( ( (enumLiteral_0= 'RaspberryPi' ) | (enumLiteral_1= 'Arduino' ) | (enumLiteral_2= 'BeagleBoard' ) ) )
            // InternalIoT.g:4591:2: ( (enumLiteral_0= 'RaspberryPi' ) | (enumLiteral_1= 'Arduino' ) | (enumLiteral_2= 'BeagleBoard' ) )
            {
            // InternalIoT.g:4591:2: ( (enumLiteral_0= 'RaspberryPi' ) | (enumLiteral_1= 'Arduino' ) | (enumLiteral_2= 'BeagleBoard' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt55=1;
                }
                break;
            case 62:
                {
                alt55=2;
                }
                break;
            case 63:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalIoT.g:4592:3: (enumLiteral_0= 'RaspberryPi' )
                    {
                    // InternalIoT.g:4592:3: (enumLiteral_0= 'RaspberryPi' )
                    // InternalIoT.g:4593:4: enumLiteral_0= 'RaspberryPi'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoardTypeAccess().getRaspberryPiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBoardTypeAccess().getRaspberryPiEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:4600:3: (enumLiteral_1= 'Arduino' )
                    {
                    // InternalIoT.g:4600:3: (enumLiteral_1= 'Arduino' )
                    // InternalIoT.g:4601:4: enumLiteral_1= 'Arduino'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoardTypeAccess().getArduinoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBoardTypeAccess().getArduinoEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:4608:3: (enumLiteral_2= 'BeagleBoard' )
                    {
                    // InternalIoT.g:4608:3: (enumLiteral_2= 'BeagleBoard' )
                    // InternalIoT.g:4609:4: enumLiteral_2= 'BeagleBoard'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBoardTypeAccess().getBeagleBoardEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBoardTypeAccess().getBeagleBoardEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleBoardType"


    // $ANTLR start "ruleparam_attribute"
    // InternalIoT.g:4619:1: ruleparam_attribute returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleparam_attribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIoT.g:4625:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalIoT.g:4626:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalIoT.g:4626:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt56=1;
                }
                break;
            case 46:
                {
                alt56=2;
                }
                break;
            case 64:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalIoT.g:4627:3: (enumLiteral_0= 'in' )
                    {
                    // InternalIoT.g:4627:3: (enumLiteral_0= 'in' )
                    // InternalIoT.g:4628:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:4635:3: (enumLiteral_1= 'out' )
                    {
                    // InternalIoT.g:4635:3: (enumLiteral_1= 'out' )
                    // InternalIoT.g:4636:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:4643:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalIoT.g:4643:3: (enumLiteral_2= 'inout' )
                    // InternalIoT.g:4644:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParam_attributeAccess().getPARAM_INOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getParam_attributeAccess().getPARAM_INOUTEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleparam_attribute"


    // $ANTLR start "rulefloat_type"
    // InternalIoT.g:4654:1: rulefloat_type returns [Enumerator current=null] : (enumLiteral_0= 'float' ) ;
    public final Enumerator rulefloat_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4660:2: ( (enumLiteral_0= 'float' ) )
            // InternalIoT.g:4661:2: (enumLiteral_0= 'float' )
            {
            // InternalIoT.g:4661:2: (enumLiteral_0= 'float' )
            // InternalIoT.g:4662:3: enumLiteral_0= 'float'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getFloat_typeAccess().getPK_FLOATEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getFloat_typeAccess().getPK_FLOATEnumLiteralDeclaration());
              		
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
    // $ANTLR end "rulefloat_type"


    // $ANTLR start "ruledouble_type"
    // InternalIoT.g:4671:1: ruledouble_type returns [Enumerator current=null] : (enumLiteral_0= 'double' ) ;
    public final Enumerator ruledouble_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4677:2: ( (enumLiteral_0= 'double' ) )
            // InternalIoT.g:4678:2: (enumLiteral_0= 'double' )
            {
            // InternalIoT.g:4678:2: (enumLiteral_0= 'double' )
            // InternalIoT.g:4679:3: enumLiteral_0= 'double'
            {
            enumLiteral_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDouble_typeAccess().getPK_DOUBLEEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDouble_typeAccess().getPK_DOUBLEEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruledouble_type"


    // $ANTLR start "ruleshort_type"
    // InternalIoT.g:4688:1: ruleshort_type returns [Enumerator current=null] : (enumLiteral_0= 'short' ) ;
    public final Enumerator ruleshort_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4694:2: ( (enumLiteral_0= 'short' ) )
            // InternalIoT.g:4695:2: (enumLiteral_0= 'short' )
            {
            // InternalIoT.g:4695:2: (enumLiteral_0= 'short' )
            // InternalIoT.g:4696:3: enumLiteral_0= 'short'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShort_typeAccess().getPK_SHORTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShort_typeAccess().getPK_SHORTEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleshort_type"


    // $ANTLR start "rulelong_type"
    // InternalIoT.g:4705:1: rulelong_type returns [Enumerator current=null] : (enumLiteral_0= 'long' ) ;
    public final Enumerator rulelong_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4711:2: ( (enumLiteral_0= 'long' ) )
            // InternalIoT.g:4712:2: (enumLiteral_0= 'long' )
            {
            // InternalIoT.g:4712:2: (enumLiteral_0= 'long' )
            // InternalIoT.g:4713:3: enumLiteral_0= 'long'
            {
            enumLiteral_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getLong_typeAccess().getPK_LONGEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getLong_typeAccess().getPK_LONGEnumLiteralDeclaration());
              		
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
    // $ANTLR end "rulelong_type"


    // $ANTLR start "rulechar_type"
    // InternalIoT.g:4722:1: rulechar_type returns [Enumerator current=null] : (enumLiteral_0= 'char' ) ;
    public final Enumerator rulechar_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4728:2: ( (enumLiteral_0= 'char' ) )
            // InternalIoT.g:4729:2: (enumLiteral_0= 'char' )
            {
            // InternalIoT.g:4729:2: (enumLiteral_0= 'char' )
            // InternalIoT.g:4730:3: enumLiteral_0= 'char'
            {
            enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getChar_typeAccess().getPK_CHAREnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getChar_typeAccess().getPK_CHAREnumLiteralDeclaration());
              		
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
    // $ANTLR end "rulechar_type"


    // $ANTLR start "rulewide_char_type"
    // InternalIoT.g:4739:1: rulewide_char_type returns [Enumerator current=null] : (enumLiteral_0= 'wchar' ) ;
    public final Enumerator rulewide_char_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4745:2: ( (enumLiteral_0= 'wchar' ) )
            // InternalIoT.g:4746:2: (enumLiteral_0= 'wchar' )
            {
            // InternalIoT.g:4746:2: (enumLiteral_0= 'wchar' )
            // InternalIoT.g:4747:3: enumLiteral_0= 'wchar'
            {
            enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getWide_char_typeAccess().getPK_WCHAREnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getWide_char_typeAccess().getPK_WCHAREnumLiteralDeclaration());
              		
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
    // $ANTLR end "rulewide_char_type"


    // $ANTLR start "rulestring_type"
    // InternalIoT.g:4756:1: rulestring_type returns [Enumerator current=null] : (enumLiteral_0= 'string' ) ;
    public final Enumerator rulestring_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4762:2: ( (enumLiteral_0= 'string' ) )
            // InternalIoT.g:4763:2: (enumLiteral_0= 'string' )
            {
            // InternalIoT.g:4763:2: (enumLiteral_0= 'string' )
            // InternalIoT.g:4764:3: enumLiteral_0= 'string'
            {
            enumLiteral_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getString_typeAccess().getPK_STRINGEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getString_typeAccess().getPK_STRINGEnumLiteralDeclaration());
              		
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
    // $ANTLR end "rulestring_type"


    // $ANTLR start "rulewide_string_type"
    // InternalIoT.g:4773:1: rulewide_string_type returns [Enumerator current=null] : (enumLiteral_0= 'wstring' ) ;
    public final Enumerator rulewide_string_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4779:2: ( (enumLiteral_0= 'wstring' ) )
            // InternalIoT.g:4780:2: (enumLiteral_0= 'wstring' )
            {
            // InternalIoT.g:4780:2: (enumLiteral_0= 'wstring' )
            // InternalIoT.g:4781:3: enumLiteral_0= 'wstring'
            {
            enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getWide_string_typeAccess().getPK_WSTRINGEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getWide_string_typeAccess().getPK_WSTRINGEnumLiteralDeclaration());
              		
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
    // $ANTLR end "rulewide_string_type"


    // $ANTLR start "ruleboolean_type"
    // InternalIoT.g:4790:1: ruleboolean_type returns [Enumerator current=null] : (enumLiteral_0= 'boolean' ) ;
    public final Enumerator ruleboolean_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4796:2: ( (enumLiteral_0= 'boolean' ) )
            // InternalIoT.g:4797:2: (enumLiteral_0= 'boolean' )
            {
            // InternalIoT.g:4797:2: (enumLiteral_0= 'boolean' )
            // InternalIoT.g:4798:3: enumLiteral_0= 'boolean'
            {
            enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBoolean_typeAccess().getPK_BOOLEANEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBoolean_typeAccess().getPK_BOOLEANEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleboolean_type"


    // $ANTLR start "ruleoctet_type"
    // InternalIoT.g:4807:1: ruleoctet_type returns [Enumerator current=null] : (enumLiteral_0= 'octet' ) ;
    public final Enumerator ruleoctet_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4813:2: ( (enumLiteral_0= 'octet' ) )
            // InternalIoT.g:4814:2: (enumLiteral_0= 'octet' )
            {
            // InternalIoT.g:4814:2: (enumLiteral_0= 'octet' )
            // InternalIoT.g:4815:3: enumLiteral_0= 'octet'
            {
            enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getOctet_typeAccess().getPK_OCTETEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getOctet_typeAccess().getPK_OCTETEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleoctet_type"


    // $ANTLR start "ruleany_type"
    // InternalIoT.g:4824:1: ruleany_type returns [Enumerator current=null] : (enumLiteral_0= 'any' ) ;
    public final Enumerator ruleany_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4830:2: ( (enumLiteral_0= 'any' ) )
            // InternalIoT.g:4831:2: (enumLiteral_0= 'any' )
            {
            // InternalIoT.g:4831:2: (enumLiteral_0= 'any' )
            // InternalIoT.g:4832:3: enumLiteral_0= 'any'
            {
            enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getAny_typeAccess().getPK_ANYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getAny_typeAccess().getPK_ANYEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleany_type"


    // $ANTLR start "ruleIntegerCalculationOperator"
    // InternalIoT.g:4841:1: ruleIntegerCalculationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleIntegerCalculationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIoT.g:4847:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalIoT.g:4848:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalIoT.g:4848:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            else if ( (LA57_0==38) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalIoT.g:4849:3: (enumLiteral_0= '+' )
                    {
                    // InternalIoT.g:4849:3: (enumLiteral_0= '+' )
                    // InternalIoT.g:4850:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerCalculationOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIntegerCalculationOperatorAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:4857:3: (enumLiteral_1= '-' )
                    {
                    // InternalIoT.g:4857:3: (enumLiteral_1= '-' )
                    // InternalIoT.g:4858:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerCalculationOperatorAccess().getSUBRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getIntegerCalculationOperatorAccess().getSUBRACTEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleIntegerCalculationOperator"


    // $ANTLR start "ruleIntegerComparisonOperator"
    // InternalIoT.g:4868:1: ruleIntegerComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleIntegerComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalIoT.g:4874:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalIoT.g:4875:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalIoT.g:4875:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt58=1;
                }
                break;
            case 74:
                {
                alt58=2;
                }
                break;
            case 36:
                {
                alt58=3;
                }
                break;
            case 75:
                {
                alt58=4;
                }
                break;
            case 76:
                {
                alt58=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalIoT.g:4876:3: (enumLiteral_0= '<' )
                    {
                    // InternalIoT.g:4876:3: (enumLiteral_0= '<' )
                    // InternalIoT.g:4877:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerComparisonOperatorAccess().getSMALLEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getIntegerComparisonOperatorAccess().getSMALLEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:4884:3: (enumLiteral_1= '<=' )
                    {
                    // InternalIoT.g:4884:3: (enumLiteral_1= '<=' )
                    // InternalIoT.g:4885:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerComparisonOperatorAccess().getSMALLER_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getIntegerComparisonOperatorAccess().getSMALLER_EQUALSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:4892:3: (enumLiteral_2= '==' )
                    {
                    // InternalIoT.g:4892:3: (enumLiteral_2= '==' )
                    // InternalIoT.g:4893:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getIntegerComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:4900:3: (enumLiteral_3= '>=' )
                    {
                    // InternalIoT.g:4900:3: (enumLiteral_3= '>=' )
                    // InternalIoT.g:4901:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getIntegerComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIoT.g:4908:3: (enumLiteral_4= '>' )
                    {
                    // InternalIoT.g:4908:3: (enumLiteral_4= '>' )
                    // InternalIoT.g:4909:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getIntegerComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getIntegerComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleIntegerComparisonOperator"


    // $ANTLR start "ruleBooleanUnaryOperator"
    // InternalIoT.g:4919:1: ruleBooleanUnaryOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleBooleanUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalIoT.g:4925:2: ( (enumLiteral_0= '!' ) )
            // InternalIoT.g:4926:2: (enumLiteral_0= '!' )
            {
            // InternalIoT.g:4926:2: (enumLiteral_0= '!' )
            // InternalIoT.g:4927:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBooleanUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBooleanUnaryOperatorAccess().getNOTEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleBooleanUnaryOperator"


    // $ANTLR start "ruleBooleanBinaryOperator"
    // InternalIoT.g:4936:1: ruleBooleanBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBooleanBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIoT.g:4942:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalIoT.g:4943:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalIoT.g:4943:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==78) ) {
                alt59=1;
            }
            else if ( (LA59_0==79) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalIoT.g:4944:3: (enumLiteral_0= '&' )
                    {
                    // InternalIoT.g:4944:3: (enumLiteral_0= '&' )
                    // InternalIoT.g:4945:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanBinaryOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:4952:3: (enumLiteral_1= '|' )
                    {
                    // InternalIoT.g:4952:3: (enumLiteral_1= '|' )
                    // InternalIoT.g:4953:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBooleanBinaryOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleBooleanBinaryOperator"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\11\3\uffff";
    static final String dfa_3s = "\1\32\1\uffff\2\32\2\uffff\1\32\3\uffff";
    static final String dfa_4s = "\1\35\1\uffff\1\32\1\35\2\uffff\1\32\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff\1\4\1\6\1\5";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\3\1\1",
            "",
            "\1\5",
            "\1\6\2\uffff\1\7",
            "",
            "",
            "\1\10",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "978:2: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000026C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000600002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000600000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000140000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000140000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000800050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00C0060000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000060001004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x003F080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000080002L});

}