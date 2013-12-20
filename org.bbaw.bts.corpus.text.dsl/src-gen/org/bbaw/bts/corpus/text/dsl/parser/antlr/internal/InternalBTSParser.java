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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'\\n'", "'>>'", "'<<'", "'['", "']'", "'BTSAmbivalence'", "'{'", "'state'", "'revisionState'", "'visibility'", "'sortKey'", "'type'", "'subtype'", "'code'", "'_id'", "'comment'", "'parentId'", "'cases'", "','", "'}'", "'BTSLemmaCase'", "'scenario'", "'-'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
        	return "BTSTextContent";	
       	}
       	
       	@Override
       	protected BTSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBTSTextContent"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:67:1: entryRuleBTSTextContent returns [EObject current=null] : iv_ruleBTSTextContent= ruleBTSTextContent EOF ;
    public final EObject entryRuleBTSTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSTextContent = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:68:2: (iv_ruleBTSTextContent= ruleBTSTextContent EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:69:2: iv_ruleBTSTextContent= ruleBTSTextContent EOF
            {
             newCompositeNode(grammarAccess.getBTSTextContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextContent_in_entryRuleBTSTextContent75);
            iv_ruleBTSTextContent=ruleBTSTextContent();

            state._fsp--;

             current =iv_ruleBTSTextContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTextContent85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSTextContent"


    // $ANTLR start "ruleBTSTextContent"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:76:1: ruleBTSTextContent returns [EObject current=null] : ( () ( ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )* )* ) ;
    public final EObject ruleBTSTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_textItems_1_0 = null;

        EObject lv_textItems_4_0 = null;

        EObject lv_textItems_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:79:28: ( ( () ( ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )* )* ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:1: ( () ( ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )* )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:1: ( () ( ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )* )* )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:2: () ( ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )* )*
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSTextContentAccess().getBTSTextContentAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:2: ( ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==15||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:3: ( (lv_textItems_1_0= ruleBTSTextItems ) ) (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )* (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )*
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:86:3: ( (lv_textItems_1_0= ruleBTSTextItems ) )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:87:1: (lv_textItems_1_0= ruleBTSTextItems )
            	    {
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:87:1: (lv_textItems_1_0= ruleBTSTextItems )
            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:88:3: lv_textItems_1_0= ruleBTSTextItems
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent141);
            	    lv_textItems_1_0=ruleBTSTextItems();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBTSTextContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"textItems",
            	            		lv_textItems_1_0, 
            	            		"BTSTextItems");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:2: (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )*
            	    loop1:
            	    do {
            	        int alt1=3;
            	        alt1 = dfa1.predict(input);
            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:104:4: otherlv_2= ' '
            	    	    {
            	    	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBTSTextContent154); 

            	    	        	newLeafNode(otherlv_2, grammarAccess.getBTSTextContentAccess().getSpaceKeyword_1_1_0());
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:109:6: (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) )
            	    	    {
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:109:6: (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) )
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:109:8: otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTextContent173); 

            	    	        	newLeafNode(otherlv_3, grammarAccess.getBTSTextContentAccess().getControl000aKeyword_1_1_1_0());
            	    	        
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:113:1: ( (lv_textItems_4_0= ruleBTSTextItems ) )
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:114:1: (lv_textItems_4_0= ruleBTSTextItems )
            	    	    {
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:114:1: (lv_textItems_4_0= ruleBTSTextItems )
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:115:3: lv_textItems_4_0= ruleBTSTextItems
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_1_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent194);
            	    	    lv_textItems_4_0=ruleBTSTextItems();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getBTSTextContentRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"textItems",
            	    	            		lv_textItems_4_0, 
            	    	            		"BTSTextItems");
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

            	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:131:5: (otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==12) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:131:7: otherlv_5= '\\n' ( (lv_textItems_6_0= ruleBTSTextItems ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTextContent210); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getBTSTextContentAccess().getControl000aKeyword_1_2_0());
            	    	        
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:135:1: ( (lv_textItems_6_0= ruleBTSTextItems ) )
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:136:1: (lv_textItems_6_0= ruleBTSTextItems )
            	    	    {
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:136:1: (lv_textItems_6_0= ruleBTSTextItems )
            	    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:137:3: lv_textItems_6_0= ruleBTSTextItems
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent231);
            	    	    lv_textItems_6_0=ruleBTSTextItems();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getBTSTextContentRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"textItems",
            	    	            		lv_textItems_6_0, 
            	    	            		"BTSTextItems");
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

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleBTSTextContent"


    // $ANTLR start "entryRuleBTSSentenceItem"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:161:1: entryRuleBTSSentenceItem returns [EObject current=null] : iv_ruleBTSSentenceItem= ruleBTSSentenceItem EOF ;
    public final EObject entryRuleBTSSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSSentenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:162:2: (iv_ruleBTSSentenceItem= ruleBTSSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:163:2: iv_ruleBTSSentenceItem= ruleBTSSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getBTSSentenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_entryRuleBTSSentenceItem271);
            iv_ruleBTSSentenceItem=ruleBTSSentenceItem();

            state._fsp--;

             current =iv_ruleBTSSentenceItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSSentenceItem281); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSSentenceItem"


    // $ANTLR start "ruleBTSSentenceItem"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:170:1: ruleBTSSentenceItem returns [EObject current=null] : (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) ;
    public final EObject ruleBTSSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_BTSWord_0 = null;

        EObject this_BTSMarker_1 = null;

        EObject this_BTSAmbivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:173:28: ( (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:174:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:174:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:175:5: this_BTSWord_0= ruleBTSWord
                    {
                     
                            newCompositeNode(grammarAccess.getBTSSentenceItemAccess().getBTSWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_ruleBTSSentenceItem328);
                    this_BTSWord_0=ruleBTSWord();

                    state._fsp--;

                     
                            current = this_BTSWord_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:185:5: this_BTSMarker_1= ruleBTSMarker
                    {
                     
                            newCompositeNode(grammarAccess.getBTSSentenceItemAccess().getBTSMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_ruleBTSSentenceItem355);
                    this_BTSMarker_1=ruleBTSMarker();

                    state._fsp--;

                     
                            current = this_BTSMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:195:5: this_BTSAmbivalence_2= ruleBTSAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getBTSSentenceItemAccess().getBTSAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_ruleBTSSentenceItem382);
                    this_BTSAmbivalence_2=ruleBTSAmbivalence();

                    state._fsp--;

                     
                            current = this_BTSAmbivalence_2; 
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
    // $ANTLR end "ruleBTSSentenceItem"


    // $ANTLR start "entryRuleBTSAmbivalenceItem"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:211:1: entryRuleBTSAmbivalenceItem returns [EObject current=null] : iv_ruleBTSAmbivalenceItem= ruleBTSAmbivalenceItem EOF ;
    public final EObject entryRuleBTSAmbivalenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSAmbivalenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:212:2: (iv_ruleBTSAmbivalenceItem= ruleBTSAmbivalenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:213:2: iv_ruleBTSAmbivalenceItem= ruleBTSAmbivalenceItem EOF
            {
             newCompositeNode(grammarAccess.getBTSAmbivalenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_entryRuleBTSAmbivalenceItem417);
            iv_ruleBTSAmbivalenceItem=ruleBTSAmbivalenceItem();

            state._fsp--;

             current =iv_ruleBTSAmbivalenceItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSAmbivalenceItem427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSAmbivalenceItem"


    // $ANTLR start "ruleBTSAmbivalenceItem"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:220:1: ruleBTSAmbivalenceItem returns [EObject current=null] : (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker ) ;
    public final EObject ruleBTSAmbivalenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_BTSWord_0 = null;

        EObject this_BTSMarker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:223:28: ( (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:224:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:224:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:225:5: this_BTSWord_0= ruleBTSWord
                    {
                     
                            newCompositeNode(grammarAccess.getBTSAmbivalenceItemAccess().getBTSWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_ruleBTSAmbivalenceItem474);
                    this_BTSWord_0=ruleBTSWord();

                    state._fsp--;

                     
                            current = this_BTSWord_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:235:5: this_BTSMarker_1= ruleBTSMarker
                    {
                     
                            newCompositeNode(grammarAccess.getBTSAmbivalenceItemAccess().getBTSMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_ruleBTSAmbivalenceItem501);
                    this_BTSMarker_1=ruleBTSMarker();

                    state._fsp--;

                     
                            current = this_BTSMarker_1; 
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
    // $ANTLR end "ruleBTSAmbivalenceItem"


    // $ANTLR start "entryRuleBTSTextItems"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:251:1: entryRuleBTSTextItems returns [EObject current=null] : iv_ruleBTSTextItems= ruleBTSTextItems EOF ;
    public final EObject entryRuleBTSTextItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSTextItems = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:252:2: (iv_ruleBTSTextItems= ruleBTSTextItems EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:253:2: iv_ruleBTSTextItems= ruleBTSTextItems EOF
            {
             newCompositeNode(grammarAccess.getBTSTextItemsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_entryRuleBTSTextItems536);
            iv_ruleBTSTextItems=ruleBTSTextItems();

            state._fsp--;

             current =iv_ruleBTSTextItems; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTextItems546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSTextItems"


    // $ANTLR start "ruleBTSTextItems"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:260:1: ruleBTSTextItems returns [EObject current=null] : (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) ;
    public final EObject ruleBTSTextItems() throws RecognitionException {
        EObject current = null;

        EObject this_BTSSenctence_0 = null;

        EObject this_BTSMarker_1 = null;

        EObject this_BTSAmbivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:263:28: ( (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:264:1: (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:264:1: (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:265:5: this_BTSSenctence_0= ruleBTSSenctence
                    {
                     
                            newCompositeNode(grammarAccess.getBTSTextItemsAccess().getBTSSenctenceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSSenctence_in_ruleBTSTextItems593);
                    this_BTSSenctence_0=ruleBTSSenctence();

                    state._fsp--;

                     
                            current = this_BTSSenctence_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:275:5: this_BTSMarker_1= ruleBTSMarker
                    {
                     
                            newCompositeNode(grammarAccess.getBTSTextItemsAccess().getBTSMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_ruleBTSTextItems620);
                    this_BTSMarker_1=ruleBTSMarker();

                    state._fsp--;

                     
                            current = this_BTSMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:285:5: this_BTSAmbivalence_2= ruleBTSAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getBTSTextItemsAccess().getBTSAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_ruleBTSTextItems647);
                    this_BTSAmbivalence_2=ruleBTSAmbivalence();

                    state._fsp--;

                     
                            current = this_BTSAmbivalence_2; 
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
    // $ANTLR end "ruleBTSTextItems"


    // $ANTLR start "entryRuleEString"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:301:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:302:2: (iv_ruleEString= ruleEString EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:303:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString683);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:310:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:313:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:314:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:314:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:314:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString734); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:322:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString760); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBTSSenctence"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:337:1: entryRuleBTSSenctence returns [EObject current=null] : iv_ruleBTSSenctence= ruleBTSSenctence EOF ;
    public final EObject entryRuleBTSSenctence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSSenctence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:338:2: (iv_ruleBTSSenctence= ruleBTSSenctence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:339:2: iv_ruleBTSSenctence= ruleBTSSenctence EOF
            {
             newCompositeNode(grammarAccess.getBTSSenctenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSenctence_in_entryRuleBTSSenctence805);
            iv_ruleBTSSenctence=ruleBTSSenctence();

            state._fsp--;

             current =iv_ruleBTSSenctence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSSenctence815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSSenctence"


    // $ANTLR start "ruleBTSSenctence"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:346:1: ruleBTSSenctence returns [EObject current=null] : ( () otherlv_1= '>>' ( ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )* )? otherlv_5= '<<' ) ;
    public final EObject ruleBTSSenctence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sentenceItems_2_0 = null;

        EObject lv_sentenceItems_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:349:28: ( ( () otherlv_1= '>>' ( ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )* )? otherlv_5= '<<' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:350:1: ( () otherlv_1= '>>' ( ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )* )? otherlv_5= '<<' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:350:1: ( () otherlv_1= '>>' ( ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )* )? otherlv_5= '<<' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:350:2: () otherlv_1= '>>' ( ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )* )? otherlv_5= '<<'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:350:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSSenctenceAccess().getBTSSenctenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBTSSenctence861); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSSenctenceAccess().getGreaterThanSignGreaterThanSignKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:360:1: ( ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==15||LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:360:2: ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) ) (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )*
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:360:2: ( (lv_sentenceItems_2_0= ruleBTSSentenceItem ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:361:1: (lv_sentenceItems_2_0= ruleBTSSentenceItem )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:361:1: (lv_sentenceItems_2_0= ruleBTSSentenceItem )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:362:3: lv_sentenceItems_2_0= ruleBTSSentenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence883);
                    lv_sentenceItems_2_0=ruleBTSSentenceItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
                    	        }
                           		add(
                           			current, 
                           			"sentenceItems",
                            		lv_sentenceItems_2_0, 
                            		"BTSSentenceItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:378:2: (otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==11) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:378:4: otherlv_3= ' ' ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) )
                    	    {
                    	    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBTSSenctence896); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getBTSSenctenceAccess().getSpaceKeyword_2_1_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:382:1: ( (lv_sentenceItems_4_0= ruleBTSSentenceItem ) )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:383:1: (lv_sentenceItems_4_0= ruleBTSSentenceItem )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:383:1: (lv_sentenceItems_4_0= ruleBTSSentenceItem )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:384:3: lv_sentenceItems_4_0= ruleBTSSentenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence917);
                    	    lv_sentenceItems_4_0=ruleBTSSentenceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentenceItems",
                    	            		lv_sentenceItems_4_0, 
                    	            		"BTSSentenceItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSSenctence933); 

                	newLeafNode(otherlv_5, grammarAccess.getBTSSenctenceAccess().getLessThanSignLessThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSSenctence"


    // $ANTLR start "entryRuleBTSWord"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:412:1: entryRuleBTSWord returns [EObject current=null] : iv_ruleBTSWord= ruleBTSWord EOF ;
    public final EObject entryRuleBTSWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSWord = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:413:2: (iv_ruleBTSWord= ruleBTSWord EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:414:2: iv_ruleBTSWord= ruleBTSWord EOF
            {
             newCompositeNode(grammarAccess.getBTSWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_entryRuleBTSWord969);
            iv_ruleBTSWord=ruleBTSWord();

            state._fsp--;

             current =iv_ruleBTSWord; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSWord979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSWord"


    // $ANTLR start "ruleBTSWord"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:421:1: ruleBTSWord returns [EObject current=null] : ( () ( (lv_wChar_1_0= ruleEString ) ) ) ;
    public final EObject ruleBTSWord() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_wChar_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:424:28: ( ( () ( (lv_wChar_1_0= ruleEString ) ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:425:1: ( () ( (lv_wChar_1_0= ruleEString ) ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:425:1: ( () ( (lv_wChar_1_0= ruleEString ) ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:425:2: () ( (lv_wChar_1_0= ruleEString ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:425:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:426:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSWordAccess().getBTSWordAction_0(),
                        current);
                

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:431:2: ( (lv_wChar_1_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:432:1: (lv_wChar_1_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:432:1: (lv_wChar_1_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:433:3: lv_wChar_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSWordAccess().getWCharEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1034);
            lv_wChar_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
            	        }
                   		set(
                   			current, 
                   			"wChar",
                    		lv_wChar_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleBTSWord"


    // $ANTLR start "entryRuleBTSMarker"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:457:1: entryRuleBTSMarker returns [EObject current=null] : iv_ruleBTSMarker= ruleBTSMarker EOF ;
    public final EObject entryRuleBTSMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:458:2: (iv_ruleBTSMarker= ruleBTSMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:459:2: iv_ruleBTSMarker= ruleBTSMarker EOF
            {
             newCompositeNode(grammarAccess.getBTSMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_entryRuleBTSMarker1070);
            iv_ruleBTSMarker=ruleBTSMarker();

            state._fsp--;

             current =iv_ruleBTSMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSMarker1080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSMarker"


    // $ANTLR start "ruleBTSMarker"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:466:1: ruleBTSMarker returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_value_2_0= ruleEString ) )? otherlv_3= ']' ) ;
    public final EObject ruleBTSMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:469:28: ( ( () otherlv_1= '[' ( (lv_value_2_0= ruleEString ) )? otherlv_3= ']' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:470:1: ( () otherlv_1= '[' ( (lv_value_2_0= ruleEString ) )? otherlv_3= ']' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:470:1: ( () otherlv_1= '[' ( (lv_value_2_0= ruleEString ) )? otherlv_3= ']' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:470:2: () otherlv_1= '[' ( (lv_value_2_0= ruleEString ) )? otherlv_3= ']'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:470:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:471:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSMarkerAccess().getBTSMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSMarker1126); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSMarkerAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:480:1: ( (lv_value_2_0= ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:481:1: (lv_value_2_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:481:1: (lv_value_2_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:482:3: lv_value_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getValueEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker1147);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBTSMarker1160); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSMarkerAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSMarker"


    // $ANTLR start "entryRuleBTSAmbivalence"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:510:1: entryRuleBTSAmbivalence returns [EObject current=null] : iv_ruleBTSAmbivalence= ruleBTSAmbivalence EOF ;
    public final EObject entryRuleBTSAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:511:2: (iv_ruleBTSAmbivalence= ruleBTSAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:512:2: iv_ruleBTSAmbivalence= ruleBTSAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getBTSAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_entryRuleBTSAmbivalence1196);
            iv_ruleBTSAmbivalence=ruleBTSAmbivalence();

            state._fsp--;

             current =iv_ruleBTSAmbivalence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSAmbivalence1206); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSAmbivalence"


    // $ANTLR start "ruleBTSAmbivalence"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:519:1: ruleBTSAmbivalence returns [EObject current=null] : ( () otherlv_1= 'BTSAmbivalence' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) ) )? (otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) ) )? (otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) ) )? (otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) ) )? (otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) ) )? (otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) ) )? (otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) ) )? (otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) ) )? (otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleBTSAmbivalence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_state_4_0 = null;

        AntlrDatatypeRuleToken lv_revisionState_6_0 = null;

        AntlrDatatypeRuleToken lv_visibility_8_0 = null;

        AntlrDatatypeRuleToken lv_sortKey_10_0 = null;

        AntlrDatatypeRuleToken lv_type_12_0 = null;

        AntlrDatatypeRuleToken lv_subtype_14_0 = null;

        AntlrDatatypeRuleToken lv_code_16_0 = null;

        AntlrDatatypeRuleToken lv__id_18_0 = null;

        AntlrDatatypeRuleToken lv_comment_20_0 = null;

        AntlrDatatypeRuleToken lv_parentId_22_0 = null;

        EObject lv_cases_25_0 = null;

        EObject lv_cases_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:522:28: ( ( () otherlv_1= 'BTSAmbivalence' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) ) )? (otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) ) )? (otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) ) )? (otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) ) )? (otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) ) )? (otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) ) )? (otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) ) )? (otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) ) )? (otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:523:1: ( () otherlv_1= 'BTSAmbivalence' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) ) )? (otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) ) )? (otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) ) )? (otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) ) )? (otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) ) )? (otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) ) )? (otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) ) )? (otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) ) )? (otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:523:1: ( () otherlv_1= 'BTSAmbivalence' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) ) )? (otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) ) )? (otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) ) )? (otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) ) )? (otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) ) )? (otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) ) )? (otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) ) )? (otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) ) )? (otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:523:2: () otherlv_1= 'BTSAmbivalence' otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) ) )? (otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) ) )? (otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) ) )? (otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) ) )? (otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) ) )? (otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) ) )? (otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) ) )? (otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) ) )? (otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:523:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:524:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBTSAmbivalence1252); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSAmbivalence1264); 

                	newLeafNode(otherlv_2, grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:537:1: (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:537:3: otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSAmbivalence1277); 

                        	newLeafNode(otherlv_3, grammarAccess.getBTSAmbivalenceAccess().getStateKeyword_3_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:541:1: ( (lv_state_4_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:542:1: (lv_state_4_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:542:1: (lv_state_4_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:543:3: lv_state_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getStateEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1298);
                    lv_state_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"state",
                            		lv_state_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:559:4: (otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:559:6: otherlv_5= 'revisionState' ( (lv_revisionState_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSAmbivalence1313); 

                        	newLeafNode(otherlv_5, grammarAccess.getBTSAmbivalenceAccess().getRevisionStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:563:1: ( (lv_revisionState_6_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:564:1: (lv_revisionState_6_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:564:1: (lv_revisionState_6_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:565:3: lv_revisionState_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1334);
                    lv_revisionState_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"revisionState",
                            		lv_revisionState_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:581:4: (otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:581:6: otherlv_7= 'visibility' ( (lv_visibility_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSAmbivalence1349); 

                        	newLeafNode(otherlv_7, grammarAccess.getBTSAmbivalenceAccess().getVisibilityKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:585:1: ( (lv_visibility_8_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:586:1: (lv_visibility_8_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:586:1: (lv_visibility_8_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:587:3: lv_visibility_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getVisibilityEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1370);
                    lv_visibility_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:603:4: (otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:603:6: otherlv_9= 'sortKey' ( (lv_sortKey_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSAmbivalence1385); 

                        	newLeafNode(otherlv_9, grammarAccess.getBTSAmbivalenceAccess().getSortKeyKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:607:1: ( (lv_sortKey_10_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:608:1: (lv_sortKey_10_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:608:1: (lv_sortKey_10_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:609:3: lv_sortKey_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getSortKeyEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSAmbivalence1406);
                    lv_sortKey_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"sortKey",
                            		lv_sortKey_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:625:4: (otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:625:6: otherlv_11= 'type' ( (lv_type_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSAmbivalence1421); 

                        	newLeafNode(otherlv_11, grammarAccess.getBTSAmbivalenceAccess().getTypeKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:629:1: ( (lv_type_12_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:630:1: (lv_type_12_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:630:1: (lv_type_12_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:631:3: lv_type_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getTypeEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1442);
                    lv_type_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:647:4: (otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:647:6: otherlv_13= 'subtype' ( (lv_subtype_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSAmbivalence1457); 

                        	newLeafNode(otherlv_13, grammarAccess.getBTSAmbivalenceAccess().getSubtypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:651:1: ( (lv_subtype_14_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:652:1: (lv_subtype_14_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:652:1: (lv_subtype_14_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:653:3: lv_subtype_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getSubtypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1478);
                    lv_subtype_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"subtype",
                            		lv_subtype_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:669:4: (otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:669:6: otherlv_15= 'code' ( (lv_code_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSAmbivalence1493); 

                        	newLeafNode(otherlv_15, grammarAccess.getBTSAmbivalenceAccess().getCodeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:673:1: ( (lv_code_16_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:674:1: (lv_code_16_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:674:1: (lv_code_16_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:675:3: lv_code_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCodeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1514);
                    lv_code_16_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"code",
                            		lv_code_16_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:691:4: (otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:691:6: otherlv_17= '_id' ( (lv__id_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSAmbivalence1529); 

                        	newLeafNode(otherlv_17, grammarAccess.getBTSAmbivalenceAccess().get_idKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:695:1: ( (lv__id_18_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:696:1: (lv__id_18_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:696:1: (lv__id_18_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:697:3: lv__id_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().get_idEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1550);
                    lv__id_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"_id",
                            		lv__id_18_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:713:4: (otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:713:6: otherlv_19= 'comment' ( (lv_comment_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBTSAmbivalence1565); 

                        	newLeafNode(otherlv_19, grammarAccess.getBTSAmbivalenceAccess().getCommentKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:717:1: ( (lv_comment_20_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:718:1: (lv_comment_20_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:718:1: (lv_comment_20_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:719:3: lv_comment_20_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCommentEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1586);
                    lv_comment_20_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_20_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:735:4: (otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:735:6: otherlv_21= 'parentId' ( (lv_parentId_22_0= ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBTSAmbivalence1601); 

                        	newLeafNode(otherlv_21, grammarAccess.getBTSAmbivalenceAccess().getParentIdKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:739:1: ( (lv_parentId_22_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:740:1: (lv_parentId_22_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:740:1: (lv_parentId_22_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:741:3: lv_parentId_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getParentIdEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence1622);
                    lv_parentId_22_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		set(
                           			current, 
                           			"parentId",
                            		lv_parentId_22_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:757:4: (otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:757:6: otherlv_23= 'cases' otherlv_24= '{' ( (lv_cases_25_0= ruleBTSLemmaCase ) ) (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBTSAmbivalence1637); 

                        	newLeafNode(otherlv_23, grammarAccess.getBTSAmbivalenceAccess().getCasesKeyword_13_0());
                        
                    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSAmbivalence1649); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:765:1: ( (lv_cases_25_0= ruleBTSLemmaCase ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:766:1: (lv_cases_25_0= ruleBTSLemmaCase )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:766:1: (lv_cases_25_0= ruleBTSLemmaCase )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:767:3: lv_cases_25_0= ruleBTSLemmaCase
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence1670);
                    lv_cases_25_0=ruleBTSLemmaCase();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		add(
                           			current, 
                           			"cases",
                            		lv_cases_25_0, 
                            		"BTSLemmaCase");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:783:2: (otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==30) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:783:4: otherlv_26= ',' ( (lv_cases_27_0= ruleBTSLemmaCase ) )
                    	    {
                    	    otherlv_26=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBTSAmbivalence1683); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getBTSAmbivalenceAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:787:1: ( (lv_cases_27_0= ruleBTSLemmaCase ) )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:788:1: (lv_cases_27_0= ruleBTSLemmaCase )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:788:1: (lv_cases_27_0= ruleBTSLemmaCase )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:789:3: lv_cases_27_0= ruleBTSLemmaCase
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence1704);
                    	    lv_cases_27_0=ruleBTSLemmaCase();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cases",
                    	            		lv_cases_27_0, 
                    	            		"BTSLemmaCase");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBTSAmbivalence1718); 

                        	newLeafNode(otherlv_28, grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBTSAmbivalence1732); 

                	newLeafNode(otherlv_29, grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSAmbivalence"


    // $ANTLR start "entryRuleBTSLemmaCase"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:821:1: entryRuleBTSLemmaCase returns [EObject current=null] : iv_ruleBTSLemmaCase= ruleBTSLemmaCase EOF ;
    public final EObject entryRuleBTSLemmaCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSLemmaCase = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:822:2: (iv_ruleBTSLemmaCase= ruleBTSLemmaCase EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:823:2: iv_ruleBTSLemmaCase= ruleBTSLemmaCase EOF
            {
             newCompositeNode(grammarAccess.getBTSLemmaCaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_entryRuleBTSLemmaCase1768);
            iv_ruleBTSLemmaCase=ruleBTSLemmaCase();

            state._fsp--;

             current =iv_ruleBTSLemmaCase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSLemmaCase1778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSLemmaCase"


    // $ANTLR start "ruleBTSLemmaCase"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:830:1: ruleBTSLemmaCase returns [EObject current=null] : ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleBTSLemmaCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_state_5_0 = null;

        AntlrDatatypeRuleToken lv_revisionState_7_0 = null;

        AntlrDatatypeRuleToken lv_visibility_9_0 = null;

        AntlrDatatypeRuleToken lv_sortKey_11_0 = null;

        AntlrDatatypeRuleToken lv_type_13_0 = null;

        AntlrDatatypeRuleToken lv_subtype_15_0 = null;

        AntlrDatatypeRuleToken lv_code_17_0 = null;

        AntlrDatatypeRuleToken lv__id_19_0 = null;

        AntlrDatatypeRuleToken lv_comment_21_0 = null;

        AntlrDatatypeRuleToken lv_parentId_23_0 = null;

        EObject lv_scenario_26_0 = null;

        EObject lv_scenario_28_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:833:28: ( ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:834:1: ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:834:1: ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:834:2: () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:834:2: ()
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:835:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBTSLemmaCase1824); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:844:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:845:1: (lv_name_2_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:845:1: (lv_name_2_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:846:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase1845);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSLemmaCase1857); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:866:1: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:866:3: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSLemmaCase1870); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSLemmaCaseAccess().getStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:870:1: ( (lv_state_5_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:871:1: (lv_state_5_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:871:1: (lv_state_5_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:872:3: lv_state_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase1891);
                    lv_state_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"state",
                            		lv_state_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:888:4: (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:888:6: otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSLemmaCase1906); 

                        	newLeafNode(otherlv_6, grammarAccess.getBTSLemmaCaseAccess().getRevisionStateKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:892:1: ( (lv_revisionState_7_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:893:1: (lv_revisionState_7_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:893:1: (lv_revisionState_7_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:894:3: lv_revisionState_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase1927);
                    lv_revisionState_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"revisionState",
                            		lv_revisionState_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:910:4: (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:910:6: otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSLemmaCase1942); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSLemmaCaseAccess().getVisibilityKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:914:1: ( (lv_visibility_9_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:915:1: (lv_visibility_9_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:915:1: (lv_visibility_9_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:916:3: lv_visibility_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase1963);
                    lv_visibility_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:932:4: (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:932:6: otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSLemmaCase1978); 

                        	newLeafNode(otherlv_10, grammarAccess.getBTSLemmaCaseAccess().getSortKeyKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:936:1: ( (lv_sortKey_11_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:937:1: (lv_sortKey_11_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:937:1: (lv_sortKey_11_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:938:3: lv_sortKey_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSLemmaCase1999);
                    lv_sortKey_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"sortKey",
                            		lv_sortKey_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:954:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:954:6: otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSLemmaCase2014); 

                        	newLeafNode(otherlv_12, grammarAccess.getBTSLemmaCaseAccess().getTypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:958:1: ( (lv_type_13_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:959:1: (lv_type_13_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:959:1: (lv_type_13_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:960:3: lv_type_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getTypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase2035);
                    lv_type_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:976:4: (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:976:6: otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSLemmaCase2050); 

                        	newLeafNode(otherlv_14, grammarAccess.getBTSLemmaCaseAccess().getSubtypeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:980:1: ( (lv_subtype_15_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:981:1: (lv_subtype_15_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:981:1: (lv_subtype_15_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:982:3: lv_subtype_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase2071);
                    lv_subtype_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"subtype",
                            		lv_subtype_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:998:4: (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:998:6: otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSLemmaCase2086); 

                        	newLeafNode(otherlv_16, grammarAccess.getBTSLemmaCaseAccess().getCodeKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1002:1: ( (lv_code_17_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1003:1: (lv_code_17_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1003:1: (lv_code_17_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1004:3: lv_code_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getCodeEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase2107);
                    lv_code_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"code",
                            		lv_code_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1020:4: (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1020:6: otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSLemmaCase2122); 

                        	newLeafNode(otherlv_18, grammarAccess.getBTSLemmaCaseAccess().get_idKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1024:1: ( (lv__id_19_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1025:1: (lv__id_19_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1025:1: (lv__id_19_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1026:3: lv__id_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().get_idEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase2143);
                    lv__id_19_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"_id",
                            		lv__id_19_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1042:4: (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1042:6: otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBTSLemmaCase2158); 

                        	newLeafNode(otherlv_20, grammarAccess.getBTSLemmaCaseAccess().getCommentKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1046:1: ( (lv_comment_21_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1047:1: (lv_comment_21_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1047:1: (lv_comment_21_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1048:3: lv_comment_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getCommentEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase2179);
                    lv_comment_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_21_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1064:4: (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1064:6: otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBTSLemmaCase2194); 

                        	newLeafNode(otherlv_22, grammarAccess.getBTSLemmaCaseAccess().getParentIdKeyword_13_0());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1068:1: ( (lv_parentId_23_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1069:1: (lv_parentId_23_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1069:1: (lv_parentId_23_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1070:3: lv_parentId_23_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getParentIdEStringParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase2215);
                    lv_parentId_23_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"parentId",
                            		lv_parentId_23_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1086:4: (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1086:6: otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBTSLemmaCase2230); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSLemmaCaseAccess().getScenarioKeyword_14_0());
                        
                    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSLemmaCase2242); 

                        	newLeafNode(otherlv_25, grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1094:1: ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1095:1: (lv_scenario_26_0= ruleBTSAmbivalenceItem )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1095:1: (lv_scenario_26_0= ruleBTSAmbivalenceItem )
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1096:3: lv_scenario_26_0= ruleBTSAmbivalenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase2263);
                    lv_scenario_26_0=ruleBTSAmbivalenceItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	        }
                           		add(
                           			current, 
                           			"scenario",
                            		lv_scenario_26_0, 
                            		"BTSAmbivalenceItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1112:2: (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==30) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1112:4: otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) )
                    	    {
                    	    otherlv_27=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBTSLemmaCase2276); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getBTSLemmaCaseAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1116:1: ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1117:1: (lv_scenario_28_0= ruleBTSAmbivalenceItem )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1117:1: (lv_scenario_28_0= ruleBTSAmbivalenceItem )
                    	    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1118:3: lv_scenario_28_0= ruleBTSAmbivalenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase2297);
                    	    lv_scenario_28_0=ruleBTSAmbivalenceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSLemmaCaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"scenario",
                    	            		lv_scenario_28_0, 
                    	            		"BTSAmbivalenceItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBTSLemmaCase2311); 

                        	newLeafNode(otherlv_29, grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBTSLemmaCase2325); 

                	newLeafNode(otherlv_30, grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSLemmaCase"


    // $ANTLR start "entryRuleEInt"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1150:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1151:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1152:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2362);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1159:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1162:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1163:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1163:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1163:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1163:2: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl/src-gen/org/bbaw/bts/corpus/text/dsl/parser/antlr/internal/InternalBTS.g:1164:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEInt2412); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2429); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\u01b8\uffff";
    static final String DFA1_eofS =
        "\1\2\u01b7\uffff";
    static final String DFA1_minS =
        "\1\13\1\15\2\uffff\2\4\1\22\2\13\1\4\1\22\1\uffff\2\20\1\uffff"+
        "\1\23\1\4\2\20\1\13\1\23\3\4\1\6\6\4\1\22\1\uffff\2\13\1\4\1\22"+
        "\3\4\1\6\6\4\1\22\1\13\2\24\2\25\2\26\1\6\1\27\2\30\2\31\2\32\2"+
        "\33\2\34\2\35\1\40\2\20\1\13\1\23\2\24\2\25\2\26\1\6\1\27\2\30\2"+
        "\31\2\32\2\33\2\34\2\35\1\40\4\4\1\6\6\4\1\22\1\13\1\4\2\22\2\24"+
        "\2\25\2\26\1\6\1\27\2\30\2\31\2\32\2\33\2\34\2\35\1\40\2\22\1\23"+
        "\1\4\1\23\3\4\1\6\6\4\1\22\1\36\2\22\3\4\1\6\6\4\1\22\1\36\2\24"+
        "\2\25\2\26\1\6\1\27\2\30\2\31\2\32\2\33\2\34\2\37\1\4\1\40\1\37"+
        "\1\23\2\24\2\25\2\26\1\6\1\27\2\30\2\31\2\32\2\33\2\34\2\37\1\4"+
        "\1\40\1\37\2\36\5\4\1\6\6\4\1\22\3\36\3\4\1\37\2\20\1\36\2\22\2"+
        "\24\2\25\2\26\1\6\1\27\2\30\2\31\2\32\2\33\2\34\2\37\1\4\1\40\1"+
        "\37\1\4\1\37\2\20\1\36\2\22\2\36\1\4\1\23\2\36\2\4\2\36\1\4\1\23"+
        "\2\20\1\36\3\4\1\6\6\4\1\22\1\36\1\4\1\37\2\20\1\36\2\22\2\20\1"+
        "\36\3\4\1\6\6\4\1\22\1\36\2\24\2\25\2\26\1\6\1\27\2\30\2\31\2\32"+
        "\2\33\2\34\2\37\1\4\2\36\1\4\1\23\2\24\2\25\2\26\1\6\1\27\2\30\2"+
        "\31\2\32\2\33\2\34\2\37\1\4\2\36\1\4\2\20\1\36\3\4\1\6\6\4\1\22"+
        "\3\36\2\4\1\37\2\20\1\36\2\24\2\25\2\26\1\6\1\27\2\30\2\31\2\32"+
        "\2\33\2\34\2\37\2\4\1\37\2\20\3\36\1\4\2\36\1\4\2\36\1\4\2\20\1"+
        "\36\1\4\1\37\2\20\1\36\2\20\3\36\1\4\2\20\1\36";
    static final String DFA1_maxS =
        "\2\21\2\uffff\1\21\1\20\1\22\2\16\1\20\1\22\1\uffff\2\20\1\uffff"+
        "\1\37\1\21\2\20\1\16\1\37\3\5\1\42\6\5\1\22\1\uffff\2\16\1\20\1"+
        "\22\3\5\1\42\6\5\1\22\1\16\6\37\1\6\15\37\1\40\2\20\1\16\7\37\1"+
        "\6\15\37\1\40\4\5\1\42\6\5\1\22\1\16\1\5\2\22\6\37\1\6\15\37\1\40"+
        "\2\22\1\41\1\5\1\41\3\5\1\42\6\5\1\22\1\37\2\22\3\5\1\42\6\5\1\22"+
        "\1\37\6\41\1\6\15\41\1\17\1\40\1\37\7\41\1\6\15\41\1\17\1\40\3\37"+
        "\1\20\4\5\1\42\6\5\1\22\3\37\1\20\1\5\1\17\1\37\2\20\1\37\2\22\6"+
        "\41\1\6\15\41\1\17\1\40\1\37\1\17\1\37\2\20\1\37\2\22\2\37\1\20"+
        "\1\41\2\37\1\20\1\5\2\37\1\20\1\41\2\20\1\37\3\5\1\42\6\5\1\22\1"+
        "\37\1\17\1\37\2\20\1\37\2\22\2\20\1\37\3\5\1\42\6\5\1\22\1\37\6"+
        "\41\1\6\15\41\1\17\2\37\1\20\7\41\1\6\15\41\1\17\2\37\3\20\1\37"+
        "\3\5\1\42\6\5\1\22\3\37\1\20\1\17\1\37\2\20\1\37\6\41\1\6\15\41"+
        "\2\17\1\37\2\20\3\37\1\20\2\37\1\20\2\37\3\20\1\37\1\17\1\37\2\20"+
        "\1\37\2\20\3\37\3\20\1\37";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\1\7\uffff\1\2\2\uffff\1\2\21\uffff\1\2\u0197\uffff";
    static final String DFA1_specialS =
        "\u01b8\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\1\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\4\1\uffff\1\5\1\uffff\1\6",
            "",
            "",
            "\1\7\1\10\10\uffff\1\13\1\11\1\uffff\1\12",
            "\1\14\1\15\12\uffff\1\16",
            "\1\17",
            "\1\20\2\uffff\1\13",
            "\1\20\2\uffff\1\13",
            "\1\21\1\22\12\uffff\1\23",
            "\1\24",
            "",
            "\1\16",
            "\1\16",
            "",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1"+
            "\uffff\1\40",
            "\1\41\1\42\11\uffff\1\43\1\uffff\1\44",
            "\1\23",
            "\1\23",
            "\1\20\2\uffff\1\13",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1"+
            "\uffff\1\60",
            "\1\61\1\62",
            "\1\63\1\64",
            "\1\65\1\66",
            "\1\70\33\uffff\1\67",
            "\1\71\1\72",
            "\1\73\1\74",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\101\1\102",
            "\1\103\1\104",
            "\1\105",
            "",
            "\1\20\2\uffff\1\13",
            "\1\20\2\uffff\1\13",
            "\1\106\1\107\12\uffff\1\110",
            "\1\111",
            "\1\112\1\113",
            "\1\114\1\115",
            "\1\116\1\117",
            "\1\121\33\uffff\1\120",
            "\1\122\1\123",
            "\1\124\1\125",
            "\1\126\1\127",
            "\1\130\1\131",
            "\1\132\1\133",
            "\1\134\1\135",
            "\1\136",
            "\1\20\2\uffff\1\13",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff"+
            "\1\40",
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff"+
            "\1\40",
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\70",
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\33\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\34\1\35\1\36\1\37\1\uffff\1\40",
            "\1\35\1\36\1\37\1\uffff\1\40",
            "\1\35\1\36\1\37\1\uffff\1\40",
            "\1\36\1\37\1\uffff\1\40",
            "\1\36\1\37\1\uffff\1\40",
            "\1\37\1\uffff\1\40",
            "\1\37\1\uffff\1\40",
            "\1\137",
            "\1\110",
            "\1\110",
            "\1\20\2\uffff\1\13",
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151"+
            "\1\152\1\uffff\1\153",
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff"+
            "\1\60",
            "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff"+
            "\1\60",
            "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\121",
            "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\53\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\54\1\55\1\56\1\57\1\uffff\1\60",
            "\1\55\1\56\1\57\1\uffff\1\60",
            "\1\55\1\56\1\57\1\uffff\1\60",
            "\1\56\1\57\1\uffff\1\60",
            "\1\56\1\57\1\uffff\1\60",
            "\1\57\1\uffff\1\60",
            "\1\57\1\uffff\1\60",
            "\1\154",
            "\1\155\1\156",
            "\1\157\1\160",
            "\1\161\1\162",
            "\1\163\1\164",
            "\1\166\33\uffff\1\165",
            "\1\167\1\170",
            "\1\171\1\172",
            "\1\173\1\174",
            "\1\175\1\176",
            "\1\177\1\u0080",
            "\1\u0081\1\u0082",
            "\1\u0083",
            "\1\20\2\uffff\1\13",
            "\1\u0084\1\u0085",
            "\1\u0086",
            "\1\u0086",
            "\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152"+
            "\1\uffff\1\153",
            "\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152"+
            "\1\uffff\1\153",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff"+
            "\1\153",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff"+
            "\1\153",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff\1"+
            "\153",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff\1"+
            "\153",
            "\1\166",
            "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\145\1\146\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\146\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\146\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\147\1\150\1\151\1\152\1\uffff\1\153",
            "\1\150\1\151\1\152\1\uffff\1\153",
            "\1\150\1\151\1\152\1\uffff\1\153",
            "\1\151\1\152\1\uffff\1\153",
            "\1\151\1\152\1\uffff\1\153",
            "\1\152\1\uffff\1\153",
            "\1\152\1\uffff\1\153",
            "\1\u0087",
            "\1\u0088",
            "\1\u0088",
            "\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1"+
            "\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0095\1\u0096",
            "\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1"+
            "\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a3\1\u00a4",
            "\1\u00a5\1\u00a6",
            "\1\u00a7\1\u00a8",
            "\1\u00aa\33\uffff\1\u00a9",
            "\1\u00ab\1\u00ac",
            "\1\u00ad\1\u00ae",
            "\1\u00af\1\u00b0",
            "\1\u00b1\1\u00b2",
            "\1\u00b3\1\u00b4",
            "\1\u00b5\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\1\u00b9",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd\1\u00be",
            "\1\u00bf\1\u00c0",
            "\1\u00c2\33\uffff\1\u00c1",
            "\1\u00c3\1\u00c4",
            "\1\u00c5\1\u00c6",
            "\1\u00c7\1\u00c8",
            "\1\u00c9\1\u00ca",
            "\1\u00cb\1\u00cc",
            "\1\u00cd\1\u00ce",
            "\1\u00cf",
            "\1\u00d0\1\u00d1",
            "\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1"+
            "\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1"+
            "\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\2"+
            "\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\2"+
            "\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u00aa",
            "\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\2\uffff\1"+
            "\u0094\1\uffff\1\u0093",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1"+
            "\uffff\1\u0093",
            "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1"+
            "\uffff\1\u0093",
            "\1\u008f\1\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1"+
            "\u0093",
            "\1\u008f\1\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1"+
            "\u0093",
            "\1\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0090\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0091\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0092\2\uffff\1\u0094\1\uffff\1\u0093",
            "\1\u0094\1\uffff\1\u0093",
            "\1\u0094\1\uffff\1\u0093",
            "\1\u00d2\1\u00d3\11\uffff\1\u00d4",
            "\1\u00d5",
            "\1\40",
            "\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1"+
            "\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1"+
            "\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1"+
            "\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1"+
            "\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1"+
            "\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\2"+
            "\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\2"+
            "\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u00c2",
            "\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\2\uffff\1"+
            "\u00a2\1\uffff\1\u00a1",
            "\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1"+
            "\uffff\1\u00a1",
            "\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1"+
            "\uffff\1\u00a1",
            "\1\u009d\1\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1"+
            "\u00a1",
            "\1\u009d\1\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1"+
            "\u00a1",
            "\1\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u009e\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u009f\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a0\2\uffff\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a2\1\uffff\1\u00a1",
            "\1\u00e2\1\u00e3\11\uffff\1\u00e4",
            "\1\u00e5",
            "\1\60",
            "\1\u00e6\1\u00e7",
            "\1\u00e6\1\u00e7",
            "\1\u00e8\1\u00e9\12\uffff\1\u00ea",
            "\1\u00eb\1\u00ec",
            "\1\u00ed\1\u00ee",
            "\1\u00ef\1\u00f0",
            "\1\u00f1\1\u00f2",
            "\1\u00f4\33\uffff\1\u00f3",
            "\1\u00f5\1\u00f6",
            "\1\u00f7\1\u00f8",
            "\1\u00f9\1\u00fa",
            "\1\u00fb\1\u00fc",
            "\1\u00fd\1\u00fe",
            "\1\u00ff\1\u0100",
            "\1\u0101",
            "\1\u0102\1\u0103",
            "\1\u0104\1\u0105",
            "\1\u0104\1\u0105",
            "\1\u0106\1\u0107\12\uffff\1\u0108",
            "\1\u0109\1\u010a",
            "\1\u010b\1\u010c\11\uffff\1\u010d",
            "\1\u0094",
            "\1\u00ea",
            "\1\u00ea",
            "\1\u00e6\1\u00e7",
            "\1\u010e",
            "\1\u010e",
            "\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1"+
            "\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1"+
            "\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1"+
            "\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1"+
            "\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\2"+
            "\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\2"+
            "\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00f4",
            "\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\2\uffff\1"+
            "\u00e1\1\uffff\1\u00e0",
            "\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1"+
            "\uffff\1\u00e0",
            "\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1"+
            "\uffff\1\u00e0",
            "\1\u00dc\1\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1"+
            "\u00e0",
            "\1\u00dc\1\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1"+
            "\u00e0",
            "\1\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00dd\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00de\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00df\2\uffff\1\u00e1\1\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e0",
            "\1\u010f\1\u0110\11\uffff\1\u0111",
            "\1\u0112",
            "\1\153",
            "\1\u0113\1\u0114\11\uffff\1\u0115",
            "\1\u00a2",
            "\1\u0108",
            "\1\u0108",
            "\1\u0104\1\u0105",
            "\1\u0116",
            "\1\u0116",
            "\1\u00e6\1\u00e7",
            "\1\u00e6\1\u00e7",
            "\1\u0117\1\u0118\12\uffff\1\u0119",
            "\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1"+
            "\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0126\1\u0127",
            "\1\u0126\1\u0127",
            "\1\u0128\1\u0129\12\uffff\1\u012a",
            "\1\u012b\1\u012c",
            "\1\u0104\1\u0105",
            "\1\u0104\1\u0105",
            "\1\u012d\1\u012e\12\uffff\1\u012f",
            "\1\u0130\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1"+
            "\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0119",
            "\1\u0119",
            "\1\u00e6\1\u00e7",
            "\1\u013c\1\u013d",
            "\1\u013e\1\u013f",
            "\1\u0140\1\u0141",
            "\1\u0143\33\uffff\1\u0142",
            "\1\u0144\1\u0145",
            "\1\u0146\1\u0147",
            "\1\u0148\1\u0149",
            "\1\u014a\1\u014b",
            "\1\u014c\1\u014d",
            "\1\u014e\1\u014f",
            "\1\u0150",
            "\1\u00b8\1\u00b9",
            "\1\u0151\1\u0152\11\uffff\1\u0153",
            "\1\u00e1",
            "\1\u012a",
            "\1\u012a",
            "\1\u0126\1\u0127",
            "\1\u0154",
            "\1\u0154",
            "\1\u012f",
            "\1\u012f",
            "\1\u0104\1\u0105",
            "\1\u0155\1\u0156",
            "\1\u0157\1\u0158",
            "\1\u0159\1\u015a",
            "\1\u015c\33\uffff\1\u015b",
            "\1\u015d\1\u015e",
            "\1\u015f\1\u0160",
            "\1\u0161\1\u0162",
            "\1\u0163\1\u0164",
            "\1\u0165\1\u0166",
            "\1\u0167\1\u0168",
            "\1\u0169",
            "\1\u00d0\1\u00d1",
            "\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1"+
            "\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1"+
            "\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1"+
            "\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1"+
            "\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\2"+
            "\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\2"+
            "\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0143",
            "\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\2\uffff\1"+
            "\u0125\1\uffff\1\u0124",
            "\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1"+
            "\uffff\1\u0124",
            "\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1"+
            "\uffff\1\u0124",
            "\1\u0120\1\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1"+
            "\u0124",
            "\1\u0120\1\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1"+
            "\u0124",
            "\1\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0121\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0122\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0123\2\uffff\1\u0125\1\uffff\1\u0124",
            "\1\u0125\1\uffff\1\u0124",
            "\1\u0125\1\uffff\1\u0124",
            "\1\u016a\1\u016b\11\uffff\1\u016c",
            "\1\u0126\1\u0127",
            "\1\u0126\1\u0127",
            "\1\u016d\1\u016e\12\uffff\1\u016f",
            "\1\u0170\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1"+
            "\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1"+
            "\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1"+
            "\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1"+
            "\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1"+
            "\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\2"+
            "\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\2"+
            "\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u015c",
            "\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\2\uffff\1"+
            "\u013b\1\uffff\1\u013a",
            "\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1"+
            "\uffff\1\u013a",
            "\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1"+
            "\uffff\1\u013a",
            "\1\u0136\1\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1"+
            "\u013a",
            "\1\u0136\1\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1"+
            "\u013a",
            "\1\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0137\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0138\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u0139\2\uffff\1\u013b\1\uffff\1\u013a",
            "\1\u013b\1\uffff\1\u013a",
            "\1\u013b\1\uffff\1\u013a",
            "\1\u017c\1\u017d\11\uffff\1\u017e",
            "\1\u017f\1\u0180",
            "\1\u017f\1\u0180",
            "\1\u0181\1\u0182\12\uffff\1\u0183",
            "\1\u016f",
            "\1\u016f",
            "\1\u0126\1\u0127",
            "\1\u0184\1\u0185",
            "\1\u0186\1\u0187",
            "\1\u0188\1\u0189",
            "\1\u018b\33\uffff\1\u018a",
            "\1\u018c\1\u018d",
            "\1\u018e\1\u018f",
            "\1\u0190\1\u0191",
            "\1\u0192\1\u0193",
            "\1\u0194\1\u0195",
            "\1\u0196\1\u0197",
            "\1\u0198",
            "\1\u0102\1\u0103",
            "\1\u0199\1\u019a",
            "\1\u0199\1\u019a",
            "\1\u019b\1\u019c\12\uffff\1\u019d",
            "\1\u019e\1\u019f\11\uffff\1\u01a0",
            "\1\u0125",
            "\1\u0183",
            "\1\u0183",
            "\1\u017f\1\u0180",
            "\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1"+
            "\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1"+
            "\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1"+
            "\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1"+
            "\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\2"+
            "\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\2"+
            "\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u018b",
            "\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\2\uffff\1"+
            "\u017b\1\uffff\1\u017a",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1"+
            "\uffff\1\u017a",
            "\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1"+
            "\uffff\1\u017a",
            "\1\u0176\1\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1"+
            "\u017a",
            "\1\u0176\1\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1"+
            "\u017a",
            "\1\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0177\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0178\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u0179\2\uffff\1\u017b\1\uffff\1\u017a",
            "\1\u017b\1\uffff\1\u017a",
            "\1\u017b\1\uffff\1\u017a",
            "\1\u01a1\1\u01a2\11\uffff\1\u01a3",
            "\1\u01a4\1\u01a5\11\uffff\1\u01a6",
            "\1\u013b",
            "\1\u019d",
            "\1\u019d",
            "\1\u0199\1\u019a",
            "\1\u017f\1\u0180",
            "\1\u017f\1\u0180",
            "\1\u01a7\1\u01a8\12\uffff\1\u01a9",
            "\1\u01aa\1\u01ab",
            "\1\u01aa\1\u01ab",
            "\1\u01ac\1\u01ad\12\uffff\1\u01ae",
            "\1\u0199\1\u019a",
            "\1\u0199\1\u019a",
            "\1\u01af\1\u01b0\12\uffff\1\u01b1",
            "\1\u01a9",
            "\1\u01a9",
            "\1\u017f\1\u0180",
            "\1\u01b2\1\u01b3\11\uffff\1\u01b4",
            "\1\u017b",
            "\1\u01ae",
            "\1\u01ae",
            "\1\u01aa\1\u01ab",
            "\1\u01b1",
            "\1\u01b1",
            "\1\u0199\1\u019a",
            "\1\u01aa\1\u01ab",
            "\1\u01aa\1\u01ab",
            "\1\u01b5\1\u01b6\12\uffff\1\u01b7",
            "\1\u01b7",
            "\1\u01b7",
            "\1\u01aa\1\u01ab"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 104:2: (otherlv_2= ' ' | (otherlv_3= '\\n' ( (lv_textItems_4_0= ruleBTSTextItems ) ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBTSTextContent_in_entryRuleBTSTextContent75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTextContent85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent141 = new BitSet(new long[]{0x000000000002B802L});
        public static final BitSet FOLLOW_11_in_ruleBTSTextContent154 = new BitSet(new long[]{0x000000000002B802L});
        public static final BitSet FOLLOW_12_in_ruleBTSTextContent173 = new BitSet(new long[]{0x000000000002B800L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent194 = new BitSet(new long[]{0x000000000002B802L});
        public static final BitSet FOLLOW_12_in_ruleBTSTextContent210 = new BitSet(new long[]{0x000000000002B800L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent231 = new BitSet(new long[]{0x000000000002B802L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_entryRuleBTSSentenceItem271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSSentenceItem281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_ruleBTSSentenceItem328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_ruleBTSSentenceItem355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_ruleBTSSentenceItem382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_entryRuleBTSAmbivalenceItem417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSAmbivalenceItem427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_ruleBTSAmbivalenceItem474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_ruleBTSAmbivalenceItem501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_entryRuleBTSTextItems536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTextItems546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSenctence_in_ruleBTSTextItems593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_ruleBTSTextItems620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_ruleBTSTextItems647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString683 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSenctence_in_entryRuleBTSSenctence805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSSenctence815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBTSSenctence861 = new BitSet(new long[]{0x000000000002F830L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence883 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_11_in_ruleBTSSenctence896 = new BitSet(new long[]{0x000000000002B830L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence917 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_14_in_ruleBTSSenctence933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_entryRuleBTSWord969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSWord979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_entryRuleBTSMarker1070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSMarker1080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleBTSMarker1126 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker1147 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBTSMarker1160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_entryRuleBTSAmbivalence1196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSAmbivalence1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleBTSAmbivalence1252 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBTSAmbivalence1264 = new BitSet(new long[]{0x00000000BFF80000L});
        public static final BitSet FOLLOW_19_in_ruleBTSAmbivalence1277 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1298 = new BitSet(new long[]{0x00000000BFF00000L});
        public static final BitSet FOLLOW_20_in_ruleBTSAmbivalence1313 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1334 = new BitSet(new long[]{0x00000000BFE00000L});
        public static final BitSet FOLLOW_21_in_ruleBTSAmbivalence1349 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1370 = new BitSet(new long[]{0x00000000BFC00000L});
        public static final BitSet FOLLOW_22_in_ruleBTSAmbivalence1385 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSAmbivalence1406 = new BitSet(new long[]{0x00000000BF800000L});
        public static final BitSet FOLLOW_23_in_ruleBTSAmbivalence1421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1442 = new BitSet(new long[]{0x00000000BF000000L});
        public static final BitSet FOLLOW_24_in_ruleBTSAmbivalence1457 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1478 = new BitSet(new long[]{0x00000000BE000000L});
        public static final BitSet FOLLOW_25_in_ruleBTSAmbivalence1493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1514 = new BitSet(new long[]{0x00000000BC000000L});
        public static final BitSet FOLLOW_26_in_ruleBTSAmbivalence1529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1550 = new BitSet(new long[]{0x00000000B8000000L});
        public static final BitSet FOLLOW_27_in_ruleBTSAmbivalence1565 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1586 = new BitSet(new long[]{0x00000000B0000000L});
        public static final BitSet FOLLOW_28_in_ruleBTSAmbivalence1601 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence1622 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleBTSAmbivalence1637 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBTSAmbivalence1649 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence1670 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleBTSAmbivalence1683 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence1704 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_31_in_ruleBTSAmbivalence1718 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBTSAmbivalence1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_entryRuleBTSLemmaCase1768 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSLemmaCase1778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleBTSLemmaCase1824 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase1845 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBTSLemmaCase1857 = new BitSet(new long[]{0x000000029FF80000L});
        public static final BitSet FOLLOW_19_in_ruleBTSLemmaCase1870 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase1891 = new BitSet(new long[]{0x000000029FF00000L});
        public static final BitSet FOLLOW_20_in_ruleBTSLemmaCase1906 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase1927 = new BitSet(new long[]{0x000000029FE00000L});
        public static final BitSet FOLLOW_21_in_ruleBTSLemmaCase1942 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase1963 = new BitSet(new long[]{0x000000029FC00000L});
        public static final BitSet FOLLOW_22_in_ruleBTSLemmaCase1978 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSLemmaCase1999 = new BitSet(new long[]{0x000000029F800000L});
        public static final BitSet FOLLOW_23_in_ruleBTSLemmaCase2014 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase2035 = new BitSet(new long[]{0x000000029F000000L});
        public static final BitSet FOLLOW_24_in_ruleBTSLemmaCase2050 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase2071 = new BitSet(new long[]{0x000000029E000000L});
        public static final BitSet FOLLOW_25_in_ruleBTSLemmaCase2086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase2107 = new BitSet(new long[]{0x000000029C000000L});
        public static final BitSet FOLLOW_26_in_ruleBTSLemmaCase2122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase2143 = new BitSet(new long[]{0x0000000298000000L});
        public static final BitSet FOLLOW_27_in_ruleBTSLemmaCase2158 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase2179 = new BitSet(new long[]{0x0000000290000000L});
        public static final BitSet FOLLOW_28_in_ruleBTSLemmaCase2194 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase2215 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_33_in_ruleBTSLemmaCase2230 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBTSLemmaCase2242 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase2263 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleBTSLemmaCase2276 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase2297 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_31_in_ruleBTSLemmaCase2311 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBTSLemmaCase2325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEInt2412 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2429 = new BitSet(new long[]{0x0000000000000002L});
    }


}