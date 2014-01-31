package org.bbaw.bts.corpus.text.dsl.ui.contentassist.antlr.internal; 

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
import org.bbaw.bts.corpus.text.dsl.services.BTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBTSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EGYSTRING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@mv'", "'@v'", "'\\u00C2\\u00A7'", "' '", "'%'", "'; '", "'case '", "': '", "'#'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'-'", "'~'", "'('", "')'", "'<'", "'>'", "'?'", "'['", "']'", "'{'", "'}'", "'<<'", "'>>'", "'{{'", "'}}'", "'(('", "'))'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "'--'"
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
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g"; }


     
     	private BTSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BTSGrammarAccess grammarAccess) {
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:60:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:61:1: ( ruleTextContent EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:62:1: ruleTextContent EOF
            {
             before(grammarAccess.getTextContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextContent_in_entryRuleTextContent61);
            ruleTextContent();

            state._fsp--;

             after(grammarAccess.getTextContentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextContent68); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:69:1: ruleTextContent : ( ( rule__TextContent__Group__0 ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:73:2: ( ( ( rule__TextContent__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:74:1: ( ( rule__TextContent__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:74:1: ( ( rule__TextContent__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:75:1: ( rule__TextContent__Group__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:76:1: ( rule__TextContent__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:76:2: rule__TextContent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__0_in_ruleTextContent94);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:88:1: entryRuleTextItem : ruleTextItem EOF ;
    public final void entryRuleTextItem() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:89:1: ( ruleTextItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:90:1: ruleTextItem EOF
            {
             before(grammarAccess.getTextItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_entryRuleTextItem121);
            ruleTextItem();

            state._fsp--;

             after(grammarAccess.getTextItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextItem128); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:97:1: ruleTextItem : ( ruleSentence ) ;
    public final void ruleTextItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:101:2: ( ( ruleSentence ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:102:1: ( ruleSentence )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:102:1: ( ruleSentence )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:103:1: ruleSentence
            {
             before(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleTextItem154);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:116:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:117:1: ( ruleSentence EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:118:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_entryRuleSentence180);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentence187); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:125:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:129:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:130:1: ( ( rule__Sentence__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:130:1: ( ( rule__Sentence__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:131:1: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:132:1: ( rule__Sentence__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:132:2: rule__Sentence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__0_in_ruleSentence213);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:144:1: entryRuleSentenceItem : ruleSentenceItem EOF ;
    public final void entryRuleSentenceItem() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:145:1: ( ruleSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:146:1: ruleSentenceItem EOF
            {
             before(grammarAccess.getSentenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_entryRuleSentenceItem240);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentenceItem247); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:153:1: ruleSentenceItem : ( ( rule__SentenceItem__Alternatives ) ) ;
    public final void ruleSentenceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:157:2: ( ( ( rule__SentenceItem__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:158:1: ( ( rule__SentenceItem__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:158:1: ( ( rule__SentenceItem__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:159:1: ( rule__SentenceItem__Alternatives )
            {
             before(grammarAccess.getSentenceItemAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:160:1: ( rule__SentenceItem__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:160:2: rule__SentenceItem__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SentenceItem__Alternatives_in_ruleSentenceItem273);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:172:1: entryRuleAbstractMarker : ruleAbstractMarker EOF ;
    public final void entryRuleAbstractMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:173:1: ( ruleAbstractMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:174:1: ruleAbstractMarker EOF
            {
             before(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_entryRuleAbstractMarker300);
            ruleAbstractMarker();

            state._fsp--;

             after(grammarAccess.getAbstractMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMarker307); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:181:1: ruleAbstractMarker : ( ( rule__AbstractMarker__Alternatives ) ) ;
    public final void ruleAbstractMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:185:2: ( ( ( rule__AbstractMarker__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:186:1: ( ( rule__AbstractMarker__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:186:1: ( ( rule__AbstractMarker__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:187:1: ( rule__AbstractMarker__Alternatives )
            {
             before(grammarAccess.getAbstractMarkerAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:188:1: ( rule__AbstractMarker__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:188:2: rule__AbstractMarker__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractMarker__Alternatives_in_ruleAbstractMarker333);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:200:1: entryRuleAmbivalence : ruleAmbivalence EOF ;
    public final void entryRuleAmbivalence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:201:1: ( ruleAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:202:1: ruleAmbivalence EOF
            {
             before(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_entryRuleAmbivalence360);
            ruleAmbivalence();

            state._fsp--;

             after(grammarAccess.getAmbivalenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAmbivalence367); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:209:1: ruleAmbivalence : ( ( rule__Ambivalence__Group__0 ) ) ;
    public final void ruleAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:213:2: ( ( ( rule__Ambivalence__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:214:1: ( ( rule__Ambivalence__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:214:1: ( ( rule__Ambivalence__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:215:1: ( rule__Ambivalence__Group__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:216:1: ( rule__Ambivalence__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:216:2: rule__Ambivalence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__0_in_ruleAmbivalence393);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:228:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:229:1: ( ruleCase EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:230:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_entryRuleCase420);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCase427); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:237:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:241:2: ( ( ( rule__Case__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:242:1: ( ( rule__Case__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:242:1: ( ( rule__Case__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:243:1: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:244:1: ( rule__Case__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:244:2: rule__Case__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__0_in_ruleCase453);
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


    // $ANTLR start "entryRuleVersMarker"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:256:1: entryRuleVersMarker : ruleVersMarker EOF ;
    public final void entryRuleVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:257:1: ( ruleVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:258:1: ruleVersMarker EOF
            {
             before(grammarAccess.getVersMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_entryRuleVersMarker480);
            ruleVersMarker();

            state._fsp--;

             after(grammarAccess.getVersMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersMarker487); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:265:1: ruleVersMarker : ( ( rule__VersMarker__Alternatives ) ) ;
    public final void ruleVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:269:2: ( ( ( rule__VersMarker__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:270:1: ( ( rule__VersMarker__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:270:1: ( ( rule__VersMarker__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:271:1: ( rule__VersMarker__Alternatives )
            {
             before(grammarAccess.getVersMarkerAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:272:1: ( rule__VersMarker__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:272:2: rule__VersMarker__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersMarker__Alternatives_in_ruleVersMarker513);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:284:1: entryRuleVersFrontierMarker : ruleVersFrontierMarker EOF ;
    public final void entryRuleVersFrontierMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:285:1: ( ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:286:1: ruleVersFrontierMarker EOF
            {
             before(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker540);
            ruleVersFrontierMarker();

            state._fsp--;

             after(grammarAccess.getVersFrontierMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersFrontierMarker547); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:293:1: ruleVersFrontierMarker : ( '@mv' ) ;
    public final void ruleVersFrontierMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:297:2: ( ( '@mv' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:298:1: ( '@mv' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:298:1: ( '@mv' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:299:1: '@mv'
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getMvKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleVersFrontierMarker574); 
             after(grammarAccess.getVersFrontierMarkerAccess().getMvKeyword()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:314:1: entryRuleVersbreakMarker : ruleVersbreakMarker EOF ;
    public final void entryRuleVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:315:1: ( ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:316:1: ruleVersbreakMarker EOF
            {
             before(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker602);
            ruleVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getVersbreakMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersbreakMarker609); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:323:1: ruleVersbreakMarker : ( '@v' ) ;
    public final void ruleVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:327:2: ( ( '@v' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:328:1: ( '@v' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:328:1: ( '@v' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:329:1: '@v'
            {
             before(grammarAccess.getVersbreakMarkerAccess().getVKeyword()); 
            match(input,13,FollowSets000.FOLLOW_13_in_ruleVersbreakMarker636); 
             after(grammarAccess.getVersbreakMarkerAccess().getVKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMarker"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:344:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:345:1: ( ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:346:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMarker_in_entryRuleMarker664);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarker671); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:353:1: ruleMarker : ( ( rule__Marker__Group__0 ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:357:2: ( ( ( rule__Marker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:358:1: ( ( rule__Marker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:358:1: ( ( rule__Marker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:359:1: ( rule__Marker__Group__0 )
            {
             before(grammarAccess.getMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:360:1: ( rule__Marker__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:360:2: rule__Marker__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__0_in_ruleMarker697);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:372:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:373:1: ( ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:374:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWord_in_entryRuleWord724);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWord731); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:381:1: ruleWord : ( ( rule__Word__Group__0 ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:385:2: ( ( ( rule__Word__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:386:1: ( ( rule__Word__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:386:1: ( ( rule__Word__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:387:1: ( rule__Word__Group__0 )
            {
             before(grammarAccess.getWordAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:388:1: ( rule__Word__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:388:2: rule__Word__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__0_in_ruleWord757);
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


    // $ANTLR start "entryRuleWordMiddle"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:400:1: entryRuleWordMiddle : ruleWordMiddle EOF ;
    public final void entryRuleWordMiddle() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:401:1: ( ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:402:1: ruleWordMiddle EOF
            {
             before(grammarAccess.getWordMiddleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle784);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordMiddleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWordMiddle791); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:409:1: ruleWordMiddle : ( ( rule__WordMiddle__Alternatives ) ) ;
    public final void ruleWordMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:413:2: ( ( ( rule__WordMiddle__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:414:1: ( ( rule__WordMiddle__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:414:1: ( ( rule__WordMiddle__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:415:1: ( rule__WordMiddle__Alternatives )
            {
             before(grammarAccess.getWordMiddleAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:416:1: ( rule__WordMiddle__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:416:2: rule__WordMiddle__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle817);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:428:1: entryRuleChars : ruleChars EOF ;
    public final void entryRuleChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:429:1: ( ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:430:1: ruleChars EOF
            {
             before(grammarAccess.getCharsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_entryRuleChars844);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getCharsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChars851); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:437:1: ruleChars : ( ( rule__Chars__NameAssignment ) ) ;
    public final void ruleChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:441:2: ( ( ( rule__Chars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:442:1: ( ( rule__Chars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:442:1: ( ( rule__Chars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:443:1: ( rule__Chars__NameAssignment )
            {
             before(grammarAccess.getCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:444:1: ( rule__Chars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:444:2: rule__Chars__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Chars__NameAssignment_in_ruleChars877);
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


    // $ANTLR start "entryRuleInterfix"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:456:1: entryRuleInterfix : ruleInterfix EOF ;
    public final void entryRuleInterfix() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:457:1: ( ruleInterfix EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:458:1: ruleInterfix EOF
            {
             before(grammarAccess.getInterfixRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_entryRuleInterfix904);
            ruleInterfix();

            state._fsp--;

             after(grammarAccess.getInterfixRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfix911); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:465:1: ruleInterfix : ( ( rule__Interfix__Alternatives ) ) ;
    public final void ruleInterfix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:469:2: ( ( ( rule__Interfix__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:470:1: ( ( rule__Interfix__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:470:1: ( ( rule__Interfix__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:471:1: ( rule__Interfix__Alternatives )
            {
             before(grammarAccess.getInterfixAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:472:1: ( rule__Interfix__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:472:2: rule__Interfix__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Interfix__Alternatives_in_ruleInterfix937);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:484:1: entryRuleInterfixLexical : ruleInterfixLexical EOF ;
    public final void entryRuleInterfixLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:485:1: ( ruleInterfixLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:486:1: ruleInterfixLexical EOF
            {
             before(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical964);
            ruleInterfixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixLexical971); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:493:1: ruleInterfixLexical : ( ( rule__InterfixLexical__Group__0 ) ) ;
    public final void ruleInterfixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:497:2: ( ( ( rule__InterfixLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:498:1: ( ( rule__InterfixLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:498:1: ( ( rule__InterfixLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:499:1: ( rule__InterfixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:500:1: ( rule__InterfixLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:500:2: rule__InterfixLexical__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixLexical__Group__0_in_ruleInterfixLexical997);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:512:1: entryRuleInterfixFlexion : ruleInterfixFlexion EOF ;
    public final void entryRuleInterfixFlexion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:513:1: ( ruleInterfixFlexion EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:514:1: ruleInterfixFlexion EOF
            {
             before(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion1024);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixFlexion1031); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:521:1: ruleInterfixFlexion : ( ( rule__InterfixFlexion__Group__0 ) ) ;
    public final void ruleInterfixFlexion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:525:2: ( ( ( rule__InterfixFlexion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:526:1: ( ( rule__InterfixFlexion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:526:1: ( ( rule__InterfixFlexion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:527:1: ( rule__InterfixFlexion__Group__0 )
            {
             before(grammarAccess.getInterfixFlexionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:528:1: ( rule__InterfixFlexion__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:528:2: rule__InterfixFlexion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixFlexion__Group__0_in_ruleInterfixFlexion1057);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:540:1: entryRuleInterfixSuffixPronomLexical : ruleInterfixSuffixPronomLexical EOF ;
    public final void entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:541:1: ( ruleInterfixSuffixPronomLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:542:1: ruleInterfixSuffixPronomLexical EOF
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical1084);
            ruleInterfixSuffixPronomLexical();

            state._fsp--;

             after(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical1091); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:549:1: ruleInterfixSuffixPronomLexical : ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) ;
    public final void ruleInterfixSuffixPronomLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:553:2: ( ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:554:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:554:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:555:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:556:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:556:2: rule__InterfixSuffixPronomLexical__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixSuffixPronomLexical__Group__0_in_ruleInterfixSuffixPronomLexical1117);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:568:1: entryRuleInterfixPrefixNonLexical : ruleInterfixPrefixNonLexical EOF ;
    public final void entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:569:1: ( ruleInterfixPrefixNonLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:570:1: ruleInterfixPrefixNonLexical EOF
            {
             before(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical1144);
            ruleInterfixPrefixNonLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical1151); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:577:1: ruleInterfixPrefixNonLexical : ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixNonLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:581:2: ( ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:582:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:582:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:583:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:584:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:584:2: rule__InterfixPrefixNonLexical__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixNonLexical__Group__0_in_ruleInterfixPrefixNonLexical1177);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:596:1: entryRuleInterfixPrefixLexical : ruleInterfixPrefixLexical EOF ;
    public final void entryRuleInterfixPrefixLexical() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:597:1: ( ruleInterfixPrefixLexical EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:598:1: ruleInterfixPrefixLexical EOF
            {
             before(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical1204);
            ruleInterfixPrefixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixLexicalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixPrefixLexical1211); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:605:1: ruleInterfixPrefixLexical : ( ( rule__InterfixPrefixLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:609:2: ( ( ( rule__InterfixPrefixLexical__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:610:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:610:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:611:1: ( rule__InterfixPrefixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:612:1: ( rule__InterfixPrefixLexical__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:612:2: rule__InterfixPrefixLexical__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixLexical__Group__0_in_ruleInterfixPrefixLexical1237);
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


    // $ANTLR start "entryRuleInterfixCompountWords"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:624:1: entryRuleInterfixCompountWords : ruleInterfixCompountWords EOF ;
    public final void entryRuleInterfixCompountWords() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:625:1: ( ruleInterfixCompountWords EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:626:1: ruleInterfixCompountWords EOF
            {
             before(grammarAccess.getInterfixCompountWordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixCompountWords_in_entryRuleInterfixCompountWords1264);
            ruleInterfixCompountWords();

            state._fsp--;

             after(grammarAccess.getInterfixCompountWordsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixCompountWords1271); 

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
    // $ANTLR end "entryRuleInterfixCompountWords"


    // $ANTLR start "ruleInterfixCompountWords"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:633:1: ruleInterfixCompountWords : ( ( rule__InterfixCompountWords__Group__0 ) ) ;
    public final void ruleInterfixCompountWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:637:2: ( ( ( rule__InterfixCompountWords__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:638:1: ( ( rule__InterfixCompountWords__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:638:1: ( ( rule__InterfixCompountWords__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:639:1: ( rule__InterfixCompountWords__Group__0 )
            {
             before(grammarAccess.getInterfixCompountWordsAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:640:1: ( rule__InterfixCompountWords__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:640:2: rule__InterfixCompountWords__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixCompountWords__Group__0_in_ruleInterfixCompountWords1297);
            rule__InterfixCompountWords__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfixCompountWordsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfixCompountWords"


    // $ANTLR start "entryRuleInterfixConnectionSyllabicGroup"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:652:1: entryRuleInterfixConnectionSyllabicGroup : ruleInterfixConnectionSyllabicGroup EOF ;
    public final void entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:653:1: ( ruleInterfixConnectionSyllabicGroup EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:654:1: ruleInterfixConnectionSyllabicGroup EOF
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup1324);
            ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             after(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup1331); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:661:1: ruleInterfixConnectionSyllabicGroup : ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) ;
    public final void ruleInterfixConnectionSyllabicGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:665:2: ( ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:666:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:666:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:667:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:668:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:668:2: rule__InterfixConnectionSyllabicGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0_in_ruleInterfixConnectionSyllabicGroup1357);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:680:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:681:1: ( ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:682:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_entryRuleBrackets1384);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrackets1391); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:689:1: ruleBrackets : ( ( rule__Brackets__Alternatives ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:693:2: ( ( ( rule__Brackets__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:694:1: ( ( rule__Brackets__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:694:1: ( ( rule__Brackets__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:695:1: ( rule__Brackets__Alternatives )
            {
             before(grammarAccess.getBracketsAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:696:1: ( rule__Brackets__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:696:2: rule__Brackets__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets1417);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:708:1: entryRuleExpanded : ruleExpanded EOF ;
    public final void entryRuleExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:709:1: ( ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:710:1: ruleExpanded EOF
            {
             before(grammarAccess.getExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_entryRuleExpanded1444);
            ruleExpanded();

            state._fsp--;

             after(grammarAccess.getExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpanded1451); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:717:1: ruleExpanded : ( ( rule__Expanded__Group__0 ) ) ;
    public final void ruleExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:721:2: ( ( ( rule__Expanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:722:1: ( ( rule__Expanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:722:1: ( ( rule__Expanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:723:1: ( rule__Expanded__Group__0 )
            {
             before(grammarAccess.getExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:724:1: ( rule__Expanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:724:2: rule__Expanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__0_in_ruleExpanded1477);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:736:1: entryRuleNoExpanded : ruleNoExpanded EOF ;
    public final void entryRuleNoExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:737:1: ( ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:738:1: ruleNoExpanded EOF
            {
             before(grammarAccess.getNoExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded1504);
            ruleNoExpanded();

            state._fsp--;

             after(grammarAccess.getNoExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpanded1511); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:745:1: ruleNoExpanded : ( ( rule__NoExpanded__Alternatives ) ) ;
    public final void ruleNoExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:749:2: ( ( ( rule__NoExpanded__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:750:1: ( ( rule__NoExpanded__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:750:1: ( ( rule__NoExpanded__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:751:1: ( rule__NoExpanded__Alternatives )
            {
             before(grammarAccess.getNoExpandedAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:752:1: ( rule__NoExpanded__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:752:2: rule__NoExpanded__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoExpanded__Alternatives_in_ruleNoExpanded1537);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:764:1: entryRuleEmendation : ruleEmendation EOF ;
    public final void entryRuleEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:765:1: ( ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:766:1: ruleEmendation EOF
            {
             before(grammarAccess.getEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_entryRuleEmendation1564);
            ruleEmendation();

            state._fsp--;

             after(grammarAccess.getEmendationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmendation1571); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:773:1: ruleEmendation : ( ( rule__Emendation__Group__0 ) ) ;
    public final void ruleEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:777:2: ( ( ( rule__Emendation__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:778:1: ( ( rule__Emendation__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:778:1: ( ( rule__Emendation__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:779:1: ( rule__Emendation__Group__0 )
            {
             before(grammarAccess.getEmendationAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:780:1: ( rule__Emendation__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:780:2: rule__Emendation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__0_in_ruleEmendation1597);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:792:1: entryRuleNoEmendation : ruleNoEmendation EOF ;
    public final void entryRuleNoEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:793:1: ( ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:794:1: ruleNoEmendation EOF
            {
             before(grammarAccess.getNoEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation1624);
            ruleNoEmendation();

            state._fsp--;

             after(grammarAccess.getNoEmendationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoEmendation1631); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:801:1: ruleNoEmendation : ( ( rule__NoEmendation__Alternatives ) ) ;
    public final void ruleNoEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:805:2: ( ( ( rule__NoEmendation__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:806:1: ( ( rule__NoEmendation__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:806:1: ( ( rule__NoEmendation__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:807:1: ( rule__NoEmendation__Alternatives )
            {
             before(grammarAccess.getNoEmendationAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:808:1: ( rule__NoEmendation__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:808:2: rule__NoEmendation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation1657);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:820:1: entryRuleDisputableReading : ruleDisputableReading EOF ;
    public final void entryRuleDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:821:1: ( ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:822:1: ruleDisputableReading EOF
            {
             before(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading1684);
            ruleDisputableReading();

            state._fsp--;

             after(grammarAccess.getDisputableReadingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisputableReading1691); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:829:1: ruleDisputableReading : ( ( rule__DisputableReading__Group__0 ) ) ;
    public final void ruleDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:833:2: ( ( ( rule__DisputableReading__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:834:1: ( ( rule__DisputableReading__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:834:1: ( ( rule__DisputableReading__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:835:1: ( rule__DisputableReading__Group__0 )
            {
             before(grammarAccess.getDisputableReadingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:836:1: ( rule__DisputableReading__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:836:2: rule__DisputableReading__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading1717);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:848:1: entryRuleNoDisputableReading : ruleNoDisputableReading EOF ;
    public final void entryRuleNoDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:849:1: ( ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:850:1: ruleNoDisputableReading EOF
            {
             before(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading1744);
            ruleNoDisputableReading();

            state._fsp--;

             after(grammarAccess.getNoDisputableReadingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDisputableReading1751); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:857:1: ruleNoDisputableReading : ( ( rule__NoDisputableReading__Alternatives ) ) ;
    public final void ruleNoDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:861:2: ( ( ( rule__NoDisputableReading__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:862:1: ( ( rule__NoDisputableReading__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:862:1: ( ( rule__NoDisputableReading__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:863:1: ( rule__NoDisputableReading__Alternatives )
            {
             before(grammarAccess.getNoDisputableReadingAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:864:1: ( rule__NoDisputableReading__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:864:2: rule__NoDisputableReading__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading1777);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:876:1: entryRuleLacuna : ruleLacuna EOF ;
    public final void entryRuleLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:877:1: ( ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:878:1: ruleLacuna EOF
            {
             before(grammarAccess.getLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_entryRuleLacuna1804);
            ruleLacuna();

            state._fsp--;

             after(grammarAccess.getLacunaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLacuna1811); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:885:1: ruleLacuna : ( ( rule__Lacuna__Group__0 ) ) ;
    public final void ruleLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:889:2: ( ( ( rule__Lacuna__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:890:1: ( ( rule__Lacuna__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:890:1: ( ( rule__Lacuna__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:891:1: ( rule__Lacuna__Group__0 )
            {
             before(grammarAccess.getLacunaAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:892:1: ( rule__Lacuna__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:892:2: rule__Lacuna__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna1837);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:904:1: entryRuleNoLacuna : ruleNoLacuna EOF ;
    public final void entryRuleNoLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:905:1: ( ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:906:1: ruleNoLacuna EOF
            {
             before(grammarAccess.getNoLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna1864);
            ruleNoLacuna();

            state._fsp--;

             after(grammarAccess.getNoLacunaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoLacuna1871); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:913:1: ruleNoLacuna : ( ( rule__NoLacuna__Alternatives ) ) ;
    public final void ruleNoLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:917:2: ( ( ( rule__NoLacuna__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:918:1: ( ( rule__NoLacuna__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:918:1: ( ( rule__NoLacuna__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:919:1: ( rule__NoLacuna__Alternatives )
            {
             before(grammarAccess.getNoLacunaAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:920:1: ( rule__NoLacuna__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:920:2: rule__NoLacuna__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna1897);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:932:1: entryRuleDeletion : ruleDeletion EOF ;
    public final void entryRuleDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:933:1: ( ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:934:1: ruleDeletion EOF
            {
             before(grammarAccess.getDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_entryRuleDeletion1924);
            ruleDeletion();

            state._fsp--;

             after(grammarAccess.getDeletionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeletion1931); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:941:1: ruleDeletion : ( ( rule__Deletion__Group__0 ) ) ;
    public final void ruleDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:945:2: ( ( ( rule__Deletion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:946:1: ( ( rule__Deletion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:946:1: ( ( rule__Deletion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:947:1: ( rule__Deletion__Group__0 )
            {
             before(grammarAccess.getDeletionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:948:1: ( rule__Deletion__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:948:2: rule__Deletion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__0_in_ruleDeletion1957);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:960:1: entryRuleNoDeletion : ruleNoDeletion EOF ;
    public final void entryRuleNoDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:961:1: ( ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:962:1: ruleNoDeletion EOF
            {
             before(grammarAccess.getNoDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion1984);
            ruleNoDeletion();

            state._fsp--;

             after(grammarAccess.getNoDeletionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDeletion1991); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:969:1: ruleNoDeletion : ( ( rule__NoDeletion__Alternatives ) ) ;
    public final void ruleNoDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:973:2: ( ( ( rule__NoDeletion__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:974:1: ( ( rule__NoDeletion__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:974:1: ( ( rule__NoDeletion__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:975:1: ( rule__NoDeletion__Alternatives )
            {
             before(grammarAccess.getNoDeletionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:976:1: ( rule__NoDeletion__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:976:2: rule__NoDeletion__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion2017);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:988:1: entryRuleExpandedColumn : ruleExpandedColumn EOF ;
    public final void entryRuleExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:989:1: ( ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:990:1: ruleExpandedColumn EOF
            {
             before(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn2044);
            ruleExpandedColumn();

            state._fsp--;

             after(grammarAccess.getExpandedColumnRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpandedColumn2051); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:997:1: ruleExpandedColumn : ( ( rule__ExpandedColumn__Group__0 ) ) ;
    public final void ruleExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1001:2: ( ( ( rule__ExpandedColumn__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1002:1: ( ( rule__ExpandedColumn__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1002:1: ( ( rule__ExpandedColumn__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1003:1: ( rule__ExpandedColumn__Group__0 )
            {
             before(grammarAccess.getExpandedColumnAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1004:1: ( rule__ExpandedColumn__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1004:2: rule__ExpandedColumn__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn2077);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1016:1: entryRuleNoExpandedColumn : ruleNoExpandedColumn EOF ;
    public final void entryRuleNoExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1017:1: ( ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1018:1: ruleNoExpandedColumn EOF
            {
             before(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn2104);
            ruleNoExpandedColumn();

            state._fsp--;

             after(grammarAccess.getNoExpandedColumnRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpandedColumn2111); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1025:1: ruleNoExpandedColumn : ( ( rule__NoExpandedColumn__Alternatives ) ) ;
    public final void ruleNoExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1029:2: ( ( ( rule__NoExpandedColumn__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1030:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1030:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1031:1: ( rule__NoExpandedColumn__Alternatives )
            {
             before(grammarAccess.getNoExpandedColumnAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1032:1: ( rule__NoExpandedColumn__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1032:2: rule__NoExpandedColumn__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn2137);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1044:1: entryRuleRasur : ruleRasur EOF ;
    public final void entryRuleRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1045:1: ( ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1046:1: ruleRasur EOF
            {
             before(grammarAccess.getRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRasur_in_entryRuleRasur2164);
            ruleRasur();

            state._fsp--;

             after(grammarAccess.getRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRasur2171); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1053:1: ruleRasur : ( ( rule__Rasur__Group__0 ) ) ;
    public final void ruleRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1057:2: ( ( ( rule__Rasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1058:1: ( ( rule__Rasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1058:1: ( ( rule__Rasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1059:1: ( rule__Rasur__Group__0 )
            {
             before(grammarAccess.getRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1060:1: ( rule__Rasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1060:2: rule__Rasur__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__0_in_ruleRasur2197);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1072:1: entryRuleNoRasur : ruleNoRasur EOF ;
    public final void entryRuleNoRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1073:1: ( ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1074:1: ruleNoRasur EOF
            {
             before(grammarAccess.getNoRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_entryRuleNoRasur2224);
            ruleNoRasur();

            state._fsp--;

             after(grammarAccess.getNoRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRasur2231); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1081:1: ruleNoRasur : ( ( rule__NoRasur__Alternatives ) ) ;
    public final void ruleNoRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1085:2: ( ( ( rule__NoRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1086:1: ( ( rule__NoRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1086:1: ( ( rule__NoRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1087:1: ( rule__NoRasur__Alternatives )
            {
             before(grammarAccess.getNoRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1088:1: ( rule__NoRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1088:2: rule__NoRasur__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur2257);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1100:1: entryRuleAncientExpanded : ruleAncientExpanded EOF ;
    public final void entryRuleAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1101:1: ( ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1102:1: ruleAncientExpanded EOF
            {
             before(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded2284);
            ruleAncientExpanded();

            state._fsp--;

             after(grammarAccess.getAncientExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAncientExpanded2291); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1109:1: ruleAncientExpanded : ( ( rule__AncientExpanded__Group__0 ) ) ;
    public final void ruleAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1113:2: ( ( ( rule__AncientExpanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1114:1: ( ( rule__AncientExpanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1114:1: ( ( rule__AncientExpanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1115:1: ( rule__AncientExpanded__Group__0 )
            {
             before(grammarAccess.getAncientExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1116:1: ( rule__AncientExpanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1116:2: rule__AncientExpanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2317);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1128:1: entryRuleNoAncientExpanded : ruleNoAncientExpanded EOF ;
    public final void entryRuleNoAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1129:1: ( ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1130:1: ruleNoAncientExpanded EOF
            {
             before(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2344);
            ruleNoAncientExpanded();

            state._fsp--;

             after(grammarAccess.getNoAncientExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAncientExpanded2351); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1137:1: ruleNoAncientExpanded : ( ruleChars ) ;
    public final void ruleNoAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1141:2: ( ( ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1142:1: ( ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1142:1: ( ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1143:1: ruleChars
            {
             before(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoAncientExpanded2377);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1156:1: entryRuleRestorationOverRasur : ruleRestorationOverRasur EOF ;
    public final void entryRuleRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1157:1: ( ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1158:1: ruleRestorationOverRasur EOF
            {
             before(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur2403);
            ruleRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestorationOverRasur2410); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1165:1: ruleRestorationOverRasur : ( ( rule__RestorationOverRasur__Group__0 ) ) ;
    public final void ruleRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1169:2: ( ( ( rule__RestorationOverRasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1170:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1170:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1171:1: ( rule__RestorationOverRasur__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1172:1: ( rule__RestorationOverRasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1172:2: rule__RestorationOverRasur__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur2436);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1184:1: entryRuleNoRestorationOverRasur : ruleNoRestorationOverRasur EOF ;
    public final void entryRuleNoRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1185:1: ( ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1186:1: ruleNoRestorationOverRasur EOF
            {
             before(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur2463);
            ruleNoRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getNoRestorationOverRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRestorationOverRasur2470); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1193:1: ruleNoRestorationOverRasur : ( ruleChars ) ;
    public final void ruleNoRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1197:2: ( ( ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1198:1: ( ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1198:1: ( ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1199:1: ruleChars
            {
             before(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoRestorationOverRasur2496);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1212:1: entryRulePartialDestruction : rulePartialDestruction EOF ;
    public final void entryRulePartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1213:1: ( rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1214:1: rulePartialDestruction EOF
            {
             before(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction2522);
            rulePartialDestruction();

            state._fsp--;

             after(grammarAccess.getPartialDestructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartialDestruction2529); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1221:1: rulePartialDestruction : ( ( rule__PartialDestruction__Group__0 ) ) ;
    public final void rulePartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1225:2: ( ( ( rule__PartialDestruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1226:1: ( ( rule__PartialDestruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1226:1: ( ( rule__PartialDestruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1227:1: ( rule__PartialDestruction__Group__0 )
            {
             before(grammarAccess.getPartialDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1228:1: ( rule__PartialDestruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1228:2: rule__PartialDestruction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction2555);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1240:1: entryRuleNoPartialDestruction : ruleNoPartialDestruction EOF ;
    public final void entryRuleNoPartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1241:1: ( ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1242:1: ruleNoPartialDestruction EOF
            {
             before(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction2582);
            ruleNoPartialDestruction();

            state._fsp--;

             after(grammarAccess.getNoPartialDestructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoPartialDestruction2589); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1249:1: ruleNoPartialDestruction : ( ruleChars ) ;
    public final void ruleNoPartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1253:2: ( ( ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1254:1: ( ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1254:1: ( ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1255:1: ruleChars
            {
             before(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoPartialDestruction2615);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1268:1: entryRuleDestruction : ruleDestruction EOF ;
    public final void entryRuleDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1269:1: ( ruleDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1270:1: ruleDestruction EOF
            {
             before(grammarAccess.getDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_entryRuleDestruction2641);
            ruleDestruction();

            state._fsp--;

             after(grammarAccess.getDestructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDestruction2648); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1277:1: ruleDestruction : ( ( rule__Destruction__Group__0 ) ) ;
    public final void ruleDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1281:2: ( ( ( rule__Destruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1282:1: ( ( rule__Destruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1282:1: ( ( rule__Destruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1283:1: ( rule__Destruction__Group__0 )
            {
             before(grammarAccess.getDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1284:1: ( rule__Destruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1284:2: rule__Destruction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__0_in_ruleDestruction2674);
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


    // $ANTLR start "rule__SentenceItem__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1296:1: rule__SentenceItem__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) );
    public final void rule__SentenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1300:1: ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_EGYSTRING:
            case 14:
            case 15:
            case 17:
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
                alt1=1;
                }
                break;
            case 16:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==18) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||(LA1_2>=14 && LA1_2<=17)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 12:
            case 13:
            case 20:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1301:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1301:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1302:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives2710);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1307:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1307:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1308:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives2727);
                    ruleAbstractMarker();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1313:6: ( ruleAmbivalence )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1313:6: ( ruleAmbivalence )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1314:1: ruleAmbivalence
                    {
                     before(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives2744);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1324:1: rule__AbstractMarker__Alternatives : ( ( ruleMarker ) | ( ruleVersMarker ) );
    public final void rule__AbstractMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1328:1: ( ( ruleMarker ) | ( ruleVersMarker ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1329:1: ( ruleMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1329:1: ( ruleMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1330:1: ruleMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives2776);
                    ruleMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1335:6: ( ruleVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1335:6: ( ruleVersMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1336:1: ruleVersMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives2793);
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


    // $ANTLR start "rule__VersMarker__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1346:1: rule__VersMarker__Alternatives : ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) );
    public final void rule__VersMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1350:1: ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1351:1: ( ruleVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1351:1: ( ruleVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1352:1: ruleVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives2825);
                    ruleVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1357:6: ( ruleVersFrontierMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1357:6: ( ruleVersFrontierMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1358:1: ruleVersFrontierMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives2842);
                    ruleVersFrontierMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1368:1: rule__WordMiddle__Alternatives : ( ( ruleInterfix ) | ( ruleBrackets ) | ( ruleChars ) );
    public final void rule__WordMiddle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1372:1: ( ( ruleInterfix ) | ( ruleBrackets ) | ( ruleChars ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt4=1;
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
                alt4=2;
                }
                break;
            case RULE_EGYSTRING:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1373:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1373:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1374:1: ruleInterfix
                    {
                     before(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__WordMiddle__Alternatives2874);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1379:6: ( ruleBrackets )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1379:6: ( ruleBrackets )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1380:1: ruleBrackets
                    {
                     before(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives2891);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1385:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1385:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1386:1: ruleChars
                    {
                     before(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives2908);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_2()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1396:1: rule__Interfix__Alternatives : ( ( ruleInterfixFlexion ) | ( ruleInterfixLexical ) | ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixCompountWords ) | ( ruleInterfixConnectionSyllabicGroup ) );
    public final void rule__Interfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1400:1: ( ( ruleInterfixFlexion ) | ( ruleInterfixLexical ) | ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixCompountWords ) | ( ruleInterfixConnectionSyllabicGroup ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            case 26:
                {
                alt5=6;
                }
                break;
            case 27:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1401:1: ( ruleInterfixFlexion )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1401:1: ( ruleInterfixFlexion )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1402:1: ruleInterfixFlexion
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixFlexion_in_rule__Interfix__Alternatives2940);
                    ruleInterfixFlexion();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1407:6: ( ruleInterfixLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1407:6: ( ruleInterfixLexical )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1408:1: ruleInterfixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixLexical_in_rule__Interfix__Alternatives2957);
                    ruleInterfixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1413:6: ( ruleInterfixSuffixPronomLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1413:6: ( ruleInterfixSuffixPronomLexical )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1414:1: ruleInterfixSuffixPronomLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixSuffixPronomLexical_in_rule__Interfix__Alternatives2974);
                    ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1419:6: ( ruleInterfixPrefixNonLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1419:6: ( ruleInterfixPrefixNonLexical )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1420:1: ruleInterfixPrefixNonLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixNonLexical_in_rule__Interfix__Alternatives2991);
                    ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1425:6: ( ruleInterfixPrefixLexical )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1425:6: ( ruleInterfixPrefixLexical )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1426:1: ruleInterfixPrefixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixPrefixLexical_in_rule__Interfix__Alternatives3008);
                    ruleInterfixPrefixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1431:6: ( ruleInterfixCompountWords )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1431:6: ( ruleInterfixCompountWords )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1432:1: ruleInterfixCompountWords
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixCompountWordsParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixCompountWords_in_rule__Interfix__Alternatives3025);
                    ruleInterfixCompountWords();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixCompountWordsParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1437:6: ( ruleInterfixConnectionSyllabicGroup )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1437:6: ( ruleInterfixConnectionSyllabicGroup )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1438:1: ruleInterfixConnectionSyllabicGroup
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfixConnectionSyllabicGroup_in_rule__Interfix__Alternatives3042);
                    ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_6()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1448:1: rule__Brackets__Alternatives : ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( ruleExpandedColumn ) | ( rulePartialDestruction ) | ( ruleDestruction ) );
    public final void rule__Brackets__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1452:1: ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( ruleExpandedColumn ) | ( rulePartialDestruction ) | ( ruleDestruction ) )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 32:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            case 35:
                {
                alt6=8;
                }
                break;
            case 37:
                {
                alt6=9;
                }
                break;
            case 45:
                {
                alt6=10;
                }
                break;
            case 47:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1453:1: ( ruleRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1453:1: ( ruleRasur )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1454:1: ruleRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRasur_in_rule__Brackets__Alternatives3074);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1459:6: ( ruleAncientExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1459:6: ( ruleAncientExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1460:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives3091);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1465:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1465:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1466:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives3108);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1471:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1471:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1472:1: ruleExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives3125);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1477:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1477:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1478:1: ruleDisputableReading
                    {
                     before(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives3142);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1483:6: ( ruleEmendation )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1483:6: ( ruleEmendation )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1484:1: ruleEmendation
                    {
                     before(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives3159);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1489:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1489:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1490:1: ruleLacuna
                    {
                     before(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives3176);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1495:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1495:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1496:1: ruleDeletion
                    {
                     before(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives3193);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1501:6: ( ruleExpandedColumn )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1501:6: ( ruleExpandedColumn )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1502:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives3210);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1507:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1507:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1508:1: rulePartialDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives3227);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1513:6: ( ruleDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1513:6: ( ruleDestruction )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1514:1: ruleDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_rule__Brackets__Alternatives3244);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1524:1: rule__NoExpanded__Alternatives : ( ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleChars ) );
    public final void rule__NoExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1528:1: ( ( ruleInterfix ) | ( ruleDisputableReading ) | ( ruleChars ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case RULE_EGYSTRING:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1529:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1529:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1530:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoExpanded__Alternatives3276);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1535:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1535:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1536:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_rule__NoExpanded__Alternatives3293);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1541:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1541:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1542:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoExpanded__Alternatives3310);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_2()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1552:1: rule__NoEmendation__Alternatives : ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleChars ) );
    public final void rule__NoEmendation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1556:1: ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleChars ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case RULE_EGYSTRING:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1557:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1557:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1558:1: ruleInterfix
                    {
                     before(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoEmendation__Alternatives3342);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1563:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1563:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1564:1: ruleExpanded
                    {
                     before(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives3359);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1569:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1569:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1570:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_rule__NoEmendation__Alternatives3376);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1575:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1575:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1576:1: ruleChars
                    {
                     before(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives3393);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_3()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1586:1: rule__NoDisputableReading__Alternatives : ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoDisputableReading__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1590:1: ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) )
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1591:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1591:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1592:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoDisputableReading__Alternatives3425);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1597:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1597:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1598:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives3442);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1603:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1603:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1604:1: ruleChars
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives3459);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1614:1: rule__NoLacuna__Alternatives : ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoLacuna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1618:1: ( ( ruleInterfix ) | ( ruleExpanded ) | ( ruleChars ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1619:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1619:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1620:1: ruleInterfix
                    {
                     before(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoLacuna__Alternatives3491);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1625:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1625:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1626:1: ruleExpanded
                    {
                     before(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives3508);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1631:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1631:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1632:1: ruleChars
                    {
                     before(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives3525);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1642:1: rule__NoDeletion__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) );
    public final void rule__NoDeletion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1646:1: ( ( ruleInterfix ) | ( ruleChars ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=21 && LA11_0<=27)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_EGYSTRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1647:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1647:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1648:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoDeletion__Alternatives3557);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1653:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1653:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1654:1: ruleChars
                    {
                     before(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives3574);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1664:1: rule__NoExpandedColumn__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) );
    public final void rule__NoExpandedColumn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1668:1: ( ( ruleInterfix ) | ( ruleChars ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=27)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_EGYSTRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1669:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1669:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1670:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoExpandedColumn__Alternatives3606);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1675:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1675:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1676:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives3623);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1686:1: rule__NoRasur__Alternatives : ( ( ruleInterfix ) | ( ruleChars ) );
    public final void rule__NoRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1690:1: ( ( ruleInterfix ) | ( ruleChars ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=21 && LA13_0<=27)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_EGYSTRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1691:1: ( ruleInterfix )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1691:1: ( ruleInterfix )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1692:1: ruleInterfix
                    {
                     before(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInterfix_in_rule__NoRasur__Alternatives3655);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1697:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1697:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1698:1: ruleChars
                    {
                     before(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoRasur__Alternatives3672);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_1()); 

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


    // $ANTLR start "rule__TextContent__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1710:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1714:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1715:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__03702);
            rule__TextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__03705);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1722:1: rule__TextContent__Group__0__Impl : ( () ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1726:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1727:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1727:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1728:1: ()
            {
             before(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1729:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1731:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1741:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1745:1: ( rule__TextContent__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1746:2: rule__TextContent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__13763);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1752:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__Group_1__0 ) ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1756:1: ( ( ( rule__TextContent__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1757:1: ( ( rule__TextContent__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1757:1: ( ( rule__TextContent__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1758:1: ( rule__TextContent__Group_1__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1759:1: ( rule__TextContent__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1759:2: rule__TextContent__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl3790);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1773:1: rule__TextContent__Group_1__0 : rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 ;
    public final void rule__TextContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1777:1: ( rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1778:2: rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__03824);
            rule__TextContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__03827);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1785:1: rule__TextContent__Group_1__0__Impl : ( ( rule__TextContent__ItemsAssignment_1_0 ) ) ;
    public final void rule__TextContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1789:1: ( ( ( rule__TextContent__ItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1790:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1790:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1791:1: ( rule__TextContent__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1792:1: ( rule__TextContent__ItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1792:2: rule__TextContent__ItemsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl3854);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1802:1: rule__TextContent__Group_1__1 : rule__TextContent__Group_1__1__Impl ;
    public final void rule__TextContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1806:1: ( rule__TextContent__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1807:2: rule__TextContent__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__13884);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1813:1: rule__TextContent__Group_1__1__Impl : ( ( rule__TextContent__ItemsAssignment_1_1 )* ) ;
    public final void rule__TextContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1817:1: ( ( ( rule__TextContent__ItemsAssignment_1_1 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1818:1: ( ( rule__TextContent__ItemsAssignment_1_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1818:1: ( ( rule__TextContent__ItemsAssignment_1_1 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1819:1: ( rule__TextContent__ItemsAssignment_1_1 )*
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1820:1: ( rule__TextContent__ItemsAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1820:2: rule__TextContent__ItemsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextContent__ItemsAssignment_1_1_in_rule__TextContent__Group_1__1__Impl3911);
            	    rule__TextContent__ItemsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTextContentAccess().getItemsAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sentence__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1834:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1838:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1839:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__03946);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__03949);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1846:1: rule__Sentence__Group__0__Impl : ( '\\u00C2\\u00A7' ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1850:1: ( ( '\\u00C2\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1851:1: ( '\\u00C2\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1851:1: ( '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1852:1: '\\u00C2\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Sentence__Group__0__Impl3977); 
             after(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_0()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1865:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl rule__Sentence__Group__2 ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1869:1: ( rule__Sentence__Group__1__Impl rule__Sentence__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1870:2: rule__Sentence__Group__1__Impl rule__Sentence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__14008);
            rule__Sentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__14011);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1877:1: rule__Sentence__Group__1__Impl : ( ( rule__Sentence__Group_1__0 ) ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1881:1: ( ( ( rule__Sentence__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1882:1: ( ( rule__Sentence__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1882:1: ( ( rule__Sentence__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1883:1: ( rule__Sentence__Group_1__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1884:1: ( rule__Sentence__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1884:2: rule__Sentence__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1__0_in_rule__Sentence__Group__1__Impl4038);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1894:1: rule__Sentence__Group__2 : rule__Sentence__Group__2__Impl ;
    public final void rule__Sentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1898:1: ( rule__Sentence__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1899:2: rule__Sentence__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__24068);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1905:1: rule__Sentence__Group__2__Impl : ( '\\u00C2\\u00A7' ) ;
    public final void rule__Sentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1909:1: ( ( '\\u00C2\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1910:1: ( '\\u00C2\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1910:1: ( '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1911:1: '\\u00C2\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Sentence__Group__2__Impl4096); 
             after(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1930:1: rule__Sentence__Group_1__0 : rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1 ;
    public final void rule__Sentence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1934:1: ( rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1935:2: rule__Sentence__Group_1__0__Impl rule__Sentence__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1__0__Impl_in_rule__Sentence__Group_1__04133);
            rule__Sentence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1__1_in_rule__Sentence__Group_1__04136);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1942:1: rule__Sentence__Group_1__0__Impl : ( ( rule__Sentence__ItemsAssignment_1_0 ) ) ;
    public final void rule__Sentence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1946:1: ( ( ( rule__Sentence__ItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1947:1: ( ( rule__Sentence__ItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1947:1: ( ( rule__Sentence__ItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1948:1: ( rule__Sentence__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1949:1: ( rule__Sentence__ItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1949:2: rule__Sentence__ItemsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__ItemsAssignment_1_0_in_rule__Sentence__Group_1__0__Impl4163);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1959:1: rule__Sentence__Group_1__1 : rule__Sentence__Group_1__1__Impl ;
    public final void rule__Sentence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1963:1: ( rule__Sentence__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1964:2: rule__Sentence__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1__1__Impl_in_rule__Sentence__Group_1__14193);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1970:1: rule__Sentence__Group_1__1__Impl : ( ( rule__Sentence__Group_1_1__0 )* ) ;
    public final void rule__Sentence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1974:1: ( ( ( rule__Sentence__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1975:1: ( ( rule__Sentence__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1975:1: ( ( rule__Sentence__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1976:1: ( rule__Sentence__Group_1_1__0 )*
            {
             before(grammarAccess.getSentenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1977:1: ( rule__Sentence__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1977:2: rule__Sentence__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1_1__0_in_rule__Sentence__Group_1__1__Impl4220);
            	    rule__Sentence__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1991:1: rule__Sentence__Group_1_1__0 : rule__Sentence__Group_1_1__0__Impl rule__Sentence__Group_1_1__1 ;
    public final void rule__Sentence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1995:1: ( rule__Sentence__Group_1_1__0__Impl rule__Sentence__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1996:2: rule__Sentence__Group_1_1__0__Impl rule__Sentence__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1_1__0__Impl_in_rule__Sentence__Group_1_1__04255);
            rule__Sentence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1_1__1_in_rule__Sentence__Group_1_1__04258);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2003:1: rule__Sentence__Group_1_1__0__Impl : ( ' ' ) ;
    public final void rule__Sentence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2007:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2008:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2008:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2009:1: ' '
            {
             before(grammarAccess.getSentenceAccess().getSpaceKeyword_1_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Sentence__Group_1_1__0__Impl4286); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2022:1: rule__Sentence__Group_1_1__1 : rule__Sentence__Group_1_1__1__Impl ;
    public final void rule__Sentence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2026:1: ( rule__Sentence__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2027:2: rule__Sentence__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_1_1__1__Impl_in_rule__Sentence__Group_1_1__14317);
            rule__Sentence__Group_1_1__1__Impl();

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2033:1: rule__Sentence__Group_1_1__1__Impl : ( ( rule__Sentence__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__Sentence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2037:1: ( ( ( rule__Sentence__ItemsAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2038:1: ( ( rule__Sentence__ItemsAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2038:1: ( ( rule__Sentence__ItemsAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2039:1: ( rule__Sentence__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2040:1: ( rule__Sentence__ItemsAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2040:2: rule__Sentence__ItemsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__ItemsAssignment_1_1_1_in_rule__Sentence__Group_1_1__1__Impl4344);
            rule__Sentence__ItemsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getItemsAssignment_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ambivalence__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2054:1: rule__Ambivalence__Group__0 : rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 ;
    public final void rule__Ambivalence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2058:1: ( rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2059:2: rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__04378);
            rule__Ambivalence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__04381);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2066:1: rule__Ambivalence__Group__0__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2070:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2071:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2071:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2072:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Ambivalence__Group__0__Impl4409); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2085:1: rule__Ambivalence__Group__1 : rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 ;
    public final void rule__Ambivalence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2089:1: ( rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2090:2: rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__14440);
            rule__Ambivalence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__14443);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2097:1: rule__Ambivalence__Group__1__Impl : ( ( rule__Ambivalence__Group_1__0 ) ) ;
    public final void rule__Ambivalence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2101:1: ( ( ( rule__Ambivalence__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2102:1: ( ( rule__Ambivalence__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2102:1: ( ( rule__Ambivalence__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2103:1: ( rule__Ambivalence__Group_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2104:1: ( rule__Ambivalence__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2104:2: rule__Ambivalence__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl4470);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2114:1: rule__Ambivalence__Group__2 : rule__Ambivalence__Group__2__Impl ;
    public final void rule__Ambivalence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2118:1: ( rule__Ambivalence__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2119:2: rule__Ambivalence__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__24500);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2125:1: rule__Ambivalence__Group__2__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2129:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2130:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2130:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2131:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Ambivalence__Group__2__Impl4528); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2150:1: rule__Ambivalence__Group_1__0 : rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 ;
    public final void rule__Ambivalence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2154:1: ( rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2155:2: rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__04565);
            rule__Ambivalence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__04568);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2162:1: rule__Ambivalence__Group_1__0__Impl : ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) ;
    public final void rule__Ambivalence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2166:1: ( ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2167:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2167:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2168:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2169:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2169:2: rule__Ambivalence__CasesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl4595);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2179:1: rule__Ambivalence__Group_1__1 : rule__Ambivalence__Group_1__1__Impl ;
    public final void rule__Ambivalence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2183:1: ( rule__Ambivalence__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2184:2: rule__Ambivalence__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__14625);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2190:1: rule__Ambivalence__Group_1__1__Impl : ( ( rule__Ambivalence__Group_1_1__0 )* ) ;
    public final void rule__Ambivalence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2194:1: ( ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2195:1: ( ( rule__Ambivalence__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2195:1: ( ( rule__Ambivalence__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2196:1: ( rule__Ambivalence__Group_1_1__0 )*
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2197:1: ( rule__Ambivalence__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2197:2: rule__Ambivalence__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl4652);
            	    rule__Ambivalence__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2211:1: rule__Ambivalence__Group_1_1__0 : rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 ;
    public final void rule__Ambivalence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2215:1: ( rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2216:2: rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__04687);
            rule__Ambivalence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__04690);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2223:1: rule__Ambivalence__Group_1_1__0__Impl : ( '; ' ) ;
    public final void rule__Ambivalence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2227:1: ( ( '; ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2228:1: ( '; ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2228:1: ( '; ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2229:1: '; '
            {
             before(grammarAccess.getAmbivalenceAccess().getSemicolonSpaceKeyword_1_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Ambivalence__Group_1_1__0__Impl4718); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2242:1: rule__Ambivalence__Group_1_1__1 : rule__Ambivalence__Group_1_1__1__Impl ;
    public final void rule__Ambivalence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2246:1: ( rule__Ambivalence__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2247:2: rule__Ambivalence__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__14749);
            rule__Ambivalence__Group_1_1__1__Impl();

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2253:1: rule__Ambivalence__Group_1_1__1__Impl : ( ( rule__Ambivalence__CasesAssignment_1_1_1 ) ) ;
    public final void rule__Ambivalence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2257:1: ( ( ( rule__Ambivalence__CasesAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2258:1: ( ( rule__Ambivalence__CasesAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2258:1: ( ( rule__Ambivalence__CasesAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2259:1: ( rule__Ambivalence__CasesAssignment_1_1_1 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2260:1: ( rule__Ambivalence__CasesAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2260:2: rule__Ambivalence__CasesAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__CasesAssignment_1_1_1_in_rule__Ambivalence__Group_1_1__1__Impl4776);
            rule__Ambivalence__CasesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Case__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2274:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2278:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2279:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__04810);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__1_in_rule__Case__Group__04813);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2286:1: rule__Case__Group__0__Impl : ( 'case ' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2290:1: ( ( 'case ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2291:1: ( 'case ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2291:1: ( 'case ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2292:1: 'case '
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Case__Group__0__Impl4841); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2305:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2309:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2310:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__14872);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__2_in_rule__Case__Group__14875);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2317:1: rule__Case__Group__1__Impl : ( ( rule__Case__NameAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2321:1: ( ( ( rule__Case__NameAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2322:1: ( ( rule__Case__NameAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2322:1: ( ( rule__Case__NameAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2323:1: ( rule__Case__NameAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2324:1: ( rule__Case__NameAssignment_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2324:2: rule__Case__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__NameAssignment_1_in_rule__Case__Group__1__Impl4902);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2334:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2338:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2339:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__24932);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__3_in_rule__Case__Group__24935);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2346:1: rule__Case__Group__2__Impl : ( ': ' ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2350:1: ( ( ': ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2351:1: ( ': ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2351:1: ( ': ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2352:1: ': '
            {
             before(grammarAccess.getCaseAccess().getColonSpaceKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Case__Group__2__Impl4963); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2365:1: rule__Case__Group__3 : rule__Case__Group__3__Impl ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2369:1: ( rule__Case__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2370:2: rule__Case__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__34994);
            rule__Case__Group__3__Impl();

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2376:1: rule__Case__Group__3__Impl : ( ( rule__Case__Group_3__0 ) ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2380:1: ( ( ( rule__Case__Group_3__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2381:1: ( ( rule__Case__Group_3__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2381:1: ( ( rule__Case__Group_3__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2382:1: ( rule__Case__Group_3__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_3()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2383:1: ( rule__Case__Group_3__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2383:2: rule__Case__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3__0_in_rule__Case__Group__3__Impl5021);
            rule__Case__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Case__Group_3__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2401:1: rule__Case__Group_3__0 : rule__Case__Group_3__0__Impl rule__Case__Group_3__1 ;
    public final void rule__Case__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2405:1: ( rule__Case__Group_3__0__Impl rule__Case__Group_3__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2406:2: rule__Case__Group_3__0__Impl rule__Case__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3__0__Impl_in_rule__Case__Group_3__05059);
            rule__Case__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3__1_in_rule__Case__Group_3__05062);
            rule__Case__Group_3__1();

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
    // $ANTLR end "rule__Case__Group_3__0"


    // $ANTLR start "rule__Case__Group_3__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2413:1: rule__Case__Group_3__0__Impl : ( ( rule__Case__ItemsAssignment_3_0 ) ) ;
    public final void rule__Case__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2417:1: ( ( ( rule__Case__ItemsAssignment_3_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2418:1: ( ( rule__Case__ItemsAssignment_3_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2418:1: ( ( rule__Case__ItemsAssignment_3_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2419:1: ( rule__Case__ItemsAssignment_3_0 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_3_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2420:1: ( rule__Case__ItemsAssignment_3_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2420:2: rule__Case__ItemsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__ItemsAssignment_3_0_in_rule__Case__Group_3__0__Impl5089);
            rule__Case__ItemsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getItemsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_3__0__Impl"


    // $ANTLR start "rule__Case__Group_3__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2430:1: rule__Case__Group_3__1 : rule__Case__Group_3__1__Impl ;
    public final void rule__Case__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2434:1: ( rule__Case__Group_3__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2435:2: rule__Case__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3__1__Impl_in_rule__Case__Group_3__15119);
            rule__Case__Group_3__1__Impl();

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
    // $ANTLR end "rule__Case__Group_3__1"


    // $ANTLR start "rule__Case__Group_3__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2441:1: rule__Case__Group_3__1__Impl : ( ( rule__Case__Group_3_1__0 )* ) ;
    public final void rule__Case__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2445:1: ( ( ( rule__Case__Group_3_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2446:1: ( ( rule__Case__Group_3_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2446:1: ( ( rule__Case__Group_3_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2447:1: ( rule__Case__Group_3_1__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_3_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2448:1: ( rule__Case__Group_3_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2448:2: rule__Case__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3_1__0_in_rule__Case__Group_3__1__Impl5146);
            	    rule__Case__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_3__1__Impl"


    // $ANTLR start "rule__Case__Group_3_1__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2462:1: rule__Case__Group_3_1__0 : rule__Case__Group_3_1__0__Impl rule__Case__Group_3_1__1 ;
    public final void rule__Case__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2466:1: ( rule__Case__Group_3_1__0__Impl rule__Case__Group_3_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2467:2: rule__Case__Group_3_1__0__Impl rule__Case__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3_1__0__Impl_in_rule__Case__Group_3_1__05181);
            rule__Case__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3_1__1_in_rule__Case__Group_3_1__05184);
            rule__Case__Group_3_1__1();

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
    // $ANTLR end "rule__Case__Group_3_1__0"


    // $ANTLR start "rule__Case__Group_3_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2474:1: rule__Case__Group_3_1__0__Impl : ( ' ' ) ;
    public final void rule__Case__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2478:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2479:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2479:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2480:1: ' '
            {
             before(grammarAccess.getCaseAccess().getSpaceKeyword_3_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Case__Group_3_1__0__Impl5212); 
             after(grammarAccess.getCaseAccess().getSpaceKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_3_1__0__Impl"


    // $ANTLR start "rule__Case__Group_3_1__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2493:1: rule__Case__Group_3_1__1 : rule__Case__Group_3_1__1__Impl ;
    public final void rule__Case__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2497:1: ( rule__Case__Group_3_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2498:2: rule__Case__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_3_1__1__Impl_in_rule__Case__Group_3_1__15243);
            rule__Case__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Case__Group_3_1__1"


    // $ANTLR start "rule__Case__Group_3_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2504:1: rule__Case__Group_3_1__1__Impl : ( ( rule__Case__ItemsAssignment_3_1_1 ) ) ;
    public final void rule__Case__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2508:1: ( ( ( rule__Case__ItemsAssignment_3_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2509:1: ( ( rule__Case__ItemsAssignment_3_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2509:1: ( ( rule__Case__ItemsAssignment_3_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2510:1: ( rule__Case__ItemsAssignment_3_1_1 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_3_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2511:1: ( rule__Case__ItemsAssignment_3_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2511:2: rule__Case__ItemsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__ItemsAssignment_3_1_1_in_rule__Case__Group_3_1__1__Impl5270);
            rule__Case__ItemsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getItemsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group_3_1__1__Impl"


    // $ANTLR start "rule__Marker__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2525:1: rule__Marker__Group__0 : rule__Marker__Group__0__Impl rule__Marker__Group__1 ;
    public final void rule__Marker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2529:1: ( rule__Marker__Group__0__Impl rule__Marker__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2530:2: rule__Marker__Group__0__Impl rule__Marker__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__0__Impl_in_rule__Marker__Group__05304);
            rule__Marker__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__1_in_rule__Marker__Group__05307);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2537:1: rule__Marker__Group__0__Impl : ( '#' ) ;
    public final void rule__Marker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2541:1: ( ( '#' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2542:1: ( '#' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2542:1: ( '#' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2543:1: '#'
            {
             before(grammarAccess.getMarkerAccess().getNumberSignKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Marker__Group__0__Impl5335); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2556:1: rule__Marker__Group__1 : rule__Marker__Group__1__Impl rule__Marker__Group__2 ;
    public final void rule__Marker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2560:1: ( rule__Marker__Group__1__Impl rule__Marker__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2561:2: rule__Marker__Group__1__Impl rule__Marker__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__1__Impl_in_rule__Marker__Group__15366);
            rule__Marker__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__2_in_rule__Marker__Group__15369);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2568:1: rule__Marker__Group__1__Impl : ( ( rule__Marker__TypeAssignment_1 ) ) ;
    public final void rule__Marker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2572:1: ( ( ( rule__Marker__TypeAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2573:1: ( ( rule__Marker__TypeAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2573:1: ( ( rule__Marker__TypeAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2574:1: ( rule__Marker__TypeAssignment_1 )
            {
             before(grammarAccess.getMarkerAccess().getTypeAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2575:1: ( rule__Marker__TypeAssignment_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2575:2: rule__Marker__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__TypeAssignment_1_in_rule__Marker__Group__1__Impl5396);
            rule__Marker__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2585:1: rule__Marker__Group__2 : rule__Marker__Group__2__Impl rule__Marker__Group__3 ;
    public final void rule__Marker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2589:1: ( rule__Marker__Group__2__Impl rule__Marker__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2590:2: rule__Marker__Group__2__Impl rule__Marker__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__2__Impl_in_rule__Marker__Group__25426);
            rule__Marker__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__3_in_rule__Marker__Group__25429);
            rule__Marker__Group__3();

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2597:1: rule__Marker__Group__2__Impl : ( ( rule__Marker__NameAssignment_2 ) ) ;
    public final void rule__Marker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2601:1: ( ( ( rule__Marker__NameAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2602:1: ( ( rule__Marker__NameAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2602:1: ( ( rule__Marker__NameAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2603:1: ( rule__Marker__NameAssignment_2 )
            {
             before(grammarAccess.getMarkerAccess().getNameAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2604:1: ( rule__Marker__NameAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2604:2: rule__Marker__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__NameAssignment_2_in_rule__Marker__Group__2__Impl5456);
            rule__Marker__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Marker__Group__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2614:1: rule__Marker__Group__3 : rule__Marker__Group__3__Impl ;
    public final void rule__Marker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2618:1: ( rule__Marker__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2619:2: rule__Marker__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__Group__3__Impl_in_rule__Marker__Group__35486);
            rule__Marker__Group__3__Impl();

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
    // $ANTLR end "rule__Marker__Group__3"


    // $ANTLR start "rule__Marker__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2625:1: rule__Marker__Group__3__Impl : ( '#' ) ;
    public final void rule__Marker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2629:1: ( ( '#' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2630:1: ( '#' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2630:1: ( '#' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2631:1: '#'
            {
             before(grammarAccess.getMarkerAccess().getNumberSignKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Marker__Group__3__Impl5514); 
             after(grammarAccess.getMarkerAccess().getNumberSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__Group__3__Impl"


    // $ANTLR start "rule__Word__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2652:1: rule__Word__Group__0 : rule__Word__Group__0__Impl rule__Word__Group__1 ;
    public final void rule__Word__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2656:1: ( rule__Word__Group__0__Impl rule__Word__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2657:2: rule__Word__Group__0__Impl rule__Word__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__05553);
            rule__Word__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__1_in_rule__Word__Group__05556);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2664:1: rule__Word__Group__0__Impl : ( () ) ;
    public final void rule__Word__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2668:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2669:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2669:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2670:1: ()
            {
             before(grammarAccess.getWordAccess().getWordAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2671:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2673:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2683:1: rule__Word__Group__1 : rule__Word__Group__1__Impl ;
    public final void rule__Word__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2687:1: ( rule__Word__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2688:2: rule__Word__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__15614);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2694:1: rule__Word__Group__1__Impl : ( ( rule__Word__WCharAssignment_1 )* ) ;
    public final void rule__Word__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2698:1: ( ( ( rule__Word__WCharAssignment_1 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2699:1: ( ( rule__Word__WCharAssignment_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2699:1: ( ( rule__Word__WCharAssignment_1 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2700:1: ( rule__Word__WCharAssignment_1 )*
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2701:1: ( rule__Word__WCharAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_EGYSTRING||(LA18_0>=21 && LA18_0<=28)||LA18_0==30||(LA18_0>=32 && LA18_0<=33)||LA18_0==35||LA18_0==37||LA18_0==39||LA18_0==41||LA18_0==43||LA18_0==45||LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2701:2: rule__Word__WCharAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Word__WCharAssignment_1_in_rule__Word__Group__1__Impl5641);
            	    rule__Word__WCharAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getWordAccess().getWCharAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__InterfixLexical__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2715:1: rule__InterfixLexical__Group__0 : rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 ;
    public final void rule__InterfixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2719:1: ( rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2720:2: rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixLexical__Group__0__Impl_in_rule__InterfixLexical__Group__05676);
            rule__InterfixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixLexical__Group__1_in_rule__InterfixLexical__Group__05679);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2727:1: rule__InterfixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2731:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2732:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2732:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2733:1: ()
            {
             before(grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2734:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2736:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2746:1: rule__InterfixLexical__Group__1 : rule__InterfixLexical__Group__1__Impl ;
    public final void rule__InterfixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2750:1: ( rule__InterfixLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2751:2: rule__InterfixLexical__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixLexical__Group__1__Impl_in_rule__InterfixLexical__Group__15737);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2757:1: rule__InterfixLexical__Group__1__Impl : ( ',' ) ;
    public final void rule__InterfixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2761:1: ( ( ',' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2762:1: ( ',' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2762:1: ( ',' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2763:1: ','
            {
             before(grammarAccess.getInterfixLexicalAccess().getCommaKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__InterfixLexical__Group__1__Impl5765); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2780:1: rule__InterfixFlexion__Group__0 : rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 ;
    public final void rule__InterfixFlexion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2784:1: ( rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2785:2: rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixFlexion__Group__0__Impl_in_rule__InterfixFlexion__Group__05800);
            rule__InterfixFlexion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixFlexion__Group__1_in_rule__InterfixFlexion__Group__05803);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2792:1: rule__InterfixFlexion__Group__0__Impl : ( () ) ;
    public final void rule__InterfixFlexion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2796:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2797:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2797:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2798:1: ()
            {
             before(grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2799:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2801:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2811:1: rule__InterfixFlexion__Group__1 : rule__InterfixFlexion__Group__1__Impl ;
    public final void rule__InterfixFlexion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2815:1: ( rule__InterfixFlexion__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2816:2: rule__InterfixFlexion__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixFlexion__Group__1__Impl_in_rule__InterfixFlexion__Group__15861);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2822:1: rule__InterfixFlexion__Group__1__Impl : ( '.' ) ;
    public final void rule__InterfixFlexion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2826:1: ( ( '.' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2827:1: ( '.' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2827:1: ( '.' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2828:1: '.'
            {
             before(grammarAccess.getInterfixFlexionAccess().getFullStopKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__InterfixFlexion__Group__1__Impl5889); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2845:1: rule__InterfixSuffixPronomLexical__Group__0 : rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 ;
    public final void rule__InterfixSuffixPronomLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2849:1: ( rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2850:2: rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixSuffixPronomLexical__Group__0__Impl_in_rule__InterfixSuffixPronomLexical__Group__05924);
            rule__InterfixSuffixPronomLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixSuffixPronomLexical__Group__1_in_rule__InterfixSuffixPronomLexical__Group__05927);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2857:1: rule__InterfixSuffixPronomLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2861:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2862:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2862:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2863:1: ()
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2864:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2866:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2876:1: rule__InterfixSuffixPronomLexical__Group__1 : rule__InterfixSuffixPronomLexical__Group__1__Impl ;
    public final void rule__InterfixSuffixPronomLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2880:1: ( rule__InterfixSuffixPronomLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2881:2: rule__InterfixSuffixPronomLexical__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixSuffixPronomLexical__Group__1__Impl_in_rule__InterfixSuffixPronomLexical__Group__15985);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2887:1: rule__InterfixSuffixPronomLexical__Group__1__Impl : ( '\\u2261' ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2891:1: ( ( '\\u2261' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2892:1: ( '\\u2261' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2892:1: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2893:1: '\\u2261'
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getIdenticalToKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__InterfixSuffixPronomLexical__Group__1__Impl6013); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2910:1: rule__InterfixPrefixNonLexical__Group__0 : rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 ;
    public final void rule__InterfixPrefixNonLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2914:1: ( rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2915:2: rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixNonLexical__Group__0__Impl_in_rule__InterfixPrefixNonLexical__Group__06048);
            rule__InterfixPrefixNonLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixNonLexical__Group__1_in_rule__InterfixPrefixNonLexical__Group__06051);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2922:1: rule__InterfixPrefixNonLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixNonLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2926:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2927:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2927:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2928:1: ()
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2929:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2931:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2941:1: rule__InterfixPrefixNonLexical__Group__1 : rule__InterfixPrefixNonLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixNonLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2945:1: ( rule__InterfixPrefixNonLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2946:2: rule__InterfixPrefixNonLexical__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixNonLexical__Group__1__Impl_in_rule__InterfixPrefixNonLexical__Group__16109);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2952:1: rule__InterfixPrefixNonLexical__Group__1__Impl : ( ':' ) ;
    public final void rule__InterfixPrefixNonLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2956:1: ( ( ':' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2957:1: ( ':' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2957:1: ( ':' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2958:1: ':'
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getColonKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__InterfixPrefixNonLexical__Group__1__Impl6137); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2975:1: rule__InterfixPrefixLexical__Group__0 : rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 ;
    public final void rule__InterfixPrefixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2979:1: ( rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2980:2: rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixLexical__Group__0__Impl_in_rule__InterfixPrefixLexical__Group__06172);
            rule__InterfixPrefixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixLexical__Group__1_in_rule__InterfixPrefixLexical__Group__06175);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2987:1: rule__InterfixPrefixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2991:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2992:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2992:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2993:1: ()
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2994:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2996:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3006:1: rule__InterfixPrefixLexical__Group__1 : rule__InterfixPrefixLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3010:1: ( rule__InterfixPrefixLexical__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3011:2: rule__InterfixPrefixLexical__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixPrefixLexical__Group__1__Impl_in_rule__InterfixPrefixLexical__Group__16233);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3017:1: rule__InterfixPrefixLexical__Group__1__Impl : ( '\\u22EE' ) ;
    public final void rule__InterfixPrefixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3021:1: ( ( '\\u22EE' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3022:1: ( '\\u22EE' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3022:1: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3023:1: '\\u22EE'
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getVerticalEllipsisKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__InterfixPrefixLexical__Group__1__Impl6261); 
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


    // $ANTLR start "rule__InterfixCompountWords__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3040:1: rule__InterfixCompountWords__Group__0 : rule__InterfixCompountWords__Group__0__Impl rule__InterfixCompountWords__Group__1 ;
    public final void rule__InterfixCompountWords__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3044:1: ( rule__InterfixCompountWords__Group__0__Impl rule__InterfixCompountWords__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3045:2: rule__InterfixCompountWords__Group__0__Impl rule__InterfixCompountWords__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixCompountWords__Group__0__Impl_in_rule__InterfixCompountWords__Group__06296);
            rule__InterfixCompountWords__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixCompountWords__Group__1_in_rule__InterfixCompountWords__Group__06299);
            rule__InterfixCompountWords__Group__1();

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
    // $ANTLR end "rule__InterfixCompountWords__Group__0"


    // $ANTLR start "rule__InterfixCompountWords__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3052:1: rule__InterfixCompountWords__Group__0__Impl : ( () ) ;
    public final void rule__InterfixCompountWords__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3056:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3057:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3057:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3058:1: ()
            {
             before(grammarAccess.getInterfixCompountWordsAccess().getInterfixCompountWordsAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3059:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3061:1: 
            {
            }

             after(grammarAccess.getInterfixCompountWordsAccess().getInterfixCompountWordsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixCompountWords__Group__0__Impl"


    // $ANTLR start "rule__InterfixCompountWords__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3071:1: rule__InterfixCompountWords__Group__1 : rule__InterfixCompountWords__Group__1__Impl ;
    public final void rule__InterfixCompountWords__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3075:1: ( rule__InterfixCompountWords__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3076:2: rule__InterfixCompountWords__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixCompountWords__Group__1__Impl_in_rule__InterfixCompountWords__Group__16357);
            rule__InterfixCompountWords__Group__1__Impl();

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
    // $ANTLR end "rule__InterfixCompountWords__Group__1"


    // $ANTLR start "rule__InterfixCompountWords__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3082:1: rule__InterfixCompountWords__Group__1__Impl : ( '-' ) ;
    public final void rule__InterfixCompountWords__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3086:1: ( ( '-' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3087:1: ( '-' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3087:1: ( '-' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3088:1: '-'
            {
             before(grammarAccess.getInterfixCompountWordsAccess().getHyphenMinusKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InterfixCompountWords__Group__1__Impl6385); 
             after(grammarAccess.getInterfixCompountWordsAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfixCompountWords__Group__1__Impl"


    // $ANTLR start "rule__InterfixConnectionSyllabicGroup__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3105:1: rule__InterfixConnectionSyllabicGroup__Group__0 : rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3109:1: ( rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3110:2: rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__06420);
            rule__InterfixConnectionSyllabicGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1_in_rule__InterfixConnectionSyllabicGroup__Group__06423);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3117:1: rule__InterfixConnectionSyllabicGroup__Group__0__Impl : ( () ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3121:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3122:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3122:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3123:1: ()
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3124:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3126:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3136:1: rule__InterfixConnectionSyllabicGroup__Group__1 : rule__InterfixConnectionSyllabicGroup__Group__1__Impl ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3140:1: ( rule__InterfixConnectionSyllabicGroup__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3141:2: rule__InterfixConnectionSyllabicGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__16481);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3147:1: rule__InterfixConnectionSyllabicGroup__Group__1__Impl : ( '~' ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3151:1: ( ( '~' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3152:1: ( '~' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3152:1: ( '~' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3153:1: '~'
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getTildeKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__InterfixConnectionSyllabicGroup__Group__1__Impl6509); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3170:1: rule__Expanded__Group__0 : rule__Expanded__Group__0__Impl rule__Expanded__Group__1 ;
    public final void rule__Expanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3174:1: ( rule__Expanded__Group__0__Impl rule__Expanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3175:2: rule__Expanded__Group__0__Impl rule__Expanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__06544);
            rule__Expanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__06547);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3182:1: rule__Expanded__Group__0__Impl : ( () ) ;
    public final void rule__Expanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3186:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3187:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3187:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3188:1: ()
            {
             before(grammarAccess.getExpandedAccess().getExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3189:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3191:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3201:1: rule__Expanded__Group__1 : rule__Expanded__Group__1__Impl rule__Expanded__Group__2 ;
    public final void rule__Expanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3205:1: ( rule__Expanded__Group__1__Impl rule__Expanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3206:2: rule__Expanded__Group__1__Impl rule__Expanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__16605);
            rule__Expanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__16608);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3213:1: rule__Expanded__Group__1__Impl : ( '(' ) ;
    public final void rule__Expanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3217:1: ( ( '(' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3218:1: ( '(' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3218:1: ( '(' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3219:1: '('
            {
             before(grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Expanded__Group__1__Impl6636); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3232:1: rule__Expanded__Group__2 : rule__Expanded__Group__2__Impl rule__Expanded__Group__3 ;
    public final void rule__Expanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3236:1: ( rule__Expanded__Group__2__Impl rule__Expanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3237:2: rule__Expanded__Group__2__Impl rule__Expanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__26667);
            rule__Expanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__26670);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3244:1: rule__Expanded__Group__2__Impl : ( ( rule__Expanded__WCharAssignment_2 )* ) ;
    public final void rule__Expanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3248:1: ( ( ( rule__Expanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3249:1: ( ( rule__Expanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3249:1: ( ( rule__Expanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3250:1: ( rule__Expanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3251:1: ( rule__Expanded__WCharAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EGYSTRING||(LA19_0>=21 && LA19_0<=27)||LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3251:2: rule__Expanded__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl6697);
            	    rule__Expanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3261:1: rule__Expanded__Group__3 : rule__Expanded__Group__3__Impl ;
    public final void rule__Expanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3265:1: ( rule__Expanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3266:2: rule__Expanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__36728);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3272:1: rule__Expanded__Group__3__Impl : ( ')' ) ;
    public final void rule__Expanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3276:1: ( ( ')' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3277:1: ( ')' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3277:1: ( ')' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3278:1: ')'
            {
             before(grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Expanded__Group__3__Impl6756); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3299:1: rule__Emendation__Group__0 : rule__Emendation__Group__0__Impl rule__Emendation__Group__1 ;
    public final void rule__Emendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3303:1: ( rule__Emendation__Group__0__Impl rule__Emendation__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3304:2: rule__Emendation__Group__0__Impl rule__Emendation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__06795);
            rule__Emendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__06798);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3311:1: rule__Emendation__Group__0__Impl : ( () ) ;
    public final void rule__Emendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3315:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3316:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3316:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3317:1: ()
            {
             before(grammarAccess.getEmendationAccess().getEmendationAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3318:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3320:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3330:1: rule__Emendation__Group__1 : rule__Emendation__Group__1__Impl rule__Emendation__Group__2 ;
    public final void rule__Emendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3334:1: ( rule__Emendation__Group__1__Impl rule__Emendation__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3335:2: rule__Emendation__Group__1__Impl rule__Emendation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__16856);
            rule__Emendation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__16859);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3342:1: rule__Emendation__Group__1__Impl : ( '<' ) ;
    public final void rule__Emendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3346:1: ( ( '<' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3347:1: ( '<' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3347:1: ( '<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3348:1: '<'
            {
             before(grammarAccess.getEmendationAccess().getLessThanSignKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Emendation__Group__1__Impl6887); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3361:1: rule__Emendation__Group__2 : rule__Emendation__Group__2__Impl rule__Emendation__Group__3 ;
    public final void rule__Emendation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3365:1: ( rule__Emendation__Group__2__Impl rule__Emendation__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3366:2: rule__Emendation__Group__2__Impl rule__Emendation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__26918);
            rule__Emendation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__26921);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3373:1: rule__Emendation__Group__2__Impl : ( ( rule__Emendation__WCharAssignment_2 )* ) ;
    public final void rule__Emendation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3377:1: ( ( ( rule__Emendation__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3378:1: ( ( rule__Emendation__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3378:1: ( ( rule__Emendation__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3379:1: ( rule__Emendation__WCharAssignment_2 )*
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3380:1: ( rule__Emendation__WCharAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EGYSTRING||(LA20_0>=21 && LA20_0<=28)||LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3380:2: rule__Emendation__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl6948);
            	    rule__Emendation__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3390:1: rule__Emendation__Group__3 : rule__Emendation__Group__3__Impl ;
    public final void rule__Emendation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3394:1: ( rule__Emendation__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3395:2: rule__Emendation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__36979);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3401:1: rule__Emendation__Group__3__Impl : ( '>' ) ;
    public final void rule__Emendation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3405:1: ( ( '>' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3406:1: ( '>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3406:1: ( '>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3407:1: '>'
            {
             before(grammarAccess.getEmendationAccess().getGreaterThanSignKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Emendation__Group__3__Impl7007); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3428:1: rule__DisputableReading__Group__0 : rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 ;
    public final void rule__DisputableReading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3432:1: ( rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3433:2: rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__07046);
            rule__DisputableReading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__07049);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3440:1: rule__DisputableReading__Group__0__Impl : ( () ) ;
    public final void rule__DisputableReading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3444:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3445:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3445:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3446:1: ()
            {
             before(grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3447:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3449:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3459:1: rule__DisputableReading__Group__1 : rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 ;
    public final void rule__DisputableReading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3463:1: ( rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3464:2: rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__17107);
            rule__DisputableReading__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__17110);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3471:1: rule__DisputableReading__Group__1__Impl : ( '?' ) ;
    public final void rule__DisputableReading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3475:1: ( ( '?' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3476:1: ( '?' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3476:1: ( '?' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3477:1: '?'
            {
             before(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__DisputableReading__Group__1__Impl7138); 
             after(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3490:1: rule__DisputableReading__Group__2 : rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 ;
    public final void rule__DisputableReading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3494:1: ( rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3495:2: rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__27169);
            rule__DisputableReading__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__27172);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3502:1: rule__DisputableReading__Group__2__Impl : ( ( rule__DisputableReading__WCharAssignment_2 )* ) ;
    public final void rule__DisputableReading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3506:1: ( ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3507:1: ( ( rule__DisputableReading__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3507:1: ( ( rule__DisputableReading__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3508:1: ( rule__DisputableReading__WCharAssignment_2 )*
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3509:1: ( rule__DisputableReading__WCharAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EGYSTRING||(LA21_0>=21 && LA21_0<=28)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3509:2: rule__DisputableReading__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl7199);
            	    rule__DisputableReading__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3519:1: rule__DisputableReading__Group__3 : rule__DisputableReading__Group__3__Impl ;
    public final void rule__DisputableReading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3523:1: ( rule__DisputableReading__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3524:2: rule__DisputableReading__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__37230);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3530:1: rule__DisputableReading__Group__3__Impl : ( '?' ) ;
    public final void rule__DisputableReading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3534:1: ( ( '?' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3535:1: ( '?' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3535:1: ( '?' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3536:1: '?'
            {
             before(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__DisputableReading__Group__3__Impl7258); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3557:1: rule__Lacuna__Group__0 : rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 ;
    public final void rule__Lacuna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3561:1: ( rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3562:2: rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__07297);
            rule__Lacuna__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__07300);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3569:1: rule__Lacuna__Group__0__Impl : ( () ) ;
    public final void rule__Lacuna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3573:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3574:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3574:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3575:1: ()
            {
             before(grammarAccess.getLacunaAccess().getLacunaAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3576:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3578:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3588:1: rule__Lacuna__Group__1 : rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 ;
    public final void rule__Lacuna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3592:1: ( rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3593:2: rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__17358);
            rule__Lacuna__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__17361);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3600:1: rule__Lacuna__Group__1__Impl : ( '[' ) ;
    public final void rule__Lacuna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3604:1: ( ( '[' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3605:1: ( '[' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3605:1: ( '[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3606:1: '['
            {
             before(grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Lacuna__Group__1__Impl7389); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3619:1: rule__Lacuna__Group__2 : rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 ;
    public final void rule__Lacuna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3623:1: ( rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3624:2: rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__27420);
            rule__Lacuna__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__27423);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3631:1: rule__Lacuna__Group__2__Impl : ( ( rule__Lacuna__WCharAssignment_2 )* ) ;
    public final void rule__Lacuna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3635:1: ( ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3636:1: ( ( rule__Lacuna__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3636:1: ( ( rule__Lacuna__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3637:1: ( rule__Lacuna__WCharAssignment_2 )*
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3638:1: ( rule__Lacuna__WCharAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_EGYSTRING||(LA22_0>=21 && LA22_0<=28)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3638:2: rule__Lacuna__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl7450);
            	    rule__Lacuna__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3648:1: rule__Lacuna__Group__3 : rule__Lacuna__Group__3__Impl ;
    public final void rule__Lacuna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3652:1: ( rule__Lacuna__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3653:2: rule__Lacuna__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__37481);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3659:1: rule__Lacuna__Group__3__Impl : ( ']' ) ;
    public final void rule__Lacuna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3663:1: ( ( ']' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3664:1: ( ']' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3664:1: ( ']' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3665:1: ']'
            {
             before(grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Lacuna__Group__3__Impl7509); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3686:1: rule__Deletion__Group__0 : rule__Deletion__Group__0__Impl rule__Deletion__Group__1 ;
    public final void rule__Deletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3690:1: ( rule__Deletion__Group__0__Impl rule__Deletion__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3691:2: rule__Deletion__Group__0__Impl rule__Deletion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__07548);
            rule__Deletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__07551);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3698:1: rule__Deletion__Group__0__Impl : ( () ) ;
    public final void rule__Deletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3702:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3703:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3703:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3704:1: ()
            {
             before(grammarAccess.getDeletionAccess().getDeletionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3705:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3707:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3717:1: rule__Deletion__Group__1 : rule__Deletion__Group__1__Impl rule__Deletion__Group__2 ;
    public final void rule__Deletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3721:1: ( rule__Deletion__Group__1__Impl rule__Deletion__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3722:2: rule__Deletion__Group__1__Impl rule__Deletion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__17609);
            rule__Deletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__17612);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3729:1: rule__Deletion__Group__1__Impl : ( '{' ) ;
    public final void rule__Deletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3733:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3734:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3734:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3735:1: '{'
            {
             before(grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Deletion__Group__1__Impl7640); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3748:1: rule__Deletion__Group__2 : rule__Deletion__Group__2__Impl rule__Deletion__Group__3 ;
    public final void rule__Deletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3752:1: ( rule__Deletion__Group__2__Impl rule__Deletion__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3753:2: rule__Deletion__Group__2__Impl rule__Deletion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__27671);
            rule__Deletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__27674);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3760:1: rule__Deletion__Group__2__Impl : ( ( rule__Deletion__WCharAssignment_2 ) ) ;
    public final void rule__Deletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3764:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3765:1: ( ( rule__Deletion__WCharAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3765:1: ( ( rule__Deletion__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3766:1: ( rule__Deletion__WCharAssignment_2 )
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3767:1: ( rule__Deletion__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3767:2: rule__Deletion__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl7701);
            rule__Deletion__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3777:1: rule__Deletion__Group__3 : rule__Deletion__Group__3__Impl ;
    public final void rule__Deletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3781:1: ( rule__Deletion__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3782:2: rule__Deletion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__37731);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3788:1: rule__Deletion__Group__3__Impl : ( '}' ) ;
    public final void rule__Deletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3792:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3793:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3793:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3794:1: '}'
            {
             before(grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Deletion__Group__3__Impl7759); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3815:1: rule__ExpandedColumn__Group__0 : rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 ;
    public final void rule__ExpandedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3819:1: ( rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3820:2: rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__07798);
            rule__ExpandedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__07801);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3827:1: rule__ExpandedColumn__Group__0__Impl : ( () ) ;
    public final void rule__ExpandedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3831:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3832:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3832:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3833:1: ()
            {
             before(grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3834:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3836:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3846:1: rule__ExpandedColumn__Group__1 : rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 ;
    public final void rule__ExpandedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3850:1: ( rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3851:2: rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__17859);
            rule__ExpandedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__17862);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3858:1: rule__ExpandedColumn__Group__1__Impl : ( '<<' ) ;
    public final void rule__ExpandedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3862:1: ( ( '<<' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3863:1: ( '<<' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3863:1: ( '<<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3864:1: '<<'
            {
             before(grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ExpandedColumn__Group__1__Impl7890); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3877:1: rule__ExpandedColumn__Group__2 : rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 ;
    public final void rule__ExpandedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3881:1: ( rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3882:2: rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__27921);
            rule__ExpandedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__27924);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3889:1: rule__ExpandedColumn__Group__2__Impl : ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ;
    public final void rule__ExpandedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3893:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3894:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3894:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3895:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3896:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3896:2: rule__ExpandedColumn__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl7951);
            rule__ExpandedColumn__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3906:1: rule__ExpandedColumn__Group__3 : rule__ExpandedColumn__Group__3__Impl ;
    public final void rule__ExpandedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3910:1: ( rule__ExpandedColumn__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3911:2: rule__ExpandedColumn__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__37981);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3917:1: rule__ExpandedColumn__Group__3__Impl : ( '>>' ) ;
    public final void rule__ExpandedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3921:1: ( ( '>>' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3922:1: ( '>>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3922:1: ( '>>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3923:1: '>>'
            {
             before(grammarAccess.getExpandedColumnAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ExpandedColumn__Group__3__Impl8009); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3944:1: rule__Rasur__Group__0 : rule__Rasur__Group__0__Impl rule__Rasur__Group__1 ;
    public final void rule__Rasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3948:1: ( rule__Rasur__Group__0__Impl rule__Rasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3949:2: rule__Rasur__Group__0__Impl rule__Rasur__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__08048);
            rule__Rasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__08051);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3956:1: rule__Rasur__Group__0__Impl : ( () ) ;
    public final void rule__Rasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3960:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3961:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3961:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3962:1: ()
            {
             before(grammarAccess.getRasurAccess().getRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3963:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3965:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3975:1: rule__Rasur__Group__1 : rule__Rasur__Group__1__Impl rule__Rasur__Group__2 ;
    public final void rule__Rasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3979:1: ( rule__Rasur__Group__1__Impl rule__Rasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3980:2: rule__Rasur__Group__1__Impl rule__Rasur__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__18109);
            rule__Rasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__18112);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3987:1: rule__Rasur__Group__1__Impl : ( '{{' ) ;
    public final void rule__Rasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3991:1: ( ( '{{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3992:1: ( '{{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3992:1: ( '{{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3993:1: '{{'
            {
             before(grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Rasur__Group__1__Impl8140); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4006:1: rule__Rasur__Group__2 : rule__Rasur__Group__2__Impl rule__Rasur__Group__3 ;
    public final void rule__Rasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4010:1: ( rule__Rasur__Group__2__Impl rule__Rasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4011:2: rule__Rasur__Group__2__Impl rule__Rasur__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__28171);
            rule__Rasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__28174);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4018:1: rule__Rasur__Group__2__Impl : ( ( rule__Rasur__WCharAssignment_2 ) ) ;
    public final void rule__Rasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4022:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4023:1: ( ( rule__Rasur__WCharAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4023:1: ( ( rule__Rasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4024:1: ( rule__Rasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4025:1: ( rule__Rasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4025:2: rule__Rasur__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl8201);
            rule__Rasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRasurAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4035:1: rule__Rasur__Group__3 : rule__Rasur__Group__3__Impl ;
    public final void rule__Rasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4039:1: ( rule__Rasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4040:2: rule__Rasur__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__38231);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4046:1: rule__Rasur__Group__3__Impl : ( '}}' ) ;
    public final void rule__Rasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4050:1: ( ( '}}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4051:1: ( '}}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4051:1: ( '}}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4052:1: '}}'
            {
             before(grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Rasur__Group__3__Impl8259); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4073:1: rule__AncientExpanded__Group__0 : rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 ;
    public final void rule__AncientExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4077:1: ( rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4078:2: rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__08298);
            rule__AncientExpanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__08301);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4085:1: rule__AncientExpanded__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4089:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4090:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4090:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4091:1: ()
            {
             before(grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4092:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4094:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4104:1: rule__AncientExpanded__Group__1 : rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 ;
    public final void rule__AncientExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4108:1: ( rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4109:2: rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__18359);
            rule__AncientExpanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__18362);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4116:1: rule__AncientExpanded__Group__1__Impl : ( '((' ) ;
    public final void rule__AncientExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4120:1: ( ( '((' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4121:1: ( '((' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4121:1: ( '((' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4122:1: '(('
            {
             before(grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__AncientExpanded__Group__1__Impl8390); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4135:1: rule__AncientExpanded__Group__2 : rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 ;
    public final void rule__AncientExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4139:1: ( rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4140:2: rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__28421);
            rule__AncientExpanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__28424);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4147:1: rule__AncientExpanded__Group__2__Impl : ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ;
    public final void rule__AncientExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4151:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4152:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4152:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4153:1: ( rule__AncientExpanded__WCharAssignment_2 )
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4154:1: ( rule__AncientExpanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4154:2: rule__AncientExpanded__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl8451);
            rule__AncientExpanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4164:1: rule__AncientExpanded__Group__3 : rule__AncientExpanded__Group__3__Impl ;
    public final void rule__AncientExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4168:1: ( rule__AncientExpanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4169:2: rule__AncientExpanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__38481);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4175:1: rule__AncientExpanded__Group__3__Impl : ( '))' ) ;
    public final void rule__AncientExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4179:1: ( ( '))' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4180:1: ( '))' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4180:1: ( '))' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4181:1: '))'
            {
             before(grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__AncientExpanded__Group__3__Impl8509); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4202:1: rule__RestorationOverRasur__Group__0 : rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 ;
    public final void rule__RestorationOverRasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4206:1: ( rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4207:2: rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__08548);
            rule__RestorationOverRasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__08551);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4214:1: rule__RestorationOverRasur__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4218:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4219:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4219:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4220:1: ()
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4221:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4223:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4233:1: rule__RestorationOverRasur__Group__1 : rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 ;
    public final void rule__RestorationOverRasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4237:1: ( rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4238:2: rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__18609);
            rule__RestorationOverRasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__18612);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4245:1: rule__RestorationOverRasur__Group__1__Impl : ( '[[' ) ;
    public final void rule__RestorationOverRasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4249:1: ( ( '[[' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4250:1: ( '[[' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4250:1: ( '[[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4251:1: '[['
            {
             before(grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__RestorationOverRasur__Group__1__Impl8640); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4264:1: rule__RestorationOverRasur__Group__2 : rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 ;
    public final void rule__RestorationOverRasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4268:1: ( rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4269:2: rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__28671);
            rule__RestorationOverRasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__28674);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4276:1: rule__RestorationOverRasur__Group__2__Impl : ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ;
    public final void rule__RestorationOverRasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4280:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4281:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4281:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4282:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4283:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4283:2: rule__RestorationOverRasur__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl8701);
            rule__RestorationOverRasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4293:1: rule__RestorationOverRasur__Group__3 : rule__RestorationOverRasur__Group__3__Impl ;
    public final void rule__RestorationOverRasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4297:1: ( rule__RestorationOverRasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4298:2: rule__RestorationOverRasur__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__38731);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4304:1: rule__RestorationOverRasur__Group__3__Impl : ( ']]' ) ;
    public final void rule__RestorationOverRasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4308:1: ( ( ']]' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4309:1: ( ']]' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4309:1: ( ']]' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4310:1: ']]'
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__RestorationOverRasur__Group__3__Impl8759); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4331:1: rule__PartialDestruction__Group__0 : rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 ;
    public final void rule__PartialDestruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4335:1: ( rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4336:2: rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__08798);
            rule__PartialDestruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__08801);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4343:1: rule__PartialDestruction__Group__0__Impl : ( () ) ;
    public final void rule__PartialDestruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4347:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4348:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4348:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4349:1: ()
            {
             before(grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4350:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4352:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4362:1: rule__PartialDestruction__Group__1 : rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 ;
    public final void rule__PartialDestruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4366:1: ( rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4367:2: rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__18859);
            rule__PartialDestruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__18862);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4374:1: rule__PartialDestruction__Group__1__Impl : ( '\\u2E22' ) ;
    public final void rule__PartialDestruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4378:1: ( ( '\\u2E22' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4379:1: ( '\\u2E22' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4379:1: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4380:1: '\\u2E22'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__PartialDestruction__Group__1__Impl8890); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4393:1: rule__PartialDestruction__Group__2 : rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 ;
    public final void rule__PartialDestruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4397:1: ( rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4398:2: rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__28921);
            rule__PartialDestruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__28924);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4405:1: rule__PartialDestruction__Group__2__Impl : ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ;
    public final void rule__PartialDestruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4409:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4410:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4410:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4411:1: ( rule__PartialDestruction__WCharAssignment_2 )
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4412:1: ( rule__PartialDestruction__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4412:2: rule__PartialDestruction__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl8951);
            rule__PartialDestruction__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4422:1: rule__PartialDestruction__Group__3 : rule__PartialDestruction__Group__3__Impl ;
    public final void rule__PartialDestruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4426:1: ( rule__PartialDestruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4427:2: rule__PartialDestruction__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__38981);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4433:1: rule__PartialDestruction__Group__3__Impl : ( '\\u2E23' ) ;
    public final void rule__PartialDestruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4437:1: ( ( '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4438:1: ( '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4438:1: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4439:1: '\\u2E23'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__PartialDestruction__Group__3__Impl9009); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4460:1: rule__Destruction__Group__0 : rule__Destruction__Group__0__Impl rule__Destruction__Group__1 ;
    public final void rule__Destruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4464:1: ( rule__Destruction__Group__0__Impl rule__Destruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4465:2: rule__Destruction__Group__0__Impl rule__Destruction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__0__Impl_in_rule__Destruction__Group__09048);
            rule__Destruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__1_in_rule__Destruction__Group__09051);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4472:1: rule__Destruction__Group__0__Impl : ( () ) ;
    public final void rule__Destruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4476:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4477:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4477:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4478:1: ()
            {
             before(grammarAccess.getDestructionAccess().getDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4479:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4481:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4491:1: rule__Destruction__Group__1 : rule__Destruction__Group__1__Impl rule__Destruction__Group__2 ;
    public final void rule__Destruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4495:1: ( rule__Destruction__Group__1__Impl rule__Destruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4496:2: rule__Destruction__Group__1__Impl rule__Destruction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__1__Impl_in_rule__Destruction__Group__19109);
            rule__Destruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__2_in_rule__Destruction__Group__19112);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4503:1: rule__Destruction__Group__1__Impl : ( '--' ) ;
    public final void rule__Destruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4507:1: ( ( '--' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4508:1: ( '--' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4508:1: ( '--' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4509:1: '--'
            {
             before(grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Destruction__Group__1__Impl9140); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4522:1: rule__Destruction__Group__2 : rule__Destruction__Group__2__Impl rule__Destruction__Group__3 ;
    public final void rule__Destruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4526:1: ( rule__Destruction__Group__2__Impl rule__Destruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4527:2: rule__Destruction__Group__2__Impl rule__Destruction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__2__Impl_in_rule__Destruction__Group__29171);
            rule__Destruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__3_in_rule__Destruction__Group__29174);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4534:1: rule__Destruction__Group__2__Impl : ( ( rule__Destruction__CommentAssignment_2 ) ) ;
    public final void rule__Destruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4538:1: ( ( ( rule__Destruction__CommentAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4539:1: ( ( rule__Destruction__CommentAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4539:1: ( ( rule__Destruction__CommentAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4540:1: ( rule__Destruction__CommentAssignment_2 )
            {
             before(grammarAccess.getDestructionAccess().getCommentAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4541:1: ( rule__Destruction__CommentAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4541:2: rule__Destruction__CommentAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__CommentAssignment_2_in_rule__Destruction__Group__2__Impl9201);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4551:1: rule__Destruction__Group__3 : rule__Destruction__Group__3__Impl ;
    public final void rule__Destruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4555:1: ( rule__Destruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4556:2: rule__Destruction__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__3__Impl_in_rule__Destruction__Group__39231);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4562:1: rule__Destruction__Group__3__Impl : ( '--' ) ;
    public final void rule__Destruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4566:1: ( ( '--' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4567:1: ( '--' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4567:1: ( '--' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4568:1: '--'
            {
             before(grammarAccess.getDestructionAccess().getHyphenMinusHyphenMinusKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Destruction__Group__3__Impl9259); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4590:1: rule__TextContent__ItemsAssignment_1_0 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4594:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4595:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4595:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4596:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_09303);
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


    // $ANTLR start "rule__TextContent__ItemsAssignment_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4605:1: rule__TextContent__ItemsAssignment_1_1 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4609:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4610:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4610:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4611:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_19334);
            ruleTextItem();

            state._fsp--;

             after(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextContent__ItemsAssignment_1_1"


    // $ANTLR start "rule__Sentence__ItemsAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4620:1: rule__Sentence__ItemsAssignment_1_0 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4624:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4625:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4625:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4626:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_09365);
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


    // $ANTLR start "rule__Sentence__ItemsAssignment_1_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4635:1: rule__Sentence__ItemsAssignment_1_1_1 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4639:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4640:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4640:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4641:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_1_19396);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__ItemsAssignment_1_1_1"


    // $ANTLR start "rule__Ambivalence__CasesAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4650:1: rule__Ambivalence__CasesAssignment_1_0 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4654:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4655:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4655:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4656:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_09427);
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


    // $ANTLR start "rule__Ambivalence__CasesAssignment_1_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4665:1: rule__Ambivalence__CasesAssignment_1_1_1 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4669:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4670:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4670:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4671:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_19458);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambivalence__CasesAssignment_1_1_1"


    // $ANTLR start "rule__Case__NameAssignment_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4680:1: rule__Case__NameAssignment_1 : ( RULE_EGYSTRING ) ;
    public final void rule__Case__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4684:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4685:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4685:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4686:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCaseAccess().getNameEGYSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_rule__Case__NameAssignment_19489); 
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


    // $ANTLR start "rule__Case__ItemsAssignment_3_0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4695:1: rule__Case__ItemsAssignment_3_0 : ( ruleSentenceItem ) ;
    public final void rule__Case__ItemsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4699:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4700:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4700:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4701:1: ruleSentenceItem
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_rule__Case__ItemsAssignment_3_09520);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getItemsSentenceItemParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ItemsAssignment_3_0"


    // $ANTLR start "rule__Case__ItemsAssignment_3_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4710:1: rule__Case__ItemsAssignment_3_1_1 : ( ruleSentenceItem ) ;
    public final void rule__Case__ItemsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4714:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4715:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4715:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4716:1: ruleSentenceItem
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_rule__Case__ItemsAssignment_3_1_19551);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getItemsSentenceItemParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ItemsAssignment_3_1_1"


    // $ANTLR start "rule__Marker__TypeAssignment_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4725:1: rule__Marker__TypeAssignment_1 : ( RULE_EGYSTRING ) ;
    public final void rule__Marker__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4729:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4730:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4730:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4731:1: RULE_EGYSTRING
            {
             before(grammarAccess.getMarkerAccess().getTypeEGYSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_rule__Marker__TypeAssignment_19582); 
             after(grammarAccess.getMarkerAccess().getTypeEGYSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__TypeAssignment_1"


    // $ANTLR start "rule__Marker__NameAssignment_2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4740:1: rule__Marker__NameAssignment_2 : ( RULE_EGYSTRING ) ;
    public final void rule__Marker__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4744:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4745:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4745:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4746:1: RULE_EGYSTRING
            {
             before(grammarAccess.getMarkerAccess().getNameEGYSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_rule__Marker__NameAssignment_29613); 
             after(grammarAccess.getMarkerAccess().getNameEGYSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__NameAssignment_2"


    // $ANTLR start "rule__Word__WCharAssignment_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4755:1: rule__Word__WCharAssignment_1 : ( ruleWordMiddle ) ;
    public final void rule__Word__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4759:1: ( ( ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4760:1: ( ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4760:1: ( ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4761:1: ruleWordMiddle
            {
             before(grammarAccess.getWordAccess().getWCharWordMiddleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_rule__Word__WCharAssignment_19644);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordAccess().getWCharWordMiddleParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4770:1: rule__Chars__NameAssignment : ( RULE_EGYSTRING ) ;
    public final void rule__Chars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4774:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4775:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4775:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4776:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment9675); 
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


    // $ANTLR start "rule__Expanded__WCharAssignment_2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4785:1: rule__Expanded__WCharAssignment_2 : ( ruleNoExpanded ) ;
    public final void rule__Expanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4789:1: ( ( ruleNoExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4790:1: ( ruleNoExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4790:1: ( ruleNoExpanded )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4791:1: ruleNoExpanded
            {
             before(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_29706);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4800:1: rule__Emendation__WCharAssignment_2 : ( ruleNoEmendation ) ;
    public final void rule__Emendation__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4804:1: ( ( ruleNoEmendation ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4805:1: ( ruleNoEmendation )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4805:1: ( ruleNoEmendation )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4806:1: ruleNoEmendation
            {
             before(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_29737);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4815:1: rule__DisputableReading__WCharAssignment_2 : ( ruleNoDisputableReading ) ;
    public final void rule__DisputableReading__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4819:1: ( ( ruleNoDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4820:1: ( ruleNoDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4820:1: ( ruleNoDisputableReading )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4821:1: ruleNoDisputableReading
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_29768);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4830:1: rule__Lacuna__WCharAssignment_2 : ( ruleNoLacuna ) ;
    public final void rule__Lacuna__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4834:1: ( ( ruleNoLacuna ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4835:1: ( ruleNoLacuna )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4835:1: ( ruleNoLacuna )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4836:1: ruleNoLacuna
            {
             before(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_29799);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4845:1: rule__Deletion__WCharAssignment_2 : ( ruleNoDeletion ) ;
    public final void rule__Deletion__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4849:1: ( ( ruleNoDeletion ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4850:1: ( ruleNoDeletion )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4850:1: ( ruleNoDeletion )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4851:1: ruleNoDeletion
            {
             before(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_29830);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4860:1: rule__ExpandedColumn__WCharAssignment_2 : ( ruleNoExpandedColumn ) ;
    public final void rule__ExpandedColumn__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4864:1: ( ( ruleNoExpandedColumn ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4865:1: ( ruleNoExpandedColumn )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4865:1: ( ruleNoExpandedColumn )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4866:1: ruleNoExpandedColumn
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_29861);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4875:1: rule__Rasur__WCharAssignment_2 : ( ruleNoRasur ) ;
    public final void rule__Rasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4879:1: ( ( ruleNoRasur ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4880:1: ( ruleNoRasur )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4880:1: ( ruleNoRasur )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4881:1: ruleNoRasur
            {
             before(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_29892);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4890:1: rule__AncientExpanded__WCharAssignment_2 : ( ruleNoAncientExpanded ) ;
    public final void rule__AncientExpanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4894:1: ( ( ruleNoAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4895:1: ( ruleNoAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4895:1: ( ruleNoAncientExpanded )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4896:1: ruleNoAncientExpanded
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_29923);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4905:1: rule__RestorationOverRasur__WCharAssignment_2 : ( ruleNoRestorationOverRasur ) ;
    public final void rule__RestorationOverRasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4909:1: ( ( ruleNoRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4910:1: ( ruleNoRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4910:1: ( ruleNoRestorationOverRasur )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4911:1: ruleNoRestorationOverRasur
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_29954);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4920:1: rule__PartialDestruction__WCharAssignment_2 : ( ruleNoPartialDestruction ) ;
    public final void rule__PartialDestruction__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4924:1: ( ( ruleNoPartialDestruction ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4925:1: ( ruleNoPartialDestruction )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4925:1: ( ruleNoPartialDestruction )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4926:1: ruleNoPartialDestruction
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_29985);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4935:1: rule__Destruction__CommentAssignment_2 : ( RULE_EGYSTRING ) ;
    public final void rule__Destruction__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4939:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4940:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4940:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4941:1: RULE_EGYSTRING
            {
             before(grammarAccess.getDestructionAccess().getCommentEGYSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_rule__Destruction__CommentAssignment_210016); 
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


 

    
    private static class FollowSets000 {
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
        public static final BitSet FOLLOW_ruleVersMarker_in_entryRuleVersMarker480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersMarker487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersMarker__Alternatives_in_ruleVersMarker513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersFrontierMarker547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleVersFrontierMarker574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersbreakMarker609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleVersbreakMarker636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_entryRuleMarker664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMarker671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__Group__0_in_ruleMarker697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_entryRuleWord724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWord731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group__0_in_ruleWord757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_entryRuleChars844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChars851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Chars__NameAssignment_in_ruleChars877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_entryRuleInterfix904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfix911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Interfix__Alternatives_in_ruleInterfix937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixLexical_in_entryRuleInterfixLexical964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixLexical971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixLexical__Group__0_in_ruleInterfixLexical997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixFlexion_in_entryRuleInterfixFlexion1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixFlexion1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixFlexion__Group__0_in_ruleInterfixFlexion1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_entryRuleInterfixSuffixPronomLexical1084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixSuffixPronomLexical1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__0_in_ruleInterfixSuffixPronomLexical1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_entryRuleInterfixPrefixNonLexical1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixNonLexical1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__0_in_ruleInterfixPrefixNonLexical1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_entryRuleInterfixPrefixLexical1204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixPrefixLexical1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__0_in_ruleInterfixPrefixLexical1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixCompountWords_in_entryRuleInterfixCompountWords1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixCompountWords1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixCompountWords__Group__0_in_ruleInterfixCompountWords1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_entryRuleInterfixConnectionSyllabicGroup1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfixConnectionSyllabicGroup1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0_in_ruleInterfixConnectionSyllabicGroup1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded1444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpanded1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__0_in_ruleExpanded1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded1504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded1511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoExpanded__Alternatives_in_ruleNoExpanded1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation1564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmendation1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__0_in_ruleEmendation1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation1624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading1684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading1744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading1777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna1804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLacuna1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna1837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna1864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion1924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeletion1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__0_in_ruleDeletion1957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion1984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion2017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn2044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn2051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn2104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn2137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur2164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRasur2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__0_in_ruleRasur2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur2224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded2284 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoAncientExpanded2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur2403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur2410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur2463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoRestorationOverRasur2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction2522 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction2582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction2589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoPartialDestruction2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_entryRuleDestruction2641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDestruction2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__0_in_ruleDestruction2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives2776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__WordMiddle__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives2891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixFlexion_in_rule__Interfix__Alternatives2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixLexical_in_rule__Interfix__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixSuffixPronomLexical_in_rule__Interfix__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixNonLexical_in_rule__Interfix__Alternatives2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixPrefixLexical_in_rule__Interfix__Alternatives3008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixCompountWords_in_rule__Interfix__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfixConnectionSyllabicGroup_in_rule__Interfix__Alternatives3042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_rule__Brackets__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives3125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives3159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives3227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_rule__Brackets__Alternatives3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoExpanded__Alternatives3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoExpanded__Alternatives3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoExpanded__Alternatives3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoEmendation__Alternatives3342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives3359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_rule__NoEmendation__Alternatives3376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives3393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoDisputableReading__Alternatives3425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives3442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives3459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoLacuna__Alternatives3491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoDeletion__Alternatives3557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives3574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoExpandedColumn__Alternatives3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfix_in_rule__NoRasur__Alternatives3655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoRasur__Alternatives3672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__03702 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__03705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__13763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__03824 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__03827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__13884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_1_in_rule__TextContent__Group_1__1__Impl3911 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__03946 = new BitSet(new long[]{0x0000AAAB5FF13010L});
        public static final BitSet FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__03949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Sentence__Group__0__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__14008 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__14011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1__0_in_rule__Sentence__Group__1__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__24068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Sentence__Group__2__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1__0__Impl_in_rule__Sentence__Group_1__04133 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1__1_in_rule__Sentence__Group_1__04136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_1_0_in_rule__Sentence__Group_1__0__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1__1__Impl_in_rule__Sentence__Group_1__14193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1_1__0_in_rule__Sentence__Group_1__1__Impl4220 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1_1__0__Impl_in_rule__Sentence__Group_1_1__04255 = new BitSet(new long[]{0x0000AAAB5FF13010L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1_1__1_in_rule__Sentence__Group_1_1__04258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Sentence__Group_1_1__0__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_1_1__1__Impl_in_rule__Sentence__Group_1_1__14317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_1_1_1_in_rule__Sentence__Group_1_1__1__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__04378 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__04381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Ambivalence__Group__0__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__14440 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__14443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__24500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Ambivalence__Group__2__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__04565 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__04568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__14625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl4652 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__04687 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__04690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Ambivalence__Group_1_1__0__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__14749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_1_1_in_rule__Ambivalence__Group_1_1__1__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__04810 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__04813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Case__Group__0__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__14872 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__14875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__NameAssignment_1_in_rule__Case__Group__1__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__24932 = new BitSet(new long[]{0x0000AAAB5FF13010L});
        public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__24935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Case__Group__2__Impl4963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__34994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_3__0_in_rule__Case__Group__3__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_3__0__Impl_in_rule__Case__Group_3__05059 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Case__Group_3__1_in_rule__Case__Group_3__05062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__ItemsAssignment_3_0_in_rule__Case__Group_3__0__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_3__1__Impl_in_rule__Case__Group_3__15119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_3_1__0_in_rule__Case__Group_3__1__Impl5146 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Case__Group_3_1__0__Impl_in_rule__Case__Group_3_1__05181 = new BitSet(new long[]{0x0000AAAB5FF13010L});
        public static final BitSet FOLLOW_rule__Case__Group_3_1__1_in_rule__Case__Group_3_1__05184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Case__Group_3_1__0__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_3_1__1__Impl_in_rule__Case__Group_3_1__15243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__ItemsAssignment_3_1_1_in_rule__Case__Group_3_1__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__Group__0__Impl_in_rule__Marker__Group__05304 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Marker__Group__1_in_rule__Marker__Group__05307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Marker__Group__0__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__Group__1__Impl_in_rule__Marker__Group__15366 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Marker__Group__2_in_rule__Marker__Group__15369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__TypeAssignment_1_in_rule__Marker__Group__1__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__Group__2__Impl_in_rule__Marker__Group__25426 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Marker__Group__3_in_rule__Marker__Group__25429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__NameAssignment_2_in_rule__Marker__Group__2__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Marker__Group__3__Impl_in_rule__Marker__Group__35486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Marker__Group__3__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__05553 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__Word__Group__1_in_rule__Word__Group__05556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__15614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_in_rule__Word__Group__1__Impl5641 = new BitSet(new long[]{0x0000AAAB5FE00012L});
        public static final BitSet FOLLOW_rule__InterfixLexical__Group__0__Impl_in_rule__InterfixLexical__Group__05676 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__InterfixLexical__Group__1_in_rule__InterfixLexical__Group__05679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixLexical__Group__1__Impl_in_rule__InterfixLexical__Group__15737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__InterfixLexical__Group__1__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixFlexion__Group__0__Impl_in_rule__InterfixFlexion__Group__05800 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__InterfixFlexion__Group__1_in_rule__InterfixFlexion__Group__05803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixFlexion__Group__1__Impl_in_rule__InterfixFlexion__Group__15861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InterfixFlexion__Group__1__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__0__Impl_in_rule__InterfixSuffixPronomLexical__Group__05924 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__1_in_rule__InterfixSuffixPronomLexical__Group__05927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixSuffixPronomLexical__Group__1__Impl_in_rule__InterfixSuffixPronomLexical__Group__15985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__InterfixSuffixPronomLexical__Group__1__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__0__Impl_in_rule__InterfixPrefixNonLexical__Group__06048 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__1_in_rule__InterfixPrefixNonLexical__Group__06051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixPrefixNonLexical__Group__1__Impl_in_rule__InterfixPrefixNonLexical__Group__16109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__InterfixPrefixNonLexical__Group__1__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__0__Impl_in_rule__InterfixPrefixLexical__Group__06172 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__1_in_rule__InterfixPrefixLexical__Group__06175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixPrefixLexical__Group__1__Impl_in_rule__InterfixPrefixLexical__Group__16233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__InterfixPrefixLexical__Group__1__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixCompountWords__Group__0__Impl_in_rule__InterfixCompountWords__Group__06296 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__InterfixCompountWords__Group__1_in_rule__InterfixCompountWords__Group__06299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixCompountWords__Group__1__Impl_in_rule__InterfixCompountWords__Group__16357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InterfixCompountWords__Group__1__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__0__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__06420 = new BitSet(new long[]{0x000000000FE00000L});
        public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1_in_rule__InterfixConnectionSyllabicGroup__Group__06423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InterfixConnectionSyllabicGroup__Group__1__Impl_in_rule__InterfixConnectionSyllabicGroup__Group__16481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__InterfixConnectionSyllabicGroup__Group__1__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__06544 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__06547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__16605 = new BitSet(new long[]{0x0000AAAB7FE00010L});
        public static final BitSet FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__16608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Expanded__Group__1__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__26667 = new BitSet(new long[]{0x0000AAAB7FE00010L});
        public static final BitSet FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__26670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl6697 = new BitSet(new long[]{0x0000AAAB5FE00012L});
        public static final BitSet FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__36728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Expanded__Group__3__Impl6756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__06795 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__06798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__16856 = new BitSet(new long[]{0x0000AAABDFE00010L});
        public static final BitSet FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__16859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Emendation__Group__1__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__26918 = new BitSet(new long[]{0x0000AAABDFE00010L});
        public static final BitSet FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__26921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl6948 = new BitSet(new long[]{0x0000AAAB5FE00012L});
        public static final BitSet FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__36979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Emendation__Group__3__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__07046 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__07049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__17107 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__17110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__DisputableReading__Group__1__Impl7138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__27169 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__27172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl7199 = new BitSet(new long[]{0x0000AAAB5FE00012L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__37230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__DisputableReading__Group__3__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__07297 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__07300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__17358 = new BitSet(new long[]{0x0000AAAF5FE00010L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__17361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Lacuna__Group__1__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__27420 = new BitSet(new long[]{0x0000AAAF5FE00010L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__27423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl7450 = new BitSet(new long[]{0x0000AAAB5FE00012L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__37481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Lacuna__Group__3__Impl7509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__07548 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__07551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__17609 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__17612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Deletion__Group__1__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__27671 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__27674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl7701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__37731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Deletion__Group__3__Impl7759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__07798 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__07801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__17859 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__17862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ExpandedColumn__Group__1__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__27921 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__27924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__37981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ExpandedColumn__Group__3__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__08048 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__08051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__18109 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__18112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Rasur__Group__1__Impl8140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__28171 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__28174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__38231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Rasur__Group__3__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__08298 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__08301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__18359 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__18362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__AncientExpanded__Group__1__Impl8390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__28421 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__28424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl8451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__38481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__AncientExpanded__Group__3__Impl8509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__08548 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__08551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__18609 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__18612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__RestorationOverRasur__Group__1__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__28671 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__28674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__38731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__RestorationOverRasur__Group__3__Impl8759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__08798 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__08801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__18859 = new BitSet(new long[]{0x0000AAAB5FE00010L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__18862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__PartialDestruction__Group__1__Impl8890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__28921 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__28924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl8951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__38981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__PartialDestruction__Group__3__Impl9009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__0__Impl_in_rule__Destruction__Group__09048 = new BitSet(new long[]{0x0000AAAB50000000L});
        public static final BitSet FOLLOW_rule__Destruction__Group__1_in_rule__Destruction__Group__09051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__1__Impl_in_rule__Destruction__Group__19109 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Destruction__Group__2_in_rule__Destruction__Group__19112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Destruction__Group__1__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__2__Impl_in_rule__Destruction__Group__29171 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Destruction__Group__3_in_rule__Destruction__Group__29174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__CommentAssignment_2_in_rule__Destruction__Group__2__Impl9201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__3__Impl_in_rule__Destruction__Group__39231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Destruction__Group__3__Impl9259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_09303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_19334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_09365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_1_1_19396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_09427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_19458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Case__NameAssignment_19489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Case__ItemsAssignment_3_09520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Case__ItemsAssignment_3_1_19551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Marker__TypeAssignment_19582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Marker__NameAssignment_29613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_rule__Word__WCharAssignment_19644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment9675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_29706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_29737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_29768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_29799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_29830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_29861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_29892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_29923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_29954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_29985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Destruction__CommentAssignment_210016 = new BitSet(new long[]{0x0000000000000002L});
    }


}