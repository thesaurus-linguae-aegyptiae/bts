package org.bbaw.bts.corpus.text.egy.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.bbaw.bts.corpus.text.egy.dsl.services.EgyBtsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEgyBtsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EGYSTRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00A7'", "' '", "'#'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'-'", "'~'", "'('", "')'", "'<'", "'>'", "'?'", "'['", "']'", "'{'", "'}'", "'<<'", "'>>'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "'--'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int RULE_EGYSTRING=5;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalEgyBtsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEgyBtsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEgyBtsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g"; }



     	private EgyBtsGrammarAccess grammarAccess;
     	
        public InternalEgyBtsParser(TokenStream input, EgyBtsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TextContent";	
       	}
       	
       	@Override
       	protected EgyBtsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTextContent"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:67:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:68:2: (iv_ruleTextContent= ruleTextContent EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:69:2: iv_ruleTextContent= ruleTextContent EOF
            {
             newCompositeNode(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_ruleTextContent_in_entryRuleTextContent75);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;

             current =iv_ruleTextContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextContent85); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:76:1: ruleTextContent returns [EObject current=null] : ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:79:28: ( ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:80:2: () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextContentAccess().getTextContentAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:86:2: ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:86:3: ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:86:3: ( (lv_items_1_0= ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:87:1: (lv_items_1_0= ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:87:1: (lv_items_1_0= ruleTextItem )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:88:3: lv_items_1_0= ruleTextItem
            {
             
            	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTextItem_in_ruleTextContent141);
            lv_items_1_0=ruleTextItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"TextItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:104:2: ( (lv_items_2_0= ruleTextItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:105:1: (lv_items_2_0= ruleTextItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:105:1: (lv_items_2_0= ruleTextItem )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:106:3: lv_items_2_0= ruleTextItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextItem_in_ruleTextContent162);
            	    lv_items_2_0=ruleTextItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_2_0, 
            	            		"TextItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:130:1: entryRuleTextItem returns [EObject current=null] : iv_ruleTextItem= ruleTextItem EOF ;
    public final EObject entryRuleTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:131:2: (iv_ruleTextItem= ruleTextItem EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:132:2: iv_ruleTextItem= ruleTextItem EOF
            {
             newCompositeNode(grammarAccess.getTextItemRule()); 
            pushFollow(FOLLOW_ruleTextItem_in_entryRuleTextItem200);
            iv_ruleTextItem=ruleTextItem();

            state._fsp--;

             current =iv_ruleTextItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextItem210); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:139:1: ruleTextItem returns [EObject current=null] : this_Sentence_0= ruleSentence ;
    public final EObject ruleTextItem() throws RecognitionException {
        EObject current = null;

        EObject this_Sentence_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:142:28: (this_Sentence_0= ruleSentence )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:144:5: this_Sentence_0= ruleSentence
            {
             
                    newCompositeNode(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSentence_in_ruleTextItem256);
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:160:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:161:2: (iv_ruleSentence= ruleSentence EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:162:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence290);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence300); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:169:1: ruleSentence returns [EObject current=null] : (otherlv_0= '\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00A7' ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:172:28: ( (otherlv_0= '\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:173:1: (otherlv_0= '\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:173:1: (otherlv_0= '\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:173:3: otherlv_0= '\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00A7'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSentence337); 

                	newLeafNode(otherlv_0, grammarAccess.getSentenceAccess().getSectionSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:177:1: ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:177:2: ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:177:2: ( (lv_items_1_0= ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:178:1: (lv_items_1_0= ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:178:1: (lv_items_1_0= ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:179:3: lv_items_1_0= ruleSentenceItem
            {
             
            	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSentenceItem_in_ruleSentence359);
            lv_items_1_0=ruleSentenceItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"SentenceItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:195:2: (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:195:4: otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSentence372); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSentenceAccess().getSpaceKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:199:1: ( (lv_items_3_0= ruleSentenceItem ) )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:200:1: (lv_items_3_0= ruleSentenceItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:200:1: (lv_items_3_0= ruleSentenceItem )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:201:3: lv_items_3_0= ruleSentenceItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentenceItem_in_ruleSentence393);
            	    lv_items_3_0=ruleSentenceItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"SentenceItem");
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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleSentence408); 

                	newLeafNode(otherlv_4, grammarAccess.getSentenceAccess().getSectionSignKeyword_2());
                

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:229:1: entryRuleSentenceItem returns [EObject current=null] : iv_ruleSentenceItem= ruleSentenceItem EOF ;
    public final EObject entryRuleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:230:2: (iv_ruleSentenceItem= ruleSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:231:2: iv_ruleSentenceItem= ruleSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemRule()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem444);
            iv_ruleSentenceItem=ruleSentenceItem();

            state._fsp--;

             current =iv_ruleSentenceItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItem454); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:238:1: ruleSentenceItem returns [EObject current=null] : (this_Word_0= ruleWord | this_Marker_1= ruleMarker ) ;
    public final EObject ruleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_Marker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:241:28: ( (this_Word_0= ruleWord | this_Marker_1= ruleMarker ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:242:1: (this_Word_0= ruleWord | this_Marker_1= ruleMarker )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:242:1: (this_Word_0= ruleWord | this_Marker_1= ruleMarker )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_EGYSTRING||(LA3_0>=12 && LA3_0<=13)||(LA3_0>=15 && LA3_0<=22)||LA3_0==24||(LA3_0>=26 && LA3_0<=27)||LA3_0==29||LA3_0==31||LA3_0==33||LA3_0==35||LA3_0==37||LA3_0==39||LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:243:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleSentenceItem501);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:253:5: this_Marker_1= ruleMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMarker_in_ruleSentenceItem528);
                    this_Marker_1=ruleMarker();

                    state._fsp--;

                     
                            current = this_Marker_1; 
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


    // $ANTLR start "entryRuleMarker"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:269:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:270:2: (iv_ruleMarker= ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:271:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_ruleMarker_in_entryRuleMarker563);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarker573); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:278:1: ruleMarker returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:281:28: ( (otherlv_0= '#' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:282:1: (otherlv_0= '#' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:282:1: (otherlv_0= '#' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:282:3: otherlv_0= '#' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMarker610); 

                	newLeafNode(otherlv_0, grammarAccess.getMarkerAccess().getNumberSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:286:1: ( (lv_type_1_0= RULE_ID ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:287:1: (lv_type_1_0= RULE_ID )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:287:1: (lv_type_1_0= RULE_ID )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:288:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMarker627); 

            			newLeafNode(lv_type_1_0, grammarAccess.getMarkerAccess().getTypeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:304:2: ( (lv_name_2_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:305:1: (lv_name_2_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:305:1: (lv_name_2_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:306:3: lv_name_2_0= RULE_EGYSTRING
            {
            lv_name_2_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_ruleMarker649); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMarkerAccess().getNameEGYSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EGYSTRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMarker666); 

                	newLeafNode(otherlv_3, grammarAccess.getMarkerAccess().getNumberSignKeyword_3());
                

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


    // $ANTLR start "entryRuleWord"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:334:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:335:2: (iv_ruleWord= ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:336:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord702);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord712); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:343:1: ruleWord returns [EObject current=null] : ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:346:28: ( ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:347:1: ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:347:1: ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:347:2: () ( (lv_wChar_1_0= ruleWordMiddle ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:347:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWordAccess().getWordAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:353:2: ( (lv_wChar_1_0= ruleWordMiddle ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_EGYSTRING||(LA4_0>=15 && LA4_0<=22)||LA4_0==24||(LA4_0>=26 && LA4_0<=27)||LA4_0==29||LA4_0==31||LA4_0==33||LA4_0==35||LA4_0==37||LA4_0==39||LA4_0==41) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:354:1: (lv_wChar_1_0= ruleWordMiddle )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:354:1: (lv_wChar_1_0= ruleWordMiddle )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:355:3: lv_wChar_1_0= ruleWordMiddle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordMiddleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWordMiddle_in_ruleWord767);
            	    lv_wChar_1_0=ruleWordMiddle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWordRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"WordMiddle");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
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


    // $ANTLR start "entryRuleWordMiddle"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:379:1: entryRuleWordMiddle returns [EObject current=null] : iv_ruleWordMiddle= ruleWordMiddle EOF ;
    public final EObject entryRuleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMiddle = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:380:2: (iv_ruleWordMiddle= ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:381:2: iv_ruleWordMiddle= ruleWordMiddle EOF
            {
             newCompositeNode(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle804);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMiddle814); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:388:1: ruleWordMiddle returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars ) ;
    public final EObject ruleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Brackets_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:391:28: ( (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:392:1: (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:392:1: (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
            case 24:
            case 26:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
            case 39:
            case 41:
                {
                alt5=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:393:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleWordMiddle861);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:403:5: this_Brackets_1= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleWordMiddle888);
                    this_Brackets_1=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:413:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleWordMiddle915);
                    this_Chars_2=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_2; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:429:1: entryRuleChars returns [EObject current=null] : iv_ruleChars= ruleChars EOF ;
    public final EObject entryRuleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChars = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:430:2: (iv_ruleChars= ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:431:2: iv_ruleChars= ruleChars EOF
            {
             newCompositeNode(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_ruleChars_in_entryRuleChars950);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChars960); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:438:1: ruleChars returns [EObject current=null] : ( (lv_name_0_0= RULE_EGYSTRING ) ) ;
    public final EObject ruleChars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:441:28: ( ( (lv_name_0_0= RULE_EGYSTRING ) ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:442:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:442:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:443:1: (lv_name_0_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:443:1: (lv_name_0_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:444:3: lv_name_0_0= RULE_EGYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_ruleChars1001); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EGYSTRING");
            	    

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


    // $ANTLR start "entryRuleInterfix"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:468:1: entryRuleInterfix returns [EObject current=null] : iv_ruleInterfix= ruleInterfix EOF ;
    public final EObject entryRuleInterfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfix = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:469:2: (iv_ruleInterfix= ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:470:2: iv_ruleInterfix= ruleInterfix EOF
            {
             newCompositeNode(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_ruleInterfix_in_entryRuleInterfix1041);
            iv_ruleInterfix=ruleInterfix();

            state._fsp--;

             current =iv_ruleInterfix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfix1051); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:477:1: ruleInterfix returns [EObject current=null] : (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup ) ;
    public final EObject ruleInterfix() throws RecognitionException {
        EObject current = null;

        EObject this_InterfixFlexion_0 = null;

        EObject this_InterfixLexical_1 = null;

        EObject this_InterfixSuffixPronomLexical_2 = null;

        EObject this_InterfixPrefixNonLexical_3 = null;

        EObject this_InterfixPrefixLexical_4 = null;

        EObject this_InterfixCompountWords_5 = null;

        EObject this_InterfixConnectionSyllabicGroup_6 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:480:28: ( (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:481:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:481:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:482:5: this_InterfixFlexion_0= ruleInterfixFlexion
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfixFlexion_in_ruleInterfix1098);
                    this_InterfixFlexion_0=ruleInterfixFlexion();

                    state._fsp--;

                     
                            current = this_InterfixFlexion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:492:5: this_InterfixLexical_1= ruleInterfixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterfixLexical_in_ruleInterfix1125);
                    this_InterfixLexical_1=ruleInterfixLexical();

                    state._fsp--;

                     
                            current = this_InterfixLexical_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:502:5: this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix1152);
                    this_InterfixSuffixPronomLexical_2=ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     
                            current = this_InterfixSuffixPronomLexical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:512:5: this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix1179);
                    this_InterfixPrefixNonLexical_3=ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixNonLexical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:522:5: this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix1206);
                    this_InterfixPrefixLexical_4=ruleInterfixPrefixLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixLexical_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:532:5: this_InterfixCompountWords_5= ruleInterfixCompountWords
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixCompountWordsParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleInterfixCompountWords_in_ruleInterfix1233);
                    this_InterfixCompountWords_5=ruleInterfixCompountWords();

                    state._fsp--;

                     
                            current = this_InterfixCompountWords_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:542:5: this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix1260);
                    this_InterfixConnectionSyllabicGroup_6=ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     
                            current = this_InterfixConnectionSyllabicGroup_6; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:558:1: entryRuleInterfixLexical returns [EObject current=null] : iv_ruleInterfixLexical= ruleInterfixLexical EOF ;
    public final EObject entryRuleInterfixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:559:2: (iv_ruleInterfixLexical= ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:560:2: iv_ruleInterfixLexical= ruleInterfixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical1295);
            iv_ruleInterfixLexical=ruleInterfixLexical();

            state._fsp--;

             current =iv_ruleInterfixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexical1305); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:567:1: ruleInterfixLexical returns [EObject current=null] : ( () otherlv_1= ',' ) ;
    public final EObject ruleInterfixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:570:28: ( ( () otherlv_1= ',' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:571:1: ( () otherlv_1= ',' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:571:1: ( () otherlv_1= ',' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:571:2: () otherlv_1= ','
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:571:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:572:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleInterfixLexical1351); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:589:1: entryRuleInterfixFlexion returns [EObject current=null] : iv_ruleInterfixFlexion= ruleInterfixFlexion EOF ;
    public final EObject entryRuleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixFlexion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:590:2: (iv_ruleInterfixFlexion= ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:591:2: iv_ruleInterfixFlexion= ruleInterfixFlexion EOF
            {
             newCompositeNode(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion1387);
            iv_ruleInterfixFlexion=ruleInterfixFlexion();

            state._fsp--;

             current =iv_ruleInterfixFlexion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexion1397); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:598:1: ruleInterfixFlexion returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:601:28: ( ( () otherlv_1= '.' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:602:1: ( () otherlv_1= '.' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:602:1: ( () otherlv_1= '.' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:602:2: () otherlv_1= '.'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:602:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:603:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleInterfixFlexion1443); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:620:1: entryRuleInterfixSuffixPronomLexical returns [EObject current=null] : iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF ;
    public final EObject entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixSuffixPronomLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:621:2: (iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:622:2: iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical1479);
            iv_ruleInterfixSuffixPronomLexical=ruleInterfixSuffixPronomLexical();

            state._fsp--;

             current =iv_ruleInterfixSuffixPronomLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical1489); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:629:1: ruleInterfixSuffixPronomLexical returns [EObject current=null] : ( () otherlv_1= '\\u2261' ) ;
    public final EObject ruleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:632:28: ( ( () otherlv_1= '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:633:1: ( () otherlv_1= '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:633:1: ( () otherlv_1= '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:633:2: () otherlv_1= '\\u2261'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:633:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:634:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleInterfixSuffixPronomLexical1535); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:651:1: entryRuleInterfixPrefixNonLexical returns [EObject current=null] : iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF ;
    public final EObject entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixNonLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:652:2: (iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:653:2: iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical1571);
            iv_ruleInterfixPrefixNonLexical=ruleInterfixPrefixNonLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixNonLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical1581); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:660:1: ruleInterfixPrefixNonLexical returns [EObject current=null] : ( () otherlv_1= ':' ) ;
    public final EObject ruleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:663:28: ( ( () otherlv_1= ':' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:664:1: ( () otherlv_1= ':' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:664:1: ( () otherlv_1= ':' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:664:2: () otherlv_1= ':'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:664:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:665:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleInterfixPrefixNonLexical1627); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:682:1: entryRuleInterfixPrefixLexical returns [EObject current=null] : iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF ;
    public final EObject entryRuleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:683:2: (iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:684:2: iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical1663);
            iv_ruleInterfixPrefixLexical=ruleInterfixPrefixLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixLexical1673); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:691:1: ruleInterfixPrefixLexical returns [EObject current=null] : ( () otherlv_1= '\\u22EE' ) ;
    public final EObject ruleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:694:28: ( ( () otherlv_1= '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:695:1: ( () otherlv_1= '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:695:1: ( () otherlv_1= '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:695:2: () otherlv_1= '\\u22EE'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:695:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:696:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInterfixPrefixLexical1719); 

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


    // $ANTLR start "entryRuleInterfixCompountWords"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:713:1: entryRuleInterfixCompountWords returns [EObject current=null] : iv_ruleInterfixCompountWords= ruleInterfixCompountWords EOF ;
    public final EObject entryRuleInterfixCompountWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixCompountWords = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:714:2: (iv_ruleInterfixCompountWords= ruleInterfixCompountWords EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:715:2: iv_ruleInterfixCompountWords= ruleInterfixCompountWords EOF
            {
             newCompositeNode(grammarAccess.getInterfixCompountWordsRule()); 
            pushFollow(FOLLOW_ruleInterfixCompountWords_in_entryRuleInterfixCompountWords1755);
            iv_ruleInterfixCompountWords=ruleInterfixCompountWords();

            state._fsp--;

             current =iv_ruleInterfixCompountWords; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixCompountWords1765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfixCompountWords"


    // $ANTLR start "ruleInterfixCompountWords"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:722:1: ruleInterfixCompountWords returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleInterfixCompountWords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:725:28: ( ( () otherlv_1= '-' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:726:1: ( () otherlv_1= '-' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:726:1: ( () otherlv_1= '-' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:726:2: () otherlv_1= '-'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:726:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixCompountWordsAccess().getInterfixCompountWordsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleInterfixCompountWords1811); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfixCompountWordsAccess().getHyphenMinusKeyword_1());
                

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
    // $ANTLR end "ruleInterfixCompountWords"


    // $ANTLR start "entryRuleInterfixConnectionSyllabicGroup"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:744:1: entryRuleInterfixConnectionSyllabicGroup returns [EObject current=null] : iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF ;
    public final EObject entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixConnectionSyllabicGroup = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:745:2: (iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:746:2: iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup1847);
            iv_ruleInterfixConnectionSyllabicGroup=ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             current =iv_ruleInterfixConnectionSyllabicGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup1857); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:753:1: ruleInterfixConnectionSyllabicGroup returns [EObject current=null] : ( () otherlv_1= '~' ) ;
    public final EObject ruleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:756:28: ( ( () otherlv_1= '~' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:757:1: ( () otherlv_1= '~' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:757:1: ( () otherlv_1= '~' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:757:2: () otherlv_1= '~'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:757:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:758:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInterfixConnectionSyllabicGroup1903); 

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


    // $ANTLR start "entryRuleBrackets"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:775:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:776:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:777:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1939);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1949); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:784:1: ruleBrackets returns [EObject current=null] : (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_Rasur_0 = null;

        EObject this_AncientExpanded_1 = null;

        EObject this_RestorationOverRasur_2 = null;

        EObject this_Expanded_3 = null;

        EObject this_DisputableReading_4 = null;

        EObject this_Emendation_5 = null;

        EObject this_Lacuna_6 = null;

        EObject this_Deletion_7 = null;

        EObject this_ExpandedColumn_8 = null;

        EObject this_PartialDestruction_9 = null;

        EObject this_Destruction_10 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:787:28: ( (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:788:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:788:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 27:
                {
                alt7=7;
                }
                break;
            case 29:
                {
                alt7=8;
                }
                break;
            case 31:
                {
                alt7=9;
                }
                break;
            case 39:
                {
                alt7=10;
                }
                break;
            case 41:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:789:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleBrackets1996);
                    this_Rasur_0=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:799:5: this_AncientExpanded_1= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleBrackets2023);
                    this_AncientExpanded_1=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:809:5: this_RestorationOverRasur_2= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleBrackets2050);
                    this_RestorationOverRasur_2=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:819:5: this_Expanded_3= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleBrackets2077);
                    this_Expanded_3=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:829:5: this_DisputableReading_4= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleBrackets2104);
                    this_DisputableReading_4=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:839:5: this_Emendation_5= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleBrackets2131);
                    this_Emendation_5=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:849:5: this_Lacuna_6= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleBrackets2158);
                    this_Lacuna_6=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:859:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleBrackets2185);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:869:5: this_ExpandedColumn_8= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleBrackets2212);
                    this_ExpandedColumn_8=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:879:5: this_PartialDestruction_9= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleBrackets2239);
                    this_PartialDestruction_9=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:889:5: this_Destruction_10= ruleDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleDestruction_in_ruleBrackets2266);
                    this_Destruction_10=ruleDestruction();

                    state._fsp--;

                     
                            current = this_Destruction_10; 
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


    // $ANTLR start "entryRuleExpanded"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:905:1: entryRuleExpanded returns [EObject current=null] : iv_ruleExpanded= ruleExpanded EOF ;
    public final EObject entryRuleExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:906:2: (iv_ruleExpanded= ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:907:2: iv_ruleExpanded= ruleExpanded EOF
            {
             newCompositeNode(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_ruleExpanded_in_entryRuleExpanded2301);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpanded2311); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:914:1: ruleExpanded returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' ) ;
    public final EObject ruleExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:917:28: ( ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:918:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:918:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:918:2: () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:918:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:919:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleExpanded2357); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:928:1: ( (lv_wChar_2_0= ruleNoExpanded ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_EGYSTRING||(LA8_0>=15 && LA8_0<=21)||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:929:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:929:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:930:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpanded_in_ruleExpanded2378);
            	    lv_wChar_2_0=ruleNoExpanded();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpandedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"NoExpanded");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleExpanded2391); 

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


    // $ANTLR start "entryRuleNoExpanded"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:958:1: entryRuleNoExpanded returns [EObject current=null] : iv_ruleNoExpanded= ruleNoExpanded EOF ;
    public final EObject entryRuleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:959:2: (iv_ruleNoExpanded= ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:960:2: iv_ruleNoExpanded= ruleNoExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded2427);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpanded2437); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:967:1: ruleNoExpanded returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars ) ;
    public final EObject ruleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:970:28: ( (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:971:1: (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:971:1: (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:972:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpanded2484);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:982:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpanded2511);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:992:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpanded2538);
                    this_Chars_2=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_2; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1008:1: entryRuleEmendation returns [EObject current=null] : iv_ruleEmendation= ruleEmendation EOF ;
    public final EObject entryRuleEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1009:2: (iv_ruleEmendation= ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1010:2: iv_ruleEmendation= ruleEmendation EOF
            {
             newCompositeNode(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_ruleEmendation_in_entryRuleEmendation2573);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmendation2583); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1017:1: ruleEmendation returns [EObject current=null] : ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' ) ;
    public final EObject ruleEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1020:28: ( ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1021:1: ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1021:1: ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1021:2: () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1021:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1022:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationAccess().getEmendationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEmendation2629); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLessThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1031:1: ( (lv_wChar_2_0= ruleNoEmendation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_EGYSTRING||(LA10_0>=15 && LA10_0<=22)||LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1032:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1032:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1033:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoEmendation_in_ruleEmendation2650);
            	    lv_wChar_2_0=ruleNoEmendation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEmendationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"NoEmendation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEmendation2663); 

                	newLeafNode(otherlv_3, grammarAccess.getEmendationAccess().getGreaterThanSignKeyword_3());
                

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1061:1: entryRuleNoEmendation returns [EObject current=null] : iv_ruleNoEmendation= ruleNoEmendation EOF ;
    public final EObject entryRuleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1062:2: (iv_ruleNoEmendation= ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1063:2: iv_ruleNoEmendation= ruleNoEmendation EOF
            {
             newCompositeNode(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2699);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoEmendation2709); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1070:1: ruleNoEmendation returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars ) ;
    public final EObject ruleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_DisputableReading_2 = null;

        EObject this_Chars_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1073:28: ( (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1074:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1074:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1075:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoEmendation2756);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1085:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoEmendation2783);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1095:5: this_DisputableReading_2= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoEmendation2810);
                    this_DisputableReading_2=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1105:5: this_Chars_3= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoEmendation2837);
                    this_Chars_3=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_3; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1121:1: entryRuleDisputableReading returns [EObject current=null] : iv_ruleDisputableReading= ruleDisputableReading EOF ;
    public final EObject entryRuleDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1122:2: (iv_ruleDisputableReading= ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1123:2: iv_ruleDisputableReading= ruleDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading2872);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableReading2882); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1130:1: ruleDisputableReading returns [EObject current=null] : ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' ) ;
    public final EObject ruleDisputableReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1133:28: ( ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1134:1: ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1134:1: ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1134:2: () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1134:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1135:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleDisputableReading2928); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1144:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EGYSTRING||(LA12_0>=15 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1145:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1145:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1146:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading2949);
            	    lv_wChar_2_0=ruleNoDisputableReading();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisputableReadingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"NoDisputableReading");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleDisputableReading2962); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1174:1: entryRuleNoDisputableReading returns [EObject current=null] : iv_ruleNoDisputableReading= ruleNoDisputableReading EOF ;
    public final EObject entryRuleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1175:2: (iv_ruleNoDisputableReading= ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1176:2: iv_ruleNoDisputableReading= ruleNoDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading2998);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDisputableReading3008); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1183:1: ruleNoDisputableReading returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) ;
    public final EObject ruleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1186:28: ( (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1187:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1187:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt13=1;
                }
                break;
            case 22:
                {
                alt13=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1188:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDisputableReading3055);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1198:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDisputableReading3082);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1208:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDisputableReading3109);
                    this_Chars_2=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_2; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1224:1: entryRuleLacuna returns [EObject current=null] : iv_ruleLacuna= ruleLacuna EOF ;
    public final EObject entryRuleLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1225:2: (iv_ruleLacuna= ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1226:2: iv_ruleLacuna= ruleLacuna EOF
            {
             newCompositeNode(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_ruleLacuna_in_entryRuleLacuna3144);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLacuna3154); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1233:1: ruleLacuna returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' ) ;
    public final EObject ruleLacuna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1236:28: ( ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1237:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1237:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1237:2: () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1237:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLacunaAccess().getLacunaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleLacuna3200); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1247:1: ( (lv_wChar_2_0= ruleNoLacuna ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EGYSTRING||(LA14_0>=15 && LA14_0<=22)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1248:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1248:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1249:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoLacuna_in_ruleLacuna3221);
            	    lv_wChar_2_0=ruleNoLacuna();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLacunaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"NoLacuna");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleLacuna3234); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1277:1: entryRuleNoLacuna returns [EObject current=null] : iv_ruleNoLacuna= ruleNoLacuna EOF ;
    public final EObject entryRuleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1278:2: (iv_ruleNoLacuna= ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1279:2: iv_ruleNoLacuna= ruleNoLacuna EOF
            {
             newCompositeNode(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna3270);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoLacuna3280); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1286:1: ruleNoLacuna returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) ;
    public final EObject ruleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1289:28: ( (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1290:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1290:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case RULE_EGYSTRING:
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
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1291:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoLacuna3327);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1301:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoLacuna3354);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1311:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoLacuna3381);
                    this_Chars_2=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_2; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1327:1: entryRuleDeletion returns [EObject current=null] : iv_ruleDeletion= ruleDeletion EOF ;
    public final EObject entryRuleDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1328:2: (iv_ruleDeletion= ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1329:2: iv_ruleDeletion= ruleDeletion EOF
            {
             newCompositeNode(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_ruleDeletion_in_entryRuleDeletion3416);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletion3426); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1336:1: ruleDeletion returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' ) ;
    public final EObject ruleDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1339:28: ( ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1340:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1340:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1340:2: () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1340:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1341:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletionAccess().getDeletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDeletion3472); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1350:1: ( (lv_wChar_2_0= ruleNoDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1351:1: (lv_wChar_2_0= ruleNoDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1351:1: (lv_wChar_2_0= ruleNoDeletion )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1352:3: lv_wChar_2_0= ruleNoDeletion
            {
             
            	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNoDeletion_in_ruleDeletion3493);
            lv_wChar_2_0=ruleNoDeletion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeletionRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_2_0, 
                    		"NoDeletion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDeletion3505); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1380:1: entryRuleNoDeletion returns [EObject current=null] : iv_ruleNoDeletion= ruleNoDeletion EOF ;
    public final EObject entryRuleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1381:2: (iv_ruleNoDeletion= ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1382:2: iv_ruleNoDeletion= ruleNoDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion3541);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDeletion3551); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1389:1: ruleNoDeletion returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1392:28: ( (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1393:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1393:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=15 && LA16_0<=21)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_EGYSTRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1394:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDeletion3598);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1404:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDeletion3625);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1420:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1421:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1422:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn3660);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpandedColumn3670); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1429:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1432:28: ( ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1433:1: ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1433:1: ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1433:2: () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1433:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1434:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleExpandedColumn3716); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1443:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1444:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1444:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1445:3: lv_wChar_2_0= ruleNoExpandedColumn
            {
             
            	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn3737);
            lv_wChar_2_0=ruleNoExpandedColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpandedColumnRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_2_0, 
                    		"NoExpandedColumn");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleExpandedColumn3749); 

                	newLeafNode(otherlv_3, grammarAccess.getExpandedColumnAccess().getGreaterThanSignGreaterThanSignKeyword_3());
                

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1473:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1474:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1475:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn3785);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpandedColumn3795); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1482:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1485:28: ( (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1486:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1486:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=15 && LA17_0<=21)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_EGYSTRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1487:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpandedColumn3842);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1497:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpandedColumn3869);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1513:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1514:2: (iv_ruleRasur= ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1515:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_ruleRasur_in_entryRuleRasur3904);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasur3914); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1522:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1525:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1526:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1526:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1526:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1526:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1527:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleRasur3960); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1536:1: ( (lv_wChar_2_0= ruleNoRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1537:1: (lv_wChar_2_0= ruleNoRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1537:1: (lv_wChar_2_0= ruleNoRasur )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1538:3: lv_wChar_2_0= ruleNoRasur
            {
             
            	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNoRasur_in_ruleRasur3981);
            lv_wChar_2_0=ruleNoRasur();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRasurRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_2_0, 
                    		"NoRasur");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleRasur3993); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1566:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1567:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1568:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_ruleNoRasur_in_entryRuleNoRasur4029);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRasur4039); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1575:1: ruleNoRasur returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1578:28: ( (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1579:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1579:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=15 && LA18_0<=21)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_EGYSTRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1580:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRasur4086);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1590:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRasur4113);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
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


    // $ANTLR start "entryRuleAncientExpanded"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1606:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1607:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1608:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded4148);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpanded4158); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1615:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1618:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1619:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1619:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1619:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1619:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1620:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleAncientExpanded4204); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1629:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1630:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1630:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1631:3: lv_wChar_2_0= ruleNoAncientExpanded
            {
             
            	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded4225);
            lv_wChar_2_0=ruleNoAncientExpanded();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAncientExpandedRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_2_0, 
                    		"NoAncientExpanded");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleAncientExpanded4237); 

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


    // $ANTLR start "entryRuleNoAncientExpanded"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1659:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1660:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1661:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded4273);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoAncientExpanded4283); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1668:1: ruleNoAncientExpanded returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1671:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1673:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleChars_in_ruleNoAncientExpanded4329);
            this_Chars_0=ruleChars();

            state._fsp--;

             
                    current = this_Chars_0; 
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
    // $ANTLR end "ruleNoAncientExpanded"


    // $ANTLR start "entryRuleRestorationOverRasur"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1689:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1690:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1691:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur4363);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasur4373); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1698:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1701:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1702:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1702:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1702:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1702:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1703:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleRestorationOverRasur4419); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1712:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1713:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1713:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1714:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            {
             
            	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur4440);
            lv_wChar_2_0=ruleNoRestorationOverRasur();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestorationOverRasurRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_2_0, 
                    		"NoRestorationOverRasur");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleRestorationOverRasur4452); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1742:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1743:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1744:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur4488);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRestorationOverRasur4498); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1751:1: ruleNoRestorationOverRasur returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1754:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1756:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleChars_in_ruleNoRestorationOverRasur4544);
            this_Chars_0=ruleChars();

            state._fsp--;

             
                    current = this_Chars_0; 
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
    // $ANTLR end "ruleNoRestorationOverRasur"


    // $ANTLR start "entryRulePartialDestruction"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1772:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1773:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1774:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction4578);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialDestruction4588); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1781:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1784:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1785:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1785:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1785:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1785:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1786:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePartialDestruction4634); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1795:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1796:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1796:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1797:3: lv_wChar_2_0= ruleNoPartialDestruction
            {
             
            	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction4655);
            lv_wChar_2_0=ruleNoPartialDestruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartialDestructionRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_2_0, 
                    		"NoPartialDestruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_rulePartialDestruction4667); 

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1825:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1826:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1827:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction4703);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoPartialDestruction4713); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1834:1: ruleNoPartialDestruction returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1837:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1839:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleChars_in_ruleNoPartialDestruction4759);
            this_Chars_0=ruleChars();

            state._fsp--;

             
                    current = this_Chars_0; 
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
    // $ANTLR end "ruleNoPartialDestruction"


    // $ANTLR start "entryRuleDestruction"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1855:1: entryRuleDestruction returns [EObject current=null] : iv_ruleDestruction= ruleDestruction EOF ;
    public final EObject entryRuleDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1856:2: (iv_ruleDestruction= ruleDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1857:2: iv_ruleDestruction= ruleDestruction EOF
            {
             newCompositeNode(grammarAccess.getDestructionRule()); 
            pushFollow(FOLLOW_ruleDestruction_in_entryRuleDestruction4793);
            iv_ruleDestruction=ruleDestruction();

            state._fsp--;

             current =iv_ruleDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestruction4803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestruction"


    // $ANTLR start "ruleDestruction"
    // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1864:1: ruleDestruction returns [EObject current=null] : ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' ) ;
    public final EObject ruleDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1867:28: ( ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1868:1: ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1868:1: ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1868:2: () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--'
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1868:2: ()
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1869:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDestructionAccess().getDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleDestruction4849); 

                	newLeafNode(otherlv_1, grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1878:1: ( (lv_comment_2_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1879:1: (lv_comment_2_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1879:1: (lv_comment_2_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.dsl/src-gen/org/bbaw/bts/corpus/text/egy/dsl/parser/antlr/internal/InternalEgyBts.g:1880:3: lv_comment_2_0= RULE_EGYSTRING
            {
            lv_comment_2_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_ruleDestruction4866); 

            			newLeafNode(lv_comment_2_0, grammarAccess.getDestructionAccess().getCommentEGYSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDestructionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comment",
                    		lv_comment_2_0, 
                    		"EGYSTRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleDestruction4883); 

                	newLeafNode(otherlv_3, grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_3());
                

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
    // $ANTLR end "ruleDestruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent141 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent162 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleTextItem_in_entryRuleTextItem200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextItem210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleTextItem256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSentence337 = new BitSet(new long[]{0x000002AAAD7FC020L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence359 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleSentence372 = new BitSet(new long[]{0x000002AAAD7FC020L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence393 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSentence408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItem454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItem501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_ruleSentenceItem528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarker573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMarker610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMarker627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleMarker649 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMarker666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWord767 = new BitSet(new long[]{0x000002AAAD7F8022L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleWordMiddle861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleWordMiddle888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleWordMiddle915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_entryRuleChars950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChars960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleChars1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfix1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_ruleInterfix1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_ruleInterfix1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompountWords_in_ruleInterfix1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInterfixLexical1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInterfixFlexion1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInterfixSuffixPronomLexical1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInterfixPrefixNonLexical1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInterfixPrefixLexical1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompountWords_in_entryRuleInterfixCompountWords1755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompountWords1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInterfixCompountWords1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInterfixConnectionSyllabicGroup1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleBrackets1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleBrackets2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleBrackets2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleBrackets2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleBrackets2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleBrackets2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleBrackets2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleBrackets2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleBrackets2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleBrackets2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestruction_in_ruleBrackets2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpanded2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExpanded2357 = new BitSet(new long[]{0x000002AAADFF8020L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_ruleExpanded2378 = new BitSet(new long[]{0x000002AAADFF8020L});
    public static final BitSet FOLLOW_23_in_ruleExpanded2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpanded2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpanded2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmendation2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEmendation2629 = new BitSet(new long[]{0x000002AAAF7F8020L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_ruleEmendation2650 = new BitSet(new long[]{0x000002AAAF7F8020L});
    public static final BitSet FOLLOW_25_in_ruleEmendation2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoEmendation2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoEmendation2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoEmendation2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoEmendation2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading2872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDisputableReading2928 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading2949 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_26_in_ruleDisputableReading2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading2998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDisputableReading3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDisputableReading3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDisputableReading3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLacuna3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLacuna3200 = new BitSet(new long[]{0x000002AABD7F8020L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_ruleLacuna3221 = new BitSet(new long[]{0x000002AABD7F8020L});
    public static final BitSet FOLLOW_28_in_ruleLacuna3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoLacuna3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoLacuna3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoLacuna3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletion3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDeletion3472 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_ruleDeletion3493 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDeletion3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion3541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDeletion3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDeletion3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn3660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExpandedColumn3716 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn3737 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExpandedColumn3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn3785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpandedColumn3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpandedColumn3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur3904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasur3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRasur3960 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoRasur_in_ruleRasur3981 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRasur3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur4029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRasur4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRasur4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded4148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAncientExpanded4204 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded4225 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAncientExpanded4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur4363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRestorationOverRasur4419 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur4440 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRestorationOverRasur4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur4488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction4578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePartialDestruction4634 = new BitSet(new long[]{0x000002AAAD7F8020L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction4655 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePartialDestruction4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction4703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestruction_in_entryRuleDestruction4793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestruction4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDestruction4849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleDestruction4866 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDestruction4883 = new BitSet(new long[]{0x0000000000000002L});

}