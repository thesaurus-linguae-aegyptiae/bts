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


    // $ANTLR start "entryRuleDisputableVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:312:1: entryRuleDisputableVersMarker : ruleDisputableVersMarker EOF ;
    public final void entryRuleDisputableVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:313:1: ( ruleDisputableVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:314:1: ruleDisputableVersMarker EOF
            {
             before(grammarAccess.getDisputableVersMarkerRule()); 
            pushFollow(FOLLOW_ruleDisputableVersMarker_in_entryRuleDisputableVersMarker600);
            ruleDisputableVersMarker();

            state._fsp--;

             after(grammarAccess.getDisputableVersMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableVersMarker607); 

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
    // $ANTLR end "entryRuleDisputableVersMarker"


    // $ANTLR start "ruleDisputableVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:321:1: ruleDisputableVersMarker : ( ( rule__DisputableVersMarker__Group__0 ) ) ;
    public final void ruleDisputableVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:325:2: ( ( ( rule__DisputableVersMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:326:1: ( ( rule__DisputableVersMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:326:1: ( ( rule__DisputableVersMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:327:1: ( rule__DisputableVersMarker__Group__0 )
            {
             before(grammarAccess.getDisputableVersMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:328:1: ( rule__DisputableVersMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:328:2: rule__DisputableVersMarker__Group__0
            {
            pushFollow(FOLLOW_rule__DisputableVersMarker__Group__0_in_ruleDisputableVersMarker633);
            rule__DisputableVersMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisputableVersMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleDisputableVersMarker"


    // $ANTLR start "entryRuleDeletedVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:340:1: entryRuleDeletedVersMarker : ruleDeletedVersMarker EOF ;
    public final void entryRuleDeletedVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:341:1: ( ruleDeletedVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:342:1: ruleDeletedVersMarker EOF
            {
             before(grammarAccess.getDeletedVersMarkerRule()); 
            pushFollow(FOLLOW_ruleDeletedVersMarker_in_entryRuleDeletedVersMarker660);
            ruleDeletedVersMarker();

            state._fsp--;

             after(grammarAccess.getDeletedVersMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletedVersMarker667); 

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
    // $ANTLR end "entryRuleDeletedVersMarker"


    // $ANTLR start "ruleDeletedVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:349:1: ruleDeletedVersMarker : ( ( rule__DeletedVersMarker__Group__0 ) ) ;
    public final void ruleDeletedVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:353:2: ( ( ( rule__DeletedVersMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:354:1: ( ( rule__DeletedVersMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:354:1: ( ( rule__DeletedVersMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:355:1: ( rule__DeletedVersMarker__Group__0 )
            {
             before(grammarAccess.getDeletedVersMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:356:1: ( rule__DeletedVersMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:356:2: rule__DeletedVersMarker__Group__0
            {
            pushFollow(FOLLOW_rule__DeletedVersMarker__Group__0_in_ruleDeletedVersMarker693);
            rule__DeletedVersMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeletedVersMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleDeletedVersMarker"


    // $ANTLR start "entryRuleDestroyedVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:368:1: entryRuleDestroyedVersMarker : ruleDestroyedVersMarker EOF ;
    public final void entryRuleDestroyedVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:369:1: ( ruleDestroyedVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:370:1: ruleDestroyedVersMarker EOF
            {
             before(grammarAccess.getDestroyedVersMarkerRule()); 
            pushFollow(FOLLOW_ruleDestroyedVersMarker_in_entryRuleDestroyedVersMarker720);
            ruleDestroyedVersMarker();

            state._fsp--;

             after(grammarAccess.getDestroyedVersMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestroyedVersMarker727); 

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
    // $ANTLR end "entryRuleDestroyedVersMarker"


    // $ANTLR start "ruleDestroyedVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:377:1: ruleDestroyedVersMarker : ( ( rule__DestroyedVersMarker__Group__0 ) ) ;
    public final void ruleDestroyedVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:381:2: ( ( ( rule__DestroyedVersMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:382:1: ( ( rule__DestroyedVersMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:382:1: ( ( rule__DestroyedVersMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:383:1: ( rule__DestroyedVersMarker__Group__0 )
            {
             before(grammarAccess.getDestroyedVersMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:384:1: ( rule__DestroyedVersMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:384:2: rule__DestroyedVersMarker__Group__0
            {
            pushFollow(FOLLOW_rule__DestroyedVersMarker__Group__0_in_ruleDestroyedVersMarker753);
            rule__DestroyedVersMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestroyedVersMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleDestroyedVersMarker"


    // $ANTLR start "entryRuleMissingVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:396:1: entryRuleMissingVersMarker : ruleMissingVersMarker EOF ;
    public final void entryRuleMissingVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:397:1: ( ruleMissingVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:398:1: ruleMissingVersMarker EOF
            {
             before(grammarAccess.getMissingVersMarkerRule()); 
            pushFollow(FOLLOW_ruleMissingVersMarker_in_entryRuleMissingVersMarker780);
            ruleMissingVersMarker();

            state._fsp--;

             after(grammarAccess.getMissingVersMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMissingVersMarker787); 

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
    // $ANTLR end "entryRuleMissingVersMarker"


    // $ANTLR start "ruleMissingVersMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:405:1: ruleMissingVersMarker : ( ( rule__MissingVersMarker__Group__0 ) ) ;
    public final void ruleMissingVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:409:2: ( ( ( rule__MissingVersMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:410:1: ( ( rule__MissingVersMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:410:1: ( ( rule__MissingVersMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:411:1: ( rule__MissingVersMarker__Group__0 )
            {
             before(grammarAccess.getMissingVersMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:412:1: ( rule__MissingVersMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:412:2: rule__MissingVersMarker__Group__0
            {
            pushFollow(FOLLOW_rule__MissingVersMarker__Group__0_in_ruleMissingVersMarker813);
            rule__MissingVersMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissingVersMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleMissingVersMarker"


    // $ANTLR start "entryRuleRestorationOverRasurMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:424:1: entryRuleRestorationOverRasurMarker : ruleRestorationOverRasurMarker EOF ;
    public final void entryRuleRestorationOverRasurMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:425:1: ( ruleRestorationOverRasurMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:426:1: ruleRestorationOverRasurMarker EOF
            {
             before(grammarAccess.getRestorationOverRasurMarkerRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasurMarker_in_entryRuleRestorationOverRasurMarker840);
            ruleRestorationOverRasurMarker();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasurMarker847); 

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
    // $ANTLR end "entryRuleRestorationOverRasurMarker"


    // $ANTLR start "ruleRestorationOverRasurMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:433:1: ruleRestorationOverRasurMarker : ( ( rule__RestorationOverRasurMarker__Group__0 ) ) ;
    public final void ruleRestorationOverRasurMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:437:2: ( ( ( rule__RestorationOverRasurMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:438:1: ( ( rule__RestorationOverRasurMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:438:1: ( ( rule__RestorationOverRasurMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:439:1: ( rule__RestorationOverRasurMarker__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:440:1: ( rule__RestorationOverRasurMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:440:2: rule__RestorationOverRasurMarker__Group__0
            {
            pushFollow(FOLLOW_rule__RestorationOverRasurMarker__Group__0_in_ruleRestorationOverRasurMarker873);
            rule__RestorationOverRasurMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleRestorationOverRasurMarker"


    // $ANTLR start "entryRuleAncientExpandedMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:452:1: entryRuleAncientExpandedMarker : ruleAncientExpandedMarker EOF ;
    public final void entryRuleAncientExpandedMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:453:1: ( ruleAncientExpandedMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:454:1: ruleAncientExpandedMarker EOF
            {
             before(grammarAccess.getAncientExpandedMarkerRule()); 
            pushFollow(FOLLOW_ruleAncientExpandedMarker_in_entryRuleAncientExpandedMarker900);
            ruleAncientExpandedMarker();

            state._fsp--;

             after(grammarAccess.getAncientExpandedMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpandedMarker907); 

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
    // $ANTLR end "entryRuleAncientExpandedMarker"


    // $ANTLR start "ruleAncientExpandedMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:461:1: ruleAncientExpandedMarker : ( ( rule__AncientExpandedMarker__Group__0 ) ) ;
    public final void ruleAncientExpandedMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:465:2: ( ( ( rule__AncientExpandedMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:466:1: ( ( rule__AncientExpandedMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:466:1: ( ( rule__AncientExpandedMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:467:1: ( rule__AncientExpandedMarker__Group__0 )
            {
             before(grammarAccess.getAncientExpandedMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:468:1: ( rule__AncientExpandedMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:468:2: rule__AncientExpandedMarker__Group__0
            {
            pushFollow(FOLLOW_rule__AncientExpandedMarker__Group__0_in_ruleAncientExpandedMarker933);
            rule__AncientExpandedMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleAncientExpandedMarker"


    // $ANTLR start "entryRuleRasurMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:480:1: entryRuleRasurMarker : ruleRasurMarker EOF ;
    public final void entryRuleRasurMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:481:1: ( ruleRasurMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:482:1: ruleRasurMarker EOF
            {
             before(grammarAccess.getRasurMarkerRule()); 
            pushFollow(FOLLOW_ruleRasurMarker_in_entryRuleRasurMarker960);
            ruleRasurMarker();

            state._fsp--;

             after(grammarAccess.getRasurMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasurMarker967); 

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
    // $ANTLR end "entryRuleRasurMarker"


    // $ANTLR start "ruleRasurMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:489:1: ruleRasurMarker : ( ( rule__RasurMarker__Group__0 ) ) ;
    public final void ruleRasurMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:493:2: ( ( ( rule__RasurMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:494:1: ( ( rule__RasurMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:494:1: ( ( rule__RasurMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:495:1: ( rule__RasurMarker__Group__0 )
            {
             before(grammarAccess.getRasurMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:496:1: ( rule__RasurMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:496:2: rule__RasurMarker__Group__0
            {
            pushFollow(FOLLOW_rule__RasurMarker__Group__0_in_ruleRasurMarker993);
            rule__RasurMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRasurMarkerAccess().getGroup()); 

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
    // $ANTLR end "ruleRasurMarker"


    // $ANTLR start "entryRuleVersFrontierMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:508:1: entryRuleVersFrontierMarker : ruleVersFrontierMarker EOF ;
    public final void entryRuleVersFrontierMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:509:1: ( ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:510:1: ruleVersFrontierMarker EOF
            {
             before(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker1020);
            ruleVersFrontierMarker();

            state._fsp--;

             after(grammarAccess.getVersFrontierMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersFrontierMarker1027); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:517:1: ruleVersFrontierMarker : ( ( rule__VersFrontierMarker__Group__0 ) ) ;
    public final void ruleVersFrontierMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:521:2: ( ( ( rule__VersFrontierMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:522:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:522:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:523:1: ( rule__VersFrontierMarker__Group__0 )
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:524:1: ( rule__VersFrontierMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:524:2: rule__VersFrontierMarker__Group__0
            {
            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__0_in_ruleVersFrontierMarker1053);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:536:1: entryRuleVersbreakMarker : ruleVersbreakMarker EOF ;
    public final void entryRuleVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:537:1: ( ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:538:1: ruleVersbreakMarker EOF
            {
             before(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker1080);
            ruleVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getVersbreakMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersbreakMarker1087); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:545:1: ruleVersbreakMarker : ( ( rule__VersbreakMarker__Group__0 ) ) ;
    public final void ruleVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:549:2: ( ( ( rule__VersbreakMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:550:1: ( ( rule__VersbreakMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:550:1: ( ( rule__VersbreakMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:551:1: ( rule__VersbreakMarker__Group__0 )
            {
             before(grammarAccess.getVersbreakMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:552:1: ( rule__VersbreakMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:552:2: rule__VersbreakMarker__Group__0
            {
            pushFollow(FOLLOW_rule__VersbreakMarker__Group__0_in_ruleVersbreakMarker1113);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:564:1: entryRuleBrokenVersbreakMarker : ruleBrokenVersbreakMarker EOF ;
    public final void entryRuleBrokenVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:565:1: ( ruleBrokenVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:566:1: ruleBrokenVersbreakMarker EOF
            {
             before(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker1140);
            ruleBrokenVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getBrokenVersbreakMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker1147); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:573:1: ruleBrokenVersbreakMarker : ( ( rule__BrokenVersbreakMarker__Group__0 ) ) ;
    public final void ruleBrokenVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:577:2: ( ( ( rule__BrokenVersbreakMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:578:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:578:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:579:1: ( rule__BrokenVersbreakMarker__Group__0 )
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:580:1: ( rule__BrokenVersbreakMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:580:2: rule__BrokenVersbreakMarker__Group__0
            {
            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__0_in_ruleBrokenVersbreakMarker1173);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:592:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:593:1: ( ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:594:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_ruleMarker_in_entryRuleMarker1200);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarker1207); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:601:1: ruleMarker : ( ( rule__Marker__TypeAssignment ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:605:2: ( ( ( rule__Marker__TypeAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:606:1: ( ( rule__Marker__TypeAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:606:1: ( ( rule__Marker__TypeAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:607:1: ( rule__Marker__TypeAssignment )
            {
             before(grammarAccess.getMarkerAccess().getTypeAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:608:1: ( rule__Marker__TypeAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:608:2: rule__Marker__TypeAssignment
            {
            pushFollow(FOLLOW_rule__Marker__TypeAssignment_in_ruleMarker1233);
            rule__Marker__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getTypeAssignment()); 

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


    // $ANTLR start "entryRuleDestructionMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:620:1: entryRuleDestructionMarker : ruleDestructionMarker EOF ;
    public final void entryRuleDestructionMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:621:1: ( ruleDestructionMarker EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:622:1: ruleDestructionMarker EOF
            {
             before(grammarAccess.getDestructionMarkerRule()); 
            pushFollow(FOLLOW_ruleDestructionMarker_in_entryRuleDestructionMarker1260);
            ruleDestructionMarker();

            state._fsp--;

             after(grammarAccess.getDestructionMarkerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestructionMarker1267); 

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
    // $ANTLR end "entryRuleDestructionMarker"


    // $ANTLR start "ruleDestructionMarker"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:629:1: ruleDestructionMarker : ( ( rule__DestructionMarker__TypeAssignment ) ) ;
    public final void ruleDestructionMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:633:2: ( ( ( rule__DestructionMarker__TypeAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:634:1: ( ( rule__DestructionMarker__TypeAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:634:1: ( ( rule__DestructionMarker__TypeAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:635:1: ( rule__DestructionMarker__TypeAssignment )
            {
             before(grammarAccess.getDestructionMarkerAccess().getTypeAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:636:1: ( rule__DestructionMarker__TypeAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:636:2: rule__DestructionMarker__TypeAssignment
            {
            pushFollow(FOLLOW_rule__DestructionMarker__TypeAssignment_in_ruleDestructionMarker1293);
            rule__DestructionMarker__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDestructionMarkerAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleDestructionMarker"


    // $ANTLR start "entryRuleWord"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:648:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:649:1: ( ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:650:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_ruleWord_in_entryRuleWord1320);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWord1327); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:657:1: ruleWord : ( ( rule__Word__Group__0 ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:661:2: ( ( ( rule__Word__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:662:1: ( ( rule__Word__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:662:1: ( ( rule__Word__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:663:1: ( rule__Word__Group__0 )
            {
             before(grammarAccess.getWordAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:664:1: ( rule__Word__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:664:2: rule__Word__Group__0
            {
            pushFollow(FOLLOW_rule__Word__Group__0_in_ruleWord1353);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:676:1: entryRuleWordPart : ruleWordPart EOF ;
    public final void entryRuleWordPart() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:677:1: ( ruleWordPart EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:678:1: ruleWordPart EOF
            {
             before(grammarAccess.getWordPartRule()); 
            pushFollow(FOLLOW_ruleWordPart_in_entryRuleWordPart1380);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordPart1387); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:685:1: ruleWordPart : ( ( rule__WordPart__Group__0 ) ) ;
    public final void ruleWordPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:689:2: ( ( ( rule__WordPart__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:690:1: ( ( rule__WordPart__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:690:1: ( ( rule__WordPart__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:691:1: ( rule__WordPart__Group__0 )
            {
             before(grammarAccess.getWordPartAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:692:1: ( rule__WordPart__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:692:2: rule__WordPart__Group__0
            {
            pushFollow(FOLLOW_rule__WordPart__Group__0_in_ruleWordPart1413);
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


    // $ANTLR start "entryRuleWordMiddle"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:704:1: entryRuleWordMiddle : ruleWordMiddle EOF ;
    public final void entryRuleWordMiddle() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:705:1: ( ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:706:1: ruleWordMiddle EOF
            {
             before(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle1440);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordMiddleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWordMiddle1447); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:713:1: ruleWordMiddle : ( ( rule__WordMiddle__Alternatives ) ) ;
    public final void ruleWordMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:717:2: ( ( ( rule__WordMiddle__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:718:1: ( ( rule__WordMiddle__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:718:1: ( ( rule__WordMiddle__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:719:1: ( rule__WordMiddle__Alternatives )
            {
             before(grammarAccess.getWordMiddleAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:720:1: ( rule__WordMiddle__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:720:2: rule__WordMiddle__Alternatives
            {
            pushFollow(FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle1473);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:732:1: entryRuleChars : ruleChars EOF ;
    public final void entryRuleChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:733:1: ( ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:734:1: ruleChars EOF
            {
             before(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_ruleChars_in_entryRuleChars1500);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getCharsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChars1507); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:741:1: ruleChars : ( ( rule__Chars__NameAssignment ) ) ;
    public final void ruleChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:745:2: ( ( ( rule__Chars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:746:1: ( ( rule__Chars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:746:1: ( ( rule__Chars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:747:1: ( rule__Chars__NameAssignment )
            {
             before(grammarAccess.getCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:748:1: ( rule__Chars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:748:2: rule__Chars__NameAssignment
            {
            pushFollow(FOLLOW_rule__Chars__NameAssignment_in_ruleChars1533);
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


    // $ANTLR start "entryRuleBrackets"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:760:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:761:1: ( ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:762:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1560);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1567); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:769:1: ruleBrackets : ( ( rule__Brackets__Alternatives ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:773:2: ( ( ( rule__Brackets__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:774:1: ( ( rule__Brackets__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:774:1: ( ( rule__Brackets__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:775:1: ( rule__Brackets__Alternatives )
            {
             before(grammarAccess.getBracketsAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:776:1: ( rule__Brackets__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:776:2: rule__Brackets__Alternatives
            {
            pushFollow(FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets1593);
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


    // $ANTLR start "entryRuleOval"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:788:1: entryRuleOval : ruleOval EOF ;
    public final void entryRuleOval() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:789:1: ( ruleOval EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:790:1: ruleOval EOF
            {
             before(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_ruleOval_in_entryRuleOval1620);
            ruleOval();

            state._fsp--;

             after(grammarAccess.getOvalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOval1627); 

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
    // $ANTLR end "entryRuleOval"


    // $ANTLR start "ruleOval"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:797:1: ruleOval : ( ( rule__Oval__Group__0 ) ) ;
    public final void ruleOval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:801:2: ( ( ( rule__Oval__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:802:1: ( ( rule__Oval__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:802:1: ( ( rule__Oval__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:803:1: ( rule__Oval__Group__0 )
            {
             before(grammarAccess.getOvalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:804:1: ( rule__Oval__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:804:2: rule__Oval__Group__0
            {
            pushFollow(FOLLOW_rule__Oval__Group__0_in_ruleOval1653);
            rule__Oval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getGroup()); 

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
    // $ANTLR end "ruleOval"


    // $ANTLR start "entryRuleSerech"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:816:1: entryRuleSerech : ruleSerech EOF ;
    public final void entryRuleSerech() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:817:1: ( ruleSerech EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:818:1: ruleSerech EOF
            {
             before(grammarAccess.getSerechRule()); 
            pushFollow(FOLLOW_ruleSerech_in_entryRuleSerech1680);
            ruleSerech();

            state._fsp--;

             after(grammarAccess.getSerechRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSerech1687); 

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
    // $ANTLR end "entryRuleSerech"


    // $ANTLR start "ruleSerech"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:825:1: ruleSerech : ( ( rule__Serech__Group__0 ) ) ;
    public final void ruleSerech() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:829:2: ( ( ( rule__Serech__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:830:1: ( ( rule__Serech__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:830:1: ( ( rule__Serech__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:831:1: ( rule__Serech__Group__0 )
            {
             before(grammarAccess.getSerechAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:832:1: ( rule__Serech__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:832:2: rule__Serech__Group__0
            {
            pushFollow(FOLLOW_rule__Serech__Group__0_in_ruleSerech1713);
            rule__Serech__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSerechAccess().getGroup()); 

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
    // $ANTLR end "ruleSerech"


    // $ANTLR start "entryRuleCartouche"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:844:1: entryRuleCartouche : ruleCartouche EOF ;
    public final void entryRuleCartouche() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:845:1: ( ruleCartouche EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:846:1: ruleCartouche EOF
            {
             before(grammarAccess.getCartoucheRule()); 
            pushFollow(FOLLOW_ruleCartouche_in_entryRuleCartouche1740);
            ruleCartouche();

            state._fsp--;

             after(grammarAccess.getCartoucheRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCartouche1747); 

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
    // $ANTLR end "entryRuleCartouche"


    // $ANTLR start "ruleCartouche"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:853:1: ruleCartouche : ( ( rule__Cartouche__Group__0 ) ) ;
    public final void ruleCartouche() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:857:2: ( ( ( rule__Cartouche__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:858:1: ( ( rule__Cartouche__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:858:1: ( ( rule__Cartouche__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:859:1: ( rule__Cartouche__Group__0 )
            {
             before(grammarAccess.getCartoucheAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:860:1: ( rule__Cartouche__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:860:2: rule__Cartouche__Group__0
            {
            pushFollow(FOLLOW_rule__Cartouche__Group__0_in_ruleCartouche1773);
            rule__Cartouche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCartoucheAccess().getGroup()); 

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
    // $ANTLR end "ruleCartouche"


    // $ANTLR start "entryRuleNoCartouche"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:872:1: entryRuleNoCartouche : ruleNoCartouche EOF ;
    public final void entryRuleNoCartouche() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:873:1: ( ruleNoCartouche EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:874:1: ruleNoCartouche EOF
            {
             before(grammarAccess.getNoCartoucheRule()); 
            pushFollow(FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche1800);
            ruleNoCartouche();

            state._fsp--;

             after(grammarAccess.getNoCartoucheRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoCartouche1807); 

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
    // $ANTLR end "entryRuleNoCartouche"


    // $ANTLR start "ruleNoCartouche"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:881:1: ruleNoCartouche : ( ( rule__NoCartouche__Alternatives ) ) ;
    public final void ruleNoCartouche() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:885:2: ( ( ( rule__NoCartouche__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:886:1: ( ( rule__NoCartouche__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:886:1: ( ( rule__NoCartouche__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:887:1: ( rule__NoCartouche__Alternatives )
            {
             before(grammarAccess.getNoCartoucheAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:888:1: ( rule__NoCartouche__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:888:2: rule__NoCartouche__Alternatives
            {
            pushFollow(FOLLOW_rule__NoCartouche__Alternatives_in_ruleNoCartouche1833);
            rule__NoCartouche__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoCartoucheAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNoCartouche"


    // $ANTLR start "entryRuleExpanded"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:900:1: entryRuleExpanded : ruleExpanded EOF ;
    public final void entryRuleExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:901:1: ( ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:902:1: ruleExpanded EOF
            {
             before(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_ruleExpanded_in_entryRuleExpanded1860);
            ruleExpanded();

            state._fsp--;

             after(grammarAccess.getExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpanded1867); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:909:1: ruleExpanded : ( ( rule__Expanded__Group__0 ) ) ;
    public final void ruleExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:913:2: ( ( ( rule__Expanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:914:1: ( ( rule__Expanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:914:1: ( ( rule__Expanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:915:1: ( rule__Expanded__Group__0 )
            {
             before(grammarAccess.getExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:916:1: ( rule__Expanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:916:2: rule__Expanded__Group__0
            {
            pushFollow(FOLLOW_rule__Expanded__Group__0_in_ruleExpanded1893);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:928:1: entryRuleNoExpanded : ruleNoExpanded EOF ;
    public final void entryRuleNoExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:929:1: ( ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:930:1: ruleNoExpanded EOF
            {
             before(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded1920);
            ruleNoExpanded();

            state._fsp--;

             after(grammarAccess.getNoExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpanded1927); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:937:1: ruleNoExpanded : ( ( rule__NoExpanded__Alternatives ) ) ;
    public final void ruleNoExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:941:2: ( ( ( rule__NoExpanded__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:942:1: ( ( rule__NoExpanded__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:942:1: ( ( rule__NoExpanded__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:943:1: ( rule__NoExpanded__Alternatives )
            {
             before(grammarAccess.getNoExpandedAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:944:1: ( rule__NoExpanded__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:944:2: rule__NoExpanded__Alternatives
            {
            pushFollow(FOLLOW_rule__NoExpanded__Alternatives_in_ruleNoExpanded1953);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:956:1: entryRuleEmendation : ruleEmendation EOF ;
    public final void entryRuleEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:957:1: ( ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:958:1: ruleEmendation EOF
            {
             before(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_ruleEmendation_in_entryRuleEmendation1980);
            ruleEmendation();

            state._fsp--;

             after(grammarAccess.getEmendationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmendation1987); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:965:1: ruleEmendation : ( ( rule__Emendation__Group__0 ) ) ;
    public final void ruleEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:969:2: ( ( ( rule__Emendation__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:970:1: ( ( rule__Emendation__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:970:1: ( ( rule__Emendation__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:971:1: ( rule__Emendation__Group__0 )
            {
             before(grammarAccess.getEmendationAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:972:1: ( rule__Emendation__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:972:2: rule__Emendation__Group__0
            {
            pushFollow(FOLLOW_rule__Emendation__Group__0_in_ruleEmendation2013);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:984:1: entryRuleNoEmendation : ruleNoEmendation EOF ;
    public final void entryRuleNoEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:985:1: ( ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:986:1: ruleNoEmendation EOF
            {
             before(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2040);
            ruleNoEmendation();

            state._fsp--;

             after(grammarAccess.getNoEmendationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoEmendation2047); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:993:1: ruleNoEmendation : ( ( rule__NoEmendation__Alternatives ) ) ;
    public final void ruleNoEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:997:2: ( ( ( rule__NoEmendation__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:998:1: ( ( rule__NoEmendation__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:998:1: ( ( rule__NoEmendation__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:999:1: ( rule__NoEmendation__Alternatives )
            {
             before(grammarAccess.getNoEmendationAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1000:1: ( rule__NoEmendation__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1000:2: rule__NoEmendation__Alternatives
            {
            pushFollow(FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation2073);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1012:1: entryRuleDisputableReading : ruleDisputableReading EOF ;
    public final void entryRuleDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1013:1: ( ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1014:1: ruleDisputableReading EOF
            {
             before(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading2100);
            ruleDisputableReading();

            state._fsp--;

             after(grammarAccess.getDisputableReadingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisputableReading2107); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1021:1: ruleDisputableReading : ( ( rule__DisputableReading__Group__0 ) ) ;
    public final void ruleDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1025:2: ( ( ( rule__DisputableReading__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1026:1: ( ( rule__DisputableReading__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1026:1: ( ( rule__DisputableReading__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1027:1: ( rule__DisputableReading__Group__0 )
            {
             before(grammarAccess.getDisputableReadingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1028:1: ( rule__DisputableReading__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1028:2: rule__DisputableReading__Group__0
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading2133);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1040:1: entryRuleNoDisputableReading : ruleNoDisputableReading EOF ;
    public final void entryRuleNoDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1041:1: ( ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1042:1: ruleNoDisputableReading EOF
            {
             before(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading2160);
            ruleNoDisputableReading();

            state._fsp--;

             after(grammarAccess.getNoDisputableReadingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDisputableReading2167); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1049:1: ruleNoDisputableReading : ( ( rule__NoDisputableReading__Alternatives ) ) ;
    public final void ruleNoDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1053:2: ( ( ( rule__NoDisputableReading__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1054:1: ( ( rule__NoDisputableReading__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1054:1: ( ( rule__NoDisputableReading__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1055:1: ( rule__NoDisputableReading__Alternatives )
            {
             before(grammarAccess.getNoDisputableReadingAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1056:1: ( rule__NoDisputableReading__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1056:2: rule__NoDisputableReading__Alternatives
            {
            pushFollow(FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading2193);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1068:1: entryRuleLacuna : ruleLacuna EOF ;
    public final void entryRuleLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1069:1: ( ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1070:1: ruleLacuna EOF
            {
             before(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_ruleLacuna_in_entryRuleLacuna2220);
            ruleLacuna();

            state._fsp--;

             after(grammarAccess.getLacunaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLacuna2227); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1077:1: ruleLacuna : ( ( rule__Lacuna__Group__0 ) ) ;
    public final void ruleLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1081:2: ( ( ( rule__Lacuna__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1082:1: ( ( rule__Lacuna__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1082:1: ( ( rule__Lacuna__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1083:1: ( rule__Lacuna__Group__0 )
            {
             before(grammarAccess.getLacunaAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1084:1: ( rule__Lacuna__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1084:2: rule__Lacuna__Group__0
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna2253);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1096:1: entryRuleNoLacuna : ruleNoLacuna EOF ;
    public final void entryRuleNoLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1097:1: ( ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1098:1: ruleNoLacuna EOF
            {
             before(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna2280);
            ruleNoLacuna();

            state._fsp--;

             after(grammarAccess.getNoLacunaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoLacuna2287); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1105:1: ruleNoLacuna : ( ( rule__NoLacuna__Alternatives ) ) ;
    public final void ruleNoLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1109:2: ( ( ( rule__NoLacuna__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1110:1: ( ( rule__NoLacuna__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1110:1: ( ( rule__NoLacuna__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1111:1: ( rule__NoLacuna__Alternatives )
            {
             before(grammarAccess.getNoLacunaAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1112:1: ( rule__NoLacuna__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1112:2: rule__NoLacuna__Alternatives
            {
            pushFollow(FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna2313);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1124:1: entryRuleDeletion : ruleDeletion EOF ;
    public final void entryRuleDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1125:1: ( ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1126:1: ruleDeletion EOF
            {
             before(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_ruleDeletion_in_entryRuleDeletion2340);
            ruleDeletion();

            state._fsp--;

             after(grammarAccess.getDeletionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeletion2347); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1133:1: ruleDeletion : ( ( rule__Deletion__Group__0 ) ) ;
    public final void ruleDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1137:2: ( ( ( rule__Deletion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1138:1: ( ( rule__Deletion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1138:1: ( ( rule__Deletion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1139:1: ( rule__Deletion__Group__0 )
            {
             before(grammarAccess.getDeletionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1140:1: ( rule__Deletion__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1140:2: rule__Deletion__Group__0
            {
            pushFollow(FOLLOW_rule__Deletion__Group__0_in_ruleDeletion2373);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1152:1: entryRuleNoDeletion : ruleNoDeletion EOF ;
    public final void entryRuleNoDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1153:1: ( ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1154:1: ruleNoDeletion EOF
            {
             before(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion2400);
            ruleNoDeletion();

            state._fsp--;

             after(grammarAccess.getNoDeletionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoDeletion2407); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1161:1: ruleNoDeletion : ( ( rule__NoDeletion__Alternatives ) ) ;
    public final void ruleNoDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1165:2: ( ( ( rule__NoDeletion__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1166:1: ( ( rule__NoDeletion__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1166:1: ( ( rule__NoDeletion__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1167:1: ( rule__NoDeletion__Alternatives )
            {
             before(grammarAccess.getNoDeletionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1168:1: ( rule__NoDeletion__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1168:2: rule__NoDeletion__Alternatives
            {
            pushFollow(FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion2433);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1180:1: entryRuleExpandedColumn : ruleExpandedColumn EOF ;
    public final void entryRuleExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1181:1: ( ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1182:1: ruleExpandedColumn EOF
            {
             before(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn2460);
            ruleExpandedColumn();

            state._fsp--;

             after(grammarAccess.getExpandedColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpandedColumn2467); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1189:1: ruleExpandedColumn : ( ( rule__ExpandedColumn__Group__0 ) ) ;
    public final void ruleExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1193:2: ( ( ( rule__ExpandedColumn__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1194:1: ( ( rule__ExpandedColumn__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1194:1: ( ( rule__ExpandedColumn__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1195:1: ( rule__ExpandedColumn__Group__0 )
            {
             before(grammarAccess.getExpandedColumnAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1196:1: ( rule__ExpandedColumn__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1196:2: rule__ExpandedColumn__Group__0
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn2493);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1208:1: entryRuleNoExpandedColumn : ruleNoExpandedColumn EOF ;
    public final void entryRuleNoExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1209:1: ( ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1210:1: ruleNoExpandedColumn EOF
            {
             before(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn2520);
            ruleNoExpandedColumn();

            state._fsp--;

             after(grammarAccess.getNoExpandedColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoExpandedColumn2527); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1217:1: ruleNoExpandedColumn : ( ( rule__NoExpandedColumn__Alternatives ) ) ;
    public final void ruleNoExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1221:2: ( ( ( rule__NoExpandedColumn__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1222:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1222:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1223:1: ( rule__NoExpandedColumn__Alternatives )
            {
             before(grammarAccess.getNoExpandedColumnAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1224:1: ( rule__NoExpandedColumn__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1224:2: rule__NoExpandedColumn__Alternatives
            {
            pushFollow(FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn2553);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1236:1: entryRuleRasur : ruleRasur EOF ;
    public final void entryRuleRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1237:1: ( ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1238:1: ruleRasur EOF
            {
             before(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_ruleRasur_in_entryRuleRasur2580);
            ruleRasur();

            state._fsp--;

             after(grammarAccess.getRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasur2587); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1245:1: ruleRasur : ( ( rule__Rasur__Group__0 ) ) ;
    public final void ruleRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1249:2: ( ( ( rule__Rasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1250:1: ( ( rule__Rasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1250:1: ( ( rule__Rasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1251:1: ( rule__Rasur__Group__0 )
            {
             before(grammarAccess.getRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1252:1: ( rule__Rasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1252:2: rule__Rasur__Group__0
            {
            pushFollow(FOLLOW_rule__Rasur__Group__0_in_ruleRasur2613);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1264:1: entryRuleNoRasur : ruleNoRasur EOF ;
    public final void entryRuleNoRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1265:1: ( ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1266:1: ruleNoRasur EOF
            {
             before(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_ruleNoRasur_in_entryRuleNoRasur2640);
            ruleNoRasur();

            state._fsp--;

             after(grammarAccess.getNoRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRasur2647); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1273:1: ruleNoRasur : ( ( rule__NoRasur__Alternatives ) ) ;
    public final void ruleNoRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1277:2: ( ( ( rule__NoRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1278:1: ( ( rule__NoRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1278:1: ( ( rule__NoRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1279:1: ( rule__NoRasur__Alternatives )
            {
             before(grammarAccess.getNoRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1280:1: ( rule__NoRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1280:2: rule__NoRasur__Alternatives
            {
            pushFollow(FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur2673);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1292:1: entryRuleAncientExpanded : ruleAncientExpanded EOF ;
    public final void entryRuleAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1293:1: ( ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1294:1: ruleAncientExpanded EOF
            {
             before(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded2700);
            ruleAncientExpanded();

            state._fsp--;

             after(grammarAccess.getAncientExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAncientExpanded2707); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1301:1: ruleAncientExpanded : ( ( rule__AncientExpanded__Group__0 ) ) ;
    public final void ruleAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1305:2: ( ( ( rule__AncientExpanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1306:1: ( ( rule__AncientExpanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1306:1: ( ( rule__AncientExpanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1307:1: ( rule__AncientExpanded__Group__0 )
            {
             before(grammarAccess.getAncientExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1308:1: ( rule__AncientExpanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1308:2: rule__AncientExpanded__Group__0
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2733);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1320:1: entryRuleNoAncientExpanded : ruleNoAncientExpanded EOF ;
    public final void entryRuleNoAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1321:1: ( ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1322:1: ruleNoAncientExpanded EOF
            {
             before(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2760);
            ruleNoAncientExpanded();

            state._fsp--;

             after(grammarAccess.getNoAncientExpandedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoAncientExpanded2767); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1329:1: ruleNoAncientExpanded : ( ( rule__NoAncientExpanded__Alternatives ) ) ;
    public final void ruleNoAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1333:2: ( ( ( rule__NoAncientExpanded__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1334:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1334:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1335:1: ( rule__NoAncientExpanded__Alternatives )
            {
             before(grammarAccess.getNoAncientExpandedAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1336:1: ( rule__NoAncientExpanded__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1336:2: rule__NoAncientExpanded__Alternatives
            {
            pushFollow(FOLLOW_rule__NoAncientExpanded__Alternatives_in_ruleNoAncientExpanded2793);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1348:1: entryRuleRestorationOverRasur : ruleRestorationOverRasur EOF ;
    public final void entryRuleRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1349:1: ( ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1350:1: ruleRestorationOverRasur EOF
            {
             before(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur2820);
            ruleRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestorationOverRasur2827); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1357:1: ruleRestorationOverRasur : ( ( rule__RestorationOverRasur__Group__0 ) ) ;
    public final void ruleRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1361:2: ( ( ( rule__RestorationOverRasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1362:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1362:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1363:1: ( rule__RestorationOverRasur__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1364:1: ( rule__RestorationOverRasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1364:2: rule__RestorationOverRasur__Group__0
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur2853);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1376:1: entryRuleNoRestorationOverRasur : ruleNoRestorationOverRasur EOF ;
    public final void entryRuleNoRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1377:1: ( ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1378:1: ruleNoRestorationOverRasur EOF
            {
             before(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur2880);
            ruleNoRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getNoRestorationOverRasurRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoRestorationOverRasur2887); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1385:1: ruleNoRestorationOverRasur : ( ( rule__NoRestorationOverRasur__Alternatives ) ) ;
    public final void ruleNoRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1389:2: ( ( ( rule__NoRestorationOverRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1390:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1390:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1391:1: ( rule__NoRestorationOverRasur__Alternatives )
            {
             before(grammarAccess.getNoRestorationOverRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1392:1: ( rule__NoRestorationOverRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1392:2: rule__NoRestorationOverRasur__Alternatives
            {
            pushFollow(FOLLOW_rule__NoRestorationOverRasur__Alternatives_in_ruleNoRestorationOverRasur2913);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1404:1: entryRulePartialDestruction : rulePartialDestruction EOF ;
    public final void entryRulePartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1405:1: ( rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1406:1: rulePartialDestruction EOF
            {
             before(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction2940);
            rulePartialDestruction();

            state._fsp--;

             after(grammarAccess.getPartialDestructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialDestruction2947); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1413:1: rulePartialDestruction : ( ( rule__PartialDestruction__Group__0 ) ) ;
    public final void rulePartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1417:2: ( ( ( rule__PartialDestruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1418:1: ( ( rule__PartialDestruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1418:1: ( ( rule__PartialDestruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1419:1: ( rule__PartialDestruction__Group__0 )
            {
             before(grammarAccess.getPartialDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1420:1: ( rule__PartialDestruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1420:2: rule__PartialDestruction__Group__0
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction2973);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1432:1: entryRuleNoPartialDestruction : ruleNoPartialDestruction EOF ;
    public final void entryRuleNoPartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1433:1: ( ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1434:1: ruleNoPartialDestruction EOF
            {
             before(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction3000);
            ruleNoPartialDestruction();

            state._fsp--;

             after(grammarAccess.getNoPartialDestructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoPartialDestruction3007); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1441:1: ruleNoPartialDestruction : ( ( rule__NoPartialDestruction__Alternatives ) ) ;
    public final void ruleNoPartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1445:2: ( ( ( rule__NoPartialDestruction__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1446:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1446:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1447:1: ( rule__NoPartialDestruction__Alternatives )
            {
             before(grammarAccess.getNoPartialDestructionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1448:1: ( rule__NoPartialDestruction__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1448:2: rule__NoPartialDestruction__Alternatives
            {
            pushFollow(FOLLOW_rule__NoPartialDestruction__Alternatives_in_ruleNoPartialDestruction3033);
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


    // $ANTLR start "entryRuleInterfix"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1460:1: entryRuleInterfix : ruleInterfix EOF ;
    public final void entryRuleInterfix() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1461:1: ( ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1462:1: ruleInterfix EOF
            {
             before(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_ruleInterfix_in_entryRuleInterfix3060);
            ruleInterfix();

            state._fsp--;

             after(grammarAccess.getInterfixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfix3067); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1469:1: ruleInterfix : ( ( rule__Interfix__Alternatives ) ) ;
    public final void ruleInterfix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1473:2: ( ( ( rule__Interfix__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1474:1: ( ( rule__Interfix__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1474:1: ( ( rule__Interfix__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1475:1: ( rule__Interfix__Alternatives )
            {
             before(grammarAccess.getInterfixAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1476:1: ( rule__Interfix__Alternatives )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1476:2: rule__Interfix__Alternatives
            {
            pushFollow(FOLLOW_rule__Interfix__Alternatives_in_ruleInterfix3093);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1488:1: entryRuleInterfixLexical : ruleInterfixLexical EOF ;
    public final void entryRuleInterfixLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1489:1: ( ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1490:1: ruleInterfixLexical EOF
            {
             before(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical3120);
            ruleInterfixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixLexical3127); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1497:1: ruleInterfixLexical : ( ( rule__InterfixLexical__Group__0 ) ) ;
    public final void ruleInterfixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1501:2: ( ( ( rule__InterfixLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1502:1: ( ( rule__InterfixLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1502:1: ( ( rule__InterfixLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1503:1: ( rule__InterfixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1504:1: ( rule__InterfixLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1504:2: rule__InterfixLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixLexical__Group__0_in_ruleInterfixLexical3153);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1516:1: entryRuleInterfixFlexion : ruleInterfixFlexion EOF ;
    public final void entryRuleInterfixFlexion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1517:1: ( ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1518:1: ruleInterfixFlexion EOF
            {
             before(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion3180);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixFlexion3187); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1525:1: ruleInterfixFlexion : ( ( rule__InterfixFlexion__Group__0 ) ) ;
    public final void ruleInterfixFlexion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1529:2: ( ( ( rule__InterfixFlexion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1530:1: ( ( rule__InterfixFlexion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1530:1: ( ( rule__InterfixFlexion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1531:1: ( rule__InterfixFlexion__Group__0 )
            {
             before(grammarAccess.getInterfixFlexionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1532:1: ( rule__InterfixFlexion__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1532:2: rule__InterfixFlexion__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixFlexion__Group__0_in_ruleInterfixFlexion3213);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1544:1: entryRuleInterfixSuffixPronomLexical : ruleInterfixSuffixPronomLexical EOF ;
    public final void entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1545:1: ( ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1546:1: ruleInterfixSuffixPronomLexical EOF
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical3240);
            ruleInterfixSuffixPronomLexical();

            state._fsp--;

             after(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical3247); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1553:1: ruleInterfixSuffixPronomLexical : ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) ;
    public final void ruleInterfixSuffixPronomLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1557:2: ( ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1558:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1558:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1559:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1560:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1560:2: rule__InterfixSuffixPronomLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__0_in_ruleInterfixSuffixPronomLexical3273);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1572:1: entryRuleInterfixPrefixNonLexical : ruleInterfixPrefixNonLexical EOF ;
    public final void entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1573:1: ( ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1574:1: ruleInterfixPrefixNonLexical EOF
            {
             before(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical3300);
            ruleInterfixPrefixNonLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical3307); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1581:1: ruleInterfixPrefixNonLexical : ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixNonLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1585:2: ( ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1586:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1586:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1587:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1588:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1588:2: rule__InterfixPrefixNonLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__0_in_ruleInterfixPrefixNonLexical3333);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1600:1: entryRuleInterfixPrefixLexical : ruleInterfixPrefixLexical EOF ;
    public final void entryRuleInterfixPrefixLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1601:1: ( ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1602:1: ruleInterfixPrefixLexical EOF
            {
             before(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical3360);
            ruleInterfixPrefixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixLexicalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPrefixLexical3367); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1609:1: ruleInterfixPrefixLexical : ( ( rule__InterfixPrefixLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1613:2: ( ( ( rule__InterfixPrefixLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1614:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1614:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1615:1: ( rule__InterfixPrefixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1616:1: ( rule__InterfixPrefixLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1616:2: rule__InterfixPrefixLexical__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__0_in_ruleInterfixPrefixLexical3393);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1628:1: entryRuleInterfixConnectionSyllabicGroup : ruleInterfixConnectionSyllabicGroup EOF ;
    public final void entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1629:1: ( ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1630:1: ruleInterfixConnectionSyllabicGroup EOF
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup3420);
            ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             after(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup3427); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1637:1: ruleInterfixConnectionSyllabicGroup : ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) ;
    public final void ruleInterfixConnectionSyllabicGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1641:2: ( ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1642:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1642:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1643:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1644:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1644:2: rule__InterfixConnectionSyllabicGroup__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0_in_ruleInterfixConnectionSyllabicGroup3453);
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


    // $ANTLR start "entryRuleInterfixCompoundWords"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1656:1: entryRuleInterfixCompoundWords : ruleInterfixCompoundWords EOF ;
    public final void entryRuleInterfixCompoundWords() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1657:1: ( ruleInterfixCompoundWords EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1658:1: ruleInterfixCompoundWords EOF
            {
             before(grammarAccess.getInterfixCompoundWordsRule()); 
            pushFollow(FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords3480);
            ruleInterfixCompoundWords();

            state._fsp--;

             after(grammarAccess.getInterfixCompoundWordsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixCompoundWords3487); 

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
    // $ANTLR end "entryRuleInterfixCompoundWords"


    // $ANTLR start "ruleInterfixCompoundWords"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1665:1: ruleInterfixCompoundWords : ( ( rule__InterfixCompoundWords__Group__0 ) ) ;
    public final void ruleInterfixCompoundWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1669:2: ( ( ( rule__InterfixCompoundWords__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1670:1: ( ( rule__InterfixCompoundWords__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1670:1: ( ( rule__InterfixCompoundWords__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1671:1: ( rule__InterfixCompoundWords__Group__0 )
            {
             before(grammarAccess.getInterfixCompoundWordsAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1672:1: ( rule__InterfixCompoundWords__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1672:2: rule__InterfixCompoundWords__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixCompoundWords__Group__0_in_ruleInterfixCompoundWords3513);
            rule__InterfixCompoundWords__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixCompoundWordsAccess().getGroup()); 

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
    // $ANTLR end "ruleInterfixCompoundWords"


    // $ANTLR start "entryRuleInterfixPhoneticalComplement"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1684:1: entryRuleInterfixPhoneticalComplement : ruleInterfixPhoneticalComplement EOF ;
    public final void entryRuleInterfixPhoneticalComplement() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1685:1: ( ruleInterfixPhoneticalComplement EOF )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1686:1: ruleInterfixPhoneticalComplement EOF
            {
             before(grammarAccess.getInterfixPhoneticalComplementRule()); 
            pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement3540);
            ruleInterfixPhoneticalComplement();

            state._fsp--;

             after(grammarAccess.getInterfixPhoneticalComplementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement3547); 

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
    // $ANTLR end "entryRuleInterfixPhoneticalComplement"


    // $ANTLR start "ruleInterfixPhoneticalComplement"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1693:1: ruleInterfixPhoneticalComplement : ( ( rule__InterfixPhoneticalComplement__Group__0 ) ) ;
    public final void ruleInterfixPhoneticalComplement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1697:2: ( ( ( rule__InterfixPhoneticalComplement__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1698:1: ( ( rule__InterfixPhoneticalComplement__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1698:1: ( ( rule__InterfixPhoneticalComplement__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1699:1: ( rule__InterfixPhoneticalComplement__Group__0 )
            {
             before(grammarAccess.getInterfixPhoneticalComplementAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1700:1: ( rule__InterfixPhoneticalComplement__Group__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1700:2: rule__InterfixPhoneticalComplement__Group__0
            {
            pushFollow(FOLLOW_rule__InterfixPhoneticalComplement__Group__0_in_ruleInterfixPhoneticalComplement3573);
            rule__InterfixPhoneticalComplement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixPhoneticalComplementAccess().getGroup()); 

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
    // $ANTLR end "ruleInterfixPhoneticalComplement"


    // $ANTLR start "rule__TextContent__Alternatives_1_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1712:1: rule__TextContent__Alternatives_1_1_0 : ( ( ' ' ) | ( RULE_NEWLINE ) );
    public final void rule__TextContent__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1716:1: ( ( ' ' ) | ( RULE_NEWLINE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1717:1: ( ' ' )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1717:1: ( ' ' )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1718:1: ' '
                    {
                     before(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 
                    match(input,9,FOLLOW_9_in_rule__TextContent__Alternatives_1_1_03610); 
                     after(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1725:6: ( RULE_NEWLINE )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1725:6: ( RULE_NEWLINE )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1726:1: RULE_NEWLINE
                    {
                     before(grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__TextContent__Alternatives_1_1_03629); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1736:1: rule__SentenceItem__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) );
    public final void rule__SentenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1740:1: ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) )
            int alt2=3;
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
                alt2=1;
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
                alt2=2;
                }
                break;
            case 11:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1741:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1741:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1742:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives3661);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1747:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1747:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1748:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives3678);
                    ruleAbstractMarker();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1753:6: ( ruleAmbivalence )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1753:6: ( ruleAmbivalence )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1754:1: ruleAmbivalence
                    {
                     before(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives3695);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1764:1: rule__AbstractMarker__Alternatives : ( ( ruleMarker ) | ( ruleVersMarker ) | ( ruleDestructionMarker ) );
    public final void rule__AbstractMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1768:1: ( ( ruleMarker ) | ( ruleVersMarker ) | ( ruleDestructionMarker ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_BETWEEN_HASHES:
                {
                alt3=1;
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
                alt3=2;
                }
                break;
            case RULE_BETWEEN_MINUS:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1769:1: ( ruleMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1769:1: ( ruleMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1770:1: ruleMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives3727);
                    ruleMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1775:6: ( ruleVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1775:6: ( ruleVersMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1776:1: ruleVersMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives3744);
                    ruleVersMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1781:6: ( ruleDestructionMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1781:6: ( ruleDestructionMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1782:1: ruleDestructionMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getDestructionMarkerParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDestructionMarker_in_rule__AbstractMarker__Alternatives3761);
                    ruleDestructionMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getDestructionMarkerParserRuleCall_2()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1792:1: rule__SentenceItemNoAmbivalence__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) );
    public final void rule__SentenceItemNoAmbivalence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1796:1: ( ( ruleWord ) | ( ruleAbstractMarker ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EGYSTRING||(LA4_0>=23 && LA4_0<=24)||LA4_0==26||LA4_0==28||LA4_0==30||LA4_0==32||LA4_0==34||LA4_0==36||LA4_0==38||LA4_0==40||LA4_0==42||LA4_0==44||LA4_0==46||LA4_0==48||(LA4_0>=50 && LA4_0<=57)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_BETWEEN_HASHES && LA4_0<=RULE_BETWEEN_MINUS)||(LA4_0>=13 && LA4_0<=22)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1797:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1797:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1798:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWord_in_rule__SentenceItemNoAmbivalence__Alternatives3793);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1803:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1803:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1804:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractMarker_in_rule__SentenceItemNoAmbivalence__Alternatives3810);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1814:1: rule__VersMarker__Alternatives : ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) | ( ruleMissingVersMarker ) | ( ruleDestroyedVersMarker ) | ( ruleDeletedVersMarker ) | ( ruleDisputableVersMarker ) | ( ruleRestorationOverRasurMarker ) | ( ruleAncientExpandedMarker ) | ( ruleRasurMarker ) );
    public final void rule__VersMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1818:1: ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) | ( ruleMissingVersMarker ) | ( ruleDestroyedVersMarker ) | ( ruleDeletedVersMarker ) | ( ruleDisputableVersMarker ) | ( ruleRestorationOverRasurMarker ) | ( ruleAncientExpandedMarker ) | ( ruleRasurMarker ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 14:
                {
                alt5=6;
                }
                break;
            case 13:
                {
                alt5=7;
                }
                break;
            case 17:
                {
                alt5=8;
                }
                break;
            case 18:
                {
                alt5=9;
                }
                break;
            case 19:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1819:1: ( ruleVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1819:1: ( ruleVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1820:1: ruleVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives3842);
                    ruleVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1825:6: ( ruleVersFrontierMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1825:6: ( ruleVersFrontierMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1826:1: ruleVersFrontierMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives3859);
                    ruleVersFrontierMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1831:6: ( ruleBrokenVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1831:6: ( ruleBrokenVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1832:1: ruleBrokenVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBrokenVersbreakMarker_in_rule__VersMarker__Alternatives3876);
                    ruleBrokenVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1837:6: ( ruleMissingVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1837:6: ( ruleMissingVersMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1838:1: ruleMissingVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getMissingVersMarkerParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMissingVersMarker_in_rule__VersMarker__Alternatives3893);
                    ruleMissingVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getMissingVersMarkerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1843:6: ( ruleDestroyedVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1843:6: ( ruleDestroyedVersMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1844:1: ruleDestroyedVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDestroyedVersMarkerParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDestroyedVersMarker_in_rule__VersMarker__Alternatives3910);
                    ruleDestroyedVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDestroyedVersMarkerParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1849:6: ( ruleDeletedVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1849:6: ( ruleDeletedVersMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1850:1: ruleDeletedVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDeletedVersMarkerParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleDeletedVersMarker_in_rule__VersMarker__Alternatives3927);
                    ruleDeletedVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDeletedVersMarkerParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1855:6: ( ruleDisputableVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1855:6: ( ruleDisputableVersMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1856:1: ruleDisputableVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDisputableVersMarkerParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDisputableVersMarker_in_rule__VersMarker__Alternatives3944);
                    ruleDisputableVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDisputableVersMarkerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1861:6: ( ruleRestorationOverRasurMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1861:6: ( ruleRestorationOverRasurMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1862:1: ruleRestorationOverRasurMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getRestorationOverRasurMarkerParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleRestorationOverRasurMarker_in_rule__VersMarker__Alternatives3961);
                    ruleRestorationOverRasurMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getRestorationOverRasurMarkerParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1867:6: ( ruleAncientExpandedMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1867:6: ( ruleAncientExpandedMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1868:1: ruleAncientExpandedMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getAncientExpandedMarkerParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleAncientExpandedMarker_in_rule__VersMarker__Alternatives3978);
                    ruleAncientExpandedMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getAncientExpandedMarkerParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1873:6: ( ruleRasurMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1873:6: ( ruleRasurMarker )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1874:1: ruleRasurMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getRasurMarkerParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleRasurMarker_in_rule__VersMarker__Alternatives3995);
                    ruleRasurMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getRasurMarkerParserRuleCall_9()); 

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


    // $ANTLR start "rule__WordMiddle__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1884:1: rule__WordMiddle__Alternatives : ( ( ruleBrackets ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__WordMiddle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1888:1: ( ( ruleBrackets ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt6=3;
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
                alt6=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt6=2;
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1889:1: ( ruleBrackets )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1889:1: ( ruleBrackets )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1890:1: ruleBrackets
                    {
                     before(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives4027);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1895:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1895:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1896:1: ruleChars
                    {
                     before(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives4044);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1901:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1901:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1902:1: ruleInterfix
                    {
                     before(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__WordMiddle__Alternatives4061);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_2()); 

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


    // $ANTLR start "rule__Brackets__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1912:1: rule__Brackets__Alternatives : ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) );
    public final void rule__Brackets__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1916:1: ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) )
            int alt7=13;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 46:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 34:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            case 36:
                {
                alt7=8;
                }
                break;
            case 38:
                {
                alt7=9;
                }
                break;
            case 48:
                {
                alt7=10;
                }
                break;
            case 28:
                {
                alt7=11;
                }
                break;
            case 24:
                {
                alt7=12;
                }
                break;
            case 26:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1917:1: ( ruleRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1917:1: ( ruleRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1918:1: ruleRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRasur_in_rule__Brackets__Alternatives4093);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1923:6: ( ruleAncientExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1923:6: ( ruleAncientExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1924:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives4110);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1929:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1929:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1930:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives4127);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1935:6: ( ruleExpandedColumn )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1935:6: ( ruleExpandedColumn )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1936:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives4144);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1941:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1941:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1942:1: ruleExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives4161);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1947:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1947:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1948:1: ruleDisputableReading
                    {
                     before(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives4178);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1953:6: ( ruleEmendation )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1953:6: ( ruleEmendation )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1954:1: ruleEmendation
                    {
                     before(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives4195);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1959:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1959:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1960:1: ruleLacuna
                    {
                     before(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives4212);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1965:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1965:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1966:1: ruleDeletion
                    {
                     before(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives4229);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1971:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1971:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1972:1: rulePartialDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                    pushFollow(FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives4246);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1977:6: ( ruleCartouche )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1977:6: ( ruleCartouche )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1978:1: ruleCartouche
                    {
                     before(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleCartouche_in_rule__Brackets__Alternatives4263);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1983:6: ( ruleOval )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1983:6: ( ruleOval )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1984:1: ruleOval
                    {
                     before(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleOval_in_rule__Brackets__Alternatives4280);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1989:6: ( ruleSerech )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1989:6: ( ruleSerech )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1990:1: ruleSerech
                    {
                     before(grammarAccess.getBracketsAccess().getSerechParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleSerech_in_rule__Brackets__Alternatives4297);
                    ruleSerech();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getSerechParserRuleCall_12()); 

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


    // $ANTLR start "rule__NoCartouche__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2000:1: rule__NoCartouche__Alternatives : ( ( ruleChars ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleInterfix ) );
    public final void rule__NoCartouche__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2004:1: ( ( ruleChars ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleInterfix ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt8=1;
                }
                break;
            case 42:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 46:
                {
                alt8=4;
                }
                break;
            case 40:
                {
                alt8=5;
                }
                break;
            case 30:
                {
                alt8=6;
                }
                break;
            case 34:
                {
                alt8=7;
                }
                break;
            case 32:
                {
                alt8=8;
                }
                break;
            case 36:
                {
                alt8=9;
                }
                break;
            case 38:
                {
                alt8=10;
                }
                break;
            case 48:
                {
                alt8=11;
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
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2005:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2005:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2006:1: ruleChars
                    {
                     before(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoCartouche__Alternatives4329);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2011:6: ( ruleRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2011:6: ( ruleRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2012:1: ruleRasur
                    {
                     before(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRasur_in_rule__NoCartouche__Alternatives4346);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2017:6: ( ruleAncientExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2017:6: ( ruleAncientExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2018:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAncientExpanded_in_rule__NoCartouche__Alternatives4363);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2023:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2023:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2024:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_rule__NoCartouche__Alternatives4380);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2029:6: ( ruleExpandedColumn )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2029:6: ( ruleExpandedColumn )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2030:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleExpandedColumn_in_rule__NoCartouche__Alternatives4397);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2035:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2035:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2036:1: ruleExpanded
                    {
                     before(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoCartouche__Alternatives4414);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2041:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2041:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2042:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoCartouche__Alternatives4431);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2047:6: ( ruleEmendation )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2047:6: ( ruleEmendation )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2048:1: ruleEmendation
                    {
                     before(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleEmendation_in_rule__NoCartouche__Alternatives4448);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2053:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2053:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2054:1: ruleLacuna
                    {
                     before(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleLacuna_in_rule__NoCartouche__Alternatives4465);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2059:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2059:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2060:1: ruleDeletion
                    {
                     before(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleDeletion_in_rule__NoCartouche__Alternatives4482);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2065:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2065:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2066:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 
                    pushFollow(FOLLOW_rulePartialDestruction_in_rule__NoCartouche__Alternatives4499);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2071:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2071:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2072:1: ruleInterfix
                    {
                     before(grammarAccess.getNoCartoucheAccess().getInterfixParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoCartouche__Alternatives4516);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getInterfixParserRuleCall_11()); 

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
    // $ANTLR end "rule__NoCartouche__Alternatives"


    // $ANTLR start "rule__NoExpanded__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2082:1: rule__NoExpanded__Alternatives : ( ( ruleChars ) | ( ruleInterfix ) | ( ruleDisputableReading ) );
    public final void rule__NoExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2086:1: ( ( ruleChars ) | ( ruleInterfix ) | ( ruleDisputableReading ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt9=1;
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
                alt9=2;
                }
                break;
            case 34:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2087:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2087:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2088:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoExpanded__Alternatives4548);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2093:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2093:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2094:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoExpanded__Alternatives4565);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2099:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2099:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2100:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoExpanded__Alternatives4582);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_2()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2110:1: rule__NoEmendation__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) );
    public final void rule__NoEmendation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2114:1: ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
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
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2115:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2115:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2116:1: ruleChars
                    {
                     before(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives4614);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2121:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2121:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2122:1: ruleExpanded
                    {
                     before(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives4631);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2127:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2127:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2128:1: ruleInterfix
                    {
                     before(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoEmendation__Alternatives4648);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2133:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2133:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2134:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoEmendation__Alternatives4665);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_3()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2144:1: rule__NoDisputableReading__Alternatives : ( ( ruleExpanded ) | ( ruleEmendation ) | ( ruleDeletion ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoDisputableReading__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2148:1: ( ( ruleExpanded ) | ( ruleEmendation ) | ( ruleDeletion ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt11=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 42:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 46:
                {
                alt11=6;
                }
                break;
            case 40:
                {
                alt11=7;
                }
                break;
            case 36:
                {
                alt11=8;
                }
                break;
            case 48:
                {
                alt11=9;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt11=10;
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2149:1: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2149:1: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2150:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives4697);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2155:6: ( ruleEmendation )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2155:6: ( ruleEmendation )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2156:1: ruleEmendation
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEmendation_in_rule__NoDisputableReading__Alternatives4714);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2161:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2161:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2162:1: ruleDeletion
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDeletion_in_rule__NoDisputableReading__Alternatives4731);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2167:6: ( ruleRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2167:6: ( ruleRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2168:1: ruleRasur
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRasur_in_rule__NoDisputableReading__Alternatives4748);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2173:6: ( ruleAncientExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2173:6: ( ruleAncientExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2174:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAncientExpanded_in_rule__NoDisputableReading__Alternatives4765);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2179:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2179:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2180:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_rule__NoDisputableReading__Alternatives4782);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2185:6: ( ruleExpandedColumn )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2185:6: ( ruleExpandedColumn )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2186:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleExpandedColumn_in_rule__NoDisputableReading__Alternatives4799);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2191:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2191:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2192:1: ruleLacuna
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLacuna_in_rule__NoDisputableReading__Alternatives4816);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2197:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2197:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2198:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 
                    pushFollow(FOLLOW_rulePartialDestruction_in_rule__NoDisputableReading__Alternatives4833);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2203:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2203:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2204:1: ruleChars
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives4850);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2209:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2209:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2210:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoDisputableReading__Alternatives4867);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_10()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2220:1: rule__NoLacuna__Alternatives : ( ( ruleExpanded ) | ( ruleChars ) | ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) );
    public final void rule__NoLacuna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2224:1: ( ( ruleExpanded ) | ( ruleChars ) | ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt12=2;
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
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            case 28:
                {
                alt12=5;
                }
                break;
            case 24:
                {
                alt12=6;
                }
                break;
            case 26:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2225:1: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2225:1: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2226:1: ruleExpanded
                    {
                     before(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives4899);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2231:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2231:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2232:1: ruleChars
                    {
                     before(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives4916);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2237:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2237:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2238:1: ruleInterfix
                    {
                     before(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoLacuna__Alternatives4933);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2243:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2243:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2244:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoLacuna__Alternatives4950);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2249:6: ( ruleCartouche )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2249:6: ( ruleCartouche )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2250:1: ruleCartouche
                    {
                     before(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCartouche_in_rule__NoLacuna__Alternatives4967);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2255:6: ( ruleOval )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2255:6: ( ruleOval )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2256:1: ruleOval
                    {
                     before(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleOval_in_rule__NoLacuna__Alternatives4984);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2261:6: ( ruleSerech )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2261:6: ( ruleSerech )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2262:1: ruleSerech
                    {
                     before(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSerech_in_rule__NoLacuna__Alternatives5001);
                    ruleSerech();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_6()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2272:1: rule__NoDeletion__Alternatives : ( ( ruleChars ) | ( rulePartialDestruction ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleLacuna ) | ( ruleRestorationOverRasur ) );
    public final void rule__NoDeletion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2276:1: ( ( ruleChars ) | ( rulePartialDestruction ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleLacuna ) | ( ruleRestorationOverRasur ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt13=1;
                }
                break;
            case 48:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
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
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            case 36:
                {
                alt13=6;
                }
                break;
            case 46:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2277:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2277:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2278:1: ruleChars
                    {
                     before(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives5033);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2283:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2283:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2284:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePartialDestruction_in_rule__NoDeletion__Alternatives5050);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2289:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2289:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2290:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoDeletion__Alternatives5067);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2295:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2295:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2296:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoDeletion__Alternatives5084);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2301:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2301:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2302:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoDeletion__Alternatives5101);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2307:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2307:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2308:1: ruleLacuna
                    {
                     before(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleLacuna_in_rule__NoDeletion__Alternatives5118);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2313:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2313:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2314:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleRestorationOverRasur_in_rule__NoDeletion__Alternatives5135);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_6()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2324:1: rule__NoExpandedColumn__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) );
    public final void rule__NoExpandedColumn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2328:1: ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2329:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2329:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2330:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives5167);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2335:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2335:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2336:1: ruleExpanded
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoExpandedColumn__Alternatives5184);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2341:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2341:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2342:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoExpandedColumn__Alternatives5201);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2347:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2347:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2348:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoExpandedColumn__Alternatives5218);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_3()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2358:1: rule__NoRasur__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) );
    public final void rule__NoRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2362:1: ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
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
                alt15=3;
                }
                break;
            case 34:
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2363:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2363:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2364:1: ruleChars
                    {
                     before(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoRasur__Alternatives5250);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2369:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2369:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2370:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoRasur__Alternatives5267);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2375:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2375:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2376:1: ruleInterfix
                    {
                     before(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoRasur__Alternatives5284);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2381:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2381:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2382:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoRasur__Alternatives5301);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_3()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2392:1: rule__NoAncientExpanded__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) );
    public final void rule__NoAncientExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2396:1: ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
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
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2397:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2397:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2398:1: ruleChars
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoAncientExpanded__Alternatives5333);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2403:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2403:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2404:1: ruleExpanded
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoAncientExpanded__Alternatives5350);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2409:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2409:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2410:1: ruleInterfix
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoAncientExpanded__Alternatives5367);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2415:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2415:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2416:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoAncientExpanded__Alternatives5384);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_3()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2426:1: rule__NoRestorationOverRasur__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleCartouche ) );
    public final void rule__NoRestorationOverRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2430:1: ( ( ruleChars ) | ( ruleExpanded ) | ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleCartouche ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt17=1;
                }
                break;
            case 30:
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
            case 34:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2431:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2431:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2432:1: ruleChars
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoRestorationOverRasur__Alternatives5416);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2437:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2437:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2438:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoRestorationOverRasur__Alternatives5433);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2443:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2443:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2444:1: ruleInterfix
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoRestorationOverRasur__Alternatives5450);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2449:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2449:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2450:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoRestorationOverRasur__Alternatives5467);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2455:6: ( ruleCartouche )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2455:6: ( ruleCartouche )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2456:1: ruleCartouche
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCartouche_in_rule__NoRestorationOverRasur__Alternatives5484);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_4()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2466:1: rule__NoPartialDestruction__Alternatives : ( ( ruleChars ) | ( ruleDeletion ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleInterfix ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) );
    public final void rule__NoPartialDestruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2470:1: ( ( ruleChars ) | ( ruleDeletion ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleInterfix ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
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
                alt18=5;
                }
                break;
            case 28:
                {
                alt18=6;
                }
                break;
            case 24:
                {
                alt18=7;
                }
                break;
            case 26:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2471:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2471:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2472:1: ruleChars
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChars_in_rule__NoPartialDestruction__Alternatives5516);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2477:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2477:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2478:1: ruleDeletion
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeletion_in_rule__NoPartialDestruction__Alternatives5533);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2483:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2483:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2484:1: ruleExpanded
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExpanded_in_rule__NoPartialDestruction__Alternatives5550);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2489:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2489:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2490:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDisputableReading_in_rule__NoPartialDestruction__Alternatives5567);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2495:6: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2495:6: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2496:1: ruleInterfix
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleInterfix_in_rule__NoPartialDestruction__Alternatives5584);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2501:6: ( ruleCartouche )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2501:6: ( ruleCartouche )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2502:1: ruleCartouche
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCartouche_in_rule__NoPartialDestruction__Alternatives5601);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2507:6: ( ruleOval )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2507:6: ( ruleOval )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2508:1: ruleOval
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleOval_in_rule__NoPartialDestruction__Alternatives5618);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2513:6: ( ruleSerech )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2513:6: ( ruleSerech )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2514:1: ruleSerech
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleSerech_in_rule__NoPartialDestruction__Alternatives5635);
                    ruleSerech();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_7()); 

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


    // $ANTLR start "rule__Interfix__Alternatives"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2524:1: rule__Interfix__Alternatives : ( ( ruleInterfixFlexion ) | ( ruleInterfixLexical ) | ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixConnectionSyllabicGroup ) | ( ruleInterfixCompoundWords ) | ( ruleInterfixPhoneticalComplement ) );
    public final void rule__Interfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2528:1: ( ( ruleInterfixFlexion ) | ( ruleInterfixLexical ) | ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixConnectionSyllabicGroup ) | ( ruleInterfixCompoundWords ) | ( ruleInterfixPhoneticalComplement ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 50:
                {
                alt19=2;
                }
                break;
            case 52:
                {
                alt19=3;
                }
                break;
            case 53:
                {
                alt19=4;
                }
                break;
            case 54:
                {
                alt19=5;
                }
                break;
            case 55:
                {
                alt19=6;
                }
                break;
            case 56:
                {
                alt19=7;
                }
                break;
            case 57:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2529:1: ( ruleInterfixFlexion )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2529:1: ( ruleInterfixFlexion )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2530:1: ruleInterfixFlexion
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterfixFlexion_in_rule__Interfix__Alternatives5667);
                    ruleInterfixFlexion();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2535:6: ( ruleInterfixLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2535:6: ( ruleInterfixLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2536:1: ruleInterfixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterfixLexical_in_rule__Interfix__Alternatives5684);
                    ruleInterfixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2541:6: ( ruleInterfixSuffixPronomLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2541:6: ( ruleInterfixSuffixPronomLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2542:1: ruleInterfixSuffixPronomLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInterfixSuffixPronomLexical_in_rule__Interfix__Alternatives5701);
                    ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2547:6: ( ruleInterfixPrefixNonLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2547:6: ( ruleInterfixPrefixNonLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2548:1: ruleInterfixPrefixNonLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInterfixPrefixNonLexical_in_rule__Interfix__Alternatives5718);
                    ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2553:6: ( ruleInterfixPrefixLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2553:6: ( ruleInterfixPrefixLexical )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2554:1: ruleInterfixPrefixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleInterfixPrefixLexical_in_rule__Interfix__Alternatives5735);
                    ruleInterfixPrefixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2559:6: ( ruleInterfixConnectionSyllabicGroup )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2559:6: ( ruleInterfixConnectionSyllabicGroup )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2560:1: ruleInterfixConnectionSyllabicGroup
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleInterfixConnectionSyllabicGroup_in_rule__Interfix__Alternatives5752);
                    ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2565:6: ( ruleInterfixCompoundWords )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2565:6: ( ruleInterfixCompoundWords )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2566:1: ruleInterfixCompoundWords
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleInterfixCompoundWords_in_rule__Interfix__Alternatives5769);
                    ruleInterfixCompoundWords();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2571:6: ( ruleInterfixPhoneticalComplement )
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2571:6: ( ruleInterfixPhoneticalComplement )
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2572:1: ruleInterfixPhoneticalComplement
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleInterfixPhoneticalComplement_in_rule__Interfix__Alternatives5786);
                    ruleInterfixPhoneticalComplement();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 

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


    // $ANTLR start "rule__TextContent__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2584:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2588:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2589:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__05816);
            rule__TextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__05819);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2596:1: rule__TextContent__Group__0__Impl : ( () ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2600:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2601:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2601:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2602:1: ()
            {
             before(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2603:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2605:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2615:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2619:1: ( rule__TextContent__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2620:2: rule__TextContent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__15877);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2626:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__Group_1__0 ) ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2630:1: ( ( ( rule__TextContent__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2631:1: ( ( rule__TextContent__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2631:1: ( ( rule__TextContent__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2632:1: ( rule__TextContent__Group_1__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2633:1: ( rule__TextContent__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2633:2: rule__TextContent__Group_1__0
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl5904);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2647:1: rule__TextContent__Group_1__0 : rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 ;
    public final void rule__TextContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2651:1: ( rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2652:2: rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__05938);
            rule__TextContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__05941);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2659:1: rule__TextContent__Group_1__0__Impl : ( ( rule__TextContent__ItemsAssignment_1_0 ) ) ;
    public final void rule__TextContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2663:1: ( ( ( rule__TextContent__ItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2664:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2664:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2665:1: ( rule__TextContent__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2666:1: ( rule__TextContent__ItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2666:2: rule__TextContent__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl5968);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2676:1: rule__TextContent__Group_1__1 : rule__TextContent__Group_1__1__Impl ;
    public final void rule__TextContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2680:1: ( rule__TextContent__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2681:2: rule__TextContent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__15998);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2687:1: rule__TextContent__Group_1__1__Impl : ( ( rule__TextContent__Group_1_1__0 )* ) ;
    public final void rule__TextContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2691:1: ( ( ( rule__TextContent__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2692:1: ( ( rule__TextContent__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2692:1: ( ( rule__TextContent__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2693:1: ( rule__TextContent__Group_1_1__0 )*
            {
             before(grammarAccess.getTextContentAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2694:1: ( rule__TextContent__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_NEWLINE||(LA20_0>=9 && LA20_0<=10)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2694:2: rule__TextContent__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextContent__Group_1_1__0_in_rule__TextContent__Group_1__1__Impl6025);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2708:1: rule__TextContent__Group_1_1__0 : rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 ;
    public final void rule__TextContent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2712:1: ( rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2713:2: rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1_1__0__Impl_in_rule__TextContent__Group_1_1__06060);
            rule__TextContent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextContent__Group_1_1__1_in_rule__TextContent__Group_1_1__06063);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2720:1: rule__TextContent__Group_1_1__0__Impl : ( ( rule__TextContent__Alternatives_1_1_0 )? ) ;
    public final void rule__TextContent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2724:1: ( ( ( rule__TextContent__Alternatives_1_1_0 )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2725:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2725:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2726:1: ( rule__TextContent__Alternatives_1_1_0 )?
            {
             before(grammarAccess.getTextContentAccess().getAlternatives_1_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2727:1: ( rule__TextContent__Alternatives_1_1_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NEWLINE||LA21_0==9) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2727:2: rule__TextContent__Alternatives_1_1_0
                    {
                    pushFollow(FOLLOW_rule__TextContent__Alternatives_1_1_0_in_rule__TextContent__Group_1_1__0__Impl6090);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2737:1: rule__TextContent__Group_1_1__1 : rule__TextContent__Group_1_1__1__Impl ;
    public final void rule__TextContent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2741:1: ( rule__TextContent__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2742:2: rule__TextContent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextContent__Group_1_1__1__Impl_in_rule__TextContent__Group_1_1__16121);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2748:1: rule__TextContent__Group_1_1__1__Impl : ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__TextContent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2752:1: ( ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2753:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2753:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2754:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2755:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2755:2: rule__TextContent__ItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__TextContent__ItemsAssignment_1_1_1_in_rule__TextContent__Group_1_1__1__Impl6148);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2769:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2773:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2774:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__06182);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__06185);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2781:1: rule__Sentence__Group__0__Impl : ( () ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2785:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2786:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2786:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2787:1: ()
            {
             before(grammarAccess.getSentenceAccess().getSentenceAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2788:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2790:1: 
            {
            }

             after(grammarAccess.getSentenceAccess().getSentenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2800:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl rule__Sentence__Group__2 ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2804:1: ( rule__Sentence__Group__1__Impl rule__Sentence__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2805:2: rule__Sentence__Group__1__Impl rule__Sentence__Group__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__16243);
            rule__Sentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__16246);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2812:1: rule__Sentence__Group__1__Impl : ( '\\u00A7' ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2816:1: ( ( '\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2817:1: ( '\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2817:1: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2818:1: '\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getSectionSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__Sentence__Group__1__Impl6274); 
             after(grammarAccess.getSentenceAccess().getSectionSignKeyword_1()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2831:1: rule__Sentence__Group__2 : rule__Sentence__Group__2__Impl rule__Sentence__Group__3 ;
    public final void rule__Sentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2835:1: ( rule__Sentence__Group__2__Impl rule__Sentence__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2836:2: rule__Sentence__Group__2__Impl rule__Sentence__Group__3
            {
            pushFollow(FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__26305);
            rule__Sentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group__3_in_rule__Sentence__Group__26308);
            rule__Sentence__Group__3();

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2843:1: rule__Sentence__Group__2__Impl : ( ( rule__Sentence__Group_2__0 )? ) ;
    public final void rule__Sentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2847:1: ( ( ( rule__Sentence__Group_2__0 )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2848:1: ( ( rule__Sentence__Group_2__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2848:1: ( ( rule__Sentence__Group_2__0 )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2849:1: ( rule__Sentence__Group_2__0 )?
            {
             before(grammarAccess.getSentenceAccess().getGroup_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2850:1: ( rule__Sentence__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_BETWEEN_HASHES && LA22_0<=RULE_EGYSTRING)||LA22_0==11||(LA22_0>=13 && LA22_0<=24)||LA22_0==26||LA22_0==28||LA22_0==30||LA22_0==32||LA22_0==34||LA22_0==36||LA22_0==38||LA22_0==40||LA22_0==42||LA22_0==44||LA22_0==46||LA22_0==48||(LA22_0>=50 && LA22_0<=57)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2850:2: rule__Sentence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Sentence__Group_2__0_in_rule__Sentence__Group__2__Impl6335);
                    rule__Sentence__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSentenceAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Sentence__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2860:1: rule__Sentence__Group__3 : rule__Sentence__Group__3__Impl ;
    public final void rule__Sentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2864:1: ( rule__Sentence__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2865:2: rule__Sentence__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group__3__Impl_in_rule__Sentence__Group__36366);
            rule__Sentence__Group__3__Impl();

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
    // $ANTLR end "rule__Sentence__Group__3"


    // $ANTLR start "rule__Sentence__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2871:1: rule__Sentence__Group__3__Impl : ( '\\u00A7' ) ;
    public final void rule__Sentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2875:1: ( ( '\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2876:1: ( '\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2876:1: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2877:1: '\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getSectionSignKeyword_3()); 
            match(input,10,FOLLOW_10_in_rule__Sentence__Group__3__Impl6394); 
             after(grammarAccess.getSentenceAccess().getSectionSignKeyword_3()); 

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
    // $ANTLR end "rule__Sentence__Group__3__Impl"


    // $ANTLR start "rule__Sentence__Group_2__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2898:1: rule__Sentence__Group_2__0 : rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1 ;
    public final void rule__Sentence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2902:1: ( rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2903:2: rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_2__0__Impl_in_rule__Sentence__Group_2__06433);
            rule__Sentence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_2__1_in_rule__Sentence__Group_2__06436);
            rule__Sentence__Group_2__1();

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
    // $ANTLR end "rule__Sentence__Group_2__0"


    // $ANTLR start "rule__Sentence__Group_2__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2910:1: rule__Sentence__Group_2__0__Impl : ( ( rule__Sentence__ItemsAssignment_2_0 ) ) ;
    public final void rule__Sentence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2914:1: ( ( ( rule__Sentence__ItemsAssignment_2_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2915:1: ( ( rule__Sentence__ItemsAssignment_2_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2915:1: ( ( rule__Sentence__ItemsAssignment_2_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2916:1: ( rule__Sentence__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_2_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2917:1: ( rule__Sentence__ItemsAssignment_2_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2917:2: rule__Sentence__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Sentence__ItemsAssignment_2_0_in_rule__Sentence__Group_2__0__Impl6463);
            rule__Sentence__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getItemsAssignment_2_0()); 

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
    // $ANTLR end "rule__Sentence__Group_2__0__Impl"


    // $ANTLR start "rule__Sentence__Group_2__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2927:1: rule__Sentence__Group_2__1 : rule__Sentence__Group_2__1__Impl ;
    public final void rule__Sentence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2931:1: ( rule__Sentence__Group_2__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2932:2: rule__Sentence__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_2__1__Impl_in_rule__Sentence__Group_2__16493);
            rule__Sentence__Group_2__1__Impl();

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
    // $ANTLR end "rule__Sentence__Group_2__1"


    // $ANTLR start "rule__Sentence__Group_2__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2938:1: rule__Sentence__Group_2__1__Impl : ( ( rule__Sentence__Group_2_1__0 )* ) ;
    public final void rule__Sentence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2942:1: ( ( ( rule__Sentence__Group_2_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2943:1: ( ( rule__Sentence__Group_2_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2943:1: ( ( rule__Sentence__Group_2_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2944:1: ( rule__Sentence__Group_2_1__0 )*
            {
             before(grammarAccess.getSentenceAccess().getGroup_2_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2945:1: ( rule__Sentence__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==9) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2945:2: rule__Sentence__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Sentence__Group_2_1__0_in_rule__Sentence__Group_2__1__Impl6520);
            	    rule__Sentence__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Sentence__Group_2__1__Impl"


    // $ANTLR start "rule__Sentence__Group_2_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2959:1: rule__Sentence__Group_2_1__0 : rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1 ;
    public final void rule__Sentence__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2963:1: ( rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2964:2: rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Sentence__Group_2_1__0__Impl_in_rule__Sentence__Group_2_1__06555);
            rule__Sentence__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_2_1__1_in_rule__Sentence__Group_2_1__06558);
            rule__Sentence__Group_2_1__1();

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
    // $ANTLR end "rule__Sentence__Group_2_1__0"


    // $ANTLR start "rule__Sentence__Group_2_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2971:1: rule__Sentence__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__Sentence__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2975:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2976:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2976:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2977:1: ' '
            {
             before(grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0()); 
            match(input,9,FOLLOW_9_in_rule__Sentence__Group_2_1__0__Impl6586); 
             after(grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Sentence__Group_2_1__0__Impl"


    // $ANTLR start "rule__Sentence__Group_2_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2990:1: rule__Sentence__Group_2_1__1 : rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2 ;
    public final void rule__Sentence__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2994:1: ( rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:2995:2: rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Sentence__Group_2_1__1__Impl_in_rule__Sentence__Group_2_1__16617);
            rule__Sentence__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sentence__Group_2_1__2_in_rule__Sentence__Group_2_1__16620);
            rule__Sentence__Group_2_1__2();

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
    // $ANTLR end "rule__Sentence__Group_2_1__1"


    // $ANTLR start "rule__Sentence__Group_2_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3002:1: rule__Sentence__Group_2_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Sentence__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3006:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3007:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3007:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3008:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3009:1: ( RULE_NEWLINE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NEWLINE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3009:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Sentence__Group_2_1__1__Impl6648); 

                    }
                    break;

            }

             after(grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 

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
    // $ANTLR end "rule__Sentence__Group_2_1__1__Impl"


    // $ANTLR start "rule__Sentence__Group_2_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3019:1: rule__Sentence__Group_2_1__2 : rule__Sentence__Group_2_1__2__Impl ;
    public final void rule__Sentence__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3023:1: ( rule__Sentence__Group_2_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3024:2: rule__Sentence__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Sentence__Group_2_1__2__Impl_in_rule__Sentence__Group_2_1__26679);
            rule__Sentence__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Sentence__Group_2_1__2"


    // $ANTLR start "rule__Sentence__Group_2_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3030:1: rule__Sentence__Group_2_1__2__Impl : ( ( rule__Sentence__ItemsAssignment_2_1_2 ) ) ;
    public final void rule__Sentence__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3034:1: ( ( ( rule__Sentence__ItemsAssignment_2_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3035:1: ( ( rule__Sentence__ItemsAssignment_2_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3035:1: ( ( rule__Sentence__ItemsAssignment_2_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3036:1: ( rule__Sentence__ItemsAssignment_2_1_2 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_2_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3037:1: ( rule__Sentence__ItemsAssignment_2_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3037:2: rule__Sentence__ItemsAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__Sentence__ItemsAssignment_2_1_2_in_rule__Sentence__Group_2_1__2__Impl6706);
            rule__Sentence__ItemsAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getItemsAssignment_2_1_2()); 

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
    // $ANTLR end "rule__Sentence__Group_2_1__2__Impl"


    // $ANTLR start "rule__Ambivalence__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3053:1: rule__Ambivalence__Group__0 : rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 ;
    public final void rule__Ambivalence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3057:1: ( rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3058:2: rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__06742);
            rule__Ambivalence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__06745);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3065:1: rule__Ambivalence__Group__0__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3069:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3070:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3070:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3071:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Ambivalence__Group__0__Impl6773); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3084:1: rule__Ambivalence__Group__1 : rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 ;
    public final void rule__Ambivalence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3088:1: ( rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3089:2: rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__16804);
            rule__Ambivalence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__16807);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3096:1: rule__Ambivalence__Group__1__Impl : ( ( rule__Ambivalence__Group_1__0 ) ) ;
    public final void rule__Ambivalence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3100:1: ( ( ( rule__Ambivalence__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3101:1: ( ( rule__Ambivalence__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3101:1: ( ( rule__Ambivalence__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3102:1: ( rule__Ambivalence__Group_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3103:1: ( rule__Ambivalence__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3103:2: rule__Ambivalence__Group_1__0
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl6834);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3113:1: rule__Ambivalence__Group__2 : rule__Ambivalence__Group__2__Impl ;
    public final void rule__Ambivalence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3117:1: ( rule__Ambivalence__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3118:2: rule__Ambivalence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__26864);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3124:1: rule__Ambivalence__Group__2__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3128:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3129:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3129:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3130:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__Ambivalence__Group__2__Impl6892); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3149:1: rule__Ambivalence__Group_1__0 : rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 ;
    public final void rule__Ambivalence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3153:1: ( rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3154:2: rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__06929);
            rule__Ambivalence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__06932);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3161:1: rule__Ambivalence__Group_1__0__Impl : ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) ;
    public final void rule__Ambivalence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3165:1: ( ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3166:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3166:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3167:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3168:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3168:2: rule__Ambivalence__CasesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl6959);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3178:1: rule__Ambivalence__Group_1__1 : rule__Ambivalence__Group_1__1__Impl ;
    public final void rule__Ambivalence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3182:1: ( rule__Ambivalence__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3183:2: rule__Ambivalence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__16989);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3189:1: rule__Ambivalence__Group_1__1__Impl : ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) ;
    public final void rule__Ambivalence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3193:1: ( ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3194:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3194:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3195:1: ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3195:1: ( ( rule__Ambivalence__Group_1_1__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3196:1: ( rule__Ambivalence__Group_1_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3197:1: ( rule__Ambivalence__Group_1_1__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3197:2: rule__Ambivalence__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl7018);
            rule__Ambivalence__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3200:1: ( ( rule__Ambivalence__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3201:1: ( rule__Ambivalence__Group_1_1__0 )*
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3202:1: ( rule__Ambivalence__Group_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3202:2: rule__Ambivalence__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl7030);
            	    rule__Ambivalence__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3217:1: rule__Ambivalence__Group_1_1__0 : rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 ;
    public final void rule__Ambivalence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3221:1: ( rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3222:2: rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__07067);
            rule__Ambivalence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__07070);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3229:1: rule__Ambivalence__Group_1_1__0__Impl : ( '| ' ) ;
    public final void rule__Ambivalence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3233:1: ( ( '| ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3234:1: ( '| ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3234:1: ( '| ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3235:1: '| '
            {
             before(grammarAccess.getAmbivalenceAccess().getVerticalLineSpaceKeyword_1_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Ambivalence__Group_1_1__0__Impl7098); 
             after(grammarAccess.getAmbivalenceAccess().getVerticalLineSpaceKeyword_1_1_0()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3248:1: rule__Ambivalence__Group_1_1__1 : rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 ;
    public final void rule__Ambivalence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3252:1: ( rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3253:2: rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__17129);
            rule__Ambivalence__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__2_in_rule__Ambivalence__Group_1_1__17132);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3260:1: rule__Ambivalence__Group_1_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Ambivalence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3264:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3265:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3265:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3266:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3267:1: ( RULE_NEWLINE )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NEWLINE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3267:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Ambivalence__Group_1_1__1__Impl7160); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3277:1: rule__Ambivalence__Group_1_1__2 : rule__Ambivalence__Group_1_1__2__Impl ;
    public final void rule__Ambivalence__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3281:1: ( rule__Ambivalence__Group_1_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3282:2: rule__Ambivalence__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Ambivalence__Group_1_1__2__Impl_in_rule__Ambivalence__Group_1_1__27191);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3288:1: rule__Ambivalence__Group_1_1__2__Impl : ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) ;
    public final void rule__Ambivalence__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3292:1: ( ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3293:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3293:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3294:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3295:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3295:2: rule__Ambivalence__CasesAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Ambivalence__CasesAssignment_1_1_2_in_rule__Ambivalence__Group_1_1__2__Impl7218);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3311:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3315:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3316:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__07254);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__07257);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3323:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3327:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3328:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3328:1: ( ( rule__Case__NameAssignment_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3329:1: ( rule__Case__NameAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3330:1: ( rule__Case__NameAssignment_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3330:2: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl7284);
            rule__Case__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNameAssignment_0()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3340:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3344:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3345:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__17314);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__17317);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3352:1: rule__Case__Group__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3356:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3357:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3357:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3358:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3359:1: ( RULE_NEWLINE )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NEWLINE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3359:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Case__Group__1__Impl7345); 

                    }
                    break;

            }

             after(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3369:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3373:1: ( rule__Case__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3374:2: rule__Case__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__27376);
            rule__Case__Group__2__Impl();

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3380:1: rule__Case__Group__2__Impl : ( ( rule__Case__Group_2__0 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3384:1: ( ( ( rule__Case__Group_2__0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3385:1: ( ( rule__Case__Group_2__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3385:1: ( ( rule__Case__Group_2__0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3386:1: ( rule__Case__Group_2__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3387:1: ( rule__Case__Group_2__0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3387:2: rule__Case__Group_2__0
            {
            pushFollow(FOLLOW_rule__Case__Group_2__0_in_rule__Case__Group__2__Impl7403);
            rule__Case__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Case__Group_2__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3403:1: rule__Case__Group_2__0 : rule__Case__Group_2__0__Impl rule__Case__Group_2__1 ;
    public final void rule__Case__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3407:1: ( rule__Case__Group_2__0__Impl rule__Case__Group_2__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3408:2: rule__Case__Group_2__0__Impl rule__Case__Group_2__1
            {
            pushFollow(FOLLOW_rule__Case__Group_2__0__Impl_in_rule__Case__Group_2__07439);
            rule__Case__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_2__1_in_rule__Case__Group_2__07442);
            rule__Case__Group_2__1();

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
    // $ANTLR end "rule__Case__Group_2__0"


    // $ANTLR start "rule__Case__Group_2__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3415:1: rule__Case__Group_2__0__Impl : ( ( rule__Case__ItemsAssignment_2_0 ) ) ;
    public final void rule__Case__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3419:1: ( ( ( rule__Case__ItemsAssignment_2_0 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3420:1: ( ( rule__Case__ItemsAssignment_2_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3420:1: ( ( rule__Case__ItemsAssignment_2_0 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3421:1: ( rule__Case__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_2_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3422:1: ( rule__Case__ItemsAssignment_2_0 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3422:2: rule__Case__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Case__ItemsAssignment_2_0_in_rule__Case__Group_2__0__Impl7469);
            rule__Case__ItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getItemsAssignment_2_0()); 

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
    // $ANTLR end "rule__Case__Group_2__0__Impl"


    // $ANTLR start "rule__Case__Group_2__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3432:1: rule__Case__Group_2__1 : rule__Case__Group_2__1__Impl ;
    public final void rule__Case__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3436:1: ( rule__Case__Group_2__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3437:2: rule__Case__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group_2__1__Impl_in_rule__Case__Group_2__17499);
            rule__Case__Group_2__1__Impl();

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
    // $ANTLR end "rule__Case__Group_2__1"


    // $ANTLR start "rule__Case__Group_2__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3443:1: rule__Case__Group_2__1__Impl : ( ( rule__Case__Group_2_1__0 )* ) ;
    public final void rule__Case__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3447:1: ( ( ( rule__Case__Group_2_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3448:1: ( ( rule__Case__Group_2_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3448:1: ( ( rule__Case__Group_2_1__0 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3449:1: ( rule__Case__Group_2_1__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_2_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3450:1: ( rule__Case__Group_2_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==9) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3450:2: rule__Case__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Case__Group_2_1__0_in_rule__Case__Group_2__1__Impl7526);
            	    rule__Case__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Case__Group_2__1__Impl"


    // $ANTLR start "rule__Case__Group_2_1__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3464:1: rule__Case__Group_2_1__0 : rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1 ;
    public final void rule__Case__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3468:1: ( rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3469:2: rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Case__Group_2_1__0__Impl_in_rule__Case__Group_2_1__07561);
            rule__Case__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_2_1__1_in_rule__Case__Group_2_1__07564);
            rule__Case__Group_2_1__1();

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
    // $ANTLR end "rule__Case__Group_2_1__0"


    // $ANTLR start "rule__Case__Group_2_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3476:1: rule__Case__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__Case__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3480:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3481:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3481:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3482:1: ' '
            {
             before(grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0()); 
            match(input,9,FOLLOW_9_in_rule__Case__Group_2_1__0__Impl7592); 
             after(grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Case__Group_2_1__0__Impl"


    // $ANTLR start "rule__Case__Group_2_1__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3495:1: rule__Case__Group_2_1__1 : rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2 ;
    public final void rule__Case__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3499:1: ( rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3500:2: rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Case__Group_2_1__1__Impl_in_rule__Case__Group_2_1__17623);
            rule__Case__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group_2_1__2_in_rule__Case__Group_2_1__17626);
            rule__Case__Group_2_1__2();

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
    // $ANTLR end "rule__Case__Group_2_1__1"


    // $ANTLR start "rule__Case__Group_2_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3507:1: rule__Case__Group_2_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3511:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3512:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3512:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3513:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3514:1: ( RULE_NEWLINE )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NEWLINE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3514:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Case__Group_2_1__1__Impl7654); 

                    }
                    break;

            }

             after(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 

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
    // $ANTLR end "rule__Case__Group_2_1__1__Impl"


    // $ANTLR start "rule__Case__Group_2_1__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3524:1: rule__Case__Group_2_1__2 : rule__Case__Group_2_1__2__Impl ;
    public final void rule__Case__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3528:1: ( rule__Case__Group_2_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3529:2: rule__Case__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group_2_1__2__Impl_in_rule__Case__Group_2_1__27685);
            rule__Case__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Case__Group_2_1__2"


    // $ANTLR start "rule__Case__Group_2_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3535:1: rule__Case__Group_2_1__2__Impl : ( ( rule__Case__ItemsAssignment_2_1_2 ) ) ;
    public final void rule__Case__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3539:1: ( ( ( rule__Case__ItemsAssignment_2_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3540:1: ( ( rule__Case__ItemsAssignment_2_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3540:1: ( ( rule__Case__ItemsAssignment_2_1_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3541:1: ( rule__Case__ItemsAssignment_2_1_2 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_2_1_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3542:1: ( rule__Case__ItemsAssignment_2_1_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3542:2: rule__Case__ItemsAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__Case__ItemsAssignment_2_1_2_in_rule__Case__Group_2_1__2__Impl7712);
            rule__Case__ItemsAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getItemsAssignment_2_1_2()); 

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
    // $ANTLR end "rule__Case__Group_2_1__2__Impl"


    // $ANTLR start "rule__DisputableVersMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3558:1: rule__DisputableVersMarker__Group__0 : rule__DisputableVersMarker__Group__0__Impl rule__DisputableVersMarker__Group__1 ;
    public final void rule__DisputableVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3562:1: ( rule__DisputableVersMarker__Group__0__Impl rule__DisputableVersMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3563:2: rule__DisputableVersMarker__Group__0__Impl rule__DisputableVersMarker__Group__1
            {
            pushFollow(FOLLOW_rule__DisputableVersMarker__Group__0__Impl_in_rule__DisputableVersMarker__Group__07748);
            rule__DisputableVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableVersMarker__Group__1_in_rule__DisputableVersMarker__Group__07751);
            rule__DisputableVersMarker__Group__1();

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
    // $ANTLR end "rule__DisputableVersMarker__Group__0"


    // $ANTLR start "rule__DisputableVersMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3570:1: rule__DisputableVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__DisputableVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3574:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3575:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3575:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3576:1: ()
            {
             before(grammarAccess.getDisputableVersMarkerAccess().getDisputableVersMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3577:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3579:1: 
            {
            }

             after(grammarAccess.getDisputableVersMarkerAccess().getDisputableVersMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisputableVersMarker__Group__0__Impl"


    // $ANTLR start "rule__DisputableVersMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3589:1: rule__DisputableVersMarker__Group__1 : rule__DisputableVersMarker__Group__1__Impl ;
    public final void rule__DisputableVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3593:1: ( rule__DisputableVersMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3594:2: rule__DisputableVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DisputableVersMarker__Group__1__Impl_in_rule__DisputableVersMarker__Group__17809);
            rule__DisputableVersMarker__Group__1__Impl();

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
    // $ANTLR end "rule__DisputableVersMarker__Group__1"


    // $ANTLR start "rule__DisputableVersMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3600:1: rule__DisputableVersMarker__Group__1__Impl : ( '\\u2E2E\\uDB80\\uDC80?' ) ;
    public final void rule__DisputableVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3604:1: ( ( '\\u2E2E\\uDB80\\uDC80?' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3605:1: ( '\\u2E2E\\uDB80\\uDC80?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3605:1: ( '\\u2E2E\\uDB80\\uDC80?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3606:1: '\\u2E2E\\uDB80\\uDC80?'
            {
             before(grammarAccess.getDisputableVersMarkerAccess().getReversedQuestionMarkLeadSurrogateDb80TrailSurrogateDc80QuestionMarkKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__DisputableVersMarker__Group__1__Impl7837); 
             after(grammarAccess.getDisputableVersMarkerAccess().getReversedQuestionMarkLeadSurrogateDb80TrailSurrogateDc80QuestionMarkKeyword_1()); 

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
    // $ANTLR end "rule__DisputableVersMarker__Group__1__Impl"


    // $ANTLR start "rule__DeletedVersMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3623:1: rule__DeletedVersMarker__Group__0 : rule__DeletedVersMarker__Group__0__Impl rule__DeletedVersMarker__Group__1 ;
    public final void rule__DeletedVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3627:1: ( rule__DeletedVersMarker__Group__0__Impl rule__DeletedVersMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3628:2: rule__DeletedVersMarker__Group__0__Impl rule__DeletedVersMarker__Group__1
            {
            pushFollow(FOLLOW_rule__DeletedVersMarker__Group__0__Impl_in_rule__DeletedVersMarker__Group__07872);
            rule__DeletedVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeletedVersMarker__Group__1_in_rule__DeletedVersMarker__Group__07875);
            rule__DeletedVersMarker__Group__1();

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
    // $ANTLR end "rule__DeletedVersMarker__Group__0"


    // $ANTLR start "rule__DeletedVersMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3635:1: rule__DeletedVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__DeletedVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3639:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3640:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3640:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3641:1: ()
            {
             before(grammarAccess.getDeletedVersMarkerAccess().getDeletedVersMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3642:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3644:1: 
            {
            }

             after(grammarAccess.getDeletedVersMarkerAccess().getDeletedVersMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeletedVersMarker__Group__0__Impl"


    // $ANTLR start "rule__DeletedVersMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3654:1: rule__DeletedVersMarker__Group__1 : rule__DeletedVersMarker__Group__1__Impl ;
    public final void rule__DeletedVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3658:1: ( rule__DeletedVersMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3659:2: rule__DeletedVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeletedVersMarker__Group__1__Impl_in_rule__DeletedVersMarker__Group__17933);
            rule__DeletedVersMarker__Group__1__Impl();

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
    // $ANTLR end "rule__DeletedVersMarker__Group__1"


    // $ANTLR start "rule__DeletedVersMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3665:1: rule__DeletedVersMarker__Group__1__Impl : ( '{\\uDB80\\uDC80}' ) ;
    public final void rule__DeletedVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3669:1: ( ( '{\\uDB80\\uDC80}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3670:1: ( '{\\uDB80\\uDC80}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3670:1: ( '{\\uDB80\\uDC80}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3671:1: '{\\uDB80\\uDC80}'
            {
             before(grammarAccess.getDeletedVersMarkerAccess().getLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__DeletedVersMarker__Group__1__Impl7961); 
             after(grammarAccess.getDeletedVersMarkerAccess().getLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__DeletedVersMarker__Group__1__Impl"


    // $ANTLR start "rule__DestroyedVersMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3688:1: rule__DestroyedVersMarker__Group__0 : rule__DestroyedVersMarker__Group__0__Impl rule__DestroyedVersMarker__Group__1 ;
    public final void rule__DestroyedVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3692:1: ( rule__DestroyedVersMarker__Group__0__Impl rule__DestroyedVersMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3693:2: rule__DestroyedVersMarker__Group__0__Impl rule__DestroyedVersMarker__Group__1
            {
            pushFollow(FOLLOW_rule__DestroyedVersMarker__Group__0__Impl_in_rule__DestroyedVersMarker__Group__07996);
            rule__DestroyedVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DestroyedVersMarker__Group__1_in_rule__DestroyedVersMarker__Group__07999);
            rule__DestroyedVersMarker__Group__1();

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
    // $ANTLR end "rule__DestroyedVersMarker__Group__0"


    // $ANTLR start "rule__DestroyedVersMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3700:1: rule__DestroyedVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__DestroyedVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3704:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3705:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3705:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3706:1: ()
            {
             before(grammarAccess.getDestroyedVersMarkerAccess().getDestroyedVersMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3707:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3709:1: 
            {
            }

             after(grammarAccess.getDestroyedVersMarkerAccess().getDestroyedVersMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestroyedVersMarker__Group__0__Impl"


    // $ANTLR start "rule__DestroyedVersMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3719:1: rule__DestroyedVersMarker__Group__1 : rule__DestroyedVersMarker__Group__1__Impl ;
    public final void rule__DestroyedVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3723:1: ( rule__DestroyedVersMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3724:2: rule__DestroyedVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DestroyedVersMarker__Group__1__Impl_in_rule__DestroyedVersMarker__Group__18057);
            rule__DestroyedVersMarker__Group__1__Impl();

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
    // $ANTLR end "rule__DestroyedVersMarker__Group__1"


    // $ANTLR start "rule__DestroyedVersMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3730:1: rule__DestroyedVersMarker__Group__1__Impl : ( '[\\uDB80\\uDC80]' ) ;
    public final void rule__DestroyedVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3734:1: ( ( '[\\uDB80\\uDC80]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3735:1: ( '[\\uDB80\\uDC80]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3735:1: ( '[\\uDB80\\uDC80]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3736:1: '[\\uDB80\\uDC80]'
            {
             before(grammarAccess.getDestroyedVersMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__DestroyedVersMarker__Group__1__Impl8085); 
             after(grammarAccess.getDestroyedVersMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__DestroyedVersMarker__Group__1__Impl"


    // $ANTLR start "rule__MissingVersMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3753:1: rule__MissingVersMarker__Group__0 : rule__MissingVersMarker__Group__0__Impl rule__MissingVersMarker__Group__1 ;
    public final void rule__MissingVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3757:1: ( rule__MissingVersMarker__Group__0__Impl rule__MissingVersMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3758:2: rule__MissingVersMarker__Group__0__Impl rule__MissingVersMarker__Group__1
            {
            pushFollow(FOLLOW_rule__MissingVersMarker__Group__0__Impl_in_rule__MissingVersMarker__Group__08120);
            rule__MissingVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MissingVersMarker__Group__1_in_rule__MissingVersMarker__Group__08123);
            rule__MissingVersMarker__Group__1();

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
    // $ANTLR end "rule__MissingVersMarker__Group__0"


    // $ANTLR start "rule__MissingVersMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3765:1: rule__MissingVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__MissingVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3769:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3770:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3770:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3771:1: ()
            {
             before(grammarAccess.getMissingVersMarkerAccess().getMissingVersMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3772:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3774:1: 
            {
            }

             after(grammarAccess.getMissingVersMarkerAccess().getMissingVersMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissingVersMarker__Group__0__Impl"


    // $ANTLR start "rule__MissingVersMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3784:1: rule__MissingVersMarker__Group__1 : rule__MissingVersMarker__Group__1__Impl ;
    public final void rule__MissingVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3788:1: ( rule__MissingVersMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3789:2: rule__MissingVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MissingVersMarker__Group__1__Impl_in_rule__MissingVersMarker__Group__18181);
            rule__MissingVersMarker__Group__1__Impl();

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
    // $ANTLR end "rule__MissingVersMarker__Group__1"


    // $ANTLR start "rule__MissingVersMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3795:1: rule__MissingVersMarker__Group__1__Impl : ( '\\u2329\\uDB80\\uDC80\\u232A' ) ;
    public final void rule__MissingVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3799:1: ( ( '\\u2329\\uDB80\\uDC80\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3800:1: ( '\\u2329\\uDB80\\uDC80\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3800:1: ( '\\u2329\\uDB80\\uDC80\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3801:1: '\\u2329\\uDB80\\uDC80\\u232A'
            {
             before(grammarAccess.getMissingVersMarkerAccess().getLeftPointingAngleBracketLeadSurrogateDb80TrailSurrogateDc80RightPointingAngleBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__MissingVersMarker__Group__1__Impl8209); 
             after(grammarAccess.getMissingVersMarkerAccess().getLeftPointingAngleBracketLeadSurrogateDb80TrailSurrogateDc80RightPointingAngleBracketKeyword_1()); 

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
    // $ANTLR end "rule__MissingVersMarker__Group__1__Impl"


    // $ANTLR start "rule__RestorationOverRasurMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3818:1: rule__RestorationOverRasurMarker__Group__0 : rule__RestorationOverRasurMarker__Group__0__Impl rule__RestorationOverRasurMarker__Group__1 ;
    public final void rule__RestorationOverRasurMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3822:1: ( rule__RestorationOverRasurMarker__Group__0__Impl rule__RestorationOverRasurMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3823:2: rule__RestorationOverRasurMarker__Group__0__Impl rule__RestorationOverRasurMarker__Group__1
            {
            pushFollow(FOLLOW_rule__RestorationOverRasurMarker__Group__0__Impl_in_rule__RestorationOverRasurMarker__Group__08244);
            rule__RestorationOverRasurMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasurMarker__Group__1_in_rule__RestorationOverRasurMarker__Group__08247);
            rule__RestorationOverRasurMarker__Group__1();

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
    // $ANTLR end "rule__RestorationOverRasurMarker__Group__0"


    // $ANTLR start "rule__RestorationOverRasurMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3830:1: rule__RestorationOverRasurMarker__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasurMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3834:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3835:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3835:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3836:1: ()
            {
             before(grammarAccess.getRestorationOverRasurMarkerAccess().getRestorationOverRasurMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3837:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3839:1: 
            {
            }

             after(grammarAccess.getRestorationOverRasurMarkerAccess().getRestorationOverRasurMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestorationOverRasurMarker__Group__0__Impl"


    // $ANTLR start "rule__RestorationOverRasurMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3849:1: rule__RestorationOverRasurMarker__Group__1 : rule__RestorationOverRasurMarker__Group__1__Impl ;
    public final void rule__RestorationOverRasurMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3853:1: ( rule__RestorationOverRasurMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3854:2: rule__RestorationOverRasurMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RestorationOverRasurMarker__Group__1__Impl_in_rule__RestorationOverRasurMarker__Group__18305);
            rule__RestorationOverRasurMarker__Group__1__Impl();

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
    // $ANTLR end "rule__RestorationOverRasurMarker__Group__1"


    // $ANTLR start "rule__RestorationOverRasurMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3860:1: rule__RestorationOverRasurMarker__Group__1__Impl : ( '[[\\uDB80\\uDC80]]' ) ;
    public final void rule__RestorationOverRasurMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3864:1: ( ( '[[\\uDB80\\uDC80]]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3865:1: ( '[[\\uDB80\\uDC80]]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3865:1: ( '[[\\uDB80\\uDC80]]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3866:1: '[[\\uDB80\\uDC80]]'
            {
             before(grammarAccess.getRestorationOverRasurMarkerAccess().getLeftSquareBracketLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketRightSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__RestorationOverRasurMarker__Group__1__Impl8333); 
             after(grammarAccess.getRestorationOverRasurMarkerAccess().getLeftSquareBracketLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketRightSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__RestorationOverRasurMarker__Group__1__Impl"


    // $ANTLR start "rule__AncientExpandedMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3883:1: rule__AncientExpandedMarker__Group__0 : rule__AncientExpandedMarker__Group__0__Impl rule__AncientExpandedMarker__Group__1 ;
    public final void rule__AncientExpandedMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3887:1: ( rule__AncientExpandedMarker__Group__0__Impl rule__AncientExpandedMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3888:2: rule__AncientExpandedMarker__Group__0__Impl rule__AncientExpandedMarker__Group__1
            {
            pushFollow(FOLLOW_rule__AncientExpandedMarker__Group__0__Impl_in_rule__AncientExpandedMarker__Group__08368);
            rule__AncientExpandedMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpandedMarker__Group__1_in_rule__AncientExpandedMarker__Group__08371);
            rule__AncientExpandedMarker__Group__1();

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
    // $ANTLR end "rule__AncientExpandedMarker__Group__0"


    // $ANTLR start "rule__AncientExpandedMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3895:1: rule__AncientExpandedMarker__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpandedMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3899:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3900:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3900:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3901:1: ()
            {
             before(grammarAccess.getAncientExpandedMarkerAccess().getAncientExpandedMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3902:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3904:1: 
            {
            }

             after(grammarAccess.getAncientExpandedMarkerAccess().getAncientExpandedMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncientExpandedMarker__Group__0__Impl"


    // $ANTLR start "rule__AncientExpandedMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3914:1: rule__AncientExpandedMarker__Group__1 : rule__AncientExpandedMarker__Group__1__Impl ;
    public final void rule__AncientExpandedMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3918:1: ( rule__AncientExpandedMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3919:2: rule__AncientExpandedMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AncientExpandedMarker__Group__1__Impl_in_rule__AncientExpandedMarker__Group__18429);
            rule__AncientExpandedMarker__Group__1__Impl();

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
    // $ANTLR end "rule__AncientExpandedMarker__Group__1"


    // $ANTLR start "rule__AncientExpandedMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3925:1: rule__AncientExpandedMarker__Group__1__Impl : ( '((\\uDB80\\uDC80))' ) ;
    public final void rule__AncientExpandedMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3929:1: ( ( '((\\uDB80\\uDC80))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3930:1: ( '((\\uDB80\\uDC80))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3930:1: ( '((\\uDB80\\uDC80))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3931:1: '((\\uDB80\\uDC80))'
            {
             before(grammarAccess.getAncientExpandedMarkerAccess().getLeftParenthesisLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisRightParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__AncientExpandedMarker__Group__1__Impl8457); 
             after(grammarAccess.getAncientExpandedMarkerAccess().getLeftParenthesisLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AncientExpandedMarker__Group__1__Impl"


    // $ANTLR start "rule__RasurMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3948:1: rule__RasurMarker__Group__0 : rule__RasurMarker__Group__0__Impl rule__RasurMarker__Group__1 ;
    public final void rule__RasurMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3952:1: ( rule__RasurMarker__Group__0__Impl rule__RasurMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3953:2: rule__RasurMarker__Group__0__Impl rule__RasurMarker__Group__1
            {
            pushFollow(FOLLOW_rule__RasurMarker__Group__0__Impl_in_rule__RasurMarker__Group__08492);
            rule__RasurMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RasurMarker__Group__1_in_rule__RasurMarker__Group__08495);
            rule__RasurMarker__Group__1();

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
    // $ANTLR end "rule__RasurMarker__Group__0"


    // $ANTLR start "rule__RasurMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3960:1: rule__RasurMarker__Group__0__Impl : ( () ) ;
    public final void rule__RasurMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3964:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3965:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3965:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3966:1: ()
            {
             before(grammarAccess.getRasurMarkerAccess().getAncientExpandedMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3967:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3969:1: 
            {
            }

             after(grammarAccess.getRasurMarkerAccess().getAncientExpandedMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RasurMarker__Group__0__Impl"


    // $ANTLR start "rule__RasurMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3979:1: rule__RasurMarker__Group__1 : rule__RasurMarker__Group__1__Impl ;
    public final void rule__RasurMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3983:1: ( rule__RasurMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3984:2: rule__RasurMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RasurMarker__Group__1__Impl_in_rule__RasurMarker__Group__18553);
            rule__RasurMarker__Group__1__Impl();

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
    // $ANTLR end "rule__RasurMarker__Group__1"


    // $ANTLR start "rule__RasurMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3990:1: rule__RasurMarker__Group__1__Impl : ( '{{\\uDB80\\uDC80}}' ) ;
    public final void rule__RasurMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3994:1: ( ( '{{\\uDB80\\uDC80}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3995:1: ( '{{\\uDB80\\uDC80}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3995:1: ( '{{\\uDB80\\uDC80}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:3996:1: '{{\\uDB80\\uDC80}}'
            {
             before(grammarAccess.getRasurMarkerAccess().getLeftCurlyBracketLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketRightCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__RasurMarker__Group__1__Impl8581); 
             after(grammarAccess.getRasurMarkerAccess().getLeftCurlyBracketLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketRightCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RasurMarker__Group__1__Impl"


    // $ANTLR start "rule__VersFrontierMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4013:1: rule__VersFrontierMarker__Group__0 : rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 ;
    public final void rule__VersFrontierMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4017:1: ( rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4018:2: rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1
            {
            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__0__Impl_in_rule__VersFrontierMarker__Group__08616);
            rule__VersFrontierMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__1_in_rule__VersFrontierMarker__Group__08619);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4025:1: rule__VersFrontierMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersFrontierMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4029:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4030:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4030:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4031:1: ()
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4032:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4034:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4044:1: rule__VersFrontierMarker__Group__1 : rule__VersFrontierMarker__Group__1__Impl ;
    public final void rule__VersFrontierMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4048:1: ( rule__VersFrontierMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4049:2: rule__VersFrontierMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersFrontierMarker__Group__1__Impl_in_rule__VersFrontierMarker__Group__18677);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4055:1: rule__VersFrontierMarker__Group__1__Impl : ( '\\uDB80\\uDC81' ) ;
    public final void rule__VersFrontierMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4059:1: ( ( '\\uDB80\\uDC81' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4060:1: ( '\\uDB80\\uDC81' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4060:1: ( '\\uDB80\\uDC81' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4061:1: '\\uDB80\\uDC81'
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc81Keyword_1()); 
            match(input,20,FOLLOW_20_in_rule__VersFrontierMarker__Group__1__Impl8705); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4078:1: rule__VersbreakMarker__Group__0 : rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 ;
    public final void rule__VersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4082:1: ( rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4083:2: rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1
            {
            pushFollow(FOLLOW_rule__VersbreakMarker__Group__0__Impl_in_rule__VersbreakMarker__Group__08740);
            rule__VersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersbreakMarker__Group__1_in_rule__VersbreakMarker__Group__08743);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4090:1: rule__VersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4094:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4095:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4095:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4096:1: ()
            {
             before(grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4097:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4099:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4109:1: rule__VersbreakMarker__Group__1 : rule__VersbreakMarker__Group__1__Impl ;
    public final void rule__VersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4113:1: ( rule__VersbreakMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4114:2: rule__VersbreakMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VersbreakMarker__Group__1__Impl_in_rule__VersbreakMarker__Group__18801);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4120:1: rule__VersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC80' ) ;
    public final void rule__VersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4124:1: ( ( '\\uDB80\\uDC80' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4125:1: ( '\\uDB80\\uDC80' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4125:1: ( '\\uDB80\\uDC80' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4126:1: '\\uDB80\\uDC80'
            {
             before(grammarAccess.getVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc80Keyword_1()); 
            match(input,21,FOLLOW_21_in_rule__VersbreakMarker__Group__1__Impl8829); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4143:1: rule__BrokenVersbreakMarker__Group__0 : rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 ;
    public final void rule__BrokenVersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4147:1: ( rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4148:2: rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1
            {
            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__0__Impl_in_rule__BrokenVersbreakMarker__Group__08864);
            rule__BrokenVersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__1_in_rule__BrokenVersbreakMarker__Group__08867);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4155:1: rule__BrokenVersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__BrokenVersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4159:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4160:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4160:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4161:1: ()
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4162:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4164:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4174:1: rule__BrokenVersbreakMarker__Group__1 : rule__BrokenVersbreakMarker__Group__1__Impl ;
    public final void rule__BrokenVersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4178:1: ( rule__BrokenVersbreakMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4179:2: rule__BrokenVersbreakMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BrokenVersbreakMarker__Group__1__Impl_in_rule__BrokenVersbreakMarker__Group__18925);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4185:1: rule__BrokenVersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC82' ) ;
    public final void rule__BrokenVersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4189:1: ( ( '\\uDB80\\uDC82' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4190:1: ( '\\uDB80\\uDC82' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4190:1: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4191:1: '\\uDB80\\uDC82'
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc82Keyword_1()); 
            match(input,22,FOLLOW_22_in_rule__BrokenVersbreakMarker__Group__1__Impl8953); 
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


    // $ANTLR start "rule__Word__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4208:1: rule__Word__Group__0 : rule__Word__Group__0__Impl rule__Word__Group__1 ;
    public final void rule__Word__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4212:1: ( rule__Word__Group__0__Impl rule__Word__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4213:2: rule__Word__Group__0__Impl rule__Word__Group__1
            {
            pushFollow(FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__08988);
            rule__Word__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Word__Group__1_in_rule__Word__Group__08991);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4220:1: rule__Word__Group__0__Impl : ( () ) ;
    public final void rule__Word__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4224:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4225:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4225:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4226:1: ()
            {
             before(grammarAccess.getWordAccess().getWordAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4227:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4229:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4239:1: rule__Word__Group__1 : rule__Word__Group__1__Impl ;
    public final void rule__Word__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4243:1: ( rule__Word__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4244:2: rule__Word__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__19049);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4250:1: rule__Word__Group__1__Impl : ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) ) ;
    public final void rule__Word__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4254:1: ( ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4255:1: ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4255:1: ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4256:1: ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4256:1: ( ( rule__Word__WCharAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4257:1: ( rule__Word__WCharAssignment_1 )
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4258:1: ( rule__Word__WCharAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4258:2: rule__Word__WCharAssignment_1
            {
            pushFollow(FOLLOW_rule__Word__WCharAssignment_1_in_rule__Word__Group__1__Impl9078);
            rule__Word__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getWCharAssignment_1()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4261:1: ( ( rule__Word__WCharAssignment_1 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4262:1: ( rule__Word__WCharAssignment_1 )*
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4263:1: ( rule__Word__WCharAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EGYSTRING||(LA30_0>=23 && LA30_0<=24)||LA30_0==26||LA30_0==28||LA30_0==30||LA30_0==32||LA30_0==34||LA30_0==36||LA30_0==38||LA30_0==40||LA30_0==42||LA30_0==44||LA30_0==46||LA30_0==48||(LA30_0>=50 && LA30_0<=57)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4263:2: rule__Word__WCharAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Word__WCharAssignment_1_in_rule__Word__Group__1__Impl9090);
            	    rule__Word__WCharAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getWordAccess().getWCharAssignment_1()); 

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
    // $ANTLR end "rule__Word__Group__1__Impl"


    // $ANTLR start "rule__WordPart__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4278:1: rule__WordPart__Group__0 : rule__WordPart__Group__0__Impl rule__WordPart__Group__1 ;
    public final void rule__WordPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4282:1: ( rule__WordPart__Group__0__Impl rule__WordPart__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4283:2: rule__WordPart__Group__0__Impl rule__WordPart__Group__1
            {
            pushFollow(FOLLOW_rule__WordPart__Group__0__Impl_in_rule__WordPart__Group__09127);
            rule__WordPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WordPart__Group__1_in_rule__WordPart__Group__09130);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4290:1: rule__WordPart__Group__0__Impl : ( ( '=' )? ) ;
    public final void rule__WordPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4294:1: ( ( ( '=' )? ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4295:1: ( ( '=' )? )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4295:1: ( ( '=' )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4296:1: ( '=' )?
            {
             before(grammarAccess.getWordPartAccess().getEqualsSignKeyword_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4297:1: ( '=' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4298:2: '='
                    {
                    match(input,23,FOLLOW_23_in_rule__WordPart__Group__0__Impl9159); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4309:1: rule__WordPart__Group__1 : rule__WordPart__Group__1__Impl ;
    public final void rule__WordPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4313:1: ( rule__WordPart__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4314:2: rule__WordPart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WordPart__Group__1__Impl_in_rule__WordPart__Group__19192);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4320:1: rule__WordPart__Group__1__Impl : ( ( rule__WordPart__WCharAssignment_1 ) ) ;
    public final void rule__WordPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4324:1: ( ( ( rule__WordPart__WCharAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4325:1: ( ( rule__WordPart__WCharAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4325:1: ( ( rule__WordPart__WCharAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4326:1: ( rule__WordPart__WCharAssignment_1 )
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4327:1: ( rule__WordPart__WCharAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4327:2: rule__WordPart__WCharAssignment_1
            {
            pushFollow(FOLLOW_rule__WordPart__WCharAssignment_1_in_rule__WordPart__Group__1__Impl9219);
            rule__WordPart__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordPartAccess().getWCharAssignment_1()); 

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


    // $ANTLR start "rule__Oval__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4341:1: rule__Oval__Group__0 : rule__Oval__Group__0__Impl rule__Oval__Group__1 ;
    public final void rule__Oval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4345:1: ( rule__Oval__Group__0__Impl rule__Oval__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4346:2: rule__Oval__Group__0__Impl rule__Oval__Group__1
            {
            pushFollow(FOLLOW_rule__Oval__Group__0__Impl_in_rule__Oval__Group__09253);
            rule__Oval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Oval__Group__1_in_rule__Oval__Group__09256);
            rule__Oval__Group__1();

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
    // $ANTLR end "rule__Oval__Group__0"


    // $ANTLR start "rule__Oval__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4353:1: rule__Oval__Group__0__Impl : ( '\\uD80C\\uDE58' ) ;
    public final void rule__Oval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4357:1: ( ( '\\uD80C\\uDE58' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4358:1: ( '\\uD80C\\uDE58' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4358:1: ( '\\uD80C\\uDE58' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4359:1: '\\uD80C\\uDE58'
            {
             before(grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Oval__Group__0__Impl9284); 
             after(grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0()); 

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
    // $ANTLR end "rule__Oval__Group__0__Impl"


    // $ANTLR start "rule__Oval__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4372:1: rule__Oval__Group__1 : rule__Oval__Group__1__Impl rule__Oval__Group__2 ;
    public final void rule__Oval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4376:1: ( rule__Oval__Group__1__Impl rule__Oval__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4377:2: rule__Oval__Group__1__Impl rule__Oval__Group__2
            {
            pushFollow(FOLLOW_rule__Oval__Group__1__Impl_in_rule__Oval__Group__19315);
            rule__Oval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Oval__Group__2_in_rule__Oval__Group__19318);
            rule__Oval__Group__2();

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
    // $ANTLR end "rule__Oval__Group__1"


    // $ANTLR start "rule__Oval__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4384:1: rule__Oval__Group__1__Impl : ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) ) ;
    public final void rule__Oval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4388:1: ( ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4389:1: ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4389:1: ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4390:1: ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4390:1: ( ( rule__Oval__WCharAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4391:1: ( rule__Oval__WCharAssignment_1 )
            {
             before(grammarAccess.getOvalAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4392:1: ( rule__Oval__WCharAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4392:2: rule__Oval__WCharAssignment_1
            {
            pushFollow(FOLLOW_rule__Oval__WCharAssignment_1_in_rule__Oval__Group__1__Impl9347);
            rule__Oval__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getWCharAssignment_1()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4395:1: ( ( rule__Oval__WCharAssignment_1 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4396:1: ( rule__Oval__WCharAssignment_1 )*
            {
             before(grammarAccess.getOvalAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4397:1: ( rule__Oval__WCharAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EGYSTRING||LA32_0==30||LA32_0==32||LA32_0==34||LA32_0==36||LA32_0==38||LA32_0==40||LA32_0==42||LA32_0==44||LA32_0==46||LA32_0==48||(LA32_0>=50 && LA32_0<=57)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4397:2: rule__Oval__WCharAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Oval__WCharAssignment_1_in_rule__Oval__Group__1__Impl9359);
            	    rule__Oval__WCharAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getOvalAccess().getWCharAssignment_1()); 

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
    // $ANTLR end "rule__Oval__Group__1__Impl"


    // $ANTLR start "rule__Oval__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4408:1: rule__Oval__Group__2 : rule__Oval__Group__2__Impl ;
    public final void rule__Oval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4412:1: ( rule__Oval__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4413:2: rule__Oval__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Oval__Group__2__Impl_in_rule__Oval__Group__29392);
            rule__Oval__Group__2__Impl();

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
    // $ANTLR end "rule__Oval__Group__2"


    // $ANTLR start "rule__Oval__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4419:1: rule__Oval__Group__2__Impl : ( '\\uD80C\\uDE82' ) ;
    public final void rule__Oval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4423:1: ( ( '\\uD80C\\uDE82' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4424:1: ( '\\uD80C\\uDE82' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4424:1: ( '\\uD80C\\uDE82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4425:1: '\\uD80C\\uDE82'
            {
             before(grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe82Keyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Oval__Group__2__Impl9420); 
             after(grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe82Keyword_2()); 

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
    // $ANTLR end "rule__Oval__Group__2__Impl"


    // $ANTLR start "rule__Serech__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4444:1: rule__Serech__Group__0 : rule__Serech__Group__0__Impl rule__Serech__Group__1 ;
    public final void rule__Serech__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4448:1: ( rule__Serech__Group__0__Impl rule__Serech__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4449:2: rule__Serech__Group__0__Impl rule__Serech__Group__1
            {
            pushFollow(FOLLOW_rule__Serech__Group__0__Impl_in_rule__Serech__Group__09457);
            rule__Serech__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Serech__Group__1_in_rule__Serech__Group__09460);
            rule__Serech__Group__1();

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
    // $ANTLR end "rule__Serech__Group__0"


    // $ANTLR start "rule__Serech__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4456:1: rule__Serech__Group__0__Impl : ( '\\uD80C\\uDF79' ) ;
    public final void rule__Serech__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4460:1: ( ( '\\uD80C\\uDF79' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4461:1: ( '\\uD80C\\uDF79' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4461:1: ( '\\uD80C\\uDF79' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4462:1: '\\uD80C\\uDF79'
            {
             before(grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Serech__Group__0__Impl9488); 
             after(grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0()); 

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
    // $ANTLR end "rule__Serech__Group__0__Impl"


    // $ANTLR start "rule__Serech__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4475:1: rule__Serech__Group__1 : rule__Serech__Group__1__Impl rule__Serech__Group__2 ;
    public final void rule__Serech__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4479:1: ( rule__Serech__Group__1__Impl rule__Serech__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4480:2: rule__Serech__Group__1__Impl rule__Serech__Group__2
            {
            pushFollow(FOLLOW_rule__Serech__Group__1__Impl_in_rule__Serech__Group__19519);
            rule__Serech__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Serech__Group__2_in_rule__Serech__Group__19522);
            rule__Serech__Group__2();

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
    // $ANTLR end "rule__Serech__Group__1"


    // $ANTLR start "rule__Serech__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4487:1: rule__Serech__Group__1__Impl : ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) ) ;
    public final void rule__Serech__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4491:1: ( ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4492:1: ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4492:1: ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4493:1: ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4493:1: ( ( rule__Serech__WCharAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4494:1: ( rule__Serech__WCharAssignment_1 )
            {
             before(grammarAccess.getSerechAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4495:1: ( rule__Serech__WCharAssignment_1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4495:2: rule__Serech__WCharAssignment_1
            {
            pushFollow(FOLLOW_rule__Serech__WCharAssignment_1_in_rule__Serech__Group__1__Impl9551);
            rule__Serech__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSerechAccess().getWCharAssignment_1()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4498:1: ( ( rule__Serech__WCharAssignment_1 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4499:1: ( rule__Serech__WCharAssignment_1 )*
            {
             before(grammarAccess.getSerechAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4500:1: ( rule__Serech__WCharAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_EGYSTRING||LA33_0==30||LA33_0==32||LA33_0==34||LA33_0==36||LA33_0==38||LA33_0==40||LA33_0==42||LA33_0==44||LA33_0==46||LA33_0==48||(LA33_0>=50 && LA33_0<=57)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4500:2: rule__Serech__WCharAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Serech__WCharAssignment_1_in_rule__Serech__Group__1__Impl9563);
            	    rule__Serech__WCharAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSerechAccess().getWCharAssignment_1()); 

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
    // $ANTLR end "rule__Serech__Group__1__Impl"


    // $ANTLR start "rule__Serech__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4511:1: rule__Serech__Group__2 : rule__Serech__Group__2__Impl ;
    public final void rule__Serech__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4515:1: ( rule__Serech__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4516:2: rule__Serech__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Serech__Group__2__Impl_in_rule__Serech__Group__29596);
            rule__Serech__Group__2__Impl();

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
    // $ANTLR end "rule__Serech__Group__2"


    // $ANTLR start "rule__Serech__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4522:1: rule__Serech__Group__2__Impl : ( '\\uD80C\\uDF7A' ) ;
    public final void rule__Serech__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4526:1: ( ( '\\uD80C\\uDF7A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4527:1: ( '\\uD80C\\uDF7A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4527:1: ( '\\uD80C\\uDF7A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4528:1: '\\uD80C\\uDF7A'
            {
             before(grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf7aKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Serech__Group__2__Impl9624); 
             after(grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf7aKeyword_2()); 

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
    // $ANTLR end "rule__Serech__Group__2__Impl"


    // $ANTLR start "rule__Cartouche__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4547:1: rule__Cartouche__Group__0 : rule__Cartouche__Group__0__Impl rule__Cartouche__Group__1 ;
    public final void rule__Cartouche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4551:1: ( rule__Cartouche__Group__0__Impl rule__Cartouche__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4552:2: rule__Cartouche__Group__0__Impl rule__Cartouche__Group__1
            {
            pushFollow(FOLLOW_rule__Cartouche__Group__0__Impl_in_rule__Cartouche__Group__09661);
            rule__Cartouche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cartouche__Group__1_in_rule__Cartouche__Group__09664);
            rule__Cartouche__Group__1();

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
    // $ANTLR end "rule__Cartouche__Group__0"


    // $ANTLR start "rule__Cartouche__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4559:1: rule__Cartouche__Group__0__Impl : ( () ) ;
    public final void rule__Cartouche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4563:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4564:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4564:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4565:1: ()
            {
             before(grammarAccess.getCartoucheAccess().getExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4566:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4568:1: 
            {
            }

             after(grammarAccess.getCartoucheAccess().getExpandedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartouche__Group__0__Impl"


    // $ANTLR start "rule__Cartouche__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4578:1: rule__Cartouche__Group__1 : rule__Cartouche__Group__1__Impl rule__Cartouche__Group__2 ;
    public final void rule__Cartouche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4582:1: ( rule__Cartouche__Group__1__Impl rule__Cartouche__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4583:2: rule__Cartouche__Group__1__Impl rule__Cartouche__Group__2
            {
            pushFollow(FOLLOW_rule__Cartouche__Group__1__Impl_in_rule__Cartouche__Group__19722);
            rule__Cartouche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cartouche__Group__2_in_rule__Cartouche__Group__19725);
            rule__Cartouche__Group__2();

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
    // $ANTLR end "rule__Cartouche__Group__1"


    // $ANTLR start "rule__Cartouche__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4590:1: rule__Cartouche__Group__1__Impl : ( '\\uD80C\\uDE86' ) ;
    public final void rule__Cartouche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4594:1: ( ( '\\uD80C\\uDE86' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4595:1: ( '\\uD80C\\uDE86' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4595:1: ( '\\uD80C\\uDE86' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4596:1: '\\uD80C\\uDE86'
            {
             before(grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Cartouche__Group__1__Impl9753); 
             after(grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1()); 

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
    // $ANTLR end "rule__Cartouche__Group__1__Impl"


    // $ANTLR start "rule__Cartouche__Group__2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4609:1: rule__Cartouche__Group__2 : rule__Cartouche__Group__2__Impl rule__Cartouche__Group__3 ;
    public final void rule__Cartouche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4613:1: ( rule__Cartouche__Group__2__Impl rule__Cartouche__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4614:2: rule__Cartouche__Group__2__Impl rule__Cartouche__Group__3
            {
            pushFollow(FOLLOW_rule__Cartouche__Group__2__Impl_in_rule__Cartouche__Group__29784);
            rule__Cartouche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cartouche__Group__3_in_rule__Cartouche__Group__29787);
            rule__Cartouche__Group__3();

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
    // $ANTLR end "rule__Cartouche__Group__2"


    // $ANTLR start "rule__Cartouche__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4621:1: rule__Cartouche__Group__2__Impl : ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) ) ;
    public final void rule__Cartouche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4625:1: ( ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4626:1: ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4626:1: ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4627:1: ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4627:1: ( ( rule__Cartouche__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4628:1: ( rule__Cartouche__WCharAssignment_2 )
            {
             before(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4629:1: ( rule__Cartouche__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4629:2: rule__Cartouche__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Cartouche__WCharAssignment_2_in_rule__Cartouche__Group__2__Impl9816);
            rule__Cartouche__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4632:1: ( ( rule__Cartouche__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4633:1: ( rule__Cartouche__WCharAssignment_2 )*
            {
             before(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4634:1: ( rule__Cartouche__WCharAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EGYSTRING||LA34_0==30||LA34_0==32||LA34_0==34||LA34_0==36||LA34_0==38||LA34_0==40||LA34_0==42||LA34_0==44||LA34_0==46||LA34_0==48||(LA34_0>=50 && LA34_0<=57)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4634:2: rule__Cartouche__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Cartouche__WCharAssignment_2_in_rule__Cartouche__Group__2__Impl9828);
            	    rule__Cartouche__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 

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
    // $ANTLR end "rule__Cartouche__Group__2__Impl"


    // $ANTLR start "rule__Cartouche__Group__3"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4645:1: rule__Cartouche__Group__3 : rule__Cartouche__Group__3__Impl ;
    public final void rule__Cartouche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4649:1: ( rule__Cartouche__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4650:2: rule__Cartouche__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Cartouche__Group__3__Impl_in_rule__Cartouche__Group__39861);
            rule__Cartouche__Group__3__Impl();

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
    // $ANTLR end "rule__Cartouche__Group__3"


    // $ANTLR start "rule__Cartouche__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4656:1: rule__Cartouche__Group__3__Impl : ( '\\uD80C\\uDE87' ) ;
    public final void rule__Cartouche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4660:1: ( ( '\\uD80C\\uDE87' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4661:1: ( '\\uD80C\\uDE87' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4661:1: ( '\\uD80C\\uDE87' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4662:1: '\\uD80C\\uDE87'
            {
             before(grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe87Keyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Cartouche__Group__3__Impl9889); 
             after(grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe87Keyword_3()); 

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
    // $ANTLR end "rule__Cartouche__Group__3__Impl"


    // $ANTLR start "rule__Expanded__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4683:1: rule__Expanded__Group__0 : rule__Expanded__Group__0__Impl rule__Expanded__Group__1 ;
    public final void rule__Expanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4687:1: ( rule__Expanded__Group__0__Impl rule__Expanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4688:2: rule__Expanded__Group__0__Impl rule__Expanded__Group__1
            {
            pushFollow(FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__09928);
            rule__Expanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__09931);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4695:1: rule__Expanded__Group__0__Impl : ( () ) ;
    public final void rule__Expanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4699:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4700:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4700:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4701:1: ()
            {
             before(grammarAccess.getExpandedAccess().getExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4702:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4704:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4714:1: rule__Expanded__Group__1 : rule__Expanded__Group__1__Impl rule__Expanded__Group__2 ;
    public final void rule__Expanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4718:1: ( rule__Expanded__Group__1__Impl rule__Expanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4719:2: rule__Expanded__Group__1__Impl rule__Expanded__Group__2
            {
            pushFollow(FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__19989);
            rule__Expanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__19992);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4726:1: rule__Expanded__Group__1__Impl : ( '(' ) ;
    public final void rule__Expanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4730:1: ( ( '(' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4731:1: ( '(' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4731:1: ( '(' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4732:1: '('
            {
             before(grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Expanded__Group__1__Impl10020); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4745:1: rule__Expanded__Group__2 : rule__Expanded__Group__2__Impl rule__Expanded__Group__3 ;
    public final void rule__Expanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4749:1: ( rule__Expanded__Group__2__Impl rule__Expanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4750:2: rule__Expanded__Group__2__Impl rule__Expanded__Group__3
            {
            pushFollow(FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__210051);
            rule__Expanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__210054);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4757:1: rule__Expanded__Group__2__Impl : ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) ;
    public final void rule__Expanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4761:1: ( ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4762:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4762:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4763:1: ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4763:1: ( ( rule__Expanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4764:1: ( rule__Expanded__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4765:1: ( rule__Expanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4765:2: rule__Expanded__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl10083);
            rule__Expanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4768:1: ( ( rule__Expanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4769:1: ( rule__Expanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4770:1: ( rule__Expanded__WCharAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_EGYSTRING||LA35_0==34||(LA35_0>=50 && LA35_0<=57)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4770:2: rule__Expanded__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl10095);
            	    rule__Expanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4781:1: rule__Expanded__Group__3 : rule__Expanded__Group__3__Impl ;
    public final void rule__Expanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4785:1: ( rule__Expanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4786:2: rule__Expanded__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__310128);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4792:1: rule__Expanded__Group__3__Impl : ( ')' ) ;
    public final void rule__Expanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4796:1: ( ( ')' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4797:1: ( ')' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4797:1: ( ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4798:1: ')'
            {
             before(grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Expanded__Group__3__Impl10156); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4819:1: rule__Emendation__Group__0 : rule__Emendation__Group__0__Impl rule__Emendation__Group__1 ;
    public final void rule__Emendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4823:1: ( rule__Emendation__Group__0__Impl rule__Emendation__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4824:2: rule__Emendation__Group__0__Impl rule__Emendation__Group__1
            {
            pushFollow(FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__010195);
            rule__Emendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__010198);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4831:1: rule__Emendation__Group__0__Impl : ( () ) ;
    public final void rule__Emendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4835:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4836:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4836:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4837:1: ()
            {
             before(grammarAccess.getEmendationAccess().getEmendationAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4838:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4840:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4850:1: rule__Emendation__Group__1 : rule__Emendation__Group__1__Impl rule__Emendation__Group__2 ;
    public final void rule__Emendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4854:1: ( rule__Emendation__Group__1__Impl rule__Emendation__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4855:2: rule__Emendation__Group__1__Impl rule__Emendation__Group__2
            {
            pushFollow(FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__110256);
            rule__Emendation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__110259);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4862:1: rule__Emendation__Group__1__Impl : ( '\\u2329' ) ;
    public final void rule__Emendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4866:1: ( ( '\\u2329' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4867:1: ( '\\u2329' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4867:1: ( '\\u2329' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4868:1: '\\u2329'
            {
             before(grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Emendation__Group__1__Impl10287); 
             after(grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4881:1: rule__Emendation__Group__2 : rule__Emendation__Group__2__Impl rule__Emendation__Group__3 ;
    public final void rule__Emendation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4885:1: ( rule__Emendation__Group__2__Impl rule__Emendation__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4886:2: rule__Emendation__Group__2__Impl rule__Emendation__Group__3
            {
            pushFollow(FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__210318);
            rule__Emendation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__210321);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4893:1: rule__Emendation__Group__2__Impl : ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) ;
    public final void rule__Emendation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4897:1: ( ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4898:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4898:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4899:1: ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4899:1: ( ( rule__Emendation__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4900:1: ( rule__Emendation__WCharAssignment_2 )
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4901:1: ( rule__Emendation__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4901:2: rule__Emendation__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl10350);
            rule__Emendation__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4904:1: ( ( rule__Emendation__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4905:1: ( rule__Emendation__WCharAssignment_2 )*
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4906:1: ( rule__Emendation__WCharAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EGYSTRING||LA36_0==30||LA36_0==34||(LA36_0>=50 && LA36_0<=57)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4906:2: rule__Emendation__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl10362);
            	    rule__Emendation__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4917:1: rule__Emendation__Group__3 : rule__Emendation__Group__3__Impl ;
    public final void rule__Emendation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4921:1: ( rule__Emendation__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4922:2: rule__Emendation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__310395);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4928:1: rule__Emendation__Group__3__Impl : ( '\\u232A' ) ;
    public final void rule__Emendation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4932:1: ( ( '\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4933:1: ( '\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4933:1: ( '\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4934:1: '\\u232A'
            {
             before(grammarAccess.getEmendationAccess().getRightPointingAngleBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Emendation__Group__3__Impl10423); 
             after(grammarAccess.getEmendationAccess().getRightPointingAngleBracketKeyword_3()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4955:1: rule__DisputableReading__Group__0 : rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 ;
    public final void rule__DisputableReading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4959:1: ( rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4960:2: rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__010462);
            rule__DisputableReading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__010465);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4967:1: rule__DisputableReading__Group__0__Impl : ( () ) ;
    public final void rule__DisputableReading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4971:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4972:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4972:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4973:1: ()
            {
             before(grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4974:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4976:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4986:1: rule__DisputableReading__Group__1 : rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 ;
    public final void rule__DisputableReading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4990:1: ( rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4991:2: rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__110523);
            rule__DisputableReading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__110526);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:4998:1: rule__DisputableReading__Group__1__Impl : ( '\\u2E2E' ) ;
    public final void rule__DisputableReading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5002:1: ( ( '\\u2E2E' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5003:1: ( '\\u2E2E' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5003:1: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5004:1: '\\u2E2E'
            {
             before(grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__DisputableReading__Group__1__Impl10554); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5017:1: rule__DisputableReading__Group__2 : rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 ;
    public final void rule__DisputableReading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5021:1: ( rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5022:2: rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__210585);
            rule__DisputableReading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__210588);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5029:1: rule__DisputableReading__Group__2__Impl : ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) ;
    public final void rule__DisputableReading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5033:1: ( ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5034:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5034:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5035:1: ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5035:1: ( ( rule__DisputableReading__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5036:1: ( rule__DisputableReading__WCharAssignment_2 )
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5037:1: ( rule__DisputableReading__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5037:2: rule__DisputableReading__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10617);
            rule__DisputableReading__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5040:1: ( ( rule__DisputableReading__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5041:1: ( rule__DisputableReading__WCharAssignment_2 )*
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5042:1: ( rule__DisputableReading__WCharAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||LA37_0==30||LA37_0==32||LA37_0==36||LA37_0==38||LA37_0==40||LA37_0==42||LA37_0==44||LA37_0==46||LA37_0==48||(LA37_0>=50 && LA37_0<=57)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5042:2: rule__DisputableReading__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10629);
            	    rule__DisputableReading__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5053:1: rule__DisputableReading__Group__3 : rule__DisputableReading__Group__3__Impl ;
    public final void rule__DisputableReading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5057:1: ( rule__DisputableReading__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5058:2: rule__DisputableReading__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__310662);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5064:1: rule__DisputableReading__Group__3__Impl : ( '?' ) ;
    public final void rule__DisputableReading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5068:1: ( ( '?' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5069:1: ( '?' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5069:1: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5070:1: '?'
            {
             before(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__DisputableReading__Group__3__Impl10690); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5091:1: rule__Lacuna__Group__0 : rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 ;
    public final void rule__Lacuna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5095:1: ( rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5096:2: rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__010729);
            rule__Lacuna__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__010732);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5103:1: rule__Lacuna__Group__0__Impl : ( () ) ;
    public final void rule__Lacuna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5107:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5108:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5108:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5109:1: ()
            {
             before(grammarAccess.getLacunaAccess().getLacunaAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5110:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5112:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5122:1: rule__Lacuna__Group__1 : rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 ;
    public final void rule__Lacuna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5126:1: ( rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5127:2: rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__110790);
            rule__Lacuna__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__110793);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5134:1: rule__Lacuna__Group__1__Impl : ( '[' ) ;
    public final void rule__Lacuna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5138:1: ( ( '[' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5139:1: ( '[' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5139:1: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5140:1: '['
            {
             before(grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Lacuna__Group__1__Impl10821); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5153:1: rule__Lacuna__Group__2 : rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 ;
    public final void rule__Lacuna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5157:1: ( rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5158:2: rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__210852);
            rule__Lacuna__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__210855);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5165:1: rule__Lacuna__Group__2__Impl : ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) ;
    public final void rule__Lacuna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5169:1: ( ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5170:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5170:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5171:1: ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5171:1: ( ( rule__Lacuna__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5172:1: ( rule__Lacuna__WCharAssignment_2 )
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5173:1: ( rule__Lacuna__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5173:2: rule__Lacuna__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10884);
            rule__Lacuna__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5176:1: ( ( rule__Lacuna__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5177:1: ( rule__Lacuna__WCharAssignment_2 )*
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5178:1: ( rule__Lacuna__WCharAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EGYSTRING||LA38_0==24||LA38_0==26||LA38_0==28||LA38_0==30||LA38_0==34||(LA38_0>=50 && LA38_0<=57)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5178:2: rule__Lacuna__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10896);
            	    rule__Lacuna__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5189:1: rule__Lacuna__Group__3 : rule__Lacuna__Group__3__Impl ;
    public final void rule__Lacuna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5193:1: ( rule__Lacuna__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5194:2: rule__Lacuna__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__310929);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5200:1: rule__Lacuna__Group__3__Impl : ( ']' ) ;
    public final void rule__Lacuna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5204:1: ( ( ']' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5205:1: ( ']' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5205:1: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5206:1: ']'
            {
             before(grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Lacuna__Group__3__Impl10957); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5227:1: rule__Deletion__Group__0 : rule__Deletion__Group__0__Impl rule__Deletion__Group__1 ;
    public final void rule__Deletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5231:1: ( rule__Deletion__Group__0__Impl rule__Deletion__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5232:2: rule__Deletion__Group__0__Impl rule__Deletion__Group__1
            {
            pushFollow(FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__010996);
            rule__Deletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__010999);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5239:1: rule__Deletion__Group__0__Impl : ( () ) ;
    public final void rule__Deletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5243:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5244:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5244:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5245:1: ()
            {
             before(grammarAccess.getDeletionAccess().getDeletionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5246:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5248:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5258:1: rule__Deletion__Group__1 : rule__Deletion__Group__1__Impl rule__Deletion__Group__2 ;
    public final void rule__Deletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5262:1: ( rule__Deletion__Group__1__Impl rule__Deletion__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5263:2: rule__Deletion__Group__1__Impl rule__Deletion__Group__2
            {
            pushFollow(FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__111057);
            rule__Deletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__111060);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5270:1: rule__Deletion__Group__1__Impl : ( '{' ) ;
    public final void rule__Deletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5274:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5275:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5275:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5276:1: '{'
            {
             before(grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Deletion__Group__1__Impl11088); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5289:1: rule__Deletion__Group__2 : rule__Deletion__Group__2__Impl rule__Deletion__Group__3 ;
    public final void rule__Deletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5293:1: ( rule__Deletion__Group__2__Impl rule__Deletion__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5294:2: rule__Deletion__Group__2__Impl rule__Deletion__Group__3
            {
            pushFollow(FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__211119);
            rule__Deletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__211122);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5301:1: rule__Deletion__Group__2__Impl : ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) ;
    public final void rule__Deletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5305:1: ( ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5306:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5306:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5307:1: ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5307:1: ( ( rule__Deletion__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5308:1: ( rule__Deletion__WCharAssignment_2 )
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5309:1: ( rule__Deletion__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5309:2: rule__Deletion__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl11151);
            rule__Deletion__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5312:1: ( ( rule__Deletion__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5313:1: ( rule__Deletion__WCharAssignment_2 )*
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5314:1: ( rule__Deletion__WCharAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EGYSTRING||LA39_0==30||LA39_0==34||LA39_0==36||LA39_0==46||LA39_0==48||(LA39_0>=50 && LA39_0<=57)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5314:2: rule__Deletion__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl11163);
            	    rule__Deletion__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5325:1: rule__Deletion__Group__3 : rule__Deletion__Group__3__Impl ;
    public final void rule__Deletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5329:1: ( rule__Deletion__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5330:2: rule__Deletion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__311196);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5336:1: rule__Deletion__Group__3__Impl : ( '}' ) ;
    public final void rule__Deletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5340:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5341:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5341:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5342:1: '}'
            {
             before(grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__Deletion__Group__3__Impl11224); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5363:1: rule__ExpandedColumn__Group__0 : rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 ;
    public final void rule__ExpandedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5367:1: ( rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5368:2: rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__011263);
            rule__ExpandedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__011266);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5375:1: rule__ExpandedColumn__Group__0__Impl : ( () ) ;
    public final void rule__ExpandedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5379:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5380:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5380:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5381:1: ()
            {
             before(grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5382:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5384:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5394:1: rule__ExpandedColumn__Group__1 : rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 ;
    public final void rule__ExpandedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5398:1: ( rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5399:2: rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__111324);
            rule__ExpandedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__111327);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5406:1: rule__ExpandedColumn__Group__1__Impl : ( '\\u2329\\u2329' ) ;
    public final void rule__ExpandedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5410:1: ( ( '\\u2329\\u2329' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5411:1: ( '\\u2329\\u2329' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5411:1: ( '\\u2329\\u2329' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5412:1: '\\u2329\\u2329'
            {
             before(grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__ExpandedColumn__Group__1__Impl11355); 
             after(grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5425:1: rule__ExpandedColumn__Group__2 : rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 ;
    public final void rule__ExpandedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5429:1: ( rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5430:2: rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__211386);
            rule__ExpandedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__211389);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5437:1: rule__ExpandedColumn__Group__2__Impl : ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) ;
    public final void rule__ExpandedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5441:1: ( ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5442:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5442:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5443:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5443:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5444:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5445:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5445:2: rule__ExpandedColumn__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl11418);
            rule__ExpandedColumn__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5448:1: ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5449:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5450:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_EGYSTRING||LA40_0==30||LA40_0==34||(LA40_0>=50 && LA40_0<=57)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5450:2: rule__ExpandedColumn__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl11430);
            	    rule__ExpandedColumn__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5461:1: rule__ExpandedColumn__Group__3 : rule__ExpandedColumn__Group__3__Impl ;
    public final void rule__ExpandedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5465:1: ( rule__ExpandedColumn__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5466:2: rule__ExpandedColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__311463);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5472:1: rule__ExpandedColumn__Group__3__Impl : ( '\\u232A\\u232A' ) ;
    public final void rule__ExpandedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5476:1: ( ( '\\u232A\\u232A' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5477:1: ( '\\u232A\\u232A' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5477:1: ( '\\u232A\\u232A' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5478:1: '\\u232A\\u232A'
            {
             before(grammarAccess.getExpandedColumnAccess().getRightPointingAngleBracketRightPointingAngleBracketKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__ExpandedColumn__Group__3__Impl11491); 
             after(grammarAccess.getExpandedColumnAccess().getRightPointingAngleBracketRightPointingAngleBracketKeyword_3()); 

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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5499:1: rule__Rasur__Group__0 : rule__Rasur__Group__0__Impl rule__Rasur__Group__1 ;
    public final void rule__Rasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5503:1: ( rule__Rasur__Group__0__Impl rule__Rasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5504:2: rule__Rasur__Group__0__Impl rule__Rasur__Group__1
            {
            pushFollow(FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__011530);
            rule__Rasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__011533);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5511:1: rule__Rasur__Group__0__Impl : ( () ) ;
    public final void rule__Rasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5515:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5516:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5516:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5517:1: ()
            {
             before(grammarAccess.getRasurAccess().getRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5518:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5520:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5530:1: rule__Rasur__Group__1 : rule__Rasur__Group__1__Impl rule__Rasur__Group__2 ;
    public final void rule__Rasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5534:1: ( rule__Rasur__Group__1__Impl rule__Rasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5535:2: rule__Rasur__Group__1__Impl rule__Rasur__Group__2
            {
            pushFollow(FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__111591);
            rule__Rasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__111594);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5542:1: rule__Rasur__Group__1__Impl : ( '{{' ) ;
    public final void rule__Rasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5546:1: ( ( '{{' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5547:1: ( '{{' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5547:1: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5548:1: '{{'
            {
             before(grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Rasur__Group__1__Impl11622); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5561:1: rule__Rasur__Group__2 : rule__Rasur__Group__2__Impl rule__Rasur__Group__3 ;
    public final void rule__Rasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5565:1: ( rule__Rasur__Group__2__Impl rule__Rasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5566:2: rule__Rasur__Group__2__Impl rule__Rasur__Group__3
            {
            pushFollow(FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__211653);
            rule__Rasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__211656);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5573:1: rule__Rasur__Group__2__Impl : ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) ;
    public final void rule__Rasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5577:1: ( ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5578:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5578:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5579:1: ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5579:1: ( ( rule__Rasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5580:1: ( rule__Rasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5581:1: ( rule__Rasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5581:2: rule__Rasur__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11685);
            rule__Rasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRasurAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5584:1: ( ( rule__Rasur__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5585:1: ( rule__Rasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5586:1: ( rule__Rasur__WCharAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_EGYSTRING||LA41_0==30||LA41_0==34||(LA41_0>=50 && LA41_0<=57)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5586:2: rule__Rasur__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11697);
            	    rule__Rasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5597:1: rule__Rasur__Group__3 : rule__Rasur__Group__3__Impl ;
    public final void rule__Rasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5601:1: ( rule__Rasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5602:2: rule__Rasur__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__311730);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5608:1: rule__Rasur__Group__3__Impl : ( '}}' ) ;
    public final void rule__Rasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5612:1: ( ( '}}' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5613:1: ( '}}' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5613:1: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5614:1: '}}'
            {
             before(grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__Rasur__Group__3__Impl11758); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5635:1: rule__AncientExpanded__Group__0 : rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 ;
    public final void rule__AncientExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5639:1: ( rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5640:2: rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__011797);
            rule__AncientExpanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__011800);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5647:1: rule__AncientExpanded__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5651:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5652:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5652:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5653:1: ()
            {
             before(grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5654:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5656:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5666:1: rule__AncientExpanded__Group__1 : rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 ;
    public final void rule__AncientExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5670:1: ( rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5671:2: rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__111858);
            rule__AncientExpanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__111861);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5678:1: rule__AncientExpanded__Group__1__Impl : ( '((' ) ;
    public final void rule__AncientExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5682:1: ( ( '((' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5683:1: ( '((' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5683:1: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5684:1: '(('
            {
             before(grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__AncientExpanded__Group__1__Impl11889); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5697:1: rule__AncientExpanded__Group__2 : rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 ;
    public final void rule__AncientExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5701:1: ( rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5702:2: rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__211920);
            rule__AncientExpanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__211923);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5709:1: rule__AncientExpanded__Group__2__Impl : ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) ;
    public final void rule__AncientExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5713:1: ( ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5714:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5714:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5715:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5715:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5716:1: ( rule__AncientExpanded__WCharAssignment_2 )
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5717:1: ( rule__AncientExpanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5717:2: rule__AncientExpanded__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11952);
            rule__AncientExpanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5720:1: ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5721:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5722:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_EGYSTRING||LA42_0==30||LA42_0==34||(LA42_0>=50 && LA42_0<=57)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5722:2: rule__AncientExpanded__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11964);
            	    rule__AncientExpanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5733:1: rule__AncientExpanded__Group__3 : rule__AncientExpanded__Group__3__Impl ;
    public final void rule__AncientExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5737:1: ( rule__AncientExpanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5738:2: rule__AncientExpanded__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__311997);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5744:1: rule__AncientExpanded__Group__3__Impl : ( '))' ) ;
    public final void rule__AncientExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5748:1: ( ( '))' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5749:1: ( '))' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5749:1: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5750:1: '))'
            {
             before(grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__AncientExpanded__Group__3__Impl12025); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5771:1: rule__RestorationOverRasur__Group__0 : rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 ;
    public final void rule__RestorationOverRasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5775:1: ( rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5776:2: rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__012064);
            rule__RestorationOverRasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__012067);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5783:1: rule__RestorationOverRasur__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5787:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5788:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5788:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5789:1: ()
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5790:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5792:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5802:1: rule__RestorationOverRasur__Group__1 : rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 ;
    public final void rule__RestorationOverRasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5806:1: ( rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5807:2: rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__112125);
            rule__RestorationOverRasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__112128);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5814:1: rule__RestorationOverRasur__Group__1__Impl : ( '[[' ) ;
    public final void rule__RestorationOverRasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5818:1: ( ( '[[' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5819:1: ( '[[' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5819:1: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5820:1: '[['
            {
             before(grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__RestorationOverRasur__Group__1__Impl12156); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5833:1: rule__RestorationOverRasur__Group__2 : rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 ;
    public final void rule__RestorationOverRasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5837:1: ( rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5838:2: rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__212187);
            rule__RestorationOverRasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__212190);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5845:1: rule__RestorationOverRasur__Group__2__Impl : ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) ;
    public final void rule__RestorationOverRasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5849:1: ( ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5850:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5850:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5851:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5851:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5852:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5853:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5853:2: rule__RestorationOverRasur__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl12219);
            rule__RestorationOverRasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5856:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5857:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5858:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_EGYSTRING||LA43_0==28||LA43_0==30||LA43_0==34||(LA43_0>=50 && LA43_0<=57)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5858:2: rule__RestorationOverRasur__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl12231);
            	    rule__RestorationOverRasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5869:1: rule__RestorationOverRasur__Group__3 : rule__RestorationOverRasur__Group__3__Impl ;
    public final void rule__RestorationOverRasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5873:1: ( rule__RestorationOverRasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5874:2: rule__RestorationOverRasur__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__312264);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5880:1: rule__RestorationOverRasur__Group__3__Impl : ( ']]' ) ;
    public final void rule__RestorationOverRasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5884:1: ( ( ']]' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5885:1: ( ']]' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5885:1: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5886:1: ']]'
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,47,FOLLOW_47_in_rule__RestorationOverRasur__Group__3__Impl12292); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5907:1: rule__PartialDestruction__Group__0 : rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 ;
    public final void rule__PartialDestruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5911:1: ( rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5912:2: rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__012331);
            rule__PartialDestruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__012334);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5919:1: rule__PartialDestruction__Group__0__Impl : ( () ) ;
    public final void rule__PartialDestruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5923:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5924:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5924:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5925:1: ()
            {
             before(grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5926:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5928:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5938:1: rule__PartialDestruction__Group__1 : rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 ;
    public final void rule__PartialDestruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5942:1: ( rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5943:2: rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__112392);
            rule__PartialDestruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__112395);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5950:1: rule__PartialDestruction__Group__1__Impl : ( '\\u2E22' ) ;
    public final void rule__PartialDestruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5954:1: ( ( '\\u2E22' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5955:1: ( '\\u2E22' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5955:1: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5956:1: '\\u2E22'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__PartialDestruction__Group__1__Impl12423); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:1: rule__PartialDestruction__Group__2 : rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 ;
    public final void rule__PartialDestruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:1: ( rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5974:2: rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__212454);
            rule__PartialDestruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__212457);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5981:1: rule__PartialDestruction__Group__2__Impl : ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) ;
    public final void rule__PartialDestruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5985:1: ( ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5986:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5986:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5987:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5987:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5988:1: ( rule__PartialDestruction__WCharAssignment_2 )
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5989:1: ( rule__PartialDestruction__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5989:2: rule__PartialDestruction__WCharAssignment_2
            {
            pushFollow(FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12486);
            rule__PartialDestruction__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:1: ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5993:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_EGYSTRING||LA44_0==24||LA44_0==26||LA44_0==28||LA44_0==30||LA44_0==34||LA44_0==38||(LA44_0>=50 && LA44_0<=57)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:2: rule__PartialDestruction__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12498);
            	    rule__PartialDestruction__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6005:1: rule__PartialDestruction__Group__3 : rule__PartialDestruction__Group__3__Impl ;
    public final void rule__PartialDestruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6009:1: ( rule__PartialDestruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6010:2: rule__PartialDestruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__312531);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6016:1: rule__PartialDestruction__Group__3__Impl : ( '\\u2E23' ) ;
    public final void rule__PartialDestruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6020:1: ( ( '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6021:1: ( '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6021:1: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6022:1: '\\u2E23'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__PartialDestruction__Group__3__Impl12559); 
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


    // $ANTLR start "rule__InterfixLexical__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6043:1: rule__InterfixLexical__Group__0 : rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 ;
    public final void rule__InterfixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6047:1: ( rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6048:2: rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixLexical__Group__0__Impl_in_rule__InterfixLexical__Group__012598);
            rule__InterfixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixLexical__Group__1_in_rule__InterfixLexical__Group__012601);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6055:1: rule__InterfixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6059:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6060:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6060:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6061:1: ()
            {
             before(grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6062:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6064:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6074:1: rule__InterfixLexical__Group__1 : rule__InterfixLexical__Group__1__Impl ;
    public final void rule__InterfixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6078:1: ( rule__InterfixLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6079:2: rule__InterfixLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixLexical__Group__1__Impl_in_rule__InterfixLexical__Group__112659);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6085:1: rule__InterfixLexical__Group__1__Impl : ( ',' ) ;
    public final void rule__InterfixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6089:1: ( ( ',' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6090:1: ( ',' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6090:1: ( ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6091:1: ','
            {
             before(grammarAccess.getInterfixLexicalAccess().getCommaKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__InterfixLexical__Group__1__Impl12687); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6108:1: rule__InterfixFlexion__Group__0 : rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 ;
    public final void rule__InterfixFlexion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6112:1: ( rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6113:2: rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixFlexion__Group__0__Impl_in_rule__InterfixFlexion__Group__012722);
            rule__InterfixFlexion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixFlexion__Group__1_in_rule__InterfixFlexion__Group__012725);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6120:1: rule__InterfixFlexion__Group__0__Impl : ( () ) ;
    public final void rule__InterfixFlexion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6124:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6125:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6125:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6126:1: ()
            {
             before(grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6127:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6129:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6139:1: rule__InterfixFlexion__Group__1 : rule__InterfixFlexion__Group__1__Impl ;
    public final void rule__InterfixFlexion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6143:1: ( rule__InterfixFlexion__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6144:2: rule__InterfixFlexion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixFlexion__Group__1__Impl_in_rule__InterfixFlexion__Group__112783);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6150:1: rule__InterfixFlexion__Group__1__Impl : ( '.' ) ;
    public final void rule__InterfixFlexion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6154:1: ( ( '.' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6155:1: ( '.' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6155:1: ( '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6156:1: '.'
            {
             before(grammarAccess.getInterfixFlexionAccess().getFullStopKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__InterfixFlexion__Group__1__Impl12811); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6173:1: rule__InterfixSuffixPronomLexical__Group__0 : rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 ;
    public final void rule__InterfixSuffixPronomLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6177:1: ( rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6178:2: rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__0__Impl_in_rule__InterfixSuffixPronomLexical__Group__012846);
            rule__InterfixSuffixPronomLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__1_in_rule__InterfixSuffixPronomLexical__Group__012849);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6185:1: rule__InterfixSuffixPronomLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6189:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6190:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6190:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6191:1: ()
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6192:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6194:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6204:1: rule__InterfixSuffixPronomLexical__Group__1 : rule__InterfixSuffixPronomLexical__Group__1__Impl ;
    public final void rule__InterfixSuffixPronomLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6208:1: ( rule__InterfixSuffixPronomLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6209:2: rule__InterfixSuffixPronomLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixSuffixPronomLexical__Group__1__Impl_in_rule__InterfixSuffixPronomLexical__Group__112907);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6215:1: rule__InterfixSuffixPronomLexical__Group__1__Impl : ( '\\u2261' ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6219:1: ( ( '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6220:1: ( '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6220:1: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6221:1: '\\u2261'
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getIdenticalToKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__InterfixSuffixPronomLexical__Group__1__Impl12935); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6238:1: rule__InterfixPrefixNonLexical__Group__0 : rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 ;
    public final void rule__InterfixPrefixNonLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6242:1: ( rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6243:2: rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__0__Impl_in_rule__InterfixPrefixNonLexical__Group__012970);
            rule__InterfixPrefixNonLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__1_in_rule__InterfixPrefixNonLexical__Group__012973);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6250:1: rule__InterfixPrefixNonLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixNonLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6254:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6255:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6255:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6256:1: ()
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6257:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6259:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6269:1: rule__InterfixPrefixNonLexical__Group__1 : rule__InterfixPrefixNonLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixNonLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6273:1: ( rule__InterfixPrefixNonLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6274:2: rule__InterfixPrefixNonLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixPrefixNonLexical__Group__1__Impl_in_rule__InterfixPrefixNonLexical__Group__113031);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6280:1: rule__InterfixPrefixNonLexical__Group__1__Impl : ( ':' ) ;
    public final void rule__InterfixPrefixNonLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6284:1: ( ( ':' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6285:1: ( ':' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6285:1: ( ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6286:1: ':'
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getColonKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__InterfixPrefixNonLexical__Group__1__Impl13059); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6303:1: rule__InterfixPrefixLexical__Group__0 : rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 ;
    public final void rule__InterfixPrefixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6307:1: ( rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6308:2: rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__0__Impl_in_rule__InterfixPrefixLexical__Group__013094);
            rule__InterfixPrefixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__1_in_rule__InterfixPrefixLexical__Group__013097);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6315:1: rule__InterfixPrefixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6319:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6320:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6320:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6321:1: ()
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6322:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6324:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6334:1: rule__InterfixPrefixLexical__Group__1 : rule__InterfixPrefixLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6338:1: ( rule__InterfixPrefixLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6339:2: rule__InterfixPrefixLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixPrefixLexical__Group__1__Impl_in_rule__InterfixPrefixLexical__Group__113155);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6345:1: rule__InterfixPrefixLexical__Group__1__Impl : ( '\\u22EE' ) ;
    public final void rule__InterfixPrefixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6349:1: ( ( '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6350:1: ( '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6350:1: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6351:1: '\\u22EE'
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getVerticalEllipsisKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__InterfixPrefixLexical__Group__1__Impl13183); 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6368:1: rule__InterfixConnectionSyllabicGroup__Group__0 : rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6372:1: ( rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6373:2: rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__013218);
            rule__InterfixConnectionSyllabicGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1_in_rule__InterfixConnectionSyllabicGroup__Group__013221);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6380:1: rule__InterfixConnectionSyllabicGroup__Group__0__Impl : ( () ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6384:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6385:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6385:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6386:1: ()
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6387:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6389:1: 
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6399:1: rule__InterfixConnectionSyllabicGroup__Group__1 : rule__InterfixConnectionSyllabicGroup__Group__1__Impl ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6403:1: ( rule__InterfixConnectionSyllabicGroup__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6404:2: rule__InterfixConnectionSyllabicGroup__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__113279);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6410:1: rule__InterfixConnectionSyllabicGroup__Group__1__Impl : ( '~' ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6414:1: ( ( '~' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6415:1: ( '~' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6415:1: ( '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6416:1: '~'
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getTildeKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__InterfixConnectionSyllabicGroup__Group__1__Impl13307); 
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


    // $ANTLR start "rule__InterfixCompoundWords__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6433:1: rule__InterfixCompoundWords__Group__0 : rule__InterfixCompoundWords__Group__0__Impl rule__InterfixCompoundWords__Group__1 ;
    public final void rule__InterfixCompoundWords__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6437:1: ( rule__InterfixCompoundWords__Group__0__Impl rule__InterfixCompoundWords__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6438:2: rule__InterfixCompoundWords__Group__0__Impl rule__InterfixCompoundWords__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixCompoundWords__Group__0__Impl_in_rule__InterfixCompoundWords__Group__013342);
            rule__InterfixCompoundWords__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixCompoundWords__Group__1_in_rule__InterfixCompoundWords__Group__013345);
            rule__InterfixCompoundWords__Group__1();

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
    // $ANTLR end "rule__InterfixCompoundWords__Group__0"


    // $ANTLR start "rule__InterfixCompoundWords__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6445:1: rule__InterfixCompoundWords__Group__0__Impl : ( () ) ;
    public final void rule__InterfixCompoundWords__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6449:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6450:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6450:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6451:1: ()
            {
             before(grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6452:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6454:1: 
            {
            }

             after(grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixCompoundWords__Group__0__Impl"


    // $ANTLR start "rule__InterfixCompoundWords__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6464:1: rule__InterfixCompoundWords__Group__1 : rule__InterfixCompoundWords__Group__1__Impl ;
    public final void rule__InterfixCompoundWords__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6468:1: ( rule__InterfixCompoundWords__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6469:2: rule__InterfixCompoundWords__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixCompoundWords__Group__1__Impl_in_rule__InterfixCompoundWords__Group__113403);
            rule__InterfixCompoundWords__Group__1__Impl();

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
    // $ANTLR end "rule__InterfixCompoundWords__Group__1"


    // $ANTLR start "rule__InterfixCompoundWords__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6475:1: rule__InterfixCompoundWords__Group__1__Impl : ( '-' ) ;
    public final void rule__InterfixCompoundWords__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6479:1: ( ( '-' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6480:1: ( '-' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6480:1: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6481:1: '-'
            {
             before(grammarAccess.getInterfixCompoundWordsAccess().getHyphenMinusKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__InterfixCompoundWords__Group__1__Impl13431); 
             after(grammarAccess.getInterfixCompoundWordsAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__InterfixCompoundWords__Group__1__Impl"


    // $ANTLR start "rule__InterfixPhoneticalComplement__Group__0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6498:1: rule__InterfixPhoneticalComplement__Group__0 : rule__InterfixPhoneticalComplement__Group__0__Impl rule__InterfixPhoneticalComplement__Group__1 ;
    public final void rule__InterfixPhoneticalComplement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6502:1: ( rule__InterfixPhoneticalComplement__Group__0__Impl rule__InterfixPhoneticalComplement__Group__1 )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6503:2: rule__InterfixPhoneticalComplement__Group__0__Impl rule__InterfixPhoneticalComplement__Group__1
            {
            pushFollow(FOLLOW_rule__InterfixPhoneticalComplement__Group__0__Impl_in_rule__InterfixPhoneticalComplement__Group__013466);
            rule__InterfixPhoneticalComplement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfixPhoneticalComplement__Group__1_in_rule__InterfixPhoneticalComplement__Group__013469);
            rule__InterfixPhoneticalComplement__Group__1();

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
    // $ANTLR end "rule__InterfixPhoneticalComplement__Group__0"


    // $ANTLR start "rule__InterfixPhoneticalComplement__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6510:1: rule__InterfixPhoneticalComplement__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPhoneticalComplement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6514:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6515:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6515:1: ( () )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6516:1: ()
            {
             before(grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0()); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6517:1: ()
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6519:1: 
            {
            }

             after(grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixPhoneticalComplement__Group__0__Impl"


    // $ANTLR start "rule__InterfixPhoneticalComplement__Group__1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6529:1: rule__InterfixPhoneticalComplement__Group__1 : rule__InterfixPhoneticalComplement__Group__1__Impl ;
    public final void rule__InterfixPhoneticalComplement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6533:1: ( rule__InterfixPhoneticalComplement__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6534:2: rule__InterfixPhoneticalComplement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfixPhoneticalComplement__Group__1__Impl_in_rule__InterfixPhoneticalComplement__Group__113527);
            rule__InterfixPhoneticalComplement__Group__1__Impl();

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
    // $ANTLR end "rule__InterfixPhoneticalComplement__Group__1"


    // $ANTLR start "rule__InterfixPhoneticalComplement__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6540:1: rule__InterfixPhoneticalComplement__Group__1__Impl : ( ';' ) ;
    public final void rule__InterfixPhoneticalComplement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6544:1: ( ( ';' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6545:1: ( ';' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6545:1: ( ';' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6546:1: ';'
            {
             before(grammarAccess.getInterfixPhoneticalComplementAccess().getSemicolonKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__InterfixPhoneticalComplement__Group__1__Impl13555); 
             after(grammarAccess.getInterfixPhoneticalComplementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__InterfixPhoneticalComplement__Group__1__Impl"


    // $ANTLR start "rule__TextContent__ItemsAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6564:1: rule__TextContent__ItemsAssignment_1_0 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6568:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6569:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6569:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6570:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_013595);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6579:1: rule__TextContent__ItemsAssignment_1_1_1 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6583:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6584:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6584:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6585:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_1_113626);
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


    // $ANTLR start "rule__Sentence__ItemsAssignment_2_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6594:1: rule__Sentence__ItemsAssignment_2_0 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6598:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6599:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6599:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6600:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_013657);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Sentence__ItemsAssignment_2_0"


    // $ANTLR start "rule__Sentence__ItemsAssignment_2_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6609:1: rule__Sentence__ItemsAssignment_2_1_2 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6613:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6614:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6614:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6615:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_1_213688);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__Sentence__ItemsAssignment_2_1_2"


    // $ANTLR start "rule__Ambivalence__CasesAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6624:1: rule__Ambivalence__CasesAssignment_1_0 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6628:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6629:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6629:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6630:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_013719);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6639:1: rule__Ambivalence__CasesAssignment_1_1_2 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6643:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6644:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6644:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6645:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_213750);
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


    // $ANTLR start "rule__Case__NameAssignment_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6654:1: rule__Case__NameAssignment_0 : ( RULE_CASESTRING ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6658:1: ( ( RULE_CASESTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6659:1: ( RULE_CASESTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6659:1: ( RULE_CASESTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6660:1: RULE_CASESTRING
            {
             before(grammarAccess.getCaseAccess().getNameCASESTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_CASESTRING,FOLLOW_RULE_CASESTRING_in_rule__Case__NameAssignment_013781); 
             after(grammarAccess.getCaseAccess().getNameCASESTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Case__NameAssignment_0"


    // $ANTLR start "rule__Case__ItemsAssignment_2_0"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6669:1: rule__Case__ItemsAssignment_2_0 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6673:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6674:1: ( ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6674:1: ( ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6675:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_013812);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Case__ItemsAssignment_2_0"


    // $ANTLR start "rule__Case__ItemsAssignment_2_1_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6684:1: rule__Case__ItemsAssignment_2_1_2 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6688:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6689:1: ( ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6689:1: ( ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6690:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_1_213843);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__Case__ItemsAssignment_2_1_2"


    // $ANTLR start "rule__Marker__TypeAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6699:1: rule__Marker__TypeAssignment : ( RULE_BETWEEN_HASHES ) ;
    public final void rule__Marker__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6703:1: ( ( RULE_BETWEEN_HASHES ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:1: ( RULE_BETWEEN_HASHES )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:1: ( RULE_BETWEEN_HASHES )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6705:1: RULE_BETWEEN_HASHES
            {
             before(grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0()); 
            match(input,RULE_BETWEEN_HASHES,FOLLOW_RULE_BETWEEN_HASHES_in_rule__Marker__TypeAssignment13874); 
             after(grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Marker__TypeAssignment"


    // $ANTLR start "rule__DestructionMarker__TypeAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6714:1: rule__DestructionMarker__TypeAssignment : ( RULE_BETWEEN_MINUS ) ;
    public final void rule__DestructionMarker__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6718:1: ( ( RULE_BETWEEN_MINUS ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6719:1: ( RULE_BETWEEN_MINUS )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6719:1: ( RULE_BETWEEN_MINUS )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6720:1: RULE_BETWEEN_MINUS
            {
             before(grammarAccess.getDestructionMarkerAccess().getTypeBETWEEN_MINUSTerminalRuleCall_0()); 
            match(input,RULE_BETWEEN_MINUS,FOLLOW_RULE_BETWEEN_MINUS_in_rule__DestructionMarker__TypeAssignment13905); 
             after(grammarAccess.getDestructionMarkerAccess().getTypeBETWEEN_MINUSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DestructionMarker__TypeAssignment"


    // $ANTLR start "rule__Word__WCharAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6729:1: rule__Word__WCharAssignment_1 : ( ruleWordPart ) ;
    public final void rule__Word__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6733:1: ( ( ruleWordPart ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6734:1: ( ruleWordPart )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6734:1: ( ruleWordPart )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6735:1: ruleWordPart
            {
             before(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_113936);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Word__WCharAssignment_1"


    // $ANTLR start "rule__WordPart__WCharAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6744:1: rule__WordPart__WCharAssignment_1 : ( ruleWordMiddle ) ;
    public final void rule__WordPart__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6748:1: ( ( ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6749:1: ( ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6749:1: ( ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6750:1: ruleWordMiddle
            {
             before(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_113967);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WordPart__WCharAssignment_1"


    // $ANTLR start "rule__Chars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6759:1: rule__Chars__NameAssignment : ( RULE_EGYSTRING ) ;
    public final void rule__Chars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6763:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6764:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6764:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6765:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment13998); 
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


    // $ANTLR start "rule__Oval__WCharAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6774:1: rule__Oval__WCharAssignment_1 : ( ruleNoCartouche ) ;
    public final void rule__Oval__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6778:1: ( ( ruleNoCartouche ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6779:1: ( ruleNoCartouche )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6779:1: ( ruleNoCartouche )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6780:1: ruleNoCartouche
            {
             before(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNoCartouche_in_rule__Oval__WCharAssignment_114029);
            ruleNoCartouche();

            state._fsp--;

             after(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Oval__WCharAssignment_1"


    // $ANTLR start "rule__Serech__WCharAssignment_1"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6789:1: rule__Serech__WCharAssignment_1 : ( ruleNoCartouche ) ;
    public final void rule__Serech__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6793:1: ( ( ruleNoCartouche ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6794:1: ( ruleNoCartouche )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6794:1: ( ruleNoCartouche )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6795:1: ruleNoCartouche
            {
             before(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNoCartouche_in_rule__Serech__WCharAssignment_114060);
            ruleNoCartouche();

            state._fsp--;

             after(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Serech__WCharAssignment_1"


    // $ANTLR start "rule__Cartouche__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6804:1: rule__Cartouche__WCharAssignment_2 : ( ruleNoCartouche ) ;
    public final void rule__Cartouche__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6808:1: ( ( ruleNoCartouche ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6809:1: ( ruleNoCartouche )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6809:1: ( ruleNoCartouche )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6810:1: ruleNoCartouche
            {
             before(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoCartouche_in_rule__Cartouche__WCharAssignment_214091);
            ruleNoCartouche();

            state._fsp--;

             after(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Cartouche__WCharAssignment_2"


    // $ANTLR start "rule__Expanded__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6819:1: rule__Expanded__WCharAssignment_2 : ( ruleNoExpanded ) ;
    public final void rule__Expanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6823:1: ( ( ruleNoExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6824:1: ( ruleNoExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6824:1: ( ruleNoExpanded )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6825:1: ruleNoExpanded
            {
             before(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_214122);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6834:1: rule__Emendation__WCharAssignment_2 : ( ruleNoEmendation ) ;
    public final void rule__Emendation__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6838:1: ( ( ruleNoEmendation ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6839:1: ( ruleNoEmendation )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6839:1: ( ruleNoEmendation )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6840:1: ruleNoEmendation
            {
             before(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_214153);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6849:1: rule__DisputableReading__WCharAssignment_2 : ( ruleNoDisputableReading ) ;
    public final void rule__DisputableReading__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6853:1: ( ( ruleNoDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6854:1: ( ruleNoDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6854:1: ( ruleNoDisputableReading )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6855:1: ruleNoDisputableReading
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_214184);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6864:1: rule__Lacuna__WCharAssignment_2 : ( ruleNoLacuna ) ;
    public final void rule__Lacuna__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6868:1: ( ( ruleNoLacuna ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6869:1: ( ruleNoLacuna )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6869:1: ( ruleNoLacuna )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6870:1: ruleNoLacuna
            {
             before(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_214215);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6879:1: rule__Deletion__WCharAssignment_2 : ( ruleNoDeletion ) ;
    public final void rule__Deletion__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6883:1: ( ( ruleNoDeletion ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6884:1: ( ruleNoDeletion )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6884:1: ( ruleNoDeletion )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6885:1: ruleNoDeletion
            {
             before(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_214246);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6894:1: rule__ExpandedColumn__WCharAssignment_2 : ( ruleNoExpandedColumn ) ;
    public final void rule__ExpandedColumn__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6898:1: ( ( ruleNoExpandedColumn ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6899:1: ( ruleNoExpandedColumn )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6899:1: ( ruleNoExpandedColumn )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6900:1: ruleNoExpandedColumn
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_214277);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6909:1: rule__Rasur__WCharAssignment_2 : ( ruleNoRasur ) ;
    public final void rule__Rasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6913:1: ( ( ruleNoRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6914:1: ( ruleNoRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6914:1: ( ruleNoRasur )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6915:1: ruleNoRasur
            {
             before(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_214308);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6924:1: rule__AncientExpanded__WCharAssignment_2 : ( ruleNoAncientExpanded ) ;
    public final void rule__AncientExpanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6928:1: ( ( ruleNoAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6929:1: ( ruleNoAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6929:1: ( ruleNoAncientExpanded )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6930:1: ruleNoAncientExpanded
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_214339);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6939:1: rule__RestorationOverRasur__WCharAssignment_2 : ( ruleNoRestorationOverRasur ) ;
    public final void rule__RestorationOverRasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6943:1: ( ( ruleNoRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6944:1: ( ruleNoRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6944:1: ( ruleNoRestorationOverRasur )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6945:1: ruleNoRestorationOverRasur
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_214370);
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
    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6954:1: rule__PartialDestruction__WCharAssignment_2 : ( ruleNoPartialDestruction ) ;
    public final void rule__PartialDestruction__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6958:1: ( ( ruleNoPartialDestruction ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6959:1: ( ruleNoPartialDestruction )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6959:1: ( ruleNoPartialDestruction )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6960:1: ruleNoPartialDestruction
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_214401);
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
    public static final BitSet FOLLOW_ruleDisputableVersMarker_in_entryRuleDisputableVersMarker600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableVersMarker607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableVersMarker__Group__0_in_ruleDisputableVersMarker633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletedVersMarker_in_entryRuleDeletedVersMarker660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletedVersMarker667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeletedVersMarker__Group__0_in_ruleDeletedVersMarker693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroyedVersMarker_in_entryRuleDestroyedVersMarker720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestroyedVersMarker727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DestroyedVersMarker__Group__0_in_ruleDestroyedVersMarker753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMissingVersMarker_in_entryRuleMissingVersMarker780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMissingVersMarker787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MissingVersMarker__Group__0_in_ruleMissingVersMarker813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasurMarker_in_entryRuleRestorationOverRasurMarker840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasurMarker847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasurMarker__Group__0_in_ruleRestorationOverRasurMarker873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpandedMarker_in_entryRuleAncientExpandedMarker900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpandedMarker907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpandedMarker__Group__0_in_ruleAncientExpandedMarker933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasurMarker_in_entryRuleRasurMarker960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasurMarker967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasurMarker__Group__0_in_ruleRasurMarker993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__0_in_ruleVersFrontierMarker1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__0_in_ruleVersbreakMarker1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__0_in_ruleBrokenVersbreakMarker1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarker1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Marker__TypeAssignment_in_ruleMarker1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestructionMarker_in_entryRuleDestructionMarker1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestructionMarker1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DestructionMarker__TypeAssignment_in_ruleDestructionMarker1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_entryRuleWord1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWord1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group__0_in_ruleWord1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordPart1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group__0_in_ruleWordPart1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_entryRuleChars1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChars1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chars__NameAssignment_in_ruleChars1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_entryRuleOval1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOval1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oval__Group__0_in_ruleOval1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_entryRuleSerech1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSerech1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Serech__Group__0_in_ruleSerech1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_entryRuleCartouche1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCartouche1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__0_in_ruleCartouche1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_entryRuleNoCartouche1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoCartouche1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoCartouche__Alternatives_in_ruleNoCartouche1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpanded1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__0_in_ruleExpanded1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoExpanded__Alternatives_in_ruleNoExpanded1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmendation1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__0_in_ruleEmendation2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLacuna2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeletion2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__0_in_ruleDeletion2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasur2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__0_in_ruleRasur2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoAncientExpanded__Alternatives_in_ruleNoAncientExpanded2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur2820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoRestorationOverRasur__Alternatives_in_ruleNoRestorationOverRasur2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoPartialDestruction__Alternatives_in_ruleNoPartialDestruction3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfix3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interfix__Alternatives_in_ruleInterfix3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__0_in_ruleInterfixLexical3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion3180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__0_in_ruleInterfixFlexion3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__0_in_ruleInterfixSuffixPronomLexical3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__0_in_ruleInterfixPrefixNonLexical3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__0_in_ruleInterfixPrefixLexical3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0_in_ruleInterfixConnectionSyllabicGroup3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_entryRuleInterfixCompoundWords3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompoundWords3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixCompoundWords__Group__0_in_ruleInterfixCompoundWords3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_entryRuleInterfixPhoneticalComplement3540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPhoneticalComplement3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPhoneticalComplement__Group__0_in_ruleInterfixPhoneticalComplement3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__TextContent__Alternatives_1_1_03610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__TextContent__Alternatives_1_1_03629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestructionMarker_in_rule__AbstractMarker__Alternatives3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItemNoAmbivalence__Alternatives3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItemNoAmbivalence__Alternatives3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_rule__VersMarker__Alternatives3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMissingVersMarker_in_rule__VersMarker__Alternatives3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroyedVersMarker_in_rule__VersMarker__Alternatives3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletedVersMarker_in_rule__VersMarker__Alternatives3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableVersMarker_in_rule__VersMarker__Alternatives3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasurMarker_in_rule__VersMarker__Alternatives3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpandedMarker_in_rule__VersMarker__Alternatives3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasurMarker_in_rule__VersMarker__Alternatives3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__WordMiddle__Alternatives4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_rule__Brackets__Alternatives4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_rule__Brackets__Alternatives4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_rule__Brackets__Alternatives4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_rule__Brackets__Alternatives4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoCartouche__Alternatives4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_rule__NoCartouche__Alternatives4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_rule__NoCartouche__Alternatives4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__NoCartouche__Alternatives4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_rule__NoCartouche__Alternatives4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoCartouche__Alternatives4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoCartouche__Alternatives4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_rule__NoCartouche__Alternatives4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_rule__NoCartouche__Alternatives4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_rule__NoCartouche__Alternatives4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_rule__NoCartouche__Alternatives4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoCartouche__Alternatives4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoExpanded__Alternatives4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoExpanded__Alternatives4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoExpanded__Alternatives4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoEmendation__Alternatives4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoEmendation__Alternatives4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmendation_in_rule__NoDisputableReading__Alternatives4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_rule__NoDisputableReading__Alternatives4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasur_in_rule__NoDisputableReading__Alternatives4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAncientExpanded_in_rule__NoDisputableReading__Alternatives4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__NoDisputableReading__Alternatives4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpandedColumn_in_rule__NoDisputableReading__Alternatives4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_rule__NoDisputableReading__Alternatives4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_rule__NoDisputableReading__Alternatives4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoDisputableReading__Alternatives4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoLacuna__Alternatives4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoLacuna__Alternatives4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_rule__NoLacuna__Alternatives4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_rule__NoLacuna__Alternatives4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_rule__NoLacuna__Alternatives5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialDestruction_in_rule__NoDeletion__Alternatives5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDeletion__Alternatives5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoDeletion__Alternatives5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoDeletion__Alternatives5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLacuna_in_rule__NoDeletion__Alternatives5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__NoDeletion__Alternatives5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoExpandedColumn__Alternatives5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoExpandedColumn__Alternatives5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoExpandedColumn__Alternatives5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoRasur__Alternatives5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoRasur__Alternatives5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoRasur__Alternatives5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoRasur__Alternatives5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoAncientExpanded__Alternatives5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoAncientExpanded__Alternatives5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoAncientExpanded__Alternatives5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoAncientExpanded__Alternatives5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoRestorationOverRasur__Alternatives5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoRestorationOverRasur__Alternatives5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoRestorationOverRasur__Alternatives5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoRestorationOverRasur__Alternatives5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_rule__NoRestorationOverRasur__Alternatives5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChars_in_rule__NoPartialDestruction__Alternatives5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeletion_in_rule__NoPartialDestruction__Alternatives5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpanded_in_rule__NoPartialDestruction__Alternatives5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoPartialDestruction__Alternatives5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfix_in_rule__NoPartialDestruction__Alternatives5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCartouche_in_rule__NoPartialDestruction__Alternatives5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOval_in_rule__NoPartialDestruction__Alternatives5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSerech_in_rule__NoPartialDestruction__Alternatives5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixFlexion_in_rule__Interfix__Alternatives5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixLexical_in_rule__Interfix__Alternatives5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_rule__Interfix__Alternatives5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_rule__Interfix__Alternatives5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_rule__Interfix__Alternatives5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_rule__Interfix__Alternatives5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixCompoundWords_in_rule__Interfix__Alternatives5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfixPhoneticalComplement_in_rule__Interfix__Alternatives5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__05816 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__05819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__15877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__05938 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__15998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__0_in_rule__TextContent__Group_1__1__Impl6025 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__0__Impl_in_rule__TextContent__Group_1_1__06060 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__1_in_rule__TextContent__Group_1_1__06063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Alternatives_1_1_0_in_rule__TextContent__Group_1_1__0__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__Group_1_1__1__Impl_in_rule__TextContent__Group_1_1__16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_1_1_in_rule__TextContent__Group_1_1__1__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__06182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__06185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__16243 = new BitSet(new long[]{0x03FD555555FFEDC0L});
    public static final BitSet FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__16246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Sentence__Group__1__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__26305 = new BitSet(new long[]{0x03FD555555FFEDC0L});
    public static final BitSet FOLLOW_rule__Sentence__Group__3_in_rule__Sentence__Group__26308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2__0_in_rule__Sentence__Group__2__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group__3__Impl_in_rule__Sentence__Group__36366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Sentence__Group__3__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2__0__Impl_in_rule__Sentence__Group_2__06433 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2__1_in_rule__Sentence__Group_2__06436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_2_0_in_rule__Sentence__Group_2__0__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2__1__Impl_in_rule__Sentence__Group_2__16493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2_1__0_in_rule__Sentence__Group_2__1__Impl6520 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2_1__0__Impl_in_rule__Sentence__Group_2_1__06555 = new BitSet(new long[]{0x03FD555555FFE9D0L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2_1__1_in_rule__Sentence__Group_2_1__06558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Sentence__Group_2_1__0__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2_1__1__Impl_in_rule__Sentence__Group_2_1__16617 = new BitSet(new long[]{0x03FD555555FFE9D0L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2_1__2_in_rule__Sentence__Group_2_1__16620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Sentence__Group_2_1__1__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__Group_2_1__2__Impl_in_rule__Sentence__Group_2_1__26679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_2_1_2_in_rule__Sentence__Group_2_1__2__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__06742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__06745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Ambivalence__Group__0__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__16804 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__16807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__26864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Ambivalence__Group__2__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__06929 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__06932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__16989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl7018 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl7030 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__07067 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__07070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Ambivalence__Group_1_1__0__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__17129 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__2_in_rule__Ambivalence__Group_1_1__17132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Ambivalence__Group_1_1__1__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__2__Impl_in_rule__Ambivalence__Group_1_1__27191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_1_2_in_rule__Ambivalence__Group_1_1__2__Impl7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__07254 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__07257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__17314 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Case__Group__1__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__27376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2__0_in_rule__Case__Group__2__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2__0__Impl_in_rule__Case__Group_2__07439 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Case__Group_2__1_in_rule__Case__Group_2__07442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ItemsAssignment_2_0_in_rule__Case__Group_2__0__Impl7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2__1__Impl_in_rule__Case__Group_2__17499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2_1__0_in_rule__Case__Group_2__1__Impl7526 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Case__Group_2_1__0__Impl_in_rule__Case__Group_2_1__07561 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_rule__Case__Group_2_1__1_in_rule__Case__Group_2_1__07564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Case__Group_2_1__0__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2_1__1__Impl_in_rule__Case__Group_2_1__17623 = new BitSet(new long[]{0x03FD555555FFE1D0L});
    public static final BitSet FOLLOW_rule__Case__Group_2_1__2_in_rule__Case__Group_2_1__17626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Case__Group_2_1__1__Impl7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group_2_1__2__Impl_in_rule__Case__Group_2_1__27685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ItemsAssignment_2_1_2_in_rule__Case__Group_2_1__2__Impl7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableVersMarker__Group__0__Impl_in_rule__DisputableVersMarker__Group__07748 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DisputableVersMarker__Group__1_in_rule__DisputableVersMarker__Group__07751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableVersMarker__Group__1__Impl_in_rule__DisputableVersMarker__Group__17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DisputableVersMarker__Group__1__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeletedVersMarker__Group__0__Impl_in_rule__DeletedVersMarker__Group__07872 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DeletedVersMarker__Group__1_in_rule__DeletedVersMarker__Group__07875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeletedVersMarker__Group__1__Impl_in_rule__DeletedVersMarker__Group__17933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DeletedVersMarker__Group__1__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DestroyedVersMarker__Group__0__Impl_in_rule__DestroyedVersMarker__Group__07996 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DestroyedVersMarker__Group__1_in_rule__DestroyedVersMarker__Group__07999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DestroyedVersMarker__Group__1__Impl_in_rule__DestroyedVersMarker__Group__18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DestroyedVersMarker__Group__1__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MissingVersMarker__Group__0__Impl_in_rule__MissingVersMarker__Group__08120 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MissingVersMarker__Group__1_in_rule__MissingVersMarker__Group__08123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MissingVersMarker__Group__1__Impl_in_rule__MissingVersMarker__Group__18181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MissingVersMarker__Group__1__Impl8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasurMarker__Group__0__Impl_in_rule__RestorationOverRasurMarker__Group__08244 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RestorationOverRasurMarker__Group__1_in_rule__RestorationOverRasurMarker__Group__08247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasurMarker__Group__1__Impl_in_rule__RestorationOverRasurMarker__Group__18305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RestorationOverRasurMarker__Group__1__Impl8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpandedMarker__Group__0__Impl_in_rule__AncientExpandedMarker__Group__08368 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AncientExpandedMarker__Group__1_in_rule__AncientExpandedMarker__Group__08371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpandedMarker__Group__1__Impl_in_rule__AncientExpandedMarker__Group__18429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AncientExpandedMarker__Group__1__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasurMarker__Group__0__Impl_in_rule__RasurMarker__Group__08492 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__RasurMarker__Group__1_in_rule__RasurMarker__Group__08495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasurMarker__Group__1__Impl_in_rule__RasurMarker__Group__18553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RasurMarker__Group__1__Impl8581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__0__Impl_in_rule__VersFrontierMarker__Group__08616 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__1_in_rule__VersFrontierMarker__Group__08619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__1__Impl_in_rule__VersFrontierMarker__Group__18677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VersFrontierMarker__Group__1__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__0__Impl_in_rule__VersbreakMarker__Group__08740 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__1_in_rule__VersbreakMarker__Group__08743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersbreakMarker__Group__1__Impl_in_rule__VersbreakMarker__Group__18801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VersbreakMarker__Group__1__Impl8829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__0__Impl_in_rule__BrokenVersbreakMarker__Group__08864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__1_in_rule__BrokenVersbreakMarker__Group__08867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__1__Impl_in_rule__BrokenVersbreakMarker__Group__18925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BrokenVersbreakMarker__Group__1__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__08988 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Word__Group__1_in_rule__Word__Group__08991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__19049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_in_rule__Word__Group__1__Impl9078 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_in_rule__Word__Group__1__Impl9090 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__WordPart__Group__0__Impl_in_rule__WordPart__Group__09127 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__WordPart__Group__1_in_rule__WordPart__Group__09130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WordPart__Group__0__Impl9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__Group__1__Impl_in_rule__WordPart__Group__19192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_in_rule__WordPart__Group__1__Impl9219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oval__Group__0__Impl_in_rule__Oval__Group__09253 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Oval__Group__1_in_rule__Oval__Group__09256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Oval__Group__0__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oval__Group__1__Impl_in_rule__Oval__Group__19315 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Oval__Group__2_in_rule__Oval__Group__19318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Oval__WCharAssignment_1_in_rule__Oval__Group__1__Impl9347 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Oval__WCharAssignment_1_in_rule__Oval__Group__1__Impl9359 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Oval__Group__2__Impl_in_rule__Oval__Group__29392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Oval__Group__2__Impl9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Serech__Group__0__Impl_in_rule__Serech__Group__09457 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Serech__Group__1_in_rule__Serech__Group__09460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Serech__Group__0__Impl9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Serech__Group__1__Impl_in_rule__Serech__Group__19519 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Serech__Group__2_in_rule__Serech__Group__19522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Serech__WCharAssignment_1_in_rule__Serech__Group__1__Impl9551 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Serech__WCharAssignment_1_in_rule__Serech__Group__1__Impl9563 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Serech__Group__2__Impl_in_rule__Serech__Group__29596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Serech__Group__2__Impl9624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__0__Impl_in_rule__Cartouche__Group__09661 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__1_in_rule__Cartouche__Group__09664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__1__Impl_in_rule__Cartouche__Group__19722 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__2_in_rule__Cartouche__Group__19725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Cartouche__Group__1__Impl9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__2__Impl_in_rule__Cartouche__Group__29784 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__3_in_rule__Cartouche__Group__29787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cartouche__WCharAssignment_2_in_rule__Cartouche__Group__2__Impl9816 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Cartouche__WCharAssignment_2_in_rule__Cartouche__Group__2__Impl9828 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Cartouche__Group__3__Impl_in_rule__Cartouche__Group__39861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Cartouche__Group__3__Impl9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__09928 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__09931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__19989 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__19992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Expanded__Group__1__Impl10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__210051 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__210054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl10083 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl10095 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__310128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Expanded__Group__3__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__010195 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__010198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__110256 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emendation__Group__1__Impl10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__210318 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__210321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl10350 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl10362 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__310395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Emendation__Group__3__Impl10423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__010462 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__010465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__110523 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__110526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DisputableReading__Group__1__Impl10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__210585 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__210588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10617 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl10629 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__310662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DisputableReading__Group__3__Impl10690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__010729 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__010732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__110790 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__110793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Lacuna__Group__1__Impl10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__210852 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__210855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10884 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl10896 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__310929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Lacuna__Group__3__Impl10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__010996 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__010999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__111057 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__111060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Deletion__Group__1__Impl11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__211119 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__211122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl11151 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl11163 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__311196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Deletion__Group__3__Impl11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__011263 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__011266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__111324 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__111327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExpandedColumn__Group__1__Impl11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__211386 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__211389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl11418 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl11430 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__311463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExpandedColumn__Group__3__Impl11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__011530 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__011533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__111591 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__111594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Rasur__Group__1__Impl11622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__211653 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__211656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11685 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl11697 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__311730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Rasur__Group__3__Impl11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__011797 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__011800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__111858 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__111861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AncientExpanded__Group__1__Impl11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__211920 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__211923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11952 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl11964 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__311997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AncientExpanded__Group__3__Impl12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__012064 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__012067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__112125 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__112128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RestorationOverRasur__Group__1__Impl12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__212187 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__212190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl12219 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl12231 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__312264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__RestorationOverRasur__Group__3__Impl12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__012331 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__012334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__112392 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__112395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PartialDestruction__Group__1__Impl12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__212454 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__212457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12486 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl12498 = new BitSet(new long[]{0x03FD555555800102L});
    public static final BitSet FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__312531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PartialDestruction__Group__3__Impl12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__0__Impl_in_rule__InterfixLexical__Group__012598 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__1_in_rule__InterfixLexical__Group__012601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixLexical__Group__1__Impl_in_rule__InterfixLexical__Group__112659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__InterfixLexical__Group__1__Impl12687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__0__Impl_in_rule__InterfixFlexion__Group__012722 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__1_in_rule__InterfixFlexion__Group__012725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixFlexion__Group__1__Impl_in_rule__InterfixFlexion__Group__112783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__InterfixFlexion__Group__1__Impl12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__0__Impl_in_rule__InterfixSuffixPronomLexical__Group__012846 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__1_in_rule__InterfixSuffixPronomLexical__Group__012849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__1__Impl_in_rule__InterfixSuffixPronomLexical__Group__112907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__InterfixSuffixPronomLexical__Group__1__Impl12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__0__Impl_in_rule__InterfixPrefixNonLexical__Group__012970 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__1_in_rule__InterfixPrefixNonLexical__Group__012973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__1__Impl_in_rule__InterfixPrefixNonLexical__Group__113031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__InterfixPrefixNonLexical__Group__1__Impl13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__0__Impl_in_rule__InterfixPrefixLexical__Group__013094 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__1_in_rule__InterfixPrefixLexical__Group__013097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__1__Impl_in_rule__InterfixPrefixLexical__Group__113155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__InterfixPrefixLexical__Group__1__Impl13183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__013218 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1_in_rule__InterfixConnectionSyllabicGroup__Group__013221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__113279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__InterfixConnectionSyllabicGroup__Group__1__Impl13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixCompoundWords__Group__0__Impl_in_rule__InterfixCompoundWords__Group__013342 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__InterfixCompoundWords__Group__1_in_rule__InterfixCompoundWords__Group__013345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixCompoundWords__Group__1__Impl_in_rule__InterfixCompoundWords__Group__113403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__InterfixCompoundWords__Group__1__Impl13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPhoneticalComplement__Group__0__Impl_in_rule__InterfixPhoneticalComplement__Group__013466 = new BitSet(new long[]{0x03FD555555800100L});
    public static final BitSet FOLLOW_rule__InterfixPhoneticalComplement__Group__1_in_rule__InterfixPhoneticalComplement__Group__013469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfixPhoneticalComplement__Group__1__Impl_in_rule__InterfixPhoneticalComplement__Group__113527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__InterfixPhoneticalComplement__Group__1__Impl13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_013595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_1_113626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_013657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_1_213688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_013719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_213750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASESTRING_in_rule__Case__NameAssignment_013781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_013812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_1_213843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BETWEEN_HASHES_in_rule__Marker__TypeAssignment13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BETWEEN_MINUS_in_rule__DestructionMarker__TypeAssignment13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_113936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_113967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_rule__Oval__WCharAssignment_114029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_rule__Serech__WCharAssignment_114060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoCartouche_in_rule__Cartouche__WCharAssignment_214091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_214122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_214153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_214184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_214215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_214246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_214277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_214308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_214339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_214370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_214401 = new BitSet(new long[]{0x0000000000000002L});

}