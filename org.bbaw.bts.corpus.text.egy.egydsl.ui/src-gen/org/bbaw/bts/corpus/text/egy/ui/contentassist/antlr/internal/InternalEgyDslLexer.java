package org.bbaw.bts.corpus.text.egy.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEgyDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    public static final int RULE_EGYSTRING=4;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalEgyDslLexer() {;} 
    public InternalEgyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEgyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:11:7: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:11:9: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:12:7: ( '\\n' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:12:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:13:7: ( '\\t' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:13:9: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:14:7: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:14:9: '\\u00A7'
            {
            match('\u00A7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:15:7: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:15:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:16:7: ( '; ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:16:9: '; '
            {
            match("; "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:17:7: ( 'case ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:17:9: 'case '
            {
            match("case "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:18:7: ( ': ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:18:9: ': '
            {
            match(": "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:19:7: ( '@mv' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:19:9: '@mv'
            {
            match("@mv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:20:7: ( '@v' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:20:9: '@v'
            {
            match("@v"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:21:7: ( '#' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:21:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:22:7: ( ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:23:7: ( '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:24:7: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:24:9: '\\u2261'
            {
            match('\u2261'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:25:7: ( ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:25:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:26:7: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:26:9: '\\u22EE'
            {
            match('\u22EE'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:27:7: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:27:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:28:7: ( '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:28:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:29:7: ( '(' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:30:7: ( ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:31:7: ( '<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:32:7: ( '>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:32:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:33:7: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:33:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:34:7: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:35:7: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:36:7: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:36:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:37:7: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:37:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:38:7: ( '<<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:38:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:39:7: ( '>>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:39:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:40:7: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:40:9: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:41:7: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:41:9: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:42:7: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:42:9: '(('
            {
            match("(("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:43:7: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:43:9: '))'
            {
            match("))"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:44:7: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:44:9: '[['
            {
            match("[["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:45:7: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:45:9: ']]'
            {
            match("]]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:46:7: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:46:9: '\\u2E22'
            {
            match('\u2E22'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:47:7: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:47:9: '\\u2E23'
            {
            match('\u2E23'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:48:7: ( '--' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:48:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_EGYSTRING"
    public final void mRULE_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5963:16: ( (~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' | '@' ) ) )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5963:18: (~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' | '@' ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5963:18: (~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' | '@' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\"')||LA1_0=='$'||(LA1_0>='&' && LA1_0<='\'')||(LA1_0>='*' && LA1_0<='+')||(LA1_0>='/' && LA1_0<='9')||LA1_0=='='||(LA1_0>='A' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='\u007F' && LA1_0<='\u00A6')||(LA1_0>='\u00A8' && LA1_0<='\u2260')||(LA1_0>='\u2262' && LA1_0<='\u22ED')||(LA1_0>='\u22EF' && LA1_0<='\u2E21')||(LA1_0>='\u2E24' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5963:18: ~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' | '@' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='/' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='A' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='\u007F' && input.LA(1)<='\u00A6')||(input.LA(1)>='\u00A8' && input.LA(1)<='\u2260')||(input.LA(1)>='\u2262' && input.LA(1)<='\u22ED')||(input.LA(1)>='\u22EF' && input.LA(1)<='\u2E21')||(input.LA(1)>='\u2E24' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EGYSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5965:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5965:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5965:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5965:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5965:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5967:10: ( ( '0' .. '9' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5967:12: ( '0' .. '9' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5967:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5967:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5969:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5971:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5971:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5971:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5971:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:41: ( '\\r' )? '\\n'
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5973:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5975:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5975:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5975:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5977:16: ( . )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5977:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=46;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:238: RULE_EGYSTRING
                {
                mRULE_EGYSTRING(); 

                }
                break;
            case 40 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:253: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:261: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:270: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:282: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:298: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:314: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:322: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\35\1\45\1\47\1\50\2\uffff\1\54\1\35\1\60\1\54\5\uffff\1\71\1"+
        "\uffff\1\74\1\76\1\100\1\102\1\uffff\1\105\1\107\1\111\1\113\2\uffff"+
        "\1\35\1\uffff\6\35\11\uffff\2\35\25\uffff\1\133\1\uffff\1\134\7"+
        "\uffff\4\35\2\uffff\2\35\1\uffff\4\35\2\uffff\3\35\1\uffff\3\35"+
        "\1\uffff\2\35\1\uffff";
    static final String DFA13_eofS =
        "\150\uffff";
    static final String DFA13_minS =
        "\1\0\3\11\2\uffff\1\40\1\60\1\40\1\155\5\uffff\1\55\1\uffff\1\50"+
        "\1\51\1\74\1\76\1\uffff\2\0\1\173\1\175\2\uffff\1\101\1\uffff\2"+
        "\60\2\0\1\52\1\11\11\uffff\2\60\25\uffff\1\0\1\uffff\1\0\7\uffff"+
        "\2\60\1\42\1\0\2\uffff\1\42\1\0\1\uffff\2\0\1\11\1\60\2\uffff\3"+
        "\0\1\uffff\2\0\1\12\1\uffff\1\40\1\0\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\3\40\2\uffff\1\40\1\172\1\40\1\166\5\uffff\1\55\1\uffff"+
        "\1\50\1\51\1\74\1\76\1\uffff\2\uffff\1\173\1\175\2\uffff\1\172\1"+
        "\uffff\1\172\1\71\2\uffff\1\57\1\40\11\uffff\2\172\25\uffff\1\uffff"+
        "\1\uffff\1\uffff\7\uffff\1\172\1\71\1\165\1\uffff\2\uffff\1\165"+
        "\1\uffff\1\uffff\2\uffff\1\40\1\172\2\uffff\3\uffff\1\uffff\2\uffff"+
        "\1\12\1\uffff\1\172\1\uffff\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\4\1\5\4\uffff\1\13\1\14\1\15\1\16\1\20\1\uffff\1\22"+
        "\4\uffff\1\27\4\uffff\1\44\1\45\1\uffff\1\47\6\uffff\1\47\1\1\1"+
        "\55\1\2\1\3\1\4\1\5\1\6\1\56\2\uffff\1\10\1\17\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\20\1\46\1\21\1\22\1\40\1\23\1\41\1\24\1\34\1\25"+
        "\1\35\1\26\1\27\1\uffff\1\30\1\uffff\1\31\1\36\1\32\1\37\1\33\1"+
        "\44\1\45\4\uffff\1\47\1\52\2\uffff\1\47\4\uffff\1\42\1\43\3\uffff"+
        "\1\53\3\uffff\1\54\2\uffff\1\7";
    static final String DFA13_specialS =
        "\1\4\25\uffff\1\7\1\3\10\uffff\1\5\1\2\42\uffff\1\14\1\uffff\1"+
        "\13\12\uffff\1\12\3\uffff\1\17\1\uffff\1\1\1\16\4\uffff\1\11\1\20"+
        "\1\10\1\uffff\1\15\1\6\3\uffff\1\0\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\44\1\3\1\2\2\44\1\43\22\44\1\1\1\44\1\40\1\12\1\44\1\5"+
            "\1\44\1\41\1\21\1\22\2\44\1\13\1\17\1\14\1\42\12\37\1\10\1\6"+
            "\1\23\1\44\1\24\1\25\1\11\32\36\1\26\1\44\1\27\1\34\1\36\1\44"+
            "\2\36\1\7\27\36\1\30\1\44\1\31\1\20\50\44\1\4\u21b9\44\1\15"+
            "\u008c\44\1\16\u0b33\44\1\32\1\33\ud1dc\44",
            "\2\46\2\uffff\1\46\22\uffff\1\46",
            "\2\46\2\uffff\1\46\22\uffff\1\46",
            "\2\46\2\uffff\1\46\22\uffff\1\46",
            "",
            "",
            "\1\53",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\55\31\56",
            "\1\57",
            "\1\61\10\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\101",
            "",
            "\11\35\2\uffff\25\35\1\uffff\2\35\1\uffff\1\35\1\uffff\2\35"+
            "\2\uffff\2\35\3\uffff\13\35\3\uffff\1\35\3\uffff\32\35\1\104"+
            "\37\35\1\uffff\1\35\2\uffff\50\35\1\uffff\u21b9\35\1\uffff\u008c"+
            "\35\1\uffff\u0b33\35\2\uffff\ud1dc\35",
            "\11\35\2\uffff\25\35\1\uffff\2\35\1\uffff\1\35\1\uffff\2\35"+
            "\2\uffff\2\35\3\uffff\13\35\3\uffff\1\35\3\uffff\34\35\1\106"+
            "\35\35\1\uffff\1\35\2\uffff\50\35\1\uffff\u21b9\35\1\uffff\u008c"+
            "\35\1\uffff\u0b33\35\2\uffff\ud1dc\35",
            "\1\110",
            "\1\112",
            "",
            "",
            "\32\116\4\uffff\1\116\1\uffff\32\116",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\117",
            "\11\121\2\123\25\121\1\123\1\121\1\122\1\123\1\121\1\123\2"+
            "\121\2\123\2\121\3\123\13\121\3\123\1\121\3\123\33\121\1\120"+
            "\36\121\1\123\1\121\2\123\50\121\1\123\u21b9\121\1\123\u008c"+
            "\121\1\123\u0b33\121\2\123\ud1dc\121",
            "\11\125\2\123\25\125\1\123\2\125\1\123\1\125\1\123\1\125\1"+
            "\126\2\123\2\125\3\123\13\125\3\123\1\125\3\123\33\125\1\124"+
            "\36\125\1\123\1\125\2\123\50\125\1\123\u21b9\125\1\123\u008c"+
            "\125\1\123\u0b33\125\2\123\ud1dc\125",
            "\1\127\4\uffff\1\130",
            "\2\46\2\uffff\1\131\22\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\132\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\35\2\uffff\25\35\1\uffff\2\35\1\uffff\1\35\1\uffff\2\35"+
            "\2\uffff\2\35\3\uffff\13\35\3\uffff\1\35\3\uffff\72\35\1\uffff"+
            "\1\35\2\uffff\50\35\1\uffff\u21b9\35\1\uffff\u008c\35\1\uffff"+
            "\u0b33\35\2\uffff\ud1dc\35",
            "",
            "\11\35\2\uffff\25\35\1\uffff\2\35\1\uffff\1\35\1\uffff\2\35"+
            "\2\uffff\2\35\3\uffff\13\35\3\uffff\1\35\3\uffff\72\35\1\uffff"+
            "\1\35\2\uffff\50\35\1\uffff\u21b9\35\1\uffff\u008c\35\1\uffff"+
            "\u0b33\35\2\uffff\ud1dc\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\117",
            "\1\135\4\uffff\1\135\64\uffff\1\135\5\uffff\1\135\3\uffff"+
            "\1\135\7\uffff\1\135\3\uffff\1\135\1\uffff\2\135",
            "\11\121\2\123\25\121\1\123\1\121\1\122\1\123\1\121\1\123\2"+
            "\121\2\123\2\121\3\123\13\121\3\123\1\121\3\123\33\121\1\120"+
            "\36\121\1\123\1\121\2\123\50\121\1\123\u21b9\121\1\123\u008c"+
            "\121\1\123\u0b33\121\2\123\ud1dc\121",
            "",
            "",
            "\1\136\4\uffff\1\136\64\uffff\1\136\5\uffff\1\136\3\uffff"+
            "\1\136\7\uffff\1\136\3\uffff\1\136\1\uffff\2\136",
            "\11\125\2\123\25\125\1\123\2\125\1\123\1\125\1\123\1\125\1"+
            "\126\2\123\2\125\3\123\13\125\3\123\1\125\3\123\33\125\1\124"+
            "\36\125\1\123\1\125\2\123\50\125\1\123\u21b9\125\1\123\u008c"+
            "\125\1\123\u0b33\125\2\123\ud1dc\125",
            "",
            "\11\141\2\140\25\141\1\140\2\141\1\140\1\141\1\140\2\141\2"+
            "\140\1\137\1\141\3\140\13\141\3\140\1\141\3\140\72\141\1\140"+
            "\1\141\2\140\50\141\1\140\u21b9\141\1\140\u008c\141\1\140\u0b33"+
            "\141\2\140\ud1dc\141",
            "\11\142\2\144\2\142\1\143\22\142\1\144\2\142\1\144\1\142\1"+
            "\144\2\142\2\144\2\142\3\144\13\142\3\144\1\142\3\144\72\142"+
            "\1\144\1\142\2\144\50\142\1\144\u21b9\142\1\144\u008c\142\1"+
            "\144\u0b33\142\2\144\ud1dc\142",
            "\2\46\2\uffff\1\131\22\uffff\1\46",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\145\25\56",
            "",
            "",
            "\11\121\2\123\25\121\1\123\1\121\1\122\1\123\1\121\1\123\2"+
            "\121\2\123\2\121\3\123\13\121\3\123\1\121\3\123\33\121\1\120"+
            "\36\121\1\123\1\121\2\123\50\121\1\123\u21b9\121\1\123\u008c"+
            "\121\1\123\u0b33\121\2\123\ud1dc\121",
            "\11\125\2\123\25\125\1\123\2\125\1\123\1\125\1\123\1\125\1"+
            "\126\2\123\2\125\3\123\13\125\3\123\1\125\3\123\33\125\1\124"+
            "\36\125\1\123\1\125\2\123\50\125\1\123\u21b9\125\1\123\u008c"+
            "\125\1\123\u0b33\125\2\123\ud1dc\125",
            "\11\141\2\140\25\141\1\140\2\141\1\140\1\141\1\140\2\141\2"+
            "\140\1\137\1\141\3\140\1\146\12\141\3\140\1\141\3\140\72\141"+
            "\1\140\1\141\2\140\50\141\1\140\u21b9\141\1\140\u008c\141\1"+
            "\140\u0b33\141\2\140\ud1dc\141",
            "",
            "\11\141\2\140\25\141\1\140\2\141\1\140\1\141\1\140\2\141\2"+
            "\140\1\137\1\141\3\140\13\141\3\140\1\141\3\140\72\141\1\140"+
            "\1\141\2\140\50\141\1\140\u21b9\141\1\140\u008c\141\1\140\u0b33"+
            "\141\2\140\ud1dc\141",
            "\11\142\2\144\2\142\1\143\22\142\1\144\2\142\1\144\1\142\1"+
            "\144\2\142\2\144\2\142\3\144\13\142\3\144\1\142\3\144\72\142"+
            "\1\144\1\142\2\144\50\142\1\144\u21b9\142\1\144\u008c\142\1"+
            "\144\u0b33\142\2\144\ud1dc\142",
            "\1\144",
            "",
            "\1\147\17\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\11\141\2\140\25\141\1\140\2\141\1\140\1\141\1\140\2\141\2"+
            "\140\1\137\1\141\3\140\13\141\3\140\1\141\3\140\72\141\1\140"+
            "\1\141\2\140\50\141\1\140\u21b9\141\1\140\u008c\141\1\140\u0b33"+
            "\141\2\140\ud1dc\141",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_102 = input.LA(1);

                        s = -1;
                        if ( (LA13_102=='*') ) {s = 95;}

                        else if ( ((LA13_102>='\u0000' && LA13_102<='\b')||(LA13_102>='\u000B' && LA13_102<='\u001F')||(LA13_102>='!' && LA13_102<='\"')||LA13_102=='$'||(LA13_102>='&' && LA13_102<='\'')||LA13_102=='+'||(LA13_102>='/' && LA13_102<='9')||LA13_102=='='||(LA13_102>='A' && LA13_102<='z')||LA13_102=='|'||(LA13_102>='\u007F' && LA13_102<='\u00A6')||(LA13_102>='\u00A8' && LA13_102<='\u2260')||(LA13_102>='\u2262' && LA13_102<='\u22ED')||(LA13_102>='\u22EF' && LA13_102<='\u2E21')||(LA13_102>='\u2E24' && LA13_102<='\uFFFF')) ) {s = 97;}

                        else if ( ((LA13_102>='\t' && LA13_102<='\n')||LA13_102==' '||LA13_102=='#'||LA13_102=='%'||(LA13_102>='(' && LA13_102<=')')||(LA13_102>=',' && LA13_102<='.')||(LA13_102>=':' && LA13_102<='<')||(LA13_102>='>' && LA13_102<='@')||LA13_102=='{'||(LA13_102>='}' && LA13_102<='~')||LA13_102=='\u00A7'||LA13_102=='\u2261'||LA13_102=='\u22EE'||(LA13_102>='\u2E22' && LA13_102<='\u2E23')) ) {s = 96;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_87 = input.LA(1);

                        s = -1;
                        if ( (LA13_87=='*') ) {s = 95;}

                        else if ( ((LA13_87>='\t' && LA13_87<='\n')||LA13_87==' '||LA13_87=='#'||LA13_87=='%'||(LA13_87>='(' && LA13_87<=')')||(LA13_87>=',' && LA13_87<='.')||(LA13_87>=':' && LA13_87<='<')||(LA13_87>='>' && LA13_87<='@')||LA13_87=='{'||(LA13_87>='}' && LA13_87<='~')||LA13_87=='\u00A7'||LA13_87=='\u2261'||LA13_87=='\u22EE'||(LA13_87>='\u2E22' && LA13_87<='\u2E23')) ) {s = 96;}

                        else if ( ((LA13_87>='\u0000' && LA13_87<='\b')||(LA13_87>='\u000B' && LA13_87<='\u001F')||(LA13_87>='!' && LA13_87<='\"')||LA13_87=='$'||(LA13_87>='&' && LA13_87<='\'')||LA13_87=='+'||(LA13_87>='/' && LA13_87<='9')||LA13_87=='='||(LA13_87>='A' && LA13_87<='z')||LA13_87=='|'||(LA13_87>='\u007F' && LA13_87<='\u00A6')||(LA13_87>='\u00A8' && LA13_87<='\u2260')||(LA13_87>='\u2262' && LA13_87<='\u22ED')||(LA13_87>='\u22EF' && LA13_87<='\u2E21')||(LA13_87>='\u2E24' && LA13_87<='\uFFFF')) ) {s = 97;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( (LA13_33=='\\') ) {s = 84;}

                        else if ( ((LA13_33>='\u0000' && LA13_33<='\b')||(LA13_33>='\u000B' && LA13_33<='\u001F')||(LA13_33>='!' && LA13_33<='\"')||LA13_33=='$'||LA13_33=='&'||(LA13_33>='*' && LA13_33<='+')||(LA13_33>='/' && LA13_33<='9')||LA13_33=='='||(LA13_33>='A' && LA13_33<='[')||(LA13_33>=']' && LA13_33<='z')||LA13_33=='|'||(LA13_33>='\u007F' && LA13_33<='\u00A6')||(LA13_33>='\u00A8' && LA13_33<='\u2260')||(LA13_33>='\u2262' && LA13_33<='\u22ED')||(LA13_33>='\u22EF' && LA13_33<='\u2E21')||(LA13_33>='\u2E24' && LA13_33<='\uFFFF')) ) {s = 85;}

                        else if ( (LA13_33=='\'') ) {s = 86;}

                        else if ( ((LA13_33>='\t' && LA13_33<='\n')||LA13_33==' '||LA13_33=='#'||LA13_33=='%'||(LA13_33>='(' && LA13_33<=')')||(LA13_33>=',' && LA13_33<='.')||(LA13_33>=':' && LA13_33<='<')||(LA13_33>='>' && LA13_33<='@')||LA13_33=='{'||(LA13_33>='}' && LA13_33<='~')||LA13_33=='\u00A7'||LA13_33=='\u2261'||LA13_33=='\u22EE'||(LA13_33>='\u2E22' && LA13_33<='\u2E23')) ) {s = 83;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( (LA13_23==']') ) {s = 70;}

                        else if ( ((LA13_23>='\u0000' && LA13_23<='\b')||(LA13_23>='\u000B' && LA13_23<='\u001F')||(LA13_23>='!' && LA13_23<='\"')||LA13_23=='$'||(LA13_23>='&' && LA13_23<='\'')||(LA13_23>='*' && LA13_23<='+')||(LA13_23>='/' && LA13_23<='9')||LA13_23=='='||(LA13_23>='A' && LA13_23<='\\')||(LA13_23>='^' && LA13_23<='z')||LA13_23=='|'||(LA13_23>='\u007F' && LA13_23<='\u00A6')||(LA13_23>='\u00A8' && LA13_23<='\u2260')||(LA13_23>='\u2262' && LA13_23<='\u22ED')||(LA13_23>='\u22EF' && LA13_23<='\u2E21')||(LA13_23>='\u2E24' && LA13_23<='\uFFFF')) ) {s = 29;}

                        else s = 71;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==' ') ) {s = 1;}

                        else if ( (LA13_0=='\n') ) {s = 2;}

                        else if ( (LA13_0=='\t') ) {s = 3;}

                        else if ( (LA13_0=='\u00A7') ) {s = 4;}

                        else if ( (LA13_0=='%') ) {s = 5;}

                        else if ( (LA13_0==';') ) {s = 6;}

                        else if ( (LA13_0=='c') ) {s = 7;}

                        else if ( (LA13_0==':') ) {s = 8;}

                        else if ( (LA13_0=='@') ) {s = 9;}

                        else if ( (LA13_0=='#') ) {s = 10;}

                        else if ( (LA13_0==',') ) {s = 11;}

                        else if ( (LA13_0=='.') ) {s = 12;}

                        else if ( (LA13_0=='\u2261') ) {s = 13;}

                        else if ( (LA13_0=='\u22EE') ) {s = 14;}

                        else if ( (LA13_0=='-') ) {s = 15;}

                        else if ( (LA13_0=='~') ) {s = 16;}

                        else if ( (LA13_0=='(') ) {s = 17;}

                        else if ( (LA13_0==')') ) {s = 18;}

                        else if ( (LA13_0=='<') ) {s = 19;}

                        else if ( (LA13_0=='>') ) {s = 20;}

                        else if ( (LA13_0=='?') ) {s = 21;}

                        else if ( (LA13_0=='[') ) {s = 22;}

                        else if ( (LA13_0==']') ) {s = 23;}

                        else if ( (LA13_0=='{') ) {s = 24;}

                        else if ( (LA13_0=='}') ) {s = 25;}

                        else if ( (LA13_0=='\u2E22') ) {s = 26;}

                        else if ( (LA13_0=='\u2E23') ) {s = 27;}

                        else if ( (LA13_0=='^') ) {s = 28;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||(LA13_0>='d' && LA13_0<='z')) ) {s = 30;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 31;}

                        else if ( (LA13_0=='\"') ) {s = 32;}

                        else if ( (LA13_0=='\'') ) {s = 33;}

                        else if ( (LA13_0=='/') ) {s = 34;}

                        else if ( (LA13_0=='\r') ) {s = 35;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||LA13_0=='$'||LA13_0=='&'||(LA13_0>='*' && LA13_0<='+')||LA13_0=='='||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='\u007F' && LA13_0<='\u00A6')||(LA13_0>='\u00A8' && LA13_0<='\u2260')||(LA13_0>='\u2262' && LA13_0<='\u22ED')||(LA13_0>='\u22EF' && LA13_0<='\u2E21')||(LA13_0>='\u2E24' && LA13_0<='\uFFFF')) ) {s = 36;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( (LA13_32=='\\') ) {s = 80;}

                        else if ( ((LA13_32>='\u0000' && LA13_32<='\b')||(LA13_32>='\u000B' && LA13_32<='\u001F')||LA13_32=='!'||LA13_32=='$'||(LA13_32>='&' && LA13_32<='\'')||(LA13_32>='*' && LA13_32<='+')||(LA13_32>='/' && LA13_32<='9')||LA13_32=='='||(LA13_32>='A' && LA13_32<='[')||(LA13_32>=']' && LA13_32<='z')||LA13_32=='|'||(LA13_32>='\u007F' && LA13_32<='\u00A6')||(LA13_32>='\u00A8' && LA13_32<='\u2260')||(LA13_32>='\u2262' && LA13_32<='\u22ED')||(LA13_32>='\u22EF' && LA13_32<='\u2E21')||(LA13_32>='\u2E24' && LA13_32<='\uFFFF')) ) {s = 81;}

                        else if ( (LA13_32=='\"') ) {s = 82;}

                        else if ( ((LA13_32>='\t' && LA13_32<='\n')||LA13_32==' '||LA13_32=='#'||LA13_32=='%'||(LA13_32>='(' && LA13_32<=')')||(LA13_32>=',' && LA13_32<='.')||(LA13_32>=':' && LA13_32<='<')||(LA13_32>='>' && LA13_32<='@')||LA13_32=='{'||(LA13_32>='}' && LA13_32<='~')||LA13_32=='\u00A7'||LA13_32=='\u2261'||LA13_32=='\u22EE'||(LA13_32>='\u2E22' && LA13_32<='\u2E23')) ) {s = 83;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_98 = input.LA(1);

                        s = -1;
                        if ( (LA13_98=='\r') ) {s = 99;}

                        else if ( ((LA13_98>='\t' && LA13_98<='\n')||LA13_98==' '||LA13_98=='#'||LA13_98=='%'||(LA13_98>='(' && LA13_98<=')')||(LA13_98>=',' && LA13_98<='.')||(LA13_98>=':' && LA13_98<='<')||(LA13_98>='>' && LA13_98<='@')||LA13_98=='{'||(LA13_98>='}' && LA13_98<='~')||LA13_98=='\u00A7'||LA13_98=='\u2261'||LA13_98=='\u22EE'||(LA13_98>='\u2E22' && LA13_98<='\u2E23')) ) {s = 100;}

                        else if ( ((LA13_98>='\u0000' && LA13_98<='\b')||(LA13_98>='\u000B' && LA13_98<='\f')||(LA13_98>='\u000E' && LA13_98<='\u001F')||(LA13_98>='!' && LA13_98<='\"')||LA13_98=='$'||(LA13_98>='&' && LA13_98<='\'')||(LA13_98>='*' && LA13_98<='+')||(LA13_98>='/' && LA13_98<='9')||LA13_98=='='||(LA13_98>='A' && LA13_98<='z')||LA13_98=='|'||(LA13_98>='\u007F' && LA13_98<='\u00A6')||(LA13_98>='\u00A8' && LA13_98<='\u2260')||(LA13_98>='\u2262' && LA13_98<='\u22ED')||(LA13_98>='\u22EF' && LA13_98<='\u2E21')||(LA13_98>='\u2E24' && LA13_98<='\uFFFF')) ) {s = 98;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( (LA13_22=='[') ) {s = 68;}

                        else if ( ((LA13_22>='\u0000' && LA13_22<='\b')||(LA13_22>='\u000B' && LA13_22<='\u001F')||(LA13_22>='!' && LA13_22<='\"')||LA13_22=='$'||(LA13_22>='&' && LA13_22<='\'')||(LA13_22>='*' && LA13_22<='+')||(LA13_22>='/' && LA13_22<='9')||LA13_22=='='||(LA13_22>='A' && LA13_22<='Z')||(LA13_22>='\\' && LA13_22<='z')||LA13_22=='|'||(LA13_22>='\u007F' && LA13_22<='\u00A6')||(LA13_22>='\u00A8' && LA13_22<='\u2260')||(LA13_22>='\u2262' && LA13_22<='\u22ED')||(LA13_22>='\u22EF' && LA13_22<='\u2E21')||(LA13_22>='\u2E24' && LA13_22<='\uFFFF')) ) {s = 29;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_95 = input.LA(1);

                        s = -1;
                        if ( (LA13_95=='/') ) {s = 102;}

                        else if ( (LA13_95=='*') ) {s = 95;}

                        else if ( ((LA13_95>='\u0000' && LA13_95<='\b')||(LA13_95>='\u000B' && LA13_95<='\u001F')||(LA13_95>='!' && LA13_95<='\"')||LA13_95=='$'||(LA13_95>='&' && LA13_95<='\'')||LA13_95=='+'||(LA13_95>='0' && LA13_95<='9')||LA13_95=='='||(LA13_95>='A' && LA13_95<='z')||LA13_95=='|'||(LA13_95>='\u007F' && LA13_95<='\u00A6')||(LA13_95>='\u00A8' && LA13_95<='\u2260')||(LA13_95>='\u2262' && LA13_95<='\u22ED')||(LA13_95>='\u22EF' && LA13_95<='\u2E21')||(LA13_95>='\u2E24' && LA13_95<='\uFFFF')) ) {s = 97;}

                        else if ( ((LA13_95>='\t' && LA13_95<='\n')||LA13_95==' '||LA13_95=='#'||LA13_95=='%'||(LA13_95>='(' && LA13_95<=')')||(LA13_95>=',' && LA13_95<='.')||(LA13_95>=':' && LA13_95<='<')||(LA13_95>='>' && LA13_95<='@')||LA13_95=='{'||(LA13_95>='}' && LA13_95<='~')||LA13_95=='\u00A7'||LA13_95=='\u2261'||LA13_95=='\u22EE'||(LA13_95>='\u2E22' && LA13_95<='\u2E23')) ) {s = 96;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_93 = input.LA(1);

                        s = -1;
                        if ( (LA13_93=='\"') ) {s = 82;}

                        else if ( (LA13_93=='\\') ) {s = 80;}

                        else if ( ((LA13_93>='\u0000' && LA13_93<='\b')||(LA13_93>='\u000B' && LA13_93<='\u001F')||LA13_93=='!'||LA13_93=='$'||(LA13_93>='&' && LA13_93<='\'')||(LA13_93>='*' && LA13_93<='+')||(LA13_93>='/' && LA13_93<='9')||LA13_93=='='||(LA13_93>='A' && LA13_93<='[')||(LA13_93>=']' && LA13_93<='z')||LA13_93=='|'||(LA13_93>='\u007F' && LA13_93<='\u00A6')||(LA13_93>='\u00A8' && LA13_93<='\u2260')||(LA13_93>='\u2262' && LA13_93<='\u22ED')||(LA13_93>='\u22EF' && LA13_93<='\u2E21')||(LA13_93>='\u2E24' && LA13_93<='\uFFFF')) ) {s = 81;}

                        else if ( ((LA13_93>='\t' && LA13_93<='\n')||LA13_93==' '||LA13_93=='#'||LA13_93=='%'||(LA13_93>='(' && LA13_93<=')')||(LA13_93>=',' && LA13_93<='.')||(LA13_93>=':' && LA13_93<='<')||(LA13_93>='>' && LA13_93<='@')||LA13_93=='{'||(LA13_93>='}' && LA13_93<='~')||LA13_93=='\u00A7'||LA13_93=='\u2261'||LA13_93=='\u22EE'||(LA13_93>='\u2E22' && LA13_93<='\u2E23')) ) {s = 83;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_81 = input.LA(1);

                        s = -1;
                        if ( (LA13_81=='\"') ) {s = 82;}

                        else if ( (LA13_81=='\\') ) {s = 80;}

                        else if ( ((LA13_81>='\u0000' && LA13_81<='\b')||(LA13_81>='\u000B' && LA13_81<='\u001F')||LA13_81=='!'||LA13_81=='$'||(LA13_81>='&' && LA13_81<='\'')||(LA13_81>='*' && LA13_81<='+')||(LA13_81>='/' && LA13_81<='9')||LA13_81=='='||(LA13_81>='A' && LA13_81<='[')||(LA13_81>=']' && LA13_81<='z')||LA13_81=='|'||(LA13_81>='\u007F' && LA13_81<='\u00A6')||(LA13_81>='\u00A8' && LA13_81<='\u2260')||(LA13_81>='\u2262' && LA13_81<='\u22ED')||(LA13_81>='\u22EF' && LA13_81<='\u2E21')||(LA13_81>='\u2E24' && LA13_81<='\uFFFF')) ) {s = 81;}

                        else if ( ((LA13_81>='\t' && LA13_81<='\n')||LA13_81==' '||LA13_81=='#'||LA13_81=='%'||(LA13_81>='(' && LA13_81<=')')||(LA13_81>=',' && LA13_81<='.')||(LA13_81>=':' && LA13_81<='<')||(LA13_81>='>' && LA13_81<='@')||LA13_81=='{'||(LA13_81>='}' && LA13_81<='~')||LA13_81=='\u00A7'||LA13_81=='\u2261'||LA13_81=='\u22EE'||(LA13_81>='\u2E22' && LA13_81<='\u2E23')) ) {s = 83;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_70 = input.LA(1);

                        s = -1;
                        if ( ((LA13_70>='\u0000' && LA13_70<='\b')||(LA13_70>='\u000B' && LA13_70<='\u001F')||(LA13_70>='!' && LA13_70<='\"')||LA13_70=='$'||(LA13_70>='&' && LA13_70<='\'')||(LA13_70>='*' && LA13_70<='+')||(LA13_70>='/' && LA13_70<='9')||LA13_70=='='||(LA13_70>='A' && LA13_70<='z')||LA13_70=='|'||(LA13_70>='\u007F' && LA13_70<='\u00A6')||(LA13_70>='\u00A8' && LA13_70<='\u2260')||(LA13_70>='\u2262' && LA13_70<='\u22ED')||(LA13_70>='\u22EF' && LA13_70<='\u2E21')||(LA13_70>='\u2E24' && LA13_70<='\uFFFF')) ) {s = 29;}

                        else s = 92;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA13_68 = input.LA(1);

                        s = -1;
                        if ( ((LA13_68>='\u0000' && LA13_68<='\b')||(LA13_68>='\u000B' && LA13_68<='\u001F')||(LA13_68>='!' && LA13_68<='\"')||LA13_68=='$'||(LA13_68>='&' && LA13_68<='\'')||(LA13_68>='*' && LA13_68<='+')||(LA13_68>='/' && LA13_68<='9')||LA13_68=='='||(LA13_68>='A' && LA13_68<='z')||LA13_68=='|'||(LA13_68>='\u007F' && LA13_68<='\u00A6')||(LA13_68>='\u00A8' && LA13_68<='\u2260')||(LA13_68>='\u2262' && LA13_68<='\u22ED')||(LA13_68>='\u22EF' && LA13_68<='\u2E21')||(LA13_68>='\u2E24' && LA13_68<='\uFFFF')) ) {s = 29;}

                        else s = 91;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA13_97 = input.LA(1);

                        s = -1;
                        if ( (LA13_97=='*') ) {s = 95;}

                        else if ( ((LA13_97>='\u0000' && LA13_97<='\b')||(LA13_97>='\u000B' && LA13_97<='\u001F')||(LA13_97>='!' && LA13_97<='\"')||LA13_97=='$'||(LA13_97>='&' && LA13_97<='\'')||LA13_97=='+'||(LA13_97>='/' && LA13_97<='9')||LA13_97=='='||(LA13_97>='A' && LA13_97<='z')||LA13_97=='|'||(LA13_97>='\u007F' && LA13_97<='\u00A6')||(LA13_97>='\u00A8' && LA13_97<='\u2260')||(LA13_97>='\u2262' && LA13_97<='\u22ED')||(LA13_97>='\u22EF' && LA13_97<='\u2E21')||(LA13_97>='\u2E24' && LA13_97<='\uFFFF')) ) {s = 97;}

                        else if ( ((LA13_97>='\t' && LA13_97<='\n')||LA13_97==' '||LA13_97=='#'||LA13_97=='%'||(LA13_97>='(' && LA13_97<=')')||(LA13_97>=',' && LA13_97<='.')||(LA13_97>=':' && LA13_97<='<')||(LA13_97>='>' && LA13_97<='@')||LA13_97=='{'||(LA13_97>='}' && LA13_97<='~')||LA13_97=='\u00A7'||LA13_97=='\u2261'||LA13_97=='\u22EE'||(LA13_97>='\u2E22' && LA13_97<='\u2E23')) ) {s = 96;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA13_88 = input.LA(1);

                        s = -1;
                        if ( ((LA13_88>='\u0000' && LA13_88<='\b')||(LA13_88>='\u000B' && LA13_88<='\f')||(LA13_88>='\u000E' && LA13_88<='\u001F')||(LA13_88>='!' && LA13_88<='\"')||LA13_88=='$'||(LA13_88>='&' && LA13_88<='\'')||(LA13_88>='*' && LA13_88<='+')||(LA13_88>='/' && LA13_88<='9')||LA13_88=='='||(LA13_88>='A' && LA13_88<='z')||LA13_88=='|'||(LA13_88>='\u007F' && LA13_88<='\u00A6')||(LA13_88>='\u00A8' && LA13_88<='\u2260')||(LA13_88>='\u2262' && LA13_88<='\u22ED')||(LA13_88>='\u22EF' && LA13_88<='\u2E21')||(LA13_88>='\u2E24' && LA13_88<='\uFFFF')) ) {s = 98;}

                        else if ( (LA13_88=='\r') ) {s = 99;}

                        else if ( ((LA13_88>='\t' && LA13_88<='\n')||LA13_88==' '||LA13_88=='#'||LA13_88=='%'||(LA13_88>='(' && LA13_88<=')')||(LA13_88>=',' && LA13_88<='.')||(LA13_88>=':' && LA13_88<='<')||(LA13_88>='>' && LA13_88<='@')||LA13_88=='{'||(LA13_88>='}' && LA13_88<='~')||LA13_88=='\u00A7'||LA13_88=='\u2261'||LA13_88=='\u22EE'||(LA13_88>='\u2E22' && LA13_88<='\u2E23')) ) {s = 100;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA13_85 = input.LA(1);

                        s = -1;
                        if ( (LA13_85=='\'') ) {s = 86;}

                        else if ( (LA13_85=='\\') ) {s = 84;}

                        else if ( ((LA13_85>='\u0000' && LA13_85<='\b')||(LA13_85>='\u000B' && LA13_85<='\u001F')||(LA13_85>='!' && LA13_85<='\"')||LA13_85=='$'||LA13_85=='&'||(LA13_85>='*' && LA13_85<='+')||(LA13_85>='/' && LA13_85<='9')||LA13_85=='='||(LA13_85>='A' && LA13_85<='[')||(LA13_85>=']' && LA13_85<='z')||LA13_85=='|'||(LA13_85>='\u007F' && LA13_85<='\u00A6')||(LA13_85>='\u00A8' && LA13_85<='\u2260')||(LA13_85>='\u2262' && LA13_85<='\u22ED')||(LA13_85>='\u22EF' && LA13_85<='\u2E21')||(LA13_85>='\u2E24' && LA13_85<='\uFFFF')) ) {s = 85;}

                        else if ( ((LA13_85>='\t' && LA13_85<='\n')||LA13_85==' '||LA13_85=='#'||LA13_85=='%'||(LA13_85>='(' && LA13_85<=')')||(LA13_85>=',' && LA13_85<='.')||(LA13_85>=':' && LA13_85<='<')||(LA13_85>='>' && LA13_85<='@')||LA13_85=='{'||(LA13_85>='}' && LA13_85<='~')||LA13_85=='\u00A7'||LA13_85=='\u2261'||LA13_85=='\u22EE'||(LA13_85>='\u2E22' && LA13_85<='\u2E23')) ) {s = 83;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA13_94 = input.LA(1);

                        s = -1;
                        if ( (LA13_94=='\'') ) {s = 86;}

                        else if ( (LA13_94=='\\') ) {s = 84;}

                        else if ( ((LA13_94>='\u0000' && LA13_94<='\b')||(LA13_94>='\u000B' && LA13_94<='\u001F')||(LA13_94>='!' && LA13_94<='\"')||LA13_94=='$'||LA13_94=='&'||(LA13_94>='*' && LA13_94<='+')||(LA13_94>='/' && LA13_94<='9')||LA13_94=='='||(LA13_94>='A' && LA13_94<='[')||(LA13_94>=']' && LA13_94<='z')||LA13_94=='|'||(LA13_94>='\u007F' && LA13_94<='\u00A6')||(LA13_94>='\u00A8' && LA13_94<='\u2260')||(LA13_94>='\u2262' && LA13_94<='\u22ED')||(LA13_94>='\u22EF' && LA13_94<='\u2E21')||(LA13_94>='\u2E24' && LA13_94<='\uFFFF')) ) {s = 85;}

                        else if ( ((LA13_94>='\t' && LA13_94<='\n')||LA13_94==' '||LA13_94=='#'||LA13_94=='%'||(LA13_94>='(' && LA13_94<=')')||(LA13_94>=',' && LA13_94<='.')||(LA13_94>=':' && LA13_94<='<')||(LA13_94>='>' && LA13_94<='@')||LA13_94=='{'||(LA13_94>='}' && LA13_94<='~')||LA13_94=='\u00A7'||LA13_94=='\u2261'||LA13_94=='\u22EE'||(LA13_94>='\u2E22' && LA13_94<='\u2E23')) ) {s = 83;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}