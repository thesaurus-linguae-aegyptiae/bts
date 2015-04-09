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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:76:1: ruleTextContent returns [EObject current=null] : ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )? ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_NEWLINE_3=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:79:28: ( ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:2: () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )?
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextContentAccess().getTextContentAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:86:2: ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
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
                    break;

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
            pushFollow(FOLLOW_ruleTextItem_in_entryRuleTextItem234);
            iv_ruleTextItem=ruleTextItem();

            state._fsp--;

             current =iv_ruleTextItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextItem244); 

            }

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
                
            pushFollow(FOLLOW_ruleSentence_in_ruleTextItem290);
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
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence324);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence334); 

            }

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

            otherlv_1=(Token)match(input,10,FOLLOW_10_in_ruleSentence380); 

                	newLeafNode(otherlv_1, grammarAccess.getSentenceAccess().getSectionSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:192:1: ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_BETWEEN_HASHES && LA6_0<=RULE_EGYSTRING)||LA6_0==11||(LA6_0>=13 && LA6_0<=24)||LA6_0==26||LA6_0==28||LA6_0==30||LA6_0==32||LA6_0==34||LA6_0==36||LA6_0==38||LA6_0==40||LA6_0==42||LA6_0==44||LA6_0==46||LA6_0==48||(LA6_0>=50 && LA6_0<=57)) ) {
                alt6=1;
            }
            switch (alt6) {
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
                    	    
                    pushFollow(FOLLOW_ruleSentenceItem_in_ruleSentence402);
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
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==9) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:210:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleSentence415); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:214:1: (this_NEWLINE_4= RULE_NEWLINE )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==RULE_NEWLINE) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:214:2: this_NEWLINE_4= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleSentence427); 
                    	             
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
                    	    	    
                    	    pushFollow(FOLLOW_ruleSentenceItem_in_ruleSentence449);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,10,FOLLOW_10_in_ruleSentence465); 

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
            pushFollow(FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem501);
            iv_ruleSentenceItem=ruleSentenceItem();

            state._fsp--;

             current =iv_ruleSentenceItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItem511); 

            }

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
            int alt7=3;
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
                alt7=1;
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
                alt7=2;
                }
                break;
            case 11:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:262:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleSentenceItem558);
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
                        
                    pushFollow(FOLLOW_ruleAbstractMarker_in_ruleSentenceItem585);
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
                        
                    pushFollow(FOLLOW_ruleAmbivalence_in_ruleSentenceItem612);
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
            pushFollow(FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker647);
            iv_ruleAbstractMarker=ruleAbstractMarker();

            state._fsp--;

             current =iv_ruleAbstractMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractMarker657); 

            }

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
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_BETWEEN_HASHES:
                {
                alt8=1;
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
                alt8=2;
                }
                break;
            case RULE_BETWEEN_MINUS:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:312:5: this_Marker_0= ruleMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMarker_in_ruleAbstractMarker704);
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
                        
                    pushFollow(FOLLOW_ruleVersMarker_in_ruleAbstractMarker731);
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
                        
                    pushFollow(FOLLOW_ruleDestructionMarker_in_ruleAbstractMarker758);
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
            pushFollow(FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence793);
            iv_ruleAmbivalence=ruleAmbivalence();

            state._fsp--;

             current =iv_ruleAmbivalence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAmbivalence803); 

            }

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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAmbivalence840); 

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
            	    
            pushFollow(FOLLOW_ruleCase_in_ruleAmbivalence862);
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
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:383:4: otherlv_2= '| ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAmbivalence875); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAmbivalenceAccess().getVerticalLineSpaceKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:387:1: (this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_NEWLINE) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:387:2: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleAmbivalence887); 
            	             
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
            	    	    
            	    pushFollow(FOLLOW_ruleCase_in_ruleAmbivalence909);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleAmbivalence924); 

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
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase960);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase970); 

            }

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
            lv_name_0_0=(Token)match(input,RULE_CASESTRING,FOLLOW_RULE_CASESTRING_in_ruleCase1012); 

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
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_NEWLINE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:452:3: this_NEWLINE_1= RULE_NEWLINE
                    {
                    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleCase1029); 
                     
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
            	    
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1052);
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
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==9) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:474:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleCase1065); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:478:1: (this_NEWLINE_4= RULE_NEWLINE )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_NEWLINE) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:478:2: this_NEWLINE_4= RULE_NEWLINE
            	            {
            	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleCase1077); 
            	             
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
            	    	    
            	    pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1099);
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
            	    break loop13;
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
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence1138);
            iv_ruleSentenceItemNoAmbivalence=ruleSentenceItemNoAmbivalence();

            state._fsp--;

             current =iv_ruleSentenceItemNoAmbivalence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence1148); 

            }

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
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_EGYSTRING||(LA14_0>=23 && LA14_0<=24)||LA14_0==26||LA14_0==28||LA14_0==30||LA14_0==32||LA14_0==34||LA14_0==36||LA14_0==38||LA14_0==40||LA14_0==42||LA14_0==44||LA14_0==46||LA14_0==48||(LA14_0>=50 && LA14_0<=57)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_BETWEEN_HASHES && LA14_0<=RULE_BETWEEN_MINUS)||(LA14_0>=13 && LA14_0<=22)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:522:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWord_in_ruleSentenceItemNoAmbivalence1195);
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
                        
                    pushFollow(FOLLOW_ruleAbstractMarker_in_ruleSentenceItemNoAmbivalence1222);
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
            pushFollow(FOLLOW_ruleVersMarker_in_entryRuleVersMarker1257);
            iv_ruleVersMarker=ruleVersMarker();

            state._fsp--;

             current =iv_ruleVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersMarker1267); 

            }

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
            int alt15=10;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 16:
                {
                alt15=4;
                }
                break;
            case 15:
                {
                alt15=5;
                }
                break;
            case 14:
                {
                alt15=6;
                }
                break;
            case 13:
                {
                alt15=7;
                }
                break;
            case 17:
                {
                alt15=8;
                }
                break;
            case 18:
                {
                alt15=9;
                }
                break;
            case 19:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:562:5: this_VersbreakMarker_0= ruleVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1314);
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
                        
                    pushFollow(FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1341);
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
                        
                    pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_ruleVersMarker1368);
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
                        
                    pushFollow(FOLLOW_ruleMissingVersMarker_in_ruleVersMarker1395);
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
                        
                    pushFollow(FOLLOW_ruleDestroyedVersMarker_in_ruleVersMarker1422);
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
                        
                    pushFollow(FOLLOW_ruleDeletedVersMarker_in_ruleVersMarker1449);
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
                        
                    pushFollow(FOLLOW_ruleDisputableVersMarker_in_ruleVersMarker1476);
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
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasurMarker_in_ruleVersMarker1503);
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
                        
                    pushFollow(FOLLOW_ruleAncientExpandedMarker_in_ruleVersMarker1530);
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
                        
                    pushFollow(FOLLOW_ruleRasurMarker_in_ruleVersMarker1557);
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
            pushFollow(FOLLOW_ruleDisputableVersMarker_in_entryRuleDisputableVersMarker1592);
            iv_ruleDisputableVersMarker=ruleDisputableVersMarker();

            state._fsp--;

             current =iv_ruleDisputableVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableVersMarker1602); 

            }

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDisputableVersMarker1648); 

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
            pushFollow(FOLLOW_ruleDeletedVersMarker_in_entryRuleDeletedVersMarker1684);
            iv_ruleDeletedVersMarker=ruleDeletedVersMarker();

            state._fsp--;

             current =iv_ruleDeletedVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletedVersMarker1694); 

            }

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDeletedVersMarker1740); 

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
            pushFollow(FOLLOW_ruleDestroyedVersMarker_in_entryRuleDestroyedVersMarker1776);
            iv_ruleDestroyedVersMarker=ruleDestroyedVersMarker();

            state._fsp--;

             current =iv_ruleDestroyedVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestroyedVersMarker1786); 

            }

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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDestroyedVersMarker1832); 

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
            pushFollow(FOLLOW_ruleMissingVersMarker_in_entryRuleMissingVersMarker1868);
            iv_ruleMissingVersMarker=ruleMissingVersMarker();

            state._fsp--;

             current =iv_ruleMissingVersMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMissingVersMarker1878); 

            }

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMissingVersMarker1924); 

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
            pushFollow(FOLLOW_ruleRestorationOverRasurMarker_in_entryRuleRestorationOverRasurMarker1960);
            iv_ruleRestorationOverRasurMarker=ruleRestorationOverRasurMarker();

            state._fsp--;

             current =iv_ruleRestorationOverRasurMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasurMarker1970); 

            }

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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleRestorationOverRasurMarker2016); 

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
            pushFollow(FOLLOW_ruleAncientExpandedMarker_in_entryRuleAncientExpandedMarker2052);
            iv_ruleAncientExpandedMarker=ruleAncientExpandedMarker();

            state._fsp--;

             current =iv_ruleAncientExpandedMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpandedMarker2062); 

            }

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAncientExpandedMarker2108); 

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
            pushFollow(FOLLOW_ruleRasurMarker_in_entryRuleRasurMarker2144);
            iv_ruleRasurMarker=ruleRasurMarker();

            state._fsp--;

             current =iv_ruleRasurMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasurMarker2154); 

            }

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRasurMarker2200); 

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
            pushFollow(FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker2236);
            iv_ruleVersFrontierMarker=ruleVersFrontierMarker();

            state._fsp--;

             current =iv_ruleVersFrontierMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersFrontierMarker2246); 

            }

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleVersFrontierMarker2292); 

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
            pushFollow(FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker2328);
            iv_ruleVersbreakMarker=ruleVersbreakMarker();

            state._fsp--;

             current =iv_ruleVersbreakMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersbreakMarker2338); 

            }

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVersbreakMarker2384); 

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
            pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker2420);
            iv_ruleBrokenVersbreakMarker=ruleBrokenVersbreakMarker();

            state._fsp--;

             current =iv_ruleBrokenVersbreakMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker2430); 

            }

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBrokenVersbreakMarker2476); 

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
            pushFollow(FOLLOW_ruleMarker_in_entryRuleMarker2512);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarker2522); 

            }

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
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_HASHES,FOLLOW_RULE_BETWEEN_HASHES_in_ruleMarker2563); 

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
            pushFollow(FOLLOW_ruleDestructionMarker_in_entryRuleDestructionMarker2603);
            iv_ruleDestructionMarker=ruleDestructionMarker();

            state._fsp--;

             current =iv_ruleDestructionMarker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestructionMarker2613); 

            }

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
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_MINUS,FOLLOW_RULE_BETWEEN_MINUS_in_ruleDestructionMarker2654); 

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
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord2694);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord2704); 

            }

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
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EGYSTRING||(LA16_0>=23 && LA16_0<=24)||LA16_0==26||LA16_0==28||LA16_0==30||LA16_0==32||LA16_0==34||LA16_0==36||LA16_0==38||LA16_0==40||LA16_0==42||LA16_0==44||LA16_0==46||LA16_0==48||(LA16_0>=50 && LA16_0<=57)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1076:1: (lv_wChar_1_0= ruleWordPart )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1076:1: (lv_wChar_1_0= ruleWordPart )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1077:3: lv_wChar_1_0= ruleWordPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWordPart_in_ruleWord2759);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            pushFollow(FOLLOW_ruleWordPart_in_entryRuleWordPart2796);
            iv_ruleWordPart=ruleWordPart();

            state._fsp--;

             current =iv_ruleWordPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordPart2806); 

            }

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
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1114:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleWordPart2844); 

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
            	    
            pushFollow(FOLLOW_ruleWordMiddle_in_ruleWordPart2867);
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
            pushFollow(FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2903);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMiddle2913); 

            }

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
            int alt18=3;
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
                alt18=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt18=2;
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
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1158:5: this_Brackets_0= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleWordMiddle2960);
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
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleWordMiddle2987);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleWordMiddle3014);
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
            pushFollow(FOLLOW_ruleChars_in_entryRuleChars3049);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChars3059); 

            }

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
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_ruleChars3100); 

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
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets3140);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets3150); 

            }

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
            int alt19=13;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 46:
                {
                alt19=3;
                }
                break;
            case 40:
                {
                alt19=4;
                }
                break;
            case 30:
                {
                alt19=5;
                }
                break;
            case 34:
                {
                alt19=6;
                }
                break;
            case 32:
                {
                alt19=7;
                }
                break;
            case 36:
                {
                alt19=8;
                }
                break;
            case 38:
                {
                alt19=9;
                }
                break;
            case 48:
                {
                alt19=10;
                }
                break;
            case 28:
                {
                alt19=11;
                }
                break;
            case 24:
                {
                alt19=12;
                }
                break;
            case 26:
                {
                alt19=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1247:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleBrackets3197);
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
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleBrackets3224);
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
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleBrackets3251);
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
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleBrackets3278);
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
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleBrackets3305);
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
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleBrackets3332);
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
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleBrackets3359);
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
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleBrackets3386);
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
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleBrackets3413);
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
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleBrackets3440);
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
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleBrackets3467);
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
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleBrackets3494);
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
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleBrackets3521);
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
            pushFollow(FOLLOW_ruleOval_in_entryRuleOval3556);
            iv_ruleOval=ruleOval();

            state._fsp--;

             current =iv_ruleOval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOval3566); 

            }

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
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleOval3603); 

                	newLeafNode(otherlv_0, grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1400:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
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
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1401:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1401:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1402:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleOval3624);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleOval3637); 

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
            pushFollow(FOLLOW_ruleSerech_in_entryRuleSerech3673);
            iv_ruleSerech=ruleSerech();

            state._fsp--;

             current =iv_ruleSerech; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSerech3683); 

            }

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
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSerech3720); 

                	newLeafNode(otherlv_0, grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1447:1: ( (lv_wChar_1_0= ruleNoCartouche ) )+
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
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1448:1: (lv_wChar_1_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1448:1: (lv_wChar_1_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1449:3: lv_wChar_1_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleSerech3741);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSerech3754); 

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
            pushFollow(FOLLOW_ruleCartouche_in_entryRuleCartouche3790);
            iv_ruleCartouche=ruleCartouche();

            state._fsp--;

             current =iv_ruleCartouche; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCartouche3800); 

            }

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCartouche3846); 

                	newLeafNode(otherlv_1, grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1500:1: ( (lv_wChar_2_0= ruleNoCartouche ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_EGYSTRING||LA22_0==30||LA22_0==32||LA22_0==34||LA22_0==36||LA22_0==38||LA22_0==40||LA22_0==42||LA22_0==44||LA22_0==46||LA22_0==48||(LA22_0>=50 && LA22_0<=57)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1501:1: (lv_wChar_2_0= ruleNoCartouche )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1501:1: (lv_wChar_2_0= ruleNoCartouche )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1502:3: lv_wChar_2_0= ruleNoCartouche
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoCartouche_in_ruleCartouche3867);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCartouche3880); 

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
            pushFollow(FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche3916);
            iv_ruleNoCartouche=ruleNoCartouche();

            state._fsp--;

             current =iv_ruleNoCartouche; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoCartouche3926); 

            }

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
            int alt23=12;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt23=1;
                }
                break;
            case 42:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 46:
                {
                alt23=4;
                }
                break;
            case 40:
                {
                alt23=5;
                }
                break;
            case 30:
                {
                alt23=6;
                }
                break;
            case 34:
                {
                alt23=7;
                }
                break;
            case 32:
                {
                alt23=8;
                }
                break;
            case 36:
                {
                alt23=9;
                }
                break;
            case 38:
                {
                alt23=10;
                }
                break;
            case 48:
                {
                alt23=11;
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
                alt23=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1544:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoCartouche3973);
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
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleNoCartouche4000);
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
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoCartouche4027);
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
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoCartouche4054);
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
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleNoCartouche4081);
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
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoCartouche4108);
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
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoCartouche4135);
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
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoCartouche4162);
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
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoCartouche4189);
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
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoCartouche4216);
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
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoCartouche4243);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoCartouche4270);
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
            pushFollow(FOLLOW_ruleExpanded_in_entryRuleExpanded4305);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpanded4315); 

            }

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleExpanded4361); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1693:1: ( (lv_wChar_2_0= ruleNoExpanded ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EGYSTRING||LA24_0==34||(LA24_0>=50 && LA24_0<=57)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1694:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1694:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1695:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpanded_in_ruleExpanded4382);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleExpanded4395); 

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
            pushFollow(FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded4431);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpanded4441); 

            }

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
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt25=1;
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
                alt25=2;
                }
                break;
            case 34:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1737:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpanded4488);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpanded4515);
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
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpanded4542);
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
            pushFollow(FOLLOW_ruleEmendation_in_entryRuleEmendation4577);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmendation4587); 

            }

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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleEmendation4633); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1796:1: ( (lv_wChar_2_0= ruleNoEmendation ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_EGYSTRING||LA26_0==30||LA26_0==34||(LA26_0>=50 && LA26_0<=57)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1797:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1797:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1798:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoEmendation_in_ruleEmendation4654);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleEmendation4667); 

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
            pushFollow(FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation4703);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoEmendation4713); 

            }

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
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt27=1;
                }
                break;
            case 30:
                {
                alt27=2;
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
                alt27=3;
                }
                break;
            case 34:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1840:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoEmendation4760);
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
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoEmendation4787);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoEmendation4814);
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
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoEmendation4841);
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
            pushFollow(FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading4876);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableReading4886); 

            }

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDisputableReading4932); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1909:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EGYSTRING||LA28_0==30||LA28_0==32||LA28_0==36||LA28_0==38||LA28_0==40||LA28_0==42||LA28_0==44||LA28_0==46||LA28_0==48||(LA28_0>=50 && LA28_0<=57)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1910:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1910:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1911:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading4953);
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleDisputableReading4966); 

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
            pushFollow(FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading5002);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDisputableReading5012); 

            }

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
            int alt29=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt29=1;
                }
                break;
            case 32:
                {
                alt29=2;
                }
                break;
            case 38:
                {
                alt29=3;
                }
                break;
            case 42:
                {
                alt29=4;
                }
                break;
            case 44:
                {
                alt29=5;
                }
                break;
            case 46:
                {
                alt29=6;
                }
                break;
            case 40:
                {
                alt29=7;
                }
                break;
            case 36:
                {
                alt29=8;
                }
                break;
            case 48:
                {
                alt29=9;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt29=10;
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
                alt29=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1953:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDisputableReading5059);
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
                        
                    pushFollow(FOLLOW_ruleEmendation_in_ruleNoDisputableReading5086);
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
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoDisputableReading5113);
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
                        
                    pushFollow(FOLLOW_ruleRasur_in_ruleNoDisputableReading5140);
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
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoDisputableReading5167);
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
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoDisputableReading5194);
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
                        
                    pushFollow(FOLLOW_ruleExpandedColumn_in_ruleNoDisputableReading5221);
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
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoDisputableReading5248);
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
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoDisputableReading5275);
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
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDisputableReading5302);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDisputableReading5329);
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
            pushFollow(FOLLOW_ruleLacuna_in_entryRuleLacuna5364);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLacuna5374); 

            }

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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleLacuna5420); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2092:1: ( (lv_wChar_2_0= ruleNoLacuna ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EGYSTRING||LA30_0==24||LA30_0==26||LA30_0==28||LA30_0==30||LA30_0==34||(LA30_0>=50 && LA30_0<=57)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2093:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2093:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2094:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoLacuna_in_ruleLacuna5441);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleLacuna5454); 

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
            pushFollow(FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna5490);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoLacuna5500); 

            }

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
            int alt31=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt31=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt31=2;
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
                alt31=3;
                }
                break;
            case 34:
                {
                alt31=4;
                }
                break;
            case 28:
                {
                alt31=5;
                }
                break;
            case 24:
                {
                alt31=6;
                }
                break;
            case 26:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2136:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoLacuna5547);
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
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoLacuna5574);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoLacuna5601);
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
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoLacuna5628);
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
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoLacuna5655);
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
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleNoLacuna5682);
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
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleNoLacuna5709);
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
            pushFollow(FOLLOW_ruleDeletion_in_entryRuleDeletion5744);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletion5754); 

            }

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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleDeletion5800); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2235:1: ( (lv_wChar_2_0= ruleNoDeletion ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EGYSTRING||LA32_0==30||LA32_0==34||LA32_0==36||LA32_0==44||LA32_0==46||LA32_0==48||(LA32_0>=50 && LA32_0<=57)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2236:1: (lv_wChar_2_0= ruleNoDeletion )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2236:1: (lv_wChar_2_0= ruleNoDeletion )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2237:3: lv_wChar_2_0= ruleNoDeletion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoDeletion_in_ruleDeletion5821);
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleDeletion5834); 

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
            pushFollow(FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion5870);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDeletion5880); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2274:1: ruleNoDeletion returns [EObject current=null] : (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2277:28: ( (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2278:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2278:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded | this_Interfix_3= ruleInterfix | this_DisputableReading_4= ruleDisputableReading | this_Lacuna_5= ruleLacuna | this_RestorationOverRasur_6= ruleRestorationOverRasur | this_AncientExpanded_7= ruleAncientExpanded )
            int alt33=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt33=1;
                }
                break;
            case 48:
                {
                alt33=2;
                }
                break;
            case 30:
                {
                alt33=3;
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
                alt33=4;
                }
                break;
            case 34:
                {
                alt33=5;
                }
                break;
            case 36:
                {
                alt33=6;
                }
                break;
            case 46:
                {
                alt33=7;
                }
                break;
            case 44:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2279:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoDeletion5927);
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
                        
                    pushFollow(FOLLOW_rulePartialDestruction_in_ruleNoDeletion5954);
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
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoDeletion5981);
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
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoDeletion6008);
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
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoDeletion6035);
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
                        
                    pushFollow(FOLLOW_ruleLacuna_in_ruleNoDeletion6062);
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
                        
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_ruleNoDeletion6089);
                    this_RestorationOverRasur_6=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2349:5: this_AncientExpanded_7= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getAncientExpandedParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleAncientExpanded_in_ruleNoDeletion6116);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2365:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2366:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2367:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn6151);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpandedColumn6161); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2374:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2377:28: ( ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2378:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2378:1: ( () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2378:2: () otherlv_1= '\\u2329\\u2329' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '\\u232A\\u232A'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2378:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2379:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleExpandedColumn6207); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2388:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EGYSTRING||LA34_0==30||LA34_0==34||(LA34_0>=50 && LA34_0<=57)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2389:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2389:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2390:3: lv_wChar_2_0= ruleNoExpandedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn6228);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleExpandedColumn6241); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2418:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2419:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2420:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn6277);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpandedColumn6287); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2427:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2430:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2431:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2431:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt35=1;
                }
                break;
            case 30:
                {
                alt35=2;
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
                alt35=3;
                }
                break;
            case 34:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2432:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoExpandedColumn6334);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2442:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoExpandedColumn6361);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2452:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoExpandedColumn6388);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2462:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoExpandedColumn6415);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2478:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2479:2: (iv_ruleRasur= ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2480:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_ruleRasur_in_entryRuleRasur6450);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasur6460); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2487:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2490:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2491:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2491:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2491:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2491:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2492:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleRasur6506); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2501:1: ( (lv_wChar_2_0= ruleNoRasur ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EGYSTRING||LA36_0==30||LA36_0==34||(LA36_0>=50 && LA36_0<=57)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2502:1: (lv_wChar_2_0= ruleNoRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2502:1: (lv_wChar_2_0= ruleNoRasur )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2503:3: lv_wChar_2_0= ruleNoRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoRasur_in_ruleRasur6527);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleRasur6540); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2531:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2532:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2533:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_ruleNoRasur_in_entryRuleNoRasur6576);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRasur6586); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2540:1: ruleNoRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2543:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2544:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2544:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt37=1;
                }
                break;
            case 30:
                {
                alt37=2;
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
                alt37=3;
                }
                break;
            case 34:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2545:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRasur6633);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2555:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoRasur6660);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2565:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRasur6687);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2575:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoRasur6714);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2591:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2592:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2593:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded6749);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpanded6759); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2600:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2603:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2604:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2604:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2604:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2604:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2605:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleAncientExpanded6805); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2614:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EGYSTRING||LA38_0==30||LA38_0==34||(LA38_0>=50 && LA38_0<=57)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2615:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2615:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2616:3: lv_wChar_2_0= ruleNoAncientExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded6826);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleAncientExpanded6839); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2644:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2645:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2646:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded6875);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoAncientExpanded6885); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2653:1: ruleNoAncientExpanded returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2656:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2657:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2657:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading )
            int alt39=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt39=1;
                }
                break;
            case 30:
                {
                alt39=2;
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
                alt39=3;
                }
                break;
            case 34:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2658:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoAncientExpanded6932);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2668:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoAncientExpanded6959);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2678:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoAncientExpanded6986);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2688:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoAncientExpanded7013);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2704:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2705:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2706:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur7048);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasur7058); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2713:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2716:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2717:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2717:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2717:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2717:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2718:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleRestorationOverRasur7104); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2727:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_EGYSTRING||LA40_0==28||LA40_0==30||LA40_0==34||(LA40_0>=50 && LA40_0<=57)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2728:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2728:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2729:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur7125);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleRestorationOverRasur7138); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2757:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2758:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2759:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur7174);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRestorationOverRasur7184); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2766:1: ruleNoRestorationOverRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche ) ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;

        EObject this_Interfix_2 = null;

        EObject this_DisputableReading_3 = null;

        EObject this_Cartouche_4 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2769:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2770:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2770:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded | this_Interfix_2= ruleInterfix | this_DisputableReading_3= ruleDisputableReading | this_Cartouche_4= ruleCartouche )
            int alt41=5;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt41=1;
                }
                break;
            case 30:
                {
                alt41=2;
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
                alt41=3;
                }
                break;
            case 34:
                {
                alt41=4;
                }
                break;
            case 28:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2771:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoRestorationOverRasur7231);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2781:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur7258);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2791:5: this_Interfix_2= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoRestorationOverRasur7285);
                    this_Interfix_2=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2801:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoRestorationOverRasur7312);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2811:5: this_Cartouche_4= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoRestorationOverRasur7339);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2827:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2828:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2829:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction7374);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialDestruction7384); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2836:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2839:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2840:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2840:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2840:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2840:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2841:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_rulePartialDestruction7430); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2850:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_EGYSTRING||LA42_0==24||LA42_0==26||LA42_0==28||LA42_0==30||LA42_0==34||LA42_0==38||(LA42_0>=50 && LA42_0<=57)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2851:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    {
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2851:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2852:3: lv_wChar_2_0= ruleNoPartialDestruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction7451);
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
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_rulePartialDestruction7464); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2880:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2881:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2882:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction7500);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoPartialDestruction7510); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2889:1: ruleNoPartialDestruction returns [EObject current=null] : (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2892:28: ( (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2893:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2893:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded | this_DisputableReading_3= ruleDisputableReading | this_Interfix_4= ruleInterfix | this_Cartouche_5= ruleCartouche | this_Oval_6= ruleOval | this_Serech_7= ruleSerech )
            int alt43=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt43=1;
                }
                break;
            case 38:
                {
                alt43=2;
                }
                break;
            case 30:
                {
                alt43=3;
                }
                break;
            case 34:
                {
                alt43=4;
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
                alt43=5;
                }
                break;
            case 28:
                {
                alt43=6;
                }
                break;
            case 24:
                {
                alt43=7;
                }
                break;
            case 26:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2894:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChars_in_ruleNoPartialDestruction7557);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2904:5: this_Deletion_1= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeletion_in_ruleNoPartialDestruction7584);
                    this_Deletion_1=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2914:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpanded_in_ruleNoPartialDestruction7611);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2924:5: this_DisputableReading_3= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDisputableReading_in_ruleNoPartialDestruction7638);
                    this_DisputableReading_3=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2934:5: this_Interfix_4= ruleInterfix
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfix_in_ruleNoPartialDestruction7665);
                    this_Interfix_4=ruleInterfix();

                    state._fsp--;

                     
                            current = this_Interfix_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2944:5: this_Cartouche_5= ruleCartouche
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCartouche_in_ruleNoPartialDestruction7692);
                    this_Cartouche_5=ruleCartouche();

                    state._fsp--;

                     
                            current = this_Cartouche_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2954:5: this_Oval_6= ruleOval
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleOval_in_ruleNoPartialDestruction7719);
                    this_Oval_6=ruleOval();

                    state._fsp--;

                     
                            current = this_Oval_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2964:5: this_Serech_7= ruleSerech
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSerech_in_ruleNoPartialDestruction7746);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2980:1: entryRuleInterfix returns [EObject current=null] : iv_ruleInterfix= ruleInterfix EOF ;
    public final EObject entryRuleInterfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfix = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2981:2: (iv_ruleInterfix= ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2982:2: iv_ruleInterfix= ruleInterfix EOF
            {
             newCompositeNode(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_ruleInterfix_in_entryRuleInterfix7781);
            iv_ruleInterfix=ruleInterfix();

            state._fsp--;

             current =iv_ruleInterfix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfix7791); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2989:1: ruleInterfix returns [EObject current=null] : (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) ;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2992:28: ( (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2993:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2993:1: (this_InterfixFlexion_0= ruleInterfixFlexion | this_InterfixLexical_1= ruleInterfixLexical | this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical | this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical | this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical | this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup | this_InterfixCompoundWords_6= ruleInterfixCompoundWords | this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement )
            int alt44=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt44=1;
                }
                break;
            case 50:
                {
                alt44=2;
                }
                break;
            case 52:
                {
                alt44=3;
                }
                break;
            case 53:
                {
                alt44=4;
                }
                break;
            case 54:
                {
                alt44=5;
                }
                break;
            case 55:
                {
                alt44=6;
                }
                break;
            case 56:
                {
                alt44=7;
                }
                break;
            case 57:
                {
                alt44=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2994:5: this_InterfixFlexion_0= ruleInterfixFlexion
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfixFlexion_in_ruleInterfix7838);
                    this_InterfixFlexion_0=ruleInterfixFlexion();

                    state._fsp--;

                     
                            current = this_InterfixFlexion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3004:5: this_InterfixLexical_1= ruleInterfixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterfixLexical_in_ruleInterfix7865);
                    this_InterfixLexical_1=ruleInterfixLexical();

                    state._fsp--;

                     
                            current = this_InterfixLexical_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3014:5: this_InterfixSuffixPronomLexical_2= ruleInterfixSuffixPronomLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix7892);
                    this_InterfixSuffixPronomLexical_2=ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     
                            current = this_InterfixSuffixPronomLexical_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3024:5: this_InterfixPrefixNonLexical_3= ruleInterfixPrefixNonLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix7919);
                    this_InterfixPrefixNonLexical_3=ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixNonLexical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3034:5: this_InterfixPrefixLexical_4= ruleInterfixPrefixLexical
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix7946);
                    this_InterfixPrefixLexical_4=ruleInterfixPrefixLexical();

                    state._fsp--;

                     
                            current = this_InterfixPrefixLexical_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3044:5: this_InterfixConnectionSyllabicGroup_5= ruleInterfixConnectionSyllabicGroup
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix7973);
                    this_InterfixConnectionSyllabicGroup_5=ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     
                            current = this_InterfixConnectionSyllabicGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3054:5: this_InterfixCompoundWords_6= ruleInterfixCompoundWords
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleInterfixCompoundWords_in_ruleInterfix8000);
                    this_InterfixCompoundWords_6=ruleInterfixCompoundWords();

                    state._fsp--;

                     
                            current = this_InterfixCompoundWords_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3064:5: this_InterfixPhoneticalComplement_7= ruleInterfixPhoneticalComplement
                    {
                     
                            newCompositeNode(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_ruleInterfix8027);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3080:1: entryRuleInterfixLexical returns [EObject current=null] : iv_ruleInterfixLexical= ruleInterfixLexical EOF ;
    public final EObject entryRuleInterfixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3081:2: (iv_ruleInterfixLexical= ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3082:2: iv_ruleInterfixLexical= ruleInterfixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical8062);
            iv_ruleInterfixLexical=ruleInterfixLexical();

            state._fsp--;

             current =iv_ruleInterfixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexical8072); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3089:1: ruleInterfixLexical returns [EObject current=null] : ( () otherlv_1= ',' ) ;
    public final EObject ruleInterfixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3092:28: ( ( () otherlv_1= ',' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3093:1: ( () otherlv_1= ',' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3093:1: ( () otherlv_1= ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3093:2: () otherlv_1= ','
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3093:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleInterfixLexical8118); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3111:1: entryRuleInterfixFlexion returns [EObject current=null] : iv_ruleInterfixFlexion= ruleInterfixFlexion EOF ;
    public final EObject entryRuleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixFlexion = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3112:2: (iv_ruleInterfixFlexion= ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3113:2: iv_ruleInterfixFlexion= ruleInterfixFlexion EOF
            {
             newCompositeNode(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion8154);
            iv_ruleInterfixFlexion=ruleInterfixFlexion();

            state._fsp--;

             current =iv_ruleInterfixFlexion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexion8164); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3120:1: ruleInterfixFlexion returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleInterfixFlexion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3123:28: ( ( () otherlv_1= '.' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3124:1: ( () otherlv_1= '.' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3124:1: ( () otherlv_1= '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3124:2: () otherlv_1= '.'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3124:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3125:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleInterfixFlexion8210); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3142:1: entryRuleInterfixSuffixPronomLexical returns [EObject current=null] : iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF ;
    public final EObject entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixSuffixPronomLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3143:2: (iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3144:2: iv_ruleInterfixSuffixPronomLexical= ruleInterfixSuffixPronomLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical8246);
            iv_ruleInterfixSuffixPronomLexical=ruleInterfixSuffixPronomLexical();

            state._fsp--;

             current =iv_ruleInterfixSuffixPronomLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical8256); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3151:1: ruleInterfixSuffixPronomLexical returns [EObject current=null] : ( () otherlv_1= '\\u2261' ) ;
    public final EObject ruleInterfixSuffixPronomLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3154:28: ( ( () otherlv_1= '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3155:1: ( () otherlv_1= '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3155:1: ( () otherlv_1= '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3155:2: () otherlv_1= '\\u2261'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3155:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleInterfixSuffixPronomLexical8302); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3173:1: entryRuleInterfixPrefixNonLexical returns [EObject current=null] : iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF ;
    public final EObject entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixNonLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3174:2: (iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3175:2: iv_ruleInterfixPrefixNonLexical= ruleInterfixPrefixNonLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical8338);
            iv_ruleInterfixPrefixNonLexical=ruleInterfixPrefixNonLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixNonLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical8348); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3182:1: ruleInterfixPrefixNonLexical returns [EObject current=null] : ( () otherlv_1= ':' ) ;
    public final EObject ruleInterfixPrefixNonLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3185:28: ( ( () otherlv_1= ':' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3186:1: ( () otherlv_1= ':' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3186:1: ( () otherlv_1= ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3186:2: () otherlv_1= ':'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3186:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3187:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleInterfixPrefixNonLexical8394); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3204:1: entryRuleInterfixPrefixLexical returns [EObject current=null] : iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF ;
    public final EObject entryRuleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPrefixLexical = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3205:2: (iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3206:2: iv_ruleInterfixPrefixLexical= ruleInterfixPrefixLexical EOF
            {
             newCompositeNode(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical8430);
            iv_ruleInterfixPrefixLexical=ruleInterfixPrefixLexical();

            state._fsp--;

             current =iv_ruleInterfixPrefixLexical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixLexical8440); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3213:1: ruleInterfixPrefixLexical returns [EObject current=null] : ( () otherlv_1= '\\u22EE' ) ;
    public final EObject ruleInterfixPrefixLexical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3216:28: ( ( () otherlv_1= '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3217:1: ( () otherlv_1= '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3217:1: ( () otherlv_1= '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3217:2: () otherlv_1= '\\u22EE'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3217:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInterfixPrefixLexical8486); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3235:1: entryRuleInterfixConnectionSyllabicGroup returns [EObject current=null] : iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF ;
    public final EObject entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixConnectionSyllabicGroup = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3236:2: (iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3237:2: iv_ruleInterfixConnectionSyllabicGroup= ruleInterfixConnectionSyllabicGroup EOF
            {
             newCompositeNode(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup8522);
            iv_ruleInterfixConnectionSyllabicGroup=ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             current =iv_ruleInterfixConnectionSyllabicGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup8532); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3244:1: ruleInterfixConnectionSyllabicGroup returns [EObject current=null] : ( () otherlv_1= '~' ) ;
    public final EObject ruleInterfixConnectionSyllabicGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3247:28: ( ( () otherlv_1= '~' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3248:1: ( () otherlv_1= '~' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3248:1: ( () otherlv_1= '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3248:2: () otherlv_1= '~'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3248:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3249:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleInterfixConnectionSyllabicGroup8578); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3266:1: entryRuleInterfixCompoundWords returns [EObject current=null] : iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF ;
    public final EObject entryRuleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixCompoundWords = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3267:2: (iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3268:2: iv_ruleInterfixCompoundWords= ruleInterfixCompoundWords EOF
            {
             newCompositeNode(grammarAccess.getInterfixCompoundWordsRule()); 
            pushFollow(FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords8614);
            iv_ruleInterfixCompoundWords=ruleInterfixCompoundWords();

            state._fsp--;

             current =iv_ruleInterfixCompoundWords; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixCompoundWords8624); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3275:1: ruleInterfixCompoundWords returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleInterfixCompoundWords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3278:28: ( ( () otherlv_1= '-' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3279:1: ( () otherlv_1= '-' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3279:1: ( () otherlv_1= '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3279:2: () otherlv_1= '-'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3279:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleInterfixCompoundWords8670); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3297:1: entryRuleInterfixPhoneticalComplement returns [EObject current=null] : iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF ;
    public final EObject entryRuleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfixPhoneticalComplement = null;


        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3298:2: (iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3299:2: iv_ruleInterfixPhoneticalComplement= ruleInterfixPhoneticalComplement EOF
            {
             newCompositeNode(grammarAccess.getInterfixPhoneticalComplementRule()); 
            pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement8706);
            iv_ruleInterfixPhoneticalComplement=ruleInterfixPhoneticalComplement();

            state._fsp--;

             current =iv_ruleInterfixPhoneticalComplement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement8716); 

            }

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3306:1: ruleInterfixPhoneticalComplement returns [EObject current=null] : ( () otherlv_1= ';' ) ;
    public final EObject ruleInterfixPhoneticalComplement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3309:28: ( ( () otherlv_1= ';' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3310:1: ( () otherlv_1= ';' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3310:1: ( () otherlv_1= ';' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3310:2: () otherlv_1= ';'
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3310:2: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:3311:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleInterfixPhoneticalComplement8762); 

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
    public static final BitSet FOLLOW_ruleTextItem_in_entryRuleTextItem234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextItem244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleTextItem290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleSentence380 = new BitSet(new long[]{0x03FD555555FFEDC0L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence402 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleSentence415 = new BitSet(new long[]{0x03FD555555FFE9D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleSentence427 = new BitSet(new long[]{0x03FD555555FFE9C0L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence449 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_ruleSentence465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItem511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItem558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItem585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_ruleSentenceItem612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMarker657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_ruleAbstractMarker704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_ruleAbstractMarker731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestructionMarker_in_ruleAbstractMarker758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAmbivalence803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAmbivalence840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence862 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAmbivalence875 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleAmbivalence887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence909 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleAmbivalence924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASESTRING_in_ruleCase1012 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1029 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1052 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_ruleCase1065 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1077 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1099 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItemNoAmbivalence1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItemNoAmbivalence1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_entryRuleVersMarker1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersMarker1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_ruleVersMarker1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMissingVersMarker_in_ruleVersMarker1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroyedVersMarker_in_ruleVersMarker1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletedVersMarker_in_ruleVersMarker1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableVersMarker_in_ruleVersMarker1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasurMarker_in_ruleVersMarker1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpandedMarker_in_ruleVersMarker1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasurMarker_in_ruleVersMarker1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableVersMarker_in_entryRuleDisputableVersMarker1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableVersMarker1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDisputableVersMarker1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletedVersMarker_in_entryRuleDeletedVersMarker1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletedVersMarker1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeletedVersMarker1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroyedVersMarker_in_entryRuleDestroyedVersMarker1776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestroyedVersMarker1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDestroyedVersMarker1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMissingVersMarker_in_entryRuleMissingVersMarker1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMissingVersMarker1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMissingVersMarker1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasurMarker_in_entryRuleRestorationOverRasurMarker1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasurMarker1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRestorationOverRasurMarker2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpandedMarker_in_entryRuleAncientExpandedMarker2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpandedMarker2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAncientExpandedMarker2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasurMarker_in_entryRuleRasurMarker2144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasurMarker2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRasurMarker2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker2236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVersFrontierMarker2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVersbreakMarker2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker2420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBrokenVersbreakMarker2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarker2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BETWEEN_HASHES_in_ruleMarker2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestructionMarker_in_entryRuleDestructionMarker2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestructionMarker2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BETWEEN_MINUS_in_ruleDestructionMarker2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord2694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_ruleWord2759 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordPart2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWordPart2844 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWordPart2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleWordMiddle2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleWordMiddle2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleWordMiddle3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_entryRuleChars3049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChars3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleChars3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets3140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleBrackets3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleBrackets3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleBrackets3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleBrackets3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleBrackets3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleBrackets3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleBrackets3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleBrackets3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleBrackets3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleBrackets3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleBrackets3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleBrackets3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleBrackets3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_entryRuleOval3556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOval3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOval3603 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleOval3624 = new BitSet(new long[]{0x03FD555557800100L});
    public static final BitSet FOLLOW_25_in_ruleOval3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_entryRuleSerech3673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSerech3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSerech3720 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleSerech3741 = new BitSet(new long[]{0x03FD55555D800100L});
    public static final BitSet FOLLOW_27_in_ruleSerech3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_entryRuleCartouche3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCartouche3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCartouche3846 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_ruleCartouche3867 = new BitSet(new long[]{0x03FD555575800100L});
    public static final BitSet FOLLOW_29_in_ruleCartouche3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche3916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoCartouche3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoCartouche3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleNoCartouche4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoCartouche4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoCartouche4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleNoCartouche4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoCartouche4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoCartouche4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoCartouche4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoCartouche4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoCartouche4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoCartouche4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoCartouche4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded4305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpanded4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleExpanded4361 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_ruleExpanded4382 = new BitSet(new long[]{0x03FD5555D5800100L});
    public static final BitSet FOLLOW_31_in_ruleExpanded4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded4431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpanded4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpanded4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation4577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmendation4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEmendation4633 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_ruleEmendation4654 = new BitSet(new long[]{0x03FD555755800100L});
    public static final BitSet FOLLOW_33_in_ruleEmendation4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation4703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoEmendation4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoEmendation4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoEmendation4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoEmendation4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading4876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDisputableReading4932 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading4953 = new BitSet(new long[]{0x03FD555D55800100L});
    public static final BitSet FOLLOW_35_in_ruleDisputableReading4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading5002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDisputableReading5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_ruleNoDisputableReading5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoDisputableReading5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_ruleNoDisputableReading5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoDisputableReading5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoDisputableReading5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleNoDisputableReading5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoDisputableReading5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDisputableReading5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDisputableReading5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDisputableReading5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna5364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLacuna5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLacuna5420 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_ruleLacuna5441 = new BitSet(new long[]{0x03FD557555800100L});
    public static final BitSet FOLLOW_37_in_ruleLacuna5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna5490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoLacuna5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoLacuna5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoLacuna5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoLacuna5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoLacuna5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleNoLacuna5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleNoLacuna5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion5744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletion5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDeletion5800 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_ruleDeletion5821 = new BitSet(new long[]{0x03FD55D555800100L});
    public static final BitSet FOLLOW_39_in_ruleDeletion5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion5870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoDeletion5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDeletion5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDeletion5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoDeletion6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoDeletion6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_ruleNoDeletion6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleNoDeletion6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleNoDeletion6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn6151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpandedColumn6207 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn6228 = new BitSet(new long[]{0x03FD575555800100L});
    public static final BitSet FOLLOW_41_in_ruleExpandedColumn6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn6277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoExpandedColumn6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoExpandedColumn6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoExpandedColumn6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoExpandedColumn6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur6450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasur6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRasur6506 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoRasur_in_ruleRasur6527 = new BitSet(new long[]{0x03FD5D5555800100L});
    public static final BitSet FOLLOW_43_in_ruleRasur6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur6576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRasur6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRasur6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRasur6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoRasur6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded6749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAncientExpanded6805 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded6826 = new BitSet(new long[]{0x03FD755555800100L});
    public static final BitSet FOLLOW_45_in_ruleAncientExpanded6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded6875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoAncientExpanded6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoAncientExpanded6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoAncientExpanded7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur7048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRestorationOverRasur7104 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur7125 = new BitSet(new long[]{0x03FDD55555800100L});
    public static final BitSet FOLLOW_47_in_ruleRestorationOverRasur7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur7174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoRestorationOverRasur7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoRestorationOverRasur7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoRestorationOverRasur7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction7374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePartialDestruction7430 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction7451 = new BitSet(new long[]{0x03FF555555800100L});
    public static final BitSet FOLLOW_49_in_rulePartialDestruction7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction7500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_ruleNoPartialDestruction7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_ruleNoPartialDestruction7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_ruleNoPartialDestruction7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_ruleNoPartialDestruction7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_ruleNoPartialDestruction7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_ruleNoPartialDestruction7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_ruleNoPartialDestruction7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix7781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfix7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_ruleInterfix7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_ruleInterfix7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_ruleInterfix7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_ruleInterfix7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_ruleInterfix7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_ruleInterfix7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_ruleInterfix8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_ruleInterfix8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical8062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInterfixLexical8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion8154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInterfixFlexion8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical8246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInterfixSuffixPronomLexical8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical8338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInterfixPrefixNonLexical8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical8430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInterfixPrefixLexical8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup8522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInterfixConnectionSyllabicGroup8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords8614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompoundWords8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInterfixCompoundWords8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement8706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInterfixPhoneticalComplement8762 = new BitSet(new long[]{0x0000000000000002L});

}