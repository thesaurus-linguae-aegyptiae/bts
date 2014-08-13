package org.bbaw.bts.corpus.text.egy.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.bbaw.bts.corpus.text.egy.services.EgyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEgyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_EGYSTRING", "RULE_DUALSTRING", "RULE_PLURALSTRING", "RULE_SUFFIXSTRING", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "' '", "'\\u00A7'", "'%'", "'; '", "'case '", "': '", "'\\uDB80\\uDC81'", "'\\uDB80\\uDC80'", "'\\uDB80\\uDC82'", "'#'", "'-'", "'='", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'~'", "'('", "')'", "'<'", "'>'", "'\\u2E2E'", "'?'", "'['", "']'", "'{'", "'}'", "'<<'", "'>>'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "'--'"
    };
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_PLURALSTRING=7;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_SUFFIXSTRING=8;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_DUALSTRING=6;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_INT=11;
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
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=12;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_EGYSTRING=5;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEgyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEgyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEgyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g"; }


     
     	private EgyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EgyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTextContent"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:60:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:61:1: ( ruleTextContent EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:62:1: ruleTextContent EOF
            {
             before(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_ruleTextContent_in_entryRuleTextContent61);
            ruleTextContent();

            state._fsp--;

             after(grammarAccess.getTextContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextContent68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextContent"


    // $ANTLR start "ruleTextContent"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:69:1: ruleTextContent : ( ( rule__TextContent__Group__0 ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:73:2: ( ( ( rule__TextContent__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:74:1: ( ( rule__TextContent__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:74:1: ( ( rule__TextContent__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:75:1: ( rule__TextContent__Group__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:76:1: ( rule__TextContent__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:76:2: rule__TextContent__Group__0
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0_in_ruleTextContent94);
            rule__TextContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextContent"


    // $ANTLR start "entryRuleTextItem"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:88:1: entryRuleTextItem : ruleTextItem EOF ;
    public final void entryRuleTextItem() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:89:1: ( ruleTextItem EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:90:1: ruleTextItem EOF
            {
             before(grammarAccess.getTextItemRule()); 
            pushFollow(FOLLOW_ruleTextItem_in_entryRuleTextItem121);
            ruleTextItem();

            state._fsp--;

             after(grammarAccess.getTextItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextItem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextItem"


    // $ANTLR start "ruleTextItem"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:97:1: ruleTextItem : ( ruleSentence ) ;
    public final void ruleTextItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:101:2: ( ( ruleSentence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:102:1: ( ruleSentence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:102:1: ( ruleSentence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:103:1: ruleSentence
            {
             before(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
            pushFollow(FOLLOW_ruleSentence_in_ruleTextItem154);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextItem"


    // $ANTLR start "entryRuleSentence"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:116:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:117:1: ( ruleSentence EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:118:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence180);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:125:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:129:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:130:1: ( ( rule__Sentence__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:130:1: ( ( rule__Sentence__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:131:1: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:132:1: ( rule__Sentence__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:132:2: rule__Sentence__Group__0
            {
            pushFollow(FOLLOW_rule__Sentence__Group__0_in_ruleSentence213);
            rule__Sentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleSentenceItem"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:144:1: entryRuleSentenceItem : ruleSentenceItem EOF ;
    public final void entryRuleSentenceItem() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:145:1: ( ruleSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:146:1: ruleSentenceItem EOF
            {
             before(grammarAccess.getSentenceItemRule()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem240);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItem247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentenceItem"


    // $ANTLR start "ruleSentenceItem"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:153:1: ruleSentenceItem : ( ( rule__SentenceItem__Alternatives ) ) ;
    public final void ruleSentenceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:157:2: ( ( ( rule__SentenceItem__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:158:1: ( ( rule__SentenceItem__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:158:1: ( ( rule__SentenceItem__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:159:1: ( rule__SentenceItem__Alternatives )
            {
             before(grammarAccess.getSentenceItemAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:160:1: ( rule__SentenceItem__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:160:2: rule__SentenceItem__Alternatives
            {
            pushFollow(FOLLOW_rule__SentenceItem__Alternatives_in_ruleSentenceItem273);
            rule__SentenceItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenceItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentenceItem"


    // $ANTLR start "entryRuleAbstractMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:172:1: entryRuleAbstractMarker : ruleAbstractMarker EOF ;
    public final void entryRuleAbstractMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:173:1: ( ruleAbstractMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:174:1: ruleAbstractMarker EOF
            {
             before(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker300);
            ruleAbstractMarker();

            state._fsp--;

             after(grammarAccess.getAbstractMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractMarker307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractMarker"


    // $ANTLR start "ruleAbstractMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:181:1: ruleAbstractMarker : ( ( rule__AbstractMarker__Alternatives ) ) ;
    public final void ruleAbstractMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:185:2: ( ( ( rule__AbstractMarker__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:186:1: ( ( rule__AbstractMarker__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:186:1: ( ( rule__AbstractMarker__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:187:1: ( rule__AbstractMarker__Alternatives )
            {
             before(grammarAccess.getAbstractMarkerAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:188:1: ( rule__AbstractMarker__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:188:2: rule__AbstractMarker__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractMarker__Alternatives_in_ruleAbstractMarker333);
            rule__AbstractMarker__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractMarkerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractMarker"


    // $ANTLR start "entryRuleAmbivalence"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:200:1: entryRuleAmbivalence : ruleAmbivalence EOF ;
    public final void entryRuleAmbivalence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:201:1: ( ruleAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:202:1: ruleAmbivalence EOF
            {
             before(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence360);
            ruleAmbivalence();

            state._fsp--;

             after(grammarAccess.getAmbivalenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAmbivalence367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmbivalence"


    // $ANTLR start "ruleAmbivalence"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:209:1: ruleAmbivalence : ( ( rule__Ambivalence__Group__0 ) ) ;
    public final void ruleAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:213:2: ( ( ( rule__Ambivalence__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:214:1: ( ( rule__Ambivalence__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:214:1: ( ( rule__Ambivalence__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:215:1: ( rule__Ambivalence__Group__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:216:1: ( rule__Ambivalence__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:216:2: rule__Ambivalence__Group__0
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__0_in_ruleAmbivalence393);
            rule__Ambivalence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmbivalence"


    // $ANTLR start "entryRuleCase"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:228:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:229:1: ( ruleCase EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:230:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase420);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:237:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:241:2: ( ( ( rule__Case__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:242:1: ( ( rule__Case__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:242:1: ( ( rule__Case__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:243:1: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:244:1: ( rule__Case__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:244:2: rule__Case__Group__0
            {
            pushFollow(FOLLOW_rule__Case__Group__0_in_ruleCase453);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleSentenceItemNoAmbivalence"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:256:1: entryRuleSentenceItemNoAmbivalence : ruleSentenceItemNoAmbivalence EOF ;
    public final void entryRuleSentenceItemNoAmbivalence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:257:1: ( ruleSentenceItemNoAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:258:1: ruleSentenceItemNoAmbivalence EOF
            {
             before(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence480);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentenceItemNoAmbivalence"


    // $ANTLR start "ruleSentenceItemNoAmbivalence"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:265:1: ruleSentenceItemNoAmbivalence : ( ( rule__SentenceItemNoAmbivalence__Alternatives ) ) ;
    public final void ruleSentenceItemNoAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:269:2: ( ( ( rule__SentenceItemNoAmbivalence__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:270:1: ( ( rule__SentenceItemNoAmbivalence__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:270:1: ( ( rule__SentenceItemNoAmbivalence__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:271:1: ( rule__SentenceItemNoAmbivalence__Alternatives )
            {
             before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:272:1: ( rule__SentenceItemNoAmbivalence__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:272:2: rule__SentenceItemNoAmbivalence__Alternatives
            {
            pushFollow(FOLLOW_rule__SentenceItemNoAmbivalence__Alternatives_in_ruleSentenceItemNoAmbivalence513);
            rule__SentenceItemNoAmbivalence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentenceItemNoAmbivalence"


    // $ANTLR start "entryRuleVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:284:1: entryRuleVersMarker : ruleVersMarker EOF ;
    public final void entryRuleVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:285:1: ( ruleVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:286:1: ruleVersMarker EOF
            {
             before(grammarAccess.getVersMarkerRule()); 
            pushFollow(FOLLOW_ruleVersMarker_in_entryRuleVersMarker540);
            ruleVersMarker();

            state._fsp--;

             after(grammarAccess.getVersMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersMarker547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersMarker"


    // $ANTLR start "ruleVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:293:1: ruleVersMarker : ( ( rule__VersMarker__Alternatives ) ) ;
    public final void ruleVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:297:2: ( ( ( rule__VersMarker__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:298:1: ( ( rule__VersMarker__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:298:1: ( ( rule__VersMarker__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:299:1: ( rule__VersMarker__Alternatives )
            {
             before(grammarAccess.getVersMarkerAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:300:1: ( rule__VersMarker__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:300:2: rule__VersMarker__Alternatives
            {
            pushFollow(FOLLOW_rule__VersMarker__Alternatives_in_ruleVersMarker573);
            rule__VersMarker__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVersMarkerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersMarker"


    // $ANTLR start "entryRuleVersFrontierMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:312:1: entryRuleVersFrontierMarker : ruleVersFrontierMarker EOF ;
    public final void entryRuleVersFrontierMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:313:1: ( ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:314:1: ruleVersFrontierMarker EOF
            {
             before(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker600);
            ruleVersFrontierMarker();

            state._fsp--;

             after(grammarAccess.getVersFrontierMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersFrontierMarker607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersFrontierMarker"


    // $ANTLR start "ruleVersFrontierMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:321:1: ruleVersFrontierMarker : ( ( rule__VersFrontierMarker__Group__0 ) ) ;
    public final void ruleVersFrontierMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:325:2: ( ( ( rule__VersFrontierMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:326:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:326:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:327:1: ( rule__VersFrontierMarker__Group__0 )
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:328:1: ( rule__VersFrontierMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:328:2: rule__VersFrontierMarker__Group__0
            {
            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__0_in_ruleVersFrontierMarker633);
            rule__VersFrontierMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersFrontierMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersFrontierMarker"


    // $ANTLR start "entryRuleVersbreakMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:340:1: entryRuleVersbreakMarker : ruleVersbreakMarker EOF ;
    public final void entryRuleVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:341:1: ( ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:342:1: ruleVersbreakMarker EOF
            {
             before(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker660);
            ruleVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getVersbreakMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersbreakMarker667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersbreakMarker"


    // $ANTLR start "ruleVersbreakMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:349:1: ruleVersbreakMarker : ( ( rule__VersbreakMarker__Group__0 ) ) ;
    public final void ruleVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:353:2: ( ( ( rule__VersbreakMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:354:1: ( ( rule__VersbreakMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:354:1: ( ( rule__VersbreakMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:355:1: ( rule__VersbreakMarker__Group__0 )
            {
             before(grammarAccess.getVersbreakMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:356:1: ( rule__VersbreakMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:356:2: rule__VersbreakMarker__Group__0
            {
            pushFollow(FOLLOW_rule__VersbreakMarker__Group__0_in_ruleVersbreakMarker693);
            rule__VersbreakMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersbreakMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersbreakMarker"


    // $ANTLR start "entryRuleBrokenVersbreakMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:368:1: entryRuleBrokenVersbreakMarker : ruleBrokenVersbreakMarker EOF ;
    public final void entryRuleBrokenVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:369:1: ( ruleBrokenVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:370:1: ruleBrokenVersbreakMarker EOF
            {
             before(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker720);
            ruleBrokenVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getBrokenVersbreakMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrokenVersbreakMarker"


    // $ANTLR start "ruleBrokenVersbreakMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:377:1: ruleBrokenVersbreakMarker : ( ( rule__BrokenVersbreakMarker__Group__0 ) ) ;
    public final void ruleBrokenVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:381:2: ( ( ( rule__BrokenVersbreakMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:382:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:382:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:383:1: ( rule__BrokenVersbreakMarker__Group__0 )
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:384:1: ( rule__BrokenVersbreakMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:384:2: rule__BrokenVersbreakMarker__Group__0
            {
            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__0_in_ruleBrokenVersbreakMarker753);
            rule__BrokenVersbreakMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrokenVersbreakMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrokenVersbreakMarker"


    // $ANTLR start "entryRuleMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:396:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:397:1: ( ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:398:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_ruleMarker_in_entryRuleMarker780);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarker787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:405:1: ruleMarker : ( ( rule__Marker__Group__0 ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:409:2: ( ( ( rule__Marker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:410:1: ( ( rule__Marker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:410:1: ( ( rule__Marker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:411:1: ( rule__Marker__Group__0 )
            {
             before(grammarAccess.getMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:412:1: ( rule__Marker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:412:2: rule__Marker__Group__0
            {
            pushFollow(FOLLOW_rule__Marker__Group__0_in_ruleMarker813);
            rule__Marker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleWord"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:424:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:425:1: ( ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:426:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord840);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:433:1: ruleWord : ( ( rule__Word__Group__0 ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:437:2: ( ( ( rule__Word__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:438:1: ( ( rule__Word__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:438:1: ( ( rule__Word__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:439:1: ( rule__Word__Group__0 )
            {
             before(grammarAccess.getWordAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:440:1: ( rule__Word__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:440:2: rule__Word__Group__0
            {
            pushFollow(FOLLOW_rule__Word__Group__0_in_ruleWord873);
            rule__Word__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleWordPart"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:452:1: entryRuleWordPart : ruleWordPart EOF ;
    public final void entryRuleWordPart() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:453:1: ( ruleWordPart EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:454:1: ruleWordPart EOF
            {
             before(grammarAccess.getWordPartRule()); 
            pushFollow(FOLLOW_ruleWordPart_in_entryRuleWordPart900);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordPart907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWordPart"


    // $ANTLR start "ruleWordPart"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:461:1: ruleWordPart : ( ( rule__WordPart__Group__0 ) ) ;
    public final void ruleWordPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:465:2: ( ( ( rule__WordPart__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:466:1: ( ( rule__WordPart__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:466:1: ( ( rule__WordPart__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:467:1: ( rule__WordPart__Group__0 )
            {
             before(grammarAccess.getWordPartAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:468:1: ( rule__WordPart__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:468:2: rule__WordPart__Group__0
            {
            pushFollow(FOLLOW_rule__WordPart__Group__0_in_ruleWordPart933);
            rule__WordPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWordPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWordPart"


    // $ANTLR start "entryRuleWordEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:480:1: entryRuleWordEnding : ruleWordEnding EOF ;
    public final void entryRuleWordEnding() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:481:1: ( ruleWordEnding EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:482:1: ruleWordEnding EOF
            {
             before(grammarAccess.getWordEndingRule()); 
            pushFollow(FOLLOW_ruleWordEnding_in_entryRuleWordEnding960);
            ruleWordEnding();

            state._fsp--;

             after(grammarAccess.getWordEndingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordEnding967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWordEnding"


    // $ANTLR start "ruleWordEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:489:1: ruleWordEnding : ( ( rule__WordEnding__Alternatives ) ) ;
    public final void ruleWordEnding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:493:2: ( ( ( rule__WordEnding__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:494:1: ( ( rule__WordEnding__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:494:1: ( ( rule__WordEnding__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:495:1: ( rule__WordEnding__Alternatives )
            {
             before(grammarAccess.getWordEndingAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:496:1: ( rule__WordEnding__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:496:2: rule__WordEnding__Alternatives
            {
            pushFollow(FOLLOW_rule__WordEnding__Alternatives_in_ruleWordEnding993);
            rule__WordEnding__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWordEndingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWordEnding"


    // $ANTLR start "entryRuleDualEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:508:1: entryRuleDualEnding : ruleDualEnding EOF ;
    public final void entryRuleDualEnding() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:509:1: ( ruleDualEnding EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:510:1: ruleDualEnding EOF
            {
             before(grammarAccess.getDualEndingRule()); 
            pushFollow(FOLLOW_ruleDualEnding_in_entryRuleDualEnding1020);
            ruleDualEnding();

            state._fsp--;

             after(grammarAccess.getDualEndingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDualEnding1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDualEnding"


    // $ANTLR start "ruleDualEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:517:1: ruleDualEnding : ( ( rule__DualEnding__Group__0 ) ) ;
    public final void ruleDualEnding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:521:2: ( ( ( rule__DualEnding__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:522:1: ( ( rule__DualEnding__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:522:1: ( ( rule__DualEnding__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:523:1: ( rule__DualEnding__Group__0 )
            {
             before(grammarAccess.getDualEndingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:524:1: ( rule__DualEnding__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:524:2: rule__DualEnding__Group__0
            {
            pushFollow(FOLLOW_rule__DualEnding__Group__0_in_ruleDualEnding1053);
            rule__DualEnding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDualEndingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDualEnding"


    // $ANTLR start "entryRuleDualChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:536:1: entryRuleDualChars : ruleDualChars EOF ;
    public final void entryRuleDualChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:537:1: ( ruleDualChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:538:1: ruleDualChars EOF
            {
             before(grammarAccess.getDualCharsRule()); 
            pushFollow(FOLLOW_ruleDualChars_in_entryRuleDualChars1080);
            ruleDualChars();

            state._fsp--;

             after(grammarAccess.getDualCharsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDualChars1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDualChars"


    // $ANTLR start "ruleDualChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:545:1: ruleDualChars : ( ( rule__DualChars__NameAssignment ) ) ;
    public final void ruleDualChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:549:2: ( ( ( rule__DualChars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:550:1: ( ( rule__DualChars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:550:1: ( ( rule__DualChars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:551:1: ( rule__DualChars__NameAssignment )
            {
             before(grammarAccess.getDualCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:552:1: ( rule__DualChars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:552:2: rule__DualChars__NameAssignment
            {
            pushFollow(FOLLOW_rule__DualChars__NameAssignment_in_ruleDualChars1113);
            rule__DualChars__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDualCharsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDualChars"


    // $ANTLR start "entryRulePluralChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:564:1: entryRulePluralChars : rulePluralChars EOF ;
    public final void entryRulePluralChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:565:1: ( rulePluralChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:566:1: rulePluralChars EOF
            {
             before(grammarAccess.getPluralCharsRule()); 
            pushFollow(FOLLOW_rulePluralChars_in_entryRulePluralChars1140);
            rulePluralChars();

            state._fsp--;

             after(grammarAccess.getPluralCharsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluralChars1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePluralChars"


    // $ANTLR start "rulePluralChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:573:1: rulePluralChars : ( ( rule__PluralChars__NameAssignment ) ) ;
    public final void rulePluralChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:577:2: ( ( ( rule__PluralChars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:578:1: ( ( rule__PluralChars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:578:1: ( ( rule__PluralChars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:579:1: ( rule__PluralChars__NameAssignment )
            {
             before(grammarAccess.getPluralCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:580:1: ( rule__PluralChars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:580:2: rule__PluralChars__NameAssignment
            {
            pushFollow(FOLLOW_rule__PluralChars__NameAssignment_in_rulePluralChars1173);
            rule__PluralChars__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPluralCharsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePluralChars"


    // $ANTLR start "entryRulePluralEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:592:1: entryRulePluralEnding : rulePluralEnding EOF ;
    public final void entryRulePluralEnding() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:593:1: ( rulePluralEnding EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:594:1: rulePluralEnding EOF
            {
             before(grammarAccess.getPluralEndingRule()); 
            pushFollow(FOLLOW_rulePluralEnding_in_entryRulePluralEnding1200);
            rulePluralEnding();

            state._fsp--;

             after(grammarAccess.getPluralEndingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluralEnding1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePluralEnding"


    // $ANTLR start "rulePluralEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:601:1: rulePluralEnding : ( ( rule__PluralEnding__Group__0 ) ) ;
    public final void rulePluralEnding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:605:2: ( ( ( rule__PluralEnding__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:606:1: ( ( rule__PluralEnding__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:606:1: ( ( rule__PluralEnding__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:607:1: ( rule__PluralEnding__Group__0 )
            {
             before(grammarAccess.getPluralEndingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:608:1: ( rule__PluralEnding__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:608:2: rule__PluralEnding__Group__0
            {
            pushFollow(FOLLOW_rule__PluralEnding__Group__0_in_rulePluralEnding1233);
            rule__PluralEnding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPluralEndingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePluralEnding"


    // $ANTLR start "entryRuleInterfixFlexionEding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:620:1: entryRuleInterfixFlexionEding : ruleInterfixFlexionEding EOF ;
    public final void entryRuleInterfixFlexionEding() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:621:1: ( ruleInterfixFlexionEding EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:622:1: ruleInterfixFlexionEding EOF
            {
             before(grammarAccess.getInterfixFlexionEdingRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexionEding_in_entryRuleInterfixFlexionEding1260);
            ruleInterfixFlexionEding();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionEdingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexionEding1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixFlexionEding"


    // $ANTLR start "ruleInterfixFlexionEding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:629:1: ruleInterfixFlexionEding : ( ( rule__InterfixFlexionEding__Group__0 ) ) ;
    public final void ruleInterfixFlexionEding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:633:2: ( ( ( rule__InterfixFlexionEding__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:634:1: ( ( rule__InterfixFlexionEding__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:634:1: ( ( rule__InterfixFlexionEding__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:635:1: ( rule__InterfixFlexionEding__Group__0 )
            {
             before(grammarAccess.getInterfixFlexionEdingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:636:1: ( rule__InterfixFlexionEding__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:636:2: rule__InterfixFlexionEding__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixFlexionEding__Group__0_in_ruleInterfixFlexionEding1293);
            rule__InterfixFlexionEding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixFlexionEdingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixFlexionEding"


    // $ANTLR start "entryRuleInterfixLexicalEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:648:1: entryRuleInterfixLexicalEnding : ruleInterfixLexicalEnding EOF ;
    public final void entryRuleInterfixLexicalEnding() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:649:1: ( ruleInterfixLexicalEnding EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:650:1: ruleInterfixLexicalEnding EOF
            {
             before(grammarAccess.getInterfixLexicalEndingRule()); 
            pushFollow(FOLLOW_ruleInterfixLexicalEnding_in_entryRuleInterfixLexicalEnding1320);
            ruleInterfixLexicalEnding();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalEndingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexicalEnding1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixLexicalEnding"


    // $ANTLR start "ruleInterfixLexicalEnding"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:657:1: ruleInterfixLexicalEnding : ( ( rule__InterfixLexicalEnding__Group__0 ) ) ;
    public final void ruleInterfixLexicalEnding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:661:2: ( ( ( rule__InterfixLexicalEnding__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:662:1: ( ( rule__InterfixLexicalEnding__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:662:1: ( ( rule__InterfixLexicalEnding__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:663:1: ( rule__InterfixLexicalEnding__Group__0 )
            {
             before(grammarAccess.getInterfixLexicalEndingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:664:1: ( rule__InterfixLexicalEnding__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:664:2: rule__InterfixLexicalEnding__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixLexicalEnding__Group__0_in_ruleInterfixLexicalEnding1353);
            rule__InterfixLexicalEnding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixLexicalEndingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixLexicalEnding"


    // $ANTLR start "entryRuleWordMiddle"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:676:1: entryRuleWordMiddle : ruleWordMiddle EOF ;
    public final void entryRuleWordMiddle() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:677:1: ( ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:678:1: ruleWordMiddle EOF
            {
             before(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle1380);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordMiddleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMiddle1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWordMiddle"


    // $ANTLR start "ruleWordMiddle"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:685:1: ruleWordMiddle : ( ( rule__WordMiddle__Alternatives ) ) ;
    public final void ruleWordMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:689:2: ( ( ( rule__WordMiddle__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:690:1: ( ( rule__WordMiddle__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:690:1: ( ( rule__WordMiddle__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:691:1: ( rule__WordMiddle__Alternatives )
            {
             before(grammarAccess.getWordMiddleAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:692:1: ( rule__WordMiddle__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:692:2: rule__WordMiddle__Alternatives
            {
            pushFollow(FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle1413);
            rule__WordMiddle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWordMiddleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWordMiddle"


    // $ANTLR start "entryRuleChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:704:1: entryRuleChars : ruleChars EOF ;
    public final void entryRuleChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:705:1: ( ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:706:1: ruleChars EOF
            {
             before(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_ruleChars_in_entryRuleChars1440);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getCharsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChars1447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChars"


    // $ANTLR start "ruleChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:713:1: ruleChars : ( ( rule__Chars__NameAssignment ) ) ;
    public final void ruleChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:717:2: ( ( ( rule__Chars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:718:1: ( ( rule__Chars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:718:1: ( ( rule__Chars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:719:1: ( rule__Chars__NameAssignment )
            {
             before(grammarAccess.getCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:720:1: ( rule__Chars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:720:2: rule__Chars__NameAssignment
            {
            pushFollow(FOLLOW_rule__Chars__NameAssignment_in_ruleChars1473);
            rule__Chars__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChars"


    // $ANTLR start "entryRuleSuffixChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:732:1: entryRuleSuffixChars : ruleSuffixChars EOF ;
    public final void entryRuleSuffixChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:733:1: ( ruleSuffixChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:734:1: ruleSuffixChars EOF
            {
             before(grammarAccess.getSuffixCharsRule()); 
            pushFollow(FOLLOW_ruleSuffixChars_in_entryRuleSuffixChars1500);
            ruleSuffixChars();

            state._fsp--;

             after(grammarAccess.getSuffixCharsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuffixChars1507); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuffixChars"


    // $ANTLR start "ruleSuffixChars"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:741:1: ruleSuffixChars : ( ( rule__SuffixChars__NameAssignment ) ) ;
    public final void ruleSuffixChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:745:2: ( ( ( rule__SuffixChars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:746:1: ( ( rule__SuffixChars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:746:1: ( ( rule__SuffixChars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:747:1: ( rule__SuffixChars__NameAssignment )
            {
             before(grammarAccess.getSuffixCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:748:1: ( rule__SuffixChars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:748:2: rule__SuffixChars__NameAssignment
            {
            pushFollow(FOLLOW_rule__SuffixChars__NameAssignment_in_ruleSuffixChars1533);
            rule__SuffixChars__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSuffixCharsAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuffixChars"


    // $ANTLR start "entryRuleInterfix"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:760:1: entryRuleInterfix : ruleInterfix EOF ;
    public final void entryRuleInterfix() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:761:1: ( ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:762:1: ruleInterfix EOF
            {
             before(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_ruleInterfix_in_entryRuleInterfix1560);
            ruleInterfix();

            state._fsp--;

             after(grammarAccess.getInterfixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfix1567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfix"


    // $ANTLR start "ruleInterfix"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:769:1: ruleInterfix : ( ( rule__Interfix__Alternatives ) ) ;
    public final void ruleInterfix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:773:2: ( ( ( rule__Interfix__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:774:1: ( ( rule__Interfix__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:774:1: ( ( rule__Interfix__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:775:1: ( rule__Interfix__Alternatives )
            {
             before(grammarAccess.getInterfixAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:776:1: ( rule__Interfix__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:776:2: rule__Interfix__Alternatives
            {
            pushFollow(FOLLOW_rule__Interfix__Alternatives_in_ruleInterfix1593);
            rule__Interfix__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfixAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfix"


    // $ANTLR start "entryRuleInterfixLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:788:1: entryRuleInterfixLexical : ruleInterfixLexical EOF ;
    public final void entryRuleInterfixLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:789:1: ( ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:790:1: ruleInterfixLexical EOF
            {
             before(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical1620);
            ruleInterfixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexical1627); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixLexical"


    // $ANTLR start "ruleInterfixLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:797:1: ruleInterfixLexical : ( ( rule__InterfixLexical__Group__0 ) ) ;
    public final void ruleInterfixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:801:2: ( ( ( rule__InterfixLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:802:1: ( ( rule__InterfixLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:802:1: ( ( rule__InterfixLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:803:1: ( rule__InterfixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:804:1: ( rule__InterfixLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:804:2: rule__InterfixLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixLexical__Group__0_in_ruleInterfixLexical1653);
            rule__InterfixLexical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixLexicalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixLexical"


    // $ANTLR start "entryRuleInterfixFlexion"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:816:1: entryRuleInterfixFlexion : ruleInterfixFlexion EOF ;
    public final void entryRuleInterfixFlexion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:817:1: ( ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:818:1: ruleInterfixFlexion EOF
            {
             before(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion1680);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexion1687); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixFlexion"


    // $ANTLR start "ruleInterfixFlexion"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:825:1: ruleInterfixFlexion : ( ( rule__InterfixFlexion__Group__0 ) ) ;
    public final void ruleInterfixFlexion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:829:2: ( ( ( rule__InterfixFlexion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:830:1: ( ( rule__InterfixFlexion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:830:1: ( ( rule__InterfixFlexion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:831:1: ( rule__InterfixFlexion__Group__0 )
            {
             before(grammarAccess.getInterfixFlexionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:832:1: ( rule__InterfixFlexion__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:832:2: rule__InterfixFlexion__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixFlexion__Group__0_in_ruleInterfixFlexion1713);
            rule__InterfixFlexion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixFlexionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixFlexion"


    // $ANTLR start "entryRuleInterfixSuffixPronomLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:844:1: entryRuleInterfixSuffixPronomLexical : ruleInterfixSuffixPronomLexical EOF ;
    public final void entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:845:1: ( ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:846:1: ruleInterfixSuffixPronomLexical EOF
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical1740);
            ruleInterfixSuffixPronomLexical();

            state._fsp--;

             after(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical1747); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixSuffixPronomLexical"


    // $ANTLR start "ruleInterfixSuffixPronomLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:853:1: ruleInterfixSuffixPronomLexical : ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) ;
    public final void ruleInterfixSuffixPronomLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:857:2: ( ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:858:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:858:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:859:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:860:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:860:2: rule__InterfixSuffixPronomLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__0_in_ruleInterfixSuffixPronomLexical1773);
            rule__InterfixSuffixPronomLexical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixSuffixPronomLexicalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixSuffixPronomLexical"


    // $ANTLR start "entryRuleInterfixPrefixNonLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:872:1: entryRuleInterfixPrefixNonLexical : ruleInterfixPrefixNonLexical EOF ;
    public final void entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:873:1: ( ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:874:1: ruleInterfixPrefixNonLexical EOF
            {
             before(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical1800);
            ruleInterfixPrefixNonLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical1807); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixPrefixNonLexical"


    // $ANTLR start "ruleInterfixPrefixNonLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:881:1: ruleInterfixPrefixNonLexical : ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixNonLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:885:2: ( ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:886:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:886:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:887:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:888:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:888:2: rule__InterfixPrefixNonLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__0_in_ruleInterfixPrefixNonLexical1833);
            rule__InterfixPrefixNonLexical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixPrefixNonLexicalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixPrefixNonLexical"


    // $ANTLR start "entryRuleInterfixPrefixLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:900:1: entryRuleInterfixPrefixLexical : ruleInterfixPrefixLexical EOF ;
    public final void entryRuleInterfixPrefixLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:901:1: ( ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:902:1: ruleInterfixPrefixLexical EOF
            {
             before(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical1860);
            ruleInterfixPrefixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixLexical1867); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixPrefixLexical"


    // $ANTLR start "ruleInterfixPrefixLexical"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:909:1: ruleInterfixPrefixLexical : ( ( rule__InterfixPrefixLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:913:2: ( ( ( rule__InterfixPrefixLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:914:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:914:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:915:1: ( rule__InterfixPrefixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:916:1: ( rule__InterfixPrefixLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:916:2: rule__InterfixPrefixLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__0_in_ruleInterfixPrefixLexical1893);
            rule__InterfixPrefixLexical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixPrefixLexicalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixPrefixLexical"


    // $ANTLR start "entryRuleInterfixConnectionSyllabicGroup"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:928:1: entryRuleInterfixConnectionSyllabicGroup : ruleInterfixConnectionSyllabicGroup EOF ;
    public final void entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:929:1: ( ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:930:1: ruleInterfixConnectionSyllabicGroup EOF
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup1920);
            ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             after(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup1927); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfixConnectionSyllabicGroup"


    // $ANTLR start "ruleInterfixConnectionSyllabicGroup"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:937:1: ruleInterfixConnectionSyllabicGroup : ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) ;
    public final void ruleInterfixConnectionSyllabicGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:941:2: ( ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:942:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:942:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:943:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:944:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:944:2: rule__InterfixConnectionSyllabicGroup__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0_in_ruleInterfixConnectionSyllabicGroup1953);
            rule__InterfixConnectionSyllabicGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixConnectionSyllabicGroup"


    // $ANTLR start "entryRuleBrackets"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:956:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:957:1: ( ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:958:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1980);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1987); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrackets"


    // $ANTLR start "ruleBrackets"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:965:1: ruleBrackets : ( ( rule__Brackets__Alternatives ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:969:2: ( ( ( rule__Brackets__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:970:1: ( ( rule__Brackets__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:970:1: ( ( rule__Brackets__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:971:1: ( rule__Brackets__Alternatives )
            {
             before(grammarAccess.getBracketsAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:972:1: ( rule__Brackets__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:972:2: rule__Brackets__Alternatives
            {
            pushFollow(FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets2013);
            rule__Brackets__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBracketsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrackets"


    // $ANTLR start "entryRuleExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:986:1: entryRuleExpanded : ruleExpanded EOF ;
    public final void entryRuleExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:987:1: ( ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:988:1: ruleExpanded EOF
            {
             before(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_ruleExpanded_in_entryRuleExpanded2042);
            ruleExpanded();

            state._fsp--;

             after(grammarAccess.getExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpanded2049); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpanded"


    // $ANTLR start "ruleExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:995:1: ruleExpanded : ( ( rule__Expanded__Group__0 ) ) ;
    public final void ruleExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:999:2: ( ( ( rule__Expanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1000:1: ( ( rule__Expanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1000:1: ( ( rule__Expanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1001:1: ( rule__Expanded__Group__0 )
            {
             before(grammarAccess.getExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1002:1: ( rule__Expanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1002:2: rule__Expanded__Group__0
            {
            pushFollow(FOLLOW_rule__Expanded__Group__0_in_ruleExpanded2075);
            rule__Expanded__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpandedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpanded"


    // $ANTLR start "entryRuleNoExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1014:1: entryRuleNoExpanded : ruleNoExpanded EOF ;
    public final void entryRuleNoExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1015:1: ( ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1016:1: ruleNoExpanded EOF
            {
             before(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded2102);
            ruleNoExpanded();

            state._fsp--;

             after(grammarAccess.getNoExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpanded2109); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoExpanded"


    // $ANTLR start "ruleNoExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1023:1: ruleNoExpanded : ( ( rule__NoExpanded__Alternatives ) ) ;
    public final void ruleNoExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1027:2: ( ( ( rule__NoExpanded__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1028:1: ( ( rule__NoExpanded__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1028:1: ( ( rule__NoExpanded__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1029:1: ( rule__NoExpanded__Alternatives )
            {
             before(grammarAccess.getNoExpandedAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1030:1: ( rule__NoExpanded__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1030:2: rule__NoExpanded__Alternatives
            {
            pushFollow(FOLLOW_rule__NoExpanded__Alternatives_in_ruleNoExpanded2135);
            rule__NoExpanded__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoExpandedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoExpanded"


    // $ANTLR start "entryRuleEmendation"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1042:1: entryRuleEmendation : ruleEmendation EOF ;
    public final void entryRuleEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1043:1: ( ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1044:1: ruleEmendation EOF
            {
             before(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_ruleEmendation_in_entryRuleEmendation2162);
            ruleEmendation();

            state._fsp--;

             after(grammarAccess.getEmendationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmendation2169); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmendation"


    // $ANTLR start "ruleEmendation"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1051:1: ruleEmendation : ( ( rule__Emendation__Group__0 ) ) ;
    public final void ruleEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1055:2: ( ( ( rule__Emendation__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1056:1: ( ( rule__Emendation__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1056:1: ( ( rule__Emendation__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1057:1: ( rule__Emendation__Group__0 )
            {
             before(grammarAccess.getEmendationAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1058:1: ( rule__Emendation__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1058:2: rule__Emendation__Group__0
            {
            pushFollow(FOLLOW_rule__Emendation__Group__0_in_ruleEmendation2195);
            rule__Emendation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmendationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmendation"


    // $ANTLR start "entryRuleNoEmendation"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1070:1: entryRuleNoEmendation : ruleNoEmendation EOF ;
    public final void entryRuleNoEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1071:1: ( ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1072:1: ruleNoEmendation EOF
            {
             before(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2222);
            ruleNoEmendation();

            state._fsp--;

             after(grammarAccess.getNoEmendationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoEmendation2229); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoEmendation"


    // $ANTLR start "ruleNoEmendation"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1079:1: ruleNoEmendation : ( ( rule__NoEmendation__Alternatives ) ) ;
    public final void ruleNoEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1083:2: ( ( ( rule__NoEmendation__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1084:1: ( ( rule__NoEmendation__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1084:1: ( ( rule__NoEmendation__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1085:1: ( rule__NoEmendation__Alternatives )
            {
             before(grammarAccess.getNoEmendationAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1086:1: ( rule__NoEmendation__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1086:2: rule__NoEmendation__Alternatives
            {
            pushFollow(FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation2255);
            rule__NoEmendation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoEmendationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoEmendation"


    // $ANTLR start "entryRuleDisputableReading"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1098:1: entryRuleDisputableReading : ruleDisputableReading EOF ;
    public final void entryRuleDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1099:1: ( ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1100:1: ruleDisputableReading EOF
            {
             before(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading2282);
            ruleDisputableReading();

            state._fsp--;

             after(grammarAccess.getDisputableReadingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableReading2289); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisputableReading"


    // $ANTLR start "ruleDisputableReading"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1107:1: ruleDisputableReading : ( ( rule__DisputableReading__Group__0 ) ) ;
    public final void ruleDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1111:2: ( ( ( rule__DisputableReading__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1112:1: ( ( rule__DisputableReading__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1112:1: ( ( rule__DisputableReading__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1113:1: ( rule__DisputableReading__Group__0 )
            {
             before(grammarAccess.getDisputableReadingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1114:1: ( rule__DisputableReading__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1114:2: rule__DisputableReading__Group__0
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading2315);
            rule__DisputableReading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisputableReadingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisputableReading"


    // $ANTLR start "entryRuleNoDisputableReading"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1126:1: entryRuleNoDisputableReading : ruleNoDisputableReading EOF ;
    public final void entryRuleNoDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1127:1: ( ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1128:1: ruleNoDisputableReading EOF
            {
             before(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading2342);
            ruleNoDisputableReading();

            state._fsp--;

             after(grammarAccess.getNoDisputableReadingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDisputableReading2349); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoDisputableReading"


    // $ANTLR start "ruleNoDisputableReading"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1135:1: ruleNoDisputableReading : ( ( rule__NoDisputableReading__Alternatives ) ) ;
    public final void ruleNoDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1139:2: ( ( ( rule__NoDisputableReading__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1140:1: ( ( rule__NoDisputableReading__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1140:1: ( ( rule__NoDisputableReading__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1141:1: ( rule__NoDisputableReading__Alternatives )
            {
             before(grammarAccess.getNoDisputableReadingAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1142:1: ( rule__NoDisputableReading__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1142:2: rule__NoDisputableReading__Alternatives
            {
            pushFollow(FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading2375);
            rule__NoDisputableReading__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoDisputableReadingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoDisputableReading"


    // $ANTLR start "entryRuleLacuna"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1154:1: entryRuleLacuna : ruleLacuna EOF ;
    public final void entryRuleLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1155:1: ( ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1156:1: ruleLacuna EOF
            {
             before(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_ruleLacuna_in_entryRuleLacuna2402);
            ruleLacuna();

            state._fsp--;

             after(grammarAccess.getLacunaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLacuna2409); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLacuna"


    // $ANTLR start "ruleLacuna"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1163:1: ruleLacuna : ( ( rule__Lacuna__Group__0 ) ) ;
    public final void ruleLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1167:2: ( ( ( rule__Lacuna__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1168:1: ( ( rule__Lacuna__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1168:1: ( ( rule__Lacuna__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1169:1: ( rule__Lacuna__Group__0 )
            {
             before(grammarAccess.getLacunaAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1170:1: ( rule__Lacuna__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1170:2: rule__Lacuna__Group__0
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna2435);
            rule__Lacuna__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLacunaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLacuna"


    // $ANTLR start "entryRuleNoLacuna"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1182:1: entryRuleNoLacuna : ruleNoLacuna EOF ;
    public final void entryRuleNoLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1183:1: ( ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1184:1: ruleNoLacuna EOF
            {
             before(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna2462);
            ruleNoLacuna();

            state._fsp--;

             after(grammarAccess.getNoLacunaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoLacuna2469); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoLacuna"


    // $ANTLR start "ruleNoLacuna"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1191:1: ruleNoLacuna : ( ( rule__NoLacuna__Alternatives ) ) ;
    public final void ruleNoLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1195:2: ( ( ( rule__NoLacuna__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1196:1: ( ( rule__NoLacuna__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1196:1: ( ( rule__NoLacuna__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1197:1: ( rule__NoLacuna__Alternatives )
            {
             before(grammarAccess.getNoLacunaAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1198:1: ( rule__NoLacuna__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1198:2: rule__NoLacuna__Alternatives
            {
            pushFollow(FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna2495);
            rule__NoLacuna__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoLacunaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoLacuna"


    // $ANTLR start "entryRuleDeletion"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1210:1: entryRuleDeletion : ruleDeletion EOF ;
    public final void entryRuleDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1211:1: ( ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1212:1: ruleDeletion EOF
            {
             before(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_ruleDeletion_in_entryRuleDeletion2522);
            ruleDeletion();

            state._fsp--;

             after(grammarAccess.getDeletionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletion2529); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeletion"


    // $ANTLR start "ruleDeletion"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1219:1: ruleDeletion : ( ( rule__Deletion__Group__0 ) ) ;
    public final void ruleDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1223:2: ( ( ( rule__Deletion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1224:1: ( ( rule__Deletion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1224:1: ( ( rule__Deletion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1225:1: ( rule__Deletion__Group__0 )
            {
             before(grammarAccess.getDeletionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1226:1: ( rule__Deletion__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1226:2: rule__Deletion__Group__0
            {
            pushFollow(FOLLOW_rule__Deletion__Group__0_in_ruleDeletion2555);
            rule__Deletion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeletionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeletion"


    // $ANTLR start "entryRuleNoDeletion"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1238:1: entryRuleNoDeletion : ruleNoDeletion EOF ;
    public final void entryRuleNoDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1239:1: ( ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1240:1: ruleNoDeletion EOF
            {
             before(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion2582);
            ruleNoDeletion();

            state._fsp--;

             after(grammarAccess.getNoDeletionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDeletion2589); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoDeletion"


    // $ANTLR start "ruleNoDeletion"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1247:1: ruleNoDeletion : ( ( rule__NoDeletion__Alternatives ) ) ;
    public final void ruleNoDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1251:2: ( ( ( rule__NoDeletion__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1252:1: ( ( rule__NoDeletion__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1252:1: ( ( rule__NoDeletion__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1253:1: ( rule__NoDeletion__Alternatives )
            {
             before(grammarAccess.getNoDeletionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1254:1: ( rule__NoDeletion__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1254:2: rule__NoDeletion__Alternatives
            {
            pushFollow(FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion2615);
            rule__NoDeletion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoDeletionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoDeletion"


    // $ANTLR start "entryRuleExpandedColumn"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1266:1: entryRuleExpandedColumn : ruleExpandedColumn EOF ;
    public final void entryRuleExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1267:1: ( ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1268:1: ruleExpandedColumn EOF
            {
             before(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn2642);
            ruleExpandedColumn();

            state._fsp--;

             after(grammarAccess.getExpandedColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpandedColumn2649); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpandedColumn"


    // $ANTLR start "ruleExpandedColumn"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1275:1: ruleExpandedColumn : ( ( rule__ExpandedColumn__Group__0 ) ) ;
    public final void ruleExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1279:2: ( ( ( rule__ExpandedColumn__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1280:1: ( ( rule__ExpandedColumn__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1280:1: ( ( rule__ExpandedColumn__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1281:1: ( rule__ExpandedColumn__Group__0 )
            {
             before(grammarAccess.getExpandedColumnAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1282:1: ( rule__ExpandedColumn__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1282:2: rule__ExpandedColumn__Group__0
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn2675);
            rule__ExpandedColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpandedColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpandedColumn"


    // $ANTLR start "entryRuleNoExpandedColumn"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1294:1: entryRuleNoExpandedColumn : ruleNoExpandedColumn EOF ;
    public final void entryRuleNoExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1295:1: ( ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1296:1: ruleNoExpandedColumn EOF
            {
             before(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn2702);
            ruleNoExpandedColumn();

            state._fsp--;

             after(grammarAccess.getNoExpandedColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpandedColumn2709); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoExpandedColumn"


    // $ANTLR start "ruleNoExpandedColumn"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1303:1: ruleNoExpandedColumn : ( ( rule__NoExpandedColumn__Alternatives ) ) ;
    public final void ruleNoExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1307:2: ( ( ( rule__NoExpandedColumn__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1308:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1308:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1309:1: ( rule__NoExpandedColumn__Alternatives )
            {
             before(grammarAccess.getNoExpandedColumnAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1310:1: ( rule__NoExpandedColumn__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1310:2: rule__NoExpandedColumn__Alternatives
            {
            pushFollow(FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn2735);
            rule__NoExpandedColumn__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoExpandedColumnAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoExpandedColumn"


    // $ANTLR start "entryRuleRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1322:1: entryRuleRasur : ruleRasur EOF ;
    public final void entryRuleRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1323:1: ( ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1324:1: ruleRasur EOF
            {
             before(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_ruleRasur_in_entryRuleRasur2762);
            ruleRasur();

            state._fsp--;

             after(grammarAccess.getRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasur2769); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRasur"


    // $ANTLR start "ruleRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1331:1: ruleRasur : ( ( rule__Rasur__Group__0 ) ) ;
    public final void ruleRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1335:2: ( ( ( rule__Rasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1336:1: ( ( rule__Rasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1336:1: ( ( rule__Rasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1337:1: ( rule__Rasur__Group__0 )
            {
             before(grammarAccess.getRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1338:1: ( rule__Rasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1338:2: rule__Rasur__Group__0
            {
            pushFollow(FOLLOW_rule__Rasur__Group__0_in_ruleRasur2795);
            rule__Rasur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRasurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRasur"


    // $ANTLR start "entryRuleNoRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1350:1: entryRuleNoRasur : ruleNoRasur EOF ;
    public final void entryRuleNoRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1351:1: ( ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1352:1: ruleNoRasur EOF
            {
             before(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_ruleNoRasur_in_entryRuleNoRasur2822);
            ruleNoRasur();

            state._fsp--;

             after(grammarAccess.getNoRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRasur2829); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoRasur"


    // $ANTLR start "ruleNoRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1359:1: ruleNoRasur : ( ( rule__NoRasur__Alternatives ) ) ;
    public final void ruleNoRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1363:2: ( ( ( rule__NoRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1364:1: ( ( rule__NoRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1364:1: ( ( rule__NoRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1365:1: ( rule__NoRasur__Alternatives )
            {
             before(grammarAccess.getNoRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1366:1: ( rule__NoRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1366:2: rule__NoRasur__Alternatives
            {
            pushFollow(FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur2855);
            rule__NoRasur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoRasurAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoRasur"


    // $ANTLR start "entryRuleAncientExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1378:1: entryRuleAncientExpanded : ruleAncientExpanded EOF ;
    public final void entryRuleAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1379:1: ( ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1380:1: ruleAncientExpanded EOF
            {
             before(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded2882);
            ruleAncientExpanded();

            state._fsp--;

             after(grammarAccess.getAncientExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpanded2889); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAncientExpanded"


    // $ANTLR start "ruleAncientExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1387:1: ruleAncientExpanded : ( ( rule__AncientExpanded__Group__0 ) ) ;
    public final void ruleAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1391:2: ( ( ( rule__AncientExpanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1392:1: ( ( rule__AncientExpanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1392:1: ( ( rule__AncientExpanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1393:1: ( rule__AncientExpanded__Group__0 )
            {
             before(grammarAccess.getAncientExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1394:1: ( rule__AncientExpanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1394:2: rule__AncientExpanded__Group__0
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2915);
            rule__AncientExpanded__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAncientExpanded"


    // $ANTLR start "entryRuleNoAncientExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1406:1: entryRuleNoAncientExpanded : ruleNoAncientExpanded EOF ;
    public final void entryRuleNoAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1407:1: ( ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1408:1: ruleNoAncientExpanded EOF
            {
             before(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2942);
            ruleNoAncientExpanded();

            state._fsp--;

             after(grammarAccess.getNoAncientExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoAncientExpanded2949); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoAncientExpanded"


    // $ANTLR start "ruleNoAncientExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1415:1: ruleNoAncientExpanded : ( ( rule__NoAncientExpanded__Alternatives ) ) ;
    public final void ruleNoAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1419:2: ( ( ( rule__NoAncientExpanded__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1420:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1420:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1421:1: ( rule__NoAncientExpanded__Alternatives )
            {
             before(grammarAccess.getNoAncientExpandedAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1422:1: ( rule__NoAncientExpanded__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1422:2: rule__NoAncientExpanded__Alternatives
            {
            pushFollow(FOLLOW_rule__NoAncientExpanded__Alternatives_in_ruleNoAncientExpanded2975);
            rule__NoAncientExpanded__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoAncientExpandedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoAncientExpanded"


    // $ANTLR start "entryRuleRestorationOverRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1434:1: entryRuleRestorationOverRasur : ruleRestorationOverRasur EOF ;
    public final void entryRuleRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1435:1: ( ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1436:1: ruleRestorationOverRasur EOF
            {
             before(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur3002);
            ruleRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasur3009); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestorationOverRasur"


    // $ANTLR start "ruleRestorationOverRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1443:1: ruleRestorationOverRasur : ( ( rule__RestorationOverRasur__Group__0 ) ) ;
    public final void ruleRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1447:2: ( ( ( rule__RestorationOverRasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1448:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1448:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1449:1: ( rule__RestorationOverRasur__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1450:1: ( rule__RestorationOverRasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1450:2: rule__RestorationOverRasur__Group__0
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur3035);
            rule__RestorationOverRasur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestorationOverRasur"


    // $ANTLR start "entryRuleNoRestorationOverRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1462:1: entryRuleNoRestorationOverRasur : ruleNoRestorationOverRasur EOF ;
    public final void entryRuleNoRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1463:1: ( ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1464:1: ruleNoRestorationOverRasur EOF
            {
             before(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur3062);
            ruleNoRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getNoRestorationOverRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRestorationOverRasur3069); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoRestorationOverRasur"


    // $ANTLR start "ruleNoRestorationOverRasur"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1471:1: ruleNoRestorationOverRasur : ( ( rule__NoRestorationOverRasur__Alternatives ) ) ;
    public final void ruleNoRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1475:2: ( ( ( rule__NoRestorationOverRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1476:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1476:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1477:1: ( rule__NoRestorationOverRasur__Alternatives )
            {
             before(grammarAccess.getNoRestorationOverRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1478:1: ( rule__NoRestorationOverRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1478:2: rule__NoRestorationOverRasur__Alternatives
            {
            pushFollow(FOLLOW_rule__NoRestorationOverRasur__Alternatives_in_ruleNoRestorationOverRasur3095);
            rule__NoRestorationOverRasur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoRestorationOverRasurAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoRestorationOverRasur"


    // $ANTLR start "entryRulePartialDestruction"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1490:1: entryRulePartialDestruction : rulePartialDestruction EOF ;
    public final void entryRulePartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1491:1: ( rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1492:1: rulePartialDestruction EOF
            {
             before(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction3122);
            rulePartialDestruction();

            state._fsp--;

             after(grammarAccess.getPartialDestructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialDestruction3129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartialDestruction"


    // $ANTLR start "rulePartialDestruction"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1499:1: rulePartialDestruction : ( ( rule__PartialDestruction__Group__0 ) ) ;
    public final void rulePartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1503:2: ( ( ( rule__PartialDestruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1504:1: ( ( rule__PartialDestruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1504:1: ( ( rule__PartialDestruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1505:1: ( rule__PartialDestruction__Group__0 )
            {
             before(grammarAccess.getPartialDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1506:1: ( rule__PartialDestruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1506:2: rule__PartialDestruction__Group__0
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction3155);
            rule__PartialDestruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartialDestruction"


    // $ANTLR start "entryRuleNoPartialDestruction"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1518:1: entryRuleNoPartialDestruction : ruleNoPartialDestruction EOF ;
    public final void entryRuleNoPartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1519:1: ( ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1520:1: ruleNoPartialDestruction EOF
            {
             before(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction3182);
            ruleNoPartialDestruction();

            state._fsp--;

             after(grammarAccess.getNoPartialDestructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoPartialDestruction3189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoPartialDestruction"


    // $ANTLR start "ruleNoPartialDestruction"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1527:1: ruleNoPartialDestruction : ( ( rule__NoPartialDestruction__Alternatives ) ) ;
    public final void ruleNoPartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1531:2: ( ( ( rule__NoPartialDestruction__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1532:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1532:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1533:1: ( rule__NoPartialDestruction__Alternatives )
            {
             before(grammarAccess.getNoPartialDestructionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1534:1: ( rule__NoPartialDestruction__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1534:2: rule__NoPartialDestruction__Alternatives
            {
            pushFollow(FOLLOW_rule__NoPartialDestruction__Alternatives_in_ruleNoPartialDestruction3215);
            rule__NoPartialDestruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoPartialDestructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoPartialDestruction"


    // $ANTLR start "entryRuleDestruction"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1546:1: entryRuleDestruction : ruleDestruction EOF ;
    public final void entryRuleDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1547:1: ( ruleDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1548:1: ruleDestruction EOF
            {
             before(grammarAccess.getDestructionRule()); 
            pushFollow(FOLLOW_ruleDestruction_in_entryRuleDestruction3242);
            ruleDestruction();

            state._fsp--;

             after(grammarAccess.getDestructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestruction3249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestruction"


    // $ANTLR start "ruleDestruction"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1555:1: ruleDestruction : ( ( rule__Destruction__Group__0 ) ) ;
    public final void ruleDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1559:2: ( ( ( rule__Destruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1560:1: ( ( rule__Destruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1560:1: ( ( rule__Destruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1561:1: ( rule__Destruction__Group__0 )
            {
             before(grammarAccess.getDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1562:1: ( rule__Destruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1562:2: rule__Destruction__Group__0
            {
            pushFollow(FOLLOW_rule__Destruction__Group__0_in_ruleDestruction3275);
            rule__Destruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestruction"


    // $ANTLR start "rule__TextContent__Alternatives_1_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1574:1: rule__TextContent__Alternatives_1_1_0 : ( ( ' ' ) | ( RULE_NEWLINE ) );
    public final void rule__TextContent__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1578:1: ( ( ' ' ) | ( RULE_NEWLINE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_NEWLINE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1579:1: ( ' ' )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1579:1: ( ' ' )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1580:1: ' '
                    {
                     before(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__TextContent__Alternatives_1_1_03312); 
                     after(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1587:6: ( RULE_NEWLINE )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1587:6: ( RULE_NEWLINE )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1588:1: RULE_NEWLINE
                    {
                     before(grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__TextContent__Alternatives_1_1_03331); 
                     after(grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Alternatives_1_1_0"


    // $ANTLR start "rule__SentenceItem__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1598:1: rule__SentenceItem__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) );
    public final void rule__SentenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1602:1: ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
            case 27:
            case 34:
            case 36:
            case 38:
            case 40:
            case 42:
            case 44:
            case 46:
            case 48:
            case 50:
            case 52:
            case 54:
                {
                alt2=1;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1603:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1603:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1604:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives3363);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1609:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1609:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1610:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives3380);
                    ruleAbstractMarker();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1615:6: ( ruleAmbivalence )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1615:6: ( ruleAmbivalence )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1616:1: ruleAmbivalence
                    {
                     before(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives3397);
                    ruleAmbivalence();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceItem__Alternatives"


    // $ANTLR start "rule__AbstractMarker__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1626:1: rule__AbstractMarker__Alternatives : ( ( ruleMarker ) | ( ruleVersMarker ) );
    public final void rule__AbstractMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1630:1: ( ( ruleMarker ) | ( ruleVersMarker ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=22 && LA3_0<=24)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1631:1: ( ruleMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1631:1: ( ruleMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1632:1: ruleMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives3429);
                    ruleMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1637:6: ( ruleVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1637:6: ( ruleVersMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1638:1: ruleVersMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives3446);
                    ruleVersMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractMarker__Alternatives"


    // $ANTLR start "rule__SentenceItemNoAmbivalence__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1648:1: rule__SentenceItemNoAmbivalence__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) );
    public final void rule__SentenceItemNoAmbivalence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1652:1: ( ( ruleWord ) | ( ruleAbstractMarker ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EGYSTRING||LA4_0==27||LA4_0==34||LA4_0==36||LA4_0==38||LA4_0==40||LA4_0==42||LA4_0==44||LA4_0==46||LA4_0==48||LA4_0==50||LA4_0==52||LA4_0==54) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=22 && LA4_0<=25)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1653:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1653:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1654:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWord_in_rule__SentenceItemNoAmbivalence__Alternatives3478);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1659:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1659:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1660:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractMarker_in_rule__SentenceItemNoAmbivalence__Alternatives3495);
                    ruleAbstractMarker();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceItemNoAmbivalence__Alternatives"


    // $ANTLR start "rule__VersMarker__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1670:1: rule__VersMarker__Alternatives : ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) );
    public final void rule__VersMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1674:1: ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 24:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1675:1: ( ruleVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1675:1: ( ruleVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1676:1: ruleVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives3527);
                    ruleVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1681:6: ( ruleVersFrontierMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1681:6: ( ruleVersFrontierMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1682:1: ruleVersFrontierMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives3544);
                    ruleVersFrontierMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1687:6: ( ruleBrokenVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1687:6: ( ruleBrokenVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1688:1: ruleBrokenVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_rule__VersMarker__Alternatives3561);
                    ruleBrokenVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersMarker__Alternatives"


    // $ANTLR start "rule__WordEnding__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1698:1: rule__WordEnding__Alternatives : ( ( ruleInterfixLexicalEnding ) | ( ruleInterfixFlexionEding ) | ( rulePluralEnding ) | ( ruleDualEnding ) );
    public final void rule__WordEnding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1702:1: ( ( ruleInterfixLexicalEnding ) | ( ruleInterfixFlexionEding ) | ( rulePluralEnding ) | ( ruleDualEnding ) )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                switch ( input.LA(2) ) {
                case RULE_PLURALSTRING:
                    {
                    alt6=3;
                    }
                    break;
                case RULE_SUFFIXSTRING:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_DUALSTRING:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1703:1: ( ruleInterfixLexicalEnding )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1703:1: ( ruleInterfixLexicalEnding )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1704:1: ruleInterfixLexicalEnding
                    {
                     before(grammarAccess.getWordEndingAccess().getInterfixLexicalEndingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfixLexicalEnding_in_rule__WordEnding__Alternatives3593);
                    ruleInterfixLexicalEnding();

                    state._fsp--;

                     after(grammarAccess.getWordEndingAccess().getInterfixLexicalEndingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1709:6: ( ruleInterfixFlexionEding )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1709:6: ( ruleInterfixFlexionEding )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1710:1: ruleInterfixFlexionEding
                    {
                     before(grammarAccess.getWordEndingAccess().getInterfixFlexionEdingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterfixFlexionEding_in_rule__WordEnding__Alternatives3610);
                    ruleInterfixFlexionEding();

                    state._fsp--;

                     after(grammarAccess.getWordEndingAccess().getInterfixFlexionEdingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1715:6: ( rulePluralEnding )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1715:6: ( rulePluralEnding )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1716:1: rulePluralEnding
                    {
                     before(grammarAccess.getWordEndingAccess().getPluralEndingParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePluralEnding_in_rule__WordEnding__Alternatives3627);
                    rulePluralEnding();

                    state._fsp--;

                     after(grammarAccess.getWordEndingAccess().getPluralEndingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1721:6: ( ruleDualEnding )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1721:6: ( ruleDualEnding )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1722:1: ruleDualEnding
                    {
                     before(grammarAccess.getWordEndingAccess().getDualEndingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDualEnding_in_rule__WordEnding__Alternatives3644);
                    ruleDualEnding();

                    state._fsp--;

                     after(grammarAccess.getWordEndingAccess().getDualEndingParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordEnding__Alternatives"


    // $ANTLR start "rule__WordMiddle__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1732:1: rule__WordMiddle__Alternatives : ( ( ruleBrackets ) | ( ruleChars ) );
    public final void rule__WordMiddle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1736:1: ( ( ruleBrackets ) | ( ruleChars ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34||LA7_0==36||LA7_0==38||LA7_0==40||LA7_0==42||LA7_0==44||LA7_0==46||LA7_0==48||LA7_0==50||LA7_0==52||LA7_0==54) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_EGYSTRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1737:1: ( ruleBrackets )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1737:1: ( ruleBrackets )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1738:1: ruleBrackets
                    {
                     before(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives3676);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1743:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1743:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1744:1: ruleChars
                    {
                     before(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives3693);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordMiddle__Alternatives"


    // $ANTLR start "rule__Interfix__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1754:1: rule__Interfix__Alternatives : ( ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixConnectionSyllabicGroup ) );
    public final void rule__Interfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1758:1: ( ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixConnectionSyllabicGroup ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1759:1: ( ruleInterfixSuffixPronomLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1759:1: ( ruleInterfixSuffixPronomLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1760:1: ruleInterfixSuffixPronomLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_rule__Interfix__Alternatives3725);
                    ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1765:6: ( ruleInterfixPrefixNonLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1765:6: ( ruleInterfixPrefixNonLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1766:1: ruleInterfixPrefixNonLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_rule__Interfix__Alternatives3742);
                    ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1771:6: ( ruleInterfixPrefixLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1771:6: ( ruleInterfixPrefixLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1772:1: ruleInterfixPrefixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_rule__Interfix__Alternatives3759);
                    ruleInterfixPrefixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1777:6: ( ruleInterfixConnectionSyllabicGroup )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1777:6: ( ruleInterfixConnectionSyllabicGroup )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1778:1: ruleInterfixConnectionSyllabicGroup
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_rule__Interfix__Alternatives3776);
                    ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interfix__Alternatives"


    // $ANTLR start "rule__Brackets__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1788:1: rule__Brackets__Alternatives : ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( ruleExpandedColumn ) | ( rulePartialDestruction ) | ( ruleDestruction ) );
    public final void rule__Brackets__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1792:1: ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( ruleExpandedColumn ) | ( rulePartialDestruction ) | ( ruleDestruction ) )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case 50:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 38:
                {
                alt9=5;
                }
                break;
            case 36:
                {
                alt9=6;
                }
                break;
            case 40:
                {
                alt9=7;
                }
                break;
            case 42:
                {
                alt9=8;
                }
                break;
            case 44:
                {
                alt9=9;
                }
                break;
            case 52:
                {
                alt9=10;
                }
                break;
            case 54:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1793:1: ( ruleRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1793:1: ( ruleRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1794:1: ruleRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRasur_in_rule__Brackets__Alternatives3808);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1799:6: ( ruleAncientExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1799:6: ( ruleAncientExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1800:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives3825);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1805:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1805:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1806:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives3842);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1811:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1811:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1812:1: ruleExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives3859);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1817:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1817:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1818:1: ruleDisputableReading
                    {
                     before(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives3876);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1823:6: ( ruleEmendation )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1823:6: ( ruleEmendation )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1824:1: ruleEmendation
                    {
                     before(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives3893);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1829:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1829:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1830:1: ruleLacuna
                    {
                     before(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives3910);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1835:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1835:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1836:1: ruleDeletion
                    {
                     before(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives3927);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1841:6: ( ruleExpandedColumn )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1841:6: ( ruleExpandedColumn )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1842:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives3944);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1847:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1847:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1848:1: rulePartialDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                    pushFollow(FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives3961);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1853:6: ( ruleDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1853:6: ( ruleDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1854:1: ruleDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleDestruction_in_rule__Brackets__Alternatives3978);
                    ruleDestruction();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brackets__Alternatives"


    // $ANTLR start "rule__NoExpanded__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1865:1: rule__NoExpanded__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) );
    public final void rule__NoExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1869:1: ( ( ruleInterfix ) | ( ruleChars ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=33)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_EGYSTRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1870:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1870:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1871:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoExpanded__Alternatives4011);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1876:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1876:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1877:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoExpanded__Alternatives4028);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoExpanded__Alternatives"


    // $ANTLR start "rule__NoEmendation__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1887:1: rule__NoEmendation__Alternatives : ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoEmendation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1891:1: ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1892:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1892:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1893:1: ruleInterfix
                    {
                     before(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoEmendation__Alternatives4060);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1898:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1898:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1899:1: ruleExpanded
                    {
                     before(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives4077);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1904:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1904:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1905:1: ruleChars
                    {
                     before(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives4094);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoEmendation__Alternatives"


    // $ANTLR start "rule__NoDisputableReading__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1915:1: rule__NoDisputableReading__Alternatives : ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoDisputableReading__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1919:1: ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1920:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1920:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1921:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoDisputableReading__Alternatives4126);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1926:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1926:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1927:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives4143);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1932:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1932:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1933:1: ruleChars
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives4160);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoDisputableReading__Alternatives"


    // $ANTLR start "rule__NoLacuna__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1943:1: rule__NoLacuna__Alternatives : ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoLacuna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1947:1: ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1948:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1948:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1949:1: ruleInterfix
                    {
                     before(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoLacuna__Alternatives4192);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1954:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1954:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1955:1: ruleExpanded
                    {
                     before(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives4209);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1960:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1960:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1961:1: ruleChars
                    {
                     before(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives4226);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoLacuna__Alternatives"


    // $ANTLR start "rule__NoDeletion__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1971:1: rule__NoDeletion__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) | ( rulePartialDestruction ) | ( ruleExpanded ) );
    public final void rule__NoDeletion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1975:1: ( ( ruleInterfix ) | ( ruleChars ) | ( rulePartialDestruction ) | ( ruleExpanded ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt14=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt14=2;
                }
                break;
            case 52:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1976:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1976:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1977:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoDeletion__Alternatives4258);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1982:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1982:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1983:1: ruleChars
                    {
                     before(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives4275);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1988:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1988:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1989:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePartialDestruction_in_rule__NoDeletion__Alternatives4292);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1994:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1994:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1995:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoDeletion__Alternatives4309);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoDeletion__Alternatives"


    // $ANTLR start "rule__NoExpandedColumn__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2005:1: rule__NoExpandedColumn__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoExpandedColumn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2009:1: ( ( ruleInterfix ) | ( ruleChars ) | ( ruleExpanded ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt15=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt15=2;
                }
                break;
            case 34:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2010:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2010:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2011:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoExpandedColumn__Alternatives4341);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2016:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2016:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2017:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives4358);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2022:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2022:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2023:1: ruleExpanded
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoExpandedColumn__Alternatives4375);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoExpandedColumn__Alternatives"


    // $ANTLR start "rule__NoRasur__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2033:1: rule__NoRasur__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2037:1: ( ( ruleInterfix ) | ( ruleChars ) | ( ruleExpanded ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt16=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt16=2;
                }
                break;
            case 34:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2038:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2038:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2039:1: ruleInterfix
                    {
                     before(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoRasur__Alternatives4407);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2044:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2044:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2045:1: ruleChars
                    {
                     before(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoRasur__Alternatives4424);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2050:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2050:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2051:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoRasur__Alternatives4441);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRasur__Alternatives"


    // $ANTLR start "rule__NoAncientExpanded__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2061:1: rule__NoAncientExpanded__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoAncientExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2065:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_EGYSTRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2066:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2066:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2067:1: ruleChars
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoAncientExpanded__Alternatives4473);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2072:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2072:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2073:1: ruleExpanded
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoAncientExpanded__Alternatives4490);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoAncientExpanded__Alternatives"


    // $ANTLR start "rule__NoRestorationOverRasur__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2083:1: rule__NoRestorationOverRasur__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoRestorationOverRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2087:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_EGYSTRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2088:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2088:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2089:1: ruleChars
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoRestorationOverRasur__Alternatives4522);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2094:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2094:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2095:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoRestorationOverRasur__Alternatives4539);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoRestorationOverRasur__Alternatives"


    // $ANTLR start "rule__NoPartialDestruction__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2105:1: rule__NoPartialDestruction__Alternatives : ( ( ruleChars ) | ( ruleDeletion ) | ( ruleInterfix ) | ( ruleExpanded ) );
    public final void rule__NoPartialDestruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2109:1: ( ( ruleChars ) | ( ruleDeletion ) | ( ruleInterfix ) | ( ruleExpanded ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt19=1;
                }
                break;
            case 42:
                {
                alt19=2;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2110:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2110:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2111:1: ruleChars
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoPartialDestruction__Alternatives4571);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2116:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2116:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2117:1: ruleDeletion
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeletion_in_rule__NoPartialDestruction__Alternatives4588);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2122:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2122:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2123:1: ruleInterfix
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoPartialDestruction__Alternatives4605);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2128:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2128:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2129:1: ruleExpanded
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoPartialDestruction__Alternatives4622);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoPartialDestruction__Alternatives"


    // $ANTLR start "rule__TextContent__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2141:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2145:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2146:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__04652);
            rule__TextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__04655);
            rule__TextContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0"


    // $ANTLR start "rule__TextContent__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2153:1: rule__TextContent__Group__0__Impl : ( () ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2157:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2158:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2158:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2159:1: ()
            {
             before(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2160:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2162:1: 
            {
            }

             after(grammarAccess.getTextContentAccess().getTextContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__0__Impl"


    // $ANTLR start "rule__TextContent__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2172:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2176:1: ( rule__TextContent__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2177:2: rule__TextContent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__14713);
            rule__TextContent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__1"


    // $ANTLR start "rule__TextContent__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2183:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__Group_1__0 ) ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2187:1: ( ( ( rule__TextContent__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2188:1: ( ( rule__TextContent__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2188:1: ( ( rule__TextContent__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2189:1: ( rule__TextContent__Group_1__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2190:1: ( rule__TextContent__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2190:2: rule__TextContent__Group_1__0
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl4740);
            rule__TextContent__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group__1__Impl"


    // $ANTLR start "rule__TextContent__Group_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2204:1: rule__TextContent__Group_1__0 : rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 ;
    public final void rule__TextContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2208:1: ( rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2209:2: rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__04774);
            rule__TextContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__04777);
            rule__TextContent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1__0"


    // $ANTLR start "rule__TextContent__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2216:1: rule__TextContent__Group_1__0__Impl : ( ( rule__TextContent__ItemsAssignment_1_0 ) ) ;
    public final void rule__TextContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2220:1: ( ( ( rule__TextContent__ItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2221:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2221:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2222:1: ( rule__TextContent__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2223:1: ( rule__TextContent__ItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2223:2: rule__TextContent__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl4804);
            rule__TextContent__ItemsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getItemsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1__0__Impl"


    // $ANTLR start "rule__TextContent__Group_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2233:1: rule__TextContent__Group_1__1 : rule__TextContent__Group_1__1__Impl ;
    public final void rule__TextContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2237:1: ( rule__TextContent__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2238:2: rule__TextContent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__14834);
            rule__TextContent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1__1"


    // $ANTLR start "rule__TextContent__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2244:1: rule__TextContent__Group_1__1__Impl : ( ( rule__TextContent__Group_1_1__0 )* ) ;
    public final void rule__TextContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2248:1: ( ( ( rule__TextContent__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2249:1: ( ( rule__TextContent__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2249:1: ( ( rule__TextContent__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2250:1: ( rule__TextContent__Group_1_1__0 )*
            {
             before(grammarAccess.getTextContentAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2251:1: ( rule__TextContent__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_NEWLINE||(LA20_0>=16 && LA20_0<=17)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2251:2: rule__TextContent__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextContent__Group_1_1__0_in_rule__TextContent__Group_1__1__Impl4861);
            	    rule__TextContent__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTextContentAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1__1__Impl"


    // $ANTLR start "rule__TextContent__Group_1_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2265:1: rule__TextContent__Group_1_1__0 : rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 ;
    public final void rule__TextContent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2269:1: ( rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2270:2: rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1_1__0__Impl_in_rule__TextContent__Group_1_1__04896);
            rule__TextContent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group_1_1__1_in_rule__TextContent__Group_1_1__04899);
            rule__TextContent__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1_1__0"


    // $ANTLR start "rule__TextContent__Group_1_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2277:1: rule__TextContent__Group_1_1__0__Impl : ( ( rule__TextContent__Alternatives_1_1_0 )? ) ;
    public final void rule__TextContent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2281:1: ( ( ( rule__TextContent__Alternatives_1_1_0 )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2282:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2282:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2283:1: ( rule__TextContent__Alternatives_1_1_0 )?
            {
             before(grammarAccess.getTextContentAccess().getAlternatives_1_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2284:1: ( rule__TextContent__Alternatives_1_1_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NEWLINE||LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2284:2: rule__TextContent__Alternatives_1_1_0
                    {
                    pushFollow(FOLLOW_rule__TextContent__Alternatives_1_1_0_in_rule__TextContent__Group_1_1__0__Impl4926);
                    rule__TextContent__Alternatives_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextContentAccess().getAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1_1__0__Impl"


    // $ANTLR start "rule__TextContent__Group_1_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2294:1: rule__TextContent__Group_1_1__1 : rule__TextContent__Group_1_1__1__Impl ;
    public final void rule__TextContent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2298:1: ( rule__TextContent__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2299:2: rule__TextContent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1_1__1__Impl_in_rule__TextContent__Group_1_1__14957);
            rule__TextContent__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1_1__1"


    // $ANTLR start "rule__TextContent__Group_1_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2305:1: rule__TextContent__Group_1_1__1__Impl : ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__TextContent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2309:1: ( ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2310:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2310:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2311:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2312:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2312:2: rule__TextContent__ItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__TextContent__ItemsAssignment_1_1_1_in_rule__TextContent__Group_1_1__1__Impl4984);
            rule__TextContent__ItemsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTextContentAccess().getItemsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__Group_1_1__1__Impl"


    // $ANTLR start "rule__Sentence__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2326:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2330:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2331:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__05018);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__05021);
            rule__Sentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0"


    // $ANTLR start "rule__Sentence__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2338:1: rule__Sentence__Group__0__Impl : ( '\\u00A7' ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2342:1: ( ( '\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2343:1: ( '\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2343:1: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2344:1: '\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getSectionSignKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Sentence__Group__0__Impl5049); 
             after(grammarAccess.getSentenceAccess().getSectionSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2357:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl rule__Sentence__Group__2 ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2361:1: ( rule__Sentence__Group__1__Impl rule__Sentence__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2362:2: rule__Sentence__Group__1__Impl rule__Sentence__Group__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__15080);
            rule__Sentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__15083);
            rule__Sentence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1"


    // $ANTLR start "rule__Sentence__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2369:1: rule__Sentence__Group__1__Impl : ( ( rule__Sentence__Group_1__0 ) ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2373:1: ( ( ( rule__Sentence__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2374:1: ( ( rule__Sentence__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2374:1: ( ( rule__Sentence__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2375:1: ( rule__Sentence__Group_1__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2376:1: ( rule__Sentence__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2376:2: rule__Sentence__Group_1__0
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__0_in_rule__Sentence__Group__1__Impl5110);
            rule__Sentence__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1__Impl"


    // $ANTLR start "rule__Sentence__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2386:1: rule__Sentence__Group__2 : rule__Sentence__Group__2__Impl ;
    public final void rule__Sentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2390:1: ( rule__Sentence__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2391:2: rule__Sentence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__25140);
            rule__Sentence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__2"


    // $ANTLR start "rule__Sentence__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2397:1: rule__Sentence__Group__2__Impl : ( '\\u00A7' ) ;
    public final void rule__Sentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2401:1: ( ( '\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2402:1: ( '\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2402:1: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2403:1: '\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getSectionSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Sentence__Group__2__Impl5168); 
             after(grammarAccess.getSentenceAccess().getSectionSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__2__Impl"


    // $ANTLR start "rule__Sentence__Group_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2422:1: rule__Sentence__Group_1__0 : rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1 ;
    public final void rule__Sentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2426:1: ( rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2427:2: rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__0__Impl_in_rule__Sentence__Group_1__05205);
            rule__Sentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1__1_in_rule__Sentence__Group_1__05208);
            rule__Sentence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__0"


    // $ANTLR start "rule__Sentence__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2434:1: rule__Sentence__Group_1__0__Impl : ( ( rule__Sentence__ItemsAssignment_1_0 ) ) ;
    public final void rule__Sentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2438:1: ( ( ( rule__Sentence__ItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2439:1: ( ( rule__Sentence__ItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2439:1: ( ( rule__Sentence__ItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2440:1: ( rule__Sentence__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2441:1: ( rule__Sentence__ItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2441:2: rule__Sentence__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Sentence__ItemsAssignment_1_0_in_rule__Sentence__Group_1__0__Impl5235);
            rule__Sentence__ItemsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getItemsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2451:1: rule__Sentence__Group_1__1 : rule__Sentence__Group_1__1__Impl ;
    public final void rule__Sentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2455:1: ( rule__Sentence__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2456:2: rule__Sentence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1__1__Impl_in_rule__Sentence__Group_1__15265);
            rule__Sentence__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__1"


    // $ANTLR start "rule__Sentence__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2462:1: rule__Sentence__Group_1__1__Impl : ( ( rule__Sentence__Group_1_1__0 )* ) ;
    public final void rule__Sentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2466:1: ( ( ( rule__Sentence__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2467:1: ( ( rule__Sentence__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2467:1: ( ( rule__Sentence__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2468:1: ( rule__Sentence__Group_1_1__0 )*
            {
             before(grammarAccess.getSentenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2469:1: ( rule__Sentence__Group_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2469:2: rule__Sentence__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sentence__Group_1_1__0_in_rule__Sentence__Group_1__1__Impl5292);
            	    rule__Sentence__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2483:1: rule__Sentence__Group_1_1__0 : rule__Sentence__Group_1_1__0__Impl rule__Sentence__Group_1_1__1 ;
    public final void rule__Sentence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2487:1: ( rule__Sentence__Group_1_1__0__Impl rule__Sentence__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2488:2: rule__Sentence__Group_1_1__0__Impl rule__Sentence__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1__0__Impl_in_rule__Sentence__Group_1_1__05327);
            rule__Sentence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_1__1_in_rule__Sentence__Group_1_1__05330);
            rule__Sentence__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1__0"


    // $ANTLR start "rule__Sentence__Group_1_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2495:1: rule__Sentence__Group_1_1__0__Impl : ( ' ' ) ;
    public final void rule__Sentence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2499:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2500:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2500:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2501:1: ' '
            {
             before(grammarAccess.getSentenceAccess().getSpaceKeyword_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Sentence__Group_1_1__0__Impl5358); 
             after(grammarAccess.getSentenceAccess().getSpaceKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1__0__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2514:1: rule__Sentence__Group_1_1__1 : rule__Sentence__Group_1_1__1__Impl rule__Sentence__Group_1_1__2 ;
    public final void rule__Sentence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2518:1: ( rule__Sentence__Group_1_1__1__Impl rule__Sentence__Group_1_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2519:2: rule__Sentence__Group_1_1__1__Impl rule__Sentence__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1__1__Impl_in_rule__Sentence__Group_1_1__15389);
            rule__Sentence__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_1_1__2_in_rule__Sentence__Group_1_1__15392);
            rule__Sentence__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1__1"


    // $ANTLR start "rule__Sentence__Group_1_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2526:1: rule__Sentence__Group_1_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Sentence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2530:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2531:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2531:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2532:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2533:1: ( RULE_NEWLINE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NEWLINE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2533:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Sentence__Group_1_1__1__Impl5420); 

                    }
                    break;

            }

             after(grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1__1__Impl"


    // $ANTLR start "rule__Sentence__Group_1_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2543:1: rule__Sentence__Group_1_1__2 : rule__Sentence__Group_1_1__2__Impl ;
    public final void rule__Sentence__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2547:1: ( rule__Sentence__Group_1_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2548:2: rule__Sentence__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_1_1__2__Impl_in_rule__Sentence__Group_1_1__25451);
            rule__Sentence__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1__2"


    // $ANTLR start "rule__Sentence__Group_1_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2554:1: rule__Sentence__Group_1_1__2__Impl : ( ( rule__Sentence__ItemsAssignment_1_1_2 ) ) ;
    public final void rule__Sentence__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2558:1: ( ( ( rule__Sentence__ItemsAssignment_1_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2559:1: ( ( rule__Sentence__ItemsAssignment_1_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2559:1: ( ( rule__Sentence__ItemsAssignment_1_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2560:1: ( rule__Sentence__ItemsAssignment_1_1_2 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_1_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2561:1: ( rule__Sentence__ItemsAssignment_1_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2561:2: rule__Sentence__ItemsAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Sentence__ItemsAssignment_1_1_2_in_rule__Sentence__Group_1_1__2__Impl5478);
            rule__Sentence__ItemsAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getItemsAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group_1_1__2__Impl"


    // $ANTLR start "rule__Ambivalence__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2577:1: rule__Ambivalence__Group__0 : rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 ;
    public final void rule__Ambivalence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2581:1: ( rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2582:2: rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__05514);
            rule__Ambivalence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__05517);
            rule__Ambivalence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group__0"


    // $ANTLR start "rule__Ambivalence__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2589:1: rule__Ambivalence__Group__0__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2593:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2594:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2594:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2595:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Ambivalence__Group__0__Impl5545); 
             after(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group__0__Impl"


    // $ANTLR start "rule__Ambivalence__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2608:1: rule__Ambivalence__Group__1 : rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 ;
    public final void rule__Ambivalence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2612:1: ( rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2613:2: rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__15576);
            rule__Ambivalence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__15579);
            rule__Ambivalence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group__1"


    // $ANTLR start "rule__Ambivalence__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2620:1: rule__Ambivalence__Group__1__Impl : ( ( rule__Ambivalence__Group_1__0 ) ) ;
    public final void rule__Ambivalence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2624:1: ( ( ( rule__Ambivalence__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2625:1: ( ( rule__Ambivalence__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2625:1: ( ( rule__Ambivalence__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2626:1: ( rule__Ambivalence__Group_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2627:1: ( rule__Ambivalence__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2627:2: rule__Ambivalence__Group_1__0
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl5606);
            rule__Ambivalence__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group__1__Impl"


    // $ANTLR start "rule__Ambivalence__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2637:1: rule__Ambivalence__Group__2 : rule__Ambivalence__Group__2__Impl ;
    public final void rule__Ambivalence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2641:1: ( rule__Ambivalence__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2642:2: rule__Ambivalence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__25636);
            rule__Ambivalence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group__2"


    // $ANTLR start "rule__Ambivalence__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2648:1: rule__Ambivalence__Group__2__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2652:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2653:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2653:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2654:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Ambivalence__Group__2__Impl5664); 
             after(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group__2__Impl"


    // $ANTLR start "rule__Ambivalence__Group_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2673:1: rule__Ambivalence__Group_1__0 : rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 ;
    public final void rule__Ambivalence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2677:1: ( rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2678:2: rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__05701);
            rule__Ambivalence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__05704);
            rule__Ambivalence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1__0"


    // $ANTLR start "rule__Ambivalence__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2685:1: rule__Ambivalence__Group_1__0__Impl : ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) ;
    public final void rule__Ambivalence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2689:1: ( ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2690:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2690:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2691:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2692:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2692:2: rule__Ambivalence__CasesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl5731);
            rule__Ambivalence__CasesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1__0__Impl"


    // $ANTLR start "rule__Ambivalence__Group_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2702:1: rule__Ambivalence__Group_1__1 : rule__Ambivalence__Group_1__1__Impl ;
    public final void rule__Ambivalence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2706:1: ( rule__Ambivalence__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2707:2: rule__Ambivalence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__15761);
            rule__Ambivalence__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1__1"


    // $ANTLR start "rule__Ambivalence__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2713:1: rule__Ambivalence__Group_1__1__Impl : ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) ;
    public final void rule__Ambivalence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2717:1: ( ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2718:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2718:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2719:1: ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2719:1: ( ( rule__Ambivalence__Group_1_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2720:1: ( rule__Ambivalence__Group_1_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2721:1: ( rule__Ambivalence__Group_1_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2721:2: rule__Ambivalence__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl5790);
            rule__Ambivalence__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2724:1: ( ( rule__Ambivalence__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2725:1: ( rule__Ambivalence__Group_1_1__0 )*
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2726:1: ( rule__Ambivalence__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2726:2: rule__Ambivalence__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl5802);
            	    rule__Ambivalence__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1__1__Impl"


    // $ANTLR start "rule__Ambivalence__Group_1_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2741:1: rule__Ambivalence__Group_1_1__0 : rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 ;
    public final void rule__Ambivalence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2745:1: ( rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2746:2: rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__05839);
            rule__Ambivalence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__05842);
            rule__Ambivalence__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1_1__0"


    // $ANTLR start "rule__Ambivalence__Group_1_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2753:1: rule__Ambivalence__Group_1_1__0__Impl : ( '; ' ) ;
    public final void rule__Ambivalence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2757:1: ( ( '; ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2758:1: ( '; ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2758:1: ( '; ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2759:1: '; '
            {
             before(grammarAccess.getAmbivalenceAccess().getSemicolonSpaceKeyword_1_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Ambivalence__Group_1_1__0__Impl5870); 
             after(grammarAccess.getAmbivalenceAccess().getSemicolonSpaceKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1_1__0__Impl"


    // $ANTLR start "rule__Ambivalence__Group_1_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2772:1: rule__Ambivalence__Group_1_1__1 : rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 ;
    public final void rule__Ambivalence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2776:1: ( rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2777:2: rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__15901);
            rule__Ambivalence__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__2_in_rule__Ambivalence__Group_1_1__15904);
            rule__Ambivalence__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1_1__1"


    // $ANTLR start "rule__Ambivalence__Group_1_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2784:1: rule__Ambivalence__Group_1_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Ambivalence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2788:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2789:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2789:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2790:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2791:1: ( RULE_NEWLINE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_NEWLINE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2791:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Ambivalence__Group_1_1__1__Impl5932); 

                    }
                    break;

            }

             after(grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1_1__1__Impl"


    // $ANTLR start "rule__Ambivalence__Group_1_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2801:1: rule__Ambivalence__Group_1_1__2 : rule__Ambivalence__Group_1_1__2__Impl ;
    public final void rule__Ambivalence__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2805:1: ( rule__Ambivalence__Group_1_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2806:2: rule__Ambivalence__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__2__Impl_in_rule__Ambivalence__Group_1_1__25963);
            rule__Ambivalence__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1_1__2"


    // $ANTLR start "rule__Ambivalence__Group_1_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2812:1: rule__Ambivalence__Group_1_1__2__Impl : ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) ;
    public final void rule__Ambivalence__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2816:1: ( ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2817:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2817:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2818:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2819:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2819:2: rule__Ambivalence__CasesAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Ambivalence__CasesAssignment_1_1_2_in_rule__Ambivalence__Group_1_1__2__Impl5990);
            rule__Ambivalence__CasesAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__Group_1_1__2__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2835:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2839:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2840:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__06026);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__06029);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2847:1: rule__Case__Group__0__Impl : ( 'case ' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2851:1: ( ( 'case ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2852:1: ( 'case ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2852:1: ( 'case ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2853:1: 'case '
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Case__Group__0__Impl6057); 
             after(grammarAccess.getCaseAccess().getCaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2866:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2870:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2871:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__16088);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__16091);
            rule__Case__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2878:1: rule__Case__Group__1__Impl : ( ( rule__Case__NameAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2882:1: ( ( ( rule__Case__NameAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2883:1: ( ( rule__Case__NameAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2883:1: ( ( rule__Case__NameAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2884:1: ( rule__Case__NameAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2885:1: ( rule__Case__NameAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2885:2: rule__Case__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Case__NameAssignment_1_in_rule__Case__Group__1__Impl6118);
            rule__Case__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2895:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2899:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2900:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__26148);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__3_in_rule__Case__Group__26151);
            rule__Case__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2907:1: rule__Case__Group__2__Impl : ( ': ' ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2911:1: ( ( ': ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2912:1: ( ': ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2912:1: ( ': ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2913:1: ': '
            {
             before(grammarAccess.getCaseAccess().getColonSpaceKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Case__Group__2__Impl6179); 
             after(grammarAccess.getCaseAccess().getColonSpaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2926:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2930:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2931:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__36210);
            rule__Case__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__4_in_rule__Case__Group__36213);
            rule__Case__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2938:1: rule__Case__Group__3__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2942:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2943:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2943:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2944:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_3()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2945:1: ( RULE_NEWLINE )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NEWLINE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2945:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Case__Group__3__Impl6241); 

                    }
                    break;

            }

             after(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__4"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2955:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2959:1: ( rule__Case__Group__4__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2960:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__46272);
            rule__Case__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4"


    // $ANTLR start "rule__Case__Group__4__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2966:1: rule__Case__Group__4__Impl : ( ( rule__Case__Group_4__0 ) ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2970:1: ( ( ( rule__Case__Group_4__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2971:1: ( ( rule__Case__Group_4__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2971:1: ( ( rule__Case__Group_4__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2972:1: ( rule__Case__Group_4__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_4()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2973:1: ( rule__Case__Group_4__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2973:2: rule__Case__Group_4__0
            {
            pushFollow(FOLLOW_rule__Case__Group_4__0_in_rule__Case__Group__4__Impl6299);
            rule__Case__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4__Impl"


    // $ANTLR start "rule__Case__Group_4__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2993:1: rule__Case__Group_4__0 : rule__Case__Group_4__0__Impl rule__Case__Group_4__1 ;
    public final void rule__Case__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2997:1: ( rule__Case__Group_4__0__Impl rule__Case__Group_4__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2998:2: rule__Case__Group_4__0__Impl rule__Case__Group_4__1
            {
            pushFollow(FOLLOW_rule__Case__Group_4__0__Impl_in_rule__Case__Group_4__06339);
            rule__Case__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_4__1_in_rule__Case__Group_4__06342);
            rule__Case__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4__0"


    // $ANTLR start "rule__Case__Group_4__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3005:1: rule__Case__Group_4__0__Impl : ( ( rule__Case__ItemsAssignment_4_0 ) ) ;
    public final void rule__Case__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3009:1: ( ( ( rule__Case__ItemsAssignment_4_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3010:1: ( ( rule__Case__ItemsAssignment_4_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3010:1: ( ( rule__Case__ItemsAssignment_4_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3011:1: ( rule__Case__ItemsAssignment_4_0 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_4_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3012:1: ( rule__Case__ItemsAssignment_4_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3012:2: rule__Case__ItemsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Case__ItemsAssignment_4_0_in_rule__Case__Group_4__0__Impl6369);
            rule__Case__ItemsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getItemsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4__0__Impl"


    // $ANTLR start "rule__Case__Group_4__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3022:1: rule__Case__Group_4__1 : rule__Case__Group_4__1__Impl ;
    public final void rule__Case__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3026:1: ( rule__Case__Group_4__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3027:2: rule__Case__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group_4__1__Impl_in_rule__Case__Group_4__16399);
            rule__Case__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4__1"


    // $ANTLR start "rule__Case__Group_4__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3033:1: rule__Case__Group_4__1__Impl : ( ( rule__Case__Group_4_1__0 )* ) ;
    public final void rule__Case__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3037:1: ( ( ( rule__Case__Group_4_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3038:1: ( ( rule__Case__Group_4_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3038:1: ( ( rule__Case__Group_4_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3039:1: ( rule__Case__Group_4_1__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_4_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3040:1: ( rule__Case__Group_4_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3040:2: rule__Case__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Case__Group_4_1__0_in_rule__Case__Group_4__1__Impl6426);
            	    rule__Case__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4__1__Impl"


    // $ANTLR start "rule__Case__Group_4_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3054:1: rule__Case__Group_4_1__0 : rule__Case__Group_4_1__0__Impl rule__Case__Group_4_1__1 ;
    public final void rule__Case__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3058:1: ( rule__Case__Group_4_1__0__Impl rule__Case__Group_4_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3059:2: rule__Case__Group_4_1__0__Impl rule__Case__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Case__Group_4_1__0__Impl_in_rule__Case__Group_4_1__06461);
            rule__Case__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_4_1__1_in_rule__Case__Group_4_1__06464);
            rule__Case__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4_1__0"


    // $ANTLR start "rule__Case__Group_4_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3066:1: rule__Case__Group_4_1__0__Impl : ( ' ' ) ;
    public final void rule__Case__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3070:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3071:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3071:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3072:1: ' '
            {
             before(grammarAccess.getCaseAccess().getSpaceKeyword_4_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Case__Group_4_1__0__Impl6492); 
             after(grammarAccess.getCaseAccess().getSpaceKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4_1__0__Impl"


    // $ANTLR start "rule__Case__Group_4_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3085:1: rule__Case__Group_4_1__1 : rule__Case__Group_4_1__1__Impl rule__Case__Group_4_1__2 ;
    public final void rule__Case__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3089:1: ( rule__Case__Group_4_1__1__Impl rule__Case__Group_4_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3090:2: rule__Case__Group_4_1__1__Impl rule__Case__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__Case__Group_4_1__1__Impl_in_rule__Case__Group_4_1__16523);
            rule__Case__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_4_1__2_in_rule__Case__Group_4_1__16526);
            rule__Case__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4_1__1"


    // $ANTLR start "rule__Case__Group_4_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3097:1: rule__Case__Group_4_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3101:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3102:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3102:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3103:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_4_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3104:1: ( RULE_NEWLINE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NEWLINE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3104:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Case__Group_4_1__1__Impl6554); 

                    }
                    break;

            }

             after(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4_1__1__Impl"


    // $ANTLR start "rule__Case__Group_4_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3114:1: rule__Case__Group_4_1__2 : rule__Case__Group_4_1__2__Impl ;
    public final void rule__Case__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3118:1: ( rule__Case__Group_4_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3119:2: rule__Case__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group_4_1__2__Impl_in_rule__Case__Group_4_1__26585);
            rule__Case__Group_4_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4_1__2"


    // $ANTLR start "rule__Case__Group_4_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3125:1: rule__Case__Group_4_1__2__Impl : ( ( rule__Case__ItemsAssignment_4_1_2 ) ) ;
    public final void rule__Case__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3129:1: ( ( ( rule__Case__ItemsAssignment_4_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3130:1: ( ( rule__Case__ItemsAssignment_4_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3130:1: ( ( rule__Case__ItemsAssignment_4_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3131:1: ( rule__Case__ItemsAssignment_4_1_2 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_4_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3132:1: ( rule__Case__ItemsAssignment_4_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3132:2: rule__Case__ItemsAssignment_4_1_2
            {
            pushFollow(FOLLOW_rule__Case__ItemsAssignment_4_1_2_in_rule__Case__Group_4_1__2__Impl6612);
            rule__Case__ItemsAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getItemsAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_4_1__2__Impl"


    // $ANTLR start "rule__VersFrontierMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3148:1: rule__VersFrontierMarker__Group__0 : rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 ;
    public final void rule__VersFrontierMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3152:1: ( rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3153:2: rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1
            {
            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__0__Impl_in_rule__VersFrontierMarker__Group__06648);
            rule__VersFrontierMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__1_in_rule__VersFrontierMarker__Group__06651);
            rule__VersFrontierMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersFrontierMarker__Group__0"


    // $ANTLR start "rule__VersFrontierMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3160:1: rule__VersFrontierMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersFrontierMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3164:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3165:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3165:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3166:1: ()
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3167:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3169:1: 
            {
            }

             after(grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersFrontierMarker__Group__0__Impl"


    // $ANTLR start "rule__VersFrontierMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3179:1: rule__VersFrontierMarker__Group__1 : rule__VersFrontierMarker__Group__1__Impl ;
    public final void rule__VersFrontierMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3183:1: ( rule__VersFrontierMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3184:2: rule__VersFrontierMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__1__Impl_in_rule__VersFrontierMarker__Group__16709);
            rule__VersFrontierMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersFrontierMarker__Group__1"


    // $ANTLR start "rule__VersFrontierMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3190:1: rule__VersFrontierMarker__Group__1__Impl : ( '\\uDB80\\uDC81' ) ;
    public final void rule__VersFrontierMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3194:1: ( ( '\\uDB80\\uDC81' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3195:1: ( '\\uDB80\\uDC81' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3195:1: ( '\\uDB80\\uDC81' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3196:1: '\\uDB80\\uDC81'
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc81Keyword_1()); 
            match(input,22,FOLLOW_22_in_rule__VersFrontierMarker__Group__1__Impl6737); 
             after(grammarAccess.getVersFrontierMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc81Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersFrontierMarker__Group__1__Impl"


    // $ANTLR start "rule__VersbreakMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3213:1: rule__VersbreakMarker__Group__0 : rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 ;
    public final void rule__VersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3217:1: ( rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3218:2: rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1
            {
            pushFollow(FOLLOW_rule__VersbreakMarker__Group__0__Impl_in_rule__VersbreakMarker__Group__06772);
            rule__VersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersbreakMarker__Group__1_in_rule__VersbreakMarker__Group__06775);
            rule__VersbreakMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersbreakMarker__Group__0"


    // $ANTLR start "rule__VersbreakMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3225:1: rule__VersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3229:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3230:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3230:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3231:1: ()
            {
             before(grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3232:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3234:1: 
            {
            }

             after(grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersbreakMarker__Group__0__Impl"


    // $ANTLR start "rule__VersbreakMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3244:1: rule__VersbreakMarker__Group__1 : rule__VersbreakMarker__Group__1__Impl ;
    public final void rule__VersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3248:1: ( rule__VersbreakMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3249:2: rule__VersbreakMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersbreakMarker__Group__1__Impl_in_rule__VersbreakMarker__Group__16833);
            rule__VersbreakMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersbreakMarker__Group__1"


    // $ANTLR start "rule__VersbreakMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3255:1: rule__VersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC80' ) ;
    public final void rule__VersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3259:1: ( ( '\\uDB80\\uDC80' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3260:1: ( '\\uDB80\\uDC80' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3260:1: ( '\\uDB80\\uDC80' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3261:1: '\\uDB80\\uDC80'
            {
             before(grammarAccess.getVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc80Keyword_1()); 
            match(input,23,FOLLOW_23_in_rule__VersbreakMarker__Group__1__Impl6861); 
             after(grammarAccess.getVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc80Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersbreakMarker__Group__1__Impl"


    // $ANTLR start "rule__BrokenVersbreakMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3278:1: rule__BrokenVersbreakMarker__Group__0 : rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 ;
    public final void rule__BrokenVersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3282:1: ( rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3283:2: rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1
            {
            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__0__Impl_in_rule__BrokenVersbreakMarker__Group__06896);
            rule__BrokenVersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__1_in_rule__BrokenVersbreakMarker__Group__06899);
            rule__BrokenVersbreakMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrokenVersbreakMarker__Group__0"


    // $ANTLR start "rule__BrokenVersbreakMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3290:1: rule__BrokenVersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__BrokenVersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3294:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3295:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3295:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3296:1: ()
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3297:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3299:1: 
            {
            }

             after(grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrokenVersbreakMarker__Group__0__Impl"


    // $ANTLR start "rule__BrokenVersbreakMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3309:1: rule__BrokenVersbreakMarker__Group__1 : rule__BrokenVersbreakMarker__Group__1__Impl ;
    public final void rule__BrokenVersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3313:1: ( rule__BrokenVersbreakMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3314:2: rule__BrokenVersbreakMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__1__Impl_in_rule__BrokenVersbreakMarker__Group__16957);
            rule__BrokenVersbreakMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrokenVersbreakMarker__Group__1"


    // $ANTLR start "rule__BrokenVersbreakMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3320:1: rule__BrokenVersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC82' ) ;
    public final void rule__BrokenVersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3324:1: ( ( '\\uDB80\\uDC82' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3325:1: ( '\\uDB80\\uDC82' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3325:1: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3326:1: '\\uDB80\\uDC82'
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc82Keyword_1()); 
            match(input,24,FOLLOW_24_in_rule__BrokenVersbreakMarker__Group__1__Impl6985); 
             after(grammarAccess.getBrokenVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc82Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrokenVersbreakMarker__Group__1__Impl"


    // $ANTLR start "rule__Marker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3343:1: rule__Marker__Group__0 : rule__Marker__Group__0__Impl rule__Marker__Group__1 ;
    public final void rule__Marker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3347:1: ( rule__Marker__Group__0__Impl rule__Marker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3348:2: rule__Marker__Group__0__Impl rule__Marker__Group__1
            {
            pushFollow(FOLLOW_rule__Marker__Group__0__Impl_in_rule__Marker__Group__07020);
            rule__Marker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Marker__Group__1_in_rule__Marker__Group__07023);
            rule__Marker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__0"


    // $ANTLR start "rule__Marker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3355:1: rule__Marker__Group__0__Impl : ( '#' ) ;
    public final void rule__Marker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3359:1: ( ( '#' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3360:1: ( '#' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3360:1: ( '#' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3361:1: '#'
            {
             before(grammarAccess.getMarkerAccess().getNumberSignKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Marker__Group__0__Impl7051); 
             after(grammarAccess.getMarkerAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__0__Impl"


    // $ANTLR start "rule__Marker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3374:1: rule__Marker__Group__1 : rule__Marker__Group__1__Impl rule__Marker__Group__2 ;
    public final void rule__Marker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3378:1: ( rule__Marker__Group__1__Impl rule__Marker__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3379:2: rule__Marker__Group__1__Impl rule__Marker__Group__2
            {
            pushFollow(FOLLOW_rule__Marker__Group__1__Impl_in_rule__Marker__Group__17082);
            rule__Marker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Marker__Group__2_in_rule__Marker__Group__17085);
            rule__Marker__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__1"


    // $ANTLR start "rule__Marker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3386:1: rule__Marker__Group__1__Impl : ( ( rule__Marker__Group_1__0 ) ) ;
    public final void rule__Marker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3390:1: ( ( ( rule__Marker__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3391:1: ( ( rule__Marker__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3391:1: ( ( rule__Marker__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3392:1: ( rule__Marker__Group_1__0 )
            {
             before(grammarAccess.getMarkerAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3393:1: ( rule__Marker__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3393:2: rule__Marker__Group_1__0
            {
            pushFollow(FOLLOW_rule__Marker__Group_1__0_in_rule__Marker__Group__1__Impl7112);
            rule__Marker__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__1__Impl"


    // $ANTLR start "rule__Marker__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3403:1: rule__Marker__Group__2 : rule__Marker__Group__2__Impl ;
    public final void rule__Marker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3407:1: ( rule__Marker__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3408:2: rule__Marker__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Marker__Group__2__Impl_in_rule__Marker__Group__27142);
            rule__Marker__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__2"


    // $ANTLR start "rule__Marker__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3414:1: rule__Marker__Group__2__Impl : ( '#' ) ;
    public final void rule__Marker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3418:1: ( ( '#' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3419:1: ( '#' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3419:1: ( '#' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3420:1: '#'
            {
             before(grammarAccess.getMarkerAccess().getNumberSignKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Marker__Group__2__Impl7170); 
             after(grammarAccess.getMarkerAccess().getNumberSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__2__Impl"


    // $ANTLR start "rule__Marker__Group_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3439:1: rule__Marker__Group_1__0 : rule__Marker__Group_1__0__Impl rule__Marker__Group_1__1 ;
    public final void rule__Marker__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3443:1: ( rule__Marker__Group_1__0__Impl rule__Marker__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3444:2: rule__Marker__Group_1__0__Impl rule__Marker__Group_1__1
            {
            pushFollow(FOLLOW_rule__Marker__Group_1__0__Impl_in_rule__Marker__Group_1__07207);
            rule__Marker__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Marker__Group_1__1_in_rule__Marker__Group_1__07210);
            rule__Marker__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1__0"


    // $ANTLR start "rule__Marker__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3451:1: rule__Marker__Group_1__0__Impl : ( ( rule__Marker__TypeAssignment_1_0 ) ) ;
    public final void rule__Marker__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3455:1: ( ( ( rule__Marker__TypeAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3456:1: ( ( rule__Marker__TypeAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3456:1: ( ( rule__Marker__TypeAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3457:1: ( rule__Marker__TypeAssignment_1_0 )
            {
             before(grammarAccess.getMarkerAccess().getTypeAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3458:1: ( rule__Marker__TypeAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3458:2: rule__Marker__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Marker__TypeAssignment_1_0_in_rule__Marker__Group_1__0__Impl7237);
            rule__Marker__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1__0__Impl"


    // $ANTLR start "rule__Marker__Group_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3468:1: rule__Marker__Group_1__1 : rule__Marker__Group_1__1__Impl ;
    public final void rule__Marker__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3472:1: ( rule__Marker__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3473:2: rule__Marker__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Marker__Group_1__1__Impl_in_rule__Marker__Group_1__17267);
            rule__Marker__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1__1"


    // $ANTLR start "rule__Marker__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3479:1: rule__Marker__Group_1__1__Impl : ( ( rule__Marker__Group_1_1__0 )? ) ;
    public final void rule__Marker__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3483:1: ( ( ( rule__Marker__Group_1_1__0 )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3484:1: ( ( rule__Marker__Group_1_1__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3484:1: ( ( rule__Marker__Group_1_1__0 )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3485:1: ( rule__Marker__Group_1_1__0 )?
            {
             before(grammarAccess.getMarkerAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3486:1: ( rule__Marker__Group_1_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3486:2: rule__Marker__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Marker__Group_1_1__0_in_rule__Marker__Group_1__1__Impl7294);
                    rule__Marker__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarkerAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1__1__Impl"


    // $ANTLR start "rule__Marker__Group_1_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3500:1: rule__Marker__Group_1_1__0 : rule__Marker__Group_1_1__0__Impl rule__Marker__Group_1_1__1 ;
    public final void rule__Marker__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3504:1: ( rule__Marker__Group_1_1__0__Impl rule__Marker__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3505:2: rule__Marker__Group_1_1__0__Impl rule__Marker__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Marker__Group_1_1__0__Impl_in_rule__Marker__Group_1_1__07329);
            rule__Marker__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Marker__Group_1_1__1_in_rule__Marker__Group_1_1__07332);
            rule__Marker__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1_1__0"


    // $ANTLR start "rule__Marker__Group_1_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3512:1: rule__Marker__Group_1_1__0__Impl : ( ': ' ) ;
    public final void rule__Marker__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3516:1: ( ( ': ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3517:1: ( ': ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3517:1: ( ': ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3518:1: ': '
            {
             before(grammarAccess.getMarkerAccess().getColonSpaceKeyword_1_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Marker__Group_1_1__0__Impl7360); 
             after(grammarAccess.getMarkerAccess().getColonSpaceKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1_1__0__Impl"


    // $ANTLR start "rule__Marker__Group_1_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3531:1: rule__Marker__Group_1_1__1 : rule__Marker__Group_1_1__1__Impl rule__Marker__Group_1_1__2 ;
    public final void rule__Marker__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3535:1: ( rule__Marker__Group_1_1__1__Impl rule__Marker__Group_1_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3536:2: rule__Marker__Group_1_1__1__Impl rule__Marker__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Marker__Group_1_1__1__Impl_in_rule__Marker__Group_1_1__17391);
            rule__Marker__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Marker__Group_1_1__2_in_rule__Marker__Group_1_1__17394);
            rule__Marker__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1_1__1"


    // $ANTLR start "rule__Marker__Group_1_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3543:1: rule__Marker__Group_1_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Marker__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3547:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3548:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3548:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3549:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getMarkerAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3550:1: ( RULE_NEWLINE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NEWLINE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3550:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Marker__Group_1_1__1__Impl7422); 

                    }
                    break;

            }

             after(grammarAccess.getMarkerAccess().getNEWLINETerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1_1__1__Impl"


    // $ANTLR start "rule__Marker__Group_1_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3560:1: rule__Marker__Group_1_1__2 : rule__Marker__Group_1_1__2__Impl ;
    public final void rule__Marker__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3564:1: ( rule__Marker__Group_1_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3565:2: rule__Marker__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Marker__Group_1_1__2__Impl_in_rule__Marker__Group_1_1__27453);
            rule__Marker__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1_1__2"


    // $ANTLR start "rule__Marker__Group_1_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3571:1: rule__Marker__Group_1_1__2__Impl : ( ( rule__Marker__NameAssignment_1_1_2 ) ) ;
    public final void rule__Marker__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3575:1: ( ( ( rule__Marker__NameAssignment_1_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3576:1: ( ( rule__Marker__NameAssignment_1_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3576:1: ( ( rule__Marker__NameAssignment_1_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3577:1: ( rule__Marker__NameAssignment_1_1_2 )
            {
             before(grammarAccess.getMarkerAccess().getNameAssignment_1_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3578:1: ( rule__Marker__NameAssignment_1_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3578:2: rule__Marker__NameAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Marker__NameAssignment_1_1_2_in_rule__Marker__Group_1_1__2__Impl7480);
            rule__Marker__NameAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getNameAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group_1_1__2__Impl"


    // $ANTLR start "rule__Word__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3594:1: rule__Word__Group__0 : rule__Word__Group__0__Impl rule__Word__Group__1 ;
    public final void rule__Word__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3598:1: ( rule__Word__Group__0__Impl rule__Word__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3599:2: rule__Word__Group__0__Impl rule__Word__Group__1
            {
            pushFollow(FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__07516);
            rule__Word__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Word__Group__1_in_rule__Word__Group__07519);
            rule__Word__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group__0"


    // $ANTLR start "rule__Word__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3606:1: rule__Word__Group__0__Impl : ( () ) ;
    public final void rule__Word__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3610:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3611:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3611:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3612:1: ()
            {
             before(grammarAccess.getWordAccess().getWordAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3613:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3615:1: 
            {
            }

             after(grammarAccess.getWordAccess().getWordAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group__0__Impl"


    // $ANTLR start "rule__Word__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3625:1: rule__Word__Group__1 : rule__Word__Group__1__Impl ;
    public final void rule__Word__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3629:1: ( rule__Word__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3630:2: rule__Word__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__17577);
            rule__Word__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group__1"


    // $ANTLR start "rule__Word__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3636:1: rule__Word__Group__1__Impl : ( ( rule__Word__Group_1__0 ) ) ;
    public final void rule__Word__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3640:1: ( ( ( rule__Word__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3641:1: ( ( rule__Word__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3641:1: ( ( rule__Word__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3642:1: ( rule__Word__Group_1__0 )
            {
             before(grammarAccess.getWordAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3643:1: ( rule__Word__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3643:2: rule__Word__Group_1__0
            {
            pushFollow(FOLLOW_rule__Word__Group_1__0_in_rule__Word__Group__1__Impl7604);
            rule__Word__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group__1__Impl"


    // $ANTLR start "rule__Word__Group_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3657:1: rule__Word__Group_1__0 : rule__Word__Group_1__0__Impl rule__Word__Group_1__1 ;
    public final void rule__Word__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3661:1: ( rule__Word__Group_1__0__Impl rule__Word__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3662:2: rule__Word__Group_1__0__Impl rule__Word__Group_1__1
            {
            pushFollow(FOLLOW_rule__Word__Group_1__0__Impl_in_rule__Word__Group_1__07638);
            rule__Word__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Word__Group_1__1_in_rule__Word__Group_1__07641);
            rule__Word__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1__0"


    // $ANTLR start "rule__Word__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3669:1: rule__Word__Group_1__0__Impl : ( ( rule__Word__WCharAssignment_1_0 ) ) ;
    public final void rule__Word__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3673:1: ( ( ( rule__Word__WCharAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3674:1: ( ( rule__Word__WCharAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3674:1: ( ( rule__Word__WCharAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3675:1: ( rule__Word__WCharAssignment_1_0 )
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3676:1: ( rule__Word__WCharAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3676:2: rule__Word__WCharAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Word__WCharAssignment_1_0_in_rule__Word__Group_1__0__Impl7668);
            rule__Word__WCharAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getWCharAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1__0__Impl"


    // $ANTLR start "rule__Word__Group_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3686:1: rule__Word__Group_1__1 : rule__Word__Group_1__1__Impl ;
    public final void rule__Word__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3690:1: ( rule__Word__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3691:2: rule__Word__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Word__Group_1__1__Impl_in_rule__Word__Group_1__17698);
            rule__Word__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1__1"


    // $ANTLR start "rule__Word__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3697:1: rule__Word__Group_1__1__Impl : ( ( rule__Word__Group_1_1__0 )* ) ;
    public final void rule__Word__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3701:1: ( ( ( rule__Word__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3702:1: ( ( rule__Word__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3702:1: ( ( rule__Word__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3703:1: ( rule__Word__Group_1_1__0 )*
            {
             before(grammarAccess.getWordAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3704:1: ( rule__Word__Group_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3704:2: rule__Word__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Word__Group_1_1__0_in_rule__Word__Group_1__1__Impl7725);
            	    rule__Word__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getWordAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1__1__Impl"


    // $ANTLR start "rule__Word__Group_1_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3718:1: rule__Word__Group_1_1__0 : rule__Word__Group_1_1__0__Impl rule__Word__Group_1_1__1 ;
    public final void rule__Word__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3722:1: ( rule__Word__Group_1_1__0__Impl rule__Word__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3723:2: rule__Word__Group_1_1__0__Impl rule__Word__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Word__Group_1_1__0__Impl_in_rule__Word__Group_1_1__07760);
            rule__Word__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Word__Group_1_1__1_in_rule__Word__Group_1_1__07763);
            rule__Word__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1_1__0"


    // $ANTLR start "rule__Word__Group_1_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3730:1: rule__Word__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__Word__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3734:1: ( ( '-' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3735:1: ( '-' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3735:1: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3736:1: '-'
            {
             before(grammarAccess.getWordAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Word__Group_1_1__0__Impl7791); 
             after(grammarAccess.getWordAccess().getHyphenMinusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1_1__0__Impl"


    // $ANTLR start "rule__Word__Group_1_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3749:1: rule__Word__Group_1_1__1 : rule__Word__Group_1_1__1__Impl ;
    public final void rule__Word__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3753:1: ( rule__Word__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3754:2: rule__Word__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Word__Group_1_1__1__Impl_in_rule__Word__Group_1_1__17822);
            rule__Word__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1_1__1"


    // $ANTLR start "rule__Word__Group_1_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3760:1: rule__Word__Group_1_1__1__Impl : ( ( rule__Word__WCharAssignment_1_1_1 ) ) ;
    public final void rule__Word__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3764:1: ( ( ( rule__Word__WCharAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3765:1: ( ( rule__Word__WCharAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3765:1: ( ( rule__Word__WCharAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3766:1: ( rule__Word__WCharAssignment_1_1_1 )
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3767:1: ( rule__Word__WCharAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3767:2: rule__Word__WCharAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Word__WCharAssignment_1_1_1_in_rule__Word__Group_1_1__1__Impl7849);
            rule__Word__WCharAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getWCharAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__Group_1_1__1__Impl"


    // $ANTLR start "rule__WordPart__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3781:1: rule__WordPart__Group__0 : rule__WordPart__Group__0__Impl rule__WordPart__Group__1 ;
    public final void rule__WordPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3785:1: ( rule__WordPart__Group__0__Impl rule__WordPart__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3786:2: rule__WordPart__Group__0__Impl rule__WordPart__Group__1
            {
            pushFollow(FOLLOW_rule__WordPart__Group__0__Impl_in_rule__WordPart__Group__07883);
            rule__WordPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordPart__Group__1_in_rule__WordPart__Group__07886);
            rule__WordPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group__0"


    // $ANTLR start "rule__WordPart__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3793:1: rule__WordPart__Group__0__Impl : ( ( '=' )? ) ;
    public final void rule__WordPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3797:1: ( ( ( '=' )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3798:1: ( ( '=' )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3798:1: ( ( '=' )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3799:1: ( '=' )?
            {
             before(grammarAccess.getWordPartAccess().getEqualsSignKeyword_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3800:1: ( '=' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3801:2: '='
                    {
                    match(input,27,FOLLOW_27_in_rule__WordPart__Group__0__Impl7915); 

                    }
                    break;

            }

             after(grammarAccess.getWordPartAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group__0__Impl"


    // $ANTLR start "rule__WordPart__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3812:1: rule__WordPart__Group__1 : rule__WordPart__Group__1__Impl ;
    public final void rule__WordPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3816:1: ( rule__WordPart__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3817:2: rule__WordPart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WordPart__Group__1__Impl_in_rule__WordPart__Group__17948);
            rule__WordPart__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group__1"


    // $ANTLR start "rule__WordPart__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3823:1: rule__WordPart__Group__1__Impl : ( ( rule__WordPart__Group_1__0 ) ) ;
    public final void rule__WordPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3827:1: ( ( ( rule__WordPart__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3828:1: ( ( rule__WordPart__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3828:1: ( ( rule__WordPart__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3829:1: ( rule__WordPart__Group_1__0 )
            {
             before(grammarAccess.getWordPartAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3830:1: ( rule__WordPart__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3830:2: rule__WordPart__Group_1__0
            {
            pushFollow(FOLLOW_rule__WordPart__Group_1__0_in_rule__WordPart__Group__1__Impl7975);
            rule__WordPart__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getWordPartAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group__1__Impl"


    // $ANTLR start "rule__WordPart__Group_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3844:1: rule__WordPart__Group_1__0 : rule__WordPart__Group_1__0__Impl rule__WordPart__Group_1__1 ;
    public final void rule__WordPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3848:1: ( rule__WordPart__Group_1__0__Impl rule__WordPart__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3849:2: rule__WordPart__Group_1__0__Impl rule__WordPart__Group_1__1
            {
            pushFollow(FOLLOW_rule__WordPart__Group_1__0__Impl_in_rule__WordPart__Group_1__08009);
            rule__WordPart__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordPart__Group_1__1_in_rule__WordPart__Group_1__08012);
            rule__WordPart__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__0"


    // $ANTLR start "rule__WordPart__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3856:1: rule__WordPart__Group_1__0__Impl : ( ( rule__WordPart__WCharAssignment_1_0 ) ) ;
    public final void rule__WordPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3860:1: ( ( ( rule__WordPart__WCharAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3861:1: ( ( rule__WordPart__WCharAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3861:1: ( ( rule__WordPart__WCharAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3862:1: ( rule__WordPart__WCharAssignment_1_0 )
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3863:1: ( rule__WordPart__WCharAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3863:2: rule__WordPart__WCharAssignment_1_0
            {
            pushFollow(FOLLOW_rule__WordPart__WCharAssignment_1_0_in_rule__WordPart__Group_1__0__Impl8039);
            rule__WordPart__WCharAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWordPartAccess().getWCharAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__0__Impl"


    // $ANTLR start "rule__WordPart__Group_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3873:1: rule__WordPart__Group_1__1 : rule__WordPart__Group_1__1__Impl rule__WordPart__Group_1__2 ;
    public final void rule__WordPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3877:1: ( rule__WordPart__Group_1__1__Impl rule__WordPart__Group_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3878:2: rule__WordPart__Group_1__1__Impl rule__WordPart__Group_1__2
            {
            pushFollow(FOLLOW_rule__WordPart__Group_1__1__Impl_in_rule__WordPart__Group_1__18069);
            rule__WordPart__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordPart__Group_1__2_in_rule__WordPart__Group_1__18072);
            rule__WordPart__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__1"


    // $ANTLR start "rule__WordPart__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3885:1: rule__WordPart__Group_1__1__Impl : ( ( rule__WordPart__WCharAssignment_1_1 )* ) ;
    public final void rule__WordPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3889:1: ( ( ( rule__WordPart__WCharAssignment_1_1 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3890:1: ( ( rule__WordPart__WCharAssignment_1_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3890:1: ( ( rule__WordPart__WCharAssignment_1_1 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3891:1: ( rule__WordPart__WCharAssignment_1_1 )*
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3892:1: ( rule__WordPart__WCharAssignment_1_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_EGYSTRING||LA33_0==34||LA33_0==36||LA33_0==38||LA33_0==40||LA33_0==42||LA33_0==44||LA33_0==46||LA33_0==48||LA33_0==50||LA33_0==52||LA33_0==54) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3892:2: rule__WordPart__WCharAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__WordPart__WCharAssignment_1_1_in_rule__WordPart__Group_1__1__Impl8099);
            	    rule__WordPart__WCharAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getWordPartAccess().getWCharAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__1__Impl"


    // $ANTLR start "rule__WordPart__Group_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3902:1: rule__WordPart__Group_1__2 : rule__WordPart__Group_1__2__Impl rule__WordPart__Group_1__3 ;
    public final void rule__WordPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3906:1: ( rule__WordPart__Group_1__2__Impl rule__WordPart__Group_1__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3907:2: rule__WordPart__Group_1__2__Impl rule__WordPart__Group_1__3
            {
            pushFollow(FOLLOW_rule__WordPart__Group_1__2__Impl_in_rule__WordPart__Group_1__28130);
            rule__WordPart__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordPart__Group_1__3_in_rule__WordPart__Group_1__28133);
            rule__WordPart__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__2"


    // $ANTLR start "rule__WordPart__Group_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3914:1: rule__WordPart__Group_1__2__Impl : ( ( rule__WordPart__WCharAssignment_1_2 )? ) ;
    public final void rule__WordPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3918:1: ( ( ( rule__WordPart__WCharAssignment_1_2 )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3919:1: ( ( rule__WordPart__WCharAssignment_1_2 )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3919:1: ( ( rule__WordPart__WCharAssignment_1_2 )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3920:1: ( rule__WordPart__WCharAssignment_1_2 )?
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3921:1: ( rule__WordPart__WCharAssignment_1_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_SUFFIXSTRING) ) {
                    alt34=1;
                }
            }
            else if ( (LA34_0==29) ) {
                switch ( input.LA(2) ) {
                    case RULE_DUALSTRING:
                        {
                        alt34=1;
                        }
                        break;
                    case RULE_PLURALSTRING:
                        {
                        alt34=1;
                        }
                        break;
                    case RULE_SUFFIXSTRING:
                        {
                        alt34=1;
                        }
                        break;
                }

            }
            switch (alt34) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3921:2: rule__WordPart__WCharAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__WordPart__WCharAssignment_1_2_in_rule__WordPart__Group_1__2__Impl8160);
                    rule__WordPart__WCharAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWordPartAccess().getWCharAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__2__Impl"


    // $ANTLR start "rule__WordPart__Group_1__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3931:1: rule__WordPart__Group_1__3 : rule__WordPart__Group_1__3__Impl ;
    public final void rule__WordPart__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3935:1: ( rule__WordPart__Group_1__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3936:2: rule__WordPart__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__WordPart__Group_1__3__Impl_in_rule__WordPart__Group_1__38191);
            rule__WordPart__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__3"


    // $ANTLR start "rule__WordPart__Group_1__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3942:1: rule__WordPart__Group_1__3__Impl : ( ( rule__WordPart__WCharAssignment_1_3 )? ) ;
    public final void rule__WordPart__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3946:1: ( ( ( rule__WordPart__WCharAssignment_1_3 )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3947:1: ( ( rule__WordPart__WCharAssignment_1_3 )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3947:1: ( ( rule__WordPart__WCharAssignment_1_3 )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3948:1: ( rule__WordPart__WCharAssignment_1_3 )?
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1_3()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3949:1: ( rule__WordPart__WCharAssignment_1_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=28 && LA35_0<=29)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3949:2: rule__WordPart__WCharAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__WordPart__WCharAssignment_1_3_in_rule__WordPart__Group_1__3__Impl8218);
                    rule__WordPart__WCharAssignment_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWordPartAccess().getWCharAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__Group_1__3__Impl"


    // $ANTLR start "rule__DualEnding__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3967:1: rule__DualEnding__Group__0 : rule__DualEnding__Group__0__Impl rule__DualEnding__Group__1 ;
    public final void rule__DualEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3971:1: ( rule__DualEnding__Group__0__Impl rule__DualEnding__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3972:2: rule__DualEnding__Group__0__Impl rule__DualEnding__Group__1
            {
            pushFollow(FOLLOW_rule__DualEnding__Group__0__Impl_in_rule__DualEnding__Group__08257);
            rule__DualEnding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DualEnding__Group__1_in_rule__DualEnding__Group__08260);
            rule__DualEnding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualEnding__Group__0"


    // $ANTLR start "rule__DualEnding__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3979:1: rule__DualEnding__Group__0__Impl : ( ( rule__DualEnding__InterfixAssignment_0 ) ) ;
    public final void rule__DualEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3983:1: ( ( ( rule__DualEnding__InterfixAssignment_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3984:1: ( ( rule__DualEnding__InterfixAssignment_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3984:1: ( ( rule__DualEnding__InterfixAssignment_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3985:1: ( rule__DualEnding__InterfixAssignment_0 )
            {
             before(grammarAccess.getDualEndingAccess().getInterfixAssignment_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3986:1: ( rule__DualEnding__InterfixAssignment_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3986:2: rule__DualEnding__InterfixAssignment_0
            {
            pushFollow(FOLLOW_rule__DualEnding__InterfixAssignment_0_in_rule__DualEnding__Group__0__Impl8287);
            rule__DualEnding__InterfixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDualEndingAccess().getInterfixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualEnding__Group__0__Impl"


    // $ANTLR start "rule__DualEnding__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3996:1: rule__DualEnding__Group__1 : rule__DualEnding__Group__1__Impl ;
    public final void rule__DualEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4000:1: ( rule__DualEnding__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4001:2: rule__DualEnding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DualEnding__Group__1__Impl_in_rule__DualEnding__Group__18317);
            rule__DualEnding__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualEnding__Group__1"


    // $ANTLR start "rule__DualEnding__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4007:1: rule__DualEnding__Group__1__Impl : ( ( rule__DualEnding__CharsAssignment_1 ) ) ;
    public final void rule__DualEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4011:1: ( ( ( rule__DualEnding__CharsAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4012:1: ( ( rule__DualEnding__CharsAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4012:1: ( ( rule__DualEnding__CharsAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4013:1: ( rule__DualEnding__CharsAssignment_1 )
            {
             before(grammarAccess.getDualEndingAccess().getCharsAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4014:1: ( rule__DualEnding__CharsAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4014:2: rule__DualEnding__CharsAssignment_1
            {
            pushFollow(FOLLOW_rule__DualEnding__CharsAssignment_1_in_rule__DualEnding__Group__1__Impl8344);
            rule__DualEnding__CharsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDualEndingAccess().getCharsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualEnding__Group__1__Impl"


    // $ANTLR start "rule__PluralEnding__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4028:1: rule__PluralEnding__Group__0 : rule__PluralEnding__Group__0__Impl rule__PluralEnding__Group__1 ;
    public final void rule__PluralEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4032:1: ( rule__PluralEnding__Group__0__Impl rule__PluralEnding__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4033:2: rule__PluralEnding__Group__0__Impl rule__PluralEnding__Group__1
            {
            pushFollow(FOLLOW_rule__PluralEnding__Group__0__Impl_in_rule__PluralEnding__Group__08378);
            rule__PluralEnding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PluralEnding__Group__1_in_rule__PluralEnding__Group__08381);
            rule__PluralEnding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralEnding__Group__0"


    // $ANTLR start "rule__PluralEnding__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4040:1: rule__PluralEnding__Group__0__Impl : ( ( rule__PluralEnding__InterfixAssignment_0 ) ) ;
    public final void rule__PluralEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4044:1: ( ( ( rule__PluralEnding__InterfixAssignment_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4045:1: ( ( rule__PluralEnding__InterfixAssignment_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4045:1: ( ( rule__PluralEnding__InterfixAssignment_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4046:1: ( rule__PluralEnding__InterfixAssignment_0 )
            {
             before(grammarAccess.getPluralEndingAccess().getInterfixAssignment_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4047:1: ( rule__PluralEnding__InterfixAssignment_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4047:2: rule__PluralEnding__InterfixAssignment_0
            {
            pushFollow(FOLLOW_rule__PluralEnding__InterfixAssignment_0_in_rule__PluralEnding__Group__0__Impl8408);
            rule__PluralEnding__InterfixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPluralEndingAccess().getInterfixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralEnding__Group__0__Impl"


    // $ANTLR start "rule__PluralEnding__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4057:1: rule__PluralEnding__Group__1 : rule__PluralEnding__Group__1__Impl ;
    public final void rule__PluralEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4061:1: ( rule__PluralEnding__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4062:2: rule__PluralEnding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PluralEnding__Group__1__Impl_in_rule__PluralEnding__Group__18438);
            rule__PluralEnding__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralEnding__Group__1"


    // $ANTLR start "rule__PluralEnding__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4068:1: rule__PluralEnding__Group__1__Impl : ( ( rule__PluralEnding__CharsAssignment_1 ) ) ;
    public final void rule__PluralEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4072:1: ( ( ( rule__PluralEnding__CharsAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4073:1: ( ( rule__PluralEnding__CharsAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4073:1: ( ( rule__PluralEnding__CharsAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4074:1: ( rule__PluralEnding__CharsAssignment_1 )
            {
             before(grammarAccess.getPluralEndingAccess().getCharsAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4075:1: ( rule__PluralEnding__CharsAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4075:2: rule__PluralEnding__CharsAssignment_1
            {
            pushFollow(FOLLOW_rule__PluralEnding__CharsAssignment_1_in_rule__PluralEnding__Group__1__Impl8465);
            rule__PluralEnding__CharsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPluralEndingAccess().getCharsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralEnding__Group__1__Impl"


    // $ANTLR start "rule__InterfixFlexionEding__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4089:1: rule__InterfixFlexionEding__Group__0 : rule__InterfixFlexionEding__Group__0__Impl rule__InterfixFlexionEding__Group__1 ;
    public final void rule__InterfixFlexionEding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4093:1: ( rule__InterfixFlexionEding__Group__0__Impl rule__InterfixFlexionEding__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4094:2: rule__InterfixFlexionEding__Group__0__Impl rule__InterfixFlexionEding__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixFlexionEding__Group__0__Impl_in_rule__InterfixFlexionEding__Group__08499);
            rule__InterfixFlexionEding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixFlexionEding__Group__1_in_rule__InterfixFlexionEding__Group__08502);
            rule__InterfixFlexionEding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexionEding__Group__0"


    // $ANTLR start "rule__InterfixFlexionEding__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4101:1: rule__InterfixFlexionEding__Group__0__Impl : ( ( rule__InterfixFlexionEding__InterfixAssignment_0 ) ) ;
    public final void rule__InterfixFlexionEding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4105:1: ( ( ( rule__InterfixFlexionEding__InterfixAssignment_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4106:1: ( ( rule__InterfixFlexionEding__InterfixAssignment_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4106:1: ( ( rule__InterfixFlexionEding__InterfixAssignment_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4107:1: ( rule__InterfixFlexionEding__InterfixAssignment_0 )
            {
             before(grammarAccess.getInterfixFlexionEdingAccess().getInterfixAssignment_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4108:1: ( rule__InterfixFlexionEding__InterfixAssignment_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4108:2: rule__InterfixFlexionEding__InterfixAssignment_0
            {
            pushFollow(FOLLOW_rule__InterfixFlexionEding__InterfixAssignment_0_in_rule__InterfixFlexionEding__Group__0__Impl8529);
            rule__InterfixFlexionEding__InterfixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixFlexionEdingAccess().getInterfixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexionEding__Group__0__Impl"


    // $ANTLR start "rule__InterfixFlexionEding__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4118:1: rule__InterfixFlexionEding__Group__1 : rule__InterfixFlexionEding__Group__1__Impl ;
    public final void rule__InterfixFlexionEding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4122:1: ( rule__InterfixFlexionEding__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4123:2: rule__InterfixFlexionEding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixFlexionEding__Group__1__Impl_in_rule__InterfixFlexionEding__Group__18559);
            rule__InterfixFlexionEding__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexionEding__Group__1"


    // $ANTLR start "rule__InterfixFlexionEding__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4129:1: rule__InterfixFlexionEding__Group__1__Impl : ( ( rule__InterfixFlexionEding__CharsAssignment_1 ) ) ;
    public final void rule__InterfixFlexionEding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4133:1: ( ( ( rule__InterfixFlexionEding__CharsAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4134:1: ( ( rule__InterfixFlexionEding__CharsAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4134:1: ( ( rule__InterfixFlexionEding__CharsAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4135:1: ( rule__InterfixFlexionEding__CharsAssignment_1 )
            {
             before(grammarAccess.getInterfixFlexionEdingAccess().getCharsAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4136:1: ( rule__InterfixFlexionEding__CharsAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4136:2: rule__InterfixFlexionEding__CharsAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfixFlexionEding__CharsAssignment_1_in_rule__InterfixFlexionEding__Group__1__Impl8586);
            rule__InterfixFlexionEding__CharsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfixFlexionEdingAccess().getCharsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexionEding__Group__1__Impl"


    // $ANTLR start "rule__InterfixLexicalEnding__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4150:1: rule__InterfixLexicalEnding__Group__0 : rule__InterfixLexicalEnding__Group__0__Impl rule__InterfixLexicalEnding__Group__1 ;
    public final void rule__InterfixLexicalEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4154:1: ( rule__InterfixLexicalEnding__Group__0__Impl rule__InterfixLexicalEnding__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4155:2: rule__InterfixLexicalEnding__Group__0__Impl rule__InterfixLexicalEnding__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixLexicalEnding__Group__0__Impl_in_rule__InterfixLexicalEnding__Group__08620);
            rule__InterfixLexicalEnding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixLexicalEnding__Group__1_in_rule__InterfixLexicalEnding__Group__08623);
            rule__InterfixLexicalEnding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexicalEnding__Group__0"


    // $ANTLR start "rule__InterfixLexicalEnding__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4162:1: rule__InterfixLexicalEnding__Group__0__Impl : ( ( rule__InterfixLexicalEnding__InterfixAssignment_0 ) ) ;
    public final void rule__InterfixLexicalEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4166:1: ( ( ( rule__InterfixLexicalEnding__InterfixAssignment_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4167:1: ( ( rule__InterfixLexicalEnding__InterfixAssignment_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4167:1: ( ( rule__InterfixLexicalEnding__InterfixAssignment_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4168:1: ( rule__InterfixLexicalEnding__InterfixAssignment_0 )
            {
             before(grammarAccess.getInterfixLexicalEndingAccess().getInterfixAssignment_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4169:1: ( rule__InterfixLexicalEnding__InterfixAssignment_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4169:2: rule__InterfixLexicalEnding__InterfixAssignment_0
            {
            pushFollow(FOLLOW_rule__InterfixLexicalEnding__InterfixAssignment_0_in_rule__InterfixLexicalEnding__Group__0__Impl8650);
            rule__InterfixLexicalEnding__InterfixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixLexicalEndingAccess().getInterfixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexicalEnding__Group__0__Impl"


    // $ANTLR start "rule__InterfixLexicalEnding__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4179:1: rule__InterfixLexicalEnding__Group__1 : rule__InterfixLexicalEnding__Group__1__Impl ;
    public final void rule__InterfixLexicalEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4183:1: ( rule__InterfixLexicalEnding__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4184:2: rule__InterfixLexicalEnding__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixLexicalEnding__Group__1__Impl_in_rule__InterfixLexicalEnding__Group__18680);
            rule__InterfixLexicalEnding__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexicalEnding__Group__1"


    // $ANTLR start "rule__InterfixLexicalEnding__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4190:1: rule__InterfixLexicalEnding__Group__1__Impl : ( ( rule__InterfixLexicalEnding__CharsAssignment_1 ) ) ;
    public final void rule__InterfixLexicalEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4194:1: ( ( ( rule__InterfixLexicalEnding__CharsAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4195:1: ( ( rule__InterfixLexicalEnding__CharsAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4195:1: ( ( rule__InterfixLexicalEnding__CharsAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4196:1: ( rule__InterfixLexicalEnding__CharsAssignment_1 )
            {
             before(grammarAccess.getInterfixLexicalEndingAccess().getCharsAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4197:1: ( rule__InterfixLexicalEnding__CharsAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4197:2: rule__InterfixLexicalEnding__CharsAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfixLexicalEnding__CharsAssignment_1_in_rule__InterfixLexicalEnding__Group__1__Impl8707);
            rule__InterfixLexicalEnding__CharsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfixLexicalEndingAccess().getCharsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexicalEnding__Group__1__Impl"


    // $ANTLR start "rule__InterfixLexical__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4211:1: rule__InterfixLexical__Group__0 : rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 ;
    public final void rule__InterfixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4215:1: ( rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4216:2: rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixLexical__Group__0__Impl_in_rule__InterfixLexical__Group__08741);
            rule__InterfixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixLexical__Group__1_in_rule__InterfixLexical__Group__08744);
            rule__InterfixLexical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexical__Group__0"


    // $ANTLR start "rule__InterfixLexical__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4223:1: rule__InterfixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4227:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4228:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4228:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4229:1: ()
            {
             before(grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4230:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4232:1: 
            {
            }

             after(grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexical__Group__0__Impl"


    // $ANTLR start "rule__InterfixLexical__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4242:1: rule__InterfixLexical__Group__1 : rule__InterfixLexical__Group__1__Impl ;
    public final void rule__InterfixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4246:1: ( rule__InterfixLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4247:2: rule__InterfixLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixLexical__Group__1__Impl_in_rule__InterfixLexical__Group__18802);
            rule__InterfixLexical__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexical__Group__1"


    // $ANTLR start "rule__InterfixLexical__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4253:1: rule__InterfixLexical__Group__1__Impl : ( ',' ) ;
    public final void rule__InterfixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4257:1: ( ( ',' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4258:1: ( ',' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4258:1: ( ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4259:1: ','
            {
             before(grammarAccess.getInterfixLexicalAccess().getCommaKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__InterfixLexical__Group__1__Impl8830); 
             after(grammarAccess.getInterfixLexicalAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexical__Group__1__Impl"


    // $ANTLR start "rule__InterfixFlexion__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4276:1: rule__InterfixFlexion__Group__0 : rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 ;
    public final void rule__InterfixFlexion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4280:1: ( rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4281:2: rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixFlexion__Group__0__Impl_in_rule__InterfixFlexion__Group__08865);
            rule__InterfixFlexion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixFlexion__Group__1_in_rule__InterfixFlexion__Group__08868);
            rule__InterfixFlexion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexion__Group__0"


    // $ANTLR start "rule__InterfixFlexion__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4288:1: rule__InterfixFlexion__Group__0__Impl : ( () ) ;
    public final void rule__InterfixFlexion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4292:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4293:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4293:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4294:1: ()
            {
             before(grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4295:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4297:1: 
            {
            }

             after(grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexion__Group__0__Impl"


    // $ANTLR start "rule__InterfixFlexion__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4307:1: rule__InterfixFlexion__Group__1 : rule__InterfixFlexion__Group__1__Impl ;
    public final void rule__InterfixFlexion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4311:1: ( rule__InterfixFlexion__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4312:2: rule__InterfixFlexion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixFlexion__Group__1__Impl_in_rule__InterfixFlexion__Group__18926);
            rule__InterfixFlexion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexion__Group__1"


    // $ANTLR start "rule__InterfixFlexion__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4318:1: rule__InterfixFlexion__Group__1__Impl : ( '.' ) ;
    public final void rule__InterfixFlexion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4322:1: ( ( '.' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4323:1: ( '.' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4323:1: ( '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4324:1: '.'
            {
             before(grammarAccess.getInterfixFlexionAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__InterfixFlexion__Group__1__Impl8954); 
             after(grammarAccess.getInterfixFlexionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexion__Group__1__Impl"


    // $ANTLR start "rule__InterfixSuffixPronomLexical__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4341:1: rule__InterfixSuffixPronomLexical__Group__0 : rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 ;
    public final void rule__InterfixSuffixPronomLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4345:1: ( rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4346:2: rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__0__Impl_in_rule__InterfixSuffixPronomLexical__Group__08989);
            rule__InterfixSuffixPronomLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__1_in_rule__InterfixSuffixPronomLexical__Group__08992);
            rule__InterfixSuffixPronomLexical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixSuffixPronomLexical__Group__0"


    // $ANTLR start "rule__InterfixSuffixPronomLexical__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4353:1: rule__InterfixSuffixPronomLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4357:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4358:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4358:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4359:1: ()
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4360:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4362:1: 
            {
            }

             after(grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixSuffixPronomLexical__Group__0__Impl"


    // $ANTLR start "rule__InterfixSuffixPronomLexical__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4372:1: rule__InterfixSuffixPronomLexical__Group__1 : rule__InterfixSuffixPronomLexical__Group__1__Impl ;
    public final void rule__InterfixSuffixPronomLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4376:1: ( rule__InterfixSuffixPronomLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4377:2: rule__InterfixSuffixPronomLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__1__Impl_in_rule__InterfixSuffixPronomLexical__Group__19050);
            rule__InterfixSuffixPronomLexical__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixSuffixPronomLexical__Group__1"


    // $ANTLR start "rule__InterfixSuffixPronomLexical__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4383:1: rule__InterfixSuffixPronomLexical__Group__1__Impl : ( '\\u2261' ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4387:1: ( ( '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4388:1: ( '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4388:1: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4389:1: '\\u2261'
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getIdenticalToKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__InterfixSuffixPronomLexical__Group__1__Impl9078); 
             after(grammarAccess.getInterfixSuffixPronomLexicalAccess().getIdenticalToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixSuffixPronomLexical__Group__1__Impl"


    // $ANTLR start "rule__InterfixPrefixNonLexical__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4406:1: rule__InterfixPrefixNonLexical__Group__0 : rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 ;
    public final void rule__InterfixPrefixNonLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4410:1: ( rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4411:2: rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__0__Impl_in_rule__InterfixPrefixNonLexical__Group__09113);
            rule__InterfixPrefixNonLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__1_in_rule__InterfixPrefixNonLexical__Group__09116);
            rule__InterfixPrefixNonLexical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixNonLexical__Group__0"


    // $ANTLR start "rule__InterfixPrefixNonLexical__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4418:1: rule__InterfixPrefixNonLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixNonLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4422:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4423:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4423:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4424:1: ()
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4425:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4427:1: 
            {
            }

             after(grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixNonLexical__Group__0__Impl"


    // $ANTLR start "rule__InterfixPrefixNonLexical__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4437:1: rule__InterfixPrefixNonLexical__Group__1 : rule__InterfixPrefixNonLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixNonLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4441:1: ( rule__InterfixPrefixNonLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4442:2: rule__InterfixPrefixNonLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__1__Impl_in_rule__InterfixPrefixNonLexical__Group__19174);
            rule__InterfixPrefixNonLexical__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixNonLexical__Group__1"


    // $ANTLR start "rule__InterfixPrefixNonLexical__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4448:1: rule__InterfixPrefixNonLexical__Group__1__Impl : ( ':' ) ;
    public final void rule__InterfixPrefixNonLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4452:1: ( ( ':' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4453:1: ( ':' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4453:1: ( ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4454:1: ':'
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__InterfixPrefixNonLexical__Group__1__Impl9202); 
             after(grammarAccess.getInterfixPrefixNonLexicalAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixNonLexical__Group__1__Impl"


    // $ANTLR start "rule__InterfixPrefixLexical__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4471:1: rule__InterfixPrefixLexical__Group__0 : rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 ;
    public final void rule__InterfixPrefixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4475:1: ( rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4476:2: rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__0__Impl_in_rule__InterfixPrefixLexical__Group__09237);
            rule__InterfixPrefixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__1_in_rule__InterfixPrefixLexical__Group__09240);
            rule__InterfixPrefixLexical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixLexical__Group__0"


    // $ANTLR start "rule__InterfixPrefixLexical__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4483:1: rule__InterfixPrefixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4487:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4488:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4488:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4489:1: ()
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4490:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4492:1: 
            {
            }

             after(grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixLexical__Group__0__Impl"


    // $ANTLR start "rule__InterfixPrefixLexical__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4502:1: rule__InterfixPrefixLexical__Group__1 : rule__InterfixPrefixLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4506:1: ( rule__InterfixPrefixLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4507:2: rule__InterfixPrefixLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__1__Impl_in_rule__InterfixPrefixLexical__Group__19298);
            rule__InterfixPrefixLexical__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixLexical__Group__1"


    // $ANTLR start "rule__InterfixPrefixLexical__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4513:1: rule__InterfixPrefixLexical__Group__1__Impl : ( '\\u22EE' ) ;
    public final void rule__InterfixPrefixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4517:1: ( ( '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4518:1: ( '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4518:1: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4519:1: '\\u22EE'
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getVerticalEllipsisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__InterfixPrefixLexical__Group__1__Impl9326); 
             after(grammarAccess.getInterfixPrefixLexicalAccess().getVerticalEllipsisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPrefixLexical__Group__1__Impl"


    // $ANTLR start "rule__InterfixConnectionSyllabicGroup__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4536:1: rule__InterfixConnectionSyllabicGroup__Group__0 : rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4540:1: ( rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4541:2: rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__09361);
            rule__InterfixConnectionSyllabicGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1_in_rule__InterfixConnectionSyllabicGroup__Group__09364);
            rule__InterfixConnectionSyllabicGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixConnectionSyllabicGroup__Group__0"


    // $ANTLR start "rule__InterfixConnectionSyllabicGroup__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4548:1: rule__InterfixConnectionSyllabicGroup__Group__0__Impl : ( () ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4552:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4553:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4553:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4554:1: ()
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4555:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4557:1: 
            {
            }

             after(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixConnectionSyllabicGroup__Group__0__Impl"


    // $ANTLR start "rule__InterfixConnectionSyllabicGroup__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4567:1: rule__InterfixConnectionSyllabicGroup__Group__1 : rule__InterfixConnectionSyllabicGroup__Group__1__Impl ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4571:1: ( rule__InterfixConnectionSyllabicGroup__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4572:2: rule__InterfixConnectionSyllabicGroup__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__19422);
            rule__InterfixConnectionSyllabicGroup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixConnectionSyllabicGroup__Group__1"


    // $ANTLR start "rule__InterfixConnectionSyllabicGroup__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4578:1: rule__InterfixConnectionSyllabicGroup__Group__1__Impl : ( '~' ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4582:1: ( ( '~' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4583:1: ( '~' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4583:1: ( '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4584:1: '~'
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getTildeKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__InterfixConnectionSyllabicGroup__Group__1__Impl9450); 
             after(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getTildeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixConnectionSyllabicGroup__Group__1__Impl"


    // $ANTLR start "rule__Expanded__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4601:1: rule__Expanded__Group__0 : rule__Expanded__Group__0__Impl rule__Expanded__Group__1 ;
    public final void rule__Expanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4605:1: ( rule__Expanded__Group__0__Impl rule__Expanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4606:2: rule__Expanded__Group__0__Impl rule__Expanded__Group__1
            {
            pushFollow(FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__09485);
            rule__Expanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__09488);
            rule__Expanded__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__0"


    // $ANTLR start "rule__Expanded__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4613:1: rule__Expanded__Group__0__Impl : ( () ) ;
    public final void rule__Expanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4617:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4618:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4618:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4619:1: ()
            {
             before(grammarAccess.getExpandedAccess().getExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4620:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4622:1: 
            {
            }

             after(grammarAccess.getExpandedAccess().getExpandedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__0__Impl"


    // $ANTLR start "rule__Expanded__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4632:1: rule__Expanded__Group__1 : rule__Expanded__Group__1__Impl rule__Expanded__Group__2 ;
    public final void rule__Expanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4636:1: ( rule__Expanded__Group__1__Impl rule__Expanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4637:2: rule__Expanded__Group__1__Impl rule__Expanded__Group__2
            {
            pushFollow(FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__19546);
            rule__Expanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__19549);
            rule__Expanded__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__1"


    // $ANTLR start "rule__Expanded__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4644:1: rule__Expanded__Group__1__Impl : ( '(' ) ;
    public final void rule__Expanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4648:1: ( ( '(' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4649:1: ( '(' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4649:1: ( '(' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4650:1: '('
            {
             before(grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Expanded__Group__1__Impl9577); 
             after(grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__1__Impl"


    // $ANTLR start "rule__Expanded__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4663:1: rule__Expanded__Group__2 : rule__Expanded__Group__2__Impl rule__Expanded__Group__3 ;
    public final void rule__Expanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4667:1: ( rule__Expanded__Group__2__Impl rule__Expanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4668:2: rule__Expanded__Group__2__Impl rule__Expanded__Group__3
            {
            pushFollow(FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__29608);
            rule__Expanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__29611);
            rule__Expanded__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__2"


    // $ANTLR start "rule__Expanded__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4675:1: rule__Expanded__Group__2__Impl : ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) ;
    public final void rule__Expanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4679:1: ( ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4680:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4680:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4681:1: ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4681:1: ( ( rule__Expanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4682:1: ( rule__Expanded__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4683:1: ( rule__Expanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4683:2: rule__Expanded__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl9640);
            rule__Expanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4686:1: ( ( rule__Expanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4687:1: ( rule__Expanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4688:1: ( rule__Expanded__WCharAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EGYSTRING||(LA36_0>=30 && LA36_0<=33)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4688:2: rule__Expanded__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl9652);
            	    rule__Expanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__2__Impl"


    // $ANTLR start "rule__Expanded__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4699:1: rule__Expanded__Group__3 : rule__Expanded__Group__3__Impl ;
    public final void rule__Expanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4703:1: ( rule__Expanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4704:2: rule__Expanded__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__39685);
            rule__Expanded__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__3"


    // $ANTLR start "rule__Expanded__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4710:1: rule__Expanded__Group__3__Impl : ( ')' ) ;
    public final void rule__Expanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4714:1: ( ( ')' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4715:1: ( ')' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4715:1: ( ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4716:1: ')'
            {
             before(grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__Expanded__Group__3__Impl9713); 
             after(grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__Group__3__Impl"


    // $ANTLR start "rule__Emendation__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4737:1: rule__Emendation__Group__0 : rule__Emendation__Group__0__Impl rule__Emendation__Group__1 ;
    public final void rule__Emendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4741:1: ( rule__Emendation__Group__0__Impl rule__Emendation__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4742:2: rule__Emendation__Group__0__Impl rule__Emendation__Group__1
            {
            pushFollow(FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__09752);
            rule__Emendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__09755);
            rule__Emendation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__0"


    // $ANTLR start "rule__Emendation__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4749:1: rule__Emendation__Group__0__Impl : ( () ) ;
    public final void rule__Emendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4753:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4754:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4754:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4755:1: ()
            {
             before(grammarAccess.getEmendationAccess().getEmendationAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4756:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4758:1: 
            {
            }

             after(grammarAccess.getEmendationAccess().getEmendationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__0__Impl"


    // $ANTLR start "rule__Emendation__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4768:1: rule__Emendation__Group__1 : rule__Emendation__Group__1__Impl rule__Emendation__Group__2 ;
    public final void rule__Emendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4772:1: ( rule__Emendation__Group__1__Impl rule__Emendation__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4773:2: rule__Emendation__Group__1__Impl rule__Emendation__Group__2
            {
            pushFollow(FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__19813);
            rule__Emendation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__19816);
            rule__Emendation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__1"


    // $ANTLR start "rule__Emendation__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4780:1: rule__Emendation__Group__1__Impl : ( '<' ) ;
    public final void rule__Emendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4784:1: ( ( '<' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4785:1: ( '<' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4785:1: ( '<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4786:1: '<'
            {
             before(grammarAccess.getEmendationAccess().getLessThanSignKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Emendation__Group__1__Impl9844); 
             after(grammarAccess.getEmendationAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__1__Impl"


    // $ANTLR start "rule__Emendation__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4799:1: rule__Emendation__Group__2 : rule__Emendation__Group__2__Impl rule__Emendation__Group__3 ;
    public final void rule__Emendation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4803:1: ( rule__Emendation__Group__2__Impl rule__Emendation__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4804:2: rule__Emendation__Group__2__Impl rule__Emendation__Group__3
            {
            pushFollow(FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__29875);
            rule__Emendation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__29878);
            rule__Emendation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__2"


    // $ANTLR start "rule__Emendation__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4811:1: rule__Emendation__Group__2__Impl : ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) ;
    public final void rule__Emendation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4815:1: ( ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4816:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4816:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4817:1: ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4817:1: ( ( rule__Emendation__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4818:1: ( rule__Emendation__WCharAssignment_2 )
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4819:1: ( rule__Emendation__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4819:2: rule__Emendation__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl9907);
            rule__Emendation__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4822:1: ( ( rule__Emendation__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4823:1: ( rule__Emendation__WCharAssignment_2 )*
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4824:1: ( rule__Emendation__WCharAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||(LA37_0>=30 && LA37_0<=34)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4824:2: rule__Emendation__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl9919);
            	    rule__Emendation__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__2__Impl"


    // $ANTLR start "rule__Emendation__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4835:1: rule__Emendation__Group__3 : rule__Emendation__Group__3__Impl ;
    public final void rule__Emendation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4839:1: ( rule__Emendation__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4840:2: rule__Emendation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__39952);
            rule__Emendation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__3"


    // $ANTLR start "rule__Emendation__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4846:1: rule__Emendation__Group__3__Impl : ( '>' ) ;
    public final void rule__Emendation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4850:1: ( ( '>' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4851:1: ( '>' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4851:1: ( '>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4852:1: '>'
            {
             before(grammarAccess.getEmendationAccess().getGreaterThanSignKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Emendation__Group__3__Impl9980); 
             after(grammarAccess.getEmendationAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__Group__3__Impl"


    // $ANTLR start "rule__DisputableReading__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4873:1: rule__DisputableReading__Group__0 : rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 ;
    public final void rule__DisputableReading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4877:1: ( rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4878:2: rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__010019);
            rule__DisputableReading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__010022);
            rule__DisputableReading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__0"


    // $ANTLR start "rule__DisputableReading__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4885:1: rule__DisputableReading__Group__0__Impl : ( () ) ;
    public final void rule__DisputableReading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4889:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4890:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4890:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4891:1: ()
            {
             before(grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4892:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4894:1: 
            {
            }

             after(grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__0__Impl"


    // $ANTLR start "rule__DisputableReading__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4904:1: rule__DisputableReading__Group__1 : rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 ;
    public final void rule__DisputableReading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4908:1: ( rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4909:2: rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__110080);
            rule__DisputableReading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__110083);
            rule__DisputableReading__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__1"


    // $ANTLR start "rule__DisputableReading__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4916:1: rule__DisputableReading__Group__1__Impl : ( '\\u2E2E' ) ;
    public final void rule__DisputableReading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4920:1: ( ( '\\u2E2E' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4921:1: ( '\\u2E2E' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4921:1: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4922:1: '\\u2E2E'
            {
             before(grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__DisputableReading__Group__1__Impl10111); 
             after(grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__1__Impl"


    // $ANTLR start "rule__DisputableReading__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4935:1: rule__DisputableReading__Group__2 : rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 ;
    public final void rule__DisputableReading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4939:1: ( rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4940:2: rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__210142);
            rule__DisputableReading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__210145);
            rule__DisputableReading__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__2"


    // $ANTLR start "rule__DisputableReading__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4947:1: rule__DisputableReading__Group__2__Impl : ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) ;
    public final void rule__DisputableReading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4951:1: ( ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4952:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4952:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4953:1: ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4953:1: ( ( rule__DisputableReading__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4954:1: ( rule__DisputableReading__WCharAssignment_2 )
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4955:1: ( rule__DisputableReading__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4955:2: rule__DisputableReading__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10174);
            rule__DisputableReading__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4958:1: ( ( rule__DisputableReading__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4959:1: ( rule__DisputableReading__WCharAssignment_2 )*
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4960:1: ( rule__DisputableReading__WCharAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EGYSTRING||(LA38_0>=30 && LA38_0<=34)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4960:2: rule__DisputableReading__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10186);
            	    rule__DisputableReading__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__2__Impl"


    // $ANTLR start "rule__DisputableReading__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4971:1: rule__DisputableReading__Group__3 : rule__DisputableReading__Group__3__Impl ;
    public final void rule__DisputableReading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4975:1: ( rule__DisputableReading__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4976:2: rule__DisputableReading__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__310219);
            rule__DisputableReading__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__3"


    // $ANTLR start "rule__DisputableReading__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4982:1: rule__DisputableReading__Group__3__Impl : ( '?' ) ;
    public final void rule__DisputableReading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4986:1: ( ( '?' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4987:1: ( '?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4987:1: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4988:1: '?'
            {
             before(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__DisputableReading__Group__3__Impl10247); 
             after(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__Group__3__Impl"


    // $ANTLR start "rule__Lacuna__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5009:1: rule__Lacuna__Group__0 : rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 ;
    public final void rule__Lacuna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5013:1: ( rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5014:2: rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__010286);
            rule__Lacuna__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__010289);
            rule__Lacuna__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__0"


    // $ANTLR start "rule__Lacuna__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5021:1: rule__Lacuna__Group__0__Impl : ( () ) ;
    public final void rule__Lacuna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5025:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5026:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5026:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5027:1: ()
            {
             before(grammarAccess.getLacunaAccess().getLacunaAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5028:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5030:1: 
            {
            }

             after(grammarAccess.getLacunaAccess().getLacunaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__0__Impl"


    // $ANTLR start "rule__Lacuna__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5040:1: rule__Lacuna__Group__1 : rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 ;
    public final void rule__Lacuna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5044:1: ( rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5045:2: rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__110347);
            rule__Lacuna__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__110350);
            rule__Lacuna__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__1"


    // $ANTLR start "rule__Lacuna__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5052:1: rule__Lacuna__Group__1__Impl : ( '[' ) ;
    public final void rule__Lacuna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5056:1: ( ( '[' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5057:1: ( '[' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5057:1: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5058:1: '['
            {
             before(grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Lacuna__Group__1__Impl10378); 
             after(grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__1__Impl"


    // $ANTLR start "rule__Lacuna__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5071:1: rule__Lacuna__Group__2 : rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 ;
    public final void rule__Lacuna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5075:1: ( rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5076:2: rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__210409);
            rule__Lacuna__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__210412);
            rule__Lacuna__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__2"


    // $ANTLR start "rule__Lacuna__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5083:1: rule__Lacuna__Group__2__Impl : ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) ;
    public final void rule__Lacuna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5087:1: ( ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5088:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5088:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5089:1: ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5089:1: ( ( rule__Lacuna__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5090:1: ( rule__Lacuna__WCharAssignment_2 )
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5091:1: ( rule__Lacuna__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5091:2: rule__Lacuna__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10441);
            rule__Lacuna__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5094:1: ( ( rule__Lacuna__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5095:1: ( rule__Lacuna__WCharAssignment_2 )*
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5096:1: ( rule__Lacuna__WCharAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EGYSTRING||(LA39_0>=30 && LA39_0<=34)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5096:2: rule__Lacuna__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10453);
            	    rule__Lacuna__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__2__Impl"


    // $ANTLR start "rule__Lacuna__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5107:1: rule__Lacuna__Group__3 : rule__Lacuna__Group__3__Impl ;
    public final void rule__Lacuna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5111:1: ( rule__Lacuna__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5112:2: rule__Lacuna__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__310486);
            rule__Lacuna__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__3"


    // $ANTLR start "rule__Lacuna__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5118:1: rule__Lacuna__Group__3__Impl : ( ']' ) ;
    public final void rule__Lacuna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5122:1: ( ( ']' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5123:1: ( ']' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5123:1: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5124:1: ']'
            {
             before(grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Lacuna__Group__3__Impl10514); 
             after(grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__Group__3__Impl"


    // $ANTLR start "rule__Deletion__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5145:1: rule__Deletion__Group__0 : rule__Deletion__Group__0__Impl rule__Deletion__Group__1 ;
    public final void rule__Deletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5149:1: ( rule__Deletion__Group__0__Impl rule__Deletion__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5150:2: rule__Deletion__Group__0__Impl rule__Deletion__Group__1
            {
            pushFollow(FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__010553);
            rule__Deletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__010556);
            rule__Deletion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__0"


    // $ANTLR start "rule__Deletion__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5157:1: rule__Deletion__Group__0__Impl : ( () ) ;
    public final void rule__Deletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5161:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5162:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5162:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5163:1: ()
            {
             before(grammarAccess.getDeletionAccess().getDeletionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5164:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5166:1: 
            {
            }

             after(grammarAccess.getDeletionAccess().getDeletionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__0__Impl"


    // $ANTLR start "rule__Deletion__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5176:1: rule__Deletion__Group__1 : rule__Deletion__Group__1__Impl rule__Deletion__Group__2 ;
    public final void rule__Deletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5180:1: ( rule__Deletion__Group__1__Impl rule__Deletion__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5181:2: rule__Deletion__Group__1__Impl rule__Deletion__Group__2
            {
            pushFollow(FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__110614);
            rule__Deletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__110617);
            rule__Deletion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__1"


    // $ANTLR start "rule__Deletion__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5188:1: rule__Deletion__Group__1__Impl : ( '{' ) ;
    public final void rule__Deletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5192:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5193:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5193:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5194:1: '{'
            {
             before(grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Deletion__Group__1__Impl10645); 
             after(grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__1__Impl"


    // $ANTLR start "rule__Deletion__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5207:1: rule__Deletion__Group__2 : rule__Deletion__Group__2__Impl rule__Deletion__Group__3 ;
    public final void rule__Deletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5211:1: ( rule__Deletion__Group__2__Impl rule__Deletion__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5212:2: rule__Deletion__Group__2__Impl rule__Deletion__Group__3
            {
            pushFollow(FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__210676);
            rule__Deletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__210679);
            rule__Deletion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__2"


    // $ANTLR start "rule__Deletion__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5219:1: rule__Deletion__Group__2__Impl : ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) ;
    public final void rule__Deletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5223:1: ( ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5224:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5224:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5225:1: ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5225:1: ( ( rule__Deletion__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5226:1: ( rule__Deletion__WCharAssignment_2 )
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5227:1: ( rule__Deletion__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5227:2: rule__Deletion__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl10708);
            rule__Deletion__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5230:1: ( ( rule__Deletion__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5231:1: ( rule__Deletion__WCharAssignment_2 )*
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5232:1: ( rule__Deletion__WCharAssignment_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_EGYSTRING||(LA40_0>=30 && LA40_0<=34)||LA40_0==52) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5232:2: rule__Deletion__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl10720);
            	    rule__Deletion__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__2__Impl"


    // $ANTLR start "rule__Deletion__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5243:1: rule__Deletion__Group__3 : rule__Deletion__Group__3__Impl ;
    public final void rule__Deletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5247:1: ( rule__Deletion__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5248:2: rule__Deletion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__310753);
            rule__Deletion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__3"


    // $ANTLR start "rule__Deletion__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5254:1: rule__Deletion__Group__3__Impl : ( '}' ) ;
    public final void rule__Deletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5258:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5259:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5259:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5260:1: '}'
            {
             before(grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__Deletion__Group__3__Impl10781); 
             after(grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__Group__3__Impl"


    // $ANTLR start "rule__ExpandedColumn__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5281:1: rule__ExpandedColumn__Group__0 : rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 ;
    public final void rule__ExpandedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5285:1: ( rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5286:2: rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__010820);
            rule__ExpandedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__010823);
            rule__ExpandedColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__0"


    // $ANTLR start "rule__ExpandedColumn__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5293:1: rule__ExpandedColumn__Group__0__Impl : ( () ) ;
    public final void rule__ExpandedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5297:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5298:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5298:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5299:1: ()
            {
             before(grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5300:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5302:1: 
            {
            }

             after(grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__0__Impl"


    // $ANTLR start "rule__ExpandedColumn__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5312:1: rule__ExpandedColumn__Group__1 : rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 ;
    public final void rule__ExpandedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5316:1: ( rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5317:2: rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__110881);
            rule__ExpandedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__110884);
            rule__ExpandedColumn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__1"


    // $ANTLR start "rule__ExpandedColumn__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5324:1: rule__ExpandedColumn__Group__1__Impl : ( '<<' ) ;
    public final void rule__ExpandedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5328:1: ( ( '<<' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5329:1: ( '<<' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5329:1: ( '<<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5330:1: '<<'
            {
             before(grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__ExpandedColumn__Group__1__Impl10912); 
             after(grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__1__Impl"


    // $ANTLR start "rule__ExpandedColumn__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5343:1: rule__ExpandedColumn__Group__2 : rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 ;
    public final void rule__ExpandedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5347:1: ( rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5348:2: rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__210943);
            rule__ExpandedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__210946);
            rule__ExpandedColumn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__2"


    // $ANTLR start "rule__ExpandedColumn__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5355:1: rule__ExpandedColumn__Group__2__Impl : ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) ;
    public final void rule__ExpandedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5359:1: ( ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5360:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5360:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5361:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5361:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5362:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5363:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5363:2: rule__ExpandedColumn__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl10975);
            rule__ExpandedColumn__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5366:1: ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5367:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5368:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_EGYSTRING||(LA41_0>=30 && LA41_0<=34)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5368:2: rule__ExpandedColumn__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl10987);
            	    rule__ExpandedColumn__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__2__Impl"


    // $ANTLR start "rule__ExpandedColumn__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5379:1: rule__ExpandedColumn__Group__3 : rule__ExpandedColumn__Group__3__Impl ;
    public final void rule__ExpandedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5383:1: ( rule__ExpandedColumn__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5384:2: rule__ExpandedColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__311020);
            rule__ExpandedColumn__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__3"


    // $ANTLR start "rule__ExpandedColumn__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5390:1: rule__ExpandedColumn__Group__3__Impl : ( '>>' ) ;
    public final void rule__ExpandedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5394:1: ( ( '>>' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5395:1: ( '>>' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5395:1: ( '>>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5396:1: '>>'
            {
             before(grammarAccess.getExpandedColumnAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__ExpandedColumn__Group__3__Impl11048); 
             after(grammarAccess.getExpandedColumnAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__Group__3__Impl"


    // $ANTLR start "rule__Rasur__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5417:1: rule__Rasur__Group__0 : rule__Rasur__Group__0__Impl rule__Rasur__Group__1 ;
    public final void rule__Rasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5421:1: ( rule__Rasur__Group__0__Impl rule__Rasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5422:2: rule__Rasur__Group__0__Impl rule__Rasur__Group__1
            {
            pushFollow(FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__011087);
            rule__Rasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__011090);
            rule__Rasur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__0"


    // $ANTLR start "rule__Rasur__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5429:1: rule__Rasur__Group__0__Impl : ( () ) ;
    public final void rule__Rasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5433:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5434:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5434:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5435:1: ()
            {
             before(grammarAccess.getRasurAccess().getRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5436:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5438:1: 
            {
            }

             after(grammarAccess.getRasurAccess().getRasurAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__0__Impl"


    // $ANTLR start "rule__Rasur__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5448:1: rule__Rasur__Group__1 : rule__Rasur__Group__1__Impl rule__Rasur__Group__2 ;
    public final void rule__Rasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5452:1: ( rule__Rasur__Group__1__Impl rule__Rasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5453:2: rule__Rasur__Group__1__Impl rule__Rasur__Group__2
            {
            pushFollow(FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__111148);
            rule__Rasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__111151);
            rule__Rasur__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__1"


    // $ANTLR start "rule__Rasur__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5460:1: rule__Rasur__Group__1__Impl : ( '{{' ) ;
    public final void rule__Rasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5464:1: ( ( '{{' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5465:1: ( '{{' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5465:1: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5466:1: '{{'
            {
             before(grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__Rasur__Group__1__Impl11179); 
             after(grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__1__Impl"


    // $ANTLR start "rule__Rasur__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5479:1: rule__Rasur__Group__2 : rule__Rasur__Group__2__Impl rule__Rasur__Group__3 ;
    public final void rule__Rasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5483:1: ( rule__Rasur__Group__2__Impl rule__Rasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5484:2: rule__Rasur__Group__2__Impl rule__Rasur__Group__3
            {
            pushFollow(FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__211210);
            rule__Rasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__211213);
            rule__Rasur__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__2"


    // $ANTLR start "rule__Rasur__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5491:1: rule__Rasur__Group__2__Impl : ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) ;
    public final void rule__Rasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5495:1: ( ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5496:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5496:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5497:1: ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5497:1: ( ( rule__Rasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5498:1: ( rule__Rasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5499:1: ( rule__Rasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5499:2: rule__Rasur__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11242);
            rule__Rasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRasurAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5502:1: ( ( rule__Rasur__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5503:1: ( rule__Rasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5504:1: ( rule__Rasur__WCharAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_EGYSTRING||(LA42_0>=30 && LA42_0<=34)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5504:2: rule__Rasur__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11254);
            	    rule__Rasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getRasurAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__2__Impl"


    // $ANTLR start "rule__Rasur__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5515:1: rule__Rasur__Group__3 : rule__Rasur__Group__3__Impl ;
    public final void rule__Rasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5519:1: ( rule__Rasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5520:2: rule__Rasur__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__311287);
            rule__Rasur__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__3"


    // $ANTLR start "rule__Rasur__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5526:1: rule__Rasur__Group__3__Impl : ( '}}' ) ;
    public final void rule__Rasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5530:1: ( ( '}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5531:1: ( '}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5531:1: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5532:1: '}}'
            {
             before(grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__Rasur__Group__3__Impl11315); 
             after(grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__Group__3__Impl"


    // $ANTLR start "rule__AncientExpanded__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5553:1: rule__AncientExpanded__Group__0 : rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 ;
    public final void rule__AncientExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5557:1: ( rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5558:2: rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__011354);
            rule__AncientExpanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__011357);
            rule__AncientExpanded__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__0"


    // $ANTLR start "rule__AncientExpanded__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5565:1: rule__AncientExpanded__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5569:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5570:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5570:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5571:1: ()
            {
             before(grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5572:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5574:1: 
            {
            }

             after(grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__0__Impl"


    // $ANTLR start "rule__AncientExpanded__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5584:1: rule__AncientExpanded__Group__1 : rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 ;
    public final void rule__AncientExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5588:1: ( rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5589:2: rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__111415);
            rule__AncientExpanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__111418);
            rule__AncientExpanded__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__1"


    // $ANTLR start "rule__AncientExpanded__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5596:1: rule__AncientExpanded__Group__1__Impl : ( '((' ) ;
    public final void rule__AncientExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5600:1: ( ( '((' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5601:1: ( '((' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5601:1: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5602:1: '(('
            {
             before(grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__AncientExpanded__Group__1__Impl11446); 
             after(grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__1__Impl"


    // $ANTLR start "rule__AncientExpanded__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5615:1: rule__AncientExpanded__Group__2 : rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 ;
    public final void rule__AncientExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5619:1: ( rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5620:2: rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__211477);
            rule__AncientExpanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__211480);
            rule__AncientExpanded__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__2"


    // $ANTLR start "rule__AncientExpanded__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5627:1: rule__AncientExpanded__Group__2__Impl : ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) ;
    public final void rule__AncientExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5631:1: ( ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5632:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5632:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5633:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5633:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5634:1: ( rule__AncientExpanded__WCharAssignment_2 )
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5635:1: ( rule__AncientExpanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5635:2: rule__AncientExpanded__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11509);
            rule__AncientExpanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5638:1: ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5639:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5640:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_EGYSTRING||LA43_0==34) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5640:2: rule__AncientExpanded__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11521);
            	    rule__AncientExpanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__2__Impl"


    // $ANTLR start "rule__AncientExpanded__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5651:1: rule__AncientExpanded__Group__3 : rule__AncientExpanded__Group__3__Impl ;
    public final void rule__AncientExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5655:1: ( rule__AncientExpanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5656:2: rule__AncientExpanded__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__311554);
            rule__AncientExpanded__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__3"


    // $ANTLR start "rule__AncientExpanded__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5662:1: rule__AncientExpanded__Group__3__Impl : ( '))' ) ;
    public final void rule__AncientExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5666:1: ( ( '))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5667:1: ( '))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5667:1: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5668:1: '))'
            {
             before(grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__AncientExpanded__Group__3__Impl11582); 
             after(grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__Group__3__Impl"


    // $ANTLR start "rule__RestorationOverRasur__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5689:1: rule__RestorationOverRasur__Group__0 : rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 ;
    public final void rule__RestorationOverRasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5693:1: ( rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5694:2: rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__011621);
            rule__RestorationOverRasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__011624);
            rule__RestorationOverRasur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__0"


    // $ANTLR start "rule__RestorationOverRasur__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5701:1: rule__RestorationOverRasur__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5705:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5706:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5706:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5707:1: ()
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5708:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5710:1: 
            {
            }

             after(grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__0__Impl"


    // $ANTLR start "rule__RestorationOverRasur__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5720:1: rule__RestorationOverRasur__Group__1 : rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 ;
    public final void rule__RestorationOverRasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5724:1: ( rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5725:2: rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__111682);
            rule__RestorationOverRasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__111685);
            rule__RestorationOverRasur__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__1"


    // $ANTLR start "rule__RestorationOverRasur__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5732:1: rule__RestorationOverRasur__Group__1__Impl : ( '[[' ) ;
    public final void rule__RestorationOverRasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5736:1: ( ( '[[' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5737:1: ( '[[' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5737:1: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5738:1: '[['
            {
             before(grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__RestorationOverRasur__Group__1__Impl11713); 
             after(grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__1__Impl"


    // $ANTLR start "rule__RestorationOverRasur__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5751:1: rule__RestorationOverRasur__Group__2 : rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 ;
    public final void rule__RestorationOverRasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5755:1: ( rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5756:2: rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__211744);
            rule__RestorationOverRasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__211747);
            rule__RestorationOverRasur__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__2"


    // $ANTLR start "rule__RestorationOverRasur__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5763:1: rule__RestorationOverRasur__Group__2__Impl : ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) ;
    public final void rule__RestorationOverRasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5767:1: ( ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5768:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5768:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5769:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5769:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5770:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5771:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5771:2: rule__RestorationOverRasur__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl11776);
            rule__RestorationOverRasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5774:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5775:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5776:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_EGYSTRING||LA44_0==34) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5776:2: rule__RestorationOverRasur__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl11788);
            	    rule__RestorationOverRasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__2__Impl"


    // $ANTLR start "rule__RestorationOverRasur__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5787:1: rule__RestorationOverRasur__Group__3 : rule__RestorationOverRasur__Group__3__Impl ;
    public final void rule__RestorationOverRasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5791:1: ( rule__RestorationOverRasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5792:2: rule__RestorationOverRasur__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__311821);
            rule__RestorationOverRasur__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__3"


    // $ANTLR start "rule__RestorationOverRasur__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5798:1: rule__RestorationOverRasur__Group__3__Impl : ( ']]' ) ;
    public final void rule__RestorationOverRasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5802:1: ( ( ']]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5803:1: ( ']]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5803:1: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5804:1: ']]'
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,51,FOLLOW_51_in_rule__RestorationOverRasur__Group__3__Impl11849); 
             after(grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__Group__3__Impl"


    // $ANTLR start "rule__PartialDestruction__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5825:1: rule__PartialDestruction__Group__0 : rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 ;
    public final void rule__PartialDestruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5829:1: ( rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5830:2: rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__011888);
            rule__PartialDestruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__011891);
            rule__PartialDestruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__0"


    // $ANTLR start "rule__PartialDestruction__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5837:1: rule__PartialDestruction__Group__0__Impl : ( () ) ;
    public final void rule__PartialDestruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5841:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5842:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5842:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5843:1: ()
            {
             before(grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5844:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5846:1: 
            {
            }

             after(grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__0__Impl"


    // $ANTLR start "rule__PartialDestruction__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5856:1: rule__PartialDestruction__Group__1 : rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 ;
    public final void rule__PartialDestruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5860:1: ( rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5861:2: rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__111949);
            rule__PartialDestruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__111952);
            rule__PartialDestruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__1"


    // $ANTLR start "rule__PartialDestruction__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5868:1: rule__PartialDestruction__Group__1__Impl : ( '\\u2E22' ) ;
    public final void rule__PartialDestruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5872:1: ( ( '\\u2E22' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5873:1: ( '\\u2E22' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5873:1: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5874:1: '\\u2E22'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__PartialDestruction__Group__1__Impl11980); 
             after(grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__1__Impl"


    // $ANTLR start "rule__PartialDestruction__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5887:1: rule__PartialDestruction__Group__2 : rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 ;
    public final void rule__PartialDestruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5891:1: ( rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5892:2: rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__212011);
            rule__PartialDestruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__212014);
            rule__PartialDestruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__2"


    // $ANTLR start "rule__PartialDestruction__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5899:1: rule__PartialDestruction__Group__2__Impl : ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) ;
    public final void rule__PartialDestruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5903:1: ( ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5904:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5904:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5905:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5905:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5906:1: ( rule__PartialDestruction__WCharAssignment_2 )
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5907:1: ( rule__PartialDestruction__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5907:2: rule__PartialDestruction__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12043);
            rule__PartialDestruction__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5910:1: ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5911:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5912:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_EGYSTRING||(LA45_0>=30 && LA45_0<=34)||LA45_0==42) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5912:2: rule__PartialDestruction__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12055);
            	    rule__PartialDestruction__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__2__Impl"


    // $ANTLR start "rule__PartialDestruction__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5923:1: rule__PartialDestruction__Group__3 : rule__PartialDestruction__Group__3__Impl ;
    public final void rule__PartialDestruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5927:1: ( rule__PartialDestruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5928:2: rule__PartialDestruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__312088);
            rule__PartialDestruction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__3"


    // $ANTLR start "rule__PartialDestruction__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5934:1: rule__PartialDestruction__Group__3__Impl : ( '\\u2E23' ) ;
    public final void rule__PartialDestruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5938:1: ( ( '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5939:1: ( '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5939:1: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5940:1: '\\u2E23'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3()); 
            match(input,53,FOLLOW_53_in_rule__PartialDestruction__Group__3__Impl12116); 
             after(grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__Group__3__Impl"


    // $ANTLR start "rule__Destruction__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5961:1: rule__Destruction__Group__0 : rule__Destruction__Group__0__Impl rule__Destruction__Group__1 ;
    public final void rule__Destruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5965:1: ( rule__Destruction__Group__0__Impl rule__Destruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5966:2: rule__Destruction__Group__0__Impl rule__Destruction__Group__1
            {
            pushFollow(FOLLOW_rule__Destruction__Group__0__Impl_in_rule__Destruction__Group__012155);
            rule__Destruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Destruction__Group__1_in_rule__Destruction__Group__012158);
            rule__Destruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__0"


    // $ANTLR start "rule__Destruction__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:1: rule__Destruction__Group__0__Impl : ( () ) ;
    public final void rule__Destruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5977:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5978:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5978:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5979:1: ()
            {
             before(grammarAccess.getDestructionAccess().getDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5982:1: 
            {
            }

             after(grammarAccess.getDestructionAccess().getDestructionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__0__Impl"


    // $ANTLR start "rule__Destruction__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:1: rule__Destruction__Group__1 : rule__Destruction__Group__1__Impl rule__Destruction__Group__2 ;
    public final void rule__Destruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5996:1: ( rule__Destruction__Group__1__Impl rule__Destruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5997:2: rule__Destruction__Group__1__Impl rule__Destruction__Group__2
            {
            pushFollow(FOLLOW_rule__Destruction__Group__1__Impl_in_rule__Destruction__Group__112216);
            rule__Destruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Destruction__Group__2_in_rule__Destruction__Group__112219);
            rule__Destruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__1"


    // $ANTLR start "rule__Destruction__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6004:1: rule__Destruction__Group__1__Impl : ( '--' ) ;
    public final void rule__Destruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6008:1: ( ( '--' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6009:1: ( '--' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6009:1: ( '--' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6010:1: '--'
            {
             before(grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__Destruction__Group__1__Impl12247); 
             after(grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__1__Impl"


    // $ANTLR start "rule__Destruction__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6023:1: rule__Destruction__Group__2 : rule__Destruction__Group__2__Impl rule__Destruction__Group__3 ;
    public final void rule__Destruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6027:1: ( rule__Destruction__Group__2__Impl rule__Destruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6028:2: rule__Destruction__Group__2__Impl rule__Destruction__Group__3
            {
            pushFollow(FOLLOW_rule__Destruction__Group__2__Impl_in_rule__Destruction__Group__212278);
            rule__Destruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Destruction__Group__3_in_rule__Destruction__Group__212281);
            rule__Destruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__2"


    // $ANTLR start "rule__Destruction__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6035:1: rule__Destruction__Group__2__Impl : ( ( rule__Destruction__CommentAssignment_2 ) ) ;
    public final void rule__Destruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6039:1: ( ( ( rule__Destruction__CommentAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6040:1: ( ( rule__Destruction__CommentAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6040:1: ( ( rule__Destruction__CommentAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6041:1: ( rule__Destruction__CommentAssignment_2 )
            {
             before(grammarAccess.getDestructionAccess().getCommentAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6042:1: ( rule__Destruction__CommentAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6042:2: rule__Destruction__CommentAssignment_2
            {
            pushFollow(FOLLOW_rule__Destruction__CommentAssignment_2_in_rule__Destruction__Group__2__Impl12308);
            rule__Destruction__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDestructionAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__2__Impl"


    // $ANTLR start "rule__Destruction__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6052:1: rule__Destruction__Group__3 : rule__Destruction__Group__3__Impl ;
    public final void rule__Destruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6056:1: ( rule__Destruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6057:2: rule__Destruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Destruction__Group__3__Impl_in_rule__Destruction__Group__312338);
            rule__Destruction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__3"


    // $ANTLR start "rule__Destruction__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6063:1: rule__Destruction__Group__3__Impl : ( '--' ) ;
    public final void rule__Destruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6067:1: ( ( '--' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6068:1: ( '--' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6068:1: ( '--' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6069:1: '--'
            {
             before(grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_3()); 
            match(input,54,FOLLOW_54_in_rule__Destruction__Group__3__Impl12366); 
             after(grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__Group__3__Impl"


    // $ANTLR start "rule__TextContent__ItemsAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6091:1: rule__TextContent__ItemsAssignment_1_0 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6095:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6096:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6096:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6097:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_012410);
            ruleTextItem();

            state._fsp--;

             after(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__ItemsAssignment_1_0"


    // $ANTLR start "rule__TextContent__ItemsAssignment_1_1_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6106:1: rule__TextContent__ItemsAssignment_1_1_1 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6110:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6111:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6111:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6112:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_1_112441);
            ruleTextItem();

            state._fsp--;

             after(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__ItemsAssignment_1_1_1"


    // $ANTLR start "rule__Sentence__ItemsAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6121:1: rule__Sentence__ItemsAssignment_1_0 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6125:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6126:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6126:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6127:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_012472);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__ItemsAssignment_1_0"


    // $ANTLR start "rule__Sentence__ItemsAssignment_1_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6136:1: rule__Sentence__ItemsAssignment_1_1_2 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6140:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6141:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6141:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6142:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_1_212503);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__ItemsAssignment_1_1_2"


    // $ANTLR start "rule__Ambivalence__CasesAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6151:1: rule__Ambivalence__CasesAssignment_1_0 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6155:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6156:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6156:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6157:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_012534);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__CasesAssignment_1_0"


    // $ANTLR start "rule__Ambivalence__CasesAssignment_1_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6166:1: rule__Ambivalence__CasesAssignment_1_1_2 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6170:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6171:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6171:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6172:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_212565);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__CasesAssignment_1_1_2"


    // $ANTLR start "rule__Case__NameAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6181:1: rule__Case__NameAssignment_1 : ( RULE_EGYSTRING ) ;
    public final void rule__Case__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6185:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6186:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6186:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6187:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCaseAccess().getNameEGYSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_rule__Case__NameAssignment_112596); 
             after(grammarAccess.getCaseAccess().getNameEGYSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__NameAssignment_1"


    // $ANTLR start "rule__Case__ItemsAssignment_4_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6196:1: rule__Case__ItemsAssignment_4_0 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6200:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6201:1: ( ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6201:1: ( ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6202:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_4_012627);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ItemsAssignment_4_0"


    // $ANTLR start "rule__Case__ItemsAssignment_4_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6211:1: rule__Case__ItemsAssignment_4_1_2 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6215:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6216:1: ( ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6216:1: ( ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6217:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_4_1_212658);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ItemsAssignment_4_1_2"


    // $ANTLR start "rule__Marker__TypeAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6226:1: rule__Marker__TypeAssignment_1_0 : ( RULE_EGYSTRING ) ;
    public final void rule__Marker__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6230:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6231:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6231:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6232:1: RULE_EGYSTRING
            {
             before(grammarAccess.getMarkerAccess().getTypeEGYSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_rule__Marker__TypeAssignment_1_012689); 
             after(grammarAccess.getMarkerAccess().getTypeEGYSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__TypeAssignment_1_0"


    // $ANTLR start "rule__Marker__NameAssignment_1_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6241:1: rule__Marker__NameAssignment_1_1_2 : ( RULE_EGYSTRING ) ;
    public final void rule__Marker__NameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6245:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6246:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6246:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6247:1: RULE_EGYSTRING
            {
             before(grammarAccess.getMarkerAccess().getNameEGYSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_rule__Marker__NameAssignment_1_1_212720); 
             after(grammarAccess.getMarkerAccess().getNameEGYSTRINGTerminalRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__NameAssignment_1_1_2"


    // $ANTLR start "rule__Word__WCharAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6256:1: rule__Word__WCharAssignment_1_0 : ( ruleWordPart ) ;
    public final void rule__Word__WCharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6260:1: ( ( ruleWordPart ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6261:1: ( ruleWordPart )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6261:1: ( ruleWordPart )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6262:1: ruleWordPart
            {
             before(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_012751);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__WCharAssignment_1_0"


    // $ANTLR start "rule__Word__WCharAssignment_1_1_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6271:1: rule__Word__WCharAssignment_1_1_1 : ( ruleWordPart ) ;
    public final void rule__Word__WCharAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6275:1: ( ( ruleWordPart ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6276:1: ( ruleWordPart )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6276:1: ( ruleWordPart )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6277:1: ruleWordPart
            {
             before(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_1_112782);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__WCharAssignment_1_1_1"


    // $ANTLR start "rule__WordPart__WCharAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6286:1: rule__WordPart__WCharAssignment_1_0 : ( ruleWordMiddle ) ;
    public final void rule__WordPart__WCharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6290:1: ( ( ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6291:1: ( ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6291:1: ( ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6292:1: ruleWordMiddle
            {
             before(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_012813);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__WCharAssignment_1_0"


    // $ANTLR start "rule__WordPart__WCharAssignment_1_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6301:1: rule__WordPart__WCharAssignment_1_1 : ( ruleWordMiddle ) ;
    public final void rule__WordPart__WCharAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6305:1: ( ( ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6306:1: ( ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6306:1: ( ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6307:1: ruleWordMiddle
            {
             before(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_112844);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__WCharAssignment_1_1"


    // $ANTLR start "rule__WordPart__WCharAssignment_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6316:1: rule__WordPart__WCharAssignment_1_2 : ( ruleWordEnding ) ;
    public final void rule__WordPart__WCharAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6320:1: ( ( ruleWordEnding ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6321:1: ( ruleWordEnding )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6321:1: ( ruleWordEnding )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6322:1: ruleWordEnding
            {
             before(grammarAccess.getWordPartAccess().getWCharWordEndingParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleWordEnding_in_rule__WordPart__WCharAssignment_1_212875);
            ruleWordEnding();

            state._fsp--;

             after(grammarAccess.getWordPartAccess().getWCharWordEndingParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__WCharAssignment_1_2"


    // $ANTLR start "rule__WordPart__WCharAssignment_1_3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6331:1: rule__WordPart__WCharAssignment_1_3 : ( ruleWordEnding ) ;
    public final void rule__WordPart__WCharAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6335:1: ( ( ruleWordEnding ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6336:1: ( ruleWordEnding )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6336:1: ( ruleWordEnding )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6337:1: ruleWordEnding
            {
             before(grammarAccess.getWordPartAccess().getWCharWordEndingParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleWordEnding_in_rule__WordPart__WCharAssignment_1_312906);
            ruleWordEnding();

            state._fsp--;

             after(grammarAccess.getWordPartAccess().getWCharWordEndingParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__WCharAssignment_1_3"


    // $ANTLR start "rule__DualEnding__InterfixAssignment_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6346:1: rule__DualEnding__InterfixAssignment_0 : ( ruleInterfixFlexion ) ;
    public final void rule__DualEnding__InterfixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6350:1: ( ( ruleInterfixFlexion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6351:1: ( ruleInterfixFlexion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6351:1: ( ruleInterfixFlexion )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6352:1: ruleInterfixFlexion
            {
             before(grammarAccess.getDualEndingAccess().getInterfixInterfixFlexionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_rule__DualEnding__InterfixAssignment_012937);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getDualEndingAccess().getInterfixInterfixFlexionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualEnding__InterfixAssignment_0"


    // $ANTLR start "rule__DualEnding__CharsAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6361:1: rule__DualEnding__CharsAssignment_1 : ( ruleDualChars ) ;
    public final void rule__DualEnding__CharsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6365:1: ( ( ruleDualChars ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6366:1: ( ruleDualChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6366:1: ( ruleDualChars )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6367:1: ruleDualChars
            {
             before(grammarAccess.getDualEndingAccess().getCharsDualCharsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDualChars_in_rule__DualEnding__CharsAssignment_112968);
            ruleDualChars();

            state._fsp--;

             after(grammarAccess.getDualEndingAccess().getCharsDualCharsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualEnding__CharsAssignment_1"


    // $ANTLR start "rule__DualChars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6376:1: rule__DualChars__NameAssignment : ( RULE_DUALSTRING ) ;
    public final void rule__DualChars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6380:1: ( ( RULE_DUALSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6381:1: ( RULE_DUALSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6381:1: ( RULE_DUALSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6382:1: RULE_DUALSTRING
            {
             before(grammarAccess.getDualCharsAccess().getNameDUALSTRINGTerminalRuleCall_0()); 
            match(input,RULE_DUALSTRING,FOLLOW_RULE_DUALSTRING_in_rule__DualChars__NameAssignment12999); 
             after(grammarAccess.getDualCharsAccess().getNameDUALSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DualChars__NameAssignment"


    // $ANTLR start "rule__PluralChars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6391:1: rule__PluralChars__NameAssignment : ( RULE_PLURALSTRING ) ;
    public final void rule__PluralChars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6395:1: ( ( RULE_PLURALSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6396:1: ( RULE_PLURALSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6396:1: ( RULE_PLURALSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6397:1: RULE_PLURALSTRING
            {
             before(grammarAccess.getPluralCharsAccess().getNamePLURALSTRINGTerminalRuleCall_0()); 
            match(input,RULE_PLURALSTRING,FOLLOW_RULE_PLURALSTRING_in_rule__PluralChars__NameAssignment13030); 
             after(grammarAccess.getPluralCharsAccess().getNamePLURALSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralChars__NameAssignment"


    // $ANTLR start "rule__PluralEnding__InterfixAssignment_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6406:1: rule__PluralEnding__InterfixAssignment_0 : ( ruleInterfixFlexion ) ;
    public final void rule__PluralEnding__InterfixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6410:1: ( ( ruleInterfixFlexion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6411:1: ( ruleInterfixFlexion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6411:1: ( ruleInterfixFlexion )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6412:1: ruleInterfixFlexion
            {
             before(grammarAccess.getPluralEndingAccess().getInterfixInterfixFlexionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_rule__PluralEnding__InterfixAssignment_013061);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getPluralEndingAccess().getInterfixInterfixFlexionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralEnding__InterfixAssignment_0"


    // $ANTLR start "rule__PluralEnding__CharsAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6421:1: rule__PluralEnding__CharsAssignment_1 : ( rulePluralChars ) ;
    public final void rule__PluralEnding__CharsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6425:1: ( ( rulePluralChars ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6426:1: ( rulePluralChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6426:1: ( rulePluralChars )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6427:1: rulePluralChars
            {
             before(grammarAccess.getPluralEndingAccess().getCharsPluralCharsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePluralChars_in_rule__PluralEnding__CharsAssignment_113092);
            rulePluralChars();

            state._fsp--;

             after(grammarAccess.getPluralEndingAccess().getCharsPluralCharsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluralEnding__CharsAssignment_1"


    // $ANTLR start "rule__InterfixFlexionEding__InterfixAssignment_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6436:1: rule__InterfixFlexionEding__InterfixAssignment_0 : ( ruleInterfixFlexion ) ;
    public final void rule__InterfixFlexionEding__InterfixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6440:1: ( ( ruleInterfixFlexion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6441:1: ( ruleInterfixFlexion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6441:1: ( ruleInterfixFlexion )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6442:1: ruleInterfixFlexion
            {
             before(grammarAccess.getInterfixFlexionEdingAccess().getInterfixInterfixFlexionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_rule__InterfixFlexionEding__InterfixAssignment_013123);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionEdingAccess().getInterfixInterfixFlexionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexionEding__InterfixAssignment_0"


    // $ANTLR start "rule__InterfixFlexionEding__CharsAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6451:1: rule__InterfixFlexionEding__CharsAssignment_1 : ( ruleSuffixChars ) ;
    public final void rule__InterfixFlexionEding__CharsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6455:1: ( ( ruleSuffixChars ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6456:1: ( ruleSuffixChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6456:1: ( ruleSuffixChars )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6457:1: ruleSuffixChars
            {
             before(grammarAccess.getInterfixFlexionEdingAccess().getCharsSuffixCharsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSuffixChars_in_rule__InterfixFlexionEding__CharsAssignment_113154);
            ruleSuffixChars();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionEdingAccess().getCharsSuffixCharsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixFlexionEding__CharsAssignment_1"


    // $ANTLR start "rule__InterfixLexicalEnding__InterfixAssignment_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6466:1: rule__InterfixLexicalEnding__InterfixAssignment_0 : ( ruleInterfixLexical ) ;
    public final void rule__InterfixLexicalEnding__InterfixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6470:1: ( ( ruleInterfixLexical ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6471:1: ( ruleInterfixLexical )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6471:1: ( ruleInterfixLexical )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6472:1: ruleInterfixLexical
            {
             before(grammarAccess.getInterfixLexicalEndingAccess().getInterfixInterfixLexicalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_rule__InterfixLexicalEnding__InterfixAssignment_013185);
            ruleInterfixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalEndingAccess().getInterfixInterfixLexicalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexicalEnding__InterfixAssignment_0"


    // $ANTLR start "rule__InterfixLexicalEnding__CharsAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6481:1: rule__InterfixLexicalEnding__CharsAssignment_1 : ( ruleSuffixChars ) ;
    public final void rule__InterfixLexicalEnding__CharsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6485:1: ( ( ruleSuffixChars ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6486:1: ( ruleSuffixChars )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6486:1: ( ruleSuffixChars )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6487:1: ruleSuffixChars
            {
             before(grammarAccess.getInterfixLexicalEndingAccess().getCharsSuffixCharsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSuffixChars_in_rule__InterfixLexicalEnding__CharsAssignment_113216);
            ruleSuffixChars();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalEndingAccess().getCharsSuffixCharsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixLexicalEnding__CharsAssignment_1"


    // $ANTLR start "rule__Chars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6496:1: rule__Chars__NameAssignment : ( RULE_EGYSTRING ) ;
    public final void rule__Chars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6500:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6501:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6501:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6502:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment13247); 
             after(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chars__NameAssignment"


    // $ANTLR start "rule__SuffixChars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6511:1: rule__SuffixChars__NameAssignment : ( RULE_SUFFIXSTRING ) ;
    public final void rule__SuffixChars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6515:1: ( ( RULE_SUFFIXSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6516:1: ( RULE_SUFFIXSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6516:1: ( RULE_SUFFIXSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6517:1: RULE_SUFFIXSTRING
            {
             before(grammarAccess.getSuffixCharsAccess().getNameSUFFIXSTRINGTerminalRuleCall_0()); 
            match(input,RULE_SUFFIXSTRING,FOLLOW_RULE_SUFFIXSTRING_in_rule__SuffixChars__NameAssignment13278); 
             after(grammarAccess.getSuffixCharsAccess().getNameSUFFIXSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuffixChars__NameAssignment"


    // $ANTLR start "rule__Expanded__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6526:1: rule__Expanded__WCharAssignment_2 : ( ruleNoExpanded ) ;
    public final void rule__Expanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6530:1: ( ( ruleNoExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6531:1: ( ruleNoExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6531:1: ( ruleNoExpanded )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6532:1: ruleNoExpanded
            {
             before(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_213309);
            ruleNoExpanded();

            state._fsp--;

             after(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expanded__WCharAssignment_2"


    // $ANTLR start "rule__Emendation__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6541:1: rule__Emendation__WCharAssignment_2 : ( ruleNoEmendation ) ;
    public final void rule__Emendation__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6545:1: ( ( ruleNoEmendation ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6546:1: ( ruleNoEmendation )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6546:1: ( ruleNoEmendation )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6547:1: ruleNoEmendation
            {
             before(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_213340);
            ruleNoEmendation();

            state._fsp--;

             after(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emendation__WCharAssignment_2"


    // $ANTLR start "rule__DisputableReading__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6556:1: rule__DisputableReading__WCharAssignment_2 : ( ruleNoDisputableReading ) ;
    public final void rule__DisputableReading__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6560:1: ( ( ruleNoDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6561:1: ( ruleNoDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6561:1: ( ruleNoDisputableReading )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6562:1: ruleNoDisputableReading
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_213371);
            ruleNoDisputableReading();

            state._fsp--;

             after(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableReading__WCharAssignment_2"


    // $ANTLR start "rule__Lacuna__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6571:1: rule__Lacuna__WCharAssignment_2 : ( ruleNoLacuna ) ;
    public final void rule__Lacuna__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6575:1: ( ( ruleNoLacuna ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6576:1: ( ruleNoLacuna )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6576:1: ( ruleNoLacuna )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6577:1: ruleNoLacuna
            {
             before(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_213402);
            ruleNoLacuna();

            state._fsp--;

             after(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lacuna__WCharAssignment_2"


    // $ANTLR start "rule__Deletion__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6586:1: rule__Deletion__WCharAssignment_2 : ( ruleNoDeletion ) ;
    public final void rule__Deletion__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6590:1: ( ( ruleNoDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6591:1: ( ruleNoDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6591:1: ( ruleNoDeletion )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6592:1: ruleNoDeletion
            {
             before(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_213433);
            ruleNoDeletion();

            state._fsp--;

             after(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deletion__WCharAssignment_2"


    // $ANTLR start "rule__ExpandedColumn__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6601:1: rule__ExpandedColumn__WCharAssignment_2 : ( ruleNoExpandedColumn ) ;
    public final void rule__ExpandedColumn__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6605:1: ( ( ruleNoExpandedColumn ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6606:1: ( ruleNoExpandedColumn )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6606:1: ( ruleNoExpandedColumn )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6607:1: ruleNoExpandedColumn
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_213464);
            ruleNoExpandedColumn();

            state._fsp--;

             after(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpandedColumn__WCharAssignment_2"


    // $ANTLR start "rule__Rasur__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6616:1: rule__Rasur__WCharAssignment_2 : ( ruleNoRasur ) ;
    public final void rule__Rasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6620:1: ( ( ruleNoRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6621:1: ( ruleNoRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6621:1: ( ruleNoRasur )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6622:1: ruleNoRasur
            {
             before(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_213495);
            ruleNoRasur();

            state._fsp--;

             after(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rasur__WCharAssignment_2"


    // $ANTLR start "rule__AncientExpanded__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6631:1: rule__AncientExpanded__WCharAssignment_2 : ( ruleNoAncientExpanded ) ;
    public final void rule__AncientExpanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6635:1: ( ( ruleNoAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6636:1: ( ruleNoAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6636:1: ( ruleNoAncientExpanded )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6637:1: ruleNoAncientExpanded
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_213526);
            ruleNoAncientExpanded();

            state._fsp--;

             after(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpanded__WCharAssignment_2"


    // $ANTLR start "rule__RestorationOverRasur__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6646:1: rule__RestorationOverRasur__WCharAssignment_2 : ( ruleNoRestorationOverRasur ) ;
    public final void rule__RestorationOverRasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6650:1: ( ( ruleNoRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6651:1: ( ruleNoRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6651:1: ( ruleNoRestorationOverRasur )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6652:1: ruleNoRestorationOverRasur
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_213557);
            ruleNoRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasur__WCharAssignment_2"


    // $ANTLR start "rule__PartialDestruction__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6661:1: rule__PartialDestruction__WCharAssignment_2 : ( ruleNoPartialDestruction ) ;
    public final void rule__PartialDestruction__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6665:1: ( ( ruleNoPartialDestruction ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6666:1: ( ruleNoPartialDestruction )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6666:1: ( ruleNoPartialDestruction )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6667:1: ruleNoPartialDestruction
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_213588);
            ruleNoPartialDestruction();

            state._fsp--;

             after(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestruction__WCharAssignment_2"


    // $ANTLR start "rule__Destruction__CommentAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6676:1: rule__Destruction__CommentAssignment_2 : ( RULE_EGYSTRING ) ;
    public final void rule__Destruction__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6680:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6681:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6681:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6682:1: RULE_EGYSTRING
            {
             before(grammarAccess.getDestructionAccess().getCommentEGYSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_rule__Destruction__CommentAssignment_213619); 
             after(grammarAccess.getDestructionAccess().getCommentEGYSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruction__CommentAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTextContent_in_entryRuleTextContent61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextContent68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0_in_ruleTextContent94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_entryRuleTextItem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextItem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleTextItem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__0_in_ruleSentence213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItem247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SentenceItem__Alternatives_in_ruleSentenceItem273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMarker307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractMarker__Alternatives_in_ruleAbstractMarker333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAmbivalence367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__0_in_ruleAmbivalence393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0_in_ruleCase453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SentenceItemNoAmbivalence__Alternatives_in_ruleSentenceItemNoAmbivalence513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_entryRuleVersMarker540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersMarker547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersMarker__Alternatives_in_ruleVersMarker573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__0_in_ruleVersFrontierMarker633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__0_in_ruleVersbreakMarker693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__0_in_ruleBrokenVersbreakMarker753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarker787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group__0_in_ruleMarker813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group__0_in_ruleWord873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordPart907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group__0_in_ruleWordPart933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordEnding_in_entryRuleWordEnding960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordEnding967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordEnding__Alternatives_in_ruleWordEnding993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDualEnding_in_entryRuleDualEnding1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDualEnding1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DualEnding__Group__0_in_ruleDualEnding1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDualChars_in_entryRuleDualChars1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDualChars1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DualChars__NameAssignment_in_ruleDualChars1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluralChars_in_entryRulePluralChars1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluralChars1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PluralChars__NameAssignment_in_rulePluralChars1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluralEnding_in_entryRulePluralEnding1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluralEnding1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PluralEnding__Group__0_in_rulePluralEnding1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexionEding_in_entryRuleInterfixFlexionEding1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexionEding1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexionEding__Group__0_in_ruleInterfixFlexionEding1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexicalEnding_in_entryRuleInterfixLexicalEnding1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexicalEnding1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexicalEnding__Group__0_in_ruleInterfixLexicalEnding1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_entryRuleChars1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChars1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chars__NameAssignment_in_ruleChars1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuffixChars_in_entryRuleSuffixChars1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuffixChars1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuffixChars__NameAssignment_in_ruleSuffixChars1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfix1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interfix__Alternatives_in_ruleInterfix1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__0_in_ruleInterfixLexical1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__0_in_ruleInterfixFlexion1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__0_in_ruleInterfixSuffixPronomLexical1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__0_in_ruleInterfixPrefixNonLexical1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__0_in_ruleInterfixPrefixLexical1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0_in_ruleInterfixConnectionSyllabicGroup1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpanded2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__0_in_ruleExpanded2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoExpanded__Alternatives_in_ruleNoExpanded2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmendation2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__0_in_ruleEmendation2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLacuna2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion2522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletion2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__0_in_ruleDeletion2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn2642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn2702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur2762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasur2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__0_in_ruleRasur2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur2822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoAncientExpanded__Alternatives_in_ruleNoAncientExpanded2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRestorationOverRasur__Alternatives_in_ruleNoRestorationOverRasur3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction3122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction3182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoPartialDestruction__Alternatives_in_ruleNoPartialDestruction3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestruction_in_entryRuleDestruction3242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestruction3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destruction__Group__0_in_ruleDestruction3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TextContent__Alternatives_1_1_03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__TextContent__Alternatives_1_1_03331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItemNoAmbivalence__Alternatives3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItemNoAmbivalence__Alternatives3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_rule__VersMarker__Alternatives3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexicalEnding_in_rule__WordEnding__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexionEding_in_rule__WordEnding__Alternatives3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluralEnding_in_rule__WordEnding__Alternatives3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDualEnding_in_rule__WordEnding__Alternatives3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_rule__Interfix__Alternatives3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_rule__Interfix__Alternatives3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_rule__Interfix__Alternatives3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_rule__Interfix__Alternatives3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_rule__Brackets__Alternatives3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestruction_in_rule__Brackets__Alternatives3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoExpanded__Alternatives4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoExpanded__Alternatives4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoEmendation__Alternatives4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoDisputableReading__Alternatives4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoLacuna__Alternatives4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoDeletion__Alternatives4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_rule__NoDeletion__Alternatives4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDeletion__Alternatives4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoExpandedColumn__Alternatives4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoExpandedColumn__Alternatives4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoRasur__Alternatives4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoRasur__Alternatives4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoRasur__Alternatives4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoAncientExpanded__Alternatives4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoAncientExpanded__Alternatives4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoRestorationOverRasur__Alternatives4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoRestorationOverRasur__Alternatives4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoPartialDestruction__Alternatives4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_rule__NoPartialDestruction__Alternatives4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoPartialDestruction__Alternatives4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoPartialDestruction__Alternatives4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__04652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__04655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__14713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__04774 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__04777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__14834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__0_in_rule__TextContent__Group_1__1__Impl4861 = new BitSet(new long[]{0x0000000000030012L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__0__Impl_in_rule__TextContent__Group_1_1__04896 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__1_in_rule__TextContent__Group_1_1__04899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Alternatives_1_1_0_in_rule__TextContent__Group_1_1__0__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__1__Impl_in_rule__TextContent__Group_1_1__14957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_1_1_in_rule__TextContent__Group_1_1__1__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__05018 = new BitSet(new long[]{0x005555540BC40020L});
    public static final BitSet FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__05021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sentence__Group__0__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__15080 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__0_in_rule__Sentence__Group__1__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__25140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sentence__Group__2__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__0__Impl_in_rule__Sentence__Group_1__05205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__1_in_rule__Sentence__Group_1__05208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_1_0_in_rule__Sentence__Group_1__0__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1__1__Impl_in_rule__Sentence__Group_1__15265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1__0_in_rule__Sentence__Group_1__1__Impl5292 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1__0__Impl_in_rule__Sentence__Group_1_1__05327 = new BitSet(new long[]{0x005555540BC40030L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1__1_in_rule__Sentence__Group_1_1__05330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sentence__Group_1_1__0__Impl5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1__1__Impl_in_rule__Sentence__Group_1_1__15389 = new BitSet(new long[]{0x005555540BC40030L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1__2_in_rule__Sentence__Group_1_1__15392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Sentence__Group_1_1__1__Impl5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_1_1__2__Impl_in_rule__Sentence__Group_1_1__25451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_1_1_2_in_rule__Sentence__Group_1_1__2__Impl5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__05514 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__05517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Ambivalence__Group__0__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__15576 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__15579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__25636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Ambivalence__Group__2__Impl5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__05701 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__05704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__15761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl5790 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl5802 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__05839 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__05842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ambivalence__Group_1_1__0__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__15901 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__2_in_rule__Ambivalence__Group_1_1__15904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Ambivalence__Group_1_1__1__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__2__Impl_in_rule__Ambivalence__Group_1_1__25963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_1_2_in_rule__Ambivalence__Group_1_1__2__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__06026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__06029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Case__Group__0__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__16088 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__16091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__NameAssignment_1_in_rule__Case__Group__1__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__26148 = new BitSet(new long[]{0x005555540BC00030L});
    public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__26151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Case__Group__2__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__36210 = new BitSet(new long[]{0x005555540BC00030L});
    public static final BitSet FOLLOW_rule__Case__Group__4_in_rule__Case__Group__36213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Case__Group__3__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__46272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_4__0_in_rule__Case__Group__4__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_4__0__Impl_in_rule__Case__Group_4__06339 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Case__Group_4__1_in_rule__Case__Group_4__06342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ItemsAssignment_4_0_in_rule__Case__Group_4__0__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_4__1__Impl_in_rule__Case__Group_4__16399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_4_1__0_in_rule__Case__Group_4__1__Impl6426 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Case__Group_4_1__0__Impl_in_rule__Case__Group_4_1__06461 = new BitSet(new long[]{0x005555540BC00030L});
    public static final BitSet FOLLOW_rule__Case__Group_4_1__1_in_rule__Case__Group_4_1__06464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Case__Group_4_1__0__Impl6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_4_1__1__Impl_in_rule__Case__Group_4_1__16523 = new BitSet(new long[]{0x005555540BC00030L});
    public static final BitSet FOLLOW_rule__Case__Group_4_1__2_in_rule__Case__Group_4_1__16526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Case__Group_4_1__1__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_4_1__2__Impl_in_rule__Case__Group_4_1__26585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ItemsAssignment_4_1_2_in_rule__Case__Group_4_1__2__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__0__Impl_in_rule__VersFrontierMarker__Group__06648 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__1_in_rule__VersFrontierMarker__Group__06651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__1__Impl_in_rule__VersFrontierMarker__Group__16709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VersFrontierMarker__Group__1__Impl6737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__0__Impl_in_rule__VersbreakMarker__Group__06772 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__1_in_rule__VersbreakMarker__Group__06775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__1__Impl_in_rule__VersbreakMarker__Group__16833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VersbreakMarker__Group__1__Impl6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__0__Impl_in_rule__BrokenVersbreakMarker__Group__06896 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__1_in_rule__BrokenVersbreakMarker__Group__06899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__1__Impl_in_rule__BrokenVersbreakMarker__Group__16957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BrokenVersbreakMarker__Group__1__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group__0__Impl_in_rule__Marker__Group__07020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Marker__Group__1_in_rule__Marker__Group__07023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Marker__Group__0__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group__1__Impl_in_rule__Marker__Group__17082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Marker__Group__2_in_rule__Marker__Group__17085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1__0_in_rule__Marker__Group__1__Impl7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group__2__Impl_in_rule__Marker__Group__27142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Marker__Group__2__Impl7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1__0__Impl_in_rule__Marker__Group_1__07207 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Marker__Group_1__1_in_rule__Marker__Group_1__07210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__TypeAssignment_1_0_in_rule__Marker__Group_1__0__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1__1__Impl_in_rule__Marker__Group_1__17267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1_1__0_in_rule__Marker__Group_1__1__Impl7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1_1__0__Impl_in_rule__Marker__Group_1_1__07329 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Marker__Group_1_1__1_in_rule__Marker__Group_1_1__07332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Marker__Group_1_1__0__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1_1__1__Impl_in_rule__Marker__Group_1_1__17391 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Marker__Group_1_1__2_in_rule__Marker__Group_1_1__17394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Marker__Group_1_1__1__Impl7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__Group_1_1__2__Impl_in_rule__Marker__Group_1_1__27453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__NameAssignment_1_1_2_in_rule__Marker__Group_1_1__2__Impl7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__07516 = new BitSet(new long[]{0x0055555408000020L});
    public static final BitSet FOLLOW_rule__Word__Group__1_in_rule__Word__Group__07519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__17577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group_1__0_in_rule__Word__Group__1__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group_1__0__Impl_in_rule__Word__Group_1__07638 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Word__Group_1__1_in_rule__Word__Group_1__07641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_0_in_rule__Word__Group_1__0__Impl7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group_1__1__Impl_in_rule__Word__Group_1__17698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group_1_1__0_in_rule__Word__Group_1__1__Impl7725 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Word__Group_1_1__0__Impl_in_rule__Word__Group_1_1__07760 = new BitSet(new long[]{0x0055555408000020L});
    public static final BitSet FOLLOW_rule__Word__Group_1_1__1_in_rule__Word__Group_1_1__07763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Word__Group_1_1__0__Impl7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group_1_1__1__Impl_in_rule__Word__Group_1_1__17822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_1_1_in_rule__Word__Group_1_1__1__Impl7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group__0__Impl_in_rule__WordPart__Group__07883 = new BitSet(new long[]{0x0055555408000020L});
    public static final BitSet FOLLOW_rule__WordPart__Group__1_in_rule__WordPart__Group__07886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__WordPart__Group__0__Impl7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group__1__Impl_in_rule__WordPart__Group__17948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__0_in_rule__WordPart__Group__1__Impl7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__0__Impl_in_rule__WordPart__Group_1__08009 = new BitSet(new long[]{0x0055555438000020L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__1_in_rule__WordPart__Group_1__08012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_0_in_rule__WordPart__Group_1__0__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__1__Impl_in_rule__WordPart__Group_1__18069 = new BitSet(new long[]{0x0055555438000020L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__2_in_rule__WordPart__Group_1__18072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_1_in_rule__WordPart__Group_1__1__Impl8099 = new BitSet(new long[]{0x0055555408000022L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__2__Impl_in_rule__WordPart__Group_1__28130 = new BitSet(new long[]{0x0055555438000020L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__3_in_rule__WordPart__Group_1__28133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_2_in_rule__WordPart__Group_1__2__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group_1__3__Impl_in_rule__WordPart__Group_1__38191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_3_in_rule__WordPart__Group_1__3__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DualEnding__Group__0__Impl_in_rule__DualEnding__Group__08257 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DualEnding__Group__1_in_rule__DualEnding__Group__08260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DualEnding__InterfixAssignment_0_in_rule__DualEnding__Group__0__Impl8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DualEnding__Group__1__Impl_in_rule__DualEnding__Group__18317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DualEnding__CharsAssignment_1_in_rule__DualEnding__Group__1__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PluralEnding__Group__0__Impl_in_rule__PluralEnding__Group__08378 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PluralEnding__Group__1_in_rule__PluralEnding__Group__08381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PluralEnding__InterfixAssignment_0_in_rule__PluralEnding__Group__0__Impl8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PluralEnding__Group__1__Impl_in_rule__PluralEnding__Group__18438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PluralEnding__CharsAssignment_1_in_rule__PluralEnding__Group__1__Impl8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexionEding__Group__0__Impl_in_rule__InterfixFlexionEding__Group__08499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__InterfixFlexionEding__Group__1_in_rule__InterfixFlexionEding__Group__08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexionEding__InterfixAssignment_0_in_rule__InterfixFlexionEding__Group__0__Impl8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexionEding__Group__1__Impl_in_rule__InterfixFlexionEding__Group__18559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexionEding__CharsAssignment_1_in_rule__InterfixFlexionEding__Group__1__Impl8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexicalEnding__Group__0__Impl_in_rule__InterfixLexicalEnding__Group__08620 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__InterfixLexicalEnding__Group__1_in_rule__InterfixLexicalEnding__Group__08623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexicalEnding__InterfixAssignment_0_in_rule__InterfixLexicalEnding__Group__0__Impl8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexicalEnding__Group__1__Impl_in_rule__InterfixLexicalEnding__Group__18680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexicalEnding__CharsAssignment_1_in_rule__InterfixLexicalEnding__Group__1__Impl8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__0__Impl_in_rule__InterfixLexical__Group__08741 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__1_in_rule__InterfixLexical__Group__08744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__1__Impl_in_rule__InterfixLexical__Group__18802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InterfixLexical__Group__1__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__0__Impl_in_rule__InterfixFlexion__Group__08865 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__1_in_rule__InterfixFlexion__Group__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__1__Impl_in_rule__InterfixFlexion__Group__18926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InterfixFlexion__Group__1__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__0__Impl_in_rule__InterfixSuffixPronomLexical__Group__08989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__1_in_rule__InterfixSuffixPronomLexical__Group__08992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__1__Impl_in_rule__InterfixSuffixPronomLexical__Group__19050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InterfixSuffixPronomLexical__Group__1__Impl9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__0__Impl_in_rule__InterfixPrefixNonLexical__Group__09113 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__1_in_rule__InterfixPrefixNonLexical__Group__09116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__1__Impl_in_rule__InterfixPrefixNonLexical__Group__19174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InterfixPrefixNonLexical__Group__1__Impl9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__0__Impl_in_rule__InterfixPrefixLexical__Group__09237 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__1_in_rule__InterfixPrefixLexical__Group__09240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__1__Impl_in_rule__InterfixPrefixLexical__Group__19298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InterfixPrefixLexical__Group__1__Impl9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__09361 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1_in_rule__InterfixConnectionSyllabicGroup__Group__09364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__19422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterfixConnectionSyllabicGroup__Group__1__Impl9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__09485 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__09488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__19546 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__19549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Expanded__Group__1__Impl9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__29608 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__29611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl9640 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl9652 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__39685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Expanded__Group__3__Impl9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__09752 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__09755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__19813 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__19816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Emendation__Group__1__Impl9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__29875 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__29878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl9907 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl9919 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__39952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Emendation__Group__3__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__010019 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__010022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__110080 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__110083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DisputableReading__Group__1__Impl10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__210142 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__210145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10174 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10186 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__310219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__DisputableReading__Group__3__Impl10247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__010286 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__010289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__110347 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__110350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Lacuna__Group__1__Impl10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__210409 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__210412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10441 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10453 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__310486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Lacuna__Group__3__Impl10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__010553 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__010556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__110614 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__110617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Deletion__Group__1__Impl10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__210676 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__210679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl10708 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl10720 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__310753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Deletion__Group__3__Impl10781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__010820 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__010823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__110881 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__110884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExpandedColumn__Group__1__Impl10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__210943 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__210946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl10975 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl10987 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__311020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExpandedColumn__Group__3__Impl11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__011087 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__011090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__111148 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__111151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Rasur__Group__1__Impl11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__211210 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__211213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11242 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11254 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__311287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Rasur__Group__3__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__011354 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__011357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__111415 = new BitSet(new long[]{0x0055555408000020L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__111418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AncientExpanded__Group__1__Impl11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__211477 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__211480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11509 = new BitSet(new long[]{0x0055555408000022L});
    public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11521 = new BitSet(new long[]{0x0055555408000022L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__311554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AncientExpanded__Group__3__Impl11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__011621 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__011624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__111682 = new BitSet(new long[]{0x0055555408000020L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__111685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RestorationOverRasur__Group__1__Impl11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__211744 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__211747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl11776 = new BitSet(new long[]{0x0055555408000022L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl11788 = new BitSet(new long[]{0x0055555408000022L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__311821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__RestorationOverRasur__Group__3__Impl11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__011888 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__011891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__111949 = new BitSet(new long[]{0x00555557C8000020L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__111952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PartialDestruction__Group__1__Impl11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__212011 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__212014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12043 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12055 = new BitSet(new long[]{0x00555557C8000022L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__312088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PartialDestruction__Group__3__Impl12116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destruction__Group__0__Impl_in_rule__Destruction__Group__012155 = new BitSet(new long[]{0x0055555400000000L});
    public static final BitSet FOLLOW_rule__Destruction__Group__1_in_rule__Destruction__Group__012158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destruction__Group__1__Impl_in_rule__Destruction__Group__112216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Destruction__Group__2_in_rule__Destruction__Group__112219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Destruction__Group__1__Impl12247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destruction__Group__2__Impl_in_rule__Destruction__Group__212278 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Destruction__Group__3_in_rule__Destruction__Group__212281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destruction__CommentAssignment_2_in_rule__Destruction__Group__2__Impl12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destruction__Group__3__Impl_in_rule__Destruction__Group__312338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Destruction__Group__3__Impl12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_012410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_1_112441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_012472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_1_212503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_012534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_212565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Case__NameAssignment_112596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_4_012627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_4_1_212658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Marker__TypeAssignment_1_012689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Marker__NameAssignment_1_1_212720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_012751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_1_112782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_012813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_112844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordEnding_in_rule__WordPart__WCharAssignment_1_212875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordEnding_in_rule__WordPart__WCharAssignment_1_312906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_rule__DualEnding__InterfixAssignment_012937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDualChars_in_rule__DualEnding__CharsAssignment_112968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DUALSTRING_in_rule__DualChars__NameAssignment12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLURALSTRING_in_rule__PluralChars__NameAssignment13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_rule__PluralEnding__InterfixAssignment_013061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluralChars_in_rule__PluralEnding__CharsAssignment_113092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_rule__InterfixFlexionEding__InterfixAssignment_013123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuffixChars_in_rule__InterfixFlexionEding__CharsAssignment_113154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_rule__InterfixLexicalEnding__InterfixAssignment_013185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuffixChars_in_rule__InterfixLexicalEnding__CharsAssignment_113216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SUFFIXSTRING_in_rule__SuffixChars__NameAssignment13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_213309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_213340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_213371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_213402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_213433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_213464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_213495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_213526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_213557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_213588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Destruction__CommentAssignment_213619 = new BitSet(new long[]{0x0000000000000002L});

}