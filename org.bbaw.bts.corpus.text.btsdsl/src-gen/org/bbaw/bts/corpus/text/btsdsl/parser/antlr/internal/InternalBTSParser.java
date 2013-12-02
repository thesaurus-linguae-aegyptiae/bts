package org.bbaw.bts.corpus.text.btsdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.bbaw.bts.corpus.text.btsdsl.services.BTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBTSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BTSTextContent'", "'{'", "'textItems'", "','", "'}'", "'BTSSenctence'", "'state'", "'revisionState'", "'visibility'", "'sortKey'", "'type'", "'subtype'", "'code'", "'_id'", "'comment'", "'parentId'", "'sentenceItems'", "'translation'", "'BTSWord'", "'wType'", "'lType'", "'lKey'", "'flexCode'", "'wChar'", "'value'", "'graphics'", "'BTSMarker'", "'BTSAmbivalence'", "'cases'", "'BTSLemmaCase'", "'scenario'", "'-'", "'BTSTranslations'", "'translations'", "'BTSTranslation'", "'lang'", "'BTSGraphic'", "'innerSentenceOrder'", "'reference'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g"; }



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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:67:1: entryRuleBTSTextContent returns [EObject current=null] : iv_ruleBTSTextContent= ruleBTSTextContent EOF ;
    public final EObject entryRuleBTSTextContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSTextContent = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:68:2: (iv_ruleBTSTextContent= ruleBTSTextContent EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:69:2: iv_ruleBTSTextContent= ruleBTSTextContent EOF
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:76:1: ruleBTSTextContent returns [EObject current=null] : ( () otherlv_1= 'BTSTextContent' otherlv_2= '{' (otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBTSTextContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_textItems_5_0 = null;

        EObject lv_textItems_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:79:28: ( ( () otherlv_1= 'BTSTextContent' otherlv_2= '{' (otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:80:1: ( () otherlv_1= 'BTSTextContent' otherlv_2= '{' (otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:80:1: ( () otherlv_1= 'BTSTextContent' otherlv_2= '{' (otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:80:2: () otherlv_1= 'BTSTextContent' otherlv_2= '{' (otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:80:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSTextContentAccess().getBTSTextContentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBTSTextContent131); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSTextContentAccess().getBTSTextContentKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTextContent143); 

                	newLeafNode(otherlv_2, grammarAccess.getBTSTextContentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:94:1: (otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:94:3: otherlv_3= 'textItems' otherlv_4= '{' ( (lv_textItems_5_0= ruleBTSTextItems ) ) (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBTSTextContent156); 

                        	newLeafNode(otherlv_3, grammarAccess.getBTSTextContentAccess().getTextItemsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTextContent168); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSTextContentAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:102:1: ( (lv_textItems_5_0= ruleBTSTextItems ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:103:1: (lv_textItems_5_0= ruleBTSTextItems )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:103:1: (lv_textItems_5_0= ruleBTSTextItems )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:104:3: lv_textItems_5_0= ruleBTSTextItems
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent189);
                    lv_textItems_5_0=ruleBTSTextItems();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSTextContentRule());
                    	        }
                           		add(
                           			current, 
                           			"textItems",
                            		lv_textItems_5_0, 
                            		"BTSTextItems");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:120:2: (otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:120:4: otherlv_6= ',' ( (lv_textItems_7_0= ruleBTSTextItems ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSTextContent202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBTSTextContentAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:124:1: ( (lv_textItems_7_0= ruleBTSTextItems ) )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:125:1: (lv_textItems_7_0= ruleBTSTextItems )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:125:1: (lv_textItems_7_0= ruleBTSTextItems )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:126:3: lv_textItems_7_0= ruleBTSTextItems
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent223);
                    	    lv_textItems_7_0=ruleBTSTextItems();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSTextContentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"textItems",
                    	            		lv_textItems_7_0, 
                    	            		"BTSTextItems");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSTextContent237); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSTextContentAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSTextContent251); 

                	newLeafNode(otherlv_9, grammarAccess.getBTSTextContentAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:158:1: entryRuleBTSSentenceItem returns [EObject current=null] : iv_ruleBTSSentenceItem= ruleBTSSentenceItem EOF ;
    public final EObject entryRuleBTSSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSSentenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:159:2: (iv_ruleBTSSentenceItem= ruleBTSSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:160:2: iv_ruleBTSSentenceItem= ruleBTSSentenceItem EOF
            {
             newCompositeNode(grammarAccess.getBTSSentenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_entryRuleBTSSentenceItem287);
            iv_ruleBTSSentenceItem=ruleBTSSentenceItem();

            state._fsp--;

             current =iv_ruleBTSSentenceItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSSentenceItem297); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:167:1: ruleBTSSentenceItem returns [EObject current=null] : (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) ;
    public final EObject ruleBTSSentenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_BTSWord_0 = null;

        EObject this_BTSMarker_1 = null;

        EObject this_BTSAmbivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:170:28: ( (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:171:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:171:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:172:5: this_BTSWord_0= ruleBTSWord
                    {
                     
                            newCompositeNode(grammarAccess.getBTSSentenceItemAccess().getBTSWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_ruleBTSSentenceItem344);
                    this_BTSWord_0=ruleBTSWord();

                    state._fsp--;

                     
                            current = this_BTSWord_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:182:5: this_BTSMarker_1= ruleBTSMarker
                    {
                     
                            newCompositeNode(grammarAccess.getBTSSentenceItemAccess().getBTSMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_ruleBTSSentenceItem371);
                    this_BTSMarker_1=ruleBTSMarker();

                    state._fsp--;

                     
                            current = this_BTSMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:192:5: this_BTSAmbivalence_2= ruleBTSAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getBTSSentenceItemAccess().getBTSAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_ruleBTSSentenceItem398);
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:208:1: entryRuleBTSAmbivalenceItem returns [EObject current=null] : iv_ruleBTSAmbivalenceItem= ruleBTSAmbivalenceItem EOF ;
    public final EObject entryRuleBTSAmbivalenceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSAmbivalenceItem = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:209:2: (iv_ruleBTSAmbivalenceItem= ruleBTSAmbivalenceItem EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:210:2: iv_ruleBTSAmbivalenceItem= ruleBTSAmbivalenceItem EOF
            {
             newCompositeNode(grammarAccess.getBTSAmbivalenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_entryRuleBTSAmbivalenceItem433);
            iv_ruleBTSAmbivalenceItem=ruleBTSAmbivalenceItem();

            state._fsp--;

             current =iv_ruleBTSAmbivalenceItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSAmbivalenceItem443); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:217:1: ruleBTSAmbivalenceItem returns [EObject current=null] : (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker ) ;
    public final EObject ruleBTSAmbivalenceItem() throws RecognitionException {
        EObject current = null;

        EObject this_BTSWord_0 = null;

        EObject this_BTSMarker_1 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:220:28: ( (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:221:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:221:1: (this_BTSWord_0= ruleBTSWord | this_BTSMarker_1= ruleBTSMarker )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:222:5: this_BTSWord_0= ruleBTSWord
                    {
                     
                            newCompositeNode(grammarAccess.getBTSAmbivalenceItemAccess().getBTSWordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_ruleBTSAmbivalenceItem490);
                    this_BTSWord_0=ruleBTSWord();

                    state._fsp--;

                     
                            current = this_BTSWord_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:232:5: this_BTSMarker_1= ruleBTSMarker
                    {
                     
                            newCompositeNode(grammarAccess.getBTSAmbivalenceItemAccess().getBTSMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_ruleBTSAmbivalenceItem517);
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:248:1: entryRuleBTSTextItems returns [EObject current=null] : iv_ruleBTSTextItems= ruleBTSTextItems EOF ;
    public final EObject entryRuleBTSTextItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSTextItems = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:249:2: (iv_ruleBTSTextItems= ruleBTSTextItems EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:250:2: iv_ruleBTSTextItems= ruleBTSTextItems EOF
            {
             newCompositeNode(grammarAccess.getBTSTextItemsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_entryRuleBTSTextItems552);
            iv_ruleBTSTextItems=ruleBTSTextItems();

            state._fsp--;

             current =iv_ruleBTSTextItems; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTextItems562); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:257:1: ruleBTSTextItems returns [EObject current=null] : (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) ;
    public final EObject ruleBTSTextItems() throws RecognitionException {
        EObject current = null;

        EObject this_BTSSenctence_0 = null;

        EObject this_BTSMarker_1 = null;

        EObject this_BTSAmbivalence_2 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:260:28: ( (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:261:1: (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:261:1: (this_BTSSenctence_0= ruleBTSSenctence | this_BTSMarker_1= ruleBTSMarker | this_BTSAmbivalence_2= ruleBTSAmbivalence )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 37:
                {
                alt5=2;
                }
                break;
            case 38:
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
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:262:5: this_BTSSenctence_0= ruleBTSSenctence
                    {
                     
                            newCompositeNode(grammarAccess.getBTSTextItemsAccess().getBTSSenctenceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSSenctence_in_ruleBTSTextItems609);
                    this_BTSSenctence_0=ruleBTSSenctence();

                    state._fsp--;

                     
                            current = this_BTSSenctence_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:272:5: this_BTSMarker_1= ruleBTSMarker
                    {
                     
                            newCompositeNode(grammarAccess.getBTSTextItemsAccess().getBTSMarkerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_ruleBTSTextItems636);
                    this_BTSMarker_1=ruleBTSMarker();

                    state._fsp--;

                     
                            current = this_BTSMarker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:282:5: this_BTSAmbivalence_2= ruleBTSAmbivalence
                    {
                     
                            newCompositeNode(grammarAccess.getBTSTextItemsAccess().getBTSAmbivalenceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_ruleBTSTextItems663);
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:298:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:299:2: (iv_ruleEString= ruleEString EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:300:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString699);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString710); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:307:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:310:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:311:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:311:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:311:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString750); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:319:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString776); 

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:334:1: entryRuleBTSSenctence returns [EObject current=null] : iv_ruleBTSSenctence= ruleBTSSenctence EOF ;
    public final EObject entryRuleBTSSenctence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSSenctence = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:335:2: (iv_ruleBTSSenctence= ruleBTSSenctence EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:336:2: iv_ruleBTSSenctence= ruleBTSSenctence EOF
            {
             newCompositeNode(grammarAccess.getBTSSenctenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSenctence_in_entryRuleBTSSenctence821);
            iv_ruleBTSSenctence=ruleBTSSenctence();

            state._fsp--;

             current =iv_ruleBTSSenctence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSSenctence831); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:343:1: ruleBTSSenctence returns [EObject current=null] : ( () otherlv_1= 'BTSSenctence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}' )? (otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) ) )? otherlv_32= '}' ) ;
    public final EObject ruleBTSSenctence() throws RecognitionException {
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
        Token otherlv_32=null;
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

        EObject lv_sentenceItems_26_0 = null;

        EObject lv_sentenceItems_28_0 = null;

        EObject lv_translation_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:346:28: ( ( () otherlv_1= 'BTSSenctence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}' )? (otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) ) )? otherlv_32= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:347:1: ( () otherlv_1= 'BTSSenctence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}' )? (otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) ) )? otherlv_32= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:347:1: ( () otherlv_1= 'BTSSenctence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}' )? (otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) ) )? otherlv_32= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:347:2: () otherlv_1= 'BTSSenctence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}' )? (otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) ) )? otherlv_32= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:347:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSSenctenceAccess().getBTSSenctenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBTSSenctence877); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSSenctenceAccess().getBTSSenctenceKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:357:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:358:1: (lv_name_2_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:358:1: (lv_name_2_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:359:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence898);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSSenctence910); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSSenctenceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:379:1: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:379:3: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBTSSenctence923); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSSenctenceAccess().getStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:383:1: ( (lv_state_5_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:384:1: (lv_state_5_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:384:1: (lv_state_5_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:385:3: lv_state_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence944);
                    lv_state_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:401:4: (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:401:6: otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSSenctence959); 

                        	newLeafNode(otherlv_6, grammarAccess.getBTSSenctenceAccess().getRevisionStateKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:405:1: ( (lv_revisionState_7_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:406:1: (lv_revisionState_7_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:406:1: (lv_revisionState_7_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:407:3: lv_revisionState_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence980);
                    lv_revisionState_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:423:4: (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:423:6: otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSSenctence995); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSSenctenceAccess().getVisibilityKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:427:1: ( (lv_visibility_9_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:428:1: (lv_visibility_9_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:428:1: (lv_visibility_9_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:429:3: lv_visibility_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1016);
                    lv_visibility_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:445:4: (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:445:6: otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSSenctence1031); 

                        	newLeafNode(otherlv_10, grammarAccess.getBTSSenctenceAccess().getSortKeyKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:449:1: ( (lv_sortKey_11_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:450:1: (lv_sortKey_11_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:450:1: (lv_sortKey_11_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:451:3: lv_sortKey_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSSenctence1052);
                    lv_sortKey_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:467:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:467:6: otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSSenctence1067); 

                        	newLeafNode(otherlv_12, grammarAccess.getBTSSenctenceAccess().getTypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:471:1: ( (lv_type_13_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:472:1: (lv_type_13_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:472:1: (lv_type_13_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:473:3: lv_type_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getTypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1088);
                    lv_type_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:489:4: (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:489:6: otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSSenctence1103); 

                        	newLeafNode(otherlv_14, grammarAccess.getBTSSenctenceAccess().getSubtypeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:493:1: ( (lv_subtype_15_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:494:1: (lv_subtype_15_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:494:1: (lv_subtype_15_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:495:3: lv_subtype_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1124);
                    lv_subtype_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:511:4: (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:511:6: otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSSenctence1139); 

                        	newLeafNode(otherlv_16, grammarAccess.getBTSSenctenceAccess().getCodeKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:515:1: ( (lv_code_17_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:516:1: (lv_code_17_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:516:1: (lv_code_17_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:517:3: lv_code_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getCodeEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1160);
                    lv_code_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:533:4: (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:533:6: otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSSenctence1175); 

                        	newLeafNode(otherlv_18, grammarAccess.getBTSSenctenceAccess().get_idKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:537:1: ( (lv__id_19_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:538:1: (lv__id_19_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:538:1: (lv__id_19_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:539:3: lv__id_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().get_idEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1196);
                    lv__id_19_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:555:4: (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:555:6: otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSSenctence1211); 

                        	newLeafNode(otherlv_20, grammarAccess.getBTSSenctenceAccess().getCommentKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:559:1: ( (lv_comment_21_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:560:1: (lv_comment_21_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:560:1: (lv_comment_21_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:561:3: lv_comment_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getCommentEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1232);
                    lv_comment_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:577:4: (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:577:6: otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSSenctence1247); 

                        	newLeafNode(otherlv_22, grammarAccess.getBTSSenctenceAccess().getParentIdKeyword_13_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:581:1: ( (lv_parentId_23_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:582:1: (lv_parentId_23_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:582:1: (lv_parentId_23_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:583:3: lv_parentId_23_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getParentIdEStringParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSSenctence1268);
                    lv_parentId_23_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:599:4: (otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:599:6: otherlv_24= 'sentenceItems' otherlv_25= '{' ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) ) (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBTSSenctence1283); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSSenctenceAccess().getSentenceItemsKeyword_14_0());
                        
                    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSSenctence1295); 

                        	newLeafNode(otherlv_25, grammarAccess.getBTSSenctenceAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:607:1: ( (lv_sentenceItems_26_0= ruleBTSSentenceItem ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:608:1: (lv_sentenceItems_26_0= ruleBTSSentenceItem )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:608:1: (lv_sentenceItems_26_0= ruleBTSSentenceItem )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:609:3: lv_sentenceItems_26_0= ruleBTSSentenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence1316);
                    lv_sentenceItems_26_0=ruleBTSSentenceItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
                    	        }
                           		add(
                           			current, 
                           			"sentenceItems",
                            		lv_sentenceItems_26_0, 
                            		"BTSSentenceItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:625:2: (otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:625:4: otherlv_27= ',' ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSSenctence1329); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getBTSSenctenceAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:629:1: ( (lv_sentenceItems_28_0= ruleBTSSentenceItem ) )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:630:1: (lv_sentenceItems_28_0= ruleBTSSentenceItem )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:630:1: (lv_sentenceItems_28_0= ruleBTSSentenceItem )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:631:3: lv_sentenceItems_28_0= ruleBTSSentenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence1350);
                    	    lv_sentenceItems_28_0=ruleBTSSentenceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentenceItems",
                    	            		lv_sentenceItems_28_0, 
                    	            		"BTSSentenceItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSSenctence1364); 

                        	newLeafNode(otherlv_29, grammarAccess.getBTSSenctenceAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:651:3: (otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:651:5: otherlv_30= 'translation' ( (lv_translation_31_0= ruleBTSTranslations ) )
                    {
                    otherlv_30=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBTSSenctence1379); 

                        	newLeafNode(otherlv_30, grammarAccess.getBTSSenctenceAccess().getTranslationKeyword_15_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:655:1: ( (lv_translation_31_0= ruleBTSTranslations ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:656:1: (lv_translation_31_0= ruleBTSTranslations )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:656:1: (lv_translation_31_0= ruleBTSTranslations )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:657:3: lv_translation_31_0= ruleBTSTranslations
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSSenctenceAccess().getTranslationBTSTranslationsParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSTranslations_in_ruleBTSSenctence1400);
                    lv_translation_31_0=ruleBTSTranslations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSSenctenceRule());
                    	        }
                           		set(
                           			current, 
                           			"translation",
                            		lv_translation_31_0, 
                            		"BTSTranslations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSSenctence1414); 

                	newLeafNode(otherlv_32, grammarAccess.getBTSSenctenceAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:685:1: entryRuleBTSWord returns [EObject current=null] : iv_ruleBTSWord= ruleBTSWord EOF ;
    public final EObject entryRuleBTSWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSWord = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:686:2: (iv_ruleBTSWord= ruleBTSWord EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:687:2: iv_ruleBTSWord= ruleBTSWord EOF
            {
             newCompositeNode(grammarAccess.getBTSWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_entryRuleBTSWord1450);
            iv_ruleBTSWord=ruleBTSWord();

            state._fsp--;

             current =iv_ruleBTSWord; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSWord1460); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:694:1: ruleBTSWord returns [EObject current=null] : ( () otherlv_1= 'BTSWord' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) ) )? (otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) ) )? (otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) ) )? (otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) ) )? (otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) ) )? (otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) ) )? (otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) ) )? (otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}' )? otherlv_44= '}' ) ;
    public final EObject ruleBTSWord() throws RecognitionException {
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
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
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

        AntlrDatatypeRuleToken lv_wType_25_0 = null;

        AntlrDatatypeRuleToken lv_lType_27_0 = null;

        AntlrDatatypeRuleToken lv_lKey_29_0 = null;

        AntlrDatatypeRuleToken lv_flexCode_31_0 = null;

        AntlrDatatypeRuleToken lv_wChar_33_0 = null;

        AntlrDatatypeRuleToken lv_value_35_0 = null;

        EObject lv_translation_37_0 = null;

        EObject lv_graphics_40_0 = null;

        EObject lv_graphics_42_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:697:28: ( ( () otherlv_1= 'BTSWord' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) ) )? (otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) ) )? (otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) ) )? (otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) ) )? (otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) ) )? (otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) ) )? (otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) ) )? (otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}' )? otherlv_44= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:698:1: ( () otherlv_1= 'BTSWord' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) ) )? (otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) ) )? (otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) ) )? (otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) ) )? (otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) ) )? (otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) ) )? (otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) ) )? (otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}' )? otherlv_44= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:698:1: ( () otherlv_1= 'BTSWord' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) ) )? (otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) ) )? (otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) ) )? (otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) ) )? (otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) ) )? (otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) ) )? (otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) ) )? (otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}' )? otherlv_44= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:698:2: () otherlv_1= 'BTSWord' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) ) )? (otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) ) )? (otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) ) )? (otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) ) )? (otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) ) )? (otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) ) )? (otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) ) )? (otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}' )? otherlv_44= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:698:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:699:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSWordAccess().getBTSWordAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBTSWord1506); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSWordAccess().getBTSWordKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:708:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:709:1: (lv_name_2_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:709:1: (lv_name_2_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:710:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSWordAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1527);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSWord1539); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSWordAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:730:1: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:730:3: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBTSWord1552); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSWordAccess().getStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:734:1: ( (lv_state_5_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:735:1: (lv_state_5_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:735:1: (lv_state_5_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:736:3: lv_state_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1573);
                    lv_state_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:752:4: (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:752:6: otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSWord1588); 

                        	newLeafNode(otherlv_6, grammarAccess.getBTSWordAccess().getRevisionStateKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:756:1: ( (lv_revisionState_7_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:757:1: (lv_revisionState_7_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:757:1: (lv_revisionState_7_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:758:3: lv_revisionState_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1609);
                    lv_revisionState_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:774:4: (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:774:6: otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSWord1624); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSWordAccess().getVisibilityKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:778:1: ( (lv_visibility_9_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:779:1: (lv_visibility_9_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:779:1: (lv_visibility_9_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:780:3: lv_visibility_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1645);
                    lv_visibility_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:796:4: (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:796:6: otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSWord1660); 

                        	newLeafNode(otherlv_10, grammarAccess.getBTSWordAccess().getSortKeyKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:800:1: ( (lv_sortKey_11_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:801:1: (lv_sortKey_11_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:801:1: (lv_sortKey_11_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:802:3: lv_sortKey_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSWord1681);
                    lv_sortKey_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:818:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:818:6: otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSWord1696); 

                        	newLeafNode(otherlv_12, grammarAccess.getBTSWordAccess().getTypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:822:1: ( (lv_type_13_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:823:1: (lv_type_13_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:823:1: (lv_type_13_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:824:3: lv_type_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getTypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1717);
                    lv_type_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:840:4: (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:840:6: otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSWord1732); 

                        	newLeafNode(otherlv_14, grammarAccess.getBTSWordAccess().getSubtypeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:844:1: ( (lv_subtype_15_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:845:1: (lv_subtype_15_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:845:1: (lv_subtype_15_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:846:3: lv_subtype_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1753);
                    lv_subtype_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:862:4: (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:862:6: otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSWord1768); 

                        	newLeafNode(otherlv_16, grammarAccess.getBTSWordAccess().getCodeKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:866:1: ( (lv_code_17_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:867:1: (lv_code_17_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:867:1: (lv_code_17_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:868:3: lv_code_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getCodeEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1789);
                    lv_code_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:884:4: (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:884:6: otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSWord1804); 

                        	newLeafNode(otherlv_18, grammarAccess.getBTSWordAccess().get_idKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:888:1: ( (lv__id_19_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:889:1: (lv__id_19_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:889:1: (lv__id_19_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:890:3: lv__id_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().get_idEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1825);
                    lv__id_19_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:906:4: (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:906:6: otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSWord1840); 

                        	newLeafNode(otherlv_20, grammarAccess.getBTSWordAccess().getCommentKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:910:1: ( (lv_comment_21_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:911:1: (lv_comment_21_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:911:1: (lv_comment_21_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:912:3: lv_comment_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getCommentEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1861);
                    lv_comment_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:928:4: (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:928:6: otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSWord1876); 

                        	newLeafNode(otherlv_22, grammarAccess.getBTSWordAccess().getParentIdKeyword_13_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:932:1: ( (lv_parentId_23_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:933:1: (lv_parentId_23_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:933:1: (lv_parentId_23_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:934:3: lv_parentId_23_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getParentIdEStringParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1897);
                    lv_parentId_23_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:950:4: (otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:950:6: otherlv_24= 'wType' ( (lv_wType_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBTSWord1912); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSWordAccess().getWTypeKeyword_14_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:954:1: ( (lv_wType_25_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:955:1: (lv_wType_25_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:955:1: (lv_wType_25_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:956:3: lv_wType_25_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getWTypeEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1933);
                    lv_wType_25_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"wType",
                            		lv_wType_25_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:972:4: (otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:972:6: otherlv_26= 'lType' ( (lv_lType_27_0= ruleEString ) )
                    {
                    otherlv_26=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBTSWord1948); 

                        	newLeafNode(otherlv_26, grammarAccess.getBTSWordAccess().getLTypeKeyword_15_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:976:1: ( (lv_lType_27_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:977:1: (lv_lType_27_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:977:1: (lv_lType_27_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:978:3: lv_lType_27_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getLTypeEStringParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord1969);
                    lv_lType_27_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"lType",
                            		lv_lType_27_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:994:4: (otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:994:6: otherlv_28= 'lKey' ( (lv_lKey_29_0= ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBTSWord1984); 

                        	newLeafNode(otherlv_28, grammarAccess.getBTSWordAccess().getLKeyKeyword_16_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:998:1: ( (lv_lKey_29_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:999:1: (lv_lKey_29_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:999:1: (lv_lKey_29_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1000:3: lv_lKey_29_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getLKeyEStringParserRuleCall_16_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord2005);
                    lv_lKey_29_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"lKey",
                            		lv_lKey_29_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1016:4: (otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1016:6: otherlv_30= 'flexCode' ( (lv_flexCode_31_0= ruleEString ) )
                    {
                    otherlv_30=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBTSWord2020); 

                        	newLeafNode(otherlv_30, grammarAccess.getBTSWordAccess().getFlexCodeKeyword_17_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1020:1: ( (lv_flexCode_31_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1021:1: (lv_flexCode_31_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1021:1: (lv_flexCode_31_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1022:3: lv_flexCode_31_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getFlexCodeEStringParserRuleCall_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord2041);
                    lv_flexCode_31_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"flexCode",
                            		lv_flexCode_31_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1038:4: (otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1038:6: otherlv_32= 'wChar' ( (lv_wChar_33_0= ruleEString ) )
                    {
                    otherlv_32=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBTSWord2056); 

                        	newLeafNode(otherlv_32, grammarAccess.getBTSWordAccess().getWCharKeyword_18_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1042:1: ( (lv_wChar_33_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1043:1: (lv_wChar_33_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1043:1: (lv_wChar_33_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1044:3: lv_wChar_33_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getWCharEStringParserRuleCall_18_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord2077);
                    lv_wChar_33_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"wChar",
                            		lv_wChar_33_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1060:4: (otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1060:6: otherlv_34= 'value' ( (lv_value_35_0= ruleEString ) )
                    {
                    otherlv_34=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBTSWord2092); 

                        	newLeafNode(otherlv_34, grammarAccess.getBTSWordAccess().getValueKeyword_19_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1064:1: ( (lv_value_35_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1065:1: (lv_value_35_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1065:1: (lv_value_35_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1066:3: lv_value_35_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getValueEStringParserRuleCall_19_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSWord2113);
                    lv_value_35_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_35_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1082:4: (otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1082:6: otherlv_36= 'translation' ( (lv_translation_37_0= ruleBTSTranslations ) )
                    {
                    otherlv_36=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBTSWord2128); 

                        	newLeafNode(otherlv_36, grammarAccess.getBTSWordAccess().getTranslationKeyword_20_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1086:1: ( (lv_translation_37_0= ruleBTSTranslations ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1087:1: (lv_translation_37_0= ruleBTSTranslations )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1087:1: (lv_translation_37_0= ruleBTSTranslations )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1088:3: lv_translation_37_0= ruleBTSTranslations
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getTranslationBTSTranslationsParserRuleCall_20_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSTranslations_in_ruleBTSWord2149);
                    lv_translation_37_0=ruleBTSTranslations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		set(
                           			current, 
                           			"translation",
                            		lv_translation_37_0, 
                            		"BTSTranslations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1104:4: (otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1104:6: otherlv_38= 'graphics' otherlv_39= '{' ( (lv_graphics_40_0= ruleBTSGraphic ) ) (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )* otherlv_43= '}'
                    {
                    otherlv_38=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBTSWord2164); 

                        	newLeafNode(otherlv_38, grammarAccess.getBTSWordAccess().getGraphicsKeyword_21_0());
                        
                    otherlv_39=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSWord2176); 

                        	newLeafNode(otherlv_39, grammarAccess.getBTSWordAccess().getLeftCurlyBracketKeyword_21_1());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1112:1: ( (lv_graphics_40_0= ruleBTSGraphic ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1113:1: (lv_graphics_40_0= ruleBTSGraphic )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1113:1: (lv_graphics_40_0= ruleBTSGraphic )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1114:3: lv_graphics_40_0= ruleBTSGraphic
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSWordAccess().getGraphicsBTSGraphicParserRuleCall_21_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSGraphic_in_ruleBTSWord2197);
                    lv_graphics_40_0=ruleBTSGraphic();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	        }
                           		add(
                           			current, 
                           			"graphics",
                            		lv_graphics_40_0, 
                            		"BTSGraphic");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1130:2: (otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1130:4: otherlv_41= ',' ( (lv_graphics_42_0= ruleBTSGraphic ) )
                    	    {
                    	    otherlv_41=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSWord2210); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getBTSWordAccess().getCommaKeyword_21_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1134:1: ( (lv_graphics_42_0= ruleBTSGraphic ) )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1135:1: (lv_graphics_42_0= ruleBTSGraphic )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1135:1: (lv_graphics_42_0= ruleBTSGraphic )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1136:3: lv_graphics_42_0= ruleBTSGraphic
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSWordAccess().getGraphicsBTSGraphicParserRuleCall_21_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSGraphic_in_ruleBTSWord2231);
                    	    lv_graphics_42_0=ruleBTSGraphic();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSWordRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"graphics",
                    	            		lv_graphics_42_0, 
                    	            		"BTSGraphic");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSWord2245); 

                        	newLeafNode(otherlv_43, grammarAccess.getBTSWordAccess().getRightCurlyBracketKeyword_21_4());
                        

                    }
                    break;

            }

            otherlv_44=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSWord2259); 

                	newLeafNode(otherlv_44, grammarAccess.getBTSWordAccess().getRightCurlyBracketKeyword_22());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1168:1: entryRuleBTSMarker returns [EObject current=null] : iv_ruleBTSMarker= ruleBTSMarker EOF ;
    public final EObject entryRuleBTSMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSMarker = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1169:2: (iv_ruleBTSMarker= ruleBTSMarker EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1170:2: iv_ruleBTSMarker= ruleBTSMarker EOF
            {
             newCompositeNode(grammarAccess.getBTSMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_entryRuleBTSMarker2295);
            iv_ruleBTSMarker=ruleBTSMarker();

            state._fsp--;

             current =iv_ruleBTSMarker; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSMarker2305); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1177:1: ruleBTSMarker returns [EObject current=null] : ( () otherlv_1= 'BTSMarker' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleBTSMarker() throws RecognitionException {
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
        Token otherlv_26=null;
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

        AntlrDatatypeRuleToken lv_value_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1180:28: ( ( () otherlv_1= 'BTSMarker' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) ) )? otherlv_26= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1181:1: ( () otherlv_1= 'BTSMarker' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) ) )? otherlv_26= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1181:1: ( () otherlv_1= 'BTSMarker' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) ) )? otherlv_26= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1181:2: () otherlv_1= 'BTSMarker' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) ) )? otherlv_26= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1181:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1182:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSMarkerAccess().getBTSMarkerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBTSMarker2351); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSMarkerAccess().getBTSMarkerKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1191:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1192:1: (lv_name_2_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1192:1: (lv_name_2_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1193:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2372);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSMarker2384); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSMarkerAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1213:1: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==17) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1213:3: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBTSMarker2397); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSMarkerAccess().getStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1217:1: ( (lv_state_5_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1218:1: (lv_state_5_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1218:1: (lv_state_5_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1219:3: lv_state_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2418);
                    lv_state_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1235:4: (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1235:6: otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSMarker2433); 

                        	newLeafNode(otherlv_6, grammarAccess.getBTSMarkerAccess().getRevisionStateKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1239:1: ( (lv_revisionState_7_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1240:1: (lv_revisionState_7_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1240:1: (lv_revisionState_7_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1241:3: lv_revisionState_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2454);
                    lv_revisionState_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1257:4: (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1257:6: otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSMarker2469); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSMarkerAccess().getVisibilityKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1261:1: ( (lv_visibility_9_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1262:1: (lv_visibility_9_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1262:1: (lv_visibility_9_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1263:3: lv_visibility_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2490);
                    lv_visibility_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1279:4: (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1279:6: otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSMarker2505); 

                        	newLeafNode(otherlv_10, grammarAccess.getBTSMarkerAccess().getSortKeyKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1283:1: ( (lv_sortKey_11_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1284:1: (lv_sortKey_11_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1284:1: (lv_sortKey_11_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1285:3: lv_sortKey_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSMarker2526);
                    lv_sortKey_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1301:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1301:6: otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSMarker2541); 

                        	newLeafNode(otherlv_12, grammarAccess.getBTSMarkerAccess().getTypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1305:1: ( (lv_type_13_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1306:1: (lv_type_13_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1306:1: (lv_type_13_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1307:3: lv_type_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getTypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2562);
                    lv_type_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1323:4: (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1323:6: otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSMarker2577); 

                        	newLeafNode(otherlv_14, grammarAccess.getBTSMarkerAccess().getSubtypeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1327:1: ( (lv_subtype_15_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1328:1: (lv_subtype_15_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1328:1: (lv_subtype_15_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1329:3: lv_subtype_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2598);
                    lv_subtype_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1345:4: (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1345:6: otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSMarker2613); 

                        	newLeafNode(otherlv_16, grammarAccess.getBTSMarkerAccess().getCodeKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1349:1: ( (lv_code_17_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1350:1: (lv_code_17_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1350:1: (lv_code_17_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1351:3: lv_code_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getCodeEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2634);
                    lv_code_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1367:4: (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1367:6: otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSMarker2649); 

                        	newLeafNode(otherlv_18, grammarAccess.getBTSMarkerAccess().get_idKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1371:1: ( (lv__id_19_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1372:1: (lv__id_19_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1372:1: (lv__id_19_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1373:3: lv__id_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().get_idEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2670);
                    lv__id_19_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1389:4: (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1389:6: otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSMarker2685); 

                        	newLeafNode(otherlv_20, grammarAccess.getBTSMarkerAccess().getCommentKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1393:1: ( (lv_comment_21_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1394:1: (lv_comment_21_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1394:1: (lv_comment_21_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1395:3: lv_comment_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getCommentEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2706);
                    lv_comment_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1411:4: (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1411:6: otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSMarker2721); 

                        	newLeafNode(otherlv_22, grammarAccess.getBTSMarkerAccess().getParentIdKeyword_13_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1415:1: ( (lv_parentId_23_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1416:1: (lv_parentId_23_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1416:1: (lv_parentId_23_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1417:3: lv_parentId_23_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getParentIdEStringParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2742);
                    lv_parentId_23_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1433:4: (otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1433:6: otherlv_24= 'value' ( (lv_value_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBTSMarker2757); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSMarkerAccess().getValueKeyword_14_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1437:1: ( (lv_value_25_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1438:1: (lv_value_25_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1438:1: (lv_value_25_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1439:3: lv_value_25_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSMarkerAccess().getValueEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSMarker2778);
                    lv_value_25_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSMarkerRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_25_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSMarker2792); 

                	newLeafNode(otherlv_26, grammarAccess.getBTSMarkerAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1467:1: entryRuleBTSAmbivalence returns [EObject current=null] : iv_ruleBTSAmbivalence= ruleBTSAmbivalence EOF ;
    public final EObject entryRuleBTSAmbivalence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSAmbivalence = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1468:2: (iv_ruleBTSAmbivalence= ruleBTSAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1469:2: iv_ruleBTSAmbivalence= ruleBTSAmbivalence EOF
            {
             newCompositeNode(grammarAccess.getBTSAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_entryRuleBTSAmbivalence2828);
            iv_ruleBTSAmbivalence=ruleBTSAmbivalence();

            state._fsp--;

             current =iv_ruleBTSAmbivalence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSAmbivalence2838); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1476:1: ruleBTSAmbivalence returns [EObject current=null] : ( () otherlv_1= 'BTSAmbivalence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleBTSAmbivalence() throws RecognitionException {
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

        EObject lv_cases_26_0 = null;

        EObject lv_cases_28_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1479:28: ( ( () otherlv_1= 'BTSAmbivalence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1480:1: ( () otherlv_1= 'BTSAmbivalence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1480:1: ( () otherlv_1= 'BTSAmbivalence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1480:2: () otherlv_1= 'BTSAmbivalence' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1480:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1481:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBTSAmbivalence2884); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1490:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1491:1: (lv_name_2_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1491:1: (lv_name_2_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1492:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence2905);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSAmbivalence2917); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1512:1: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==17) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1512:3: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBTSAmbivalence2930); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSAmbivalenceAccess().getStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1516:1: ( (lv_state_5_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1517:1: (lv_state_5_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1517:1: (lv_state_5_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1518:3: lv_state_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence2951);
                    lv_state_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1534:4: (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1534:6: otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSAmbivalence2966); 

                        	newLeafNode(otherlv_6, grammarAccess.getBTSAmbivalenceAccess().getRevisionStateKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1538:1: ( (lv_revisionState_7_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1539:1: (lv_revisionState_7_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1539:1: (lv_revisionState_7_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1540:3: lv_revisionState_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence2987);
                    lv_revisionState_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1556:4: (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1556:6: otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSAmbivalence3002); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSAmbivalenceAccess().getVisibilityKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1560:1: ( (lv_visibility_9_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1561:1: (lv_visibility_9_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1561:1: (lv_visibility_9_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1562:3: lv_visibility_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3023);
                    lv_visibility_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1578:4: (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1578:6: otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSAmbivalence3038); 

                        	newLeafNode(otherlv_10, grammarAccess.getBTSAmbivalenceAccess().getSortKeyKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1582:1: ( (lv_sortKey_11_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1583:1: (lv_sortKey_11_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1583:1: (lv_sortKey_11_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1584:3: lv_sortKey_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSAmbivalence3059);
                    lv_sortKey_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1600:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1600:6: otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSAmbivalence3074); 

                        	newLeafNode(otherlv_12, grammarAccess.getBTSAmbivalenceAccess().getTypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1604:1: ( (lv_type_13_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1605:1: (lv_type_13_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1605:1: (lv_type_13_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1606:3: lv_type_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getTypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3095);
                    lv_type_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1622:4: (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==22) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1622:6: otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSAmbivalence3110); 

                        	newLeafNode(otherlv_14, grammarAccess.getBTSAmbivalenceAccess().getSubtypeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1626:1: ( (lv_subtype_15_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1627:1: (lv_subtype_15_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1627:1: (lv_subtype_15_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1628:3: lv_subtype_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3131);
                    lv_subtype_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1644:4: (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==23) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1644:6: otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSAmbivalence3146); 

                        	newLeafNode(otherlv_16, grammarAccess.getBTSAmbivalenceAccess().getCodeKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1648:1: ( (lv_code_17_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1649:1: (lv_code_17_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1649:1: (lv_code_17_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1650:3: lv_code_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCodeEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3167);
                    lv_code_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1666:4: (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==24) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1666:6: otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSAmbivalence3182); 

                        	newLeafNode(otherlv_18, grammarAccess.getBTSAmbivalenceAccess().get_idKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1670:1: ( (lv__id_19_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1671:1: (lv__id_19_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1671:1: (lv__id_19_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1672:3: lv__id_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().get_idEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3203);
                    lv__id_19_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1688:4: (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==25) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1688:6: otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSAmbivalence3218); 

                        	newLeafNode(otherlv_20, grammarAccess.getBTSAmbivalenceAccess().getCommentKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1692:1: ( (lv_comment_21_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1693:1: (lv_comment_21_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1693:1: (lv_comment_21_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1694:3: lv_comment_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCommentEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3239);
                    lv_comment_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1710:4: (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==26) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1710:6: otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSAmbivalence3254); 

                        	newLeafNode(otherlv_22, grammarAccess.getBTSAmbivalenceAccess().getParentIdKeyword_13_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1714:1: ( (lv_parentId_23_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1715:1: (lv_parentId_23_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1715:1: (lv_parentId_23_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1716:3: lv_parentId_23_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getParentIdEStringParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSAmbivalence3275);
                    lv_parentId_23_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1732:4: (otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1732:6: otherlv_24= 'cases' otherlv_25= '{' ( (lv_cases_26_0= ruleBTSLemmaCase ) ) (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBTSAmbivalence3290); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSAmbivalenceAccess().getCasesKeyword_14_0());
                        
                    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSAmbivalence3302); 

                        	newLeafNode(otherlv_25, grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1740:1: ( (lv_cases_26_0= ruleBTSLemmaCase ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1741:1: (lv_cases_26_0= ruleBTSLemmaCase )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1741:1: (lv_cases_26_0= ruleBTSLemmaCase )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1742:3: lv_cases_26_0= ruleBTSLemmaCase
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence3323);
                    lv_cases_26_0=ruleBTSLemmaCase();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	        }
                           		add(
                           			current, 
                           			"cases",
                            		lv_cases_26_0, 
                            		"BTSLemmaCase");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1758:2: (otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1758:4: otherlv_27= ',' ( (lv_cases_28_0= ruleBTSLemmaCase ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSAmbivalence3336); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getBTSAmbivalenceAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1762:1: ( (lv_cases_28_0= ruleBTSLemmaCase ) )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1763:1: (lv_cases_28_0= ruleBTSLemmaCase )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1763:1: (lv_cases_28_0= ruleBTSLemmaCase )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1764:3: lv_cases_28_0= ruleBTSLemmaCase
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence3357);
                    	    lv_cases_28_0=ruleBTSLemmaCase();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSAmbivalenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cases",
                    	            		lv_cases_28_0, 
                    	            		"BTSLemmaCase");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSAmbivalence3371); 

                        	newLeafNode(otherlv_29, grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSAmbivalence3385); 

                	newLeafNode(otherlv_30, grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1796:1: entryRuleBTSLemmaCase returns [EObject current=null] : iv_ruleBTSLemmaCase= ruleBTSLemmaCase EOF ;
    public final EObject entryRuleBTSLemmaCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSLemmaCase = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1797:2: (iv_ruleBTSLemmaCase= ruleBTSLemmaCase EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1798:2: iv_ruleBTSLemmaCase= ruleBTSLemmaCase EOF
            {
             newCompositeNode(grammarAccess.getBTSLemmaCaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_entryRuleBTSLemmaCase3421);
            iv_ruleBTSLemmaCase=ruleBTSLemmaCase();

            state._fsp--;

             current =iv_ruleBTSLemmaCase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSLemmaCase3431); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1805:1: ruleBTSLemmaCase returns [EObject current=null] : ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
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
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1808:28: ( ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1809:1: ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1809:1: ( () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1809:2: () otherlv_1= 'BTSLemmaCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )? (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )? (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )? (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )? (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )? (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )? (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )? (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )? (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1809:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1810:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBTSLemmaCase3477); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseKeyword_1());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1819:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1820:1: (lv_name_2_0= ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1820:1: (lv_name_2_0= ruleEString )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1821:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3498);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSLemmaCase3510); 

                	newLeafNode(otherlv_3, grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1841:1: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==17) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1841:3: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBTSLemmaCase3523); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSLemmaCaseAccess().getStateKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1845:1: ( (lv_state_5_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1846:1: (lv_state_5_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1846:1: (lv_state_5_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1847:3: lv_state_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getStateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3544);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1863:4: (otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1863:6: otherlv_6= 'revisionState' ( (lv_revisionState_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBTSLemmaCase3559); 

                        	newLeafNode(otherlv_6, grammarAccess.getBTSLemmaCaseAccess().getRevisionStateKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1867:1: ( (lv_revisionState_7_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1868:1: (lv_revisionState_7_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1868:1: (lv_revisionState_7_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1869:3: lv_revisionState_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3580);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1885:4: (otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==19) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1885:6: otherlv_8= 'visibility' ( (lv_visibility_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBTSLemmaCase3595); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSLemmaCaseAccess().getVisibilityKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1889:1: ( (lv_visibility_9_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1890:1: (lv_visibility_9_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1890:1: (lv_visibility_9_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1891:3: lv_visibility_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3616);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1907:4: (otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==20) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1907:6: otherlv_10= 'sortKey' ( (lv_sortKey_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBTSLemmaCase3631); 

                        	newLeafNode(otherlv_10, grammarAccess.getBTSLemmaCaseAccess().getSortKeyKeyword_7_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1911:1: ( (lv_sortKey_11_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1912:1: (lv_sortKey_11_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1912:1: (lv_sortKey_11_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1913:3: lv_sortKey_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSLemmaCase3652);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1929:4: (otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1929:6: otherlv_12= 'type' ( (lv_type_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSLemmaCase3667); 

                        	newLeafNode(otherlv_12, grammarAccess.getBTSLemmaCaseAccess().getTypeKeyword_8_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1933:1: ( (lv_type_13_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1934:1: (lv_type_13_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1934:1: (lv_type_13_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1935:3: lv_type_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getTypeEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3688);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1951:4: (otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==22) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1951:6: otherlv_14= 'subtype' ( (lv_subtype_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBTSLemmaCase3703); 

                        	newLeafNode(otherlv_14, grammarAccess.getBTSLemmaCaseAccess().getSubtypeKeyword_9_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1955:1: ( (lv_subtype_15_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1956:1: (lv_subtype_15_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1956:1: (lv_subtype_15_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1957:3: lv_subtype_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3724);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1973:4: (otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==23) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1973:6: otherlv_16= 'code' ( (lv_code_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSLemmaCase3739); 

                        	newLeafNode(otherlv_16, grammarAccess.getBTSLemmaCaseAccess().getCodeKeyword_10_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1977:1: ( (lv_code_17_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1978:1: (lv_code_17_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1978:1: (lv_code_17_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1979:3: lv_code_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getCodeEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3760);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1995:4: (otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==24) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1995:6: otherlv_18= '_id' ( (lv__id_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSLemmaCase3775); 

                        	newLeafNode(otherlv_18, grammarAccess.getBTSLemmaCaseAccess().get_idKeyword_11_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:1999:1: ( (lv__id_19_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2000:1: (lv__id_19_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2000:1: (lv__id_19_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2001:3: lv__id_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().get_idEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3796);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2017:4: (otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==25) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2017:6: otherlv_20= 'comment' ( (lv_comment_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBTSLemmaCase3811); 

                        	newLeafNode(otherlv_20, grammarAccess.getBTSLemmaCaseAccess().getCommentKeyword_12_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2021:1: ( (lv_comment_21_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2022:1: (lv_comment_21_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2022:1: (lv_comment_21_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2023:3: lv_comment_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getCommentEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3832);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2039:4: (otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==26) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2039:6: otherlv_22= 'parentId' ( (lv_parentId_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBTSLemmaCase3847); 

                        	newLeafNode(otherlv_22, grammarAccess.getBTSLemmaCaseAccess().getParentIdKeyword_13_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2043:1: ( (lv_parentId_23_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2044:1: (lv_parentId_23_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2044:1: (lv_parentId_23_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2045:3: lv_parentId_23_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getParentIdEStringParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSLemmaCase3868);
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

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2061:4: (otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==41) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2061:6: otherlv_24= 'scenario' otherlv_25= '{' ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) ) (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBTSLemmaCase3883); 

                        	newLeafNode(otherlv_24, grammarAccess.getBTSLemmaCaseAccess().getScenarioKeyword_14_0());
                        
                    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSLemmaCase3895); 

                        	newLeafNode(otherlv_25, grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2069:1: ( (lv_scenario_26_0= ruleBTSAmbivalenceItem ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2070:1: (lv_scenario_26_0= ruleBTSAmbivalenceItem )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2070:1: (lv_scenario_26_0= ruleBTSAmbivalenceItem )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2071:3: lv_scenario_26_0= ruleBTSAmbivalenceItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase3916);
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

                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2087:2: (otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2087:4: otherlv_27= ',' ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSLemmaCase3929); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getBTSLemmaCaseAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2091:1: ( (lv_scenario_28_0= ruleBTSAmbivalenceItem ) )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2092:1: (lv_scenario_28_0= ruleBTSAmbivalenceItem )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2092:1: (lv_scenario_28_0= ruleBTSAmbivalenceItem )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2093:3: lv_scenario_28_0= ruleBTSAmbivalenceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase3950);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSLemmaCase3964); 

                        	newLeafNode(otherlv_29, grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSLemmaCase3978); 

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2125:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2126:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2127:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4015);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4026); 

            }

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
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2134:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2137:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2138:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2138:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2138:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2138:2: (kw= '-' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==42) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2139:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt4065); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4082); 

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


    // $ANTLR start "entryRuleBTSTranslations"
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2159:1: entryRuleBTSTranslations returns [EObject current=null] : iv_ruleBTSTranslations= ruleBTSTranslations EOF ;
    public final EObject entryRuleBTSTranslations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSTranslations = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2160:2: (iv_ruleBTSTranslations= ruleBTSTranslations EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2161:2: iv_ruleBTSTranslations= ruleBTSTranslations EOF
            {
             newCompositeNode(grammarAccess.getBTSTranslationsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTranslations_in_entryRuleBTSTranslations4127);
            iv_ruleBTSTranslations=ruleBTSTranslations();

            state._fsp--;

             current =iv_ruleBTSTranslations; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTranslations4137); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSTranslations"


    // $ANTLR start "ruleBTSTranslations"
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2168:1: ruleBTSTranslations returns [EObject current=null] : ( () otherlv_1= 'BTSTranslations' otherlv_2= '{' (otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBTSTranslations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_translations_5_0 = null;

        EObject lv_translations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2171:28: ( ( () otherlv_1= 'BTSTranslations' otherlv_2= '{' (otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2172:1: ( () otherlv_1= 'BTSTranslations' otherlv_2= '{' (otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2172:1: ( () otherlv_1= 'BTSTranslations' otherlv_2= '{' (otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2172:2: () otherlv_1= 'BTSTranslations' otherlv_2= '{' (otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2172:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2173:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSTranslationsAccess().getBTSTranslationsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBTSTranslations4183); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSTranslationsAccess().getBTSTranslationsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTranslations4195); 

                	newLeafNode(otherlv_2, grammarAccess.getBTSTranslationsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2186:1: (otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==44) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2186:3: otherlv_3= 'translations' otherlv_4= '{' ( (lv_translations_5_0= ruleBTSTranslation ) ) (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBTSTranslations4208); 

                        	newLeafNode(otherlv_3, grammarAccess.getBTSTranslationsAccess().getTranslationsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTranslations4220); 

                        	newLeafNode(otherlv_4, grammarAccess.getBTSTranslationsAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2194:1: ( (lv_translations_5_0= ruleBTSTranslation ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2195:1: (lv_translations_5_0= ruleBTSTranslation )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2195:1: (lv_translations_5_0= ruleBTSTranslation )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2196:3: lv_translations_5_0= ruleBTSTranslation
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSTranslationsAccess().getTranslationsBTSTranslationParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBTSTranslation_in_ruleBTSTranslations4241);
                    lv_translations_5_0=ruleBTSTranslation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSTranslationsRule());
                    	        }
                           		add(
                           			current, 
                           			"translations",
                            		lv_translations_5_0, 
                            		"BTSTranslation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2212:2: (otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==14) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2212:4: otherlv_6= ',' ( (lv_translations_7_0= ruleBTSTranslation ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBTSTranslations4254); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBTSTranslationsAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2216:1: ( (lv_translations_7_0= ruleBTSTranslation ) )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2217:1: (lv_translations_7_0= ruleBTSTranslation )
                    	    {
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2217:1: (lv_translations_7_0= ruleBTSTranslation )
                    	    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2218:3: lv_translations_7_0= ruleBTSTranslation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBTSTranslationsAccess().getTranslationsBTSTranslationParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBTSTranslation_in_ruleBTSTranslations4275);
                    	    lv_translations_7_0=ruleBTSTranslation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBTSTranslationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"translations",
                    	            		lv_translations_7_0, 
                    	            		"BTSTranslation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSTranslations4289); 

                        	newLeafNode(otherlv_8, grammarAccess.getBTSTranslationsAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSTranslations4303); 

                	newLeafNode(otherlv_9, grammarAccess.getBTSTranslationsAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSTranslations"


    // $ANTLR start "entryRuleBTSTranslation"
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2250:1: entryRuleBTSTranslation returns [EObject current=null] : iv_ruleBTSTranslation= ruleBTSTranslation EOF ;
    public final EObject entryRuleBTSTranslation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSTranslation = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2251:2: (iv_ruleBTSTranslation= ruleBTSTranslation EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2252:2: iv_ruleBTSTranslation= ruleBTSTranslation EOF
            {
             newCompositeNode(grammarAccess.getBTSTranslationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTranslation_in_entryRuleBTSTranslation4339);
            iv_ruleBTSTranslation=ruleBTSTranslation();

            state._fsp--;

             current =iv_ruleBTSTranslation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTranslation4349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSTranslation"


    // $ANTLR start "ruleBTSTranslation"
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2259:1: ruleBTSTranslation returns [EObject current=null] : ( () otherlv_1= 'BTSTranslation' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleBTSTranslation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_lang_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2262:28: ( ( () otherlv_1= 'BTSTranslation' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2263:1: ( () otherlv_1= 'BTSTranslation' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2263:1: ( () otherlv_1= 'BTSTranslation' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2263:2: () otherlv_1= 'BTSTranslation' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2263:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2264:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSTranslationAccess().getBTSTranslationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBTSTranslation4395); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSTranslationAccess().getBTSTranslationKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSTranslation4407); 

                	newLeafNode(otherlv_2, grammarAccess.getBTSTranslationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2277:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==35) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2277:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBTSTranslation4420); 

                        	newLeafNode(otherlv_3, grammarAccess.getBTSTranslationAccess().getValueKeyword_3_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2281:1: ( (lv_value_4_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2282:1: (lv_value_4_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2282:1: (lv_value_4_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2283:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSTranslationAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSTranslation4441);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSTranslationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2299:4: (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==21) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2299:6: otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBTSTranslation4456); 

                        	newLeafNode(otherlv_5, grammarAccess.getBTSTranslationAccess().getTypeKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2303:1: ( (lv_type_6_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2304:1: (lv_type_6_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2304:1: (lv_type_6_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2305:3: lv_type_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSTranslationAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSTranslation4477);
                    lv_type_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSTranslationRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2321:4: (otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==46) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2321:6: otherlv_7= 'lang' ( (lv_lang_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBTSTranslation4492); 

                        	newLeafNode(otherlv_7, grammarAccess.getBTSTranslationAccess().getLangKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2325:1: ( (lv_lang_8_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2326:1: (lv_lang_8_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2326:1: (lv_lang_8_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2327:3: lv_lang_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSTranslationAccess().getLangEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSTranslation4513);
                    lv_lang_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSTranslationRule());
                    	        }
                           		set(
                           			current, 
                           			"lang",
                            		lv_lang_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSTranslation4527); 

                	newLeafNode(otherlv_9, grammarAccess.getBTSTranslationAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSTranslation"


    // $ANTLR start "entryRuleBTSGraphic"
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2355:1: entryRuleBTSGraphic returns [EObject current=null] : iv_ruleBTSGraphic= ruleBTSGraphic EOF ;
    public final EObject entryRuleBTSGraphic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBTSGraphic = null;


        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2356:2: (iv_ruleBTSGraphic= ruleBTSGraphic EOF )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2357:2: iv_ruleBTSGraphic= ruleBTSGraphic EOF
            {
             newCompositeNode(grammarAccess.getBTSGraphicRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSGraphic_in_entryRuleBTSGraphic4563);
            iv_ruleBTSGraphic=ruleBTSGraphic();

            state._fsp--;

             current =iv_ruleBTSGraphic; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSGraphic4573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBTSGraphic"


    // $ANTLR start "ruleBTSGraphic"
    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2364:1: ruleBTSGraphic returns [EObject current=null] : ( () otherlv_1= 'BTSGraphic' otherlv_2= '{' (otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) ) )? (otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) ) )? (otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) ) )? (otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleBTSGraphic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv__id_4_0 = null;

        AntlrDatatypeRuleToken lv_innerSentenceOrder_6_0 = null;

        AntlrDatatypeRuleToken lv_code_8_0 = null;

        AntlrDatatypeRuleToken lv_reference_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2367:28: ( ( () otherlv_1= 'BTSGraphic' otherlv_2= '{' (otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) ) )? (otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) ) )? (otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) ) )? (otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2368:1: ( () otherlv_1= 'BTSGraphic' otherlv_2= '{' (otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) ) )? (otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) ) )? (otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) ) )? (otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2368:1: ( () otherlv_1= 'BTSGraphic' otherlv_2= '{' (otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) ) )? (otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) ) )? (otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) ) )? (otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2368:2: () otherlv_1= 'BTSGraphic' otherlv_2= '{' (otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) ) )? (otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) ) )? (otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) ) )? (otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2368:2: ()
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2369:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBTSGraphicAccess().getBTSGraphicAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleBTSGraphic4619); 

                	newLeafNode(otherlv_1, grammarAccess.getBTSGraphicAccess().getBTSGraphicKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBTSGraphic4631); 

                	newLeafNode(otherlv_2, grammarAccess.getBTSGraphicAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2382:1: (otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==24) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2382:3: otherlv_3= '_id' ( (lv__id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBTSGraphic4644); 

                        	newLeafNode(otherlv_3, grammarAccess.getBTSGraphicAccess().get_idKeyword_3_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2386:1: ( (lv__id_4_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2387:1: (lv__id_4_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2387:1: (lv__id_4_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2388:3: lv__id_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSGraphicAccess().get_idEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSGraphic4665);
                    lv__id_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSGraphicRule());
                    	        }
                           		set(
                           			current, 
                           			"_id",
                            		lv__id_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2404:4: (otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==48) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2404:6: otherlv_5= 'innerSentenceOrder' ( (lv_innerSentenceOrder_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBTSGraphic4680); 

                        	newLeafNode(otherlv_5, grammarAccess.getBTSGraphicAccess().getInnerSentenceOrderKeyword_4_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2408:1: ( (lv_innerSentenceOrder_6_0= ruleEInt ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2409:1: (lv_innerSentenceOrder_6_0= ruleEInt )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2409:1: (lv_innerSentenceOrder_6_0= ruleEInt )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2410:3: lv_innerSentenceOrder_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSGraphicAccess().getInnerSentenceOrderEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBTSGraphic4701);
                    lv_innerSentenceOrder_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSGraphicRule());
                    	        }
                           		set(
                           			current, 
                           			"innerSentenceOrder",
                            		lv_innerSentenceOrder_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2426:4: (otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==23) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2426:6: otherlv_7= 'code' ( (lv_code_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBTSGraphic4716); 

                        	newLeafNode(otherlv_7, grammarAccess.getBTSGraphicAccess().getCodeKeyword_5_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2430:1: ( (lv_code_8_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2431:1: (lv_code_8_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2431:1: (lv_code_8_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2432:3: lv_code_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSGraphicAccess().getCodeEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSGraphic4737);
                    lv_code_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSGraphicRule());
                    	        }
                           		set(
                           			current, 
                           			"code",
                            		lv_code_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2448:4: (otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2448:6: otherlv_9= 'reference' ( (lv_reference_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBTSGraphic4752); 

                        	newLeafNode(otherlv_9, grammarAccess.getBTSGraphicAccess().getReferenceKeyword_6_0());
                        
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2452:1: ( (lv_reference_10_0= ruleEString ) )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2453:1: (lv_reference_10_0= ruleEString )
                    {
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2453:1: (lv_reference_10_0= ruleEString )
                    // ../org.bbaw.bts.corpus.text.btsdsl/src-gen/org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.g:2454:3: lv_reference_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBTSGraphicAccess().getReferenceEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBTSGraphic4773);
                    lv_reference_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBTSGraphicRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBTSGraphic4787); 

                	newLeafNode(otherlv_11, grammarAccess.getBTSGraphicAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBTSGraphic"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBTSTextContent_in_entryRuleBTSTextContent75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTextContent85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleBTSTextContent131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSTextContent143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleBTSTextContent156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSTextContent168 = new BitSet(new long[]{0x0000006000010000L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBTSTextContent202 = new BitSet(new long[]{0x0000006000010000L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_ruleBTSTextContent223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBTSTextContent237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSTextContent251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_entryRuleBTSSentenceItem287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSSentenceItem297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_ruleBTSSentenceItem344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_ruleBTSSentenceItem371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_ruleBTSSentenceItem398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_entryRuleBTSAmbivalenceItem433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSAmbivalenceItem443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_ruleBTSAmbivalenceItem490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_ruleBTSAmbivalenceItem517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_entryRuleBTSTextItems552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTextItems562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSenctence_in_ruleBTSTextItems609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_ruleBTSTextItems636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_ruleBTSTextItems663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSenctence_in_entryRuleBTSSenctence821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSSenctence831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleBTSSenctence877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence898 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSSenctence910 = new BitSet(new long[]{0x000000001FFE8000L});
        public static final BitSet FOLLOW_17_in_ruleBTSSenctence923 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence944 = new BitSet(new long[]{0x000000001FFC8000L});
        public static final BitSet FOLLOW_18_in_ruleBTSSenctence959 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence980 = new BitSet(new long[]{0x000000001FF88000L});
        public static final BitSet FOLLOW_19_in_ruleBTSSenctence995 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1016 = new BitSet(new long[]{0x000000001FF08000L});
        public static final BitSet FOLLOW_20_in_ruleBTSSenctence1031 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSSenctence1052 = new BitSet(new long[]{0x000000001FE08000L});
        public static final BitSet FOLLOW_21_in_ruleBTSSenctence1067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1088 = new BitSet(new long[]{0x000000001FC08000L});
        public static final BitSet FOLLOW_22_in_ruleBTSSenctence1103 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1124 = new BitSet(new long[]{0x000000001F808000L});
        public static final BitSet FOLLOW_23_in_ruleBTSSenctence1139 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1160 = new BitSet(new long[]{0x000000001F008000L});
        public static final BitSet FOLLOW_24_in_ruleBTSSenctence1175 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1196 = new BitSet(new long[]{0x000000001E008000L});
        public static final BitSet FOLLOW_25_in_ruleBTSSenctence1211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1232 = new BitSet(new long[]{0x000000001C008000L});
        public static final BitSet FOLLOW_26_in_ruleBTSSenctence1247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSSenctence1268 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_27_in_ruleBTSSenctence1283 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSSenctence1295 = new BitSet(new long[]{0x0000006020010000L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence1316 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBTSSenctence1329 = new BitSet(new long[]{0x0000006020010000L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_ruleBTSSenctence1350 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBTSSenctence1364 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleBTSSenctence1379 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleBTSTranslations_in_ruleBTSSenctence1400 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSSenctence1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_entryRuleBTSWord1450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSWord1460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBTSWord1506 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1527 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSWord1539 = new BitSet(new long[]{0x0000001FD7FE8000L});
        public static final BitSet FOLLOW_17_in_ruleBTSWord1552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1573 = new BitSet(new long[]{0x0000001FD7FC8000L});
        public static final BitSet FOLLOW_18_in_ruleBTSWord1588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1609 = new BitSet(new long[]{0x0000001FD7F88000L});
        public static final BitSet FOLLOW_19_in_ruleBTSWord1624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1645 = new BitSet(new long[]{0x0000001FD7F08000L});
        public static final BitSet FOLLOW_20_in_ruleBTSWord1660 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSWord1681 = new BitSet(new long[]{0x0000001FD7E08000L});
        public static final BitSet FOLLOW_21_in_ruleBTSWord1696 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1717 = new BitSet(new long[]{0x0000001FD7C08000L});
        public static final BitSet FOLLOW_22_in_ruleBTSWord1732 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1753 = new BitSet(new long[]{0x0000001FD7808000L});
        public static final BitSet FOLLOW_23_in_ruleBTSWord1768 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1789 = new BitSet(new long[]{0x0000001FD7008000L});
        public static final BitSet FOLLOW_24_in_ruleBTSWord1804 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1825 = new BitSet(new long[]{0x0000001FD6008000L});
        public static final BitSet FOLLOW_25_in_ruleBTSWord1840 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1861 = new BitSet(new long[]{0x0000001FD4008000L});
        public static final BitSet FOLLOW_26_in_ruleBTSWord1876 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1897 = new BitSet(new long[]{0x0000001FD0008000L});
        public static final BitSet FOLLOW_30_in_ruleBTSWord1912 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1933 = new BitSet(new long[]{0x0000001F90008000L});
        public static final BitSet FOLLOW_31_in_ruleBTSWord1948 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord1969 = new BitSet(new long[]{0x0000001F10008000L});
        public static final BitSet FOLLOW_32_in_ruleBTSWord1984 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord2005 = new BitSet(new long[]{0x0000001E10008000L});
        public static final BitSet FOLLOW_33_in_ruleBTSWord2020 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord2041 = new BitSet(new long[]{0x0000001C10008000L});
        public static final BitSet FOLLOW_34_in_ruleBTSWord2056 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord2077 = new BitSet(new long[]{0x0000001810008000L});
        public static final BitSet FOLLOW_35_in_ruleBTSWord2092 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSWord2113 = new BitSet(new long[]{0x0000001010008000L});
        public static final BitSet FOLLOW_28_in_ruleBTSWord2128 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleBTSTranslations_in_ruleBTSWord2149 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleBTSWord2164 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSWord2176 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleBTSGraphic_in_ruleBTSWord2197 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBTSWord2210 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleBTSGraphic_in_ruleBTSWord2231 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBTSWord2245 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSWord2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_entryRuleBTSMarker2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSMarker2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleBTSMarker2351 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2372 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSMarker2384 = new BitSet(new long[]{0x0000000807FE8000L});
        public static final BitSet FOLLOW_17_in_ruleBTSMarker2397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2418 = new BitSet(new long[]{0x0000000807FC8000L});
        public static final BitSet FOLLOW_18_in_ruleBTSMarker2433 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2454 = new BitSet(new long[]{0x0000000807F88000L});
        public static final BitSet FOLLOW_19_in_ruleBTSMarker2469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2490 = new BitSet(new long[]{0x0000000807F08000L});
        public static final BitSet FOLLOW_20_in_ruleBTSMarker2505 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSMarker2526 = new BitSet(new long[]{0x0000000807E08000L});
        public static final BitSet FOLLOW_21_in_ruleBTSMarker2541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2562 = new BitSet(new long[]{0x0000000807C08000L});
        public static final BitSet FOLLOW_22_in_ruleBTSMarker2577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2598 = new BitSet(new long[]{0x0000000807808000L});
        public static final BitSet FOLLOW_23_in_ruleBTSMarker2613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2634 = new BitSet(new long[]{0x0000000807008000L});
        public static final BitSet FOLLOW_24_in_ruleBTSMarker2649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2670 = new BitSet(new long[]{0x0000000806008000L});
        public static final BitSet FOLLOW_25_in_ruleBTSMarker2685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2706 = new BitSet(new long[]{0x0000000804008000L});
        public static final BitSet FOLLOW_26_in_ruleBTSMarker2721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2742 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_35_in_ruleBTSMarker2757 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSMarker2778 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSMarker2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_entryRuleBTSAmbivalence2828 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSAmbivalence2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleBTSAmbivalence2884 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence2905 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSAmbivalence2917 = new BitSet(new long[]{0x0000008007FE8000L});
        public static final BitSet FOLLOW_17_in_ruleBTSAmbivalence2930 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence2951 = new BitSet(new long[]{0x0000008007FC8000L});
        public static final BitSet FOLLOW_18_in_ruleBTSAmbivalence2966 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence2987 = new BitSet(new long[]{0x0000008007F88000L});
        public static final BitSet FOLLOW_19_in_ruleBTSAmbivalence3002 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3023 = new BitSet(new long[]{0x0000008007F08000L});
        public static final BitSet FOLLOW_20_in_ruleBTSAmbivalence3038 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSAmbivalence3059 = new BitSet(new long[]{0x0000008007E08000L});
        public static final BitSet FOLLOW_21_in_ruleBTSAmbivalence3074 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3095 = new BitSet(new long[]{0x0000008007C08000L});
        public static final BitSet FOLLOW_22_in_ruleBTSAmbivalence3110 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3131 = new BitSet(new long[]{0x0000008007808000L});
        public static final BitSet FOLLOW_23_in_ruleBTSAmbivalence3146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3167 = new BitSet(new long[]{0x0000008007008000L});
        public static final BitSet FOLLOW_24_in_ruleBTSAmbivalence3182 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3203 = new BitSet(new long[]{0x0000008006008000L});
        public static final BitSet FOLLOW_25_in_ruleBTSAmbivalence3218 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3239 = new BitSet(new long[]{0x0000008004008000L});
        public static final BitSet FOLLOW_26_in_ruleBTSAmbivalence3254 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSAmbivalence3275 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleBTSAmbivalence3290 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSAmbivalence3302 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence3323 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBTSAmbivalence3336 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_ruleBTSAmbivalence3357 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBTSAmbivalence3371 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSAmbivalence3385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_entryRuleBTSLemmaCase3421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSLemmaCase3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleBTSLemmaCase3477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3498 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSLemmaCase3510 = new BitSet(new long[]{0x0000020007FE8000L});
        public static final BitSet FOLLOW_17_in_ruleBTSLemmaCase3523 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3544 = new BitSet(new long[]{0x0000020007FC8000L});
        public static final BitSet FOLLOW_18_in_ruleBTSLemmaCase3559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3580 = new BitSet(new long[]{0x0000020007F88000L});
        public static final BitSet FOLLOW_19_in_ruleBTSLemmaCase3595 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3616 = new BitSet(new long[]{0x0000020007F08000L});
        public static final BitSet FOLLOW_20_in_ruleBTSLemmaCase3631 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSLemmaCase3652 = new BitSet(new long[]{0x0000020007E08000L});
        public static final BitSet FOLLOW_21_in_ruleBTSLemmaCase3667 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3688 = new BitSet(new long[]{0x0000020007C08000L});
        public static final BitSet FOLLOW_22_in_ruleBTSLemmaCase3703 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3724 = new BitSet(new long[]{0x0000020007808000L});
        public static final BitSet FOLLOW_23_in_ruleBTSLemmaCase3739 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3760 = new BitSet(new long[]{0x0000020007008000L});
        public static final BitSet FOLLOW_24_in_ruleBTSLemmaCase3775 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3796 = new BitSet(new long[]{0x0000020006008000L});
        public static final BitSet FOLLOW_25_in_ruleBTSLemmaCase3811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3832 = new BitSet(new long[]{0x0000020004008000L});
        public static final BitSet FOLLOW_26_in_ruleBTSLemmaCase3847 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSLemmaCase3868 = new BitSet(new long[]{0x0000020000008000L});
        public static final BitSet FOLLOW_41_in_ruleBTSLemmaCase3883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSLemmaCase3895 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase3916 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBTSLemmaCase3929 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_ruleBTSLemmaCase3950 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBTSLemmaCase3964 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSLemmaCase3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt4065 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTranslations_in_entryRuleBTSTranslations4127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTranslations4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBTSTranslations4183 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSTranslations4195 = new BitSet(new long[]{0x0000100000008000L});
        public static final BitSet FOLLOW_44_in_ruleBTSTranslations4208 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSTranslations4220 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleBTSTranslation_in_ruleBTSTranslations4241 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBTSTranslations4254 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleBTSTranslation_in_ruleBTSTranslations4275 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBTSTranslations4289 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSTranslations4303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTranslation_in_entryRuleBTSTranslation4339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTranslation4349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleBTSTranslation4395 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSTranslation4407 = new BitSet(new long[]{0x0000400800208000L});
        public static final BitSet FOLLOW_35_in_ruleBTSTranslation4420 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSTranslation4441 = new BitSet(new long[]{0x0000400000208000L});
        public static final BitSet FOLLOW_21_in_ruleBTSTranslation4456 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSTranslation4477 = new BitSet(new long[]{0x0000400000008000L});
        public static final BitSet FOLLOW_46_in_ruleBTSTranslation4492 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSTranslation4513 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSTranslation4527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSGraphic_in_entryRuleBTSGraphic4563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSGraphic4573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleBTSGraphic4619 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBTSGraphic4631 = new BitSet(new long[]{0x0003000001808000L});
        public static final BitSet FOLLOW_24_in_ruleBTSGraphic4644 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSGraphic4665 = new BitSet(new long[]{0x0003000000808000L});
        public static final BitSet FOLLOW_48_in_ruleBTSGraphic4680 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBTSGraphic4701 = new BitSet(new long[]{0x0002000000808000L});
        public static final BitSet FOLLOW_23_in_ruleBTSGraphic4716 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSGraphic4737 = new BitSet(new long[]{0x0002000000008000L});
        public static final BitSet FOLLOW_49_in_ruleBTSGraphic4752 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBTSGraphic4773 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBTSGraphic4787 = new BitSet(new long[]{0x0000000000000002L});
    }


}