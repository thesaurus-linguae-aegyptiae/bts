package org.bbaw.bts.corpus.text.egy.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.bbaw.bts.corpus.text.egy.services.EgyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEgyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_CASESTRING", "RULE_BETWEEN_HASHES", "RULE_BETWEEN_MINUS", "RULE_EGYSTRING", "' '", "'\\u00A7'", "'%'", "'| '", "'\\uD80C\\uDE58'", "'\\uD80C\\uDE82'", "'\\uD80C\\uDF79'", "'\\uD80C\\uDF7A'", "'\\uD80C\\uDE86'", "'\\uD80C\\uDE87'", "'('", "')'", "'(('", "'))'", "'\\u2329'", "'\\u232A'", "'\\u2E2E'", "'?'", "'['", "']'", "'{'", "'}'", "'\\u2329\\u2329'", "'\\u232A\\u232A'", "'{{'", "'}}'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'~'", "'-'", "';'", "'(\\uDB80\\uDC80)'", "'\\u2E2E\\uDB80\\uDC80?'", "'{\\uDB80\\uDC80}'", "'[\\uDB80\\uDC80]'", "'[\\uDB80\\uDC81]'", "'\\u2E22\\uDB80\\uDC80\\u2E23'", "'\\u2329\\uDB80\\uDC80\\u232A'", "'[[\\uDB80\\uDC80]]'", "'((\\uDB80\\uDC80))'", "'{{\\uDB80\\uDC80}}'", "'\\uDB80\\uDC81'", "'\\uDB80\\uDC80'", "'\\uDB80\\uDC82'"
    };
    public static final int T__50=50;
    public static final int RULE_BETWEEN_HASHES=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_EGYSTRING=8;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_CASESTRING=5;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_BETWEEN_MINUS=7;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEgyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEgyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEgyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEgyDsl.g"; }



     	private EgyDslGrammarAccess grammarAccess;
     	
        public InternalEgyDslParser(TokenStream input, EgyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TextContent";	
       	}
       	
       	@Override
       	protected EgyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTextContent"
    // InternalEgyDsl.g:67:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // InternalEgyDsl.g:68:2: (iv_ruleTextContent= ruleTextContent EOF )
            // InternalEgyDsl.g:69:2: iv_ruleTextContent= ruleTextContent EOF
            {
             newCompositeNode(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;

             current =iv_ruleTextContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // InternalEgyDsl.g:76:1: ruleTextContent returns [EObject current=null] : ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_NEWLINE_3=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:79:28: ( ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) ) )
            // InternalEgyDsl.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) )
            {
            // InternalEgyDsl.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) )
            // InternalEgyDsl.g:80:2: () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )
            {
            // InternalEgyDsl.g:80:2: ()
            // InternalEgyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextContentAccess().getTextContentAction_0(),
                        current);
                

            }

            // InternalEgyDsl.g:86:2: ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )
            // InternalEgyDsl.g:86:3: ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )*
            {
            // InternalEgyDsl.g:86:3: ( (lv_items_1_0= ruleTextItem ) )
            // InternalEgyDsl.g:87:1: (lv_items_1_0= ruleTextItem )
            {
            // InternalEgyDsl.g:87:1: (lv_items_1_0= ruleTextItem )
            // InternalEgyDsl.g:88:3: lv_items_1_0= ruleTextItem
            {
             
            	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_items_1_0=ruleTextItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.TextItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalEgyDsl.g:104:2: ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NEWLINE||(LA2_0>=9 && LA2_0<=10)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEgyDsl.g:104:3: (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) )
            	    {
            	    // InternalEgyDsl.g:104:3: (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt1=3;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==9) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==RULE_NEWLINE) ) {
            	        alt1=2;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalEgyDsl.g:104:5: otherlv_2= ' '
            	            {
            	            otherlv_2=(Token)match(input,9,FOLLOW_4); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // InternalEgyDsl.g:109:6: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 
            	             
            	                newLeafNode(this_NEWLINE_3, grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // InternalEgyDsl.g:113:3: ( (lv_items_4_0= ruleTextItem ) )
            	    // InternalEgyDsl.g:114:1: (lv_items_4_0= ruleTextItem )
            	    {
            	    // InternalEgyDsl.g:114:1: (lv_items_4_0= ruleTextItem )
            	    // InternalEgyDsl.g:115:3: lv_items_4_0= ruleTextItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_items_4_0=ruleTextItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_4_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.TextItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleTextItem"
    // InternalEgyDsl.g:139:1: entryRuleTextItem returns [EObject current=null] : iv_ruleTextItem= ruleTextItem EOF ;
    public final EObject entryRuleTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextItem = null;


        try {
            // InternalEgyDsl.g:140:2: (iv_ruleTextItem= ruleTextItem EOF )
            // InternalEgyDsl.g:141:2: iv_ruleTextItem= ruleTextItem EOF
            {
             newCompositeNode(grammarAccess.getTextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextItem=ruleTextItem();

            state._fsp--;

             current =iv_ruleTextItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextItem"


    // $ANTLR start "ruleTextItem"
    // InternalEgyDsl.g:148:1: ruleTextItem returns [EObject current=null] : this_Sentence_0= ruleSentence ;
    public final EObject ruleTextItem() throws RecognitionException {
        EObject current = null;

        EObject this_Sentence_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:151:28: (this_Sentence_0= ruleSentence )
            // InternalEgyDsl.g:153:5: this_Sentence_0= ruleSentence
            {
             
                    newCompositeNode(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Sentence_0=ruleSentence();

            state._fsp--;

             
                    current = this_Sentence_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextItem"


    // $ANTLR start "entryRuleSentence"
    // InternalEgyDsl.g:169:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalEgyDsl.g:170:2: (iv_ruleSentence= ruleSentence EOF )
            // InternalEgyDsl.g:171:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalEgyDsl.g:178:1: ruleSentence returns [EObject current=null] : ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NEWLINE_4=null;
        Token otherlv_6=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:181:28: ( ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' ) )
            // InternalEgyDsl.g:182:1: ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' )
            {
            // InternalEgyDsl.g:182:1: ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' )
            // InternalEgyDsl.g:182:2: () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7'
            {
            // InternalEgyDsl.g:182:2: ()
            // InternalEgyDsl.g:183:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSentenceAccess().getSentenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,10,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getSentenceAccess().getSectionSignKeyword_1());
                
            // InternalEgyDsl.g:192:1: ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_BETWEEN_HASHES && LA5_0<=RULE_EGYSTRING)||LA5_0==11||LA5_0==13||LA5_0==15||LA5_0==17||LA5_0==19||LA5_0==21||LA5_0==23||LA5_0==25||LA5_0==27||LA5_0==29||LA5_0==31||LA5_0==33||LA5_0==35||LA5_0==37||(LA5_0>=39 && LA5_0<=59)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEgyDsl.g:192:2: ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )*
                    {
                    // InternalEgyDsl.g:192:2: ( (lv_items_2_0= ruleSentenceItem ) )
                    // InternalEgyDsl.g:193:1: (lv_items_2_0= ruleSentenceItem )
                    {
                    // InternalEgyDsl.g:193:1: (lv_items_2_0= ruleSentenceItem )
                    // InternalEgyDsl.g:194:3: lv_items_2_0= ruleSentenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_6);
                    lv_items_2_0=ruleSentenceItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"org.bbaw.bts.corpus.text.egy.EgyDsl.SentenceItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalEgyDsl.g:210:2: (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==9) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEgyDsl.g:210:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,9,FOLLOW_7); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0());
                    	        
                    	    // InternalEgyDsl.g:214:1: (this_NEWLINE_4= RULE_NEWLINE )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_NEWLINE) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // InternalEgyDsl.g:214:2: this_NEWLINE_4= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 
                    	             
                    	                newLeafNode(this_NEWLINE_4, grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // InternalEgyDsl.g:218:3: ( (lv_items_5_0= ruleSentenceItem ) )
                    	    // InternalEgyDsl.g:219:1: (lv_items_5_0= ruleSentenceItem )
                    	    {
                    	    // InternalEgyDsl.g:219:1: (lv_items_5_0= ruleSentenceItem )
                    	    // InternalEgyDsl.g:220:3: lv_items_5_0= ruleSentenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_6);
                    	    lv_items_5_0=ruleSentenceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_5_0, 
                    	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.SentenceItem");
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
                    break;

            }

            otherlv_6=(Token)match(input,10,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getSentenceAccess().getSectionSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleSentenceItem"
    // InternalEgyDsl.g:248:1: entryRuleSentenceItem returns [EObject current=null] : iv_ruleSentenceItem= ruleSentenceItem EOF ;
    public final EObject entryRuleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItem = null;


        try {
            // InternalEgyDsl.g:249:2: (iv_ruleSentenceItem= ruleSentenceItem EOF )
            // InternalEgyDsl.g:250:2: iv_ruleSentenceItem= ruleSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenceItem=ruleSentenceItem();

            state._fsp--;

             current =iv_ruleSentenceItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentenceItem"


    // $ANTLR start "ruleSentenceItem"
    // InternalEgyDsl.g:257:1: ruleSentenceItem returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) ;
    public final EObject ruleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;

        EObject this_Ambivalence_2 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:260:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) )
            // InternalEgyDsl.g:261:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            {
            // InternalEgyDsl.g:261:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt6=1;
                }
                break;
            case RULE_BETWEEN_HASHES:
            case RULE_BETWEEN_MINUS:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt6=2;
                }
                break;
            case 11:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEgyDsl.g:262:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:272:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AbstractMarker_1=ruleAbstractMarker();

                    state._fsp--;

                     
                            current = this_AbstractMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:282:5: this_Ambivalence_2= ruleAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Ambivalence_2=ruleAmbivalence();

                    state._fsp--;

                     
                            current = this_Ambivalence_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentenceItem"


    // $ANTLR start "entryRuleAbstractMarker"
    // InternalEgyDsl.g:298:1: entryRuleAbstractMarker returns [EObject current=null] : iv_ruleAbstractMarker= ruleAbstractMarker EOF ;
    public final EObject entryRuleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMarker = null;


        try {
            // InternalEgyDsl.g:299:2: (iv_ruleAbstractMarker= ruleAbstractMarker EOF )
            // InternalEgyDsl.g:300:2: iv_ruleAbstractMarker= ruleAbstractMarker EOF
            {
             newCompositeNode(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMarker=ruleAbstractMarker();

            state._fsp--;

             current =iv_ruleAbstractMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractMarker"


    // $ANTLR start "ruleAbstractMarker"
    // InternalEgyDsl.g:307:1: ruleAbstractMarker returns [EObject current=null] : (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker ) ;
    public final EObject ruleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject this_Marker_0 = null;

        EObject this_VersMarker_1 = null;

        EObject this_DestructionMarker_2 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:310:28: ( (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker ) )
            // InternalEgyDsl.g:311:1: (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker )
            {
            // InternalEgyDsl.g:311:1: (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_BETWEEN_HASHES:
                {
                alt7=1;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt7=2;
                }
                break;
            case RULE_BETWEEN_MINUS:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEgyDsl.g:312:5: this_Marker_0= ruleMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Marker_0=ruleMarker();

                    state._fsp--;

                     
                            current = this_Marker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:322:5: this_VersMarker_1= ruleVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_VersMarker_1=ruleVersMarker();

                    state._fsp--;

                     
                            current = this_VersMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:332:5: this_DestructionMarker_2= ruleDestructionMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getDestructionMarkerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DestructionMarker_2=ruleDestructionMarker();

                    state._fsp--;

                     
                            current = this_DestructionMarker_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractMarker"


    // $ANTLR start "entryRuleAmbivalence"
    // InternalEgyDsl.g:348:1: entryRuleAmbivalence returns [EObject current=null] : iv_ruleAmbivalence= ruleAmbivalence EOF ;
    public final EObject entryRuleAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbivalence = null;


        try {
            // InternalEgyDsl.g:349:2: (iv_ruleAmbivalence= ruleAmbivalence EOF )
            // InternalEgyDsl.g:350:2: iv_ruleAmbivalence= ruleAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmbivalence=ruleAmbivalence();

            state._fsp--;

             current =iv_ruleAmbivalence; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmbivalence"


    // $ANTLR start "ruleAmbivalence"
    // InternalEgyDsl.g:357:1: ruleAmbivalence returns [EObject current=null] : (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' ) ;
    public final EObject ruleAmbivalence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_NEWLINE_3=null;
        Token otherlv_5=null;
        EObject lv_cases_1_0 = null;

        EObject lv_cases_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:360:28: ( (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' ) )
            // InternalEgyDsl.g:361:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' )
            {
            // InternalEgyDsl.g:361:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' )
            // InternalEgyDsl.g:361:3: otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0());
                
            // InternalEgyDsl.g:365:1: ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ )
            // InternalEgyDsl.g:365:2: ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+
            {
            // InternalEgyDsl.g:365:2: ( (lv_cases_1_0= ruleCase ) )
            // InternalEgyDsl.g:366:1: (lv_cases_1_0= ruleCase )
            {
            // InternalEgyDsl.g:366:1: (lv_cases_1_0= ruleCase )
            // InternalEgyDsl.g:367:3: lv_cases_1_0= ruleCase
            {
             
            	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_10);
            lv_cases_1_0=ruleCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAmbivalenceRule());
            	        }
                   		add(
                   			current, 
                   			"cases",
                    		lv_cases_1_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.Case");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalEgyDsl.g:383:2: (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEgyDsl.g:383:4: otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_11); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAmbivalenceAccess().getVerticalLineSpaceKeyword_1_1_0());
            	        
            	    // InternalEgyDsl.g:387:1: (this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_NEWLINE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalEgyDsl.g:387:2: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 
            	             
            	                newLeafNode(this_NEWLINE_3, grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // InternalEgyDsl.g:391:3: ( (lv_cases_4_0= ruleCase ) )
            	    // InternalEgyDsl.g:392:1: (lv_cases_4_0= ruleCase )
            	    {
            	    // InternalEgyDsl.g:392:1: (lv_cases_4_0= ruleCase )
            	    // InternalEgyDsl.g:393:3: lv_cases_4_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_cases_4_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAmbivalenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_4_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            otherlv_5=(Token)match(input,11,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmbivalence"


    // $ANTLR start "entryRuleCase"
    // InternalEgyDsl.g:421:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalEgyDsl.g:422:2: (iv_ruleCase= ruleCase EOF )
            // InternalEgyDsl.g:423:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalEgyDsl.g:430:1: ruleCase returns [EObject current=null] : ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_NEWLINE_1=null;
        Token otherlv_3=null;
        Token this_NEWLINE_4=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:433:28: ( ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) ) )
            // InternalEgyDsl.g:434:1: ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) )
            {
            // InternalEgyDsl.g:434:1: ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) )
            // InternalEgyDsl.g:434:2: ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* )
            {
            // InternalEgyDsl.g:434:2: ( (lv_name_0_0= RULE_CASESTRING ) )
            // InternalEgyDsl.g:435:1: (lv_name_0_0= RULE_CASESTRING )
            {
            // InternalEgyDsl.g:435:1: (lv_name_0_0= RULE_CASESTRING )
            // InternalEgyDsl.g:436:3: lv_name_0_0= RULE_CASESTRING
            {
            lv_name_0_0=(Token)match(input,RULE_CASESTRING,FOLLOW_13); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCaseAccess().getNameCASESTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.CASESTRING");
            	    

            }


            }

            // InternalEgyDsl.g:452:2: (this_NEWLINE_1= RULE_NEWLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NEWLINE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEgyDsl.g:452:3: this_NEWLINE_1= RULE_NEWLINE
                    {
                    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_13); 
                     
                        newLeafNode(this_NEWLINE_1, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // InternalEgyDsl.g:456:3: ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* )
            // InternalEgyDsl.g:456:4: ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )*
            {
            // InternalEgyDsl.g:456:4: ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) )
            // InternalEgyDsl.g:457:1: (lv_items_2_0= ruleSentenceItemNoAmbivalence )
            {
            // InternalEgyDsl.g:457:1: (lv_items_2_0= ruleSentenceItemNoAmbivalence )
            // InternalEgyDsl.g:458:3: lv_items_2_0= ruleSentenceItemNoAmbivalence
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_14);
            lv_items_2_0=ruleSentenceItemNoAmbivalence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_2_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.SentenceItemNoAmbivalence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalEgyDsl.g:474:2: (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==9) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEgyDsl.g:474:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_13); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0());
            	        
            	    // InternalEgyDsl.g:478:1: (this_NEWLINE_4= RULE_NEWLINE )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_NEWLINE) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalEgyDsl.g:478:2: this_NEWLINE_4= RULE_NEWLINE
            	            {
            	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_13); 
            	             
            	                newLeafNode(this_NEWLINE_4, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // InternalEgyDsl.g:482:3: ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    // InternalEgyDsl.g:483:1: (lv_items_5_0= ruleSentenceItemNoAmbivalence )
            	    {
            	    // InternalEgyDsl.g:483:1: (lv_items_5_0= ruleSentenceItemNoAmbivalence )
            	    // InternalEgyDsl.g:484:3: lv_items_5_0= ruleSentenceItemNoAmbivalence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_items_5_0=ruleSentenceItemNoAmbivalence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_5_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.SentenceItemNoAmbivalence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleSentenceItemNoAmbivalence"
    // InternalEgyDsl.g:508:1: entryRuleSentenceItemNoAmbivalence returns [EObject current=null] : iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF ;
    public final EObject entryRuleSentenceItemNoAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItemNoAmbivalence = null;


        try {
            // InternalEgyDsl.g:509:2: (iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF )
            // InternalEgyDsl.g:510:2: iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenceItemNoAmbivalence=ruleSentenceItemNoAmbivalence();

            state._fsp--;

             current =iv_ruleSentenceItemNoAmbivalence; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentenceItemNoAmbivalence"


    // $ANTLR start "ruleSentenceItemNoAmbivalence"
    // InternalEgyDsl.g:517:1: ruleSentenceItemNoAmbivalence returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker ) ;
    public final EObject ruleSentenceItemNoAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:520:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker ) )
            // InternalEgyDsl.g:521:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker )
            {
            // InternalEgyDsl.g:521:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EGYSTRING||LA13_0==13||LA13_0==15||LA13_0==17||LA13_0==19||LA13_0==21||LA13_0==23||LA13_0==25||LA13_0==27||LA13_0==29||LA13_0==31||LA13_0==33||LA13_0==35||LA13_0==37||(LA13_0>=39 && LA13_0<=46)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_BETWEEN_HASHES && LA13_0<=RULE_BETWEEN_MINUS)||(LA13_0>=47 && LA13_0<=59)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEgyDsl.g:522:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:532:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AbstractMarker_1=ruleAbstractMarker();

                    state._fsp--;

                     
                            current = this_AbstractMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentenceItemNoAmbivalence"


    // $ANTLR start "entryRuleMarker"
    // InternalEgyDsl.g:548:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // InternalEgyDsl.g:549:2: (iv_ruleMarker= ruleMarker EOF )
            // InternalEgyDsl.g:550:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // InternalEgyDsl.g:557:1: ruleMarker returns [EObject current=null] : ( (lv_type_0_0= RULE_BETWEEN_HASHES ) ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:560:28: ( ( (lv_type_0_0= RULE_BETWEEN_HASHES ) ) )
            // InternalEgyDsl.g:561:1: ( (lv_type_0_0= RULE_BETWEEN_HASHES ) )
            {
            // InternalEgyDsl.g:561:1: ( (lv_type_0_0= RULE_BETWEEN_HASHES ) )
            // InternalEgyDsl.g:562:1: (lv_type_0_0= RULE_BETWEEN_HASHES )
            {
            // InternalEgyDsl.g:562:1: (lv_type_0_0= RULE_BETWEEN_HASHES )
            // InternalEgyDsl.g:563:3: lv_type_0_0= RULE_BETWEEN_HASHES
            {
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_HASHES,FOLLOW_2); 

            			newLeafNode(lv_type_0_0, grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.BETWEEN_HASHES");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleDestructionMarker"
    // InternalEgyDsl.g:587:1: entryRuleDestructionMarker returns [EObject current=null] : iv_ruleDestructionMarker= ruleDestructionMarker EOF ;
    public final EObject entryRuleDestructionMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionMarker = null;


        try {
            // InternalEgyDsl.g:588:2: (iv_ruleDestructionMarker= ruleDestructionMarker EOF )
            // InternalEgyDsl.g:589:2: iv_ruleDestructionMarker= ruleDestructionMarker EOF
            {
             newCompositeNode(grammarAccess.getDestructionMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestructionMarker=ruleDestructionMarker();

            state._fsp--;

             current =iv_ruleDestructionMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestructionMarker"


    // $ANTLR start "ruleDestructionMarker"
    // InternalEgyDsl.g:596:1: ruleDestructionMarker returns [EObject current=null] : ( (lv_type_0_0= RULE_BETWEEN_MINUS ) ) ;
    public final EObject ruleDestructionMarker() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:599:28: ( ( (lv_type_0_0= RULE_BETWEEN_MINUS ) ) )
            // InternalEgyDsl.g:600:1: ( (lv_type_0_0= RULE_BETWEEN_MINUS ) )
            {
            // InternalEgyDsl.g:600:1: ( (lv_type_0_0= RULE_BETWEEN_MINUS ) )
            // InternalEgyDsl.g:601:1: (lv_type_0_0= RULE_BETWEEN_MINUS )
            {
            // InternalEgyDsl.g:601:1: (lv_type_0_0= RULE_BETWEEN_MINUS )
            // InternalEgyDsl.g:602:3: lv_type_0_0= RULE_BETWEEN_MINUS
            {
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_MINUS,FOLLOW_2); 

            			newLeafNode(lv_type_0_0, grammarAccess.getDestructionMarkerAccess().getTypeBETWEEN_MINUSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDestructionMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.BETWEEN_MINUS");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestructionMarker"


    // $ANTLR start "entryRuleWord"
    // InternalEgyDsl.g:626:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalEgyDsl.g:627:2: (iv_ruleWord= ruleWord EOF )
            // InternalEgyDsl.g:628:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // InternalEgyDsl.g:635:1: ruleWord returns [EObject current=null] : ( () ( (lv_wChar_1_0= ruleWordPart ) )+ ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:638:28: ( ( () ( (lv_wChar_1_0= ruleWordPart ) )+ ) )
            // InternalEgyDsl.g:639:1: ( () ( (lv_wChar_1_0= ruleWordPart ) )+ )
            {
            // InternalEgyDsl.g:639:1: ( () ( (lv_wChar_1_0= ruleWordPart ) )+ )
            // InternalEgyDsl.g:639:2: () ( (lv_wChar_1_0= ruleWordPart ) )+
            {
            // InternalEgyDsl.g:639:2: ()
            // InternalEgyDsl.g:640:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWordAccess().getWordAction_0(),
                        current);
                

            }

            // InternalEgyDsl.g:645:2: ( (lv_wChar_1_0= ruleWordPart ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EGYSTRING||LA14_0==13||LA14_0==15||LA14_0==17||LA14_0==19||LA14_0==21||LA14_0==23||LA14_0==25||LA14_0==27||LA14_0==29||LA14_0==31||LA14_0==33||LA14_0==35||LA14_0==37||(LA14_0>=39 && LA14_0<=46)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEgyDsl.g:646:1: (lv_wChar_1_0= ruleWordPart )
            	    {
            	    // InternalEgyDsl.g:646:1: (lv_wChar_1_0= ruleWordPart )
            	    // InternalEgyDsl.g:647:3: lv_wChar_1_0= ruleWordPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_wChar_1_0=ruleWordPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWordRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.WordPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleWordPart"
    // InternalEgyDsl.g:671:1: entryRuleWordPart returns [EObject current=null] : iv_ruleWordPart= ruleWordPart EOF ;
    public final EObject entryRuleWordPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordPart = null;


        try {
            // InternalEgyDsl.g:672:2: (iv_ruleWordPart= ruleWordPart EOF )
            // InternalEgyDsl.g:673:2: iv_ruleWordPart= ruleWordPart EOF
            {
             newCompositeNode(grammarAccess.getWordPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordPart=ruleWordPart();

            state._fsp--;

             current =iv_ruleWordPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWordPart"


    // $ANTLR start "ruleWordPart"
    // InternalEgyDsl.g:680:1: ruleWordPart returns [EObject current=null] : ( (lv_wChar_0_0= ruleWordMiddle ) ) ;
    public final EObject ruleWordPart() throws RecognitionException {
        EObject current = null;

        EObject lv_wChar_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:683:28: ( ( (lv_wChar_0_0= ruleWordMiddle ) ) )
            // InternalEgyDsl.g:684:1: ( (lv_wChar_0_0= ruleWordMiddle ) )
            {
            // InternalEgyDsl.g:684:1: ( (lv_wChar_0_0= ruleWordMiddle ) )
            // InternalEgyDsl.g:685:1: (lv_wChar_0_0= ruleWordMiddle )
            {
            // InternalEgyDsl.g:685:1: (lv_wChar_0_0= ruleWordMiddle )
            // InternalEgyDsl.g:686:3: lv_wChar_0_0= ruleWordMiddle
            {
             
            	        newCompositeNode(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_wChar_0_0=ruleWordMiddle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWordPartRule());
            	        }
                   		set(
                   			current, 
                   			"wChar",
                    		lv_wChar_0_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.WordMiddle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordPart"


    // $ANTLR start "entryRuleWordMiddle"
    // InternalEgyDsl.g:710:1: entryRuleWordMiddle returns [EObject current=null] : iv_ruleWordMiddle= ruleWordMiddle EOF ;
    public final EObject entryRuleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMiddle = null;


        try {
            // InternalEgyDsl.g:711:2: (iv_ruleWordMiddle= ruleWordMiddle EOF )
            // InternalEgyDsl.g:712:2: iv_ruleWordMiddle= ruleWordMiddle EOF
            {
             newCompositeNode(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWordMiddle"


    // $ANTLR start "ruleWordMiddle"
    // InternalEgyDsl.g:719:1: ruleWordMiddle returns [EObject current=null] : (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) ;
    public final EObject ruleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject this_Brackets_0 = null;

        EObject this_Chars_1 = null;

        EObject this_Interfix_2 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:722:28: ( (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) )
            // InternalEgyDsl.g:723:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            {
            // InternalEgyDsl.g:723:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
                {
                alt15=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt15=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEgyDsl.g:724:5: this_Brackets_0= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Brackets_0=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:734:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:744:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordMiddle"


    // $ANTLR start "entryRuleChars"
    // InternalEgyDsl.g:760:1: entryRuleChars returns [EObject current=null] : iv_ruleChars= ruleChars EOF ;
    public final EObject entryRuleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChars = null;


        try {
            // InternalEgyDsl.g:761:2: (iv_ruleChars= ruleChars EOF )
            // InternalEgyDsl.g:762:2: iv_ruleChars= ruleChars EOF
            {
             newCompositeNode(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChars"


    // $ANTLR start "ruleChars"
    // InternalEgyDsl.g:769:1: ruleChars returns [EObject current=null] : ( (lv_name_0_0= RULE_EGYSTRING ) ) ;
    public final EObject ruleChars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:772:28: ( ( (lv_name_0_0= RULE_EGYSTRING ) ) )
            // InternalEgyDsl.g:773:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            {
            // InternalEgyDsl.g:773:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            // InternalEgyDsl.g:774:1: (lv_name_0_0= RULE_EGYSTRING )
            {
            // InternalEgyDsl.g:774:1: (lv_name_0_0= RULE_EGYSTRING )
            // InternalEgyDsl.g:775:3: lv_name_0_0= RULE_EGYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_2); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.bbaw.bts.corpus.text.egy.EgyDsl.EGYSTRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChars"


    // $ANTLR start "entryRuleBrackets"
    // InternalEgyDsl.g:799:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // InternalEgyDsl.g:800:2: (iv_ruleBrackets= ruleBrackets EOF )
            // InternalEgyDsl.g:801:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrackets"


    // $ANTLR start "ruleBrackets"
    // InternalEgyDsl.g:808:1: ruleBrackets returns [EObject current=null] : (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_Rasur_0 = null;

        EObject this_AncientExpanded_1 = null;

        EObject this_RestorationOverRasur_2 = null;

        EObject this_ExpandedColumn_3 = null;

        EObject this_Expanded_4 = null;

        EObject this_DisputableReading_5 = null;

        EObject this_Emendation_6 = null;

        EObject this_Lacuna_7 = null;

        EObject this_Deletion_8 = null;

        EObject this_PartialDestruction_9 = null;

        EObject this_Cartouche_10 = null;

        EObject this_Oval_11 = null;

        EObject this_Serech_12 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:811:28: ( (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech ) )
            // InternalEgyDsl.g:812:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech )
            {
            // InternalEgyDsl.g:812:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech )
            int alt16=13;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 21:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 31:
                {
                alt16=4;
                }
                break;
            case 19:
                {
                alt16=5;
                }
                break;
            case 25:
                {
                alt16=6;
                }
                break;
            case 23:
                {
                alt16=7;
                }
                break;
            case 27:
                {
                alt16=8;
                }
                break;
            case 29:
                {
                alt16=9;
                }
                break;
            case 37:
                {
                alt16=10;
                }
                break;
            case 17:
                {
                alt16=11;
                }
                break;
            case 13:
                {
                alt16=12;
                }
                break;
            case 15:
                {
                alt16=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalEgyDsl.g:813:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Rasur_0=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:823:5: this_AncientExpanded_1= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AncientExpanded_1=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:833:5: this_RestorationOverRasur_2= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RestorationOverRasur_2=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:843:5: this_ExpandedColumn_3= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ExpandedColumn_3=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:853:5: this_Expanded_4= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_4=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:863:5: this_DisputableReading_5= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_5=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:873:5: this_Emendation_6= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_6=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:883:5: this_Lacuna_7= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_7=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:893:5: this_Deletion_8= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_8=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:903:5: this_PartialDestruction_9= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_9=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:913:5: this_Cartouche_10= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Cartouche_10=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalEgyDsl.g:923:5: this_Oval_11= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Oval_11=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalEgyDsl.g:933:5: this_Serech_12= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getSerechParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Serech_12=ruleSerech();

                    state._fsp--;

                     
                            current = this_Serech_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrackets"


    // $ANTLR start "entryRuleOval"
    // InternalEgyDsl.g:949:1: entryRuleOval returns [EObject current=null] : iv_ruleOval= ruleOval EOF ;
    public final EObject entryRuleOval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOval = null;


        try {
            // InternalEgyDsl.g:950:2: (iv_ruleOval= ruleOval EOF )
            // InternalEgyDsl.g:951:2: iv_ruleOval= ruleOval EOF
            {
             newCompositeNode(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOval=ruleOval();

            state._fsp--;

             current =iv_ruleOval; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOval"


    // $ANTLR start "ruleOval"
    // InternalEgyDsl.g:958:1: ruleOval returns [EObject current=null] : (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' ) ;
    public final EObject ruleOval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:961:28: ( (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' ) )
            // InternalEgyDsl.g:962:1: (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' )
            {
            // InternalEgyDsl.g:962:1: (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' )
            // InternalEgyDsl.g:962:3: otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0());
                
            // InternalEgyDsl.g:966:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_EGYSTRING||LA17_0==19||LA17_0==21||LA17_0==23||LA17_0==25||LA17_0==27||LA17_0==29||LA17_0==31||LA17_0==33||LA17_0==35||LA17_0==37||(LA17_0>=39 && LA17_0<=46)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEgyDsl.g:967:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // InternalEgyDsl.g:967:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // InternalEgyDsl.g:968:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_wChar_1_0=ruleNoCartouche();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOvalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoCartouche");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe82Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOval"


    // $ANTLR start "entryRuleSerech"
    // InternalEgyDsl.g:996:1: entryRuleSerech returns [EObject current=null] : iv_ruleSerech= ruleSerech EOF ;
    public final EObject entryRuleSerech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerech = null;


        try {
            // InternalEgyDsl.g:997:2: (iv_ruleSerech= ruleSerech EOF )
            // InternalEgyDsl.g:998:2: iv_ruleSerech= ruleSerech EOF
            {
             newCompositeNode(grammarAccess.getSerechRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSerech=ruleSerech();

            state._fsp--;

             current =iv_ruleSerech; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSerech"


    // $ANTLR start "ruleSerech"
    // InternalEgyDsl.g:1005:1: ruleSerech returns [EObject current=null] : (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' ) ;
    public final EObject ruleSerech() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1008:28: ( (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' ) )
            // InternalEgyDsl.g:1009:1: (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' )
            {
            // InternalEgyDsl.g:1009:1: (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' )
            // InternalEgyDsl.g:1009:3: otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0());
                
            // InternalEgyDsl.g:1013:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_EGYSTRING||LA18_0==19||LA18_0==21||LA18_0==23||LA18_0==25||LA18_0==27||LA18_0==29||LA18_0==31||LA18_0==33||LA18_0==35||LA18_0==37||(LA18_0>=39 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEgyDsl.g:1014:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // InternalEgyDsl.g:1014:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // InternalEgyDsl.g:1015:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
            	    lv_wChar_1_0=ruleNoCartouche();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSerechRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoCartouche");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf7aKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSerech"


    // $ANTLR start "entryRuleCartouche"
    // InternalEgyDsl.g:1043:1: entryRuleCartouche returns [EObject current=null] : iv_ruleCartouche= ruleCartouche EOF ;
    public final EObject entryRuleCartouche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartouche = null;


        try {
            // InternalEgyDsl.g:1044:2: (iv_ruleCartouche= ruleCartouche EOF )
            // InternalEgyDsl.g:1045:2: iv_ruleCartouche= ruleCartouche EOF
            {
             newCompositeNode(grammarAccess.getCartoucheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCartouche=ruleCartouche();

            state._fsp--;

             current =iv_ruleCartouche; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCartouche"


    // $ANTLR start "ruleCartouche"
    // InternalEgyDsl.g:1052:1: ruleCartouche returns [EObject current=null] : ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' ) ;
    public final EObject ruleCartouche() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1055:28: ( ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' ) )
            // InternalEgyDsl.g:1056:1: ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' )
            {
            // InternalEgyDsl.g:1056:1: ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' )
            // InternalEgyDsl.g:1056:2: () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87'
            {
            // InternalEgyDsl.g:1056:2: ()
            // InternalEgyDsl.g:1057:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCartoucheAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1());
                
            // InternalEgyDsl.g:1066:1: ( (lv_wChar_2_0= ruleNoCartouche ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EGYSTRING||LA19_0==19||LA19_0==21||LA19_0==23||LA19_0==25||LA19_0==27||LA19_0==29||LA19_0==31||LA19_0==33||LA19_0==35||LA19_0==37||(LA19_0>=39 && LA19_0<=46)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEgyDsl.g:1067:1: (lv_wChar_2_0= ruleNoCartouche )
            	    {
            	    // InternalEgyDsl.g:1067:1: (lv_wChar_2_0= ruleNoCartouche )
            	    // InternalEgyDsl.g:1068:3: lv_wChar_2_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
            	    lv_wChar_2_0=ruleNoCartouche();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCartoucheRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoCartouche");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe87Keyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCartouche"


    // $ANTLR start "entryRuleNoCartouche"
    // InternalEgyDsl.g:1096:1: entryRuleNoCartouche returns [EObject current=null] : iv_ruleNoCartouche= ruleNoCartouche EOF ;
    public final EObject entryRuleNoCartouche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoCartouche = null;


        try {
            // InternalEgyDsl.g:1097:2: (iv_ruleNoCartouche= ruleNoCartouche EOF )
            // InternalEgyDsl.g:1098:2: iv_ruleNoCartouche= ruleNoCartouche EOF
            {
             newCompositeNode(grammarAccess.getNoCartoucheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoCartouche=ruleNoCartouche();

            state._fsp--;

             current =iv_ruleNoCartouche; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoCartouche"


    // $ANTLR start "ruleNoCartouche"
    // InternalEgyDsl.g:1105:1: ruleNoCartouche returns [EObject current=null] : (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix ) ;
    public final EObject ruleNoCartouche() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Rasur_1 = null;

        EObject this_AncientExpanded_2 = null;

        EObject this_RestorationOverRasur_3 = null;

        EObject this_ExpandedColumn_4 = null;

        EObject this_Expanded_5 = null;

        EObject this_DisputableReading_6 = null;

        EObject this_Emendation_7 = null;

        EObject this_Lacuna_8 = null;

        EObject this_Deletion_9 = null;

        EObject this_PartialDestruction_10 = null;

        EObject this_Interfix_11 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1108:28: ( (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix ) )
            // InternalEgyDsl.g:1109:1: (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix )
            {
            // InternalEgyDsl.g:1109:1: (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix )
            int alt20=12;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 21:
                {
                alt20=3;
                }
                break;
            case 35:
                {
                alt20=4;
                }
                break;
            case 31:
                {
                alt20=5;
                }
                break;
            case 19:
                {
                alt20=6;
                }
                break;
            case 25:
                {
                alt20=7;
                }
                break;
            case 23:
                {
                alt20=8;
                }
                break;
            case 27:
                {
                alt20=9;
                }
                break;
            case 29:
                {
                alt20=10;
                }
                break;
            case 37:
                {
                alt20=11;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt20=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalEgyDsl.g:1110:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1120:5: this_Rasur_1= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Rasur_1=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1130:5: this_AncientExpanded_2= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AncientExpanded_2=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:1140:5: this_RestorationOverRasur_3= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RestorationOverRasur_3=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:1150:5: this_ExpandedColumn_4= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ExpandedColumn_4=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:1160:5: this_Expanded_5= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_5=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:1170:5: this_DisputableReading_6= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_6=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:1180:5: this_Emendation_7= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_7=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:1190:5: this_Lacuna_8= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_8=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:1200:5: this_Deletion_9= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_9=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:1210:5: this_PartialDestruction_10= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_10=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalEgyDsl.g:1220:5: this_Interfix_11= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getInterfixParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_11=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoCartouche"


    // $ANTLR start "entryRuleExpanded"
    // InternalEgyDsl.g:1236:1: entryRuleExpanded returns [EObject current=null] : iv_ruleExpanded= ruleExpanded EOF ;
    public final EObject entryRuleExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpanded = null;


        try {
            // InternalEgyDsl.g:1237:2: (iv_ruleExpanded= ruleExpanded EOF )
            // InternalEgyDsl.g:1238:2: iv_ruleExpanded= ruleExpanded EOF
            {
             newCompositeNode(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpanded"


    // $ANTLR start "ruleExpanded"
    // InternalEgyDsl.g:1245:1: ruleExpanded returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) ;
    public final EObject ruleExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1248:28: ( ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) )
            // InternalEgyDsl.g:1249:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            {
            // InternalEgyDsl.g:1249:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            // InternalEgyDsl.g:1249:2: () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')'
            {
            // InternalEgyDsl.g:1249:2: ()
            // InternalEgyDsl.g:1250:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // InternalEgyDsl.g:1259:1: ( (lv_wChar_2_0= ruleNoExpanded ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EGYSTRING||LA21_0==25||(LA21_0>=39 && LA21_0<=46)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEgyDsl.g:1260:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // InternalEgyDsl.g:1260:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // InternalEgyDsl.g:1261:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_wChar_2_0=ruleNoExpanded();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpandedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoExpanded");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpanded"


    // $ANTLR start "entryRuleAncientExpanded"
    // InternalEgyDsl.g:1289:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // InternalEgyDsl.g:1290:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // InternalEgyDsl.g:1291:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAncientExpanded"


    // $ANTLR start "ruleAncientExpanded"
    // InternalEgyDsl.g:1298:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1301:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) )
            // InternalEgyDsl.g:1302:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            {
            // InternalEgyDsl.g:1302:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            // InternalEgyDsl.g:1302:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))'
            {
            // InternalEgyDsl.g:1302:2: ()
            // InternalEgyDsl.g:1303:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // InternalEgyDsl.g:1312:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_EGYSTRING||LA22_0==19||LA22_0==23||LA22_0==25||LA22_0==27||LA22_0==29||LA22_0==37||(LA22_0>=39 && LA22_0<=46)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEgyDsl.g:1313:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    {
            	    // InternalEgyDsl.g:1313:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    // InternalEgyDsl.g:1314:3: lv_wChar_2_0= ruleNoAncientExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_wChar_2_0=ruleNoAncientExpanded();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAncientExpandedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoAncientExpanded");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAncientExpanded"


    // $ANTLR start "entryRuleNoExpanded"
    // InternalEgyDsl.g:1342:1: entryRuleNoExpanded returns [EObject current=null] : iv_ruleNoExpanded= ruleNoExpanded EOF ;
    public final EObject entryRuleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpanded = null;


        try {
            // InternalEgyDsl.g:1343:2: (iv_ruleNoExpanded= ruleNoExpanded EOF )
            // InternalEgyDsl.g:1344:2: iv_ruleNoExpanded= ruleNoExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoExpanded"


    // $ANTLR start "ruleNoExpanded"
    // InternalEgyDsl.g:1351:1: ruleNoExpanded returns [EObject current=null] : (this_DisputableReading_0= ruleDisputableReading | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) ;
    public final EObject ruleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_DisputableReading_0 = null;

        EObject this_Chars_1 = null;

        EObject this_Interfix_2 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1354:28: ( (this_DisputableReading_0= ruleDisputableReading | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) )
            // InternalEgyDsl.g:1355:1: (this_DisputableReading_0= ruleDisputableReading | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            {
            // InternalEgyDsl.g:1355:1: (this_DisputableReading_0= ruleDisputableReading | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt23=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt23=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalEgyDsl.g:1356:5: this_DisputableReading_0= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_0=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1366:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1376:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoExpanded"


    // $ANTLR start "entryRuleEmendation"
    // InternalEgyDsl.g:1392:1: entryRuleEmendation returns [EObject current=null] : iv_ruleEmendation= ruleEmendation EOF ;
    public final EObject entryRuleEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendation = null;


        try {
            // InternalEgyDsl.g:1393:2: (iv_ruleEmendation= ruleEmendation EOF )
            // InternalEgyDsl.g:1394:2: iv_ruleEmendation= ruleEmendation EOF
            {
             newCompositeNode(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmendation"


    // $ANTLR start "ruleEmendation"
    // InternalEgyDsl.g:1401:1: ruleEmendation returns [EObject current=null] : ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' ) ;
    public final EObject ruleEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1404:28: ( ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' ) )
            // InternalEgyDsl.g:1405:1: ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' )
            {
            // InternalEgyDsl.g:1405:1: ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' )
            // InternalEgyDsl.g:1405:2: () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A'
            {
            // InternalEgyDsl.g:1405:2: ()
            // InternalEgyDsl.g:1406:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationAccess().getEmendationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1());
                
            // InternalEgyDsl.g:1415:1: ( (lv_wChar_2_0= ruleNoEmendation ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EGYSTRING||LA24_0==19||LA24_0==25||(LA24_0>=39 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEgyDsl.g:1416:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // InternalEgyDsl.g:1416:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // InternalEgyDsl.g:1417:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_22);
            	    lv_wChar_2_0=ruleNoEmendation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEmendationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoEmendation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getEmendationAccess().getRightPointingAngleBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmendation"


    // $ANTLR start "entryRuleNoEmendation"
    // InternalEgyDsl.g:1445:1: entryRuleNoEmendation returns [EObject current=null] : iv_ruleNoEmendation= ruleNoEmendation EOF ;
    public final EObject entryRuleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmendation = null;


        try {
            // InternalEgyDsl.g:1446:2: (iv_ruleNoEmendation= ruleNoEmendation EOF )
            // InternalEgyDsl.g:1447:2: iv_ruleNoEmendation= ruleNoEmendation EOF
            {
             newCompositeNode(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoEmendation"


    // $ANTLR start "ruleNoEmendation"
    // InternalEgyDsl.g:1454:1: ruleNoEmendation returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars | this_Interfix_3= ruleInterfix ) ;
    public final EObject ruleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Chars_2 = null;

        EObject this_Interfix_3 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1457:28: ( (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars | this_Interfix_3= ruleInterfix ) )
            // InternalEgyDsl.g:1458:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars | this_Interfix_3= ruleInterfix )
            {
            // InternalEgyDsl.g:1458:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars | this_Interfix_3= ruleInterfix )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt25=1;
                }
                break;
            case 25:
                {
                alt25=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt25=3;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalEgyDsl.g:1459:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1469:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1479:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_2=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:1489:5: this_Interfix_3= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_3=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoEmendation"


    // $ANTLR start "entryRuleDisputableReading"
    // InternalEgyDsl.g:1505:1: entryRuleDisputableReading returns [EObject current=null] : iv_ruleDisputableReading= ruleDisputableReading EOF ;
    public final EObject entryRuleDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableReading = null;


        try {
            // InternalEgyDsl.g:1506:2: (iv_ruleDisputableReading= ruleDisputableReading EOF )
            // InternalEgyDsl.g:1507:2: iv_ruleDisputableReading= ruleDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisputableReading"


    // $ANTLR start "ruleDisputableReading"
    // InternalEgyDsl.g:1514:1: ruleDisputableReading returns [EObject current=null] : ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) ;
    public final EObject ruleDisputableReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1517:28: ( ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) )
            // InternalEgyDsl.g:1518:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            {
            // InternalEgyDsl.g:1518:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            // InternalEgyDsl.g:1518:2: () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?'
            {
            // InternalEgyDsl.g:1518:2: ()
            // InternalEgyDsl.g:1519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1());
                
            // InternalEgyDsl.g:1528:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_EGYSTRING||LA26_0==19||LA26_0==21||LA26_0==23||LA26_0==27||LA26_0==29||LA26_0==31||LA26_0==33||LA26_0==35||LA26_0==37||(LA26_0>=39 && LA26_0<=46)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEgyDsl.g:1529:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // InternalEgyDsl.g:1529:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // InternalEgyDsl.g:1530:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_wChar_2_0=ruleNoDisputableReading();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisputableReadingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoDisputableReading");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisputableReading"


    // $ANTLR start "entryRuleNoDisputableReading"
    // InternalEgyDsl.g:1558:1: entryRuleNoDisputableReading returns [EObject current=null] : iv_ruleNoDisputableReading= ruleNoDisputableReading EOF ;
    public final EObject entryRuleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDisputableReading = null;


        try {
            // InternalEgyDsl.g:1559:2: (iv_ruleNoDisputableReading= ruleNoDisputableReading EOF )
            // InternalEgyDsl.g:1560:2: iv_ruleNoDisputableReading= ruleNoDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoDisputableReading"


    // $ANTLR start "ruleNoDisputableReading"
    // InternalEgyDsl.g:1567:1: ruleNoDisputableReading returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix ) ;
    public final EObject ruleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_Emendation_1 = null;

        EObject this_Deletion_2 = null;

        EObject this_Rasur_3 = null;

        EObject this_AncientExpanded_4 = null;

        EObject this_RestorationOverRasur_5 = null;

        EObject this_ExpandedColumn_6 = null;

        EObject this_Lacuna_7 = null;

        EObject this_PartialDestruction_8 = null;

        EObject this_Chars_9 = null;

        EObject this_Interfix_10 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1570:28: ( (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix ) )
            // InternalEgyDsl.g:1571:1: (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix )
            {
            // InternalEgyDsl.g:1571:1: (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix )
            int alt27=11;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt27=1;
                }
                break;
            case 23:
                {
                alt27=2;
                }
                break;
            case 29:
                {
                alt27=3;
                }
                break;
            case 33:
                {
                alt27=4;
                }
                break;
            case 21:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            case 31:
                {
                alt27=7;
                }
                break;
            case 27:
                {
                alt27=8;
                }
                break;
            case 37:
                {
                alt27=9;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt27=10;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt27=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalEgyDsl.g:1572:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1582:5: this_Emendation_1= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_1=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1592:5: this_Deletion_2= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_2=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:1602:5: this_Rasur_3= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Rasur_3=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:1612:5: this_AncientExpanded_4= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AncientExpanded_4=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:1622:5: this_RestorationOverRasur_5= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RestorationOverRasur_5=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:1632:5: this_ExpandedColumn_6= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ExpandedColumn_6=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:1642:5: this_Lacuna_7= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_7=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:1652:5: this_PartialDestruction_8= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_8=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:1662:5: this_Chars_9= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_9=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:1672:5: this_Interfix_10= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_10=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoDisputableReading"


    // $ANTLR start "entryRuleLacuna"
    // InternalEgyDsl.g:1688:1: entryRuleLacuna returns [EObject current=null] : iv_ruleLacuna= ruleLacuna EOF ;
    public final EObject entryRuleLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLacuna = null;


        try {
            // InternalEgyDsl.g:1689:2: (iv_ruleLacuna= ruleLacuna EOF )
            // InternalEgyDsl.g:1690:2: iv_ruleLacuna= ruleLacuna EOF
            {
             newCompositeNode(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLacuna"


    // $ANTLR start "ruleLacuna"
    // InternalEgyDsl.g:1697:1: ruleLacuna returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) ;
    public final EObject ruleLacuna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1700:28: ( ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) )
            // InternalEgyDsl.g:1701:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            {
            // InternalEgyDsl.g:1701:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            // InternalEgyDsl.g:1701:2: () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']'
            {
            // InternalEgyDsl.g:1701:2: ()
            // InternalEgyDsl.g:1702:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLacunaAccess().getLacunaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // InternalEgyDsl.g:1711:1: ( (lv_wChar_2_0= ruleNoLacuna ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EGYSTRING||LA28_0==13||LA28_0==15||LA28_0==17||LA28_0==19||LA28_0==23||LA28_0==25||LA28_0==29||(LA28_0>=39 && LA28_0<=46)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEgyDsl.g:1712:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // InternalEgyDsl.g:1712:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // InternalEgyDsl.g:1713:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_24);
            	    lv_wChar_2_0=ruleNoLacuna();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLacunaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoLacuna");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLacuna"


    // $ANTLR start "entryRuleNoLacuna"
    // InternalEgyDsl.g:1741:1: entryRuleNoLacuna returns [EObject current=null] : iv_ruleNoLacuna= ruleNoLacuna EOF ;
    public final EObject entryRuleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoLacuna = null;


        try {
            // InternalEgyDsl.g:1742:2: (iv_ruleNoLacuna= ruleNoLacuna EOF )
            // InternalEgyDsl.g:1743:2: iv_ruleNoLacuna= ruleNoLacuna EOF
            {
             newCompositeNode(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoLacuna"


    // $ANTLR start "ruleNoLacuna"
    // InternalEgyDsl.g:1750:1: ruleNoLacuna returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Oval_3= ruleOval | this_Serech_4= ruleSerech | this_Deletion_5= ruleDeletion | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix ) ;
    public final EObject ruleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Cartouche_2 = null;

        EObject this_Oval_3 = null;

        EObject this_Serech_4 = null;

        EObject this_Deletion_5 = null;

        EObject this_Emendation_6 = null;

        EObject this_Chars_7 = null;

        EObject this_Interfix_8 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1753:28: ( (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Oval_3= ruleOval | this_Serech_4= ruleSerech | this_Deletion_5= ruleDeletion | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix ) )
            // InternalEgyDsl.g:1754:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Oval_3= ruleOval | this_Serech_4= ruleSerech | this_Deletion_5= ruleDeletion | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix )
            {
            // InternalEgyDsl.g:1754:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Oval_3= ruleOval | this_Serech_4= ruleSerech | this_Deletion_5= ruleDeletion | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt29=1;
                }
                break;
            case 25:
                {
                alt29=2;
                }
                break;
            case 17:
                {
                alt29=3;
                }
                break;
            case 13:
                {
                alt29=4;
                }
                break;
            case 15:
                {
                alt29=5;
                }
                break;
            case 29:
                {
                alt29=6;
                }
                break;
            case 23:
                {
                alt29=7;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt29=8;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalEgyDsl.g:1755:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1765:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1775:5: this_Cartouche_2= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Cartouche_2=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:1785:5: this_Oval_3= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Oval_3=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:1795:5: this_Serech_4= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Serech_4=ruleSerech();

                    state._fsp--;

                     
                            current = this_Serech_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:1805:5: this_Deletion_5= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getDeletionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_5=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:1815:5: this_Emendation_6= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getEmendationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_6=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:1825:5: this_Chars_7= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_7=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:1835:5: this_Interfix_8= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_8=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoLacuna"


    // $ANTLR start "entryRuleDeletion"
    // InternalEgyDsl.g:1851:1: entryRuleDeletion returns [EObject current=null] : iv_ruleDeletion= ruleDeletion EOF ;
    public final EObject entryRuleDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletion = null;


        try {
            // InternalEgyDsl.g:1852:2: (iv_ruleDeletion= ruleDeletion EOF )
            // InternalEgyDsl.g:1853:2: iv_ruleDeletion= ruleDeletion EOF
            {
             newCompositeNode(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeletion"


    // $ANTLR start "ruleDeletion"
    // InternalEgyDsl.g:1860:1: ruleDeletion returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1863:28: ( ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) )
            // InternalEgyDsl.g:1864:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            {
            // InternalEgyDsl.g:1864:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            // InternalEgyDsl.g:1864:2: () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}'
            {
            // InternalEgyDsl.g:1864:2: ()
            // InternalEgyDsl.g:1865:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletionAccess().getDeletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalEgyDsl.g:1874:1: ( (lv_wChar_2_0= ruleNoDeletion ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EGYSTRING||LA30_0==19||LA30_0==21||LA30_0==25||LA30_0==27||LA30_0==35||LA30_0==37||(LA30_0>=39 && LA30_0<=46)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEgyDsl.g:1875:1: (lv_wChar_2_0= ruleNoDeletion )
            	    {
            	    // InternalEgyDsl.g:1875:1: (lv_wChar_2_0= ruleNoDeletion )
            	    // InternalEgyDsl.g:1876:3: lv_wChar_2_0= ruleNoDeletion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_25);
            	    lv_wChar_2_0=ruleNoDeletion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeletionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoDeletion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeletion"


    // $ANTLR start "entryRuleNoDeletion"
    // InternalEgyDsl.g:1904:1: entryRuleNoDeletion returns [EObject current=null] : iv_ruleNoDeletion= ruleNoDeletion EOF ;
    public final EObject entryRuleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDeletion = null;


        try {
            // InternalEgyDsl.g:1905:2: (iv_ruleNoDeletion= ruleNoDeletion EOF )
            // InternalEgyDsl.g:1906:2: iv_ruleNoDeletion= ruleNoDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoDeletion"


    // $ANTLR start "ruleNoDeletion"
    // InternalEgyDsl.g:1913:1: ruleNoDeletion returns [EObject current=null] : (this_PartialDestruction_0= rulePartialDestruction | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Lacuna_3= ruleLacuna | this_RestorationOverRasur_4= ruleRestorationOverRasur | this_AncientExpanded_5= ruleAncientExpanded | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) ;
    public final EObject ruleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject this_PartialDestruction_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_DisputableReading_2 = null;

        EObject this_Lacuna_3 = null;

        EObject this_RestorationOverRasur_4 = null;

        EObject this_AncientExpanded_5 = null;

        EObject this_Chars_6 = null;

        EObject this_Interfix_7 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:1916:28: ( (this_PartialDestruction_0= rulePartialDestruction | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Lacuna_3= ruleLacuna | this_RestorationOverRasur_4= ruleRestorationOverRasur | this_AncientExpanded_5= ruleAncientExpanded | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) )
            // InternalEgyDsl.g:1917:1: (this_PartialDestruction_0= rulePartialDestruction | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Lacuna_3= ruleLacuna | this_RestorationOverRasur_4= ruleRestorationOverRasur | this_AncientExpanded_5= ruleAncientExpanded | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            {
            // InternalEgyDsl.g:1917:1: (this_PartialDestruction_0= rulePartialDestruction | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Lacuna_3= ruleLacuna | this_RestorationOverRasur_4= ruleRestorationOverRasur | this_AncientExpanded_5= ruleAncientExpanded | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            int alt31=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt31=1;
                }
                break;
            case 19:
                {
                alt31=2;
                }
                break;
            case 25:
                {
                alt31=3;
                }
                break;
            case 27:
                {
                alt31=4;
                }
                break;
            case 35:
                {
                alt31=5;
                }
                break;
            case 21:
                {
                alt31=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt31=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalEgyDsl.g:1918:5: this_PartialDestruction_0= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_0=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1928:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1938:5: this_DisputableReading_2= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_2=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:1948:5: this_Lacuna_3= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_3=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:1958:5: this_RestorationOverRasur_4= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RestorationOverRasur_4=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:1968:5: this_AncientExpanded_5= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getAncientExpandedParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AncientExpanded_5=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:1978:5: this_Chars_6= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_6=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:1988:5: this_Interfix_7= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_7=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoDeletion"


    // $ANTLR start "entryRuleExpandedColumn"
    // InternalEgyDsl.g:2004:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // InternalEgyDsl.g:2005:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // InternalEgyDsl.g:2006:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpandedColumn"


    // $ANTLR start "ruleExpandedColumn"
    // InternalEgyDsl.g:2013:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2016:28: ( ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) )
            // InternalEgyDsl.g:2017:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            {
            // InternalEgyDsl.g:2017:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            // InternalEgyDsl.g:2017:2: () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A'
            {
            // InternalEgyDsl.g:2017:2: ()
            // InternalEgyDsl.g:2018:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1());
                
            // InternalEgyDsl.g:2027:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EGYSTRING||LA32_0==19||LA32_0==23||LA32_0==25||LA32_0==27||LA32_0==29||LA32_0==37||(LA32_0>=39 && LA32_0<=46)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEgyDsl.g:2028:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    {
            	    // InternalEgyDsl.g:2028:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    // InternalEgyDsl.g:2029:3: lv_wChar_2_0= ruleNoExpandedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_26);
            	    lv_wChar_2_0=ruleNoExpandedColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpandedColumnRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoExpandedColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getExpandedColumnAccess().getRightPointingAngleBracketRightPointingAngleBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpandedColumn"


    // $ANTLR start "entryRuleNoExpandedColumn"
    // InternalEgyDsl.g:2057:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // InternalEgyDsl.g:2058:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // InternalEgyDsl.g:2059:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoExpandedColumn"


    // $ANTLR start "ruleNoExpandedColumn"
    // InternalEgyDsl.g:2066:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Emendation_2 = null;

        EObject this_Lacuna_3 = null;

        EObject this_PartialDestruction_4 = null;

        EObject this_Deletion_5 = null;

        EObject this_Chars_6 = null;

        EObject this_Interfix_7 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2069:28: ( (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) )
            // InternalEgyDsl.g:2070:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            {
            // InternalEgyDsl.g:2070:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt33=1;
                }
                break;
            case 25:
                {
                alt33=2;
                }
                break;
            case 23:
                {
                alt33=3;
                }
                break;
            case 27:
                {
                alt33=4;
                }
                break;
            case 37:
                {
                alt33=5;
                }
                break;
            case 29:
                {
                alt33=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt33=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalEgyDsl.g:2071:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2081:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2091:5: this_Emendation_2= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getEmendationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_2=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2101:5: this_Lacuna_3= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getLacunaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_3=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2111:5: this_PartialDestruction_4= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getPartialDestructionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_4=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2121:5: this_Deletion_5= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getDeletionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_5=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2131:5: this_Chars_6= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_6=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2141:5: this_Interfix_7= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_7=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoExpandedColumn"


    // $ANTLR start "entryRuleRasur"
    // InternalEgyDsl.g:2157:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // InternalEgyDsl.g:2158:2: (iv_ruleRasur= ruleRasur EOF )
            // InternalEgyDsl.g:2159:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRasur"


    // $ANTLR start "ruleRasur"
    // InternalEgyDsl.g:2166:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2169:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) )
            // InternalEgyDsl.g:2170:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            {
            // InternalEgyDsl.g:2170:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            // InternalEgyDsl.g:2170:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}'
            {
            // InternalEgyDsl.g:2170:2: ()
            // InternalEgyDsl.g:2171:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // InternalEgyDsl.g:2180:1: ( (lv_wChar_2_0= ruleNoRasur ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EGYSTRING||LA34_0==19||LA34_0==23||LA34_0==25||LA34_0==27||LA34_0==29||LA34_0==37||(LA34_0>=39 && LA34_0<=46)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEgyDsl.g:2181:1: (lv_wChar_2_0= ruleNoRasur )
            	    {
            	    // InternalEgyDsl.g:2181:1: (lv_wChar_2_0= ruleNoRasur )
            	    // InternalEgyDsl.g:2182:3: lv_wChar_2_0= ruleNoRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_27);
            	    lv_wChar_2_0=ruleNoRasur();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRasurRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoRasur");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRasur"


    // $ANTLR start "entryRuleNoRasur"
    // InternalEgyDsl.g:2210:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // InternalEgyDsl.g:2211:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // InternalEgyDsl.g:2212:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoRasur"


    // $ANTLR start "ruleNoRasur"
    // InternalEgyDsl.g:2219:1: ruleNoRasur returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Emendation_2 = null;

        EObject this_Lacuna_3 = null;

        EObject this_PartialDestruction_4 = null;

        EObject this_Deletion_5 = null;

        EObject this_Chars_6 = null;

        EObject this_Interfix_7 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2222:28: ( (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) )
            // InternalEgyDsl.g:2223:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            {
            // InternalEgyDsl.g:2223:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            int alt35=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt35=1;
                }
                break;
            case 25:
                {
                alt35=2;
                }
                break;
            case 23:
                {
                alt35=3;
                }
                break;
            case 27:
                {
                alt35=4;
                }
                break;
            case 37:
                {
                alt35=5;
                }
                break;
            case 29:
                {
                alt35=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt35=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt35=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalEgyDsl.g:2224:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2234:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2244:5: this_Emendation_2= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getEmendationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_2=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2254:5: this_Lacuna_3= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getLacunaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_3=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2264:5: this_PartialDestruction_4= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getPartialDestructionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_4=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2274:5: this_Deletion_5= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getDeletionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_5=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2284:5: this_Chars_6= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_6=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2294:5: this_Interfix_7= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_7=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoRasur"


    // $ANTLR start "entryRuleNoAncientExpanded"
    // InternalEgyDsl.g:2310:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // InternalEgyDsl.g:2311:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // InternalEgyDsl.g:2312:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoAncientExpanded"


    // $ANTLR start "ruleNoAncientExpanded"
    // InternalEgyDsl.g:2319:1: ruleNoAncientExpanded returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Emendation_2 = null;

        EObject this_Lacuna_3 = null;

        EObject this_PartialDestruction_4 = null;

        EObject this_Deletion_5 = null;

        EObject this_Chars_6 = null;

        EObject this_Interfix_7 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2322:28: ( (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix ) )
            // InternalEgyDsl.g:2323:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            {
            // InternalEgyDsl.g:2323:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Emendation_2= ruleEmendation | this_Lacuna_3= ruleLacuna | this_PartialDestruction_4= rulePartialDestruction | this_Deletion_5= ruleDeletion | this_Chars_6= ruleChars | this_Interfix_7= ruleInterfix )
            int alt36=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt36=1;
                }
                break;
            case 25:
                {
                alt36=2;
                }
                break;
            case 23:
                {
                alt36=3;
                }
                break;
            case 27:
                {
                alt36=4;
                }
                break;
            case 37:
                {
                alt36=5;
                }
                break;
            case 29:
                {
                alt36=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt36=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt36=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalEgyDsl.g:2324:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2334:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2344:5: this_Emendation_2= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getEmendationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_2=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2354:5: this_Lacuna_3= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getLacunaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_3=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2364:5: this_PartialDestruction_4= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getPartialDestructionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_4=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2374:5: this_Deletion_5= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getDeletionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_5=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2384:5: this_Chars_6= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_6=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2394:5: this_Interfix_7= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_7=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoAncientExpanded"


    // $ANTLR start "entryRuleRestorationOverRasur"
    // InternalEgyDsl.g:2410:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // InternalEgyDsl.g:2411:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // InternalEgyDsl.g:2412:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestorationOverRasur"


    // $ANTLR start "ruleRestorationOverRasur"
    // InternalEgyDsl.g:2419:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2422:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) )
            // InternalEgyDsl.g:2423:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            {
            // InternalEgyDsl.g:2423:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            // InternalEgyDsl.g:2423:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]'
            {
            // InternalEgyDsl.g:2423:2: ()
            // InternalEgyDsl.g:2424:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // InternalEgyDsl.g:2433:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||LA37_0==17||LA37_0==19||LA37_0==23||LA37_0==25||LA37_0==27||LA37_0==29||LA37_0==37||(LA37_0>=39 && LA37_0<=46)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEgyDsl.g:2434:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    {
            	    // InternalEgyDsl.g:2434:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    // InternalEgyDsl.g:2435:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_28);
            	    lv_wChar_2_0=ruleNoRestorationOverRasur();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestorationOverRasurRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoRestorationOverRasur");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestorationOverRasur"


    // $ANTLR start "entryRuleNoRestorationOverRasur"
    // InternalEgyDsl.g:2463:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // InternalEgyDsl.g:2464:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // InternalEgyDsl.g:2465:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoRestorationOverRasur"


    // $ANTLR start "ruleNoRestorationOverRasur"
    // InternalEgyDsl.g:2472:1: ruleNoRestorationOverRasur returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Emendation_3= ruleEmendation | this_Lacuna_4= ruleLacuna | this_PartialDestruction_5= rulePartialDestruction | this_Deletion_6= ruleDeletion | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix ) ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Cartouche_2 = null;

        EObject this_Emendation_3 = null;

        EObject this_Lacuna_4 = null;

        EObject this_PartialDestruction_5 = null;

        EObject this_Deletion_6 = null;

        EObject this_Chars_7 = null;

        EObject this_Interfix_8 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2475:28: ( (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Emendation_3= ruleEmendation | this_Lacuna_4= ruleLacuna | this_PartialDestruction_5= rulePartialDestruction | this_Deletion_6= ruleDeletion | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix ) )
            // InternalEgyDsl.g:2476:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Emendation_3= ruleEmendation | this_Lacuna_4= ruleLacuna | this_PartialDestruction_5= rulePartialDestruction | this_Deletion_6= ruleDeletion | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix )
            {
            // InternalEgyDsl.g:2476:1: (this_Expanded_0= ruleExpanded | this_DisputableReading_1= ruleDisputableReading | this_Cartouche_2= ruleCartouche | this_Emendation_3= ruleEmendation | this_Lacuna_4= ruleLacuna | this_PartialDestruction_5= rulePartialDestruction | this_Deletion_6= ruleDeletion | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix )
            int alt38=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt38=1;
                }
                break;
            case 25:
                {
                alt38=2;
                }
                break;
            case 17:
                {
                alt38=3;
                }
                break;
            case 23:
                {
                alt38=4;
                }
                break;
            case 27:
                {
                alt38=5;
                }
                break;
            case 37:
                {
                alt38=6;
                }
                break;
            case 29:
                {
                alt38=7;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt38=8;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt38=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalEgyDsl.g:2477:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2487:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2497:5: this_Cartouche_2= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Cartouche_2=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2507:5: this_Emendation_3= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getEmendationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_3=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2517:5: this_Lacuna_4= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getLacunaParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Lacuna_4=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2527:5: this_PartialDestruction_5= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getPartialDestructionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestruction_5=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2537:5: this_Deletion_6= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getDeletionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_6=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2547:5: this_Chars_7= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_7=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2557:5: this_Interfix_8= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_8=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoRestorationOverRasur"


    // $ANTLR start "entryRulePartialDestruction"
    // InternalEgyDsl.g:2573:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // InternalEgyDsl.g:2574:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // InternalEgyDsl.g:2575:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialDestruction"


    // $ANTLR start "rulePartialDestruction"
    // InternalEgyDsl.g:2582:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2585:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) )
            // InternalEgyDsl.g:2586:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            {
            // InternalEgyDsl.g:2586:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            // InternalEgyDsl.g:2586:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23'
            {
            // InternalEgyDsl.g:2586:2: ()
            // InternalEgyDsl.g:2587:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // InternalEgyDsl.g:2596:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EGYSTRING||LA39_0==13||LA39_0==15||LA39_0==17||LA39_0==19||LA39_0==23||LA39_0==25||LA39_0==29||(LA39_0>=39 && LA39_0<=46)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEgyDsl.g:2597:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    {
            	    // InternalEgyDsl.g:2597:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    // InternalEgyDsl.g:2598:3: lv_wChar_2_0= ruleNoPartialDestruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_29);
            	    lv_wChar_2_0=ruleNoPartialDestruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPartialDestructionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"org.bbaw.bts.corpus.text.egy.EgyDsl.NoPartialDestruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialDestruction"


    // $ANTLR start "entryRuleNoPartialDestruction"
    // InternalEgyDsl.g:2626:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // InternalEgyDsl.g:2627:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // InternalEgyDsl.g:2628:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoPartialDestruction"


    // $ANTLR start "ruleNoPartialDestruction"
    // InternalEgyDsl.g:2635:1: ruleNoPartialDestruction returns [EObject current=null] : (this_Deletion_0= ruleDeletion | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Cartouche_3= ruleCartouche | this_Oval_4= ruleOval | this_Serech_5= ruleSerech | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix ) ;
    public final EObject ruleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject this_Deletion_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_DisputableReading_2 = null;

        EObject this_Cartouche_3 = null;

        EObject this_Oval_4 = null;

        EObject this_Serech_5 = null;

        EObject this_Emendation_6 = null;

        EObject this_Chars_7 = null;

        EObject this_Interfix_8 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2638:28: ( (this_Deletion_0= ruleDeletion | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Cartouche_3= ruleCartouche | this_Oval_4= ruleOval | this_Serech_5= ruleSerech | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix ) )
            // InternalEgyDsl.g:2639:1: (this_Deletion_0= ruleDeletion | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Cartouche_3= ruleCartouche | this_Oval_4= ruleOval | this_Serech_5= ruleSerech | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix )
            {
            // InternalEgyDsl.g:2639:1: (this_Deletion_0= ruleDeletion | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Cartouche_3= ruleCartouche | this_Oval_4= ruleOval | this_Serech_5= ruleSerech | this_Emendation_6= ruleEmendation | this_Chars_7= ruleChars | this_Interfix_8= ruleInterfix )
            int alt40=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt40=1;
                }
                break;
            case 19:
                {
                alt40=2;
                }
                break;
            case 25:
                {
                alt40=3;
                }
                break;
            case 17:
                {
                alt40=4;
                }
                break;
            case 13:
                {
                alt40=5;
                }
                break;
            case 15:
                {
                alt40=6;
                }
                break;
            case 23:
                {
                alt40=7;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt40=8;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt40=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalEgyDsl.g:2640:5: this_Deletion_0= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Deletion_0=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2650:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2660:5: this_DisputableReading_2= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableReading_2=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2670:5: this_Cartouche_3= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Cartouche_3=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2680:5: this_Oval_4= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Oval_4=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2690:5: this_Serech_5= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Serech_5=ruleSerech();

                    state._fsp--;

                     
                            current = this_Serech_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2700:5: this_Emendation_6= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getEmendationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Emendation_6=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2710:5: this_Chars_7= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Chars_7=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2720:5: this_Interfix_8= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Interfix_8=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoPartialDestruction"


    // $ANTLR start "entryRuleInterfix"
    // InternalEgyDsl.g:2736:1: entryRuleInterfix returns [EObject current=null] : iv_ruleInterfix= ruleInterfix EOF ;
    public final EObject entryRuleInterfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfix = null;


        try {
            // InternalEgyDsl.g:2737:2: (iv_ruleInterfix= ruleInterfix EOF )
            // InternalEgyDsl.g:2738:2: iv_ruleInterfix= ruleInterfix EOF
            {
             newCompositeNode(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfix=ruleInterfix();

            state._fsp--;

             current =iv_ruleInterfix; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfix"


    // $ANTLR start "ruleInterfix"
    // InternalEgyDsl.g:2745:1: ruleInterfix returns [EObject current=null] : (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) ;
    public final EObject ruleInterfix() throws RecognitionException {
        EObject current = null;

        EObject this_InterfixFlexion_0 = null;

        EObject this_InterfixLexical_1 = null;

        EObject this_InterfixSuffixPronomLexical_2 = null;

        EObject this_InterfixPrefixNonLexical_3 = null;

        EObject this_InterfixPrefixLexical_4 = null;

        EObject this_InterfixConnectionSyllabicGroup_5 = null;

        EObject this_InterfixCompoundWords_6 = null;

        EObject this_InterfixPhoneticalComplement_7 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2748:28: ( (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) )
            // InternalEgyDsl.g:2749:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            {
            // InternalEgyDsl.g:2749:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            int alt41=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt41=1;
                }
                break;
            case 39:
                {
                alt41=2;
                }
                break;
            case 41:
                {
                alt41=3;
                }
                break;
            case 42:
                {
                alt41=4;
                }
                break;
            case 43:
                {
                alt41=5;
                }
                break;
            case 44:
                {
                alt41=6;
                }
                break;
            case 45:
                {
                alt41=7;
                }
                break;
            case 46:
                {
                alt41=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalEgyDsl.g:2750:5: this_InterfixFlexion_0= ruleInterfixFlexion
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixFlexion_0=ruleInterfixFlexion();

                    state._fsp--;

                     
                            current = this_InterfixFlexion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2760:5: this_InterfixLexical_1= ruleInterfixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixLexical_1=ruleInterfixLexical();

                    state._fsp--;

                     
                            current = this_InterfixLexical_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2770:5: this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixSuffixPronomLexical_2=ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     
                            current = this_InterfixSuffixPronomLexical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2780:5: this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixPrefixNonLexical_3=ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixNonLexical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2790:5: this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixPrefixLexical_4=ruleInterfixPrefixLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixLexical_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2800:5: this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixConnectionSyllabicGroup_5=ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     
                            current = this_InterfixConnectionSyllabicGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2810:5: this_InterfixCompoundWords_6= ruleInterfixCompoundWords
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixCompoundWords_6=ruleInterfixCompoundWords();

                    state._fsp--;

                     
                            current = this_InterfixCompoundWords_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2820:5: this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_InterfixPhoneticalComplement_7=ruleInterfixPhoneticalComplement();

                    state._fsp--;

                     
                            current = this_InterfixPhoneticalComplement_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfix"


    // $ANTLR start "entryRuleInterfixLexical"
    // InternalEgyDsl.g:2836:1: entryRuleInterfixLexical returns [EObject current=null] : iv_ruleInterfixLexical= ruleInterfixLexical EOF ;
    public final EObject entryRuleInterfixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixLexical = null;


        try {
            // InternalEgyDsl.g:2837:2: (iv_ruleInterfixLexical= ruleInterfixLexical EOF )
            // InternalEgyDsl.g:2838:2: iv_ruleInterfixLexical= ruleInterfixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixLexical=ruleInterfixLexical();

            state._fsp--;

             current =iv_ruleInterfixLexical; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixLexical"


    // $ANTLR start "ruleInterfixLexical"
    // InternalEgyDsl.g:2845:1: ruleInterfixLexical returns [EObject current=null] : ( () otherlv_1= ',' ) ;
    public final EObject ruleInterfixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2848:28: ( ( () otherlv_1= ',' ) )
            // InternalEgyDsl.g:2849:1: ( () otherlv_1= ',' )
            {
            // InternalEgyDsl.g:2849:1: ( () otherlv_1= ',' )
            // InternalEgyDsl.g:2849:2: () otherlv_1= ','
            {
            // InternalEgyDsl.g:2849:2: ()
            // InternalEgyDsl.g:2850:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixLexicalAccess().getCommaKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixLexical"


    // $ANTLR start "entryRuleInterfixFlexion"
    // InternalEgyDsl.g:2867:1: entryRuleInterfixFlexion returns [EObject current=null] : iv_ruleInterfixFlexion= ruleInterfixFlexion EOF ;
    public final EObject entryRuleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixFlexion = null;


        try {
            // InternalEgyDsl.g:2868:2: (iv_ruleInterfixFlexion= ruleInterfixFlexion EOF )
            // InternalEgyDsl.g:2869:2: iv_ruleInterfixFlexion= ruleInterfixFlexion EOF
            {
             newCompositeNode(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixFlexion=ruleInterfixFlexion();

            state._fsp--;

             current =iv_ruleInterfixFlexion; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixFlexion"


    // $ANTLR start "ruleInterfixFlexion"
    // InternalEgyDsl.g:2876:1: ruleInterfixFlexion returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2879:28: ( ( () otherlv_1= '.' ) )
            // InternalEgyDsl.g:2880:1: ( () otherlv_1= '.' )
            {
            // InternalEgyDsl.g:2880:1: ( () otherlv_1= '.' )
            // InternalEgyDsl.g:2880:2: () otherlv_1= '.'
            {
            // InternalEgyDsl.g:2880:2: ()
            // InternalEgyDsl.g:2881:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixFlexionAccess().getFullStopKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixFlexion"


    // $ANTLR start "entryRuleInterfixSuffixPronomLexical"
    // InternalEgyDsl.g:2898:1: entryRuleInterfixSuffixPronomLexical returns [EObject current=null] : iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF ;
    public final EObject entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixSuffixPronomLexical = null;


        try {
            // InternalEgyDsl.g:2899:2: (iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF )
            // InternalEgyDsl.g:2900:2: iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixSuffixPronomLexical=ruleInterfixSuffixPronomLexical();

            state._fsp--;

             current =iv_ruleInterfixSuffixPronomLexical; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixSuffixPronomLexical"


    // $ANTLR start "ruleInterfixSuffixPronomLexical"
    // InternalEgyDsl.g:2907:1: ruleInterfixSuffixPronomLexical returns [EObject current=null] : ( () otherlv_1= '\\u2261' ) ;
    public final EObject ruleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2910:28: ( ( () otherlv_1= '\\u2261' ) )
            // InternalEgyDsl.g:2911:1: ( () otherlv_1= '\\u2261' )
            {
            // InternalEgyDsl.g:2911:1: ( () otherlv_1= '\\u2261' )
            // InternalEgyDsl.g:2911:2: () otherlv_1= '\\u2261'
            {
            // InternalEgyDsl.g:2911:2: ()
            // InternalEgyDsl.g:2912:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixSuffixPronomLexicalAccess().getIdenticalToKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixSuffixPronomLexical"


    // $ANTLR start "entryRuleInterfixPrefixNonLexical"
    // InternalEgyDsl.g:2929:1: entryRuleInterfixPrefixNonLexical returns [EObject current=null] : iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF ;
    public final EObject entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixNonLexical = null;


        try {
            // InternalEgyDsl.g:2930:2: (iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF )
            // InternalEgyDsl.g:2931:2: iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixPrefixNonLexical=ruleInterfixPrefixNonLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixNonLexical; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixPrefixNonLexical"


    // $ANTLR start "ruleInterfixPrefixNonLexical"
    // InternalEgyDsl.g:2938:1: ruleInterfixPrefixNonLexical returns [EObject current=null] : ( () otherlv_1= ':' ) ;
    public final EObject ruleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2941:28: ( ( () otherlv_1= ':' ) )
            // InternalEgyDsl.g:2942:1: ( () otherlv_1= ':' )
            {
            // InternalEgyDsl.g:2942:1: ( () otherlv_1= ':' )
            // InternalEgyDsl.g:2942:2: () otherlv_1= ':'
            {
            // InternalEgyDsl.g:2942:2: ()
            // InternalEgyDsl.g:2943:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixPrefixNonLexicalAccess().getColonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixPrefixNonLexical"


    // $ANTLR start "entryRuleInterfixPrefixLexical"
    // InternalEgyDsl.g:2960:1: entryRuleInterfixPrefixLexical returns [EObject current=null] : iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF ;
    public final EObject entryRuleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixLexical = null;


        try {
            // InternalEgyDsl.g:2961:2: (iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF )
            // InternalEgyDsl.g:2962:2: iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixPrefixLexical=ruleInterfixPrefixLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixLexical; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixPrefixLexical"


    // $ANTLR start "ruleInterfixPrefixLexical"
    // InternalEgyDsl.g:2969:1: ruleInterfixPrefixLexical returns [EObject current=null] : ( () otherlv_1= '\\u22EE' ) ;
    public final EObject ruleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:2972:28: ( ( () otherlv_1= '\\u22EE' ) )
            // InternalEgyDsl.g:2973:1: ( () otherlv_1= '\\u22EE' )
            {
            // InternalEgyDsl.g:2973:1: ( () otherlv_1= '\\u22EE' )
            // InternalEgyDsl.g:2973:2: () otherlv_1= '\\u22EE'
            {
            // InternalEgyDsl.g:2973:2: ()
            // InternalEgyDsl.g:2974:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixPrefixLexicalAccess().getVerticalEllipsisKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixPrefixLexical"


    // $ANTLR start "entryRuleInterfixConnectionSyllabicGroup"
    // InternalEgyDsl.g:2991:1: entryRuleInterfixConnectionSyllabicGroup returns [EObject current=null] : iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF ;
    public final EObject entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixConnectionSyllabicGroup = null;


        try {
            // InternalEgyDsl.g:2992:2: (iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF )
            // InternalEgyDsl.g:2993:2: iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixConnectionSyllabicGroup=ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             current =iv_ruleInterfixConnectionSyllabicGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixConnectionSyllabicGroup"


    // $ANTLR start "ruleInterfixConnectionSyllabicGroup"
    // InternalEgyDsl.g:3000:1: ruleInterfixConnectionSyllabicGroup returns [EObject current=null] : ( () otherlv_1= '~' ) ;
    public final EObject ruleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3003:28: ( ( () otherlv_1= '~' ) )
            // InternalEgyDsl.g:3004:1: ( () otherlv_1= '~' )
            {
            // InternalEgyDsl.g:3004:1: ( () otherlv_1= '~' )
            // InternalEgyDsl.g:3004:2: () otherlv_1= '~'
            {
            // InternalEgyDsl.g:3004:2: ()
            // InternalEgyDsl.g:3005:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixConnectionSyllabicGroupAccess().getTildeKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixConnectionSyllabicGroup"


    // $ANTLR start "entryRuleInterfixCompoundWords"
    // InternalEgyDsl.g:3022:1: entryRuleInterfixCompoundWords returns [EObject current=null] : iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF ;
    public final EObject entryRuleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixCompoundWords = null;


        try {
            // InternalEgyDsl.g:3023:2: (iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF )
            // InternalEgyDsl.g:3024:2: iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF
            {
             newCompositeNode(grammarAccess.getInterfixCompoundWordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixCompoundWords=ruleInterfixCompoundWords();

            state._fsp--;

             current =iv_ruleInterfixCompoundWords; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixCompoundWords"


    // $ANTLR start "ruleInterfixCompoundWords"
    // InternalEgyDsl.g:3031:1: ruleInterfixCompoundWords returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3034:28: ( ( () otherlv_1= '-' ) )
            // InternalEgyDsl.g:3035:1: ( () otherlv_1= '-' )
            {
            // InternalEgyDsl.g:3035:1: ( () otherlv_1= '-' )
            // InternalEgyDsl.g:3035:2: () otherlv_1= '-'
            {
            // InternalEgyDsl.g:3035:2: ()
            // InternalEgyDsl.g:3036:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixCompoundWordsAccess().getHyphenMinusKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixCompoundWords"


    // $ANTLR start "entryRuleInterfixPhoneticalComplement"
    // InternalEgyDsl.g:3053:1: entryRuleInterfixPhoneticalComplement returns [EObject current=null] : iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF ;
    public final EObject entryRuleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPhoneticalComplement = null;


        try {
            // InternalEgyDsl.g:3054:2: (iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF )
            // InternalEgyDsl.g:3055:2: iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF
            {
             newCompositeNode(grammarAccess.getInterfixPhoneticalComplementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfixPhoneticalComplement=ruleInterfixPhoneticalComplement();

            state._fsp--;

             current =iv_ruleInterfixPhoneticalComplement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixPhoneticalComplement"


    // $ANTLR start "ruleInterfixPhoneticalComplement"
    // InternalEgyDsl.g:3062:1: ruleInterfixPhoneticalComplement returns [EObject current=null] : ( () otherlv_1= ';' ) ;
    public final EObject ruleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3065:28: ( ( () otherlv_1= ';' ) )
            // InternalEgyDsl.g:3066:1: ( () otherlv_1= ';' )
            {
            // InternalEgyDsl.g:3066:1: ( () otherlv_1= ';' )
            // InternalEgyDsl.g:3066:2: () otherlv_1= ';'
            {
            // InternalEgyDsl.g:3066:2: ()
            // InternalEgyDsl.g:3067:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixPhoneticalComplementAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfixPhoneticalComplement"


    // $ANTLR start "entryRuleVersMarker"
    // InternalEgyDsl.g:3084:1: entryRuleVersMarker returns [EObject current=null] : iv_ruleVersMarker= ruleVersMarker EOF ;
    public final EObject entryRuleVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersMarker = null;


        try {
            // InternalEgyDsl.g:3085:2: (iv_ruleVersMarker= ruleVersMarker EOF )
            // InternalEgyDsl.g:3086:2: iv_ruleVersMarker= ruleVersMarker EOF
            {
             newCompositeNode(grammarAccess.getVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersMarker=ruleVersMarker();

            state._fsp--;

             current =iv_ruleVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersMarker"


    // $ANTLR start "ruleVersMarker"
    // InternalEgyDsl.g:3093:1: ruleVersMarker returns [EObject current=null] : (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker | this_EmendationVersMarker_10= ruleEmendationVersMarker | this_DestroyedVersFrontierMarker_11= ruleDestroyedVersFrontierMarker | this_PartialDestroyedVersMarker_12= rulePartialDestroyedVersMarker ) ;
    public final EObject ruleVersMarker() throws RecognitionException {
        EObject current = null;

        EObject this_VersbreakMarker_0 = null;

        EObject this_VersFrontierMarker_1 = null;

        EObject this_BrokenVersbreakMarker_2 = null;

        EObject this_MissingVersMarker_3 = null;

        EObject this_DestroyedVersMarker_4 = null;

        EObject this_DeletedVersMarker_5 = null;

        EObject this_DisputableVersMarker_6 = null;

        EObject this_RestorationOverRasurMarker_7 = null;

        EObject this_AncientExpandedMarker_8 = null;

        EObject this_RasurMarker_9 = null;

        EObject this_EmendationVersMarker_10 = null;

        EObject this_DestroyedVersFrontierMarker_11 = null;

        EObject this_PartialDestroyedVersMarker_12 = null;


         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3096:28: ( (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker | this_EmendationVersMarker_10= ruleEmendationVersMarker | this_DestroyedVersFrontierMarker_11= ruleDestroyedVersFrontierMarker | this_PartialDestroyedVersMarker_12= rulePartialDestroyedVersMarker ) )
            // InternalEgyDsl.g:3097:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker | this_EmendationVersMarker_10= ruleEmendationVersMarker | this_DestroyedVersFrontierMarker_11= ruleDestroyedVersFrontierMarker | this_PartialDestroyedVersMarker_12= rulePartialDestroyedVersMarker )
            {
            // InternalEgyDsl.g:3097:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker | this_EmendationVersMarker_10= ruleEmendationVersMarker | this_DestroyedVersFrontierMarker_11= ruleDestroyedVersFrontierMarker | this_PartialDestroyedVersMarker_12= rulePartialDestroyedVersMarker )
            int alt42=13;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt42=1;
                }
                break;
            case 57:
                {
                alt42=2;
                }
                break;
            case 59:
                {
                alt42=3;
                }
                break;
            case 53:
                {
                alt42=4;
                }
                break;
            case 50:
                {
                alt42=5;
                }
                break;
            case 49:
                {
                alt42=6;
                }
                break;
            case 48:
                {
                alt42=7;
                }
                break;
            case 54:
                {
                alt42=8;
                }
                break;
            case 55:
                {
                alt42=9;
                }
                break;
            case 56:
                {
                alt42=10;
                }
                break;
            case 47:
                {
                alt42=11;
                }
                break;
            case 51:
                {
                alt42=12;
                }
                break;
            case 52:
                {
                alt42=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalEgyDsl.g:3098:5: this_VersbreakMarker_0= ruleVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_VersbreakMarker_0=ruleVersbreakMarker();

                    state._fsp--;

                     
                            current = this_VersbreakMarker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:3108:5: this_VersFrontierMarker_1= ruleVersFrontierMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_VersFrontierMarker_1=ruleVersFrontierMarker();

                    state._fsp--;

                     
                            current = this_VersFrontierMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:3118:5: this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BrokenVersbreakMarker_2=ruleBrokenVersbreakMarker();

                    state._fsp--;

                     
                            current = this_BrokenVersbreakMarker_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:3128:5: this_MissingVersMarker_3= ruleMissingVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getMissingVersMarkerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MissingVersMarker_3=ruleMissingVersMarker();

                    state._fsp--;

                     
                            current = this_MissingVersMarker_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:3138:5: this_DestroyedVersMarker_4= ruleDestroyedVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDestroyedVersMarkerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DestroyedVersMarker_4=ruleDestroyedVersMarker();

                    state._fsp--;

                     
                            current = this_DestroyedVersMarker_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:3148:5: this_DeletedVersMarker_5= ruleDeletedVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDeletedVersMarkerParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DeletedVersMarker_5=ruleDeletedVersMarker();

                    state._fsp--;

                     
                            current = this_DeletedVersMarker_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:3158:5: this_DisputableVersMarker_6= ruleDisputableVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDisputableVersMarkerParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DisputableVersMarker_6=ruleDisputableVersMarker();

                    state._fsp--;

                     
                            current = this_DisputableVersMarker_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:3168:5: this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getRestorationOverRasurMarkerParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RestorationOverRasurMarker_7=ruleRestorationOverRasurMarker();

                    state._fsp--;

                     
                            current = this_RestorationOverRasurMarker_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:3178:5: this_AncientExpandedMarker_8= ruleAncientExpandedMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getAncientExpandedMarkerParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AncientExpandedMarker_8=ruleAncientExpandedMarker();

                    state._fsp--;

                     
                            current = this_AncientExpandedMarker_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:3188:5: this_RasurMarker_9= ruleRasurMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getRasurMarkerParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RasurMarker_9=ruleRasurMarker();

                    state._fsp--;

                     
                            current = this_RasurMarker_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:3198:5: this_EmendationVersMarker_10= ruleEmendationVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getEmendationVersMarkerParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EmendationVersMarker_10=ruleEmendationVersMarker();

                    state._fsp--;

                     
                            current = this_EmendationVersMarker_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalEgyDsl.g:3208:5: this_DestroyedVersFrontierMarker_11= ruleDestroyedVersFrontierMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDestroyedVersFrontierMarkerParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DestroyedVersFrontierMarker_11=ruleDestroyedVersFrontierMarker();

                    state._fsp--;

                     
                            current = this_DestroyedVersFrontierMarker_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalEgyDsl.g:3218:5: this_PartialDestroyedVersMarker_12= rulePartialDestroyedVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getPartialDestroyedVersMarkerParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_PartialDestroyedVersMarker_12=rulePartialDestroyedVersMarker();

                    state._fsp--;

                     
                            current = this_PartialDestroyedVersMarker_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersMarker"


    // $ANTLR start "entryRuleEmendationVersMarker"
    // InternalEgyDsl.g:3234:1: entryRuleEmendationVersMarker returns [EObject current=null] : iv_ruleEmendationVersMarker= ruleEmendationVersMarker EOF ;
    public final EObject entryRuleEmendationVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendationVersMarker = null;


        try {
            // InternalEgyDsl.g:3235:2: (iv_ruleEmendationVersMarker= ruleEmendationVersMarker EOF )
            // InternalEgyDsl.g:3236:2: iv_ruleEmendationVersMarker= ruleEmendationVersMarker EOF
            {
             newCompositeNode(grammarAccess.getEmendationVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmendationVersMarker=ruleEmendationVersMarker();

            state._fsp--;

             current =iv_ruleEmendationVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmendationVersMarker"


    // $ANTLR start "ruleEmendationVersMarker"
    // InternalEgyDsl.g:3243:1: ruleEmendationVersMarker returns [EObject current=null] : ( () otherlv_1= '(\\uDB80\\uDC80)' ) ;
    public final EObject ruleEmendationVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3246:28: ( ( () otherlv_1= '(\\uDB80\\uDC80)' ) )
            // InternalEgyDsl.g:3247:1: ( () otherlv_1= '(\\uDB80\\uDC80)' )
            {
            // InternalEgyDsl.g:3247:1: ( () otherlv_1= '(\\uDB80\\uDC80)' )
            // InternalEgyDsl.g:3247:2: () otherlv_1= '(\\uDB80\\uDC80)'
            {
            // InternalEgyDsl.g:3247:2: ()
            // InternalEgyDsl.g:3248:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationVersMarkerAccess().getEmendationVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationVersMarkerAccess().getLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmendationVersMarker"


    // $ANTLR start "entryRuleDisputableVersMarker"
    // InternalEgyDsl.g:3265:1: entryRuleDisputableVersMarker returns [EObject current=null] : iv_ruleDisputableVersMarker= ruleDisputableVersMarker EOF ;
    public final EObject entryRuleDisputableVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableVersMarker = null;


        try {
            // InternalEgyDsl.g:3266:2: (iv_ruleDisputableVersMarker= ruleDisputableVersMarker EOF )
            // InternalEgyDsl.g:3267:2: iv_ruleDisputableVersMarker= ruleDisputableVersMarker EOF
            {
             newCompositeNode(grammarAccess.getDisputableVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisputableVersMarker=ruleDisputableVersMarker();

            state._fsp--;

             current =iv_ruleDisputableVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisputableVersMarker"


    // $ANTLR start "ruleDisputableVersMarker"
    // InternalEgyDsl.g:3274:1: ruleDisputableVersMarker returns [EObject current=null] : ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' ) ;
    public final EObject ruleDisputableVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3277:28: ( ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' ) )
            // InternalEgyDsl.g:3278:1: ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' )
            {
            // InternalEgyDsl.g:3278:1: ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' )
            // InternalEgyDsl.g:3278:2: () otherlv_1= '\\u2E2E\\uDB80\\uDC80?'
            {
            // InternalEgyDsl.g:3278:2: ()
            // InternalEgyDsl.g:3279:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableVersMarkerAccess().getDisputableVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableVersMarkerAccess().getReversedQuestionMarkLeadSurrogateDb80TrailSurrogateDc80QuestionMarkKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisputableVersMarker"


    // $ANTLR start "entryRuleDeletedVersMarker"
    // InternalEgyDsl.g:3296:1: entryRuleDeletedVersMarker returns [EObject current=null] : iv_ruleDeletedVersMarker= ruleDeletedVersMarker EOF ;
    public final EObject entryRuleDeletedVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletedVersMarker = null;


        try {
            // InternalEgyDsl.g:3297:2: (iv_ruleDeletedVersMarker= ruleDeletedVersMarker EOF )
            // InternalEgyDsl.g:3298:2: iv_ruleDeletedVersMarker= ruleDeletedVersMarker EOF
            {
             newCompositeNode(grammarAccess.getDeletedVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletedVersMarker=ruleDeletedVersMarker();

            state._fsp--;

             current =iv_ruleDeletedVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeletedVersMarker"


    // $ANTLR start "ruleDeletedVersMarker"
    // InternalEgyDsl.g:3305:1: ruleDeletedVersMarker returns [EObject current=null] : ( () otherlv_1= '{\\uDB80\\uDC80}' ) ;
    public final EObject ruleDeletedVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3308:28: ( ( () otherlv_1= '{\\uDB80\\uDC80}' ) )
            // InternalEgyDsl.g:3309:1: ( () otherlv_1= '{\\uDB80\\uDC80}' )
            {
            // InternalEgyDsl.g:3309:1: ( () otherlv_1= '{\\uDB80\\uDC80}' )
            // InternalEgyDsl.g:3309:2: () otherlv_1= '{\\uDB80\\uDC80}'
            {
            // InternalEgyDsl.g:3309:2: ()
            // InternalEgyDsl.g:3310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletedVersMarkerAccess().getDeletedVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletedVersMarkerAccess().getLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeletedVersMarker"


    // $ANTLR start "entryRuleDestroyedVersMarker"
    // InternalEgyDsl.g:3327:1: entryRuleDestroyedVersMarker returns [EObject current=null] : iv_ruleDestroyedVersMarker= ruleDestroyedVersMarker EOF ;
    public final EObject entryRuleDestroyedVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroyedVersMarker = null;


        try {
            // InternalEgyDsl.g:3328:2: (iv_ruleDestroyedVersMarker= ruleDestroyedVersMarker EOF )
            // InternalEgyDsl.g:3329:2: iv_ruleDestroyedVersMarker= ruleDestroyedVersMarker EOF
            {
             newCompositeNode(grammarAccess.getDestroyedVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestroyedVersMarker=ruleDestroyedVersMarker();

            state._fsp--;

             current =iv_ruleDestroyedVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestroyedVersMarker"


    // $ANTLR start "ruleDestroyedVersMarker"
    // InternalEgyDsl.g:3336:1: ruleDestroyedVersMarker returns [EObject current=null] : ( () otherlv_1= '[\\uDB80\\uDC80]' ) ;
    public final EObject ruleDestroyedVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3339:28: ( ( () otherlv_1= '[\\uDB80\\uDC80]' ) )
            // InternalEgyDsl.g:3340:1: ( () otherlv_1= '[\\uDB80\\uDC80]' )
            {
            // InternalEgyDsl.g:3340:1: ( () otherlv_1= '[\\uDB80\\uDC80]' )
            // InternalEgyDsl.g:3340:2: () otherlv_1= '[\\uDB80\\uDC80]'
            {
            // InternalEgyDsl.g:3340:2: ()
            // InternalEgyDsl.g:3341:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDestroyedVersMarkerAccess().getDestroyedVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getDestroyedVersMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestroyedVersMarker"


    // $ANTLR start "entryRuleDestroyedVersFrontierMarker"
    // InternalEgyDsl.g:3358:1: entryRuleDestroyedVersFrontierMarker returns [EObject current=null] : iv_ruleDestroyedVersFrontierMarker= ruleDestroyedVersFrontierMarker EOF ;
    public final EObject entryRuleDestroyedVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroyedVersFrontierMarker = null;


        try {
            // InternalEgyDsl.g:3359:2: (iv_ruleDestroyedVersFrontierMarker= ruleDestroyedVersFrontierMarker EOF )
            // InternalEgyDsl.g:3360:2: iv_ruleDestroyedVersFrontierMarker= ruleDestroyedVersFrontierMarker EOF
            {
             newCompositeNode(grammarAccess.getDestroyedVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestroyedVersFrontierMarker=ruleDestroyedVersFrontierMarker();

            state._fsp--;

             current =iv_ruleDestroyedVersFrontierMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestroyedVersFrontierMarker"


    // $ANTLR start "ruleDestroyedVersFrontierMarker"
    // InternalEgyDsl.g:3367:1: ruleDestroyedVersFrontierMarker returns [EObject current=null] : ( () otherlv_1= '[\\uDB80\\uDC81]' ) ;
    public final EObject ruleDestroyedVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3370:28: ( ( () otherlv_1= '[\\uDB80\\uDC81]' ) )
            // InternalEgyDsl.g:3371:1: ( () otherlv_1= '[\\uDB80\\uDC81]' )
            {
            // InternalEgyDsl.g:3371:1: ( () otherlv_1= '[\\uDB80\\uDC81]' )
            // InternalEgyDsl.g:3371:2: () otherlv_1= '[\\uDB80\\uDC81]'
            {
            // InternalEgyDsl.g:3371:2: ()
            // InternalEgyDsl.g:3372:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDestroyedVersFrontierMarkerAccess().getDestroyedVersFrontierMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getDestroyedVersFrontierMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc81RightSquareBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestroyedVersFrontierMarker"


    // $ANTLR start "entryRulePartialDestroyedVersMarker"
    // InternalEgyDsl.g:3389:1: entryRulePartialDestroyedVersMarker returns [EObject current=null] : iv_rulePartialDestroyedVersMarker= rulePartialDestroyedVersMarker EOF ;
    public final EObject entryRulePartialDestroyedVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestroyedVersMarker = null;


        try {
            // InternalEgyDsl.g:3390:2: (iv_rulePartialDestroyedVersMarker= rulePartialDestroyedVersMarker EOF )
            // InternalEgyDsl.g:3391:2: iv_rulePartialDestroyedVersMarker= rulePartialDestroyedVersMarker EOF
            {
             newCompositeNode(grammarAccess.getPartialDestroyedVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialDestroyedVersMarker=rulePartialDestroyedVersMarker();

            state._fsp--;

             current =iv_rulePartialDestroyedVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialDestroyedVersMarker"


    // $ANTLR start "rulePartialDestroyedVersMarker"
    // InternalEgyDsl.g:3398:1: rulePartialDestroyedVersMarker returns [EObject current=null] : ( () otherlv_1= '\\u2E22\\uDB80\\uDC80\\u2E23' ) ;
    public final EObject rulePartialDestroyedVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3401:28: ( ( () otherlv_1= '\\u2E22\\uDB80\\uDC80\\u2E23' ) )
            // InternalEgyDsl.g:3402:1: ( () otherlv_1= '\\u2E22\\uDB80\\uDC80\\u2E23' )
            {
            // InternalEgyDsl.g:3402:1: ( () otherlv_1= '\\u2E22\\uDB80\\uDC80\\u2E23' )
            // InternalEgyDsl.g:3402:2: () otherlv_1= '\\u2E22\\uDB80\\uDC80\\u2E23'
            {
            // InternalEgyDsl.g:3402:2: ()
            // InternalEgyDsl.g:3403:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestroyedVersMarkerAccess().getPartialDestroyedVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestroyedVersMarkerAccess().getTopLeftHalfBracketLeadSurrogateDb80TrailSurrogateDc80TopRightHalfBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialDestroyedVersMarker"


    // $ANTLR start "entryRuleMissingVersMarker"
    // InternalEgyDsl.g:3420:1: entryRuleMissingVersMarker returns [EObject current=null] : iv_ruleMissingVersMarker= ruleMissingVersMarker EOF ;
    public final EObject entryRuleMissingVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissingVersMarker = null;


        try {
            // InternalEgyDsl.g:3421:2: (iv_ruleMissingVersMarker= ruleMissingVersMarker EOF )
            // InternalEgyDsl.g:3422:2: iv_ruleMissingVersMarker= ruleMissingVersMarker EOF
            {
             newCompositeNode(grammarAccess.getMissingVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissingVersMarker=ruleMissingVersMarker();

            state._fsp--;

             current =iv_ruleMissingVersMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMissingVersMarker"


    // $ANTLR start "ruleMissingVersMarker"
    // InternalEgyDsl.g:3429:1: ruleMissingVersMarker returns [EObject current=null] : ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' ) ;
    public final EObject ruleMissingVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3432:28: ( ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' ) )
            // InternalEgyDsl.g:3433:1: ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' )
            {
            // InternalEgyDsl.g:3433:1: ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' )
            // InternalEgyDsl.g:3433:2: () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A'
            {
            // InternalEgyDsl.g:3433:2: ()
            // InternalEgyDsl.g:3434:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMissingVersMarkerAccess().getMissingVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getMissingVersMarkerAccess().getLeftPointingAngleBracketLeadSurrogateDb80TrailSurrogateDc80RightPointingAngleBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMissingVersMarker"


    // $ANTLR start "entryRuleRestorationOverRasurMarker"
    // InternalEgyDsl.g:3451:1: entryRuleRestorationOverRasurMarker returns [EObject current=null] : iv_ruleRestorationOverRasurMarker= ruleRestorationOverRasurMarker EOF ;
    public final EObject entryRuleRestorationOverRasurMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasurMarker = null;


        try {
            // InternalEgyDsl.g:3452:2: (iv_ruleRestorationOverRasurMarker= ruleRestorationOverRasurMarker EOF )
            // InternalEgyDsl.g:3453:2: iv_ruleRestorationOverRasurMarker= ruleRestorationOverRasurMarker EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestorationOverRasurMarker=ruleRestorationOverRasurMarker();

            state._fsp--;

             current =iv_ruleRestorationOverRasurMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestorationOverRasurMarker"


    // $ANTLR start "ruleRestorationOverRasurMarker"
    // InternalEgyDsl.g:3460:1: ruleRestorationOverRasurMarker returns [EObject current=null] : ( () otherlv_1= '[[\\uDB80\\uDC80]]' ) ;
    public final EObject ruleRestorationOverRasurMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3463:28: ( ( () otherlv_1= '[[\\uDB80\\uDC80]]' ) )
            // InternalEgyDsl.g:3464:1: ( () otherlv_1= '[[\\uDB80\\uDC80]]' )
            {
            // InternalEgyDsl.g:3464:1: ( () otherlv_1= '[[\\uDB80\\uDC80]]' )
            // InternalEgyDsl.g:3464:2: () otherlv_1= '[[\\uDB80\\uDC80]]'
            {
            // InternalEgyDsl.g:3464:2: ()
            // InternalEgyDsl.g:3465:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurMarkerAccess().getRestorationOverRasurMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurMarkerAccess().getLeftSquareBracketLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketRightSquareBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestorationOverRasurMarker"


    // $ANTLR start "entryRuleAncientExpandedMarker"
    // InternalEgyDsl.g:3482:1: entryRuleAncientExpandedMarker returns [EObject current=null] : iv_ruleAncientExpandedMarker= ruleAncientExpandedMarker EOF ;
    public final EObject entryRuleAncientExpandedMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpandedMarker = null;


        try {
            // InternalEgyDsl.g:3483:2: (iv_ruleAncientExpandedMarker= ruleAncientExpandedMarker EOF )
            // InternalEgyDsl.g:3484:2: iv_ruleAncientExpandedMarker= ruleAncientExpandedMarker EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAncientExpandedMarker=ruleAncientExpandedMarker();

            state._fsp--;

             current =iv_ruleAncientExpandedMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAncientExpandedMarker"


    // $ANTLR start "ruleAncientExpandedMarker"
    // InternalEgyDsl.g:3491:1: ruleAncientExpandedMarker returns [EObject current=null] : ( () otherlv_1= '((\\uDB80\\uDC80))' ) ;
    public final EObject ruleAncientExpandedMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3494:28: ( ( () otherlv_1= '((\\uDB80\\uDC80))' ) )
            // InternalEgyDsl.g:3495:1: ( () otherlv_1= '((\\uDB80\\uDC80))' )
            {
            // InternalEgyDsl.g:3495:1: ( () otherlv_1= '((\\uDB80\\uDC80))' )
            // InternalEgyDsl.g:3495:2: () otherlv_1= '((\\uDB80\\uDC80))'
            {
            // InternalEgyDsl.g:3495:2: ()
            // InternalEgyDsl.g:3496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedMarkerAccess().getAncientExpandedMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedMarkerAccess().getLeftParenthesisLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisRightParenthesisKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAncientExpandedMarker"


    // $ANTLR start "entryRuleRasurMarker"
    // InternalEgyDsl.g:3513:1: entryRuleRasurMarker returns [EObject current=null] : iv_ruleRasurMarker= ruleRasurMarker EOF ;
    public final EObject entryRuleRasurMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasurMarker = null;


        try {
            // InternalEgyDsl.g:3514:2: (iv_ruleRasurMarker= ruleRasurMarker EOF )
            // InternalEgyDsl.g:3515:2: iv_ruleRasurMarker= ruleRasurMarker EOF
            {
             newCompositeNode(grammarAccess.getRasurMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRasurMarker=ruleRasurMarker();

            state._fsp--;

             current =iv_ruleRasurMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRasurMarker"


    // $ANTLR start "ruleRasurMarker"
    // InternalEgyDsl.g:3522:1: ruleRasurMarker returns [EObject current=null] : ( () otherlv_1= '{{\\uDB80\\uDC80}}' ) ;
    public final EObject ruleRasurMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3525:28: ( ( () otherlv_1= '{{\\uDB80\\uDC80}}' ) )
            // InternalEgyDsl.g:3526:1: ( () otherlv_1= '{{\\uDB80\\uDC80}}' )
            {
            // InternalEgyDsl.g:3526:1: ( () otherlv_1= '{{\\uDB80\\uDC80}}' )
            // InternalEgyDsl.g:3526:2: () otherlv_1= '{{\\uDB80\\uDC80}}'
            {
            // InternalEgyDsl.g:3526:2: ()
            // InternalEgyDsl.g:3527:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurMarkerAccess().getAncientExpandedMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurMarkerAccess().getLeftCurlyBracketLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketRightCurlyBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRasurMarker"


    // $ANTLR start "entryRuleVersFrontierMarker"
    // InternalEgyDsl.g:3544:1: entryRuleVersFrontierMarker returns [EObject current=null] : iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF ;
    public final EObject entryRuleVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersFrontierMarker = null;


        try {
            // InternalEgyDsl.g:3545:2: (iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF )
            // InternalEgyDsl.g:3546:2: iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF
            {
             newCompositeNode(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersFrontierMarker=ruleVersFrontierMarker();

            state._fsp--;

             current =iv_ruleVersFrontierMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersFrontierMarker"


    // $ANTLR start "ruleVersFrontierMarker"
    // InternalEgyDsl.g:3553:1: ruleVersFrontierMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC81' ) ;
    public final EObject ruleVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3556:28: ( ( () otherlv_1= '\\uDB80\\uDC81' ) )
            // InternalEgyDsl.g:3557:1: ( () otherlv_1= '\\uDB80\\uDC81' )
            {
            // InternalEgyDsl.g:3557:1: ( () otherlv_1= '\\uDB80\\uDC81' )
            // InternalEgyDsl.g:3557:2: () otherlv_1= '\\uDB80\\uDC81'
            {
            // InternalEgyDsl.g:3557:2: ()
            // InternalEgyDsl.g:3558:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getVersFrontierMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc81Keyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersFrontierMarker"


    // $ANTLR start "entryRuleVersbreakMarker"
    // InternalEgyDsl.g:3575:1: entryRuleVersbreakMarker returns [EObject current=null] : iv_ruleVersbreakMarker= ruleVersbreakMarker EOF ;
    public final EObject entryRuleVersbreakMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersbreakMarker = null;


        try {
            // InternalEgyDsl.g:3576:2: (iv_ruleVersbreakMarker= ruleVersbreakMarker EOF )
            // InternalEgyDsl.g:3577:2: iv_ruleVersbreakMarker= ruleVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersbreakMarker=ruleVersbreakMarker();

            state._fsp--;

             current =iv_ruleVersbreakMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersbreakMarker"


    // $ANTLR start "ruleVersbreakMarker"
    // InternalEgyDsl.g:3584:1: ruleVersbreakMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC80' ) ;
    public final EObject ruleVersbreakMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3587:28: ( ( () otherlv_1= '\\uDB80\\uDC80' ) )
            // InternalEgyDsl.g:3588:1: ( () otherlv_1= '\\uDB80\\uDC80' )
            {
            // InternalEgyDsl.g:3588:1: ( () otherlv_1= '\\uDB80\\uDC80' )
            // InternalEgyDsl.g:3588:2: () otherlv_1= '\\uDB80\\uDC80'
            {
            // InternalEgyDsl.g:3588:2: ()
            // InternalEgyDsl.g:3589:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc80Keyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersbreakMarker"


    // $ANTLR start "entryRuleBrokenVersbreakMarker"
    // InternalEgyDsl.g:3606:1: entryRuleBrokenVersbreakMarker returns [EObject current=null] : iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF ;
    public final EObject entryRuleBrokenVersbreakMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrokenVersbreakMarker = null;


        try {
            // InternalEgyDsl.g:3607:2: (iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF )
            // InternalEgyDsl.g:3608:2: iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrokenVersbreakMarker=ruleBrokenVersbreakMarker();

            state._fsp--;

             current =iv_ruleBrokenVersbreakMarker; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrokenVersbreakMarker"


    // $ANTLR start "ruleBrokenVersbreakMarker"
    // InternalEgyDsl.g:3615:1: ruleBrokenVersbreakMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC82' ) ;
    public final EObject ruleBrokenVersbreakMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalEgyDsl.g:3618:28: ( ( () otherlv_1= '\\uDB80\\uDC82' ) )
            // InternalEgyDsl.g:3619:1: ( () otherlv_1= '\\uDB80\\uDC82' )
            {
            // InternalEgyDsl.g:3619:1: ( () otherlv_1= '\\uDB80\\uDC82' )
            // InternalEgyDsl.g:3619:2: () otherlv_1= '\\uDB80\\uDC82'
            {
            // InternalEgyDsl.g:3619:2: ()
            // InternalEgyDsl.g:3620:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getBrokenVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc82Keyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrokenVersbreakMarker"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0FFFFFAAAAAAADC0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0FFFFFAAAAAAA9D0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0FFFFFAAAAAAA9C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0FFFFFAAAAAAA1D0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00007FAAAAAAA102L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00007FAAAAAAA100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00007FAAAAAAE100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00007FAAAAABA100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00007FAAAAAEA100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00007FAAAABAA100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00007FAAAAEAA100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00007FAAABAAA100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00007FAAAEAAA100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00007FAABAAAA100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00007FAAEAAAA100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00007FABAAAAA100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00007FAEAAAAA100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00007FBAAAAAA100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00007FEAAAAAA100L});

}