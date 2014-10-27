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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_CASESTRING", "RULE_BETWEEN_HASHES", "RULE_EGYSTRING", "RULE_COMMNENT_EGYSTRING", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "' '", "'\\u00C2\\u00A7'", "'%'", "'; '", "'\\uF0081'", "'\\uF0080'", "'\\uDB80\\uDC82'", "'-'", "'='", "'('", "')'", "'<'", "'>'", "'\\u2E2E'", "'?'", "'['", "']'", "'{'", "'}'", "'<<'", "'>>'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "'\\u2013'"
    };
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_NEWLINE=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CASESTRING=5;
    public static final int RULE_COMMNENT_EGYSTRING=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=12;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EGYSTRING=7;
    public static final int RULE_WS=9;
    public static final int RULE_BETWEEN_HASHES=6;

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:76:1: ruleTextContent returns [EObject current=null] : ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) ) ;
    public final EObject ruleTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_NEWLINE_3=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:79:28: ( ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:1: ( () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:2: () ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextContentAccess().getTextContentAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:2: ( ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:3: ( (lv_items_1_0= ruleTextItem ) ) ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )*
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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:2: ( (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NEWLINE||(LA2_0>=16 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:3: (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )? ( (lv_items_4_0= ruleTextItem ) )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:3: (otherlv_2= ' ' | this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt1=3;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==16) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==RULE_NEWLINE) ) {
            	        alt1=2;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:5: otherlv_2= ' '
            	            {
            	            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTextContent155); 

            	                	newLeafNode(otherlv_2, grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:109:6: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_ruleTextContent172); 
            	             
            	                newLeafNode(this_NEWLINE_3, grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:113:3: ( (lv_items_4_0= ruleTextItem ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:114:1: (lv_items_4_0= ruleTextItem )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:114:1: (lv_items_4_0= ruleTextItem )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:115:3: lv_items_4_0= ruleTextItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_ruleTextContent194);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:139:1: entryRuleTextItem returns [EObject current=null] : iv_ruleTextItem= ruleTextItem EOF ;
    public final EObject entryRuleTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:140:2: (iv_ruleTextItem= ruleTextItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:141:2: iv_ruleTextItem= ruleTextItem EOF
            {
             newCompositeNode(grammarAccess.getTextItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_entryRuleTextItem233);
            iv_ruleTextItem=ruleTextItem();

            state._fsp--;

             current =iv_ruleTextItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextItem243); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:148:1: ruleTextItem returns [EObject current=null] : this_Sentence_0= ruleSentence ;
    public final EObject ruleTextItem() throws RecognitionException {
        EObject current = null;

        EObject this_Sentence_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:151:28: (this_Sentence_0= ruleSentence )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:153:5: this_Sentence_0= ruleSentence
            {
             
                    newCompositeNode(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleTextItem289);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:169:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:170:2: (iv_ruleSentence= ruleSentence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:171:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_entryRuleSentence323);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentence333); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:178:1: ruleSentence returns [EObject current=null] : ( () otherlv_1= '\\u00C2\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00C2\\u00A7' ) ;
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
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:181:28: ( ( () otherlv_1= '\\u00C2\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00C2\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:182:1: ( () otherlv_1= '\\u00C2\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00C2\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:182:1: ( () otherlv_1= '\\u00C2\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:182:2: () otherlv_1= '\\u00C2\\u00A7' ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )? otherlv_6= '\\u00C2\\u00A7'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:182:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:183:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSentenceAccess().getSentenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSentence379); 

                	newLeafNode(otherlv_1, grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:192:1: ( ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_BETWEEN_HASHES && LA5_0<=RULE_EGYSTRING)||LA5_0==18||(LA5_0>=20 && LA5_0<=22)||(LA5_0>=24 && LA5_0<=25)||LA5_0==27||LA5_0==29||LA5_0==31||LA5_0==33||LA5_0==35||LA5_0==37||LA5_0==39||LA5_0==41||LA5_0==43||LA5_0==45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:192:2: ( (lv_items_2_0= ruleSentenceItem ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )*
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:192:2: ( (lv_items_2_0= ruleSentenceItem ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:193:1: (lv_items_2_0= ruleSentenceItem )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:193:1: (lv_items_2_0= ruleSentenceItem )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:194:3: lv_items_2_0= ruleSentenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_ruleSentence401);
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

                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:210:2: (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:210:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSentence414); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:214:1: (this_NEWLINE_4= RULE_NEWLINE )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_NEWLINE) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:214:2: this_NEWLINE_4= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_ruleSentence426); 
                    	             
                    	                newLeafNode(this_NEWLINE_4, grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:218:3: ( (lv_items_5_0= ruleSentenceItem ) )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:219:1: (lv_items_5_0= ruleSentenceItem )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:219:1: (lv_items_5_0= ruleSentenceItem )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:220:3: lv_items_5_0= ruleSentenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_ruleSentence448);
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

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSentence464); 

                	newLeafNode(otherlv_6, grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:248:1: entryRuleSentenceItem returns [EObject current=null] : iv_ruleSentenceItem= ruleSentenceItem EOF ;
    public final EObject entryRuleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:249:2: (iv_ruleSentenceItem= ruleSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:250:2: iv_ruleSentenceItem= ruleSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem500);
            iv_ruleSentenceItem=ruleSentenceItem();

            state._fsp--;

             current =iv_ruleSentenceItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentenceItem510); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:257:1: ruleSentenceItem returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) ;
    public final EObject ruleSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;

        EObject this_Ambivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:260:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:261:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:261:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker | this_Ambivalence_2= ruleAmbivalence )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
            case 24:
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
                {
                alt6=1;
                }
                break;
            case RULE_BETWEEN_HASHES:
            case 20:
            case 21:
            case 22:
                {
                alt6=2;
                }
                break;
            case 18:
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
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:262:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_ruleSentenceItem557);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:272:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_ruleSentenceItem584);
                    this_AbstractMarker_1=ruleAbstractMarker();

                    state._fsp--;

                     
                            current = this_AbstractMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:282:5: this_Ambivalence_2= ruleAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_ruleSentenceItem611);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:298:1: entryRuleAbstractMarker returns [EObject current=null] : iv_ruleAbstractMarker= ruleAbstractMarker EOF ;
    public final EObject entryRuleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:299:2: (iv_ruleAbstractMarker= ruleAbstractMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:300:2: iv_ruleAbstractMarker= ruleAbstractMarker EOF
            {
             newCompositeNode(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker646);
            iv_ruleAbstractMarker=ruleAbstractMarker();

            state._fsp--;

             current =iv_ruleAbstractMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMarker656); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:307:1: ruleAbstractMarker returns [EObject current=null] : (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker ) ;
    public final EObject ruleAbstractMarker() throws RecognitionException {
        EObject current = null;

        EObject this_Marker_0 = null;

        EObject this_VersMarker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:310:28: ( (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:311:1: (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:311:1: (this_Marker_0= ruleMarker | this_VersMarker_1= ruleVersMarker )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BETWEEN_HASHES) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=20 && LA7_0<=22)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:312:5: this_Marker_0= ruleMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMarker_in_ruleAbstractMarker703);
                    this_Marker_0=ruleMarker();

                    state._fsp--;

                     
                            current = this_Marker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:322:5: this_VersMarker_1= ruleVersMarker
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_ruleAbstractMarker730);
                    this_VersMarker_1=ruleVersMarker();

                    state._fsp--;

                     
                            current = this_VersMarker_1; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:338:1: entryRuleAmbivalence returns [EObject current=null] : iv_ruleAmbivalence= ruleAmbivalence EOF ;
    public final EObject entryRuleAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:339:2: (iv_ruleAmbivalence= ruleAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:340:2: iv_ruleAmbivalence= ruleAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence765);
            iv_ruleAmbivalence=ruleAmbivalence();

            state._fsp--;

             current =iv_ruleAmbivalence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAmbivalence775); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:347:1: ruleAmbivalence returns [EObject current=null] : (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' ) ;
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
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:350:28: ( (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:351:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:351:1: (otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:351:3: otherlv_0= '%' ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ ) otherlv_5= '%'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAmbivalence812); 

                	newLeafNode(otherlv_0, grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:355:1: ( ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+ )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:355:2: ( (lv_cases_1_0= ruleCase ) ) (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:355:2: ( (lv_cases_1_0= ruleCase ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:356:1: (lv_cases_1_0= ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:356:1: (lv_cases_1_0= ruleCase )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:357:3: lv_cases_1_0= ruleCase
            {
             
            	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_ruleAmbivalence834);
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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:373:2: (otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:373:4: otherlv_2= '; ' (this_NEWLINE_3= RULE_NEWLINE )? ( (lv_cases_4_0= ruleCase ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAmbivalence847); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAmbivalenceAccess().getSemicolonSpaceKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:377:1: (this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_NEWLINE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:377:2: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_ruleAmbivalence859); 
            	             
            	                newLeafNode(this_NEWLINE_3, grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:381:3: ( (lv_cases_4_0= ruleCase ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:382:1: (lv_cases_4_0= ruleCase )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:382:1: (lv_cases_4_0= ruleCase )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:383:3: lv_cases_4_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCase_in_ruleAmbivalence881);
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAmbivalence896); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:411:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:412:2: (iv_ruleCase= ruleCase EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:413:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_entryRuleCase932);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCase942); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:420:1: ruleCase returns [EObject current=null] : ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) ) ;
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
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:423:28: ( ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:424:1: ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:424:1: ( ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:424:2: ( (lv_name_0_0= RULE_CASESTRING ) ) (this_NEWLINE_1= RULE_NEWLINE )? ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:424:2: ( (lv_name_0_0= RULE_CASESTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:425:1: (lv_name_0_0= RULE_CASESTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:425:1: (lv_name_0_0= RULE_CASESTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:426:3: lv_name_0_0= RULE_CASESTRING
            {
            lv_name_0_0=(Token)match(input,RULE_CASESTRING,FollowSets000.FOLLOW_RULE_CASESTRING_in_ruleCase984); 

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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:442:2: (this_NEWLINE_1= RULE_NEWLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NEWLINE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:442:3: this_NEWLINE_1= RULE_NEWLINE
                    {
                    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_ruleCase1001); 
                     
                        newLeafNode(this_NEWLINE_1, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:446:3: ( ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:446:4: ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) ) (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:446:4: ( (lv_items_2_0= ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:447:1: (lv_items_2_0= ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:447:1: (lv_items_2_0= ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:448:3: lv_items_2_0= ruleSentenceItemNoAmbivalence
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1024);
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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:464:2: (otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:464:4: otherlv_3= ' ' (this_NEWLINE_4= RULE_NEWLINE )? ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCase1037); 

            	        	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:468:1: (this_NEWLINE_4= RULE_NEWLINE )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_NEWLINE) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:468:2: this_NEWLINE_4= RULE_NEWLINE
            	            {
            	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_ruleCase1049); 
            	             
            	                newLeafNode(this_NEWLINE_4, grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:472:3: ( (lv_items_5_0= ruleSentenceItemNoAmbivalence ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:473:1: (lv_items_5_0= ruleSentenceItemNoAmbivalence )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:473:1: (lv_items_5_0= ruleSentenceItemNoAmbivalence )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:474:3: lv_items_5_0= ruleSentenceItemNoAmbivalence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1071);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:498:1: entryRuleSentenceItemNoAmbivalence returns [EObject current=null] : iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF ;
    public final EObject entryRuleSentenceItemNoAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceItemNoAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:499:2: (iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:500:2: iv_ruleSentenceItemNoAmbivalence= ruleSentenceItemNoAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence1110);
            iv_ruleSentenceItemNoAmbivalence=ruleSentenceItemNoAmbivalence();

            state._fsp--;

             current =iv_ruleSentenceItemNoAmbivalence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence1120); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:507:1: ruleSentenceItemNoAmbivalence returns [EObject current=null] : (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker ) ;
    public final EObject ruleSentenceItemNoAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject this_Word_0 = null;

        EObject this_AbstractMarker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:510:28: ( (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:511:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:511:1: (this_Word_0= ruleWord | this_AbstractMarker_1= ruleAbstractMarker )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EGYSTRING||(LA13_0>=24 && LA13_0<=25)||LA13_0==27||LA13_0==29||LA13_0==31||LA13_0==33||LA13_0==35||LA13_0==37||LA13_0==39||LA13_0==41||LA13_0==43||LA13_0==45) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_BETWEEN_HASHES||(LA13_0>=20 && LA13_0<=22)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:512:5: this_Word_0= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_ruleSentenceItemNoAmbivalence1167);
                    this_Word_0=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:522:5: this_AbstractMarker_1= ruleAbstractMarker
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_ruleSentenceItemNoAmbivalence1194);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:538:1: entryRuleVersMarker returns [EObject current=null] : iv_ruleVersMarker= ruleVersMarker EOF ;
    public final EObject entryRuleVersMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:539:2: (iv_ruleVersMarker= ruleVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:540:2: iv_ruleVersMarker= ruleVersMarker EOF
            {
             newCompositeNode(grammarAccess.getVersMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_entryRuleVersMarker1229);
            iv_ruleVersMarker=ruleVersMarker();

            state._fsp--;

             current =iv_ruleVersMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersMarker1239); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:547:1: ruleVersMarker returns [EObject current=null] : (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker ) ;
    public final EObject ruleVersMarker() throws RecognitionException {
        EObject current = null;

        EObject this_VersbreakMarker_0 = null;

        EObject this_VersFrontierMarker_1 = null;

        EObject this_BrokenVersbreakMarker_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:550:28: ( (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:551:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:551:1: (this_VersbreakMarker_0= ruleVersbreakMarker | this_VersFrontierMarker_1= ruleVersFrontierMarker | this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker )
            int alt14=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:552:5: this_VersbreakMarker_0= ruleVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1286);
                    this_VersbreakMarker_0=ruleVersbreakMarker();

                    state._fsp--;

                     
                            current = this_VersbreakMarker_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:562:5: this_VersFrontierMarker_1= ruleVersFrontierMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1313);
                    this_VersFrontierMarker_1=ruleVersFrontierMarker();

                    state._fsp--;

                     
                            current = this_VersFrontierMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:572:5: this_BrokenVersbreakMarker_2= ruleBrokenVersbreakMarker
                    {
                     
                            newCompositeNode(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBrokenVersbreakMarker_in_ruleVersMarker1340);
                    this_BrokenVersbreakMarker_2=ruleBrokenVersbreakMarker();

                    state._fsp--;

                     
                            current = this_BrokenVersbreakMarker_2; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:588:1: entryRuleVersFrontierMarker returns [EObject current=null] : iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF ;
    public final EObject entryRuleVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersFrontierMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:589:2: (iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:590:2: iv_ruleVersFrontierMarker= ruleVersFrontierMarker EOF
            {
             newCompositeNode(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker1375);
            iv_ruleVersFrontierMarker=ruleVersFrontierMarker();

            state._fsp--;

             current =iv_ruleVersFrontierMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersFrontierMarker1385); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:597:1: ruleVersFrontierMarker returns [EObject current=null] : ( () otherlv_1= '\\uF0081' ) ;
    public final EObject ruleVersFrontierMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:600:28: ( ( () otherlv_1= '\\uF0081' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:601:1: ( () otherlv_1= '\\uF0081' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:601:1: ( () otherlv_1= '\\uF0081' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:601:2: () otherlv_1= '\\uF0081'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:601:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:602:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVersFrontierMarker1431); 

                	newLeafNode(otherlv_1, grammarAccess.getVersFrontierMarkerAccess().getPrivateUseAreaF008DigitOneKeyword_1());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:619:1: entryRuleVersbreakMarker returns [EObject current=null] : iv_ruleVersbreakMarker= ruleVersbreakMarker EOF ;
    public final EObject entryRuleVersbreakMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersbreakMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:620:2: (iv_ruleVersbreakMarker= ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:621:2: iv_ruleVersbreakMarker= ruleVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker1467);
            iv_ruleVersbreakMarker=ruleVersbreakMarker();

            state._fsp--;

             current =iv_ruleVersbreakMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersbreakMarker1477); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:628:1: ruleVersbreakMarker returns [EObject current=null] : ( () otherlv_1= '\\uF0080' ) ;
    public final EObject ruleVersbreakMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:631:28: ( ( () otherlv_1= '\\uF0080' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:632:1: ( () otherlv_1= '\\uF0080' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:632:1: ( () otherlv_1= '\\uF0080' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:632:2: () otherlv_1= '\\uF0080'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:632:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:633:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVersbreakMarker1523); 

                	newLeafNode(otherlv_1, grammarAccess.getVersbreakMarkerAccess().getPrivateUseAreaF008DigitZeroKeyword_1());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:650:1: entryRuleBrokenVersbreakMarker returns [EObject current=null] : iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF ;
    public final EObject entryRuleBrokenVersbreakMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrokenVersbreakMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:651:2: (iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:652:2: iv_ruleBrokenVersbreakMarker= ruleBrokenVersbreakMarker EOF
            {
             newCompositeNode(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker1559);
            iv_ruleBrokenVersbreakMarker=ruleBrokenVersbreakMarker();

            state._fsp--;

             current =iv_ruleBrokenVersbreakMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker1569); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:659:1: ruleBrokenVersbreakMarker returns [EObject current=null] : ( () otherlv_1= '\\uDB80\\uDC82' ) ;
    public final EObject ruleBrokenVersbreakMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:662:28: ( ( () otherlv_1= '\\uDB80\\uDC82' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:663:1: ( () otherlv_1= '\\uDB80\\uDC82' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:663:1: ( () otherlv_1= '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:663:2: () otherlv_1= '\\uDB80\\uDC82'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:663:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:664:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBrokenVersbreakMarker1615); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:681:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:682:2: (iv_ruleMarker= ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:683:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMarker_in_entryRuleMarker1651);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarker1661); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:690:1: ruleMarker returns [EObject current=null] : ( (lv_type_0_0= RULE_BETWEEN_HASHES ) ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:693:28: ( ( (lv_type_0_0= RULE_BETWEEN_HASHES ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:694:1: ( (lv_type_0_0= RULE_BETWEEN_HASHES ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:694:1: ( (lv_type_0_0= RULE_BETWEEN_HASHES ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:695:1: (lv_type_0_0= RULE_BETWEEN_HASHES )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:695:1: (lv_type_0_0= RULE_BETWEEN_HASHES )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:696:3: lv_type_0_0= RULE_BETWEEN_HASHES
            {
            lv_type_0_0=(Token)match(input,RULE_BETWEEN_HASHES,FollowSets000.FOLLOW_RULE_BETWEEN_HASHES_in_ruleMarker1702); 

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


    // $ANTLR start "entryRuleWord"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:720:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:721:2: (iv_ruleWord= ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:722:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWord_in_entryRuleWord1742);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWord1752); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:729:1: ruleWord returns [EObject current=null] : ( () ( ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )* ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_wChar_1_0 = null;

        EObject lv_wChar_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:732:28: ( ( () ( ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:733:1: ( () ( ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:733:1: ( () ( ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:733:2: () ( ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:733:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:734:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWordAccess().getWordAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:739:2: ( ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:739:3: ( (lv_wChar_1_0= ruleWordPart ) ) (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:739:3: ( (lv_wChar_1_0= ruleWordPart ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:740:1: (lv_wChar_1_0= ruleWordPart )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:740:1: (lv_wChar_1_0= ruleWordPart )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:741:3: lv_wChar_1_0= ruleWordPart
            {
             
            	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleWordPart_in_ruleWord1808);
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

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:757:2: (otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:757:4: otherlv_2= '-' ( (lv_wChar_3_0= ruleWordPart ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleWord1821); 

            	        	newLeafNode(otherlv_2, grammarAccess.getWordAccess().getHyphenMinusKeyword_1_1_0());
            	        
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:761:1: ( (lv_wChar_3_0= ruleWordPart ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:762:1: (lv_wChar_3_0= ruleWordPart )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:762:1: (lv_wChar_3_0= ruleWordPart )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:763:3: lv_wChar_3_0= ruleWordPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWordPart_in_ruleWord1842);
            	    lv_wChar_3_0=ruleWordPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWordRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_3_0, 
            	            		"WordPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleWordPart"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:787:1: entryRuleWordPart returns [EObject current=null] : iv_ruleWordPart= ruleWordPart EOF ;
    public final EObject entryRuleWordPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordPart = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:788:2: (iv_ruleWordPart= ruleWordPart EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:789:2: iv_ruleWordPart= ruleWordPart EOF
            {
             newCompositeNode(grammarAccess.getWordPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordPart_in_entryRuleWordPart1881);
            iv_ruleWordPart=ruleWordPart();

            state._fsp--;

             current =iv_ruleWordPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWordPart1891); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:796:1: ruleWordPart returns [EObject current=null] : ( (otherlv_0= '=' )? ( ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )* ) ) ;
    public final EObject ruleWordPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_wChar_1_0 = null;

        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:799:28: ( ( (otherlv_0= '=' )? ( ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:800:1: ( (otherlv_0= '=' )? ( ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:800:1: ( (otherlv_0= '=' )? ( ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:800:2: (otherlv_0= '=' )? ( ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:800:2: (otherlv_0= '=' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:800:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWordPart1929); 

                        	newLeafNode(otherlv_0, grammarAccess.getWordPartAccess().getEqualsSignKeyword_0());
                        

                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:804:3: ( ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:804:4: ( (lv_wChar_1_0= ruleWordMiddle ) ) ( (lv_wChar_2_0= ruleWordMiddle ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:804:4: ( (lv_wChar_1_0= ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:805:1: (lv_wChar_1_0= ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:805:1: (lv_wChar_1_0= ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:806:3: lv_wChar_1_0= ruleWordMiddle
            {
             
            	        newCompositeNode(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_ruleWordPart1953);
            lv_wChar_1_0=ruleWordMiddle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWordPartRule());
            	        }
                   		add(
                   			current, 
                   			"wChar",
                    		lv_wChar_1_0, 
                    		"WordMiddle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:822:2: ( (lv_wChar_2_0= ruleWordMiddle ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_EGYSTRING||LA17_0==25||LA17_0==27||LA17_0==29||LA17_0==31||LA17_0==33||LA17_0==35||LA17_0==37||LA17_0==39||LA17_0==41||LA17_0==43||LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:823:1: (lv_wChar_2_0= ruleWordMiddle )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:823:1: (lv_wChar_2_0= ruleWordMiddle )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:824:3: lv_wChar_2_0= ruleWordMiddle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_ruleWordPart1974);
            	    lv_wChar_2_0=ruleWordMiddle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWordPartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wChar",
            	            		lv_wChar_2_0, 
            	            		"WordMiddle");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleWordPart"


    // $ANTLR start "entryRuleWordMiddle"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:848:1: entryRuleWordMiddle returns [EObject current=null] : iv_ruleWordMiddle= ruleWordMiddle EOF ;
    public final EObject entryRuleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordMiddle = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:849:2: (iv_ruleWordMiddle= ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:850:2: iv_ruleWordMiddle= ruleWordMiddle EOF
            {
             newCompositeNode(grammarAccess.getWordMiddleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2012);
            iv_ruleWordMiddle=ruleWordMiddle();

            state._fsp--;

             current =iv_ruleWordMiddle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWordMiddle2022); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:857:1: ruleWordMiddle returns [EObject current=null] : (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars ) ;
    public final EObject ruleWordMiddle() throws RecognitionException {
        EObject current = null;

        EObject this_Brackets_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:860:28: ( (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:861:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:861:1: (this_Brackets_0= ruleBrackets | this_Chars_1= ruleChars )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25||LA18_0==27||LA18_0==29||LA18_0==31||LA18_0==33||LA18_0==35||LA18_0==37||LA18_0==39||LA18_0==41||LA18_0==43||LA18_0==45) ) {
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
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:862:5: this_Brackets_0= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_ruleWordMiddle2069);
                    this_Brackets_0=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:872:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleWordMiddle2096);
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
    // $ANTLR end "ruleWordMiddle"


    // $ANTLR start "entryRuleChars"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:888:1: entryRuleChars returns [EObject current=null] : iv_ruleChars= ruleChars EOF ;
    public final EObject entryRuleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChars = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:889:2: (iv_ruleChars= ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:890:2: iv_ruleChars= ruleChars EOF
            {
             newCompositeNode(grammarAccess.getCharsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_entryRuleChars2131);
            iv_ruleChars=ruleChars();

            state._fsp--;

             current =iv_ruleChars; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChars2141); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:897:1: ruleChars returns [EObject current=null] : ( (lv_name_0_0= RULE_EGYSTRING ) ) ;
    public final EObject ruleChars() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:900:28: ( ( (lv_name_0_0= RULE_EGYSTRING ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:901:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:901:1: ( (lv_name_0_0= RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:902:1: (lv_name_0_0= RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:902:1: (lv_name_0_0= RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:903:3: lv_name_0_0= RULE_EGYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_ruleChars2182); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:927:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:928:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:929:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_entryRuleBrackets2222);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrackets2232); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:936:1: ruleBrackets returns [EObject current=null] : (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction ) ;
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
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:939:28: ( (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:940:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:940:1: (this_Rasur_0= ruleRasur | this_AncientExpanded_1= ruleAncientExpanded | this_RestorationOverRasur_2= ruleRestorationOverRasur | this_Expanded_3= ruleExpanded | this_DisputableReading_4= ruleDisputableReading | this_Emendation_5= ruleEmendation | this_Lacuna_6= ruleLacuna | this_Deletion_7= ruleDeletion | this_ExpandedColumn_8= ruleExpandedColumn | this_PartialDestruction_9= rulePartialDestruction | this_Destruction_10= ruleDestruction )
            int alt19=11;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            case 25:
                {
                alt19=4;
                }
                break;
            case 29:
                {
                alt19=5;
                }
                break;
            case 27:
                {
                alt19=6;
                }
                break;
            case 31:
                {
                alt19=7;
                }
                break;
            case 33:
                {
                alt19=8;
                }
                break;
            case 35:
                {
                alt19=9;
                }
                break;
            case 43:
                {
                alt19=10;
                }
                break;
            case 45:
                {
                alt19=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:941:5: this_Rasur_0= ruleRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRasur_in_ruleBrackets2279);
                    this_Rasur_0=ruleRasur();

                    state._fsp--;

                     
                            current = this_Rasur_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:951:5: this_AncientExpanded_1= ruleAncientExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_ruleBrackets2306);
                    this_AncientExpanded_1=ruleAncientExpanded();

                    state._fsp--;

                     
                            current = this_AncientExpanded_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:961:5: this_RestorationOverRasur_2= ruleRestorationOverRasur
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_ruleBrackets2333);
                    this_RestorationOverRasur_2=ruleRestorationOverRasur();

                    state._fsp--;

                     
                            current = this_RestorationOverRasur_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:971:5: this_Expanded_3= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleBrackets2360);
                    this_Expanded_3=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:981:5: this_DisputableReading_4= ruleDisputableReading
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_ruleBrackets2387);
                    this_DisputableReading_4=ruleDisputableReading();

                    state._fsp--;

                     
                            current = this_DisputableReading_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:991:5: this_Emendation_5= ruleEmendation
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_ruleBrackets2414);
                    this_Emendation_5=ruleEmendation();

                    state._fsp--;

                     
                            current = this_Emendation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1001:5: this_Lacuna_6= ruleLacuna
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_ruleBrackets2441);
                    this_Lacuna_6=ruleLacuna();

                    state._fsp--;

                     
                            current = this_Lacuna_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1011:5: this_Deletion_7= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_ruleBrackets2468);
                    this_Deletion_7=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1021:5: this_ExpandedColumn_8= ruleExpandedColumn
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_ruleBrackets2495);
                    this_ExpandedColumn_8=ruleExpandedColumn();

                    state._fsp--;

                     
                            current = this_ExpandedColumn_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1031:5: this_PartialDestruction_9= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_ruleBrackets2522);
                    this_PartialDestruction_9=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1041:5: this_Destruction_10= ruleDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_ruleBrackets2549);
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1057:1: entryRuleExpanded returns [EObject current=null] : iv_ruleExpanded= ruleExpanded EOF ;
    public final EObject entryRuleExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1058:2: (iv_ruleExpanded= ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1059:2: iv_ruleExpanded= ruleExpanded EOF
            {
             newCompositeNode(grammarAccess.getExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_entryRuleExpanded2584);
            iv_ruleExpanded=ruleExpanded();

            state._fsp--;

             current =iv_ruleExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpanded2594); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1066:1: ruleExpanded returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) ;
    public final EObject ruleExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1069:28: ( ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1070:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1070:1: ( () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1070:2: () otherlv_1= '(' ( (lv_wChar_2_0= ruleNoExpanded ) )+ otherlv_3= ')'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1070:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1071:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedAccess().getExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExpanded2640); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1080:1: ( (lv_wChar_2_0= ruleNoExpanded ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EGYSTRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1081:1: (lv_wChar_2_0= ruleNoExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1081:1: (lv_wChar_2_0= ruleNoExpanded )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1082:3: lv_wChar_2_0= ruleNoExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_ruleExpanded2661);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExpanded2674); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1110:1: entryRuleNoExpanded returns [EObject current=null] : iv_ruleNoExpanded= ruleNoExpanded EOF ;
    public final EObject entryRuleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1111:2: (iv_ruleNoExpanded= ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1112:2: iv_ruleNoExpanded= ruleNoExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded2710);
            iv_ruleNoExpanded=ruleNoExpanded();

            state._fsp--;

             current =iv_ruleNoExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpanded2720); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1119:1: ruleNoExpanded returns [EObject current=null] : this_Chars_0= ruleChars ;
    public final EObject ruleNoExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1122:28: (this_Chars_0= ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1124:5: this_Chars_0= ruleChars
            {
             
                    newCompositeNode(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoExpanded2766);
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
    // $ANTLR end "ruleNoExpanded"


    // $ANTLR start "entryRuleEmendation"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1140:1: entryRuleEmendation returns [EObject current=null] : iv_ruleEmendation= ruleEmendation EOF ;
    public final EObject entryRuleEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1141:2: (iv_ruleEmendation= ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1142:2: iv_ruleEmendation= ruleEmendation EOF
            {
             newCompositeNode(grammarAccess.getEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_entryRuleEmendation2800);
            iv_ruleEmendation=ruleEmendation();

            state._fsp--;

             current =iv_ruleEmendation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmendation2810); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1149:1: ruleEmendation returns [EObject current=null] : ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '>' ) ;
    public final EObject ruleEmendation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1152:28: ( ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '>' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1153:1: ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1153:1: ( () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '>' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1153:2: () otherlv_1= '<' ( (lv_wChar_2_0= ruleNoEmendation ) )+ otherlv_3= '>'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1153:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1154:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmendationAccess().getEmendationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEmendation2856); 

                	newLeafNode(otherlv_1, grammarAccess.getEmendationAccess().getLessThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1163:1: ( (lv_wChar_2_0= ruleNoEmendation ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EGYSTRING||LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1164:1: (lv_wChar_2_0= ruleNoEmendation )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1164:1: (lv_wChar_2_0= ruleNoEmendation )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1165:3: lv_wChar_2_0= ruleNoEmendation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_ruleEmendation2877);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEmendation2890); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1193:1: entryRuleNoEmendation returns [EObject current=null] : iv_ruleNoEmendation= ruleNoEmendation EOF ;
    public final EObject entryRuleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmendation = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1194:2: (iv_ruleNoEmendation= ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1195:2: iv_ruleNoEmendation= ruleNoEmendation EOF
            {
             newCompositeNode(grammarAccess.getNoEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2926);
            iv_ruleNoEmendation=ruleNoEmendation();

            state._fsp--;

             current =iv_ruleNoEmendation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoEmendation2936); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1202:1: ruleNoEmendation returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) ;
    public final EObject ruleNoEmendation() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1205:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1206:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1206:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_EGYSTRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==25) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1207:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoEmendation2983);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1217:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoEmendation3010);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1233:1: entryRuleDisputableReading returns [EObject current=null] : iv_ruleDisputableReading= ruleDisputableReading EOF ;
    public final EObject entryRuleDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1234:2: (iv_ruleDisputableReading= ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1235:2: iv_ruleDisputableReading= ruleDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading3045);
            iv_ruleDisputableReading=ruleDisputableReading();

            state._fsp--;

             current =iv_ruleDisputableReading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisputableReading3055); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1242:1: ruleDisputableReading returns [EObject current=null] : ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) ;
    public final EObject ruleDisputableReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1245:28: ( ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1246:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1246:1: ( () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1246:2: () otherlv_1= '\\u2E2E' ( (lv_wChar_2_0= ruleNoDisputableReading ) )+ otherlv_3= '?'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1246:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1247:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDisputableReading3101); 

                	newLeafNode(otherlv_1, grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1256:1: ( (lv_wChar_2_0= ruleNoDisputableReading ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EGYSTRING||LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1257:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1257:1: (lv_wChar_2_0= ruleNoDisputableReading )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1258:3: lv_wChar_2_0= ruleNoDisputableReading
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading3122);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDisputableReading3135); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1286:1: entryRuleNoDisputableReading returns [EObject current=null] : iv_ruleNoDisputableReading= ruleNoDisputableReading EOF ;
    public final EObject entryRuleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDisputableReading = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1287:2: (iv_ruleNoDisputableReading= ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1288:2: iv_ruleNoDisputableReading= ruleNoDisputableReading EOF
            {
             newCompositeNode(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading3171);
            iv_ruleNoDisputableReading=ruleNoDisputableReading();

            state._fsp--;

             current =iv_ruleNoDisputableReading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDisputableReading3181); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1295:1: ruleNoDisputableReading returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoDisputableReading() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1298:28: ( (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1299:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1299:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_EGYSTRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1300:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoDisputableReading3228);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1310:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoDisputableReading3255);
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
    // $ANTLR end "ruleNoDisputableReading"


    // $ANTLR start "entryRuleLacuna"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1326:1: entryRuleLacuna returns [EObject current=null] : iv_ruleLacuna= ruleLacuna EOF ;
    public final EObject entryRuleLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1327:2: (iv_ruleLacuna= ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1328:2: iv_ruleLacuna= ruleLacuna EOF
            {
             newCompositeNode(grammarAccess.getLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_entryRuleLacuna3290);
            iv_ruleLacuna=ruleLacuna();

            state._fsp--;

             current =iv_ruleLacuna; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLacuna3300); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1335:1: ruleLacuna returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) ;
    public final EObject ruleLacuna() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1338:28: ( ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1339:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1339:1: ( () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1339:2: () otherlv_1= '[' ( (lv_wChar_2_0= ruleNoLacuna ) )+ otherlv_3= ']'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1339:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1340:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLacunaAccess().getLacunaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLacuna3346); 

                	newLeafNode(otherlv_1, grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1349:1: ( (lv_wChar_2_0= ruleNoLacuna ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_EGYSTRING||LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1350:1: (lv_wChar_2_0= ruleNoLacuna )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1350:1: (lv_wChar_2_0= ruleNoLacuna )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1351:3: lv_wChar_2_0= ruleNoLacuna
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_ruleLacuna3367);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLacuna3380); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1379:1: entryRuleNoLacuna returns [EObject current=null] : iv_ruleNoLacuna= ruleNoLacuna EOF ;
    public final EObject entryRuleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoLacuna = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1380:2: (iv_ruleNoLacuna= ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1381:2: iv_ruleNoLacuna= ruleNoLacuna EOF
            {
             newCompositeNode(grammarAccess.getNoLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna3416);
            iv_ruleNoLacuna=ruleNoLacuna();

            state._fsp--;

             current =iv_ruleNoLacuna; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoLacuna3426); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1388:1: ruleNoLacuna returns [EObject current=null] : (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars ) ;
    public final EObject ruleNoLacuna() throws RecognitionException {
        EObject current = null;

        EObject this_Expanded_0 = null;

        EObject this_Chars_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1391:28: ( (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1392:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1392:1: (this_Expanded_0= ruleExpanded | this_Chars_1= ruleChars )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_EGYSTRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1393:5: this_Expanded_0= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoLacuna3473);
                    this_Expanded_0=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1403:5: this_Chars_1= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoLacuna3500);
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
    // $ANTLR end "ruleNoLacuna"


    // $ANTLR start "entryRuleDeletion"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1419:1: entryRuleDeletion returns [EObject current=null] : iv_ruleDeletion= ruleDeletion EOF ;
    public final EObject entryRuleDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1420:2: (iv_ruleDeletion= ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1421:2: iv_ruleDeletion= ruleDeletion EOF
            {
             newCompositeNode(grammarAccess.getDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_entryRuleDeletion3535);
            iv_ruleDeletion=ruleDeletion();

            state._fsp--;

             current =iv_ruleDeletion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeletion3545); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1428:1: ruleDeletion returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDeletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1431:28: ( ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1432:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1432:1: ( () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1432:2: () otherlv_1= '{' ( (lv_wChar_2_0= ruleNoDeletion ) )+ otherlv_3= '}'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1432:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeletionAccess().getDeletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDeletion3591); 

                	newLeafNode(otherlv_1, grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1442:1: ( (lv_wChar_2_0= ruleNoDeletion ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EGYSTRING||LA27_0==25||LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1443:1: (lv_wChar_2_0= ruleNoDeletion )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1443:1: (lv_wChar_2_0= ruleNoDeletion )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1444:3: lv_wChar_2_0= ruleNoDeletion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_ruleDeletion3612);
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDeletion3625); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1472:1: entryRuleNoDeletion returns [EObject current=null] : iv_ruleNoDeletion= ruleNoDeletion EOF ;
    public final EObject entryRuleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoDeletion = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1473:2: (iv_ruleNoDeletion= ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1474:2: iv_ruleNoDeletion= ruleNoDeletion EOF
            {
             newCompositeNode(grammarAccess.getNoDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion3661);
            iv_ruleNoDeletion=ruleNoDeletion();

            state._fsp--;

             current =iv_ruleNoDeletion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDeletion3671); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1481:1: ruleNoDeletion returns [EObject current=null] : (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded ) ;
    public final EObject ruleNoDeletion() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_PartialDestruction_1 = null;

        EObject this_Expanded_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1484:28: ( (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1485:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1485:1: (this_Chars_0= ruleChars | this_PartialDestruction_1= rulePartialDestruction | this_Expanded_2= ruleExpanded )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt28=1;
                }
                break;
            case 43:
                {
                alt28=2;
                }
                break;
            case 25:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1486:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoDeletion3718);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1496:5: this_PartialDestruction_1= rulePartialDestruction
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_ruleNoDeletion3745);
                    this_PartialDestruction_1=rulePartialDestruction();

                    state._fsp--;

                     
                            current = this_PartialDestruction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1506:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoDeletion3772);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1522:1: entryRuleExpandedColumn returns [EObject current=null] : iv_ruleExpandedColumn= ruleExpandedColumn EOF ;
    public final EObject entryRuleExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1523:2: (iv_ruleExpandedColumn= ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1524:2: iv_ruleExpandedColumn= ruleExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn3807);
            iv_ruleExpandedColumn=ruleExpandedColumn();

            state._fsp--;

             current =iv_ruleExpandedColumn; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpandedColumn3817); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1531:1: ruleExpandedColumn returns [EObject current=null] : ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '>>' ) ;
    public final EObject ruleExpandedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1534:28: ( ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '>>' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1535:1: ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '>>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1535:1: ( () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '>>' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1535:2: () otherlv_1= '<<' ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+ otherlv_3= '>>'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1535:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1536:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleExpandedColumn3863); 

                	newLeafNode(otherlv_1, grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1545:1: ( (lv_wChar_2_0= ruleNoExpandedColumn ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EGYSTRING||LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1546:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1546:1: (lv_wChar_2_0= ruleNoExpandedColumn )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1547:3: lv_wChar_2_0= ruleNoExpandedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn3884);
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleExpandedColumn3897); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1575:1: entryRuleNoExpandedColumn returns [EObject current=null] : iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF ;
    public final EObject entryRuleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoExpandedColumn = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1576:2: (iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1577:2: iv_ruleNoExpandedColumn= ruleNoExpandedColumn EOF
            {
             newCompositeNode(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn3933);
            iv_ruleNoExpandedColumn=ruleNoExpandedColumn();

            state._fsp--;

             current =iv_ruleNoExpandedColumn; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpandedColumn3943); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1584:1: ruleNoExpandedColumn returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) ;
    public final EObject ruleNoExpandedColumn() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1587:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1588:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1588:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_EGYSTRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==25) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1589:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoExpandedColumn3990);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1599:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoExpandedColumn4017);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1615:1: entryRuleRasur returns [EObject current=null] : iv_ruleRasur= ruleRasur EOF ;
    public final EObject entryRuleRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1616:2: (iv_ruleRasur= ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1617:2: iv_ruleRasur= ruleRasur EOF
            {
             newCompositeNode(grammarAccess.getRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRasur_in_entryRuleRasur4052);
            iv_ruleRasur=ruleRasur();

            state._fsp--;

             current =iv_ruleRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRasur4062); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1624:1: ruleRasur returns [EObject current=null] : ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) ;
    public final EObject ruleRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1627:28: ( ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1628:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1628:1: ( () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1628:2: () otherlv_1= '{{' ( (lv_wChar_2_0= ruleNoRasur ) )+ otherlv_3= '}}'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1628:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1629:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRasurAccess().getRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRasur4108); 

                	newLeafNode(otherlv_1, grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1638:1: ( (lv_wChar_2_0= ruleNoRasur ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_EGYSTRING||LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1639:1: (lv_wChar_2_0= ruleNoRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1639:1: (lv_wChar_2_0= ruleNoRasur )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1640:3: lv_wChar_2_0= ruleNoRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_ruleRasur4129);
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRasur4142); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1668:1: entryRuleNoRasur returns [EObject current=null] : iv_ruleNoRasur= ruleNoRasur EOF ;
    public final EObject entryRuleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1669:2: (iv_ruleNoRasur= ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1670:2: iv_ruleNoRasur= ruleNoRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_entryRuleNoRasur4178);
            iv_ruleNoRasur=ruleNoRasur();

            state._fsp--;

             current =iv_ruleNoRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRasur4188); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1677:1: ruleNoRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) ;
    public final EObject ruleNoRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1680:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1681:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1681:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_EGYSTRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==25) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1682:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoRasur4235);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1692:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoRasur4262);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1708:1: entryRuleAncientExpanded returns [EObject current=null] : iv_ruleAncientExpanded= ruleAncientExpanded EOF ;
    public final EObject entryRuleAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1709:2: (iv_ruleAncientExpanded= ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1710:2: iv_ruleAncientExpanded= ruleAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded4297);
            iv_ruleAncientExpanded=ruleAncientExpanded();

            state._fsp--;

             current =iv_ruleAncientExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAncientExpanded4307); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1717:1: ruleAncientExpanded returns [EObject current=null] : ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) ;
    public final EObject ruleAncientExpanded() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1720:28: ( ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1721:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1721:1: ( () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1721:2: () otherlv_1= '((' ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+ otherlv_3= '))'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1721:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1722:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAncientExpanded4353); 

                	newLeafNode(otherlv_1, grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1731:1: ( (lv_wChar_2_0= ruleNoAncientExpanded ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_EGYSTRING||LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1732:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1732:1: (lv_wChar_2_0= ruleNoAncientExpanded )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1733:3: lv_wChar_2_0= ruleNoAncientExpanded
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded4374);
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAncientExpanded4387); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1761:1: entryRuleNoAncientExpanded returns [EObject current=null] : iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF ;
    public final EObject entryRuleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAncientExpanded = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1762:2: (iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1763:2: iv_ruleNoAncientExpanded= ruleNoAncientExpanded EOF
            {
             newCompositeNode(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded4423);
            iv_ruleNoAncientExpanded=ruleNoAncientExpanded();

            state._fsp--;

             current =iv_ruleNoAncientExpanded; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAncientExpanded4433); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1770:1: ruleNoAncientExpanded returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) ;
    public final EObject ruleNoAncientExpanded() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1773:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1774:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1774:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_EGYSTRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==25) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1775:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoAncientExpanded4480);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1785:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoAncientExpanded4507);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1801:1: entryRuleRestorationOverRasur returns [EObject current=null] : iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF ;
    public final EObject entryRuleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1802:2: (iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1803:2: iv_ruleRestorationOverRasur= ruleRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur4542);
            iv_ruleRestorationOverRasur=ruleRestorationOverRasur();

            state._fsp--;

             current =iv_ruleRestorationOverRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestorationOverRasur4552); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1810:1: ruleRestorationOverRasur returns [EObject current=null] : ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) ;
    public final EObject ruleRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1813:28: ( ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1814:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1814:1: ( () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1814:2: () otherlv_1= '[[' ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+ otherlv_3= ']]'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1814:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1815:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRestorationOverRasur4598); 

                	newLeafNode(otherlv_1, grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1824:1: ( (lv_wChar_2_0= ruleNoRestorationOverRasur ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_EGYSTRING||LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1825:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1825:1: (lv_wChar_2_0= ruleNoRestorationOverRasur )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1826:3: lv_wChar_2_0= ruleNoRestorationOverRasur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur4619);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRestorationOverRasur4632); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1854:1: entryRuleNoRestorationOverRasur returns [EObject current=null] : iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF ;
    public final EObject entryRuleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoRestorationOverRasur = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1855:2: (iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1856:2: iv_ruleNoRestorationOverRasur= ruleNoRestorationOverRasur EOF
            {
             newCompositeNode(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur4668);
            iv_ruleNoRestorationOverRasur=ruleNoRestorationOverRasur();

            state._fsp--;

             current =iv_ruleNoRestorationOverRasur; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRestorationOverRasur4678); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1863:1: ruleNoRestorationOverRasur returns [EObject current=null] : (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) ;
    public final EObject ruleNoRestorationOverRasur() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Expanded_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1866:28: ( (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1867:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1867:1: (this_Chars_0= ruleChars | this_Expanded_1= ruleExpanded )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_EGYSTRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==25) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1868:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoRestorationOverRasur4725);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1878:5: this_Expanded_1= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur4752);
                    this_Expanded_1=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_1; 
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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1894:1: entryRulePartialDestruction returns [EObject current=null] : iv_rulePartialDestruction= rulePartialDestruction EOF ;
    public final EObject entryRulePartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1895:2: (iv_rulePartialDestruction= rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1896:2: iv_rulePartialDestruction= rulePartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction4787);
            iv_rulePartialDestruction=rulePartialDestruction();

            state._fsp--;

             current =iv_rulePartialDestruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartialDestruction4797); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1903:1: rulePartialDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) ;
    public final EObject rulePartialDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_wChar_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1906:28: ( ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1907:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1907:1: ( () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1907:2: () otherlv_1= '\\u2E22' ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+ otherlv_3= '\\u2E23'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1907:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1908:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePartialDestruction4843); 

                	newLeafNode(otherlv_1, grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1917:1: ( (lv_wChar_2_0= ruleNoPartialDestruction ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||LA37_0==25||LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1918:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1918:1: (lv_wChar_2_0= ruleNoPartialDestruction )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1919:3: lv_wChar_2_0= ruleNoPartialDestruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction4864);
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePartialDestruction4877); 

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1947:1: entryRuleNoPartialDestruction returns [EObject current=null] : iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF ;
    public final EObject entryRuleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoPartialDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1948:2: (iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1949:2: iv_ruleNoPartialDestruction= ruleNoPartialDestruction EOF
            {
             newCompositeNode(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction4913);
            iv_ruleNoPartialDestruction=ruleNoPartialDestruction();

            state._fsp--;

             current =iv_ruleNoPartialDestruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoPartialDestruction4923); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1956:1: ruleNoPartialDestruction returns [EObject current=null] : (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded ) ;
    public final EObject ruleNoPartialDestruction() throws RecognitionException {
        EObject current = null;

        EObject this_Chars_0 = null;

        EObject this_Deletion_1 = null;

        EObject this_Expanded_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1959:28: ( (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1960:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1960:1: (this_Chars_0= ruleChars | this_Deletion_1= ruleDeletion | this_Expanded_2= ruleExpanded )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt38=1;
                }
                break;
            case 33:
                {
                alt38=2;
                }
                break;
            case 25:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1961:5: this_Chars_0= ruleChars
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoPartialDestruction4970);
                    this_Chars_0=ruleChars();

                    state._fsp--;

                     
                            current = this_Chars_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1971:5: this_Deletion_1= ruleDeletion
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_ruleNoPartialDestruction4997);
                    this_Deletion_1=ruleDeletion();

                    state._fsp--;

                     
                            current = this_Deletion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1981:5: this_Expanded_2= ruleExpanded
                    {
                     
                            newCompositeNode(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_ruleNoPartialDestruction5024);
                    this_Expanded_2=ruleExpanded();

                    state._fsp--;

                     
                            current = this_Expanded_2; 
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


    // $ANTLR start "entryRuleDestruction"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1997:1: entryRuleDestruction returns [EObject current=null] : iv_ruleDestruction= ruleDestruction EOF ;
    public final EObject entryRuleDestruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestruction = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1998:2: (iv_ruleDestruction= ruleDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1999:2: iv_ruleDestruction= ruleDestruction EOF
            {
             newCompositeNode(grammarAccess.getDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_entryRuleDestruction5059);
            iv_ruleDestruction=ruleDestruction();

            state._fsp--;

             current =iv_ruleDestruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDestruction5069); 

            }

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
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2006:1: ruleDestruction returns [EObject current=null] : ( () otherlv_1= '\\u2013' ( (lv_comment_2_0= RULE_COMMNENT_EGYSTRING ) ) otherlv_3= '\\u2013' ) ;
    public final EObject ruleDestruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2009:28: ( ( () otherlv_1= '\\u2013' ( (lv_comment_2_0= RULE_COMMNENT_EGYSTRING ) ) otherlv_3= '\\u2013' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2010:1: ( () otherlv_1= '\\u2013' ( (lv_comment_2_0= RULE_COMMNENT_EGYSTRING ) ) otherlv_3= '\\u2013' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2010:1: ( () otherlv_1= '\\u2013' ( (lv_comment_2_0= RULE_COMMNENT_EGYSTRING ) ) otherlv_3= '\\u2013' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2010:2: () otherlv_1= '\\u2013' ( (lv_comment_2_0= RULE_COMMNENT_EGYSTRING ) ) otherlv_3= '\\u2013'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2010:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2011:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDestructionAccess().getDestructionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDestruction5115); 

                	newLeafNode(otherlv_1, grammarAccess.getDestructionAccess().getEnDashKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2020:1: ( (lv_comment_2_0= RULE_COMMNENT_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2021:1: (lv_comment_2_0= RULE_COMMNENT_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2021:1: (lv_comment_2_0= RULE_COMMNENT_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:2022:3: lv_comment_2_0= RULE_COMMNENT_EGYSTRING
            {
            lv_comment_2_0=(Token)match(input,RULE_COMMNENT_EGYSTRING,FollowSets000.FOLLOW_RULE_COMMNENT_EGYSTRING_in_ruleDestruction5132); 

            			newLeafNode(lv_comment_2_0, grammarAccess.getDestructionAccess().getCommentCOMMNENT_EGYSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDestructionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comment",
                    		lv_comment_2_0, 
                    		"COMMNENT_EGYSTRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDestruction5149); 

                	newLeafNode(otherlv_3, grammarAccess.getDestructionAccess().getEnDashKeyword_3());
                

            }


            }

             leaveRule(); 
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
        public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent141 = new BitSet(new long[]{0x0000000000030012L});
        public static final BitSet FOLLOW_16_in_ruleTextContent155 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleTextContent172 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_ruleTextItem_in_ruleTextContent194 = new BitSet(new long[]{0x0000000000030012L});
        public static final BitSet FOLLOW_ruleTextItem_in_entryRuleTextItem233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextItem243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleTextItem289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentence333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSentence379 = new BitSet(new long[]{0x00002AAAAB7600C0L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence401 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSentence414 = new BitSet(new long[]{0x00002AAAAB7400D0L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleSentence426 = new BitSet(new long[]{0x00002AAAAB7400C0L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_ruleSentence448 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleSentence464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItem510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItem557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItem584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmbivalence_in_ruleSentenceItem611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMarker656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_ruleAbstractMarker703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersMarker_in_ruleAbstractMarker730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAmbivalence775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAmbivalence812 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence834 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAmbivalence847 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleAmbivalence859 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCase_in_ruleAmbivalence881 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAmbivalence896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCase_in_entryRuleCase932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCase942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CASESTRING_in_ruleCase984 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1001 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1024 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleCase1037 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleCase1049 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_ruleCase1071 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence1110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_ruleSentenceItemNoAmbivalence1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_ruleSentenceItemNoAmbivalence1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersMarker_in_entryRuleVersMarker1229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersMarker1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_ruleVersMarker1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_ruleVersMarker1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_ruleVersMarker1340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker1375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleVersFrontierMarker1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker1467 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleVersbreakMarker1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker1559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleBrokenVersbreakMarker1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker1651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarker1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BETWEEN_HASHES_in_ruleMarker1702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_entryRuleWord1742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWord1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordPart_in_ruleWord1808 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleWord1821 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleWordPart_in_ruleWord1842 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart1881 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWordPart1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleWordPart1929 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWordPart1953 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_ruleWordPart1974 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle2012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_ruleWordMiddle2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleWordMiddle2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_entryRuleChars2131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChars2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_ruleChars2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets2222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrackets2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_ruleBrackets2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_ruleBrackets2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_ruleBrackets2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleBrackets2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_ruleBrackets2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_ruleBrackets2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_ruleBrackets2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_ruleBrackets2468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_ruleBrackets2495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_ruleBrackets2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_ruleBrackets2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded2584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpanded2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleExpanded2640 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_ruleExpanded2661 = new BitSet(new long[]{0x00002AAAAF000080L});
        public static final BitSet FOLLOW_26_in_ruleExpanded2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded2710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded2720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation2800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmendation2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEmendation2856 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_ruleEmendation2877 = new BitSet(new long[]{0x00002AAABB000080L});
        public static final BitSet FOLLOW_28_in_ruleEmendation2890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoEmendation2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoEmendation3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading3045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDisputableReading3101 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_ruleDisputableReading3122 = new BitSet(new long[]{0x00002AAAEB000080L});
        public static final BitSet FOLLOW_30_in_ruleDisputableReading3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading3171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDisputableReading3228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoDisputableReading3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna3290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLacuna3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleLacuna3346 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_ruleLacuna3367 = new BitSet(new long[]{0x00002AABAB000080L});
        public static final BitSet FOLLOW_32_in_ruleLacuna3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna3416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoLacuna3473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoLacuna3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion3535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeletion3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleDeletion3591 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_ruleDeletion3612 = new BitSet(new long[]{0x00002AAEAB000080L});
        public static final BitSet FOLLOW_34_in_ruleDeletion3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion3661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoDeletion3718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_ruleNoDeletion3745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoDeletion3772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn3807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn3817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleExpandedColumn3863 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_ruleExpandedColumn3884 = new BitSet(new long[]{0x00002ABAAB000080L});
        public static final BitSet FOLLOW_36_in_ruleExpandedColumn3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn3933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn3943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoExpandedColumn3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoExpandedColumn4017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur4052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRasur4062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleRasur4108 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoRasur_in_ruleRasur4129 = new BitSet(new long[]{0x00002AEAAB000080L});
        public static final BitSet FOLLOW_38_in_ruleRasur4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur4178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur4188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoRasur4235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRasur4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded4297 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded4307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAncientExpanded4353 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_ruleAncientExpanded4374 = new BitSet(new long[]{0x00002BAAAB000080L});
        public static final BitSet FOLLOW_40_in_ruleAncientExpanded4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded4423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded4433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded4480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoAncientExpanded4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur4542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleRestorationOverRasur4598 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_ruleRestorationOverRasur4619 = new BitSet(new long[]{0x00002EAAAB000080L});
        public static final BitSet FOLLOW_42_in_ruleRestorationOverRasur4632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur4668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur4678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoRestorationOverRasur4752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction4787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction4797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePartialDestruction4843 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rulePartialDestruction4864 = new BitSet(new long[]{0x00003AAAAB000080L});
        public static final BitSet FOLLOW_44_in_rulePartialDestruction4877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction4913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction4970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_ruleNoPartialDestruction4997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_ruleNoPartialDestruction5024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_entryRuleDestruction5059 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDestruction5069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleDestruction5115 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_COMMNENT_EGYSTRING_in_ruleDestruction5132 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleDestruction5149 = new BitSet(new long[]{0x0000000000000002L});
    }


}