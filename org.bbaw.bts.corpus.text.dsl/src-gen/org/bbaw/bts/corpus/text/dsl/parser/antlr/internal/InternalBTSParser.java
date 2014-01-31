package org.bbaw.bts.corpus.text.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.bbaw.bts.corpus.text.dsl.services.BTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBTSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EGYSTRING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00C2\\u00A7'", "' '", "'%'", "'; '", "'case '", "': '", "'@mv'", "'@v'", "'#'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'-'", "'~'", "'('", "')'", "'<'", "'>'", "'?'", "'['", "']'", "'{'", "'}'", "'<<'", "'>>'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "'--'"
    };
    public static final int RULE_ID=5;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EGYSTRING=4;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalBTSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBTSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBTSParser.tokenNames; }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g"; }



     	private BTSGrammarAccess grammarAccess;
     	
        public InternalBTSParser(TokenStream input, BTSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TextContent";	
       	}
       	
       	@Override
       	protected BTSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTextContent"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:67:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:68:2: (iv_ruleTextContent= ruleTextContent EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:69:2: iv_ruleTextContent= ruleTextContent EOF
            {
             newCompositeNode(grammarAccess.getTextContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextContent_in_entryRuleTextContent75);
            iv_ruleTextContent=ruleTextContent();

            state._fsp--;

             current =iv_ruleTextContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextContent85); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:76:1: ruleTextContent returns [EObject current=null] : ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;

        EObject lv_items_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:79:28: ( ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:2: () ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextContentAccess().getTextContentAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:2: ( ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:3: ( (lv_items_1_0= ruleTextItem ) ) ( (lv_items_2_0= ruleTextItem ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:3: ( (lv_items_1_0= ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:87:1: (lv_items_1_0= ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:87:1: (lv_items_1_0= ruleTextItem )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:88:3: lv_items_1_0= ruleTextItem
            {
             
            	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_ruleTextContent141);
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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:2: ( (lv_items_2_0= ruleTextItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:105:1: (lv_items_2_0= ruleTextItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:105:1: (lv_items_2_0= ruleTextItem )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:106:3: lv_items_2_0= ruleTextItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_ruleTextContent162);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:130:1: entryRuleTextItem returns [EObject current=null] : iv_ruleTextItem= ruleTextItem EOF ;
    public final EObject entryRuleTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:131:2: (iv_ruleTextItem= ruleTextItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:132:2: iv_ruleTextItem= ruleTextItem EOF
            {
             newCompositeNode(grammarAccess.getTextItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_entryRuleTextItem200);
            iv_ruleTextItem=ruleTextItem();

            state._fsp--;

             current =iv_ruleTextItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextItem210); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:139:1: ruleTextItem returns [EObject current=null] : this_Sentence_0= ruleSentence ;
    public final EObject ruleTextItem() throws RecognitionException {
        EObject current = null;

        EObject this_Sentence_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:142:28: (this_Sentence_0= ruleSentence )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:144:5: this_Sentence_0= ruleSentence
            {
             
                    newCompositeNode(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleTextItem256);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:160:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:161:2: (iv_ruleSentence= ruleSentence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:162:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_entryRuleSentence290);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentence300); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:169:1: ruleSentence returns [EObject current=null] : (otherlv_0= '\\u00C2\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00C2\\u00A7' ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:172:28: ( (otherlv_0= '\\u00C2\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00C2\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:173:1: (otherlv_0= '\\u00C2\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00C2\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:173:1: (otherlv_0= '\\u00C2\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:173:3: otherlv_0= '\\u00C2\\u00A7' ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* ) otherlv_4= '\\u00C2\\u00A7'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSentence337); 

                	newLeafNode(otherlv_0, grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:177:1: ( ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:177:2: ( (lv_items_1_0= ruleSentenceItem ) ) (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:177:2: ( (lv_items_1_0= ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:178:1: (lv_items_1_0= ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:178:1: (lv_items_1_0= ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:179:3: lv_items_1_0= ruleSentenceItem
            {
             
            	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_ruleSentence359);
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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:195:2: (otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:195:4: otherlv_2= ' ' ( (lv_items_3_0= ruleSentenceItem ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSentence372); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSentenceAccess().getSpaceKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:199:1: ( (lv_items_3_0= ruleSentenceItem ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:200:1: (lv_items_3_0= ruleSentenceItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:200:1: (lv_items_3_0= ruleSentenceItem )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:201:3: lv_items_3_0= ruleSentenceItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_ruleSentence393);
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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSentence408); 

                	newLeafNode(otherlv_4, grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_2());
                

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:229:1: entryRuleSentenceItem returns [EObject current=null] : iv_ruleSentenceItem= ruleSentenceItem EOF ;
    public final EObject entryRuleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:230:2: (iv_ruleSentenceItem= ruleSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:231:2: iv_ruleSentenceItem= ruleSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem444);
            iv_ruleSentenceItem=ruleSentenceItem();

            state._fsp--;

             current =iv_ruleSentenceItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentenceItem454); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:238:1: ruleSentenceItem returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) ;
    public final EObject ruleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;

        EObject this_Ambivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:241:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:242:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:242:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            int alt3=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_EGYSTRING:
            case 12:
            case 13:
            case 15:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 32:
            case 33:
            case 35:
            case 37:
            case 39:
            case 41:
            case 43:
            case 45:
            case 47:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||(LA3_2>=12 && LA3_2<=15)) ) {
                    alt3=1;
                }
                else if ( (LA3_2==16) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:243:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_ruleSentenceItem501);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:253:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_ruleSentenceItem528);
                    this_AbstractMarker_1=ruleAbstractMarker();

                    state._fsp--;

                     
                            current = this_AbstractMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:263:5: this_Ambivalence_2= ruleAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_ruleSentenceItem555);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:279:1: entryRuleAbstractMarker returns [EObject current=null] : iv_ruleAbstractMarker= ruleAbstractMarker EOF ;
    public final EObject entryRuleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:280:2: (iv_ruleAbstractMarker= ruleAbstractMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:281:2: iv_ruleAbstractMarker= ruleAbstractMarker EOF
            {
             newCompositeNode(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker590);
            iv_ruleAbstractMarker=ruleAbstractMarker();

            state._fsp--;

             current =iv_ruleAbstractMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMarker600); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:288:1: ruleAbstractMarker returns [EObject current=null] : (this_Marker_0= ruleMarker | ruleVersMarker ) ;
    public final EObject ruleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject this_Marker_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:291:28: ( (this_Marker_0= ruleMarker | ruleVersMarker ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:292:1: (this_Marker_0= ruleMarker | ruleVersMarker )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:292:1: (this_Marker_0= ruleMarker | ruleVersMarker )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:293:5: this_Marker_0= ruleMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMarker_in_ruleAbstractMarker647);
                    this_Marker_0=ruleMarker();

                    state._fsp--;

                     
                            current = this_Marker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:303:5: ruleVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_ruleAbstractMarker668);
                    ruleVersMarker();

                    state._fsp--;

                     
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:318:1: entryRuleAmbivalence returns [EObject current=null] : iv_ruleAmbivalence= ruleAmbivalence EOF ;
    public final EObject entryRuleAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:319:2: (iv_ruleAmbivalence= ruleAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:320:2: iv_ruleAmbivalence= ruleAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence703);
            iv_ruleAmbivalence=ruleAmbivalence();

            state._fsp--;

             current =iv_ruleAmbivalence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAmbivalence713); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:327:1: ruleAmbivalence returns [EObject current=null] : (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )* ) otherlv_4= '%' ) ;
    public final EObject ruleAmbivalence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cases_1_0 = null;

        EObject lv_cases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:330:28: ( (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )* ) otherlv_4= '%' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:331:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )* ) otherlv_4= '%' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:331:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )* ) otherlv_4= '%' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:331:3: otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )* ) otherlv_4= '%'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAmbivalence750); 

                	newLeafNode(otherlv_0, grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:335:1: ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:335:2: ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:335:2: ( (lv_cases_1_0= ruleCase ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:336:1: (lv_cases_1_0= ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:336:1: (lv_cases_1_0= ruleCase )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:337:3: lv_cases_1_0= ruleCase
            {
             
            	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_ruleAmbivalence772);
            lv_cases_1_0=ruleCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAmbivalenceRule());
            	        }
                   		add(
                   			current, 
                   			"cases",
                    		lv_cases_1_0, 
                    		"Case");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:353:2: (otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:353:4: otherlv_2= '; ' ( (lv_cases_3_0= ruleCase ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAmbivalence785); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAmbivalenceAccess().getSemicolonSpaceKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:357:1: ( (lv_cases_3_0= ruleCase ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:358:1: (lv_cases_3_0= ruleCase )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:358:1: (lv_cases_3_0= ruleCase )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:359:3: lv_cases_3_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCase_in_ruleAmbivalence806);
            	    lv_cases_3_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAmbivalenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_3_0, 
            	            		"Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAmbivalence821); 

                	newLeafNode(otherlv_4, grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2());
                

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:387:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:388:2: (iv_ruleCase= ruleCase EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:389:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_entryRuleCase857);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCase867); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:396:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case ' ( (lv_name_1_0= RULE_EGYSTRING ) ) otherlv_2= ': ' ( ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )* ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;

        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:399:28: ( (otherlv_0= 'case ' ( (lv_name_1_0= RULE_EGYSTRING ) ) otherlv_2= ': ' ( ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:400:1: (otherlv_0= 'case ' ( (lv_name_1_0= RULE_EGYSTRING ) ) otherlv_2= ': ' ( ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:400:1: (otherlv_0= 'case ' ( (lv_name_1_0= RULE_EGYSTRING ) ) otherlv_2= ': ' ( ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:400:3: otherlv_0= 'case ' ( (lv_name_1_0= RULE_EGYSTRING ) ) otherlv_2= ': ' ( ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )* )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCase904); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:404:1: ( (lv_name_1_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:405:1: (lv_name_1_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:405:1: (lv_name_1_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:406:3: lv_name_1_0= RULE_EGYSTRING
            {
            lv_name_1_0=(Token)match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_ruleCase921); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCaseAccess().getNameEGYSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EGYSTRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCase938); 

                	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonSpaceKeyword_2());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:426:1: ( ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:426:2: ( (lv_items_3_0= ruleSentenceItem ) ) (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:426:2: ( (lv_items_3_0= ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:427:1: (lv_items_3_0= ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:427:1: (lv_items_3_0= ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:428:3: lv_items_3_0= ruleSentenceItem
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_ruleCase960);
            lv_items_3_0=ruleSentenceItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_3_0, 
                    		"SentenceItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:444:2: (otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:444:4: otherlv_4= ' ' ( (lv_items_5_0= ruleSentenceItem ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCase973); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getSpaceKeyword_3_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:448:1: ( (lv_items_5_0= ruleSentenceItem ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:449:1: (lv_items_5_0= ruleSentenceItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:449:1: (lv_items_5_0= ruleSentenceItem )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:450:3: lv_items_5_0= ruleSentenceItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_ruleCase994);
            	    lv_items_5_0=ruleSentenceItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_5_0, 
            	            		"SentenceItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "entryRuleVersMarker"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:474:1: entryRuleVersMarker returns [String current=null] : iv_ruleVersMarker= ruleVersMarker EOF ;
    public final String entryRuleVersMarker() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:475:2: (iv_ruleVersMarker= ruleVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:476:2: iv_ruleVersMarker= ruleVersMarker EOF
            {
             newCompositeNode(grammarAccess.getVersMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_entryRuleVersMarker1034);
            iv_ruleVersMarker=ruleVersMarker();

            state._fsp--;

             current =iv_ruleVersMarker.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersMarker1045); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:483:1: ruleVersMarker returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker ) ;
    public final AntlrDatatypeRuleToken ruleVersMarker() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VersbreakMarker_0 = null;

        AntlrDatatypeRuleToken this_VersFrontierMarker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:486:28: ( (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:487:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:487:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:488:5: this_VersbreakMarker_0= ruleVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1092);
                    this_VersbreakMarker_0=ruleVersbreakMarker();

                    state._fsp--;


                    		current.merge(this_VersbreakMarker_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:500:5: this_VersFrontierMarker_1= ruleVersFrontierMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1125);
                    this_VersFrontierMarker_1=ruleVersFrontierMarker();

                    state._fsp--;


                    		current.merge(this_VersFrontierMarker_1);
                        
                     
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


    // $ANTLR start "entryRuleVersFrontierMarker"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:518:1: entryRuleVersFrontierMarker returns [String current=null] : iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF ;
    public final String entryRuleVersFrontierMarker() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersFrontierMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:519:2: (iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:520:2: iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF
            {
             newCompositeNode(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker1171);
            iv_ruleVersFrontierMarker=ruleVersFrontierMarker();

            state._fsp--;

             current =iv_ruleVersFrontierMarker.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersFrontierMarker1182); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:527:1: ruleVersFrontierMarker returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '@mv' ;
    public final AntlrDatatypeRuleToken ruleVersFrontierMarker() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:530:28: (kw= '@mv' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:532:2: kw= '@mv'
            {
            kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVersFrontierMarker1219); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersFrontierMarkerAccess().getMvKeyword()); 
                

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:545:1: entryRuleVersbreakMarker returns [String current=null] : iv_ruleVersbreakMarker= ruleVersbreakMarker EOF ;
    public final String entryRuleVersbreakMarker() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersbreakMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:546:2: (iv_ruleVersbreakMarker= ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:547:2: iv_ruleVersbreakMarker= ruleVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker1259);
            iv_ruleVersbreakMarker=ruleVersbreakMarker();

            state._fsp--;

             current =iv_ruleVersbreakMarker.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersbreakMarker1270); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:554:1: ruleVersbreakMarker returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '@v' ;
    public final AntlrDatatypeRuleToken ruleVersbreakMarker() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:557:28: (kw= '@v' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:559:2: kw= '@v'
            {
            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleVersbreakMarker1307); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersbreakMarkerAccess().getVKeyword()); 
                

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


    // $ANTLR start "entryRuleMarker"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:572:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:573:2: (iv_ruleMarker= ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:574:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMarker_in_entryRuleMarker1346);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarker1356); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:581:1: ruleMarker returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= RULE_EGYSTRING ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:584:28: ( (otherlv_0= '#' ( (lv_type_1_0= RULE_EGYSTRING ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:585:1: (otherlv_0= '#' ( (lv_type_1_0= RULE_EGYSTRING ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:585:1: (otherlv_0= '#' ( (lv_type_1_0= RULE_EGYSTRING ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:585:3: otherlv_0= '#' ( (lv_type_1_0= RULE_EGYSTRING ) ) ( (lv_name_2_0= RULE_EGYSTRING ) ) otherlv_3= '#'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMarker1393); 

                	newLeafNode(otherlv_0, grammarAccess.getMarkerAccess().getNumberSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:589:1: ( (lv_type_1_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:590:1: (lv_type_1_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:590:1: (lv_type_1_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:591:3: lv_type_1_0= RULE_EGYSTRING
            {
            lv_type_1_0=(Token)match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_ruleMarker1410); 

            			newLeafNode(lv_type_1_0, grammarAccess.getMarkerAccess().getTypeEGYSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"EGYSTRING");
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:607:2: ( (lv_name_2_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:608:1: (lv_name_2_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:608:1: (lv_name_2_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:609:3: lv_name_2_0= RULE_EGYSTRING
            {
            lv_name_2_0=(Token)match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_ruleMarker1432); 

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

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMarker1449); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:637:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:638:2: (iv_ruleWord= ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:639:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWord_in_entryRuleWord1485);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWord1495); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:646:1: ruleWord returns [EObject current=null] : ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:649:28: ( ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:650:1: ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:650:1: ( () ( (lv_wChar_1_0= ruleWordMiddle ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:650:2: () ( (lv_wChar_1_0= ruleWordMiddle ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:650:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:651:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWordAccess().getWordAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:656:2: ( (lv_wChar_1_0= ruleWordMiddle ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_EGYSTRING||(LA8_0>=21 && LA8_0<=28)||LA8_0==30||(LA8_0>=32 && LA8_0<=33)||LA8_0==35||LA8_0==37||LA8_0==39||LA8_0==41||LA8_0==43||LA8_0==45||LA8_0==47) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:657:1: (lv_wChar_1_0= ruleWordMiddle )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:657:1: (lv_wChar_1_0= ruleWordMiddle )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:658:3: lv_wChar_1_0= ruleWordMiddle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordMiddleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_ruleWord1550);
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
            	    break loop8;
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:682:1: entryRuleWordMiddle returns [EObject current=null] : iv_ruleWordMiddle= ruleWordMiddle EOF ;
    public final EObject entryRuleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMiddle = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:683:2: (iv_ruleWordMiddle= ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:684:2: iv_ruleWordMiddle= ruleWordMiddle EOF
            {
             newCompositeNode(grammarAccess.getWordMiddleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle1587);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWordMiddle1597); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:691:1: ruleWordMiddle returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars ) ;
    public final EObject ruleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Brackets_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:694:28: ( (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:695:1: (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:695:1: (this_Interfix_0= ruleInterfix | this_Brackets_1= ruleBrackets | this_Chars_2= ruleChars )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
            case 30:
            case 32:
            case 33:
            case 35:
            case 37:
            case 39:
            case 41:
            case 43:
            case 45:
            case 47:
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
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:696:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleWordMiddle1644);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:706:5: this_Brackets_1= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_ruleWordMiddle1671);
                    this_Brackets_1=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:716:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleWordMiddle1698);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:732:1: entryRuleChars returns [EObject current=null] : iv_ruleChars= ruleChars EOF ;
    public final EObject entryRuleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChars = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:733:2: (iv_ruleChars= ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:734:2: iv_ruleChars= ruleChars EOF
            {
             newCompositeNode(grammarAccess.getCharsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_entryRuleChars1733);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChars1743); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:741:1: ruleChars returns [EObject current=null] : ( (lv_name_0_0= RULE_EGYSTRING ) ) ;
    public final EObject ruleChars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:744:28: ( ( (lv_name_0_0= RULE_EGYSTRING ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:745:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:745:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:746:1: (lv_name_0_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:746:1: (lv_name_0_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:747:3: lv_name_0_0= RULE_EGYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_ruleChars1784); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:771:1: entryRuleInterfix returns [EObject current=null] : iv_ruleInterfix= ruleInterfix EOF ;
    public final EObject entryRuleInterfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfix = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:772:2: (iv_ruleInterfix= ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:773:2: iv_ruleInterfix= ruleInterfix EOF
            {
             newCompositeNode(grammarAccess.getInterfixRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_entryRuleInterfix1824);
            iv_ruleInterfix=ruleInterfix();

            state._fsp--;

             current =iv_ruleInterfix; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfix1834); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:780:1: ruleInterfix returns [EObject current=null] : (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup ) ;
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
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:783:28: ( (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:784:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:784:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixCompountWords_5= ruleInterfixCompountWords | this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            case 27:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:785:5: this_InterfixFlexion_0= ruleInterfixFlexion
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixFlexion_in_ruleInterfix1881);
                    this_InterfixFlexion_0=ruleInterfixFlexion();

                    state._fsp--;

                     
                            current = this_InterfixFlexion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:795:5: this_InterfixLexical_1= ruleInterfixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixLexical_in_ruleInterfix1908);
                    this_InterfixLexical_1=ruleInterfixLexical();

                    state._fsp--;

                     
                            current = this_InterfixLexical_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:805:5: this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix1935);
                    this_InterfixSuffixPronomLexical_2=ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     
                            current = this_InterfixSuffixPronomLexical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:815:5: this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix1962);
                    this_InterfixPrefixNonLexical_3=ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixNonLexical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:825:5: this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix1989);
                    this_InterfixPrefixLexical_4=ruleInterfixPrefixLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixLexical_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:835:5: this_InterfixCompountWords_5= ruleInterfixCompountWords
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixCompountWordsParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixCompountWords_in_ruleInterfix2016);
                    this_InterfixCompountWords_5=ruleInterfixCompountWords();

                    state._fsp--;

                     
                            current = this_InterfixCompountWords_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:845:5: this_InterfixConnectionSyllabicGroup_6= ruleInterfixConnectionSyllabicGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix2043);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:861:1: entryRuleInterfixLexical returns [EObject current=null] : iv_ruleInterfixLexical= ruleInterfixLexical EOF ;
    public final EObject entryRuleInterfixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:862:2: (iv_ruleInterfixLexical= ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:863:2: iv_ruleInterfixLexical= ruleInterfixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical2078);
            iv_ruleInterfixLexical=ruleInterfixLexical();

            state._fsp--;

             current =iv_ruleInterfixLexical; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixLexical2088); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:870:1: ruleInterfixLexical returns [EObject current=null] : ( () otherlv_1= ',' ) ;
    public final EObject ruleInterfixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:873:28: ( ( () otherlv_1= ',' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:874:1: ( () otherlv_1= ',' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:874:1: ( () otherlv_1= ',' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:874:2: () otherlv_1= ','
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:874:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:875:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInterfixLexical2134); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:892:1: entryRuleInterfixFlexion returns [EObject current=null] : iv_ruleInterfixFlexion= ruleInterfixFlexion EOF ;
    public final EObject entryRuleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixFlexion = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:893:2: (iv_ruleInterfixFlexion= ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:894:2: iv_ruleInterfixFlexion= ruleInterfixFlexion EOF
            {
             newCompositeNode(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion2170);
            iv_ruleInterfixFlexion=ruleInterfixFlexion();

            state._fsp--;

             current =iv_ruleInterfixFlexion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixFlexion2180); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:901:1: ruleInterfixFlexion returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:904:28: ( ( () otherlv_1= '.' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:905:1: ( () otherlv_1= '.' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:905:1: ( () otherlv_1= '.' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:905:2: () otherlv_1= '.'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:905:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:906:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInterfixFlexion2226); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:923:1: entryRuleInterfixSuffixPronomLexical returns [EObject current=null] : iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF ;
    public final EObject entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixSuffixPronomLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:924:2: (iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:925:2: iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical2262);
            iv_ruleInterfixSuffixPronomLexical=ruleInterfixSuffixPronomLexical();

            state._fsp--;

             current =iv_ruleInterfixSuffixPronomLexical; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical2272); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:932:1: ruleInterfixSuffixPronomLexical returns [EObject current=null] : ( () otherlv_1= '\\u2261' ) ;
    public final EObject ruleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:935:28: ( ( () otherlv_1= '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:936:1: ( () otherlv_1= '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:936:1: ( () otherlv_1= '\\u2261' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:936:2: () otherlv_1= '\\u2261'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:936:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:937:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInterfixSuffixPronomLexical2318); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:954:1: entryRuleInterfixPrefixNonLexical returns [EObject current=null] : iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF ;
    public final EObject entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixNonLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:955:2: (iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:956:2: iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical2354);
            iv_ruleInterfixPrefixNonLexical=ruleInterfixPrefixNonLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixNonLexical; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical2364); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:963:1: ruleInterfixPrefixNonLexical returns [EObject current=null] : ( () otherlv_1= ':' ) ;
    public final EObject ruleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:966:28: ( ( () otherlv_1= ':' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:967:1: ( () otherlv_1= ':' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:967:1: ( () otherlv_1= ':' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:967:2: () otherlv_1= ':'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:967:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:968:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInterfixPrefixNonLexical2410); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:985:1: entryRuleInterfixPrefixLexical returns [EObject current=null] : iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF ;
    public final EObject entryRuleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:986:2: (iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:987:2: iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical2446);
            iv_ruleInterfixPrefixLexical=ruleInterfixPrefixLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixLexical; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixPrefixLexical2456); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:994:1: ruleInterfixPrefixLexical returns [EObject current=null] : ( () otherlv_1= '\\u22EE' ) ;
    public final EObject ruleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:997:28: ( ( () otherlv_1= '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:998:1: ( () otherlv_1= '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:998:1: ( () otherlv_1= '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:998:2: () otherlv_1= '\\u22EE'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:998:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:999:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInterfixPrefixLexical2502); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1016:1: entryRuleInterfixCompountWords returns [EObject current=null] : iv_ruleInterfixCompountWords= ruleInterfixCompountWords EOF ;
    public final EObject entryRuleInterfixCompountWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixCompountWords = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1017:2: (iv_ruleInterfixCompountWords= ruleInterfixCompountWords EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1018:2: iv_ruleInterfixCompountWords= ruleInterfixCompountWords EOF
            {
             newCompositeNode(grammarAccess.getInterfixCompountWordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixCompountWords_in_entryRuleInterfixCompountWords2538);
            iv_ruleInterfixCompountWords=ruleInterfixCompountWords();

            state._fsp--;

             current =iv_ruleInterfixCompountWords; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixCompountWords2548); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1025:1: ruleInterfixCompountWords returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleInterfixCompountWords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1028:28: ( ( () otherlv_1= '-' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1029:1: ( () otherlv_1= '-' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1029:1: ( () otherlv_1= '-' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1029:2: () otherlv_1= '-'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1029:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1030:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixCompountWordsAccess().getInterfixCompountWordsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfixCompountWords2594); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1047:1: entryRuleInterfixConnectionSyllabicGroup returns [EObject current=null] : iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF ;
    public final EObject entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixConnectionSyllabicGroup = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1048:2: (iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1049:2: iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup2630);
            iv_ruleInterfixConnectionSyllabicGroup=ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             current =iv_ruleInterfixConnectionSyllabicGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup2640); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1056:1: ruleInterfixConnectionSyllabicGroup returns [EObject current=null] : ( () otherlv_1= '~' ) ;
    public final EObject ruleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1059:28: ( ( () otherlv_1= '~' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1060:1: ( () otherlv_1= '~' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1060:1: ( () otherlv_1= '~' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1060:2: () otherlv_1= '~'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1060:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1061:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInterfixConnectionSyllabicGroup2686); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1078:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1079:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1080:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_entryRuleBrackets2722);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrackets2732); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1087:1: ruleBrackets returns [EObject current=null] : (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction ) ;
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
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1090:28: ( (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1091:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1091:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction )
            int alt11=11;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 43:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            case 33:
                {
                alt11=7;
                }
                break;
            case 35:
                {
                alt11=8;
                }
                break;
            case 37:
                {
                alt11=9;
                }
                break;
            case 45:
                {
                alt11=10;
                }
                break;
            case 47:
                {
                alt11=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1092:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRasur_in_ruleBrackets2779);
                    this_Rasur_0=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1102:5: this_AncientExpanded_1= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_ruleBrackets2806);
                    this_AncientExpanded_1=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1112:5: this_RestorationOverRasur_2= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_ruleBrackets2833);
                    this_RestorationOverRasur_2=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1122:5: this_Expanded_3= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleBrackets2860);
                    this_Expanded_3=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1132:5: this_DisputableReading_4= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_ruleBrackets2887);
                    this_DisputableReading_4=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1142:5: this_Emendation_5= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_ruleBrackets2914);
                    this_Emendation_5=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1152:5: this_Lacuna_6= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_ruleBrackets2941);
                    this_Lacuna_6=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1162:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_ruleBrackets2968);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1172:5: this_ExpandedColumn_8= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_ruleBrackets2995);
                    this_ExpandedColumn_8=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1182:5: this_PartialDestruction_9= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_ruleBrackets3022);
                    this_PartialDestruction_9=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1192:5: this_Destruction_10= ruleDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_ruleBrackets3049);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1208:1: entryRuleExpanded returns [EObject current=null] : iv_ruleExpanded= ruleExpanded EOF ;
    public final EObject entryRuleExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1209:2: (iv_ruleExpanded= ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1210:2: iv_ruleExpanded= ruleExpanded EOF
            {
             newCompositeNode(grammarAccess.getExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_entryRuleExpanded3084);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpanded3094); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1217:1: ruleExpanded returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' ) ;
    public final EObject ruleExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1220:28: ( ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1221:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1221:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1221:2: () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )* otherlv_3= ')'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1221:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1222:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExpanded3140); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1231:1: ( (lv_wChar_2_0= ruleNoExpanded ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EGYSTRING||(LA12_0>=21 && LA12_0<=27)||LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1232:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1232:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1233:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_ruleExpanded3161);
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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleExpanded3174); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1261:1: entryRuleNoExpanded returns [EObject current=null] : iv_ruleNoExpanded= ruleNoExpanded EOF ;
    public final EObject entryRuleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1262:2: (iv_ruleNoExpanded= ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1263:2: iv_ruleNoExpanded= ruleNoExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded3210);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpanded3220); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1270:1: ruleNoExpanded returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars ) ;
    public final EObject ruleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_DisputableReading_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1273:28: ( (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1274:1: (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1274:1: (this_Interfix_0= ruleInterfix | this_DisputableReading_1= ruleDisputableReading | this_Chars_2= ruleChars )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt13=1;
                }
                break;
            case 32:
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
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1275:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoExpanded3267);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1285:5: this_DisputableReading_1= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_ruleNoExpanded3294);
                    this_DisputableReading_1=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1295:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoExpanded3321);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1311:1: entryRuleEmendation returns [EObject current=null] : iv_ruleEmendation= ruleEmendation EOF ;
    public final EObject entryRuleEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1312:2: (iv_ruleEmendation= ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1313:2: iv_ruleEmendation= ruleEmendation EOF
            {
             newCompositeNode(grammarAccess.getEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_entryRuleEmendation3356);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmendation3366); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1320:1: ruleEmendation returns [EObject current=null] : ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' ) ;
    public final EObject ruleEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1323:28: ( ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1324:1: ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1324:1: ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1324:2: () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )* otherlv_3= '>'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1324:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1325:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationAccess().getEmendationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEmendation3412); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLessThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1334:1: ( (lv_wChar_2_0= ruleNoEmendation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EGYSTRING||(LA14_0>=21 && LA14_0<=28)||LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1335:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1335:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1336:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_ruleEmendation3433);
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
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEmendation3446); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1364:1: entryRuleNoEmendation returns [EObject current=null] : iv_ruleNoEmendation= ruleNoEmendation EOF ;
    public final EObject entryRuleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1365:2: (iv_ruleNoEmendation= ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1366:2: iv_ruleNoEmendation= ruleNoEmendation EOF
            {
             newCompositeNode(grammarAccess.getNoEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation3482);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoEmendation3492); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1373:1: ruleNoEmendation returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars ) ;
    public final EObject ruleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_DisputableReading_2 = null;

        EObject this_Chars_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1376:28: ( (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1377:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1377:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_DisputableReading_2= ruleDisputableReading | this_Chars_3= ruleChars )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1378:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoEmendation3539);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1388:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoEmendation3566);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1398:5: this_DisputableReading_2= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_ruleNoEmendation3593);
                    this_DisputableReading_2=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1408:5: this_Chars_3= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoEmendation3620);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1424:1: entryRuleDisputableReading returns [EObject current=null] : iv_ruleDisputableReading= ruleDisputableReading EOF ;
    public final EObject entryRuleDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1425:2: (iv_ruleDisputableReading= ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1426:2: iv_ruleDisputableReading= ruleDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading3655);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisputableReading3665); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1433:1: ruleDisputableReading returns [EObject current=null] : ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' ) ;
    public final EObject ruleDisputableReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1436:28: ( ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1437:1: ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1437:1: ( () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1437:2: () otherlv_1= '?' ( (lv_wChar_2_0= ruleNoDisputableReading ) )* otherlv_3= '?'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1437:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1438:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDisputableReading3711); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1447:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EGYSTRING||(LA16_0>=21 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1448:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1448:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1449:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading3732);
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
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDisputableReading3745); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1477:1: entryRuleNoDisputableReading returns [EObject current=null] : iv_ruleNoDisputableReading= ruleNoDisputableReading EOF ;
    public final EObject entryRuleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1478:2: (iv_ruleNoDisputableReading= ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1479:2: iv_ruleNoDisputableReading= ruleNoDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading3781);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDisputableReading3791); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1486:1: ruleNoDisputableReading returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) ;
    public final EObject ruleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1489:28: ( (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1490:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1490:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1491:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoDisputableReading3838);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1501:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoDisputableReading3865);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1511:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoDisputableReading3892);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1527:1: entryRuleLacuna returns [EObject current=null] : iv_ruleLacuna= ruleLacuna EOF ;
    public final EObject entryRuleLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1528:2: (iv_ruleLacuna= ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1529:2: iv_ruleLacuna= ruleLacuna EOF
            {
             newCompositeNode(grammarAccess.getLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_entryRuleLacuna3927);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLacuna3937); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1536:1: ruleLacuna returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' ) ;
    public final EObject ruleLacuna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1539:28: ( ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1540:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1540:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1540:2: () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )* otherlv_3= ']'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1540:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1541:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLacunaAccess().getLacunaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleLacuna3983); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1550:1: ( (lv_wChar_2_0= ruleNoLacuna ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_EGYSTRING||(LA18_0>=21 && LA18_0<=28)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1551:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1551:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1552:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_ruleLacuna4004);
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
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLacuna4017); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1580:1: entryRuleNoLacuna returns [EObject current=null] : iv_ruleNoLacuna= ruleNoLacuna EOF ;
    public final EObject entryRuleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1581:2: (iv_ruleNoLacuna= ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1582:2: iv_ruleNoLacuna= ruleNoLacuna EOF
            {
             newCompositeNode(grammarAccess.getNoLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna4053);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoLacuna4063); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1589:1: ruleNoLacuna returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) ;
    public final EObject ruleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Chars_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1592:28: ( (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1593:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1593:1: (this_Interfix_0= ruleInterfix | this_Expanded_1= ruleExpanded | this_Chars_2= ruleChars )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt19=1;
                }
                break;
            case 28:
                {
                alt19=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1594:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoLacuna4110);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1604:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoLacuna4137);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1614:5: this_Chars_2= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoLacuna4164);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1630:1: entryRuleDeletion returns [EObject current=null] : iv_ruleDeletion= ruleDeletion EOF ;
    public final EObject entryRuleDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1631:2: (iv_ruleDeletion= ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1632:2: iv_ruleDeletion= ruleDeletion EOF
            {
             newCompositeNode(grammarAccess.getDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_entryRuleDeletion4199);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeletion4209); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1639:1: ruleDeletion returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' ) ;
    public final EObject ruleDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1642:28: ( ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1643:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1643:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1643:2: () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) ) otherlv_3= '}'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1643:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1644:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletionAccess().getDeletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDeletion4255); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1653:1: ( (lv_wChar_2_0= ruleNoDeletion ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1654:1: (lv_wChar_2_0= ruleNoDeletion )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1654:1: (lv_wChar_2_0= ruleNoDeletion )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1655:3: lv_wChar_2_0= ruleNoDeletion
            {
             
            	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_ruleDeletion4276);
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

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDeletion4288); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1683:1: entryRuleNoDeletion returns [EObject current=null] : iv_ruleNoDeletion= ruleNoDeletion EOF ;
    public final EObject entryRuleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1684:2: (iv_ruleNoDeletion= ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1685:2: iv_ruleNoDeletion= ruleNoDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion4324);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDeletion4334); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1692:1: ruleNoDeletion returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1695:28: ( (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1696:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1696:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=21 && LA20_0<=27)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_EGYSTRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1697:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoDeletion4381);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1707:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoDeletion4408);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1723:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1724:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1725:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn4443);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpandedColumn4453); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1732:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1735:28: ( ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1736:1: ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1736:1: ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1736:2: () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) ) otherlv_3= '>>'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1736:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleExpandedColumn4499); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1746:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1747:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1747:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1748:3: lv_wChar_2_0= ruleNoExpandedColumn
            {
             
            	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn4520);
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

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleExpandedColumn4532); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1776:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1777:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1778:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn4568);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpandedColumn4578); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1785:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1788:28: ( (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1789:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1789:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=21 && LA21_0<=27)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_EGYSTRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1790:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoExpandedColumn4625);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1800:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoExpandedColumn4652);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1816:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1817:2: (iv_ruleRasur= ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1818:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRasur_in_entryRuleRasur4687);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRasur4697); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1825:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1828:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1829:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1829:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1829:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) ) otherlv_3= '}}'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1829:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1830:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRasur4743); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1839:1: ( (lv_wChar_2_0= ruleNoRasur ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1840:1: (lv_wChar_2_0= ruleNoRasur )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1840:1: (lv_wChar_2_0= ruleNoRasur )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1841:3: lv_wChar_2_0= ruleNoRasur
            {
             
            	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_ruleRasur4764);
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

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRasur4776); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1869:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1870:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1871:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_entryRuleNoRasur4812);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRasur4822); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1878:1: ruleNoRasur returns [EObject current=null] : (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Interfix_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1881:28: ( (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1882:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1882:1: (this_Interfix_0= ruleInterfix | this_Chars_1= ruleChars )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=21 && LA22_0<=27)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_EGYSTRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1883:5: this_Interfix_0= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_ruleNoRasur4869);
                    this_Interfix_0=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1893:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoRasur4896);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1909:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1910:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1911:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded4931);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAncientExpanded4941); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1918:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1921:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1922:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1922:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1922:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) ) otherlv_3= '))'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1922:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1923:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAncientExpanded4987); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1932:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1933:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1933:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1934:3: lv_wChar_2_0= ruleNoAncientExpanded
            {
             
            	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded5008);
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

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAncientExpanded5020); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1962:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1963:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1964:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded5056);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAncientExpanded5066); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1971:1: ruleNoAncientExpanded returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1974:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1976:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoAncientExpanded5112);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1992:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1993:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1994:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur5146);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestorationOverRasur5156); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2001:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2004:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2005:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2005:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2005:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) ) otherlv_3= ']]'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2005:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2006:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRestorationOverRasur5202); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2015:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2016:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2016:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2017:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            {
             
            	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur5223);
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

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRestorationOverRasur5235); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2045:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2046:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2047:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur5271);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRestorationOverRasur5281); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2054:1: ruleNoRestorationOverRasur returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2057:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2059:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoRestorationOverRasur5327);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2075:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2076:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2077:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction5361);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartialDestruction5371); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2084:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2087:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2088:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2088:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2088:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) ) otherlv_3= '\\u2E23'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2088:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2089:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePartialDestruction5417); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2098:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2099:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2099:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2100:3: lv_wChar_2_0= ruleNoPartialDestruction
            {
             
            	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction5438);
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

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulePartialDestruction5450); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2128:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2129:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2130:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction5486);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoPartialDestruction5496); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2137:1: ruleNoPartialDestruction returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2140:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2142:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoPartialDestruction5542);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2158:1: entryRuleDestruction returns [EObject current=null] : iv_ruleDestruction= ruleDestruction EOF ;
    public final EObject entryRuleDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2159:2: (iv_ruleDestruction= ruleDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2160:2: iv_ruleDestruction= ruleDestruction EOF
            {
             newCompositeNode(grammarAccess.getDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_entryRuleDestruction5576);
            iv_ruleDestruction=ruleDestruction();

            state._fsp--;

             current =iv_ruleDestruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDestruction5586); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2167:1: ruleDestruction returns [EObject current=null] : ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' ) ;
    public final EObject ruleDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2170:28: ( ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2171:1: ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2171:1: ( () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2171:2: () otherlv_1= '--' ( (lv_comment_2_0= RULE_EGYSTRING ) ) otherlv_3= '--'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2171:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2172:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDestructionAccess().getDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDestruction5632); 

                	newLeafNode(otherlv_1, grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2181:1: ( (lv_comment_2_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2182:1: (lv_comment_2_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2182:1: (lv_comment_2_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2183:3: lv_comment_2_0= RULE_EGYSTRING
            {
            lv_comment_2_0=(Token)match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_ruleDestruction5649); 

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

            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDestruction5666); 

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextContent85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent141 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent162 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleTextItem_in_entryRuleTextItem200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextItem210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleTextItem256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentence300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleSentence337 = new BitSet(new long[]{0x0000AAAB5FFC4010L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence359 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_ruleSentence372 = new BitSet(new long[]{0x0000AAAB5FFC4010L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence393 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleSentence408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItem454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItem501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItem528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmbivalence_in_ruleSentenceItem555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMarker600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_ruleAbstractMarker647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersMarker_in_ruleAbstractMarker668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence703 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAmbivalence713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleAmbivalence750 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence772 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAmbivalence785 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence806 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAmbivalence821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCase_in_entryRuleCase857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCase867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleCase904 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleCase921 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCase938 = new BitSet(new long[]{0x0000AAAB5FFC4010L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_ruleCase960 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleCase973 = new BitSet(new long[]{0x0000AAAB5FFC4010L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_ruleCase994 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleVersMarker_in_entryRuleVersMarker1034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersMarker1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker1171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleVersFrontierMarker1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker1259 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleVersbreakMarker1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker1346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarker1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleMarker1393 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleMarker1410 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleMarker1432 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMarker1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_entryRuleWord1485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWord1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWord1550 = new BitSet(new long[]{0x0000AAAB5FE00012L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle1587 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleWordMiddle1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_ruleWordMiddle1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleWordMiddle1698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_entryRuleChars1733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChars1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleChars1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix1824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfix1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixFlexion_in_ruleInterfix1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixLexical_in_ruleInterfix1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix1962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix1989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixCompountWords_in_ruleInterfix2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical2078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical2088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleInterfixLexical2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion2170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleInterfixFlexion2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical2262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical2272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInterfixSuffixPronomLexical2318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical2354 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical2364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInterfixPrefixNonLexical2410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical2446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInterfixPrefixLexical2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixCompountWords_in_entryRuleInterfixCompountWords2538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompountWords2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInterfixCompountWords2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup2630 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleInterfixConnectionSyllabicGroup2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets2722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrackets2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_ruleBrackets2779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleBrackets2806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleBrackets2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleBrackets2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_ruleBrackets2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_ruleBrackets2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_ruleBrackets2941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_ruleBrackets2968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleBrackets2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_ruleBrackets3022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_ruleBrackets3049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded3084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpanded3094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleExpanded3140 = new BitSet(new long[]{0x0000AAAB7FE00010L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_ruleExpanded3161 = new BitSet(new long[]{0x0000AAAB7FE00010L});
        public static final BitSet FOLLOW_29_in_ruleExpanded3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded3210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded3220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpanded3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpanded3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded3321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation3356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmendation3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEmendation3412 = new BitSet(new long[]{0x0000AAABDFE00010L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_ruleEmendation3433 = new BitSet(new long[]{0x0000AAABDFE00010L});
        public static final BitSet FOLLOW_31_in_ruleEmendation3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation3482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation3492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoEmendation3539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoEmendation3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoEmendation3593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoEmendation3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading3655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading3665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDisputableReading3711 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading3732 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_32_in_ruleDisputableReading3745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading3781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading3791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDisputableReading3838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDisputableReading3865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoDisputableReading3892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna3927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLacuna3937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleLacuna3983 = new BitSet(new long[]{0x0000AAAF5FE00010L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_ruleLacuna4004 = new BitSet(new long[]{0x0000AAAF5FE00010L});
        public static final BitSet FOLLOW_34_in_ruleLacuna4017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna4053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna4063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoLacuna4110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoLacuna4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoLacuna4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion4199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeletion4209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleDeletion4255 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_ruleDeletion4276 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleDeletion4288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion4324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDeletion4381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoDeletion4408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn4443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn4453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleExpandedColumn4499 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn4520 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleExpandedColumn4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn4568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpandedColumn4625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoExpandedColumn4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur4687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRasur4697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleRasur4743 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoRasur_in_ruleRasur4764 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRasur4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur4812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur4822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRasur4869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoRasur4896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded4931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded4941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAncientExpanded4987 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded5008 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleAncientExpanded5020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded5056 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded5066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded5112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur5146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur5156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleRestorationOverRasur5202 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur5223 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleRestorationOverRasur5235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur5271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction5361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePartialDestruction5417 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction5438 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_rulePartialDestruction5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction5486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction5496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction5542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_entryRuleDestruction5576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDestruction5586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleDestruction5632 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleDestruction5649 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleDestruction5666 = new BitSet(new long[]{0x0000000000000002L});
    }


}