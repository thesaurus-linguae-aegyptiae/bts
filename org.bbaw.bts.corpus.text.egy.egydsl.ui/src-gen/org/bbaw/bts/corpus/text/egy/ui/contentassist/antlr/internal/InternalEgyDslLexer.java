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
    public static final int RULE_ID=15;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_SUFFIXSTRING=12;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__20=20;
    public static final int RULE_PLURALSTRING_DOT=8;
    public static final int EOF=-1;
    public static final int RULE_DUALSTRING_COMMA=5;
    public static final int T__55=55;
    public static final int RULE_DUALSTRING_DOT=6;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_INT=14;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_NEWLINE=4;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_CASESTRING=9;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=16;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EGYSTRING=11;
    public static final int RULE_PLURALSTRING_COMMA=7;
    public static final int RULE_WS=13;
    public static final int RULE_BETWEEN_HASHES=10;

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

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:15:7: ( '\\uDB80\\uDC81' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:15:9: '\\uDB80\\uDC81'
            {
            match("\uDB80\uDC81"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:16:7: ( '\\uDB80\\uDC80' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:16:9: '\\uDB80\\uDC80'
            {
            match("\uDB80\uDC80"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:17:7: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:17:9: '\\uDB80\\uDC82'
            {
            match("\uDB80\uDC82"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:18:7: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:18:9: '-'
            {
            match('-'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:19:7: ( '=' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:19:9: '='
            {
            match('='); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:20:7: ( ',' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:20:9: ','
            {
            match(','); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:21:7: ( '.' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:21:9: '.'
            {
            match('.'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:22:7: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:22:9: '\\u2261'
            {
            match('\u2261'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:23:7: ( ':' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:23:9: ':'
            {
            match(':'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:24:7: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:24:9: '\\u22EE'
            {
            match('\u22EE'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:25:7: ( '~' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:25:9: '~'
            {
            match('~'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:26:7: ( '(' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:26:9: '('
            {
            match('('); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:27:7: ( ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:27:9: ')'
            {
            match(')'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:28:7: ( '<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:28:9: '<'
            {
            match('<'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:29:7: ( '>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:29:9: '>'
            {
            match('>'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:30:7: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:30:9: '\\u2E2E'
            {
            match('\u2E2E'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:31:7: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:31:9: '?'
            {
            match('?'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:32:7: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:32:9: '['
            {
            match('['); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:33:7: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:33:9: ']'
            {
            match(']'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:34:7: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:34:9: '{'
            {
            match('{'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:35:7: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:35:9: '}'
            {
            match('}'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:36:7: ( '<<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:36:9: '<<'
            {
            match("<<"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:37:7: ( '>>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:37:9: '>>'
            {
            match(">>"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:38:7: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:38:9: '{{'
            {
            match("{{"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:39:7: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:39:9: '}}'
            {
            match("}}"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:40:7: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:40:9: '(('
            {
            match("(("); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:41:7: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:41:9: '))'
            {
            match("))"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:42:7: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:42:9: '[['
            {
            match("[["); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:43:7: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:43:9: ']]'
            {
            match("]]"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:44:7: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:44:9: '\\u2E22'
            {
            match('\u2E22'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:45:7: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:45:9: '\\u2E23'
            {
            match('\u2E23'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:46:7: ( '--' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:46:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5974:9: ( ( ' ' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5974:11: ( ' ' | '\\t' )
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:14: ( ( '\\r' | '\\n' | '\\r\\n' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:27: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5976:34: '\\t'
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

    // $ANTLR start "RULE_CASESTRING"
    public final void mRULE_CASESTRING() throws RecognitionException {
        try {
            int _type = RULE_CASESTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5978:17: ( 'case ' (~ ( ':' ) )+ ': ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5978:19: 'case ' (~ ( ':' ) )+ ': '
            {
            match("case "); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5978:27: (~ ( ':' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='9')||(LA2_0>=';' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5978:27: ~ ( ':' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            match(": "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASESTRING"

    // $ANTLR start "RULE_BETWEEN_HASHES"
    public final void mRULE_BETWEEN_HASHES() throws RecognitionException {
        try {
            int _type = RULE_BETWEEN_HASHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:21: ( '#' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )* ( ': ' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )* )? '#' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:23: '#' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )* ( ': ' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )* )? '#'
            {
            match('#'); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:27: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )*
            loop3:
            do {
                int alt3=5;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:28: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:37: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:46: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:55: RULE_EGYSTRING
            	    {
            	    mRULE_EGYSTRING(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:72: ( ': ' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==':') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:73: ': ' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )*
                    {
                    match(": "); 

                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:78: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )*
                    loop4:
                    do {
                        int alt4=5;
                        alt4 = dfa4.predict(input);
                        switch (alt4) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:79: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:88: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:97: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5980:106: RULE_EGYSTRING
                    	    {
                    	    mRULE_EGYSTRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BETWEEN_HASHES"

    // $ANTLR start "RULE_DUALSTRING_DOT"
    public final void mRULE_DUALSTRING_DOT() throws RecognitionException {
        try {
            int _type = RULE_DUALSTRING_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5982:21: ( '.du' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5982:23: '.du'
            {
            match(".du"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DUALSTRING_DOT"

    // $ANTLR start "RULE_DUALSTRING_COMMA"
    public final void mRULE_DUALSTRING_COMMA() throws RecognitionException {
        try {
            int _type = RULE_DUALSTRING_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5984:23: ( ',du' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5984:25: ',du'
            {
            match(",du"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DUALSTRING_COMMA"

    // $ANTLR start "RULE_PLURALSTRING_DOT"
    public final void mRULE_PLURALSTRING_DOT() throws RecognitionException {
        try {
            int _type = RULE_PLURALSTRING_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5986:23: ( '.pl' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5986:25: '.pl'
            {
            match(".pl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLURALSTRING_DOT"

    // $ANTLR start "RULE_PLURALSTRING_COMMA"
    public final void mRULE_PLURALSTRING_COMMA() throws RecognitionException {
        try {
            int _type = RULE_PLURALSTRING_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5988:25: ( ',pl' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5988:27: ',pl'
            {
            match(",pl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLURALSTRING_COMMA"

    // $ANTLR start "RULE_SUFFIXSTRING"
    public final void mRULE_SUFFIXSTRING() throws RecognitionException {
        try {
            int _type = RULE_SUFFIXSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:19: ( ( '.' | ',' ) ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:21: ( '.' | ',' ) ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+
            {
            if ( input.LA(1)==','||input.LA(1)=='.' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:31: ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=19;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:32: '\\uA722'
            	    {
            	    match('\uA722'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:41: 'j'
            	    {
            	    match('j'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:45: 'y'
            	    {
            	    match('y'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:49: 'w'
            	    {
            	    match('w'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:53: 'n'
            	    {
            	    match('n'); 

            	    }
            	    break;
            	case 6 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:57: 's'
            	    {
            	    match('s'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:61: 'k'
            	    {
            	    match('k'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:65: 't'
            	    {
            	    match('t'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:69: '\\u1E6F'
            	    {
            	    match('\u1E6F'); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:78: '\\u0131\\u0357'
            	    {
            	    match("\u0131\u0357"); 


            	    }
            	    break;
            	case 11 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:93: '\\u015B'
            	    {
            	    match('\u015B'); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:102: '\\u0131\\u0357\\u032F'
            	    {
            	    match("\u0131\u0357\u032F"); 


            	    }
            	    break;
            	case 13 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:123: '\\u00EF'
            	    {
            	    match('\u00EF'); 

            	    }
            	    break;
            	case 14 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:132: 'u\\u032F'
            	    {
            	    match("u\u032F"); 


            	    }
            	    break;
            	case 15 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:142: '\\u010D'
            	    {
            	    match('\u010D'); 

            	    }
            	    break;
            	case 16 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:151: '\\u1E71'
            	    {
            	    match('\u1E71'); 

            	    }
            	    break;
            	case 17 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:160: 'a'
            	    {
            	    match('a'); 

            	    }
            	    break;
            	case 18 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5990:164: '\\uA723'
            	    {
            	    match('\uA723'); 

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
    // $ANTLR end "RULE_SUFFIXSTRING"

    // $ANTLR start "RULE_EGYSTRING"
    public final void mRULE_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:16: ( ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:18: ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:18: ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=84;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:19: '\\uA722'
            	    {
            	    match('\uA722'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:28: 'j'
            	    {
            	    match('j'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:32: 'y'
            	    {
            	    match('y'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:36: '\\uA724'
            	    {
            	    match('\uA724'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:45: 'w'
            	    {
            	    match('w'); 

            	    }
            	    break;
            	case 6 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:49: 'b'
            	    {
            	    match('b'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:53: 'f'
            	    {
            	    match('f'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:57: 'm'
            	    {
            	    match('m'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:61: 'n'
            	    {
            	    match('n'); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:65: 'r'
            	    {
            	    match('r'); 

            	    }
            	    break;
            	case 11 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:69: 'h'
            	    {
            	    match('h'); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:73: '\\u1E25'
            	    {
            	    match('\u1E25'); 

            	    }
            	    break;
            	case 13 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:82: '\\u1E2B'
            	    {
            	    match('\u1E2B'); 

            	    }
            	    break;
            	case 14 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:91: '\\u1E96'
            	    {
            	    match('\u1E96'); 

            	    }
            	    break;
            	case 15 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:100: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;
            	case 16 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:104: 's'
            	    {
            	    match('s'); 

            	    }
            	    break;
            	case 17 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:108: '\\u0161'
            	    {
            	    match('\u0161'); 

            	    }
            	    break;
            	case 18 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:117: 'q'
            	    {
            	    match('q'); 

            	    }
            	    break;
            	case 19 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:121: 'k'
            	    {
            	    match('k'); 

            	    }
            	    break;
            	case 20 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:125: 'g'
            	    {
            	    match('g'); 

            	    }
            	    break;
            	case 21 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:129: 't'
            	    {
            	    match('t'); 

            	    }
            	    break;
            	case 22 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:133: '\\u1E6F'
            	    {
            	    match('\u1E6F'); 

            	    }
            	    break;
            	case 23 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:142: 'd'
            	    {
            	    match('d'); 

            	    }
            	    break;
            	case 24 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:146: '\\u1E0F'
            	    {
            	    match('\u1E0F'); 

            	    }
            	    break;
            	case 25 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:155: '\\u02BE'
            	    {
            	    match('\u02BE'); 

            	    }
            	    break;
            	case 26 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:164: '\\u0131\\u0357'
            	    {
            	    match("\u0131\u0357"); 


            	    }
            	    break;
            	case 27 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:179: '\\u015B'
            	    {
            	    match('\u015B'); 

            	    }
            	    break;
            	case 28 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:188: '\\u1E33'
            	    {
            	    match('\u1E33'); 

            	    }
            	    break;
            	case 29 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:197: '\\u0131\\u0357\\u032F'
            	    {
            	    match("\u0131\u0357\u032F"); 


            	    }
            	    break;
            	case 30 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:218: '\\u00EF'
            	    {
            	    match('\u00EF'); 

            	    }
            	    break;
            	case 31 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:227: 'u\\u032F'
            	    {
            	    match("u\u032F"); 


            	    }
            	    break;
            	case 32 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:237: '\\u010D'
            	    {
            	    match('\u010D'); 

            	    }
            	    break;
            	case 33 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:246: '\\u010D\\u0323'
            	    {
            	    match("\u010D\u0323"); 


            	    }
            	    break;
            	case 34 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:261: '\\u1E6D'
            	    {
            	    match('\u1E6D'); 

            	    }
            	    break;
            	case 35 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:270: 'h\\u032D'
            	    {
            	    match("h\u032D"); 


            	    }
            	    break;
            	case 36 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:280: '\\u1E71'
            	    {
            	    match('\u1E71'); 

            	    }
            	    break;
            	case 37 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:289: 'a'
            	    {
            	    match('a'); 

            	    }
            	    break;
            	case 38 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:293: 'i\\u032D'
            	    {
            	    match("i\u032D"); 


            	    }
            	    break;
            	case 39 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:303: '\\uA723'
            	    {
            	    match('\uA723'); 

            	    }
            	    break;
            	case 40 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:312: 'J'
            	    {
            	    match('J'); 

            	    }
            	    break;
            	case 41 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:316: 'Y'
            	    {
            	    match('Y'); 

            	    }
            	    break;
            	case 42 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:320: '\\uA725'
            	    {
            	    match('\uA725'); 

            	    }
            	    break;
            	case 43 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:329: 'W'
            	    {
            	    match('W'); 

            	    }
            	    break;
            	case 44 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:333: 'B'
            	    {
            	    match('B'); 

            	    }
            	    break;
            	case 45 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:337: 'P'
            	    {
            	    match('P'); 

            	    }
            	    break;
            	case 46 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:341: 'F'
            	    {
            	    match('F'); 

            	    }
            	    break;
            	case 47 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:345: 'M'
            	    {
            	    match('M'); 

            	    }
            	    break;
            	case 48 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:349: 'N'
            	    {
            	    match('N'); 

            	    }
            	    break;
            	case 49 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:353: 'R'
            	    {
            	    match('R'); 

            	    }
            	    break;
            	case 50 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:357: 'L'
            	    {
            	    match('L'); 

            	    }
            	    break;
            	case 51 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:361: 'H'
            	    {
            	    match('H'); 

            	    }
            	    break;
            	case 52 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:365: '\\u1E24'
            	    {
            	    match('\u1E24'); 

            	    }
            	    break;
            	case 53 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:374: '\\u1E2A'
            	    {
            	    match('\u1E2A'); 

            	    }
            	    break;
            	case 54 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:383: 'H\\u0331'
            	    {
            	    match("H\u0331"); 


            	    }
            	    break;
            	case 55 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:393: 'Z'
            	    {
            	    match('Z'); 

            	    }
            	    break;
            	case 56 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:397: 'S'
            	    {
            	    match('S'); 

            	    }
            	    break;
            	case 57 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:401: '\\u0160'
            	    {
            	    match('\u0160'); 

            	    }
            	    break;
            	case 58 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:410: 'Q'
            	    {
            	    match('Q'); 

            	    }
            	    break;
            	case 59 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:414: 'K'
            	    {
            	    match('K'); 

            	    }
            	    break;
            	case 60 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:418: 'G'
            	    {
            	    match('G'); 

            	    }
            	    break;
            	case 61 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:422: 'T'
            	    {
            	    match('T'); 

            	    }
            	    break;
            	case 62 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:426: '\\u1E6E'
            	    {
            	    match('\u1E6E'); 

            	    }
            	    break;
            	case 63 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:435: 'D'
            	    {
            	    match('D'); 

            	    }
            	    break;
            	case 64 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:439: '\\u1E0E'
            	    {
            	    match('\u1E0E'); 

            	    }
            	    break;
            	case 65 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:448: 'I\\u0357'
            	    {
            	    match("I\u0357"); 


            	    }
            	    break;
            	case 66 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:458: '\\u015A'
            	    {
            	    match('\u015A'); 

            	    }
            	    break;
            	case 67 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:467: '\\u1E32'
            	    {
            	    match('\u1E32'); 

            	    }
            	    break;
            	case 68 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:476: '\\u010C'
            	    {
            	    match('\u010C'); 

            	    }
            	    break;
            	case 69 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:485: '\\u010C\\u0323'
            	    {
            	    match("\u010C\u0323"); 


            	    }
            	    break;
            	case 70 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:500: '\\u1E6C'
            	    {
            	    match('\u1E6C'); 

            	    }
            	    break;
            	case 71 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:509: 'H\\u032D'
            	    {
            	    match("H\u032D"); 


            	    }
            	    break;
            	case 72 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:519: '\\u1E70'
            	    {
            	    match('\u1E70'); 

            	    }
            	    break;
            	case 73 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:528: 'A'
            	    {
            	    match('A'); 

            	    }
            	    break;
            	case 74 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:532: 'I'
            	    {
            	    match('I'); 

            	    }
            	    break;
            	case 75 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:536: '\\u2C80' .. '\\u2CFF'
            	    {
            	    matchRange('\u2C80','\u2CFF'); 

            	    }
            	    break;
            	case 76 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:555: '\\uD80C\\uDE86'
            	    {
            	    match("\uD80C\uDE86"); 


            	    }
            	    break;
            	case 77 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:570: '\\uD80C\\uDE87'
            	    {
            	    match("\uD80C\uDE87"); 


            	    }
            	    break;
            	case 78 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:585: '\\uD80C\\uDF79'
            	    {
            	    match("\uD80C\uDF79"); 


            	    }
            	    break;
            	case 79 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:600: '\\uD80C\\uDF7A'
            	    {
            	    match("\uD80C\uDF7A"); 


            	    }
            	    break;
            	case 80 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:615: '\\uD80C\\uDE58'
            	    {
            	    match("\uD80C\uDE58"); 


            	    }
            	    break;
            	case 81 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:630: '\\uD80C\\uDE82'
            	    {
            	    match("\uD80C\uDE82"); 


            	    }
            	    break;
            	case 82 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:645: 'p'
            	    {
            	    match('p'); 

            	    }
            	    break;
            	case 83 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5992:649: 'l'
            	    {
            	    match('l'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:11: '^'
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

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5994:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5996:10: ( ( '0' .. '9' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5996:12: ( '0' .. '9' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5996:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5996:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:5998:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6000:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6000:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6000:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6000:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:41: ( '\\r' )? '\\n'
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6002:41: '\\r'
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6004:16: ( . )
            // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:6004:18: .
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
        // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_WS | RULE_NEWLINE | RULE_CASESTRING | RULE_BETWEEN_HASHES | RULE_DUALSTRING_DOT | RULE_DUALSTRING_COMMA | RULE_PLURALSTRING_DOT | RULE_PLURALSTRING_COMMA | RULE_SUFFIXSTRING | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt18=52;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:226: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:234: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 39 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:247: RULE_CASESTRING
                {
                mRULE_CASESTRING(); 

                }
                break;
            case 40 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:263: RULE_BETWEEN_HASHES
                {
                mRULE_BETWEEN_HASHES(); 

                }
                break;
            case 41 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:283: RULE_DUALSTRING_DOT
                {
                mRULE_DUALSTRING_DOT(); 

                }
                break;
            case 42 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:303: RULE_DUALSTRING_COMMA
                {
                mRULE_DUALSTRING_COMMA(); 

                }
                break;
            case 43 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:325: RULE_PLURALSTRING_DOT
                {
                mRULE_PLURALSTRING_DOT(); 

                }
                break;
            case 44 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:347: RULE_PLURALSTRING_COMMA
                {
                mRULE_PLURALSTRING_COMMA(); 

                }
                break;
            case 45 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:371: RULE_SUFFIXSTRING
                {
                mRULE_SUFFIXSTRING(); 

                }
                break;
            case 46 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:389: RULE_EGYSTRING
                {
                mRULE_EGYSTRING(); 

                }
                break;
            case 47 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:404: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:412: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:421: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:433: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:449: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/ui/contentassist/antlr/internal/InternalEgyDsl.g:1:465: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA3_eotS =
        "\55\uffff";
    static final String DFA3_eofS =
        "\55\uffff";
    static final String DFA3_minS =
        "\1\43\24\uffff\1\43\1\uffff\1\43\25\uffff";
    static final String DFA3_maxS =
        "\1\ud80c\24\uffff\1\ud80c\1\uffff\1\ud80c\25\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\5\1\1\1\2\1\3\1\4\17\1\1\uffff\1\1\1\uffff\1\1\23\2"+
        "\1\1";
    static final String DFA3_specialS =
        "\55\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\14\uffff\12\4\1\1\6\uffff\1\53\1\33\1\53\1\51\1\53\1\35"+
            "\1\47\1\42\1\52\1\3\1\46\1\41\1\36\1\37\1\53\1\34\1\45\1\40"+
            "\1\44\1\50\2\53\1\32\1\53\1\31\1\43\6\uffff\1\26\1\10\1\54\1"+
            "\24\1\54\1\11\1\22\1\15\1\27\1\2\1\21\1\54\1\12\1\13\1\54\1"+
            "\30\1\20\1\14\1\17\1\23\1\25\1\54\1\7\1\54\1\6\1\16\164\uffff"+
            "\1\5\34\uffff\2\5\43\uffff\1\5\50\uffff\2\5\4\uffff\2\5\u015c"+
            "\uffff\1\5\u1b4f\uffff\2\5\24\uffff\2\5\4\uffff\2\5\6\uffff"+
            "\2\5\70\uffff\6\5\44\uffff\1\5\u0de9\uffff\u0080\5\u7a22\uffff"+
            "\4\5\u30e6\uffff\1\5",
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
            "\1\54\14\uffff\13\54\6\uffff\32\54\6\uffff\32\54\164\uffff"+
            "\1\54\34\uffff\2\54\43\uffff\1\54\50\uffff\2\54\4\uffff\2\54"+
            "\u015c\uffff\1\54\160\uffff\1\5\u1ade\uffff\2\54\24\uffff\2"+
            "\54\4\uffff\2\54\6\uffff\2\54\70\uffff\6\54\44\uffff\1\54\u0de9"+
            "\uffff\u0080\54\u7a22\uffff\4\54\u30e6\uffff\1\54",
            "",
            "\1\54\14\uffff\13\54\6\uffff\32\54\6\uffff\32\54\164\uffff"+
            "\1\54\34\uffff\2\54\43\uffff\1\54\50\uffff\2\54\4\uffff\2\54"+
            "\u015c\uffff\1\54\156\uffff\1\5\u1ae0\uffff\2\54\24\uffff\2"+
            "\54\4\uffff\2\54\6\uffff\2\54\70\uffff\6\54\44\uffff\1\54\u0de9"+
            "\uffff\u0080\54\u7a22\uffff\4\54\u30e6\uffff\1\54",
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
            return "()* loopback of 5980:27: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )*";
        }
    }
    static final String DFA4_eotS =
        "\55\uffff";
    static final String DFA4_eofS =
        "\55\uffff";
    static final String DFA4_minS =
        "\1\43\24\uffff\1\43\1\uffff\1\43\25\uffff";
    static final String DFA4_maxS =
        "\1\ud80c\24\uffff\1\ud80c\1\uffff\1\ud80c\25\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\5\1\1\1\2\1\3\1\4\17\1\1\uffff\1\1\1\uffff\1\1\23\2"+
        "\1\1";
    static final String DFA4_specialS =
        "\55\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\14\uffff\12\4\7\uffff\1\53\1\33\1\53\1\51\1\53\1\35\1"+
            "\47\1\42\1\52\1\3\1\46\1\41\1\36\1\37\1\53\1\34\1\45\1\40\1"+
            "\44\1\50\2\53\1\32\1\53\1\31\1\43\6\uffff\1\26\1\10\1\54\1\24"+
            "\1\54\1\11\1\22\1\15\1\27\1\2\1\21\1\54\1\12\1\13\1\54\1\30"+
            "\1\20\1\14\1\17\1\23\1\25\1\54\1\7\1\54\1\6\1\16\164\uffff\1"+
            "\5\34\uffff\2\5\43\uffff\1\5\50\uffff\2\5\4\uffff\2\5\u015c"+
            "\uffff\1\5\u1b4f\uffff\2\5\24\uffff\2\5\4\uffff\2\5\6\uffff"+
            "\2\5\70\uffff\6\5\44\uffff\1\5\u0de9\uffff\u0080\5\u7a22\uffff"+
            "\4\5\u30e6\uffff\1\5",
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
            "\1\54\14\uffff\12\54\7\uffff\32\54\6\uffff\32\54\164\uffff"+
            "\1\54\34\uffff\2\54\43\uffff\1\54\50\uffff\2\54\4\uffff\2\54"+
            "\u015c\uffff\1\54\160\uffff\1\5\u1ade\uffff\2\54\24\uffff\2"+
            "\54\4\uffff\2\54\6\uffff\2\54\70\uffff\6\54\44\uffff\1\54\u0de9"+
            "\uffff\u0080\54\u7a22\uffff\4\54\u30e6\uffff\1\54",
            "",
            "\1\54\14\uffff\12\54\7\uffff\32\54\6\uffff\32\54\164\uffff"+
            "\1\54\34\uffff\2\54\43\uffff\1\54\50\uffff\2\54\4\uffff\2\54"+
            "\u015c\uffff\1\54\156\uffff\1\5\u1ae0\uffff\2\54\24\uffff\2"+
            "\54\4\uffff\2\54\6\uffff\2\54\70\uffff\6\54\44\uffff\1\54\u0de9"+
            "\uffff\u0080\54\u7a22\uffff\4\54\u30e6\uffff\1\54",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 5980:78: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | RULE_EGYSTRING )*";
        }
    }
    static final String DFA6_eotS =
        "\1\1\22\uffff\1\25\2\uffff";
    static final String DFA6_eofS =
        "\26\uffff";
    static final String DFA6_minS =
        "\1\141\12\uffff\1\u0357\7\uffff\1\u032f\2\uffff";
    static final String DFA6_maxS =
        "\1\ua723\12\uffff\1\u0357\7\uffff\1\u032f\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\23\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\14\1\12";
    static final String DFA6_specialS =
        "\26\uffff}>";
    static final String[] DFA6_transitionS = {
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()+ loopback of 5990:31: ( '\\uA722' | 'j' | 'y' | 'w' | 'n' | 's' | 'k' | 't' | '\\u1E6F' | '\\u0131\\u0357' | '\\u015B' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u1E71' | 'a' | '\\uA723' )+";
        }
    }
    static final String DFA7_eotS =
        "\1\1\13\uffff\1\112\23\uffff\1\115\20\uffff\1\120\14\uffff\1\122"+
        "\2\uffff\1\124\11\uffff\1\134\21\uffff";
    static final String DFA7_eofS =
        "\135\uffff";
    static final String DFA7_minS =
        "\1\101\13\uffff\1\u032d\16\uffff\1\u0357\4\uffff\1\u0323\20\uffff"+
        "\1\u032d\14\uffff\1\u0357\2\uffff\1\u0323\4\uffff\1\ude58\4\uffff"+
        "\1\u032f\21\uffff";
    static final String DFA7_maxS =
        "\1\ud80c\13\uffff\1\u032d\16\uffff\1\u0357\4\uffff\1\u0323\20\uffff"+
        "\1\u0331\14\uffff\1\u0357\2\uffff\1\u0323\4\uffff\1\udf7a\4\uffff"+
        "\1\u032f\21\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\124\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\uffff\1\33\1\34\1\36\1\37\1\uffff\1\42\1\44\1\45\1\46\1"+
        "\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\uffff"+
        "\1\64\1\65\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1"+
        "\uffff\1\102\1\103\1\uffff\1\106\1\110\1\111\1\113\1\uffff\1\122"+
        "\1\123\1\43\1\13\1\uffff\1\41\1\40\1\66\1\107\1\63\1\101\1\112\1"+
        "\105\1\104\1\114\1\115\1\116\1\117\1\120\1\121\1\35\1\32";
    static final String DFA7_specialS =
        "\135\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\104\1\52\1\uffff\1\74\1\uffff\1\54\1\71\1\61\1\76\1\46\1"+
            "\70\1\60\1\55\1\56\1\uffff\1\53\1\67\1\57\1\65\1\72\2\uffff"+
            "\1\51\1\uffff\1\47\1\64\6\uffff\1\43\1\7\1\uffff\1\30\1\uffff"+
            "\1\10\1\25\1\14\1\44\1\3\1\24\1\110\1\11\1\12\1\uffff\1\107"+
            "\1\23\1\13\1\21\1\26\1\37\1\uffff\1\6\1\uffff\1\4\1\20\164\uffff"+
            "\1\36\34\uffff\1\101\1\40\43\uffff\1\33\50\uffff\1\77\1\34\4"+
            "\uffff\1\66\1\22\u015c\uffff\1\32\u1b4f\uffff\1\75\1\31\24\uffff"+
            "\1\62\1\15\4\uffff\1\63\1\16\6\uffff\1\100\1\35\70\uffff\1\102"+
            "\1\41\1\73\1\27\1\103\1\42\44\uffff\1\17\u0de9\uffff\u0080\105"+
            "\u7a22\uffff\1\2\1\45\1\5\1\50\u30e6\uffff\1\106",
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
            return "()+ loopback of 5992:18: ( '\\uA722' | 'j' | 'y' | '\\uA724' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'z' | 's' | '\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | 'd' | '\\u1E0F' | '\\u02BE' | '\\u0131\\u0357' | '\\u015B' | '\\u1E33' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'u\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u1E6D' | 'h\\u032D' | '\\u1E71' | 'a' | 'i\\u032D' | '\\uA723' | 'J' | 'Y' | '\\uA725' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'Z' | 'S' | '\\u0160' | 'Q' | 'K' | 'G' | 'T' | '\\u1E6E' | 'D' | '\\u1E0E' | 'I\\u0357' | '\\u015A' | '\\u1E32' | '\\u010C' | '\\u010C\\u0323' | '\\u1E6C' | 'H\\u032D' | '\\u1E70' | 'A' | 'I' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' )+";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff\2\154\1\165\1\uffff\1\172\1\175\4\uffff\1\u0083\1\u0085"+
        "\1\u0087\1\u0089\2\uffff\1\u008d\1\u008f\1\u0091\1\u0093\5\uffff"+
        "\1\u0099\1\154\1\uffff\2\u009b\1\uffff\7\u009b\3\uffff\2\u009b\1"+
        "\uffff\4\u009b\1\uffff\1\u009b\2\uffff\1\154\3\uffff\1\u0099\3\uffff"+
        "\1\u009b\1\u0099\1\uffff\2\u009b\1\uffff\11\u009b\2\uffff\2\u009b"+
        "\1\uffff\4\u009b\1\uffff\1\u009b\1\uffff\1\u009b\5\uffff\1\u009b"+
        "\1\uffff\1\154\2\u009b\1\154\2\uffff\3\154\54\uffff\1\u0099\3\uffff"+
        "\20\u009b\1\u0099\1\u009b\1\u0099\26\u009b\4\uffff\2\u0099\1\uffff";
    static final String DFA18_eofS =
        "\u00cc\uffff";
    static final String DFA18_minS =
        "\1\0\3\uffff\1\40\1\udc80\1\55\1\uffff\2\141\4\uffff\1\50\1\51"+
        "\1\74\1\76\2\uffff\1\133\1\135\1\173\1\175\5\uffff\1\141\1\43\1"+
        "\uffff\2\60\1\uffff\7\60\3\uffff\2\60\1\uffff\4\60\1\uffff\1\60"+
        "\2\uffff\1\u0357\3\uffff\1\u032f\3\uffff\1\60\1\u032d\1\uffff\2"+
        "\60\1\uffff\11\60\2\uffff\2\60\1\uffff\4\60\1\uffff\1\60\1\uffff"+
        "\1\60\5\uffff\1\60\1\uffff\1\ude58\2\60\1\101\2\uffff\2\0\1\52\54"+
        "\uffff\1\163\3\uffff\20\60\1\u032f\1\60\1\u032d\26\60\4\uffff\1"+
        "\145\1\40\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\3\uffff\1\40\1\udc82\1\55\1\uffff\2\ua723\4\uffff\1\50"+
        "\1\51\1\74\1\76\2\uffff\1\133\1\135\1\173\1\175\5\uffff\1\141\1"+
        "\ud80c\1\uffff\2\172\1\uffff\7\172\3\uffff\2\172\1\uffff\4\172\1"+
        "\uffff\1\172\2\uffff\1\u0357\3\uffff\1\u032f\3\uffff\1\172\1\u032d"+
        "\1\uffff\2\172\1\uffff\11\172\2\uffff\2\172\1\uffff\4\172\1\uffff"+
        "\1\172\1\uffff\1\172\5\uffff\1\172\1\uffff\1\udf7a\3\172\2\uffff"+
        "\2\uffff\1\57\54\uffff\1\163\3\uffff\20\172\1\u032f\1\172\1\u032d"+
        "\26\172\4\uffff\1\145\1\40\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\11\2\uffff\1\14\1\15\1\16\1\17\4"+
        "\uffff\1\24\1\25\4\uffff\1\42\1\43\1\45\2\46\2\uffff\1\56\2\uffff"+
        "\1\56\7\uffff\3\56\2\uffff\1\56\4\uffff\1\56\1\uffff\2\56\1\uffff"+
        "\3\56\1\uffff\3\56\2\uffff\1\56\2\uffff\1\56\11\uffff\2\56\2\uffff"+
        "\1\56\4\uffff\1\56\1\uffff\1\56\1\uffff\5\56\1\uffff\1\56\4\uffff"+
        "\1\57\1\60\3\uffff\1\64\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\44\1\10\1"+
        "\11\1\52\1\54\1\55\1\12\1\51\1\53\1\13\1\14\1\15\1\16\1\17\1\36"+
        "\1\20\1\37\1\21\1\32\1\22\1\33\1\23\1\24\1\25\1\40\1\26\1\41\1\27"+
        "\1\34\1\30\1\35\1\31\1\42\1\43\1\45\1\46\1\uffff\1\57\1\50\1\56"+
        "\51\uffff\1\60\1\61\1\62\1\63\2\uffff\1\47";
    static final String DFA18_specialS =
        "\1\1\150\uffff\1\0\1\2\141\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\154\1\32\1\34\2\154\1\33\22\154\1\1\1\154\1\151\1\36\1"+
            "\154\1\3\1\154\1\152\1\16\1\17\2\154\1\10\1\6\1\11\1\153\12"+
            "\150\1\13\1\4\1\20\1\7\1\21\1\23\1\154\1\141\1\107\1\147\1\131"+
            "\1\147\1\111\1\126\1\116\1\133\1\103\1\125\1\115\1\112\1\113"+
            "\1\147\1\110\1\124\1\114\1\122\1\127\2\147\1\106\1\147\1\104"+
            "\1\121\1\24\1\154\1\25\1\146\1\147\1\154\1\100\1\44\1\35\1\65"+
            "\1\147\1\45\1\62\1\51\1\101\1\40\1\61\1\145\1\46\1\47\1\147"+
            "\1\144\1\60\1\50\1\56\1\63\1\74\1\147\1\43\1\147\1\41\1\55\1"+
            "\26\1\154\1\27\1\15\50\154\1\2\107\154\1\73\34\154\1\136\1\75"+
            "\43\154\1\70\50\154\1\134\1\71\4\154\1\123\1\57\u015c\154\1"+
            "\67\u1b4f\154\1\132\1\66\24\154\1\117\1\52\4\154\1\120\1\53"+
            "\6\154\1\135\1\72\70\154\1\137\1\76\1\130\1\64\1\140\1\77\44"+
            "\154\1\54\u03ca\154\1\12\u008c\154\1\14\u0991\154\u0080\142"+
            "\u0122\154\1\30\1\31\12\154\1\22\u78f3\154\1\37\1\102\1\42\1"+
            "\105\u30e6\154\1\143\u0373\154\1\5\u247f\154",
            "",
            "",
            "",
            "\1\160",
            "\1\162\1\161\1\163",
            "\1\164",
            "",
            "\1\171\2\uffff\1\167\5\uffff\2\171\2\uffff\1\171\1\uffff\1"+
            "\170\2\uffff\3\171\1\uffff\1\171\1\uffff\1\171\165\uffff\1\171"+
            "\35\uffff\1\171\43\uffff\1\171\51\uffff\1\171\u1d13\uffff\1"+
            "\171\1\uffff\1\171\u88b0\uffff\2\171",
            "\1\171\2\uffff\1\173\5\uffff\2\171\2\uffff\1\171\1\uffff\1"+
            "\174\2\uffff\3\171\1\uffff\1\171\1\uffff\1\171\165\uffff\1\171"+
            "\35\uffff\1\171\43\uffff\1\171\51\uffff\1\171\u1d13\uffff\1"+
            "\171\1\uffff\1\171\u88b0\uffff\2\171",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0084",
            "\1\u0086",
            "\1\u0088",
            "",
            "",
            "\1\u008c",
            "\1\u008e",
            "\1\u0090",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "\1\u0098",
            "\1\u009a\14\uffff\13\u009a\6\uffff\32\u009a\6\uffff\32\u009a"+
            "\164\uffff\1\u009a\34\uffff\2\u009a\43\uffff\1\u009a\50\uffff"+
            "\2\u009a\4\uffff\2\u009a\u015c\uffff\1\u009a\u1b4f\uffff\2\u009a"+
            "\24\uffff\2\u009a\4\uffff\2\u009a\6\uffff\2\u009a\70\uffff\6"+
            "\u009a\44\uffff\1\u009a\u0de9\uffff\u0080\u009a\u7a22\uffff"+
            "\4\u009a\u30e6\uffff\1\u009a",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "",
            "\1\u009b",
            "",
            "",
            "",
            "\1\u009b",
            "",
            "",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\1\u009b",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "\1\u009b\51\uffff\1\u009b\3\uffff\2\u009b\u00f1\uffff\2\u009b",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\32\u0099\4\uffff\1\u0099\1\uffff\32\u0099",
            "",
            "",
            "\0\u00c6",
            "\0\u00c6",
            "\1\u00c7\4\uffff\1\u00c8",
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
            "\1\u00c9",
            "",
            "",
            "",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\1\u009b",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\1\u009b",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "\12\u0099\7\uffff\1\u00c2\1\u00b2\1\u0099\1\u00c0\1\u0099"+
            "\1\u00b4\1\u00be\1\u00b9\1\u00c1\1\u00af\1\u00bd\1\u00b8\1\u00b5"+
            "\1\u00b6\1\u0099\1\u00b3\1\u00bc\1\u00b7\1\u00bb\1\u00bf\2\u0099"+
            "\1\u00b1\1\u0099\1\u00b0\1\u00ba\4\uffff\1\u0099\1\uffff\1\u00ad"+
            "\1\u009f\1\u0099\1\u00ab\1\u0099\1\u00a0\1\u00a9\1\u00a4\1\u00ae"+
            "\1\u009c\1\u00a8\1\u00c4\1\u00a1\1\u00a2\1\u0099\1\u00c3\1\u00a7"+
            "\1\u00a3\1\u00a6\1\u00aa\1\u00ac\1\u0099\1\u009e\1\u0099\1\u009d"+
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "\1\u00ca",
            "\1\u00cb",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_WS | RULE_NEWLINE | RULE_CASESTRING | RULE_BETWEEN_HASHES | RULE_DUALSTRING_DOT | RULE_DUALSTRING_COMMA | RULE_PLURALSTRING_DOT | RULE_PLURALSTRING_COMMA | RULE_SUFFIXSTRING | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_105 = input.LA(1);

                        s = -1;
                        if ( ((LA18_105>='\u0000' && LA18_105<='\uFFFF')) ) {s = 198;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0==' ') ) {s = 1;}

                        else if ( (LA18_0=='\u00A7') ) {s = 2;}

                        else if ( (LA18_0=='%') ) {s = 3;}

                        else if ( (LA18_0==';') ) {s = 4;}

                        else if ( (LA18_0=='\uDB80') ) {s = 5;}

                        else if ( (LA18_0=='-') ) {s = 6;}

                        else if ( (LA18_0=='=') ) {s = 7;}

                        else if ( (LA18_0==',') ) {s = 8;}

                        else if ( (LA18_0=='.') ) {s = 9;}

                        else if ( (LA18_0=='\u2261') ) {s = 10;}

                        else if ( (LA18_0==':') ) {s = 11;}

                        else if ( (LA18_0=='\u22EE') ) {s = 12;}

                        else if ( (LA18_0=='~') ) {s = 13;}

                        else if ( (LA18_0=='(') ) {s = 14;}

                        else if ( (LA18_0==')') ) {s = 15;}

                        else if ( (LA18_0=='<') ) {s = 16;}

                        else if ( (LA18_0=='>') ) {s = 17;}

                        else if ( (LA18_0=='\u2E2E') ) {s = 18;}

                        else if ( (LA18_0=='?') ) {s = 19;}

                        else if ( (LA18_0=='[') ) {s = 20;}

                        else if ( (LA18_0==']') ) {s = 21;}

                        else if ( (LA18_0=='{') ) {s = 22;}

                        else if ( (LA18_0=='}') ) {s = 23;}

                        else if ( (LA18_0=='\u2E22') ) {s = 24;}

                        else if ( (LA18_0=='\u2E23') ) {s = 25;}

                        else if ( (LA18_0=='\t') ) {s = 26;}

                        else if ( (LA18_0=='\r') ) {s = 27;}

                        else if ( (LA18_0=='\n') ) {s = 28;}

                        else if ( (LA18_0=='c') ) {s = 29;}

                        else if ( (LA18_0=='#') ) {s = 30;}

                        else if ( (LA18_0=='\uA722') ) {s = 31;}

                        else if ( (LA18_0=='j') ) {s = 32;}

                        else if ( (LA18_0=='y') ) {s = 33;}

                        else if ( (LA18_0=='\uA724') ) {s = 34;}

                        else if ( (LA18_0=='w') ) {s = 35;}

                        else if ( (LA18_0=='b') ) {s = 36;}

                        else if ( (LA18_0=='f') ) {s = 37;}

                        else if ( (LA18_0=='m') ) {s = 38;}

                        else if ( (LA18_0=='n') ) {s = 39;}

                        else if ( (LA18_0=='r') ) {s = 40;}

                        else if ( (LA18_0=='h') ) {s = 41;}

                        else if ( (LA18_0=='\u1E25') ) {s = 42;}

                        else if ( (LA18_0=='\u1E2B') ) {s = 43;}

                        else if ( (LA18_0=='\u1E96') ) {s = 44;}

                        else if ( (LA18_0=='z') ) {s = 45;}

                        else if ( (LA18_0=='s') ) {s = 46;}

                        else if ( (LA18_0=='\u0161') ) {s = 47;}

                        else if ( (LA18_0=='q') ) {s = 48;}

                        else if ( (LA18_0=='k') ) {s = 49;}

                        else if ( (LA18_0=='g') ) {s = 50;}

                        else if ( (LA18_0=='t') ) {s = 51;}

                        else if ( (LA18_0=='\u1E6F') ) {s = 52;}

                        else if ( (LA18_0=='d') ) {s = 53;}

                        else if ( (LA18_0=='\u1E0F') ) {s = 54;}

                        else if ( (LA18_0=='\u02BE') ) {s = 55;}

                        else if ( (LA18_0=='\u0131') ) {s = 56;}

                        else if ( (LA18_0=='\u015B') ) {s = 57;}

                        else if ( (LA18_0=='\u1E33') ) {s = 58;}

                        else if ( (LA18_0=='\u00EF') ) {s = 59;}

                        else if ( (LA18_0=='u') ) {s = 60;}

                        else if ( (LA18_0=='\u010D') ) {s = 61;}

                        else if ( (LA18_0=='\u1E6D') ) {s = 62;}

                        else if ( (LA18_0=='\u1E71') ) {s = 63;}

                        else if ( (LA18_0=='a') ) {s = 64;}

                        else if ( (LA18_0=='i') ) {s = 65;}

                        else if ( (LA18_0=='\uA723') ) {s = 66;}

                        else if ( (LA18_0=='J') ) {s = 67;}

                        else if ( (LA18_0=='Y') ) {s = 68;}

                        else if ( (LA18_0=='\uA725') ) {s = 69;}

                        else if ( (LA18_0=='W') ) {s = 70;}

                        else if ( (LA18_0=='B') ) {s = 71;}

                        else if ( (LA18_0=='P') ) {s = 72;}

                        else if ( (LA18_0=='F') ) {s = 73;}

                        else if ( (LA18_0=='M') ) {s = 74;}

                        else if ( (LA18_0=='N') ) {s = 75;}

                        else if ( (LA18_0=='R') ) {s = 76;}

                        else if ( (LA18_0=='L') ) {s = 77;}

                        else if ( (LA18_0=='H') ) {s = 78;}

                        else if ( (LA18_0=='\u1E24') ) {s = 79;}

                        else if ( (LA18_0=='\u1E2A') ) {s = 80;}

                        else if ( (LA18_0=='Z') ) {s = 81;}

                        else if ( (LA18_0=='S') ) {s = 82;}

                        else if ( (LA18_0=='\u0160') ) {s = 83;}

                        else if ( (LA18_0=='Q') ) {s = 84;}

                        else if ( (LA18_0=='K') ) {s = 85;}

                        else if ( (LA18_0=='G') ) {s = 86;}

                        else if ( (LA18_0=='T') ) {s = 87;}

                        else if ( (LA18_0=='\u1E6E') ) {s = 88;}

                        else if ( (LA18_0=='D') ) {s = 89;}

                        else if ( (LA18_0=='\u1E0E') ) {s = 90;}

                        else if ( (LA18_0=='I') ) {s = 91;}

                        else if ( (LA18_0=='\u015A') ) {s = 92;}

                        else if ( (LA18_0=='\u1E32') ) {s = 93;}

                        else if ( (LA18_0=='\u010C') ) {s = 94;}

                        else if ( (LA18_0=='\u1E6C') ) {s = 95;}

                        else if ( (LA18_0=='\u1E70') ) {s = 96;}

                        else if ( (LA18_0=='A') ) {s = 97;}

                        else if ( ((LA18_0>='\u2C80' && LA18_0<='\u2CFF')) ) {s = 98;}

                        else if ( (LA18_0=='\uD80C') ) {s = 99;}

                        else if ( (LA18_0=='p') ) {s = 100;}

                        else if ( (LA18_0=='l') ) {s = 101;}

                        else if ( (LA18_0=='^') ) {s = 102;}

                        else if ( (LA18_0=='C'||LA18_0=='E'||LA18_0=='O'||(LA18_0>='U' && LA18_0<='V')||LA18_0=='X'||LA18_0=='_'||LA18_0=='e'||LA18_0=='o'||LA18_0=='v'||LA18_0=='x') ) {s = 103;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 104;}

                        else if ( (LA18_0=='\"') ) {s = 105;}

                        else if ( (LA18_0=='\'') ) {s = 106;}

                        else if ( (LA18_0=='/') ) {s = 107;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||LA18_0=='$'||LA18_0=='&'||(LA18_0>='*' && LA18_0<='+')||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||LA18_0=='|'||(LA18_0>='\u007F' && LA18_0<='\u00A6')||(LA18_0>='\u00A8' && LA18_0<='\u00EE')||(LA18_0>='\u00F0' && LA18_0<='\u010B')||(LA18_0>='\u010E' && LA18_0<='\u0130')||(LA18_0>='\u0132' && LA18_0<='\u0159')||(LA18_0>='\u015C' && LA18_0<='\u015F')||(LA18_0>='\u0162' && LA18_0<='\u02BD')||(LA18_0>='\u02BF' && LA18_0<='\u1E0D')||(LA18_0>='\u1E10' && LA18_0<='\u1E23')||(LA18_0>='\u1E26' && LA18_0<='\u1E29')||(LA18_0>='\u1E2C' && LA18_0<='\u1E31')||(LA18_0>='\u1E34' && LA18_0<='\u1E6B')||(LA18_0>='\u1E72' && LA18_0<='\u1E95')||(LA18_0>='\u1E97' && LA18_0<='\u2260')||(LA18_0>='\u2262' && LA18_0<='\u22ED')||(LA18_0>='\u22EF' && LA18_0<='\u2C7F')||(LA18_0>='\u2D00' && LA18_0<='\u2E21')||(LA18_0>='\u2E24' && LA18_0<='\u2E2D')||(LA18_0>='\u2E2F' && LA18_0<='\uA721')||(LA18_0>='\uA726' && LA18_0<='\uD80B')||(LA18_0>='\uD80D' && LA18_0<='\uDB7F')||(LA18_0>='\uDB81' && LA18_0<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_106 = input.LA(1);

                        s = -1;
                        if ( ((LA18_106>='\u0000' && LA18_106<='\uFFFF')) ) {s = 198;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}