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


    // $ANTLR start "entryRuleSentenceItemNoAmbivalence"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:256:1: entryRuleSentenceItemNoAmbivalence : ruleSentenceItemNoAmbivalence EOF ;
    public final void entryRuleSentenceItemNoAmbivalence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:257:1: ( ruleSentenceItemNoAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:258:1: ruleSentenceItemNoAmbivalence EOF
            {
             before(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItemNoAmbivalence_in_entryRuleSentenceItemNoAmbivalence480);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentenceItemNoAmbivalence487); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:265:1: ruleSentenceItemNoAmbivalence : ( ( rule__SentenceItemNoAmbivalence__Alternatives ) ) ;
    public final void ruleSentenceItemNoAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:269:2: ( ( ( rule__SentenceItemNoAmbivalence__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:270:1: ( ( rule__SentenceItemNoAmbivalence__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:270:1: ( ( rule__SentenceItemNoAmbivalence__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:271:1: ( rule__SentenceItemNoAmbivalence__Alternatives )
            {
             before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:272:1: ( rule__SentenceItemNoAmbivalence__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:272:2: rule__SentenceItemNoAmbivalence__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SentenceItemNoAmbivalence__Alternatives_in_ruleSentenceItemNoAmbivalence513);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:284:1: entryRuleVersMarker : ruleVersMarker EOF ;
    public final void entryRuleVersMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:285:1: ( ruleVersMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:286:1: ruleVersMarker EOF
            {
             before(grammarAccess.getVersMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_entryRuleVersMarker540);
            ruleVersMarker();

            state._fsp--;

             after(grammarAccess.getVersMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersMarker547); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:293:1: ruleVersMarker : ( ( rule__VersMarker__Alternatives ) ) ;
    public final void ruleVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:297:2: ( ( ( rule__VersMarker__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:298:1: ( ( rule__VersMarker__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:298:1: ( ( rule__VersMarker__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:299:1: ( rule__VersMarker__Alternatives )
            {
             before(grammarAccess.getVersMarkerAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:300:1: ( rule__VersMarker__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:300:2: rule__VersMarker__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersMarker__Alternatives_in_ruleVersMarker573);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:312:1: entryRuleVersFrontierMarker : ruleVersFrontierMarker EOF ;
    public final void entryRuleVersFrontierMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:313:1: ( ruleVersFrontierMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:314:1: ruleVersFrontierMarker EOF
            {
             before(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_entryRuleVersFrontierMarker600);
            ruleVersFrontierMarker();

            state._fsp--;

             after(grammarAccess.getVersFrontierMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersFrontierMarker607); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:321:1: ruleVersFrontierMarker : ( ( rule__VersFrontierMarker__Group__0 ) ) ;
    public final void ruleVersFrontierMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:325:2: ( ( ( rule__VersFrontierMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:326:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:326:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:327:1: ( rule__VersFrontierMarker__Group__0 )
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:328:1: ( rule__VersFrontierMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:328:2: rule__VersFrontierMarker__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersFrontierMarker__Group__0_in_ruleVersFrontierMarker633);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:340:1: entryRuleVersbreakMarker : ruleVersbreakMarker EOF ;
    public final void entryRuleVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:341:1: ( ruleVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:342:1: ruleVersbreakMarker EOF
            {
             before(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_entryRuleVersbreakMarker660);
            ruleVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getVersbreakMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersbreakMarker667); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:349:1: ruleVersbreakMarker : ( ( rule__VersbreakMarker__Group__0 ) ) ;
    public final void ruleVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:353:2: ( ( ( rule__VersbreakMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:354:1: ( ( rule__VersbreakMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:354:1: ( ( rule__VersbreakMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:355:1: ( rule__VersbreakMarker__Group__0 )
            {
             before(grammarAccess.getVersbreakMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:356:1: ( rule__VersbreakMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:356:2: rule__VersbreakMarker__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersbreakMarker__Group__0_in_ruleVersbreakMarker693);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:368:1: entryRuleBrokenVersbreakMarker : ruleBrokenVersbreakMarker EOF ;
    public final void entryRuleBrokenVersbreakMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:369:1: ( ruleBrokenVersbreakMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:370:1: ruleBrokenVersbreakMarker EOF
            {
             before(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrokenVersbreakMarker_in_entryRuleBrokenVersbreakMarker720);
            ruleBrokenVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getBrokenVersbreakMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrokenVersbreakMarker727); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:377:1: ruleBrokenVersbreakMarker : ( ( rule__BrokenVersbreakMarker__Group__0 ) ) ;
    public final void ruleBrokenVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:381:2: ( ( ( rule__BrokenVersbreakMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:382:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:382:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:383:1: ( rule__BrokenVersbreakMarker__Group__0 )
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:384:1: ( rule__BrokenVersbreakMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:384:2: rule__BrokenVersbreakMarker__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BrokenVersbreakMarker__Group__0_in_ruleBrokenVersbreakMarker753);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:396:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:397:1: ( ruleMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:398:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMarker_in_entryRuleMarker780);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMarker787); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:405:1: ruleMarker : ( ( rule__Marker__TypeAssignment ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:409:2: ( ( ( rule__Marker__TypeAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:410:1: ( ( rule__Marker__TypeAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:410:1: ( ( rule__Marker__TypeAssignment ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:411:1: ( rule__Marker__TypeAssignment )
            {
             before(grammarAccess.getMarkerAccess().getTypeAssignment()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:412:1: ( rule__Marker__TypeAssignment )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:412:2: rule__Marker__TypeAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Marker__TypeAssignment_in_ruleMarker813);
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


    // $ANTLR start "entryRuleWord"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:424:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:425:1: ( ruleWord EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:426:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWord_in_entryRuleWord840);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWord847); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:433:1: ruleWord : ( ( rule__Word__Group__0 ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:437:2: ( ( ( rule__Word__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:438:1: ( ( rule__Word__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:438:1: ( ( rule__Word__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:439:1: ( rule__Word__Group__0 )
            {
             before(grammarAccess.getWordAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:440:1: ( rule__Word__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:440:2: rule__Word__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__0_in_ruleWord873);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:452:1: entryRuleWordPart : ruleWordPart EOF ;
    public final void entryRuleWordPart() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:453:1: ( ruleWordPart EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:454:1: ruleWordPart EOF
            {
             before(grammarAccess.getWordPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordPart_in_entryRuleWordPart900);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWordPart907); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:461:1: ruleWordPart : ( ( rule__WordPart__Group__0 ) ) ;
    public final void ruleWordPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:465:2: ( ( ( rule__WordPart__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:466:1: ( ( rule__WordPart__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:466:1: ( ( rule__WordPart__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:467:1: ( rule__WordPart__Group__0 )
            {
             before(grammarAccess.getWordPartAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:468:1: ( rule__WordPart__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:468:2: rule__WordPart__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group__0_in_ruleWordPart933);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:480:1: entryRuleWordMiddle : ruleWordMiddle EOF ;
    public final void entryRuleWordMiddle() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:481:1: ( ruleWordMiddle EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:482:1: ruleWordMiddle EOF
            {
             before(grammarAccess.getWordMiddleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle960);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordMiddleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWordMiddle967); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:489:1: ruleWordMiddle : ( ( rule__WordMiddle__Alternatives ) ) ;
    public final void ruleWordMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:493:2: ( ( ( rule__WordMiddle__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:494:1: ( ( rule__WordMiddle__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:494:1: ( ( rule__WordMiddle__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:495:1: ( rule__WordMiddle__Alternatives )
            {
             before(grammarAccess.getWordMiddleAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:496:1: ( rule__WordMiddle__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:496:2: rule__WordMiddle__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle993);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:508:1: entryRuleChars : ruleChars EOF ;
    public final void entryRuleChars() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:509:1: ( ruleChars EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:510:1: ruleChars EOF
            {
             before(grammarAccess.getCharsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_entryRuleChars1020);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getCharsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChars1027); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:517:1: ruleChars : ( ( rule__Chars__NameAssignment ) ) ;
    public final void ruleChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:521:2: ( ( ( rule__Chars__NameAssignment ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:522:1: ( ( rule__Chars__NameAssignment ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:522:1: ( ( rule__Chars__NameAssignment ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:523:1: ( rule__Chars__NameAssignment )
            {
             before(grammarAccess.getCharsAccess().getNameAssignment()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:524:1: ( rule__Chars__NameAssignment )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:524:2: rule__Chars__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Chars__NameAssignment_in_ruleChars1053);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:536:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:537:1: ( ruleBrackets EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:538:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_entryRuleBrackets1080);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrackets1087); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:545:1: ruleBrackets : ( ( rule__Brackets__Alternatives ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:549:2: ( ( ( rule__Brackets__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:550:1: ( ( rule__Brackets__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:550:1: ( ( rule__Brackets__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:551:1: ( rule__Brackets__Alternatives )
            {
             before(grammarAccess.getBracketsAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:552:1: ( rule__Brackets__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:552:2: rule__Brackets__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets1113);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:564:1: entryRuleExpanded : ruleExpanded EOF ;
    public final void entryRuleExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:565:1: ( ruleExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:566:1: ruleExpanded EOF
            {
             before(grammarAccess.getExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_entryRuleExpanded1140);
            ruleExpanded();

            state._fsp--;

             after(grammarAccess.getExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpanded1147); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:573:1: ruleExpanded : ( ( rule__Expanded__Group__0 ) ) ;
    public final void ruleExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:577:2: ( ( ( rule__Expanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:578:1: ( ( rule__Expanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:578:1: ( ( rule__Expanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:579:1: ( rule__Expanded__Group__0 )
            {
             before(grammarAccess.getExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:580:1: ( rule__Expanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:580:2: rule__Expanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__0_in_ruleExpanded1173);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:592:1: entryRuleNoExpanded : ruleNoExpanded EOF ;
    public final void entryRuleNoExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:593:1: ( ruleNoExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:594:1: ruleNoExpanded EOF
            {
             before(grammarAccess.getNoExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded1200);
            ruleNoExpanded();

            state._fsp--;

             after(grammarAccess.getNoExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpanded1207); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:601:1: ruleNoExpanded : ( ruleChars ) ;
    public final void ruleNoExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:605:2: ( ( ruleChars ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:606:1: ( ruleChars )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:606:1: ( ruleChars )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:607:1: ruleChars
            {
             before(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleChars_in_ruleNoExpanded1233);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:620:1: entryRuleEmendation : ruleEmendation EOF ;
    public final void entryRuleEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:621:1: ( ruleEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:622:1: ruleEmendation EOF
            {
             before(grammarAccess.getEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_entryRuleEmendation1259);
            ruleEmendation();

            state._fsp--;

             after(grammarAccess.getEmendationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmendation1266); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:629:1: ruleEmendation : ( ( rule__Emendation__Group__0 ) ) ;
    public final void ruleEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:633:2: ( ( ( rule__Emendation__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:634:1: ( ( rule__Emendation__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:634:1: ( ( rule__Emendation__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:635:1: ( rule__Emendation__Group__0 )
            {
             before(grammarAccess.getEmendationAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:636:1: ( rule__Emendation__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:636:2: rule__Emendation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__0_in_ruleEmendation1292);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:648:1: entryRuleNoEmendation : ruleNoEmendation EOF ;
    public final void entryRuleNoEmendation() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:649:1: ( ruleNoEmendation EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:650:1: ruleNoEmendation EOF
            {
             before(grammarAccess.getNoEmendationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation1319);
            ruleNoEmendation();

            state._fsp--;

             after(grammarAccess.getNoEmendationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoEmendation1326); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:657:1: ruleNoEmendation : ( ( rule__NoEmendation__Alternatives ) ) ;
    public final void ruleNoEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:661:2: ( ( ( rule__NoEmendation__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:662:1: ( ( rule__NoEmendation__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:662:1: ( ( rule__NoEmendation__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:663:1: ( rule__NoEmendation__Alternatives )
            {
             before(grammarAccess.getNoEmendationAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:664:1: ( rule__NoEmendation__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:664:2: rule__NoEmendation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation1352);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:676:1: entryRuleDisputableReading : ruleDisputableReading EOF ;
    public final void entryRuleDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:677:1: ( ruleDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:678:1: ruleDisputableReading EOF
            {
             before(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading1379);
            ruleDisputableReading();

            state._fsp--;

             after(grammarAccess.getDisputableReadingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDisputableReading1386); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:685:1: ruleDisputableReading : ( ( rule__DisputableReading__Group__0 ) ) ;
    public final void ruleDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:689:2: ( ( ( rule__DisputableReading__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:690:1: ( ( rule__DisputableReading__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:690:1: ( ( rule__DisputableReading__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:691:1: ( rule__DisputableReading__Group__0 )
            {
             before(grammarAccess.getDisputableReadingAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:692:1: ( rule__DisputableReading__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:692:2: rule__DisputableReading__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading1412);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:704:1: entryRuleNoDisputableReading : ruleNoDisputableReading EOF ;
    public final void entryRuleNoDisputableReading() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:705:1: ( ruleNoDisputableReading EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:706:1: ruleNoDisputableReading EOF
            {
             before(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading1439);
            ruleNoDisputableReading();

            state._fsp--;

             after(grammarAccess.getNoDisputableReadingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDisputableReading1446); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:713:1: ruleNoDisputableReading : ( ( rule__NoDisputableReading__Alternatives ) ) ;
    public final void ruleNoDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:717:2: ( ( ( rule__NoDisputableReading__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:718:1: ( ( rule__NoDisputableReading__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:718:1: ( ( rule__NoDisputableReading__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:719:1: ( rule__NoDisputableReading__Alternatives )
            {
             before(grammarAccess.getNoDisputableReadingAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:720:1: ( rule__NoDisputableReading__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:720:2: rule__NoDisputableReading__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading1472);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:732:1: entryRuleLacuna : ruleLacuna EOF ;
    public final void entryRuleLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:733:1: ( ruleLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:734:1: ruleLacuna EOF
            {
             before(grammarAccess.getLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_entryRuleLacuna1499);
            ruleLacuna();

            state._fsp--;

             after(grammarAccess.getLacunaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLacuna1506); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:741:1: ruleLacuna : ( ( rule__Lacuna__Group__0 ) ) ;
    public final void ruleLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:745:2: ( ( ( rule__Lacuna__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:746:1: ( ( rule__Lacuna__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:746:1: ( ( rule__Lacuna__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:747:1: ( rule__Lacuna__Group__0 )
            {
             before(grammarAccess.getLacunaAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:748:1: ( rule__Lacuna__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:748:2: rule__Lacuna__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna1532);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:760:1: entryRuleNoLacuna : ruleNoLacuna EOF ;
    public final void entryRuleNoLacuna() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:761:1: ( ruleNoLacuna EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:762:1: ruleNoLacuna EOF
            {
             before(grammarAccess.getNoLacunaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna1559);
            ruleNoLacuna();

            state._fsp--;

             after(grammarAccess.getNoLacunaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoLacuna1566); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:769:1: ruleNoLacuna : ( ( rule__NoLacuna__Alternatives ) ) ;
    public final void ruleNoLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:773:2: ( ( ( rule__NoLacuna__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:774:1: ( ( rule__NoLacuna__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:774:1: ( ( rule__NoLacuna__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:775:1: ( rule__NoLacuna__Alternatives )
            {
             before(grammarAccess.getNoLacunaAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:776:1: ( rule__NoLacuna__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:776:2: rule__NoLacuna__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna1592);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:788:1: entryRuleDeletion : ruleDeletion EOF ;
    public final void entryRuleDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:789:1: ( ruleDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:790:1: ruleDeletion EOF
            {
             before(grammarAccess.getDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_entryRuleDeletion1619);
            ruleDeletion();

            state._fsp--;

             after(grammarAccess.getDeletionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeletion1626); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:797:1: ruleDeletion : ( ( rule__Deletion__Group__0 ) ) ;
    public final void ruleDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:801:2: ( ( ( rule__Deletion__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:802:1: ( ( rule__Deletion__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:802:1: ( ( rule__Deletion__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:803:1: ( rule__Deletion__Group__0 )
            {
             before(grammarAccess.getDeletionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:804:1: ( rule__Deletion__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:804:2: rule__Deletion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__0_in_ruleDeletion1652);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:816:1: entryRuleNoDeletion : ruleNoDeletion EOF ;
    public final void entryRuleNoDeletion() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:817:1: ( ruleNoDeletion EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:818:1: ruleNoDeletion EOF
            {
             before(grammarAccess.getNoDeletionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion1679);
            ruleNoDeletion();

            state._fsp--;

             after(grammarAccess.getNoDeletionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoDeletion1686); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:825:1: ruleNoDeletion : ( ( rule__NoDeletion__Alternatives ) ) ;
    public final void ruleNoDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:829:2: ( ( ( rule__NoDeletion__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:830:1: ( ( rule__NoDeletion__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:830:1: ( ( rule__NoDeletion__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:831:1: ( rule__NoDeletion__Alternatives )
            {
             before(grammarAccess.getNoDeletionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:832:1: ( rule__NoDeletion__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:832:2: rule__NoDeletion__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion1712);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:844:1: entryRuleExpandedColumn : ruleExpandedColumn EOF ;
    public final void entryRuleExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:845:1: ( ruleExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:846:1: ruleExpandedColumn EOF
            {
             before(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn1739);
            ruleExpandedColumn();

            state._fsp--;

             after(grammarAccess.getExpandedColumnRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpandedColumn1746); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:853:1: ruleExpandedColumn : ( ( rule__ExpandedColumn__Group__0 ) ) ;
    public final void ruleExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:857:2: ( ( ( rule__ExpandedColumn__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:858:1: ( ( rule__ExpandedColumn__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:858:1: ( ( rule__ExpandedColumn__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:859:1: ( rule__ExpandedColumn__Group__0 )
            {
             before(grammarAccess.getExpandedColumnAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:860:1: ( rule__ExpandedColumn__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:860:2: rule__ExpandedColumn__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn1772);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:872:1: entryRuleNoExpandedColumn : ruleNoExpandedColumn EOF ;
    public final void entryRuleNoExpandedColumn() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:873:1: ( ruleNoExpandedColumn EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:874:1: ruleNoExpandedColumn EOF
            {
             before(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn1799);
            ruleNoExpandedColumn();

            state._fsp--;

             after(grammarAccess.getNoExpandedColumnRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoExpandedColumn1806); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:881:1: ruleNoExpandedColumn : ( ( rule__NoExpandedColumn__Alternatives ) ) ;
    public final void ruleNoExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:885:2: ( ( ( rule__NoExpandedColumn__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:886:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:886:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:887:1: ( rule__NoExpandedColumn__Alternatives )
            {
             before(grammarAccess.getNoExpandedColumnAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:888:1: ( rule__NoExpandedColumn__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:888:2: rule__NoExpandedColumn__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn1832);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:900:1: entryRuleRasur : ruleRasur EOF ;
    public final void entryRuleRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:901:1: ( ruleRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:902:1: ruleRasur EOF
            {
             before(grammarAccess.getRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRasur_in_entryRuleRasur1859);
            ruleRasur();

            state._fsp--;

             after(grammarAccess.getRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRasur1866); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:909:1: ruleRasur : ( ( rule__Rasur__Group__0 ) ) ;
    public final void ruleRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:913:2: ( ( ( rule__Rasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:914:1: ( ( rule__Rasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:914:1: ( ( rule__Rasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:915:1: ( rule__Rasur__Group__0 )
            {
             before(grammarAccess.getRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:916:1: ( rule__Rasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:916:2: rule__Rasur__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__0_in_ruleRasur1892);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:928:1: entryRuleNoRasur : ruleNoRasur EOF ;
    public final void entryRuleNoRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:929:1: ( ruleNoRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:930:1: ruleNoRasur EOF
            {
             before(grammarAccess.getNoRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_entryRuleNoRasur1919);
            ruleNoRasur();

            state._fsp--;

             after(grammarAccess.getNoRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRasur1926); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:937:1: ruleNoRasur : ( ( rule__NoRasur__Alternatives ) ) ;
    public final void ruleNoRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:941:2: ( ( ( rule__NoRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:942:1: ( ( rule__NoRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:942:1: ( ( rule__NoRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:943:1: ( rule__NoRasur__Alternatives )
            {
             before(grammarAccess.getNoRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:944:1: ( rule__NoRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:944:2: rule__NoRasur__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur1952);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:956:1: entryRuleAncientExpanded : ruleAncientExpanded EOF ;
    public final void entryRuleAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:957:1: ( ruleAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:958:1: ruleAncientExpanded EOF
            {
             before(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded1979);
            ruleAncientExpanded();

            state._fsp--;

             after(grammarAccess.getAncientExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAncientExpanded1986); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:965:1: ruleAncientExpanded : ( ( rule__AncientExpanded__Group__0 ) ) ;
    public final void ruleAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:969:2: ( ( ( rule__AncientExpanded__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:970:1: ( ( rule__AncientExpanded__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:970:1: ( ( rule__AncientExpanded__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:971:1: ( rule__AncientExpanded__Group__0 )
            {
             before(grammarAccess.getAncientExpandedAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:972:1: ( rule__AncientExpanded__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:972:2: rule__AncientExpanded__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2012);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:984:1: entryRuleNoAncientExpanded : ruleNoAncientExpanded EOF ;
    public final void entryRuleNoAncientExpanded() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:985:1: ( ruleNoAncientExpanded EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:986:1: ruleNoAncientExpanded EOF
            {
             before(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2039);
            ruleNoAncientExpanded();

            state._fsp--;

             after(grammarAccess.getNoAncientExpandedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAncientExpanded2046); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:993:1: ruleNoAncientExpanded : ( ( rule__NoAncientExpanded__Alternatives ) ) ;
    public final void ruleNoAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:997:2: ( ( ( rule__NoAncientExpanded__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:998:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:998:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:999:1: ( rule__NoAncientExpanded__Alternatives )
            {
             before(grammarAccess.getNoAncientExpandedAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1000:1: ( rule__NoAncientExpanded__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1000:2: rule__NoAncientExpanded__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoAncientExpanded__Alternatives_in_ruleNoAncientExpanded2072);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1012:1: entryRuleRestorationOverRasur : ruleRestorationOverRasur EOF ;
    public final void entryRuleRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1013:1: ( ruleRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1014:1: ruleRestorationOverRasur EOF
            {
             before(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur2099);
            ruleRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestorationOverRasur2106); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1021:1: ruleRestorationOverRasur : ( ( rule__RestorationOverRasur__Group__0 ) ) ;
    public final void ruleRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1025:2: ( ( ( rule__RestorationOverRasur__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1026:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1026:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1027:1: ( rule__RestorationOverRasur__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1028:1: ( rule__RestorationOverRasur__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1028:2: rule__RestorationOverRasur__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur2132);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1040:1: entryRuleNoRestorationOverRasur : ruleNoRestorationOverRasur EOF ;
    public final void entryRuleNoRestorationOverRasur() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1041:1: ( ruleNoRestorationOverRasur EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1042:1: ruleNoRestorationOverRasur EOF
            {
             before(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur2159);
            ruleNoRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getNoRestorationOverRasurRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoRestorationOverRasur2166); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1049:1: ruleNoRestorationOverRasur : ( ( rule__NoRestorationOverRasur__Alternatives ) ) ;
    public final void ruleNoRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1053:2: ( ( ( rule__NoRestorationOverRasur__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1054:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1054:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1055:1: ( rule__NoRestorationOverRasur__Alternatives )
            {
             before(grammarAccess.getNoRestorationOverRasurAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1056:1: ( rule__NoRestorationOverRasur__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1056:2: rule__NoRestorationOverRasur__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoRestorationOverRasur__Alternatives_in_ruleNoRestorationOverRasur2192);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1068:1: entryRulePartialDestruction : rulePartialDestruction EOF ;
    public final void entryRulePartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1069:1: ( rulePartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1070:1: rulePartialDestruction EOF
            {
             before(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction2219);
            rulePartialDestruction();

            state._fsp--;

             after(grammarAccess.getPartialDestructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePartialDestruction2226); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1077:1: rulePartialDestruction : ( ( rule__PartialDestruction__Group__0 ) ) ;
    public final void rulePartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1081:2: ( ( ( rule__PartialDestruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1082:1: ( ( rule__PartialDestruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1082:1: ( ( rule__PartialDestruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1083:1: ( rule__PartialDestruction__Group__0 )
            {
             before(grammarAccess.getPartialDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1084:1: ( rule__PartialDestruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1084:2: rule__PartialDestruction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction2252);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1096:1: entryRuleNoPartialDestruction : ruleNoPartialDestruction EOF ;
    public final void entryRuleNoPartialDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1097:1: ( ruleNoPartialDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1098:1: ruleNoPartialDestruction EOF
            {
             before(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction2279);
            ruleNoPartialDestruction();

            state._fsp--;

             after(grammarAccess.getNoPartialDestructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoPartialDestruction2286); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1105:1: ruleNoPartialDestruction : ( ( rule__NoPartialDestruction__Alternatives ) ) ;
    public final void ruleNoPartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1109:2: ( ( ( rule__NoPartialDestruction__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1110:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1110:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1111:1: ( rule__NoPartialDestruction__Alternatives )
            {
             before(grammarAccess.getNoPartialDestructionAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1112:1: ( rule__NoPartialDestruction__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1112:2: rule__NoPartialDestruction__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NoPartialDestruction__Alternatives_in_ruleNoPartialDestruction2312);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1124:1: entryRuleDestruction : ruleDestruction EOF ;
    public final void entryRuleDestruction() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1125:1: ( ruleDestruction EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1126:1: ruleDestruction EOF
            {
             before(grammarAccess.getDestructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_entryRuleDestruction2339);
            ruleDestruction();

            state._fsp--;

             after(grammarAccess.getDestructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDestruction2346); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1133:1: ruleDestruction : ( ( rule__Destruction__Group__0 ) ) ;
    public final void ruleDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1137:2: ( ( ( rule__Destruction__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1138:1: ( ( rule__Destruction__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1138:1: ( ( rule__Destruction__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1139:1: ( rule__Destruction__Group__0 )
            {
             before(grammarAccess.getDestructionAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1140:1: ( rule__Destruction__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1140:2: rule__Destruction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__0_in_ruleDestruction2372);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1152:1: rule__TextContent__Alternatives_1_1_0 : ( ( ' ' ) | ( RULE_NEWLINE ) );
    public final void rule__TextContent__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1156:1: ( ( ' ' ) | ( RULE_NEWLINE ) )
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1157:1: ( ' ' )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1157:1: ( ' ' )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1158:1: ' '
                    {
                     before(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TextContent__Alternatives_1_1_02409); 
                     after(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1165:6: ( RULE_NEWLINE )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1165:6: ( RULE_NEWLINE )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1166:1: RULE_NEWLINE
                    {
                     before(grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_rule__TextContent__Alternatives_1_1_02428); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1176:1: rule__SentenceItem__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) );
    public final void rule__SentenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1180:1: ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) )
            int alt2=3;
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
                alt2=1;
                }
                break;
            case RULE_BETWEEN_HASHES:
            case 20:
            case 21:
            case 22:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1181:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1181:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1182:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives2460);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1187:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1187:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1188:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives2477);
                    ruleAbstractMarker();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1193:6: ( ruleAmbivalence )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1193:6: ( ruleAmbivalence )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1194:1: ruleAmbivalence
                    {
                     before(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives2494);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1204:1: rule__AbstractMarker__Alternatives : ( ( ruleMarker ) | ( ruleVersMarker ) );
    public final void rule__AbstractMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1208:1: ( ( ruleMarker ) | ( ruleVersMarker ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BETWEEN_HASHES) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=20 && LA3_0<=22)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1209:1: ( ruleMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1209:1: ( ruleMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1210:1: ruleMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives2526);
                    ruleMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1215:6: ( ruleVersMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1215:6: ( ruleVersMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1216:1: ruleVersMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives2543);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1226:1: rule__SentenceItemNoAmbivalence__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) );
    public final void rule__SentenceItemNoAmbivalence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1230:1: ( ( ruleWord ) | ( ruleAbstractMarker ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EGYSTRING||(LA4_0>=24 && LA4_0<=25)||LA4_0==27||LA4_0==29||LA4_0==31||LA4_0==33||LA4_0==35||LA4_0==37||LA4_0==39||LA4_0==41||LA4_0==43||LA4_0==45) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_BETWEEN_HASHES||(LA4_0>=20 && LA4_0<=22)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1231:1: ( ruleWord )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1231:1: ( ruleWord )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1232:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_rule__SentenceItemNoAmbivalence__Alternatives2575);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1237:6: ( ruleAbstractMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1237:6: ( ruleAbstractMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1238:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMarker_in_rule__SentenceItemNoAmbivalence__Alternatives2592);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1248:1: rule__VersMarker__Alternatives : ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) );
    public final void rule__VersMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1252:1: ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) )
            int alt5=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1253:1: ( ruleVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1253:1: ( ruleVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1254:1: ruleVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives2624);
                    ruleVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1259:6: ( ruleVersFrontierMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1259:6: ( ruleVersFrontierMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1260:1: ruleVersFrontierMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives2641);
                    ruleVersFrontierMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1265:6: ( ruleBrokenVersbreakMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1265:6: ( ruleBrokenVersbreakMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1266:1: ruleBrokenVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBrokenVersbreakMarker_in_rule__VersMarker__Alternatives2658);
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


    // $ANTLR start "rule__WordMiddle__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1276:1: rule__WordMiddle__Alternatives : ( ( ruleBrackets ) | ( ruleChars ) );
    public final void rule__WordMiddle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1280:1: ( ( ruleBrackets ) | ( ruleChars ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25||LA6_0==27||LA6_0==29||LA6_0==31||LA6_0==33||LA6_0==35||LA6_0==37||LA6_0==39||LA6_0==41||LA6_0==43||LA6_0==45) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_EGYSTRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1281:1: ( ruleBrackets )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1281:1: ( ruleBrackets )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1282:1: ruleBrackets
                    {
                     before(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives2690);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1287:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1287:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1288:1: ruleChars
                    {
                     before(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives2707);
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


    // $ANTLR start "rule__Brackets__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1298:1: rule__Brackets__Alternatives : ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( ruleExpandedColumn ) | ( rulePartialDestruction ) | ( ruleDestruction ) );
    public final void rule__Brackets__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1302:1: ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( ruleExpandedColumn ) | ( rulePartialDestruction ) | ( ruleDestruction ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            case 31:
                {
                alt7=7;
                }
                break;
            case 33:
                {
                alt7=8;
                }
                break;
            case 35:
                {
                alt7=9;
                }
                break;
            case 43:
                {
                alt7=10;
                }
                break;
            case 45:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1303:1: ( ruleRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1303:1: ( ruleRasur )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1304:1: ruleRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRasur_in_rule__Brackets__Alternatives2739);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1309:6: ( ruleAncientExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1309:6: ( ruleAncientExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1310:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives2756);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1315:6: ( ruleRestorationOverRasur )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1315:6: ( ruleRestorationOverRasur )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1316:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives2773);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1321:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1321:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1322:1: ruleExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives2790);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1327:6: ( ruleDisputableReading )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1327:6: ( ruleDisputableReading )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1328:1: ruleDisputableReading
                    {
                     before(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives2807);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1333:6: ( ruleEmendation )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1333:6: ( ruleEmendation )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1334:1: ruleEmendation
                    {
                     before(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives2824);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1339:6: ( ruleLacuna )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1339:6: ( ruleLacuna )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1340:1: ruleLacuna
                    {
                     before(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives2841);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1345:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1345:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1346:1: ruleDeletion
                    {
                     before(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives2858);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1351:6: ( ruleExpandedColumn )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1351:6: ( ruleExpandedColumn )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1352:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives2875);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1357:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1357:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1358:1: rulePartialDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives2892);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1363:6: ( ruleDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1363:6: ( ruleDestruction )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1364:1: ruleDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getDestructionParserRuleCall_10()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDestruction_in_rule__Brackets__Alternatives2909);
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


    // $ANTLR start "rule__NoEmendation__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1374:1: rule__NoEmendation__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoEmendation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1378:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EGYSTRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1379:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1379:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1380:1: ruleChars
                    {
                     before(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives2941);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1385:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1385:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1386:1: ruleExpanded
                    {
                     before(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives2958);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1396:1: rule__NoDisputableReading__Alternatives : ( ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoDisputableReading__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1400:1: ( ( ruleExpanded ) | ( ruleChars ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_EGYSTRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1401:1: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1401:1: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1402:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives2990);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1407:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1407:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1408:1: ruleChars
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives3007);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1418:1: rule__NoLacuna__Alternatives : ( ( ruleExpanded ) | ( ruleChars ) );
    public final void rule__NoLacuna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1422:1: ( ( ruleExpanded ) | ( ruleChars ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1423:1: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1423:1: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1424:1: ruleExpanded
                    {
                     before(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives3039);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1429:6: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1429:6: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1430:1: ruleChars
                    {
                     before(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives3056);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1440:1: rule__NoDeletion__Alternatives : ( ( ruleChars ) | ( rulePartialDestruction ) | ( ruleExpanded ) );
    public final void rule__NoDeletion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1444:1: ( ( ruleChars ) | ( rulePartialDestruction ) | ( ruleExpanded ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 25:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1445:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1445:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1446:1: ruleChars
                    {
                     before(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives3088);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1451:6: ( rulePartialDestruction )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1451:6: ( rulePartialDestruction )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1452:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePartialDestruction_in_rule__NoDeletion__Alternatives3105);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1457:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1457:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1458:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoDeletion__Alternatives3122);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_2()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1468:1: rule__NoExpandedColumn__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoExpandedColumn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1472:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EGYSTRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1473:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1473:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1474:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives3154);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1479:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1479:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1480:1: ruleExpanded
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoExpandedColumn__Alternatives3171);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1490:1: rule__NoRasur__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1494:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EGYSTRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1495:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1495:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1496:1: ruleChars
                    {
                     before(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoRasur__Alternatives3203);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1501:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1501:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1502:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoRasur__Alternatives3220);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_1()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1512:1: rule__NoAncientExpanded__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoAncientExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1516:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_EGYSTRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1517:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1517:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1518:1: ruleChars
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoAncientExpanded__Alternatives3252);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1523:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1523:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1524:1: ruleExpanded
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoAncientExpanded__Alternatives3269);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1534:1: rule__NoRestorationOverRasur__Alternatives : ( ( ruleChars ) | ( ruleExpanded ) );
    public final void rule__NoRestorationOverRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1538:1: ( ( ruleChars ) | ( ruleExpanded ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_EGYSTRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1539:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1539:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1540:1: ruleChars
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoRestorationOverRasur__Alternatives3301);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1545:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1545:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1546:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoRestorationOverRasur__Alternatives3318);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1556:1: rule__NoPartialDestruction__Alternatives : ( ( ruleChars ) | ( ruleDeletion ) | ( ruleExpanded ) );
    public final void rule__NoPartialDestruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1560:1: ( ( ruleChars ) | ( ruleDeletion ) | ( ruleExpanded ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 25:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1561:1: ( ruleChars )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1561:1: ( ruleChars )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1562:1: ruleChars
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChars_in_rule__NoPartialDestruction__Alternatives3350);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1567:6: ( ruleDeletion )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1567:6: ( ruleDeletion )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1568:1: ruleDeletion
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDeletion_in_rule__NoPartialDestruction__Alternatives3367);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1573:6: ( ruleExpanded )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1573:6: ( ruleExpanded )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1574:1: ruleExpanded
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpanded_in_rule__NoPartialDestruction__Alternatives3384);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_2()); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1586:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1590:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1591:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__03414);
            rule__TextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__03417);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1598:1: rule__TextContent__Group__0__Impl : ( () ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1602:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1603:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1603:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1604:1: ()
            {
             before(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1605:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1607:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1617:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1621:1: ( rule__TextContent__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1622:2: rule__TextContent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__13475);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1628:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__Group_1__0 ) ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1632:1: ( ( ( rule__TextContent__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1633:1: ( ( rule__TextContent__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1633:1: ( ( rule__TextContent__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1634:1: ( rule__TextContent__Group_1__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1635:1: ( rule__TextContent__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1635:2: rule__TextContent__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl3502);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1649:1: rule__TextContent__Group_1__0 : rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 ;
    public final void rule__TextContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1653:1: ( rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1654:2: rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__03536);
            rule__TextContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__03539);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1661:1: rule__TextContent__Group_1__0__Impl : ( ( rule__TextContent__ItemsAssignment_1_0 ) ) ;
    public final void rule__TextContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1665:1: ( ( ( rule__TextContent__ItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1666:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1666:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1667:1: ( rule__TextContent__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1668:1: ( rule__TextContent__ItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1668:2: rule__TextContent__ItemsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl3566);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1678:1: rule__TextContent__Group_1__1 : rule__TextContent__Group_1__1__Impl ;
    public final void rule__TextContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1682:1: ( rule__TextContent__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1683:2: rule__TextContent__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__13596);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1689:1: rule__TextContent__Group_1__1__Impl : ( ( rule__TextContent__Group_1_1__0 )* ) ;
    public final void rule__TextContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1693:1: ( ( ( rule__TextContent__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1694:1: ( ( rule__TextContent__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1694:1: ( ( rule__TextContent__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1695:1: ( rule__TextContent__Group_1_1__0 )*
            {
             before(grammarAccess.getTextContentAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1696:1: ( rule__TextContent__Group_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_NEWLINE||(LA17_0>=16 && LA17_0<=17)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1696:2: rule__TextContent__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1_1__0_in_rule__TextContent__Group_1__1__Impl3623);
            	    rule__TextContent__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1710:1: rule__TextContent__Group_1_1__0 : rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 ;
    public final void rule__TextContent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1714:1: ( rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1715:2: rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1_1__0__Impl_in_rule__TextContent__Group_1_1__03658);
            rule__TextContent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1_1__1_in_rule__TextContent__Group_1_1__03661);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1722:1: rule__TextContent__Group_1_1__0__Impl : ( ( rule__TextContent__Alternatives_1_1_0 )? ) ;
    public final void rule__TextContent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1726:1: ( ( ( rule__TextContent__Alternatives_1_1_0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1727:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1727:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1728:1: ( rule__TextContent__Alternatives_1_1_0 )?
            {
             before(grammarAccess.getTextContentAccess().getAlternatives_1_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1729:1: ( rule__TextContent__Alternatives_1_1_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_NEWLINE||LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1729:2: rule__TextContent__Alternatives_1_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextContent__Alternatives_1_1_0_in_rule__TextContent__Group_1_1__0__Impl3688);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1739:1: rule__TextContent__Group_1_1__1 : rule__TextContent__Group_1_1__1__Impl ;
    public final void rule__TextContent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1743:1: ( rule__TextContent__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1744:2: rule__TextContent__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__Group_1_1__1__Impl_in_rule__TextContent__Group_1_1__13719);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1750:1: rule__TextContent__Group_1_1__1__Impl : ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__TextContent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1754:1: ( ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1755:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1755:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1756:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1757:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1757:2: rule__TextContent__ItemsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextContent__ItemsAssignment_1_1_1_in_rule__TextContent__Group_1_1__1__Impl3746);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1771:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1775:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1776:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__03780);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__03783);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1783:1: rule__Sentence__Group__0__Impl : ( () ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1787:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1788:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1788:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1789:1: ()
            {
             before(grammarAccess.getSentenceAccess().getSentenceAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1790:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1792:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1802:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl rule__Sentence__Group__2 ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1806:1: ( rule__Sentence__Group__1__Impl rule__Sentence__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1807:2: rule__Sentence__Group__1__Impl rule__Sentence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__13841);
            rule__Sentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__13844);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1814:1: rule__Sentence__Group__1__Impl : ( '\\u00C2\\u00A7' ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1818:1: ( ( '\\u00C2\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1819:1: ( '\\u00C2\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1819:1: ( '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1820:1: '\\u00C2\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Sentence__Group__1__Impl3872); 
             after(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1833:1: rule__Sentence__Group__2 : rule__Sentence__Group__2__Impl rule__Sentence__Group__3 ;
    public final void rule__Sentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1837:1: ( rule__Sentence__Group__2__Impl rule__Sentence__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1838:2: rule__Sentence__Group__2__Impl rule__Sentence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__23903);
            rule__Sentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__3_in_rule__Sentence__Group__23906);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1845:1: rule__Sentence__Group__2__Impl : ( ( rule__Sentence__Group_2__0 )? ) ;
    public final void rule__Sentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1849:1: ( ( ( rule__Sentence__Group_2__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1850:1: ( ( rule__Sentence__Group_2__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1850:1: ( ( rule__Sentence__Group_2__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1851:1: ( rule__Sentence__Group_2__0 )?
            {
             before(grammarAccess.getSentenceAccess().getGroup_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1852:1: ( rule__Sentence__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_BETWEEN_HASHES && LA19_0<=RULE_EGYSTRING)||LA19_0==18||(LA19_0>=20 && LA19_0<=22)||(LA19_0>=24 && LA19_0<=25)||LA19_0==27||LA19_0==29||LA19_0==31||LA19_0==33||LA19_0==35||LA19_0==37||LA19_0==39||LA19_0==41||LA19_0==43||LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1852:2: rule__Sentence__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2__0_in_rule__Sentence__Group__2__Impl3933);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1862:1: rule__Sentence__Group__3 : rule__Sentence__Group__3__Impl ;
    public final void rule__Sentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1866:1: ( rule__Sentence__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1867:2: rule__Sentence__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__3__Impl_in_rule__Sentence__Group__33964);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1873:1: rule__Sentence__Group__3__Impl : ( '\\u00C2\\u00A7' ) ;
    public final void rule__Sentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1877:1: ( ( '\\u00C2\\u00A7' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1878:1: ( '\\u00C2\\u00A7' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1878:1: ( '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1879:1: '\\u00C2\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Sentence__Group__3__Impl3992); 
             after(grammarAccess.getSentenceAccess().getLatinCapitalLetterAWithCircumflexSectionSignKeyword_3()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1900:1: rule__Sentence__Group_2__0 : rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1 ;
    public final void rule__Sentence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1904:1: ( rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1905:2: rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2__0__Impl_in_rule__Sentence__Group_2__04031);
            rule__Sentence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2__1_in_rule__Sentence__Group_2__04034);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1912:1: rule__Sentence__Group_2__0__Impl : ( ( rule__Sentence__ItemsAssignment_2_0 ) ) ;
    public final void rule__Sentence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1916:1: ( ( ( rule__Sentence__ItemsAssignment_2_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1917:1: ( ( rule__Sentence__ItemsAssignment_2_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1917:1: ( ( rule__Sentence__ItemsAssignment_2_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1918:1: ( rule__Sentence__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_2_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1919:1: ( rule__Sentence__ItemsAssignment_2_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1919:2: rule__Sentence__ItemsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__ItemsAssignment_2_0_in_rule__Sentence__Group_2__0__Impl4061);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1929:1: rule__Sentence__Group_2__1 : rule__Sentence__Group_2__1__Impl ;
    public final void rule__Sentence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1933:1: ( rule__Sentence__Group_2__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1934:2: rule__Sentence__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2__1__Impl_in_rule__Sentence__Group_2__14091);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1940:1: rule__Sentence__Group_2__1__Impl : ( ( rule__Sentence__Group_2_1__0 )* ) ;
    public final void rule__Sentence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1944:1: ( ( ( rule__Sentence__Group_2_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1945:1: ( ( rule__Sentence__Group_2_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1945:1: ( ( rule__Sentence__Group_2_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1946:1: ( rule__Sentence__Group_2_1__0 )*
            {
             before(grammarAccess.getSentenceAccess().getGroup_2_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1947:1: ( rule__Sentence__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1947:2: rule__Sentence__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2_1__0_in_rule__Sentence__Group_2__1__Impl4118);
            	    rule__Sentence__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1961:1: rule__Sentence__Group_2_1__0 : rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1 ;
    public final void rule__Sentence__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1965:1: ( rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1966:2: rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2_1__0__Impl_in_rule__Sentence__Group_2_1__04153);
            rule__Sentence__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2_1__1_in_rule__Sentence__Group_2_1__04156);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1973:1: rule__Sentence__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__Sentence__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1977:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1978:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1978:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1979:1: ' '
            {
             before(grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Sentence__Group_2_1__0__Impl4184); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1992:1: rule__Sentence__Group_2_1__1 : rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2 ;
    public final void rule__Sentence__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1996:1: ( rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1997:2: rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2_1__1__Impl_in_rule__Sentence__Group_2_1__14215);
            rule__Sentence__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2_1__2_in_rule__Sentence__Group_2_1__14218);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2004:1: rule__Sentence__Group_2_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Sentence__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2008:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2009:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2009:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2010:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2011:1: ( RULE_NEWLINE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NEWLINE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2011:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_rule__Sentence__Group_2_1__1__Impl4246); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2021:1: rule__Sentence__Group_2_1__2 : rule__Sentence__Group_2_1__2__Impl ;
    public final void rule__Sentence__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2025:1: ( rule__Sentence__Group_2_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2026:2: rule__Sentence__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group_2_1__2__Impl_in_rule__Sentence__Group_2_1__24277);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2032:1: rule__Sentence__Group_2_1__2__Impl : ( ( rule__Sentence__ItemsAssignment_2_1_2 ) ) ;
    public final void rule__Sentence__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2036:1: ( ( ( rule__Sentence__ItemsAssignment_2_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2037:1: ( ( rule__Sentence__ItemsAssignment_2_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2037:1: ( ( rule__Sentence__ItemsAssignment_2_1_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2038:1: ( rule__Sentence__ItemsAssignment_2_1_2 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_2_1_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2039:1: ( rule__Sentence__ItemsAssignment_2_1_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2039:2: rule__Sentence__ItemsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__ItemsAssignment_2_1_2_in_rule__Sentence__Group_2_1__2__Impl4304);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2055:1: rule__Ambivalence__Group__0 : rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 ;
    public final void rule__Ambivalence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2059:1: ( rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2060:2: rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__04340);
            rule__Ambivalence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__04343);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2067:1: rule__Ambivalence__Group__0__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2071:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2072:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2072:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2073:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ambivalence__Group__0__Impl4371); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2086:1: rule__Ambivalence__Group__1 : rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 ;
    public final void rule__Ambivalence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2090:1: ( rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2091:2: rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__14402);
            rule__Ambivalence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__14405);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2098:1: rule__Ambivalence__Group__1__Impl : ( ( rule__Ambivalence__Group_1__0 ) ) ;
    public final void rule__Ambivalence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2102:1: ( ( ( rule__Ambivalence__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2103:1: ( ( rule__Ambivalence__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2103:1: ( ( rule__Ambivalence__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2104:1: ( rule__Ambivalence__Group_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2105:1: ( rule__Ambivalence__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2105:2: rule__Ambivalence__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl4432);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2115:1: rule__Ambivalence__Group__2 : rule__Ambivalence__Group__2__Impl ;
    public final void rule__Ambivalence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2119:1: ( rule__Ambivalence__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2120:2: rule__Ambivalence__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__24462);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2126:1: rule__Ambivalence__Group__2__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2130:1: ( ( '%' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2131:1: ( '%' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2131:1: ( '%' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2132:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Ambivalence__Group__2__Impl4490); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2151:1: rule__Ambivalence__Group_1__0 : rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 ;
    public final void rule__Ambivalence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2155:1: ( rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2156:2: rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__04527);
            rule__Ambivalence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__04530);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2163:1: rule__Ambivalence__Group_1__0__Impl : ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) ;
    public final void rule__Ambivalence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2167:1: ( ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2168:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2168:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2169:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2170:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2170:2: rule__Ambivalence__CasesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl4557);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2180:1: rule__Ambivalence__Group_1__1 : rule__Ambivalence__Group_1__1__Impl ;
    public final void rule__Ambivalence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2184:1: ( rule__Ambivalence__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2185:2: rule__Ambivalence__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__14587);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2191:1: rule__Ambivalence__Group_1__1__Impl : ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) ;
    public final void rule__Ambivalence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2195:1: ( ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2196:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2196:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2197:1: ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2197:1: ( ( rule__Ambivalence__Group_1_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2198:1: ( rule__Ambivalence__Group_1_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2199:1: ( rule__Ambivalence__Group_1_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2199:2: rule__Ambivalence__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl4616);
            rule__Ambivalence__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2202:1: ( ( rule__Ambivalence__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2203:1: ( rule__Ambivalence__Group_1_1__0 )*
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2204:1: ( rule__Ambivalence__Group_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2204:2: rule__Ambivalence__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl4628);
            	    rule__Ambivalence__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2219:1: rule__Ambivalence__Group_1_1__0 : rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 ;
    public final void rule__Ambivalence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2223:1: ( rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2224:2: rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__04665);
            rule__Ambivalence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__04668);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2231:1: rule__Ambivalence__Group_1_1__0__Impl : ( '; ' ) ;
    public final void rule__Ambivalence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2235:1: ( ( '; ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2236:1: ( '; ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2236:1: ( '; ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2237:1: '; '
            {
             before(grammarAccess.getAmbivalenceAccess().getSemicolonSpaceKeyword_1_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Ambivalence__Group_1_1__0__Impl4696); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2250:1: rule__Ambivalence__Group_1_1__1 : rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 ;
    public final void rule__Ambivalence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2254:1: ( rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2255:2: rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__14727);
            rule__Ambivalence__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__2_in_rule__Ambivalence__Group_1_1__14730);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2262:1: rule__Ambivalence__Group_1_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Ambivalence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2266:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2267:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2267:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2268:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2269:1: ( RULE_NEWLINE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NEWLINE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2269:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_rule__Ambivalence__Group_1_1__1__Impl4758); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2279:1: rule__Ambivalence__Group_1_1__2 : rule__Ambivalence__Group_1_1__2__Impl ;
    public final void rule__Ambivalence__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2283:1: ( rule__Ambivalence__Group_1_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2284:2: rule__Ambivalence__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__Group_1_1__2__Impl_in_rule__Ambivalence__Group_1_1__24789);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2290:1: rule__Ambivalence__Group_1_1__2__Impl : ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) ;
    public final void rule__Ambivalence__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2294:1: ( ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2295:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2295:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2296:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2297:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2297:2: rule__Ambivalence__CasesAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ambivalence__CasesAssignment_1_1_2_in_rule__Ambivalence__Group_1_1__2__Impl4816);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2313:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2317:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2318:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__04852);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__1_in_rule__Case__Group__04855);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2325:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2329:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2330:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2330:1: ( ( rule__Case__NameAssignment_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2331:1: ( rule__Case__NameAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2332:1: ( rule__Case__NameAssignment_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2332:2: rule__Case__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl4882);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2342:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2346:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2347:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__14912);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__2_in_rule__Case__Group__14915);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2354:1: rule__Case__Group__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2358:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2359:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2359:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2360:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2361:1: ( RULE_NEWLINE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NEWLINE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2361:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_rule__Case__Group__1__Impl4943); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2371:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2375:1: ( rule__Case__Group__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2376:2: rule__Case__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__24974);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2382:1: rule__Case__Group__2__Impl : ( ( rule__Case__Group_2__0 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2386:1: ( ( ( rule__Case__Group_2__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2387:1: ( ( rule__Case__Group_2__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2387:1: ( ( rule__Case__Group_2__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2388:1: ( rule__Case__Group_2__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2389:1: ( rule__Case__Group_2__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2389:2: rule__Case__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2__0_in_rule__Case__Group__2__Impl5001);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2405:1: rule__Case__Group_2__0 : rule__Case__Group_2__0__Impl rule__Case__Group_2__1 ;
    public final void rule__Case__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2409:1: ( rule__Case__Group_2__0__Impl rule__Case__Group_2__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2410:2: rule__Case__Group_2__0__Impl rule__Case__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2__0__Impl_in_rule__Case__Group_2__05037);
            rule__Case__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2__1_in_rule__Case__Group_2__05040);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2417:1: rule__Case__Group_2__0__Impl : ( ( rule__Case__ItemsAssignment_2_0 ) ) ;
    public final void rule__Case__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2421:1: ( ( ( rule__Case__ItemsAssignment_2_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2422:1: ( ( rule__Case__ItemsAssignment_2_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2422:1: ( ( rule__Case__ItemsAssignment_2_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2423:1: ( rule__Case__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_2_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2424:1: ( rule__Case__ItemsAssignment_2_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2424:2: rule__Case__ItemsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__ItemsAssignment_2_0_in_rule__Case__Group_2__0__Impl5067);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2434:1: rule__Case__Group_2__1 : rule__Case__Group_2__1__Impl ;
    public final void rule__Case__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2438:1: ( rule__Case__Group_2__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2439:2: rule__Case__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2__1__Impl_in_rule__Case__Group_2__15097);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2445:1: rule__Case__Group_2__1__Impl : ( ( rule__Case__Group_2_1__0 )* ) ;
    public final void rule__Case__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2449:1: ( ( ( rule__Case__Group_2_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2450:1: ( ( rule__Case__Group_2_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2450:1: ( ( rule__Case__Group_2_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2451:1: ( rule__Case__Group_2_1__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_2_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2452:1: ( rule__Case__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2452:2: rule__Case__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2_1__0_in_rule__Case__Group_2__1__Impl5124);
            	    rule__Case__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2466:1: rule__Case__Group_2_1__0 : rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1 ;
    public final void rule__Case__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2470:1: ( rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2471:2: rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2_1__0__Impl_in_rule__Case__Group_2_1__05159);
            rule__Case__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2_1__1_in_rule__Case__Group_2_1__05162);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2478:1: rule__Case__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__Case__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2482:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2483:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2483:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2484:1: ' '
            {
             before(grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Case__Group_2_1__0__Impl5190); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2497:1: rule__Case__Group_2_1__1 : rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2 ;
    public final void rule__Case__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2501:1: ( rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2502:2: rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2_1__1__Impl_in_rule__Case__Group_2_1__15221);
            rule__Case__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2_1__2_in_rule__Case__Group_2_1__15224);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2509:1: rule__Case__Group_2_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2513:1: ( ( ( RULE_NEWLINE )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2514:1: ( ( RULE_NEWLINE )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2514:1: ( ( RULE_NEWLINE )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2515:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2516:1: ( RULE_NEWLINE )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NEWLINE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2516:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FollowSets000.FOLLOW_RULE_NEWLINE_in_rule__Case__Group_2_1__1__Impl5252); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2526:1: rule__Case__Group_2_1__2 : rule__Case__Group_2_1__2__Impl ;
    public final void rule__Case__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2530:1: ( rule__Case__Group_2_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2531:2: rule__Case__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__Group_2_1__2__Impl_in_rule__Case__Group_2_1__25283);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2537:1: rule__Case__Group_2_1__2__Impl : ( ( rule__Case__ItemsAssignment_2_1_2 ) ) ;
    public final void rule__Case__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2541:1: ( ( ( rule__Case__ItemsAssignment_2_1_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2542:1: ( ( rule__Case__ItemsAssignment_2_1_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2542:1: ( ( rule__Case__ItemsAssignment_2_1_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2543:1: ( rule__Case__ItemsAssignment_2_1_2 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_2_1_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2544:1: ( rule__Case__ItemsAssignment_2_1_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2544:2: rule__Case__ItemsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Case__ItemsAssignment_2_1_2_in_rule__Case__Group_2_1__2__Impl5310);
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


    // $ANTLR start "rule__VersFrontierMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2560:1: rule__VersFrontierMarker__Group__0 : rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 ;
    public final void rule__VersFrontierMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2564:1: ( rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2565:2: rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersFrontierMarker__Group__0__Impl_in_rule__VersFrontierMarker__Group__05346);
            rule__VersFrontierMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VersFrontierMarker__Group__1_in_rule__VersFrontierMarker__Group__05349);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2572:1: rule__VersFrontierMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersFrontierMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2576:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2577:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2577:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2578:1: ()
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2579:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2581:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2591:1: rule__VersFrontierMarker__Group__1 : rule__VersFrontierMarker__Group__1__Impl ;
    public final void rule__VersFrontierMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2595:1: ( rule__VersFrontierMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2596:2: rule__VersFrontierMarker__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersFrontierMarker__Group__1__Impl_in_rule__VersFrontierMarker__Group__15407);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2602:1: rule__VersFrontierMarker__Group__1__Impl : ( '\\uF0081' ) ;
    public final void rule__VersFrontierMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2606:1: ( ( '\\uF0081' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2607:1: ( '\\uF0081' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2607:1: ( '\\uF0081' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2608:1: '\\uF0081'
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getPrivateUseAreaF008DigitOneKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__VersFrontierMarker__Group__1__Impl5435); 
             after(grammarAccess.getVersFrontierMarkerAccess().getPrivateUseAreaF008DigitOneKeyword_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2625:1: rule__VersbreakMarker__Group__0 : rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 ;
    public final void rule__VersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2629:1: ( rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2630:2: rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersbreakMarker__Group__0__Impl_in_rule__VersbreakMarker__Group__05470);
            rule__VersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VersbreakMarker__Group__1_in_rule__VersbreakMarker__Group__05473);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2637:1: rule__VersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2641:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2642:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2642:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2643:1: ()
            {
             before(grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2644:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2646:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2656:1: rule__VersbreakMarker__Group__1 : rule__VersbreakMarker__Group__1__Impl ;
    public final void rule__VersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2660:1: ( rule__VersbreakMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2661:2: rule__VersbreakMarker__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VersbreakMarker__Group__1__Impl_in_rule__VersbreakMarker__Group__15531);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2667:1: rule__VersbreakMarker__Group__1__Impl : ( '\\uF0080' ) ;
    public final void rule__VersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2671:1: ( ( '\\uF0080' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2672:1: ( '\\uF0080' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2672:1: ( '\\uF0080' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2673:1: '\\uF0080'
            {
             before(grammarAccess.getVersbreakMarkerAccess().getPrivateUseAreaF008DigitZeroKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__VersbreakMarker__Group__1__Impl5559); 
             after(grammarAccess.getVersbreakMarkerAccess().getPrivateUseAreaF008DigitZeroKeyword_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2690:1: rule__BrokenVersbreakMarker__Group__0 : rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 ;
    public final void rule__BrokenVersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2694:1: ( rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2695:2: rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BrokenVersbreakMarker__Group__0__Impl_in_rule__BrokenVersbreakMarker__Group__05594);
            rule__BrokenVersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BrokenVersbreakMarker__Group__1_in_rule__BrokenVersbreakMarker__Group__05597);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2702:1: rule__BrokenVersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__BrokenVersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2706:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2707:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2707:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2708:1: ()
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2709:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2711:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2721:1: rule__BrokenVersbreakMarker__Group__1 : rule__BrokenVersbreakMarker__Group__1__Impl ;
    public final void rule__BrokenVersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2725:1: ( rule__BrokenVersbreakMarker__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2726:2: rule__BrokenVersbreakMarker__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BrokenVersbreakMarker__Group__1__Impl_in_rule__BrokenVersbreakMarker__Group__15655);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2732:1: rule__BrokenVersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC82' ) ;
    public final void rule__BrokenVersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2736:1: ( ( '\\uDB80\\uDC82' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2737:1: ( '\\uDB80\\uDC82' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2737:1: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2738:1: '\\uDB80\\uDC82'
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc82Keyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__BrokenVersbreakMarker__Group__1__Impl5683); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2755:1: rule__Word__Group__0 : rule__Word__Group__0__Impl rule__Word__Group__1 ;
    public final void rule__Word__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2759:1: ( rule__Word__Group__0__Impl rule__Word__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2760:2: rule__Word__Group__0__Impl rule__Word__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__05718);
            rule__Word__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__1_in_rule__Word__Group__05721);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2767:1: rule__Word__Group__0__Impl : ( () ) ;
    public final void rule__Word__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2771:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2772:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2772:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2773:1: ()
            {
             before(grammarAccess.getWordAccess().getWordAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2774:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2776:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2786:1: rule__Word__Group__1 : rule__Word__Group__1__Impl ;
    public final void rule__Word__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2790:1: ( rule__Word__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2791:2: rule__Word__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__15779);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2797:1: rule__Word__Group__1__Impl : ( ( rule__Word__Group_1__0 ) ) ;
    public final void rule__Word__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2801:1: ( ( ( rule__Word__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2802:1: ( ( rule__Word__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2802:1: ( ( rule__Word__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2803:1: ( rule__Word__Group_1__0 )
            {
             before(grammarAccess.getWordAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2804:1: ( rule__Word__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2804:2: rule__Word__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1__0_in_rule__Word__Group__1__Impl5806);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2818:1: rule__Word__Group_1__0 : rule__Word__Group_1__0__Impl rule__Word__Group_1__1 ;
    public final void rule__Word__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2822:1: ( rule__Word__Group_1__0__Impl rule__Word__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2823:2: rule__Word__Group_1__0__Impl rule__Word__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1__0__Impl_in_rule__Word__Group_1__05840);
            rule__Word__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1__1_in_rule__Word__Group_1__05843);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2830:1: rule__Word__Group_1__0__Impl : ( ( rule__Word__WCharAssignment_1_0 ) ) ;
    public final void rule__Word__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2834:1: ( ( ( rule__Word__WCharAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2835:1: ( ( rule__Word__WCharAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2835:1: ( ( rule__Word__WCharAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2836:1: ( rule__Word__WCharAssignment_1_0 )
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2837:1: ( rule__Word__WCharAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2837:2: rule__Word__WCharAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__WCharAssignment_1_0_in_rule__Word__Group_1__0__Impl5870);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2847:1: rule__Word__Group_1__1 : rule__Word__Group_1__1__Impl ;
    public final void rule__Word__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2851:1: ( rule__Word__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2852:2: rule__Word__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1__1__Impl_in_rule__Word__Group_1__15900);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2858:1: rule__Word__Group_1__1__Impl : ( ( rule__Word__Group_1_1__0 )* ) ;
    public final void rule__Word__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2862:1: ( ( ( rule__Word__Group_1_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2863:1: ( ( rule__Word__Group_1_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2863:1: ( ( rule__Word__Group_1_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2864:1: ( rule__Word__Group_1_1__0 )*
            {
             before(grammarAccess.getWordAccess().getGroup_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2865:1: ( rule__Word__Group_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2865:2: rule__Word__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1_1__0_in_rule__Word__Group_1__1__Impl5927);
            	    rule__Word__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2879:1: rule__Word__Group_1_1__0 : rule__Word__Group_1_1__0__Impl rule__Word__Group_1_1__1 ;
    public final void rule__Word__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2883:1: ( rule__Word__Group_1_1__0__Impl rule__Word__Group_1_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2884:2: rule__Word__Group_1_1__0__Impl rule__Word__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1_1__0__Impl_in_rule__Word__Group_1_1__05962);
            rule__Word__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1_1__1_in_rule__Word__Group_1_1__05965);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2891:1: rule__Word__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__Word__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2895:1: ( ( '-' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2896:1: ( '-' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2896:1: ( '-' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2897:1: '-'
            {
             before(grammarAccess.getWordAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Word__Group_1_1__0__Impl5993); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2910:1: rule__Word__Group_1_1__1 : rule__Word__Group_1_1__1__Impl ;
    public final void rule__Word__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2914:1: ( rule__Word__Group_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2915:2: rule__Word__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__Group_1_1__1__Impl_in_rule__Word__Group_1_1__16024);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2921:1: rule__Word__Group_1_1__1__Impl : ( ( rule__Word__WCharAssignment_1_1_1 ) ) ;
    public final void rule__Word__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2925:1: ( ( ( rule__Word__WCharAssignment_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2926:1: ( ( rule__Word__WCharAssignment_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2926:1: ( ( rule__Word__WCharAssignment_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2927:1: ( rule__Word__WCharAssignment_1_1_1 )
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2928:1: ( rule__Word__WCharAssignment_1_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2928:2: rule__Word__WCharAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__WCharAssignment_1_1_1_in_rule__Word__Group_1_1__1__Impl6051);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2942:1: rule__WordPart__Group__0 : rule__WordPart__Group__0__Impl rule__WordPart__Group__1 ;
    public final void rule__WordPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2946:1: ( rule__WordPart__Group__0__Impl rule__WordPart__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2947:2: rule__WordPart__Group__0__Impl rule__WordPart__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group__0__Impl_in_rule__WordPart__Group__06085);
            rule__WordPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group__1_in_rule__WordPart__Group__06088);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2954:1: rule__WordPart__Group__0__Impl : ( ( '=' )? ) ;
    public final void rule__WordPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2958:1: ( ( ( '=' )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2959:1: ( ( '=' )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2959:1: ( ( '=' )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2960:1: ( '=' )?
            {
             before(grammarAccess.getWordPartAccess().getEqualsSignKeyword_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2961:1: ( '=' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2962:2: '='
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__WordPart__Group__0__Impl6117); 

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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2973:1: rule__WordPart__Group__1 : rule__WordPart__Group__1__Impl ;
    public final void rule__WordPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2977:1: ( rule__WordPart__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2978:2: rule__WordPart__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group__1__Impl_in_rule__WordPart__Group__16150);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2984:1: rule__WordPart__Group__1__Impl : ( ( rule__WordPart__Group_1__0 ) ) ;
    public final void rule__WordPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2988:1: ( ( ( rule__WordPart__Group_1__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2989:1: ( ( rule__WordPart__Group_1__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2989:1: ( ( rule__WordPart__Group_1__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2990:1: ( rule__WordPart__Group_1__0 )
            {
             before(grammarAccess.getWordPartAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2991:1: ( rule__WordPart__Group_1__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2991:2: rule__WordPart__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group_1__0_in_rule__WordPart__Group__1__Impl6177);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3005:1: rule__WordPart__Group_1__0 : rule__WordPart__Group_1__0__Impl rule__WordPart__Group_1__1 ;
    public final void rule__WordPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3009:1: ( rule__WordPart__Group_1__0__Impl rule__WordPart__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3010:2: rule__WordPart__Group_1__0__Impl rule__WordPart__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group_1__0__Impl_in_rule__WordPart__Group_1__06211);
            rule__WordPart__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group_1__1_in_rule__WordPart__Group_1__06214);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3017:1: rule__WordPart__Group_1__0__Impl : ( ( rule__WordPart__WCharAssignment_1_0 ) ) ;
    public final void rule__WordPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3021:1: ( ( ( rule__WordPart__WCharAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3022:1: ( ( rule__WordPart__WCharAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3022:1: ( ( rule__WordPart__WCharAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3023:1: ( rule__WordPart__WCharAssignment_1_0 )
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3024:1: ( rule__WordPart__WCharAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3024:2: rule__WordPart__WCharAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__WCharAssignment_1_0_in_rule__WordPart__Group_1__0__Impl6241);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3034:1: rule__WordPart__Group_1__1 : rule__WordPart__Group_1__1__Impl ;
    public final void rule__WordPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3038:1: ( rule__WordPart__Group_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3039:2: rule__WordPart__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WordPart__Group_1__1__Impl_in_rule__WordPart__Group_1__16271);
            rule__WordPart__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3045:1: rule__WordPart__Group_1__1__Impl : ( ( rule__WordPart__WCharAssignment_1_1 )* ) ;
    public final void rule__WordPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3049:1: ( ( ( rule__WordPart__WCharAssignment_1_1 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3050:1: ( ( rule__WordPart__WCharAssignment_1_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3050:1: ( ( rule__WordPart__WCharAssignment_1_1 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3051:1: ( rule__WordPart__WCharAssignment_1_1 )*
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3052:1: ( rule__WordPart__WCharAssignment_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EGYSTRING||LA29_0==25||LA29_0==27||LA29_0==29||LA29_0==31||LA29_0==33||LA29_0==35||LA29_0==37||LA29_0==39||LA29_0==41||LA29_0==43||LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3052:2: rule__WordPart__WCharAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__WordPart__WCharAssignment_1_1_in_rule__WordPart__Group_1__1__Impl6298);
            	    rule__WordPart__WCharAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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


    // $ANTLR start "rule__Expanded__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3066:1: rule__Expanded__Group__0 : rule__Expanded__Group__0__Impl rule__Expanded__Group__1 ;
    public final void rule__Expanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3070:1: ( rule__Expanded__Group__0__Impl rule__Expanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3071:2: rule__Expanded__Group__0__Impl rule__Expanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__06333);
            rule__Expanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__06336);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3078:1: rule__Expanded__Group__0__Impl : ( () ) ;
    public final void rule__Expanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3082:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3083:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3083:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3084:1: ()
            {
             before(grammarAccess.getExpandedAccess().getExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3085:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3087:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3097:1: rule__Expanded__Group__1 : rule__Expanded__Group__1__Impl rule__Expanded__Group__2 ;
    public final void rule__Expanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3101:1: ( rule__Expanded__Group__1__Impl rule__Expanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3102:2: rule__Expanded__Group__1__Impl rule__Expanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__16394);
            rule__Expanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__16397);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3109:1: rule__Expanded__Group__1__Impl : ( '(' ) ;
    public final void rule__Expanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3113:1: ( ( '(' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3114:1: ( '(' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3114:1: ( '(' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3115:1: '('
            {
             before(grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Expanded__Group__1__Impl6425); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3128:1: rule__Expanded__Group__2 : rule__Expanded__Group__2__Impl rule__Expanded__Group__3 ;
    public final void rule__Expanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3132:1: ( rule__Expanded__Group__2__Impl rule__Expanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3133:2: rule__Expanded__Group__2__Impl rule__Expanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__26456);
            rule__Expanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__26459);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3140:1: rule__Expanded__Group__2__Impl : ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) ;
    public final void rule__Expanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3144:1: ( ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3145:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3145:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3146:1: ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3146:1: ( ( rule__Expanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3147:1: ( rule__Expanded__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3148:1: ( rule__Expanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3148:2: rule__Expanded__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl6488);
            rule__Expanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3151:1: ( ( rule__Expanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3152:1: ( rule__Expanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3153:1: ( rule__Expanded__WCharAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EGYSTRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3153:2: rule__Expanded__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl6500);
            	    rule__Expanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3164:1: rule__Expanded__Group__3 : rule__Expanded__Group__3__Impl ;
    public final void rule__Expanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3168:1: ( rule__Expanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3169:2: rule__Expanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__36533);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3175:1: rule__Expanded__Group__3__Impl : ( ')' ) ;
    public final void rule__Expanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3179:1: ( ( ')' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3180:1: ( ')' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3180:1: ( ')' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3181:1: ')'
            {
             before(grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Expanded__Group__3__Impl6561); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3202:1: rule__Emendation__Group__0 : rule__Emendation__Group__0__Impl rule__Emendation__Group__1 ;
    public final void rule__Emendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3206:1: ( rule__Emendation__Group__0__Impl rule__Emendation__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3207:2: rule__Emendation__Group__0__Impl rule__Emendation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__06600);
            rule__Emendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__06603);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3214:1: rule__Emendation__Group__0__Impl : ( () ) ;
    public final void rule__Emendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3218:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3219:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3219:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3220:1: ()
            {
             before(grammarAccess.getEmendationAccess().getEmendationAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3221:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3223:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3233:1: rule__Emendation__Group__1 : rule__Emendation__Group__1__Impl rule__Emendation__Group__2 ;
    public final void rule__Emendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3237:1: ( rule__Emendation__Group__1__Impl rule__Emendation__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3238:2: rule__Emendation__Group__1__Impl rule__Emendation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__16661);
            rule__Emendation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__16664);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3245:1: rule__Emendation__Group__1__Impl : ( '<' ) ;
    public final void rule__Emendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3249:1: ( ( '<' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3250:1: ( '<' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3250:1: ( '<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3251:1: '<'
            {
             before(grammarAccess.getEmendationAccess().getLessThanSignKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Emendation__Group__1__Impl6692); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3264:1: rule__Emendation__Group__2 : rule__Emendation__Group__2__Impl rule__Emendation__Group__3 ;
    public final void rule__Emendation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3268:1: ( rule__Emendation__Group__2__Impl rule__Emendation__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3269:2: rule__Emendation__Group__2__Impl rule__Emendation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__26723);
            rule__Emendation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__26726);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3276:1: rule__Emendation__Group__2__Impl : ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) ;
    public final void rule__Emendation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3280:1: ( ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3281:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3281:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3282:1: ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3282:1: ( ( rule__Emendation__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3283:1: ( rule__Emendation__WCharAssignment_2 )
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3284:1: ( rule__Emendation__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3284:2: rule__Emendation__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl6755);
            rule__Emendation__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3287:1: ( ( rule__Emendation__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3288:1: ( rule__Emendation__WCharAssignment_2 )*
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3289:1: ( rule__Emendation__WCharAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_EGYSTRING||LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3289:2: rule__Emendation__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl6767);
            	    rule__Emendation__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3300:1: rule__Emendation__Group__3 : rule__Emendation__Group__3__Impl ;
    public final void rule__Emendation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3304:1: ( rule__Emendation__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3305:2: rule__Emendation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__36800);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3311:1: rule__Emendation__Group__3__Impl : ( '>' ) ;
    public final void rule__Emendation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3315:1: ( ( '>' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3316:1: ( '>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3316:1: ( '>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3317:1: '>'
            {
             before(grammarAccess.getEmendationAccess().getGreaterThanSignKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Emendation__Group__3__Impl6828); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3338:1: rule__DisputableReading__Group__0 : rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 ;
    public final void rule__DisputableReading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3342:1: ( rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3343:2: rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__06867);
            rule__DisputableReading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__06870);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3350:1: rule__DisputableReading__Group__0__Impl : ( () ) ;
    public final void rule__DisputableReading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3354:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3355:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3355:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3356:1: ()
            {
             before(grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3357:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3359:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3369:1: rule__DisputableReading__Group__1 : rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 ;
    public final void rule__DisputableReading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3373:1: ( rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3374:2: rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__16928);
            rule__DisputableReading__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__16931);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3381:1: rule__DisputableReading__Group__1__Impl : ( '\\u2E2E' ) ;
    public final void rule__DisputableReading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3385:1: ( ( '\\u2E2E' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3386:1: ( '\\u2E2E' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3386:1: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3387:1: '\\u2E2E'
            {
             before(grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__DisputableReading__Group__1__Impl6959); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3400:1: rule__DisputableReading__Group__2 : rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 ;
    public final void rule__DisputableReading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3404:1: ( rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3405:2: rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__26990);
            rule__DisputableReading__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__26993);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3412:1: rule__DisputableReading__Group__2__Impl : ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) ;
    public final void rule__DisputableReading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3416:1: ( ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3417:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3417:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3418:1: ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3418:1: ( ( rule__DisputableReading__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3419:1: ( rule__DisputableReading__WCharAssignment_2 )
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3420:1: ( rule__DisputableReading__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3420:2: rule__DisputableReading__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl7022);
            rule__DisputableReading__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3423:1: ( ( rule__DisputableReading__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3424:1: ( rule__DisputableReading__WCharAssignment_2 )*
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3425:1: ( rule__DisputableReading__WCharAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EGYSTRING||LA32_0==25) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3425:2: rule__DisputableReading__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl7034);
            	    rule__DisputableReading__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3436:1: rule__DisputableReading__Group__3 : rule__DisputableReading__Group__3__Impl ;
    public final void rule__DisputableReading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3440:1: ( rule__DisputableReading__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3441:2: rule__DisputableReading__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__37067);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3447:1: rule__DisputableReading__Group__3__Impl : ( '?' ) ;
    public final void rule__DisputableReading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3451:1: ( ( '?' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3452:1: ( '?' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3452:1: ( '?' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3453:1: '?'
            {
             before(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__DisputableReading__Group__3__Impl7095); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3474:1: rule__Lacuna__Group__0 : rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 ;
    public final void rule__Lacuna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3478:1: ( rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3479:2: rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__07134);
            rule__Lacuna__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__07137);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3486:1: rule__Lacuna__Group__0__Impl : ( () ) ;
    public final void rule__Lacuna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3490:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3491:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3491:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3492:1: ()
            {
             before(grammarAccess.getLacunaAccess().getLacunaAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3493:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3495:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3505:1: rule__Lacuna__Group__1 : rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 ;
    public final void rule__Lacuna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3509:1: ( rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3510:2: rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__17195);
            rule__Lacuna__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__17198);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3517:1: rule__Lacuna__Group__1__Impl : ( '[' ) ;
    public final void rule__Lacuna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3521:1: ( ( '[' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3522:1: ( '[' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3522:1: ( '[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3523:1: '['
            {
             before(grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Lacuna__Group__1__Impl7226); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3536:1: rule__Lacuna__Group__2 : rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 ;
    public final void rule__Lacuna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3540:1: ( rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3541:2: rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__27257);
            rule__Lacuna__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__27260);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3548:1: rule__Lacuna__Group__2__Impl : ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) ;
    public final void rule__Lacuna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3552:1: ( ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3553:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3553:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3554:1: ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3554:1: ( ( rule__Lacuna__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3555:1: ( rule__Lacuna__WCharAssignment_2 )
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3556:1: ( rule__Lacuna__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3556:2: rule__Lacuna__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl7289);
            rule__Lacuna__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3559:1: ( ( rule__Lacuna__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3560:1: ( rule__Lacuna__WCharAssignment_2 )*
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3561:1: ( rule__Lacuna__WCharAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_EGYSTRING||LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3561:2: rule__Lacuna__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl7301);
            	    rule__Lacuna__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3572:1: rule__Lacuna__Group__3 : rule__Lacuna__Group__3__Impl ;
    public final void rule__Lacuna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3576:1: ( rule__Lacuna__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3577:2: rule__Lacuna__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__37334);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3583:1: rule__Lacuna__Group__3__Impl : ( ']' ) ;
    public final void rule__Lacuna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3587:1: ( ( ']' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3588:1: ( ']' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3588:1: ( ']' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3589:1: ']'
            {
             before(grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Lacuna__Group__3__Impl7362); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3610:1: rule__Deletion__Group__0 : rule__Deletion__Group__0__Impl rule__Deletion__Group__1 ;
    public final void rule__Deletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3614:1: ( rule__Deletion__Group__0__Impl rule__Deletion__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3615:2: rule__Deletion__Group__0__Impl rule__Deletion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__07401);
            rule__Deletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__07404);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3622:1: rule__Deletion__Group__0__Impl : ( () ) ;
    public final void rule__Deletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3626:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3627:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3627:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3628:1: ()
            {
             before(grammarAccess.getDeletionAccess().getDeletionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3629:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3631:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3641:1: rule__Deletion__Group__1 : rule__Deletion__Group__1__Impl rule__Deletion__Group__2 ;
    public final void rule__Deletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3645:1: ( rule__Deletion__Group__1__Impl rule__Deletion__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3646:2: rule__Deletion__Group__1__Impl rule__Deletion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__17462);
            rule__Deletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__17465);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3653:1: rule__Deletion__Group__1__Impl : ( '{' ) ;
    public final void rule__Deletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3657:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3658:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3658:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3659:1: '{'
            {
             before(grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Deletion__Group__1__Impl7493); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3672:1: rule__Deletion__Group__2 : rule__Deletion__Group__2__Impl rule__Deletion__Group__3 ;
    public final void rule__Deletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3676:1: ( rule__Deletion__Group__2__Impl rule__Deletion__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3677:2: rule__Deletion__Group__2__Impl rule__Deletion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__27524);
            rule__Deletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__27527);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3684:1: rule__Deletion__Group__2__Impl : ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) ;
    public final void rule__Deletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3688:1: ( ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3689:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3689:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3690:1: ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3690:1: ( ( rule__Deletion__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3691:1: ( rule__Deletion__WCharAssignment_2 )
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3692:1: ( rule__Deletion__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3692:2: rule__Deletion__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl7556);
            rule__Deletion__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3695:1: ( ( rule__Deletion__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3696:1: ( rule__Deletion__WCharAssignment_2 )*
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3697:1: ( rule__Deletion__WCharAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EGYSTRING||LA34_0==25||LA34_0==43) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3697:2: rule__Deletion__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl7568);
            	    rule__Deletion__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3708:1: rule__Deletion__Group__3 : rule__Deletion__Group__3__Impl ;
    public final void rule__Deletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3712:1: ( rule__Deletion__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3713:2: rule__Deletion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__37601);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3719:1: rule__Deletion__Group__3__Impl : ( '}' ) ;
    public final void rule__Deletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3723:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3724:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3724:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3725:1: '}'
            {
             before(grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Deletion__Group__3__Impl7629); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3746:1: rule__ExpandedColumn__Group__0 : rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 ;
    public final void rule__ExpandedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3750:1: ( rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3751:2: rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__07668);
            rule__ExpandedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__07671);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3758:1: rule__ExpandedColumn__Group__0__Impl : ( () ) ;
    public final void rule__ExpandedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3762:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3763:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3763:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3764:1: ()
            {
             before(grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3765:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3767:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3777:1: rule__ExpandedColumn__Group__1 : rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 ;
    public final void rule__ExpandedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3781:1: ( rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3782:2: rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__17729);
            rule__ExpandedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__17732);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3789:1: rule__ExpandedColumn__Group__1__Impl : ( '<<' ) ;
    public final void rule__ExpandedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3793:1: ( ( '<<' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3794:1: ( '<<' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3794:1: ( '<<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3795:1: '<<'
            {
             before(grammarAccess.getExpandedColumnAccess().getLessThanSignLessThanSignKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ExpandedColumn__Group__1__Impl7760); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3808:1: rule__ExpandedColumn__Group__2 : rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 ;
    public final void rule__ExpandedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3812:1: ( rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3813:2: rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__27791);
            rule__ExpandedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__27794);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3820:1: rule__ExpandedColumn__Group__2__Impl : ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) ;
    public final void rule__ExpandedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3824:1: ( ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3825:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3825:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3826:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3826:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3827:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3828:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3828:2: rule__ExpandedColumn__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl7823);
            rule__ExpandedColumn__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3831:1: ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3832:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3833:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_EGYSTRING||LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3833:2: rule__ExpandedColumn__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl7835);
            	    rule__ExpandedColumn__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3844:1: rule__ExpandedColumn__Group__3 : rule__ExpandedColumn__Group__3__Impl ;
    public final void rule__ExpandedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3848:1: ( rule__ExpandedColumn__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3849:2: rule__ExpandedColumn__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__37868);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3855:1: rule__ExpandedColumn__Group__3__Impl : ( '>>' ) ;
    public final void rule__ExpandedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3859:1: ( ( '>>' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3860:1: ( '>>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3860:1: ( '>>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3861:1: '>>'
            {
             before(grammarAccess.getExpandedColumnAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ExpandedColumn__Group__3__Impl7896); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3882:1: rule__Rasur__Group__0 : rule__Rasur__Group__0__Impl rule__Rasur__Group__1 ;
    public final void rule__Rasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3886:1: ( rule__Rasur__Group__0__Impl rule__Rasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3887:2: rule__Rasur__Group__0__Impl rule__Rasur__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__07935);
            rule__Rasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__07938);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3894:1: rule__Rasur__Group__0__Impl : ( () ) ;
    public final void rule__Rasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3898:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3899:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3899:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3900:1: ()
            {
             before(grammarAccess.getRasurAccess().getRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3901:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3903:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3913:1: rule__Rasur__Group__1 : rule__Rasur__Group__1__Impl rule__Rasur__Group__2 ;
    public final void rule__Rasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3917:1: ( rule__Rasur__Group__1__Impl rule__Rasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3918:2: rule__Rasur__Group__1__Impl rule__Rasur__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__17996);
            rule__Rasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__17999);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3925:1: rule__Rasur__Group__1__Impl : ( '{{' ) ;
    public final void rule__Rasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3929:1: ( ( '{{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3930:1: ( '{{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3930:1: ( '{{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3931:1: '{{'
            {
             before(grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Rasur__Group__1__Impl8027); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3944:1: rule__Rasur__Group__2 : rule__Rasur__Group__2__Impl rule__Rasur__Group__3 ;
    public final void rule__Rasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3948:1: ( rule__Rasur__Group__2__Impl rule__Rasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3949:2: rule__Rasur__Group__2__Impl rule__Rasur__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__28058);
            rule__Rasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__28061);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3956:1: rule__Rasur__Group__2__Impl : ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) ;
    public final void rule__Rasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3960:1: ( ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3961:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3961:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3962:1: ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3962:1: ( ( rule__Rasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3963:1: ( rule__Rasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3964:1: ( rule__Rasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3964:2: rule__Rasur__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl8090);
            rule__Rasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRasurAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3967:1: ( ( rule__Rasur__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3968:1: ( rule__Rasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3969:1: ( rule__Rasur__WCharAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EGYSTRING||LA36_0==25) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3969:2: rule__Rasur__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl8102);
            	    rule__Rasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3980:1: rule__Rasur__Group__3 : rule__Rasur__Group__3__Impl ;
    public final void rule__Rasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3984:1: ( rule__Rasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3985:2: rule__Rasur__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__38135);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3991:1: rule__Rasur__Group__3__Impl : ( '}}' ) ;
    public final void rule__Rasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3995:1: ( ( '}}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3996:1: ( '}}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3996:1: ( '}}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3997:1: '}}'
            {
             before(grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Rasur__Group__3__Impl8163); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4018:1: rule__AncientExpanded__Group__0 : rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 ;
    public final void rule__AncientExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4022:1: ( rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4023:2: rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__08202);
            rule__AncientExpanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__08205);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4030:1: rule__AncientExpanded__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4034:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4035:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4035:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4036:1: ()
            {
             before(grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4037:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4039:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4049:1: rule__AncientExpanded__Group__1 : rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 ;
    public final void rule__AncientExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4053:1: ( rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4054:2: rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__18263);
            rule__AncientExpanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__18266);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4061:1: rule__AncientExpanded__Group__1__Impl : ( '((' ) ;
    public final void rule__AncientExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4065:1: ( ( '((' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4066:1: ( '((' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4066:1: ( '((' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4067:1: '(('
            {
             before(grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__AncientExpanded__Group__1__Impl8294); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4080:1: rule__AncientExpanded__Group__2 : rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 ;
    public final void rule__AncientExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4084:1: ( rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4085:2: rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__28325);
            rule__AncientExpanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__28328);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4092:1: rule__AncientExpanded__Group__2__Impl : ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) ;
    public final void rule__AncientExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4096:1: ( ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4097:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4097:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4098:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4098:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4099:1: ( rule__AncientExpanded__WCharAssignment_2 )
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4100:1: ( rule__AncientExpanded__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4100:2: rule__AncientExpanded__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl8357);
            rule__AncientExpanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4103:1: ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4104:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4105:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||LA37_0==25) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4105:2: rule__AncientExpanded__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl8369);
            	    rule__AncientExpanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4116:1: rule__AncientExpanded__Group__3 : rule__AncientExpanded__Group__3__Impl ;
    public final void rule__AncientExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4120:1: ( rule__AncientExpanded__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4121:2: rule__AncientExpanded__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__38402);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4127:1: rule__AncientExpanded__Group__3__Impl : ( '))' ) ;
    public final void rule__AncientExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4131:1: ( ( '))' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4132:1: ( '))' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4132:1: ( '))' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4133:1: '))'
            {
             before(grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__AncientExpanded__Group__3__Impl8430); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4154:1: rule__RestorationOverRasur__Group__0 : rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 ;
    public final void rule__RestorationOverRasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4158:1: ( rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4159:2: rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__08469);
            rule__RestorationOverRasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__08472);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4166:1: rule__RestorationOverRasur__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4170:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4171:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4171:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4172:1: ()
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4173:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4175:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4185:1: rule__RestorationOverRasur__Group__1 : rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 ;
    public final void rule__RestorationOverRasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4189:1: ( rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4190:2: rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__18530);
            rule__RestorationOverRasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__18533);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4197:1: rule__RestorationOverRasur__Group__1__Impl : ( '[[' ) ;
    public final void rule__RestorationOverRasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4201:1: ( ( '[[' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4202:1: ( '[[' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4202:1: ( '[[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4203:1: '[['
            {
             before(grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__RestorationOverRasur__Group__1__Impl8561); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4216:1: rule__RestorationOverRasur__Group__2 : rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 ;
    public final void rule__RestorationOverRasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4220:1: ( rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4221:2: rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__28592);
            rule__RestorationOverRasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__28595);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4228:1: rule__RestorationOverRasur__Group__2__Impl : ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) ;
    public final void rule__RestorationOverRasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4232:1: ( ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4233:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4233:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4234:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4234:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4235:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4236:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4236:2: rule__RestorationOverRasur__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl8624);
            rule__RestorationOverRasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4239:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4240:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4241:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EGYSTRING||LA38_0==25) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4241:2: rule__RestorationOverRasur__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl8636);
            	    rule__RestorationOverRasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4252:1: rule__RestorationOverRasur__Group__3 : rule__RestorationOverRasur__Group__3__Impl ;
    public final void rule__RestorationOverRasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4256:1: ( rule__RestorationOverRasur__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4257:2: rule__RestorationOverRasur__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__38669);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4263:1: rule__RestorationOverRasur__Group__3__Impl : ( ']]' ) ;
    public final void rule__RestorationOverRasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4267:1: ( ( ']]' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4268:1: ( ']]' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4268:1: ( ']]' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4269:1: ']]'
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__RestorationOverRasur__Group__3__Impl8697); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4290:1: rule__PartialDestruction__Group__0 : rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 ;
    public final void rule__PartialDestruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4294:1: ( rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4295:2: rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__08736);
            rule__PartialDestruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__08739);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4302:1: rule__PartialDestruction__Group__0__Impl : ( () ) ;
    public final void rule__PartialDestruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4306:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4307:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4307:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4308:1: ()
            {
             before(grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4309:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4311:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4321:1: rule__PartialDestruction__Group__1 : rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 ;
    public final void rule__PartialDestruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4325:1: ( rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4326:2: rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__18797);
            rule__PartialDestruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__18800);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4333:1: rule__PartialDestruction__Group__1__Impl : ( '\\u2E22' ) ;
    public final void rule__PartialDestruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4337:1: ( ( '\\u2E22' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4338:1: ( '\\u2E22' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4338:1: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4339:1: '\\u2E22'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__PartialDestruction__Group__1__Impl8828); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4352:1: rule__PartialDestruction__Group__2 : rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 ;
    public final void rule__PartialDestruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4356:1: ( rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4357:2: rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__28859);
            rule__PartialDestruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__28862);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4364:1: rule__PartialDestruction__Group__2__Impl : ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) ;
    public final void rule__PartialDestruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4368:1: ( ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4369:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4369:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4370:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4370:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4371:1: ( rule__PartialDestruction__WCharAssignment_2 )
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4372:1: ( rule__PartialDestruction__WCharAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4372:2: rule__PartialDestruction__WCharAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl8891);
            rule__PartialDestruction__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 

            }

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4375:1: ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4376:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4377:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EGYSTRING||LA39_0==25||LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4377:2: rule__PartialDestruction__WCharAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl8903);
            	    rule__PartialDestruction__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4388:1: rule__PartialDestruction__Group__3 : rule__PartialDestruction__Group__3__Impl ;
    public final void rule__PartialDestruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4392:1: ( rule__PartialDestruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4393:2: rule__PartialDestruction__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__38936);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4399:1: rule__PartialDestruction__Group__3__Impl : ( '\\u2E23' ) ;
    public final void rule__PartialDestruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4403:1: ( ( '\\u2E23' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4404:1: ( '\\u2E23' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4404:1: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4405:1: '\\u2E23'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__PartialDestruction__Group__3__Impl8964); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4426:1: rule__Destruction__Group__0 : rule__Destruction__Group__0__Impl rule__Destruction__Group__1 ;
    public final void rule__Destruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4430:1: ( rule__Destruction__Group__0__Impl rule__Destruction__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4431:2: rule__Destruction__Group__0__Impl rule__Destruction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__0__Impl_in_rule__Destruction__Group__09003);
            rule__Destruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__1_in_rule__Destruction__Group__09006);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4438:1: rule__Destruction__Group__0__Impl : ( () ) ;
    public final void rule__Destruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4442:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4443:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4443:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4444:1: ()
            {
             before(grammarAccess.getDestructionAccess().getDestructionAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4445:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4447:1: 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4457:1: rule__Destruction__Group__1 : rule__Destruction__Group__1__Impl rule__Destruction__Group__2 ;
    public final void rule__Destruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4461:1: ( rule__Destruction__Group__1__Impl rule__Destruction__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4462:2: rule__Destruction__Group__1__Impl rule__Destruction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__1__Impl_in_rule__Destruction__Group__19064);
            rule__Destruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__2_in_rule__Destruction__Group__19067);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4469:1: rule__Destruction__Group__1__Impl : ( '\\u2013' ) ;
    public final void rule__Destruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4473:1: ( ( '\\u2013' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4474:1: ( '\\u2013' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4474:1: ( '\\u2013' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4475:1: '\\u2013'
            {
             before(grammarAccess.getDestructionAccess().getEnDashKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Destruction__Group__1__Impl9095); 
             after(grammarAccess.getDestructionAccess().getEnDashKeyword_1()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4488:1: rule__Destruction__Group__2 : rule__Destruction__Group__2__Impl rule__Destruction__Group__3 ;
    public final void rule__Destruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4492:1: ( rule__Destruction__Group__2__Impl rule__Destruction__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4493:2: rule__Destruction__Group__2__Impl rule__Destruction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__2__Impl_in_rule__Destruction__Group__29126);
            rule__Destruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__3_in_rule__Destruction__Group__29129);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4500:1: rule__Destruction__Group__2__Impl : ( ( rule__Destruction__CommentAssignment_2 ) ) ;
    public final void rule__Destruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4504:1: ( ( ( rule__Destruction__CommentAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4505:1: ( ( rule__Destruction__CommentAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4505:1: ( ( rule__Destruction__CommentAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4506:1: ( rule__Destruction__CommentAssignment_2 )
            {
             before(grammarAccess.getDestructionAccess().getCommentAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4507:1: ( rule__Destruction__CommentAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4507:2: rule__Destruction__CommentAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__CommentAssignment_2_in_rule__Destruction__Group__2__Impl9156);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4517:1: rule__Destruction__Group__3 : rule__Destruction__Group__3__Impl ;
    public final void rule__Destruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4521:1: ( rule__Destruction__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4522:2: rule__Destruction__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Destruction__Group__3__Impl_in_rule__Destruction__Group__39186);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4528:1: rule__Destruction__Group__3__Impl : ( '\\u2013' ) ;
    public final void rule__Destruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4532:1: ( ( '\\u2013' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4533:1: ( '\\u2013' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4533:1: ( '\\u2013' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4534:1: '\\u2013'
            {
             before(grammarAccess.getDestructionAccess().getEnDashKeyword_3()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Destruction__Group__3__Impl9214); 
             after(grammarAccess.getDestructionAccess().getEnDashKeyword_3()); 

            }


            }

        }
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4556:1: rule__TextContent__ItemsAssignment_1_0 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4560:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4561:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4561:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4562:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_09258);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4571:1: rule__TextContent__ItemsAssignment_1_1_1 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4575:1: ( ( ruleTextItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4576:1: ( ruleTextItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4576:1: ( ruleTextItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4577:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_1_19289);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4586:1: rule__Sentence__ItemsAssignment_2_0 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4590:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4591:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4591:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4592:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_09320);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4601:1: rule__Sentence__ItemsAssignment_2_1_2 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4605:1: ( ( ruleSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4606:1: ( ruleSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4606:1: ( ruleSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4607:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_1_29351);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4616:1: rule__Ambivalence__CasesAssignment_1_0 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4620:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4621:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4621:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4622:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_09382);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4631:1: rule__Ambivalence__CasesAssignment_1_1_2 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4635:1: ( ( ruleCase ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4636:1: ( ruleCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4636:1: ( ruleCase )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4637:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_29413);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4646:1: rule__Case__NameAssignment_0 : ( RULE_CASESTRING ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4650:1: ( ( RULE_CASESTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4651:1: ( RULE_CASESTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4651:1: ( RULE_CASESTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4652:1: RULE_CASESTRING
            {
             before(grammarAccess.getCaseAccess().getNameCASESTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_CASESTRING,FollowSets000.FOLLOW_RULE_CASESTRING_in_rule__Case__NameAssignment_09444); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4661:1: rule__Case__ItemsAssignment_2_0 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4665:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4666:1: ( ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4666:1: ( ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4667:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_09475);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4676:1: rule__Case__ItemsAssignment_2_1_2 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4680:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4681:1: ( ruleSentenceItemNoAmbivalence )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4681:1: ( ruleSentenceItemNoAmbivalence )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4682:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_1_29506);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4691:1: rule__Marker__TypeAssignment : ( RULE_BETWEEN_HASHES ) ;
    public final void rule__Marker__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4695:1: ( ( RULE_BETWEEN_HASHES ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4696:1: ( RULE_BETWEEN_HASHES )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4696:1: ( RULE_BETWEEN_HASHES )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4697:1: RULE_BETWEEN_HASHES
            {
             before(grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0()); 
            match(input,RULE_BETWEEN_HASHES,FollowSets000.FOLLOW_RULE_BETWEEN_HASHES_in_rule__Marker__TypeAssignment9537); 
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


    // $ANTLR start "rule__Word__WCharAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4706:1: rule__Word__WCharAssignment_1_0 : ( ruleWordPart ) ;
    public final void rule__Word__WCharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4710:1: ( ( ruleWordPart ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4711:1: ( ruleWordPart )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4711:1: ( ruleWordPart )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4712:1: ruleWordPart
            {
             before(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_09568);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4721:1: rule__Word__WCharAssignment_1_1_1 : ( ruleWordPart ) ;
    public final void rule__Word__WCharAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4725:1: ( ( ruleWordPart ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4726:1: ( ruleWordPart )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4726:1: ( ruleWordPart )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4727:1: ruleWordPart
            {
             before(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_1_19599);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4736:1: rule__WordPart__WCharAssignment_1_0 : ( ruleWordMiddle ) ;
    public final void rule__WordPart__WCharAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4740:1: ( ( ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4741:1: ( ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4741:1: ( ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4742:1: ruleWordMiddle
            {
             before(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_09630);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4751:1: rule__WordPart__WCharAssignment_1_1 : ( ruleWordMiddle ) ;
    public final void rule__WordPart__WCharAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4755:1: ( ( ruleWordMiddle ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4756:1: ( ruleWordMiddle )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4756:1: ( ruleWordMiddle )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4757:1: ruleWordMiddle
            {
             before(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_19661);
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


    // $ANTLR start "rule__Chars__NameAssignment"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4766:1: rule__Chars__NameAssignment : ( RULE_EGYSTRING ) ;
    public final void rule__Chars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4770:1: ( ( RULE_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4771:1: ( RULE_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4771:1: ( RULE_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4772:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            match(input,RULE_EGYSTRING,FollowSets000.FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment9692); 
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4781:1: rule__Expanded__WCharAssignment_2 : ( ruleNoExpanded ) ;
    public final void rule__Expanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4785:1: ( ( ruleNoExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4786:1: ( ruleNoExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4786:1: ( ruleNoExpanded )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4787:1: ruleNoExpanded
            {
             before(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_29723);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4796:1: rule__Emendation__WCharAssignment_2 : ( ruleNoEmendation ) ;
    public final void rule__Emendation__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4800:1: ( ( ruleNoEmendation ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4801:1: ( ruleNoEmendation )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4801:1: ( ruleNoEmendation )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4802:1: ruleNoEmendation
            {
             before(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_29754);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4811:1: rule__DisputableReading__WCharAssignment_2 : ( ruleNoDisputableReading ) ;
    public final void rule__DisputableReading__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4815:1: ( ( ruleNoDisputableReading ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4816:1: ( ruleNoDisputableReading )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4816:1: ( ruleNoDisputableReading )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4817:1: ruleNoDisputableReading
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_29785);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4826:1: rule__Lacuna__WCharAssignment_2 : ( ruleNoLacuna ) ;
    public final void rule__Lacuna__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4830:1: ( ( ruleNoLacuna ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4831:1: ( ruleNoLacuna )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4831:1: ( ruleNoLacuna )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4832:1: ruleNoLacuna
            {
             before(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_29816);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4841:1: rule__Deletion__WCharAssignment_2 : ( ruleNoDeletion ) ;
    public final void rule__Deletion__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4845:1: ( ( ruleNoDeletion ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4846:1: ( ruleNoDeletion )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4846:1: ( ruleNoDeletion )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4847:1: ruleNoDeletion
            {
             before(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_29847);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4856:1: rule__ExpandedColumn__WCharAssignment_2 : ( ruleNoExpandedColumn ) ;
    public final void rule__ExpandedColumn__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4860:1: ( ( ruleNoExpandedColumn ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4861:1: ( ruleNoExpandedColumn )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4861:1: ( ruleNoExpandedColumn )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4862:1: ruleNoExpandedColumn
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_29878);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4871:1: rule__Rasur__WCharAssignment_2 : ( ruleNoRasur ) ;
    public final void rule__Rasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4875:1: ( ( ruleNoRasur ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4876:1: ( ruleNoRasur )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4876:1: ( ruleNoRasur )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4877:1: ruleNoRasur
            {
             before(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_29909);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4886:1: rule__AncientExpanded__WCharAssignment_2 : ( ruleNoAncientExpanded ) ;
    public final void rule__AncientExpanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4890:1: ( ( ruleNoAncientExpanded ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4891:1: ( ruleNoAncientExpanded )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4891:1: ( ruleNoAncientExpanded )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4892:1: ruleNoAncientExpanded
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_29940);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4901:1: rule__RestorationOverRasur__WCharAssignment_2 : ( ruleNoRestorationOverRasur ) ;
    public final void rule__RestorationOverRasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4905:1: ( ( ruleNoRestorationOverRasur ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4906:1: ( ruleNoRestorationOverRasur )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4906:1: ( ruleNoRestorationOverRasur )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4907:1: ruleNoRestorationOverRasur
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_29971);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4916:1: rule__PartialDestruction__WCharAssignment_2 : ( ruleNoPartialDestruction ) ;
    public final void rule__PartialDestruction__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4920:1: ( ( ruleNoPartialDestruction ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4921:1: ( ruleNoPartialDestruction )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4921:1: ( ruleNoPartialDestruction )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4922:1: ruleNoPartialDestruction
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_210002);
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
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4931:1: rule__Destruction__CommentAssignment_2 : ( RULE_COMMNENT_EGYSTRING ) ;
    public final void rule__Destruction__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4935:1: ( ( RULE_COMMNENT_EGYSTRING ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4936:1: ( RULE_COMMNENT_EGYSTRING )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4936:1: ( RULE_COMMNENT_EGYSTRING )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4937:1: RULE_COMMNENT_EGYSTRING
            {
             before(grammarAccess.getDestructionAccess().getCommentCOMMNENT_EGYSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_COMMNENT_EGYSTRING,FollowSets000.FOLLOW_RULE_COMMNENT_EGYSTRING_in_rule__Destruction__CommentAssignment_210033); 
             after(grammarAccess.getDestructionAccess().getCommentCOMMNENT_EGYSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
        public static final BitSet FOLLOW_rule__Marker__TypeAssignment_in_ruleMarker813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_entryRuleWord840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWord847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group__0_in_ruleWord873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordPart_in_entryRuleWordPart900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWordPart907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__Group__0_in_ruleWordPart933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_entryRuleWordMiddle960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWordMiddle967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordMiddle__Alternatives_in_ruleWordMiddle993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_entryRuleChars1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChars1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Chars__NameAssignment_in_ruleChars1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Brackets__Alternatives_in_ruleBrackets1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_entryRuleExpanded1140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpanded1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__0_in_ruleExpanded1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_entryRuleNoExpanded1200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpanded1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_ruleNoExpanded1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_entryRuleEmendation1259 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmendation1266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__0_in_ruleEmendation1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_entryRuleNoEmendation1319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoEmendation1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoEmendation__Alternatives_in_ruleNoEmendation1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_entryRuleDisputableReading1379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDisputableReading1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__0_in_ruleDisputableReading1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_entryRuleNoDisputableReading1439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDisputableReading1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoDisputableReading__Alternatives_in_ruleNoDisputableReading1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_entryRuleLacuna1499 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLacuna1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__0_in_ruleLacuna1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_entryRuleNoLacuna1559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoLacuna1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoLacuna__Alternatives_in_ruleNoLacuna1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_entryRuleDeletion1619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeletion1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__0_in_ruleDeletion1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_entryRuleNoDeletion1679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoDeletion1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoDeletion__Alternatives_in_ruleNoDeletion1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_entryRuleExpandedColumn1739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpandedColumn1746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0_in_ruleExpandedColumn1772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_entryRuleNoExpandedColumn1799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoExpandedColumn1806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoExpandedColumn__Alternatives_in_ruleNoExpandedColumn1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_entryRuleRasur1859 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRasur1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__0_in_ruleRasur1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRasur_in_entryRuleNoRasur1919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRasur1926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRasur__Alternatives_in_ruleNoRasur1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_entryRuleAncientExpanded1979 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAncientExpanded1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__0_in_ruleAncientExpanded2012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_entryRuleNoAncientExpanded2039 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAncientExpanded2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoAncientExpanded__Alternatives_in_ruleNoAncientExpanded2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_entryRuleRestorationOverRasur2099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestorationOverRasur2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0_in_ruleRestorationOverRasur2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_entryRuleNoRestorationOverRasur2159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoRestorationOverRasur2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoRestorationOverRasur__Alternatives_in_ruleNoRestorationOverRasur2192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_entryRulePartialDestruction2219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePartialDestruction2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__0_in_rulePartialDestruction2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_entryRuleNoPartialDestruction2279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoPartialDestruction2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NoPartialDestruction__Alternatives_in_ruleNoPartialDestruction2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_entryRuleDestruction2339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDestruction2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__0_in_ruleDestruction2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TextContent__Alternatives_1_1_02409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__TextContent__Alternatives_1_1_02428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItem__Alternatives2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItem__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmbivalence_in_rule__SentenceItem__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMarker_in_rule__AbstractMarker__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersMarker_in_rule__AbstractMarker__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_rule__SentenceItemNoAmbivalence__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMarker_in_rule__SentenceItemNoAmbivalence__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersbreakMarker_in_rule__VersMarker__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersFrontierMarker_in_rule__VersMarker__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrokenVersbreakMarker_in_rule__VersMarker__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrackets_in_rule__WordMiddle__Alternatives2690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__WordMiddle__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRasur_in_rule__Brackets__Alternatives2739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAncientExpanded_in_rule__Brackets__Alternatives2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestorationOverRasur_in_rule__Brackets__Alternatives2773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__Brackets__Alternatives2790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDisputableReading_in_rule__Brackets__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmendation_in_rule__Brackets__Alternatives2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLacuna_in_rule__Brackets__Alternatives2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_rule__Brackets__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpandedColumn_in_rule__Brackets__Alternatives2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_rule__Brackets__Alternatives2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestruction_in_rule__Brackets__Alternatives2909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoEmendation__Alternatives2941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoEmendation__Alternatives2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDisputableReading__Alternatives2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoDisputableReading__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoLacuna__Alternatives3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoLacuna__Alternatives3056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoDeletion__Alternatives3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePartialDestruction_in_rule__NoDeletion__Alternatives3105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoDeletion__Alternatives3122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoExpandedColumn__Alternatives3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoExpandedColumn__Alternatives3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoRasur__Alternatives3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoRasur__Alternatives3220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoAncientExpanded__Alternatives3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoAncientExpanded__Alternatives3269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoRestorationOverRasur__Alternatives3301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoRestorationOverRasur__Alternatives3318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChars_in_rule__NoPartialDestruction__Alternatives3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeletion_in_rule__NoPartialDestruction__Alternatives3367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpanded_in_rule__NoPartialDestruction__Alternatives3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group__0__Impl_in_rule__TextContent__Group__03414 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TextContent__Group__1_in_rule__TextContent__Group__03417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group__1__Impl_in_rule__TextContent__Group__13475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__0_in_rule__TextContent__Group__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__0__Impl_in_rule__TextContent__Group_1__03536 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__1_in_rule__TextContent__Group_1__03539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_0_in_rule__TextContent__Group_1__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1__1__Impl_in_rule__TextContent__Group_1__13596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1_1__0_in_rule__TextContent__Group_1__1__Impl3623 = new BitSet(new long[]{0x0000000000030012L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1_1__0__Impl_in_rule__TextContent__Group_1_1__03658 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1_1__1_in_rule__TextContent__Group_1_1__03661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Alternatives_1_1_0_in_rule__TextContent__Group_1_1__0__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__Group_1_1__1__Impl_in_rule__TextContent__Group_1_1__13719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextContent__ItemsAssignment_1_1_1_in_rule__TextContent__Group_1_1__1__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__03780 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__03783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__13841 = new BitSet(new long[]{0x00002AAAAB7600C0L});
        public static final BitSet FOLLOW_rule__Sentence__Group__2_in_rule__Sentence__Group__13844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Sentence__Group__1__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__2__Impl_in_rule__Sentence__Group__23903 = new BitSet(new long[]{0x00002AAAAB7600C0L});
        public static final BitSet FOLLOW_rule__Sentence__Group__3_in_rule__Sentence__Group__23906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2__0_in_rule__Sentence__Group__2__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__3__Impl_in_rule__Sentence__Group__33964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Sentence__Group__3__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2__0__Impl_in_rule__Sentence__Group_2__04031 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2__1_in_rule__Sentence__Group_2__04034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_2_0_in_rule__Sentence__Group_2__0__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2__1__Impl_in_rule__Sentence__Group_2__14091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2_1__0_in_rule__Sentence__Group_2__1__Impl4118 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2_1__0__Impl_in_rule__Sentence__Group_2_1__04153 = new BitSet(new long[]{0x00002AAAAB7400D0L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2_1__1_in_rule__Sentence__Group_2_1__04156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Sentence__Group_2_1__0__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2_1__1__Impl_in_rule__Sentence__Group_2_1__14215 = new BitSet(new long[]{0x00002AAAAB7400D0L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2_1__2_in_rule__Sentence__Group_2_1__14218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Sentence__Group_2_1__1__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group_2_1__2__Impl_in_rule__Sentence__Group_2_1__24277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__ItemsAssignment_2_1_2_in_rule__Sentence__Group_2_1__2__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__0__Impl_in_rule__Ambivalence__Group__04340 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__1_in_rule__Ambivalence__Group__04343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ambivalence__Group__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__1__Impl_in_rule__Ambivalence__Group__14402 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__2_in_rule__Ambivalence__Group__14405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0_in_rule__Ambivalence__Group__1__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group__2__Impl_in_rule__Ambivalence__Group__24462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Ambivalence__Group__2__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__0__Impl_in_rule__Ambivalence__Group_1__04527 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1_in_rule__Ambivalence__Group_1__04530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_0_in_rule__Ambivalence__Group_1__0__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1__1__Impl_in_rule__Ambivalence__Group_1__14587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl4616 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0_in_rule__Ambivalence__Group_1__1__Impl4628 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__0__Impl_in_rule__Ambivalence__Group_1_1__04665 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1_in_rule__Ambivalence__Group_1_1__04668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Ambivalence__Group_1_1__0__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__1__Impl_in_rule__Ambivalence__Group_1_1__14727 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__2_in_rule__Ambivalence__Group_1_1__14730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Ambivalence__Group_1_1__1__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__Group_1_1__2__Impl_in_rule__Ambivalence__Group_1_1__24789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ambivalence__CasesAssignment_1_1_2_in_rule__Ambivalence__Group_1_1__2__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__04852 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__04855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__NameAssignment_0_in_rule__Case__Group__0__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__14912 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__14915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Case__Group__1__Impl4943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__24974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_2__0_in_rule__Case__Group__2__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_2__0__Impl_in_rule__Case__Group_2__05037 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Case__Group_2__1_in_rule__Case__Group_2__05040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__ItemsAssignment_2_0_in_rule__Case__Group_2__0__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_2__1__Impl_in_rule__Case__Group_2__15097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_2_1__0_in_rule__Case__Group_2__1__Impl5124 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Case__Group_2_1__0__Impl_in_rule__Case__Group_2_1__05159 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_rule__Case__Group_2_1__1_in_rule__Case__Group_2_1__05162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Case__Group_2_1__0__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_2_1__1__Impl_in_rule__Case__Group_2_1__15221 = new BitSet(new long[]{0x00002AAAAB7000D0L});
        public static final BitSet FOLLOW_rule__Case__Group_2_1__2_in_rule__Case__Group_2_1__15224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Case__Group_2_1__1__Impl5252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__Group_2_1__2__Impl_in_rule__Case__Group_2_1__25283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Case__ItemsAssignment_2_1_2_in_rule__Case__Group_2_1__2__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__0__Impl_in_rule__VersFrontierMarker__Group__05346 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__1_in_rule__VersFrontierMarker__Group__05349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersFrontierMarker__Group__1__Impl_in_rule__VersFrontierMarker__Group__15407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__VersFrontierMarker__Group__1__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersbreakMarker__Group__0__Impl_in_rule__VersbreakMarker__Group__05470 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__VersbreakMarker__Group__1_in_rule__VersbreakMarker__Group__05473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VersbreakMarker__Group__1__Impl_in_rule__VersbreakMarker__Group__15531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__VersbreakMarker__Group__1__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__0__Impl_in_rule__BrokenVersbreakMarker__Group__05594 = new BitSet(new long[]{0x0000000000700040L});
        public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__1_in_rule__BrokenVersbreakMarker__Group__05597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BrokenVersbreakMarker__Group__1__Impl_in_rule__BrokenVersbreakMarker__Group__15655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BrokenVersbreakMarker__Group__1__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group__0__Impl_in_rule__Word__Group__05718 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Word__Group__1_in_rule__Word__Group__05721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group__1__Impl_in_rule__Word__Group__15779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group_1__0_in_rule__Word__Group__1__Impl5806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group_1__0__Impl_in_rule__Word__Group_1__05840 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Word__Group_1__1_in_rule__Word__Group_1__05843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_0_in_rule__Word__Group_1__0__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group_1__1__Impl_in_rule__Word__Group_1__15900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group_1_1__0_in_rule__Word__Group_1__1__Impl5927 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Word__Group_1_1__0__Impl_in_rule__Word__Group_1_1__05962 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Word__Group_1_1__1_in_rule__Word__Group_1_1__05965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Word__Group_1_1__0__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__Group_1_1__1__Impl_in_rule__Word__Group_1_1__16024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__WCharAssignment_1_1_1_in_rule__Word__Group_1_1__1__Impl6051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__Group__0__Impl_in_rule__WordPart__Group__06085 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__WordPart__Group__1_in_rule__WordPart__Group__06088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__WordPart__Group__0__Impl6117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__Group__1__Impl_in_rule__WordPart__Group__16150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__Group_1__0_in_rule__WordPart__Group__1__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__Group_1__0__Impl_in_rule__WordPart__Group_1__06211 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__WordPart__Group_1__1_in_rule__WordPart__Group_1__06214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_0_in_rule__WordPart__Group_1__0__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__Group_1__1__Impl_in_rule__WordPart__Group_1__16271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WordPart__WCharAssignment_1_1_in_rule__WordPart__Group_1__1__Impl6298 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Expanded__Group__0__Impl_in_rule__Expanded__Group__06333 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Expanded__Group__1_in_rule__Expanded__Group__06336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__1__Impl_in_rule__Expanded__Group__16394 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Expanded__Group__2_in_rule__Expanded__Group__16397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Expanded__Group__1__Impl6425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__Group__2__Impl_in_rule__Expanded__Group__26456 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Expanded__Group__3_in_rule__Expanded__Group__26459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl6488 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Expanded__WCharAssignment_2_in_rule__Expanded__Group__2__Impl6500 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Expanded__Group__3__Impl_in_rule__Expanded__Group__36533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Expanded__Group__3__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__0__Impl_in_rule__Emendation__Group__06600 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Emendation__Group__1_in_rule__Emendation__Group__06603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__1__Impl_in_rule__Emendation__Group__16661 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Emendation__Group__2_in_rule__Emendation__Group__16664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Emendation__Group__1__Impl6692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__Group__2__Impl_in_rule__Emendation__Group__26723 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Emendation__Group__3_in_rule__Emendation__Group__26726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl6755 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Emendation__WCharAssignment_2_in_rule__Emendation__Group__2__Impl6767 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Emendation__Group__3__Impl_in_rule__Emendation__Group__36800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Emendation__Group__3__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__0__Impl_in_rule__DisputableReading__Group__06867 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__1_in_rule__DisputableReading__Group__06870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__1__Impl_in_rule__DisputableReading__Group__16928 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__2_in_rule__DisputableReading__Group__16931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__DisputableReading__Group__1__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__2__Impl_in_rule__DisputableReading__Group__26990 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__3_in_rule__DisputableReading__Group__26993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl7022 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__DisputableReading__WCharAssignment_2_in_rule__DisputableReading__Group__2__Impl7034 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__DisputableReading__Group__3__Impl_in_rule__DisputableReading__Group__37067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__DisputableReading__Group__3__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__0__Impl_in_rule__Lacuna__Group__07134 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__1_in_rule__Lacuna__Group__07137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__1__Impl_in_rule__Lacuna__Group__17195 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__2_in_rule__Lacuna__Group__17198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Lacuna__Group__1__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__2__Impl_in_rule__Lacuna__Group__27257 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__3_in_rule__Lacuna__Group__27260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl7289 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Lacuna__WCharAssignment_2_in_rule__Lacuna__Group__2__Impl7301 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Lacuna__Group__3__Impl_in_rule__Lacuna__Group__37334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Lacuna__Group__3__Impl7362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__0__Impl_in_rule__Deletion__Group__07401 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Deletion__Group__1_in_rule__Deletion__Group__07404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__1__Impl_in_rule__Deletion__Group__17462 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Deletion__Group__2_in_rule__Deletion__Group__17465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Deletion__Group__1__Impl7493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__Group__2__Impl_in_rule__Deletion__Group__27524 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Deletion__Group__3_in_rule__Deletion__Group__27527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl7556 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Deletion__WCharAssignment_2_in_rule__Deletion__Group__2__Impl7568 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Deletion__Group__3__Impl_in_rule__Deletion__Group__37601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Deletion__Group__3__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__0__Impl_in_rule__ExpandedColumn__Group__07668 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1_in_rule__ExpandedColumn__Group__07671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__1__Impl_in_rule__ExpandedColumn__Group__17729 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2_in_rule__ExpandedColumn__Group__17732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ExpandedColumn__Group__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__2__Impl_in_rule__ExpandedColumn__Group__27791 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3_in_rule__ExpandedColumn__Group__27794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl7823 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__WCharAssignment_2_in_rule__ExpandedColumn__Group__2__Impl7835 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__ExpandedColumn__Group__3__Impl_in_rule__ExpandedColumn__Group__37868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ExpandedColumn__Group__3__Impl7896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__0__Impl_in_rule__Rasur__Group__07935 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Rasur__Group__1_in_rule__Rasur__Group__07938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__1__Impl_in_rule__Rasur__Group__17996 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__Rasur__Group__2_in_rule__Rasur__Group__17999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Rasur__Group__1__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__Group__2__Impl_in_rule__Rasur__Group__28058 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Rasur__Group__3_in_rule__Rasur__Group__28061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl8090 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Rasur__WCharAssignment_2_in_rule__Rasur__Group__2__Impl8102 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__Rasur__Group__3__Impl_in_rule__Rasur__Group__38135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Rasur__Group__3__Impl8163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__0__Impl_in_rule__AncientExpanded__Group__08202 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__1_in_rule__AncientExpanded__Group__08205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__1__Impl_in_rule__AncientExpanded__Group__18263 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__2_in_rule__AncientExpanded__Group__18266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__AncientExpanded__Group__1__Impl8294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__2__Impl_in_rule__AncientExpanded__Group__28325 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__3_in_rule__AncientExpanded__Group__28328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl8357 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__AncientExpanded__WCharAssignment_2_in_rule__AncientExpanded__Group__2__Impl8369 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__AncientExpanded__Group__3__Impl_in_rule__AncientExpanded__Group__38402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__AncientExpanded__Group__3__Impl8430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__0__Impl_in_rule__RestorationOverRasur__Group__08469 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1_in_rule__RestorationOverRasur__Group__08472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__1__Impl_in_rule__RestorationOverRasur__Group__18530 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2_in_rule__RestorationOverRasur__Group__18533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__RestorationOverRasur__Group__1__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__2__Impl_in_rule__RestorationOverRasur__Group__28592 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3_in_rule__RestorationOverRasur__Group__28595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl8624 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__WCharAssignment_2_in_rule__RestorationOverRasur__Group__2__Impl8636 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__RestorationOverRasur__Group__3__Impl_in_rule__RestorationOverRasur__Group__38669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__RestorationOverRasur__Group__3__Impl8697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__0__Impl_in_rule__PartialDestruction__Group__08736 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__1_in_rule__PartialDestruction__Group__08739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__1__Impl_in_rule__PartialDestruction__Group__18797 = new BitSet(new long[]{0x00002AAAAB000080L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__2_in_rule__PartialDestruction__Group__18800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__PartialDestruction__Group__1__Impl8828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__2__Impl_in_rule__PartialDestruction__Group__28859 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__3_in_rule__PartialDestruction__Group__28862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl8891 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__PartialDestruction__WCharAssignment_2_in_rule__PartialDestruction__Group__2__Impl8903 = new BitSet(new long[]{0x00002AAAAB000082L});
        public static final BitSet FOLLOW_rule__PartialDestruction__Group__3__Impl_in_rule__PartialDestruction__Group__38936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__PartialDestruction__Group__3__Impl8964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__0__Impl_in_rule__Destruction__Group__09003 = new BitSet(new long[]{0x00002AAAAA000000L});
        public static final BitSet FOLLOW_rule__Destruction__Group__1_in_rule__Destruction__Group__09006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__1__Impl_in_rule__Destruction__Group__19064 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__Destruction__Group__2_in_rule__Destruction__Group__19067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Destruction__Group__1__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__2__Impl_in_rule__Destruction__Group__29126 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Destruction__Group__3_in_rule__Destruction__Group__29129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__CommentAssignment_2_in_rule__Destruction__Group__2__Impl9156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Destruction__Group__3__Impl_in_rule__Destruction__Group__39186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Destruction__Group__3__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_09258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextItem_in_rule__TextContent__ItemsAssignment_1_1_19289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_09320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItem_in_rule__Sentence__ItemsAssignment_2_1_29351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_09382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCase_in_rule__Ambivalence__CasesAssignment_1_1_29413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CASESTRING_in_rule__Case__NameAssignment_09444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_09475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentenceItemNoAmbivalence_in_rule__Case__ItemsAssignment_2_1_29506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BETWEEN_HASHES_in_rule__Marker__TypeAssignment9537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_09568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordPart_in_rule__Word__WCharAssignment_1_1_19599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_09630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWordMiddle_in_rule__WordPart__WCharAssignment_1_19661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EGYSTRING_in_rule__Chars__NameAssignment9692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpanded_in_rule__Expanded__WCharAssignment_29723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoEmendation_in_rule__Emendation__WCharAssignment_29754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDisputableReading_in_rule__DisputableReading__WCharAssignment_29785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoLacuna_in_rule__Lacuna__WCharAssignment_29816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoDeletion_in_rule__Deletion__WCharAssignment_29847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoExpandedColumn_in_rule__ExpandedColumn__WCharAssignment_29878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRasur_in_rule__Rasur__WCharAssignment_29909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAncientExpanded_in_rule__AncientExpanded__WCharAssignment_29940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoRestorationOverRasur_in_rule__RestorationOverRasur__WCharAssignment_29971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoPartialDestruction_in_rule__PartialDestruction__WCharAssignment_210002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMNENT_EGYSTRING_in_rule__Destruction__CommentAssignment_210033 = new BitSet(new long[]{0x0000000000000002L});
    }


}