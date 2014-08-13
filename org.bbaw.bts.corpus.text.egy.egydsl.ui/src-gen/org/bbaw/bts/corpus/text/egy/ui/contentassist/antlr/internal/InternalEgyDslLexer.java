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
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_PLURALSTRING=7;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_SUFFIXSTRING=8;
    public static final int RULE_ANY_OTHER=15;
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
    public static final int T__32=32;
    public static final int RULE_STRING=12;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EGYSTRING=5;
    public static final int RULE_WS=9;

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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:12:7: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:12:9: '\\u00A7'
            {
            match('\u00A7'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:13:7: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:13:9: '%'
            {
            match('%'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:14:7: ( '; ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:14:9: '; '
            {
            match("; "); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:15:7: ( 'case ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:15:9: 'case '
            {
            match("case "); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:16:7: ( ': ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:16:9: ': '
            {
            match(": "); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:17:7: ( '\\uDB80\\uDC81' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:17:9: '\\uDB80\\uDC81'
            {
            match("\uDB80\uDC81"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:18:7: ( '\\uDB80\\uDC80' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:18:9: '\\uDB80\\uDC80'
            {
            match("\uDB80\uDC80"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:19:7: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:19:9: '\\uDB80\\uDC82'
            {
            match("\uDB80\uDC82"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:20:7: ( '#' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:20:9: '#'
            {
            match('#'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:21:7: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:21:9: '-'
            {
            match('-'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:22:7: ( '=' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:22:9: '='
            {
            match('='); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:23:7: ( ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:23:9: ','
            {
            match(','); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:24:7: ( '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:24:9: '.'
            {
            match('.'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:25:7: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:25:9: '\\u2261'
            {
            match('\u2261'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:26:7: ( ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:26:9: ':'
            {
            match(':'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:27:7: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:27:9: '\\u22EE'
            {
            match('\u22EE'); 

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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:33:7: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:33:9: '\\u2E2E'
            {
            match('\u2E2E'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:34:7: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:34:9: '?'
            {
            match('?'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:35:7: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:35:9: '['
            {
            match('['); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:36:7: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:36:9: ']'
            {
            match(']'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:37:7: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:37:9: '{'
            {
            match('{'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:38:7: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:38:9: '}'
            {
            match('}'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:39:7: ( '<<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:39:9: '<<'
            {
            match("<<"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:40:7: ( '>>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:40:9: '>>'
            {
            match(">>"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:41:7: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:41:9: '{{'
            {
            match("{{"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:42:7: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:42:9: '}}'
            {
            match("}}"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:43:7: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:43:9: '(('
            {
            match("(("); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:44:7: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:44:9: '))'
            {
            match("))"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:45:7: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:45:9: '[['
            {
            match("[["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:46:7: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:46:9: ']]'
            {
            match("]]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:47:7: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:47:9: '\\u2E22'
            {
            match('\u2E22'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:48:7: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:48:9: '\\u2E23'
            {
            match('\u2E23'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:49:7: ( '--' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:49:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6692:9: ( ( ' ' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6692:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:14: ( ( '\\r' | '\\n' | '\\r\\n' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case '\r':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=3;
                }
                else {
                    alt1=1;}
                }
                break;
            case '\n':
                {
                alt1=2;
                }
                break;
            case '\t':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:27: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6694:34: '\\t'
                    {
                    match('\t'); 

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
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_DUALSTRING"
    public final void mRULE_DUALSTRING() throws RecognitionException {
        try {
            int _type = RULE_DUALSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6696:17: ( 'du' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6696:19: 'du'
            {
            match("du"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DUALSTRING"

    // $ANTLR start "RULE_PLURALSTRING"
    public final void mRULE_PLURALSTRING() throws RecognitionException {
        try {
            int _type = RULE_PLURALSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6698:19: ( 'pl' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6698:21: 'pl'
            {
            match("pl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLURALSTRING"

    // $ANTLR start "RULE_SUFFIXSTRING"
    public final void mRULE_SUFFIXSTRING() throws RecognitionException {
        try {
            int _type = RULE_SUFFIXSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:19: ( ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:21: ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:21: ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=19;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:22: '\\uA722'
            	    {
            	    match('\uA722'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:31: 'j'
            	    {
            	    match('j'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:35: 'y'
            	    {
            	    match('y'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:39: 'w'
            	    {
            	    match('w'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:43: 'n'
            	    {
            	    match('n'); 

            	    }
            	    break;
            	case 6 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:47: 's'
            	    {
            	    match('s'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:51: 'k'
            	    {
            	    match('k'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:55: 't'
            	    {
            	    match('t'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:59: '\\u1E6F'
            	    {
            	    match('\u1E6F'); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:68: '\\u0131\\u0357'
            	    {
            	    match("\u0131\u0357"); 


            	    }
            	    break;
            	case 11 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:83: '\\u015B'
            	    {
            	    match('\u015B'); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:92: '\\u0131\\u0357\\u032F'
            	    {
            	    match("\u0131\u0357\u032F"); 


            	    }
            	    break;
            	case 13 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:113: '\\u00EF'
            	    {
            	    match('\u00EF'); 

            	    }
            	    break;
            	case 14 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:122: 'u\\u032F'
            	    {
            	    match("u\u032F"); 


            	    }
            	    break;
            	case 15 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:132: '\\u010D'
            	    {
            	    match('\u010D'); 

            	    }
            	    break;
            	case 16 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:141: '\\u1E71'
            	    {
            	    match('\u1E71'); 

            	    }
            	    break;
            	case 17 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:150: 'a'
            	    {
            	    match('a'); 

            	    }
            	    break;
            	case 18 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6700:154: '\\uA723'
            	    {
            	    match('\uA723'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUFFIXSTRING"

    // $ANTLR start "RULE_EGYSTRING"
    public final void mRULE_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:16: ( ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'p' | 'f' | 'm' | 'n' | 'r' | 'l' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:18: ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'p' | 'f' | 'm' | 'n' | 'r' | 'l' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:18: ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'p' | 'f' | 'm' | 'n' | 'r' | 'l' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=84;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:19: '\\uA722'
            	    {
            	    match('\uA722'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:28: 'j'
            	    {
            	    match('j'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:32: 'y'
            	    {
            	    match('y'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:36: '\\uA724'
            	    {
            	    match('\uA724'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:45: 'w'
            	    {
            	    match('w'); 

            	    }
            	    break;
            	case 6 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:49: 'b'
            	    {
            	    match('b'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:53: 'p'
            	    {
            	    match('p'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:57: 'f'
            	    {
            	    match('f'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:61: 'm'
            	    {
            	    match('m'); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:65: 'n'
            	    {
            	    match('n'); 

            	    }
            	    break;
            	case 11 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:69: 'r'
            	    {
            	    match('r'); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:73: 'l'
            	    {
            	    match('l'); 

            	    }
            	    break;
            	case 13 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:77: 'h'
            	    {
            	    match('h'); 

            	    }
            	    break;
            	case 14 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:81: '\\u1E25'
            	    {
            	    match('\u1E25'); 

            	    }
            	    break;
            	case 15 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:90: '\\u1E2B'
            	    {
            	    match('\u1E2B'); 

            	    }
            	    break;
            	case 16 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:99: '\\u1E96'
            	    {
            	    match('\u1E96'); 

            	    }
            	    break;
            	case 17 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:108: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;
            	case 18 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:112: 's'
            	    {
            	    match('s'); 

            	    }
            	    break;
            	case 19 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:116: '\\u0161'
            	    {
            	    match('\u0161'); 

            	    }
            	    break;
            	case 20 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:125: 'q'
            	    {
            	    match('q'); 

            	    }
            	    break;
            	case 21 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:129: 'k'
            	    {
            	    match('k'); 

            	    }
            	    break;
            	case 22 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:133: 'g'
            	    {
            	    match('g'); 

            	    }
            	    break;
            	case 23 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:137: 't'
            	    {
            	    match('t'); 

            	    }
            	    break;
            	case 24 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:141: '\\u1E6F'
            	    {
            	    match('\u1E6F'); 

            	    }
            	    break;
            	case 25 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:150: 'd'
            	    {
            	    match('d'); 

            	    }
            	    break;
            	case 26 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:154: '\\u1E0F'
            	    {
            	    match('\u1E0F'); 

            	    }
            	    break;
            	case 27 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:163: '\\u02BE'
            	    {
            	    match('\u02BE'); 

            	    }
            	    break;
            	case 28 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:172: '\\u0131\\u0357'
            	    {
            	    match("\u0131\u0357"); 


            	    }
            	    break;
            	case 29 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:187: '\\u015B'
            	    {
            	    match('\u015B'); 

            	    }
            	    break;
            	case 30 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:196: '\\u1E33'
            	    {
            	    match('\u1E33'); 

            	    }
            	    break;
            	case 31 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:205: '\\u0131\\u0357\\u032F'
            	    {
            	    match("\u0131\u0357\u032F"); 


            	    }
            	    break;
            	case 32 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:226: '\\u00EF'
            	    {
            	    match('\u00EF'); 

            	    }
            	    break;
            	case 33 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:235: 'u\\u032F'
            	    {
            	    match("u\u032F"); 


            	    }
            	    break;
            	case 34 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:245: '\\u010D'
            	    {
            	    match('\u010D'); 

            	    }
            	    break;
            	case 35 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:254: '\\u010D\\u0323'
            	    {
            	    match("\u010D\u0323"); 


            	    }
            	    break;
            	case 36 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:269: '\\u1E6D'
            	    {
            	    match('\u1E6D'); 

            	    }
            	    break;
            	case 37 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:278: 'h\\u032D'
            	    {
            	    match("h\u032D"); 


            	    }
            	    break;
            	case 38 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:288: '\\u1E71'
            	    {
            	    match('\u1E71'); 

            	    }
            	    break;
            	case 39 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:297: 'a'
            	    {
            	    match('a'); 

            	    }
            	    break;
            	case 40 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:301: 'i\\u032D'
            	    {
            	    match("i\u032D"); 


            	    }
            	    break;
            	case 41 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:311: '\\uA723'
            	    {
            	    match('\uA723'); 

            	    }
            	    break;
            	case 42 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:320: 'J'
            	    {
            	    match('J'); 

            	    }
            	    break;
            	case 43 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:324: 'Y'
            	    {
            	    match('Y'); 

            	    }
            	    break;
            	case 44 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:328: '\\uA725'
            	    {
            	    match('\uA725'); 

            	    }
            	    break;
            	case 45 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:337: 'W'
            	    {
            	    match('W'); 

            	    }
            	    break;
            	case 46 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:341: 'B'
            	    {
            	    match('B'); 

            	    }
            	    break;
            	case 47 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:345: 'P'
            	    {
            	    match('P'); 

            	    }
            	    break;
            	case 48 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:349: 'F'
            	    {
            	    match('F'); 

            	    }
            	    break;
            	case 49 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:353: 'M'
            	    {
            	    match('M'); 

            	    }
            	    break;
            	case 50 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:357: 'N'
            	    {
            	    match('N'); 

            	    }
            	    break;
            	case 51 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:361: 'R'
            	    {
            	    match('R'); 

            	    }
            	    break;
            	case 52 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:365: 'L'
            	    {
            	    match('L'); 

            	    }
            	    break;
            	case 53 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:369: 'H'
            	    {
            	    match('H'); 

            	    }
            	    break;
            	case 54 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:373: '\\u1E24'
            	    {
            	    match('\u1E24'); 

            	    }
            	    break;
            	case 55 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:382: '\\u1E2A'
            	    {
            	    match('\u1E2A'); 

            	    }
            	    break;
            	case 56 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:391: 'H\\u0331'
            	    {
            	    match("H\u0331"); 


            	    }
            	    break;
            	case 57 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:401: 'Z'
            	    {
            	    match('Z'); 

            	    }
            	    break;
            	case 58 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:405: 'S'
            	    {
            	    match('S'); 

            	    }
            	    break;
            	case 59 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:409: '\\u0160'
            	    {
            	    match('\u0160'); 

            	    }
            	    break;
            	case 60 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:418: 'Q'
            	    {
            	    match('Q'); 

            	    }
            	    break;
            	case 61 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:422: 'K'
            	    {
            	    match('K'); 

            	    }
            	    break;
            	case 62 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:426: 'G'
            	    {
            	    match('G'); 

            	    }
            	    break;
            	case 63 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:430: 'T'
            	    {
            	    match('T'); 

            	    }
            	    break;
            	case 64 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:434: '\\u1E6E'
            	    {
            	    match('\u1E6E'); 

            	    }
            	    break;
            	case 65 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:443: 'D'
            	    {
            	    match('D'); 

            	    }
            	    break;
            	case 66 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:447: '\\u1E0E'
            	    {
            	    match('\u1E0E'); 

            	    }
            	    break;
            	case 67 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:456: 'I\\u0357'
            	    {
            	    match("I\u0357"); 


            	    }
            	    break;
            	case 68 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:466: '\\u015A'
            	    {
            	    match('\u015A'); 

            	    }
            	    break;
            	case 69 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:475: '\\u1E32'
            	    {
            	    match('\u1E32'); 

            	    }
            	    break;
            	case 70 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:484: '\\u010C'
            	    {
            	    match('\u010C'); 

            	    }
            	    break;
            	case 71 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:493: '\\u010C\\u0323'
            	    {
            	    match("\u010C\u0323"); 


            	    }
            	    break;
            	case 72 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:508: '\\u1E6C'
            	    {
            	    match('\u1E6C'); 

            	    }
            	    break;
            	case 73 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:517: 'H\\u032D'
            	    {
            	    match("H\u032D"); 


            	    }
            	    break;
            	case 74 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:527: '\\u1E70'
            	    {
            	    match('\u1E70'); 

            	    }
            	    break;
            	case 75 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:536: 'A'
            	    {
            	    match('A'); 

            	    }
            	    break;
            	case 76 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:540: 'I'
            	    {
            	    match('I'); 

            	    }
            	    break;
            	case 77 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:544: '\\u2C80' .. '\\u2CFF'
            	    {
            	    matchRange('\u2C80','\u2CFF'); 

            	    }
            	    break;
            	case 78 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:563: '\\uD80C\\uDE86'
            	    {
            	    match("\uD80C\uDE86"); 


            	    }
            	    break;
            	case 79 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:578: '\\uD80C\\uDE87'
            	    {
            	    match("\uD80C\uDE87"); 


            	    }
            	    break;
            	case 80 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:593: '\\uD80C\\uDF79'
            	    {
            	    match("\uD80C\uDF79"); 


            	    }
            	    break;
            	case 81 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:608: '\\uD80C\\uDF7A'
            	    {
            	    match("\uD80C\uDF7A"); 


            	    }
            	    break;
            	case 82 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:623: '\\uD80C\\uDE58'
            	    {
            	    match("\uD80C\uDE58"); 


            	    }
            	    break;
            	case 83 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6702:638: '\\uD80C\\uDE82'
            	    {
            	    match("\uD80C\uDE82"); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:11: '^'
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

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6704:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6706:10: ( ( '0' .. '9' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6706:12: ( '0' .. '9' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6706:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6706:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6708:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6710:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6710:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6710:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6710:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:41: ( '\\r' )? '\\n'
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6712:41: '\\r'
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6714:16: ( . )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6714:18: .
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
        // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_WS | RULE_NEWLINE | RULE_DUALSTRING | RULE_PLURALSTRING | RULE_SUFFIXSTRING | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt14=51;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:244: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:252: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 42 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:265: RULE_DUALSTRING
                {
                mRULE_DUALSTRING(); 

                }
                break;
            case 43 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:281: RULE_PLURALSTRING
                {
                mRULE_PLURALSTRING(); 

                }
                break;
            case 44 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:299: RULE_SUFFIXSTRING
                {
                mRULE_SUFFIXSTRING(); 

                }
                break;
            case 45 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:317: RULE_EGYSTRING
                {
                mRULE_EGYSTRING(); 

                }
                break;
            case 46 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:332: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 47 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:340: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:349: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:361: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:377: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:393: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\1\1\22\uffff\1\25\2\uffff";
    static final String DFA2_eofS =
        "\26\uffff";
    static final String DFA2_minS =
        "\1\141\12\uffff\1\u0357\7\uffff\1\u032f\2\uffff";
    static final String DFA2_maxS =
        "\1\ua723\12\uffff\1\u0357\7\uffff\1\u032f\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\23\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\14\1\12";
    static final String DFA2_specialS =
        "\26\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\21\10\uffff\1\3\1\10\2\uffff\1\6\4\uffff\1\7\1\11\1\16\1"+
            "\uffff\1\5\1\uffff\1\4\165\uffff\1\15\35\uffff\1\17\43\uffff"+
            "\1\13\51\uffff\1\14\u1d13\uffff\1\12\1\uffff\1\20\u88b0\uffff"+
            "\1\2\1\22",
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
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()+ loopback of 6700:21: ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+";
        }
    }
    static final String DFA3_eotS =
        "\1\1\15\uffff\1\112\23\uffff\1\115\20\uffff\1\120\14\uffff\1\122"+
        "\2\uffff\1\124\7\uffff\1\134\21\uffff";
    static final String DFA3_eofS =
        "\135\uffff";
    static final String DFA3_minS =
        "\1\101\15\uffff\1\u032d\16\uffff\1\u0357\4\uffff\1\u0323\20\uffff"+
        "\1\u032d\14\uffff\1\u0357\2\uffff\1\u0323\4\uffff\1\ude58\2\uffff"+
        "\1\u032f\21\uffff";
    static final String DFA3_maxS =
        "\1\ud80c\15\uffff\1\u032d\16\uffff\1\u0357\4\uffff\1\u0323\20\uffff"+
        "\1\u0331\14\uffff\1\u0357\2\uffff\1\u0323\4\uffff\1\udf7a\2\uffff"+
        "\1\u032f\21\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\124\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\1\32\1\33\1\uffff\1\35\1\36\1\40\1\41\1\uffff\1\44\1"+
        "\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\uffff\1\66\1\67\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
        "\1\100\1\101\1\102\1\uffff\1\104\1\105\1\uffff\1\110\1\112\1\113"+
        "\1\115\1\uffff\1\45\1\15\1\uffff\1\43\1\42\1\70\1\111\1\65\1\103"+
        "\1\114\1\107\1\106\1\116\1\117\1\120\1\121\1\122\1\123\1\37\1\34";
    static final String DFA3_specialS =
        "\135\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\106\1\54\1\uffff\1\76\1\uffff\1\56\1\73\1\63\1\100\1\50"+
            "\1\72\1\62\1\57\1\60\1\uffff\1\55\1\71\1\61\1\67\1\74\2\uffff"+
            "\1\53\1\uffff\1\51\1\66\6\uffff\1\45\1\7\1\uffff\1\32\1\uffff"+
            "\1\11\1\27\1\16\1\46\1\3\1\26\1\15\1\12\1\13\1\uffff\1\10\1"+
            "\25\1\14\1\23\1\30\1\41\1\uffff\1\6\1\uffff\1\4\1\22\164\uffff"+
            "\1\40\34\uffff\1\103\1\42\43\uffff\1\35\50\uffff\1\101\1\36"+
            "\4\uffff\1\70\1\24\u015c\uffff\1\34\u1b4f\uffff\1\77\1\33\24"+
            "\uffff\1\64\1\17\4\uffff\1\65\1\20\6\uffff\1\102\1\37\70\uffff"+
            "\1\104\1\43\1\75\1\31\1\105\1\44\44\uffff\1\21\u0de9\uffff\u0080"+
            "\107\u7a22\uffff\1\2\1\47\1\5\1\52\u30e6\uffff\1\110",
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
            "\1\111",
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
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\114",
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
            "\1\117\3\uffff\1\116",
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
            "\1\121",
            "",
            "",
            "\1\123",
            "",
            "",
            "",
            "",
            "\1\131\51\uffff\1\132\3\uffff\1\125\1\126\u00f1\uffff\1\127"+
            "\1\130",
            "",
            "",
            "\1\133",
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
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 6702:18: ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'p' | 'f' | 'm' | 'n' | 'r' | 'l' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' )+";
        }
    }
    static final String DFA14_eotS =
        "\155\uffff";
    static final String DFA14_eofS =
        "\155\uffff";
    static final String DFA14_minS =
        "\1\0\154\uffff";
    static final String DFA14_maxS =
        "\1\uffff\154\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\12\1\13\1\14\1\15\1\16\1"+
        "\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\45\1\46\1\50\2\51\1\52\1\53\21\54\64\55\2\56\1\57\2\60\1\61\1"+
        "\63";
    static final String DFA14_specialS =
        "\1\0\154\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\154\1\34\1\36\2\154\1\35\22\154\1\1\1\154\1\151\1\10\1"+
            "\154\1\3\1\154\1\152\1\20\1\21\2\154\1\13\1\11\1\14\1\153\12"+
            "\150\1\6\1\4\1\22\1\12\1\23\1\25\1\154\1\143\1\111\1\147\1\133"+
            "\1\147\1\113\1\130\1\120\1\135\1\105\1\127\1\117\1\114\1\115"+
            "\1\147\1\112\1\126\1\116\1\124\1\131\2\147\1\110\1\147\1\106"+
            "\1\123\1\26\1\154\1\27\1\146\1\147\1\154\1\60\1\63\1\5\1\37"+
            "\1\147\1\64\1\77\1\70\1\104\1\42\1\47\1\67\1\65\1\45\1\147\1"+
            "\40\1\76\1\66\1\46\1\50\1\55\1\147\1\44\1\147\1\43\1\74\1\30"+
            "\1\154\1\31\1\17\50\154\1\2\107\154\1\54\34\154\1\140\1\56\43"+
            "\154\1\52\50\154\1\136\1\53\4\154\1\125\1\75\u015c\154\1\101"+
            "\u1b4f\154\1\134\1\100\24\154\1\121\1\71\4\154\1\122\1\72\6"+
            "\154\1\137\1\102\70\154\1\141\1\103\1\132\1\51\1\142\1\57\44"+
            "\154\1\73\u03ca\154\1\15\u008c\154\1\16\u0991\154\u0080\144"+
            "\u0122\154\1\32\1\33\12\154\1\24\u78f3\154\1\41\1\61\1\62\1"+
            "\107\u30e6\154\1\145\u0373\154\1\7\u247f\154",
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
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_WS | RULE_NEWLINE | RULE_DUALSTRING | RULE_PLURALSTRING | RULE_SUFFIXSTRING | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==' ') ) {s = 1;}

                        else if ( (LA14_0=='\u00A7') ) {s = 2;}

                        else if ( (LA14_0=='%') ) {s = 3;}

                        else if ( (LA14_0==';') ) {s = 4;}

                        else if ( (LA14_0=='c') ) {s = 5;}

                        else if ( (LA14_0==':') ) {s = 6;}

                        else if ( (LA14_0=='\uDB80') ) {s = 7;}

                        else if ( (LA14_0=='#') ) {s = 8;}

                        else if ( (LA14_0=='-') ) {s = 9;}

                        else if ( (LA14_0=='=') ) {s = 10;}

                        else if ( (LA14_0==',') ) {s = 11;}

                        else if ( (LA14_0=='.') ) {s = 12;}

                        else if ( (LA14_0=='\u2261') ) {s = 13;}

                        else if ( (LA14_0=='\u22EE') ) {s = 14;}

                        else if ( (LA14_0=='~') ) {s = 15;}

                        else if ( (LA14_0=='(') ) {s = 16;}

                        else if ( (LA14_0==')') ) {s = 17;}

                        else if ( (LA14_0=='<') ) {s = 18;}

                        else if ( (LA14_0=='>') ) {s = 19;}

                        else if ( (LA14_0=='\u2E2E') ) {s = 20;}

                        else if ( (LA14_0=='?') ) {s = 21;}

                        else if ( (LA14_0=='[') ) {s = 22;}

                        else if ( (LA14_0==']') ) {s = 23;}

                        else if ( (LA14_0=='{') ) {s = 24;}

                        else if ( (LA14_0=='}') ) {s = 25;}

                        else if ( (LA14_0=='\u2E22') ) {s = 26;}

                        else if ( (LA14_0=='\u2E23') ) {s = 27;}

                        else if ( (LA14_0=='\t') ) {s = 28;}

                        else if ( (LA14_0=='\r') ) {s = 29;}

                        else if ( (LA14_0=='\n') ) {s = 30;}

                        else if ( (LA14_0=='d') ) {s = 31;}

                        else if ( (LA14_0=='p') ) {s = 32;}

                        else if ( (LA14_0=='\uA722') ) {s = 33;}

                        else if ( (LA14_0=='j') ) {s = 34;}

                        else if ( (LA14_0=='y') ) {s = 35;}

                        else if ( (LA14_0=='w') ) {s = 36;}

                        else if ( (LA14_0=='n') ) {s = 37;}

                        else if ( (LA14_0=='s') ) {s = 38;}

                        else if ( (LA14_0=='k') ) {s = 39;}

                        else if ( (LA14_0=='t') ) {s = 40;}

                        else if ( (LA14_0=='\u1E6F') ) {s = 41;}

                        else if ( (LA14_0=='\u0131') ) {s = 42;}

                        else if ( (LA14_0=='\u015B') ) {s = 43;}

                        else if ( (LA14_0=='\u00EF') ) {s = 44;}

                        else if ( (LA14_0=='u') ) {s = 45;}

                        else if ( (LA14_0=='\u010D') ) {s = 46;}

                        else if ( (LA14_0=='\u1E71') ) {s = 47;}

                        else if ( (LA14_0=='a') ) {s = 48;}

                        else if ( (LA14_0=='\uA723') ) {s = 49;}

                        else if ( (LA14_0=='\uA724') ) {s = 50;}

                        else if ( (LA14_0=='b') ) {s = 51;}

                        else if ( (LA14_0=='f') ) {s = 52;}

                        else if ( (LA14_0=='m') ) {s = 53;}

                        else if ( (LA14_0=='r') ) {s = 54;}

                        else if ( (LA14_0=='l') ) {s = 55;}

                        else if ( (LA14_0=='h') ) {s = 56;}

                        else if ( (LA14_0=='\u1E25') ) {s = 57;}

                        else if ( (LA14_0=='\u1E2B') ) {s = 58;}

                        else if ( (LA14_0=='\u1E96') ) {s = 59;}

                        else if ( (LA14_0=='z') ) {s = 60;}

                        else if ( (LA14_0=='\u0161') ) {s = 61;}

                        else if ( (LA14_0=='q') ) {s = 62;}

                        else if ( (LA14_0=='g') ) {s = 63;}

                        else if ( (LA14_0=='\u1E0F') ) {s = 64;}

                        else if ( (LA14_0=='\u02BE') ) {s = 65;}

                        else if ( (LA14_0=='\u1E33') ) {s = 66;}

                        else if ( (LA14_0=='\u1E6D') ) {s = 67;}

                        else if ( (LA14_0=='i') ) {s = 68;}

                        else if ( (LA14_0=='J') ) {s = 69;}

                        else if ( (LA14_0=='Y') ) {s = 70;}

                        else if ( (LA14_0=='\uA725') ) {s = 71;}

                        else if ( (LA14_0=='W') ) {s = 72;}

                        else if ( (LA14_0=='B') ) {s = 73;}

                        else if ( (LA14_0=='P') ) {s = 74;}

                        else if ( (LA14_0=='F') ) {s = 75;}

                        else if ( (LA14_0=='M') ) {s = 76;}

                        else if ( (LA14_0=='N') ) {s = 77;}

                        else if ( (LA14_0=='R') ) {s = 78;}

                        else if ( (LA14_0=='L') ) {s = 79;}

                        else if ( (LA14_0=='H') ) {s = 80;}

                        else if ( (LA14_0=='\u1E24') ) {s = 81;}

                        else if ( (LA14_0=='\u1E2A') ) {s = 82;}

                        else if ( (LA14_0=='Z') ) {s = 83;}

                        else if ( (LA14_0=='S') ) {s = 84;}

                        else if ( (LA14_0=='\u0160') ) {s = 85;}

                        else if ( (LA14_0=='Q') ) {s = 86;}

                        else if ( (LA14_0=='K') ) {s = 87;}

                        else if ( (LA14_0=='G') ) {s = 88;}

                        else if ( (LA14_0=='T') ) {s = 89;}

                        else if ( (LA14_0=='\u1E6E') ) {s = 90;}

                        else if ( (LA14_0=='D') ) {s = 91;}

                        else if ( (LA14_0=='\u1E0E') ) {s = 92;}

                        else if ( (LA14_0=='I') ) {s = 93;}

                        else if ( (LA14_0=='\u015A') ) {s = 94;}

                        else if ( (LA14_0=='\u1E32') ) {s = 95;}

                        else if ( (LA14_0=='\u010C') ) {s = 96;}

                        else if ( (LA14_0=='\u1E6C') ) {s = 97;}

                        else if ( (LA14_0=='\u1E70') ) {s = 98;}

                        else if ( (LA14_0=='A') ) {s = 99;}

                        else if ( ((LA14_0>='\u2C80' && LA14_0<='\u2CFF')) ) {s = 100;}

                        else if ( (LA14_0=='\uD80C') ) {s = 101;}

                        else if ( (LA14_0=='^') ) {s = 102;}

                        else if ( (LA14_0=='C'||LA14_0=='E'||LA14_0=='O'||(LA14_0>='U' && LA14_0<='V')||LA14_0=='X'||LA14_0=='_'||LA14_0=='e'||LA14_0=='o'||LA14_0=='v'||LA14_0=='x') ) {s = 103;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 104;}

                        else if ( (LA14_0=='\"') ) {s = 105;}

                        else if ( (LA14_0=='\'') ) {s = 106;}

                        else if ( (LA14_0=='/') ) {s = 107;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='$'||LA14_0=='&'||(LA14_0>='*' && LA14_0<='+')||LA14_0=='@'||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='\u007F' && LA14_0<='\u00A6')||(LA14_0>='\u00A8' && LA14_0<='\u00EE')||(LA14_0>='\u00F0' && LA14_0<='\u010B')||(LA14_0>='\u010E' && LA14_0<='\u0130')||(LA14_0>='\u0132' && LA14_0<='\u0159')||(LA14_0>='\u015C' && LA14_0<='\u015F')||(LA14_0>='\u0162' && LA14_0<='\u02BD')||(LA14_0>='\u02BF' && LA14_0<='\u1E0D')||(LA14_0>='\u1E10' && LA14_0<='\u1E23')||(LA14_0>='\u1E26' && LA14_0<='\u1E29')||(LA14_0>='\u1E2C' && LA14_0<='\u1E31')||(LA14_0>='\u1E34' && LA14_0<='\u1E6B')||(LA14_0>='\u1E72' && LA14_0<='\u1E95')||(LA14_0>='\u1E97' && LA14_0<='\u2260')||(LA14_0>='\u2262' && LA14_0<='\u22ED')||(LA14_0>='\u22EF' && LA14_0<='\u2C7F')||(LA14_0>='\u2D00' && LA14_0<='\u2E21')||(LA14_0>='\u2E24' && LA14_0<='\u2E2D')||(LA14_0>='\u2E2F' && LA14_0<='\uA721')||(LA14_0>='\uA726' && LA14_0<='\uD80B')||(LA14_0>='\uD80D' && LA14_0<='\uDB7F')||(LA14_0>='\uDB81' && LA14_0<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}