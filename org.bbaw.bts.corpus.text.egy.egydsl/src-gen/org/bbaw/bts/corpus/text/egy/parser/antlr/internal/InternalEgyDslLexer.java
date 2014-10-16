package org.bbaw.bts.corpus.text.egy.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=15;
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
    public static final int RULE_EGYSTRING=7;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int RULE_BETWEEN_HASHES=6;

    // delegates
    // delegators

    public InternalEgyDslLexer() {;} 
    public InternalEgyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEgyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:11:7: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:11:9: ' '
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:12:7: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:12:9: '\\u00A7'
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:13:7: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:13:9: '%'
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:14:7: ( '; ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:14:9: '; '
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:15:7: ( '\\uF0081' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:15:9: '\\uF0081'
            {
            match("\uF0081"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:16:7: ( '\\uF0080' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:16:9: '\\uF0080'
            {
            match("\uF0080"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:17:7: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:17:9: '\\uDB80\\uDC82'
            {
            match("\uDB80\uDC82"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:18:7: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:18:9: '-'
            {
            match('-'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:19:7: ( '=' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:19:9: '='
            {
            match('='); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:20:7: ( '(' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:20:9: '('
            {
            match('('); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:21:7: ( ')' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:21:9: ')'
            {
            match(')'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:22:7: ( '<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:22:9: '<'
            {
            match('<'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:23:7: ( '>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:23:9: '>'
            {
            match('>'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:24:7: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:24:9: '\\u2E2E'
            {
            match('\u2E2E'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:25:7: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:25:9: '?'
            {
            match('?'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:26:7: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:26:9: '['
            {
            match('['); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:27:7: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:27:9: ']'
            {
            match(']'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:28:7: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:28:9: '{'
            {
            match('{'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:29:7: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:29:9: '}'
            {
            match('}'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:30:7: ( '<<' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:30:9: '<<'
            {
            match("<<"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:31:7: ( '>>' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:31:9: '>>'
            {
            match(">>"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:32:7: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:32:9: '{{'
            {
            match("{{"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:33:7: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:33:9: '}}'
            {
            match("}}"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:34:7: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:34:9: '(('
            {
            match("(("); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:35:7: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:35:9: '))'
            {
            match("))"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:36:7: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:36:9: '[['
            {
            match("[["); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:37:7: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:37:9: ']]'
            {
            match("]]"); 


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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:38:7: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:38:9: '\\u2E22'
            {
            match('\u2E22'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:39:7: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:39:9: '\\u2E23'
            {
            match('\u2E23'); 

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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:40:7: ( '\\u2013' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:40:9: '\\u2013'
            {
            match('\u2013'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2049:9: ( ( ' ' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2049:11: ( ' ' | '\\t' )
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:14: ( ( '\\r' | '\\n' | '\\r\\n' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
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
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:27: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2051:34: '\\t'
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2053:17: ( 'case ' (~ ( ':' ) )+ ': ' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2053:19: 'case ' (~ ( ':' ) )+ ': '
            {
            match("case "); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2053:27: (~ ( ':' ) )+
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
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2053:27: ~ ( ':' )
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2055:21: ( '#' (~ ( '#' ) )* '#' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2055:23: '#' (~ ( '#' ) )* '#'
            {
            match('#'); 
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2055:27: (~ ( '#' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\"')||(LA3_0>='$' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2055:27: ~ ( '#' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
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

            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BETWEEN_HASHES"

    // $ANTLR start "RULE_EGYSTRING"
    public final void mRULE_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:16: ( ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'H\\u032D' | 'z' | 's' | '\\u0161' | '\\u015B' | 'S' | '\\u0160' | '\\u015A' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | '\\u1E6D' | '\\u1E71' | 'T' | '\\u1E6E' | '\\u1E6C' | '\\u1E70' | 'd' | '\\u1E0F' | '\\u1E0E' | 'h\\u032D' | 'i\\u032F' | '\\u0131\\u0357' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'i\\u032D' | 'I\\u0357' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u1E33' | '\\u1E32' | 'u' | 'u\\u032F' | 'U' | 'U\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u010C' | '\\u010C\\u0323' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00D5' | '\\u00E3' | '\\u00DE' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:18: ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'H\\u032D' | 'z' | 's' | '\\u0161' | '\\u015B' | 'S' | '\\u0160' | '\\u015A' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | '\\u1E6D' | '\\u1E71' | 'T' | '\\u1E6E' | '\\u1E6C' | '\\u1E70' | 'd' | '\\u1E0F' | '\\u1E0E' | 'h\\u032D' | 'i\\u032F' | '\\u0131\\u0357' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'i\\u032D' | 'I\\u0357' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u1E33' | '\\u1E32' | 'u' | 'u\\u032F' | 'U' | 'U\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u010C' | '\\u010C\\u0323' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00D5' | '\\u00E3' | '\\u00DE' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:18: ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'H\\u032D' | 'z' | 's' | '\\u0161' | '\\u015B' | 'S' | '\\u0160' | '\\u015A' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | '\\u1E6D' | '\\u1E71' | 'T' | '\\u1E6E' | '\\u1E6C' | '\\u1E70' | 'd' | '\\u1E0F' | '\\u1E0E' | 'h\\u032D' | 'i\\u032F' | '\\u0131\\u0357' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'i\\u032D' | 'I\\u0357' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u1E33' | '\\u1E32' | 'u' | 'u\\u032F' | 'U' | 'U\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u010C' | '\\u010C\\u0323' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00D5' | '\\u00E3' | '\\u00DE' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=109;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:19: '\\uA722'
            	    {
            	    match('\uA722'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:28: '\\uA723' '\\u02BE'
            	    {
            	    match('\uA723'); 
            	    match('\u02BE'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:46: '\\uA725'
            	    {
            	    match('\uA725'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:55: '\\uA724'
            	    {
            	    match('\uA724'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:64: 'j'
            	    {
            	    match('j'); 

            	    }
            	    break;
            	case 6 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:68: 'y'
            	    {
            	    match('y'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:72: 'w'
            	    {
            	    match('w'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:76: 'b'
            	    {
            	    match('b'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:80: 'f'
            	    {
            	    match('f'); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:84: 'm'
            	    {
            	    match('m'); 

            	    }
            	    break;
            	case 11 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:88: 'n'
            	    {
            	    match('n'); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:92: 'r'
            	    {
            	    match('r'); 

            	    }
            	    break;
            	case 13 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:96: 'h'
            	    {
            	    match('h'); 

            	    }
            	    break;
            	case 14 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:100: '\\u1E25'
            	    {
            	    match('\u1E25'); 

            	    }
            	    break;
            	case 15 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:109: '\\u1E2B'
            	    {
            	    match('\u1E2B'); 

            	    }
            	    break;
            	case 16 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:118: '\\u1E96'
            	    {
            	    match('\u1E96'); 

            	    }
            	    break;
            	case 17 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:127: 'H'
            	    {
            	    match('H'); 

            	    }
            	    break;
            	case 18 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:131: '\\u1E24'
            	    {
            	    match('\u1E24'); 

            	    }
            	    break;
            	case 19 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:140: '\\u1E2A'
            	    {
            	    match('\u1E2A'); 

            	    }
            	    break;
            	case 20 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:149: 'H\\u0331'
            	    {
            	    match("H\u0331"); 


            	    }
            	    break;
            	case 21 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:159: 'H\\u032D'
            	    {
            	    match("H\u032D"); 


            	    }
            	    break;
            	case 22 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:169: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;
            	case 23 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:173: 's'
            	    {
            	    match('s'); 

            	    }
            	    break;
            	case 24 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:177: '\\u0161'
            	    {
            	    match('\u0161'); 

            	    }
            	    break;
            	case 25 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:186: '\\u015B'
            	    {
            	    match('\u015B'); 

            	    }
            	    break;
            	case 26 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:195: 'S'
            	    {
            	    match('S'); 

            	    }
            	    break;
            	case 27 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:199: '\\u0160'
            	    {
            	    match('\u0160'); 

            	    }
            	    break;
            	case 28 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:208: '\\u015A'
            	    {
            	    match('\u015A'); 

            	    }
            	    break;
            	case 29 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:217: 'q'
            	    {
            	    match('q'); 

            	    }
            	    break;
            	case 30 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:221: 'k'
            	    {
            	    match('k'); 

            	    }
            	    break;
            	case 31 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:225: 'g'
            	    {
            	    match('g'); 

            	    }
            	    break;
            	case 32 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:229: 't'
            	    {
            	    match('t'); 

            	    }
            	    break;
            	case 33 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:233: '\\u1E6F'
            	    {
            	    match('\u1E6F'); 

            	    }
            	    break;
            	case 34 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:242: '\\u1E6D'
            	    {
            	    match('\u1E6D'); 

            	    }
            	    break;
            	case 35 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:251: '\\u1E71'
            	    {
            	    match('\u1E71'); 

            	    }
            	    break;
            	case 36 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:260: 'T'
            	    {
            	    match('T'); 

            	    }
            	    break;
            	case 37 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:264: '\\u1E6E'
            	    {
            	    match('\u1E6E'); 

            	    }
            	    break;
            	case 38 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:273: '\\u1E6C'
            	    {
            	    match('\u1E6C'); 

            	    }
            	    break;
            	case 39 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:282: '\\u1E70'
            	    {
            	    match('\u1E70'); 

            	    }
            	    break;
            	case 40 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:291: 'd'
            	    {
            	    match('d'); 

            	    }
            	    break;
            	case 41 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:295: '\\u1E0F'
            	    {
            	    match('\u1E0F'); 

            	    }
            	    break;
            	case 42 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:304: '\\u1E0E'
            	    {
            	    match('\u1E0E'); 

            	    }
            	    break;
            	case 43 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:313: 'h\\u032D'
            	    {
            	    match("h\u032D"); 


            	    }
            	    break;
            	case 44 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:323: 'i\\u032F'
            	    {
            	    match("i\u032F"); 


            	    }
            	    break;
            	case 45 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:333: '\\u0131\\u0357'
            	    {
            	    match("\u0131\u0357"); 


            	    }
            	    break;
            	case 46 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:348: '\\u0131\\u0357\\u032F'
            	    {
            	    match("\u0131\u0357\u032F"); 


            	    }
            	    break;
            	case 47 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:369: '\\u00EF'
            	    {
            	    match('\u00EF'); 

            	    }
            	    break;
            	case 48 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:378: 'i\\u032D'
            	    {
            	    match("i\u032D"); 


            	    }
            	    break;
            	case 49 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:388: 'I\\u0357'
            	    {
            	    match("I\u0357"); 


            	    }
            	    break;
            	case 50 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:398: 'I'
            	    {
            	    match('I'); 

            	    }
            	    break;
            	case 51 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:402: 'I\\u032F'
            	    {
            	    match("I\u032F"); 


            	    }
            	    break;
            	case 52 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:412: '\\u00CF'
            	    {
            	    match('\u00CF'); 

            	    }
            	    break;
            	case 53 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:421: '\\u1E33'
            	    {
            	    match('\u1E33'); 

            	    }
            	    break;
            	case 54 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:430: '\\u1E32'
            	    {
            	    match('\u1E32'); 

            	    }
            	    break;
            	case 55 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:439: 'u'
            	    {
            	    match('u'); 

            	    }
            	    break;
            	case 56 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:443: 'u\\u032F'
            	    {
            	    match("u\u032F"); 


            	    }
            	    break;
            	case 57 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:453: 'U'
            	    {
            	    match('U'); 

            	    }
            	    break;
            	case 58 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:457: 'U\\u032F'
            	    {
            	    match("U\u032F"); 


            	    }
            	    break;
            	case 59 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:467: '\\u010D'
            	    {
            	    match('\u010D'); 

            	    }
            	    break;
            	case 60 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:476: '\\u010D\\u0323'
            	    {
            	    match("\u010D\u0323"); 


            	    }
            	    break;
            	case 61 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:491: '\\u010C'
            	    {
            	    match('\u010C'); 

            	    }
            	    break;
            	case 62 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:500: '\\u010C\\u0323'
            	    {
            	    match("\u010C\u0323"); 


            	    }
            	    break;
            	case 63 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:515: 'a'
            	    {
            	    match('a'); 

            	    }
            	    break;
            	case 64 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:519: 'J'
            	    {
            	    match('J'); 

            	    }
            	    break;
            	case 65 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:523: 'Y'
            	    {
            	    match('Y'); 

            	    }
            	    break;
            	case 66 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:527: 'W'
            	    {
            	    match('W'); 

            	    }
            	    break;
            	case 67 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:531: 'B'
            	    {
            	    match('B'); 

            	    }
            	    break;
            	case 68 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:535: 'P'
            	    {
            	    match('P'); 

            	    }
            	    break;
            	case 69 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:539: 'F'
            	    {
            	    match('F'); 

            	    }
            	    break;
            	case 70 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:543: 'M'
            	    {
            	    match('M'); 

            	    }
            	    break;
            	case 71 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:547: 'N'
            	    {
            	    match('N'); 

            	    }
            	    break;
            	case 72 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:551: 'R'
            	    {
            	    match('R'); 

            	    }
            	    break;
            	case 73 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:555: 'L'
            	    {
            	    match('L'); 

            	    }
            	    break;
            	case 74 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:559: 'Z'
            	    {
            	    match('Z'); 

            	    }
            	    break;
            	case 75 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:563: 'Q'
            	    {
            	    match('Q'); 

            	    }
            	    break;
            	case 76 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:567: 'K'
            	    {
            	    match('K'); 

            	    }
            	    break;
            	case 77 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:571: 'G'
            	    {
            	    match('G'); 

            	    }
            	    break;
            	case 78 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:575: 'D'
            	    {
            	    match('D'); 

            	    }
            	    break;
            	case 79 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:579: 'A'
            	    {
            	    match('A'); 

            	    }
            	    break;
            	case 80 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:583: '\\u2C80' .. '\\u2CFF'
            	    {
            	    matchRange('\u2C80','\u2CFF'); 

            	    }
            	    break;
            	case 81 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:602: '\\uD80C\\uDE86'
            	    {
            	    match("\uD80C\uDE86"); 


            	    }
            	    break;
            	case 82 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:617: '\\uD80C\\uDE87'
            	    {
            	    match("\uD80C\uDE87"); 


            	    }
            	    break;
            	case 83 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:632: '\\uD80C\\uDF79'
            	    {
            	    match("\uD80C\uDF79"); 


            	    }
            	    break;
            	case 84 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:647: '\\uD80C\\uDF7A'
            	    {
            	    match("\uD80C\uDF7A"); 


            	    }
            	    break;
            	case 85 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:662: '\\u13379'
            	    {
            	    match("\u13379"); 


            	    }
            	    break;
            	case 86 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:672: '\\u1337A'
            	    {
            	    match("\u1337A"); 


            	    }
            	    break;
            	case 87 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:682: '\\uD80C\\uDE58'
            	    {
            	    match("\uD80C\uDE58"); 


            	    }
            	    break;
            	case 88 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:697: '\\uD80C\\uDE82'
            	    {
            	    match("\uD80C\uDE82"); 


            	    }
            	    break;
            	case 89 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:712: 'p'
            	    {
            	    match('p'); 

            	    }
            	    break;
            	case 90 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:716: 'l'
            	    {
            	    match('l'); 

            	    }
            	    break;
            	case 91 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:720: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 92 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:724: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 93 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:728: '\\u2261'
            	    {
            	    match('\u2261'); 

            	    }
            	    break;
            	case 94 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:737: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 95 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:741: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 96 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:745: '~'
            	    {
            	    match('~'); 

            	    }
            	    break;
            	case 97 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:749: '\\u22EE'
            	    {
            	    match('\u22EE'); 

            	    }
            	    break;
            	case 98 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:758: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 99 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:762: '\\u205D'
            	    {
            	    match('\u205D'); 

            	    }
            	    break;
            	case 100 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:771: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 101 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:780: '\\u00D5'
            	    {
            	    match('\u00D5'); 

            	    }
            	    break;
            	case 102 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:789: '\\u00E3'
            	    {
            	    match('\u00E3'); 

            	    }
            	    break;
            	case 103 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:798: '\\u00DE'
            	    {
            	    match('\u00DE'); 

            	    }
            	    break;
            	case 104 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:807: '!'
            	    {
            	    match('!'); 

            	    }
            	    break;
            	case 105 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:811: '\\u0152'
            	    {
            	    match('\u0152'); 

            	    }
            	    break;
            	case 106 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:820: '\\u0153'
            	    {
            	    match('\u0153'); 

            	    }
            	    break;
            	case 107 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:829: '\\u0178'
            	    {
            	    match('\u0178'); 

            	    }
            	    break;
            	case 108 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2057:838: '\\u00C6'
            	    {
            	    match('\u00C6'); 

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
    // $ANTLR end "RULE_EGYSTRING"

    // $ANTLR start "RULE_COMMNENT_EGYSTRING"
    public final void mRULE_COMMNENT_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_COMMNENT_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2059:25: ( (~ ( '\\u2013' ) )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2059:27: (~ ( '\\u2013' ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2059:27: (~ ( '\\u2013' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\u2012')||(LA5_0>='\u2014' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2059:27: ~ ( '\\u2013' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u2012')||(input.LA(1)>='\u2014' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_COMMNENT_EGYSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2061:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2061:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2061:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2061:11: '^'
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

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2061:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:
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
            	    break loop7;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2063:10: ( ( '0' .. '9' )+ )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2063:12: ( '0' .. '9' )+
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2063:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2063:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2065:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2067:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2067:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2067:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2067:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:41: ( '\\r' )? '\\n'
                    {
                    // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2069:41: '\\r'
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
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2071:16: ( . )
            // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:2071:18: .
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
        // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_WS | RULE_NEWLINE | RULE_CASESTRING | RULE_BETWEEN_HASHES | RULE_EGYSTRING | RULE_COMMNENT_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt16=42;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:198: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 33 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:211: RULE_CASESTRING
                {
                mRULE_CASESTRING(); 

                }
                break;
            case 34 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:227: RULE_BETWEEN_HASHES
                {
                mRULE_BETWEEN_HASHES(); 

                }
                break;
            case 35 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:247: RULE_EGYSTRING
                {
                mRULE_EGYSTRING(); 

                }
                break;
            case 36 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:262: RULE_COMMNENT_EGYSTRING
                {
                mRULE_COMMNENT_EGYSTRING(); 

                }
                break;
            case 37 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:294: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:303: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:315: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:331: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.bbaw.bts.corpus.text.egy.egydsl/src-gen/org/bbaw/bts/corpus/text/egy/parser/antlr/internal/InternalEgyDsl.g:1:347: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA4_eotS =
        "\1\1\15\uffff\1\136\3\uffff\1\141\32\uffff\1\147\3\uffff\1\151"+
        "\1\153\1\155\1\157\57\uffff\1\171\25\uffff";
    static final String DFA4_eofS =
        "\172\uffff";
    static final String DFA4_minS =
        "\1\41\15\uffff\1\u032d\3\uffff\1\u032d\27\uffff\1\u032d\1\u0357"+
        "\1\uffff\1\u032f\3\uffff\2\u032f\2\u0323\22\uffff\1\ude58\1\71\33"+
        "\uffff\1\u032f\25\uffff";
    static final String DFA4_maxS =
        "\1\ud80c\15\uffff\1\u032d\3\uffff\1\u0331\27\uffff\1\u032f\1\u0357"+
        "\1\uffff\1\u0357\3\uffff\2\u032f\2\u0323\22\uffff\1\udf7a\1\101"+
        "\33\uffff\1\u032f\25\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\155\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\uffff\1\16\1\17\1\20\1\uffff\1\22\1\23\1\26\1\27\1\30\1"+
        "\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\2\uffff\1\57\1\uffff\1\64\1\65\1\66\4"+
        "\uffff\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\2\uffff\1\131\1"+
        "\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144"+
        "\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\53\1\15\1\24"+
        "\1\25\1\21\1\54\1\60\1\uffff\1\61\1\63\1\62\1\70\1\67\1\72\1\71"+
        "\1\74\1\73\1\76\1\75\1\121\1\122\1\123\1\124\1\127\1\130\1\125\1"+
        "\126\1\56\1\55";
    static final String DFA4_specialS =
        "\172\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\130\12\uffff\1\116\1\uffff\1\117\1\uffff\12\124\1\113\2"+
            "\uffff\1\114\3\uffff\1\105\1\71\1\uffff\1\104\1\uffff\1\73\1"+
            "\103\1\22\1\55\1\66\1\102\1\77\1\74\1\75\1\uffff\1\72\1\101"+
            "\1\76\1\31\1\43\1\62\1\uffff\1\70\1\uffff\1\67\1\100\4\uffff"+
            "\1\122\1\uffff\1\65\1\11\1\uffff\1\47\1\uffff\1\12\1\36\1\16"+
            "\1\52\1\6\1\35\1\112\1\13\1\14\1\uffff\1\111\1\34\1\15\1\26"+
            "\1\37\1\61\1\uffff\1\10\1\uffff\1\7\1\25\3\uffff\1\120\107\uffff"+
            "\1\134\10\uffff\1\56\5\uffff\1\125\10\uffff\1\127\4\uffff\1"+
            "\126\13\uffff\1\54\34\uffff\1\64\1\63\43\uffff\1\53\40\uffff"+
            "\1\131\1\132\6\uffff\1\33\1\30\4\uffff\1\32\1\27\26\uffff\1"+
            "\133\u11be\uffff\1\110\u0ad6\uffff\1\51\1\50\24\uffff\1\23\1"+
            "\17\4\uffff\1\24\1\20\6\uffff\1\60\1\57\70\uffff\1\45\1\41\1"+
            "\44\1\40\1\46\1\42\44\uffff\1\21\u01c6\uffff\1\123\u0203\uffff"+
            "\1\115\u008c\uffff\1\121\u0991\uffff\u0080\106\u7a22\uffff\1"+
            "\2\1\3\1\5\1\4\u30e6\uffff\1\107",
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
            "\1\135",
            "",
            "",
            "",
            "\1\140\3\uffff\1\137",
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
            "\1\143\1\uffff\1\142",
            "\1\144",
            "",
            "\1\146\47\uffff\1\145",
            "",
            "",
            "",
            "\1\150",
            "\1\152",
            "\1\154",
            "\1\156",
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
            "\1\164\51\uffff\1\165\3\uffff\1\160\1\161\u00f1\uffff\1\162"+
            "\1\163",
            "\1\166\7\uffff\1\167",
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
            "\1\170",
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
            return "()+ loopback of 2057:18: ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u1E25' | '\\u1E2B' | '\\u1E96' | 'H' | '\\u1E24' | '\\u1E2A' | 'H\\u0331' | 'H\\u032D' | 'z' | 's' | '\\u0161' | '\\u015B' | 'S' | '\\u0160' | '\\u015A' | 'q' | 'k' | 'g' | 't' | '\\u1E6F' | '\\u1E6D' | '\\u1E71' | 'T' | '\\u1E6E' | '\\u1E6C' | '\\u1E70' | 'd' | '\\u1E0F' | '\\u1E0E' | 'h\\u032D' | 'i\\u032F' | '\\u0131\\u0357' | '\\u0131\\u0357\\u032F' | '\\u00EF' | 'i\\u032D' | 'I\\u0357' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u1E33' | '\\u1E32' | 'u' | 'u\\u032F' | 'U' | 'U\\u032F' | '\\u010D' | '\\u010D\\u0323' | '\\u010C' | '\\u010C\\u0323' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00D5' | '\\u00E3' | '\\u00DE' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+";
        }
    }
    static final String DFA16_eotS =
        "\1\166\173\uffff";
    static final String DFA16_eofS =
        "\174\uffff";
    static final String DFA16_minS =
        "\1\0\173\uffff";
    static final String DFA16_maxS =
        "\1\uffff\173\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
        "\1\16\1\17\1\20\1\21\1\22\1\23\1\34\1\35\1\36\1\37\2\40\1\41\1\42"+
        "\132\43\7\44";
    static final String DFA16_specialS =
        "\1\0\173\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\173\1\26\1\30\2\173\1\27\22\173\1\1\1\160\1\170\1\32\1"+
            "\173\1\3\1\173\1\171\1\11\1\12\2\173\1\146\1\7\1\147\1\172\12"+
            "\154\1\144\1\4\1\13\1\10\1\14\1\16\1\173\1\136\1\122\1\167\1"+
            "\135\1\167\1\124\1\134\1\53\1\106\1\117\1\133\1\130\1\125\1"+
            "\126\1\167\1\123\1\132\1\127\1\62\1\74\1\113\1\167\1\121\1\167"+
            "\1\120\1\131\1\17\1\173\1\20\1\165\1\152\1\173\1\116\1\42\1"+
            "\31\1\100\1\167\1\43\1\67\1\47\1\103\1\37\1\66\1\143\1\44\1"+
            "\45\1\167\1\142\1\65\1\46\1\57\1\70\1\112\1\167\1\41\1\167\1"+
            "\40\1\56\1\21\1\173\1\22\1\150\50\173\1\2\36\173\1\164\10\173"+
            "\1\107\5\173\1\155\10\173\1\157\4\173\1\156\13\173\1\105\34"+
            "\173\1\115\1\114\43\173\1\104\40\173\1\161\1\162\6\173\1\64"+
            "\1\61\4\173\1\63\1\60\26\173\1\163\u11be\173\1\141\u0ad6\173"+
            "\1\102\1\101\24\173\1\54\1\50\4\173\1\55\1\51\6\173\1\111\1"+
            "\110\70\173\1\76\1\72\1\75\1\71\1\77\1\73\44\173\1\52\u017c"+
            "\173\1\25\111\173\1\153\u0203\173\1\145\u008c\173\1\151\u0991"+
            "\173\u0080\137\u0122\173\1\23\1\24\12\173\1\15\u78f3\173\1\33"+
            "\1\34\1\36\1\35\u30e6\173\1\140\u0373\173\1\6\u1487\173\1\5"+
            "\u0ff7\173",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_WS | RULE_NEWLINE | RULE_CASESTRING | RULE_BETWEEN_HASHES | RULE_EGYSTRING | RULE_COMMNENT_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0==' ') ) {s = 1;}

                        else if ( (LA16_0=='\u00A7') ) {s = 2;}

                        else if ( (LA16_0=='%') ) {s = 3;}

                        else if ( (LA16_0==';') ) {s = 4;}

                        else if ( (LA16_0=='\uF008') ) {s = 5;}

                        else if ( (LA16_0=='\uDB80') ) {s = 6;}

                        else if ( (LA16_0=='-') ) {s = 7;}

                        else if ( (LA16_0=='=') ) {s = 8;}

                        else if ( (LA16_0=='(') ) {s = 9;}

                        else if ( (LA16_0==')') ) {s = 10;}

                        else if ( (LA16_0=='<') ) {s = 11;}

                        else if ( (LA16_0=='>') ) {s = 12;}

                        else if ( (LA16_0=='\u2E2E') ) {s = 13;}

                        else if ( (LA16_0=='?') ) {s = 14;}

                        else if ( (LA16_0=='[') ) {s = 15;}

                        else if ( (LA16_0==']') ) {s = 16;}

                        else if ( (LA16_0=='{') ) {s = 17;}

                        else if ( (LA16_0=='}') ) {s = 18;}

                        else if ( (LA16_0=='\u2E22') ) {s = 19;}

                        else if ( (LA16_0=='\u2E23') ) {s = 20;}

                        else if ( (LA16_0=='\u2013') ) {s = 21;}

                        else if ( (LA16_0=='\t') ) {s = 22;}

                        else if ( (LA16_0=='\r') ) {s = 23;}

                        else if ( (LA16_0=='\n') ) {s = 24;}

                        else if ( (LA16_0=='c') ) {s = 25;}

                        else if ( (LA16_0=='#') ) {s = 26;}

                        else if ( (LA16_0=='\uA722') ) {s = 27;}

                        else if ( (LA16_0=='\uA723') ) {s = 28;}

                        else if ( (LA16_0=='\uA725') ) {s = 29;}

                        else if ( (LA16_0=='\uA724') ) {s = 30;}

                        else if ( (LA16_0=='j') ) {s = 31;}

                        else if ( (LA16_0=='y') ) {s = 32;}

                        else if ( (LA16_0=='w') ) {s = 33;}

                        else if ( (LA16_0=='b') ) {s = 34;}

                        else if ( (LA16_0=='f') ) {s = 35;}

                        else if ( (LA16_0=='m') ) {s = 36;}

                        else if ( (LA16_0=='n') ) {s = 37;}

                        else if ( (LA16_0=='r') ) {s = 38;}

                        else if ( (LA16_0=='h') ) {s = 39;}

                        else if ( (LA16_0=='\u1E25') ) {s = 40;}

                        else if ( (LA16_0=='\u1E2B') ) {s = 41;}

                        else if ( (LA16_0=='\u1E96') ) {s = 42;}

                        else if ( (LA16_0=='H') ) {s = 43;}

                        else if ( (LA16_0=='\u1E24') ) {s = 44;}

                        else if ( (LA16_0=='\u1E2A') ) {s = 45;}

                        else if ( (LA16_0=='z') ) {s = 46;}

                        else if ( (LA16_0=='s') ) {s = 47;}

                        else if ( (LA16_0=='\u0161') ) {s = 48;}

                        else if ( (LA16_0=='\u015B') ) {s = 49;}

                        else if ( (LA16_0=='S') ) {s = 50;}

                        else if ( (LA16_0=='\u0160') ) {s = 51;}

                        else if ( (LA16_0=='\u015A') ) {s = 52;}

                        else if ( (LA16_0=='q') ) {s = 53;}

                        else if ( (LA16_0=='k') ) {s = 54;}

                        else if ( (LA16_0=='g') ) {s = 55;}

                        else if ( (LA16_0=='t') ) {s = 56;}

                        else if ( (LA16_0=='\u1E6F') ) {s = 57;}

                        else if ( (LA16_0=='\u1E6D') ) {s = 58;}

                        else if ( (LA16_0=='\u1E71') ) {s = 59;}

                        else if ( (LA16_0=='T') ) {s = 60;}

                        else if ( (LA16_0=='\u1E6E') ) {s = 61;}

                        else if ( (LA16_0=='\u1E6C') ) {s = 62;}

                        else if ( (LA16_0=='\u1E70') ) {s = 63;}

                        else if ( (LA16_0=='d') ) {s = 64;}

                        else if ( (LA16_0=='\u1E0F') ) {s = 65;}

                        else if ( (LA16_0=='\u1E0E') ) {s = 66;}

                        else if ( (LA16_0=='i') ) {s = 67;}

                        else if ( (LA16_0=='\u0131') ) {s = 68;}

                        else if ( (LA16_0=='\u00EF') ) {s = 69;}

                        else if ( (LA16_0=='I') ) {s = 70;}

                        else if ( (LA16_0=='\u00CF') ) {s = 71;}

                        else if ( (LA16_0=='\u1E33') ) {s = 72;}

                        else if ( (LA16_0=='\u1E32') ) {s = 73;}

                        else if ( (LA16_0=='u') ) {s = 74;}

                        else if ( (LA16_0=='U') ) {s = 75;}

                        else if ( (LA16_0=='\u010D') ) {s = 76;}

                        else if ( (LA16_0=='\u010C') ) {s = 77;}

                        else if ( (LA16_0=='a') ) {s = 78;}

                        else if ( (LA16_0=='J') ) {s = 79;}

                        else if ( (LA16_0=='Y') ) {s = 80;}

                        else if ( (LA16_0=='W') ) {s = 81;}

                        else if ( (LA16_0=='B') ) {s = 82;}

                        else if ( (LA16_0=='P') ) {s = 83;}

                        else if ( (LA16_0=='F') ) {s = 84;}

                        else if ( (LA16_0=='M') ) {s = 85;}

                        else if ( (LA16_0=='N') ) {s = 86;}

                        else if ( (LA16_0=='R') ) {s = 87;}

                        else if ( (LA16_0=='L') ) {s = 88;}

                        else if ( (LA16_0=='Z') ) {s = 89;}

                        else if ( (LA16_0=='Q') ) {s = 90;}

                        else if ( (LA16_0=='K') ) {s = 91;}

                        else if ( (LA16_0=='G') ) {s = 92;}

                        else if ( (LA16_0=='D') ) {s = 93;}

                        else if ( (LA16_0=='A') ) {s = 94;}

                        else if ( ((LA16_0>='\u2C80' && LA16_0<='\u2CFF')) ) {s = 95;}

                        else if ( (LA16_0=='\uD80C') ) {s = 96;}

                        else if ( (LA16_0=='\u1337') ) {s = 97;}

                        else if ( (LA16_0=='p') ) {s = 98;}

                        else if ( (LA16_0=='l') ) {s = 99;}

                        else if ( (LA16_0==':') ) {s = 100;}

                        else if ( (LA16_0=='\u2261') ) {s = 101;}

                        else if ( (LA16_0==',') ) {s = 102;}

                        else if ( (LA16_0=='.') ) {s = 103;}

                        else if ( (LA16_0=='~') ) {s = 104;}

                        else if ( (LA16_0=='\u22EE') ) {s = 105;}

                        else if ( (LA16_0=='_') ) {s = 106;}

                        else if ( (LA16_0=='\u205D') ) {s = 107;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 108;}

                        else if ( (LA16_0=='\u00D5') ) {s = 109;}

                        else if ( (LA16_0=='\u00E3') ) {s = 110;}

                        else if ( (LA16_0=='\u00DE') ) {s = 111;}

                        else if ( (LA16_0=='!') ) {s = 112;}

                        else if ( (LA16_0=='\u0152') ) {s = 113;}

                        else if ( (LA16_0=='\u0153') ) {s = 114;}

                        else if ( (LA16_0=='\u0178') ) {s = 115;}

                        else if ( (LA16_0=='\u00C6') ) {s = 116;}

                        else if ( (LA16_0=='^') ) {s = 117;}

                        else if ( (LA16_0=='C'||LA16_0=='E'||LA16_0=='O'||LA16_0=='V'||LA16_0=='X'||LA16_0=='e'||LA16_0=='o'||LA16_0=='v'||LA16_0=='x') ) {s = 119;}

                        else if ( (LA16_0=='\"') ) {s = 120;}

                        else if ( (LA16_0=='\'') ) {s = 121;}

                        else if ( (LA16_0=='/') ) {s = 122;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='$'||LA16_0=='&'||(LA16_0>='*' && LA16_0<='+')||LA16_0=='@'||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='\u007F' && LA16_0<='\u00A6')||(LA16_0>='\u00A8' && LA16_0<='\u00C5')||(LA16_0>='\u00C7' && LA16_0<='\u00CE')||(LA16_0>='\u00D0' && LA16_0<='\u00D4')||(LA16_0>='\u00D6' && LA16_0<='\u00DD')||(LA16_0>='\u00DF' && LA16_0<='\u00E2')||(LA16_0>='\u00E4' && LA16_0<='\u00EE')||(LA16_0>='\u00F0' && LA16_0<='\u010B')||(LA16_0>='\u010E' && LA16_0<='\u0130')||(LA16_0>='\u0132' && LA16_0<='\u0151')||(LA16_0>='\u0154' && LA16_0<='\u0159')||(LA16_0>='\u015C' && LA16_0<='\u015F')||(LA16_0>='\u0162' && LA16_0<='\u0177')||(LA16_0>='\u0179' && LA16_0<='\u1336')||(LA16_0>='\u1338' && LA16_0<='\u1E0D')||(LA16_0>='\u1E10' && LA16_0<='\u1E23')||(LA16_0>='\u1E26' && LA16_0<='\u1E29')||(LA16_0>='\u1E2C' && LA16_0<='\u1E31')||(LA16_0>='\u1E34' && LA16_0<='\u1E6B')||(LA16_0>='\u1E72' && LA16_0<='\u1E95')||(LA16_0>='\u1E97' && LA16_0<='\u2012')||(LA16_0>='\u2014' && LA16_0<='\u205C')||(LA16_0>='\u205E' && LA16_0<='\u2260')||(LA16_0>='\u2262' && LA16_0<='\u22ED')||(LA16_0>='\u22EF' && LA16_0<='\u2C7F')||(LA16_0>='\u2D00' && LA16_0<='\u2E21')||(LA16_0>='\u2E24' && LA16_0<='\u2E2D')||(LA16_0>='\u2E2F' && LA16_0<='\uA721')||(LA16_0>='\uA726' && LA16_0<='\uD80B')||(LA16_0>='\uD80D' && LA16_0<='\uDB7F')||(LA16_0>='\uDB81' && LA16_0<='\uF007')||(LA16_0>='\uF009' && LA16_0<='\uFFFF')) ) {s = 123;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}