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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_CASESTRING", "RULE_BETWEEN_HASHES", "RULE_BETWEEN_MINUS", "RULE_EGYSTRING", "' '", "'\\u00A7'", "'%'", "'| '", "'\\uD80C\\uDE58'", "'\\uD80C\\uDE82'", "'\\uD80C\\uDF79'", "'\\uD80C\\uDF7A'", "'\\uD80C\\uDE86'", "'\\uD80C\\uDE87'", "'('", "')'", "'(('", "'))'", "'\\u2329'", "'\\u232A'", "'\\u2E2E'", "'?'", "'['", "']'", "'{'", "'}'", "'\\u2329\\u2329'", "'\\u232A\\u232A'", "'{{'", "'}}'", "'[['", "']]'", "'\\u2E22'", "'\\u2E23'", "','", "'.'", "'\\u2261'", "':'", "'\\u22EE'", "'~'", "'-'", "';'", "'(\\uDB80\\uDC80)'", "'\\u2E2E\\uDB80\\uDC80?'", "'{\\uDB80\\uDC80}'", "'[\\uDB80\\uDC80]'", "'[\\uDB80\\uDC81]'", "'\\u2E22\\uDB80\\uDC80\\u2E23'", "'\\u2329\\uDB80\\uDC80\\u232A'", "'[[\\uDB80\\uDC80]]'", "'((\\uDB80\\uDC80))'", "'{{\\uDB80\\uDC80}}'", "'\\uDB80\\uDC81'", "'\\uDB80\\uDC80'", "'\\uDB80\\uDC82'"
    };
    public static final int T__50=50;
    public static final int RULE_BETWEEN_HASHES=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_EGYSTRING=8;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_CASESTRING=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_BETWEEN_MINUS=7;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEgyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEgyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEgyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEgyDsl.g"; }


     
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
    // InternalEgyDsl.g:60:1: entryRuleTextContent : ruleTextContent EOF ;
    public final void entryRuleTextContent() throws RecognitionException {
        try {
            // InternalEgyDsl.g:61:1: ( ruleTextContent EOF )
            // InternalEgyDsl.g:62:1: ruleTextContent EOF
            {
             before(grammarAccess.getTextContentRule()); 
            pushFollow(FOLLOW_1);
            ruleTextContent();

            state._fsp--;

             after(grammarAccess.getTextContentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:69:1: ruleTextContent : ( ( rule__TextContent__Group__0 ) ) ;
    public final void ruleTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:73:2: ( ( ( rule__TextContent__Group__0 ) ) )
            // InternalEgyDsl.g:74:1: ( ( rule__TextContent__Group__0 ) )
            {
            // InternalEgyDsl.g:74:1: ( ( rule__TextContent__Group__0 ) )
            // InternalEgyDsl.g:75:1: ( rule__TextContent__Group__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup()); 
            // InternalEgyDsl.g:76:1: ( rule__TextContent__Group__0 )
            // InternalEgyDsl.g:76:2: rule__TextContent__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:88:1: entryRuleTextItem : ruleTextItem EOF ;
    public final void entryRuleTextItem() throws RecognitionException {
        try {
            // InternalEgyDsl.g:89:1: ( ruleTextItem EOF )
            // InternalEgyDsl.g:90:1: ruleTextItem EOF
            {
             before(grammarAccess.getTextItemRule()); 
            pushFollow(FOLLOW_1);
            ruleTextItem();

            state._fsp--;

             after(grammarAccess.getTextItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:97:1: ruleTextItem : ( ruleSentence ) ;
    public final void ruleTextItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:101:2: ( ( ruleSentence ) )
            // InternalEgyDsl.g:102:1: ( ruleSentence )
            {
            // InternalEgyDsl.g:102:1: ( ruleSentence )
            // InternalEgyDsl.g:103:1: ruleSentence
            {
             before(grammarAccess.getTextItemAccess().getSentenceParserRuleCall()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:116:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalEgyDsl.g:117:1: ( ruleSentence EOF )
            // InternalEgyDsl.g:118:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:125:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:129:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalEgyDsl.g:130:1: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalEgyDsl.g:130:1: ( ( rule__Sentence__Group__0 ) )
            // InternalEgyDsl.g:131:1: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalEgyDsl.g:132:1: ( rule__Sentence__Group__0 )
            // InternalEgyDsl.g:132:2: rule__Sentence__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:144:1: entryRuleSentenceItem : ruleSentenceItem EOF ;
    public final void entryRuleSentenceItem() throws RecognitionException {
        try {
            // InternalEgyDsl.g:145:1: ( ruleSentenceItem EOF )
            // InternalEgyDsl.g:146:1: ruleSentenceItem EOF
            {
             before(grammarAccess.getSentenceItemRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceItem();

            state._fsp--;

             after(grammarAccess.getSentenceItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:153:1: ruleSentenceItem : ( ( rule__SentenceItem__Alternatives ) ) ;
    public final void ruleSentenceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:157:2: ( ( ( rule__SentenceItem__Alternatives ) ) )
            // InternalEgyDsl.g:158:1: ( ( rule__SentenceItem__Alternatives ) )
            {
            // InternalEgyDsl.g:158:1: ( ( rule__SentenceItem__Alternatives ) )
            // InternalEgyDsl.g:159:1: ( rule__SentenceItem__Alternatives )
            {
             before(grammarAccess.getSentenceItemAccess().getAlternatives()); 
            // InternalEgyDsl.g:160:1: ( rule__SentenceItem__Alternatives )
            // InternalEgyDsl.g:160:2: rule__SentenceItem__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:172:1: entryRuleAbstractMarker : ruleAbstractMarker EOF ;
    public final void entryRuleAbstractMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:173:1: ( ruleAbstractMarker EOF )
            // InternalEgyDsl.g:174:1: ruleAbstractMarker EOF
            {
             before(grammarAccess.getAbstractMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractMarker();

            state._fsp--;

             after(grammarAccess.getAbstractMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:181:1: ruleAbstractMarker : ( ( rule__AbstractMarker__Alternatives ) ) ;
    public final void ruleAbstractMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:185:2: ( ( ( rule__AbstractMarker__Alternatives ) ) )
            // InternalEgyDsl.g:186:1: ( ( rule__AbstractMarker__Alternatives ) )
            {
            // InternalEgyDsl.g:186:1: ( ( rule__AbstractMarker__Alternatives ) )
            // InternalEgyDsl.g:187:1: ( rule__AbstractMarker__Alternatives )
            {
             before(grammarAccess.getAbstractMarkerAccess().getAlternatives()); 
            // InternalEgyDsl.g:188:1: ( rule__AbstractMarker__Alternatives )
            // InternalEgyDsl.g:188:2: rule__AbstractMarker__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:200:1: entryRuleAmbivalence : ruleAmbivalence EOF ;
    public final void entryRuleAmbivalence() throws RecognitionException {
        try {
            // InternalEgyDsl.g:201:1: ( ruleAmbivalence EOF )
            // InternalEgyDsl.g:202:1: ruleAmbivalence EOF
            {
             before(grammarAccess.getAmbivalenceRule()); 
            pushFollow(FOLLOW_1);
            ruleAmbivalence();

            state._fsp--;

             after(grammarAccess.getAmbivalenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:209:1: ruleAmbivalence : ( ( rule__Ambivalence__Group__0 ) ) ;
    public final void ruleAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:213:2: ( ( ( rule__Ambivalence__Group__0 ) ) )
            // InternalEgyDsl.g:214:1: ( ( rule__Ambivalence__Group__0 ) )
            {
            // InternalEgyDsl.g:214:1: ( ( rule__Ambivalence__Group__0 ) )
            // InternalEgyDsl.g:215:1: ( rule__Ambivalence__Group__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup()); 
            // InternalEgyDsl.g:216:1: ( rule__Ambivalence__Group__0 )
            // InternalEgyDsl.g:216:2: rule__Ambivalence__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:228:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalEgyDsl.g:229:1: ( ruleCase EOF )
            // InternalEgyDsl.g:230:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:237:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:241:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalEgyDsl.g:242:1: ( ( rule__Case__Group__0 ) )
            {
            // InternalEgyDsl.g:242:1: ( ( rule__Case__Group__0 ) )
            // InternalEgyDsl.g:243:1: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalEgyDsl.g:244:1: ( rule__Case__Group__0 )
            // InternalEgyDsl.g:244:2: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:256:1: entryRuleSentenceItemNoAmbivalence : ruleSentenceItemNoAmbivalence EOF ;
    public final void entryRuleSentenceItemNoAmbivalence() throws RecognitionException {
        try {
            // InternalEgyDsl.g:257:1: ( ruleSentenceItemNoAmbivalence EOF )
            // InternalEgyDsl.g:258:1: ruleSentenceItemNoAmbivalence EOF
            {
             before(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceItemNoAmbivalence();

            state._fsp--;

             after(grammarAccess.getSentenceItemNoAmbivalenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:265:1: ruleSentenceItemNoAmbivalence : ( ( rule__SentenceItemNoAmbivalence__Alternatives ) ) ;
    public final void ruleSentenceItemNoAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:269:2: ( ( ( rule__SentenceItemNoAmbivalence__Alternatives ) ) )
            // InternalEgyDsl.g:270:1: ( ( rule__SentenceItemNoAmbivalence__Alternatives ) )
            {
            // InternalEgyDsl.g:270:1: ( ( rule__SentenceItemNoAmbivalence__Alternatives ) )
            // InternalEgyDsl.g:271:1: ( rule__SentenceItemNoAmbivalence__Alternatives )
            {
             before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAlternatives()); 
            // InternalEgyDsl.g:272:1: ( rule__SentenceItemNoAmbivalence__Alternatives )
            // InternalEgyDsl.g:272:2: rule__SentenceItemNoAmbivalence__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleMarker"
    // InternalEgyDsl.g:284:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:285:1: ( ruleMarker EOF )
            // InternalEgyDsl.g:286:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:293:1: ruleMarker : ( ( rule__Marker__TypeAssignment ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:297:2: ( ( ( rule__Marker__TypeAssignment ) ) )
            // InternalEgyDsl.g:298:1: ( ( rule__Marker__TypeAssignment ) )
            {
            // InternalEgyDsl.g:298:1: ( ( rule__Marker__TypeAssignment ) )
            // InternalEgyDsl.g:299:1: ( rule__Marker__TypeAssignment )
            {
             before(grammarAccess.getMarkerAccess().getTypeAssignment()); 
            // InternalEgyDsl.g:300:1: ( rule__Marker__TypeAssignment )
            // InternalEgyDsl.g:300:2: rule__Marker__TypeAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:312:1: entryRuleDestructionMarker : ruleDestructionMarker EOF ;
    public final void entryRuleDestructionMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:313:1: ( ruleDestructionMarker EOF )
            // InternalEgyDsl.g:314:1: ruleDestructionMarker EOF
            {
             before(grammarAccess.getDestructionMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleDestructionMarker();

            state._fsp--;

             after(grammarAccess.getDestructionMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:321:1: ruleDestructionMarker : ( ( rule__DestructionMarker__TypeAssignment ) ) ;
    public final void ruleDestructionMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:325:2: ( ( ( rule__DestructionMarker__TypeAssignment ) ) )
            // InternalEgyDsl.g:326:1: ( ( rule__DestructionMarker__TypeAssignment ) )
            {
            // InternalEgyDsl.g:326:1: ( ( rule__DestructionMarker__TypeAssignment ) )
            // InternalEgyDsl.g:327:1: ( rule__DestructionMarker__TypeAssignment )
            {
             before(grammarAccess.getDestructionMarkerAccess().getTypeAssignment()); 
            // InternalEgyDsl.g:328:1: ( rule__DestructionMarker__TypeAssignment )
            // InternalEgyDsl.g:328:2: rule__DestructionMarker__TypeAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:340:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalEgyDsl.g:341:1: ( ruleWord EOF )
            // InternalEgyDsl.g:342:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:349:1: ruleWord : ( ( rule__Word__Group__0 ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:353:2: ( ( ( rule__Word__Group__0 ) ) )
            // InternalEgyDsl.g:354:1: ( ( rule__Word__Group__0 ) )
            {
            // InternalEgyDsl.g:354:1: ( ( rule__Word__Group__0 ) )
            // InternalEgyDsl.g:355:1: ( rule__Word__Group__0 )
            {
             before(grammarAccess.getWordAccess().getGroup()); 
            // InternalEgyDsl.g:356:1: ( rule__Word__Group__0 )
            // InternalEgyDsl.g:356:2: rule__Word__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:368:1: entryRuleWordPart : ruleWordPart EOF ;
    public final void entryRuleWordPart() throws RecognitionException {
        try {
            // InternalEgyDsl.g:369:1: ( ruleWordPart EOF )
            // InternalEgyDsl.g:370:1: ruleWordPart EOF
            {
             before(grammarAccess.getWordPartRule()); 
            pushFollow(FOLLOW_1);
            ruleWordPart();

            state._fsp--;

             after(grammarAccess.getWordPartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:377:1: ruleWordPart : ( ( rule__WordPart__WCharAssignment ) ) ;
    public final void ruleWordPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:381:2: ( ( ( rule__WordPart__WCharAssignment ) ) )
            // InternalEgyDsl.g:382:1: ( ( rule__WordPart__WCharAssignment ) )
            {
            // InternalEgyDsl.g:382:1: ( ( rule__WordPart__WCharAssignment ) )
            // InternalEgyDsl.g:383:1: ( rule__WordPart__WCharAssignment )
            {
             before(grammarAccess.getWordPartAccess().getWCharAssignment()); 
            // InternalEgyDsl.g:384:1: ( rule__WordPart__WCharAssignment )
            // InternalEgyDsl.g:384:2: rule__WordPart__WCharAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WordPart__WCharAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordPartAccess().getWCharAssignment()); 

            }


            }

        }
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
    // InternalEgyDsl.g:396:1: entryRuleWordMiddle : ruleWordMiddle EOF ;
    public final void entryRuleWordMiddle() throws RecognitionException {
        try {
            // InternalEgyDsl.g:397:1: ( ruleWordMiddle EOF )
            // InternalEgyDsl.g:398:1: ruleWordMiddle EOF
            {
             before(grammarAccess.getWordMiddleRule()); 
            pushFollow(FOLLOW_1);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordMiddleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:405:1: ruleWordMiddle : ( ( rule__WordMiddle__Alternatives ) ) ;
    public final void ruleWordMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:409:2: ( ( ( rule__WordMiddle__Alternatives ) ) )
            // InternalEgyDsl.g:410:1: ( ( rule__WordMiddle__Alternatives ) )
            {
            // InternalEgyDsl.g:410:1: ( ( rule__WordMiddle__Alternatives ) )
            // InternalEgyDsl.g:411:1: ( rule__WordMiddle__Alternatives )
            {
             before(grammarAccess.getWordMiddleAccess().getAlternatives()); 
            // InternalEgyDsl.g:412:1: ( rule__WordMiddle__Alternatives )
            // InternalEgyDsl.g:412:2: rule__WordMiddle__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:424:1: entryRuleChars : ruleChars EOF ;
    public final void entryRuleChars() throws RecognitionException {
        try {
            // InternalEgyDsl.g:425:1: ( ruleChars EOF )
            // InternalEgyDsl.g:426:1: ruleChars EOF
            {
             before(grammarAccess.getCharsRule()); 
            pushFollow(FOLLOW_1);
            ruleChars();

            state._fsp--;

             after(grammarAccess.getCharsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:433:1: ruleChars : ( ( rule__Chars__NameAssignment ) ) ;
    public final void ruleChars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:437:2: ( ( ( rule__Chars__NameAssignment ) ) )
            // InternalEgyDsl.g:438:1: ( ( rule__Chars__NameAssignment ) )
            {
            // InternalEgyDsl.g:438:1: ( ( rule__Chars__NameAssignment ) )
            // InternalEgyDsl.g:439:1: ( rule__Chars__NameAssignment )
            {
             before(grammarAccess.getCharsAccess().getNameAssignment()); 
            // InternalEgyDsl.g:440:1: ( rule__Chars__NameAssignment )
            // InternalEgyDsl.g:440:2: rule__Chars__NameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:452:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // InternalEgyDsl.g:453:1: ( ruleBrackets EOF )
            // InternalEgyDsl.g:454:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_1);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:461:1: ruleBrackets : ( ( rule__Brackets__Alternatives ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:465:2: ( ( ( rule__Brackets__Alternatives ) ) )
            // InternalEgyDsl.g:466:1: ( ( rule__Brackets__Alternatives ) )
            {
            // InternalEgyDsl.g:466:1: ( ( rule__Brackets__Alternatives ) )
            // InternalEgyDsl.g:467:1: ( rule__Brackets__Alternatives )
            {
             before(grammarAccess.getBracketsAccess().getAlternatives()); 
            // InternalEgyDsl.g:468:1: ( rule__Brackets__Alternatives )
            // InternalEgyDsl.g:468:2: rule__Brackets__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:480:1: entryRuleOval : ruleOval EOF ;
    public final void entryRuleOval() throws RecognitionException {
        try {
            // InternalEgyDsl.g:481:1: ( ruleOval EOF )
            // InternalEgyDsl.g:482:1: ruleOval EOF
            {
             before(grammarAccess.getOvalRule()); 
            pushFollow(FOLLOW_1);
            ruleOval();

            state._fsp--;

             after(grammarAccess.getOvalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:489:1: ruleOval : ( ( rule__Oval__Group__0 ) ) ;
    public final void ruleOval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:493:2: ( ( ( rule__Oval__Group__0 ) ) )
            // InternalEgyDsl.g:494:1: ( ( rule__Oval__Group__0 ) )
            {
            // InternalEgyDsl.g:494:1: ( ( rule__Oval__Group__0 ) )
            // InternalEgyDsl.g:495:1: ( rule__Oval__Group__0 )
            {
             before(grammarAccess.getOvalAccess().getGroup()); 
            // InternalEgyDsl.g:496:1: ( rule__Oval__Group__0 )
            // InternalEgyDsl.g:496:2: rule__Oval__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:508:1: entryRuleSerech : ruleSerech EOF ;
    public final void entryRuleSerech() throws RecognitionException {
        try {
            // InternalEgyDsl.g:509:1: ( ruleSerech EOF )
            // InternalEgyDsl.g:510:1: ruleSerech EOF
            {
             before(grammarAccess.getSerechRule()); 
            pushFollow(FOLLOW_1);
            ruleSerech();

            state._fsp--;

             after(grammarAccess.getSerechRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:517:1: ruleSerech : ( ( rule__Serech__Group__0 ) ) ;
    public final void ruleSerech() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:521:2: ( ( ( rule__Serech__Group__0 ) ) )
            // InternalEgyDsl.g:522:1: ( ( rule__Serech__Group__0 ) )
            {
            // InternalEgyDsl.g:522:1: ( ( rule__Serech__Group__0 ) )
            // InternalEgyDsl.g:523:1: ( rule__Serech__Group__0 )
            {
             before(grammarAccess.getSerechAccess().getGroup()); 
            // InternalEgyDsl.g:524:1: ( rule__Serech__Group__0 )
            // InternalEgyDsl.g:524:2: rule__Serech__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:536:1: entryRuleCartouche : ruleCartouche EOF ;
    public final void entryRuleCartouche() throws RecognitionException {
        try {
            // InternalEgyDsl.g:537:1: ( ruleCartouche EOF )
            // InternalEgyDsl.g:538:1: ruleCartouche EOF
            {
             before(grammarAccess.getCartoucheRule()); 
            pushFollow(FOLLOW_1);
            ruleCartouche();

            state._fsp--;

             after(grammarAccess.getCartoucheRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:545:1: ruleCartouche : ( ( rule__Cartouche__Group__0 ) ) ;
    public final void ruleCartouche() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:549:2: ( ( ( rule__Cartouche__Group__0 ) ) )
            // InternalEgyDsl.g:550:1: ( ( rule__Cartouche__Group__0 ) )
            {
            // InternalEgyDsl.g:550:1: ( ( rule__Cartouche__Group__0 ) )
            // InternalEgyDsl.g:551:1: ( rule__Cartouche__Group__0 )
            {
             before(grammarAccess.getCartoucheAccess().getGroup()); 
            // InternalEgyDsl.g:552:1: ( rule__Cartouche__Group__0 )
            // InternalEgyDsl.g:552:2: rule__Cartouche__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:564:1: entryRuleNoCartouche : ruleNoCartouche EOF ;
    public final void entryRuleNoCartouche() throws RecognitionException {
        try {
            // InternalEgyDsl.g:565:1: ( ruleNoCartouche EOF )
            // InternalEgyDsl.g:566:1: ruleNoCartouche EOF
            {
             before(grammarAccess.getNoCartoucheRule()); 
            pushFollow(FOLLOW_1);
            ruleNoCartouche();

            state._fsp--;

             after(grammarAccess.getNoCartoucheRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:573:1: ruleNoCartouche : ( ( rule__NoCartouche__Alternatives ) ) ;
    public final void ruleNoCartouche() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:577:2: ( ( ( rule__NoCartouche__Alternatives ) ) )
            // InternalEgyDsl.g:578:1: ( ( rule__NoCartouche__Alternatives ) )
            {
            // InternalEgyDsl.g:578:1: ( ( rule__NoCartouche__Alternatives ) )
            // InternalEgyDsl.g:579:1: ( rule__NoCartouche__Alternatives )
            {
             before(grammarAccess.getNoCartoucheAccess().getAlternatives()); 
            // InternalEgyDsl.g:580:1: ( rule__NoCartouche__Alternatives )
            // InternalEgyDsl.g:580:2: rule__NoCartouche__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:592:1: entryRuleExpanded : ruleExpanded EOF ;
    public final void entryRuleExpanded() throws RecognitionException {
        try {
            // InternalEgyDsl.g:593:1: ( ruleExpanded EOF )
            // InternalEgyDsl.g:594:1: ruleExpanded EOF
            {
             before(grammarAccess.getExpandedRule()); 
            pushFollow(FOLLOW_1);
            ruleExpanded();

            state._fsp--;

             after(grammarAccess.getExpandedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:601:1: ruleExpanded : ( ( rule__Expanded__Group__0 ) ) ;
    public final void ruleExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:605:2: ( ( ( rule__Expanded__Group__0 ) ) )
            // InternalEgyDsl.g:606:1: ( ( rule__Expanded__Group__0 ) )
            {
            // InternalEgyDsl.g:606:1: ( ( rule__Expanded__Group__0 ) )
            // InternalEgyDsl.g:607:1: ( rule__Expanded__Group__0 )
            {
             before(grammarAccess.getExpandedAccess().getGroup()); 
            // InternalEgyDsl.g:608:1: ( rule__Expanded__Group__0 )
            // InternalEgyDsl.g:608:2: rule__Expanded__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleAncientExpanded"
    // InternalEgyDsl.g:620:1: entryRuleAncientExpanded : ruleAncientExpanded EOF ;
    public final void entryRuleAncientExpanded() throws RecognitionException {
        try {
            // InternalEgyDsl.g:621:1: ( ruleAncientExpanded EOF )
            // InternalEgyDsl.g:622:1: ruleAncientExpanded EOF
            {
             before(grammarAccess.getAncientExpandedRule()); 
            pushFollow(FOLLOW_1);
            ruleAncientExpanded();

            state._fsp--;

             after(grammarAccess.getAncientExpandedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:629:1: ruleAncientExpanded : ( ( rule__AncientExpanded__Group__0 ) ) ;
    public final void ruleAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:633:2: ( ( ( rule__AncientExpanded__Group__0 ) ) )
            // InternalEgyDsl.g:634:1: ( ( rule__AncientExpanded__Group__0 ) )
            {
            // InternalEgyDsl.g:634:1: ( ( rule__AncientExpanded__Group__0 ) )
            // InternalEgyDsl.g:635:1: ( rule__AncientExpanded__Group__0 )
            {
             before(grammarAccess.getAncientExpandedAccess().getGroup()); 
            // InternalEgyDsl.g:636:1: ( rule__AncientExpanded__Group__0 )
            // InternalEgyDsl.g:636:2: rule__AncientExpanded__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleNoExpanded"
    // InternalEgyDsl.g:648:1: entryRuleNoExpanded : ruleNoExpanded EOF ;
    public final void entryRuleNoExpanded() throws RecognitionException {
        try {
            // InternalEgyDsl.g:649:1: ( ruleNoExpanded EOF )
            // InternalEgyDsl.g:650:1: ruleNoExpanded EOF
            {
             before(grammarAccess.getNoExpandedRule()); 
            pushFollow(FOLLOW_1);
            ruleNoExpanded();

            state._fsp--;

             after(grammarAccess.getNoExpandedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:657:1: ruleNoExpanded : ( ( rule__NoExpanded__Alternatives ) ) ;
    public final void ruleNoExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:661:2: ( ( ( rule__NoExpanded__Alternatives ) ) )
            // InternalEgyDsl.g:662:1: ( ( rule__NoExpanded__Alternatives ) )
            {
            // InternalEgyDsl.g:662:1: ( ( rule__NoExpanded__Alternatives ) )
            // InternalEgyDsl.g:663:1: ( rule__NoExpanded__Alternatives )
            {
             before(grammarAccess.getNoExpandedAccess().getAlternatives()); 
            // InternalEgyDsl.g:664:1: ( rule__NoExpanded__Alternatives )
            // InternalEgyDsl.g:664:2: rule__NoExpanded__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:676:1: entryRuleEmendation : ruleEmendation EOF ;
    public final void entryRuleEmendation() throws RecognitionException {
        try {
            // InternalEgyDsl.g:677:1: ( ruleEmendation EOF )
            // InternalEgyDsl.g:678:1: ruleEmendation EOF
            {
             before(grammarAccess.getEmendationRule()); 
            pushFollow(FOLLOW_1);
            ruleEmendation();

            state._fsp--;

             after(grammarAccess.getEmendationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:685:1: ruleEmendation : ( ( rule__Emendation__Group__0 ) ) ;
    public final void ruleEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:689:2: ( ( ( rule__Emendation__Group__0 ) ) )
            // InternalEgyDsl.g:690:1: ( ( rule__Emendation__Group__0 ) )
            {
            // InternalEgyDsl.g:690:1: ( ( rule__Emendation__Group__0 ) )
            // InternalEgyDsl.g:691:1: ( rule__Emendation__Group__0 )
            {
             before(grammarAccess.getEmendationAccess().getGroup()); 
            // InternalEgyDsl.g:692:1: ( rule__Emendation__Group__0 )
            // InternalEgyDsl.g:692:2: rule__Emendation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:704:1: entryRuleNoEmendation : ruleNoEmendation EOF ;
    public final void entryRuleNoEmendation() throws RecognitionException {
        try {
            // InternalEgyDsl.g:705:1: ( ruleNoEmendation EOF )
            // InternalEgyDsl.g:706:1: ruleNoEmendation EOF
            {
             before(grammarAccess.getNoEmendationRule()); 
            pushFollow(FOLLOW_1);
            ruleNoEmendation();

            state._fsp--;

             after(grammarAccess.getNoEmendationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:713:1: ruleNoEmendation : ( ( rule__NoEmendation__Alternatives ) ) ;
    public final void ruleNoEmendation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:717:2: ( ( ( rule__NoEmendation__Alternatives ) ) )
            // InternalEgyDsl.g:718:1: ( ( rule__NoEmendation__Alternatives ) )
            {
            // InternalEgyDsl.g:718:1: ( ( rule__NoEmendation__Alternatives ) )
            // InternalEgyDsl.g:719:1: ( rule__NoEmendation__Alternatives )
            {
             before(grammarAccess.getNoEmendationAccess().getAlternatives()); 
            // InternalEgyDsl.g:720:1: ( rule__NoEmendation__Alternatives )
            // InternalEgyDsl.g:720:2: rule__NoEmendation__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:732:1: entryRuleDisputableReading : ruleDisputableReading EOF ;
    public final void entryRuleDisputableReading() throws RecognitionException {
        try {
            // InternalEgyDsl.g:733:1: ( ruleDisputableReading EOF )
            // InternalEgyDsl.g:734:1: ruleDisputableReading EOF
            {
             before(grammarAccess.getDisputableReadingRule()); 
            pushFollow(FOLLOW_1);
            ruleDisputableReading();

            state._fsp--;

             after(grammarAccess.getDisputableReadingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:741:1: ruleDisputableReading : ( ( rule__DisputableReading__Group__0 ) ) ;
    public final void ruleDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:745:2: ( ( ( rule__DisputableReading__Group__0 ) ) )
            // InternalEgyDsl.g:746:1: ( ( rule__DisputableReading__Group__0 ) )
            {
            // InternalEgyDsl.g:746:1: ( ( rule__DisputableReading__Group__0 ) )
            // InternalEgyDsl.g:747:1: ( rule__DisputableReading__Group__0 )
            {
             before(grammarAccess.getDisputableReadingAccess().getGroup()); 
            // InternalEgyDsl.g:748:1: ( rule__DisputableReading__Group__0 )
            // InternalEgyDsl.g:748:2: rule__DisputableReading__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:760:1: entryRuleNoDisputableReading : ruleNoDisputableReading EOF ;
    public final void entryRuleNoDisputableReading() throws RecognitionException {
        try {
            // InternalEgyDsl.g:761:1: ( ruleNoDisputableReading EOF )
            // InternalEgyDsl.g:762:1: ruleNoDisputableReading EOF
            {
             before(grammarAccess.getNoDisputableReadingRule()); 
            pushFollow(FOLLOW_1);
            ruleNoDisputableReading();

            state._fsp--;

             after(grammarAccess.getNoDisputableReadingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:769:1: ruleNoDisputableReading : ( ( rule__NoDisputableReading__Alternatives ) ) ;
    public final void ruleNoDisputableReading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:773:2: ( ( ( rule__NoDisputableReading__Alternatives ) ) )
            // InternalEgyDsl.g:774:1: ( ( rule__NoDisputableReading__Alternatives ) )
            {
            // InternalEgyDsl.g:774:1: ( ( rule__NoDisputableReading__Alternatives ) )
            // InternalEgyDsl.g:775:1: ( rule__NoDisputableReading__Alternatives )
            {
             before(grammarAccess.getNoDisputableReadingAccess().getAlternatives()); 
            // InternalEgyDsl.g:776:1: ( rule__NoDisputableReading__Alternatives )
            // InternalEgyDsl.g:776:2: rule__NoDisputableReading__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:788:1: entryRuleLacuna : ruleLacuna EOF ;
    public final void entryRuleLacuna() throws RecognitionException {
        try {
            // InternalEgyDsl.g:789:1: ( ruleLacuna EOF )
            // InternalEgyDsl.g:790:1: ruleLacuna EOF
            {
             before(grammarAccess.getLacunaRule()); 
            pushFollow(FOLLOW_1);
            ruleLacuna();

            state._fsp--;

             after(grammarAccess.getLacunaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:797:1: ruleLacuna : ( ( rule__Lacuna__Group__0 ) ) ;
    public final void ruleLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:801:2: ( ( ( rule__Lacuna__Group__0 ) ) )
            // InternalEgyDsl.g:802:1: ( ( rule__Lacuna__Group__0 ) )
            {
            // InternalEgyDsl.g:802:1: ( ( rule__Lacuna__Group__0 ) )
            // InternalEgyDsl.g:803:1: ( rule__Lacuna__Group__0 )
            {
             before(grammarAccess.getLacunaAccess().getGroup()); 
            // InternalEgyDsl.g:804:1: ( rule__Lacuna__Group__0 )
            // InternalEgyDsl.g:804:2: rule__Lacuna__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:816:1: entryRuleNoLacuna : ruleNoLacuna EOF ;
    public final void entryRuleNoLacuna() throws RecognitionException {
        try {
            // InternalEgyDsl.g:817:1: ( ruleNoLacuna EOF )
            // InternalEgyDsl.g:818:1: ruleNoLacuna EOF
            {
             before(grammarAccess.getNoLacunaRule()); 
            pushFollow(FOLLOW_1);
            ruleNoLacuna();

            state._fsp--;

             after(grammarAccess.getNoLacunaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:825:1: ruleNoLacuna : ( ( rule__NoLacuna__Alternatives ) ) ;
    public final void ruleNoLacuna() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:829:2: ( ( ( rule__NoLacuna__Alternatives ) ) )
            // InternalEgyDsl.g:830:1: ( ( rule__NoLacuna__Alternatives ) )
            {
            // InternalEgyDsl.g:830:1: ( ( rule__NoLacuna__Alternatives ) )
            // InternalEgyDsl.g:831:1: ( rule__NoLacuna__Alternatives )
            {
             before(grammarAccess.getNoLacunaAccess().getAlternatives()); 
            // InternalEgyDsl.g:832:1: ( rule__NoLacuna__Alternatives )
            // InternalEgyDsl.g:832:2: rule__NoLacuna__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:844:1: entryRuleDeletion : ruleDeletion EOF ;
    public final void entryRuleDeletion() throws RecognitionException {
        try {
            // InternalEgyDsl.g:845:1: ( ruleDeletion EOF )
            // InternalEgyDsl.g:846:1: ruleDeletion EOF
            {
             before(grammarAccess.getDeletionRule()); 
            pushFollow(FOLLOW_1);
            ruleDeletion();

            state._fsp--;

             after(grammarAccess.getDeletionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:853:1: ruleDeletion : ( ( rule__Deletion__Group__0 ) ) ;
    public final void ruleDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:857:2: ( ( ( rule__Deletion__Group__0 ) ) )
            // InternalEgyDsl.g:858:1: ( ( rule__Deletion__Group__0 ) )
            {
            // InternalEgyDsl.g:858:1: ( ( rule__Deletion__Group__0 ) )
            // InternalEgyDsl.g:859:1: ( rule__Deletion__Group__0 )
            {
             before(grammarAccess.getDeletionAccess().getGroup()); 
            // InternalEgyDsl.g:860:1: ( rule__Deletion__Group__0 )
            // InternalEgyDsl.g:860:2: rule__Deletion__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:872:1: entryRuleNoDeletion : ruleNoDeletion EOF ;
    public final void entryRuleNoDeletion() throws RecognitionException {
        try {
            // InternalEgyDsl.g:873:1: ( ruleNoDeletion EOF )
            // InternalEgyDsl.g:874:1: ruleNoDeletion EOF
            {
             before(grammarAccess.getNoDeletionRule()); 
            pushFollow(FOLLOW_1);
            ruleNoDeletion();

            state._fsp--;

             after(grammarAccess.getNoDeletionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:881:1: ruleNoDeletion : ( ( rule__NoDeletion__Alternatives ) ) ;
    public final void ruleNoDeletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:885:2: ( ( ( rule__NoDeletion__Alternatives ) ) )
            // InternalEgyDsl.g:886:1: ( ( rule__NoDeletion__Alternatives ) )
            {
            // InternalEgyDsl.g:886:1: ( ( rule__NoDeletion__Alternatives ) )
            // InternalEgyDsl.g:887:1: ( rule__NoDeletion__Alternatives )
            {
             before(grammarAccess.getNoDeletionAccess().getAlternatives()); 
            // InternalEgyDsl.g:888:1: ( rule__NoDeletion__Alternatives )
            // InternalEgyDsl.g:888:2: rule__NoDeletion__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:900:1: entryRuleExpandedColumn : ruleExpandedColumn EOF ;
    public final void entryRuleExpandedColumn() throws RecognitionException {
        try {
            // InternalEgyDsl.g:901:1: ( ruleExpandedColumn EOF )
            // InternalEgyDsl.g:902:1: ruleExpandedColumn EOF
            {
             before(grammarAccess.getExpandedColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleExpandedColumn();

            state._fsp--;

             after(grammarAccess.getExpandedColumnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:909:1: ruleExpandedColumn : ( ( rule__ExpandedColumn__Group__0 ) ) ;
    public final void ruleExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:913:2: ( ( ( rule__ExpandedColumn__Group__0 ) ) )
            // InternalEgyDsl.g:914:1: ( ( rule__ExpandedColumn__Group__0 ) )
            {
            // InternalEgyDsl.g:914:1: ( ( rule__ExpandedColumn__Group__0 ) )
            // InternalEgyDsl.g:915:1: ( rule__ExpandedColumn__Group__0 )
            {
             before(grammarAccess.getExpandedColumnAccess().getGroup()); 
            // InternalEgyDsl.g:916:1: ( rule__ExpandedColumn__Group__0 )
            // InternalEgyDsl.g:916:2: rule__ExpandedColumn__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:928:1: entryRuleNoExpandedColumn : ruleNoExpandedColumn EOF ;
    public final void entryRuleNoExpandedColumn() throws RecognitionException {
        try {
            // InternalEgyDsl.g:929:1: ( ruleNoExpandedColumn EOF )
            // InternalEgyDsl.g:930:1: ruleNoExpandedColumn EOF
            {
             before(grammarAccess.getNoExpandedColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleNoExpandedColumn();

            state._fsp--;

             after(grammarAccess.getNoExpandedColumnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:937:1: ruleNoExpandedColumn : ( ( rule__NoExpandedColumn__Alternatives ) ) ;
    public final void ruleNoExpandedColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:941:2: ( ( ( rule__NoExpandedColumn__Alternatives ) ) )
            // InternalEgyDsl.g:942:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            {
            // InternalEgyDsl.g:942:1: ( ( rule__NoExpandedColumn__Alternatives ) )
            // InternalEgyDsl.g:943:1: ( rule__NoExpandedColumn__Alternatives )
            {
             before(grammarAccess.getNoExpandedColumnAccess().getAlternatives()); 
            // InternalEgyDsl.g:944:1: ( rule__NoExpandedColumn__Alternatives )
            // InternalEgyDsl.g:944:2: rule__NoExpandedColumn__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:956:1: entryRuleRasur : ruleRasur EOF ;
    public final void entryRuleRasur() throws RecognitionException {
        try {
            // InternalEgyDsl.g:957:1: ( ruleRasur EOF )
            // InternalEgyDsl.g:958:1: ruleRasur EOF
            {
             before(grammarAccess.getRasurRule()); 
            pushFollow(FOLLOW_1);
            ruleRasur();

            state._fsp--;

             after(grammarAccess.getRasurRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:965:1: ruleRasur : ( ( rule__Rasur__Group__0 ) ) ;
    public final void ruleRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:969:2: ( ( ( rule__Rasur__Group__0 ) ) )
            // InternalEgyDsl.g:970:1: ( ( rule__Rasur__Group__0 ) )
            {
            // InternalEgyDsl.g:970:1: ( ( rule__Rasur__Group__0 ) )
            // InternalEgyDsl.g:971:1: ( rule__Rasur__Group__0 )
            {
             before(grammarAccess.getRasurAccess().getGroup()); 
            // InternalEgyDsl.g:972:1: ( rule__Rasur__Group__0 )
            // InternalEgyDsl.g:972:2: rule__Rasur__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:984:1: entryRuleNoRasur : ruleNoRasur EOF ;
    public final void entryRuleNoRasur() throws RecognitionException {
        try {
            // InternalEgyDsl.g:985:1: ( ruleNoRasur EOF )
            // InternalEgyDsl.g:986:1: ruleNoRasur EOF
            {
             before(grammarAccess.getNoRasurRule()); 
            pushFollow(FOLLOW_1);
            ruleNoRasur();

            state._fsp--;

             after(grammarAccess.getNoRasurRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:993:1: ruleNoRasur : ( ( rule__NoRasur__Alternatives ) ) ;
    public final void ruleNoRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:997:2: ( ( ( rule__NoRasur__Alternatives ) ) )
            // InternalEgyDsl.g:998:1: ( ( rule__NoRasur__Alternatives ) )
            {
            // InternalEgyDsl.g:998:1: ( ( rule__NoRasur__Alternatives ) )
            // InternalEgyDsl.g:999:1: ( rule__NoRasur__Alternatives )
            {
             before(grammarAccess.getNoRasurAccess().getAlternatives()); 
            // InternalEgyDsl.g:1000:1: ( rule__NoRasur__Alternatives )
            // InternalEgyDsl.g:1000:2: rule__NoRasur__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleNoAncientExpanded"
    // InternalEgyDsl.g:1012:1: entryRuleNoAncientExpanded : ruleNoAncientExpanded EOF ;
    public final void entryRuleNoAncientExpanded() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1013:1: ( ruleNoAncientExpanded EOF )
            // InternalEgyDsl.g:1014:1: ruleNoAncientExpanded EOF
            {
             before(grammarAccess.getNoAncientExpandedRule()); 
            pushFollow(FOLLOW_1);
            ruleNoAncientExpanded();

            state._fsp--;

             after(grammarAccess.getNoAncientExpandedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1021:1: ruleNoAncientExpanded : ( ( rule__NoAncientExpanded__Alternatives ) ) ;
    public final void ruleNoAncientExpanded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1025:2: ( ( ( rule__NoAncientExpanded__Alternatives ) ) )
            // InternalEgyDsl.g:1026:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            {
            // InternalEgyDsl.g:1026:1: ( ( rule__NoAncientExpanded__Alternatives ) )
            // InternalEgyDsl.g:1027:1: ( rule__NoAncientExpanded__Alternatives )
            {
             before(grammarAccess.getNoAncientExpandedAccess().getAlternatives()); 
            // InternalEgyDsl.g:1028:1: ( rule__NoAncientExpanded__Alternatives )
            // InternalEgyDsl.g:1028:2: rule__NoAncientExpanded__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1040:1: entryRuleRestorationOverRasur : ruleRestorationOverRasur EOF ;
    public final void entryRuleRestorationOverRasur() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1041:1: ( ruleRestorationOverRasur EOF )
            // InternalEgyDsl.g:1042:1: ruleRestorationOverRasur EOF
            {
             before(grammarAccess.getRestorationOverRasurRule()); 
            pushFollow(FOLLOW_1);
            ruleRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1049:1: ruleRestorationOverRasur : ( ( rule__RestorationOverRasur__Group__0 ) ) ;
    public final void ruleRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1053:2: ( ( ( rule__RestorationOverRasur__Group__0 ) ) )
            // InternalEgyDsl.g:1054:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            {
            // InternalEgyDsl.g:1054:1: ( ( rule__RestorationOverRasur__Group__0 ) )
            // InternalEgyDsl.g:1055:1: ( rule__RestorationOverRasur__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getGroup()); 
            // InternalEgyDsl.g:1056:1: ( rule__RestorationOverRasur__Group__0 )
            // InternalEgyDsl.g:1056:2: rule__RestorationOverRasur__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1068:1: entryRuleNoRestorationOverRasur : ruleNoRestorationOverRasur EOF ;
    public final void entryRuleNoRestorationOverRasur() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1069:1: ( ruleNoRestorationOverRasur EOF )
            // InternalEgyDsl.g:1070:1: ruleNoRestorationOverRasur EOF
            {
             before(grammarAccess.getNoRestorationOverRasurRule()); 
            pushFollow(FOLLOW_1);
            ruleNoRestorationOverRasur();

            state._fsp--;

             after(grammarAccess.getNoRestorationOverRasurRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1077:1: ruleNoRestorationOverRasur : ( ( rule__NoRestorationOverRasur__Alternatives ) ) ;
    public final void ruleNoRestorationOverRasur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1081:2: ( ( ( rule__NoRestorationOverRasur__Alternatives ) ) )
            // InternalEgyDsl.g:1082:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            {
            // InternalEgyDsl.g:1082:1: ( ( rule__NoRestorationOverRasur__Alternatives ) )
            // InternalEgyDsl.g:1083:1: ( rule__NoRestorationOverRasur__Alternatives )
            {
             before(grammarAccess.getNoRestorationOverRasurAccess().getAlternatives()); 
            // InternalEgyDsl.g:1084:1: ( rule__NoRestorationOverRasur__Alternatives )
            // InternalEgyDsl.g:1084:2: rule__NoRestorationOverRasur__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1096:1: entryRulePartialDestruction : rulePartialDestruction EOF ;
    public final void entryRulePartialDestruction() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1097:1: ( rulePartialDestruction EOF )
            // InternalEgyDsl.g:1098:1: rulePartialDestruction EOF
            {
             before(grammarAccess.getPartialDestructionRule()); 
            pushFollow(FOLLOW_1);
            rulePartialDestruction();

            state._fsp--;

             after(grammarAccess.getPartialDestructionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1105:1: rulePartialDestruction : ( ( rule__PartialDestruction__Group__0 ) ) ;
    public final void rulePartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1109:2: ( ( ( rule__PartialDestruction__Group__0 ) ) )
            // InternalEgyDsl.g:1110:1: ( ( rule__PartialDestruction__Group__0 ) )
            {
            // InternalEgyDsl.g:1110:1: ( ( rule__PartialDestruction__Group__0 ) )
            // InternalEgyDsl.g:1111:1: ( rule__PartialDestruction__Group__0 )
            {
             before(grammarAccess.getPartialDestructionAccess().getGroup()); 
            // InternalEgyDsl.g:1112:1: ( rule__PartialDestruction__Group__0 )
            // InternalEgyDsl.g:1112:2: rule__PartialDestruction__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1124:1: entryRuleNoPartialDestruction : ruleNoPartialDestruction EOF ;
    public final void entryRuleNoPartialDestruction() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1125:1: ( ruleNoPartialDestruction EOF )
            // InternalEgyDsl.g:1126:1: ruleNoPartialDestruction EOF
            {
             before(grammarAccess.getNoPartialDestructionRule()); 
            pushFollow(FOLLOW_1);
            ruleNoPartialDestruction();

            state._fsp--;

             after(grammarAccess.getNoPartialDestructionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1133:1: ruleNoPartialDestruction : ( ( rule__NoPartialDestruction__Alternatives ) ) ;
    public final void ruleNoPartialDestruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1137:2: ( ( ( rule__NoPartialDestruction__Alternatives ) ) )
            // InternalEgyDsl.g:1138:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            {
            // InternalEgyDsl.g:1138:1: ( ( rule__NoPartialDestruction__Alternatives ) )
            // InternalEgyDsl.g:1139:1: ( rule__NoPartialDestruction__Alternatives )
            {
             before(grammarAccess.getNoPartialDestructionAccess().getAlternatives()); 
            // InternalEgyDsl.g:1140:1: ( rule__NoPartialDestruction__Alternatives )
            // InternalEgyDsl.g:1140:2: rule__NoPartialDestruction__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1152:1: entryRuleInterfix : ruleInterfix EOF ;
    public final void entryRuleInterfix() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1153:1: ( ruleInterfix EOF )
            // InternalEgyDsl.g:1154:1: ruleInterfix EOF
            {
             before(grammarAccess.getInterfixRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfix();

            state._fsp--;

             after(grammarAccess.getInterfixRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1161:1: ruleInterfix : ( ( rule__Interfix__Alternatives ) ) ;
    public final void ruleInterfix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1165:2: ( ( ( rule__Interfix__Alternatives ) ) )
            // InternalEgyDsl.g:1166:1: ( ( rule__Interfix__Alternatives ) )
            {
            // InternalEgyDsl.g:1166:1: ( ( rule__Interfix__Alternatives ) )
            // InternalEgyDsl.g:1167:1: ( rule__Interfix__Alternatives )
            {
             before(grammarAccess.getInterfixAccess().getAlternatives()); 
            // InternalEgyDsl.g:1168:1: ( rule__Interfix__Alternatives )
            // InternalEgyDsl.g:1168:2: rule__Interfix__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1180:1: entryRuleInterfixLexical : ruleInterfixLexical EOF ;
    public final void entryRuleInterfixLexical() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1181:1: ( ruleInterfixLexical EOF )
            // InternalEgyDsl.g:1182:1: ruleInterfixLexical EOF
            {
             before(grammarAccess.getInterfixLexicalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixLexicalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1189:1: ruleInterfixLexical : ( ( rule__InterfixLexical__Group__0 ) ) ;
    public final void ruleInterfixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1193:2: ( ( ( rule__InterfixLexical__Group__0 ) ) )
            // InternalEgyDsl.g:1194:1: ( ( rule__InterfixLexical__Group__0 ) )
            {
            // InternalEgyDsl.g:1194:1: ( ( rule__InterfixLexical__Group__0 ) )
            // InternalEgyDsl.g:1195:1: ( rule__InterfixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixLexicalAccess().getGroup()); 
            // InternalEgyDsl.g:1196:1: ( rule__InterfixLexical__Group__0 )
            // InternalEgyDsl.g:1196:2: rule__InterfixLexical__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1208:1: entryRuleInterfixFlexion : ruleInterfixFlexion EOF ;
    public final void entryRuleInterfixFlexion() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1209:1: ( ruleInterfixFlexion EOF )
            // InternalEgyDsl.g:1210:1: ruleInterfixFlexion EOF
            {
             before(grammarAccess.getInterfixFlexionRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixFlexion();

            state._fsp--;

             after(grammarAccess.getInterfixFlexionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1217:1: ruleInterfixFlexion : ( ( rule__InterfixFlexion__Group__0 ) ) ;
    public final void ruleInterfixFlexion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1221:2: ( ( ( rule__InterfixFlexion__Group__0 ) ) )
            // InternalEgyDsl.g:1222:1: ( ( rule__InterfixFlexion__Group__0 ) )
            {
            // InternalEgyDsl.g:1222:1: ( ( rule__InterfixFlexion__Group__0 ) )
            // InternalEgyDsl.g:1223:1: ( rule__InterfixFlexion__Group__0 )
            {
             before(grammarAccess.getInterfixFlexionAccess().getGroup()); 
            // InternalEgyDsl.g:1224:1: ( rule__InterfixFlexion__Group__0 )
            // InternalEgyDsl.g:1224:2: rule__InterfixFlexion__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1236:1: entryRuleInterfixSuffixPronomLexical : ruleInterfixSuffixPronomLexical EOF ;
    public final void entryRuleInterfixSuffixPronomLexical() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1237:1: ( ruleInterfixSuffixPronomLexical EOF )
            // InternalEgyDsl.g:1238:1: ruleInterfixSuffixPronomLexical EOF
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixSuffixPronomLexical();

            state._fsp--;

             after(grammarAccess.getInterfixSuffixPronomLexicalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1245:1: ruleInterfixSuffixPronomLexical : ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) ;
    public final void ruleInterfixSuffixPronomLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1249:2: ( ( ( rule__InterfixSuffixPronomLexical__Group__0 ) ) )
            // InternalEgyDsl.g:1250:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            {
            // InternalEgyDsl.g:1250:1: ( ( rule__InterfixSuffixPronomLexical__Group__0 ) )
            // InternalEgyDsl.g:1251:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getGroup()); 
            // InternalEgyDsl.g:1252:1: ( rule__InterfixSuffixPronomLexical__Group__0 )
            // InternalEgyDsl.g:1252:2: rule__InterfixSuffixPronomLexical__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1264:1: entryRuleInterfixPrefixNonLexical : ruleInterfixPrefixNonLexical EOF ;
    public final void entryRuleInterfixPrefixNonLexical() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1265:1: ( ruleInterfixPrefixNonLexical EOF )
            // InternalEgyDsl.g:1266:1: ruleInterfixPrefixNonLexical EOF
            {
             before(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixPrefixNonLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixNonLexicalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1273:1: ruleInterfixPrefixNonLexical : ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixNonLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1277:2: ( ( ( rule__InterfixPrefixNonLexical__Group__0 ) ) )
            // InternalEgyDsl.g:1278:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            {
            // InternalEgyDsl.g:1278:1: ( ( rule__InterfixPrefixNonLexical__Group__0 ) )
            // InternalEgyDsl.g:1279:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getGroup()); 
            // InternalEgyDsl.g:1280:1: ( rule__InterfixPrefixNonLexical__Group__0 )
            // InternalEgyDsl.g:1280:2: rule__InterfixPrefixNonLexical__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1292:1: entryRuleInterfixPrefixLexical : ruleInterfixPrefixLexical EOF ;
    public final void entryRuleInterfixPrefixLexical() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1293:1: ( ruleInterfixPrefixLexical EOF )
            // InternalEgyDsl.g:1294:1: ruleInterfixPrefixLexical EOF
            {
             before(grammarAccess.getInterfixPrefixLexicalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixPrefixLexical();

            state._fsp--;

             after(grammarAccess.getInterfixPrefixLexicalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1301:1: ruleInterfixPrefixLexical : ( ( rule__InterfixPrefixLexical__Group__0 ) ) ;
    public final void ruleInterfixPrefixLexical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1305:2: ( ( ( rule__InterfixPrefixLexical__Group__0 ) ) )
            // InternalEgyDsl.g:1306:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            {
            // InternalEgyDsl.g:1306:1: ( ( rule__InterfixPrefixLexical__Group__0 ) )
            // InternalEgyDsl.g:1307:1: ( rule__InterfixPrefixLexical__Group__0 )
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getGroup()); 
            // InternalEgyDsl.g:1308:1: ( rule__InterfixPrefixLexical__Group__0 )
            // InternalEgyDsl.g:1308:2: rule__InterfixPrefixLexical__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1320:1: entryRuleInterfixConnectionSyllabicGroup : ruleInterfixConnectionSyllabicGroup EOF ;
    public final void entryRuleInterfixConnectionSyllabicGroup() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1321:1: ( ruleInterfixConnectionSyllabicGroup EOF )
            // InternalEgyDsl.g:1322:1: ruleInterfixConnectionSyllabicGroup EOF
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixConnectionSyllabicGroup();

            state._fsp--;

             after(grammarAccess.getInterfixConnectionSyllabicGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1329:1: ruleInterfixConnectionSyllabicGroup : ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) ;
    public final void ruleInterfixConnectionSyllabicGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1333:2: ( ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) ) )
            // InternalEgyDsl.g:1334:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            {
            // InternalEgyDsl.g:1334:1: ( ( rule__InterfixConnectionSyllabicGroup__Group__0 ) )
            // InternalEgyDsl.g:1335:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getGroup()); 
            // InternalEgyDsl.g:1336:1: ( rule__InterfixConnectionSyllabicGroup__Group__0 )
            // InternalEgyDsl.g:1336:2: rule__InterfixConnectionSyllabicGroup__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1348:1: entryRuleInterfixCompoundWords : ruleInterfixCompoundWords EOF ;
    public final void entryRuleInterfixCompoundWords() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1349:1: ( ruleInterfixCompoundWords EOF )
            // InternalEgyDsl.g:1350:1: ruleInterfixCompoundWords EOF
            {
             before(grammarAccess.getInterfixCompoundWordsRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixCompoundWords();

            state._fsp--;

             after(grammarAccess.getInterfixCompoundWordsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1357:1: ruleInterfixCompoundWords : ( ( rule__InterfixCompoundWords__Group__0 ) ) ;
    public final void ruleInterfixCompoundWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1361:2: ( ( ( rule__InterfixCompoundWords__Group__0 ) ) )
            // InternalEgyDsl.g:1362:1: ( ( rule__InterfixCompoundWords__Group__0 ) )
            {
            // InternalEgyDsl.g:1362:1: ( ( rule__InterfixCompoundWords__Group__0 ) )
            // InternalEgyDsl.g:1363:1: ( rule__InterfixCompoundWords__Group__0 )
            {
             before(grammarAccess.getInterfixCompoundWordsAccess().getGroup()); 
            // InternalEgyDsl.g:1364:1: ( rule__InterfixCompoundWords__Group__0 )
            // InternalEgyDsl.g:1364:2: rule__InterfixCompoundWords__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1376:1: entryRuleInterfixPhoneticalComplement : ruleInterfixPhoneticalComplement EOF ;
    public final void entryRuleInterfixPhoneticalComplement() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1377:1: ( ruleInterfixPhoneticalComplement EOF )
            // InternalEgyDsl.g:1378:1: ruleInterfixPhoneticalComplement EOF
            {
             before(grammarAccess.getInterfixPhoneticalComplementRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfixPhoneticalComplement();

            state._fsp--;

             after(grammarAccess.getInterfixPhoneticalComplementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1385:1: ruleInterfixPhoneticalComplement : ( ( rule__InterfixPhoneticalComplement__Group__0 ) ) ;
    public final void ruleInterfixPhoneticalComplement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1389:2: ( ( ( rule__InterfixPhoneticalComplement__Group__0 ) ) )
            // InternalEgyDsl.g:1390:1: ( ( rule__InterfixPhoneticalComplement__Group__0 ) )
            {
            // InternalEgyDsl.g:1390:1: ( ( rule__InterfixPhoneticalComplement__Group__0 ) )
            // InternalEgyDsl.g:1391:1: ( rule__InterfixPhoneticalComplement__Group__0 )
            {
             before(grammarAccess.getInterfixPhoneticalComplementAccess().getGroup()); 
            // InternalEgyDsl.g:1392:1: ( rule__InterfixPhoneticalComplement__Group__0 )
            // InternalEgyDsl.g:1392:2: rule__InterfixPhoneticalComplement__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleVersMarker"
    // InternalEgyDsl.g:1404:1: entryRuleVersMarker : ruleVersMarker EOF ;
    public final void entryRuleVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1405:1: ( ruleVersMarker EOF )
            // InternalEgyDsl.g:1406:1: ruleVersMarker EOF
            {
             before(grammarAccess.getVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleVersMarker();

            state._fsp--;

             after(grammarAccess.getVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1413:1: ruleVersMarker : ( ( rule__VersMarker__Alternatives ) ) ;
    public final void ruleVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1417:2: ( ( ( rule__VersMarker__Alternatives ) ) )
            // InternalEgyDsl.g:1418:1: ( ( rule__VersMarker__Alternatives ) )
            {
            // InternalEgyDsl.g:1418:1: ( ( rule__VersMarker__Alternatives ) )
            // InternalEgyDsl.g:1419:1: ( rule__VersMarker__Alternatives )
            {
             before(grammarAccess.getVersMarkerAccess().getAlternatives()); 
            // InternalEgyDsl.g:1420:1: ( rule__VersMarker__Alternatives )
            // InternalEgyDsl.g:1420:2: rule__VersMarker__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEmendationVersMarker"
    // InternalEgyDsl.g:1432:1: entryRuleEmendationVersMarker : ruleEmendationVersMarker EOF ;
    public final void entryRuleEmendationVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1433:1: ( ruleEmendationVersMarker EOF )
            // InternalEgyDsl.g:1434:1: ruleEmendationVersMarker EOF
            {
             before(grammarAccess.getEmendationVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleEmendationVersMarker();

            state._fsp--;

             after(grammarAccess.getEmendationVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEmendationVersMarker"


    // $ANTLR start "ruleEmendationVersMarker"
    // InternalEgyDsl.g:1441:1: ruleEmendationVersMarker : ( ( rule__EmendationVersMarker__Group__0 ) ) ;
    public final void ruleEmendationVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1445:2: ( ( ( rule__EmendationVersMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1446:1: ( ( rule__EmendationVersMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1446:1: ( ( rule__EmendationVersMarker__Group__0 ) )
            // InternalEgyDsl.g:1447:1: ( rule__EmendationVersMarker__Group__0 )
            {
             before(grammarAccess.getEmendationVersMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1448:1: ( rule__EmendationVersMarker__Group__0 )
            // InternalEgyDsl.g:1448:2: rule__EmendationVersMarker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmendationVersMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmendationVersMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmendationVersMarker"


    // $ANTLR start "entryRuleDisputableVersMarker"
    // InternalEgyDsl.g:1460:1: entryRuleDisputableVersMarker : ruleDisputableVersMarker EOF ;
    public final void entryRuleDisputableVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1461:1: ( ruleDisputableVersMarker EOF )
            // InternalEgyDsl.g:1462:1: ruleDisputableVersMarker EOF
            {
             before(grammarAccess.getDisputableVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleDisputableVersMarker();

            state._fsp--;

             after(grammarAccess.getDisputableVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1469:1: ruleDisputableVersMarker : ( ( rule__DisputableVersMarker__Group__0 ) ) ;
    public final void ruleDisputableVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1473:2: ( ( ( rule__DisputableVersMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1474:1: ( ( rule__DisputableVersMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1474:1: ( ( rule__DisputableVersMarker__Group__0 ) )
            // InternalEgyDsl.g:1475:1: ( rule__DisputableVersMarker__Group__0 )
            {
             before(grammarAccess.getDisputableVersMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1476:1: ( rule__DisputableVersMarker__Group__0 )
            // InternalEgyDsl.g:1476:2: rule__DisputableVersMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1488:1: entryRuleDeletedVersMarker : ruleDeletedVersMarker EOF ;
    public final void entryRuleDeletedVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1489:1: ( ruleDeletedVersMarker EOF )
            // InternalEgyDsl.g:1490:1: ruleDeletedVersMarker EOF
            {
             before(grammarAccess.getDeletedVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleDeletedVersMarker();

            state._fsp--;

             after(grammarAccess.getDeletedVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1497:1: ruleDeletedVersMarker : ( ( rule__DeletedVersMarker__Group__0 ) ) ;
    public final void ruleDeletedVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1501:2: ( ( ( rule__DeletedVersMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1502:1: ( ( rule__DeletedVersMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1502:1: ( ( rule__DeletedVersMarker__Group__0 ) )
            // InternalEgyDsl.g:1503:1: ( rule__DeletedVersMarker__Group__0 )
            {
             before(grammarAccess.getDeletedVersMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1504:1: ( rule__DeletedVersMarker__Group__0 )
            // InternalEgyDsl.g:1504:2: rule__DeletedVersMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1516:1: entryRuleDestroyedVersMarker : ruleDestroyedVersMarker EOF ;
    public final void entryRuleDestroyedVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1517:1: ( ruleDestroyedVersMarker EOF )
            // InternalEgyDsl.g:1518:1: ruleDestroyedVersMarker EOF
            {
             before(grammarAccess.getDestroyedVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleDestroyedVersMarker();

            state._fsp--;

             after(grammarAccess.getDestroyedVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1525:1: ruleDestroyedVersMarker : ( ( rule__DestroyedVersMarker__Group__0 ) ) ;
    public final void ruleDestroyedVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1529:2: ( ( ( rule__DestroyedVersMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1530:1: ( ( rule__DestroyedVersMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1530:1: ( ( rule__DestroyedVersMarker__Group__0 ) )
            // InternalEgyDsl.g:1531:1: ( rule__DestroyedVersMarker__Group__0 )
            {
             before(grammarAccess.getDestroyedVersMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1532:1: ( rule__DestroyedVersMarker__Group__0 )
            // InternalEgyDsl.g:1532:2: rule__DestroyedVersMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDestroyedVersFrontierMarker"
    // InternalEgyDsl.g:1544:1: entryRuleDestroyedVersFrontierMarker : ruleDestroyedVersFrontierMarker EOF ;
    public final void entryRuleDestroyedVersFrontierMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1545:1: ( ruleDestroyedVersFrontierMarker EOF )
            // InternalEgyDsl.g:1546:1: ruleDestroyedVersFrontierMarker EOF
            {
             before(grammarAccess.getDestroyedVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleDestroyedVersFrontierMarker();

            state._fsp--;

             after(grammarAccess.getDestroyedVersFrontierMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDestroyedVersFrontierMarker"


    // $ANTLR start "ruleDestroyedVersFrontierMarker"
    // InternalEgyDsl.g:1553:1: ruleDestroyedVersFrontierMarker : ( ( rule__DestroyedVersFrontierMarker__Group__0 ) ) ;
    public final void ruleDestroyedVersFrontierMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1557:2: ( ( ( rule__DestroyedVersFrontierMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1558:1: ( ( rule__DestroyedVersFrontierMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1558:1: ( ( rule__DestroyedVersFrontierMarker__Group__0 ) )
            // InternalEgyDsl.g:1559:1: ( rule__DestroyedVersFrontierMarker__Group__0 )
            {
             before(grammarAccess.getDestroyedVersFrontierMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1560:1: ( rule__DestroyedVersFrontierMarker__Group__0 )
            // InternalEgyDsl.g:1560:2: rule__DestroyedVersFrontierMarker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DestroyedVersFrontierMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestroyedVersFrontierMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestroyedVersFrontierMarker"


    // $ANTLR start "entryRulePartialDestroyedVersMarker"
    // InternalEgyDsl.g:1572:1: entryRulePartialDestroyedVersMarker : rulePartialDestroyedVersMarker EOF ;
    public final void entryRulePartialDestroyedVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1573:1: ( rulePartialDestroyedVersMarker EOF )
            // InternalEgyDsl.g:1574:1: rulePartialDestroyedVersMarker EOF
            {
             before(grammarAccess.getPartialDestroyedVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            rulePartialDestroyedVersMarker();

            state._fsp--;

             after(grammarAccess.getPartialDestroyedVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePartialDestroyedVersMarker"


    // $ANTLR start "rulePartialDestroyedVersMarker"
    // InternalEgyDsl.g:1581:1: rulePartialDestroyedVersMarker : ( ( rule__PartialDestroyedVersMarker__Group__0 ) ) ;
    public final void rulePartialDestroyedVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1585:2: ( ( ( rule__PartialDestroyedVersMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1586:1: ( ( rule__PartialDestroyedVersMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1586:1: ( ( rule__PartialDestroyedVersMarker__Group__0 ) )
            // InternalEgyDsl.g:1587:1: ( rule__PartialDestroyedVersMarker__Group__0 )
            {
             before(grammarAccess.getPartialDestroyedVersMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1588:1: ( rule__PartialDestroyedVersMarker__Group__0 )
            // InternalEgyDsl.g:1588:2: rule__PartialDestroyedVersMarker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartialDestroyedVersMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestroyedVersMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartialDestroyedVersMarker"


    // $ANTLR start "entryRuleMissingVersMarker"
    // InternalEgyDsl.g:1600:1: entryRuleMissingVersMarker : ruleMissingVersMarker EOF ;
    public final void entryRuleMissingVersMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1601:1: ( ruleMissingVersMarker EOF )
            // InternalEgyDsl.g:1602:1: ruleMissingVersMarker EOF
            {
             before(grammarAccess.getMissingVersMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleMissingVersMarker();

            state._fsp--;

             after(grammarAccess.getMissingVersMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1609:1: ruleMissingVersMarker : ( ( rule__MissingVersMarker__Group__0 ) ) ;
    public final void ruleMissingVersMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1613:2: ( ( ( rule__MissingVersMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1614:1: ( ( rule__MissingVersMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1614:1: ( ( rule__MissingVersMarker__Group__0 ) )
            // InternalEgyDsl.g:1615:1: ( rule__MissingVersMarker__Group__0 )
            {
             before(grammarAccess.getMissingVersMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1616:1: ( rule__MissingVersMarker__Group__0 )
            // InternalEgyDsl.g:1616:2: rule__MissingVersMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1628:1: entryRuleRestorationOverRasurMarker : ruleRestorationOverRasurMarker EOF ;
    public final void entryRuleRestorationOverRasurMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1629:1: ( ruleRestorationOverRasurMarker EOF )
            // InternalEgyDsl.g:1630:1: ruleRestorationOverRasurMarker EOF
            {
             before(grammarAccess.getRestorationOverRasurMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleRestorationOverRasurMarker();

            state._fsp--;

             after(grammarAccess.getRestorationOverRasurMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1637:1: ruleRestorationOverRasurMarker : ( ( rule__RestorationOverRasurMarker__Group__0 ) ) ;
    public final void ruleRestorationOverRasurMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1641:2: ( ( ( rule__RestorationOverRasurMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1642:1: ( ( rule__RestorationOverRasurMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1642:1: ( ( rule__RestorationOverRasurMarker__Group__0 ) )
            // InternalEgyDsl.g:1643:1: ( rule__RestorationOverRasurMarker__Group__0 )
            {
             before(grammarAccess.getRestorationOverRasurMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1644:1: ( rule__RestorationOverRasurMarker__Group__0 )
            // InternalEgyDsl.g:1644:2: rule__RestorationOverRasurMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1656:1: entryRuleAncientExpandedMarker : ruleAncientExpandedMarker EOF ;
    public final void entryRuleAncientExpandedMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1657:1: ( ruleAncientExpandedMarker EOF )
            // InternalEgyDsl.g:1658:1: ruleAncientExpandedMarker EOF
            {
             before(grammarAccess.getAncientExpandedMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleAncientExpandedMarker();

            state._fsp--;

             after(grammarAccess.getAncientExpandedMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1665:1: ruleAncientExpandedMarker : ( ( rule__AncientExpandedMarker__Group__0 ) ) ;
    public final void ruleAncientExpandedMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1669:2: ( ( ( rule__AncientExpandedMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1670:1: ( ( rule__AncientExpandedMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1670:1: ( ( rule__AncientExpandedMarker__Group__0 ) )
            // InternalEgyDsl.g:1671:1: ( rule__AncientExpandedMarker__Group__0 )
            {
             before(grammarAccess.getAncientExpandedMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1672:1: ( rule__AncientExpandedMarker__Group__0 )
            // InternalEgyDsl.g:1672:2: rule__AncientExpandedMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1684:1: entryRuleRasurMarker : ruleRasurMarker EOF ;
    public final void entryRuleRasurMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1685:1: ( ruleRasurMarker EOF )
            // InternalEgyDsl.g:1686:1: ruleRasurMarker EOF
            {
             before(grammarAccess.getRasurMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleRasurMarker();

            state._fsp--;

             after(grammarAccess.getRasurMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1693:1: ruleRasurMarker : ( ( rule__RasurMarker__Group__0 ) ) ;
    public final void ruleRasurMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1697:2: ( ( ( rule__RasurMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1698:1: ( ( rule__RasurMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1698:1: ( ( rule__RasurMarker__Group__0 ) )
            // InternalEgyDsl.g:1699:1: ( rule__RasurMarker__Group__0 )
            {
             before(grammarAccess.getRasurMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1700:1: ( rule__RasurMarker__Group__0 )
            // InternalEgyDsl.g:1700:2: rule__RasurMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1712:1: entryRuleVersFrontierMarker : ruleVersFrontierMarker EOF ;
    public final void entryRuleVersFrontierMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1713:1: ( ruleVersFrontierMarker EOF )
            // InternalEgyDsl.g:1714:1: ruleVersFrontierMarker EOF
            {
             before(grammarAccess.getVersFrontierMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleVersFrontierMarker();

            state._fsp--;

             after(grammarAccess.getVersFrontierMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1721:1: ruleVersFrontierMarker : ( ( rule__VersFrontierMarker__Group__0 ) ) ;
    public final void ruleVersFrontierMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1725:2: ( ( ( rule__VersFrontierMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1726:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1726:1: ( ( rule__VersFrontierMarker__Group__0 ) )
            // InternalEgyDsl.g:1727:1: ( rule__VersFrontierMarker__Group__0 )
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1728:1: ( rule__VersFrontierMarker__Group__0 )
            // InternalEgyDsl.g:1728:2: rule__VersFrontierMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1740:1: entryRuleVersbreakMarker : ruleVersbreakMarker EOF ;
    public final void entryRuleVersbreakMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1741:1: ( ruleVersbreakMarker EOF )
            // InternalEgyDsl.g:1742:1: ruleVersbreakMarker EOF
            {
             before(grammarAccess.getVersbreakMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getVersbreakMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1749:1: ruleVersbreakMarker : ( ( rule__VersbreakMarker__Group__0 ) ) ;
    public final void ruleVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1753:2: ( ( ( rule__VersbreakMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1754:1: ( ( rule__VersbreakMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1754:1: ( ( rule__VersbreakMarker__Group__0 ) )
            // InternalEgyDsl.g:1755:1: ( rule__VersbreakMarker__Group__0 )
            {
             before(grammarAccess.getVersbreakMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1756:1: ( rule__VersbreakMarker__Group__0 )
            // InternalEgyDsl.g:1756:2: rule__VersbreakMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1768:1: entryRuleBrokenVersbreakMarker : ruleBrokenVersbreakMarker EOF ;
    public final void entryRuleBrokenVersbreakMarker() throws RecognitionException {
        try {
            // InternalEgyDsl.g:1769:1: ( ruleBrokenVersbreakMarker EOF )
            // InternalEgyDsl.g:1770:1: ruleBrokenVersbreakMarker EOF
            {
             before(grammarAccess.getBrokenVersbreakMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleBrokenVersbreakMarker();

            state._fsp--;

             after(grammarAccess.getBrokenVersbreakMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEgyDsl.g:1777:1: ruleBrokenVersbreakMarker : ( ( rule__BrokenVersbreakMarker__Group__0 ) ) ;
    public final void ruleBrokenVersbreakMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1781:2: ( ( ( rule__BrokenVersbreakMarker__Group__0 ) ) )
            // InternalEgyDsl.g:1782:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            {
            // InternalEgyDsl.g:1782:1: ( ( rule__BrokenVersbreakMarker__Group__0 ) )
            // InternalEgyDsl.g:1783:1: ( rule__BrokenVersbreakMarker__Group__0 )
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getGroup()); 
            // InternalEgyDsl.g:1784:1: ( rule__BrokenVersbreakMarker__Group__0 )
            // InternalEgyDsl.g:1784:2: rule__BrokenVersbreakMarker__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__TextContent__Alternatives_1_1_0"
    // InternalEgyDsl.g:1796:1: rule__TextContent__Alternatives_1_1_0 : ( ( ' ' ) | ( RULE_NEWLINE ) );
    public final void rule__TextContent__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1800:1: ( ( ' ' ) | ( RULE_NEWLINE ) )
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
                    // InternalEgyDsl.g:1801:1: ( ' ' )
                    {
                    // InternalEgyDsl.g:1801:1: ( ' ' )
                    // InternalEgyDsl.g:1802:1: ' '
                    {
                     before(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getTextContentAccess().getSpaceKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1809:6: ( RULE_NEWLINE )
                    {
                    // InternalEgyDsl.g:1809:6: ( RULE_NEWLINE )
                    // InternalEgyDsl.g:1810:1: RULE_NEWLINE
                    {
                     before(grammarAccess.getTextContentAccess().getNEWLINETerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_NEWLINE,FOLLOW_2); 
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
    // InternalEgyDsl.g:1820:1: rule__SentenceItem__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) );
    public final void rule__SentenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1824:1: ( ( ruleWord ) | ( ruleAbstractMarker ) | ( ruleAmbivalence ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt2=1;
                }
                break;
            case RULE_BETWEEN_HASHES:
            case RULE_BETWEEN_MINUS:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
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
                    // InternalEgyDsl.g:1825:1: ( ruleWord )
                    {
                    // InternalEgyDsl.g:1825:1: ( ruleWord )
                    // InternalEgyDsl.g:1826:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1831:6: ( ruleAbstractMarker )
                    {
                    // InternalEgyDsl.g:1831:6: ( ruleAbstractMarker )
                    // InternalEgyDsl.g:1832:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractMarker();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemAccess().getAbstractMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1837:6: ( ruleAmbivalence )
                    {
                    // InternalEgyDsl.g:1837:6: ( ruleAmbivalence )
                    // InternalEgyDsl.g:1838:1: ruleAmbivalence
                    {
                     before(grammarAccess.getSentenceItemAccess().getAmbivalenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1848:1: rule__AbstractMarker__Alternatives : ( ( ruleMarker ) | ( ruleVersMarker ) | ( ruleDestructionMarker ) );
    public final void rule__AbstractMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1852:1: ( ( ruleMarker ) | ( ruleVersMarker ) | ( ruleDestructionMarker ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_BETWEEN_HASHES:
                {
                alt3=1;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
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
                    // InternalEgyDsl.g:1853:1: ( ruleMarker )
                    {
                    // InternalEgyDsl.g:1853:1: ( ruleMarker )
                    // InternalEgyDsl.g:1854:1: ruleMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1859:6: ( ruleVersMarker )
                    {
                    // InternalEgyDsl.g:1859:6: ( ruleVersMarker )
                    // InternalEgyDsl.g:1860:1: ruleVersMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVersMarker();

                    state._fsp--;

                     after(grammarAccess.getAbstractMarkerAccess().getVersMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1865:6: ( ruleDestructionMarker )
                    {
                    // InternalEgyDsl.g:1865:6: ( ruleDestructionMarker )
                    // InternalEgyDsl.g:1866:1: ruleDestructionMarker
                    {
                     before(grammarAccess.getAbstractMarkerAccess().getDestructionMarkerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1876:1: rule__SentenceItemNoAmbivalence__Alternatives : ( ( ruleWord ) | ( ruleAbstractMarker ) );
    public final void rule__SentenceItemNoAmbivalence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1880:1: ( ( ruleWord ) | ( ruleAbstractMarker ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EGYSTRING||LA4_0==13||LA4_0==15||LA4_0==17||LA4_0==19||LA4_0==21||LA4_0==23||LA4_0==25||LA4_0==27||LA4_0==29||LA4_0==31||LA4_0==33||LA4_0==35||LA4_0==37||(LA4_0>=39 && LA4_0<=46)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_BETWEEN_HASHES && LA4_0<=RULE_BETWEEN_MINUS)||(LA4_0>=47 && LA4_0<=59)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEgyDsl.g:1881:1: ( ruleWord )
                    {
                    // InternalEgyDsl.g:1881:1: ( ruleWord )
                    // InternalEgyDsl.g:1882:1: ruleWord
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSentenceItemNoAmbivalenceAccess().getWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1887:6: ( ruleAbstractMarker )
                    {
                    // InternalEgyDsl.g:1887:6: ( ruleAbstractMarker )
                    // InternalEgyDsl.g:1888:1: ruleAbstractMarker
                    {
                     before(grammarAccess.getSentenceItemNoAmbivalenceAccess().getAbstractMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__WordMiddle__Alternatives"
    // InternalEgyDsl.g:1898:1: rule__WordMiddle__Alternatives : ( ( ruleBrackets ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__WordMiddle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1902:1: ( ( ruleBrackets ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
                {
                alt5=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt5=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
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
                    // InternalEgyDsl.g:1903:1: ( ruleBrackets )
                    {
                    // InternalEgyDsl.g:1903:1: ( ruleBrackets )
                    // InternalEgyDsl.g:1904:1: ruleBrackets
                    {
                     before(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1909:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:1909:6: ( ruleChars )
                    // InternalEgyDsl.g:1910:1: ruleChars
                    {
                     before(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getWordMiddleAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1915:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:1915:6: ( ruleInterfix )
                    // InternalEgyDsl.g:1916:1: ruleInterfix
                    {
                     before(grammarAccess.getWordMiddleAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:1926:1: rule__Brackets__Alternatives : ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) );
    public final void rule__Brackets__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:1930:1: ( ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            case 27:
                {
                alt6=8;
                }
                break;
            case 29:
                {
                alt6=9;
                }
                break;
            case 37:
                {
                alt6=10;
                }
                break;
            case 17:
                {
                alt6=11;
                }
                break;
            case 13:
                {
                alt6=12;
                }
                break;
            case 15:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEgyDsl.g:1931:1: ( ruleRasur )
                    {
                    // InternalEgyDsl.g:1931:1: ( ruleRasur )
                    // InternalEgyDsl.g:1932:1: ruleRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRasurParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:1937:6: ( ruleAncientExpanded )
                    {
                    // InternalEgyDsl.g:1937:6: ( ruleAncientExpanded )
                    // InternalEgyDsl.g:1938:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getAncientExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:1943:6: ( ruleRestorationOverRasur )
                    {
                    // InternalEgyDsl.g:1943:6: ( ruleRestorationOverRasur )
                    // InternalEgyDsl.g:1944:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getRestorationOverRasurParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:1949:6: ( ruleExpandedColumn )
                    {
                    // InternalEgyDsl.g:1949:6: ( ruleExpandedColumn )
                    // InternalEgyDsl.g:1950:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedColumnParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:1955:6: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:1955:6: ( ruleExpanded )
                    // InternalEgyDsl.g:1956:1: ruleExpanded
                    {
                     before(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getExpandedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:1961:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:1961:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:1962:1: ruleDisputableReading
                    {
                     before(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDisputableReadingParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:1967:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:1967:6: ( ruleEmendation )
                    // InternalEgyDsl.g:1968:1: ruleEmendation
                    {
                     before(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getEmendationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:1973:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:1973:6: ( ruleLacuna )
                    // InternalEgyDsl.g:1974:1: ruleLacuna
                    {
                     before(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getLacunaParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:1979:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:1979:6: ( ruleDeletion )
                    // InternalEgyDsl.g:1980:1: ruleDeletion
                    {
                     before(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getDeletionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:1985:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:1985:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:1986:1: rulePartialDestruction
                    {
                     before(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getPartialDestructionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:1991:6: ( ruleCartouche )
                    {
                    // InternalEgyDsl.g:1991:6: ( ruleCartouche )
                    // InternalEgyDsl.g:1992:1: ruleCartouche
                    {
                     before(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getCartoucheParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalEgyDsl.g:1997:6: ( ruleOval )
                    {
                    // InternalEgyDsl.g:1997:6: ( ruleOval )
                    // InternalEgyDsl.g:1998:1: ruleOval
                    {
                     before(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getBracketsAccess().getOvalParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalEgyDsl.g:2003:6: ( ruleSerech )
                    {
                    // InternalEgyDsl.g:2003:6: ( ruleSerech )
                    // InternalEgyDsl.g:2004:1: ruleSerech
                    {
                     before(grammarAccess.getBracketsAccess().getSerechParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2014:1: rule__NoCartouche__Alternatives : ( ( ruleChars ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleInterfix ) );
    public final void rule__NoCartouche__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2018:1: ( ( ruleChars ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( ruleDeletion ) | ( rulePartialDestruction ) | ( ruleInterfix ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case RULE_EGYSTRING:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 31:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 27:
                {
                alt7=9;
                }
                break;
            case 29:
                {
                alt7=10;
                }
                break;
            case 37:
                {
                alt7=11;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEgyDsl.g:2019:1: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2019:1: ( ruleChars )
                    // InternalEgyDsl.g:2020:1: ruleChars
                    {
                     before(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getCharsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2025:6: ( ruleRasur )
                    {
                    // InternalEgyDsl.g:2025:6: ( ruleRasur )
                    // InternalEgyDsl.g:2026:1: ruleRasur
                    {
                     before(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getRasurParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2031:6: ( ruleAncientExpanded )
                    {
                    // InternalEgyDsl.g:2031:6: ( ruleAncientExpanded )
                    // InternalEgyDsl.g:2032:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getAncientExpandedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2037:6: ( ruleRestorationOverRasur )
                    {
                    // InternalEgyDsl.g:2037:6: ( ruleRestorationOverRasur )
                    // InternalEgyDsl.g:2038:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getRestorationOverRasurParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2043:6: ( ruleExpandedColumn )
                    {
                    // InternalEgyDsl.g:2043:6: ( ruleExpandedColumn )
                    // InternalEgyDsl.g:2044:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getExpandedColumnParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2049:6: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2049:6: ( ruleExpanded )
                    // InternalEgyDsl.g:2050:1: ruleExpanded
                    {
                     before(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getExpandedParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2055:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2055:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2056:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getDisputableReadingParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2061:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2061:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2062:1: ruleEmendation
                    {
                     before(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getEmendationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2067:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2067:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2068:1: ruleLacuna
                    {
                     before(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getLacunaParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:2073:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2073:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2074:1: ruleDeletion
                    {
                     before(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getDeletionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:2079:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2079:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2080:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoCartoucheAccess().getPartialDestructionParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalEgyDsl.g:2085:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2085:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2086:1: ruleInterfix
                    {
                     before(grammarAccess.getNoCartoucheAccess().getInterfixParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2096:1: rule__NoExpanded__Alternatives : ( ( ruleDisputableReading ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2100:1: ( ( ruleDisputableReading ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt8=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
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
                    // InternalEgyDsl.g:2101:1: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2101:1: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2102:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getDisputableReadingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2107:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2107:6: ( ruleChars )
                    // InternalEgyDsl.g:2108:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getCharsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2113:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2113:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2114:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedAccess().getInterfixParserRuleCall_2()); 

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
    // InternalEgyDsl.g:2124:1: rule__NoEmendation__Alternatives : ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoEmendation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2128:1: ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt9=3;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEgyDsl.g:2129:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2129:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2130:1: ruleExpanded
                    {
                     before(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2135:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2135:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2136:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2141:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2141:6: ( ruleChars )
                    // InternalEgyDsl.g:2142:1: ruleChars
                    {
                     before(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getCharsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2147:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2147:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2148:1: ruleInterfix
                    {
                     before(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoEmendationAccess().getInterfixParserRuleCall_3()); 

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
    // InternalEgyDsl.g:2158:1: rule__NoDisputableReading__Alternatives : ( ( ruleExpanded ) | ( ruleEmendation ) | ( ruleDeletion ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoDisputableReading__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2162:1: ( ( ruleExpanded ) | ( ruleEmendation ) | ( ruleDeletion ) | ( ruleRasur ) | ( ruleAncientExpanded ) | ( ruleRestorationOverRasur ) | ( ruleExpandedColumn ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt10=11;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                alt10=5;
                }
                break;
            case 35:
                {
                alt10=6;
                }
                break;
            case 31:
                {
                alt10=7;
                }
                break;
            case 27:
                {
                alt10=8;
                }
                break;
            case 37:
                {
                alt10=9;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt10=10;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt10=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalEgyDsl.g:2163:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2163:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2164:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2169:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2169:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2170:1: ruleEmendation
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getEmendationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2175:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2175:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2176:1: ruleDeletion
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getDeletionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2181:6: ( ruleRasur )
                    {
                    // InternalEgyDsl.g:2181:6: ( ruleRasur )
                    // InternalEgyDsl.g:2182:1: ruleRasur
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRasur();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getRasurParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2187:6: ( ruleAncientExpanded )
                    {
                    // InternalEgyDsl.g:2187:6: ( ruleAncientExpanded )
                    // InternalEgyDsl.g:2188:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getAncientExpandedParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2193:6: ( ruleRestorationOverRasur )
                    {
                    // InternalEgyDsl.g:2193:6: ( ruleRestorationOverRasur )
                    // InternalEgyDsl.g:2194:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getRestorationOverRasurParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2199:6: ( ruleExpandedColumn )
                    {
                    // InternalEgyDsl.g:2199:6: ( ruleExpandedColumn )
                    // InternalEgyDsl.g:2200:1: ruleExpandedColumn
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpandedColumn();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getExpandedColumnParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2205:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2205:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2206:1: ruleLacuna
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getLacunaParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2211:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2211:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2212:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getPartialDestructionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:2217:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2217:6: ( ruleChars )
                    // InternalEgyDsl.g:2218:1: ruleChars
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDisputableReadingAccess().getCharsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:2223:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2223:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2224:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDisputableReadingAccess().getInterfixParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2234:1: rule__NoLacuna__Alternatives : ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) | ( ruleDeletion ) | ( ruleEmendation ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoLacuna__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2238:1: ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) | ( ruleDeletion ) | ( ruleEmendation ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            case 13:
                {
                alt11=4;
                }
                break;
            case 15:
                {
                alt11=5;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            case 23:
                {
                alt11=7;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt11=8;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEgyDsl.g:2239:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2239:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2240:1: ruleExpanded
                    {
                     before(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2245:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2245:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2246:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2251:6: ( ruleCartouche )
                    {
                    // InternalEgyDsl.g:2251:6: ( ruleCartouche )
                    // InternalEgyDsl.g:2252:1: ruleCartouche
                    {
                     before(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getCartoucheParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2257:6: ( ruleOval )
                    {
                    // InternalEgyDsl.g:2257:6: ( ruleOval )
                    // InternalEgyDsl.g:2258:1: ruleOval
                    {
                     before(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getOvalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2263:6: ( ruleSerech )
                    {
                    // InternalEgyDsl.g:2263:6: ( ruleSerech )
                    // InternalEgyDsl.g:2264:1: ruleSerech
                    {
                     before(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSerech();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getSerechParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2269:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2269:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2270:1: ruleDeletion
                    {
                     before(grammarAccess.getNoLacunaAccess().getDeletionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getDeletionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2275:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2275:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2276:1: ruleEmendation
                    {
                     before(grammarAccess.getNoLacunaAccess().getEmendationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getEmendationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2281:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2281:6: ( ruleChars )
                    // InternalEgyDsl.g:2282:1: ruleChars
                    {
                     before(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getCharsParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2287:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2287:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2288:1: ruleInterfix
                    {
                     before(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoLacunaAccess().getInterfixParserRuleCall_8()); 

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
    // InternalEgyDsl.g:2298:1: rule__NoDeletion__Alternatives : ( ( rulePartialDestruction ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleLacuna ) | ( ruleRestorationOverRasur ) | ( ruleAncientExpanded ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoDeletion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2302:1: ( ( rulePartialDestruction ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleLacuna ) | ( ruleRestorationOverRasur ) | ( ruleAncientExpanded ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            case 35:
                {
                alt12=5;
                }
                break;
            case 21:
                {
                alt12=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt12=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEgyDsl.g:2303:1: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2303:1: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2304:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getPartialDestructionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2309:6: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2309:6: ( ruleExpanded )
                    // InternalEgyDsl.g:2310:1: ruleExpanded
                    {
                     before(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2315:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2315:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2316:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getDisputableReadingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2321:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2321:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2322:1: ruleLacuna
                    {
                     before(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getLacunaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2327:6: ( ruleRestorationOverRasur )
                    {
                    // InternalEgyDsl.g:2327:6: ( ruleRestorationOverRasur )
                    // InternalEgyDsl.g:2328:1: ruleRestorationOverRasur
                    {
                     before(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRestorationOverRasur();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getRestorationOverRasurParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2333:6: ( ruleAncientExpanded )
                    {
                    // InternalEgyDsl.g:2333:6: ( ruleAncientExpanded )
                    // InternalEgyDsl.g:2334:1: ruleAncientExpanded
                    {
                     before(grammarAccess.getNoDeletionAccess().getAncientExpandedParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAncientExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getAncientExpandedParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2339:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2339:6: ( ruleChars )
                    // InternalEgyDsl.g:2340:1: ruleChars
                    {
                     before(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getCharsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2345:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2345:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2346:1: ruleInterfix
                    {
                     before(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoDeletionAccess().getInterfixParserRuleCall_7()); 

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
    // InternalEgyDsl.g:2356:1: rule__NoExpandedColumn__Alternatives : ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoExpandedColumn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2360:1: ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 23:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 37:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt13=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEgyDsl.g:2361:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2361:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2362:1: ruleExpanded
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2367:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2367:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2368:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2373:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2373:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2374:1: ruleEmendation
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getEmendationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getEmendationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2379:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2379:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2380:1: ruleLacuna
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getLacunaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getLacunaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2385:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2385:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2386:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getPartialDestructionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getPartialDestructionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2391:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2391:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2392:1: ruleDeletion
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getDeletionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getDeletionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2397:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2397:6: ( ruleChars )
                    // InternalEgyDsl.g:2398:1: ruleChars
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getCharsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2403:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2403:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2404:1: ruleInterfix
                    {
                     before(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoExpandedColumnAccess().getInterfixParserRuleCall_7()); 

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
    // InternalEgyDsl.g:2414:1: rule__NoRasur__Alternatives : ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2418:1: ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
                }
                break;
            case 29:
                {
                alt14=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt14=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEgyDsl.g:2419:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2419:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2420:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2425:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2425:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2426:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2431:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2431:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2432:1: ruleEmendation
                    {
                     before(grammarAccess.getNoRasurAccess().getEmendationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getEmendationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2437:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2437:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2438:1: ruleLacuna
                    {
                     before(grammarAccess.getNoRasurAccess().getLacunaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getLacunaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2443:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2443:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2444:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoRasurAccess().getPartialDestructionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getPartialDestructionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2449:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2449:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2450:1: ruleDeletion
                    {
                     before(grammarAccess.getNoRasurAccess().getDeletionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getDeletionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2455:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2455:6: ( ruleChars )
                    // InternalEgyDsl.g:2456:1: ruleChars
                    {
                     before(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getCharsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2461:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2461:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2462:1: ruleInterfix
                    {
                     before(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoRasurAccess().getInterfixParserRuleCall_7()); 

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
    // InternalEgyDsl.g:2472:1: rule__NoAncientExpanded__Alternatives : ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoAncientExpanded__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2476:1: ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 37:
                {
                alt15=5;
                }
                break;
            case 29:
                {
                alt15=6;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt15=7;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEgyDsl.g:2477:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2477:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2478:1: ruleExpanded
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2483:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2483:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2484:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2489:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2489:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2490:1: ruleEmendation
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getEmendationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getEmendationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2495:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2495:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2496:1: ruleLacuna
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getLacunaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getLacunaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2501:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2501:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2502:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getPartialDestructionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getPartialDestructionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2507:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2507:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2508:1: ruleDeletion
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getDeletionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getDeletionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2513:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2513:6: ( ruleChars )
                    // InternalEgyDsl.g:2514:1: ruleChars
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getCharsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2519:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2519:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2520:1: ruleInterfix
                    {
                     before(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoAncientExpandedAccess().getInterfixParserRuleCall_7()); 

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
    // InternalEgyDsl.g:2530:1: rule__NoRestorationOverRasur__Alternatives : ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoRestorationOverRasur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2534:1: ( ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleEmendation ) | ( ruleLacuna ) | ( rulePartialDestruction ) | ( ruleDeletion ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 17:
                {
                alt16=3;
                }
                break;
            case 23:
                {
                alt16=4;
                }
                break;
            case 27:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 29:
                {
                alt16=7;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt16=8;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt16=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalEgyDsl.g:2535:1: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2535:1: ( ruleExpanded )
                    // InternalEgyDsl.g:2536:1: ruleExpanded
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getExpandedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2541:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2541:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2542:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getDisputableReadingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2547:6: ( ruleCartouche )
                    {
                    // InternalEgyDsl.g:2547:6: ( ruleCartouche )
                    // InternalEgyDsl.g:2548:1: ruleCartouche
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getCartoucheParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2553:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2553:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2554:1: ruleEmendation
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getEmendationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getEmendationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2559:6: ( ruleLacuna )
                    {
                    // InternalEgyDsl.g:2559:6: ( ruleLacuna )
                    // InternalEgyDsl.g:2560:1: ruleLacuna
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getLacunaParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLacuna();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getLacunaParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2565:6: ( rulePartialDestruction )
                    {
                    // InternalEgyDsl.g:2565:6: ( rulePartialDestruction )
                    // InternalEgyDsl.g:2566:1: rulePartialDestruction
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getPartialDestructionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestruction();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getPartialDestructionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2571:6: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2571:6: ( ruleDeletion )
                    // InternalEgyDsl.g:2572:1: ruleDeletion
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getDeletionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getDeletionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2577:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2577:6: ( ruleChars )
                    // InternalEgyDsl.g:2578:1: ruleChars
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getCharsParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2583:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2583:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2584:1: ruleInterfix
                    {
                     before(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoRestorationOverRasurAccess().getInterfixParserRuleCall_8()); 

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
    // InternalEgyDsl.g:2594:1: rule__NoPartialDestruction__Alternatives : ( ( ruleDeletion ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) | ( ruleEmendation ) | ( ruleChars ) | ( ruleInterfix ) );
    public final void rule__NoPartialDestruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2598:1: ( ( ruleDeletion ) | ( ruleExpanded ) | ( ruleDisputableReading ) | ( ruleCartouche ) | ( ruleOval ) | ( ruleSerech ) | ( ruleEmendation ) | ( ruleChars ) | ( ruleInterfix ) )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 19:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            case 17:
                {
                alt17=4;
                }
                break;
            case 13:
                {
                alt17=5;
                }
                break;
            case 15:
                {
                alt17=6;
                }
                break;
            case 23:
                {
                alt17=7;
                }
                break;
            case RULE_EGYSTRING:
                {
                alt17=8;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalEgyDsl.g:2599:1: ( ruleDeletion )
                    {
                    // InternalEgyDsl.g:2599:1: ( ruleDeletion )
                    // InternalEgyDsl.g:2600:1: ruleDeletion
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletion();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getDeletionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2605:6: ( ruleExpanded )
                    {
                    // InternalEgyDsl.g:2605:6: ( ruleExpanded )
                    // InternalEgyDsl.g:2606:1: ruleExpanded
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpanded();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getExpandedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2611:6: ( ruleDisputableReading )
                    {
                    // InternalEgyDsl.g:2611:6: ( ruleDisputableReading )
                    // InternalEgyDsl.g:2612:1: ruleDisputableReading
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableReading();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getDisputableReadingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2617:6: ( ruleCartouche )
                    {
                    // InternalEgyDsl.g:2617:6: ( ruleCartouche )
                    // InternalEgyDsl.g:2618:1: ruleCartouche
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCartouche();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getCartoucheParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2623:6: ( ruleOval )
                    {
                    // InternalEgyDsl.g:2623:6: ( ruleOval )
                    // InternalEgyDsl.g:2624:1: ruleOval
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOval();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getOvalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2629:6: ( ruleSerech )
                    {
                    // InternalEgyDsl.g:2629:6: ( ruleSerech )
                    // InternalEgyDsl.g:2630:1: ruleSerech
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSerech();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getSerechParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2635:6: ( ruleEmendation )
                    {
                    // InternalEgyDsl.g:2635:6: ( ruleEmendation )
                    // InternalEgyDsl.g:2636:1: ruleEmendation
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getEmendationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendation();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getEmendationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2641:6: ( ruleChars )
                    {
                    // InternalEgyDsl.g:2641:6: ( ruleChars )
                    // InternalEgyDsl.g:2642:1: ruleChars
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleChars();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getCharsParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2647:6: ( ruleInterfix )
                    {
                    // InternalEgyDsl.g:2647:6: ( ruleInterfix )
                    // InternalEgyDsl.g:2648:1: ruleInterfix
                    {
                     before(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfix();

                    state._fsp--;

                     after(grammarAccess.getNoPartialDestructionAccess().getInterfixParserRuleCall_8()); 

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
    // InternalEgyDsl.g:2658:1: rule__Interfix__Alternatives : ( ( ruleInterfixFlexion ) | ( ruleInterfixLexical ) | ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixConnectionSyllabicGroup ) | ( ruleInterfixCompoundWords ) | ( ruleInterfixPhoneticalComplement ) );
    public final void rule__Interfix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2662:1: ( ( ruleInterfixFlexion ) | ( ruleInterfixLexical ) | ( ruleInterfixSuffixPronomLexical ) | ( ruleInterfixPrefixNonLexical ) | ( ruleInterfixPrefixLexical ) | ( ruleInterfixConnectionSyllabicGroup ) | ( ruleInterfixCompoundWords ) | ( ruleInterfixPhoneticalComplement ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 41:
                {
                alt18=3;
                }
                break;
            case 42:
                {
                alt18=4;
                }
                break;
            case 43:
                {
                alt18=5;
                }
                break;
            case 44:
                {
                alt18=6;
                }
                break;
            case 45:
                {
                alt18=7;
                }
                break;
            case 46:
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
                    // InternalEgyDsl.g:2663:1: ( ruleInterfixFlexion )
                    {
                    // InternalEgyDsl.g:2663:1: ( ruleInterfixFlexion )
                    // InternalEgyDsl.g:2664:1: ruleInterfixFlexion
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixFlexion();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixFlexionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2669:6: ( ruleInterfixLexical )
                    {
                    // InternalEgyDsl.g:2669:6: ( ruleInterfixLexical )
                    // InternalEgyDsl.g:2670:1: ruleInterfixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixLexicalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2675:6: ( ruleInterfixSuffixPronomLexical )
                    {
                    // InternalEgyDsl.g:2675:6: ( ruleInterfixSuffixPronomLexical )
                    // InternalEgyDsl.g:2676:1: ruleInterfixSuffixPronomLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixSuffixPronomLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixSuffixPronomLexicalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2681:6: ( ruleInterfixPrefixNonLexical )
                    {
                    // InternalEgyDsl.g:2681:6: ( ruleInterfixPrefixNonLexical )
                    // InternalEgyDsl.g:2682:1: ruleInterfixPrefixNonLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixPrefixNonLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixNonLexicalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2687:6: ( ruleInterfixPrefixLexical )
                    {
                    // InternalEgyDsl.g:2687:6: ( ruleInterfixPrefixLexical )
                    // InternalEgyDsl.g:2688:1: ruleInterfixPrefixLexical
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixPrefixLexical();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixPrefixLexicalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2693:6: ( ruleInterfixConnectionSyllabicGroup )
                    {
                    // InternalEgyDsl.g:2693:6: ( ruleInterfixConnectionSyllabicGroup )
                    // InternalEgyDsl.g:2694:1: ruleInterfixConnectionSyllabicGroup
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixConnectionSyllabicGroup();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixConnectionSyllabicGroupParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2699:6: ( ruleInterfixCompoundWords )
                    {
                    // InternalEgyDsl.g:2699:6: ( ruleInterfixCompoundWords )
                    // InternalEgyDsl.g:2700:1: ruleInterfixCompoundWords
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfixCompoundWords();

                    state._fsp--;

                     after(grammarAccess.getInterfixAccess().getInterfixCompoundWordsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2705:6: ( ruleInterfixPhoneticalComplement )
                    {
                    // InternalEgyDsl.g:2705:6: ( ruleInterfixPhoneticalComplement )
                    // InternalEgyDsl.g:2706:1: ruleInterfixPhoneticalComplement
                    {
                     before(grammarAccess.getInterfixAccess().getInterfixPhoneticalComplementParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__VersMarker__Alternatives"
    // InternalEgyDsl.g:2716:1: rule__VersMarker__Alternatives : ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) | ( ruleMissingVersMarker ) | ( ruleDestroyedVersMarker ) | ( ruleDeletedVersMarker ) | ( ruleDisputableVersMarker ) | ( ruleRestorationOverRasurMarker ) | ( ruleAncientExpandedMarker ) | ( ruleRasurMarker ) | ( ruleEmendationVersMarker ) | ( ruleDestroyedVersFrontierMarker ) | ( rulePartialDestroyedVersMarker ) );
    public final void rule__VersMarker__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2720:1: ( ( ruleVersbreakMarker ) | ( ruleVersFrontierMarker ) | ( ruleBrokenVersbreakMarker ) | ( ruleMissingVersMarker ) | ( ruleDestroyedVersMarker ) | ( ruleDeletedVersMarker ) | ( ruleDisputableVersMarker ) | ( ruleRestorationOverRasurMarker ) | ( ruleAncientExpandedMarker ) | ( ruleRasurMarker ) | ( ruleEmendationVersMarker ) | ( ruleDestroyedVersFrontierMarker ) | ( rulePartialDestroyedVersMarker ) )
            int alt19=13;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt19=1;
                }
                break;
            case 57:
                {
                alt19=2;
                }
                break;
            case 59:
                {
                alt19=3;
                }
                break;
            case 53:
                {
                alt19=4;
                }
                break;
            case 50:
                {
                alt19=5;
                }
                break;
            case 49:
                {
                alt19=6;
                }
                break;
            case 48:
                {
                alt19=7;
                }
                break;
            case 54:
                {
                alt19=8;
                }
                break;
            case 55:
                {
                alt19=9;
                }
                break;
            case 56:
                {
                alt19=10;
                }
                break;
            case 47:
                {
                alt19=11;
                }
                break;
            case 51:
                {
                alt19=12;
                }
                break;
            case 52:
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
                    // InternalEgyDsl.g:2721:1: ( ruleVersbreakMarker )
                    {
                    // InternalEgyDsl.g:2721:1: ( ruleVersbreakMarker )
                    // InternalEgyDsl.g:2722:1: ruleVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersbreakMarkerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEgyDsl.g:2727:6: ( ruleVersFrontierMarker )
                    {
                    // InternalEgyDsl.g:2727:6: ( ruleVersFrontierMarker )
                    // InternalEgyDsl.g:2728:1: ruleVersFrontierMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVersFrontierMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getVersFrontierMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEgyDsl.g:2733:6: ( ruleBrokenVersbreakMarker )
                    {
                    // InternalEgyDsl.g:2733:6: ( ruleBrokenVersbreakMarker )
                    // InternalEgyDsl.g:2734:1: ruleBrokenVersbreakMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBrokenVersbreakMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getBrokenVersbreakMarkerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEgyDsl.g:2739:6: ( ruleMissingVersMarker )
                    {
                    // InternalEgyDsl.g:2739:6: ( ruleMissingVersMarker )
                    // InternalEgyDsl.g:2740:1: ruleMissingVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getMissingVersMarkerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMissingVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getMissingVersMarkerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEgyDsl.g:2745:6: ( ruleDestroyedVersMarker )
                    {
                    // InternalEgyDsl.g:2745:6: ( ruleDestroyedVersMarker )
                    // InternalEgyDsl.g:2746:1: ruleDestroyedVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDestroyedVersMarkerParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDestroyedVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDestroyedVersMarkerParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEgyDsl.g:2751:6: ( ruleDeletedVersMarker )
                    {
                    // InternalEgyDsl.g:2751:6: ( ruleDeletedVersMarker )
                    // InternalEgyDsl.g:2752:1: ruleDeletedVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDeletedVersMarkerParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletedVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDeletedVersMarkerParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEgyDsl.g:2757:6: ( ruleDisputableVersMarker )
                    {
                    // InternalEgyDsl.g:2757:6: ( ruleDisputableVersMarker )
                    // InternalEgyDsl.g:2758:1: ruleDisputableVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDisputableVersMarkerParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDisputableVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDisputableVersMarkerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEgyDsl.g:2763:6: ( ruleRestorationOverRasurMarker )
                    {
                    // InternalEgyDsl.g:2763:6: ( ruleRestorationOverRasurMarker )
                    // InternalEgyDsl.g:2764:1: ruleRestorationOverRasurMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getRestorationOverRasurMarkerParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRestorationOverRasurMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getRestorationOverRasurMarkerParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEgyDsl.g:2769:6: ( ruleAncientExpandedMarker )
                    {
                    // InternalEgyDsl.g:2769:6: ( ruleAncientExpandedMarker )
                    // InternalEgyDsl.g:2770:1: ruleAncientExpandedMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getAncientExpandedMarkerParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleAncientExpandedMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getAncientExpandedMarkerParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalEgyDsl.g:2775:6: ( ruleRasurMarker )
                    {
                    // InternalEgyDsl.g:2775:6: ( ruleRasurMarker )
                    // InternalEgyDsl.g:2776:1: ruleRasurMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getRasurMarkerParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRasurMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getRasurMarkerParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalEgyDsl.g:2781:6: ( ruleEmendationVersMarker )
                    {
                    // InternalEgyDsl.g:2781:6: ( ruleEmendationVersMarker )
                    // InternalEgyDsl.g:2782:1: ruleEmendationVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getEmendationVersMarkerParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleEmendationVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getEmendationVersMarkerParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalEgyDsl.g:2787:6: ( ruleDestroyedVersFrontierMarker )
                    {
                    // InternalEgyDsl.g:2787:6: ( ruleDestroyedVersFrontierMarker )
                    // InternalEgyDsl.g:2788:1: ruleDestroyedVersFrontierMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getDestroyedVersFrontierMarkerParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleDestroyedVersFrontierMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getDestroyedVersFrontierMarkerParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalEgyDsl.g:2793:6: ( rulePartialDestroyedVersMarker )
                    {
                    // InternalEgyDsl.g:2793:6: ( rulePartialDestroyedVersMarker )
                    // InternalEgyDsl.g:2794:1: rulePartialDestroyedVersMarker
                    {
                     before(grammarAccess.getVersMarkerAccess().getPartialDestroyedVersMarkerParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulePartialDestroyedVersMarker();

                    state._fsp--;

                     after(grammarAccess.getVersMarkerAccess().getPartialDestroyedVersMarkerParserRuleCall_12()); 

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


    // $ANTLR start "rule__TextContent__Group__0"
    // InternalEgyDsl.g:2806:1: rule__TextContent__Group__0 : rule__TextContent__Group__0__Impl rule__TextContent__Group__1 ;
    public final void rule__TextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2810:1: ( rule__TextContent__Group__0__Impl rule__TextContent__Group__1 )
            // InternalEgyDsl.g:2811:2: rule__TextContent__Group__0__Impl rule__TextContent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2818:1: rule__TextContent__Group__0__Impl : ( () ) ;
    public final void rule__TextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2822:1: ( ( () ) )
            // InternalEgyDsl.g:2823:1: ( () )
            {
            // InternalEgyDsl.g:2823:1: ( () )
            // InternalEgyDsl.g:2824:1: ()
            {
             before(grammarAccess.getTextContentAccess().getTextContentAction_0()); 
            // InternalEgyDsl.g:2825:1: ()
            // InternalEgyDsl.g:2827:1: 
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
    // InternalEgyDsl.g:2837:1: rule__TextContent__Group__1 : rule__TextContent__Group__1__Impl ;
    public final void rule__TextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2841:1: ( rule__TextContent__Group__1__Impl )
            // InternalEgyDsl.g:2842:2: rule__TextContent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2848:1: rule__TextContent__Group__1__Impl : ( ( rule__TextContent__Group_1__0 ) ) ;
    public final void rule__TextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2852:1: ( ( ( rule__TextContent__Group_1__0 ) ) )
            // InternalEgyDsl.g:2853:1: ( ( rule__TextContent__Group_1__0 ) )
            {
            // InternalEgyDsl.g:2853:1: ( ( rule__TextContent__Group_1__0 ) )
            // InternalEgyDsl.g:2854:1: ( rule__TextContent__Group_1__0 )
            {
             before(grammarAccess.getTextContentAccess().getGroup_1()); 
            // InternalEgyDsl.g:2855:1: ( rule__TextContent__Group_1__0 )
            // InternalEgyDsl.g:2855:2: rule__TextContent__Group_1__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2869:1: rule__TextContent__Group_1__0 : rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 ;
    public final void rule__TextContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2873:1: ( rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1 )
            // InternalEgyDsl.g:2874:2: rule__TextContent__Group_1__0__Impl rule__TextContent__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__TextContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2881:1: rule__TextContent__Group_1__0__Impl : ( ( rule__TextContent__ItemsAssignment_1_0 ) ) ;
    public final void rule__TextContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2885:1: ( ( ( rule__TextContent__ItemsAssignment_1_0 ) ) )
            // InternalEgyDsl.g:2886:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            {
            // InternalEgyDsl.g:2886:1: ( ( rule__TextContent__ItemsAssignment_1_0 ) )
            // InternalEgyDsl.g:2887:1: ( rule__TextContent__ItemsAssignment_1_0 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_0()); 
            // InternalEgyDsl.g:2888:1: ( rule__TextContent__ItemsAssignment_1_0 )
            // InternalEgyDsl.g:2888:2: rule__TextContent__ItemsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2898:1: rule__TextContent__Group_1__1 : rule__TextContent__Group_1__1__Impl ;
    public final void rule__TextContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2902:1: ( rule__TextContent__Group_1__1__Impl )
            // InternalEgyDsl.g:2903:2: rule__TextContent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2909:1: rule__TextContent__Group_1__1__Impl : ( ( rule__TextContent__Group_1_1__0 )* ) ;
    public final void rule__TextContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2913:1: ( ( ( rule__TextContent__Group_1_1__0 )* ) )
            // InternalEgyDsl.g:2914:1: ( ( rule__TextContent__Group_1_1__0 )* )
            {
            // InternalEgyDsl.g:2914:1: ( ( rule__TextContent__Group_1_1__0 )* )
            // InternalEgyDsl.g:2915:1: ( rule__TextContent__Group_1_1__0 )*
            {
             before(grammarAccess.getTextContentAccess().getGroup_1_1()); 
            // InternalEgyDsl.g:2916:1: ( rule__TextContent__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_NEWLINE||(LA20_0>=9 && LA20_0<=10)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEgyDsl.g:2916:2: rule__TextContent__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
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
    // InternalEgyDsl.g:2930:1: rule__TextContent__Group_1_1__0 : rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 ;
    public final void rule__TextContent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2934:1: ( rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1 )
            // InternalEgyDsl.g:2935:2: rule__TextContent__Group_1_1__0__Impl rule__TextContent__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__TextContent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2942:1: rule__TextContent__Group_1_1__0__Impl : ( ( rule__TextContent__Alternatives_1_1_0 )? ) ;
    public final void rule__TextContent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2946:1: ( ( ( rule__TextContent__Alternatives_1_1_0 )? ) )
            // InternalEgyDsl.g:2947:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            {
            // InternalEgyDsl.g:2947:1: ( ( rule__TextContent__Alternatives_1_1_0 )? )
            // InternalEgyDsl.g:2948:1: ( rule__TextContent__Alternatives_1_1_0 )?
            {
             before(grammarAccess.getTextContentAccess().getAlternatives_1_1_0()); 
            // InternalEgyDsl.g:2949:1: ( rule__TextContent__Alternatives_1_1_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NEWLINE||LA21_0==9) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEgyDsl.g:2949:2: rule__TextContent__Alternatives_1_1_0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2959:1: rule__TextContent__Group_1_1__1 : rule__TextContent__Group_1_1__1__Impl ;
    public final void rule__TextContent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2963:1: ( rule__TextContent__Group_1_1__1__Impl )
            // InternalEgyDsl.g:2964:2: rule__TextContent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2970:1: rule__TextContent__Group_1_1__1__Impl : ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) ;
    public final void rule__TextContent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2974:1: ( ( ( rule__TextContent__ItemsAssignment_1_1_1 ) ) )
            // InternalEgyDsl.g:2975:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            {
            // InternalEgyDsl.g:2975:1: ( ( rule__TextContent__ItemsAssignment_1_1_1 ) )
            // InternalEgyDsl.g:2976:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getTextContentAccess().getItemsAssignment_1_1_1()); 
            // InternalEgyDsl.g:2977:1: ( rule__TextContent__ItemsAssignment_1_1_1 )
            // InternalEgyDsl.g:2977:2: rule__TextContent__ItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:2991:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:2995:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalEgyDsl.g:2996:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3003:1: rule__Sentence__Group__0__Impl : ( () ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3007:1: ( ( () ) )
            // InternalEgyDsl.g:3008:1: ( () )
            {
            // InternalEgyDsl.g:3008:1: ( () )
            // InternalEgyDsl.g:3009:1: ()
            {
             before(grammarAccess.getSentenceAccess().getSentenceAction_0()); 
            // InternalEgyDsl.g:3010:1: ()
            // InternalEgyDsl.g:3012:1: 
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
    // InternalEgyDsl.g:3022:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl rule__Sentence__Group__2 ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3026:1: ( rule__Sentence__Group__1__Impl rule__Sentence__Group__2 )
            // InternalEgyDsl.g:3027:2: rule__Sentence__Group__1__Impl rule__Sentence__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Sentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3034:1: rule__Sentence__Group__1__Impl : ( '\\u00A7' ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3038:1: ( ( '\\u00A7' ) )
            // InternalEgyDsl.g:3039:1: ( '\\u00A7' )
            {
            // InternalEgyDsl.g:3039:1: ( '\\u00A7' )
            // InternalEgyDsl.g:3040:1: '\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getSectionSignKeyword_1()); 
            match(input,10,FOLLOW_2); 
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
    // InternalEgyDsl.g:3053:1: rule__Sentence__Group__2 : rule__Sentence__Group__2__Impl rule__Sentence__Group__3 ;
    public final void rule__Sentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3057:1: ( rule__Sentence__Group__2__Impl rule__Sentence__Group__3 )
            // InternalEgyDsl.g:3058:2: rule__Sentence__Group__2__Impl rule__Sentence__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Sentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3065:1: rule__Sentence__Group__2__Impl : ( ( rule__Sentence__Group_2__0 )? ) ;
    public final void rule__Sentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3069:1: ( ( ( rule__Sentence__Group_2__0 )? ) )
            // InternalEgyDsl.g:3070:1: ( ( rule__Sentence__Group_2__0 )? )
            {
            // InternalEgyDsl.g:3070:1: ( ( rule__Sentence__Group_2__0 )? )
            // InternalEgyDsl.g:3071:1: ( rule__Sentence__Group_2__0 )?
            {
             before(grammarAccess.getSentenceAccess().getGroup_2()); 
            // InternalEgyDsl.g:3072:1: ( rule__Sentence__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_BETWEEN_HASHES && LA22_0<=RULE_EGYSTRING)||LA22_0==11||LA22_0==13||LA22_0==15||LA22_0==17||LA22_0==19||LA22_0==21||LA22_0==23||LA22_0==25||LA22_0==27||LA22_0==29||LA22_0==31||LA22_0==33||LA22_0==35||LA22_0==37||(LA22_0>=39 && LA22_0<=59)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEgyDsl.g:3072:2: rule__Sentence__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3082:1: rule__Sentence__Group__3 : rule__Sentence__Group__3__Impl ;
    public final void rule__Sentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3086:1: ( rule__Sentence__Group__3__Impl )
            // InternalEgyDsl.g:3087:2: rule__Sentence__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3093:1: rule__Sentence__Group__3__Impl : ( '\\u00A7' ) ;
    public final void rule__Sentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3097:1: ( ( '\\u00A7' ) )
            // InternalEgyDsl.g:3098:1: ( '\\u00A7' )
            {
            // InternalEgyDsl.g:3098:1: ( '\\u00A7' )
            // InternalEgyDsl.g:3099:1: '\\u00A7'
            {
             before(grammarAccess.getSentenceAccess().getSectionSignKeyword_3()); 
            match(input,10,FOLLOW_2); 
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
    // InternalEgyDsl.g:3120:1: rule__Sentence__Group_2__0 : rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1 ;
    public final void rule__Sentence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3124:1: ( rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1 )
            // InternalEgyDsl.g:3125:2: rule__Sentence__Group_2__0__Impl rule__Sentence__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Sentence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3132:1: rule__Sentence__Group_2__0__Impl : ( ( rule__Sentence__ItemsAssignment_2_0 ) ) ;
    public final void rule__Sentence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3136:1: ( ( ( rule__Sentence__ItemsAssignment_2_0 ) ) )
            // InternalEgyDsl.g:3137:1: ( ( rule__Sentence__ItemsAssignment_2_0 ) )
            {
            // InternalEgyDsl.g:3137:1: ( ( rule__Sentence__ItemsAssignment_2_0 ) )
            // InternalEgyDsl.g:3138:1: ( rule__Sentence__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_2_0()); 
            // InternalEgyDsl.g:3139:1: ( rule__Sentence__ItemsAssignment_2_0 )
            // InternalEgyDsl.g:3139:2: rule__Sentence__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3149:1: rule__Sentence__Group_2__1 : rule__Sentence__Group_2__1__Impl ;
    public final void rule__Sentence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3153:1: ( rule__Sentence__Group_2__1__Impl )
            // InternalEgyDsl.g:3154:2: rule__Sentence__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3160:1: rule__Sentence__Group_2__1__Impl : ( ( rule__Sentence__Group_2_1__0 )* ) ;
    public final void rule__Sentence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3164:1: ( ( ( rule__Sentence__Group_2_1__0 )* ) )
            // InternalEgyDsl.g:3165:1: ( ( rule__Sentence__Group_2_1__0 )* )
            {
            // InternalEgyDsl.g:3165:1: ( ( rule__Sentence__Group_2_1__0 )* )
            // InternalEgyDsl.g:3166:1: ( rule__Sentence__Group_2_1__0 )*
            {
             before(grammarAccess.getSentenceAccess().getGroup_2_1()); 
            // InternalEgyDsl.g:3167:1: ( rule__Sentence__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==9) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEgyDsl.g:3167:2: rule__Sentence__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalEgyDsl.g:3181:1: rule__Sentence__Group_2_1__0 : rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1 ;
    public final void rule__Sentence__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3185:1: ( rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1 )
            // InternalEgyDsl.g:3186:2: rule__Sentence__Group_2_1__0__Impl rule__Sentence__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Sentence__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3193:1: rule__Sentence__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__Sentence__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3197:1: ( ( ' ' ) )
            // InternalEgyDsl.g:3198:1: ( ' ' )
            {
            // InternalEgyDsl.g:3198:1: ( ' ' )
            // InternalEgyDsl.g:3199:1: ' '
            {
             before(grammarAccess.getSentenceAccess().getSpaceKeyword_2_1_0()); 
            match(input,9,FOLLOW_2); 
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
    // InternalEgyDsl.g:3212:1: rule__Sentence__Group_2_1__1 : rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2 ;
    public final void rule__Sentence__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3216:1: ( rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2 )
            // InternalEgyDsl.g:3217:2: rule__Sentence__Group_2_1__1__Impl rule__Sentence__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Sentence__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3224:1: rule__Sentence__Group_2_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Sentence__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3228:1: ( ( ( RULE_NEWLINE )? ) )
            // InternalEgyDsl.g:3229:1: ( ( RULE_NEWLINE )? )
            {
            // InternalEgyDsl.g:3229:1: ( ( RULE_NEWLINE )? )
            // InternalEgyDsl.g:3230:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getSentenceAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            // InternalEgyDsl.g:3231:1: ( RULE_NEWLINE )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NEWLINE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEgyDsl.g:3231:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_2); 

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
    // InternalEgyDsl.g:3241:1: rule__Sentence__Group_2_1__2 : rule__Sentence__Group_2_1__2__Impl ;
    public final void rule__Sentence__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3245:1: ( rule__Sentence__Group_2_1__2__Impl )
            // InternalEgyDsl.g:3246:2: rule__Sentence__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3252:1: rule__Sentence__Group_2_1__2__Impl : ( ( rule__Sentence__ItemsAssignment_2_1_2 ) ) ;
    public final void rule__Sentence__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3256:1: ( ( ( rule__Sentence__ItemsAssignment_2_1_2 ) ) )
            // InternalEgyDsl.g:3257:1: ( ( rule__Sentence__ItemsAssignment_2_1_2 ) )
            {
            // InternalEgyDsl.g:3257:1: ( ( rule__Sentence__ItemsAssignment_2_1_2 ) )
            // InternalEgyDsl.g:3258:1: ( rule__Sentence__ItemsAssignment_2_1_2 )
            {
             before(grammarAccess.getSentenceAccess().getItemsAssignment_2_1_2()); 
            // InternalEgyDsl.g:3259:1: ( rule__Sentence__ItemsAssignment_2_1_2 )
            // InternalEgyDsl.g:3259:2: rule__Sentence__ItemsAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3275:1: rule__Ambivalence__Group__0 : rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 ;
    public final void rule__Ambivalence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3279:1: ( rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1 )
            // InternalEgyDsl.g:3280:2: rule__Ambivalence__Group__0__Impl rule__Ambivalence__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Ambivalence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3287:1: rule__Ambivalence__Group__0__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3291:1: ( ( '%' ) )
            // InternalEgyDsl.g:3292:1: ( '%' )
            {
            // InternalEgyDsl.g:3292:1: ( '%' )
            // InternalEgyDsl.g:3293:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalEgyDsl.g:3306:1: rule__Ambivalence__Group__1 : rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 ;
    public final void rule__Ambivalence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3310:1: ( rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2 )
            // InternalEgyDsl.g:3311:2: rule__Ambivalence__Group__1__Impl rule__Ambivalence__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Ambivalence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3318:1: rule__Ambivalence__Group__1__Impl : ( ( rule__Ambivalence__Group_1__0 ) ) ;
    public final void rule__Ambivalence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3322:1: ( ( ( rule__Ambivalence__Group_1__0 ) ) )
            // InternalEgyDsl.g:3323:1: ( ( rule__Ambivalence__Group_1__0 ) )
            {
            // InternalEgyDsl.g:3323:1: ( ( rule__Ambivalence__Group_1__0 ) )
            // InternalEgyDsl.g:3324:1: ( rule__Ambivalence__Group_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1()); 
            // InternalEgyDsl.g:3325:1: ( rule__Ambivalence__Group_1__0 )
            // InternalEgyDsl.g:3325:2: rule__Ambivalence__Group_1__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3335:1: rule__Ambivalence__Group__2 : rule__Ambivalence__Group__2__Impl ;
    public final void rule__Ambivalence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3339:1: ( rule__Ambivalence__Group__2__Impl )
            // InternalEgyDsl.g:3340:2: rule__Ambivalence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3346:1: rule__Ambivalence__Group__2__Impl : ( '%' ) ;
    public final void rule__Ambivalence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3350:1: ( ( '%' ) )
            // InternalEgyDsl.g:3351:1: ( '%' )
            {
            // InternalEgyDsl.g:3351:1: ( '%' )
            // InternalEgyDsl.g:3352:1: '%'
            {
             before(grammarAccess.getAmbivalenceAccess().getPercentSignKeyword_2()); 
            match(input,11,FOLLOW_2); 
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
    // InternalEgyDsl.g:3371:1: rule__Ambivalence__Group_1__0 : rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 ;
    public final void rule__Ambivalence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3375:1: ( rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1 )
            // InternalEgyDsl.g:3376:2: rule__Ambivalence__Group_1__0__Impl rule__Ambivalence__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Ambivalence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3383:1: rule__Ambivalence__Group_1__0__Impl : ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) ;
    public final void rule__Ambivalence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3387:1: ( ( ( rule__Ambivalence__CasesAssignment_1_0 ) ) )
            // InternalEgyDsl.g:3388:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            {
            // InternalEgyDsl.g:3388:1: ( ( rule__Ambivalence__CasesAssignment_1_0 ) )
            // InternalEgyDsl.g:3389:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_0()); 
            // InternalEgyDsl.g:3390:1: ( rule__Ambivalence__CasesAssignment_1_0 )
            // InternalEgyDsl.g:3390:2: rule__Ambivalence__CasesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3400:1: rule__Ambivalence__Group_1__1 : rule__Ambivalence__Group_1__1__Impl ;
    public final void rule__Ambivalence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3404:1: ( rule__Ambivalence__Group_1__1__Impl )
            // InternalEgyDsl.g:3405:2: rule__Ambivalence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3411:1: rule__Ambivalence__Group_1__1__Impl : ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) ;
    public final void rule__Ambivalence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3415:1: ( ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) ) )
            // InternalEgyDsl.g:3416:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            {
            // InternalEgyDsl.g:3416:1: ( ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* ) )
            // InternalEgyDsl.g:3417:1: ( ( rule__Ambivalence__Group_1_1__0 ) ) ( ( rule__Ambivalence__Group_1_1__0 )* )
            {
            // InternalEgyDsl.g:3417:1: ( ( rule__Ambivalence__Group_1_1__0 ) )
            // InternalEgyDsl.g:3418:1: ( rule__Ambivalence__Group_1_1__0 )
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // InternalEgyDsl.g:3419:1: ( rule__Ambivalence__Group_1_1__0 )
            // InternalEgyDsl.g:3419:2: rule__Ambivalence__Group_1_1__0
            {
            pushFollow(FOLLOW_13);
            rule__Ambivalence__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 

            }

            // InternalEgyDsl.g:3422:1: ( ( rule__Ambivalence__Group_1_1__0 )* )
            // InternalEgyDsl.g:3423:1: ( rule__Ambivalence__Group_1_1__0 )*
            {
             before(grammarAccess.getAmbivalenceAccess().getGroup_1_1()); 
            // InternalEgyDsl.g:3424:1: ( rule__Ambivalence__Group_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEgyDsl.g:3424:2: rule__Ambivalence__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalEgyDsl.g:3439:1: rule__Ambivalence__Group_1_1__0 : rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 ;
    public final void rule__Ambivalence__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3443:1: ( rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1 )
            // InternalEgyDsl.g:3444:2: rule__Ambivalence__Group_1_1__0__Impl rule__Ambivalence__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Ambivalence__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3451:1: rule__Ambivalence__Group_1_1__0__Impl : ( '| ' ) ;
    public final void rule__Ambivalence__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3455:1: ( ( '| ' ) )
            // InternalEgyDsl.g:3456:1: ( '| ' )
            {
            // InternalEgyDsl.g:3456:1: ( '| ' )
            // InternalEgyDsl.g:3457:1: '| '
            {
             before(grammarAccess.getAmbivalenceAccess().getVerticalLineSpaceKeyword_1_1_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEgyDsl.g:3470:1: rule__Ambivalence__Group_1_1__1 : rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 ;
    public final void rule__Ambivalence__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3474:1: ( rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2 )
            // InternalEgyDsl.g:3475:2: rule__Ambivalence__Group_1_1__1__Impl rule__Ambivalence__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Ambivalence__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3482:1: rule__Ambivalence__Group_1_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Ambivalence__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3486:1: ( ( ( RULE_NEWLINE )? ) )
            // InternalEgyDsl.g:3487:1: ( ( RULE_NEWLINE )? )
            {
            // InternalEgyDsl.g:3487:1: ( ( RULE_NEWLINE )? )
            // InternalEgyDsl.g:3488:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getAmbivalenceAccess().getNEWLINETerminalRuleCall_1_1_1()); 
            // InternalEgyDsl.g:3489:1: ( RULE_NEWLINE )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NEWLINE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEgyDsl.g:3489:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_2); 

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
    // InternalEgyDsl.g:3499:1: rule__Ambivalence__Group_1_1__2 : rule__Ambivalence__Group_1_1__2__Impl ;
    public final void rule__Ambivalence__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3503:1: ( rule__Ambivalence__Group_1_1__2__Impl )
            // InternalEgyDsl.g:3504:2: rule__Ambivalence__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3510:1: rule__Ambivalence__Group_1_1__2__Impl : ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) ;
    public final void rule__Ambivalence__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3514:1: ( ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) ) )
            // InternalEgyDsl.g:3515:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            {
            // InternalEgyDsl.g:3515:1: ( ( rule__Ambivalence__CasesAssignment_1_1_2 ) )
            // InternalEgyDsl.g:3516:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesAssignment_1_1_2()); 
            // InternalEgyDsl.g:3517:1: ( rule__Ambivalence__CasesAssignment_1_1_2 )
            // InternalEgyDsl.g:3517:2: rule__Ambivalence__CasesAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3533:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3537:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalEgyDsl.g:3538:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3545:1: rule__Case__Group__0__Impl : ( ( rule__Case__NameAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3549:1: ( ( ( rule__Case__NameAssignment_0 ) ) )
            // InternalEgyDsl.g:3550:1: ( ( rule__Case__NameAssignment_0 ) )
            {
            // InternalEgyDsl.g:3550:1: ( ( rule__Case__NameAssignment_0 ) )
            // InternalEgyDsl.g:3551:1: ( rule__Case__NameAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_0()); 
            // InternalEgyDsl.g:3552:1: ( rule__Case__NameAssignment_0 )
            // InternalEgyDsl.g:3552:2: rule__Case__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3562:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3566:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalEgyDsl.g:3567:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3574:1: rule__Case__Group__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3578:1: ( ( ( RULE_NEWLINE )? ) )
            // InternalEgyDsl.g:3579:1: ( ( RULE_NEWLINE )? )
            {
            // InternalEgyDsl.g:3579:1: ( ( RULE_NEWLINE )? )
            // InternalEgyDsl.g:3580:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_1()); 
            // InternalEgyDsl.g:3581:1: ( RULE_NEWLINE )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NEWLINE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEgyDsl.g:3581:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_2); 

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
    // InternalEgyDsl.g:3591:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3595:1: ( rule__Case__Group__2__Impl )
            // InternalEgyDsl.g:3596:2: rule__Case__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3602:1: rule__Case__Group__2__Impl : ( ( rule__Case__Group_2__0 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3606:1: ( ( ( rule__Case__Group_2__0 ) ) )
            // InternalEgyDsl.g:3607:1: ( ( rule__Case__Group_2__0 ) )
            {
            // InternalEgyDsl.g:3607:1: ( ( rule__Case__Group_2__0 ) )
            // InternalEgyDsl.g:3608:1: ( rule__Case__Group_2__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup_2()); 
            // InternalEgyDsl.g:3609:1: ( rule__Case__Group_2__0 )
            // InternalEgyDsl.g:3609:2: rule__Case__Group_2__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3625:1: rule__Case__Group_2__0 : rule__Case__Group_2__0__Impl rule__Case__Group_2__1 ;
    public final void rule__Case__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3629:1: ( rule__Case__Group_2__0__Impl rule__Case__Group_2__1 )
            // InternalEgyDsl.g:3630:2: rule__Case__Group_2__0__Impl rule__Case__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Case__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3637:1: rule__Case__Group_2__0__Impl : ( ( rule__Case__ItemsAssignment_2_0 ) ) ;
    public final void rule__Case__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3641:1: ( ( ( rule__Case__ItemsAssignment_2_0 ) ) )
            // InternalEgyDsl.g:3642:1: ( ( rule__Case__ItemsAssignment_2_0 ) )
            {
            // InternalEgyDsl.g:3642:1: ( ( rule__Case__ItemsAssignment_2_0 ) )
            // InternalEgyDsl.g:3643:1: ( rule__Case__ItemsAssignment_2_0 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_2_0()); 
            // InternalEgyDsl.g:3644:1: ( rule__Case__ItemsAssignment_2_0 )
            // InternalEgyDsl.g:3644:2: rule__Case__ItemsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3654:1: rule__Case__Group_2__1 : rule__Case__Group_2__1__Impl ;
    public final void rule__Case__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3658:1: ( rule__Case__Group_2__1__Impl )
            // InternalEgyDsl.g:3659:2: rule__Case__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3665:1: rule__Case__Group_2__1__Impl : ( ( rule__Case__Group_2_1__0 )* ) ;
    public final void rule__Case__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3669:1: ( ( ( rule__Case__Group_2_1__0 )* ) )
            // InternalEgyDsl.g:3670:1: ( ( rule__Case__Group_2_1__0 )* )
            {
            // InternalEgyDsl.g:3670:1: ( ( rule__Case__Group_2_1__0 )* )
            // InternalEgyDsl.g:3671:1: ( rule__Case__Group_2_1__0 )*
            {
             before(grammarAccess.getCaseAccess().getGroup_2_1()); 
            // InternalEgyDsl.g:3672:1: ( rule__Case__Group_2_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==9) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEgyDsl.g:3672:2: rule__Case__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalEgyDsl.g:3686:1: rule__Case__Group_2_1__0 : rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1 ;
    public final void rule__Case__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3690:1: ( rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1 )
            // InternalEgyDsl.g:3691:2: rule__Case__Group_2_1__0__Impl rule__Case__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Case__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3698:1: rule__Case__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__Case__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3702:1: ( ( ' ' ) )
            // InternalEgyDsl.g:3703:1: ( ' ' )
            {
            // InternalEgyDsl.g:3703:1: ( ' ' )
            // InternalEgyDsl.g:3704:1: ' '
            {
             before(grammarAccess.getCaseAccess().getSpaceKeyword_2_1_0()); 
            match(input,9,FOLLOW_2); 
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
    // InternalEgyDsl.g:3717:1: rule__Case__Group_2_1__1 : rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2 ;
    public final void rule__Case__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3721:1: ( rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2 )
            // InternalEgyDsl.g:3722:2: rule__Case__Group_2_1__1__Impl rule__Case__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Case__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3729:1: rule__Case__Group_2_1__1__Impl : ( ( RULE_NEWLINE )? ) ;
    public final void rule__Case__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3733:1: ( ( ( RULE_NEWLINE )? ) )
            // InternalEgyDsl.g:3734:1: ( ( RULE_NEWLINE )? )
            {
            // InternalEgyDsl.g:3734:1: ( ( RULE_NEWLINE )? )
            // InternalEgyDsl.g:3735:1: ( RULE_NEWLINE )?
            {
             before(grammarAccess.getCaseAccess().getNEWLINETerminalRuleCall_2_1_1()); 
            // InternalEgyDsl.g:3736:1: ( RULE_NEWLINE )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NEWLINE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEgyDsl.g:3736:3: RULE_NEWLINE
                    {
                    match(input,RULE_NEWLINE,FOLLOW_2); 

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
    // InternalEgyDsl.g:3746:1: rule__Case__Group_2_1__2 : rule__Case__Group_2_1__2__Impl ;
    public final void rule__Case__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3750:1: ( rule__Case__Group_2_1__2__Impl )
            // InternalEgyDsl.g:3751:2: rule__Case__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3757:1: rule__Case__Group_2_1__2__Impl : ( ( rule__Case__ItemsAssignment_2_1_2 ) ) ;
    public final void rule__Case__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3761:1: ( ( ( rule__Case__ItemsAssignment_2_1_2 ) ) )
            // InternalEgyDsl.g:3762:1: ( ( rule__Case__ItemsAssignment_2_1_2 ) )
            {
            // InternalEgyDsl.g:3762:1: ( ( rule__Case__ItemsAssignment_2_1_2 ) )
            // InternalEgyDsl.g:3763:1: ( rule__Case__ItemsAssignment_2_1_2 )
            {
             before(grammarAccess.getCaseAccess().getItemsAssignment_2_1_2()); 
            // InternalEgyDsl.g:3764:1: ( rule__Case__ItemsAssignment_2_1_2 )
            // InternalEgyDsl.g:3764:2: rule__Case__ItemsAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Word__Group__0"
    // InternalEgyDsl.g:3780:1: rule__Word__Group__0 : rule__Word__Group__0__Impl rule__Word__Group__1 ;
    public final void rule__Word__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3784:1: ( rule__Word__Group__0__Impl rule__Word__Group__1 )
            // InternalEgyDsl.g:3785:2: rule__Word__Group__0__Impl rule__Word__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Word__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3792:1: rule__Word__Group__0__Impl : ( () ) ;
    public final void rule__Word__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3796:1: ( ( () ) )
            // InternalEgyDsl.g:3797:1: ( () )
            {
            // InternalEgyDsl.g:3797:1: ( () )
            // InternalEgyDsl.g:3798:1: ()
            {
             before(grammarAccess.getWordAccess().getWordAction_0()); 
            // InternalEgyDsl.g:3799:1: ()
            // InternalEgyDsl.g:3801:1: 
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
    // InternalEgyDsl.g:3811:1: rule__Word__Group__1 : rule__Word__Group__1__Impl ;
    public final void rule__Word__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3815:1: ( rule__Word__Group__1__Impl )
            // InternalEgyDsl.g:3816:2: rule__Word__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3822:1: rule__Word__Group__1__Impl : ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) ) ;
    public final void rule__Word__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3826:1: ( ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) ) )
            // InternalEgyDsl.g:3827:1: ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) )
            {
            // InternalEgyDsl.g:3827:1: ( ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* ) )
            // InternalEgyDsl.g:3828:1: ( ( rule__Word__WCharAssignment_1 ) ) ( ( rule__Word__WCharAssignment_1 )* )
            {
            // InternalEgyDsl.g:3828:1: ( ( rule__Word__WCharAssignment_1 ) )
            // InternalEgyDsl.g:3829:1: ( rule__Word__WCharAssignment_1 )
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1()); 
            // InternalEgyDsl.g:3830:1: ( rule__Word__WCharAssignment_1 )
            // InternalEgyDsl.g:3830:2: rule__Word__WCharAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__Word__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getWCharAssignment_1()); 

            }

            // InternalEgyDsl.g:3833:1: ( ( rule__Word__WCharAssignment_1 )* )
            // InternalEgyDsl.g:3834:1: ( rule__Word__WCharAssignment_1 )*
            {
             before(grammarAccess.getWordAccess().getWCharAssignment_1()); 
            // InternalEgyDsl.g:3835:1: ( rule__Word__WCharAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_EGYSTRING||LA30_0==13||LA30_0==15||LA30_0==17||LA30_0==19||LA30_0==21||LA30_0==23||LA30_0==25||LA30_0==27||LA30_0==29||LA30_0==31||LA30_0==33||LA30_0==35||LA30_0==37||(LA30_0>=39 && LA30_0<=46)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEgyDsl.g:3835:2: rule__Word__WCharAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
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


    // $ANTLR start "rule__Oval__Group__0"
    // InternalEgyDsl.g:3850:1: rule__Oval__Group__0 : rule__Oval__Group__0__Impl rule__Oval__Group__1 ;
    public final void rule__Oval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3854:1: ( rule__Oval__Group__0__Impl rule__Oval__Group__1 )
            // InternalEgyDsl.g:3855:2: rule__Oval__Group__0__Impl rule__Oval__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Oval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3862:1: rule__Oval__Group__0__Impl : ( '\\uD80C\\uDE58' ) ;
    public final void rule__Oval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3866:1: ( ( '\\uD80C\\uDE58' ) )
            // InternalEgyDsl.g:3867:1: ( '\\uD80C\\uDE58' )
            {
            // InternalEgyDsl.g:3867:1: ( '\\uD80C\\uDE58' )
            // InternalEgyDsl.g:3868:1: '\\uD80C\\uDE58'
            {
             before(grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe58Keyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEgyDsl.g:3881:1: rule__Oval__Group__1 : rule__Oval__Group__1__Impl rule__Oval__Group__2 ;
    public final void rule__Oval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3885:1: ( rule__Oval__Group__1__Impl rule__Oval__Group__2 )
            // InternalEgyDsl.g:3886:2: rule__Oval__Group__1__Impl rule__Oval__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Oval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3893:1: rule__Oval__Group__1__Impl : ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) ) ;
    public final void rule__Oval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3897:1: ( ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) ) )
            // InternalEgyDsl.g:3898:1: ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) )
            {
            // InternalEgyDsl.g:3898:1: ( ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* ) )
            // InternalEgyDsl.g:3899:1: ( ( rule__Oval__WCharAssignment_1 ) ) ( ( rule__Oval__WCharAssignment_1 )* )
            {
            // InternalEgyDsl.g:3899:1: ( ( rule__Oval__WCharAssignment_1 ) )
            // InternalEgyDsl.g:3900:1: ( rule__Oval__WCharAssignment_1 )
            {
             before(grammarAccess.getOvalAccess().getWCharAssignment_1()); 
            // InternalEgyDsl.g:3901:1: ( rule__Oval__WCharAssignment_1 )
            // InternalEgyDsl.g:3901:2: rule__Oval__WCharAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__Oval__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOvalAccess().getWCharAssignment_1()); 

            }

            // InternalEgyDsl.g:3904:1: ( ( rule__Oval__WCharAssignment_1 )* )
            // InternalEgyDsl.g:3905:1: ( rule__Oval__WCharAssignment_1 )*
            {
             before(grammarAccess.getOvalAccess().getWCharAssignment_1()); 
            // InternalEgyDsl.g:3906:1: ( rule__Oval__WCharAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_EGYSTRING||LA31_0==19||LA31_0==21||LA31_0==23||LA31_0==25||LA31_0==27||LA31_0==29||LA31_0==31||LA31_0==33||LA31_0==35||LA31_0==37||(LA31_0>=39 && LA31_0<=46)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEgyDsl.g:3906:2: rule__Oval__WCharAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Oval__WCharAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalEgyDsl.g:3917:1: rule__Oval__Group__2 : rule__Oval__Group__2__Impl ;
    public final void rule__Oval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3921:1: ( rule__Oval__Group__2__Impl )
            // InternalEgyDsl.g:3922:2: rule__Oval__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3928:1: rule__Oval__Group__2__Impl : ( '\\uD80C\\uDE82' ) ;
    public final void rule__Oval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3932:1: ( ( '\\uD80C\\uDE82' ) )
            // InternalEgyDsl.g:3933:1: ( '\\uD80C\\uDE82' )
            {
            // InternalEgyDsl.g:3933:1: ( '\\uD80C\\uDE82' )
            // InternalEgyDsl.g:3934:1: '\\uD80C\\uDE82'
            {
             before(grammarAccess.getOvalAccess().getLeadSurrogateD80cTrailSurrogateDe82Keyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEgyDsl.g:3953:1: rule__Serech__Group__0 : rule__Serech__Group__0__Impl rule__Serech__Group__1 ;
    public final void rule__Serech__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3957:1: ( rule__Serech__Group__0__Impl rule__Serech__Group__1 )
            // InternalEgyDsl.g:3958:2: rule__Serech__Group__0__Impl rule__Serech__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Serech__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3965:1: rule__Serech__Group__0__Impl : ( '\\uD80C\\uDF79' ) ;
    public final void rule__Serech__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3969:1: ( ( '\\uD80C\\uDF79' ) )
            // InternalEgyDsl.g:3970:1: ( '\\uD80C\\uDF79' )
            {
            // InternalEgyDsl.g:3970:1: ( '\\uD80C\\uDF79' )
            // InternalEgyDsl.g:3971:1: '\\uD80C\\uDF79'
            {
             before(grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf79Keyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEgyDsl.g:3984:1: rule__Serech__Group__1 : rule__Serech__Group__1__Impl rule__Serech__Group__2 ;
    public final void rule__Serech__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:3988:1: ( rule__Serech__Group__1__Impl rule__Serech__Group__2 )
            // InternalEgyDsl.g:3989:2: rule__Serech__Group__1__Impl rule__Serech__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Serech__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:3996:1: rule__Serech__Group__1__Impl : ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) ) ;
    public final void rule__Serech__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4000:1: ( ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) ) )
            // InternalEgyDsl.g:4001:1: ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) )
            {
            // InternalEgyDsl.g:4001:1: ( ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* ) )
            // InternalEgyDsl.g:4002:1: ( ( rule__Serech__WCharAssignment_1 ) ) ( ( rule__Serech__WCharAssignment_1 )* )
            {
            // InternalEgyDsl.g:4002:1: ( ( rule__Serech__WCharAssignment_1 ) )
            // InternalEgyDsl.g:4003:1: ( rule__Serech__WCharAssignment_1 )
            {
             before(grammarAccess.getSerechAccess().getWCharAssignment_1()); 
            // InternalEgyDsl.g:4004:1: ( rule__Serech__WCharAssignment_1 )
            // InternalEgyDsl.g:4004:2: rule__Serech__WCharAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__Serech__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSerechAccess().getWCharAssignment_1()); 

            }

            // InternalEgyDsl.g:4007:1: ( ( rule__Serech__WCharAssignment_1 )* )
            // InternalEgyDsl.g:4008:1: ( rule__Serech__WCharAssignment_1 )*
            {
             before(grammarAccess.getSerechAccess().getWCharAssignment_1()); 
            // InternalEgyDsl.g:4009:1: ( rule__Serech__WCharAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_EGYSTRING||LA32_0==19||LA32_0==21||LA32_0==23||LA32_0==25||LA32_0==27||LA32_0==29||LA32_0==31||LA32_0==33||LA32_0==35||LA32_0==37||(LA32_0>=39 && LA32_0<=46)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEgyDsl.g:4009:2: rule__Serech__WCharAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Serech__WCharAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalEgyDsl.g:4020:1: rule__Serech__Group__2 : rule__Serech__Group__2__Impl ;
    public final void rule__Serech__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4024:1: ( rule__Serech__Group__2__Impl )
            // InternalEgyDsl.g:4025:2: rule__Serech__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4031:1: rule__Serech__Group__2__Impl : ( '\\uD80C\\uDF7A' ) ;
    public final void rule__Serech__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4035:1: ( ( '\\uD80C\\uDF7A' ) )
            // InternalEgyDsl.g:4036:1: ( '\\uD80C\\uDF7A' )
            {
            // InternalEgyDsl.g:4036:1: ( '\\uD80C\\uDF7A' )
            // InternalEgyDsl.g:4037:1: '\\uD80C\\uDF7A'
            {
             before(grammarAccess.getSerechAccess().getLeadSurrogateD80cTrailSurrogateDf7aKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEgyDsl.g:4056:1: rule__Cartouche__Group__0 : rule__Cartouche__Group__0__Impl rule__Cartouche__Group__1 ;
    public final void rule__Cartouche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4060:1: ( rule__Cartouche__Group__0__Impl rule__Cartouche__Group__1 )
            // InternalEgyDsl.g:4061:2: rule__Cartouche__Group__0__Impl rule__Cartouche__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Cartouche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4068:1: rule__Cartouche__Group__0__Impl : ( () ) ;
    public final void rule__Cartouche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4072:1: ( ( () ) )
            // InternalEgyDsl.g:4073:1: ( () )
            {
            // InternalEgyDsl.g:4073:1: ( () )
            // InternalEgyDsl.g:4074:1: ()
            {
             before(grammarAccess.getCartoucheAccess().getExpandedAction_0()); 
            // InternalEgyDsl.g:4075:1: ()
            // InternalEgyDsl.g:4077:1: 
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
    // InternalEgyDsl.g:4087:1: rule__Cartouche__Group__1 : rule__Cartouche__Group__1__Impl rule__Cartouche__Group__2 ;
    public final void rule__Cartouche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4091:1: ( rule__Cartouche__Group__1__Impl rule__Cartouche__Group__2 )
            // InternalEgyDsl.g:4092:2: rule__Cartouche__Group__1__Impl rule__Cartouche__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Cartouche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4099:1: rule__Cartouche__Group__1__Impl : ( '\\uD80C\\uDE86' ) ;
    public final void rule__Cartouche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4103:1: ( ( '\\uD80C\\uDE86' ) )
            // InternalEgyDsl.g:4104:1: ( '\\uD80C\\uDE86' )
            {
            // InternalEgyDsl.g:4104:1: ( '\\uD80C\\uDE86' )
            // InternalEgyDsl.g:4105:1: '\\uD80C\\uDE86'
            {
             before(grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe86Keyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEgyDsl.g:4118:1: rule__Cartouche__Group__2 : rule__Cartouche__Group__2__Impl rule__Cartouche__Group__3 ;
    public final void rule__Cartouche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4122:1: ( rule__Cartouche__Group__2__Impl rule__Cartouche__Group__3 )
            // InternalEgyDsl.g:4123:2: rule__Cartouche__Group__2__Impl rule__Cartouche__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Cartouche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4130:1: rule__Cartouche__Group__2__Impl : ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) ) ;
    public final void rule__Cartouche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4134:1: ( ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4135:1: ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4135:1: ( ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4136:1: ( ( rule__Cartouche__WCharAssignment_2 ) ) ( ( rule__Cartouche__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4136:1: ( ( rule__Cartouche__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4137:1: ( rule__Cartouche__WCharAssignment_2 )
            {
             before(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4138:1: ( rule__Cartouche__WCharAssignment_2 )
            // InternalEgyDsl.g:4138:2: rule__Cartouche__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Cartouche__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4141:1: ( ( rule__Cartouche__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4142:1: ( rule__Cartouche__WCharAssignment_2 )*
            {
             before(grammarAccess.getCartoucheAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4143:1: ( rule__Cartouche__WCharAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_EGYSTRING||LA33_0==19||LA33_0==21||LA33_0==23||LA33_0==25||LA33_0==27||LA33_0==29||LA33_0==31||LA33_0==33||LA33_0==35||LA33_0==37||(LA33_0>=39 && LA33_0<=46)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEgyDsl.g:4143:2: rule__Cartouche__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Cartouche__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalEgyDsl.g:4154:1: rule__Cartouche__Group__3 : rule__Cartouche__Group__3__Impl ;
    public final void rule__Cartouche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4158:1: ( rule__Cartouche__Group__3__Impl )
            // InternalEgyDsl.g:4159:2: rule__Cartouche__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4165:1: rule__Cartouche__Group__3__Impl : ( '\\uD80C\\uDE87' ) ;
    public final void rule__Cartouche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4169:1: ( ( '\\uD80C\\uDE87' ) )
            // InternalEgyDsl.g:4170:1: ( '\\uD80C\\uDE87' )
            {
            // InternalEgyDsl.g:4170:1: ( '\\uD80C\\uDE87' )
            // InternalEgyDsl.g:4171:1: '\\uD80C\\uDE87'
            {
             before(grammarAccess.getCartoucheAccess().getLeadSurrogateD80cTrailSurrogateDe87Keyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEgyDsl.g:4192:1: rule__Expanded__Group__0 : rule__Expanded__Group__0__Impl rule__Expanded__Group__1 ;
    public final void rule__Expanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4196:1: ( rule__Expanded__Group__0__Impl rule__Expanded__Group__1 )
            // InternalEgyDsl.g:4197:2: rule__Expanded__Group__0__Impl rule__Expanded__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Expanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4204:1: rule__Expanded__Group__0__Impl : ( () ) ;
    public final void rule__Expanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4208:1: ( ( () ) )
            // InternalEgyDsl.g:4209:1: ( () )
            {
            // InternalEgyDsl.g:4209:1: ( () )
            // InternalEgyDsl.g:4210:1: ()
            {
             before(grammarAccess.getExpandedAccess().getExpandedAction_0()); 
            // InternalEgyDsl.g:4211:1: ()
            // InternalEgyDsl.g:4213:1: 
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
    // InternalEgyDsl.g:4223:1: rule__Expanded__Group__1 : rule__Expanded__Group__1__Impl rule__Expanded__Group__2 ;
    public final void rule__Expanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4227:1: ( rule__Expanded__Group__1__Impl rule__Expanded__Group__2 )
            // InternalEgyDsl.g:4228:2: rule__Expanded__Group__1__Impl rule__Expanded__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Expanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4235:1: rule__Expanded__Group__1__Impl : ( '(' ) ;
    public final void rule__Expanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4239:1: ( ( '(' ) )
            // InternalEgyDsl.g:4240:1: ( '(' )
            {
            // InternalEgyDsl.g:4240:1: ( '(' )
            // InternalEgyDsl.g:4241:1: '('
            {
             before(grammarAccess.getExpandedAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEgyDsl.g:4254:1: rule__Expanded__Group__2 : rule__Expanded__Group__2__Impl rule__Expanded__Group__3 ;
    public final void rule__Expanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4258:1: ( rule__Expanded__Group__2__Impl rule__Expanded__Group__3 )
            // InternalEgyDsl.g:4259:2: rule__Expanded__Group__2__Impl rule__Expanded__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Expanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4266:1: rule__Expanded__Group__2__Impl : ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) ;
    public final void rule__Expanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4270:1: ( ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4271:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4271:1: ( ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4272:1: ( ( rule__Expanded__WCharAssignment_2 ) ) ( ( rule__Expanded__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4272:1: ( ( rule__Expanded__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4273:1: ( rule__Expanded__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4274:1: ( rule__Expanded__WCharAssignment_2 )
            // InternalEgyDsl.g:4274:2: rule__Expanded__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Expanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4277:1: ( ( rule__Expanded__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4278:1: ( rule__Expanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4279:1: ( rule__Expanded__WCharAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EGYSTRING||LA34_0==25||(LA34_0>=39 && LA34_0<=46)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEgyDsl.g:4279:2: rule__Expanded__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalEgyDsl.g:4290:1: rule__Expanded__Group__3 : rule__Expanded__Group__3__Impl ;
    public final void rule__Expanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4294:1: ( rule__Expanded__Group__3__Impl )
            // InternalEgyDsl.g:4295:2: rule__Expanded__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4301:1: rule__Expanded__Group__3__Impl : ( ')' ) ;
    public final void rule__Expanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4305:1: ( ( ')' ) )
            // InternalEgyDsl.g:4306:1: ( ')' )
            {
            // InternalEgyDsl.g:4306:1: ( ')' )
            // InternalEgyDsl.g:4307:1: ')'
            {
             before(grammarAccess.getExpandedAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__AncientExpanded__Group__0"
    // InternalEgyDsl.g:4328:1: rule__AncientExpanded__Group__0 : rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 ;
    public final void rule__AncientExpanded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4332:1: ( rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1 )
            // InternalEgyDsl.g:4333:2: rule__AncientExpanded__Group__0__Impl rule__AncientExpanded__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AncientExpanded__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4340:1: rule__AncientExpanded__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpanded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4344:1: ( ( () ) )
            // InternalEgyDsl.g:4345:1: ( () )
            {
            // InternalEgyDsl.g:4345:1: ( () )
            // InternalEgyDsl.g:4346:1: ()
            {
             before(grammarAccess.getAncientExpandedAccess().getAncientExpandedAction_0()); 
            // InternalEgyDsl.g:4347:1: ()
            // InternalEgyDsl.g:4349:1: 
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
    // InternalEgyDsl.g:4359:1: rule__AncientExpanded__Group__1 : rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 ;
    public final void rule__AncientExpanded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4363:1: ( rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2 )
            // InternalEgyDsl.g:4364:2: rule__AncientExpanded__Group__1__Impl rule__AncientExpanded__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__AncientExpanded__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4371:1: rule__AncientExpanded__Group__1__Impl : ( '((' ) ;
    public final void rule__AncientExpanded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4375:1: ( ( '((' ) )
            // InternalEgyDsl.g:4376:1: ( '((' )
            {
            // InternalEgyDsl.g:4376:1: ( '((' )
            // InternalEgyDsl.g:4377:1: '(('
            {
             before(grammarAccess.getAncientExpandedAccess().getLeftParenthesisLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEgyDsl.g:4390:1: rule__AncientExpanded__Group__2 : rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 ;
    public final void rule__AncientExpanded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4394:1: ( rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3 )
            // InternalEgyDsl.g:4395:2: rule__AncientExpanded__Group__2__Impl rule__AncientExpanded__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__AncientExpanded__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4402:1: rule__AncientExpanded__Group__2__Impl : ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) ;
    public final void rule__AncientExpanded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4406:1: ( ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4407:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4407:1: ( ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4408:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) ) ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4408:1: ( ( rule__AncientExpanded__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4409:1: ( rule__AncientExpanded__WCharAssignment_2 )
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4410:1: ( rule__AncientExpanded__WCharAssignment_2 )
            // InternalEgyDsl.g:4410:2: rule__AncientExpanded__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__AncientExpanded__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4413:1: ( ( rule__AncientExpanded__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4414:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4415:1: ( rule__AncientExpanded__WCharAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_EGYSTRING||LA35_0==19||LA35_0==23||LA35_0==25||LA35_0==27||LA35_0==29||LA35_0==37||(LA35_0>=39 && LA35_0<=46)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEgyDsl.g:4415:2: rule__AncientExpanded__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AncientExpanded__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalEgyDsl.g:4426:1: rule__AncientExpanded__Group__3 : rule__AncientExpanded__Group__3__Impl ;
    public final void rule__AncientExpanded__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4430:1: ( rule__AncientExpanded__Group__3__Impl )
            // InternalEgyDsl.g:4431:2: rule__AncientExpanded__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4437:1: rule__AncientExpanded__Group__3__Impl : ( '))' ) ;
    public final void rule__AncientExpanded__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4441:1: ( ( '))' ) )
            // InternalEgyDsl.g:4442:1: ( '))' )
            {
            // InternalEgyDsl.g:4442:1: ( '))' )
            // InternalEgyDsl.g:4443:1: '))'
            {
             before(grammarAccess.getAncientExpandedAccess().getRightParenthesisRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Emendation__Group__0"
    // InternalEgyDsl.g:4464:1: rule__Emendation__Group__0 : rule__Emendation__Group__0__Impl rule__Emendation__Group__1 ;
    public final void rule__Emendation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4468:1: ( rule__Emendation__Group__0__Impl rule__Emendation__Group__1 )
            // InternalEgyDsl.g:4469:2: rule__Emendation__Group__0__Impl rule__Emendation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Emendation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4476:1: rule__Emendation__Group__0__Impl : ( () ) ;
    public final void rule__Emendation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4480:1: ( ( () ) )
            // InternalEgyDsl.g:4481:1: ( () )
            {
            // InternalEgyDsl.g:4481:1: ( () )
            // InternalEgyDsl.g:4482:1: ()
            {
             before(grammarAccess.getEmendationAccess().getEmendationAction_0()); 
            // InternalEgyDsl.g:4483:1: ()
            // InternalEgyDsl.g:4485:1: 
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
    // InternalEgyDsl.g:4495:1: rule__Emendation__Group__1 : rule__Emendation__Group__1__Impl rule__Emendation__Group__2 ;
    public final void rule__Emendation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4499:1: ( rule__Emendation__Group__1__Impl rule__Emendation__Group__2 )
            // InternalEgyDsl.g:4500:2: rule__Emendation__Group__1__Impl rule__Emendation__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Emendation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4507:1: rule__Emendation__Group__1__Impl : ( '\\u2329' ) ;
    public final void rule__Emendation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4511:1: ( ( '\\u2329' ) )
            // InternalEgyDsl.g:4512:1: ( '\\u2329' )
            {
            // InternalEgyDsl.g:4512:1: ( '\\u2329' )
            // InternalEgyDsl.g:4513:1: '\\u2329'
            {
             before(grammarAccess.getEmendationAccess().getLeftPointingAngleBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEgyDsl.g:4526:1: rule__Emendation__Group__2 : rule__Emendation__Group__2__Impl rule__Emendation__Group__3 ;
    public final void rule__Emendation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4530:1: ( rule__Emendation__Group__2__Impl rule__Emendation__Group__3 )
            // InternalEgyDsl.g:4531:2: rule__Emendation__Group__2__Impl rule__Emendation__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Emendation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4538:1: rule__Emendation__Group__2__Impl : ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) ;
    public final void rule__Emendation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4542:1: ( ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4543:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4543:1: ( ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4544:1: ( ( rule__Emendation__WCharAssignment_2 ) ) ( ( rule__Emendation__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4544:1: ( ( rule__Emendation__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4545:1: ( rule__Emendation__WCharAssignment_2 )
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4546:1: ( rule__Emendation__WCharAssignment_2 )
            // InternalEgyDsl.g:4546:2: rule__Emendation__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Emendation__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4549:1: ( ( rule__Emendation__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4550:1: ( rule__Emendation__WCharAssignment_2 )*
            {
             before(grammarAccess.getEmendationAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4551:1: ( rule__Emendation__WCharAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_EGYSTRING||LA36_0==19||LA36_0==25||(LA36_0>=39 && LA36_0<=46)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEgyDsl.g:4551:2: rule__Emendation__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalEgyDsl.g:4562:1: rule__Emendation__Group__3 : rule__Emendation__Group__3__Impl ;
    public final void rule__Emendation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4566:1: ( rule__Emendation__Group__3__Impl )
            // InternalEgyDsl.g:4567:2: rule__Emendation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4573:1: rule__Emendation__Group__3__Impl : ( '\\u232A' ) ;
    public final void rule__Emendation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4577:1: ( ( '\\u232A' ) )
            // InternalEgyDsl.g:4578:1: ( '\\u232A' )
            {
            // InternalEgyDsl.g:4578:1: ( '\\u232A' )
            // InternalEgyDsl.g:4579:1: '\\u232A'
            {
             before(grammarAccess.getEmendationAccess().getRightPointingAngleBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEgyDsl.g:4600:1: rule__DisputableReading__Group__0 : rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 ;
    public final void rule__DisputableReading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4604:1: ( rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1 )
            // InternalEgyDsl.g:4605:2: rule__DisputableReading__Group__0__Impl rule__DisputableReading__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DisputableReading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4612:1: rule__DisputableReading__Group__0__Impl : ( () ) ;
    public final void rule__DisputableReading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4616:1: ( ( () ) )
            // InternalEgyDsl.g:4617:1: ( () )
            {
            // InternalEgyDsl.g:4617:1: ( () )
            // InternalEgyDsl.g:4618:1: ()
            {
             before(grammarAccess.getDisputableReadingAccess().getDisputableReadingAction_0()); 
            // InternalEgyDsl.g:4619:1: ()
            // InternalEgyDsl.g:4621:1: 
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
    // InternalEgyDsl.g:4631:1: rule__DisputableReading__Group__1 : rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 ;
    public final void rule__DisputableReading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4635:1: ( rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2 )
            // InternalEgyDsl.g:4636:2: rule__DisputableReading__Group__1__Impl rule__DisputableReading__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__DisputableReading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4643:1: rule__DisputableReading__Group__1__Impl : ( '\\u2E2E' ) ;
    public final void rule__DisputableReading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4647:1: ( ( '\\u2E2E' ) )
            // InternalEgyDsl.g:4648:1: ( '\\u2E2E' )
            {
            // InternalEgyDsl.g:4648:1: ( '\\u2E2E' )
            // InternalEgyDsl.g:4649:1: '\\u2E2E'
            {
             before(grammarAccess.getDisputableReadingAccess().getReversedQuestionMarkKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEgyDsl.g:4662:1: rule__DisputableReading__Group__2 : rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 ;
    public final void rule__DisputableReading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4666:1: ( rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3 )
            // InternalEgyDsl.g:4667:2: rule__DisputableReading__Group__2__Impl rule__DisputableReading__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__DisputableReading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4674:1: rule__DisputableReading__Group__2__Impl : ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) ;
    public final void rule__DisputableReading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4678:1: ( ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4679:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4679:1: ( ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4680:1: ( ( rule__DisputableReading__WCharAssignment_2 ) ) ( ( rule__DisputableReading__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4680:1: ( ( rule__DisputableReading__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4681:1: ( rule__DisputableReading__WCharAssignment_2 )
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4682:1: ( rule__DisputableReading__WCharAssignment_2 )
            // InternalEgyDsl.g:4682:2: rule__DisputableReading__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__DisputableReading__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4685:1: ( ( rule__DisputableReading__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4686:1: ( rule__DisputableReading__WCharAssignment_2 )*
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4687:1: ( rule__DisputableReading__WCharAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_EGYSTRING||LA37_0==19||LA37_0==21||LA37_0==23||LA37_0==27||LA37_0==29||LA37_0==31||LA37_0==33||LA37_0==35||LA37_0==37||(LA37_0>=39 && LA37_0<=46)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEgyDsl.g:4687:2: rule__DisputableReading__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalEgyDsl.g:4698:1: rule__DisputableReading__Group__3 : rule__DisputableReading__Group__3__Impl ;
    public final void rule__DisputableReading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4702:1: ( rule__DisputableReading__Group__3__Impl )
            // InternalEgyDsl.g:4703:2: rule__DisputableReading__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4709:1: rule__DisputableReading__Group__3__Impl : ( '?' ) ;
    public final void rule__DisputableReading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4713:1: ( ( '?' ) )
            // InternalEgyDsl.g:4714:1: ( '?' )
            {
            // InternalEgyDsl.g:4714:1: ( '?' )
            // InternalEgyDsl.g:4715:1: '?'
            {
             before(grammarAccess.getDisputableReadingAccess().getQuestionMarkKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEgyDsl.g:4736:1: rule__Lacuna__Group__0 : rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 ;
    public final void rule__Lacuna__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4740:1: ( rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1 )
            // InternalEgyDsl.g:4741:2: rule__Lacuna__Group__0__Impl rule__Lacuna__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Lacuna__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4748:1: rule__Lacuna__Group__0__Impl : ( () ) ;
    public final void rule__Lacuna__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4752:1: ( ( () ) )
            // InternalEgyDsl.g:4753:1: ( () )
            {
            // InternalEgyDsl.g:4753:1: ( () )
            // InternalEgyDsl.g:4754:1: ()
            {
             before(grammarAccess.getLacunaAccess().getLacunaAction_0()); 
            // InternalEgyDsl.g:4755:1: ()
            // InternalEgyDsl.g:4757:1: 
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
    // InternalEgyDsl.g:4767:1: rule__Lacuna__Group__1 : rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 ;
    public final void rule__Lacuna__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4771:1: ( rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2 )
            // InternalEgyDsl.g:4772:2: rule__Lacuna__Group__1__Impl rule__Lacuna__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Lacuna__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4779:1: rule__Lacuna__Group__1__Impl : ( '[' ) ;
    public final void rule__Lacuna__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4783:1: ( ( '[' ) )
            // InternalEgyDsl.g:4784:1: ( '[' )
            {
            // InternalEgyDsl.g:4784:1: ( '[' )
            // InternalEgyDsl.g:4785:1: '['
            {
             before(grammarAccess.getLacunaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEgyDsl.g:4798:1: rule__Lacuna__Group__2 : rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 ;
    public final void rule__Lacuna__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4802:1: ( rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3 )
            // InternalEgyDsl.g:4803:2: rule__Lacuna__Group__2__Impl rule__Lacuna__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Lacuna__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4810:1: rule__Lacuna__Group__2__Impl : ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) ;
    public final void rule__Lacuna__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4814:1: ( ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4815:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4815:1: ( ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4816:1: ( ( rule__Lacuna__WCharAssignment_2 ) ) ( ( rule__Lacuna__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4816:1: ( ( rule__Lacuna__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4817:1: ( rule__Lacuna__WCharAssignment_2 )
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4818:1: ( rule__Lacuna__WCharAssignment_2 )
            // InternalEgyDsl.g:4818:2: rule__Lacuna__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Lacuna__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4821:1: ( ( rule__Lacuna__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4822:1: ( rule__Lacuna__WCharAssignment_2 )*
            {
             before(grammarAccess.getLacunaAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4823:1: ( rule__Lacuna__WCharAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EGYSTRING||LA38_0==13||LA38_0==15||LA38_0==17||LA38_0==19||LA38_0==23||LA38_0==25||LA38_0==29||(LA38_0>=39 && LA38_0<=46)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEgyDsl.g:4823:2: rule__Lacuna__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalEgyDsl.g:4834:1: rule__Lacuna__Group__3 : rule__Lacuna__Group__3__Impl ;
    public final void rule__Lacuna__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4838:1: ( rule__Lacuna__Group__3__Impl )
            // InternalEgyDsl.g:4839:2: rule__Lacuna__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4845:1: rule__Lacuna__Group__3__Impl : ( ']' ) ;
    public final void rule__Lacuna__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4849:1: ( ( ']' ) )
            // InternalEgyDsl.g:4850:1: ( ']' )
            {
            // InternalEgyDsl.g:4850:1: ( ']' )
            // InternalEgyDsl.g:4851:1: ']'
            {
             before(grammarAccess.getLacunaAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEgyDsl.g:4872:1: rule__Deletion__Group__0 : rule__Deletion__Group__0__Impl rule__Deletion__Group__1 ;
    public final void rule__Deletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4876:1: ( rule__Deletion__Group__0__Impl rule__Deletion__Group__1 )
            // InternalEgyDsl.g:4877:2: rule__Deletion__Group__0__Impl rule__Deletion__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Deletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4884:1: rule__Deletion__Group__0__Impl : ( () ) ;
    public final void rule__Deletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4888:1: ( ( () ) )
            // InternalEgyDsl.g:4889:1: ( () )
            {
            // InternalEgyDsl.g:4889:1: ( () )
            // InternalEgyDsl.g:4890:1: ()
            {
             before(grammarAccess.getDeletionAccess().getDeletionAction_0()); 
            // InternalEgyDsl.g:4891:1: ()
            // InternalEgyDsl.g:4893:1: 
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
    // InternalEgyDsl.g:4903:1: rule__Deletion__Group__1 : rule__Deletion__Group__1__Impl rule__Deletion__Group__2 ;
    public final void rule__Deletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4907:1: ( rule__Deletion__Group__1__Impl rule__Deletion__Group__2 )
            // InternalEgyDsl.g:4908:2: rule__Deletion__Group__1__Impl rule__Deletion__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Deletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4915:1: rule__Deletion__Group__1__Impl : ( '{' ) ;
    public final void rule__Deletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4919:1: ( ( '{' ) )
            // InternalEgyDsl.g:4920:1: ( '{' )
            {
            // InternalEgyDsl.g:4920:1: ( '{' )
            // InternalEgyDsl.g:4921:1: '{'
            {
             before(grammarAccess.getDeletionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEgyDsl.g:4934:1: rule__Deletion__Group__2 : rule__Deletion__Group__2__Impl rule__Deletion__Group__3 ;
    public final void rule__Deletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4938:1: ( rule__Deletion__Group__2__Impl rule__Deletion__Group__3 )
            // InternalEgyDsl.g:4939:2: rule__Deletion__Group__2__Impl rule__Deletion__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Deletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4946:1: rule__Deletion__Group__2__Impl : ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) ;
    public final void rule__Deletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4950:1: ( ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:4951:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:4951:1: ( ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:4952:1: ( ( rule__Deletion__WCharAssignment_2 ) ) ( ( rule__Deletion__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:4952:1: ( ( rule__Deletion__WCharAssignment_2 ) )
            // InternalEgyDsl.g:4953:1: ( rule__Deletion__WCharAssignment_2 )
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4954:1: ( rule__Deletion__WCharAssignment_2 )
            // InternalEgyDsl.g:4954:2: rule__Deletion__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Deletion__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:4957:1: ( ( rule__Deletion__WCharAssignment_2 )* )
            // InternalEgyDsl.g:4958:1: ( rule__Deletion__WCharAssignment_2 )*
            {
             before(grammarAccess.getDeletionAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:4959:1: ( rule__Deletion__WCharAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_EGYSTRING||LA39_0==19||LA39_0==21||LA39_0==25||LA39_0==27||LA39_0==35||LA39_0==37||(LA39_0>=39 && LA39_0<=46)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEgyDsl.g:4959:2: rule__Deletion__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalEgyDsl.g:4970:1: rule__Deletion__Group__3 : rule__Deletion__Group__3__Impl ;
    public final void rule__Deletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4974:1: ( rule__Deletion__Group__3__Impl )
            // InternalEgyDsl.g:4975:2: rule__Deletion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:4981:1: rule__Deletion__Group__3__Impl : ( '}' ) ;
    public final void rule__Deletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:4985:1: ( ( '}' ) )
            // InternalEgyDsl.g:4986:1: ( '}' )
            {
            // InternalEgyDsl.g:4986:1: ( '}' )
            // InternalEgyDsl.g:4987:1: '}'
            {
             before(grammarAccess.getDeletionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEgyDsl.g:5008:1: rule__ExpandedColumn__Group__0 : rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 ;
    public final void rule__ExpandedColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5012:1: ( rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1 )
            // InternalEgyDsl.g:5013:2: rule__ExpandedColumn__Group__0__Impl rule__ExpandedColumn__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ExpandedColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5020:1: rule__ExpandedColumn__Group__0__Impl : ( () ) ;
    public final void rule__ExpandedColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5024:1: ( ( () ) )
            // InternalEgyDsl.g:5025:1: ( () )
            {
            // InternalEgyDsl.g:5025:1: ( () )
            // InternalEgyDsl.g:5026:1: ()
            {
             before(grammarAccess.getExpandedColumnAccess().getExpandedColumnAction_0()); 
            // InternalEgyDsl.g:5027:1: ()
            // InternalEgyDsl.g:5029:1: 
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
    // InternalEgyDsl.g:5039:1: rule__ExpandedColumn__Group__1 : rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 ;
    public final void rule__ExpandedColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5043:1: ( rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2 )
            // InternalEgyDsl.g:5044:2: rule__ExpandedColumn__Group__1__Impl rule__ExpandedColumn__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ExpandedColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5051:1: rule__ExpandedColumn__Group__1__Impl : ( '\\u2329\\u2329' ) ;
    public final void rule__ExpandedColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5055:1: ( ( '\\u2329\\u2329' ) )
            // InternalEgyDsl.g:5056:1: ( '\\u2329\\u2329' )
            {
            // InternalEgyDsl.g:5056:1: ( '\\u2329\\u2329' )
            // InternalEgyDsl.g:5057:1: '\\u2329\\u2329'
            {
             before(grammarAccess.getExpandedColumnAccess().getLeftPointingAngleBracketLeftPointingAngleBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalEgyDsl.g:5070:1: rule__ExpandedColumn__Group__2 : rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 ;
    public final void rule__ExpandedColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5074:1: ( rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3 )
            // InternalEgyDsl.g:5075:2: rule__ExpandedColumn__Group__2__Impl rule__ExpandedColumn__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ExpandedColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5082:1: rule__ExpandedColumn__Group__2__Impl : ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) ;
    public final void rule__ExpandedColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5086:1: ( ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:5087:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:5087:1: ( ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:5088:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) ) ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:5088:1: ( ( rule__ExpandedColumn__WCharAssignment_2 ) )
            // InternalEgyDsl.g:5089:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5090:1: ( rule__ExpandedColumn__WCharAssignment_2 )
            // InternalEgyDsl.g:5090:2: rule__ExpandedColumn__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__ExpandedColumn__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:5093:1: ( ( rule__ExpandedColumn__WCharAssignment_2 )* )
            // InternalEgyDsl.g:5094:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5095:1: ( rule__ExpandedColumn__WCharAssignment_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_EGYSTRING||LA40_0==19||LA40_0==23||LA40_0==25||LA40_0==27||LA40_0==29||LA40_0==37||(LA40_0>=39 && LA40_0<=46)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalEgyDsl.g:5095:2: rule__ExpandedColumn__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalEgyDsl.g:5106:1: rule__ExpandedColumn__Group__3 : rule__ExpandedColumn__Group__3__Impl ;
    public final void rule__ExpandedColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5110:1: ( rule__ExpandedColumn__Group__3__Impl )
            // InternalEgyDsl.g:5111:2: rule__ExpandedColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5117:1: rule__ExpandedColumn__Group__3__Impl : ( '\\u232A\\u232A' ) ;
    public final void rule__ExpandedColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5121:1: ( ( '\\u232A\\u232A' ) )
            // InternalEgyDsl.g:5122:1: ( '\\u232A\\u232A' )
            {
            // InternalEgyDsl.g:5122:1: ( '\\u232A\\u232A' )
            // InternalEgyDsl.g:5123:1: '\\u232A\\u232A'
            {
             before(grammarAccess.getExpandedColumnAccess().getRightPointingAngleBracketRightPointingAngleBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalEgyDsl.g:5144:1: rule__Rasur__Group__0 : rule__Rasur__Group__0__Impl rule__Rasur__Group__1 ;
    public final void rule__Rasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5148:1: ( rule__Rasur__Group__0__Impl rule__Rasur__Group__1 )
            // InternalEgyDsl.g:5149:2: rule__Rasur__Group__0__Impl rule__Rasur__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Rasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5156:1: rule__Rasur__Group__0__Impl : ( () ) ;
    public final void rule__Rasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5160:1: ( ( () ) )
            // InternalEgyDsl.g:5161:1: ( () )
            {
            // InternalEgyDsl.g:5161:1: ( () )
            // InternalEgyDsl.g:5162:1: ()
            {
             before(grammarAccess.getRasurAccess().getRasurAction_0()); 
            // InternalEgyDsl.g:5163:1: ()
            // InternalEgyDsl.g:5165:1: 
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
    // InternalEgyDsl.g:5175:1: rule__Rasur__Group__1 : rule__Rasur__Group__1__Impl rule__Rasur__Group__2 ;
    public final void rule__Rasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5179:1: ( rule__Rasur__Group__1__Impl rule__Rasur__Group__2 )
            // InternalEgyDsl.g:5180:2: rule__Rasur__Group__1__Impl rule__Rasur__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Rasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5187:1: rule__Rasur__Group__1__Impl : ( '{{' ) ;
    public final void rule__Rasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5191:1: ( ( '{{' ) )
            // InternalEgyDsl.g:5192:1: ( '{{' )
            {
            // InternalEgyDsl.g:5192:1: ( '{{' )
            // InternalEgyDsl.g:5193:1: '{{'
            {
             before(grammarAccess.getRasurAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalEgyDsl.g:5206:1: rule__Rasur__Group__2 : rule__Rasur__Group__2__Impl rule__Rasur__Group__3 ;
    public final void rule__Rasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5210:1: ( rule__Rasur__Group__2__Impl rule__Rasur__Group__3 )
            // InternalEgyDsl.g:5211:2: rule__Rasur__Group__2__Impl rule__Rasur__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Rasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5218:1: rule__Rasur__Group__2__Impl : ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) ;
    public final void rule__Rasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5222:1: ( ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:5223:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:5223:1: ( ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:5224:1: ( ( rule__Rasur__WCharAssignment_2 ) ) ( ( rule__Rasur__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:5224:1: ( ( rule__Rasur__WCharAssignment_2 ) )
            // InternalEgyDsl.g:5225:1: ( rule__Rasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5226:1: ( rule__Rasur__WCharAssignment_2 )
            // InternalEgyDsl.g:5226:2: rule__Rasur__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Rasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRasurAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:5229:1: ( ( rule__Rasur__WCharAssignment_2 )* )
            // InternalEgyDsl.g:5230:1: ( rule__Rasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRasurAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5231:1: ( rule__Rasur__WCharAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_EGYSTRING||LA41_0==19||LA41_0==23||LA41_0==25||LA41_0==27||LA41_0==29||LA41_0==37||(LA41_0>=39 && LA41_0<=46)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalEgyDsl.g:5231:2: rule__Rasur__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalEgyDsl.g:5242:1: rule__Rasur__Group__3 : rule__Rasur__Group__3__Impl ;
    public final void rule__Rasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5246:1: ( rule__Rasur__Group__3__Impl )
            // InternalEgyDsl.g:5247:2: rule__Rasur__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5253:1: rule__Rasur__Group__3__Impl : ( '}}' ) ;
    public final void rule__Rasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5257:1: ( ( '}}' ) )
            // InternalEgyDsl.g:5258:1: ( '}}' )
            {
            // InternalEgyDsl.g:5258:1: ( '}}' )
            // InternalEgyDsl.g:5259:1: '}}'
            {
             before(grammarAccess.getRasurAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__RestorationOverRasur__Group__0"
    // InternalEgyDsl.g:5280:1: rule__RestorationOverRasur__Group__0 : rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 ;
    public final void rule__RestorationOverRasur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5284:1: ( rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1 )
            // InternalEgyDsl.g:5285:2: rule__RestorationOverRasur__Group__0__Impl rule__RestorationOverRasur__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__RestorationOverRasur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5292:1: rule__RestorationOverRasur__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5296:1: ( ( () ) )
            // InternalEgyDsl.g:5297:1: ( () )
            {
            // InternalEgyDsl.g:5297:1: ( () )
            // InternalEgyDsl.g:5298:1: ()
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRestorationOverRasurAction_0()); 
            // InternalEgyDsl.g:5299:1: ()
            // InternalEgyDsl.g:5301:1: 
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
    // InternalEgyDsl.g:5311:1: rule__RestorationOverRasur__Group__1 : rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 ;
    public final void rule__RestorationOverRasur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5315:1: ( rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2 )
            // InternalEgyDsl.g:5316:2: rule__RestorationOverRasur__Group__1__Impl rule__RestorationOverRasur__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RestorationOverRasur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5323:1: rule__RestorationOverRasur__Group__1__Impl : ( '[[' ) ;
    public final void rule__RestorationOverRasur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5327:1: ( ( '[[' ) )
            // InternalEgyDsl.g:5328:1: ( '[[' )
            {
            // InternalEgyDsl.g:5328:1: ( '[[' )
            // InternalEgyDsl.g:5329:1: '[['
            {
             before(grammarAccess.getRestorationOverRasurAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalEgyDsl.g:5342:1: rule__RestorationOverRasur__Group__2 : rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 ;
    public final void rule__RestorationOverRasur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5346:1: ( rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3 )
            // InternalEgyDsl.g:5347:2: rule__RestorationOverRasur__Group__2__Impl rule__RestorationOverRasur__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__RestorationOverRasur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5354:1: rule__RestorationOverRasur__Group__2__Impl : ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) ;
    public final void rule__RestorationOverRasur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5358:1: ( ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:5359:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:5359:1: ( ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:5360:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) ) ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:5360:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 ) )
            // InternalEgyDsl.g:5361:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5362:1: ( rule__RestorationOverRasur__WCharAssignment_2 )
            // InternalEgyDsl.g:5362:2: rule__RestorationOverRasur__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__RestorationOverRasur__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:5365:1: ( ( rule__RestorationOverRasur__WCharAssignment_2 )* )
            // InternalEgyDsl.g:5366:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5367:1: ( rule__RestorationOverRasur__WCharAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_EGYSTRING||LA42_0==17||LA42_0==19||LA42_0==23||LA42_0==25||LA42_0==27||LA42_0==29||LA42_0==37||(LA42_0>=39 && LA42_0<=46)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalEgyDsl.g:5367:2: rule__RestorationOverRasur__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RestorationOverRasur__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalEgyDsl.g:5378:1: rule__RestorationOverRasur__Group__3 : rule__RestorationOverRasur__Group__3__Impl ;
    public final void rule__RestorationOverRasur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5382:1: ( rule__RestorationOverRasur__Group__3__Impl )
            // InternalEgyDsl.g:5383:2: rule__RestorationOverRasur__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5389:1: rule__RestorationOverRasur__Group__3__Impl : ( ']]' ) ;
    public final void rule__RestorationOverRasur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5393:1: ( ( ']]' ) )
            // InternalEgyDsl.g:5394:1: ( ']]' )
            {
            // InternalEgyDsl.g:5394:1: ( ']]' )
            // InternalEgyDsl.g:5395:1: ']]'
            {
             before(grammarAccess.getRestorationOverRasurAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalEgyDsl.g:5416:1: rule__PartialDestruction__Group__0 : rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 ;
    public final void rule__PartialDestruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5420:1: ( rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1 )
            // InternalEgyDsl.g:5421:2: rule__PartialDestruction__Group__0__Impl rule__PartialDestruction__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__PartialDestruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5428:1: rule__PartialDestruction__Group__0__Impl : ( () ) ;
    public final void rule__PartialDestruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5432:1: ( ( () ) )
            // InternalEgyDsl.g:5433:1: ( () )
            {
            // InternalEgyDsl.g:5433:1: ( () )
            // InternalEgyDsl.g:5434:1: ()
            {
             before(grammarAccess.getPartialDestructionAccess().getPartialDestructionAction_0()); 
            // InternalEgyDsl.g:5435:1: ()
            // InternalEgyDsl.g:5437:1: 
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
    // InternalEgyDsl.g:5447:1: rule__PartialDestruction__Group__1 : rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 ;
    public final void rule__PartialDestruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5451:1: ( rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2 )
            // InternalEgyDsl.g:5452:2: rule__PartialDestruction__Group__1__Impl rule__PartialDestruction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__PartialDestruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5459:1: rule__PartialDestruction__Group__1__Impl : ( '\\u2E22' ) ;
    public final void rule__PartialDestruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5463:1: ( ( '\\u2E22' ) )
            // InternalEgyDsl.g:5464:1: ( '\\u2E22' )
            {
            // InternalEgyDsl.g:5464:1: ( '\\u2E22' )
            // InternalEgyDsl.g:5465:1: '\\u2E22'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopLeftHalfBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalEgyDsl.g:5478:1: rule__PartialDestruction__Group__2 : rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 ;
    public final void rule__PartialDestruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5482:1: ( rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3 )
            // InternalEgyDsl.g:5483:2: rule__PartialDestruction__Group__2__Impl rule__PartialDestruction__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__PartialDestruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5490:1: rule__PartialDestruction__Group__2__Impl : ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) ;
    public final void rule__PartialDestruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5494:1: ( ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) ) )
            // InternalEgyDsl.g:5495:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            {
            // InternalEgyDsl.g:5495:1: ( ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* ) )
            // InternalEgyDsl.g:5496:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) ) ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            {
            // InternalEgyDsl.g:5496:1: ( ( rule__PartialDestruction__WCharAssignment_2 ) )
            // InternalEgyDsl.g:5497:1: ( rule__PartialDestruction__WCharAssignment_2 )
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5498:1: ( rule__PartialDestruction__WCharAssignment_2 )
            // InternalEgyDsl.g:5498:2: rule__PartialDestruction__WCharAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__PartialDestruction__WCharAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 

            }

            // InternalEgyDsl.g:5501:1: ( ( rule__PartialDestruction__WCharAssignment_2 )* )
            // InternalEgyDsl.g:5502:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharAssignment_2()); 
            // InternalEgyDsl.g:5503:1: ( rule__PartialDestruction__WCharAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_EGYSTRING||LA43_0==13||LA43_0==15||LA43_0==17||LA43_0==19||LA43_0==23||LA43_0==25||LA43_0==29||(LA43_0>=39 && LA43_0<=46)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalEgyDsl.g:5503:2: rule__PartialDestruction__WCharAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__PartialDestruction__WCharAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalEgyDsl.g:5514:1: rule__PartialDestruction__Group__3 : rule__PartialDestruction__Group__3__Impl ;
    public final void rule__PartialDestruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5518:1: ( rule__PartialDestruction__Group__3__Impl )
            // InternalEgyDsl.g:5519:2: rule__PartialDestruction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5525:1: rule__PartialDestruction__Group__3__Impl : ( '\\u2E23' ) ;
    public final void rule__PartialDestruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5529:1: ( ( '\\u2E23' ) )
            // InternalEgyDsl.g:5530:1: ( '\\u2E23' )
            {
            // InternalEgyDsl.g:5530:1: ( '\\u2E23' )
            // InternalEgyDsl.g:5531:1: '\\u2E23'
            {
             before(grammarAccess.getPartialDestructionAccess().getTopRightHalfBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalEgyDsl.g:5552:1: rule__InterfixLexical__Group__0 : rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 ;
    public final void rule__InterfixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5556:1: ( rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1 )
            // InternalEgyDsl.g:5557:2: rule__InterfixLexical__Group__0__Impl rule__InterfixLexical__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__InterfixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5564:1: rule__InterfixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5568:1: ( ( () ) )
            // InternalEgyDsl.g:5569:1: ( () )
            {
            // InternalEgyDsl.g:5569:1: ( () )
            // InternalEgyDsl.g:5570:1: ()
            {
             before(grammarAccess.getInterfixLexicalAccess().getInterfixLexicalAction_0()); 
            // InternalEgyDsl.g:5571:1: ()
            // InternalEgyDsl.g:5573:1: 
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
    // InternalEgyDsl.g:5583:1: rule__InterfixLexical__Group__1 : rule__InterfixLexical__Group__1__Impl ;
    public final void rule__InterfixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5587:1: ( rule__InterfixLexical__Group__1__Impl )
            // InternalEgyDsl.g:5588:2: rule__InterfixLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5594:1: rule__InterfixLexical__Group__1__Impl : ( ',' ) ;
    public final void rule__InterfixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5598:1: ( ( ',' ) )
            // InternalEgyDsl.g:5599:1: ( ',' )
            {
            // InternalEgyDsl.g:5599:1: ( ',' )
            // InternalEgyDsl.g:5600:1: ','
            {
             before(grammarAccess.getInterfixLexicalAccess().getCommaKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalEgyDsl.g:5617:1: rule__InterfixFlexion__Group__0 : rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 ;
    public final void rule__InterfixFlexion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5621:1: ( rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1 )
            // InternalEgyDsl.g:5622:2: rule__InterfixFlexion__Group__0__Impl rule__InterfixFlexion__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__InterfixFlexion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5629:1: rule__InterfixFlexion__Group__0__Impl : ( () ) ;
    public final void rule__InterfixFlexion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5633:1: ( ( () ) )
            // InternalEgyDsl.g:5634:1: ( () )
            {
            // InternalEgyDsl.g:5634:1: ( () )
            // InternalEgyDsl.g:5635:1: ()
            {
             before(grammarAccess.getInterfixFlexionAccess().getInterfixFlexionAction_0()); 
            // InternalEgyDsl.g:5636:1: ()
            // InternalEgyDsl.g:5638:1: 
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
    // InternalEgyDsl.g:5648:1: rule__InterfixFlexion__Group__1 : rule__InterfixFlexion__Group__1__Impl ;
    public final void rule__InterfixFlexion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5652:1: ( rule__InterfixFlexion__Group__1__Impl )
            // InternalEgyDsl.g:5653:2: rule__InterfixFlexion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5659:1: rule__InterfixFlexion__Group__1__Impl : ( '.' ) ;
    public final void rule__InterfixFlexion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5663:1: ( ( '.' ) )
            // InternalEgyDsl.g:5664:1: ( '.' )
            {
            // InternalEgyDsl.g:5664:1: ( '.' )
            // InternalEgyDsl.g:5665:1: '.'
            {
             before(grammarAccess.getInterfixFlexionAccess().getFullStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalEgyDsl.g:5682:1: rule__InterfixSuffixPronomLexical__Group__0 : rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 ;
    public final void rule__InterfixSuffixPronomLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5686:1: ( rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1 )
            // InternalEgyDsl.g:5687:2: rule__InterfixSuffixPronomLexical__Group__0__Impl rule__InterfixSuffixPronomLexical__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__InterfixSuffixPronomLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5694:1: rule__InterfixSuffixPronomLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5698:1: ( ( () ) )
            // InternalEgyDsl.g:5699:1: ( () )
            {
            // InternalEgyDsl.g:5699:1: ( () )
            // InternalEgyDsl.g:5700:1: ()
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getInterfixSuffixPronomLexicalAction_0()); 
            // InternalEgyDsl.g:5701:1: ()
            // InternalEgyDsl.g:5703:1: 
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
    // InternalEgyDsl.g:5713:1: rule__InterfixSuffixPronomLexical__Group__1 : rule__InterfixSuffixPronomLexical__Group__1__Impl ;
    public final void rule__InterfixSuffixPronomLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5717:1: ( rule__InterfixSuffixPronomLexical__Group__1__Impl )
            // InternalEgyDsl.g:5718:2: rule__InterfixSuffixPronomLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5724:1: rule__InterfixSuffixPronomLexical__Group__1__Impl : ( '\\u2261' ) ;
    public final void rule__InterfixSuffixPronomLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5728:1: ( ( '\\u2261' ) )
            // InternalEgyDsl.g:5729:1: ( '\\u2261' )
            {
            // InternalEgyDsl.g:5729:1: ( '\\u2261' )
            // InternalEgyDsl.g:5730:1: '\\u2261'
            {
             before(grammarAccess.getInterfixSuffixPronomLexicalAccess().getIdenticalToKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalEgyDsl.g:5747:1: rule__InterfixPrefixNonLexical__Group__0 : rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 ;
    public final void rule__InterfixPrefixNonLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5751:1: ( rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1 )
            // InternalEgyDsl.g:5752:2: rule__InterfixPrefixNonLexical__Group__0__Impl rule__InterfixPrefixNonLexical__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__InterfixPrefixNonLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5759:1: rule__InterfixPrefixNonLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixNonLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5763:1: ( ( () ) )
            // InternalEgyDsl.g:5764:1: ( () )
            {
            // InternalEgyDsl.g:5764:1: ( () )
            // InternalEgyDsl.g:5765:1: ()
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getInterfixPrefixNonLexicalAction_0()); 
            // InternalEgyDsl.g:5766:1: ()
            // InternalEgyDsl.g:5768:1: 
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
    // InternalEgyDsl.g:5778:1: rule__InterfixPrefixNonLexical__Group__1 : rule__InterfixPrefixNonLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixNonLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5782:1: ( rule__InterfixPrefixNonLexical__Group__1__Impl )
            // InternalEgyDsl.g:5783:2: rule__InterfixPrefixNonLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5789:1: rule__InterfixPrefixNonLexical__Group__1__Impl : ( ':' ) ;
    public final void rule__InterfixPrefixNonLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5793:1: ( ( ':' ) )
            // InternalEgyDsl.g:5794:1: ( ':' )
            {
            // InternalEgyDsl.g:5794:1: ( ':' )
            // InternalEgyDsl.g:5795:1: ':'
            {
             before(grammarAccess.getInterfixPrefixNonLexicalAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalEgyDsl.g:5812:1: rule__InterfixPrefixLexical__Group__0 : rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 ;
    public final void rule__InterfixPrefixLexical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5816:1: ( rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1 )
            // InternalEgyDsl.g:5817:2: rule__InterfixPrefixLexical__Group__0__Impl rule__InterfixPrefixLexical__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__InterfixPrefixLexical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5824:1: rule__InterfixPrefixLexical__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPrefixLexical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5828:1: ( ( () ) )
            // InternalEgyDsl.g:5829:1: ( () )
            {
            // InternalEgyDsl.g:5829:1: ( () )
            // InternalEgyDsl.g:5830:1: ()
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getInterfixPrefixLexicalAction_0()); 
            // InternalEgyDsl.g:5831:1: ()
            // InternalEgyDsl.g:5833:1: 
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
    // InternalEgyDsl.g:5843:1: rule__InterfixPrefixLexical__Group__1 : rule__InterfixPrefixLexical__Group__1__Impl ;
    public final void rule__InterfixPrefixLexical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5847:1: ( rule__InterfixPrefixLexical__Group__1__Impl )
            // InternalEgyDsl.g:5848:2: rule__InterfixPrefixLexical__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5854:1: rule__InterfixPrefixLexical__Group__1__Impl : ( '\\u22EE' ) ;
    public final void rule__InterfixPrefixLexical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5858:1: ( ( '\\u22EE' ) )
            // InternalEgyDsl.g:5859:1: ( '\\u22EE' )
            {
            // InternalEgyDsl.g:5859:1: ( '\\u22EE' )
            // InternalEgyDsl.g:5860:1: '\\u22EE'
            {
             before(grammarAccess.getInterfixPrefixLexicalAccess().getVerticalEllipsisKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalEgyDsl.g:5877:1: rule__InterfixConnectionSyllabicGroup__Group__0 : rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5881:1: ( rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1 )
            // InternalEgyDsl.g:5882:2: rule__InterfixConnectionSyllabicGroup__Group__0__Impl rule__InterfixConnectionSyllabicGroup__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__InterfixConnectionSyllabicGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5889:1: rule__InterfixConnectionSyllabicGroup__Group__0__Impl : ( () ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5893:1: ( ( () ) )
            // InternalEgyDsl.g:5894:1: ( () )
            {
            // InternalEgyDsl.g:5894:1: ( () )
            // InternalEgyDsl.g:5895:1: ()
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getInterfixConnectionSyllabicGroupAction_0()); 
            // InternalEgyDsl.g:5896:1: ()
            // InternalEgyDsl.g:5898:1: 
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
    // InternalEgyDsl.g:5908:1: rule__InterfixConnectionSyllabicGroup__Group__1 : rule__InterfixConnectionSyllabicGroup__Group__1__Impl ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5912:1: ( rule__InterfixConnectionSyllabicGroup__Group__1__Impl )
            // InternalEgyDsl.g:5913:2: rule__InterfixConnectionSyllabicGroup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5919:1: rule__InterfixConnectionSyllabicGroup__Group__1__Impl : ( '~' ) ;
    public final void rule__InterfixConnectionSyllabicGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5923:1: ( ( '~' ) )
            // InternalEgyDsl.g:5924:1: ( '~' )
            {
            // InternalEgyDsl.g:5924:1: ( '~' )
            // InternalEgyDsl.g:5925:1: '~'
            {
             before(grammarAccess.getInterfixConnectionSyllabicGroupAccess().getTildeKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalEgyDsl.g:5942:1: rule__InterfixCompoundWords__Group__0 : rule__InterfixCompoundWords__Group__0__Impl rule__InterfixCompoundWords__Group__1 ;
    public final void rule__InterfixCompoundWords__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5946:1: ( rule__InterfixCompoundWords__Group__0__Impl rule__InterfixCompoundWords__Group__1 )
            // InternalEgyDsl.g:5947:2: rule__InterfixCompoundWords__Group__0__Impl rule__InterfixCompoundWords__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__InterfixCompoundWords__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5954:1: rule__InterfixCompoundWords__Group__0__Impl : ( () ) ;
    public final void rule__InterfixCompoundWords__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5958:1: ( ( () ) )
            // InternalEgyDsl.g:5959:1: ( () )
            {
            // InternalEgyDsl.g:5959:1: ( () )
            // InternalEgyDsl.g:5960:1: ()
            {
             before(grammarAccess.getInterfixCompoundWordsAccess().getInterfixCompoundWordsAction_0()); 
            // InternalEgyDsl.g:5961:1: ()
            // InternalEgyDsl.g:5963:1: 
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
    // InternalEgyDsl.g:5973:1: rule__InterfixCompoundWords__Group__1 : rule__InterfixCompoundWords__Group__1__Impl ;
    public final void rule__InterfixCompoundWords__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5977:1: ( rule__InterfixCompoundWords__Group__1__Impl )
            // InternalEgyDsl.g:5978:2: rule__InterfixCompoundWords__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:5984:1: rule__InterfixCompoundWords__Group__1__Impl : ( '-' ) ;
    public final void rule__InterfixCompoundWords__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:5988:1: ( ( '-' ) )
            // InternalEgyDsl.g:5989:1: ( '-' )
            {
            // InternalEgyDsl.g:5989:1: ( '-' )
            // InternalEgyDsl.g:5990:1: '-'
            {
             before(grammarAccess.getInterfixCompoundWordsAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalEgyDsl.g:6007:1: rule__InterfixPhoneticalComplement__Group__0 : rule__InterfixPhoneticalComplement__Group__0__Impl rule__InterfixPhoneticalComplement__Group__1 ;
    public final void rule__InterfixPhoneticalComplement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6011:1: ( rule__InterfixPhoneticalComplement__Group__0__Impl rule__InterfixPhoneticalComplement__Group__1 )
            // InternalEgyDsl.g:6012:2: rule__InterfixPhoneticalComplement__Group__0__Impl rule__InterfixPhoneticalComplement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__InterfixPhoneticalComplement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6019:1: rule__InterfixPhoneticalComplement__Group__0__Impl : ( () ) ;
    public final void rule__InterfixPhoneticalComplement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6023:1: ( ( () ) )
            // InternalEgyDsl.g:6024:1: ( () )
            {
            // InternalEgyDsl.g:6024:1: ( () )
            // InternalEgyDsl.g:6025:1: ()
            {
             before(grammarAccess.getInterfixPhoneticalComplementAccess().getInterfixPhoneticalComplementAction_0()); 
            // InternalEgyDsl.g:6026:1: ()
            // InternalEgyDsl.g:6028:1: 
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
    // InternalEgyDsl.g:6038:1: rule__InterfixPhoneticalComplement__Group__1 : rule__InterfixPhoneticalComplement__Group__1__Impl ;
    public final void rule__InterfixPhoneticalComplement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6042:1: ( rule__InterfixPhoneticalComplement__Group__1__Impl )
            // InternalEgyDsl.g:6043:2: rule__InterfixPhoneticalComplement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6049:1: rule__InterfixPhoneticalComplement__Group__1__Impl : ( ';' ) ;
    public final void rule__InterfixPhoneticalComplement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6053:1: ( ( ';' ) )
            // InternalEgyDsl.g:6054:1: ( ';' )
            {
            // InternalEgyDsl.g:6054:1: ( ';' )
            // InternalEgyDsl.g:6055:1: ';'
            {
             before(grammarAccess.getInterfixPhoneticalComplementAccess().getSemicolonKeyword_1()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__EmendationVersMarker__Group__0"
    // InternalEgyDsl.g:6072:1: rule__EmendationVersMarker__Group__0 : rule__EmendationVersMarker__Group__0__Impl rule__EmendationVersMarker__Group__1 ;
    public final void rule__EmendationVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6076:1: ( rule__EmendationVersMarker__Group__0__Impl rule__EmendationVersMarker__Group__1 )
            // InternalEgyDsl.g:6077:2: rule__EmendationVersMarker__Group__0__Impl rule__EmendationVersMarker__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__EmendationVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmendationVersMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmendationVersMarker__Group__0"


    // $ANTLR start "rule__EmendationVersMarker__Group__0__Impl"
    // InternalEgyDsl.g:6084:1: rule__EmendationVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__EmendationVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6088:1: ( ( () ) )
            // InternalEgyDsl.g:6089:1: ( () )
            {
            // InternalEgyDsl.g:6089:1: ( () )
            // InternalEgyDsl.g:6090:1: ()
            {
             before(grammarAccess.getEmendationVersMarkerAccess().getEmendationVersMarkerAction_0()); 
            // InternalEgyDsl.g:6091:1: ()
            // InternalEgyDsl.g:6093:1: 
            {
            }

             after(grammarAccess.getEmendationVersMarkerAccess().getEmendationVersMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmendationVersMarker__Group__0__Impl"


    // $ANTLR start "rule__EmendationVersMarker__Group__1"
    // InternalEgyDsl.g:6103:1: rule__EmendationVersMarker__Group__1 : rule__EmendationVersMarker__Group__1__Impl ;
    public final void rule__EmendationVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6107:1: ( rule__EmendationVersMarker__Group__1__Impl )
            // InternalEgyDsl.g:6108:2: rule__EmendationVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmendationVersMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmendationVersMarker__Group__1"


    // $ANTLR start "rule__EmendationVersMarker__Group__1__Impl"
    // InternalEgyDsl.g:6114:1: rule__EmendationVersMarker__Group__1__Impl : ( '(\\uDB80\\uDC80)' ) ;
    public final void rule__EmendationVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6118:1: ( ( '(\\uDB80\\uDC80)' ) )
            // InternalEgyDsl.g:6119:1: ( '(\\uDB80\\uDC80)' )
            {
            // InternalEgyDsl.g:6119:1: ( '(\\uDB80\\uDC80)' )
            // InternalEgyDsl.g:6120:1: '(\\uDB80\\uDC80)'
            {
             before(grammarAccess.getEmendationVersMarkerAccess().getLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEmendationVersMarkerAccess().getLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmendationVersMarker__Group__1__Impl"


    // $ANTLR start "rule__DisputableVersMarker__Group__0"
    // InternalEgyDsl.g:6137:1: rule__DisputableVersMarker__Group__0 : rule__DisputableVersMarker__Group__0__Impl rule__DisputableVersMarker__Group__1 ;
    public final void rule__DisputableVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6141:1: ( rule__DisputableVersMarker__Group__0__Impl rule__DisputableVersMarker__Group__1 )
            // InternalEgyDsl.g:6142:2: rule__DisputableVersMarker__Group__0__Impl rule__DisputableVersMarker__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__DisputableVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6149:1: rule__DisputableVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__DisputableVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6153:1: ( ( () ) )
            // InternalEgyDsl.g:6154:1: ( () )
            {
            // InternalEgyDsl.g:6154:1: ( () )
            // InternalEgyDsl.g:6155:1: ()
            {
             before(grammarAccess.getDisputableVersMarkerAccess().getDisputableVersMarkerAction_0()); 
            // InternalEgyDsl.g:6156:1: ()
            // InternalEgyDsl.g:6158:1: 
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
    // InternalEgyDsl.g:6168:1: rule__DisputableVersMarker__Group__1 : rule__DisputableVersMarker__Group__1__Impl ;
    public final void rule__DisputableVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6172:1: ( rule__DisputableVersMarker__Group__1__Impl )
            // InternalEgyDsl.g:6173:2: rule__DisputableVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6179:1: rule__DisputableVersMarker__Group__1__Impl : ( '\\u2E2E\\uDB80\\uDC80?' ) ;
    public final void rule__DisputableVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6183:1: ( ( '\\u2E2E\\uDB80\\uDC80?' ) )
            // InternalEgyDsl.g:6184:1: ( '\\u2E2E\\uDB80\\uDC80?' )
            {
            // InternalEgyDsl.g:6184:1: ( '\\u2E2E\\uDB80\\uDC80?' )
            // InternalEgyDsl.g:6185:1: '\\u2E2E\\uDB80\\uDC80?'
            {
             before(grammarAccess.getDisputableVersMarkerAccess().getReversedQuestionMarkLeadSurrogateDb80TrailSurrogateDc80QuestionMarkKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalEgyDsl.g:6202:1: rule__DeletedVersMarker__Group__0 : rule__DeletedVersMarker__Group__0__Impl rule__DeletedVersMarker__Group__1 ;
    public final void rule__DeletedVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6206:1: ( rule__DeletedVersMarker__Group__0__Impl rule__DeletedVersMarker__Group__1 )
            // InternalEgyDsl.g:6207:2: rule__DeletedVersMarker__Group__0__Impl rule__DeletedVersMarker__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__DeletedVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6214:1: rule__DeletedVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__DeletedVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6218:1: ( ( () ) )
            // InternalEgyDsl.g:6219:1: ( () )
            {
            // InternalEgyDsl.g:6219:1: ( () )
            // InternalEgyDsl.g:6220:1: ()
            {
             before(grammarAccess.getDeletedVersMarkerAccess().getDeletedVersMarkerAction_0()); 
            // InternalEgyDsl.g:6221:1: ()
            // InternalEgyDsl.g:6223:1: 
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
    // InternalEgyDsl.g:6233:1: rule__DeletedVersMarker__Group__1 : rule__DeletedVersMarker__Group__1__Impl ;
    public final void rule__DeletedVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6237:1: ( rule__DeletedVersMarker__Group__1__Impl )
            // InternalEgyDsl.g:6238:2: rule__DeletedVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6244:1: rule__DeletedVersMarker__Group__1__Impl : ( '{\\uDB80\\uDC80}' ) ;
    public final void rule__DeletedVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6248:1: ( ( '{\\uDB80\\uDC80}' ) )
            // InternalEgyDsl.g:6249:1: ( '{\\uDB80\\uDC80}' )
            {
            // InternalEgyDsl.g:6249:1: ( '{\\uDB80\\uDC80}' )
            // InternalEgyDsl.g:6250:1: '{\\uDB80\\uDC80}'
            {
             before(grammarAccess.getDeletedVersMarkerAccess().getLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalEgyDsl.g:6267:1: rule__DestroyedVersMarker__Group__0 : rule__DestroyedVersMarker__Group__0__Impl rule__DestroyedVersMarker__Group__1 ;
    public final void rule__DestroyedVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6271:1: ( rule__DestroyedVersMarker__Group__0__Impl rule__DestroyedVersMarker__Group__1 )
            // InternalEgyDsl.g:6272:2: rule__DestroyedVersMarker__Group__0__Impl rule__DestroyedVersMarker__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__DestroyedVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6279:1: rule__DestroyedVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__DestroyedVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6283:1: ( ( () ) )
            // InternalEgyDsl.g:6284:1: ( () )
            {
            // InternalEgyDsl.g:6284:1: ( () )
            // InternalEgyDsl.g:6285:1: ()
            {
             before(grammarAccess.getDestroyedVersMarkerAccess().getDestroyedVersMarkerAction_0()); 
            // InternalEgyDsl.g:6286:1: ()
            // InternalEgyDsl.g:6288:1: 
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
    // InternalEgyDsl.g:6298:1: rule__DestroyedVersMarker__Group__1 : rule__DestroyedVersMarker__Group__1__Impl ;
    public final void rule__DestroyedVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6302:1: ( rule__DestroyedVersMarker__Group__1__Impl )
            // InternalEgyDsl.g:6303:2: rule__DestroyedVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6309:1: rule__DestroyedVersMarker__Group__1__Impl : ( '[\\uDB80\\uDC80]' ) ;
    public final void rule__DestroyedVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6313:1: ( ( '[\\uDB80\\uDC80]' ) )
            // InternalEgyDsl.g:6314:1: ( '[\\uDB80\\uDC80]' )
            {
            // InternalEgyDsl.g:6314:1: ( '[\\uDB80\\uDC80]' )
            // InternalEgyDsl.g:6315:1: '[\\uDB80\\uDC80]'
            {
             before(grammarAccess.getDestroyedVersMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
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


    // $ANTLR start "rule__DestroyedVersFrontierMarker__Group__0"
    // InternalEgyDsl.g:6332:1: rule__DestroyedVersFrontierMarker__Group__0 : rule__DestroyedVersFrontierMarker__Group__0__Impl rule__DestroyedVersFrontierMarker__Group__1 ;
    public final void rule__DestroyedVersFrontierMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6336:1: ( rule__DestroyedVersFrontierMarker__Group__0__Impl rule__DestroyedVersFrontierMarker__Group__1 )
            // InternalEgyDsl.g:6337:2: rule__DestroyedVersFrontierMarker__Group__0__Impl rule__DestroyedVersFrontierMarker__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__DestroyedVersFrontierMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestroyedVersFrontierMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestroyedVersFrontierMarker__Group__0"


    // $ANTLR start "rule__DestroyedVersFrontierMarker__Group__0__Impl"
    // InternalEgyDsl.g:6344:1: rule__DestroyedVersFrontierMarker__Group__0__Impl : ( () ) ;
    public final void rule__DestroyedVersFrontierMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6348:1: ( ( () ) )
            // InternalEgyDsl.g:6349:1: ( () )
            {
            // InternalEgyDsl.g:6349:1: ( () )
            // InternalEgyDsl.g:6350:1: ()
            {
             before(grammarAccess.getDestroyedVersFrontierMarkerAccess().getDestroyedVersFrontierMarkerAction_0()); 
            // InternalEgyDsl.g:6351:1: ()
            // InternalEgyDsl.g:6353:1: 
            {
            }

             after(grammarAccess.getDestroyedVersFrontierMarkerAccess().getDestroyedVersFrontierMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestroyedVersFrontierMarker__Group__0__Impl"


    // $ANTLR start "rule__DestroyedVersFrontierMarker__Group__1"
    // InternalEgyDsl.g:6363:1: rule__DestroyedVersFrontierMarker__Group__1 : rule__DestroyedVersFrontierMarker__Group__1__Impl ;
    public final void rule__DestroyedVersFrontierMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6367:1: ( rule__DestroyedVersFrontierMarker__Group__1__Impl )
            // InternalEgyDsl.g:6368:2: rule__DestroyedVersFrontierMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestroyedVersFrontierMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestroyedVersFrontierMarker__Group__1"


    // $ANTLR start "rule__DestroyedVersFrontierMarker__Group__1__Impl"
    // InternalEgyDsl.g:6374:1: rule__DestroyedVersFrontierMarker__Group__1__Impl : ( '[\\uDB80\\uDC81]' ) ;
    public final void rule__DestroyedVersFrontierMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6378:1: ( ( '[\\uDB80\\uDC81]' ) )
            // InternalEgyDsl.g:6379:1: ( '[\\uDB80\\uDC81]' )
            {
            // InternalEgyDsl.g:6379:1: ( '[\\uDB80\\uDC81]' )
            // InternalEgyDsl.g:6380:1: '[\\uDB80\\uDC81]'
            {
             before(grammarAccess.getDestroyedVersFrontierMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc81RightSquareBracketKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDestroyedVersFrontierMarkerAccess().getLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc81RightSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestroyedVersFrontierMarker__Group__1__Impl"


    // $ANTLR start "rule__PartialDestroyedVersMarker__Group__0"
    // InternalEgyDsl.g:6397:1: rule__PartialDestroyedVersMarker__Group__0 : rule__PartialDestroyedVersMarker__Group__0__Impl rule__PartialDestroyedVersMarker__Group__1 ;
    public final void rule__PartialDestroyedVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6401:1: ( rule__PartialDestroyedVersMarker__Group__0__Impl rule__PartialDestroyedVersMarker__Group__1 )
            // InternalEgyDsl.g:6402:2: rule__PartialDestroyedVersMarker__Group__0__Impl rule__PartialDestroyedVersMarker__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__PartialDestroyedVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartialDestroyedVersMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestroyedVersMarker__Group__0"


    // $ANTLR start "rule__PartialDestroyedVersMarker__Group__0__Impl"
    // InternalEgyDsl.g:6409:1: rule__PartialDestroyedVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__PartialDestroyedVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6413:1: ( ( () ) )
            // InternalEgyDsl.g:6414:1: ( () )
            {
            // InternalEgyDsl.g:6414:1: ( () )
            // InternalEgyDsl.g:6415:1: ()
            {
             before(grammarAccess.getPartialDestroyedVersMarkerAccess().getPartialDestroyedVersMarkerAction_0()); 
            // InternalEgyDsl.g:6416:1: ()
            // InternalEgyDsl.g:6418:1: 
            {
            }

             after(grammarAccess.getPartialDestroyedVersMarkerAccess().getPartialDestroyedVersMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestroyedVersMarker__Group__0__Impl"


    // $ANTLR start "rule__PartialDestroyedVersMarker__Group__1"
    // InternalEgyDsl.g:6428:1: rule__PartialDestroyedVersMarker__Group__1 : rule__PartialDestroyedVersMarker__Group__1__Impl ;
    public final void rule__PartialDestroyedVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6432:1: ( rule__PartialDestroyedVersMarker__Group__1__Impl )
            // InternalEgyDsl.g:6433:2: rule__PartialDestroyedVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartialDestroyedVersMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestroyedVersMarker__Group__1"


    // $ANTLR start "rule__PartialDestroyedVersMarker__Group__1__Impl"
    // InternalEgyDsl.g:6439:1: rule__PartialDestroyedVersMarker__Group__1__Impl : ( '\\u2E22\\uDB80\\uDC80\\u2E23' ) ;
    public final void rule__PartialDestroyedVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6443:1: ( ( '\\u2E22\\uDB80\\uDC80\\u2E23' ) )
            // InternalEgyDsl.g:6444:1: ( '\\u2E22\\uDB80\\uDC80\\u2E23' )
            {
            // InternalEgyDsl.g:6444:1: ( '\\u2E22\\uDB80\\uDC80\\u2E23' )
            // InternalEgyDsl.g:6445:1: '\\u2E22\\uDB80\\uDC80\\u2E23'
            {
             before(grammarAccess.getPartialDestroyedVersMarkerAccess().getTopLeftHalfBracketLeadSurrogateDb80TrailSurrogateDc80TopRightHalfBracketKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPartialDestroyedVersMarkerAccess().getTopLeftHalfBracketLeadSurrogateDb80TrailSurrogateDc80TopRightHalfBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialDestroyedVersMarker__Group__1__Impl"


    // $ANTLR start "rule__MissingVersMarker__Group__0"
    // InternalEgyDsl.g:6462:1: rule__MissingVersMarker__Group__0 : rule__MissingVersMarker__Group__0__Impl rule__MissingVersMarker__Group__1 ;
    public final void rule__MissingVersMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6466:1: ( rule__MissingVersMarker__Group__0__Impl rule__MissingVersMarker__Group__1 )
            // InternalEgyDsl.g:6467:2: rule__MissingVersMarker__Group__0__Impl rule__MissingVersMarker__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__MissingVersMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6474:1: rule__MissingVersMarker__Group__0__Impl : ( () ) ;
    public final void rule__MissingVersMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6478:1: ( ( () ) )
            // InternalEgyDsl.g:6479:1: ( () )
            {
            // InternalEgyDsl.g:6479:1: ( () )
            // InternalEgyDsl.g:6480:1: ()
            {
             before(grammarAccess.getMissingVersMarkerAccess().getMissingVersMarkerAction_0()); 
            // InternalEgyDsl.g:6481:1: ()
            // InternalEgyDsl.g:6483:1: 
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
    // InternalEgyDsl.g:6493:1: rule__MissingVersMarker__Group__1 : rule__MissingVersMarker__Group__1__Impl ;
    public final void rule__MissingVersMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6497:1: ( rule__MissingVersMarker__Group__1__Impl )
            // InternalEgyDsl.g:6498:2: rule__MissingVersMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6504:1: rule__MissingVersMarker__Group__1__Impl : ( '\\u2329\\uDB80\\uDC80\\u232A' ) ;
    public final void rule__MissingVersMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6508:1: ( ( '\\u2329\\uDB80\\uDC80\\u232A' ) )
            // InternalEgyDsl.g:6509:1: ( '\\u2329\\uDB80\\uDC80\\u232A' )
            {
            // InternalEgyDsl.g:6509:1: ( '\\u2329\\uDB80\\uDC80\\u232A' )
            // InternalEgyDsl.g:6510:1: '\\u2329\\uDB80\\uDC80\\u232A'
            {
             before(grammarAccess.getMissingVersMarkerAccess().getLeftPointingAngleBracketLeadSurrogateDb80TrailSurrogateDc80RightPointingAngleBracketKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalEgyDsl.g:6527:1: rule__RestorationOverRasurMarker__Group__0 : rule__RestorationOverRasurMarker__Group__0__Impl rule__RestorationOverRasurMarker__Group__1 ;
    public final void rule__RestorationOverRasurMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6531:1: ( rule__RestorationOverRasurMarker__Group__0__Impl rule__RestorationOverRasurMarker__Group__1 )
            // InternalEgyDsl.g:6532:2: rule__RestorationOverRasurMarker__Group__0__Impl rule__RestorationOverRasurMarker__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__RestorationOverRasurMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6539:1: rule__RestorationOverRasurMarker__Group__0__Impl : ( () ) ;
    public final void rule__RestorationOverRasurMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6543:1: ( ( () ) )
            // InternalEgyDsl.g:6544:1: ( () )
            {
            // InternalEgyDsl.g:6544:1: ( () )
            // InternalEgyDsl.g:6545:1: ()
            {
             before(grammarAccess.getRestorationOverRasurMarkerAccess().getRestorationOverRasurMarkerAction_0()); 
            // InternalEgyDsl.g:6546:1: ()
            // InternalEgyDsl.g:6548:1: 
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
    // InternalEgyDsl.g:6558:1: rule__RestorationOverRasurMarker__Group__1 : rule__RestorationOverRasurMarker__Group__1__Impl ;
    public final void rule__RestorationOverRasurMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6562:1: ( rule__RestorationOverRasurMarker__Group__1__Impl )
            // InternalEgyDsl.g:6563:2: rule__RestorationOverRasurMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6569:1: rule__RestorationOverRasurMarker__Group__1__Impl : ( '[[\\uDB80\\uDC80]]' ) ;
    public final void rule__RestorationOverRasurMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6573:1: ( ( '[[\\uDB80\\uDC80]]' ) )
            // InternalEgyDsl.g:6574:1: ( '[[\\uDB80\\uDC80]]' )
            {
            // InternalEgyDsl.g:6574:1: ( '[[\\uDB80\\uDC80]]' )
            // InternalEgyDsl.g:6575:1: '[[\\uDB80\\uDC80]]'
            {
             before(grammarAccess.getRestorationOverRasurMarkerAccess().getLeftSquareBracketLeftSquareBracketLeadSurrogateDb80TrailSurrogateDc80RightSquareBracketRightSquareBracketKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalEgyDsl.g:6592:1: rule__AncientExpandedMarker__Group__0 : rule__AncientExpandedMarker__Group__0__Impl rule__AncientExpandedMarker__Group__1 ;
    public final void rule__AncientExpandedMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6596:1: ( rule__AncientExpandedMarker__Group__0__Impl rule__AncientExpandedMarker__Group__1 )
            // InternalEgyDsl.g:6597:2: rule__AncientExpandedMarker__Group__0__Impl rule__AncientExpandedMarker__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__AncientExpandedMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6604:1: rule__AncientExpandedMarker__Group__0__Impl : ( () ) ;
    public final void rule__AncientExpandedMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6608:1: ( ( () ) )
            // InternalEgyDsl.g:6609:1: ( () )
            {
            // InternalEgyDsl.g:6609:1: ( () )
            // InternalEgyDsl.g:6610:1: ()
            {
             before(grammarAccess.getAncientExpandedMarkerAccess().getAncientExpandedMarkerAction_0()); 
            // InternalEgyDsl.g:6611:1: ()
            // InternalEgyDsl.g:6613:1: 
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
    // InternalEgyDsl.g:6623:1: rule__AncientExpandedMarker__Group__1 : rule__AncientExpandedMarker__Group__1__Impl ;
    public final void rule__AncientExpandedMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6627:1: ( rule__AncientExpandedMarker__Group__1__Impl )
            // InternalEgyDsl.g:6628:2: rule__AncientExpandedMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6634:1: rule__AncientExpandedMarker__Group__1__Impl : ( '((\\uDB80\\uDC80))' ) ;
    public final void rule__AncientExpandedMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6638:1: ( ( '((\\uDB80\\uDC80))' ) )
            // InternalEgyDsl.g:6639:1: ( '((\\uDB80\\uDC80))' )
            {
            // InternalEgyDsl.g:6639:1: ( '((\\uDB80\\uDC80))' )
            // InternalEgyDsl.g:6640:1: '((\\uDB80\\uDC80))'
            {
             before(grammarAccess.getAncientExpandedMarkerAccess().getLeftParenthesisLeftParenthesisLeadSurrogateDb80TrailSurrogateDc80RightParenthesisRightParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalEgyDsl.g:6657:1: rule__RasurMarker__Group__0 : rule__RasurMarker__Group__0__Impl rule__RasurMarker__Group__1 ;
    public final void rule__RasurMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6661:1: ( rule__RasurMarker__Group__0__Impl rule__RasurMarker__Group__1 )
            // InternalEgyDsl.g:6662:2: rule__RasurMarker__Group__0__Impl rule__RasurMarker__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__RasurMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6669:1: rule__RasurMarker__Group__0__Impl : ( () ) ;
    public final void rule__RasurMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6673:1: ( ( () ) )
            // InternalEgyDsl.g:6674:1: ( () )
            {
            // InternalEgyDsl.g:6674:1: ( () )
            // InternalEgyDsl.g:6675:1: ()
            {
             before(grammarAccess.getRasurMarkerAccess().getAncientExpandedMarkerAction_0()); 
            // InternalEgyDsl.g:6676:1: ()
            // InternalEgyDsl.g:6678:1: 
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
    // InternalEgyDsl.g:6688:1: rule__RasurMarker__Group__1 : rule__RasurMarker__Group__1__Impl ;
    public final void rule__RasurMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6692:1: ( rule__RasurMarker__Group__1__Impl )
            // InternalEgyDsl.g:6693:2: rule__RasurMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6699:1: rule__RasurMarker__Group__1__Impl : ( '{{\\uDB80\\uDC80}}' ) ;
    public final void rule__RasurMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6703:1: ( ( '{{\\uDB80\\uDC80}}' ) )
            // InternalEgyDsl.g:6704:1: ( '{{\\uDB80\\uDC80}}' )
            {
            // InternalEgyDsl.g:6704:1: ( '{{\\uDB80\\uDC80}}' )
            // InternalEgyDsl.g:6705:1: '{{\\uDB80\\uDC80}}'
            {
             before(grammarAccess.getRasurMarkerAccess().getLeftCurlyBracketLeftCurlyBracketLeadSurrogateDb80TrailSurrogateDc80RightCurlyBracketRightCurlyBracketKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalEgyDsl.g:6722:1: rule__VersFrontierMarker__Group__0 : rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 ;
    public final void rule__VersFrontierMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6726:1: ( rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1 )
            // InternalEgyDsl.g:6727:2: rule__VersFrontierMarker__Group__0__Impl rule__VersFrontierMarker__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__VersFrontierMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6734:1: rule__VersFrontierMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersFrontierMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6738:1: ( ( () ) )
            // InternalEgyDsl.g:6739:1: ( () )
            {
            // InternalEgyDsl.g:6739:1: ( () )
            // InternalEgyDsl.g:6740:1: ()
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getVersFrontierMarkerAction_0()); 
            // InternalEgyDsl.g:6741:1: ()
            // InternalEgyDsl.g:6743:1: 
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
    // InternalEgyDsl.g:6753:1: rule__VersFrontierMarker__Group__1 : rule__VersFrontierMarker__Group__1__Impl ;
    public final void rule__VersFrontierMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6757:1: ( rule__VersFrontierMarker__Group__1__Impl )
            // InternalEgyDsl.g:6758:2: rule__VersFrontierMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6764:1: rule__VersFrontierMarker__Group__1__Impl : ( '\\uDB80\\uDC81' ) ;
    public final void rule__VersFrontierMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6768:1: ( ( '\\uDB80\\uDC81' ) )
            // InternalEgyDsl.g:6769:1: ( '\\uDB80\\uDC81' )
            {
            // InternalEgyDsl.g:6769:1: ( '\\uDB80\\uDC81' )
            // InternalEgyDsl.g:6770:1: '\\uDB80\\uDC81'
            {
             before(grammarAccess.getVersFrontierMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc81Keyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalEgyDsl.g:6787:1: rule__VersbreakMarker__Group__0 : rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 ;
    public final void rule__VersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6791:1: ( rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1 )
            // InternalEgyDsl.g:6792:2: rule__VersbreakMarker__Group__0__Impl rule__VersbreakMarker__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__VersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6799:1: rule__VersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__VersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6803:1: ( ( () ) )
            // InternalEgyDsl.g:6804:1: ( () )
            {
            // InternalEgyDsl.g:6804:1: ( () )
            // InternalEgyDsl.g:6805:1: ()
            {
             before(grammarAccess.getVersbreakMarkerAccess().getVersbreakMarkerAction_0()); 
            // InternalEgyDsl.g:6806:1: ()
            // InternalEgyDsl.g:6808:1: 
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
    // InternalEgyDsl.g:6818:1: rule__VersbreakMarker__Group__1 : rule__VersbreakMarker__Group__1__Impl ;
    public final void rule__VersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6822:1: ( rule__VersbreakMarker__Group__1__Impl )
            // InternalEgyDsl.g:6823:2: rule__VersbreakMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6829:1: rule__VersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC80' ) ;
    public final void rule__VersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6833:1: ( ( '\\uDB80\\uDC80' ) )
            // InternalEgyDsl.g:6834:1: ( '\\uDB80\\uDC80' )
            {
            // InternalEgyDsl.g:6834:1: ( '\\uDB80\\uDC80' )
            // InternalEgyDsl.g:6835:1: '\\uDB80\\uDC80'
            {
             before(grammarAccess.getVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc80Keyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalEgyDsl.g:6852:1: rule__BrokenVersbreakMarker__Group__0 : rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 ;
    public final void rule__BrokenVersbreakMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6856:1: ( rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1 )
            // InternalEgyDsl.g:6857:2: rule__BrokenVersbreakMarker__Group__0__Impl rule__BrokenVersbreakMarker__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__BrokenVersbreakMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6864:1: rule__BrokenVersbreakMarker__Group__0__Impl : ( () ) ;
    public final void rule__BrokenVersbreakMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6868:1: ( ( () ) )
            // InternalEgyDsl.g:6869:1: ( () )
            {
            // InternalEgyDsl.g:6869:1: ( () )
            // InternalEgyDsl.g:6870:1: ()
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getBrokenVersbreakMarkerAction_0()); 
            // InternalEgyDsl.g:6871:1: ()
            // InternalEgyDsl.g:6873:1: 
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
    // InternalEgyDsl.g:6883:1: rule__BrokenVersbreakMarker__Group__1 : rule__BrokenVersbreakMarker__Group__1__Impl ;
    public final void rule__BrokenVersbreakMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6887:1: ( rule__BrokenVersbreakMarker__Group__1__Impl )
            // InternalEgyDsl.g:6888:2: rule__BrokenVersbreakMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6894:1: rule__BrokenVersbreakMarker__Group__1__Impl : ( '\\uDB80\\uDC82' ) ;
    public final void rule__BrokenVersbreakMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6898:1: ( ( '\\uDB80\\uDC82' ) )
            // InternalEgyDsl.g:6899:1: ( '\\uDB80\\uDC82' )
            {
            // InternalEgyDsl.g:6899:1: ( '\\uDB80\\uDC82' )
            // InternalEgyDsl.g:6900:1: '\\uDB80\\uDC82'
            {
             before(grammarAccess.getBrokenVersbreakMarkerAccess().getLeadSurrogateDb80TrailSurrogateDc82Keyword_1()); 
            match(input,59,FOLLOW_2); 
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


    // $ANTLR start "rule__TextContent__ItemsAssignment_1_0"
    // InternalEgyDsl.g:6918:1: rule__TextContent__ItemsAssignment_1_0 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6922:1: ( ( ruleTextItem ) )
            // InternalEgyDsl.g:6923:1: ( ruleTextItem )
            {
            // InternalEgyDsl.g:6923:1: ( ruleTextItem )
            // InternalEgyDsl.g:6924:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6933:1: rule__TextContent__ItemsAssignment_1_1_1 : ( ruleTextItem ) ;
    public final void rule__TextContent__ItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6937:1: ( ( ruleTextItem ) )
            // InternalEgyDsl.g:6938:1: ( ruleTextItem )
            {
            // InternalEgyDsl.g:6938:1: ( ruleTextItem )
            // InternalEgyDsl.g:6939:1: ruleTextItem
            {
             before(grammarAccess.getTextContentAccess().getItemsTextItemParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6948:1: rule__Sentence__ItemsAssignment_2_0 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6952:1: ( ( ruleSentenceItem ) )
            // InternalEgyDsl.g:6953:1: ( ruleSentenceItem )
            {
            // InternalEgyDsl.g:6953:1: ( ruleSentenceItem )
            // InternalEgyDsl.g:6954:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6963:1: rule__Sentence__ItemsAssignment_2_1_2 : ( ruleSentenceItem ) ;
    public final void rule__Sentence__ItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6967:1: ( ( ruleSentenceItem ) )
            // InternalEgyDsl.g:6968:1: ( ruleSentenceItem )
            {
            // InternalEgyDsl.g:6968:1: ( ruleSentenceItem )
            // InternalEgyDsl.g:6969:1: ruleSentenceItem
            {
             before(grammarAccess.getSentenceAccess().getItemsSentenceItemParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6978:1: rule__Ambivalence__CasesAssignment_1_0 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6982:1: ( ( ruleCase ) )
            // InternalEgyDsl.g:6983:1: ( ruleCase )
            {
            // InternalEgyDsl.g:6983:1: ( ruleCase )
            // InternalEgyDsl.g:6984:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:6993:1: rule__Ambivalence__CasesAssignment_1_1_2 : ( ruleCase ) ;
    public final void rule__Ambivalence__CasesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:6997:1: ( ( ruleCase ) )
            // InternalEgyDsl.g:6998:1: ( ruleCase )
            {
            // InternalEgyDsl.g:6998:1: ( ruleCase )
            // InternalEgyDsl.g:6999:1: ruleCase
            {
             before(grammarAccess.getAmbivalenceAccess().getCasesCaseParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7008:1: rule__Case__NameAssignment_0 : ( RULE_CASESTRING ) ;
    public final void rule__Case__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7012:1: ( ( RULE_CASESTRING ) )
            // InternalEgyDsl.g:7013:1: ( RULE_CASESTRING )
            {
            // InternalEgyDsl.g:7013:1: ( RULE_CASESTRING )
            // InternalEgyDsl.g:7014:1: RULE_CASESTRING
            {
             before(grammarAccess.getCaseAccess().getNameCASESTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_CASESTRING,FOLLOW_2); 
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
    // InternalEgyDsl.g:7023:1: rule__Case__ItemsAssignment_2_0 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7027:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // InternalEgyDsl.g:7028:1: ( ruleSentenceItemNoAmbivalence )
            {
            // InternalEgyDsl.g:7028:1: ( ruleSentenceItemNoAmbivalence )
            // InternalEgyDsl.g:7029:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7038:1: rule__Case__ItemsAssignment_2_1_2 : ( ruleSentenceItemNoAmbivalence ) ;
    public final void rule__Case__ItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7042:1: ( ( ruleSentenceItemNoAmbivalence ) )
            // InternalEgyDsl.g:7043:1: ( ruleSentenceItemNoAmbivalence )
            {
            // InternalEgyDsl.g:7043:1: ( ruleSentenceItemNoAmbivalence )
            // InternalEgyDsl.g:7044:1: ruleSentenceItemNoAmbivalence
            {
             before(grammarAccess.getCaseAccess().getItemsSentenceItemNoAmbivalenceParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7053:1: rule__Marker__TypeAssignment : ( RULE_BETWEEN_HASHES ) ;
    public final void rule__Marker__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7057:1: ( ( RULE_BETWEEN_HASHES ) )
            // InternalEgyDsl.g:7058:1: ( RULE_BETWEEN_HASHES )
            {
            // InternalEgyDsl.g:7058:1: ( RULE_BETWEEN_HASHES )
            // InternalEgyDsl.g:7059:1: RULE_BETWEEN_HASHES
            {
             before(grammarAccess.getMarkerAccess().getTypeBETWEEN_HASHESTerminalRuleCall_0()); 
            match(input,RULE_BETWEEN_HASHES,FOLLOW_2); 
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
    // InternalEgyDsl.g:7068:1: rule__DestructionMarker__TypeAssignment : ( RULE_BETWEEN_MINUS ) ;
    public final void rule__DestructionMarker__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7072:1: ( ( RULE_BETWEEN_MINUS ) )
            // InternalEgyDsl.g:7073:1: ( RULE_BETWEEN_MINUS )
            {
            // InternalEgyDsl.g:7073:1: ( RULE_BETWEEN_MINUS )
            // InternalEgyDsl.g:7074:1: RULE_BETWEEN_MINUS
            {
             before(grammarAccess.getDestructionMarkerAccess().getTypeBETWEEN_MINUSTerminalRuleCall_0()); 
            match(input,RULE_BETWEEN_MINUS,FOLLOW_2); 
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
    // InternalEgyDsl.g:7083:1: rule__Word__WCharAssignment_1 : ( ruleWordPart ) ;
    public final void rule__Word__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7087:1: ( ( ruleWordPart ) )
            // InternalEgyDsl.g:7088:1: ( ruleWordPart )
            {
            // InternalEgyDsl.g:7088:1: ( ruleWordPart )
            // InternalEgyDsl.g:7089:1: ruleWordPart
            {
             before(grammarAccess.getWordAccess().getWCharWordPartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__WordPart__WCharAssignment"
    // InternalEgyDsl.g:7098:1: rule__WordPart__WCharAssignment : ( ruleWordMiddle ) ;
    public final void rule__WordPart__WCharAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7102:1: ( ( ruleWordMiddle ) )
            // InternalEgyDsl.g:7103:1: ( ruleWordMiddle )
            {
            // InternalEgyDsl.g:7103:1: ( ruleWordMiddle )
            // InternalEgyDsl.g:7104:1: ruleWordMiddle
            {
             before(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWordMiddle();

            state._fsp--;

             after(grammarAccess.getWordPartAccess().getWCharWordMiddleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WordPart__WCharAssignment"


    // $ANTLR start "rule__Chars__NameAssignment"
    // InternalEgyDsl.g:7113:1: rule__Chars__NameAssignment : ( RULE_EGYSTRING ) ;
    public final void rule__Chars__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7117:1: ( ( RULE_EGYSTRING ) )
            // InternalEgyDsl.g:7118:1: ( RULE_EGYSTRING )
            {
            // InternalEgyDsl.g:7118:1: ( RULE_EGYSTRING )
            // InternalEgyDsl.g:7119:1: RULE_EGYSTRING
            {
             before(grammarAccess.getCharsAccess().getNameEGYSTRINGTerminalRuleCall_0()); 
            match(input,RULE_EGYSTRING,FOLLOW_2); 
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
    // InternalEgyDsl.g:7128:1: rule__Oval__WCharAssignment_1 : ( ruleNoCartouche ) ;
    public final void rule__Oval__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7132:1: ( ( ruleNoCartouche ) )
            // InternalEgyDsl.g:7133:1: ( ruleNoCartouche )
            {
            // InternalEgyDsl.g:7133:1: ( ruleNoCartouche )
            // InternalEgyDsl.g:7134:1: ruleNoCartouche
            {
             before(grammarAccess.getOvalAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7143:1: rule__Serech__WCharAssignment_1 : ( ruleNoCartouche ) ;
    public final void rule__Serech__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7147:1: ( ( ruleNoCartouche ) )
            // InternalEgyDsl.g:7148:1: ( ruleNoCartouche )
            {
            // InternalEgyDsl.g:7148:1: ( ruleNoCartouche )
            // InternalEgyDsl.g:7149:1: ruleNoCartouche
            {
             before(grammarAccess.getSerechAccess().getWCharNoCartoucheParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7158:1: rule__Cartouche__WCharAssignment_2 : ( ruleNoCartouche ) ;
    public final void rule__Cartouche__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7162:1: ( ( ruleNoCartouche ) )
            // InternalEgyDsl.g:7163:1: ( ruleNoCartouche )
            {
            // InternalEgyDsl.g:7163:1: ( ruleNoCartouche )
            // InternalEgyDsl.g:7164:1: ruleNoCartouche
            {
             before(grammarAccess.getCartoucheAccess().getWCharNoCartoucheParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7173:1: rule__Expanded__WCharAssignment_2 : ( ruleNoExpanded ) ;
    public final void rule__Expanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7177:1: ( ( ruleNoExpanded ) )
            // InternalEgyDsl.g:7178:1: ( ruleNoExpanded )
            {
            // InternalEgyDsl.g:7178:1: ( ruleNoExpanded )
            // InternalEgyDsl.g:7179:1: ruleNoExpanded
            {
             before(grammarAccess.getExpandedAccess().getWCharNoExpandedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__AncientExpanded__WCharAssignment_2"
    // InternalEgyDsl.g:7188:1: rule__AncientExpanded__WCharAssignment_2 : ( ruleNoAncientExpanded ) ;
    public final void rule__AncientExpanded__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7192:1: ( ( ruleNoAncientExpanded ) )
            // InternalEgyDsl.g:7193:1: ( ruleNoAncientExpanded )
            {
            // InternalEgyDsl.g:7193:1: ( ruleNoAncientExpanded )
            // InternalEgyDsl.g:7194:1: ruleNoAncientExpanded
            {
             before(grammarAccess.getAncientExpandedAccess().getWCharNoAncientExpandedParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Emendation__WCharAssignment_2"
    // InternalEgyDsl.g:7203:1: rule__Emendation__WCharAssignment_2 : ( ruleNoEmendation ) ;
    public final void rule__Emendation__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7207:1: ( ( ruleNoEmendation ) )
            // InternalEgyDsl.g:7208:1: ( ruleNoEmendation )
            {
            // InternalEgyDsl.g:7208:1: ( ruleNoEmendation )
            // InternalEgyDsl.g:7209:1: ruleNoEmendation
            {
             before(grammarAccess.getEmendationAccess().getWCharNoEmendationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7218:1: rule__DisputableReading__WCharAssignment_2 : ( ruleNoDisputableReading ) ;
    public final void rule__DisputableReading__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7222:1: ( ( ruleNoDisputableReading ) )
            // InternalEgyDsl.g:7223:1: ( ruleNoDisputableReading )
            {
            // InternalEgyDsl.g:7223:1: ( ruleNoDisputableReading )
            // InternalEgyDsl.g:7224:1: ruleNoDisputableReading
            {
             before(grammarAccess.getDisputableReadingAccess().getWCharNoDisputableReadingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7233:1: rule__Lacuna__WCharAssignment_2 : ( ruleNoLacuna ) ;
    public final void rule__Lacuna__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7237:1: ( ( ruleNoLacuna ) )
            // InternalEgyDsl.g:7238:1: ( ruleNoLacuna )
            {
            // InternalEgyDsl.g:7238:1: ( ruleNoLacuna )
            // InternalEgyDsl.g:7239:1: ruleNoLacuna
            {
             before(grammarAccess.getLacunaAccess().getWCharNoLacunaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7248:1: rule__Deletion__WCharAssignment_2 : ( ruleNoDeletion ) ;
    public final void rule__Deletion__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7252:1: ( ( ruleNoDeletion ) )
            // InternalEgyDsl.g:7253:1: ( ruleNoDeletion )
            {
            // InternalEgyDsl.g:7253:1: ( ruleNoDeletion )
            // InternalEgyDsl.g:7254:1: ruleNoDeletion
            {
             before(grammarAccess.getDeletionAccess().getWCharNoDeletionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7263:1: rule__ExpandedColumn__WCharAssignment_2 : ( ruleNoExpandedColumn ) ;
    public final void rule__ExpandedColumn__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7267:1: ( ( ruleNoExpandedColumn ) )
            // InternalEgyDsl.g:7268:1: ( ruleNoExpandedColumn )
            {
            // InternalEgyDsl.g:7268:1: ( ruleNoExpandedColumn )
            // InternalEgyDsl.g:7269:1: ruleNoExpandedColumn
            {
             before(grammarAccess.getExpandedColumnAccess().getWCharNoExpandedColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7278:1: rule__Rasur__WCharAssignment_2 : ( ruleNoRasur ) ;
    public final void rule__Rasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7282:1: ( ( ruleNoRasur ) )
            // InternalEgyDsl.g:7283:1: ( ruleNoRasur )
            {
            // InternalEgyDsl.g:7283:1: ( ruleNoRasur )
            // InternalEgyDsl.g:7284:1: ruleNoRasur
            {
             before(grammarAccess.getRasurAccess().getWCharNoRasurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__RestorationOverRasur__WCharAssignment_2"
    // InternalEgyDsl.g:7293:1: rule__RestorationOverRasur__WCharAssignment_2 : ( ruleNoRestorationOverRasur ) ;
    public final void rule__RestorationOverRasur__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7297:1: ( ( ruleNoRestorationOverRasur ) )
            // InternalEgyDsl.g:7298:1: ( ruleNoRestorationOverRasur )
            {
            // InternalEgyDsl.g:7298:1: ( ruleNoRestorationOverRasur )
            // InternalEgyDsl.g:7299:1: ruleNoRestorationOverRasur
            {
             before(grammarAccess.getRestorationOverRasurAccess().getWCharNoRestorationOverRasurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalEgyDsl.g:7308:1: rule__PartialDestruction__WCharAssignment_2 : ( ruleNoPartialDestruction ) ;
    public final void rule__PartialDestruction__WCharAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEgyDsl.g:7312:1: ( ( ruleNoPartialDestruction ) )
            // InternalEgyDsl.g:7313:1: ( ruleNoPartialDestruction )
            {
            // InternalEgyDsl.g:7313:1: ( ruleNoPartialDestruction )
            // InternalEgyDsl.g:7314:1: ruleNoPartialDestruction
            {
             before(grammarAccess.getPartialDestructionAccess().getWCharNoPartialDestructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000612L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0FFFFFAAAAAAADC0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0FFFFFAAAAAAA9D0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0FFFFFAAAAAAA1D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00007FAAAAAAA100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00007FAAAAAAA102L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0FFF800000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});

}