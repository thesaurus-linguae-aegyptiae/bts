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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'\\n'", "'>>'", "'<<'", "'['", "']'", "'BTSAmbivalence'", "'{'", "'}'", "'state'", "'revisionState'", "'visibility'", "'sortKey'", "'type'", "'subtype'", "'code'", "'_id'", "'comment'", "'parentId'", "'cases'", "','", "'BTSLemmaCase'", "'scenario'", "'-'"
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




    // $ANTLR start "entryRuleBTSTextContent"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:60:1: entryRuleBTSTextContent : ruleBTSTextContent EOF ;
    public final void entryRuleBTSTextContent() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:61:1: ( ruleBTSTextContent EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:62:1: ruleBTSTextContent EOF
            {
             before(grammarAccess.getBTSTextContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextContent_in_entryRuleBTSTextContent61);
            ruleBTSTextContent();

            state._fsp--;

             after(grammarAccess.getBTSTextContentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTextContent68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSTextContent"


    // $ANTLR start "ruleBTSTextContent"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:69:1: ruleBTSTextContent : ( ( rule__BTSTextContent__Group__0 ) ) ;
    public final void ruleBTSTextContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:73:2: ( ( ( rule__BTSTextContent__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:74:1: ( ( rule__BTSTextContent__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:74:1: ( ( rule__BTSTextContent__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:75:1: ( rule__BTSTextContent__Group__0 )
            {
             before(grammarAccess.getBTSTextContentAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:76:1: ( rule__BTSTextContent__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:76:2: rule__BTSTextContent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group__0_in_ruleBTSTextContent94);
            rule__BTSTextContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTSTextContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSTextContent"


    // $ANTLR start "entryRuleBTSSentenceItem"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:88:1: entryRuleBTSSentenceItem : ruleBTSSentenceItem EOF ;
    public final void entryRuleBTSSentenceItem() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:89:1: ( ruleBTSSentenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:90:1: ruleBTSSentenceItem EOF
            {
             before(grammarAccess.getBTSSentenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_entryRuleBTSSentenceItem121);
            ruleBTSSentenceItem();

            state._fsp--;

             after(grammarAccess.getBTSSentenceItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSSentenceItem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSSentenceItem"


    // $ANTLR start "ruleBTSSentenceItem"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:97:1: ruleBTSSentenceItem : ( ( rule__BTSSentenceItem__Alternatives ) ) ;
    public final void ruleBTSSentenceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:101:2: ( ( ( rule__BTSSentenceItem__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:102:1: ( ( rule__BTSSentenceItem__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:102:1: ( ( rule__BTSSentenceItem__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:103:1: ( rule__BTSSentenceItem__Alternatives )
            {
             before(grammarAccess.getBTSSentenceItemAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:104:1: ( rule__BTSSentenceItem__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:104:2: rule__BTSSentenceItem__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSentenceItem__Alternatives_in_ruleBTSSentenceItem154);
            rule__BTSSentenceItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBTSSentenceItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSSentenceItem"


    // $ANTLR start "entryRuleBTSAmbivalenceItem"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:116:1: entryRuleBTSAmbivalenceItem : ruleBTSAmbivalenceItem EOF ;
    public final void entryRuleBTSAmbivalenceItem() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:117:1: ( ruleBTSAmbivalenceItem EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:118:1: ruleBTSAmbivalenceItem EOF
            {
             before(grammarAccess.getBTSAmbivalenceItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_entryRuleBTSAmbivalenceItem181);
            ruleBTSAmbivalenceItem();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSAmbivalenceItem188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSAmbivalenceItem"


    // $ANTLR start "ruleBTSAmbivalenceItem"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:125:1: ruleBTSAmbivalenceItem : ( ( rule__BTSAmbivalenceItem__Alternatives ) ) ;
    public final void ruleBTSAmbivalenceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:129:2: ( ( ( rule__BTSAmbivalenceItem__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:130:1: ( ( rule__BTSAmbivalenceItem__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:130:1: ( ( rule__BTSAmbivalenceItem__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:131:1: ( rule__BTSAmbivalenceItem__Alternatives )
            {
             before(grammarAccess.getBTSAmbivalenceItemAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:132:1: ( rule__BTSAmbivalenceItem__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:132:2: rule__BTSAmbivalenceItem__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalenceItem__Alternatives_in_ruleBTSAmbivalenceItem214);
            rule__BTSAmbivalenceItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSAmbivalenceItem"


    // $ANTLR start "entryRuleBTSTextItems"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:144:1: entryRuleBTSTextItems : ruleBTSTextItems EOF ;
    public final void entryRuleBTSTextItems() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:145:1: ( ruleBTSTextItems EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:146:1: ruleBTSTextItems EOF
            {
             before(grammarAccess.getBTSTextItemsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_entryRuleBTSTextItems241);
            ruleBTSTextItems();

            state._fsp--;

             after(grammarAccess.getBTSTextItemsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSTextItems248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSTextItems"


    // $ANTLR start "ruleBTSTextItems"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:153:1: ruleBTSTextItems : ( ( rule__BTSTextItems__Alternatives ) ) ;
    public final void ruleBTSTextItems() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:157:2: ( ( ( rule__BTSTextItems__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:158:1: ( ( rule__BTSTextItems__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:158:1: ( ( rule__BTSTextItems__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:159:1: ( rule__BTSTextItems__Alternatives )
            {
             before(grammarAccess.getBTSTextItemsAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:160:1: ( rule__BTSTextItems__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:160:2: rule__BTSTextItems__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextItems__Alternatives_in_ruleBTSTextItems274);
            rule__BTSTextItems__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBTSTextItemsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSTextItems"


    // $ANTLR start "entryRuleEString"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:173:1: ( ruleEString EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:188:1: ( rule__EString__Alternatives )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBTSSenctence"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:200:1: entryRuleBTSSenctence : ruleBTSSenctence EOF ;
    public final void entryRuleBTSSenctence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:201:1: ( ruleBTSSenctence EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:202:1: ruleBTSSenctence EOF
            {
             before(grammarAccess.getBTSSenctenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSenctence_in_entryRuleBTSSenctence361);
            ruleBTSSenctence();

            state._fsp--;

             after(grammarAccess.getBTSSenctenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSSenctence368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSSenctence"


    // $ANTLR start "ruleBTSSenctence"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:209:1: ruleBTSSenctence : ( ( rule__BTSSenctence__Group__0 ) ) ;
    public final void ruleBTSSenctence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:213:2: ( ( ( rule__BTSSenctence__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:214:1: ( ( rule__BTSSenctence__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:214:1: ( ( rule__BTSSenctence__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:215:1: ( rule__BTSSenctence__Group__0 )
            {
             before(grammarAccess.getBTSSenctenceAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:216:1: ( rule__BTSSenctence__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:216:2: rule__BTSSenctence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__0_in_ruleBTSSenctence394);
            rule__BTSSenctence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTSSenctenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSSenctence"


    // $ANTLR start "entryRuleBTSWord"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:228:1: entryRuleBTSWord : ruleBTSWord EOF ;
    public final void entryRuleBTSWord() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:229:1: ( ruleBTSWord EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:230:1: ruleBTSWord EOF
            {
             before(grammarAccess.getBTSWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_entryRuleBTSWord421);
            ruleBTSWord();

            state._fsp--;

             after(grammarAccess.getBTSWordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSWord428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSWord"


    // $ANTLR start "ruleBTSWord"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:237:1: ruleBTSWord : ( ( rule__BTSWord__Group__0 ) ) ;
    public final void ruleBTSWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:241:2: ( ( ( rule__BTSWord__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:242:1: ( ( rule__BTSWord__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:242:1: ( ( rule__BTSWord__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:243:1: ( rule__BTSWord__Group__0 )
            {
             before(grammarAccess.getBTSWordAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:244:1: ( rule__BTSWord__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:244:2: rule__BTSWord__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSWord__Group__0_in_ruleBTSWord454);
            rule__BTSWord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTSWordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSWord"


    // $ANTLR start "entryRuleBTSMarker"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:256:1: entryRuleBTSMarker : ruleBTSMarker EOF ;
    public final void entryRuleBTSMarker() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:257:1: ( ruleBTSMarker EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:258:1: ruleBTSMarker EOF
            {
             before(grammarAccess.getBTSMarkerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_entryRuleBTSMarker481);
            ruleBTSMarker();

            state._fsp--;

             after(grammarAccess.getBTSMarkerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSMarker488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSMarker"


    // $ANTLR start "ruleBTSMarker"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:265:1: ruleBTSMarker : ( ( rule__BTSMarker__Group__0 ) ) ;
    public final void ruleBTSMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:269:2: ( ( ( rule__BTSMarker__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:270:1: ( ( rule__BTSMarker__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:270:1: ( ( rule__BTSMarker__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:271:1: ( rule__BTSMarker__Group__0 )
            {
             before(grammarAccess.getBTSMarkerAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:272:1: ( rule__BTSMarker__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:272:2: rule__BTSMarker__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__0_in_ruleBTSMarker514);
            rule__BTSMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTSMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSMarker"


    // $ANTLR start "entryRuleBTSAmbivalence"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:284:1: entryRuleBTSAmbivalence : ruleBTSAmbivalence EOF ;
    public final void entryRuleBTSAmbivalence() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:285:1: ( ruleBTSAmbivalence EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:286:1: ruleBTSAmbivalence EOF
            {
             before(grammarAccess.getBTSAmbivalenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_entryRuleBTSAmbivalence541);
            ruleBTSAmbivalence();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSAmbivalence548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSAmbivalence"


    // $ANTLR start "ruleBTSAmbivalence"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:293:1: ruleBTSAmbivalence : ( ( rule__BTSAmbivalence__Group__0 ) ) ;
    public final void ruleBTSAmbivalence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:297:2: ( ( ( rule__BTSAmbivalence__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:298:1: ( ( rule__BTSAmbivalence__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:298:1: ( ( rule__BTSAmbivalence__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:299:1: ( rule__BTSAmbivalence__Group__0 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:300:1: ( rule__BTSAmbivalence__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:300:2: rule__BTSAmbivalence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__0_in_ruleBTSAmbivalence574);
            rule__BTSAmbivalence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSAmbivalence"


    // $ANTLR start "entryRuleBTSLemmaCase"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:312:1: entryRuleBTSLemmaCase : ruleBTSLemmaCase EOF ;
    public final void entryRuleBTSLemmaCase() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:313:1: ( ruleBTSLemmaCase EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:314:1: ruleBTSLemmaCase EOF
            {
             before(grammarAccess.getBTSLemmaCaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_entryRuleBTSLemmaCase601);
            ruleBTSLemmaCase();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBTSLemmaCase608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBTSLemmaCase"


    // $ANTLR start "ruleBTSLemmaCase"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:321:1: ruleBTSLemmaCase : ( ( rule__BTSLemmaCase__Group__0 ) ) ;
    public final void ruleBTSLemmaCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:325:2: ( ( ( rule__BTSLemmaCase__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:326:1: ( ( rule__BTSLemmaCase__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:326:1: ( ( rule__BTSLemmaCase__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:327:1: ( rule__BTSLemmaCase__Group__0 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:328:1: ( rule__BTSLemmaCase__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:328:2: rule__BTSLemmaCase__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__0_in_ruleBTSLemmaCase634);
            rule__BTSLemmaCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBTSLemmaCase"


    // $ANTLR start "entryRuleEInt"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:340:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:341:1: ( ruleEInt EOF )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:342:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt661);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:349:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:353:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:354:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:354:1: ( ( rule__EInt__Group__0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:355:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:356:1: ( rule__EInt__Group__0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:356:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt694);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__BTSTextContent__Alternatives_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:372:1: rule__BTSTextContent__Alternatives_1_1 : ( ( ' ' ) | ( ( rule__BTSTextContent__Group_1_1_1__0 ) ) );
    public final void rule__BTSTextContent__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:376:1: ( ( ' ' ) | ( ( rule__BTSTextContent__Group_1_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:377:1: ( ' ' )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:377:1: ( ' ' )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:378:1: ' '
                    {
                     before(grammarAccess.getBTSTextContentAccess().getSpaceKeyword_1_1_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__BTSTextContent__Alternatives_1_1735); 
                     after(grammarAccess.getBTSTextContentAccess().getSpaceKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:385:6: ( ( rule__BTSTextContent__Group_1_1_1__0 ) )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:385:6: ( ( rule__BTSTextContent__Group_1_1_1__0 ) )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:386:1: ( rule__BTSTextContent__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getBTSTextContentAccess().getGroup_1_1_1()); 
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:387:1: ( rule__BTSTextContent__Group_1_1_1__0 )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:387:2: rule__BTSTextContent__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_1_1__0_in_rule__BTSTextContent__Alternatives_1_1754);
                    rule__BTSTextContent__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBTSTextContentAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__BTSTextContent__Alternatives_1_1"


    // $ANTLR start "rule__BTSSentenceItem__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:396:1: rule__BTSSentenceItem__Alternatives : ( ( ruleBTSWord ) | ( ruleBTSMarker ) | ( ruleBTSAmbivalence ) );
    public final void rule__BTSSentenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:400:1: ( ( ruleBTSWord ) | ( ruleBTSMarker ) | ( ruleBTSAmbivalence ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:401:1: ( ruleBTSWord )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:401:1: ( ruleBTSWord )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:402:1: ruleBTSWord
                    {
                     before(grammarAccess.getBTSSentenceItemAccess().getBTSWordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_rule__BTSSentenceItem__Alternatives787);
                    ruleBTSWord();

                    state._fsp--;

                     after(grammarAccess.getBTSSentenceItemAccess().getBTSWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:407:6: ( ruleBTSMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:407:6: ( ruleBTSMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:408:1: ruleBTSMarker
                    {
                     before(grammarAccess.getBTSSentenceItemAccess().getBTSMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_rule__BTSSentenceItem__Alternatives804);
                    ruleBTSMarker();

                    state._fsp--;

                     after(grammarAccess.getBTSSentenceItemAccess().getBTSMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:413:6: ( ruleBTSAmbivalence )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:413:6: ( ruleBTSAmbivalence )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:414:1: ruleBTSAmbivalence
                    {
                     before(grammarAccess.getBTSSentenceItemAccess().getBTSAmbivalenceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_rule__BTSSentenceItem__Alternatives821);
                    ruleBTSAmbivalence();

                    state._fsp--;

                     after(grammarAccess.getBTSSentenceItemAccess().getBTSAmbivalenceParserRuleCall_2()); 

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
    // $ANTLR end "rule__BTSSentenceItem__Alternatives"


    // $ANTLR start "rule__BTSAmbivalenceItem__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:424:1: rule__BTSAmbivalenceItem__Alternatives : ( ( ruleBTSWord ) | ( ruleBTSMarker ) );
    public final void rule__BTSAmbivalenceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:428:1: ( ( ruleBTSWord ) | ( ruleBTSMarker ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:429:1: ( ruleBTSWord )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:429:1: ( ruleBTSWord )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:430:1: ruleBTSWord
                    {
                     before(grammarAccess.getBTSAmbivalenceItemAccess().getBTSWordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSWord_in_rule__BTSAmbivalenceItem__Alternatives853);
                    ruleBTSWord();

                    state._fsp--;

                     after(grammarAccess.getBTSAmbivalenceItemAccess().getBTSWordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:435:6: ( ruleBTSMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:435:6: ( ruleBTSMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:436:1: ruleBTSMarker
                    {
                     before(grammarAccess.getBTSAmbivalenceItemAccess().getBTSMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_rule__BTSAmbivalenceItem__Alternatives870);
                    ruleBTSMarker();

                    state._fsp--;

                     after(grammarAccess.getBTSAmbivalenceItemAccess().getBTSMarkerParserRuleCall_1()); 

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
    // $ANTLR end "rule__BTSAmbivalenceItem__Alternatives"


    // $ANTLR start "rule__BTSTextItems__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:446:1: rule__BTSTextItems__Alternatives : ( ( ruleBTSSenctence ) | ( ruleBTSMarker ) | ( ruleBTSAmbivalence ) );
    public final void rule__BTSTextItems__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:450:1: ( ( ruleBTSSenctence ) | ( ruleBTSMarker ) | ( ruleBTSAmbivalence ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:451:1: ( ruleBTSSenctence )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:451:1: ( ruleBTSSenctence )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:452:1: ruleBTSSenctence
                    {
                     before(grammarAccess.getBTSTextItemsAccess().getBTSSenctenceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSSenctence_in_rule__BTSTextItems__Alternatives902);
                    ruleBTSSenctence();

                    state._fsp--;

                     after(grammarAccess.getBTSTextItemsAccess().getBTSSenctenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:457:6: ( ruleBTSMarker )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:457:6: ( ruleBTSMarker )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:458:1: ruleBTSMarker
                    {
                     before(grammarAccess.getBTSTextItemsAccess().getBTSMarkerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSMarker_in_rule__BTSTextItems__Alternatives919);
                    ruleBTSMarker();

                    state._fsp--;

                     after(grammarAccess.getBTSTextItemsAccess().getBTSMarkerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:463:6: ( ruleBTSAmbivalence )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:463:6: ( ruleBTSAmbivalence )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:464:1: ruleBTSAmbivalence
                    {
                     before(grammarAccess.getBTSTextItemsAccess().getBTSAmbivalenceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalence_in_rule__BTSTextItems__Alternatives936);
                    ruleBTSAmbivalence();

                    state._fsp--;

                     after(grammarAccess.getBTSTextItemsAccess().getBTSAmbivalenceParserRuleCall_2()); 

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
    // $ANTLR end "rule__BTSTextItems__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:474:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:478:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:479:1: ( RULE_STRING )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:479:1: ( RULE_STRING )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:480:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives968); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:485:6: ( RULE_ID )
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:485:6: ( RULE_ID )
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:486:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives985); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__BTSTextContent__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:499:1: rule__BTSTextContent__Group__0 : rule__BTSTextContent__Group__0__Impl rule__BTSTextContent__Group__1 ;
    public final void rule__BTSTextContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:503:1: ( rule__BTSTextContent__Group__0__Impl rule__BTSTextContent__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:504:2: rule__BTSTextContent__Group__0__Impl rule__BTSTextContent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group__0__Impl_in_rule__BTSTextContent__Group__01016);
            rule__BTSTextContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group__1_in_rule__BTSTextContent__Group__01019);
            rule__BTSTextContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group__0"


    // $ANTLR start "rule__BTSTextContent__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:511:1: rule__BTSTextContent__Group__0__Impl : ( () ) ;
    public final void rule__BTSTextContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:515:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:516:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:516:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:517:1: ()
            {
             before(grammarAccess.getBTSTextContentAccess().getBTSTextContentAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:518:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:520:1: 
            {
            }

             after(grammarAccess.getBTSTextContentAccess().getBTSTextContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group__0__Impl"


    // $ANTLR start "rule__BTSTextContent__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:530:1: rule__BTSTextContent__Group__1 : rule__BTSTextContent__Group__1__Impl ;
    public final void rule__BTSTextContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:534:1: ( rule__BTSTextContent__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:535:2: rule__BTSTextContent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group__1__Impl_in_rule__BTSTextContent__Group__11077);
            rule__BTSTextContent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group__1"


    // $ANTLR start "rule__BTSTextContent__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:541:1: rule__BTSTextContent__Group__1__Impl : ( ( rule__BTSTextContent__Group_1__0 )* ) ;
    public final void rule__BTSTextContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:545:1: ( ( ( rule__BTSTextContent__Group_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:546:1: ( ( rule__BTSTextContent__Group_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:546:1: ( ( rule__BTSTextContent__Group_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:547:1: ( rule__BTSTextContent__Group_1__0 )*
            {
             before(grammarAccess.getBTSTextContentAccess().getGroup_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:548:1: ( rule__BTSTextContent__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||LA6_0==15||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:548:2: rule__BTSTextContent__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1__0_in_rule__BTSTextContent__Group__1__Impl1104);
            	    rule__BTSTextContent__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBTSTextContentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group__1__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:562:1: rule__BTSTextContent__Group_1__0 : rule__BTSTextContent__Group_1__0__Impl rule__BTSTextContent__Group_1__1 ;
    public final void rule__BTSTextContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:566:1: ( rule__BTSTextContent__Group_1__0__Impl rule__BTSTextContent__Group_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:567:2: rule__BTSTextContent__Group_1__0__Impl rule__BTSTextContent__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1__0__Impl_in_rule__BTSTextContent__Group_1__01139);
            rule__BTSTextContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1__1_in_rule__BTSTextContent__Group_1__01142);
            rule__BTSTextContent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1__0"


    // $ANTLR start "rule__BTSTextContent__Group_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:574:1: rule__BTSTextContent__Group_1__0__Impl : ( ( rule__BTSTextContent__TextItemsAssignment_1_0 ) ) ;
    public final void rule__BTSTextContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:578:1: ( ( ( rule__BTSTextContent__TextItemsAssignment_1_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:579:1: ( ( rule__BTSTextContent__TextItemsAssignment_1_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:579:1: ( ( rule__BTSTextContent__TextItemsAssignment_1_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:580:1: ( rule__BTSTextContent__TextItemsAssignment_1_0 )
            {
             before(grammarAccess.getBTSTextContentAccess().getTextItemsAssignment_1_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:581:1: ( rule__BTSTextContent__TextItemsAssignment_1_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:581:2: rule__BTSTextContent__TextItemsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__TextItemsAssignment_1_0_in_rule__BTSTextContent__Group_1__0__Impl1169);
            rule__BTSTextContent__TextItemsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBTSTextContentAccess().getTextItemsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1__0__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:591:1: rule__BTSTextContent__Group_1__1 : rule__BTSTextContent__Group_1__1__Impl rule__BTSTextContent__Group_1__2 ;
    public final void rule__BTSTextContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:595:1: ( rule__BTSTextContent__Group_1__1__Impl rule__BTSTextContent__Group_1__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:596:2: rule__BTSTextContent__Group_1__1__Impl rule__BTSTextContent__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1__1__Impl_in_rule__BTSTextContent__Group_1__11199);
            rule__BTSTextContent__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1__2_in_rule__BTSTextContent__Group_1__11202);
            rule__BTSTextContent__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1__1"


    // $ANTLR start "rule__BTSTextContent__Group_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:603:1: rule__BTSTextContent__Group_1__1__Impl : ( ( rule__BTSTextContent__Alternatives_1_1 )* ) ;
    public final void rule__BTSTextContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:607:1: ( ( ( rule__BTSTextContent__Alternatives_1_1 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:608:1: ( ( rule__BTSTextContent__Alternatives_1_1 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:608:1: ( ( rule__BTSTextContent__Alternatives_1_1 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:609:1: ( rule__BTSTextContent__Alternatives_1_1 )*
            {
             before(grammarAccess.getBTSTextContentAccess().getAlternatives_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:610:1: ( rule__BTSTextContent__Alternatives_1_1 )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:610:2: rule__BTSTextContent__Alternatives_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Alternatives_1_1_in_rule__BTSTextContent__Group_1__1__Impl1229);
            	    rule__BTSTextContent__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBTSTextContentAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1__1__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:620:1: rule__BTSTextContent__Group_1__2 : rule__BTSTextContent__Group_1__2__Impl ;
    public final void rule__BTSTextContent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:624:1: ( rule__BTSTextContent__Group_1__2__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:625:2: rule__BTSTextContent__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1__2__Impl_in_rule__BTSTextContent__Group_1__21260);
            rule__BTSTextContent__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1__2"


    // $ANTLR start "rule__BTSTextContent__Group_1__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:631:1: rule__BTSTextContent__Group_1__2__Impl : ( ( rule__BTSTextContent__Group_1_2__0 )* ) ;
    public final void rule__BTSTextContent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:635:1: ( ( ( rule__BTSTextContent__Group_1_2__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:636:1: ( ( rule__BTSTextContent__Group_1_2__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:636:1: ( ( rule__BTSTextContent__Group_1_2__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:637:1: ( rule__BTSTextContent__Group_1_2__0 )*
            {
             before(grammarAccess.getBTSTextContentAccess().getGroup_1_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:638:1: ( rule__BTSTextContent__Group_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:638:2: rule__BTSTextContent__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_2__0_in_rule__BTSTextContent__Group_1__2__Impl1287);
            	    rule__BTSTextContent__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBTSTextContentAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1__2__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1_1_1__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:654:1: rule__BTSTextContent__Group_1_1_1__0 : rule__BTSTextContent__Group_1_1_1__0__Impl rule__BTSTextContent__Group_1_1_1__1 ;
    public final void rule__BTSTextContent__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:658:1: ( rule__BTSTextContent__Group_1_1_1__0__Impl rule__BTSTextContent__Group_1_1_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:659:2: rule__BTSTextContent__Group_1_1_1__0__Impl rule__BTSTextContent__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_1_1__0__Impl_in_rule__BTSTextContent__Group_1_1_1__01324);
            rule__BTSTextContent__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_1_1__1_in_rule__BTSTextContent__Group_1_1_1__01327);
            rule__BTSTextContent__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_1_1__0"


    // $ANTLR start "rule__BTSTextContent__Group_1_1_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:666:1: rule__BTSTextContent__Group_1_1_1__0__Impl : ( '\\n' ) ;
    public final void rule__BTSTextContent__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:670:1: ( ( '\\n' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:671:1: ( '\\n' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:671:1: ( '\\n' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:672:1: '\\n'
            {
             before(grammarAccess.getBTSTextContentAccess().getControl000aKeyword_1_1_1_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BTSTextContent__Group_1_1_1__0__Impl1355); 
             after(grammarAccess.getBTSTextContentAccess().getControl000aKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1_1_1__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:685:1: rule__BTSTextContent__Group_1_1_1__1 : rule__BTSTextContent__Group_1_1_1__1__Impl ;
    public final void rule__BTSTextContent__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:689:1: ( rule__BTSTextContent__Group_1_1_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:690:2: rule__BTSTextContent__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_1_1__1__Impl_in_rule__BTSTextContent__Group_1_1_1__11386);
            rule__BTSTextContent__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_1_1__1"


    // $ANTLR start "rule__BTSTextContent__Group_1_1_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:696:1: rule__BTSTextContent__Group_1_1_1__1__Impl : ( ( rule__BTSTextContent__TextItemsAssignment_1_1_1_1 ) ) ;
    public final void rule__BTSTextContent__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:700:1: ( ( ( rule__BTSTextContent__TextItemsAssignment_1_1_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:701:1: ( ( rule__BTSTextContent__TextItemsAssignment_1_1_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:701:1: ( ( rule__BTSTextContent__TextItemsAssignment_1_1_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:702:1: ( rule__BTSTextContent__TextItemsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getBTSTextContentAccess().getTextItemsAssignment_1_1_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:703:1: ( rule__BTSTextContent__TextItemsAssignment_1_1_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:703:2: rule__BTSTextContent__TextItemsAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__TextItemsAssignment_1_1_1_1_in_rule__BTSTextContent__Group_1_1_1__1__Impl1413);
            rule__BTSTextContent__TextItemsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSTextContentAccess().getTextItemsAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1_2__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:717:1: rule__BTSTextContent__Group_1_2__0 : rule__BTSTextContent__Group_1_2__0__Impl rule__BTSTextContent__Group_1_2__1 ;
    public final void rule__BTSTextContent__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:721:1: ( rule__BTSTextContent__Group_1_2__0__Impl rule__BTSTextContent__Group_1_2__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:722:2: rule__BTSTextContent__Group_1_2__0__Impl rule__BTSTextContent__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_2__0__Impl_in_rule__BTSTextContent__Group_1_2__01447);
            rule__BTSTextContent__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_2__1_in_rule__BTSTextContent__Group_1_2__01450);
            rule__BTSTextContent__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_2__0"


    // $ANTLR start "rule__BTSTextContent__Group_1_2__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:729:1: rule__BTSTextContent__Group_1_2__0__Impl : ( '\\n' ) ;
    public final void rule__BTSTextContent__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:733:1: ( ( '\\n' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:734:1: ( '\\n' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:734:1: ( '\\n' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:735:1: '\\n'
            {
             before(grammarAccess.getBTSTextContentAccess().getControl000aKeyword_1_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BTSTextContent__Group_1_2__0__Impl1478); 
             after(grammarAccess.getBTSTextContentAccess().getControl000aKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_2__0__Impl"


    // $ANTLR start "rule__BTSTextContent__Group_1_2__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:748:1: rule__BTSTextContent__Group_1_2__1 : rule__BTSTextContent__Group_1_2__1__Impl ;
    public final void rule__BTSTextContent__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:752:1: ( rule__BTSTextContent__Group_1_2__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:753:2: rule__BTSTextContent__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__Group_1_2__1__Impl_in_rule__BTSTextContent__Group_1_2__11509);
            rule__BTSTextContent__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_2__1"


    // $ANTLR start "rule__BTSTextContent__Group_1_2__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:759:1: rule__BTSTextContent__Group_1_2__1__Impl : ( ( rule__BTSTextContent__TextItemsAssignment_1_2_1 ) ) ;
    public final void rule__BTSTextContent__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:763:1: ( ( ( rule__BTSTextContent__TextItemsAssignment_1_2_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:764:1: ( ( rule__BTSTextContent__TextItemsAssignment_1_2_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:764:1: ( ( rule__BTSTextContent__TextItemsAssignment_1_2_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:765:1: ( rule__BTSTextContent__TextItemsAssignment_1_2_1 )
            {
             before(grammarAccess.getBTSTextContentAccess().getTextItemsAssignment_1_2_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:766:1: ( rule__BTSTextContent__TextItemsAssignment_1_2_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:766:2: rule__BTSTextContent__TextItemsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSTextContent__TextItemsAssignment_1_2_1_in_rule__BTSTextContent__Group_1_2__1__Impl1536);
            rule__BTSTextContent__TextItemsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSTextContentAccess().getTextItemsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__Group_1_2__1__Impl"


    // $ANTLR start "rule__BTSSenctence__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:780:1: rule__BTSSenctence__Group__0 : rule__BTSSenctence__Group__0__Impl rule__BTSSenctence__Group__1 ;
    public final void rule__BTSSenctence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:784:1: ( rule__BTSSenctence__Group__0__Impl rule__BTSSenctence__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:785:2: rule__BTSSenctence__Group__0__Impl rule__BTSSenctence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__0__Impl_in_rule__BTSSenctence__Group__01570);
            rule__BTSSenctence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__1_in_rule__BTSSenctence__Group__01573);
            rule__BTSSenctence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__0"


    // $ANTLR start "rule__BTSSenctence__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:792:1: rule__BTSSenctence__Group__0__Impl : ( () ) ;
    public final void rule__BTSSenctence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:796:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:797:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:797:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:798:1: ()
            {
             before(grammarAccess.getBTSSenctenceAccess().getBTSSenctenceAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:799:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:801:1: 
            {
            }

             after(grammarAccess.getBTSSenctenceAccess().getBTSSenctenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__0__Impl"


    // $ANTLR start "rule__BTSSenctence__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:811:1: rule__BTSSenctence__Group__1 : rule__BTSSenctence__Group__1__Impl rule__BTSSenctence__Group__2 ;
    public final void rule__BTSSenctence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:815:1: ( rule__BTSSenctence__Group__1__Impl rule__BTSSenctence__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:816:2: rule__BTSSenctence__Group__1__Impl rule__BTSSenctence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__1__Impl_in_rule__BTSSenctence__Group__11631);
            rule__BTSSenctence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__2_in_rule__BTSSenctence__Group__11634);
            rule__BTSSenctence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__1"


    // $ANTLR start "rule__BTSSenctence__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:823:1: rule__BTSSenctence__Group__1__Impl : ( '>>' ) ;
    public final void rule__BTSSenctence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:827:1: ( ( '>>' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:828:1: ( '>>' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:828:1: ( '>>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:829:1: '>>'
            {
             before(grammarAccess.getBTSSenctenceAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BTSSenctence__Group__1__Impl1662); 
             after(grammarAccess.getBTSSenctenceAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__1__Impl"


    // $ANTLR start "rule__BTSSenctence__Group__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:842:1: rule__BTSSenctence__Group__2 : rule__BTSSenctence__Group__2__Impl rule__BTSSenctence__Group__3 ;
    public final void rule__BTSSenctence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:846:1: ( rule__BTSSenctence__Group__2__Impl rule__BTSSenctence__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:847:2: rule__BTSSenctence__Group__2__Impl rule__BTSSenctence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__2__Impl_in_rule__BTSSenctence__Group__21693);
            rule__BTSSenctence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__3_in_rule__BTSSenctence__Group__21696);
            rule__BTSSenctence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__2"


    // $ANTLR start "rule__BTSSenctence__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:854:1: rule__BTSSenctence__Group__2__Impl : ( ( rule__BTSSenctence__Group_2__0 )? ) ;
    public final void rule__BTSSenctence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:858:1: ( ( ( rule__BTSSenctence__Group_2__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:859:1: ( ( rule__BTSSenctence__Group_2__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:859:1: ( ( rule__BTSSenctence__Group_2__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:860:1: ( rule__BTSSenctence__Group_2__0 )?
            {
             before(grammarAccess.getBTSSenctenceAccess().getGroup_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:861:1: ( rule__BTSSenctence__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==15||LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:861:2: rule__BTSSenctence__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2__0_in_rule__BTSSenctence__Group__2__Impl1723);
                    rule__BTSSenctence__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSSenctenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__2__Impl"


    // $ANTLR start "rule__BTSSenctence__Group__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:871:1: rule__BTSSenctence__Group__3 : rule__BTSSenctence__Group__3__Impl ;
    public final void rule__BTSSenctence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:875:1: ( rule__BTSSenctence__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:876:2: rule__BTSSenctence__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group__3__Impl_in_rule__BTSSenctence__Group__31754);
            rule__BTSSenctence__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__3"


    // $ANTLR start "rule__BTSSenctence__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:882:1: rule__BTSSenctence__Group__3__Impl : ( '<<' ) ;
    public final void rule__BTSSenctence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:886:1: ( ( '<<' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:887:1: ( '<<' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:887:1: ( '<<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:888:1: '<<'
            {
             before(grammarAccess.getBTSSenctenceAccess().getLessThanSignLessThanSignKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__BTSSenctence__Group__3__Impl1782); 
             after(grammarAccess.getBTSSenctenceAccess().getLessThanSignLessThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group__3__Impl"


    // $ANTLR start "rule__BTSSenctence__Group_2__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:909:1: rule__BTSSenctence__Group_2__0 : rule__BTSSenctence__Group_2__0__Impl rule__BTSSenctence__Group_2__1 ;
    public final void rule__BTSSenctence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:913:1: ( rule__BTSSenctence__Group_2__0__Impl rule__BTSSenctence__Group_2__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:914:2: rule__BTSSenctence__Group_2__0__Impl rule__BTSSenctence__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2__0__Impl_in_rule__BTSSenctence__Group_2__01821);
            rule__BTSSenctence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2__1_in_rule__BTSSenctence__Group_2__01824);
            rule__BTSSenctence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2__0"


    // $ANTLR start "rule__BTSSenctence__Group_2__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:921:1: rule__BTSSenctence__Group_2__0__Impl : ( ( rule__BTSSenctence__SentenceItemsAssignment_2_0 ) ) ;
    public final void rule__BTSSenctence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:925:1: ( ( ( rule__BTSSenctence__SentenceItemsAssignment_2_0 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:926:1: ( ( rule__BTSSenctence__SentenceItemsAssignment_2_0 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:926:1: ( ( rule__BTSSenctence__SentenceItemsAssignment_2_0 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:927:1: ( rule__BTSSenctence__SentenceItemsAssignment_2_0 )
            {
             before(grammarAccess.getBTSSenctenceAccess().getSentenceItemsAssignment_2_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:928:1: ( rule__BTSSenctence__SentenceItemsAssignment_2_0 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:928:2: rule__BTSSenctence__SentenceItemsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__SentenceItemsAssignment_2_0_in_rule__BTSSenctence__Group_2__0__Impl1851);
            rule__BTSSenctence__SentenceItemsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBTSSenctenceAccess().getSentenceItemsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2__0__Impl"


    // $ANTLR start "rule__BTSSenctence__Group_2__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:938:1: rule__BTSSenctence__Group_2__1 : rule__BTSSenctence__Group_2__1__Impl ;
    public final void rule__BTSSenctence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:942:1: ( rule__BTSSenctence__Group_2__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:943:2: rule__BTSSenctence__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2__1__Impl_in_rule__BTSSenctence__Group_2__11881);
            rule__BTSSenctence__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2__1"


    // $ANTLR start "rule__BTSSenctence__Group_2__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:949:1: rule__BTSSenctence__Group_2__1__Impl : ( ( rule__BTSSenctence__Group_2_1__0 )* ) ;
    public final void rule__BTSSenctence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:953:1: ( ( ( rule__BTSSenctence__Group_2_1__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:954:1: ( ( rule__BTSSenctence__Group_2_1__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:954:1: ( ( rule__BTSSenctence__Group_2_1__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:955:1: ( rule__BTSSenctence__Group_2_1__0 )*
            {
             before(grammarAccess.getBTSSenctenceAccess().getGroup_2_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:956:1: ( rule__BTSSenctence__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:956:2: rule__BTSSenctence__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2_1__0_in_rule__BTSSenctence__Group_2__1__Impl1908);
            	    rule__BTSSenctence__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBTSSenctenceAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2__1__Impl"


    // $ANTLR start "rule__BTSSenctence__Group_2_1__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:970:1: rule__BTSSenctence__Group_2_1__0 : rule__BTSSenctence__Group_2_1__0__Impl rule__BTSSenctence__Group_2_1__1 ;
    public final void rule__BTSSenctence__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:974:1: ( rule__BTSSenctence__Group_2_1__0__Impl rule__BTSSenctence__Group_2_1__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:975:2: rule__BTSSenctence__Group_2_1__0__Impl rule__BTSSenctence__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2_1__0__Impl_in_rule__BTSSenctence__Group_2_1__01943);
            rule__BTSSenctence__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2_1__1_in_rule__BTSSenctence__Group_2_1__01946);
            rule__BTSSenctence__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2_1__0"


    // $ANTLR start "rule__BTSSenctence__Group_2_1__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:982:1: rule__BTSSenctence__Group_2_1__0__Impl : ( ' ' ) ;
    public final void rule__BTSSenctence__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:986:1: ( ( ' ' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:987:1: ( ' ' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:987:1: ( ' ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:988:1: ' '
            {
             before(grammarAccess.getBTSSenctenceAccess().getSpaceKeyword_2_1_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__BTSSenctence__Group_2_1__0__Impl1974); 
             after(grammarAccess.getBTSSenctenceAccess().getSpaceKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2_1__0__Impl"


    // $ANTLR start "rule__BTSSenctence__Group_2_1__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1001:1: rule__BTSSenctence__Group_2_1__1 : rule__BTSSenctence__Group_2_1__1__Impl ;
    public final void rule__BTSSenctence__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1005:1: ( rule__BTSSenctence__Group_2_1__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1006:2: rule__BTSSenctence__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__Group_2_1__1__Impl_in_rule__BTSSenctence__Group_2_1__12005);
            rule__BTSSenctence__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2_1__1"


    // $ANTLR start "rule__BTSSenctence__Group_2_1__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1012:1: rule__BTSSenctence__Group_2_1__1__Impl : ( ( rule__BTSSenctence__SentenceItemsAssignment_2_1_1 ) ) ;
    public final void rule__BTSSenctence__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1016:1: ( ( ( rule__BTSSenctence__SentenceItemsAssignment_2_1_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1017:1: ( ( rule__BTSSenctence__SentenceItemsAssignment_2_1_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1017:1: ( ( rule__BTSSenctence__SentenceItemsAssignment_2_1_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1018:1: ( rule__BTSSenctence__SentenceItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getBTSSenctenceAccess().getSentenceItemsAssignment_2_1_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1019:1: ( rule__BTSSenctence__SentenceItemsAssignment_2_1_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1019:2: rule__BTSSenctence__SentenceItemsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSSenctence__SentenceItemsAssignment_2_1_1_in_rule__BTSSenctence__Group_2_1__1__Impl2032);
            rule__BTSSenctence__SentenceItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSSenctenceAccess().getSentenceItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__Group_2_1__1__Impl"


    // $ANTLR start "rule__BTSWord__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1033:1: rule__BTSWord__Group__0 : rule__BTSWord__Group__0__Impl rule__BTSWord__Group__1 ;
    public final void rule__BTSWord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1037:1: ( rule__BTSWord__Group__0__Impl rule__BTSWord__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1038:2: rule__BTSWord__Group__0__Impl rule__BTSWord__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSWord__Group__0__Impl_in_rule__BTSWord__Group__02066);
            rule__BTSWord__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSWord__Group__1_in_rule__BTSWord__Group__02069);
            rule__BTSWord__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSWord__Group__0"


    // $ANTLR start "rule__BTSWord__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1045:1: rule__BTSWord__Group__0__Impl : ( () ) ;
    public final void rule__BTSWord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1049:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1050:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1050:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1051:1: ()
            {
             before(grammarAccess.getBTSWordAccess().getBTSWordAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1052:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1054:1: 
            {
            }

             after(grammarAccess.getBTSWordAccess().getBTSWordAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSWord__Group__0__Impl"


    // $ANTLR start "rule__BTSWord__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1064:1: rule__BTSWord__Group__1 : rule__BTSWord__Group__1__Impl ;
    public final void rule__BTSWord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1068:1: ( rule__BTSWord__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1069:2: rule__BTSWord__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSWord__Group__1__Impl_in_rule__BTSWord__Group__12127);
            rule__BTSWord__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSWord__Group__1"


    // $ANTLR start "rule__BTSWord__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1075:1: rule__BTSWord__Group__1__Impl : ( ( rule__BTSWord__WCharAssignment_1 ) ) ;
    public final void rule__BTSWord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1079:1: ( ( ( rule__BTSWord__WCharAssignment_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1080:1: ( ( rule__BTSWord__WCharAssignment_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1080:1: ( ( rule__BTSWord__WCharAssignment_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1081:1: ( rule__BTSWord__WCharAssignment_1 )
            {
             before(grammarAccess.getBTSWordAccess().getWCharAssignment_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1082:1: ( rule__BTSWord__WCharAssignment_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1082:2: rule__BTSWord__WCharAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSWord__WCharAssignment_1_in_rule__BTSWord__Group__1__Impl2154);
            rule__BTSWord__WCharAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSWordAccess().getWCharAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSWord__Group__1__Impl"


    // $ANTLR start "rule__BTSMarker__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1096:1: rule__BTSMarker__Group__0 : rule__BTSMarker__Group__0__Impl rule__BTSMarker__Group__1 ;
    public final void rule__BTSMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1100:1: ( rule__BTSMarker__Group__0__Impl rule__BTSMarker__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1101:2: rule__BTSMarker__Group__0__Impl rule__BTSMarker__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__0__Impl_in_rule__BTSMarker__Group__02188);
            rule__BTSMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__1_in_rule__BTSMarker__Group__02191);
            rule__BTSMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__0"


    // $ANTLR start "rule__BTSMarker__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1108:1: rule__BTSMarker__Group__0__Impl : ( () ) ;
    public final void rule__BTSMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1112:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1113:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1113:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1114:1: ()
            {
             before(grammarAccess.getBTSMarkerAccess().getBTSMarkerAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1115:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1117:1: 
            {
            }

             after(grammarAccess.getBTSMarkerAccess().getBTSMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__0__Impl"


    // $ANTLR start "rule__BTSMarker__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1127:1: rule__BTSMarker__Group__1 : rule__BTSMarker__Group__1__Impl rule__BTSMarker__Group__2 ;
    public final void rule__BTSMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1131:1: ( rule__BTSMarker__Group__1__Impl rule__BTSMarker__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1132:2: rule__BTSMarker__Group__1__Impl rule__BTSMarker__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__1__Impl_in_rule__BTSMarker__Group__12249);
            rule__BTSMarker__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__2_in_rule__BTSMarker__Group__12252);
            rule__BTSMarker__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__1"


    // $ANTLR start "rule__BTSMarker__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1139:1: rule__BTSMarker__Group__1__Impl : ( '[' ) ;
    public final void rule__BTSMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1143:1: ( ( '[' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1144:1: ( '[' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1144:1: ( '[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1145:1: '['
            {
             before(grammarAccess.getBTSMarkerAccess().getLeftSquareBracketKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BTSMarker__Group__1__Impl2280); 
             after(grammarAccess.getBTSMarkerAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__1__Impl"


    // $ANTLR start "rule__BTSMarker__Group__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1158:1: rule__BTSMarker__Group__2 : rule__BTSMarker__Group__2__Impl rule__BTSMarker__Group__3 ;
    public final void rule__BTSMarker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1162:1: ( rule__BTSMarker__Group__2__Impl rule__BTSMarker__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1163:2: rule__BTSMarker__Group__2__Impl rule__BTSMarker__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__2__Impl_in_rule__BTSMarker__Group__22311);
            rule__BTSMarker__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__3_in_rule__BTSMarker__Group__22314);
            rule__BTSMarker__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__2"


    // $ANTLR start "rule__BTSMarker__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1170:1: rule__BTSMarker__Group__2__Impl : ( ( rule__BTSMarker__ValueAssignment_2 )? ) ;
    public final void rule__BTSMarker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1174:1: ( ( ( rule__BTSMarker__ValueAssignment_2 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1175:1: ( ( rule__BTSMarker__ValueAssignment_2 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1175:1: ( ( rule__BTSMarker__ValueAssignment_2 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1176:1: ( rule__BTSMarker__ValueAssignment_2 )?
            {
             before(grammarAccess.getBTSMarkerAccess().getValueAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1177:1: ( rule__BTSMarker__ValueAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1177:2: rule__BTSMarker__ValueAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__ValueAssignment_2_in_rule__BTSMarker__Group__2__Impl2341);
                    rule__BTSMarker__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSMarkerAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__2__Impl"


    // $ANTLR start "rule__BTSMarker__Group__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1187:1: rule__BTSMarker__Group__3 : rule__BTSMarker__Group__3__Impl ;
    public final void rule__BTSMarker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1191:1: ( rule__BTSMarker__Group__3__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1192:2: rule__BTSMarker__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSMarker__Group__3__Impl_in_rule__BTSMarker__Group__32372);
            rule__BTSMarker__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__3"


    // $ANTLR start "rule__BTSMarker__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1198:1: rule__BTSMarker__Group__3__Impl : ( ']' ) ;
    public final void rule__BTSMarker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1202:1: ( ( ']' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1203:1: ( ']' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1203:1: ( ']' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1204:1: ']'
            {
             before(grammarAccess.getBTSMarkerAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__BTSMarker__Group__3__Impl2400); 
             after(grammarAccess.getBTSMarkerAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__Group__3__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1225:1: rule__BTSAmbivalence__Group__0 : rule__BTSAmbivalence__Group__0__Impl rule__BTSAmbivalence__Group__1 ;
    public final void rule__BTSAmbivalence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1229:1: ( rule__BTSAmbivalence__Group__0__Impl rule__BTSAmbivalence__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1230:2: rule__BTSAmbivalence__Group__0__Impl rule__BTSAmbivalence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__0__Impl_in_rule__BTSAmbivalence__Group__02439);
            rule__BTSAmbivalence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__1_in_rule__BTSAmbivalence__Group__02442);
            rule__BTSAmbivalence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__0"


    // $ANTLR start "rule__BTSAmbivalence__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1237:1: rule__BTSAmbivalence__Group__0__Impl : ( () ) ;
    public final void rule__BTSAmbivalence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1241:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1242:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1242:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1243:1: ()
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1244:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1246:1: 
            {
            }

             after(grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1256:1: rule__BTSAmbivalence__Group__1 : rule__BTSAmbivalence__Group__1__Impl rule__BTSAmbivalence__Group__2 ;
    public final void rule__BTSAmbivalence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1260:1: ( rule__BTSAmbivalence__Group__1__Impl rule__BTSAmbivalence__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1261:2: rule__BTSAmbivalence__Group__1__Impl rule__BTSAmbivalence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__1__Impl_in_rule__BTSAmbivalence__Group__12500);
            rule__BTSAmbivalence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__2_in_rule__BTSAmbivalence__Group__12503);
            rule__BTSAmbivalence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__1"


    // $ANTLR start "rule__BTSAmbivalence__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1268:1: rule__BTSAmbivalence__Group__1__Impl : ( 'BTSAmbivalence' ) ;
    public final void rule__BTSAmbivalence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1272:1: ( ( 'BTSAmbivalence' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1273:1: ( 'BTSAmbivalence' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1273:1: ( 'BTSAmbivalence' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1274:1: 'BTSAmbivalence'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__BTSAmbivalence__Group__1__Impl2531); 
             after(grammarAccess.getBTSAmbivalenceAccess().getBTSAmbivalenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1287:1: rule__BTSAmbivalence__Group__2 : rule__BTSAmbivalence__Group__2__Impl rule__BTSAmbivalence__Group__3 ;
    public final void rule__BTSAmbivalence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1291:1: ( rule__BTSAmbivalence__Group__2__Impl rule__BTSAmbivalence__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1292:2: rule__BTSAmbivalence__Group__2__Impl rule__BTSAmbivalence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__2__Impl_in_rule__BTSAmbivalence__Group__22562);
            rule__BTSAmbivalence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__3_in_rule__BTSAmbivalence__Group__22565);
            rule__BTSAmbivalence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__2"


    // $ANTLR start "rule__BTSAmbivalence__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1299:1: rule__BTSAmbivalence__Group__2__Impl : ( '{' ) ;
    public final void rule__BTSAmbivalence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1303:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1304:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1304:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1305:1: '{'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BTSAmbivalence__Group__2__Impl2593); 
             after(grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__2__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1318:1: rule__BTSAmbivalence__Group__3 : rule__BTSAmbivalence__Group__3__Impl rule__BTSAmbivalence__Group__4 ;
    public final void rule__BTSAmbivalence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1322:1: ( rule__BTSAmbivalence__Group__3__Impl rule__BTSAmbivalence__Group__4 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1323:2: rule__BTSAmbivalence__Group__3__Impl rule__BTSAmbivalence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__3__Impl_in_rule__BTSAmbivalence__Group__32624);
            rule__BTSAmbivalence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__4_in_rule__BTSAmbivalence__Group__32627);
            rule__BTSAmbivalence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__3"


    // $ANTLR start "rule__BTSAmbivalence__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1330:1: rule__BTSAmbivalence__Group__3__Impl : ( ( rule__BTSAmbivalence__Group_3__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1334:1: ( ( ( rule__BTSAmbivalence__Group_3__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1335:1: ( ( rule__BTSAmbivalence__Group_3__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1335:1: ( ( rule__BTSAmbivalence__Group_3__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1336:1: ( rule__BTSAmbivalence__Group_3__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_3()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1337:1: ( rule__BTSAmbivalence__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1337:2: rule__BTSAmbivalence__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_3__0_in_rule__BTSAmbivalence__Group__3__Impl2654);
                    rule__BTSAmbivalence__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__3__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__4"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1347:1: rule__BTSAmbivalence__Group__4 : rule__BTSAmbivalence__Group__4__Impl rule__BTSAmbivalence__Group__5 ;
    public final void rule__BTSAmbivalence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1351:1: ( rule__BTSAmbivalence__Group__4__Impl rule__BTSAmbivalence__Group__5 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1352:2: rule__BTSAmbivalence__Group__4__Impl rule__BTSAmbivalence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__4__Impl_in_rule__BTSAmbivalence__Group__42685);
            rule__BTSAmbivalence__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__5_in_rule__BTSAmbivalence__Group__42688);
            rule__BTSAmbivalence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__4"


    // $ANTLR start "rule__BTSAmbivalence__Group__4__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1359:1: rule__BTSAmbivalence__Group__4__Impl : ( ( rule__BTSAmbivalence__Group_4__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1363:1: ( ( ( rule__BTSAmbivalence__Group_4__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1364:1: ( ( rule__BTSAmbivalence__Group_4__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1364:1: ( ( rule__BTSAmbivalence__Group_4__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1365:1: ( rule__BTSAmbivalence__Group_4__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_4()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1366:1: ( rule__BTSAmbivalence__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1366:2: rule__BTSAmbivalence__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_4__0_in_rule__BTSAmbivalence__Group__4__Impl2715);
                    rule__BTSAmbivalence__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__4__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__5"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1376:1: rule__BTSAmbivalence__Group__5 : rule__BTSAmbivalence__Group__5__Impl rule__BTSAmbivalence__Group__6 ;
    public final void rule__BTSAmbivalence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1380:1: ( rule__BTSAmbivalence__Group__5__Impl rule__BTSAmbivalence__Group__6 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1381:2: rule__BTSAmbivalence__Group__5__Impl rule__BTSAmbivalence__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__5__Impl_in_rule__BTSAmbivalence__Group__52746);
            rule__BTSAmbivalence__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__6_in_rule__BTSAmbivalence__Group__52749);
            rule__BTSAmbivalence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__5"


    // $ANTLR start "rule__BTSAmbivalence__Group__5__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1388:1: rule__BTSAmbivalence__Group__5__Impl : ( ( rule__BTSAmbivalence__Group_5__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1392:1: ( ( ( rule__BTSAmbivalence__Group_5__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1393:1: ( ( rule__BTSAmbivalence__Group_5__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1393:1: ( ( rule__BTSAmbivalence__Group_5__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1394:1: ( rule__BTSAmbivalence__Group_5__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_5()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1395:1: ( rule__BTSAmbivalence__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1395:2: rule__BTSAmbivalence__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_5__0_in_rule__BTSAmbivalence__Group__5__Impl2776);
                    rule__BTSAmbivalence__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__5__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__6"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1405:1: rule__BTSAmbivalence__Group__6 : rule__BTSAmbivalence__Group__6__Impl rule__BTSAmbivalence__Group__7 ;
    public final void rule__BTSAmbivalence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1409:1: ( rule__BTSAmbivalence__Group__6__Impl rule__BTSAmbivalence__Group__7 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1410:2: rule__BTSAmbivalence__Group__6__Impl rule__BTSAmbivalence__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__6__Impl_in_rule__BTSAmbivalence__Group__62807);
            rule__BTSAmbivalence__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__7_in_rule__BTSAmbivalence__Group__62810);
            rule__BTSAmbivalence__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__6"


    // $ANTLR start "rule__BTSAmbivalence__Group__6__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1417:1: rule__BTSAmbivalence__Group__6__Impl : ( ( rule__BTSAmbivalence__Group_6__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1421:1: ( ( ( rule__BTSAmbivalence__Group_6__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1422:1: ( ( rule__BTSAmbivalence__Group_6__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1422:1: ( ( rule__BTSAmbivalence__Group_6__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1423:1: ( rule__BTSAmbivalence__Group_6__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_6()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1424:1: ( rule__BTSAmbivalence__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1424:2: rule__BTSAmbivalence__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_6__0_in_rule__BTSAmbivalence__Group__6__Impl2837);
                    rule__BTSAmbivalence__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__6__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__7"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1434:1: rule__BTSAmbivalence__Group__7 : rule__BTSAmbivalence__Group__7__Impl rule__BTSAmbivalence__Group__8 ;
    public final void rule__BTSAmbivalence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1438:1: ( rule__BTSAmbivalence__Group__7__Impl rule__BTSAmbivalence__Group__8 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1439:2: rule__BTSAmbivalence__Group__7__Impl rule__BTSAmbivalence__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__7__Impl_in_rule__BTSAmbivalence__Group__72868);
            rule__BTSAmbivalence__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__8_in_rule__BTSAmbivalence__Group__72871);
            rule__BTSAmbivalence__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__7"


    // $ANTLR start "rule__BTSAmbivalence__Group__7__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1446:1: rule__BTSAmbivalence__Group__7__Impl : ( ( rule__BTSAmbivalence__Group_7__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1450:1: ( ( ( rule__BTSAmbivalence__Group_7__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1451:1: ( ( rule__BTSAmbivalence__Group_7__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1451:1: ( ( rule__BTSAmbivalence__Group_7__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1452:1: ( rule__BTSAmbivalence__Group_7__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_7()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1453:1: ( rule__BTSAmbivalence__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1453:2: rule__BTSAmbivalence__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_7__0_in_rule__BTSAmbivalence__Group__7__Impl2898);
                    rule__BTSAmbivalence__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__7__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__8"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1463:1: rule__BTSAmbivalence__Group__8 : rule__BTSAmbivalence__Group__8__Impl rule__BTSAmbivalence__Group__9 ;
    public final void rule__BTSAmbivalence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1467:1: ( rule__BTSAmbivalence__Group__8__Impl rule__BTSAmbivalence__Group__9 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1468:2: rule__BTSAmbivalence__Group__8__Impl rule__BTSAmbivalence__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__8__Impl_in_rule__BTSAmbivalence__Group__82929);
            rule__BTSAmbivalence__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__9_in_rule__BTSAmbivalence__Group__82932);
            rule__BTSAmbivalence__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__8"


    // $ANTLR start "rule__BTSAmbivalence__Group__8__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1475:1: rule__BTSAmbivalence__Group__8__Impl : ( ( rule__BTSAmbivalence__Group_8__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1479:1: ( ( ( rule__BTSAmbivalence__Group_8__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1480:1: ( ( rule__BTSAmbivalence__Group_8__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1480:1: ( ( rule__BTSAmbivalence__Group_8__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1481:1: ( rule__BTSAmbivalence__Group_8__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_8()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1482:1: ( rule__BTSAmbivalence__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1482:2: rule__BTSAmbivalence__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_8__0_in_rule__BTSAmbivalence__Group__8__Impl2959);
                    rule__BTSAmbivalence__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__8__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__9"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1492:1: rule__BTSAmbivalence__Group__9 : rule__BTSAmbivalence__Group__9__Impl rule__BTSAmbivalence__Group__10 ;
    public final void rule__BTSAmbivalence__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1496:1: ( rule__BTSAmbivalence__Group__9__Impl rule__BTSAmbivalence__Group__10 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1497:2: rule__BTSAmbivalence__Group__9__Impl rule__BTSAmbivalence__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__9__Impl_in_rule__BTSAmbivalence__Group__92990);
            rule__BTSAmbivalence__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__10_in_rule__BTSAmbivalence__Group__92993);
            rule__BTSAmbivalence__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__9"


    // $ANTLR start "rule__BTSAmbivalence__Group__9__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1504:1: rule__BTSAmbivalence__Group__9__Impl : ( ( rule__BTSAmbivalence__Group_9__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1508:1: ( ( ( rule__BTSAmbivalence__Group_9__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1509:1: ( ( rule__BTSAmbivalence__Group_9__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1509:1: ( ( rule__BTSAmbivalence__Group_9__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1510:1: ( rule__BTSAmbivalence__Group_9__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_9()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1511:1: ( rule__BTSAmbivalence__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1511:2: rule__BTSAmbivalence__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_9__0_in_rule__BTSAmbivalence__Group__9__Impl3020);
                    rule__BTSAmbivalence__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__9__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__10"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1521:1: rule__BTSAmbivalence__Group__10 : rule__BTSAmbivalence__Group__10__Impl rule__BTSAmbivalence__Group__11 ;
    public final void rule__BTSAmbivalence__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1525:1: ( rule__BTSAmbivalence__Group__10__Impl rule__BTSAmbivalence__Group__11 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1526:2: rule__BTSAmbivalence__Group__10__Impl rule__BTSAmbivalence__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__10__Impl_in_rule__BTSAmbivalence__Group__103051);
            rule__BTSAmbivalence__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__11_in_rule__BTSAmbivalence__Group__103054);
            rule__BTSAmbivalence__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__10"


    // $ANTLR start "rule__BTSAmbivalence__Group__10__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1533:1: rule__BTSAmbivalence__Group__10__Impl : ( ( rule__BTSAmbivalence__Group_10__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1537:1: ( ( ( rule__BTSAmbivalence__Group_10__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1538:1: ( ( rule__BTSAmbivalence__Group_10__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1538:1: ( ( rule__BTSAmbivalence__Group_10__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1539:1: ( rule__BTSAmbivalence__Group_10__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_10()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1540:1: ( rule__BTSAmbivalence__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1540:2: rule__BTSAmbivalence__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_10__0_in_rule__BTSAmbivalence__Group__10__Impl3081);
                    rule__BTSAmbivalence__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__10__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__11"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1550:1: rule__BTSAmbivalence__Group__11 : rule__BTSAmbivalence__Group__11__Impl rule__BTSAmbivalence__Group__12 ;
    public final void rule__BTSAmbivalence__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1554:1: ( rule__BTSAmbivalence__Group__11__Impl rule__BTSAmbivalence__Group__12 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1555:2: rule__BTSAmbivalence__Group__11__Impl rule__BTSAmbivalence__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__11__Impl_in_rule__BTSAmbivalence__Group__113112);
            rule__BTSAmbivalence__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__12_in_rule__BTSAmbivalence__Group__113115);
            rule__BTSAmbivalence__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__11"


    // $ANTLR start "rule__BTSAmbivalence__Group__11__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1562:1: rule__BTSAmbivalence__Group__11__Impl : ( ( rule__BTSAmbivalence__Group_11__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1566:1: ( ( ( rule__BTSAmbivalence__Group_11__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1567:1: ( ( rule__BTSAmbivalence__Group_11__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1567:1: ( ( rule__BTSAmbivalence__Group_11__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1568:1: ( rule__BTSAmbivalence__Group_11__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_11()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1569:1: ( rule__BTSAmbivalence__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1569:2: rule__BTSAmbivalence__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_11__0_in_rule__BTSAmbivalence__Group__11__Impl3142);
                    rule__BTSAmbivalence__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__11__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__12"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1579:1: rule__BTSAmbivalence__Group__12 : rule__BTSAmbivalence__Group__12__Impl rule__BTSAmbivalence__Group__13 ;
    public final void rule__BTSAmbivalence__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1583:1: ( rule__BTSAmbivalence__Group__12__Impl rule__BTSAmbivalence__Group__13 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1584:2: rule__BTSAmbivalence__Group__12__Impl rule__BTSAmbivalence__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__12__Impl_in_rule__BTSAmbivalence__Group__123173);
            rule__BTSAmbivalence__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__13_in_rule__BTSAmbivalence__Group__123176);
            rule__BTSAmbivalence__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__12"


    // $ANTLR start "rule__BTSAmbivalence__Group__12__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1591:1: rule__BTSAmbivalence__Group__12__Impl : ( ( rule__BTSAmbivalence__Group_12__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1595:1: ( ( ( rule__BTSAmbivalence__Group_12__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1596:1: ( ( rule__BTSAmbivalence__Group_12__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1596:1: ( ( rule__BTSAmbivalence__Group_12__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1597:1: ( rule__BTSAmbivalence__Group_12__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_12()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1598:1: ( rule__BTSAmbivalence__Group_12__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1598:2: rule__BTSAmbivalence__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_12__0_in_rule__BTSAmbivalence__Group__12__Impl3203);
                    rule__BTSAmbivalence__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__12__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__13"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1608:1: rule__BTSAmbivalence__Group__13 : rule__BTSAmbivalence__Group__13__Impl rule__BTSAmbivalence__Group__14 ;
    public final void rule__BTSAmbivalence__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1612:1: ( rule__BTSAmbivalence__Group__13__Impl rule__BTSAmbivalence__Group__14 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1613:2: rule__BTSAmbivalence__Group__13__Impl rule__BTSAmbivalence__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__13__Impl_in_rule__BTSAmbivalence__Group__133234);
            rule__BTSAmbivalence__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__14_in_rule__BTSAmbivalence__Group__133237);
            rule__BTSAmbivalence__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__13"


    // $ANTLR start "rule__BTSAmbivalence__Group__13__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1620:1: rule__BTSAmbivalence__Group__13__Impl : ( ( rule__BTSAmbivalence__Group_13__0 )? ) ;
    public final void rule__BTSAmbivalence__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1624:1: ( ( ( rule__BTSAmbivalence__Group_13__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1625:1: ( ( rule__BTSAmbivalence__Group_13__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1625:1: ( ( rule__BTSAmbivalence__Group_13__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1626:1: ( rule__BTSAmbivalence__Group_13__0 )?
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_13()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1627:1: ( rule__BTSAmbivalence__Group_13__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1627:2: rule__BTSAmbivalence__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__0_in_rule__BTSAmbivalence__Group__13__Impl3264);
                    rule__BTSAmbivalence__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__13__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group__14"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1637:1: rule__BTSAmbivalence__Group__14 : rule__BTSAmbivalence__Group__14__Impl ;
    public final void rule__BTSAmbivalence__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1641:1: ( rule__BTSAmbivalence__Group__14__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1642:2: rule__BTSAmbivalence__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group__14__Impl_in_rule__BTSAmbivalence__Group__143295);
            rule__BTSAmbivalence__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__14"


    // $ANTLR start "rule__BTSAmbivalence__Group__14__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1648:1: rule__BTSAmbivalence__Group__14__Impl : ( '}' ) ;
    public final void rule__BTSAmbivalence__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1652:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1653:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1653:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1654:1: '}'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BTSAmbivalence__Group__14__Impl3323); 
             after(grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group__14__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_3__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1697:1: rule__BTSAmbivalence__Group_3__0 : rule__BTSAmbivalence__Group_3__0__Impl rule__BTSAmbivalence__Group_3__1 ;
    public final void rule__BTSAmbivalence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1701:1: ( rule__BTSAmbivalence__Group_3__0__Impl rule__BTSAmbivalence__Group_3__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1702:2: rule__BTSAmbivalence__Group_3__0__Impl rule__BTSAmbivalence__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_3__0__Impl_in_rule__BTSAmbivalence__Group_3__03384);
            rule__BTSAmbivalence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_3__1_in_rule__BTSAmbivalence__Group_3__03387);
            rule__BTSAmbivalence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_3__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_3__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1709:1: rule__BTSAmbivalence__Group_3__0__Impl : ( 'state' ) ;
    public final void rule__BTSAmbivalence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1713:1: ( ( 'state' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1714:1: ( 'state' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1714:1: ( 'state' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1715:1: 'state'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getStateKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__BTSAmbivalence__Group_3__0__Impl3415); 
             after(grammarAccess.getBTSAmbivalenceAccess().getStateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_3__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_3__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1728:1: rule__BTSAmbivalence__Group_3__1 : rule__BTSAmbivalence__Group_3__1__Impl ;
    public final void rule__BTSAmbivalence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1732:1: ( rule__BTSAmbivalence__Group_3__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1733:2: rule__BTSAmbivalence__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_3__1__Impl_in_rule__BTSAmbivalence__Group_3__13446);
            rule__BTSAmbivalence__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_3__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_3__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1739:1: rule__BTSAmbivalence__Group_3__1__Impl : ( ( rule__BTSAmbivalence__StateAssignment_3_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1743:1: ( ( ( rule__BTSAmbivalence__StateAssignment_3_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1744:1: ( ( rule__BTSAmbivalence__StateAssignment_3_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1744:1: ( ( rule__BTSAmbivalence__StateAssignment_3_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1745:1: ( rule__BTSAmbivalence__StateAssignment_3_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getStateAssignment_3_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1746:1: ( rule__BTSAmbivalence__StateAssignment_3_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1746:2: rule__BTSAmbivalence__StateAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__StateAssignment_3_1_in_rule__BTSAmbivalence__Group_3__1__Impl3473);
            rule__BTSAmbivalence__StateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getStateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_3__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_4__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1760:1: rule__BTSAmbivalence__Group_4__0 : rule__BTSAmbivalence__Group_4__0__Impl rule__BTSAmbivalence__Group_4__1 ;
    public final void rule__BTSAmbivalence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1764:1: ( rule__BTSAmbivalence__Group_4__0__Impl rule__BTSAmbivalence__Group_4__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1765:2: rule__BTSAmbivalence__Group_4__0__Impl rule__BTSAmbivalence__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_4__0__Impl_in_rule__BTSAmbivalence__Group_4__03507);
            rule__BTSAmbivalence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_4__1_in_rule__BTSAmbivalence__Group_4__03510);
            rule__BTSAmbivalence__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_4__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_4__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1772:1: rule__BTSAmbivalence__Group_4__0__Impl : ( 'revisionState' ) ;
    public final void rule__BTSAmbivalence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1776:1: ( ( 'revisionState' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1777:1: ( 'revisionState' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1777:1: ( 'revisionState' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1778:1: 'revisionState'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__BTSAmbivalence__Group_4__0__Impl3538); 
             after(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_4__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_4__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1791:1: rule__BTSAmbivalence__Group_4__1 : rule__BTSAmbivalence__Group_4__1__Impl ;
    public final void rule__BTSAmbivalence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1795:1: ( rule__BTSAmbivalence__Group_4__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1796:2: rule__BTSAmbivalence__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_4__1__Impl_in_rule__BTSAmbivalence__Group_4__13569);
            rule__BTSAmbivalence__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_4__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_4__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1802:1: rule__BTSAmbivalence__Group_4__1__Impl : ( ( rule__BTSAmbivalence__RevisionStateAssignment_4_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1806:1: ( ( ( rule__BTSAmbivalence__RevisionStateAssignment_4_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1807:1: ( ( rule__BTSAmbivalence__RevisionStateAssignment_4_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1807:1: ( ( rule__BTSAmbivalence__RevisionStateAssignment_4_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1808:1: ( rule__BTSAmbivalence__RevisionStateAssignment_4_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateAssignment_4_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1809:1: ( rule__BTSAmbivalence__RevisionStateAssignment_4_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1809:2: rule__BTSAmbivalence__RevisionStateAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__RevisionStateAssignment_4_1_in_rule__BTSAmbivalence__Group_4__1__Impl3596);
            rule__BTSAmbivalence__RevisionStateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_4__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_5__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1823:1: rule__BTSAmbivalence__Group_5__0 : rule__BTSAmbivalence__Group_5__0__Impl rule__BTSAmbivalence__Group_5__1 ;
    public final void rule__BTSAmbivalence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1827:1: ( rule__BTSAmbivalence__Group_5__0__Impl rule__BTSAmbivalence__Group_5__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1828:2: rule__BTSAmbivalence__Group_5__0__Impl rule__BTSAmbivalence__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_5__0__Impl_in_rule__BTSAmbivalence__Group_5__03630);
            rule__BTSAmbivalence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_5__1_in_rule__BTSAmbivalence__Group_5__03633);
            rule__BTSAmbivalence__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_5__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_5__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1835:1: rule__BTSAmbivalence__Group_5__0__Impl : ( 'visibility' ) ;
    public final void rule__BTSAmbivalence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1839:1: ( ( 'visibility' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1840:1: ( 'visibility' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1840:1: ( 'visibility' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1841:1: 'visibility'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getVisibilityKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__BTSAmbivalence__Group_5__0__Impl3661); 
             after(grammarAccess.getBTSAmbivalenceAccess().getVisibilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_5__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_5__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1854:1: rule__BTSAmbivalence__Group_5__1 : rule__BTSAmbivalence__Group_5__1__Impl ;
    public final void rule__BTSAmbivalence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1858:1: ( rule__BTSAmbivalence__Group_5__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1859:2: rule__BTSAmbivalence__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_5__1__Impl_in_rule__BTSAmbivalence__Group_5__13692);
            rule__BTSAmbivalence__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_5__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_5__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1865:1: rule__BTSAmbivalence__Group_5__1__Impl : ( ( rule__BTSAmbivalence__VisibilityAssignment_5_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1869:1: ( ( ( rule__BTSAmbivalence__VisibilityAssignment_5_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1870:1: ( ( rule__BTSAmbivalence__VisibilityAssignment_5_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1870:1: ( ( rule__BTSAmbivalence__VisibilityAssignment_5_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1871:1: ( rule__BTSAmbivalence__VisibilityAssignment_5_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getVisibilityAssignment_5_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1872:1: ( rule__BTSAmbivalence__VisibilityAssignment_5_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1872:2: rule__BTSAmbivalence__VisibilityAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__VisibilityAssignment_5_1_in_rule__BTSAmbivalence__Group_5__1__Impl3719);
            rule__BTSAmbivalence__VisibilityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getVisibilityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_5__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_6__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1886:1: rule__BTSAmbivalence__Group_6__0 : rule__BTSAmbivalence__Group_6__0__Impl rule__BTSAmbivalence__Group_6__1 ;
    public final void rule__BTSAmbivalence__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1890:1: ( rule__BTSAmbivalence__Group_6__0__Impl rule__BTSAmbivalence__Group_6__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1891:2: rule__BTSAmbivalence__Group_6__0__Impl rule__BTSAmbivalence__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_6__0__Impl_in_rule__BTSAmbivalence__Group_6__03753);
            rule__BTSAmbivalence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_6__1_in_rule__BTSAmbivalence__Group_6__03756);
            rule__BTSAmbivalence__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_6__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_6__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1898:1: rule__BTSAmbivalence__Group_6__0__Impl : ( 'sortKey' ) ;
    public final void rule__BTSAmbivalence__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1902:1: ( ( 'sortKey' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1903:1: ( 'sortKey' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1903:1: ( 'sortKey' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1904:1: 'sortKey'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getSortKeyKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__BTSAmbivalence__Group_6__0__Impl3784); 
             after(grammarAccess.getBTSAmbivalenceAccess().getSortKeyKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_6__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_6__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1917:1: rule__BTSAmbivalence__Group_6__1 : rule__BTSAmbivalence__Group_6__1__Impl ;
    public final void rule__BTSAmbivalence__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1921:1: ( rule__BTSAmbivalence__Group_6__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1922:2: rule__BTSAmbivalence__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_6__1__Impl_in_rule__BTSAmbivalence__Group_6__13815);
            rule__BTSAmbivalence__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_6__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_6__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1928:1: rule__BTSAmbivalence__Group_6__1__Impl : ( ( rule__BTSAmbivalence__SortKeyAssignment_6_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1932:1: ( ( ( rule__BTSAmbivalence__SortKeyAssignment_6_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1933:1: ( ( rule__BTSAmbivalence__SortKeyAssignment_6_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1933:1: ( ( rule__BTSAmbivalence__SortKeyAssignment_6_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1934:1: ( rule__BTSAmbivalence__SortKeyAssignment_6_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getSortKeyAssignment_6_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1935:1: ( rule__BTSAmbivalence__SortKeyAssignment_6_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1935:2: rule__BTSAmbivalence__SortKeyAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__SortKeyAssignment_6_1_in_rule__BTSAmbivalence__Group_6__1__Impl3842);
            rule__BTSAmbivalence__SortKeyAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getSortKeyAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_6__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_7__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1949:1: rule__BTSAmbivalence__Group_7__0 : rule__BTSAmbivalence__Group_7__0__Impl rule__BTSAmbivalence__Group_7__1 ;
    public final void rule__BTSAmbivalence__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1953:1: ( rule__BTSAmbivalence__Group_7__0__Impl rule__BTSAmbivalence__Group_7__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1954:2: rule__BTSAmbivalence__Group_7__0__Impl rule__BTSAmbivalence__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_7__0__Impl_in_rule__BTSAmbivalence__Group_7__03876);
            rule__BTSAmbivalence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_7__1_in_rule__BTSAmbivalence__Group_7__03879);
            rule__BTSAmbivalence__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_7__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_7__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1961:1: rule__BTSAmbivalence__Group_7__0__Impl : ( 'type' ) ;
    public final void rule__BTSAmbivalence__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1965:1: ( ( 'type' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1966:1: ( 'type' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1966:1: ( 'type' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1967:1: 'type'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getTypeKeyword_7_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__BTSAmbivalence__Group_7__0__Impl3907); 
             after(grammarAccess.getBTSAmbivalenceAccess().getTypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_7__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_7__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1980:1: rule__BTSAmbivalence__Group_7__1 : rule__BTSAmbivalence__Group_7__1__Impl ;
    public final void rule__BTSAmbivalence__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1984:1: ( rule__BTSAmbivalence__Group_7__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1985:2: rule__BTSAmbivalence__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_7__1__Impl_in_rule__BTSAmbivalence__Group_7__13938);
            rule__BTSAmbivalence__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_7__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_7__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1991:1: rule__BTSAmbivalence__Group_7__1__Impl : ( ( rule__BTSAmbivalence__TypeAssignment_7_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1995:1: ( ( ( rule__BTSAmbivalence__TypeAssignment_7_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1996:1: ( ( rule__BTSAmbivalence__TypeAssignment_7_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1996:1: ( ( rule__BTSAmbivalence__TypeAssignment_7_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1997:1: ( rule__BTSAmbivalence__TypeAssignment_7_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getTypeAssignment_7_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1998:1: ( rule__BTSAmbivalence__TypeAssignment_7_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1998:2: rule__BTSAmbivalence__TypeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__TypeAssignment_7_1_in_rule__BTSAmbivalence__Group_7__1__Impl3965);
            rule__BTSAmbivalence__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_7__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_8__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2012:1: rule__BTSAmbivalence__Group_8__0 : rule__BTSAmbivalence__Group_8__0__Impl rule__BTSAmbivalence__Group_8__1 ;
    public final void rule__BTSAmbivalence__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2016:1: ( rule__BTSAmbivalence__Group_8__0__Impl rule__BTSAmbivalence__Group_8__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2017:2: rule__BTSAmbivalence__Group_8__0__Impl rule__BTSAmbivalence__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_8__0__Impl_in_rule__BTSAmbivalence__Group_8__03999);
            rule__BTSAmbivalence__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_8__1_in_rule__BTSAmbivalence__Group_8__04002);
            rule__BTSAmbivalence__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_8__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_8__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2024:1: rule__BTSAmbivalence__Group_8__0__Impl : ( 'subtype' ) ;
    public final void rule__BTSAmbivalence__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2028:1: ( ( 'subtype' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2029:1: ( 'subtype' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2029:1: ( 'subtype' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2030:1: 'subtype'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getSubtypeKeyword_8_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BTSAmbivalence__Group_8__0__Impl4030); 
             after(grammarAccess.getBTSAmbivalenceAccess().getSubtypeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_8__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_8__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2043:1: rule__BTSAmbivalence__Group_8__1 : rule__BTSAmbivalence__Group_8__1__Impl ;
    public final void rule__BTSAmbivalence__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2047:1: ( rule__BTSAmbivalence__Group_8__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2048:2: rule__BTSAmbivalence__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_8__1__Impl_in_rule__BTSAmbivalence__Group_8__14061);
            rule__BTSAmbivalence__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_8__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_8__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2054:1: rule__BTSAmbivalence__Group_8__1__Impl : ( ( rule__BTSAmbivalence__SubtypeAssignment_8_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2058:1: ( ( ( rule__BTSAmbivalence__SubtypeAssignment_8_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2059:1: ( ( rule__BTSAmbivalence__SubtypeAssignment_8_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2059:1: ( ( rule__BTSAmbivalence__SubtypeAssignment_8_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2060:1: ( rule__BTSAmbivalence__SubtypeAssignment_8_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getSubtypeAssignment_8_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2061:1: ( rule__BTSAmbivalence__SubtypeAssignment_8_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2061:2: rule__BTSAmbivalence__SubtypeAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__SubtypeAssignment_8_1_in_rule__BTSAmbivalence__Group_8__1__Impl4088);
            rule__BTSAmbivalence__SubtypeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getSubtypeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_8__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_9__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2075:1: rule__BTSAmbivalence__Group_9__0 : rule__BTSAmbivalence__Group_9__0__Impl rule__BTSAmbivalence__Group_9__1 ;
    public final void rule__BTSAmbivalence__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2079:1: ( rule__BTSAmbivalence__Group_9__0__Impl rule__BTSAmbivalence__Group_9__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2080:2: rule__BTSAmbivalence__Group_9__0__Impl rule__BTSAmbivalence__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_9__0__Impl_in_rule__BTSAmbivalence__Group_9__04122);
            rule__BTSAmbivalence__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_9__1_in_rule__BTSAmbivalence__Group_9__04125);
            rule__BTSAmbivalence__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_9__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_9__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2087:1: rule__BTSAmbivalence__Group_9__0__Impl : ( 'code' ) ;
    public final void rule__BTSAmbivalence__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2091:1: ( ( 'code' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2092:1: ( 'code' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2092:1: ( 'code' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2093:1: 'code'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCodeKeyword_9_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BTSAmbivalence__Group_9__0__Impl4153); 
             after(grammarAccess.getBTSAmbivalenceAccess().getCodeKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_9__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_9__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2106:1: rule__BTSAmbivalence__Group_9__1 : rule__BTSAmbivalence__Group_9__1__Impl ;
    public final void rule__BTSAmbivalence__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2110:1: ( rule__BTSAmbivalence__Group_9__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2111:2: rule__BTSAmbivalence__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_9__1__Impl_in_rule__BTSAmbivalence__Group_9__14184);
            rule__BTSAmbivalence__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_9__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_9__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2117:1: rule__BTSAmbivalence__Group_9__1__Impl : ( ( rule__BTSAmbivalence__CodeAssignment_9_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2121:1: ( ( ( rule__BTSAmbivalence__CodeAssignment_9_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2122:1: ( ( rule__BTSAmbivalence__CodeAssignment_9_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2122:1: ( ( rule__BTSAmbivalence__CodeAssignment_9_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2123:1: ( rule__BTSAmbivalence__CodeAssignment_9_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCodeAssignment_9_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2124:1: ( rule__BTSAmbivalence__CodeAssignment_9_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2124:2: rule__BTSAmbivalence__CodeAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__CodeAssignment_9_1_in_rule__BTSAmbivalence__Group_9__1__Impl4211);
            rule__BTSAmbivalence__CodeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getCodeAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_9__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_10__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2138:1: rule__BTSAmbivalence__Group_10__0 : rule__BTSAmbivalence__Group_10__0__Impl rule__BTSAmbivalence__Group_10__1 ;
    public final void rule__BTSAmbivalence__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2142:1: ( rule__BTSAmbivalence__Group_10__0__Impl rule__BTSAmbivalence__Group_10__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2143:2: rule__BTSAmbivalence__Group_10__0__Impl rule__BTSAmbivalence__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_10__0__Impl_in_rule__BTSAmbivalence__Group_10__04245);
            rule__BTSAmbivalence__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_10__1_in_rule__BTSAmbivalence__Group_10__04248);
            rule__BTSAmbivalence__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_10__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_10__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2150:1: rule__BTSAmbivalence__Group_10__0__Impl : ( '_id' ) ;
    public final void rule__BTSAmbivalence__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2154:1: ( ( '_id' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2155:1: ( '_id' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2155:1: ( '_id' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2156:1: '_id'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().get_idKeyword_10_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__BTSAmbivalence__Group_10__0__Impl4276); 
             after(grammarAccess.getBTSAmbivalenceAccess().get_idKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_10__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_10__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2169:1: rule__BTSAmbivalence__Group_10__1 : rule__BTSAmbivalence__Group_10__1__Impl ;
    public final void rule__BTSAmbivalence__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2173:1: ( rule__BTSAmbivalence__Group_10__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2174:2: rule__BTSAmbivalence__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_10__1__Impl_in_rule__BTSAmbivalence__Group_10__14307);
            rule__BTSAmbivalence__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_10__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_10__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2180:1: rule__BTSAmbivalence__Group_10__1__Impl : ( ( rule__BTSAmbivalence___idAssignment_10_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2184:1: ( ( ( rule__BTSAmbivalence___idAssignment_10_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2185:1: ( ( rule__BTSAmbivalence___idAssignment_10_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2185:1: ( ( rule__BTSAmbivalence___idAssignment_10_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2186:1: ( rule__BTSAmbivalence___idAssignment_10_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().get_idAssignment_10_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2187:1: ( rule__BTSAmbivalence___idAssignment_10_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2187:2: rule__BTSAmbivalence___idAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence___idAssignment_10_1_in_rule__BTSAmbivalence__Group_10__1__Impl4334);
            rule__BTSAmbivalence___idAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().get_idAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_10__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_11__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2201:1: rule__BTSAmbivalence__Group_11__0 : rule__BTSAmbivalence__Group_11__0__Impl rule__BTSAmbivalence__Group_11__1 ;
    public final void rule__BTSAmbivalence__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2205:1: ( rule__BTSAmbivalence__Group_11__0__Impl rule__BTSAmbivalence__Group_11__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2206:2: rule__BTSAmbivalence__Group_11__0__Impl rule__BTSAmbivalence__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_11__0__Impl_in_rule__BTSAmbivalence__Group_11__04368);
            rule__BTSAmbivalence__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_11__1_in_rule__BTSAmbivalence__Group_11__04371);
            rule__BTSAmbivalence__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_11__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_11__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2213:1: rule__BTSAmbivalence__Group_11__0__Impl : ( 'comment' ) ;
    public final void rule__BTSAmbivalence__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2217:1: ( ( 'comment' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2218:1: ( 'comment' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2218:1: ( 'comment' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2219:1: 'comment'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCommentKeyword_11_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__BTSAmbivalence__Group_11__0__Impl4399); 
             after(grammarAccess.getBTSAmbivalenceAccess().getCommentKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_11__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_11__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2232:1: rule__BTSAmbivalence__Group_11__1 : rule__BTSAmbivalence__Group_11__1__Impl ;
    public final void rule__BTSAmbivalence__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2236:1: ( rule__BTSAmbivalence__Group_11__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2237:2: rule__BTSAmbivalence__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_11__1__Impl_in_rule__BTSAmbivalence__Group_11__14430);
            rule__BTSAmbivalence__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_11__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_11__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2243:1: rule__BTSAmbivalence__Group_11__1__Impl : ( ( rule__BTSAmbivalence__CommentAssignment_11_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2247:1: ( ( ( rule__BTSAmbivalence__CommentAssignment_11_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2248:1: ( ( rule__BTSAmbivalence__CommentAssignment_11_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2248:1: ( ( rule__BTSAmbivalence__CommentAssignment_11_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2249:1: ( rule__BTSAmbivalence__CommentAssignment_11_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCommentAssignment_11_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2250:1: ( rule__BTSAmbivalence__CommentAssignment_11_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2250:2: rule__BTSAmbivalence__CommentAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__CommentAssignment_11_1_in_rule__BTSAmbivalence__Group_11__1__Impl4457);
            rule__BTSAmbivalence__CommentAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getCommentAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_11__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_12__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2264:1: rule__BTSAmbivalence__Group_12__0 : rule__BTSAmbivalence__Group_12__0__Impl rule__BTSAmbivalence__Group_12__1 ;
    public final void rule__BTSAmbivalence__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2268:1: ( rule__BTSAmbivalence__Group_12__0__Impl rule__BTSAmbivalence__Group_12__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2269:2: rule__BTSAmbivalence__Group_12__0__Impl rule__BTSAmbivalence__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_12__0__Impl_in_rule__BTSAmbivalence__Group_12__04491);
            rule__BTSAmbivalence__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_12__1_in_rule__BTSAmbivalence__Group_12__04494);
            rule__BTSAmbivalence__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_12__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_12__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2276:1: rule__BTSAmbivalence__Group_12__0__Impl : ( 'parentId' ) ;
    public final void rule__BTSAmbivalence__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2280:1: ( ( 'parentId' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2281:1: ( 'parentId' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2281:1: ( 'parentId' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2282:1: 'parentId'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getParentIdKeyword_12_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__BTSAmbivalence__Group_12__0__Impl4522); 
             after(grammarAccess.getBTSAmbivalenceAccess().getParentIdKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_12__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_12__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2295:1: rule__BTSAmbivalence__Group_12__1 : rule__BTSAmbivalence__Group_12__1__Impl ;
    public final void rule__BTSAmbivalence__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2299:1: ( rule__BTSAmbivalence__Group_12__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2300:2: rule__BTSAmbivalence__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_12__1__Impl_in_rule__BTSAmbivalence__Group_12__14553);
            rule__BTSAmbivalence__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_12__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_12__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2306:1: rule__BTSAmbivalence__Group_12__1__Impl : ( ( rule__BTSAmbivalence__ParentIdAssignment_12_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2310:1: ( ( ( rule__BTSAmbivalence__ParentIdAssignment_12_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2311:1: ( ( rule__BTSAmbivalence__ParentIdAssignment_12_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2311:1: ( ( rule__BTSAmbivalence__ParentIdAssignment_12_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2312:1: ( rule__BTSAmbivalence__ParentIdAssignment_12_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getParentIdAssignment_12_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2313:1: ( rule__BTSAmbivalence__ParentIdAssignment_12_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2313:2: rule__BTSAmbivalence__ParentIdAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__ParentIdAssignment_12_1_in_rule__BTSAmbivalence__Group_12__1__Impl4580);
            rule__BTSAmbivalence__ParentIdAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getParentIdAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_12__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2327:1: rule__BTSAmbivalence__Group_13__0 : rule__BTSAmbivalence__Group_13__0__Impl rule__BTSAmbivalence__Group_13__1 ;
    public final void rule__BTSAmbivalence__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2331:1: ( rule__BTSAmbivalence__Group_13__0__Impl rule__BTSAmbivalence__Group_13__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2332:2: rule__BTSAmbivalence__Group_13__0__Impl rule__BTSAmbivalence__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__0__Impl_in_rule__BTSAmbivalence__Group_13__04614);
            rule__BTSAmbivalence__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__1_in_rule__BTSAmbivalence__Group_13__04617);
            rule__BTSAmbivalence__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2339:1: rule__BTSAmbivalence__Group_13__0__Impl : ( 'cases' ) ;
    public final void rule__BTSAmbivalence__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2343:1: ( ( 'cases' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2344:1: ( 'cases' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2344:1: ( 'cases' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2345:1: 'cases'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCasesKeyword_13_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BTSAmbivalence__Group_13__0__Impl4645); 
             after(grammarAccess.getBTSAmbivalenceAccess().getCasesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2358:1: rule__BTSAmbivalence__Group_13__1 : rule__BTSAmbivalence__Group_13__1__Impl rule__BTSAmbivalence__Group_13__2 ;
    public final void rule__BTSAmbivalence__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2362:1: ( rule__BTSAmbivalence__Group_13__1__Impl rule__BTSAmbivalence__Group_13__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2363:2: rule__BTSAmbivalence__Group_13__1__Impl rule__BTSAmbivalence__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__1__Impl_in_rule__BTSAmbivalence__Group_13__14676);
            rule__BTSAmbivalence__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__2_in_rule__BTSAmbivalence__Group_13__14679);
            rule__BTSAmbivalence__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2370:1: rule__BTSAmbivalence__Group_13__1__Impl : ( '{' ) ;
    public final void rule__BTSAmbivalence__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2374:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2375:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2375:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2376:1: '{'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BTSAmbivalence__Group_13__1__Impl4707); 
             after(grammarAccess.getBTSAmbivalenceAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__1__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2389:1: rule__BTSAmbivalence__Group_13__2 : rule__BTSAmbivalence__Group_13__2__Impl rule__BTSAmbivalence__Group_13__3 ;
    public final void rule__BTSAmbivalence__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2393:1: ( rule__BTSAmbivalence__Group_13__2__Impl rule__BTSAmbivalence__Group_13__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2394:2: rule__BTSAmbivalence__Group_13__2__Impl rule__BTSAmbivalence__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__2__Impl_in_rule__BTSAmbivalence__Group_13__24738);
            rule__BTSAmbivalence__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__3_in_rule__BTSAmbivalence__Group_13__24741);
            rule__BTSAmbivalence__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__2"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2401:1: rule__BTSAmbivalence__Group_13__2__Impl : ( ( rule__BTSAmbivalence__CasesAssignment_13_2 ) ) ;
    public final void rule__BTSAmbivalence__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2405:1: ( ( ( rule__BTSAmbivalence__CasesAssignment_13_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2406:1: ( ( rule__BTSAmbivalence__CasesAssignment_13_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2406:1: ( ( rule__BTSAmbivalence__CasesAssignment_13_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2407:1: ( rule__BTSAmbivalence__CasesAssignment_13_2 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCasesAssignment_13_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2408:1: ( rule__BTSAmbivalence__CasesAssignment_13_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2408:2: rule__BTSAmbivalence__CasesAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__CasesAssignment_13_2_in_rule__BTSAmbivalence__Group_13__2__Impl4768);
            rule__BTSAmbivalence__CasesAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getCasesAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__2__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2418:1: rule__BTSAmbivalence__Group_13__3 : rule__BTSAmbivalence__Group_13__3__Impl rule__BTSAmbivalence__Group_13__4 ;
    public final void rule__BTSAmbivalence__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2422:1: ( rule__BTSAmbivalence__Group_13__3__Impl rule__BTSAmbivalence__Group_13__4 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2423:2: rule__BTSAmbivalence__Group_13__3__Impl rule__BTSAmbivalence__Group_13__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__3__Impl_in_rule__BTSAmbivalence__Group_13__34798);
            rule__BTSAmbivalence__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__4_in_rule__BTSAmbivalence__Group_13__34801);
            rule__BTSAmbivalence__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__3"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2430:1: rule__BTSAmbivalence__Group_13__3__Impl : ( ( rule__BTSAmbivalence__Group_13_3__0 )* ) ;
    public final void rule__BTSAmbivalence__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2434:1: ( ( ( rule__BTSAmbivalence__Group_13_3__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2435:1: ( ( rule__BTSAmbivalence__Group_13_3__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2435:1: ( ( rule__BTSAmbivalence__Group_13_3__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2436:1: ( rule__BTSAmbivalence__Group_13_3__0 )*
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getGroup_13_3()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2437:1: ( rule__BTSAmbivalence__Group_13_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2437:2: rule__BTSAmbivalence__Group_13_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13_3__0_in_rule__BTSAmbivalence__Group_13__3__Impl4828);
            	    rule__BTSAmbivalence__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBTSAmbivalenceAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__3__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__4"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2447:1: rule__BTSAmbivalence__Group_13__4 : rule__BTSAmbivalence__Group_13__4__Impl ;
    public final void rule__BTSAmbivalence__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2451:1: ( rule__BTSAmbivalence__Group_13__4__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2452:2: rule__BTSAmbivalence__Group_13__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13__4__Impl_in_rule__BTSAmbivalence__Group_13__44859);
            rule__BTSAmbivalence__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__4"


    // $ANTLR start "rule__BTSAmbivalence__Group_13__4__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2458:1: rule__BTSAmbivalence__Group_13__4__Impl : ( '}' ) ;
    public final void rule__BTSAmbivalence__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2462:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2463:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2463:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2464:1: '}'
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BTSAmbivalence__Group_13__4__Impl4887); 
             after(grammarAccess.getBTSAmbivalenceAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13__4__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13_3__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2487:1: rule__BTSAmbivalence__Group_13_3__0 : rule__BTSAmbivalence__Group_13_3__0__Impl rule__BTSAmbivalence__Group_13_3__1 ;
    public final void rule__BTSAmbivalence__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2491:1: ( rule__BTSAmbivalence__Group_13_3__0__Impl rule__BTSAmbivalence__Group_13_3__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2492:2: rule__BTSAmbivalence__Group_13_3__0__Impl rule__BTSAmbivalence__Group_13_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13_3__0__Impl_in_rule__BTSAmbivalence__Group_13_3__04928);
            rule__BTSAmbivalence__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13_3__1_in_rule__BTSAmbivalence__Group_13_3__04931);
            rule__BTSAmbivalence__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13_3__0"


    // $ANTLR start "rule__BTSAmbivalence__Group_13_3__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2499:1: rule__BTSAmbivalence__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__BTSAmbivalence__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2503:1: ( ( ',' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2504:1: ( ',' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2504:1: ( ',' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2505:1: ','
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCommaKeyword_13_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BTSAmbivalence__Group_13_3__0__Impl4959); 
             after(grammarAccess.getBTSAmbivalenceAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13_3__0__Impl"


    // $ANTLR start "rule__BTSAmbivalence__Group_13_3__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2518:1: rule__BTSAmbivalence__Group_13_3__1 : rule__BTSAmbivalence__Group_13_3__1__Impl ;
    public final void rule__BTSAmbivalence__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2522:1: ( rule__BTSAmbivalence__Group_13_3__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2523:2: rule__BTSAmbivalence__Group_13_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__Group_13_3__1__Impl_in_rule__BTSAmbivalence__Group_13_3__14990);
            rule__BTSAmbivalence__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13_3__1"


    // $ANTLR start "rule__BTSAmbivalence__Group_13_3__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2529:1: rule__BTSAmbivalence__Group_13_3__1__Impl : ( ( rule__BTSAmbivalence__CasesAssignment_13_3_1 ) ) ;
    public final void rule__BTSAmbivalence__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2533:1: ( ( ( rule__BTSAmbivalence__CasesAssignment_13_3_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2534:1: ( ( rule__BTSAmbivalence__CasesAssignment_13_3_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2534:1: ( ( rule__BTSAmbivalence__CasesAssignment_13_3_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2535:1: ( rule__BTSAmbivalence__CasesAssignment_13_3_1 )
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCasesAssignment_13_3_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2536:1: ( rule__BTSAmbivalence__CasesAssignment_13_3_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2536:2: rule__BTSAmbivalence__CasesAssignment_13_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSAmbivalence__CasesAssignment_13_3_1_in_rule__BTSAmbivalence__Group_13_3__1__Impl5017);
            rule__BTSAmbivalence__CasesAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSAmbivalenceAccess().getCasesAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__Group_13_3__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2550:1: rule__BTSLemmaCase__Group__0 : rule__BTSLemmaCase__Group__0__Impl rule__BTSLemmaCase__Group__1 ;
    public final void rule__BTSLemmaCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2554:1: ( rule__BTSLemmaCase__Group__0__Impl rule__BTSLemmaCase__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2555:2: rule__BTSLemmaCase__Group__0__Impl rule__BTSLemmaCase__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__0__Impl_in_rule__BTSLemmaCase__Group__05051);
            rule__BTSLemmaCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__1_in_rule__BTSLemmaCase__Group__05054);
            rule__BTSLemmaCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__0"


    // $ANTLR start "rule__BTSLemmaCase__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2562:1: rule__BTSLemmaCase__Group__0__Impl : ( () ) ;
    public final void rule__BTSLemmaCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2566:1: ( ( () ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2567:1: ( () )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2567:1: ( () )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2568:1: ()
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseAction_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2569:1: ()
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2571:1: 
            {
            }

             after(grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2581:1: rule__BTSLemmaCase__Group__1 : rule__BTSLemmaCase__Group__1__Impl rule__BTSLemmaCase__Group__2 ;
    public final void rule__BTSLemmaCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2585:1: ( rule__BTSLemmaCase__Group__1__Impl rule__BTSLemmaCase__Group__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2586:2: rule__BTSLemmaCase__Group__1__Impl rule__BTSLemmaCase__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__1__Impl_in_rule__BTSLemmaCase__Group__15112);
            rule__BTSLemmaCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__2_in_rule__BTSLemmaCase__Group__15115);
            rule__BTSLemmaCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__1"


    // $ANTLR start "rule__BTSLemmaCase__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2593:1: rule__BTSLemmaCase__Group__1__Impl : ( 'BTSLemmaCase' ) ;
    public final void rule__BTSLemmaCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2597:1: ( ( 'BTSLemmaCase' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2598:1: ( 'BTSLemmaCase' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2598:1: ( 'BTSLemmaCase' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2599:1: 'BTSLemmaCase'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BTSLemmaCase__Group__1__Impl5143); 
             after(grammarAccess.getBTSLemmaCaseAccess().getBTSLemmaCaseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2612:1: rule__BTSLemmaCase__Group__2 : rule__BTSLemmaCase__Group__2__Impl rule__BTSLemmaCase__Group__3 ;
    public final void rule__BTSLemmaCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2616:1: ( rule__BTSLemmaCase__Group__2__Impl rule__BTSLemmaCase__Group__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2617:2: rule__BTSLemmaCase__Group__2__Impl rule__BTSLemmaCase__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__2__Impl_in_rule__BTSLemmaCase__Group__25174);
            rule__BTSLemmaCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__3_in_rule__BTSLemmaCase__Group__25177);
            rule__BTSLemmaCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__2"


    // $ANTLR start "rule__BTSLemmaCase__Group__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2624:1: rule__BTSLemmaCase__Group__2__Impl : ( ( rule__BTSLemmaCase__NameAssignment_2 ) ) ;
    public final void rule__BTSLemmaCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2628:1: ( ( ( rule__BTSLemmaCase__NameAssignment_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2629:1: ( ( rule__BTSLemmaCase__NameAssignment_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2629:1: ( ( rule__BTSLemmaCase__NameAssignment_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2630:1: ( rule__BTSLemmaCase__NameAssignment_2 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getNameAssignment_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2631:1: ( rule__BTSLemmaCase__NameAssignment_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2631:2: rule__BTSLemmaCase__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__NameAssignment_2_in_rule__BTSLemmaCase__Group__2__Impl5204);
            rule__BTSLemmaCase__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__2__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2641:1: rule__BTSLemmaCase__Group__3 : rule__BTSLemmaCase__Group__3__Impl rule__BTSLemmaCase__Group__4 ;
    public final void rule__BTSLemmaCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2645:1: ( rule__BTSLemmaCase__Group__3__Impl rule__BTSLemmaCase__Group__4 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2646:2: rule__BTSLemmaCase__Group__3__Impl rule__BTSLemmaCase__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__3__Impl_in_rule__BTSLemmaCase__Group__35234);
            rule__BTSLemmaCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__4_in_rule__BTSLemmaCase__Group__35237);
            rule__BTSLemmaCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__3"


    // $ANTLR start "rule__BTSLemmaCase__Group__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2653:1: rule__BTSLemmaCase__Group__3__Impl : ( '{' ) ;
    public final void rule__BTSLemmaCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2657:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2658:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2658:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2659:1: '{'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BTSLemmaCase__Group__3__Impl5265); 
             after(grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__3__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__4"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2672:1: rule__BTSLemmaCase__Group__4 : rule__BTSLemmaCase__Group__4__Impl rule__BTSLemmaCase__Group__5 ;
    public final void rule__BTSLemmaCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2676:1: ( rule__BTSLemmaCase__Group__4__Impl rule__BTSLemmaCase__Group__5 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2677:2: rule__BTSLemmaCase__Group__4__Impl rule__BTSLemmaCase__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__4__Impl_in_rule__BTSLemmaCase__Group__45296);
            rule__BTSLemmaCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__5_in_rule__BTSLemmaCase__Group__45299);
            rule__BTSLemmaCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__4"


    // $ANTLR start "rule__BTSLemmaCase__Group__4__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2684:1: rule__BTSLemmaCase__Group__4__Impl : ( ( rule__BTSLemmaCase__Group_4__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2688:1: ( ( ( rule__BTSLemmaCase__Group_4__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2689:1: ( ( rule__BTSLemmaCase__Group_4__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2689:1: ( ( rule__BTSLemmaCase__Group_4__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2690:1: ( rule__BTSLemmaCase__Group_4__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_4()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2691:1: ( rule__BTSLemmaCase__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2691:2: rule__BTSLemmaCase__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_4__0_in_rule__BTSLemmaCase__Group__4__Impl5326);
                    rule__BTSLemmaCase__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__4__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__5"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2701:1: rule__BTSLemmaCase__Group__5 : rule__BTSLemmaCase__Group__5__Impl rule__BTSLemmaCase__Group__6 ;
    public final void rule__BTSLemmaCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2705:1: ( rule__BTSLemmaCase__Group__5__Impl rule__BTSLemmaCase__Group__6 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2706:2: rule__BTSLemmaCase__Group__5__Impl rule__BTSLemmaCase__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__5__Impl_in_rule__BTSLemmaCase__Group__55357);
            rule__BTSLemmaCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__6_in_rule__BTSLemmaCase__Group__55360);
            rule__BTSLemmaCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__5"


    // $ANTLR start "rule__BTSLemmaCase__Group__5__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2713:1: rule__BTSLemmaCase__Group__5__Impl : ( ( rule__BTSLemmaCase__Group_5__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2717:1: ( ( ( rule__BTSLemmaCase__Group_5__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2718:1: ( ( rule__BTSLemmaCase__Group_5__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2718:1: ( ( rule__BTSLemmaCase__Group_5__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2719:1: ( rule__BTSLemmaCase__Group_5__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_5()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2720:1: ( rule__BTSLemmaCase__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2720:2: rule__BTSLemmaCase__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_5__0_in_rule__BTSLemmaCase__Group__5__Impl5387);
                    rule__BTSLemmaCase__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__5__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__6"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2730:1: rule__BTSLemmaCase__Group__6 : rule__BTSLemmaCase__Group__6__Impl rule__BTSLemmaCase__Group__7 ;
    public final void rule__BTSLemmaCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2734:1: ( rule__BTSLemmaCase__Group__6__Impl rule__BTSLemmaCase__Group__7 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2735:2: rule__BTSLemmaCase__Group__6__Impl rule__BTSLemmaCase__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__6__Impl_in_rule__BTSLemmaCase__Group__65418);
            rule__BTSLemmaCase__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__7_in_rule__BTSLemmaCase__Group__65421);
            rule__BTSLemmaCase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__6"


    // $ANTLR start "rule__BTSLemmaCase__Group__6__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2742:1: rule__BTSLemmaCase__Group__6__Impl : ( ( rule__BTSLemmaCase__Group_6__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2746:1: ( ( ( rule__BTSLemmaCase__Group_6__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2747:1: ( ( rule__BTSLemmaCase__Group_6__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2747:1: ( ( rule__BTSLemmaCase__Group_6__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2748:1: ( rule__BTSLemmaCase__Group_6__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_6()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2749:1: ( rule__BTSLemmaCase__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2749:2: rule__BTSLemmaCase__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_6__0_in_rule__BTSLemmaCase__Group__6__Impl5448);
                    rule__BTSLemmaCase__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__6__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__7"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2759:1: rule__BTSLemmaCase__Group__7 : rule__BTSLemmaCase__Group__7__Impl rule__BTSLemmaCase__Group__8 ;
    public final void rule__BTSLemmaCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2763:1: ( rule__BTSLemmaCase__Group__7__Impl rule__BTSLemmaCase__Group__8 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2764:2: rule__BTSLemmaCase__Group__7__Impl rule__BTSLemmaCase__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__7__Impl_in_rule__BTSLemmaCase__Group__75479);
            rule__BTSLemmaCase__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__8_in_rule__BTSLemmaCase__Group__75482);
            rule__BTSLemmaCase__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__7"


    // $ANTLR start "rule__BTSLemmaCase__Group__7__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2771:1: rule__BTSLemmaCase__Group__7__Impl : ( ( rule__BTSLemmaCase__Group_7__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2775:1: ( ( ( rule__BTSLemmaCase__Group_7__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2776:1: ( ( rule__BTSLemmaCase__Group_7__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2776:1: ( ( rule__BTSLemmaCase__Group_7__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2777:1: ( rule__BTSLemmaCase__Group_7__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_7()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2778:1: ( rule__BTSLemmaCase__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2778:2: rule__BTSLemmaCase__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_7__0_in_rule__BTSLemmaCase__Group__7__Impl5509);
                    rule__BTSLemmaCase__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__7__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__8"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2788:1: rule__BTSLemmaCase__Group__8 : rule__BTSLemmaCase__Group__8__Impl rule__BTSLemmaCase__Group__9 ;
    public final void rule__BTSLemmaCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2792:1: ( rule__BTSLemmaCase__Group__8__Impl rule__BTSLemmaCase__Group__9 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2793:2: rule__BTSLemmaCase__Group__8__Impl rule__BTSLemmaCase__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__8__Impl_in_rule__BTSLemmaCase__Group__85540);
            rule__BTSLemmaCase__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__9_in_rule__BTSLemmaCase__Group__85543);
            rule__BTSLemmaCase__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__8"


    // $ANTLR start "rule__BTSLemmaCase__Group__8__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2800:1: rule__BTSLemmaCase__Group__8__Impl : ( ( rule__BTSLemmaCase__Group_8__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2804:1: ( ( ( rule__BTSLemmaCase__Group_8__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2805:1: ( ( rule__BTSLemmaCase__Group_8__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2805:1: ( ( rule__BTSLemmaCase__Group_8__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2806:1: ( rule__BTSLemmaCase__Group_8__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_8()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2807:1: ( rule__BTSLemmaCase__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2807:2: rule__BTSLemmaCase__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_8__0_in_rule__BTSLemmaCase__Group__8__Impl5570);
                    rule__BTSLemmaCase__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__8__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__9"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2817:1: rule__BTSLemmaCase__Group__9 : rule__BTSLemmaCase__Group__9__Impl rule__BTSLemmaCase__Group__10 ;
    public final void rule__BTSLemmaCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2821:1: ( rule__BTSLemmaCase__Group__9__Impl rule__BTSLemmaCase__Group__10 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2822:2: rule__BTSLemmaCase__Group__9__Impl rule__BTSLemmaCase__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__9__Impl_in_rule__BTSLemmaCase__Group__95601);
            rule__BTSLemmaCase__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__10_in_rule__BTSLemmaCase__Group__95604);
            rule__BTSLemmaCase__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__9"


    // $ANTLR start "rule__BTSLemmaCase__Group__9__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2829:1: rule__BTSLemmaCase__Group__9__Impl : ( ( rule__BTSLemmaCase__Group_9__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2833:1: ( ( ( rule__BTSLemmaCase__Group_9__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2834:1: ( ( rule__BTSLemmaCase__Group_9__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2834:1: ( ( rule__BTSLemmaCase__Group_9__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2835:1: ( rule__BTSLemmaCase__Group_9__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_9()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2836:1: ( rule__BTSLemmaCase__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2836:2: rule__BTSLemmaCase__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_9__0_in_rule__BTSLemmaCase__Group__9__Impl5631);
                    rule__BTSLemmaCase__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__9__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__10"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2846:1: rule__BTSLemmaCase__Group__10 : rule__BTSLemmaCase__Group__10__Impl rule__BTSLemmaCase__Group__11 ;
    public final void rule__BTSLemmaCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2850:1: ( rule__BTSLemmaCase__Group__10__Impl rule__BTSLemmaCase__Group__11 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2851:2: rule__BTSLemmaCase__Group__10__Impl rule__BTSLemmaCase__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__10__Impl_in_rule__BTSLemmaCase__Group__105662);
            rule__BTSLemmaCase__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__11_in_rule__BTSLemmaCase__Group__105665);
            rule__BTSLemmaCase__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__10"


    // $ANTLR start "rule__BTSLemmaCase__Group__10__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2858:1: rule__BTSLemmaCase__Group__10__Impl : ( ( rule__BTSLemmaCase__Group_10__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2862:1: ( ( ( rule__BTSLemmaCase__Group_10__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2863:1: ( ( rule__BTSLemmaCase__Group_10__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2863:1: ( ( rule__BTSLemmaCase__Group_10__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2864:1: ( rule__BTSLemmaCase__Group_10__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_10()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2865:1: ( rule__BTSLemmaCase__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2865:2: rule__BTSLemmaCase__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_10__0_in_rule__BTSLemmaCase__Group__10__Impl5692);
                    rule__BTSLemmaCase__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__10__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__11"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2875:1: rule__BTSLemmaCase__Group__11 : rule__BTSLemmaCase__Group__11__Impl rule__BTSLemmaCase__Group__12 ;
    public final void rule__BTSLemmaCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2879:1: ( rule__BTSLemmaCase__Group__11__Impl rule__BTSLemmaCase__Group__12 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2880:2: rule__BTSLemmaCase__Group__11__Impl rule__BTSLemmaCase__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__11__Impl_in_rule__BTSLemmaCase__Group__115723);
            rule__BTSLemmaCase__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__12_in_rule__BTSLemmaCase__Group__115726);
            rule__BTSLemmaCase__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__11"


    // $ANTLR start "rule__BTSLemmaCase__Group__11__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2887:1: rule__BTSLemmaCase__Group__11__Impl : ( ( rule__BTSLemmaCase__Group_11__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2891:1: ( ( ( rule__BTSLemmaCase__Group_11__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2892:1: ( ( rule__BTSLemmaCase__Group_11__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2892:1: ( ( rule__BTSLemmaCase__Group_11__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2893:1: ( rule__BTSLemmaCase__Group_11__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_11()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2894:1: ( rule__BTSLemmaCase__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2894:2: rule__BTSLemmaCase__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_11__0_in_rule__BTSLemmaCase__Group__11__Impl5753);
                    rule__BTSLemmaCase__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__11__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__12"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2904:1: rule__BTSLemmaCase__Group__12 : rule__BTSLemmaCase__Group__12__Impl rule__BTSLemmaCase__Group__13 ;
    public final void rule__BTSLemmaCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2908:1: ( rule__BTSLemmaCase__Group__12__Impl rule__BTSLemmaCase__Group__13 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2909:2: rule__BTSLemmaCase__Group__12__Impl rule__BTSLemmaCase__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__12__Impl_in_rule__BTSLemmaCase__Group__125784);
            rule__BTSLemmaCase__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__13_in_rule__BTSLemmaCase__Group__125787);
            rule__BTSLemmaCase__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__12"


    // $ANTLR start "rule__BTSLemmaCase__Group__12__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2916:1: rule__BTSLemmaCase__Group__12__Impl : ( ( rule__BTSLemmaCase__Group_12__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2920:1: ( ( ( rule__BTSLemmaCase__Group_12__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2921:1: ( ( rule__BTSLemmaCase__Group_12__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2921:1: ( ( rule__BTSLemmaCase__Group_12__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2922:1: ( rule__BTSLemmaCase__Group_12__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_12()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2923:1: ( rule__BTSLemmaCase__Group_12__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2923:2: rule__BTSLemmaCase__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_12__0_in_rule__BTSLemmaCase__Group__12__Impl5814);
                    rule__BTSLemmaCase__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__12__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__13"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2933:1: rule__BTSLemmaCase__Group__13 : rule__BTSLemmaCase__Group__13__Impl rule__BTSLemmaCase__Group__14 ;
    public final void rule__BTSLemmaCase__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2937:1: ( rule__BTSLemmaCase__Group__13__Impl rule__BTSLemmaCase__Group__14 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2938:2: rule__BTSLemmaCase__Group__13__Impl rule__BTSLemmaCase__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__13__Impl_in_rule__BTSLemmaCase__Group__135845);
            rule__BTSLemmaCase__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__14_in_rule__BTSLemmaCase__Group__135848);
            rule__BTSLemmaCase__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__13"


    // $ANTLR start "rule__BTSLemmaCase__Group__13__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2945:1: rule__BTSLemmaCase__Group__13__Impl : ( ( rule__BTSLemmaCase__Group_13__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2949:1: ( ( ( rule__BTSLemmaCase__Group_13__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2950:1: ( ( rule__BTSLemmaCase__Group_13__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2950:1: ( ( rule__BTSLemmaCase__Group_13__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2951:1: ( rule__BTSLemmaCase__Group_13__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_13()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2952:1: ( rule__BTSLemmaCase__Group_13__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2952:2: rule__BTSLemmaCase__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_13__0_in_rule__BTSLemmaCase__Group__13__Impl5875);
                    rule__BTSLemmaCase__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__13__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__14"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2962:1: rule__BTSLemmaCase__Group__14 : rule__BTSLemmaCase__Group__14__Impl rule__BTSLemmaCase__Group__15 ;
    public final void rule__BTSLemmaCase__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2966:1: ( rule__BTSLemmaCase__Group__14__Impl rule__BTSLemmaCase__Group__15 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2967:2: rule__BTSLemmaCase__Group__14__Impl rule__BTSLemmaCase__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__14__Impl_in_rule__BTSLemmaCase__Group__145906);
            rule__BTSLemmaCase__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__15_in_rule__BTSLemmaCase__Group__145909);
            rule__BTSLemmaCase__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__14"


    // $ANTLR start "rule__BTSLemmaCase__Group__14__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2974:1: rule__BTSLemmaCase__Group__14__Impl : ( ( rule__BTSLemmaCase__Group_14__0 )? ) ;
    public final void rule__BTSLemmaCase__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2978:1: ( ( ( rule__BTSLemmaCase__Group_14__0 )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2979:1: ( ( rule__BTSLemmaCase__Group_14__0 )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2979:1: ( ( rule__BTSLemmaCase__Group_14__0 )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2980:1: ( rule__BTSLemmaCase__Group_14__0 )?
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_14()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2981:1: ( rule__BTSLemmaCase__Group_14__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2981:2: rule__BTSLemmaCase__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__0_in_rule__BTSLemmaCase__Group__14__Impl5936);
                    rule__BTSLemmaCase__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__14__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group__15"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2991:1: rule__BTSLemmaCase__Group__15 : rule__BTSLemmaCase__Group__15__Impl ;
    public final void rule__BTSLemmaCase__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2995:1: ( rule__BTSLemmaCase__Group__15__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:2996:2: rule__BTSLemmaCase__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group__15__Impl_in_rule__BTSLemmaCase__Group__155967);
            rule__BTSLemmaCase__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__15"


    // $ANTLR start "rule__BTSLemmaCase__Group__15__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3002:1: rule__BTSLemmaCase__Group__15__Impl : ( '}' ) ;
    public final void rule__BTSLemmaCase__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3006:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3007:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3007:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3008:1: '}'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_15()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BTSLemmaCase__Group__15__Impl5995); 
             after(grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group__15__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_4__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3053:1: rule__BTSLemmaCase__Group_4__0 : rule__BTSLemmaCase__Group_4__0__Impl rule__BTSLemmaCase__Group_4__1 ;
    public final void rule__BTSLemmaCase__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3057:1: ( rule__BTSLemmaCase__Group_4__0__Impl rule__BTSLemmaCase__Group_4__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3058:2: rule__BTSLemmaCase__Group_4__0__Impl rule__BTSLemmaCase__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_4__0__Impl_in_rule__BTSLemmaCase__Group_4__06058);
            rule__BTSLemmaCase__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_4__1_in_rule__BTSLemmaCase__Group_4__06061);
            rule__BTSLemmaCase__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_4__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_4__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3065:1: rule__BTSLemmaCase__Group_4__0__Impl : ( 'state' ) ;
    public final void rule__BTSLemmaCase__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3069:1: ( ( 'state' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3070:1: ( 'state' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3070:1: ( 'state' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3071:1: 'state'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getStateKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__BTSLemmaCase__Group_4__0__Impl6089); 
             after(grammarAccess.getBTSLemmaCaseAccess().getStateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_4__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_4__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3084:1: rule__BTSLemmaCase__Group_4__1 : rule__BTSLemmaCase__Group_4__1__Impl ;
    public final void rule__BTSLemmaCase__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3088:1: ( rule__BTSLemmaCase__Group_4__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3089:2: rule__BTSLemmaCase__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_4__1__Impl_in_rule__BTSLemmaCase__Group_4__16120);
            rule__BTSLemmaCase__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_4__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_4__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3095:1: rule__BTSLemmaCase__Group_4__1__Impl : ( ( rule__BTSLemmaCase__StateAssignment_4_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3099:1: ( ( ( rule__BTSLemmaCase__StateAssignment_4_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3100:1: ( ( rule__BTSLemmaCase__StateAssignment_4_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3100:1: ( ( rule__BTSLemmaCase__StateAssignment_4_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3101:1: ( rule__BTSLemmaCase__StateAssignment_4_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getStateAssignment_4_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3102:1: ( rule__BTSLemmaCase__StateAssignment_4_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3102:2: rule__BTSLemmaCase__StateAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__StateAssignment_4_1_in_rule__BTSLemmaCase__Group_4__1__Impl6147);
            rule__BTSLemmaCase__StateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getStateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_4__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_5__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3116:1: rule__BTSLemmaCase__Group_5__0 : rule__BTSLemmaCase__Group_5__0__Impl rule__BTSLemmaCase__Group_5__1 ;
    public final void rule__BTSLemmaCase__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3120:1: ( rule__BTSLemmaCase__Group_5__0__Impl rule__BTSLemmaCase__Group_5__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3121:2: rule__BTSLemmaCase__Group_5__0__Impl rule__BTSLemmaCase__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_5__0__Impl_in_rule__BTSLemmaCase__Group_5__06181);
            rule__BTSLemmaCase__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_5__1_in_rule__BTSLemmaCase__Group_5__06184);
            rule__BTSLemmaCase__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_5__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_5__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3128:1: rule__BTSLemmaCase__Group_5__0__Impl : ( 'revisionState' ) ;
    public final void rule__BTSLemmaCase__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3132:1: ( ( 'revisionState' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3133:1: ( 'revisionState' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3133:1: ( 'revisionState' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3134:1: 'revisionState'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__BTSLemmaCase__Group_5__0__Impl6212); 
             after(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_5__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_5__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3147:1: rule__BTSLemmaCase__Group_5__1 : rule__BTSLemmaCase__Group_5__1__Impl ;
    public final void rule__BTSLemmaCase__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3151:1: ( rule__BTSLemmaCase__Group_5__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3152:2: rule__BTSLemmaCase__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_5__1__Impl_in_rule__BTSLemmaCase__Group_5__16243);
            rule__BTSLemmaCase__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_5__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_5__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3158:1: rule__BTSLemmaCase__Group_5__1__Impl : ( ( rule__BTSLemmaCase__RevisionStateAssignment_5_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3162:1: ( ( ( rule__BTSLemmaCase__RevisionStateAssignment_5_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3163:1: ( ( rule__BTSLemmaCase__RevisionStateAssignment_5_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3163:1: ( ( rule__BTSLemmaCase__RevisionStateAssignment_5_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3164:1: ( rule__BTSLemmaCase__RevisionStateAssignment_5_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateAssignment_5_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3165:1: ( rule__BTSLemmaCase__RevisionStateAssignment_5_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3165:2: rule__BTSLemmaCase__RevisionStateAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__RevisionStateAssignment_5_1_in_rule__BTSLemmaCase__Group_5__1__Impl6270);
            rule__BTSLemmaCase__RevisionStateAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_5__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_6__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3179:1: rule__BTSLemmaCase__Group_6__0 : rule__BTSLemmaCase__Group_6__0__Impl rule__BTSLemmaCase__Group_6__1 ;
    public final void rule__BTSLemmaCase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3183:1: ( rule__BTSLemmaCase__Group_6__0__Impl rule__BTSLemmaCase__Group_6__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3184:2: rule__BTSLemmaCase__Group_6__0__Impl rule__BTSLemmaCase__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_6__0__Impl_in_rule__BTSLemmaCase__Group_6__06304);
            rule__BTSLemmaCase__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_6__1_in_rule__BTSLemmaCase__Group_6__06307);
            rule__BTSLemmaCase__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_6__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_6__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3191:1: rule__BTSLemmaCase__Group_6__0__Impl : ( 'visibility' ) ;
    public final void rule__BTSLemmaCase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3195:1: ( ( 'visibility' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3196:1: ( 'visibility' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3196:1: ( 'visibility' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3197:1: 'visibility'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getVisibilityKeyword_6_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__BTSLemmaCase__Group_6__0__Impl6335); 
             after(grammarAccess.getBTSLemmaCaseAccess().getVisibilityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_6__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_6__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3210:1: rule__BTSLemmaCase__Group_6__1 : rule__BTSLemmaCase__Group_6__1__Impl ;
    public final void rule__BTSLemmaCase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3214:1: ( rule__BTSLemmaCase__Group_6__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3215:2: rule__BTSLemmaCase__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_6__1__Impl_in_rule__BTSLemmaCase__Group_6__16366);
            rule__BTSLemmaCase__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_6__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_6__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3221:1: rule__BTSLemmaCase__Group_6__1__Impl : ( ( rule__BTSLemmaCase__VisibilityAssignment_6_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3225:1: ( ( ( rule__BTSLemmaCase__VisibilityAssignment_6_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3226:1: ( ( rule__BTSLemmaCase__VisibilityAssignment_6_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3226:1: ( ( rule__BTSLemmaCase__VisibilityAssignment_6_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3227:1: ( rule__BTSLemmaCase__VisibilityAssignment_6_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getVisibilityAssignment_6_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3228:1: ( rule__BTSLemmaCase__VisibilityAssignment_6_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3228:2: rule__BTSLemmaCase__VisibilityAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__VisibilityAssignment_6_1_in_rule__BTSLemmaCase__Group_6__1__Impl6393);
            rule__BTSLemmaCase__VisibilityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getVisibilityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_6__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_7__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3242:1: rule__BTSLemmaCase__Group_7__0 : rule__BTSLemmaCase__Group_7__0__Impl rule__BTSLemmaCase__Group_7__1 ;
    public final void rule__BTSLemmaCase__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3246:1: ( rule__BTSLemmaCase__Group_7__0__Impl rule__BTSLemmaCase__Group_7__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3247:2: rule__BTSLemmaCase__Group_7__0__Impl rule__BTSLemmaCase__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_7__0__Impl_in_rule__BTSLemmaCase__Group_7__06427);
            rule__BTSLemmaCase__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_7__1_in_rule__BTSLemmaCase__Group_7__06430);
            rule__BTSLemmaCase__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_7__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_7__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3254:1: rule__BTSLemmaCase__Group_7__0__Impl : ( 'sortKey' ) ;
    public final void rule__BTSLemmaCase__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3258:1: ( ( 'sortKey' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3259:1: ( 'sortKey' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3259:1: ( 'sortKey' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3260:1: 'sortKey'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getSortKeyKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__BTSLemmaCase__Group_7__0__Impl6458); 
             after(grammarAccess.getBTSLemmaCaseAccess().getSortKeyKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_7__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_7__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3273:1: rule__BTSLemmaCase__Group_7__1 : rule__BTSLemmaCase__Group_7__1__Impl ;
    public final void rule__BTSLemmaCase__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3277:1: ( rule__BTSLemmaCase__Group_7__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3278:2: rule__BTSLemmaCase__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_7__1__Impl_in_rule__BTSLemmaCase__Group_7__16489);
            rule__BTSLemmaCase__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_7__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_7__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3284:1: rule__BTSLemmaCase__Group_7__1__Impl : ( ( rule__BTSLemmaCase__SortKeyAssignment_7_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3288:1: ( ( ( rule__BTSLemmaCase__SortKeyAssignment_7_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3289:1: ( ( rule__BTSLemmaCase__SortKeyAssignment_7_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3289:1: ( ( rule__BTSLemmaCase__SortKeyAssignment_7_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3290:1: ( rule__BTSLemmaCase__SortKeyAssignment_7_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getSortKeyAssignment_7_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3291:1: ( rule__BTSLemmaCase__SortKeyAssignment_7_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3291:2: rule__BTSLemmaCase__SortKeyAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__SortKeyAssignment_7_1_in_rule__BTSLemmaCase__Group_7__1__Impl6516);
            rule__BTSLemmaCase__SortKeyAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getSortKeyAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_7__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_8__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3305:1: rule__BTSLemmaCase__Group_8__0 : rule__BTSLemmaCase__Group_8__0__Impl rule__BTSLemmaCase__Group_8__1 ;
    public final void rule__BTSLemmaCase__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3309:1: ( rule__BTSLemmaCase__Group_8__0__Impl rule__BTSLemmaCase__Group_8__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3310:2: rule__BTSLemmaCase__Group_8__0__Impl rule__BTSLemmaCase__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_8__0__Impl_in_rule__BTSLemmaCase__Group_8__06550);
            rule__BTSLemmaCase__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_8__1_in_rule__BTSLemmaCase__Group_8__06553);
            rule__BTSLemmaCase__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_8__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_8__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3317:1: rule__BTSLemmaCase__Group_8__0__Impl : ( 'type' ) ;
    public final void rule__BTSLemmaCase__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3321:1: ( ( 'type' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3322:1: ( 'type' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3322:1: ( 'type' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3323:1: 'type'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getTypeKeyword_8_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__BTSLemmaCase__Group_8__0__Impl6581); 
             after(grammarAccess.getBTSLemmaCaseAccess().getTypeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_8__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_8__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3336:1: rule__BTSLemmaCase__Group_8__1 : rule__BTSLemmaCase__Group_8__1__Impl ;
    public final void rule__BTSLemmaCase__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3340:1: ( rule__BTSLemmaCase__Group_8__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3341:2: rule__BTSLemmaCase__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_8__1__Impl_in_rule__BTSLemmaCase__Group_8__16612);
            rule__BTSLemmaCase__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_8__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_8__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3347:1: rule__BTSLemmaCase__Group_8__1__Impl : ( ( rule__BTSLemmaCase__TypeAssignment_8_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3351:1: ( ( ( rule__BTSLemmaCase__TypeAssignment_8_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3352:1: ( ( rule__BTSLemmaCase__TypeAssignment_8_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3352:1: ( ( rule__BTSLemmaCase__TypeAssignment_8_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3353:1: ( rule__BTSLemmaCase__TypeAssignment_8_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getTypeAssignment_8_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3354:1: ( rule__BTSLemmaCase__TypeAssignment_8_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3354:2: rule__BTSLemmaCase__TypeAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__TypeAssignment_8_1_in_rule__BTSLemmaCase__Group_8__1__Impl6639);
            rule__BTSLemmaCase__TypeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getTypeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_8__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_9__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3368:1: rule__BTSLemmaCase__Group_9__0 : rule__BTSLemmaCase__Group_9__0__Impl rule__BTSLemmaCase__Group_9__1 ;
    public final void rule__BTSLemmaCase__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3372:1: ( rule__BTSLemmaCase__Group_9__0__Impl rule__BTSLemmaCase__Group_9__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3373:2: rule__BTSLemmaCase__Group_9__0__Impl rule__BTSLemmaCase__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_9__0__Impl_in_rule__BTSLemmaCase__Group_9__06673);
            rule__BTSLemmaCase__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_9__1_in_rule__BTSLemmaCase__Group_9__06676);
            rule__BTSLemmaCase__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_9__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_9__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3380:1: rule__BTSLemmaCase__Group_9__0__Impl : ( 'subtype' ) ;
    public final void rule__BTSLemmaCase__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3384:1: ( ( 'subtype' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3385:1: ( 'subtype' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3385:1: ( 'subtype' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3386:1: 'subtype'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getSubtypeKeyword_9_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BTSLemmaCase__Group_9__0__Impl6704); 
             after(grammarAccess.getBTSLemmaCaseAccess().getSubtypeKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_9__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_9__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3399:1: rule__BTSLemmaCase__Group_9__1 : rule__BTSLemmaCase__Group_9__1__Impl ;
    public final void rule__BTSLemmaCase__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3403:1: ( rule__BTSLemmaCase__Group_9__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3404:2: rule__BTSLemmaCase__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_9__1__Impl_in_rule__BTSLemmaCase__Group_9__16735);
            rule__BTSLemmaCase__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_9__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_9__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3410:1: rule__BTSLemmaCase__Group_9__1__Impl : ( ( rule__BTSLemmaCase__SubtypeAssignment_9_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3414:1: ( ( ( rule__BTSLemmaCase__SubtypeAssignment_9_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3415:1: ( ( rule__BTSLemmaCase__SubtypeAssignment_9_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3415:1: ( ( rule__BTSLemmaCase__SubtypeAssignment_9_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3416:1: ( rule__BTSLemmaCase__SubtypeAssignment_9_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getSubtypeAssignment_9_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3417:1: ( rule__BTSLemmaCase__SubtypeAssignment_9_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3417:2: rule__BTSLemmaCase__SubtypeAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__SubtypeAssignment_9_1_in_rule__BTSLemmaCase__Group_9__1__Impl6762);
            rule__BTSLemmaCase__SubtypeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getSubtypeAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_9__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_10__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3431:1: rule__BTSLemmaCase__Group_10__0 : rule__BTSLemmaCase__Group_10__0__Impl rule__BTSLemmaCase__Group_10__1 ;
    public final void rule__BTSLemmaCase__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3435:1: ( rule__BTSLemmaCase__Group_10__0__Impl rule__BTSLemmaCase__Group_10__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3436:2: rule__BTSLemmaCase__Group_10__0__Impl rule__BTSLemmaCase__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_10__0__Impl_in_rule__BTSLemmaCase__Group_10__06796);
            rule__BTSLemmaCase__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_10__1_in_rule__BTSLemmaCase__Group_10__06799);
            rule__BTSLemmaCase__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_10__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_10__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3443:1: rule__BTSLemmaCase__Group_10__0__Impl : ( 'code' ) ;
    public final void rule__BTSLemmaCase__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3447:1: ( ( 'code' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3448:1: ( 'code' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3448:1: ( 'code' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3449:1: 'code'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCodeKeyword_10_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BTSLemmaCase__Group_10__0__Impl6827); 
             after(grammarAccess.getBTSLemmaCaseAccess().getCodeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_10__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_10__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3462:1: rule__BTSLemmaCase__Group_10__1 : rule__BTSLemmaCase__Group_10__1__Impl ;
    public final void rule__BTSLemmaCase__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3466:1: ( rule__BTSLemmaCase__Group_10__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3467:2: rule__BTSLemmaCase__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_10__1__Impl_in_rule__BTSLemmaCase__Group_10__16858);
            rule__BTSLemmaCase__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_10__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_10__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3473:1: rule__BTSLemmaCase__Group_10__1__Impl : ( ( rule__BTSLemmaCase__CodeAssignment_10_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3477:1: ( ( ( rule__BTSLemmaCase__CodeAssignment_10_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3478:1: ( ( rule__BTSLemmaCase__CodeAssignment_10_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3478:1: ( ( rule__BTSLemmaCase__CodeAssignment_10_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3479:1: ( rule__BTSLemmaCase__CodeAssignment_10_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCodeAssignment_10_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3480:1: ( rule__BTSLemmaCase__CodeAssignment_10_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3480:2: rule__BTSLemmaCase__CodeAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__CodeAssignment_10_1_in_rule__BTSLemmaCase__Group_10__1__Impl6885);
            rule__BTSLemmaCase__CodeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getCodeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_10__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_11__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3494:1: rule__BTSLemmaCase__Group_11__0 : rule__BTSLemmaCase__Group_11__0__Impl rule__BTSLemmaCase__Group_11__1 ;
    public final void rule__BTSLemmaCase__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3498:1: ( rule__BTSLemmaCase__Group_11__0__Impl rule__BTSLemmaCase__Group_11__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3499:2: rule__BTSLemmaCase__Group_11__0__Impl rule__BTSLemmaCase__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_11__0__Impl_in_rule__BTSLemmaCase__Group_11__06919);
            rule__BTSLemmaCase__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_11__1_in_rule__BTSLemmaCase__Group_11__06922);
            rule__BTSLemmaCase__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_11__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_11__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3506:1: rule__BTSLemmaCase__Group_11__0__Impl : ( '_id' ) ;
    public final void rule__BTSLemmaCase__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3510:1: ( ( '_id' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3511:1: ( '_id' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3511:1: ( '_id' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3512:1: '_id'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().get_idKeyword_11_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__BTSLemmaCase__Group_11__0__Impl6950); 
             after(grammarAccess.getBTSLemmaCaseAccess().get_idKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_11__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_11__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3525:1: rule__BTSLemmaCase__Group_11__1 : rule__BTSLemmaCase__Group_11__1__Impl ;
    public final void rule__BTSLemmaCase__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3529:1: ( rule__BTSLemmaCase__Group_11__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3530:2: rule__BTSLemmaCase__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_11__1__Impl_in_rule__BTSLemmaCase__Group_11__16981);
            rule__BTSLemmaCase__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_11__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_11__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3536:1: rule__BTSLemmaCase__Group_11__1__Impl : ( ( rule__BTSLemmaCase___idAssignment_11_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3540:1: ( ( ( rule__BTSLemmaCase___idAssignment_11_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3541:1: ( ( rule__BTSLemmaCase___idAssignment_11_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3541:1: ( ( rule__BTSLemmaCase___idAssignment_11_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3542:1: ( rule__BTSLemmaCase___idAssignment_11_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().get_idAssignment_11_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3543:1: ( rule__BTSLemmaCase___idAssignment_11_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3543:2: rule__BTSLemmaCase___idAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase___idAssignment_11_1_in_rule__BTSLemmaCase__Group_11__1__Impl7008);
            rule__BTSLemmaCase___idAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().get_idAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_11__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_12__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3557:1: rule__BTSLemmaCase__Group_12__0 : rule__BTSLemmaCase__Group_12__0__Impl rule__BTSLemmaCase__Group_12__1 ;
    public final void rule__BTSLemmaCase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3561:1: ( rule__BTSLemmaCase__Group_12__0__Impl rule__BTSLemmaCase__Group_12__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3562:2: rule__BTSLemmaCase__Group_12__0__Impl rule__BTSLemmaCase__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_12__0__Impl_in_rule__BTSLemmaCase__Group_12__07042);
            rule__BTSLemmaCase__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_12__1_in_rule__BTSLemmaCase__Group_12__07045);
            rule__BTSLemmaCase__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_12__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_12__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3569:1: rule__BTSLemmaCase__Group_12__0__Impl : ( 'comment' ) ;
    public final void rule__BTSLemmaCase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3573:1: ( ( 'comment' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3574:1: ( 'comment' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3574:1: ( 'comment' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3575:1: 'comment'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCommentKeyword_12_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__BTSLemmaCase__Group_12__0__Impl7073); 
             after(grammarAccess.getBTSLemmaCaseAccess().getCommentKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_12__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_12__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3588:1: rule__BTSLemmaCase__Group_12__1 : rule__BTSLemmaCase__Group_12__1__Impl ;
    public final void rule__BTSLemmaCase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3592:1: ( rule__BTSLemmaCase__Group_12__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3593:2: rule__BTSLemmaCase__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_12__1__Impl_in_rule__BTSLemmaCase__Group_12__17104);
            rule__BTSLemmaCase__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_12__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_12__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3599:1: rule__BTSLemmaCase__Group_12__1__Impl : ( ( rule__BTSLemmaCase__CommentAssignment_12_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3603:1: ( ( ( rule__BTSLemmaCase__CommentAssignment_12_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3604:1: ( ( rule__BTSLemmaCase__CommentAssignment_12_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3604:1: ( ( rule__BTSLemmaCase__CommentAssignment_12_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3605:1: ( rule__BTSLemmaCase__CommentAssignment_12_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCommentAssignment_12_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3606:1: ( rule__BTSLemmaCase__CommentAssignment_12_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3606:2: rule__BTSLemmaCase__CommentAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__CommentAssignment_12_1_in_rule__BTSLemmaCase__Group_12__1__Impl7131);
            rule__BTSLemmaCase__CommentAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getCommentAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_12__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_13__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3620:1: rule__BTSLemmaCase__Group_13__0 : rule__BTSLemmaCase__Group_13__0__Impl rule__BTSLemmaCase__Group_13__1 ;
    public final void rule__BTSLemmaCase__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3624:1: ( rule__BTSLemmaCase__Group_13__0__Impl rule__BTSLemmaCase__Group_13__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3625:2: rule__BTSLemmaCase__Group_13__0__Impl rule__BTSLemmaCase__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_13__0__Impl_in_rule__BTSLemmaCase__Group_13__07165);
            rule__BTSLemmaCase__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_13__1_in_rule__BTSLemmaCase__Group_13__07168);
            rule__BTSLemmaCase__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_13__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_13__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3632:1: rule__BTSLemmaCase__Group_13__0__Impl : ( 'parentId' ) ;
    public final void rule__BTSLemmaCase__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3636:1: ( ( 'parentId' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3637:1: ( 'parentId' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3637:1: ( 'parentId' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3638:1: 'parentId'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getParentIdKeyword_13_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__BTSLemmaCase__Group_13__0__Impl7196); 
             after(grammarAccess.getBTSLemmaCaseAccess().getParentIdKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_13__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_13__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3651:1: rule__BTSLemmaCase__Group_13__1 : rule__BTSLemmaCase__Group_13__1__Impl ;
    public final void rule__BTSLemmaCase__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3655:1: ( rule__BTSLemmaCase__Group_13__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3656:2: rule__BTSLemmaCase__Group_13__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_13__1__Impl_in_rule__BTSLemmaCase__Group_13__17227);
            rule__BTSLemmaCase__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_13__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_13__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3662:1: rule__BTSLemmaCase__Group_13__1__Impl : ( ( rule__BTSLemmaCase__ParentIdAssignment_13_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3666:1: ( ( ( rule__BTSLemmaCase__ParentIdAssignment_13_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3667:1: ( ( rule__BTSLemmaCase__ParentIdAssignment_13_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3667:1: ( ( rule__BTSLemmaCase__ParentIdAssignment_13_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3668:1: ( rule__BTSLemmaCase__ParentIdAssignment_13_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getParentIdAssignment_13_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3669:1: ( rule__BTSLemmaCase__ParentIdAssignment_13_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3669:2: rule__BTSLemmaCase__ParentIdAssignment_13_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__ParentIdAssignment_13_1_in_rule__BTSLemmaCase__Group_13__1__Impl7254);
            rule__BTSLemmaCase__ParentIdAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getParentIdAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_13__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3683:1: rule__BTSLemmaCase__Group_14__0 : rule__BTSLemmaCase__Group_14__0__Impl rule__BTSLemmaCase__Group_14__1 ;
    public final void rule__BTSLemmaCase__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3687:1: ( rule__BTSLemmaCase__Group_14__0__Impl rule__BTSLemmaCase__Group_14__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3688:2: rule__BTSLemmaCase__Group_14__0__Impl rule__BTSLemmaCase__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__0__Impl_in_rule__BTSLemmaCase__Group_14__07288);
            rule__BTSLemmaCase__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__1_in_rule__BTSLemmaCase__Group_14__07291);
            rule__BTSLemmaCase__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3695:1: rule__BTSLemmaCase__Group_14__0__Impl : ( 'scenario' ) ;
    public final void rule__BTSLemmaCase__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3699:1: ( ( 'scenario' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3700:1: ( 'scenario' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3700:1: ( 'scenario' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3701:1: 'scenario'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getScenarioKeyword_14_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__BTSLemmaCase__Group_14__0__Impl7319); 
             after(grammarAccess.getBTSLemmaCaseAccess().getScenarioKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3714:1: rule__BTSLemmaCase__Group_14__1 : rule__BTSLemmaCase__Group_14__1__Impl rule__BTSLemmaCase__Group_14__2 ;
    public final void rule__BTSLemmaCase__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3718:1: ( rule__BTSLemmaCase__Group_14__1__Impl rule__BTSLemmaCase__Group_14__2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3719:2: rule__BTSLemmaCase__Group_14__1__Impl rule__BTSLemmaCase__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__1__Impl_in_rule__BTSLemmaCase__Group_14__17350);
            rule__BTSLemmaCase__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__2_in_rule__BTSLemmaCase__Group_14__17353);
            rule__BTSLemmaCase__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3726:1: rule__BTSLemmaCase__Group_14__1__Impl : ( '{' ) ;
    public final void rule__BTSLemmaCase__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3730:1: ( ( '{' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3731:1: ( '{' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3731:1: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3732:1: '{'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_14_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BTSLemmaCase__Group_14__1__Impl7381); 
             after(grammarAccess.getBTSLemmaCaseAccess().getLeftCurlyBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__1__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3745:1: rule__BTSLemmaCase__Group_14__2 : rule__BTSLemmaCase__Group_14__2__Impl rule__BTSLemmaCase__Group_14__3 ;
    public final void rule__BTSLemmaCase__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3749:1: ( rule__BTSLemmaCase__Group_14__2__Impl rule__BTSLemmaCase__Group_14__3 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3750:2: rule__BTSLemmaCase__Group_14__2__Impl rule__BTSLemmaCase__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__2__Impl_in_rule__BTSLemmaCase__Group_14__27412);
            rule__BTSLemmaCase__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__3_in_rule__BTSLemmaCase__Group_14__27415);
            rule__BTSLemmaCase__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__2"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__2__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3757:1: rule__BTSLemmaCase__Group_14__2__Impl : ( ( rule__BTSLemmaCase__ScenarioAssignment_14_2 ) ) ;
    public final void rule__BTSLemmaCase__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3761:1: ( ( ( rule__BTSLemmaCase__ScenarioAssignment_14_2 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3762:1: ( ( rule__BTSLemmaCase__ScenarioAssignment_14_2 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3762:1: ( ( rule__BTSLemmaCase__ScenarioAssignment_14_2 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3763:1: ( rule__BTSLemmaCase__ScenarioAssignment_14_2 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getScenarioAssignment_14_2()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3764:1: ( rule__BTSLemmaCase__ScenarioAssignment_14_2 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3764:2: rule__BTSLemmaCase__ScenarioAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__ScenarioAssignment_14_2_in_rule__BTSLemmaCase__Group_14__2__Impl7442);
            rule__BTSLemmaCase__ScenarioAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getScenarioAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__2__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__3"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3774:1: rule__BTSLemmaCase__Group_14__3 : rule__BTSLemmaCase__Group_14__3__Impl rule__BTSLemmaCase__Group_14__4 ;
    public final void rule__BTSLemmaCase__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3778:1: ( rule__BTSLemmaCase__Group_14__3__Impl rule__BTSLemmaCase__Group_14__4 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3779:2: rule__BTSLemmaCase__Group_14__3__Impl rule__BTSLemmaCase__Group_14__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__3__Impl_in_rule__BTSLemmaCase__Group_14__37472);
            rule__BTSLemmaCase__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__4_in_rule__BTSLemmaCase__Group_14__37475);
            rule__BTSLemmaCase__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__3"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__3__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3786:1: rule__BTSLemmaCase__Group_14__3__Impl : ( ( rule__BTSLemmaCase__Group_14_3__0 )* ) ;
    public final void rule__BTSLemmaCase__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3790:1: ( ( ( rule__BTSLemmaCase__Group_14_3__0 )* ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3791:1: ( ( rule__BTSLemmaCase__Group_14_3__0 )* )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3791:1: ( ( rule__BTSLemmaCase__Group_14_3__0 )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3792:1: ( rule__BTSLemmaCase__Group_14_3__0 )*
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getGroup_14_3()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3793:1: ( rule__BTSLemmaCase__Group_14_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==31) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3793:2: rule__BTSLemmaCase__Group_14_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14_3__0_in_rule__BTSLemmaCase__Group_14__3__Impl7502);
            	    rule__BTSLemmaCase__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getBTSLemmaCaseAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__3__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__4"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3803:1: rule__BTSLemmaCase__Group_14__4 : rule__BTSLemmaCase__Group_14__4__Impl ;
    public final void rule__BTSLemmaCase__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3807:1: ( rule__BTSLemmaCase__Group_14__4__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3808:2: rule__BTSLemmaCase__Group_14__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14__4__Impl_in_rule__BTSLemmaCase__Group_14__47533);
            rule__BTSLemmaCase__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__4"


    // $ANTLR start "rule__BTSLemmaCase__Group_14__4__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3814:1: rule__BTSLemmaCase__Group_14__4__Impl : ( '}' ) ;
    public final void rule__BTSLemmaCase__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3818:1: ( ( '}' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3819:1: ( '}' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3819:1: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3820:1: '}'
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_14_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BTSLemmaCase__Group_14__4__Impl7561); 
             after(grammarAccess.getBTSLemmaCaseAccess().getRightCurlyBracketKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14__4__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14_3__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3843:1: rule__BTSLemmaCase__Group_14_3__0 : rule__BTSLemmaCase__Group_14_3__0__Impl rule__BTSLemmaCase__Group_14_3__1 ;
    public final void rule__BTSLemmaCase__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3847:1: ( rule__BTSLemmaCase__Group_14_3__0__Impl rule__BTSLemmaCase__Group_14_3__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3848:2: rule__BTSLemmaCase__Group_14_3__0__Impl rule__BTSLemmaCase__Group_14_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14_3__0__Impl_in_rule__BTSLemmaCase__Group_14_3__07602);
            rule__BTSLemmaCase__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14_3__1_in_rule__BTSLemmaCase__Group_14_3__07605);
            rule__BTSLemmaCase__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14_3__0"


    // $ANTLR start "rule__BTSLemmaCase__Group_14_3__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3855:1: rule__BTSLemmaCase__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__BTSLemmaCase__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3859:1: ( ( ',' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3860:1: ( ',' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3860:1: ( ',' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3861:1: ','
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCommaKeyword_14_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BTSLemmaCase__Group_14_3__0__Impl7633); 
             after(grammarAccess.getBTSLemmaCaseAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14_3__0__Impl"


    // $ANTLR start "rule__BTSLemmaCase__Group_14_3__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3874:1: rule__BTSLemmaCase__Group_14_3__1 : rule__BTSLemmaCase__Group_14_3__1__Impl ;
    public final void rule__BTSLemmaCase__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3878:1: ( rule__BTSLemmaCase__Group_14_3__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3879:2: rule__BTSLemmaCase__Group_14_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__Group_14_3__1__Impl_in_rule__BTSLemmaCase__Group_14_3__17664);
            rule__BTSLemmaCase__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14_3__1"


    // $ANTLR start "rule__BTSLemmaCase__Group_14_3__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3885:1: rule__BTSLemmaCase__Group_14_3__1__Impl : ( ( rule__BTSLemmaCase__ScenarioAssignment_14_3_1 ) ) ;
    public final void rule__BTSLemmaCase__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3889:1: ( ( ( rule__BTSLemmaCase__ScenarioAssignment_14_3_1 ) ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3890:1: ( ( rule__BTSLemmaCase__ScenarioAssignment_14_3_1 ) )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3890:1: ( ( rule__BTSLemmaCase__ScenarioAssignment_14_3_1 ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3891:1: ( rule__BTSLemmaCase__ScenarioAssignment_14_3_1 )
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getScenarioAssignment_14_3_1()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3892:1: ( rule__BTSLemmaCase__ScenarioAssignment_14_3_1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3892:2: rule__BTSLemmaCase__ScenarioAssignment_14_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BTSLemmaCase__ScenarioAssignment_14_3_1_in_rule__BTSLemmaCase__Group_14_3__1__Impl7691);
            rule__BTSLemmaCase__ScenarioAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBTSLemmaCaseAccess().getScenarioAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__Group_14_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3906:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3910:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3911:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07725);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07728);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3918:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3922:1: ( ( ( '-' )? ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3923:1: ( ( '-' )? )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3923:1: ( ( '-' )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3924:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3925:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3926:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EInt__Group__0__Impl7757); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3937:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3941:1: ( rule__EInt__Group__1__Impl )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3942:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17790);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3948:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3952:1: ( ( RULE_INT ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3953:1: ( RULE_INT )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3953:1: ( RULE_INT )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3954:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7817); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__BTSTextContent__TextItemsAssignment_1_0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3975:1: rule__BTSTextContent__TextItemsAssignment_1_0 : ( ruleBTSTextItems ) ;
    public final void rule__BTSTextContent__TextItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3979:1: ( ( ruleBTSTextItems ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3980:1: ( ruleBTSTextItems )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3980:1: ( ruleBTSTextItems )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3981:1: ruleBTSTextItems
            {
             before(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_rule__BTSTextContent__TextItemsAssignment_1_07860);
            ruleBTSTextItems();

            state._fsp--;

             after(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__TextItemsAssignment_1_0"


    // $ANTLR start "rule__BTSTextContent__TextItemsAssignment_1_1_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3990:1: rule__BTSTextContent__TextItemsAssignment_1_1_1_1 : ( ruleBTSTextItems ) ;
    public final void rule__BTSTextContent__TextItemsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3994:1: ( ( ruleBTSTextItems ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3995:1: ( ruleBTSTextItems )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3995:1: ( ruleBTSTextItems )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:3996:1: ruleBTSTextItems
            {
             before(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_rule__BTSTextContent__TextItemsAssignment_1_1_1_17891);
            ruleBTSTextItems();

            state._fsp--;

             after(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__TextItemsAssignment_1_1_1_1"


    // $ANTLR start "rule__BTSTextContent__TextItemsAssignment_1_2_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4005:1: rule__BTSTextContent__TextItemsAssignment_1_2_1 : ( ruleBTSTextItems ) ;
    public final void rule__BTSTextContent__TextItemsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4009:1: ( ( ruleBTSTextItems ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4010:1: ( ruleBTSTextItems )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4010:1: ( ruleBTSTextItems )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4011:1: ruleBTSTextItems
            {
             before(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSTextItems_in_rule__BTSTextContent__TextItemsAssignment_1_2_17922);
            ruleBTSTextItems();

            state._fsp--;

             after(grammarAccess.getBTSTextContentAccess().getTextItemsBTSTextItemsParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSTextContent__TextItemsAssignment_1_2_1"


    // $ANTLR start "rule__BTSSenctence__SentenceItemsAssignment_2_0"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4020:1: rule__BTSSenctence__SentenceItemsAssignment_2_0 : ( ruleBTSSentenceItem ) ;
    public final void rule__BTSSenctence__SentenceItemsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4024:1: ( ( ruleBTSSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4025:1: ( ruleBTSSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4025:1: ( ruleBTSSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4026:1: ruleBTSSentenceItem
            {
             before(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_rule__BTSSenctence__SentenceItemsAssignment_2_07953);
            ruleBTSSentenceItem();

            state._fsp--;

             after(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__SentenceItemsAssignment_2_0"


    // $ANTLR start "rule__BTSSenctence__SentenceItemsAssignment_2_1_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4035:1: rule__BTSSenctence__SentenceItemsAssignment_2_1_1 : ( ruleBTSSentenceItem ) ;
    public final void rule__BTSSenctence__SentenceItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4039:1: ( ( ruleBTSSentenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4040:1: ( ruleBTSSentenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4040:1: ( ruleBTSSentenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4041:1: ruleBTSSentenceItem
            {
             before(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSSentenceItem_in_rule__BTSSenctence__SentenceItemsAssignment_2_1_17984);
            ruleBTSSentenceItem();

            state._fsp--;

             after(grammarAccess.getBTSSenctenceAccess().getSentenceItemsBTSSentenceItemParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSSenctence__SentenceItemsAssignment_2_1_1"


    // $ANTLR start "rule__BTSWord__WCharAssignment_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4050:1: rule__BTSWord__WCharAssignment_1 : ( ruleEString ) ;
    public final void rule__BTSWord__WCharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4054:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4055:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4055:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4056:1: ruleEString
            {
             before(grammarAccess.getBTSWordAccess().getWCharEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSWord__WCharAssignment_18015);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSWordAccess().getWCharEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSWord__WCharAssignment_1"


    // $ANTLR start "rule__BTSMarker__ValueAssignment_2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4065:1: rule__BTSMarker__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__BTSMarker__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4069:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4070:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4070:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4071:1: ruleEString
            {
             before(grammarAccess.getBTSMarkerAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSMarker__ValueAssignment_28046);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSMarkerAccess().getValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSMarker__ValueAssignment_2"


    // $ANTLR start "rule__BTSAmbivalence__StateAssignment_3_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4080:1: rule__BTSAmbivalence__StateAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__StateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4084:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4085:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4085:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4086:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getStateEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__StateAssignment_3_18077);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getStateEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__StateAssignment_3_1"


    // $ANTLR start "rule__BTSAmbivalence__RevisionStateAssignment_4_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4095:1: rule__BTSAmbivalence__RevisionStateAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__RevisionStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4099:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4100:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4100:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4101:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__RevisionStateAssignment_4_18108);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getRevisionStateEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__RevisionStateAssignment_4_1"


    // $ANTLR start "rule__BTSAmbivalence__VisibilityAssignment_5_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4110:1: rule__BTSAmbivalence__VisibilityAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__VisibilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4114:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4115:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4115:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4116:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getVisibilityEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__VisibilityAssignment_5_18139);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getVisibilityEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__VisibilityAssignment_5_1"


    // $ANTLR start "rule__BTSAmbivalence__SortKeyAssignment_6_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4125:1: rule__BTSAmbivalence__SortKeyAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__BTSAmbivalence__SortKeyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4129:1: ( ( ruleEInt ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4130:1: ( ruleEInt )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4130:1: ( ruleEInt )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4131:1: ruleEInt
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getSortKeyEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__BTSAmbivalence__SortKeyAssignment_6_18170);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getSortKeyEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__SortKeyAssignment_6_1"


    // $ANTLR start "rule__BTSAmbivalence__TypeAssignment_7_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4140:1: rule__BTSAmbivalence__TypeAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4144:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4145:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4145:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4146:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getTypeEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__TypeAssignment_7_18201);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getTypeEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__TypeAssignment_7_1"


    // $ANTLR start "rule__BTSAmbivalence__SubtypeAssignment_8_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4155:1: rule__BTSAmbivalence__SubtypeAssignment_8_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__SubtypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4159:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4160:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4160:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4161:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getSubtypeEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__SubtypeAssignment_8_18232);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getSubtypeEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__SubtypeAssignment_8_1"


    // $ANTLR start "rule__BTSAmbivalence__CodeAssignment_9_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4170:1: rule__BTSAmbivalence__CodeAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__CodeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4174:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4175:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4175:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4176:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCodeEStringParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__CodeAssignment_9_18263);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getCodeEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__CodeAssignment_9_1"


    // $ANTLR start "rule__BTSAmbivalence___idAssignment_10_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4185:1: rule__BTSAmbivalence___idAssignment_10_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence___idAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4189:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4190:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4190:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4191:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().get_idEStringParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence___idAssignment_10_18294);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().get_idEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence___idAssignment_10_1"


    // $ANTLR start "rule__BTSAmbivalence__CommentAssignment_11_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4200:1: rule__BTSAmbivalence__CommentAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__CommentAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4204:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4205:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4205:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4206:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCommentEStringParserRuleCall_11_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__CommentAssignment_11_18325);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getCommentEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__CommentAssignment_11_1"


    // $ANTLR start "rule__BTSAmbivalence__ParentIdAssignment_12_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4215:1: rule__BTSAmbivalence__ParentIdAssignment_12_1 : ( ruleEString ) ;
    public final void rule__BTSAmbivalence__ParentIdAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4219:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4220:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4220:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4221:1: ruleEString
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getParentIdEStringParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSAmbivalence__ParentIdAssignment_12_18356);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getParentIdEStringParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__ParentIdAssignment_12_1"


    // $ANTLR start "rule__BTSAmbivalence__CasesAssignment_13_2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4230:1: rule__BTSAmbivalence__CasesAssignment_13_2 : ( ruleBTSLemmaCase ) ;
    public final void rule__BTSAmbivalence__CasesAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4234:1: ( ( ruleBTSLemmaCase ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4235:1: ( ruleBTSLemmaCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4235:1: ( ruleBTSLemmaCase )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4236:1: ruleBTSLemmaCase
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_rule__BTSAmbivalence__CasesAssignment_13_28387);
            ruleBTSLemmaCase();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__CasesAssignment_13_2"


    // $ANTLR start "rule__BTSAmbivalence__CasesAssignment_13_3_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4245:1: rule__BTSAmbivalence__CasesAssignment_13_3_1 : ( ruleBTSLemmaCase ) ;
    public final void rule__BTSAmbivalence__CasesAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4249:1: ( ( ruleBTSLemmaCase ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4250:1: ( ruleBTSLemmaCase )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4250:1: ( ruleBTSLemmaCase )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4251:1: ruleBTSLemmaCase
            {
             before(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_13_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSLemmaCase_in_rule__BTSAmbivalence__CasesAssignment_13_3_18418);
            ruleBTSLemmaCase();

            state._fsp--;

             after(grammarAccess.getBTSAmbivalenceAccess().getCasesBTSLemmaCaseParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSAmbivalence__CasesAssignment_13_3_1"


    // $ANTLR start "rule__BTSLemmaCase__NameAssignment_2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4260:1: rule__BTSLemmaCase__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4264:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4265:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4265:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4266:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__NameAssignment_28449);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__NameAssignment_2"


    // $ANTLR start "rule__BTSLemmaCase__StateAssignment_4_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4275:1: rule__BTSLemmaCase__StateAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__StateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4279:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4280:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4280:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4281:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getStateEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__StateAssignment_4_18480);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getStateEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__StateAssignment_4_1"


    // $ANTLR start "rule__BTSLemmaCase__RevisionStateAssignment_5_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4290:1: rule__BTSLemmaCase__RevisionStateAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__RevisionStateAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4294:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4295:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4295:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4296:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__RevisionStateAssignment_5_18511);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getRevisionStateEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__RevisionStateAssignment_5_1"


    // $ANTLR start "rule__BTSLemmaCase__VisibilityAssignment_6_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4305:1: rule__BTSLemmaCase__VisibilityAssignment_6_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__VisibilityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4309:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4310:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4310:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4311:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getVisibilityEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__VisibilityAssignment_6_18542);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getVisibilityEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__VisibilityAssignment_6_1"


    // $ANTLR start "rule__BTSLemmaCase__SortKeyAssignment_7_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4320:1: rule__BTSLemmaCase__SortKeyAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__BTSLemmaCase__SortKeyAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4324:1: ( ( ruleEInt ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4325:1: ( ruleEInt )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4325:1: ( ruleEInt )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4326:1: ruleEInt
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getSortKeyEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__BTSLemmaCase__SortKeyAssignment_7_18573);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getSortKeyEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__SortKeyAssignment_7_1"


    // $ANTLR start "rule__BTSLemmaCase__TypeAssignment_8_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4335:1: rule__BTSLemmaCase__TypeAssignment_8_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4339:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4340:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4340:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4341:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getTypeEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__TypeAssignment_8_18604);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getTypeEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__TypeAssignment_8_1"


    // $ANTLR start "rule__BTSLemmaCase__SubtypeAssignment_9_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4350:1: rule__BTSLemmaCase__SubtypeAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__SubtypeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4354:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4355:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4355:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4356:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getSubtypeEStringParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__SubtypeAssignment_9_18635);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getSubtypeEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__SubtypeAssignment_9_1"


    // $ANTLR start "rule__BTSLemmaCase__CodeAssignment_10_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4365:1: rule__BTSLemmaCase__CodeAssignment_10_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__CodeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4369:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4370:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4370:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4371:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCodeEStringParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__CodeAssignment_10_18666);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getCodeEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__CodeAssignment_10_1"


    // $ANTLR start "rule__BTSLemmaCase___idAssignment_11_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4380:1: rule__BTSLemmaCase___idAssignment_11_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase___idAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4384:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4385:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4385:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4386:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().get_idEStringParserRuleCall_11_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase___idAssignment_11_18697);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().get_idEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase___idAssignment_11_1"


    // $ANTLR start "rule__BTSLemmaCase__CommentAssignment_12_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4395:1: rule__BTSLemmaCase__CommentAssignment_12_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__CommentAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4399:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4400:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4400:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4401:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getCommentEStringParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__CommentAssignment_12_18728);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getCommentEStringParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__CommentAssignment_12_1"


    // $ANTLR start "rule__BTSLemmaCase__ParentIdAssignment_13_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4410:1: rule__BTSLemmaCase__ParentIdAssignment_13_1 : ( ruleEString ) ;
    public final void rule__BTSLemmaCase__ParentIdAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4414:1: ( ( ruleEString ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4415:1: ( ruleEString )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4415:1: ( ruleEString )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4416:1: ruleEString
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getParentIdEStringParserRuleCall_13_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BTSLemmaCase__ParentIdAssignment_13_18759);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getParentIdEStringParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__ParentIdAssignment_13_1"


    // $ANTLR start "rule__BTSLemmaCase__ScenarioAssignment_14_2"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4425:1: rule__BTSLemmaCase__ScenarioAssignment_14_2 : ( ruleBTSAmbivalenceItem ) ;
    public final void rule__BTSLemmaCase__ScenarioAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4429:1: ( ( ruleBTSAmbivalenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4430:1: ( ruleBTSAmbivalenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4430:1: ( ruleBTSAmbivalenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4431:1: ruleBTSAmbivalenceItem
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_rule__BTSLemmaCase__ScenarioAssignment_14_28790);
            ruleBTSAmbivalenceItem();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__ScenarioAssignment_14_2"


    // $ANTLR start "rule__BTSLemmaCase__ScenarioAssignment_14_3_1"
    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4440:1: rule__BTSLemmaCase__ScenarioAssignment_14_3_1 : ( ruleBTSAmbivalenceItem ) ;
    public final void rule__BTSLemmaCase__ScenarioAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4444:1: ( ( ruleBTSAmbivalenceItem ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4445:1: ( ruleBTSAmbivalenceItem )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4445:1: ( ruleBTSAmbivalenceItem )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4446:1: ruleBTSAmbivalenceItem
            {
             before(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBTSAmbivalenceItem_in_rule__BTSLemmaCase__ScenarioAssignment_14_3_18821);
            ruleBTSAmbivalenceItem();

            state._fsp--;

             after(grammarAccess.getBTSLemmaCaseAccess().getScenarioBTSAmbivalenceItemParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BTSLemmaCase__ScenarioAssignment_14_3_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\u01b8\uffff";
    static final String DFA7_eofS =
        "\1\2\u01b7\uffff";
    static final String DFA7_minS =
        "\1\13\1\15\2\uffff\2\4\1\22\2\13\1\4\1\22\1\uffff\2\20\1\uffff"+
        "\1\23\1\4\2\20\1\13\1\23\3\4\1\6\6\4\1\22\1\uffff\2\13\1\4\1\22"+
        "\3\4\1\6\6\4\1\22\1\13\6\23\1\6\15\23\1\40\2\20\1\13\7\23\1\6\15"+
        "\23\1\40\4\4\1\6\6\4\1\22\1\13\1\4\2\22\6\23\1\6\15\23\1\40\2\22"+
        "\1\23\1\4\1\23\3\4\1\6\6\4\1\22\1\23\2\22\3\4\1\6\6\4\1\22\7\23"+
        "\1\6\15\23\1\4\1\40\10\23\1\6\15\23\1\4\1\40\3\23\5\4\1\6\6\4\1"+
        "\22\3\23\3\4\1\23\2\20\1\23\2\22\6\23\1\6\15\23\1\4\1\40\1\23\1"+
        "\4\1\23\2\20\1\23\2\22\2\23\1\4\3\23\2\4\2\23\1\4\1\23\2\20\1\23"+
        "\3\4\1\6\6\4\1\22\1\23\1\4\1\23\2\20\1\23\2\22\2\20\1\23\3\4\1\6"+
        "\6\4\1\22\7\23\1\6\15\23\1\4\2\23\1\4\7\23\1\6\15\23\1\4\2\23\1"+
        "\4\2\20\1\23\3\4\1\6\6\4\1\22\3\23\2\4\1\23\2\20\7\23\1\6\15\23"+
        "\2\4\1\23\2\20\3\23\1\4\2\23\1\4\2\23\1\4\2\20\1\23\1\4\1\23\2\20"+
        "\1\23\2\20\3\23\1\4\2\20\1\23";
    static final String DFA7_maxS =
        "\2\21\2\uffff\1\21\1\20\1\22\2\16\1\20\1\22\1\uffff\2\20\1\uffff"+
        "\1\36\1\21\2\20\1\16\1\36\3\5\1\42\6\5\1\22\1\uffff\2\16\1\20\1"+
        "\22\3\5\1\42\6\5\1\22\1\16\6\36\1\6\15\36\1\40\2\20\1\16\7\36\1"+
        "\6\15\36\1\40\4\5\1\42\6\5\1\22\1\16\1\5\2\22\6\36\1\6\15\36\1\40"+
        "\2\22\1\41\1\5\1\41\3\5\1\42\6\5\1\22\1\37\2\22\3\5\1\42\6\5\1\22"+
        "\1\37\6\41\1\6\15\41\1\17\1\40\1\23\7\41\1\6\15\41\1\17\1\40\1\23"+
        "\2\37\1\20\4\5\1\42\6\5\1\22\3\37\1\20\1\5\1\17\1\23\2\20\1\37\2"+
        "\22\6\41\1\6\15\41\1\17\1\40\1\23\1\17\1\23\2\20\1\37\2\22\2\37"+
        "\1\20\1\41\2\37\1\20\1\5\2\37\1\20\1\41\2\20\1\37\3\5\1\42\6\5\1"+
        "\22\1\37\1\17\1\23\2\20\1\37\2\22\2\20\1\37\3\5\1\42\6\5\1\22\1"+
        "\37\6\41\1\6\15\41\1\17\2\37\1\20\7\41\1\6\15\41\1\17\2\37\3\20"+
        "\1\37\3\5\1\42\6\5\1\22\3\37\1\20\1\17\1\23\2\20\1\37\6\41\1\6\15"+
        "\41\2\17\1\23\2\20\3\37\1\20\2\37\1\20\2\37\3\20\1\37\1\17\1\23"+
        "\2\20\1\37\2\20\3\37\3\20\1\37";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\1\7\uffff\1\1\2\uffff\1\1\21\uffff\1\1\u0197\uffff";
    static final String DFA7_specialS =
        "\u01b8\uffff}>";
    static final String[] DFA7_transitionS = {
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
            "\1\40\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1"+
            "\37",
            "\1\41\1\42\11\uffff\1\43\1\uffff\1\44",
            "\1\23",
            "\1\23",
            "\1\20\2\uffff\1\13",
            "\1\60\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1"+
            "\57",
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
            "\1\40\1\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37",
            "\1\40\1\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37",
            "\1\40\2\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\2\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\3\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\3\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\70",
            "\1\40\4\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\5\uffff\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\5\uffff\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\6\uffff\1\33\1\34\1\35\1\36\1\37",
            "\1\40\6\uffff\1\33\1\34\1\35\1\36\1\37",
            "\1\40\7\uffff\1\34\1\35\1\36\1\37",
            "\1\40\7\uffff\1\34\1\35\1\36\1\37",
            "\1\40\10\uffff\1\35\1\36\1\37",
            "\1\40\10\uffff\1\35\1\36\1\37",
            "\1\40\11\uffff\1\36\1\37",
            "\1\40\11\uffff\1\36\1\37",
            "\1\40\12\uffff\1\37",
            "\1\40\12\uffff\1\37",
            "\1\137",
            "\1\110",
            "\1\110",
            "\1\20\2\uffff\1\13",
            "\1\153\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150"+
            "\1\151\1\152",
            "\1\60\1\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57",
            "\1\60\1\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57",
            "\1\60\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\3\uffff\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\3\uffff\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\121",
            "\1\60\4\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\5\uffff\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\5\uffff\1\52\1\53\1\54\1\55\1\56\1\57",
            "\1\60\6\uffff\1\53\1\54\1\55\1\56\1\57",
            "\1\60\6\uffff\1\53\1\54\1\55\1\56\1\57",
            "\1\60\7\uffff\1\54\1\55\1\56\1\57",
            "\1\60\7\uffff\1\54\1\55\1\56\1\57",
            "\1\60\10\uffff\1\55\1\56\1\57",
            "\1\60\10\uffff\1\55\1\56\1\57",
            "\1\60\11\uffff\1\56\1\57",
            "\1\60\11\uffff\1\56\1\57",
            "\1\60\12\uffff\1\57",
            "\1\60\12\uffff\1\57",
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
            "\1\153\1\uffff\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1"+
            "\150\1\151\1\152",
            "\1\153\1\uffff\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1"+
            "\150\1\151\1\152",
            "\1\153\2\uffff\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1"+
            "\151\1\152",
            "\1\153\2\uffff\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1"+
            "\151\1\152",
            "\1\153\3\uffff\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1"+
            "\152",
            "\1\153\3\uffff\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1"+
            "\152",
            "\1\166",
            "\1\153\4\uffff\1\144\1\145\1\146\1\147\1\150\1\151\1\152",
            "\1\153\5\uffff\1\145\1\146\1\147\1\150\1\151\1\152",
            "\1\153\5\uffff\1\145\1\146\1\147\1\150\1\151\1\152",
            "\1\153\6\uffff\1\146\1\147\1\150\1\151\1\152",
            "\1\153\6\uffff\1\146\1\147\1\150\1\151\1\152",
            "\1\153\7\uffff\1\147\1\150\1\151\1\152",
            "\1\153\7\uffff\1\147\1\150\1\151\1\152",
            "\1\153\10\uffff\1\150\1\151\1\152",
            "\1\153\10\uffff\1\150\1\151\1\152",
            "\1\153\11\uffff\1\151\1\152",
            "\1\153\11\uffff\1\151\1\152",
            "\1\153\12\uffff\1\152",
            "\1\153\12\uffff\1\152",
            "\1\u0087",
            "\1\u0088",
            "\1\u0088",
            "\1\u0094\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1"+
            "\u008f\1\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0095\1\u0096",
            "\1\u00a2\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1"+
            "\u009d\1\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
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
            "\1\u00b9\13\uffff\1\u00b8",
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
            "\1\u00d1\13\uffff\1\u00d0",
            "\1\u0094\1\uffff\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1"+
            "\u008f\1\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\1\uffff\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1"+
            "\u008f\1\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\2\uffff\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1"+
            "\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\2\uffff\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1"+
            "\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\3\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\3\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u00aa",
            "\1\u0094\4\uffff\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1"+
            "\u0092\3\uffff\1\u0093",
            "\1\u0094\5\uffff\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\3"+
            "\uffff\1\u0093",
            "\1\u0094\5\uffff\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\3"+
            "\uffff\1\u0093",
            "\1\u0094\6\uffff\1\u008f\1\u0090\1\u0091\1\u0092\3\uffff\1"+
            "\u0093",
            "\1\u0094\6\uffff\1\u008f\1\u0090\1\u0091\1\u0092\3\uffff\1"+
            "\u0093",
            "\1\u0094\7\uffff\1\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\7\uffff\1\u0090\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\10\uffff\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\10\uffff\1\u0091\1\u0092\3\uffff\1\u0093",
            "\1\u0094\11\uffff\1\u0092\3\uffff\1\u0093",
            "\1\u0094\11\uffff\1\u0092\3\uffff\1\u0093",
            "\1\u0094\15\uffff\1\u0093",
            "\1\u0094\15\uffff\1\u0093",
            "\1\u00d2\1\u00d3\11\uffff\1\u00d4",
            "\1\u00d5",
            "\1\40",
            "\1\u00e1\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1"+
            "\u00dc\1\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00a2\1\uffff\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1"+
            "\u009d\1\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\1\uffff\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1"+
            "\u009d\1\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\2\uffff\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1"+
            "\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\2\uffff\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1"+
            "\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\3\uffff\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1"+
            "\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\3\uffff\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1"+
            "\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00c2",
            "\1\u00a2\4\uffff\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1"+
            "\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\5\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\3"+
            "\uffff\1\u00a1",
            "\1\u00a2\5\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\3"+
            "\uffff\1\u00a1",
            "\1\u00a2\6\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\3\uffff\1"+
            "\u00a1",
            "\1\u00a2\6\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\3\uffff\1"+
            "\u00a1",
            "\1\u00a2\7\uffff\1\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\7\uffff\1\u009e\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\10\uffff\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\10\uffff\1\u009f\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\11\uffff\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\11\uffff\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2\15\uffff\1\u00a1",
            "\1\u00a2\15\uffff\1\u00a1",
            "\1\u00e2\1\u00e3\11\uffff\1\u00e4",
            "\1\u00e5",
            "\1\60",
            "\1\u00e7\13\uffff\1\u00e6",
            "\1\u00e7\13\uffff\1\u00e6",
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
            "\1\u0103\13\uffff\1\u0102",
            "\1\u0105\13\uffff\1\u0104",
            "\1\u0105\13\uffff\1\u0104",
            "\1\u0106\1\u0107\12\uffff\1\u0108",
            "\1\u0109\1\u010a",
            "\1\u010b\1\u010c\11\uffff\1\u010d",
            "\1\u0094",
            "\1\u00ea",
            "\1\u00ea",
            "\1\u00e7\13\uffff\1\u00e6",
            "\1\u010e",
            "\1\u010e",
            "\1\u00e1\1\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1"+
            "\u00dc\1\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1"+
            "\u00dc\1\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\2\uffff\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1"+
            "\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\2\uffff\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc\1"+
            "\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\3\uffff\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1"+
            "\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\3\uffff\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1"+
            "\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00f4",
            "\1\u00e1\4\uffff\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1"+
            "\u00df\3\uffff\1\u00e0",
            "\1\u00e1\5\uffff\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\3"+
            "\uffff\1\u00e0",
            "\1\u00e1\5\uffff\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\3"+
            "\uffff\1\u00e0",
            "\1\u00e1\6\uffff\1\u00dc\1\u00dd\1\u00de\1\u00df\3\uffff\1"+
            "\u00e0",
            "\1\u00e1\6\uffff\1\u00dc\1\u00dd\1\u00de\1\u00df\3\uffff\1"+
            "\u00e0",
            "\1\u00e1\7\uffff\1\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\7\uffff\1\u00dd\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\10\uffff\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\10\uffff\1\u00de\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\11\uffff\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\11\uffff\1\u00df\3\uffff\1\u00e0",
            "\1\u00e1\15\uffff\1\u00e0",
            "\1\u00e1\15\uffff\1\u00e0",
            "\1\u010f\1\u0110\11\uffff\1\u0111",
            "\1\u0112",
            "\1\153",
            "\1\u0113\1\u0114\11\uffff\1\u0115",
            "\1\u00a2",
            "\1\u0108",
            "\1\u0108",
            "\1\u0105\13\uffff\1\u0104",
            "\1\u0116",
            "\1\u0116",
            "\1\u00e7\13\uffff\1\u00e6",
            "\1\u00e7\13\uffff\1\u00e6",
            "\1\u0117\1\u0118\12\uffff\1\u0119",
            "\1\u0125\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1"+
            "\u0120\1\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0127\13\uffff\1\u0126",
            "\1\u0127\13\uffff\1\u0126",
            "\1\u0128\1\u0129\12\uffff\1\u012a",
            "\1\u012b\1\u012c",
            "\1\u0105\13\uffff\1\u0104",
            "\1\u0105\13\uffff\1\u0104",
            "\1\u012d\1\u012e\12\uffff\1\u012f",
            "\1\u013b\1\u0130\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1"+
            "\u0136\1\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u0119",
            "\1\u0119",
            "\1\u00e7\13\uffff\1\u00e6",
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
            "\1\u00b9\13\uffff\1\u00b8",
            "\1\u0151\1\u0152\11\uffff\1\u0153",
            "\1\u00e1",
            "\1\u012a",
            "\1\u012a",
            "\1\u0127\13\uffff\1\u0126",
            "\1\u0154",
            "\1\u0154",
            "\1\u012f",
            "\1\u012f",
            "\1\u0105\13\uffff\1\u0104",
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
            "\1\u00d1\13\uffff\1\u00d0",
            "\1\u0125\1\uffff\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1"+
            "\u0120\1\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\1\uffff\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1"+
            "\u0120\1\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\2\uffff\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1"+
            "\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\2\uffff\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1"+
            "\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\3\uffff\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1"+
            "\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\3\uffff\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1"+
            "\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0143",
            "\1\u0125\4\uffff\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1"+
            "\u0123\3\uffff\1\u0124",
            "\1\u0125\5\uffff\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\3"+
            "\uffff\1\u0124",
            "\1\u0125\5\uffff\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\3"+
            "\uffff\1\u0124",
            "\1\u0125\6\uffff\1\u0120\1\u0121\1\u0122\1\u0123\3\uffff\1"+
            "\u0124",
            "\1\u0125\6\uffff\1\u0120\1\u0121\1\u0122\1\u0123\3\uffff\1"+
            "\u0124",
            "\1\u0125\7\uffff\1\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\7\uffff\1\u0121\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\10\uffff\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\10\uffff\1\u0122\1\u0123\3\uffff\1\u0124",
            "\1\u0125\11\uffff\1\u0123\3\uffff\1\u0124",
            "\1\u0125\11\uffff\1\u0123\3\uffff\1\u0124",
            "\1\u0125\15\uffff\1\u0124",
            "\1\u0125\15\uffff\1\u0124",
            "\1\u016a\1\u016b\11\uffff\1\u016c",
            "\1\u0127\13\uffff\1\u0126",
            "\1\u0127\13\uffff\1\u0126",
            "\1\u016d\1\u016e\12\uffff\1\u016f",
            "\1\u017b\1\u0170\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1"+
            "\u0176\1\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u013b\1\uffff\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1"+
            "\u0136\1\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\1\uffff\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1"+
            "\u0136\1\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\2\uffff\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1"+
            "\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\2\uffff\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1"+
            "\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\3\uffff\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1"+
            "\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\3\uffff\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137\1"+
            "\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u015c",
            "\1\u013b\4\uffff\1\u0134\1\u0135\1\u0136\1\u0137\1\u0138\1"+
            "\u0139\3\uffff\1\u013a",
            "\1\u013b\5\uffff\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\3"+
            "\uffff\1\u013a",
            "\1\u013b\5\uffff\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\3"+
            "\uffff\1\u013a",
            "\1\u013b\6\uffff\1\u0136\1\u0137\1\u0138\1\u0139\3\uffff\1"+
            "\u013a",
            "\1\u013b\6\uffff\1\u0136\1\u0137\1\u0138\1\u0139\3\uffff\1"+
            "\u013a",
            "\1\u013b\7\uffff\1\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\7\uffff\1\u0137\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\10\uffff\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\10\uffff\1\u0138\1\u0139\3\uffff\1\u013a",
            "\1\u013b\11\uffff\1\u0139\3\uffff\1\u013a",
            "\1\u013b\11\uffff\1\u0139\3\uffff\1\u013a",
            "\1\u013b\15\uffff\1\u013a",
            "\1\u013b\15\uffff\1\u013a",
            "\1\u017c\1\u017d\11\uffff\1\u017e",
            "\1\u0180\13\uffff\1\u017f",
            "\1\u0180\13\uffff\1\u017f",
            "\1\u0181\1\u0182\12\uffff\1\u0183",
            "\1\u016f",
            "\1\u016f",
            "\1\u0127\13\uffff\1\u0126",
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
            "\1\u0103\13\uffff\1\u0102",
            "\1\u019a\13\uffff\1\u0199",
            "\1\u019a\13\uffff\1\u0199",
            "\1\u019b\1\u019c\12\uffff\1\u019d",
            "\1\u019e\1\u019f\11\uffff\1\u01a0",
            "\1\u0125",
            "\1\u0183",
            "\1\u0183",
            "\1\u0180\13\uffff\1\u017f",
            "\1\u017b\1\uffff\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1"+
            "\u0176\1\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\1\uffff\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1"+
            "\u0176\1\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\2\uffff\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1"+
            "\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\2\uffff\1\u0172\1\u0173\1\u0174\1\u0175\1\u0176\1"+
            "\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\3\uffff\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1"+
            "\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\3\uffff\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\1"+
            "\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u018b",
            "\1\u017b\4\uffff\1\u0174\1\u0175\1\u0176\1\u0177\1\u0178\1"+
            "\u0179\3\uffff\1\u017a",
            "\1\u017b\5\uffff\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\3"+
            "\uffff\1\u017a",
            "\1\u017b\5\uffff\1\u0175\1\u0176\1\u0177\1\u0178\1\u0179\3"+
            "\uffff\1\u017a",
            "\1\u017b\6\uffff\1\u0176\1\u0177\1\u0178\1\u0179\3\uffff\1"+
            "\u017a",
            "\1\u017b\6\uffff\1\u0176\1\u0177\1\u0178\1\u0179\3\uffff\1"+
            "\u017a",
            "\1\u017b\7\uffff\1\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\7\uffff\1\u0177\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\10\uffff\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\10\uffff\1\u0178\1\u0179\3\uffff\1\u017a",
            "\1\u017b\11\uffff\1\u0179\3\uffff\1\u017a",
            "\1\u017b\11\uffff\1\u0179\3\uffff\1\u017a",
            "\1\u017b\15\uffff\1\u017a",
            "\1\u017b\15\uffff\1\u017a",
            "\1\u01a1\1\u01a2\11\uffff\1\u01a3",
            "\1\u01a4\1\u01a5\11\uffff\1\u01a6",
            "\1\u013b",
            "\1\u019d",
            "\1\u019d",
            "\1\u019a\13\uffff\1\u0199",
            "\1\u0180\13\uffff\1\u017f",
            "\1\u0180\13\uffff\1\u017f",
            "\1\u01a7\1\u01a8\12\uffff\1\u01a9",
            "\1\u01ab\13\uffff\1\u01aa",
            "\1\u01ab\13\uffff\1\u01aa",
            "\1\u01ac\1\u01ad\12\uffff\1\u01ae",
            "\1\u019a\13\uffff\1\u0199",
            "\1\u019a\13\uffff\1\u0199",
            "\1\u01af\1\u01b0\12\uffff\1\u01b1",
            "\1\u01a9",
            "\1\u01a9",
            "\1\u0180\13\uffff\1\u017f",
            "\1\u01b2\1\u01b3\11\uffff\1\u01b4",
            "\1\u017b",
            "\1\u01ae",
            "\1\u01ae",
            "\1\u01ab\13\uffff\1\u01aa",
            "\1\u01b1",
            "\1\u01b1",
            "\1\u019a\13\uffff\1\u0199",
            "\1\u01ab\13\uffff\1\u01aa",
            "\1\u01ab\13\uffff\1\u01aa",
            "\1\u01b5\1\u01b6\12\uffff\1\u01b7",
            "\1\u01b7",
            "\1\u01b7",
            "\1\u01ab\13\uffff\1\u01aa"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 610:1: ( rule__BTSTextContent__Alternatives_1_1 )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBTSTextContent_in_entryRuleBTSTextContent61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTextContent68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group__0_in_ruleBTSTextContent94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_entryRuleBTSSentenceItem121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSSentenceItem128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSentenceItem__Alternatives_in_ruleBTSSentenceItem154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_entryRuleBTSAmbivalenceItem181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSAmbivalenceItem188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalenceItem__Alternatives_in_ruleBTSAmbivalenceItem214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_entryRuleBTSTextItems241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSTextItems248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextItems__Alternatives_in_ruleBTSTextItems274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSenctence_in_entryRuleBTSSenctence361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSSenctence368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__0_in_ruleBTSSenctence394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_entryRuleBTSWord421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSWord428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSWord__Group__0_in_ruleBTSWord454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_entryRuleBTSMarker481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSMarker488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__0_in_ruleBTSMarker514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_entryRuleBTSAmbivalence541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSAmbivalence548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__0_in_ruleBTSAmbivalence574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_entryRuleBTSLemmaCase601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBTSLemmaCase608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__0_in_ruleBTSLemmaCase634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BTSTextContent__Alternatives_1_1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_1_1__0_in_rule__BTSTextContent__Alternatives_1_1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_rule__BTSSentenceItem__Alternatives787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_rule__BTSSentenceItem__Alternatives804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_rule__BTSSentenceItem__Alternatives821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSWord_in_rule__BTSAmbivalenceItem__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_rule__BTSAmbivalenceItem__Alternatives870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSenctence_in_rule__BTSTextItems__Alternatives902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSMarker_in_rule__BTSTextItems__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalence_in_rule__BTSTextItems__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group__0__Impl_in_rule__BTSTextContent__Group__01016 = new BitSet(new long[]{0x000000000002A000L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group__1_in_rule__BTSTextContent__Group__01019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group__1__Impl_in_rule__BTSTextContent__Group__11077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1__0_in_rule__BTSTextContent__Group__1__Impl1104 = new BitSet(new long[]{0x000000000002A002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1__0__Impl_in_rule__BTSTextContent__Group_1__01139 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1__1_in_rule__BTSTextContent__Group_1__01142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__TextItemsAssignment_1_0_in_rule__BTSTextContent__Group_1__0__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1__1__Impl_in_rule__BTSTextContent__Group_1__11199 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1__2_in_rule__BTSTextContent__Group_1__11202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Alternatives_1_1_in_rule__BTSTextContent__Group_1__1__Impl1229 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1__2__Impl_in_rule__BTSTextContent__Group_1__21260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_2__0_in_rule__BTSTextContent__Group_1__2__Impl1287 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_1_1__0__Impl_in_rule__BTSTextContent__Group_1_1_1__01324 = new BitSet(new long[]{0x000000000002A000L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_1_1__1_in_rule__BTSTextContent__Group_1_1_1__01327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BTSTextContent__Group_1_1_1__0__Impl1355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_1_1__1__Impl_in_rule__BTSTextContent__Group_1_1_1__11386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__TextItemsAssignment_1_1_1_1_in_rule__BTSTextContent__Group_1_1_1__1__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_2__0__Impl_in_rule__BTSTextContent__Group_1_2__01447 = new BitSet(new long[]{0x000000000002A000L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_2__1_in_rule__BTSTextContent__Group_1_2__01450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BTSTextContent__Group_1_2__0__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__Group_1_2__1__Impl_in_rule__BTSTextContent__Group_1_2__11509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSTextContent__TextItemsAssignment_1_2_1_in_rule__BTSTextContent__Group_1_2__1__Impl1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__0__Impl_in_rule__BTSSenctence__Group__01570 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__1_in_rule__BTSSenctence__Group__01573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__1__Impl_in_rule__BTSSenctence__Group__11631 = new BitSet(new long[]{0x000000000002E030L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__2_in_rule__BTSSenctence__Group__11634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BTSSenctence__Group__1__Impl1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__2__Impl_in_rule__BTSSenctence__Group__21693 = new BitSet(new long[]{0x000000000002E030L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__3_in_rule__BTSSenctence__Group__21696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2__0_in_rule__BTSSenctence__Group__2__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group__3__Impl_in_rule__BTSSenctence__Group__31754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BTSSenctence__Group__3__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2__0__Impl_in_rule__BTSSenctence__Group_2__01821 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2__1_in_rule__BTSSenctence__Group_2__01824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__SentenceItemsAssignment_2_0_in_rule__BTSSenctence__Group_2__0__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2__1__Impl_in_rule__BTSSenctence__Group_2__11881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2_1__0_in_rule__BTSSenctence__Group_2__1__Impl1908 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2_1__0__Impl_in_rule__BTSSenctence__Group_2_1__01943 = new BitSet(new long[]{0x000000000002A030L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2_1__1_in_rule__BTSSenctence__Group_2_1__01946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BTSSenctence__Group_2_1__0__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__Group_2_1__1__Impl_in_rule__BTSSenctence__Group_2_1__12005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSSenctence__SentenceItemsAssignment_2_1_1_in_rule__BTSSenctence__Group_2_1__1__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSWord__Group__0__Impl_in_rule__BTSWord__Group__02066 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSWord__Group__1_in_rule__BTSWord__Group__02069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSWord__Group__1__Impl_in_rule__BTSWord__Group__12127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSWord__WCharAssignment_1_in_rule__BTSWord__Group__1__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__0__Impl_in_rule__BTSMarker__Group__02188 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__1_in_rule__BTSMarker__Group__02191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__1__Impl_in_rule__BTSMarker__Group__12249 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__2_in_rule__BTSMarker__Group__12252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BTSMarker__Group__1__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__2__Impl_in_rule__BTSMarker__Group__22311 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__3_in_rule__BTSMarker__Group__22314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSMarker__ValueAssignment_2_in_rule__BTSMarker__Group__2__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSMarker__Group__3__Impl_in_rule__BTSMarker__Group__32372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BTSMarker__Group__3__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__0__Impl_in_rule__BTSAmbivalence__Group__02439 = new BitSet(new long[]{0x000000000002A000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__1_in_rule__BTSAmbivalence__Group__02442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__1__Impl_in_rule__BTSAmbivalence__Group__12500 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__2_in_rule__BTSAmbivalence__Group__12503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BTSAmbivalence__Group__1__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__2__Impl_in_rule__BTSAmbivalence__Group__22562 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__3_in_rule__BTSAmbivalence__Group__22565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BTSAmbivalence__Group__2__Impl2593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__3__Impl_in_rule__BTSAmbivalence__Group__32624 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__4_in_rule__BTSAmbivalence__Group__32627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_3__0_in_rule__BTSAmbivalence__Group__3__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__4__Impl_in_rule__BTSAmbivalence__Group__42685 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__5_in_rule__BTSAmbivalence__Group__42688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_4__0_in_rule__BTSAmbivalence__Group__4__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__5__Impl_in_rule__BTSAmbivalence__Group__52746 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__6_in_rule__BTSAmbivalence__Group__52749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_5__0_in_rule__BTSAmbivalence__Group__5__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__6__Impl_in_rule__BTSAmbivalence__Group__62807 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__7_in_rule__BTSAmbivalence__Group__62810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_6__0_in_rule__BTSAmbivalence__Group__6__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__7__Impl_in_rule__BTSAmbivalence__Group__72868 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__8_in_rule__BTSAmbivalence__Group__72871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_7__0_in_rule__BTSAmbivalence__Group__7__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__8__Impl_in_rule__BTSAmbivalence__Group__82929 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__9_in_rule__BTSAmbivalence__Group__82932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_8__0_in_rule__BTSAmbivalence__Group__8__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__9__Impl_in_rule__BTSAmbivalence__Group__92990 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__10_in_rule__BTSAmbivalence__Group__92993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_9__0_in_rule__BTSAmbivalence__Group__9__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__10__Impl_in_rule__BTSAmbivalence__Group__103051 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__11_in_rule__BTSAmbivalence__Group__103054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_10__0_in_rule__BTSAmbivalence__Group__10__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__11__Impl_in_rule__BTSAmbivalence__Group__113112 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__12_in_rule__BTSAmbivalence__Group__113115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_11__0_in_rule__BTSAmbivalence__Group__11__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__12__Impl_in_rule__BTSAmbivalence__Group__123173 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__13_in_rule__BTSAmbivalence__Group__123176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_12__0_in_rule__BTSAmbivalence__Group__12__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__13__Impl_in_rule__BTSAmbivalence__Group__133234 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__14_in_rule__BTSAmbivalence__Group__133237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__0_in_rule__BTSAmbivalence__Group__13__Impl3264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group__14__Impl_in_rule__BTSAmbivalence__Group__143295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BTSAmbivalence__Group__14__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_3__0__Impl_in_rule__BTSAmbivalence__Group_3__03384 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_3__1_in_rule__BTSAmbivalence__Group_3__03387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BTSAmbivalence__Group_3__0__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_3__1__Impl_in_rule__BTSAmbivalence__Group_3__13446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__StateAssignment_3_1_in_rule__BTSAmbivalence__Group_3__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_4__0__Impl_in_rule__BTSAmbivalence__Group_4__03507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_4__1_in_rule__BTSAmbivalence__Group_4__03510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BTSAmbivalence__Group_4__0__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_4__1__Impl_in_rule__BTSAmbivalence__Group_4__13569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__RevisionStateAssignment_4_1_in_rule__BTSAmbivalence__Group_4__1__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_5__0__Impl_in_rule__BTSAmbivalence__Group_5__03630 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_5__1_in_rule__BTSAmbivalence__Group_5__03633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BTSAmbivalence__Group_5__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_5__1__Impl_in_rule__BTSAmbivalence__Group_5__13692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__VisibilityAssignment_5_1_in_rule__BTSAmbivalence__Group_5__1__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_6__0__Impl_in_rule__BTSAmbivalence__Group_6__03753 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_6__1_in_rule__BTSAmbivalence__Group_6__03756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BTSAmbivalence__Group_6__0__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_6__1__Impl_in_rule__BTSAmbivalence__Group_6__13815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__SortKeyAssignment_6_1_in_rule__BTSAmbivalence__Group_6__1__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_7__0__Impl_in_rule__BTSAmbivalence__Group_7__03876 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_7__1_in_rule__BTSAmbivalence__Group_7__03879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BTSAmbivalence__Group_7__0__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_7__1__Impl_in_rule__BTSAmbivalence__Group_7__13938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__TypeAssignment_7_1_in_rule__BTSAmbivalence__Group_7__1__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_8__0__Impl_in_rule__BTSAmbivalence__Group_8__03999 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_8__1_in_rule__BTSAmbivalence__Group_8__04002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BTSAmbivalence__Group_8__0__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_8__1__Impl_in_rule__BTSAmbivalence__Group_8__14061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__SubtypeAssignment_8_1_in_rule__BTSAmbivalence__Group_8__1__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_9__0__Impl_in_rule__BTSAmbivalence__Group_9__04122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_9__1_in_rule__BTSAmbivalence__Group_9__04125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BTSAmbivalence__Group_9__0__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_9__1__Impl_in_rule__BTSAmbivalence__Group_9__14184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__CodeAssignment_9_1_in_rule__BTSAmbivalence__Group_9__1__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_10__0__Impl_in_rule__BTSAmbivalence__Group_10__04245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_10__1_in_rule__BTSAmbivalence__Group_10__04248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__BTSAmbivalence__Group_10__0__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_10__1__Impl_in_rule__BTSAmbivalence__Group_10__14307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence___idAssignment_10_1_in_rule__BTSAmbivalence__Group_10__1__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_11__0__Impl_in_rule__BTSAmbivalence__Group_11__04368 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_11__1_in_rule__BTSAmbivalence__Group_11__04371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__BTSAmbivalence__Group_11__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_11__1__Impl_in_rule__BTSAmbivalence__Group_11__14430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__CommentAssignment_11_1_in_rule__BTSAmbivalence__Group_11__1__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_12__0__Impl_in_rule__BTSAmbivalence__Group_12__04491 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_12__1_in_rule__BTSAmbivalence__Group_12__04494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__BTSAmbivalence__Group_12__0__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_12__1__Impl_in_rule__BTSAmbivalence__Group_12__14553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__ParentIdAssignment_12_1_in_rule__BTSAmbivalence__Group_12__1__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__0__Impl_in_rule__BTSAmbivalence__Group_13__04614 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__1_in_rule__BTSAmbivalence__Group_13__04617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BTSAmbivalence__Group_13__0__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__1__Impl_in_rule__BTSAmbivalence__Group_13__14676 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__2_in_rule__BTSAmbivalence__Group_13__14679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BTSAmbivalence__Group_13__1__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__2__Impl_in_rule__BTSAmbivalence__Group_13__24738 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__3_in_rule__BTSAmbivalence__Group_13__24741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__CasesAssignment_13_2_in_rule__BTSAmbivalence__Group_13__2__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__3__Impl_in_rule__BTSAmbivalence__Group_13__34798 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__4_in_rule__BTSAmbivalence__Group_13__34801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13_3__0_in_rule__BTSAmbivalence__Group_13__3__Impl4828 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13__4__Impl_in_rule__BTSAmbivalence__Group_13__44859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BTSAmbivalence__Group_13__4__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13_3__0__Impl_in_rule__BTSAmbivalence__Group_13_3__04928 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13_3__1_in_rule__BTSAmbivalence__Group_13_3__04931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BTSAmbivalence__Group_13_3__0__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__Group_13_3__1__Impl_in_rule__BTSAmbivalence__Group_13_3__14990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSAmbivalence__CasesAssignment_13_3_1_in_rule__BTSAmbivalence__Group_13_3__1__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__0__Impl_in_rule__BTSLemmaCase__Group__05051 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__1_in_rule__BTSLemmaCase__Group__05054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__1__Impl_in_rule__BTSLemmaCase__Group__15112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__2_in_rule__BTSLemmaCase__Group__15115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BTSLemmaCase__Group__1__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__2__Impl_in_rule__BTSLemmaCase__Group__25174 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__3_in_rule__BTSLemmaCase__Group__25177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__NameAssignment_2_in_rule__BTSLemmaCase__Group__2__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__3__Impl_in_rule__BTSLemmaCase__Group__35234 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__4_in_rule__BTSLemmaCase__Group__35237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BTSLemmaCase__Group__3__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__4__Impl_in_rule__BTSLemmaCase__Group__45296 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__5_in_rule__BTSLemmaCase__Group__45299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_4__0_in_rule__BTSLemmaCase__Group__4__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__5__Impl_in_rule__BTSLemmaCase__Group__55357 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__6_in_rule__BTSLemmaCase__Group__55360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_5__0_in_rule__BTSLemmaCase__Group__5__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__6__Impl_in_rule__BTSLemmaCase__Group__65418 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__7_in_rule__BTSLemmaCase__Group__65421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_6__0_in_rule__BTSLemmaCase__Group__6__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__7__Impl_in_rule__BTSLemmaCase__Group__75479 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__8_in_rule__BTSLemmaCase__Group__75482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_7__0_in_rule__BTSLemmaCase__Group__7__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__8__Impl_in_rule__BTSLemmaCase__Group__85540 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__9_in_rule__BTSLemmaCase__Group__85543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_8__0_in_rule__BTSLemmaCase__Group__8__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__9__Impl_in_rule__BTSLemmaCase__Group__95601 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__10_in_rule__BTSLemmaCase__Group__95604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_9__0_in_rule__BTSLemmaCase__Group__9__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__10__Impl_in_rule__BTSLemmaCase__Group__105662 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__11_in_rule__BTSLemmaCase__Group__105665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_10__0_in_rule__BTSLemmaCase__Group__10__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__11__Impl_in_rule__BTSLemmaCase__Group__115723 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__12_in_rule__BTSLemmaCase__Group__115726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_11__0_in_rule__BTSLemmaCase__Group__11__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__12__Impl_in_rule__BTSLemmaCase__Group__125784 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__13_in_rule__BTSLemmaCase__Group__125787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_12__0_in_rule__BTSLemmaCase__Group__12__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__13__Impl_in_rule__BTSLemmaCase__Group__135845 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__14_in_rule__BTSLemmaCase__Group__135848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_13__0_in_rule__BTSLemmaCase__Group__13__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__14__Impl_in_rule__BTSLemmaCase__Group__145906 = new BitSet(new long[]{0x000000023FF80000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__15_in_rule__BTSLemmaCase__Group__145909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__0_in_rule__BTSLemmaCase__Group__14__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group__15__Impl_in_rule__BTSLemmaCase__Group__155967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BTSLemmaCase__Group__15__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_4__0__Impl_in_rule__BTSLemmaCase__Group_4__06058 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_4__1_in_rule__BTSLemmaCase__Group_4__06061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BTSLemmaCase__Group_4__0__Impl6089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_4__1__Impl_in_rule__BTSLemmaCase__Group_4__16120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__StateAssignment_4_1_in_rule__BTSLemmaCase__Group_4__1__Impl6147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_5__0__Impl_in_rule__BTSLemmaCase__Group_5__06181 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_5__1_in_rule__BTSLemmaCase__Group_5__06184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BTSLemmaCase__Group_5__0__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_5__1__Impl_in_rule__BTSLemmaCase__Group_5__16243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__RevisionStateAssignment_5_1_in_rule__BTSLemmaCase__Group_5__1__Impl6270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_6__0__Impl_in_rule__BTSLemmaCase__Group_6__06304 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_6__1_in_rule__BTSLemmaCase__Group_6__06307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BTSLemmaCase__Group_6__0__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_6__1__Impl_in_rule__BTSLemmaCase__Group_6__16366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__VisibilityAssignment_6_1_in_rule__BTSLemmaCase__Group_6__1__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_7__0__Impl_in_rule__BTSLemmaCase__Group_7__06427 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_7__1_in_rule__BTSLemmaCase__Group_7__06430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BTSLemmaCase__Group_7__0__Impl6458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_7__1__Impl_in_rule__BTSLemmaCase__Group_7__16489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__SortKeyAssignment_7_1_in_rule__BTSLemmaCase__Group_7__1__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_8__0__Impl_in_rule__BTSLemmaCase__Group_8__06550 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_8__1_in_rule__BTSLemmaCase__Group_8__06553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BTSLemmaCase__Group_8__0__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_8__1__Impl_in_rule__BTSLemmaCase__Group_8__16612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__TypeAssignment_8_1_in_rule__BTSLemmaCase__Group_8__1__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_9__0__Impl_in_rule__BTSLemmaCase__Group_9__06673 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_9__1_in_rule__BTSLemmaCase__Group_9__06676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BTSLemmaCase__Group_9__0__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_9__1__Impl_in_rule__BTSLemmaCase__Group_9__16735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__SubtypeAssignment_9_1_in_rule__BTSLemmaCase__Group_9__1__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_10__0__Impl_in_rule__BTSLemmaCase__Group_10__06796 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_10__1_in_rule__BTSLemmaCase__Group_10__06799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BTSLemmaCase__Group_10__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_10__1__Impl_in_rule__BTSLemmaCase__Group_10__16858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__CodeAssignment_10_1_in_rule__BTSLemmaCase__Group_10__1__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_11__0__Impl_in_rule__BTSLemmaCase__Group_11__06919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_11__1_in_rule__BTSLemmaCase__Group_11__06922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__BTSLemmaCase__Group_11__0__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_11__1__Impl_in_rule__BTSLemmaCase__Group_11__16981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase___idAssignment_11_1_in_rule__BTSLemmaCase__Group_11__1__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_12__0__Impl_in_rule__BTSLemmaCase__Group_12__07042 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_12__1_in_rule__BTSLemmaCase__Group_12__07045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__BTSLemmaCase__Group_12__0__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_12__1__Impl_in_rule__BTSLemmaCase__Group_12__17104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__CommentAssignment_12_1_in_rule__BTSLemmaCase__Group_12__1__Impl7131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_13__0__Impl_in_rule__BTSLemmaCase__Group_13__07165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_13__1_in_rule__BTSLemmaCase__Group_13__07168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__BTSLemmaCase__Group_13__0__Impl7196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_13__1__Impl_in_rule__BTSLemmaCase__Group_13__17227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__ParentIdAssignment_13_1_in_rule__BTSLemmaCase__Group_13__1__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__0__Impl_in_rule__BTSLemmaCase__Group_14__07288 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__1_in_rule__BTSLemmaCase__Group_14__07291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__BTSLemmaCase__Group_14__0__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__1__Impl_in_rule__BTSLemmaCase__Group_14__17350 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__2_in_rule__BTSLemmaCase__Group_14__17353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BTSLemmaCase__Group_14__1__Impl7381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__2__Impl_in_rule__BTSLemmaCase__Group_14__27412 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__3_in_rule__BTSLemmaCase__Group_14__27415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__ScenarioAssignment_14_2_in_rule__BTSLemmaCase__Group_14__2__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__3__Impl_in_rule__BTSLemmaCase__Group_14__37472 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__4_in_rule__BTSLemmaCase__Group_14__37475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14_3__0_in_rule__BTSLemmaCase__Group_14__3__Impl7502 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14__4__Impl_in_rule__BTSLemmaCase__Group_14__47533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BTSLemmaCase__Group_14__4__Impl7561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14_3__0__Impl_in_rule__BTSLemmaCase__Group_14_3__07602 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14_3__1_in_rule__BTSLemmaCase__Group_14_3__07605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BTSLemmaCase__Group_14_3__0__Impl7633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__Group_14_3__1__Impl_in_rule__BTSLemmaCase__Group_14_3__17664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BTSLemmaCase__ScenarioAssignment_14_3_1_in_rule__BTSLemmaCase__Group_14_3__1__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07725 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EInt__Group__0__Impl7757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_rule__BTSTextContent__TextItemsAssignment_1_07860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_rule__BTSTextContent__TextItemsAssignment_1_1_1_17891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSTextItems_in_rule__BTSTextContent__TextItemsAssignment_1_2_17922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_rule__BTSSenctence__SentenceItemsAssignment_2_07953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSSentenceItem_in_rule__BTSSenctence__SentenceItemsAssignment_2_1_17984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSWord__WCharAssignment_18015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSMarker__ValueAssignment_28046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__StateAssignment_3_18077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__RevisionStateAssignment_4_18108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__VisibilityAssignment_5_18139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__BTSAmbivalence__SortKeyAssignment_6_18170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__TypeAssignment_7_18201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__SubtypeAssignment_8_18232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__CodeAssignment_9_18263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence___idAssignment_10_18294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__CommentAssignment_11_18325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSAmbivalence__ParentIdAssignment_12_18356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_rule__BTSAmbivalence__CasesAssignment_13_28387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSLemmaCase_in_rule__BTSAmbivalence__CasesAssignment_13_3_18418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__NameAssignment_28449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__StateAssignment_4_18480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__RevisionStateAssignment_5_18511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__VisibilityAssignment_6_18542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__BTSLemmaCase__SortKeyAssignment_7_18573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__TypeAssignment_8_18604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__SubtypeAssignment_9_18635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__CodeAssignment_10_18666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase___idAssignment_11_18697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__CommentAssignment_12_18728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BTSLemmaCase__ParentIdAssignment_13_18759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_rule__BTSLemmaCase__ScenarioAssignment_14_28790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBTSAmbivalenceItem_in_rule__BTSLemmaCase__ScenarioAssignment_14_3_18821 = new BitSet(new long[]{0x0000000000000002L});
    }


}