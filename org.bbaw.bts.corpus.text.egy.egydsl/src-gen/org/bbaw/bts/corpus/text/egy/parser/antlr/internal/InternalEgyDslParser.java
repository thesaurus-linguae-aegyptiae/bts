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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_CASESTRING", "RULE_BETWEEN_HASHES", "RULE_BETWEEN_MINUS", "RULE_EGYSTRING", "' '", "'\\u00A7'", "'%'", "'| '", "'\\u2E2E\\uDB80\\uDC80?'", "'{\\uDB80\\uDC80}'", "'[\\uDB80\\uDC80]'", "'\\u2329\\uDB80\\uDC80\\u232A'", "'[[\\uDB80\\uDC80]]'", "'((\\uDB80\\uDC80))'", "'{{\\uDB80\\uDC80}}'", "'\\uDB80\\uDC81'", "'\\uDB80\\uDC80'", "'\\uDB80\\uDC82'", "'\\uD80C\\uDE58'", "'\\uD80C\\uDE82'", "'\\uD80C\\uDF79'", "'\\uD80C\\uDF7A'", "'\\uD80C\\uDE86'", "'\\uD80C\\uDE87'", "'('", "')'", "'\\u2329'", "'\\u232A'", "'\\u2E2E'", "'?'", "'['", "']'", "'{'", "'}'", "'\\u2329\\u2329'", "'\\u232A\\u232A'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'~'", "'-'", "';'"
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

            if ( ((LA5_0>=RULE_BETWEEN_HASHES && LA5_0<=RULE_EGYSTRING)||LA5_0==11||(LA5_0>=13 && LA5_0<=23)||LA5_0==25||LA5_0==27||LA5_0==29||LA5_0==31||LA5_0==33||LA5_0==35||LA5_0==37||LA5_0==39||LA5_0==41||LA5_0==43||LA5_0==45||LA5_0==47||(LA5_0>=49 && LA5_0<=56)) ) {
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
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
            case 39:
            case 41:
            case 43:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
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

            if ( (LA13_0==RULE_EGYSTRING||LA13_0==23||LA13_0==25||LA13_0==27||LA13_0==29||LA13_0==31||LA13_0==33||LA13_0==35||LA13_0==37||LA13_0==39||LA13_0==41||LA13_0==43||LA13_0==45||LA13_0==47||(LA13_0>=49 && LA13_0<=56)) ) {
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

                if ( (LA15_0==RULE_EGYSTRING||LA15_0==23||LA15_0==25||LA15_0==27||LA15_0==29||LA15_0==31||LA15_0==33||LA15_0==35||LA15_0==37||LA15_0==39||LA15_0==41||LA15_0==43||LA15_0==45||LA15_0==47||(LA15_0>=49 && LA15_0<=56)) ) {
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1110:1: ruleWordPart returns [EObject current=null] : ( (lv_wChar_0_0= ruleWordMiddle ) ) ;
    public final EObject ruleWordPart() throws RecognitionException {
        EObject current = null;

        EObject lv_wChar_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1113:28: ( ( (lv_wChar_0_0= ruleWordMiddle ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:1: ( (lv_wChar_0_0= ruleWordMiddle ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:1: ( (lv_wChar_0_0= ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1115:1: (lv_wChar_0_0= ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1115:1: (lv_wChar_0_0= ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1116:3: lv_wChar_0_0= ruleWordMiddle
            {
             
            	        newCompositeNode(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleWordMiddle_in_ruleWordPart2850);
            lv_wChar_0_0=ruleWordMiddle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWordPartRule());
            	        }
                   		set(
                   			current, 
                   			"wChar",
                    		lv_wChar_0_0, 
                    		"WordMiddle");
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1140:1: entryRuleWordMiddle returns [EObject current=null] : iv_ruleWordMiddle= ruleWordMiddle EOF ;
    public final EObject entryRuleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMiddle = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1141:2: (iv_ruleWordMiddle= ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1142:2: iv_ruleWordMiddle= ruleWordMiddle EOF
            {
             newCompositeNode(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2885);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMiddle2895); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1149:1: ruleWordMiddle returns [EObject current=null] : (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) ;
    public final EObject ruleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject this_Brackets_0 = null;

        EObject this_Chars_1 = null;

        EObject this_Interfix_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1152:28: ( (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1153:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1153:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 23:
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
            case 39:
            case 41:
            case 43:
            case 45:
            case 47:
                {
                alt16=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt16=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1154:5: this_Brackets_0= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleWordMiddle2942);
                    this_Brackets_0=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1164:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleWordMiddle2969);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1174:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleWordMiddle2996);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1190:1: entryRuleChars returns [EObject current=null] : iv_ruleChars= ruleChars EOF ;
    public final EObject entryRuleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChars = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1191:2: (iv_ruleChars= ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1192:2: iv_ruleChars= ruleChars EOF
            {
             newCompositeNode(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_ruleChars_in_entryRuleChars3031);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChars3041); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1199:1: ruleChars returns [EObject current=null] : ( (lv_name_0_0= RULE_EGYSTRING ) ) ;
    public final EObject ruleChars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1202:28: ( ( (lv_name_0_0= RULE_EGYSTRING ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1203:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1203:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1204:1: (lv_name_0_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1204:1: (lv_name_0_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1205:3: lv_name_0_0= RULE_EGYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_ruleChars3082); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1229:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1230:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1231:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets3122);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets3132); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1238:1: ruleBrackets returns [EObject current=null] : (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1241:28: ( (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1242:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1242:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_ExpandedColumn_3= ruleExpandedColumn | this_Expanded_4= ruleExpanded | this_DisputableReading_5= ruleDisputableReading | this_Emendation_6= ruleEmendation | this_Lacuna_7= ruleLacuna | this_Deletion_8= ruleDeletion | this_PartialDestruction_9= rulePartialDestruction | this_Cartouche_10= ruleCartouche | this_Oval_11= ruleOval | this_Serech_12= ruleSerech )
            int alt17=13;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 45:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 29:
                {
                alt17=5;
                }
                break;
            case 33:
                {
                alt17=6;
                }
                break;
            case 31:
                {
                alt17=7;
                }
                break;
            case 35:
                {
                alt17=8;
                }
                break;
            case 37:
                {
                alt17=9;
                }
                break;
            case 47:
                {
                alt17=10;
                }
                break;
            case 27:
                {
                alt17=11;
                }
                break;
            case 23:
                {
                alt17=12;
                }
                break;
            case 25:
                {
                alt17=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1243:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleBrackets3179);
                    this_Rasur_0=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1253:5: this_AncientExpanded_1= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleBrackets3206);
                    this_AncientExpanded_1=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1263:5: this_RestorationOverRasur_2= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleBrackets3233);
                    this_RestorationOverRasur_2=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1273:5: this_ExpandedColumn_3= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleBrackets3260);
                    this_ExpandedColumn_3=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1283:5: this_Expanded_4= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleBrackets3287);
                    this_Expanded_4=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1293:5: this_DisputableReading_5= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleBrackets3314);
                    this_DisputableReading_5=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1303:5: this_Emendation_6= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleBrackets3341);
                    this_Emendation_6=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1313:5: this_Lacuna_7= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleBrackets3368);
                    this_Lacuna_7=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1323:5: this_Deletion_8= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleBrackets3395);
                    this_Deletion_8=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1333:5: this_PartialDestruction_9= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleBrackets3422);
                    this_PartialDestruction_9=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1343:5: this_Cartouche_10= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleBrackets3449);
                    this_Cartouche_10=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1353:5: this_Oval_11= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleBrackets3476);
                    this_Oval_11=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1363:5: this_Serech_12= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getSerechParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleBrackets3503);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1379:1: entryRuleOval returns [EObject current=null] : iv_ruleOval= ruleOval EOF ;
    public final EObject entryRuleOval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOval = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1380:2: (iv_ruleOval= ruleOval EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1381:2: iv_ruleOval= ruleOval EOF
            {
             newCompositeNode(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_ruleOval_in_entryRuleOval3538);
            iv_ruleOval=ruleOval();

            state._fsp--;

             current =iv_ruleOval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOval3548); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1388:1: ruleOval returns [EObject current=null] : (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' ) ;
    public final EObject ruleOval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1391:28: ( (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1392:1: (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1392:1: (otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1392:3: otherlv_0= '\\uD80C\\uDE58' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDE82'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleOval3585); 

                	newLeafNode(otherlv_0, grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1396:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_EGYSTRING||LA18_0==29||LA18_0==31||LA18_0==33||LA18_0==35||LA18_0==37||LA18_0==39||LA18_0==41||LA18_0==43||LA18_0==45||LA18_0==47||(LA18_0>=49 && LA18_0<=56)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1397:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1397:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1398:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleOval3606);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleOval3619); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1426:1: entryRuleSerech returns [EObject current=null] : iv_ruleSerech= ruleSerech EOF ;
    public final EObject entryRuleSerech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerech = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1427:2: (iv_ruleSerech= ruleSerech EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1428:2: iv_ruleSerech= ruleSerech EOF
            {
             newCompositeNode(grammarAccess.getSerechRule()); 
            pushFollow(FOLLOW_ruleSerech_in_entryRuleSerech3655);
            iv_ruleSerech=ruleSerech();

            state._fsp--;

             current =iv_ruleSerech; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSerech3665); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1435:1: ruleSerech returns [EObject current=null] : (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' ) ;
    public final EObject ruleSerech() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1438:28: ( (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1439:1: (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1439:1: (otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1439:3: otherlv_0= '\\uD80C\\uDF79' ( (lv_wChar_1_0= ruleNoCartouche ) )+ otherlv_2= '\\uD80C\\uDF7A'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSerech3702); 

                	newLeafNode(otherlv_0, grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1443:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EGYSTRING||LA19_0==29||LA19_0==31||LA19_0==33||LA19_0==35||LA19_0==37||LA19_0==39||LA19_0==41||LA19_0==43||LA19_0==45||LA19_0==47||(LA19_0>=49 && LA19_0<=56)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1444:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1444:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1445:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleSerech3723);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleSerech3736); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1473:1: entryRuleCartouche returns [EObject current=null] : iv_ruleCartouche= ruleCartouche EOF ;
    public final EObject entryRuleCartouche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartouche = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1474:2: (iv_ruleCartouche= ruleCartouche EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1475:2: iv_ruleCartouche= ruleCartouche EOF
            {
             newCompositeNode(grammarAccess.getCartoucheRule()); 
            pushFollow(FOLLOW_ruleCartouche_in_entryRuleCartouche3772);
            iv_ruleCartouche=ruleCartouche();

            state._fsp--;

             current =iv_ruleCartouche; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCartouche3782); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1482:1: ruleCartouche returns [EObject current=null] : ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' ) ;
    public final EObject ruleCartouche() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1485:28: ( ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1486:1: ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1486:1: ( () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1486:2: () otherlv_1= '\\uD80C\\uDE86' ( (lv_wChar_2_0= ruleNoCartouche ) )+ otherlv_3= '\\uD80C\\uDE87'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1486:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCartoucheAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCartouche3828); 

                	newLeafNode(otherlv_1, grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1496:1: ( (lv_wChar_2_0= ruleNoCartouche ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EGYSTRING||LA20_0==29||LA20_0==31||LA20_0==33||LA20_0==35||LA20_0==37||LA20_0==39||LA20_0==41||LA20_0==43||LA20_0==45||LA20_0==47||(LA20_0>=49 && LA20_0<=56)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1497:1: (lv_wChar_2_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1497:1: (lv_wChar_2_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1498:3: lv_wChar_2_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleCartouche3849);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCartouche3862); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1526:1: entryRuleNoCartouche returns [EObject current=null] : iv_ruleNoCartouche= ruleNoCartouche EOF ;
    public final EObject entryRuleNoCartouche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoCartouche = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1527:2: (iv_ruleNoCartouche= ruleNoCartouche EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1528:2: iv_ruleNoCartouche= ruleNoCartouche EOF
            {
             newCompositeNode(grammarAccess.getNoCartoucheRule()); 
            pushFollow(FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche3898);
            iv_ruleNoCartouche=ruleNoCartouche();

            state._fsp--;

             current =iv_ruleNoCartouche; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoCartouche3908); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1535:1: ruleNoCartouche returns [EObject current=null] : (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1538:28: ( (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1539:1: (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1539:1: (this_Chars_0= ruleChars | this_Rasur_1= ruleRasur | this_AncientExpanded_2= ruleAncientExpanded | this_RestorationOverRasur_3= ruleRestorationOverRasur | this_ExpandedColumn_4= ruleExpandedColumn | this_Expanded_5= ruleExpanded | this_DisputableReading_6= ruleDisputableReading | this_Emendation_7= ruleEmendation | this_Lacuna_8= ruleLacuna | this_Deletion_9= ruleDeletion | this_PartialDestruction_10= rulePartialDestruction | this_Interfix_11= ruleInterfix )
            int alt21=12;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 45:
                {
                alt21=4;
                }
                break;
            case 39:
                {
                alt21=5;
                }
                break;
            case 29:
                {
                alt21=6;
                }
                break;
            case 33:
                {
                alt21=7;
                }
                break;
            case 31:
                {
                alt21=8;
                }
                break;
            case 35:
                {
                alt21=9;
                }
                break;
            case 37:
                {
                alt21=10;
                }
                break;
            case 47:
                {
                alt21=11;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt21=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1540:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoCartouche3955);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1550:5: this_Rasur_1= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleNoCartouche3982);
                    this_Rasur_1=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1560:5: this_AncientExpanded_2= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoCartouche4009);
                    this_AncientExpanded_2=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1570:5: this_RestorationOverRasur_3= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoCartouche4036);
                    this_RestorationOverRasur_3=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1580:5: this_ExpandedColumn_4= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleNoCartouche4063);
                    this_ExpandedColumn_4=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1590:5: this_Expanded_5= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoCartouche4090);
                    this_Expanded_5=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1600:5: this_DisputableReading_6= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoCartouche4117);
                    this_DisputableReading_6=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1610:5: this_Emendation_7= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoCartouche4144);
                    this_Emendation_7=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1620:5: this_Lacuna_8= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoCartouche4171);
                    this_Lacuna_8=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1630:5: this_Deletion_9= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoCartouche4198);
                    this_Deletion_9=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1640:5: this_PartialDestruction_10= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoCartouche4225);
                    this_PartialDestruction_10=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1650:5: this_Interfix_11= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getInterfixParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoCartouche4252);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1666:1: entryRuleExpanded returns [EObject current=null] : iv_ruleExpanded= ruleExpanded EOF ;
    public final EObject entryRuleExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1667:2: (iv_ruleExpanded= ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1668:2: iv_ruleExpanded= ruleExpanded EOF
            {
             newCompositeNode(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_ruleExpanded_in_entryRuleExpanded4287);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpanded4297); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1675:1: ruleExpanded returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) ;
    public final EObject ruleExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1678:28: ( ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1679:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1679:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1679:2: () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1679:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1680:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExpanded4343); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1689:1: ( (lv_wChar_2_0= ruleNoExpanded ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_EGYSTRING||LA22_0==33||(LA22_0>=49 && LA22_0<=56)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1690:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1690:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1691:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpanded_in_ruleExpanded4364);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleExpanded4377); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1719:1: entryRuleNoExpanded returns [EObject current=null] : iv_ruleNoExpanded= ruleNoExpanded EOF ;
    public final EObject entryRuleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1720:2: (iv_ruleNoExpanded= ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1721:2: iv_ruleNoExpanded= ruleNoExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded4413);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpanded4423); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1728:1: ruleNoExpanded returns [EObject current=null] : (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading ) ;
    public final EObject ruleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Interfix_1 = null;

        EObject this_DisputableReading_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1731:28: ( (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1732:1: (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1732:1: (this_Chars_0= ruleChars | this_Interfix_1= ruleInterfix | this_DisputableReading_2= ruleDisputableReading )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt23=1;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt23=2;
                }
                break;
            case 33:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1733:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpanded4470);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1743:5: this_Interfix_1= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpanded4497);
                    this_Interfix_1=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1753:5: this_DisputableReading_2= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpanded4524);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1769:1: entryRuleEmendation returns [EObject current=null] : iv_ruleEmendation= ruleEmendation EOF ;
    public final EObject entryRuleEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1770:2: (iv_ruleEmendation= ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1771:2: iv_ruleEmendation= ruleEmendation EOF
            {
             newCompositeNode(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_ruleEmendation_in_entryRuleEmendation4559);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmendation4569); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1778:1: ruleEmendation returns [EObject current=null] : ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' ) ;
    public final EObject ruleEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1781:28: ( ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1782:1: ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1782:1: ( () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1782:2: () otherlv_1= '\\u2329' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '\\u232A'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1782:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationAccess().getEmendationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEmendation4615); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1792:1: ( (lv_wChar_2_0= ruleNoEmendation ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EGYSTRING||LA24_0==29||LA24_0==33||(LA24_0>=49 && LA24_0<=56)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1793:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1793:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1794:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoEmendation_in_ruleEmendation4636);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleEmendation4649); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1822:1: entryRuleNoEmendation returns [EObject current=null] : iv_ruleNoEmendation= ruleNoEmendation EOF ;
    public final EObject entryRuleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1823:2: (iv_ruleNoEmendation= ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1824:2: iv_ruleNoEmendation= ruleNoEmendation EOF
            {
             newCompositeNode(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation4685);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoEmendation4695); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1831:1: ruleNoEmendation returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1834:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1835:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1835:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt25=1;
                }
                break;
            case 29:
                {
                alt25=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt25=3;
                }
                break;
            case 33:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1836:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoEmendation4742);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1846:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoEmendation4769);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1856:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoEmendation4796);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1866:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoEmendation4823);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1882:1: entryRuleDisputableReading returns [EObject current=null] : iv_ruleDisputableReading= ruleDisputableReading EOF ;
    public final EObject entryRuleDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1883:2: (iv_ruleDisputableReading= ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1884:2: iv_ruleDisputableReading= ruleDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading4858);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableReading4868); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1891:1: ruleDisputableReading returns [EObject current=null] : ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) ;
    public final EObject ruleDisputableReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1894:28: ( ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1895:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1895:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1895:2: () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1895:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1896:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleDisputableReading4914); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1905:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_EGYSTRING||LA26_0==29||LA26_0==31||LA26_0==35||LA26_0==37||LA26_0==39||LA26_0==41||LA26_0==43||LA26_0==45||LA26_0==47||(LA26_0>=49 && LA26_0<=56)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1906:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1906:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1907:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading4935);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleDisputableReading4948); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1935:1: entryRuleNoDisputableReading returns [EObject current=null] : iv_ruleNoDisputableReading= ruleNoDisputableReading EOF ;
    public final EObject entryRuleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1936:2: (iv_ruleNoDisputableReading= ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1937:2: iv_ruleNoDisputableReading= ruleNoDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading4984);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDisputableReading4994); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1944:1: ruleNoDisputableReading returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1947:28: ( (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1948:1: (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1948:1: (this_Expanded_0= ruleExpanded | this_Emendation_1= ruleEmendation | this_Deletion_2= ruleDeletion | this_Rasur_3= ruleRasur | this_AncientExpanded_4= ruleAncientExpanded | this_RestorationOverRasur_5= ruleRestorationOverRasur | this_ExpandedColumn_6= ruleExpandedColumn | this_Lacuna_7= ruleLacuna | this_PartialDestruction_8= rulePartialDestruction | this_Chars_9= ruleChars | this_Interfix_10= ruleInterfix )
            int alt27=11;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 37:
                {
                alt27=3;
                }
                break;
            case 41:
                {
                alt27=4;
                }
                break;
            case 43:
                {
                alt27=5;
                }
                break;
            case 45:
                {
                alt27=6;
                }
                break;
            case 39:
                {
                alt27=7;
                }
                break;
            case 35:
                {
                alt27=8;
                }
                break;
            case 47:
                {
                alt27=9;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt27=10;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1949:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDisputableReading5041);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1959:5: this_Emendation_1= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoDisputableReading5068);
                    this_Emendation_1=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1969:5: this_Deletion_2= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoDisputableReading5095);
                    this_Deletion_2=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1979:5: this_Rasur_3= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleNoDisputableReading5122);
                    this_Rasur_3=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1989:5: this_AncientExpanded_4= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoDisputableReading5149);
                    this_AncientExpanded_4=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1999:5: this_RestorationOverRasur_5= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoDisputableReading5176);
                    this_RestorationOverRasur_5=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2009:5: this_ExpandedColumn_6= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleNoDisputableReading5203);
                    this_ExpandedColumn_6=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2019:5: this_Lacuna_7= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoDisputableReading5230);
                    this_Lacuna_7=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2029:5: this_PartialDestruction_8= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoDisputableReading5257);
                    this_PartialDestruction_8=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2039:5: this_Chars_9= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDisputableReading5284);
                    this_Chars_9=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2049:5: this_Interfix_10= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDisputableReading5311);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:1: entryRuleLacuna returns [EObject current=null] : iv_ruleLacuna= ruleLacuna EOF ;
    public final EObject entryRuleLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2066:2: (iv_ruleLacuna= ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2067:2: iv_ruleLacuna= ruleLacuna EOF
            {
             newCompositeNode(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_ruleLacuna_in_entryRuleLacuna5346);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLacuna5356); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2074:1: ruleLacuna returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) ;
    public final EObject ruleLacuna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2077:28: ( ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2078:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2078:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2078:2: () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2078:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2079:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLacunaAccess().getLacunaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleLacuna5402); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2088:1: ( (lv_wChar_2_0= ruleNoLacuna ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EGYSTRING||LA28_0==23||LA28_0==25||LA28_0==27||LA28_0==29||LA28_0==31||LA28_0==33||LA28_0==37||(LA28_0>=49 && LA28_0<=56)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2089:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2089:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2090:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoLacuna_in_ruleLacuna5423);
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleLacuna5436); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2118:1: entryRuleNoLacuna returns [EObject current=null] : iv_ruleNoLacuna= ruleNoLacuna EOF ;
    public final EObject entryRuleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2119:2: (iv_ruleNoLacuna= ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2120:2: iv_ruleNoLacuna= ruleNoLacuna EOF
            {
             newCompositeNode(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna5472);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoLacuna5482); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2127:1: ruleNoLacuna returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech | this_Deletion_7= ruleDeletion | this_Emendation_8= ruleEmendation ) ;
    public final EObject ruleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_Chars_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Cartouche_4 = null;

        EObject this_Oval_5 = null;

        EObject this_Serech_6 = null;

        EObject this_Deletion_7 = null;

        EObject this_Emendation_8 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2130:28: ( (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech | this_Deletion_7= ruleDeletion | this_Emendation_8= ruleEmendation ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2131:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech | this_Deletion_7= ruleDeletion | this_Emendation_8= ruleEmendation )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2131:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Oval_5= ruleOval | this_Serech_6= ruleSerech | this_Deletion_7= ruleDeletion | this_Emendation_8= ruleEmendation )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt29=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt29=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt29=3;
                }
                break;
            case 33:
                {
                alt29=4;
                }
                break;
            case 27:
                {
                alt29=5;
                }
                break;
            case 23:
                {
                alt29=6;
                }
                break;
            case 25:
                {
                alt29=7;
                }
                break;
            case 37:
                {
                alt29=8;
                }
                break;
            case 31:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2132:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoLacuna5529);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2142:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoLacuna5556);
                    this_Chars_1=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2152:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoLacuna5583);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2162:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoLacuna5610);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2172:5: this_Cartouche_4= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoLacuna5637);
                    this_Cartouche_4=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2182:5: this_Oval_5= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleNoLacuna5664);
                    this_Oval_5=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2192:5: this_Serech_6= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleNoLacuna5691);
                    this_Serech_6=ruleSerech();

                    state._fsp--;

                     
                            current = this_Serech_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2202:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoLacuna5718);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2212:5: this_Emendation_8= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getEmendationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoLacuna5745);
                    this_Emendation_8=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_8; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2228:1: entryRuleDeletion returns [EObject current=null] : iv_ruleDeletion= ruleDeletion EOF ;
    public final EObject entryRuleDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2229:2: (iv_ruleDeletion= ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2230:2: iv_ruleDeletion= ruleDeletion EOF
            {
             newCompositeNode(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_ruleDeletion_in_entryRuleDeletion5780);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletion5790); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2237:1: ruleDeletion returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2240:28: ( ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2241:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2241:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2241:2: () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2241:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2242:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletionAccess().getDeletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleDeletion5836); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2251:1: ( (lv_wChar_2_0= ruleNoDeletion ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EGYSTRING||LA30_0==29||LA30_0==33||LA30_0==35||LA30_0==43||LA30_0==45||LA30_0==47||(LA30_0>=49 && LA30_0<=56)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2252:1: (lv_wChar_2_0= ruleNoDeletion )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2252:1: (lv_wChar_2_0= ruleNoDeletion )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2253:3: lv_wChar_2_0= ruleNoDeletion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDeletion_in_ruleDeletion5857);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleDeletion5870); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2281:1: entryRuleNoDeletion returns [EObject current=null] : iv_ruleNoDeletion= ruleNoDeletion EOF ;
    public final EObject entryRuleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2282:2: (iv_ruleNoDeletion= ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2283:2: iv_ruleNoDeletion= ruleNoDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion5906);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDeletion5916); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2290:1: ruleNoDeletion returns [EObject current=null] : (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded ) ;
    public final EObject ruleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_PartialDestruction_1 = null;

        EObject this_Expanded_2 = null;

        EObject this_Interfix_3 = null;

        EObject this_DisputableReading_4 = null;

        EObject this_Lacuna_5 = null;

        EObject this_RestorationOverRasur_6 = null;

        EObject this_AncientExpanded_7 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2293:28: ( (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2294:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2294:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded )
            int alt31=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt31=1;
                }
                break;
            case 47:
                {
                alt31=2;
                }
                break;
            case 29:
                {
                alt31=3;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt31=4;
                }
                break;
            case 33:
                {
                alt31=5;
                }
                break;
            case 35:
                {
                alt31=6;
                }
                break;
            case 45:
                {
                alt31=7;
                }
                break;
            case 43:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2295:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDeletion5963);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2305:5: this_PartialDestruction_1= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoDeletion5990);
                    this_PartialDestruction_1=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2315:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDeletion6017);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2325:5: this_Interfix_3= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDeletion6044);
                    this_Interfix_3=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2335:5: this_DisputableReading_4= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoDeletion6071);
                    this_DisputableReading_4=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2345:5: this_Lacuna_5= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoDeletion6098);
                    this_Lacuna_5=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2355:5: this_RestorationOverRasur_6= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoDeletion6125);
                    this_RestorationOverRasur_6=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2365:5: this_AncientExpanded_7= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getAncientExpandedParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoDeletion6152);
                    this_AncientExpanded_7=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_7; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2381:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2382:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2383:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn6187);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpandedColumn6197); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2390:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2393:28: ( ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2394:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2394:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2394:2: () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2394:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExpandedColumn6243); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2404:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EGYSTRING||LA32_0==29||LA32_0==31||LA32_0==33||LA32_0==35||LA32_0==37||LA32_0==47||(LA32_0>=49 && LA32_0<=56)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2405:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2405:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2406:3: lv_wChar_2_0= ruleNoExpandedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn6264);
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleExpandedColumn6277); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2434:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2435:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2436:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn6313);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpandedColumn6323); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2443:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Emendation_4 = null;

        EObject this_Lacuna_5 = null;

        EObject this_PartialDestruction_6 = null;

        EObject this_Deletion_7 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2446:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2447:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2447:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion )
            int alt33=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt33=1;
                }
                break;
            case 29:
                {
                alt33=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt33=3;
                }
                break;
            case 33:
                {
                alt33=4;
                }
                break;
            case 31:
                {
                alt33=5;
                }
                break;
            case 35:
                {
                alt33=6;
                }
                break;
            case 47:
                {
                alt33=7;
                }
                break;
            case 37:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2448:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpandedColumn6370);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2458:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoExpandedColumn6397);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2468:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpandedColumn6424);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2478:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpandedColumn6451);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2488:5: this_Emendation_4= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getEmendationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoExpandedColumn6478);
                    this_Emendation_4=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2498:5: this_Lacuna_5= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getLacunaParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoExpandedColumn6505);
                    this_Lacuna_5=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2508:5: this_PartialDestruction_6= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getPartialDestructionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoExpandedColumn6532);
                    this_PartialDestruction_6=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2518:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoExpandedColumn6559);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2534:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2535:2: (iv_ruleRasur= ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2536:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_ruleRasur_in_entryRuleRasur6594);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasur6604); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2543:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2546:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2547:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2547:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2547:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2547:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2548:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleRasur6650); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2557:1: ( (lv_wChar_2_0= ruleNoRasur ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EGYSTRING||LA34_0==29||LA34_0==31||LA34_0==33||LA34_0==35||LA34_0==37||LA34_0==47||(LA34_0>=49 && LA34_0<=56)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2558:1: (lv_wChar_2_0= ruleNoRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2558:1: (lv_wChar_2_0= ruleNoRasur )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2559:3: lv_wChar_2_0= ruleNoRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoRasur_in_ruleRasur6671);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleRasur6684); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2587:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2588:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2589:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_ruleNoRasur_in_entryRuleNoRasur6720);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRasur6730); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2596:1: ruleNoRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Emendation_4 = null;

        EObject this_Lacuna_5 = null;

        EObject this_PartialDestruction_6 = null;

        EObject this_Deletion_7 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2599:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2600:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2600:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion )
            int alt35=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt35=1;
                }
                break;
            case 29:
                {
                alt35=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt35=3;
                }
                break;
            case 33:
                {
                alt35=4;
                }
                break;
            case 31:
                {
                alt35=5;
                }
                break;
            case 35:
                {
                alt35=6;
                }
                break;
            case 47:
                {
                alt35=7;
                }
                break;
            case 37:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2601:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRasur6777);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2611:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoRasur6804);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2621:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRasur6831);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2631:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoRasur6858);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2641:5: this_Emendation_4= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getEmendationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoRasur6885);
                    this_Emendation_4=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2651:5: this_Lacuna_5= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getLacunaParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoRasur6912);
                    this_Lacuna_5=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2661:5: this_PartialDestruction_6= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getPartialDestructionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoRasur6939);
                    this_PartialDestruction_6=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2671:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoRasur6966);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2687:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2688:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2689:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded7001);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpanded7011); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2696:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2699:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2700:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2700:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2700:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2700:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2701:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAncientExpanded7057); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2710:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EGYSTRING||LA36_0==29||LA36_0==31||LA36_0==33||LA36_0==35||LA36_0==37||LA36_0==47||(LA36_0>=49 && LA36_0<=56)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2711:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2711:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2712:3: lv_wChar_2_0= ruleNoAncientExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded7078);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleAncientExpanded7091); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2740:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2741:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2742:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded7127);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoAncientExpanded7137); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2749:1: ruleNoAncientExpanded returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion ) ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Emendation_4 = null;

        EObject this_Lacuna_5 = null;

        EObject this_PartialDestruction_6 = null;

        EObject this_Deletion_7 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2752:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2753:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2753:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Emendation_4= ruleEmendation | this_Lacuna_5= ruleLacuna | this_PartialDestruction_6= rulePartialDestruction | this_Deletion_7= ruleDeletion )
            int alt37=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt37=1;
                }
                break;
            case 29:
                {
                alt37=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt37=3;
                }
                break;
            case 33:
                {
                alt37=4;
                }
                break;
            case 31:
                {
                alt37=5;
                }
                break;
            case 35:
                {
                alt37=6;
                }
                break;
            case 47:
                {
                alt37=7;
                }
                break;
            case 37:
                {
                alt37=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2754:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoAncientExpanded7184);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2764:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoAncientExpanded7211);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2774:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoAncientExpanded7238);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2784:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoAncientExpanded7265);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2794:5: this_Emendation_4= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getEmendationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoAncientExpanded7292);
                    this_Emendation_4=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2804:5: this_Lacuna_5= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getLacunaParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoAncientExpanded7319);
                    this_Lacuna_5=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2814:5: this_PartialDestruction_6= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getPartialDestructionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoAncientExpanded7346);
                    this_PartialDestruction_6=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2824:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoAncientExpanded7373);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2840:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2841:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2842:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur7408);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasur7418); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2849:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2852:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2853:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2853:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2853:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2853:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2854:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleRestorationOverRasur7464); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2863:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EGYSTRING||LA38_0==27||LA38_0==29||LA38_0==31||LA38_0==33||LA38_0==35||LA38_0==37||LA38_0==47||(LA38_0>=49 && LA38_0<=56)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2864:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2864:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2865:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur7485);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleRestorationOverRasur7498); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2893:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2894:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2895:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur7534);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRestorationOverRasur7544); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2902:1: ruleNoRestorationOverRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_PartialDestruction_7= rulePartialDestruction | this_Deletion_8= ruleDeletion ) ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Cartouche_4 = null;

        EObject this_Emendation_5 = null;

        EObject this_Lacuna_6 = null;

        EObject this_PartialDestruction_7 = null;

        EObject this_Deletion_8 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2905:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_PartialDestruction_7= rulePartialDestruction | this_Deletion_8= ruleDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2906:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_PartialDestruction_7= rulePartialDestruction | this_Deletion_8= ruleDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2906:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_PartialDestruction_7= rulePartialDestruction | this_Deletion_8= ruleDeletion )
            int alt39=9;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt39=1;
                }
                break;
            case 29:
                {
                alt39=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt39=3;
                }
                break;
            case 33:
                {
                alt39=4;
                }
                break;
            case 27:
                {
                alt39=5;
                }
                break;
            case 31:
                {
                alt39=6;
                }
                break;
            case 35:
                {
                alt39=7;
                }
                break;
            case 47:
                {
                alt39=8;
                }
                break;
            case 37:
                {
                alt39=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2907:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRestorationOverRasur7591);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2917:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur7618);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2927:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRestorationOverRasur7645);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2937:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoRestorationOverRasur7672);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2947:5: this_Cartouche_4= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoRestorationOverRasur7699);
                    this_Cartouche_4=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2957:5: this_Emendation_5= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getEmendationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoRestorationOverRasur7726);
                    this_Emendation_5=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2967:5: this_Lacuna_6= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getLacunaParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoRestorationOverRasur7753);
                    this_Lacuna_6=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2977:5: this_PartialDestruction_7= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getPartialDestructionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoRestorationOverRasur7780);
                    this_PartialDestruction_7=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2987:5: this_Deletion_8= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getDeletionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoRestorationOverRasur7807);
                    this_Deletion_8=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_8; 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3003:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3004:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3005:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction7842);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialDestruction7852); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3012:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3015:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3016:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3016:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3016:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3016:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3017:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_rulePartialDestruction7898); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3026:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_EGYSTRING||LA40_0==23||LA40_0==25||LA40_0==27||LA40_0==29||LA40_0==33||LA40_0==37||(LA40_0>=49 && LA40_0<=56)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3027:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3027:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3028:3: lv_wChar_2_0= ruleNoPartialDestruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction7919);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_rulePartialDestruction7932); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3056:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3057:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3058:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction7968);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoPartialDestruction7978); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3065:1: ruleNoPartialDestruction returns [EObject current=null] : (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3068:28: ( (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3069:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3069:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech )
            int alt41=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt41=1;
                }
                break;
            case 37:
                {
                alt41=2;
                }
                break;
            case 29:
                {
                alt41=3;
                }
                break;
            case 33:
                {
                alt41=4;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                {
                alt41=5;
                }
                break;
            case 27:
                {
                alt41=6;
                }
                break;
            case 23:
                {
                alt41=7;
                }
                break;
            case 25:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3070:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoPartialDestruction8025);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3080:5: this_Deletion_1= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoPartialDestruction8052);
                    this_Deletion_1=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3090:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoPartialDestruction8079);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3100:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoPartialDestruction8106);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3110:5: this_Interfix_4= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoPartialDestruction8133);
                    this_Interfix_4=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3120:5: this_Cartouche_5= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoPartialDestruction8160);
                    this_Cartouche_5=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3130:5: this_Oval_6= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleNoPartialDestruction8187);
                    this_Oval_6=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3140:5: this_Serech_7= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleNoPartialDestruction8214);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3156:1: entryRuleInterfix returns [EObject current=null] : iv_ruleInterfix= ruleInterfix EOF ;
    public final EObject entryRuleInterfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfix = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3157:2: (iv_ruleInterfix= ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3158:2: iv_ruleInterfix= ruleInterfix EOF
            {
             newCompositeNode(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_ruleInterfix_in_entryRuleInterfix8249);
            iv_ruleInterfix=ruleInterfix();

            state._fsp--;

             current =iv_ruleInterfix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfix8259); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3165:1: ruleInterfix returns [EObject current=null] : (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3168:28: ( (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3169:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3169:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            int alt42=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt42=1;
                }
                break;
            case 49:
                {
                alt42=2;
                }
                break;
            case 51:
                {
                alt42=3;
                }
                break;
            case 52:
                {
                alt42=4;
                }
                break;
            case 53:
                {
                alt42=5;
                }
                break;
            case 54:
                {
                alt42=6;
                }
                break;
            case 55:
                {
                alt42=7;
                }
                break;
            case 56:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3170:5: this_InterfixFlexion_0= ruleInterfixFlexion
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfixFlexion_in_ruleInterfix8306);
                    this_InterfixFlexion_0=ruleInterfixFlexion();

                    state._fsp--;

                     
                            current = this_InterfixFlexion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3180:5: this_InterfixLexical_1= ruleInterfixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterfixLexical_in_ruleInterfix8333);
                    this_InterfixLexical_1=ruleInterfixLexical();

                    state._fsp--;

                     
                            current = this_InterfixLexical_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3190:5: this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix8360);
                    this_InterfixSuffixPronomLexical_2=ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     
                            current = this_InterfixSuffixPronomLexical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3200:5: this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix8387);
                    this_InterfixPrefixNonLexical_3=ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixNonLexical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3210:5: this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix8414);
                    this_InterfixPrefixLexical_4=ruleInterfixPrefixLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixLexical_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3220:5: this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix8441);
                    this_InterfixConnectionSyllabicGroup_5=ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     
                            current = this_InterfixConnectionSyllabicGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3230:5: this_InterfixCompoundWords_6= ruleInterfixCompoundWords
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInterfixCompoundWords_in_ruleInterfix8468);
                    this_InterfixCompoundWords_6=ruleInterfixCompoundWords();

                    state._fsp--;

                     
                            current = this_InterfixCompoundWords_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3240:5: this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_ruleInterfix8495);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3256:1: entryRuleInterfixLexical returns [EObject current=null] : iv_ruleInterfixLexical= ruleInterfixLexical EOF ;
    public final EObject entryRuleInterfixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3257:2: (iv_ruleInterfixLexical= ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3258:2: iv_ruleInterfixLexical= ruleInterfixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical8530);
            iv_ruleInterfixLexical=ruleInterfixLexical();

            state._fsp--;

             current =iv_ruleInterfixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexical8540); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3265:1: ruleInterfixLexical returns [EObject current=null] : ( () otherlv_1= ',' ) ;
    public final EObject ruleInterfixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3268:28: ( ( () otherlv_1= ',' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:1: ( () otherlv_1= ',' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:1: ( () otherlv_1= ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:2: () otherlv_1= ','
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3269:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleInterfixLexical8586); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3287:1: entryRuleInterfixFlexion returns [EObject current=null] : iv_ruleInterfixFlexion= ruleInterfixFlexion EOF ;
    public final EObject entryRuleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixFlexion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3288:2: (iv_ruleInterfixFlexion= ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3289:2: iv_ruleInterfixFlexion= ruleInterfixFlexion EOF
            {
             newCompositeNode(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion8622);
            iv_ruleInterfixFlexion=ruleInterfixFlexion();

            state._fsp--;

             current =iv_ruleInterfixFlexion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexion8632); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3296:1: ruleInterfixFlexion returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3299:28: ( ( () otherlv_1= '.' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:1: ( () otherlv_1= '.' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:1: ( () otherlv_1= '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:2: () otherlv_1= '.'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3300:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleInterfixFlexion8678); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3318:1: entryRuleInterfixSuffixPronomLexical returns [EObject current=null] : iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF ;
    public final EObject entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixSuffixPronomLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3319:2: (iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3320:2: iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical8714);
            iv_ruleInterfixSuffixPronomLexical=ruleInterfixSuffixPronomLexical();

            state._fsp--;

             current =iv_ruleInterfixSuffixPronomLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical8724); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3327:1: ruleInterfixSuffixPronomLexical returns [EObject current=null] : ( () otherlv_1= '\\u2261' ) ;
    public final EObject ruleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3330:28: ( ( () otherlv_1= '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3331:1: ( () otherlv_1= '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3331:1: ( () otherlv_1= '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3331:2: () otherlv_1= '\\u2261'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3331:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3332:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleInterfixSuffixPronomLexical8770); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3349:1: entryRuleInterfixPrefixNonLexical returns [EObject current=null] : iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF ;
    public final EObject entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixNonLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3350:2: (iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3351:2: iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical8806);
            iv_ruleInterfixPrefixNonLexical=ruleInterfixPrefixNonLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixNonLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical8816); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3358:1: ruleInterfixPrefixNonLexical returns [EObject current=null] : ( () otherlv_1= ':' ) ;
    public final EObject ruleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3361:28: ( ( () otherlv_1= ':' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3362:1: ( () otherlv_1= ':' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3362:1: ( () otherlv_1= ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3362:2: () otherlv_1= ':'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3362:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3363:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleInterfixPrefixNonLexical8862); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3380:1: entryRuleInterfixPrefixLexical returns [EObject current=null] : iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF ;
    public final EObject entryRuleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3381:2: (iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3382:2: iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical8898);
            iv_ruleInterfixPrefixLexical=ruleInterfixPrefixLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixLexical8908); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3389:1: ruleInterfixPrefixLexical returns [EObject current=null] : ( () otherlv_1= '\\u22EE' ) ;
    public final EObject ruleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3392:28: ( ( () otherlv_1= '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3393:1: ( () otherlv_1= '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3393:1: ( () otherlv_1= '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3393:2: () otherlv_1= '\\u22EE'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3393:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3394:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleInterfixPrefixLexical8954); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3411:1: entryRuleInterfixConnectionSyllabicGroup returns [EObject current=null] : iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF ;
    public final EObject entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixConnectionSyllabicGroup = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3412:2: (iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3413:2: iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup8990);
            iv_ruleInterfixConnectionSyllabicGroup=ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             current =iv_ruleInterfixConnectionSyllabicGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup9000); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3420:1: ruleInterfixConnectionSyllabicGroup returns [EObject current=null] : ( () otherlv_1= '~' ) ;
    public final EObject ruleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3423:28: ( ( () otherlv_1= '~' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3424:1: ( () otherlv_1= '~' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3424:1: ( () otherlv_1= '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3424:2: () otherlv_1= '~'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3424:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3425:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInterfixConnectionSyllabicGroup9046); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3442:1: entryRuleInterfixCompoundWords returns [EObject current=null] : iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF ;
    public final EObject entryRuleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixCompoundWords = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3443:2: (iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3444:2: iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF
            {
             newCompositeNode(grammarAccess.getInterfixCompoundWordsRule()); 
            pushFollow(FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords9082);
            iv_ruleInterfixCompoundWords=ruleInterfixCompoundWords();

            state._fsp--;

             current =iv_ruleInterfixCompoundWords; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixCompoundWords9092); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3451:1: ruleInterfixCompoundWords returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3454:28: ( ( () otherlv_1= '-' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3455:1: ( () otherlv_1= '-' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3455:1: ( () otherlv_1= '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3455:2: () otherlv_1= '-'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3455:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3456:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleInterfixCompoundWords9138); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3473:1: entryRuleInterfixPhoneticalComplement returns [EObject current=null] : iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF ;
    public final EObject entryRuleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPhoneticalComplement = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3474:2: (iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3475:2: iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF
            {
             newCompositeNode(grammarAccess.getInterfixPhoneticalComplementRule()); 
            pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement9174);
            iv_ruleInterfixPhoneticalComplement=ruleInterfixPhoneticalComplement();

            state._fsp--;

             current =iv_ruleInterfixPhoneticalComplement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement9184); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3482:1: ruleInterfixPhoneticalComplement returns [EObject current=null] : ( () otherlv_1= ';' ) ;
    public final EObject ruleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3485:28: ( ( () otherlv_1= ';' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3486:1: ( () otherlv_1= ';' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3486:1: ( () otherlv_1= ';' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3486:2: () otherlv_1= ';'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3486:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleInterfixPhoneticalComplement9230); 

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
    public static final BitSet FOLLOW_10_in_ruleSentence379 = new BitSet(new long[]{0x01FEAAAAAAFFEDC0L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence401 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleSentence414 = new BitSet(new long[]{0x01FEAAAAAAFFE9D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleSentence426 = new BitSet(new long[]{0x01FEAAAAAAFFE9C0L});
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
    public static final BitSet FOLLOW_RULE_CASESTRING_in_ruleCase1011 = new BitSet(new long[]{0x01FEAAAAAAFFE1D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1028 = new BitSet(new long[]{0x01FEAAAAAAFFE1D0L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1051 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCase1064 = new BitSet(new long[]{0x01FEAAAAAAFFE1D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1076 = new BitSet(new long[]{0x01FEAAAAAAFFE1D0L});
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
    public static final BitSet FOLLOW_ruleWordPart_in_ruleWord2758 = new BitSet(new long[]{0x01FEAAAAAA800102L});
    public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordPart2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWordPart2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleWordMiddle2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleWordMiddle2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleWordMiddle2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_entryRuleChars3031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChars3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleChars3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets3122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleBrackets3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleBrackets3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleBrackets3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleBrackets3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleBrackets3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleBrackets3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleBrackets3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleBrackets3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleBrackets3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleBrackets3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleBrackets3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleBrackets3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleBrackets3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_entryRuleOval3538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOval3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOval3585 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleOval3606 = new BitSet(new long[]{0x01FEAAAAAB800100L});
    public static final BitSet FOLLOW_24_in_ruleOval3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_entryRuleSerech3655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSerech3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSerech3702 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleSerech3723 = new BitSet(new long[]{0x01FEAAAAAE800100L});
    public static final BitSet FOLLOW_26_in_ruleSerech3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_entryRuleCartouche3772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCartouche3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCartouche3828 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleCartouche3849 = new BitSet(new long[]{0x01FEAAAABA800100L});
    public static final BitSet FOLLOW_28_in_ruleCartouche3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche3898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoCartouche3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoCartouche3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleNoCartouche3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoCartouche4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoCartouche4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleNoCartouche4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoCartouche4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoCartouche4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoCartouche4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoCartouche4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoCartouche4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoCartouche4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoCartouche4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded4287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpanded4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExpanded4343 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_ruleExpanded4364 = new BitSet(new long[]{0x01FEAAAAEA800100L});
    public static final BitSet FOLLOW_30_in_ruleExpanded4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded4413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpanded4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpanded4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation4559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmendation4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEmendation4615 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_ruleEmendation4636 = new BitSet(new long[]{0x01FEAAABAA800100L});
    public static final BitSet FOLLOW_32_in_ruleEmendation4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation4685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoEmendation4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoEmendation4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoEmendation4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoEmendation4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading4858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDisputableReading4914 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading4935 = new BitSet(new long[]{0x01FEAAAEAA800100L});
    public static final BitSet FOLLOW_34_in_ruleDisputableReading4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading4984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDisputableReading5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoDisputableReading5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoDisputableReading5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleNoDisputableReading5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoDisputableReading5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoDisputableReading5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleNoDisputableReading5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoDisputableReading5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDisputableReading5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDisputableReading5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDisputableReading5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna5346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLacuna5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLacuna5402 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_ruleLacuna5423 = new BitSet(new long[]{0x01FEAABAAA800100L});
    public static final BitSet FOLLOW_36_in_ruleLacuna5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna5472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoLacuna5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoLacuna5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoLacuna5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoLacuna5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoLacuna5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleNoLacuna5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleNoLacuna5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoLacuna5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoLacuna5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletion5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDeletion5836 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_ruleDeletion5857 = new BitSet(new long[]{0x01FEAAEAAA800100L});
    public static final BitSet FOLLOW_38_in_ruleDeletion5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion5906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDeletion5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDeletion5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDeletion6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDeletion6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoDeletion6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoDeletion6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoDeletion6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoDeletion6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn6187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExpandedColumn6243 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn6264 = new BitSet(new long[]{0x01FEABAAAA800100L});
    public static final BitSet FOLLOW_40_in_ruleExpandedColumn6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn6313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpandedColumn6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoExpandedColumn6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpandedColumn6424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpandedColumn6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoExpandedColumn6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoExpandedColumn6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoExpandedColumn6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoExpandedColumn6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur6594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasur6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRasur6650 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoRasur_in_ruleRasur6671 = new BitSet(new long[]{0x01FEAEAAAA800100L});
    public static final BitSet FOLLOW_42_in_ruleRasur6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur6720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRasur6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRasur6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRasur6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoRasur6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoRasur6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoRasur6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoRasur6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoRasur6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded7001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAncientExpanded7057 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded7078 = new BitSet(new long[]{0x01FEBAAAAA800100L});
    public static final BitSet FOLLOW_44_in_ruleAncientExpanded7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded7127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoAncientExpanded7211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoAncientExpanded7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoAncientExpanded7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoAncientExpanded7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoAncientExpanded7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoAncientExpanded7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoAncientExpanded7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur7408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRestorationOverRasur7464 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur7485 = new BitSet(new long[]{0x01FEEAAAAA800100L});
    public static final BitSet FOLLOW_46_in_ruleRestorationOverRasur7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur7534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRestorationOverRasur7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoRestorationOverRasur7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoRestorationOverRasur7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoRestorationOverRasur7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoRestorationOverRasur7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoRestorationOverRasur7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoRestorationOverRasur7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction7842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePartialDestruction7898 = new BitSet(new long[]{0x01FEAAAAAA800100L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction7919 = new BitSet(new long[]{0x01FFAAAAAA800100L});
    public static final BitSet FOLLOW_48_in_rulePartialDestruction7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction7968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction8025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoPartialDestruction8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoPartialDestruction8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoPartialDestruction8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoPartialDestruction8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoPartialDestruction8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleNoPartialDestruction8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleNoPartialDestruction8214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix8249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfix8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_ruleInterfix8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_ruleInterfix8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_ruleInterfix8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_ruleInterfix8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical8530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInterfixLexical8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion8622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInterfixFlexion8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical8714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInterfixSuffixPronomLexical8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical8806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInterfixPrefixNonLexical8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical8898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInterfixPrefixLexical8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup8990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInterfixConnectionSyllabicGroup9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords9082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompoundWords9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInterfixCompoundWords9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement9174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInterfixPhoneticalComplement9230 = new BitSet(new long[]{0x0000000000000002L});

}