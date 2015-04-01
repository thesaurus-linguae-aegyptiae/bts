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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_CASESTRING", "RULE_BETWEEN_HASHES", "RULE_BETWEEN_MINUS", "RULE_EGYSTRING", "' '", "'\\u00A7'", "'%'", "'| '", "'\\u2E2E\\uDB80\\uDC80?'", "'{\\uDB80\\uDC80}'", "'[\\uDB80\\uDC80]'", "'\\u2329\\uDB80\\uDC80\\u232A'", "'[[\\uDB80\\uDC80]]'", "'((\\uDB80\\uDC80))'", "'{{\\uDB80\\uDC80}}'", "'\\uDB80\\uDC81'", "'\\uDB80\\uDC80'", "'\\uDB80\\uDC82'", "'='", "'\\uD80C\\uDE58'", "'\\uD80C\\uDE82'", "'\\uD80C\\uDF79'", "'\\uD80C\\uDF7A'", "'\\uD80C\\uDE86'", "'\\uD80C\\uDE87'", "'('", "')'", "'\\u2329'", "'\\u232A'", "'\\u2E2E'", "'?'", "'['", "']'", "'{'", "'}'", "'\\u2329\\u2329'", "'\\u232A\\u232A'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'~'", "'-'", "';'"
    };
    public static final int RULE_BETWEEN_MINUS=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_NEWLINE=4;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_CASESTRING=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_EGYSTRING=8;
    public static final int T__39=39;
    public static final int RULE_BETWEEN_HASHES=6;

    // delegates
    // delegators


        public InternalEgyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEgyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEgyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g"; }



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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:67:1: entryRuleTextContent returns [EObject current=null] : iv_ruleTextContent= ruleTextContent EOF ;
    public final EObject entryRuleTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextContent = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:68:2: (iv_ruleTextContent= ruleTextContent EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:69:2: iv_ruleTextContent= ruleTextContent EOF
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:76:1: ruleTextContent returns [EObject current=null] : ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_NEWLINE_3=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:79:28: ( ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:2: () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextContentAccess().getTextContentAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:86:2: ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:86:3: ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:86:3: ( (lv_items_1_0= ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:87:1: (lv_items_1_0= ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:87:1: (lv_items_1_0= ruleTextItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:88:3: lv_items_1_0= ruleTextItem
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

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:104:2: ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NEWLINE||(LA2_0>=9 && LA2_0<=10)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:104:3: (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:104:3: (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )?
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
            	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:104:5: otherlv_2= ' '
            	            {
            	            otherlv_2=(Token)match(input,9,FOLLOW_9_in_ruleTextContent155); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:109:6: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleTextContent172); 
            	             
            	                newLeafNode(this_NEWLINE_3, grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:113:3: ( (lv_items_4_0= ruleTextItem ) )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:114:1: (lv_items_4_0= ruleTextItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:114:1: (lv_items_4_0= ruleTextItem )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:115:3: lv_items_4_0= ruleTextItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextItem_in_ruleTextContent194);
            	    lv_items_4_0=ruleTextItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_4_0, 
            	            		"TextItem");
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:139:1: entryRuleTextItem returns [EObject current=null] : iv_ruleTextItem= ruleTextItem EOF ;
    public final EObject entryRuleTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:140:2: (iv_ruleTextItem= ruleTextItem EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:141:2: iv_ruleTextItem= ruleTextItem EOF
            {
             newCompositeNode(grammarAccess.getTextItemRule()); 
            pushFollow(FOLLOW_ruleTextItem_in_entryRuleTextItem233);
            iv_ruleTextItem=ruleTextItem();

            state._fsp--;

             current =iv_ruleTextItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextItem243); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:148:1: ruleTextItem returns [EObject current=null] : this_Sentence_0= ruleSentence ;
    public final EObject ruleTextItem() throws RecognitionException {
        EObject current = null;

        EObject this_Sentence_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:151:28: (this_Sentence_0= ruleSentence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:153:5: this_Sentence_0= ruleSentence
            {
             
                    newCompositeNode(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSentence_in_ruleTextItem289);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:169:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:170:2: (iv_ruleSentence= ruleSentence EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:171:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence323);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence333); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:178:1: ruleSentence returns [EObject current=null] : ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:181:28: ( ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:182:1: ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:182:1: ( () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:182:2: () otherlv_1= '\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00A7'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:182:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:183:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSentenceAccess().getSentenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,10,FOLLOW_10_in_ruleSentence379); 

                	newLeafNode(otherlv_1, grammarAccess.getSentenceAccess().getSectionSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:192:1: ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_BETWEEN_HASHES && LA5_0<=RULE_EGYSTRING)||LA5_0==11||(LA5_0>=13 && LA5_0<=24)||LA5_0==26||LA5_0==28||LA5_0==30||LA5_0==32||LA5_0==34||LA5_0==36||LA5_0==38||LA5_0==40||LA5_0==42||LA5_0==44||LA5_0==46||LA5_0==48||(LA5_0>=50 && LA5_0<=57)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:192:2: ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )*
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:192:2: ( (lv_items_2_0= ruleSentenceItem ) )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:193:1: (lv_items_2_0= ruleSentenceItem )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:193:1: (lv_items_2_0= ruleSentenceItem )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:194:3: lv_items_2_0= ruleSentenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSentenceItem_in_ruleSentence401);
                    lv_items_2_0=ruleSentenceItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_2_0, 
                            		"SentenceItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:210:2: (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==9) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:210:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleSentence414); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:214:1: (this_NEWLINE_4= RULE_NEWLINE )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_NEWLINE) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:214:2: this_NEWLINE_4= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleSentence426); 
                    	             
                    	                newLeafNode(this_NEWLINE_4, grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:218:3: ( (lv_items_5_0= ruleSentenceItem ) )
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:219:1: (lv_items_5_0= ruleSentenceItem )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:219:1: (lv_items_5_0= ruleSentenceItem )
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:220:3: lv_items_5_0= ruleSentenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSentenceItem_in_ruleSentence448);
                    	    lv_items_5_0=ruleSentenceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,10,FOLLOW_10_in_ruleSentence464); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:248:1: entryRuleSentenceItem returns [EObject current=null] : iv_ruleSentenceItem= ruleSentenceItem EOF ;
    public final EObject entryRuleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:249:2: (iv_ruleSentenceItem= ruleSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:250:2: iv_ruleSentenceItem= ruleSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemRule()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem500);
            iv_ruleSentenceItem=ruleSentenceItem();

            state._fsp--;

             current =iv_ruleSentenceItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItem510); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:257:1: ruleSentenceItem returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) ;
    public final EObject ruleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;

        EObject this_Ambivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:260:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:261:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:261:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
            case 23:
            case 24:
            case 26:
            case 28:
            case 30:
            case 32:
            case 34:
            case 36:
            case 38:
            case 40:
            case 42:
            case 44:
            case 46:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt6=1;
                }
                break;
            case RULE_BETWEEN_HASHES:
            case RULE_BETWEEN_MINUS:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:262:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleSentenceItem557);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:272:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractMarker_in_ruleSentenceItem584);
                    this_AbstractMarker_1=ruleAbstractMarker();

                    state._fsp--;

                     
                            current = this_AbstractMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:282:5: this_Ambivalence_2= ruleAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAmbivalence_in_ruleSentenceItem611);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:298:1: entryRuleAbstractMarker returns [EObject current=null] : iv_ruleAbstractMarker= ruleAbstractMarker EOF ;
    public final EObject entryRuleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:299:2: (iv_ruleAbstractMarker= ruleAbstractMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:300:2: iv_ruleAbstractMarker= ruleAbstractMarker EOF
            {
             newCompositeNode(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker646);
            iv_ruleAbstractMarker=ruleAbstractMarker();

            state._fsp--;

             current =iv_ruleAbstractMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractMarker656); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:307:1: ruleAbstractMarker returns [EObject current=null] : (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker ) ;
    public final EObject ruleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject this_Marker_0 = null;

        EObject this_VersMarker_1 = null;

        EObject this_DestructionMarker_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:310:28: ( (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:311:1: (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:311:1: (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker | this_DestructionMarker_2= ruleDestructionMarker )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_BETWEEN_HASHES:
                {
                alt7=1;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:312:5: this_Marker_0= ruleMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMarker_in_ruleAbstractMarker703);
                    this_Marker_0=ruleMarker();

                    state._fsp--;

                     
                            current = this_Marker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:322:5: this_VersMarker_1= ruleVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVersMarker_in_ruleAbstractMarker730);
                    this_VersMarker_1=ruleVersMarker();

                    state._fsp--;

                     
                            current = this_VersMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:332:5: this_DestructionMarker_2= ruleDestructionMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getDestructionMarkerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDestructionMarker_in_ruleAbstractMarker757);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:348:1: entryRuleAmbivalence returns [EObject current=null] : iv_ruleAmbivalence= ruleAmbivalence EOF ;
    public final EObject entryRuleAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:349:2: (iv_ruleAmbivalence= ruleAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:350:2: iv_ruleAmbivalence= ruleAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence792);
            iv_ruleAmbivalence=ruleAmbivalence();

            state._fsp--;

             current =iv_ruleAmbivalence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAmbivalence802); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:357:1: ruleAmbivalence returns [EObject current=null] : (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:360:28: ( (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:361:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:361:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:361:3: otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAmbivalence839); 

                	newLeafNode(otherlv_0, grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:365:1: ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:365:2: ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:365:2: ( (lv_cases_1_0= ruleCase ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:366:1: (lv_cases_1_0= ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:366:1: (lv_cases_1_0= ruleCase )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:367:3: lv_cases_1_0= ruleCase
            {
             
            	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCase_in_ruleAmbivalence861);
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

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:383:2: (otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+
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
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:383:4: otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAmbivalence874); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAmbivalenceAccess().getVerticalLineSpaceKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:387:1: (this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_NEWLINE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:387:2: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleAmbivalence886); 
            	             
            	                newLeafNode(this_NEWLINE_3, grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:391:3: ( (lv_cases_4_0= ruleCase ) )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:392:1: (lv_cases_4_0= ruleCase )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:392:1: (lv_cases_4_0= ruleCase )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:393:3: lv_cases_4_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCase_in_ruleAmbivalence908);
            	    lv_cases_4_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAmbivalenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_4_0, 
            	            		"Case");
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

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleAmbivalence923); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:421:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:422:2: (iv_ruleCase= ruleCase EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:423:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase959);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase969); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:430:1: ruleCase returns [EObject current=null] : ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:433:28: ( ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:434:1: ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:434:1: ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:434:2: ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:434:2: ( (lv_name_0_0= RULE_CASESTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:435:1: (lv_name_0_0= RULE_CASESTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:435:1: (lv_name_0_0= RULE_CASESTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:436:3: lv_name_0_0= RULE_CASESTRING
            {
            lv_name_0_0=(Token)match(input,RULE_CASESTRING,FOLLOW_RULE_CASESTRING_in_ruleCase1011); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCaseAccess().getNameCASESTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"CASESTRING");
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:452:2: (this_NEWLINE_1= RULE_NEWLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NEWLINE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:452:3: this_NEWLINE_1= RULE_NEWLINE
                    {
                    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleCase1028); 
                     
                        newLeafNode(this_NEWLINE_1, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:456:3: ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:456:4: ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:456:4: ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:457:1: (lv_items_2_0= ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:457:1: (lv_items_2_0= ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:458:3: lv_items_2_0= ruleSentenceItemNoAmbivalence
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1051);
            lv_items_2_0=ruleSentenceItemNoAmbivalence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_2_0, 
                    		"SentenceItemNoAmbivalence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:474:2: (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==9) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:474:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleCase1064); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:478:1: (this_NEWLINE_4= RULE_NEWLINE )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_NEWLINE) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:478:2: this_NEWLINE_4= RULE_NEWLINE
            	            {
            	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleCase1076); 
            	             
            	                newLeafNode(this_NEWLINE_4, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:482:3: ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:483:1: (lv_items_5_0= ruleSentenceItemNoAmbivalence )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:483:1: (lv_items_5_0= ruleSentenceItemNoAmbivalence )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:484:3: lv_items_5_0= ruleSentenceItemNoAmbivalence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1098);
            	    lv_items_5_0=ruleSentenceItemNoAmbivalence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_5_0, 
            	            		"SentenceItemNoAmbivalence");
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:508:1: entryRuleSentenceItemNoAmbivalence returns [EObject current=null] : iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF ;
    public final EObject entryRuleSentenceItemNoAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItemNoAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:509:2: (iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:510:2: iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence1137);
            iv_ruleSentenceItemNoAmbivalence=ruleSentenceItemNoAmbivalence();

            state._fsp--;

             current =iv_ruleSentenceItemNoAmbivalence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence1147); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:517:1: ruleSentenceItemNoAmbivalence returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker ) ;
    public final EObject ruleSentenceItemNoAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:520:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:521:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:521:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EGYSTRING||(LA13_0>=23 && LA13_0<=24)||LA13_0==26||LA13_0==28||LA13_0==30||LA13_0==32||LA13_0==34||LA13_0==36||LA13_0==38||LA13_0==40||LA13_0==42||LA13_0==44||LA13_0==46||LA13_0==48||(LA13_0>=50 && LA13_0<=57)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_BETWEEN_HASHES && LA13_0<=RULE_BETWEEN_MINUS)||(LA13_0>=13 && LA13_0<=22)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:522:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleSentenceItemNoAmbivalence1194);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:532:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractMarker_in_ruleSentenceItemNoAmbivalence1221);
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


    // $ANTLR start "entryRuleVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:548:1: entryRuleVersMarker returns [EObject current=null] : iv_ruleVersMarker= ruleVersMarker EOF ;
    public final EObject entryRuleVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:549:2: (iv_ruleVersMarker= ruleVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:550:2: iv_ruleVersMarker= ruleVersMarker EOF
            {
             newCompositeNode(grammarAccess.getVersMarkerRule()); 
            pushFollow(FOLLOW_ruleVersMarker_in_entryRuleVersMarker1256);
            iv_ruleVersMarker=ruleVersMarker();

            state._fsp--;

             current =iv_ruleVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersMarker1266); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:557:1: ruleVersMarker returns [EObject current=null] : (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker ) ;
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


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:560:28: ( (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:561:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:561:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker | this_MissingVersMarker_3= ruleMissingVersMarker | this_DestroyedVersMarker_4= ruleDestroyedVersMarker | this_DeletedVersMarker_5= ruleDeletedVersMarker | this_DisputableVersMarker_6= ruleDisputableVersMarker | this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker | this_AncientExpandedMarker_8= ruleAncientExpandedMarker | this_RasurMarker_9= ruleRasurMarker )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 22:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            case 15:
                {
                alt14=5;
                }
                break;
            case 14:
                {
                alt14=6;
                }
                break;
            case 13:
                {
                alt14=7;
                }
                break;
            case 17:
                {
                alt14=8;
                }
                break;
            case 18:
                {
                alt14=9;
                }
                break;
            case 19:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:562:5: this_VersbreakMarker_0= ruleVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1313);
                    this_VersbreakMarker_0=ruleVersbreakMarker();

                    state._fsp--;

                     
                            current = this_VersbreakMarker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:572:5: this_VersFrontierMarker_1= ruleVersFrontierMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1340);
                    this_VersFrontierMarker_1=ruleVersFrontierMarker();

                    state._fsp--;

                     
                            current = this_VersFrontierMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:582:5: this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_ruleVersMarker1367);
                    this_BrokenVersbreakMarker_2=ruleBrokenVersbreakMarker();

                    state._fsp--;

                     
                            current = this_BrokenVersbreakMarker_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:592:5: this_MissingVersMarker_3= ruleMissingVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getMissingVersMarkerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMissingVersMarker_in_ruleVersMarker1394);
                    this_MissingVersMarker_3=ruleMissingVersMarker();

                    state._fsp--;

                     
                            current = this_MissingVersMarker_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:602:5: this_DestroyedVersMarker_4= ruleDestroyedVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDestroyedVersMarkerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDestroyedVersMarker_in_ruleVersMarker1421);
                    this_DestroyedVersMarker_4=ruleDestroyedVersMarker();

                    state._fsp--;

                     
                            current = this_DestroyedVersMarker_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:612:5: this_DeletedVersMarker_5= ruleDeletedVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDeletedVersMarkerParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeletedVersMarker_in_ruleVersMarker1448);
                    this_DeletedVersMarker_5=ruleDeletedVersMarker();

                    state._fsp--;

                     
                            current = this_DeletedVersMarker_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:622:5: this_DisputableVersMarker_6= ruleDisputableVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getDisputableVersMarkerParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDisputableVersMarker_in_ruleVersMarker1475);
                    this_DisputableVersMarker_6=ruleDisputableVersMarker();

                    state._fsp--;

                     
                            current = this_DisputableVersMarker_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:632:5: this_RestorationOverRasurMarker_7= ruleRestorationOverRasurMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getRestorationOverRasurMarkerParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasurMarker_in_ruleVersMarker1502);
                    this_RestorationOverRasurMarker_7=ruleRestorationOverRasurMarker();

                    state._fsp--;

                     
                            current = this_RestorationOverRasurMarker_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:642:5: this_AncientExpandedMarker_8= ruleAncientExpandedMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getAncientExpandedMarkerParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpandedMarker_in_ruleVersMarker1529);
                    this_AncientExpandedMarker_8=ruleAncientExpandedMarker();

                    state._fsp--;

                     
                            current = this_AncientExpandedMarker_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:652:5: this_RasurMarker_9= ruleRasurMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getRasurMarkerParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleRasurMarker_in_ruleVersMarker1556);
                    this_RasurMarker_9=ruleRasurMarker();

                    state._fsp--;

                     
                            current = this_RasurMarker_9; 
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


    // $ANTLR start "entryRuleDisputableVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:668:1: entryRuleDisputableVersMarker returns [EObject current=null] : iv_ruleDisputableVersMarker= ruleDisputableVersMarker EOF ;
    public final EObject entryRuleDisputableVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:669:2: (iv_ruleDisputableVersMarker= ruleDisputableVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:670:2: iv_ruleDisputableVersMarker= ruleDisputableVersMarker EOF
            {
             newCompositeNode(grammarAccess.getDisputableVersMarkerRule()); 
            pushFollow(FOLLOW_ruleDisputableVersMarker_in_entryRuleDisputableVersMarker1591);
            iv_ruleDisputableVersMarker=ruleDisputableVersMarker();

            state._fsp--;

             current =iv_ruleDisputableVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableVersMarker1601); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:677:1: ruleDisputableVersMarker returns [EObject current=null] : ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' ) ;
    public final EObject ruleDisputableVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:680:28: ( ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:681:1: ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:681:1: ( () otherlv_1= '\\u2E2E\\uDB80\\uDC80?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:681:2: () otherlv_1= '\\u2E2E\\uDB80\\uDC80?'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:681:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:682:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableVersMarkerAccess().getDisputableVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDisputableVersMarker1647); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:699:1: entryRuleDeletedVersMarker returns [EObject current=null] : iv_ruleDeletedVersMarker= ruleDeletedVersMarker EOF ;
    public final EObject entryRuleDeletedVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletedVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:700:2: (iv_ruleDeletedVersMarker= ruleDeletedVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:701:2: iv_ruleDeletedVersMarker= ruleDeletedVersMarker EOF
            {
             newCompositeNode(grammarAccess.getDeletedVersMarkerRule()); 
            pushFollow(FOLLOW_ruleDeletedVersMarker_in_entryRuleDeletedVersMarker1683);
            iv_ruleDeletedVersMarker=ruleDeletedVersMarker();

            state._fsp--;

             current =iv_ruleDeletedVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletedVersMarker1693); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:708:1: ruleDeletedVersMarker returns [EObject current=null] : ( () otherlv_1= '{\\uDB80\\uDC80}' ) ;
    public final EObject ruleDeletedVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:711:28: ( ( () otherlv_1= '{\\uDB80\\uDC80}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:712:1: ( () otherlv_1= '{\\uDB80\\uDC80}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:712:1: ( () otherlv_1= '{\\uDB80\\uDC80}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:712:2: () otherlv_1= '{\\uDB80\\uDC80}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:712:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:713:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletedVersMarkerAccess().getDeletedVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeletedVersMarker1739); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:730:1: entryRuleDestroyedVersMarker returns [EObject current=null] : iv_ruleDestroyedVersMarker= ruleDestroyedVersMarker EOF ;
    public final EObject entryRuleDestroyedVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroyedVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:731:2: (iv_ruleDestroyedVersMarker= ruleDestroyedVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:732:2: iv_ruleDestroyedVersMarker= ruleDestroyedVersMarker EOF
            {
             newCompositeNode(grammarAccess.getDestroyedVersMarkerRule()); 
            pushFollow(FOLLOW_ruleDestroyedVersMarker_in_entryRuleDestroyedVersMarker1775);
            iv_ruleDestroyedVersMarker=ruleDestroyedVersMarker();

            state._fsp--;

             current =iv_ruleDestroyedVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestroyedVersMarker1785); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:739:1: ruleDestroyedVersMarker returns [EObject current=null] : ( () otherlv_1= '[\\uDB80\\uDC80]' ) ;
    public final EObject ruleDestroyedVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:742:28: ( ( () otherlv_1= '[\\uDB80\\uDC80]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:743:1: ( () otherlv_1= '[\\uDB80\\uDC80]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:743:1: ( () otherlv_1= '[\\uDB80\\uDC80]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:743:2: () otherlv_1= '[\\uDB80\\uDC80]'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:743:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:744:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDestroyedVersMarkerAccess().getDestroyedVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDestroyedVersMarker1831); 

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


    // $ANTLR start "entryRuleMissingVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:761:1: entryRuleMissingVersMarker returns [EObject current=null] : iv_ruleMissingVersMarker= ruleMissingVersMarker EOF ;
    public final EObject entryRuleMissingVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissingVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:762:2: (iv_ruleMissingVersMarker= ruleMissingVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:763:2: iv_ruleMissingVersMarker= ruleMissingVersMarker EOF
            {
             newCompositeNode(grammarAccess.getMissingVersMarkerRule()); 
            pushFollow(FOLLOW_ruleMissingVersMarker_in_entryRuleMissingVersMarker1867);
            iv_ruleMissingVersMarker=ruleMissingVersMarker();

            state._fsp--;

             current =iv_ruleMissingVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMissingVersMarker1877); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:770:1: ruleMissingVersMarker returns [EObject current=null] : ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' ) ;
    public final EObject ruleMissingVersMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:773:28: ( ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:774:1: ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:774:1: ( () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:774:2: () otherlv_1= '\\u2329\\uDB80\\uDC80\\u232A'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:774:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:775:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMissingVersMarkerAccess().getMissingVersMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMissingVersMarker1923); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:792:1: entryRuleRestorationOverRasurMarker returns [EObject current=null] : iv_ruleRestorationOverRasurMarker= ruleRestorationOverRasurMarker EOF ;
    public final EObject entryRuleRestorationOverRasurMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasurMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:793:2: (iv_ruleRestorationOverRasurMarker= ruleRestorationOverRasurMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:794:2: iv_ruleRestorationOverRasurMarker= ruleRestorationOverRasurMarker EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurMarkerRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasurMarker_in_entryRuleRestorationOverRasurMarker1959);
            iv_ruleRestorationOverRasurMarker=ruleRestorationOverRasurMarker();

            state._fsp--;

             current =iv_ruleRestorationOverRasurMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasurMarker1969); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:801:1: ruleRestorationOverRasurMarker returns [EObject current=null] : ( () otherlv_1= '[[\\uDB80\\uDC80]]' ) ;
    public final EObject ruleRestorationOverRasurMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:804:28: ( ( () otherlv_1= '[[\\uDB80\\uDC80]]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:805:1: ( () otherlv_1= '[[\\uDB80\\uDC80]]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:805:1: ( () otherlv_1= '[[\\uDB80\\uDC80]]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:805:2: () otherlv_1= '[[\\uDB80\\uDC80]]'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:805:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:806:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurMarkerAccess().getRestorationOverRasurMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleRestorationOverRasurMarker2015); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:823:1: entryRuleAncientExpandedMarker returns [EObject current=null] : iv_ruleAncientExpandedMarker= ruleAncientExpandedMarker EOF ;
    public final EObject entryRuleAncientExpandedMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpandedMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:824:2: (iv_ruleAncientExpandedMarker= ruleAncientExpandedMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:825:2: iv_ruleAncientExpandedMarker= ruleAncientExpandedMarker EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedMarkerRule()); 
            pushFollow(FOLLOW_ruleAncientExpandedMarker_in_entryRuleAncientExpandedMarker2051);
            iv_ruleAncientExpandedMarker=ruleAncientExpandedMarker();

            state._fsp--;

             current =iv_ruleAncientExpandedMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpandedMarker2061); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:832:1: ruleAncientExpandedMarker returns [EObject current=null] : ( () otherlv_1= '((\\uDB80\\uDC80))' ) ;
    public final EObject ruleAncientExpandedMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:835:28: ( ( () otherlv_1= '((\\uDB80\\uDC80))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:836:1: ( () otherlv_1= '((\\uDB80\\uDC80))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:836:1: ( () otherlv_1= '((\\uDB80\\uDC80))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:836:2: () otherlv_1= '((\\uDB80\\uDC80))'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:836:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:837:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedMarkerAccess().getAncientExpandedMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAncientExpandedMarker2107); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:854:1: entryRuleRasurMarker returns [EObject current=null] : iv_ruleRasurMarker= ruleRasurMarker EOF ;
    public final EObject entryRuleRasurMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasurMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:855:2: (iv_ruleRasurMarker= ruleRasurMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:856:2: iv_ruleRasurMarker= ruleRasurMarker EOF
            {
             newCompositeNode(grammarAccess.getRasurMarkerRule()); 
            pushFollow(FOLLOW_ruleRasurMarker_in_entryRuleRasurMarker2143);
            iv_ruleRasurMarker=ruleRasurMarker();

            state._fsp--;

             current =iv_ruleRasurMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasurMarker2153); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:863:1: ruleRasurMarker returns [EObject current=null] : ( () otherlv_1= '{{\\uDB80\\uDC80}}' ) ;
    public final EObject ruleRasurMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:866:28: ( ( () otherlv_1= '{{\\uDB80\\uDC80}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:867:1: ( () otherlv_1= '{{\\uDB80\\uDC80}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:867:1: ( () otherlv_1= '{{\\uDB80\\uDC80}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:867:2: () otherlv_1= '{{\\uDB80\\uDC80}}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:867:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:868:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurMarkerAccess().getAncientExpandedMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRasurMarker2199); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:885:1: entryRuleVersFrontierMarker returns [EObject current=null] : iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF ;
    public final EObject entryRuleVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersFrontierMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:886:2: (iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:887:2: iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF
            {
             newCompositeNode(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker2235);
            iv_ruleVersFrontierMarker=ruleVersFrontierMarker();

            state._fsp--;

             current =iv_ruleVersFrontierMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersFrontierMarker2245); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:894:1: ruleVersFrontierMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC81' ) ;
    public final EObject ruleVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:897:28: ( ( () otherlv_1= '\\uDB80\\uDC81' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:898:1: ( () otherlv_1= '\\uDB80\\uDC81' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:898:1: ( () otherlv_1= '\\uDB80\\uDC81' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:898:2: () otherlv_1= '\\uDB80\\uDC81'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:898:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:899:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleVersFrontierMarker2291); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:916:1: entryRuleVersbreakMarker returns [EObject current=null] : iv_ruleVersbreakMarker= ruleVersbreakMarker EOF ;
    public final EObject entryRuleVersbreakMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersbreakMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:917:2: (iv_ruleVersbreakMarker= ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:918:2: iv_ruleVersbreakMarker= ruleVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker2327);
            iv_ruleVersbreakMarker=ruleVersbreakMarker();

            state._fsp--;

             current =iv_ruleVersbreakMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersbreakMarker2337); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:925:1: ruleVersbreakMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC80' ) ;
    public final EObject ruleVersbreakMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:928:28: ( ( () otherlv_1= '\\uDB80\\uDC80' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:929:1: ( () otherlv_1= '\\uDB80\\uDC80' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:929:1: ( () otherlv_1= '\\uDB80\\uDC80' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:929:2: () otherlv_1= '\\uDB80\\uDC80'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:929:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:930:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVersbreakMarker2383); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:947:1: entryRuleBrokenVersbreakMarker returns [EObject current=null] : iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF ;
    public final EObject entryRuleBrokenVersbreakMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrokenVersbreakMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:948:2: (iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:949:2: iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker2419);
            iv_ruleBrokenVersbreakMarker=ruleBrokenVersbreakMarker();

            state._fsp--;

             current =iv_ruleBrokenVersbreakMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker2429); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:956:1: ruleBrokenVersbreakMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC82' ) ;
    public final EObject ruleBrokenVersbreakMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:959:28: ( ( () otherlv_1= '\\uDB80\\uDC82' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:960:1: ( () otherlv_1= '\\uDB80\\uDC82' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:960:1: ( () otherlv_1= '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:960:2: () otherlv_1= '\\uDB80\\uDC82'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:960:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:961:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBrokenVersbreakMarker2475); 

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


    // $ANTLR start "entryRuleMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:978:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:979:2: (iv_ruleMarker= ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:980:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_ruleMarker_in_entryRuleMarker2511);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarker2521); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:987:1: ruleMarker returns [EObject current=null] : ( (lv_type_0_0= RULE_BETWEEN_HASHES ) ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:990:28: ( ( (lv_type_0_0= RULE_BETWEEN_HASHES ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:991:1: ( (lv_type_0_0= RULE_BETWEEN_HASHES ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:991:1: ( (lv_type_0_0= RULE_BETWEEN_HASHES ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:992:1: (lv_type_0_0= RULE_BETWEEN_HASHES )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:992:1: (lv_type_0_0= RULE_BETWEEN_HASHES )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:993:3: lv_type_0_0= RULE_BETWEEN_HASHES
            {
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_HASHES,FOLLOW_RULE_BETWEEN_HASHES_in_ruleMarker2562); 

            			newLeafNode(lv_type_0_0, grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"BETWEEN_HASHES");
            	    

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1017:1: entryRuleDestructionMarker returns [EObject current=null] : iv_ruleDestructionMarker= ruleDestructionMarker EOF ;
    public final EObject entryRuleDestructionMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1018:2: (iv_ruleDestructionMarker= ruleDestructionMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1019:2: iv_ruleDestructionMarker= ruleDestructionMarker EOF
            {
             newCompositeNode(grammarAccess.getDestructionMarkerRule()); 
            pushFollow(FOLLOW_ruleDestructionMarker_in_entryRuleDestructionMarker2602);
            iv_ruleDestructionMarker=ruleDestructionMarker();

            state._fsp--;

             current =iv_ruleDestructionMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestructionMarker2612); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1026:1: ruleDestructionMarker returns [EObject current=null] : ( (lv_type_0_0= RULE_BETWEEN_MINUS ) ) ;
    public final EObject ruleDestructionMarker() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1029:28: ( ( (lv_type_0_0= RULE_BETWEEN_MINUS ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1030:1: ( (lv_type_0_0= RULE_BETWEEN_MINUS ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1030:1: ( (lv_type_0_0= RULE_BETWEEN_MINUS ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1031:1: (lv_type_0_0= RULE_BETWEEN_MINUS )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1031:1: (lv_type_0_0= RULE_BETWEEN_MINUS )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1032:3: lv_type_0_0= RULE_BETWEEN_MINUS
            {
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_MINUS,FOLLOW_RULE_BETWEEN_MINUS_in_ruleDestructionMarker2653); 

            			newLeafNode(lv_type_0_0, grammarAccess.getDestructionMarkerAccess().getTypeBETWEEN_MINUSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDestructionMarkerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"BETWEEN_MINUS");
            	    

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1056:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1057:2: (iv_ruleWord= ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1058:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord2693);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord2703); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1065:1: ruleWord returns [EObject current=null] : ( () ( (lv_wChar_1_0= ruleWordPart ) )+ ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1068:28: ( ( () ( (lv_wChar_1_0= ruleWordPart ) )+ ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1069:1: ( () ( (lv_wChar_1_0= ruleWordPart ) )+ )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1069:1: ( () ( (lv_wChar_1_0= ruleWordPart ) )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1069:2: () ( (lv_wChar_1_0= ruleWordPart ) )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1069:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1070:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWordAccess().getWordAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1075:2: ( (lv_wChar_1_0= ruleWordPart ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EGYSTRING||(LA15_0>=23 && LA15_0<=24)||LA15_0==26||LA15_0==28||LA15_0==30||LA15_0==32||LA15_0==34||LA15_0==36||LA15_0==38||LA15_0==40||LA15_0==42||LA15_0==44||LA15_0==46||LA15_0==48||(LA15_0>=50 && LA15_0<=57)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1076:1: (lv_wChar_1_0= ruleWordPart )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1076:1: (lv_wChar_1_0= ruleWordPart )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1077:3: lv_wChar_1_0= ruleWordPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWordPart_in_ruleWord2758);
            	    lv_wChar_1_0=ruleWordPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWordRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"WordPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1101:1: entryRuleWordPart returns [EObject current=null] : iv_ruleWordPart= ruleWordPart EOF ;
    public final EObject entryRuleWordPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordPart = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1102:2: (iv_ruleWordPart= ruleWordPart EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1103:2: iv_ruleWordPart= ruleWordPart EOF
            {
             newCompositeNode(grammarAccess.getWordPartRule()); 
            pushFollow(FOLLOW_ruleWordPart_in_entryRuleWordPart2795);
            iv_ruleWordPart=ruleWordPart();

            state._fsp--;

             current =iv_ruleWordPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordPart2805); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1110:1: ruleWordPart returns [EObject current=null] : ( (otherlv_0= '=' )? ( (lv_wChar_1_0= ruleWordMiddle ) ) ) ;
    public final EObject ruleWordPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1113:28: ( ( (otherlv_0= '=' )? ( (lv_wChar_1_0= ruleWordMiddle ) ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:1: ( (otherlv_0= '=' )? ( (lv_wChar_1_0= ruleWordMiddle ) ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:1: ( (otherlv_0= '=' )? ( (lv_wChar_1_0= ruleWordMiddle ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:2: (otherlv_0= '=' )? ( (lv_wChar_1_0= ruleWordMiddle ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:2: (otherlv_0= '=' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleWordPart2843); 

                        	newLeafNode(otherlv_0, grammarAccess.getWordPartAccess().getEqualsSignKeyword_0());
                        

                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1118:3: ( (lv_wChar_1_0= ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1119:1: (lv_wChar_1_0= ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1119:1: (lv_wChar_1_0= ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1120:3: lv_wChar_1_0= ruleWordMiddle
            {
             
            	        newCompositeNode(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleWordMiddle_in_ruleWordPart2866);
            lv_wChar_1_0=ruleWordMiddle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWordPartRule());
            	        }
                   		set(
                   			current, 
                   			"wChar",
                    		lv_wChar_1_0, 
                    		"WordMiddle");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1144:1: entryRuleWordMiddle returns [EObject current=null] : iv_ruleWordMiddle= ruleWordMiddle EOF ;
    public final EObject entryRuleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMiddle = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1145:2: (iv_ruleWordMiddle= ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1146:2: iv_ruleWordMiddle= ruleWordMiddle EOF
            {
             newCompositeNode(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2902);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMiddle2912); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1153:1: ruleWordMiddle returns [EObject current=null] : (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) ;
    public final EObject ruleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject this_Brackets_0 = null;

        EObject this_Chars_1 = null;

        EObject this_Interfix_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1156:28: ( (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1157:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1157:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 24:
            case 26:
            case 28:
            case 30:
            case 32:
            case 34:
            case 36:
            case 38:
            case 40:
            case 42:
            case 44:
            case 46:
            case 48:
                {
                alt17=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt17=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1158:5: this_Brackets_0= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleWordMiddle2959);
                    this_Brackets_0=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1168:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleWordMiddle2986);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1178:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleWordMiddle3013);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1194:1: entryRuleChars returns [EObject current=null] : iv_ruleChars= ruleChars EOF ;
    public final EObject entryRuleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChars = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1195:2: (iv_ruleChars= ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1196:2: iv_ruleChars= ruleChars EOF
            {
             newCompositeNode(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_ruleChars_in_entryRuleChars3048);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChars3058); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1203:1: ruleChars returns [EObject current=null] : ( (lv_name_0_0= RULE_EGYSTRING ) ) ;
    public final EObject ruleChars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1206:28: ( ( (lv_name_0_0= RULE_EGYSTRING ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1207:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1207:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1208:1: (lv_name_0_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1208:1: (lv_name_0_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1209:3: lv_name_0_0= RULE_EGYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_ruleChars3099); 

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


    // $ANTLR start "entryRuleBrackets"
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1233:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1234:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1235:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets3139);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets3149); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1242:1: ruleBrackets returns [EObject current=null] : (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1245:28: ( (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1246:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1246:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech )
            int alt18=13;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 46:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            case 30:
                {
                alt18=5;
                }
                break;
            case 34:
                {
                alt18=6;
                }
                break;
            case 32:
                {
                alt18=7;
                }
                break;
            case 36:
                {
                alt18=8;
                }
                break;
            case 38:
                {
                alt18=9;
                }
                break;
            case 48:
                {
                alt18=10;
                }
                break;
            case 28:
                {
                alt18=11;
                }
                break;
            case 24:
                {
                alt18=12;
                }
                break;
            case 26:
                {
                alt18=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1247:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleBrackets3196);
                    this_Rasur_0=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1257:5: this_AncientExpanded_1= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleBrackets3223);
                    this_AncientExpanded_1=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1267:5: this_RestorationOverRasur_2= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleBrackets3250);
                    this_RestorationOverRasur_2=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1277:5: this_ExpandedColumn_3= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleBrackets3277);
                    this_ExpandedColumn_3=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1287:5: this_Expanded_4= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleBrackets3304);
                    this_Expanded_4=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1297:5: this_DisputableReading_5= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleBrackets3331);
                    this_DisputableReading_5=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1307:5: this_Emendation_6= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleBrackets3358);
                    this_Emendation_6=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1317:5: this_Lacuna_7= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleBrackets3385);
                    this_Lacuna_7=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1327:5: this_Deletion_8= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleBrackets3412);
                    this_Deletion_8=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1337:5: this_PartialDestruction_9= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleBrackets3439);
                    this_PartialDestruction_9=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1347:5: this_Cartouche_10= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleBrackets3466);
                    this_Cartouche_10=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1357:5: this_Oval_11= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleBrackets3493);
                    this_Oval_11=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1367:5: this_Serech_12= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getSerechParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleBrackets3520);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1383:1: entryRuleOval returns [EObject current=null] : iv_ruleOval= ruleOval EOF ;
    public final EObject entryRuleOval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOval = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1384:2: (iv_ruleOval= ruleOval EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1385:2: iv_ruleOval= ruleOval EOF
            {
             newCompositeNode(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_ruleOval_in_entryRuleOval3555);
            iv_ruleOval=ruleOval();

            state._fsp--;

             current =iv_ruleOval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOval3565); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1392:1: ruleOval returns [EObject current=null] : (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' ) ;
    public final EObject ruleOval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1395:28: ( (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1396:1: (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1396:1: (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1396:3: otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOval3602); 

                	newLeafNode(otherlv_0, grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1400:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EGYSTRING||LA19_0==30||LA19_0==32||LA19_0==34||LA19_0==36||LA19_0==38||LA19_0==40||LA19_0==42||LA19_0==44||LA19_0==46||LA19_0==48||(LA19_0>=50 && LA19_0<=57)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1401:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1401:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1402:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleOval3623);
            	    lv_wChar_1_0=ruleNoCartouche();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOvalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"NoCartouche");
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleOval3636); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1430:1: entryRuleSerech returns [EObject current=null] : iv_ruleSerech= ruleSerech EOF ;
    public final EObject entryRuleSerech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerech = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1431:2: (iv_ruleSerech= ruleSerech EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1432:2: iv_ruleSerech= ruleSerech EOF
            {
             newCompositeNode(grammarAccess.getSerechRule()); 
            pushFollow(FOLLOW_ruleSerech_in_entryRuleSerech3672);
            iv_ruleSerech=ruleSerech();

            state._fsp--;

             current =iv_ruleSerech; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSerech3682); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1439:1: ruleSerech returns [EObject current=null] : (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' ) ;
    public final EObject ruleSerech() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1442:28: ( (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1443:1: (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1443:1: (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1443:3: otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSerech3719); 

                	newLeafNode(otherlv_0, grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1447:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EGYSTRING||LA20_0==30||LA20_0==32||LA20_0==34||LA20_0==36||LA20_0==38||LA20_0==40||LA20_0==42||LA20_0==44||LA20_0==46||LA20_0==48||(LA20_0>=50 && LA20_0<=57)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1448:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1448:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1449:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleSerech3740);
            	    lv_wChar_1_0=ruleNoCartouche();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSerechRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_1_0, 
            	            		"NoCartouche");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSerech3753); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1477:1: entryRuleCartouche returns [EObject current=null] : iv_ruleCartouche= ruleCartouche EOF ;
    public final EObject entryRuleCartouche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartouche = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1478:2: (iv_ruleCartouche= ruleCartouche EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1479:2: iv_ruleCartouche= ruleCartouche EOF
            {
             newCompositeNode(grammarAccess.getCartoucheRule()); 
            pushFollow(FOLLOW_ruleCartouche_in_entryRuleCartouche3789);
            iv_ruleCartouche=ruleCartouche();

            state._fsp--;

             current =iv_ruleCartouche; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCartouche3799); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1486:1: ruleCartouche returns [EObject current=null] : ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' ) ;
    public final EObject ruleCartouche() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1489:28: ( ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1490:1: ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1490:1: ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1490:2: () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1490:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1491:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCartoucheAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCartouche3845); 

                	newLeafNode(otherlv_1, grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1500:1: ( (lv_wChar_2_0= ruleNoCartouche ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EGYSTRING||LA21_0==30||LA21_0==32||LA21_0==34||LA21_0==36||LA21_0==38||LA21_0==40||LA21_0==42||LA21_0==44||LA21_0==46||LA21_0==48||(LA21_0>=50 && LA21_0<=57)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1501:1: (lv_wChar_2_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1501:1: (lv_wChar_2_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1502:3: lv_wChar_2_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleCartouche3866);
            	    lv_wChar_2_0=ruleNoCartouche();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCartoucheRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"NoCartouche");
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCartouche3879); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1530:1: entryRuleNoCartouche returns [EObject current=null] : iv_ruleNoCartouche= ruleNoCartouche EOF ;
    public final EObject entryRuleNoCartouche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoCartouche = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1531:2: (iv_ruleNoCartouche= ruleNoCartouche EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1532:2: iv_ruleNoCartouche= ruleNoCartouche EOF
            {
             newCompositeNode(grammarAccess.getNoCartoucheRule()); 
            pushFollow(FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche3915);
            iv_ruleNoCartouche=ruleNoCartouche();

            state._fsp--;

             current =iv_ruleNoCartouche; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoCartouche3925); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1539:1: ruleNoCartouche returns [EObject current=null] : (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1542:28: ( (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1543:1: (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1543:1: (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix )
            int alt22=12;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt22=1;
                }
                break;
            case 42:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            case 40:
                {
                alt22=5;
                }
                break;
            case 30:
                {
                alt22=6;
                }
                break;
            case 34:
                {
                alt22=7;
                }
                break;
            case 32:
                {
                alt22=8;
                }
                break;
            case 36:
                {
                alt22=9;
                }
                break;
            case 38:
                {
                alt22=10;
                }
                break;
            case 48:
                {
                alt22=11;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt22=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1544:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoCartouche3972);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1554:5: this_Rasur_1= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleNoCartouche3999);
                    this_Rasur_1=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1564:5: this_AncientExpanded_2= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoCartouche4026);
                    this_AncientExpanded_2=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1574:5: this_RestorationOverRasur_3= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoCartouche4053);
                    this_RestorationOverRasur_3=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1584:5: this_ExpandedColumn_4= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleNoCartouche4080);
                    this_ExpandedColumn_4=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1594:5: this_Expanded_5= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoCartouche4107);
                    this_Expanded_5=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1604:5: this_DisputableReading_6= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoCartouche4134);
                    this_DisputableReading_6=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1614:5: this_Emendation_7= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoCartouche4161);
                    this_Emendation_7=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1624:5: this_Lacuna_8= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoCartouche4188);
                    this_Lacuna_8=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1634:5: this_Deletion_9= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoCartouche4215);
                    this_Deletion_9=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1644:5: this_PartialDestruction_10= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoCartouche4242);
                    this_PartialDestruction_10=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1654:5: this_Interfix_11= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getInterfixParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoCartouche4269);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1670:1: entryRuleExpanded returns [EObject current=null] : iv_ruleExpanded= ruleExpanded EOF ;
    public final EObject entryRuleExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1671:2: (iv_ruleExpanded= ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1672:2: iv_ruleExpanded= ruleExpanded EOF
            {
             newCompositeNode(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_ruleExpanded_in_entryRuleExpanded4304);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpanded4314); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1679:1: ruleExpanded returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) ;
    public final EObject ruleExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1682:28: ( ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1683:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1683:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1683:2: () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1683:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1684:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleExpanded4360); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1693:1: ( (lv_wChar_2_0= ruleNoExpanded ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EGYSTRING||LA23_0==34||(LA23_0>=50 && LA23_0<=57)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1694:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1694:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1695:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpanded_in_ruleExpanded4381);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleExpanded4394); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1723:1: entryRuleNoExpanded returns [EObject current=null] : iv_ruleNoExpanded= ruleNoExpanded EOF ;
    public final EObject entryRuleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1724:2: (iv_ruleNoExpanded= ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1725:2: iv_ruleNoExpanded= ruleNoExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded4430);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpanded4440); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1732:1: ruleNoExpanded returns [EObject current=null] : (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading ) ;
    public final EObject ruleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Interfix_1 = null;

        EObject this_DisputableReading_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1735:28: ( (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1736:1: (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1736:1: (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt24=1;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt24=2;
                }
                break;
            case 34:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1737:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpanded4487);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1747:5: this_Interfix_1= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpanded4514);
                    this_Interfix_1=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1757:5: this_DisputableReading_2= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpanded4541);
                    this_DisputableReading_2=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_2; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1773:1: entryRuleEmendation returns [EObject current=null] : iv_ruleEmendation= ruleEmendation EOF ;
    public final EObject entryRuleEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1774:2: (iv_ruleEmendation= ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1775:2: iv_ruleEmendation= ruleEmendation EOF
            {
             newCompositeNode(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_ruleEmendation_in_entryRuleEmendation4576);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmendation4586); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1782:1: ruleEmendation returns [EObject current=null] : ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' ) ;
    public final EObject ruleEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1785:28: ( ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1786:1: ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1786:1: ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1786:2: () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1786:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1787:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationAccess().getEmendationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleEmendation4632); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1796:1: ( (lv_wChar_2_0= ruleNoEmendation ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_EGYSTRING||LA25_0==30||LA25_0==34||(LA25_0>=50 && LA25_0<=57)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1797:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1797:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1798:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoEmendation_in_ruleEmendation4653);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleEmendation4666); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1826:1: entryRuleNoEmendation returns [EObject current=null] : iv_ruleNoEmendation= ruleNoEmendation EOF ;
    public final EObject entryRuleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1827:2: (iv_ruleNoEmendation= ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1828:2: iv_ruleNoEmendation= ruleNoEmendation EOF
            {
             newCompositeNode(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation4702);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoEmendation4712); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1835:1: ruleNoEmendation returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1838:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1839:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1839:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt26=1;
                }
                break;
            case 30:
                {
                alt26=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt26=3;
                }
                break;
            case 34:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1840:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoEmendation4759);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1850:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoEmendation4786);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1860:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoEmendation4813);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1870:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoEmendation4840);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1886:1: entryRuleDisputableReading returns [EObject current=null] : iv_ruleDisputableReading= ruleDisputableReading EOF ;
    public final EObject entryRuleDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1887:2: (iv_ruleDisputableReading= ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1888:2: iv_ruleDisputableReading= ruleDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading4875);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableReading4885); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1895:1: ruleDisputableReading returns [EObject current=null] : ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) ;
    public final EObject ruleDisputableReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1898:28: ( ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1899:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1899:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1899:2: () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1899:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1900:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDisputableReading4931); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1909:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EGYSTRING||LA27_0==30||LA27_0==32||LA27_0==36||LA27_0==38||LA27_0==40||LA27_0==42||LA27_0==44||LA27_0==46||LA27_0==48||(LA27_0>=50 && LA27_0<=57)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1910:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1910:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1911:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading4952);
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleDisputableReading4965); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1939:1: entryRuleNoDisputableReading returns [EObject current=null] : iv_ruleNoDisputableReading= ruleNoDisputableReading EOF ;
    public final EObject entryRuleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1940:2: (iv_ruleNoDisputableReading= ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1941:2: iv_ruleNoDisputableReading= ruleNoDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading5001);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDisputableReading5011); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1948:1: ruleNoDisputableReading returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1951:28: ( (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1952:1: (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1952:1: (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix )
            int alt28=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt28=1;
                }
                break;
            case 32:
                {
                alt28=2;
                }
                break;
            case 38:
                {
                alt28=3;
                }
                break;
            case 42:
                {
                alt28=4;
                }
                break;
            case 44:
                {
                alt28=5;
                }
                break;
            case 46:
                {
                alt28=6;
                }
                break;
            case 40:
                {
                alt28=7;
                }
                break;
            case 36:
                {
                alt28=8;
                }
                break;
            case 48:
                {
                alt28=9;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt28=10;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt28=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1953:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDisputableReading5058);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1963:5: this_Emendation_1= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoDisputableReading5085);
                    this_Emendation_1=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1973:5: this_Deletion_2= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoDisputableReading5112);
                    this_Deletion_2=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1983:5: this_Rasur_3= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleNoDisputableReading5139);
                    this_Rasur_3=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1993:5: this_AncientExpanded_4= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoDisputableReading5166);
                    this_AncientExpanded_4=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2003:5: this_RestorationOverRasur_5= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoDisputableReading5193);
                    this_RestorationOverRasur_5=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2013:5: this_ExpandedColumn_6= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleNoDisputableReading5220);
                    this_ExpandedColumn_6=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2023:5: this_Lacuna_7= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoDisputableReading5247);
                    this_Lacuna_7=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2033:5: this_PartialDestruction_8= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoDisputableReading5274);
                    this_PartialDestruction_8=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2043:5: this_Chars_9= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDisputableReading5301);
                    this_Chars_9=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2053:5: this_Interfix_10= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDisputableReading5328);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:1: entryRuleLacuna returns [EObject current=null] : iv_ruleLacuna= ruleLacuna EOF ;
    public final EObject entryRuleLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2070:2: (iv_ruleLacuna= ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2071:2: iv_ruleLacuna= ruleLacuna EOF
            {
             newCompositeNode(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_ruleLacuna_in_entryRuleLacuna5363);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLacuna5373); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2078:1: ruleLacuna returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) ;
    public final EObject ruleLacuna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2081:28: ( ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2082:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2082:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2082:2: () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2082:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2083:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLacunaAccess().getLacunaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleLacuna5419); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2092:1: ( (lv_wChar_2_0= ruleNoLacuna ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EGYSTRING||LA29_0==24||LA29_0==26||LA29_0==28||LA29_0==30||LA29_0==34||(LA29_0>=50 && LA29_0<=57)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2093:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2093:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2094:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoLacuna_in_ruleLacuna5440);
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleLacuna5453); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2122:1: entryRuleNoLacuna returns [EObject current=null] : iv_ruleNoLacuna= ruleNoLacuna EOF ;
    public final EObject entryRuleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2123:2: (iv_ruleNoLacuna= ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2124:2: iv_ruleNoLacuna= ruleNoLacuna EOF
            {
             newCompositeNode(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna5489);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoLacuna5499); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2131:1: ruleNoLacuna returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech ) ;
    public final EObject ruleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_Chars_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Cartouche_4 = null;

        EObject this_Oval_5 = null;

        EObject this_Serech_6 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2134:28: ( (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2135:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2135:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt30=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt30=3;
                }
                break;
            case 34:
                {
                alt30=4;
                }
                break;
            case 28:
                {
                alt30=5;
                }
                break;
            case 24:
                {
                alt30=6;
                }
                break;
            case 26:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2136:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoLacuna5546);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2146:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoLacuna5573);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2156:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoLacuna5600);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2166:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoLacuna5627);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2176:5: this_Cartouche_4= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoLacuna5654);
                    this_Cartouche_4=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2186:5: this_Oval_5= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleNoLacuna5681);
                    this_Oval_5=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2196:5: this_Serech_6= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleNoLacuna5708);
                    this_Serech_6=ruleSerech();

                    state._fsp--;

                     
                            current = this_Serech_6; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2212:1: entryRuleDeletion returns [EObject current=null] : iv_ruleDeletion= ruleDeletion EOF ;
    public final EObject entryRuleDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2213:2: (iv_ruleDeletion= ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2214:2: iv_ruleDeletion= ruleDeletion EOF
            {
             newCompositeNode(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_ruleDeletion_in_entryRuleDeletion5743);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletion5753); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2221:1: ruleDeletion returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2224:28: ( ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2225:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2225:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2225:2: () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2225:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletionAccess().getDeletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleDeletion5799); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2235:1: ( (lv_wChar_2_0= ruleNoDeletion ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_EGYSTRING||LA31_0==30||LA31_0==34||LA31_0==36||LA31_0==46||LA31_0==48||(LA31_0>=50 && LA31_0<=57)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2236:1: (lv_wChar_2_0= ruleNoDeletion )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2236:1: (lv_wChar_2_0= ruleNoDeletion )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2237:3: lv_wChar_2_0= ruleNoDeletion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDeletion_in_ruleDeletion5820);
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
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleDeletion5833); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2265:1: entryRuleNoDeletion returns [EObject current=null] : iv_ruleNoDeletion= ruleNoDeletion EOF ;
    public final EObject entryRuleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2266:2: (iv_ruleNoDeletion= ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2267:2: iv_ruleNoDeletion= ruleNoDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion5869);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDeletion5879); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2274:1: ruleNoDeletion returns [EObject current=null] : (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur ) ;
    public final EObject ruleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_PartialDestruction_1 = null;

        EObject this_Expanded_2 = null;

        EObject this_Interfix_3 = null;

        EObject this_DisputableReading_4 = null;

        EObject this_Lacuna_5 = null;

        EObject this_RestorationOverRasur_6 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2277:28: ( (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2278:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2278:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur )
            int alt32=7;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt32=1;
                }
                break;
            case 48:
                {
                alt32=2;
                }
                break;
            case 30:
                {
                alt32=3;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt32=4;
                }
                break;
            case 34:
                {
                alt32=5;
                }
                break;
            case 36:
                {
                alt32=6;
                }
                break;
            case 46:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2279:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDeletion5926);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2289:5: this_PartialDestruction_1= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoDeletion5953);
                    this_PartialDestruction_1=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2299:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDeletion5980);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2309:5: this_Interfix_3= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDeletion6007);
                    this_Interfix_3=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2319:5: this_DisputableReading_4= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoDeletion6034);
                    this_DisputableReading_4=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2329:5: this_Lacuna_5= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoDeletion6061);
                    this_Lacuna_5=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2339:5: this_RestorationOverRasur_6= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoDeletion6088);
                    this_RestorationOverRasur_6=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_6; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2355:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2356:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2357:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn6123);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpandedColumn6133); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2364:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2367:28: ( ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2368:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2368:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2368:2: () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2368:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2369:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleExpandedColumn6179); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2378:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_EGYSTRING||LA33_0==30||LA33_0==34||(LA33_0>=50 && LA33_0<=57)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2379:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2379:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2380:3: lv_wChar_2_0= ruleNoExpandedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn6200);
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
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleExpandedColumn6213); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2408:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2409:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2410:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn6249);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpandedColumn6259); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2417:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2420:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2421:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2421:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt34=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt34=1;
                }
                break;
            case 30:
                {
                alt34=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt34=3;
                }
                break;
            case 34:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2422:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpandedColumn6306);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2432:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoExpandedColumn6333);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2442:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpandedColumn6360);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2452:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpandedColumn6387);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2468:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2469:2: (iv_ruleRasur= ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2470:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_ruleRasur_in_entryRuleRasur6422);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasur6432); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2477:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2480:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2481:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2481:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2481:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2481:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2482:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleRasur6478); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2491:1: ( (lv_wChar_2_0= ruleNoRasur ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_EGYSTRING||LA35_0==30||LA35_0==34||(LA35_0>=50 && LA35_0<=57)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2492:1: (lv_wChar_2_0= ruleNoRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2492:1: (lv_wChar_2_0= ruleNoRasur )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2493:3: lv_wChar_2_0= ruleNoRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoRasur_in_ruleRasur6499);
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
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleRasur6512); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2521:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2522:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2523:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_ruleNoRasur_in_entryRuleNoRasur6548);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRasur6558); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2530:1: ruleNoRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2533:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2534:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2534:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt36=1;
                }
                break;
            case 30:
                {
                alt36=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt36=3;
                }
                break;
            case 34:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2535:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRasur6605);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2545:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoRasur6632);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2555:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRasur6659);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2565:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoRasur6686);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2581:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2582:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2583:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded6721);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpanded6731); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2590:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2593:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2594:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2594:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2594:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2594:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2595:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleAncientExpanded6777); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2604:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||LA37_0==30||LA37_0==34||(LA37_0>=50 && LA37_0<=57)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2605:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2605:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2606:3: lv_wChar_2_0= ruleNoAncientExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded6798);
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
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleAncientExpanded6811); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2634:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2635:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2636:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded6847);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoAncientExpanded6857); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2643:1: ruleNoAncientExpanded returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2646:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2647:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2647:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt38=1;
                }
                break;
            case 30:
                {
                alt38=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt38=3;
                }
                break;
            case 34:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2648:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoAncientExpanded6904);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2658:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoAncientExpanded6931);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2668:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoAncientExpanded6958);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2678:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoAncientExpanded6985);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2694:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2695:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2696:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur7020);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasur7030); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2703:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2706:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2707:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2707:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2707:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2707:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2708:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleRestorationOverRasur7076); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2717:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EGYSTRING||LA39_0==28||LA39_0==30||LA39_0==34||(LA39_0>=50 && LA39_0<=57)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2718:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2718:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2719:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur7097);
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
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleRestorationOverRasur7110); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2747:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2748:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2749:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur7146);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRestorationOverRasur7156); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2756:1: ruleNoRestorationOverRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche ) ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Cartouche_4 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2759:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2760:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2760:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche )
            int alt40=5;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt40=1;
                }
                break;
            case 30:
                {
                alt40=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt40=3;
                }
                break;
            case 34:
                {
                alt40=4;
                }
                break;
            case 28:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2761:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRestorationOverRasur7203);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2771:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur7230);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2781:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRestorationOverRasur7257);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2791:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoRestorationOverRasur7284);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2801:5: this_Cartouche_4= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoRestorationOverRasur7311);
                    this_Cartouche_4=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_4; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2817:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2818:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2819:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction7346);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialDestruction7356); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2826:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2829:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2830:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2830:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2830:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2830:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2831:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_rulePartialDestruction7402); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2840:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_EGYSTRING||LA41_0==24||LA41_0==26||LA41_0==28||LA41_0==30||LA41_0==34||LA41_0==38||(LA41_0>=50 && LA41_0<=57)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2841:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2841:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2842:3: lv_wChar_2_0= ruleNoPartialDestruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction7423);
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
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_rulePartialDestruction7436); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2870:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2871:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2872:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction7472);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoPartialDestruction7482); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2879:1: ruleNoPartialDestruction returns [EObject current=null] : (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech ) ;
    public final EObject ruleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Deletion_1 = null;

        EObject this_Expanded_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Interfix_4 = null;

        EObject this_Cartouche_5 = null;

        EObject this_Oval_6 = null;

        EObject this_Serech_7 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2882:28: ( (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2883:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2883:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech )
            int alt42=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt42=1;
                }
                break;
            case 38:
                {
                alt42=2;
                }
                break;
            case 30:
                {
                alt42=3;
                }
                break;
            case 34:
                {
                alt42=4;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt42=5;
                }
                break;
            case 28:
                {
                alt42=6;
                }
                break;
            case 24:
                {
                alt42=7;
                }
                break;
            case 26:
                {
                alt42=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2884:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoPartialDestruction7529);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2894:5: this_Deletion_1= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoPartialDestruction7556);
                    this_Deletion_1=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2904:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoPartialDestruction7583);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2914:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoPartialDestruction7610);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2924:5: this_Interfix_4= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoPartialDestruction7637);
                    this_Interfix_4=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2934:5: this_Cartouche_5= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoPartialDestruction7664);
                    this_Cartouche_5=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2944:5: this_Oval_6= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleNoPartialDestruction7691);
                    this_Oval_6=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2954:5: this_Serech_7= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleNoPartialDestruction7718);
                    this_Serech_7=ruleSerech();

                    state._fsp--;

                     
                            current = this_Serech_7; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2970:1: entryRuleInterfix returns [EObject current=null] : iv_ruleInterfix= ruleInterfix EOF ;
    public final EObject entryRuleInterfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfix = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2971:2: (iv_ruleInterfix= ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2972:2: iv_ruleInterfix= ruleInterfix EOF
            {
             newCompositeNode(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_ruleInterfix_in_entryRuleInterfix7753);
            iv_ruleInterfix=ruleInterfix();

            state._fsp--;

             current =iv_ruleInterfix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfix7763); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2979:1: ruleInterfix returns [EObject current=null] : (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2982:28: ( (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2983:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2983:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            int alt43=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt43=1;
                }
                break;
            case 50:
                {
                alt43=2;
                }
                break;
            case 52:
                {
                alt43=3;
                }
                break;
            case 53:
                {
                alt43=4;
                }
                break;
            case 54:
                {
                alt43=5;
                }
                break;
            case 55:
                {
                alt43=6;
                }
                break;
            case 56:
                {
                alt43=7;
                }
                break;
            case 57:
                {
                alt43=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2984:5: this_InterfixFlexion_0= ruleInterfixFlexion
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfixFlexion_in_ruleInterfix7810);
                    this_InterfixFlexion_0=ruleInterfixFlexion();

                    state._fsp--;

                     
                            current = this_InterfixFlexion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2994:5: this_InterfixLexical_1= ruleInterfixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterfixLexical_in_ruleInterfix7837);
                    this_InterfixLexical_1=ruleInterfixLexical();

                    state._fsp--;

                     
                            current = this_InterfixLexical_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3004:5: this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix7864);
                    this_InterfixSuffixPronomLexical_2=ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     
                            current = this_InterfixSuffixPronomLexical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3014:5: this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix7891);
                    this_InterfixPrefixNonLexical_3=ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixNonLexical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3024:5: this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix7918);
                    this_InterfixPrefixLexical_4=ruleInterfixPrefixLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixLexical_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3034:5: this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix7945);
                    this_InterfixConnectionSyllabicGroup_5=ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     
                            current = this_InterfixConnectionSyllabicGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3044:5: this_InterfixCompoundWords_6= ruleInterfixCompoundWords
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInterfixCompoundWords_in_ruleInterfix7972);
                    this_InterfixCompoundWords_6=ruleInterfixCompoundWords();

                    state._fsp--;

                     
                            current = this_InterfixCompoundWords_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3054:5: this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_ruleInterfix7999);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3070:1: entryRuleInterfixLexical returns [EObject current=null] : iv_ruleInterfixLexical= ruleInterfixLexical EOF ;
    public final EObject entryRuleInterfixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3071:2: (iv_ruleInterfixLexical= ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3072:2: iv_ruleInterfixLexical= ruleInterfixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical8034);
            iv_ruleInterfixLexical=ruleInterfixLexical();

            state._fsp--;

             current =iv_ruleInterfixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexical8044); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3079:1: ruleInterfixLexical returns [EObject current=null] : ( () otherlv_1= ',' ) ;
    public final EObject ruleInterfixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3082:28: ( ( () otherlv_1= ',' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3083:1: ( () otherlv_1= ',' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3083:1: ( () otherlv_1= ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3083:2: () otherlv_1= ','
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3083:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3084:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleInterfixLexical8090); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3101:1: entryRuleInterfixFlexion returns [EObject current=null] : iv_ruleInterfixFlexion= ruleInterfixFlexion EOF ;
    public final EObject entryRuleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixFlexion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3102:2: (iv_ruleInterfixFlexion= ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3103:2: iv_ruleInterfixFlexion= ruleInterfixFlexion EOF
            {
             newCompositeNode(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion8126);
            iv_ruleInterfixFlexion=ruleInterfixFlexion();

            state._fsp--;

             current =iv_ruleInterfixFlexion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexion8136); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3110:1: ruleInterfixFlexion returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3113:28: ( ( () otherlv_1= '.' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3114:1: ( () otherlv_1= '.' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3114:1: ( () otherlv_1= '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3114:2: () otherlv_1= '.'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3114:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3115:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleInterfixFlexion8182); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3132:1: entryRuleInterfixSuffixPronomLexical returns [EObject current=null] : iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF ;
    public final EObject entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixSuffixPronomLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3133:2: (iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3134:2: iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical8218);
            iv_ruleInterfixSuffixPronomLexical=ruleInterfixSuffixPronomLexical();

            state._fsp--;

             current =iv_ruleInterfixSuffixPronomLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical8228); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3141:1: ruleInterfixSuffixPronomLexical returns [EObject current=null] : ( () otherlv_1= '\\u2261' ) ;
    public final EObject ruleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3144:28: ( ( () otherlv_1= '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3145:1: ( () otherlv_1= '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3145:1: ( () otherlv_1= '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3145:2: () otherlv_1= '\\u2261'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3145:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3146:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleInterfixSuffixPronomLexical8274); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3163:1: entryRuleInterfixPrefixNonLexical returns [EObject current=null] : iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF ;
    public final EObject entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixNonLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3164:2: (iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3165:2: iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical8310);
            iv_ruleInterfixPrefixNonLexical=ruleInterfixPrefixNonLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixNonLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical8320); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3172:1: ruleInterfixPrefixNonLexical returns [EObject current=null] : ( () otherlv_1= ':' ) ;
    public final EObject ruleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3175:28: ( ( () otherlv_1= ':' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3176:1: ( () otherlv_1= ':' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3176:1: ( () otherlv_1= ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3176:2: () otherlv_1= ':'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3176:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3177:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleInterfixPrefixNonLexical8366); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3194:1: entryRuleInterfixPrefixLexical returns [EObject current=null] : iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF ;
    public final EObject entryRuleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3195:2: (iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3196:2: iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical8402);
            iv_ruleInterfixPrefixLexical=ruleInterfixPrefixLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixLexical8412); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3203:1: ruleInterfixPrefixLexical returns [EObject current=null] : ( () otherlv_1= '\\u22EE' ) ;
    public final EObject ruleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3206:28: ( ( () otherlv_1= '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3207:1: ( () otherlv_1= '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3207:1: ( () otherlv_1= '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3207:2: () otherlv_1= '\\u22EE'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3207:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3208:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInterfixPrefixLexical8458); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3225:1: entryRuleInterfixConnectionSyllabicGroup returns [EObject current=null] : iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF ;
    public final EObject entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixConnectionSyllabicGroup = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3226:2: (iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3227:2: iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup8494);
            iv_ruleInterfixConnectionSyllabicGroup=ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             current =iv_ruleInterfixConnectionSyllabicGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup8504); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3234:1: ruleInterfixConnectionSyllabicGroup returns [EObject current=null] : ( () otherlv_1= '~' ) ;
    public final EObject ruleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3237:28: ( ( () otherlv_1= '~' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3238:1: ( () otherlv_1= '~' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3238:1: ( () otherlv_1= '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3238:2: () otherlv_1= '~'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3238:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleInterfixConnectionSyllabicGroup8550); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3256:1: entryRuleInterfixCompoundWords returns [EObject current=null] : iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF ;
    public final EObject entryRuleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixCompoundWords = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3257:2: (iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3258:2: iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF
            {
             newCompositeNode(grammarAccess.getInterfixCompoundWordsRule()); 
            pushFollow(FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords8586);
            iv_ruleInterfixCompoundWords=ruleInterfixCompoundWords();

            state._fsp--;

             current =iv_ruleInterfixCompoundWords; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixCompoundWords8596); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3265:1: ruleInterfixCompoundWords returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3268:28: ( ( () otherlv_1= '-' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:1: ( () otherlv_1= '-' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:1: ( () otherlv_1= '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:2: () otherlv_1= '-'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleInterfixCompoundWords8642); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3287:1: entryRuleInterfixPhoneticalComplement returns [EObject current=null] : iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF ;
    public final EObject entryRuleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPhoneticalComplement = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3288:2: (iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3289:2: iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF
            {
             newCompositeNode(grammarAccess.getInterfixPhoneticalComplementRule()); 
            pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement8678);
            iv_ruleInterfixPhoneticalComplement=ruleInterfixPhoneticalComplement();

            state._fsp--;

             current =iv_ruleInterfixPhoneticalComplement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement8688); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3296:1: ruleInterfixPhoneticalComplement returns [EObject current=null] : ( () otherlv_1= ';' ) ;
    public final EObject ruleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3299:28: ( ( () otherlv_1= ';' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:1: ( () otherlv_1= ';' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:1: ( () otherlv_1= ';' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:2: () otherlv_1= ';'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleInterfixPhoneticalComplement8734); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent141 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_9_in_ruleTextContent155 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleTextContent172 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent194 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_ruleTextItem_in_entryRuleTextItem233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextItem243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleTextItem289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleSentence379 = new BitSet(new long[]{0x03FD555555FFEDC0L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence401 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleSentence414 = new BitSet(new long[]{0x03FD555555FFE9D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleSentence426 = new BitSet(new long[]{0x03FD555555FFE9C0L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence448 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_ruleSentence464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItem510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItem557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItem584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_ruleSentenceItem611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMarker656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_ruleAbstractMarker703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_ruleAbstractMarker730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestructionMarker_in_ruleAbstractMarker757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAmbivalence802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAmbivalence839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence861 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAmbivalence874 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleAmbivalence886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence908 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleAmbivalence923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASESTRING_in_ruleCase1011 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1028 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1051 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCase1064 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1076 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1098 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItemNoAmbivalence1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItemNoAmbivalence1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_entryRuleVersMarker1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersMarker1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_ruleVersMarker1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMissingVersMarker_in_ruleVersMarker1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroyedVersMarker_in_ruleVersMarker1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletedVersMarker_in_ruleVersMarker1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableVersMarker_in_ruleVersMarker1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasurMarker_in_ruleVersMarker1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpandedMarker_in_ruleVersMarker1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasurMarker_in_ruleVersMarker1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableVersMarker_in_entryRuleDisputableVersMarker1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableVersMarker1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDisputableVersMarker1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletedVersMarker_in_entryRuleDeletedVersMarker1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletedVersMarker1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeletedVersMarker1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroyedVersMarker_in_entryRuleDestroyedVersMarker1775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestroyedVersMarker1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDestroyedVersMarker1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMissingVersMarker_in_entryRuleMissingVersMarker1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMissingVersMarker1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMissingVersMarker1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasurMarker_in_entryRuleRestorationOverRasurMarker1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasurMarker1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRestorationOverRasurMarker2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpandedMarker_in_entryRuleAncientExpandedMarker2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpandedMarker2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAncientExpandedMarker2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasurMarker_in_entryRuleRasurMarker2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasurMarker2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRasurMarker2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVersFrontierMarker2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker2327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVersbreakMarker2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker2419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBrokenVersbreakMarker2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarker2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BETWEEN_HASHES_in_ruleMarker2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestructionMarker_in_entryRuleDestructionMarker2602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestructionMarker2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BETWEEN_MINUS_in_ruleDestructionMarker2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_ruleWord2758 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordPart2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWordPart2843 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWordPart2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleWordMiddle2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleWordMiddle2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleWordMiddle3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_entryRuleChars3048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChars3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleChars3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets3139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleBrackets3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleBrackets3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleBrackets3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleBrackets3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleBrackets3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleBrackets3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleBrackets3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleBrackets3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleBrackets3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleBrackets3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleBrackets3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleBrackets3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleBrackets3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_entryRuleOval3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOval3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOval3602 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleOval3623 = new BitSet(new long[]{0x03FD555557800100L});
    public static final BitSet FOLLOW_25_in_ruleOval3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_entryRuleSerech3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSerech3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSerech3719 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleSerech3740 = new BitSet(new long[]{0x03FD55555D800100L});
    public static final BitSet FOLLOW_27_in_ruleSerech3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_entryRuleCartouche3789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCartouche3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCartouche3845 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleCartouche3866 = new BitSet(new long[]{0x03FD555575800100L});
    public static final BitSet FOLLOW_29_in_ruleCartouche3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche3915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoCartouche3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoCartouche3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleNoCartouche3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoCartouche4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoCartouche4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleNoCartouche4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoCartouche4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoCartouche4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoCartouche4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoCartouche4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoCartouche4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoCartouche4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoCartouche4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded4304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpanded4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleExpanded4360 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_ruleExpanded4381 = new BitSet(new long[]{0x03FD5555D5800100L});
    public static final BitSet FOLLOW_31_in_ruleExpanded4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded4430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpanded4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpanded4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation4576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmendation4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEmendation4632 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_ruleEmendation4653 = new BitSet(new long[]{0x03FD555755800100L});
    public static final BitSet FOLLOW_33_in_ruleEmendation4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation4702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoEmendation4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoEmendation4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoEmendation4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoEmendation4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDisputableReading4931 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading4952 = new BitSet(new long[]{0x03FD555D55800100L});
    public static final BitSet FOLLOW_35_in_ruleDisputableReading4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading5001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDisputableReading5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoDisputableReading5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoDisputableReading5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleNoDisputableReading5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoDisputableReading5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoDisputableReading5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleNoDisputableReading5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoDisputableReading5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDisputableReading5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDisputableReading5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDisputableReading5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna5363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLacuna5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLacuna5419 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_ruleLacuna5440 = new BitSet(new long[]{0x03FD557555800100L});
    public static final BitSet FOLLOW_37_in_ruleLacuna5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna5489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoLacuna5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoLacuna5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoLacuna5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoLacuna5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoLacuna5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleNoLacuna5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleNoLacuna5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletion5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDeletion5799 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_ruleDeletion5820 = new BitSet(new long[]{0x03FD55D555800100L});
    public static final BitSet FOLLOW_39_in_ruleDeletion5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion5869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDeletion5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDeletion5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDeletion5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDeletion6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoDeletion6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoDeletion6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoDeletion6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn6123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpandedColumn6179 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn6200 = new BitSet(new long[]{0x03FD575555800100L});
    public static final BitSet FOLLOW_41_in_ruleExpandedColumn6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn6249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpandedColumn6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoExpandedColumn6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpandedColumn6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpandedColumn6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur6422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasur6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRasur6478 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoRasur_in_ruleRasur6499 = new BitSet(new long[]{0x03FD5D5555800100L});
    public static final BitSet FOLLOW_43_in_ruleRasur6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRasur6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRasur6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRasur6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoRasur6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded6721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAncientExpanded6777 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded6798 = new BitSet(new long[]{0x03FD755555800100L});
    public static final BitSet FOLLOW_45_in_ruleAncientExpanded6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded6847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded6857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoAncientExpanded6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoAncientExpanded6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoAncientExpanded6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur7020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRestorationOverRasur7076 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur7097 = new BitSet(new long[]{0x03FDD55555800100L});
    public static final BitSet FOLLOW_47_in_ruleRestorationOverRasur7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur7146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRestorationOverRasur7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoRestorationOverRasur7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoRestorationOverRasur7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction7346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePartialDestruction7402 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction7423 = new BitSet(new long[]{0x03FF555555800100L});
    public static final BitSet FOLLOW_49_in_rulePartialDestruction7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction7472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoPartialDestruction7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoPartialDestruction7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoPartialDestruction7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoPartialDestruction7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoPartialDestruction7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleNoPartialDestruction7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleNoPartialDestruction7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix7753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfix7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_ruleInterfix7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_ruleInterfix7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_ruleInterfix7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_ruleInterfix7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical8034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInterfixLexical8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion8126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInterfixFlexion8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical8218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInterfixSuffixPronomLexical8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical8310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInterfixPrefixNonLexical8366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical8402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInterfixPrefixLexical8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInterfixConnectionSyllabicGroup8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompoundWords8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInterfixCompoundWords8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement8678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInterfixPhoneticalComplement8734 = new BitSet(new long[]{0x0000000000000002L});

}