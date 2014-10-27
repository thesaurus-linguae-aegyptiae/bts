package org.bbaw.bts.corpus.text.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBTSLexer extends Lexer {
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

    public InternalBTSLexer() {;} 
    public InternalBTSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBTSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:11:7: ( ' ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:11:9: ' '
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:12:7: ( '\\u00C2\\u00A7' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:12:9: '\\u00C2\\u00A7'
            {
            match("\u00C2\u00A7"); 


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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:13:7: ( '%' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:13:9: '%'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:14:7: ( '; ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:14:9: '; '
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:15:7: ( '\\uF0081' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:15:9: '\\uF0081'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:16:7: ( '\\uF0080' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:16:9: '\\uF0080'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:17:7: ( '\\uDB80\\uDC82' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:17:9: '\\uDB80\\uDC82'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:18:7: ( '-' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:18:9: '-'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:19:7: ( '=' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:19:9: '='
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:20:7: ( '(' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:20:9: '('
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:21:7: ( ')' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:21:9: ')'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:22:7: ( '<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:22:9: '<'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:23:7: ( '>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:23:9: '>'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:24:7: ( '\\u2E2E' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:24:9: '\\u2E2E'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:25:7: ( '?' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:25:9: '?'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:26:7: ( '[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:26:9: '['
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:27:7: ( ']' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:27:9: ']'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:28:7: ( '{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:28:9: '{'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:29:7: ( '}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:29:9: '}'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:30:7: ( '<<' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:30:9: '<<'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:31:7: ( '>>' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:31:9: '>>'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:32:7: ( '{{' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:32:9: '{{'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:33:7: ( '}}' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:33:9: '}}'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:34:7: ( '((' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:34:9: '(('
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:35:7: ( '))' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:35:9: '))'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:36:7: ( '[[' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:36:9: '[['
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:37:7: ( ']]' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:37:9: ']]'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:38:7: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:38:9: '\\u2E22'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:39:7: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:39:9: '\\u2E23'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:40:7: ( '\\u2013' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:40:9: '\\u2013'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4947:9: ( ( ' ' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4947:11: ( ' ' | '\\t' )
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:14: ( ( '\\r' | '\\n' | '\\r\\n' | '\\t' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:16: ( '\\r' | '\\n' | '\\r\\n' | '\\t' )
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:27: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 4 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4949:34: '\\t'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4951:17: ( 'case ' (~ ( ':' ) )+ ': ' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4951:19: 'case ' (~ ( ':' ) )+ ': '
            {
            match("case "); 

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4951:27: (~ ( ':' ) )+
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
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4951:27: ~ ( ':' )
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4953:21: ( '#' (~ ( '#' ) )* '#' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4953:23: '#' (~ ( '#' ) )* '#'
            {
            match('#'); 
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4953:27: (~ ( '#' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\"')||(LA3_0>='$' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4953:27: ~ ( '#' )
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

    // $ANTLR start "RULE_COMMNENT_EGYSTRING"
    public final void mRULE_COMMNENT_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_COMMNENT_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4955:25: ( (~ ( '\\u2013' ) )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4955:27: (~ ( '\\u2013' ) )*
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4955:27: (~ ( '\\u2013' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\u2012')||(LA4_0>='\u2014' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4955:27: ~ ( '\\u2013' )
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
            	    break loop4;
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

    // $ANTLR start "RULE_EGYSTRING"
    public final void mRULE_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:16: ( ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | '\\u00EA\\u0153\\u00A3' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u00E1\\u00B8\\u00A5' | '\\u00E1\\u00B8\\u00AB' | '\\u00E1\\u00BA\\u2013' | 'H' | '\\u00E1\\u00B8\\u00A4' | '\\u00E1\\u00B8\\u00AA' | 'H\\u00CC\\u00B1' | 'H\\u00CC\\u00AD' | 'z' | 's' | '\\u00C5\\u00A1' | '\\u00C5\\u203A' | 'S' | '\\u00C5\\u00A0' | '\\u00C5\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u00E1\\u00B9\\u00AF' | '\\u00E1\\u00B9\\u00AD' | '\\u00E1\\u00B9\\u00B1' | 'T' | '\\u00E1\\u00B9\\u00AE' | '\\u00E1\\u00B9\\u00AC' | '\\u00E1\\u00B9\\u00B0' | 'd' | '\\u00E1\\u00B8\\uFFFD' | '\\u00E1\\u00B8\\u017D' | 'h\\u00CC\\u00AD' | 'i\\u00CC\\u00AF' | '\\u00C4\\u00B1\\u00CD\\u2014' | '\\u00C4\\u00B1\\u00CD\\u2014\\u00CC\\u00AF' | '\\u00C3\\u00AF' | 'i\\u00CC\\u00AD' | 'I\\u00CD\\u2014' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u00E1\\u00B8\\u00B3' | '\\u00E1\\u00B8\\u00B2' | 'u' | 'u\\u00CC\\u00AF' | 'U' | 'U\\u032F' | '\\u00C4\\uFFFD' | '\\u00C4\\uFFFD\\u00CC\\u00A3' | '\\u00C4\\u0152' | '\\u00C4\\u0152\\u00CC\\u00A3' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00C3\\u2022' | '\\u00C3\\u00A3' | '\\u00C3\\u017E' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+ )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:18: ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | '\\u00EA\\u0153\\u00A3' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u00E1\\u00B8\\u00A5' | '\\u00E1\\u00B8\\u00AB' | '\\u00E1\\u00BA\\u2013' | 'H' | '\\u00E1\\u00B8\\u00A4' | '\\u00E1\\u00B8\\u00AA' | 'H\\u00CC\\u00B1' | 'H\\u00CC\\u00AD' | 'z' | 's' | '\\u00C5\\u00A1' | '\\u00C5\\u203A' | 'S' | '\\u00C5\\u00A0' | '\\u00C5\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u00E1\\u00B9\\u00AF' | '\\u00E1\\u00B9\\u00AD' | '\\u00E1\\u00B9\\u00B1' | 'T' | '\\u00E1\\u00B9\\u00AE' | '\\u00E1\\u00B9\\u00AC' | '\\u00E1\\u00B9\\u00B0' | 'd' | '\\u00E1\\u00B8\\uFFFD' | '\\u00E1\\u00B8\\u017D' | 'h\\u00CC\\u00AD' | 'i\\u00CC\\u00AF' | '\\u00C4\\u00B1\\u00CD\\u2014' | '\\u00C4\\u00B1\\u00CD\\u2014\\u00CC\\u00AF' | '\\u00C3\\u00AF' | 'i\\u00CC\\u00AD' | 'I\\u00CD\\u2014' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u00E1\\u00B8\\u00B3' | '\\u00E1\\u00B8\\u00B2' | 'u' | 'u\\u00CC\\u00AF' | 'U' | 'U\\u032F' | '\\u00C4\\uFFFD' | '\\u00C4\\uFFFD\\u00CC\\u00A3' | '\\u00C4\\u0152' | '\\u00C4\\u0152\\u00CC\\u00A3' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00C3\\u2022' | '\\u00C3\\u00A3' | '\\u00C3\\u017E' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:18: ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | '\\u00EA\\u0153\\u00A3' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u00E1\\u00B8\\u00A5' | '\\u00E1\\u00B8\\u00AB' | '\\u00E1\\u00BA\\u2013' | 'H' | '\\u00E1\\u00B8\\u00A4' | '\\u00E1\\u00B8\\u00AA' | 'H\\u00CC\\u00B1' | 'H\\u00CC\\u00AD' | 'z' | 's' | '\\u00C5\\u00A1' | '\\u00C5\\u203A' | 'S' | '\\u00C5\\u00A0' | '\\u00C5\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u00E1\\u00B9\\u00AF' | '\\u00E1\\u00B9\\u00AD' | '\\u00E1\\u00B9\\u00B1' | 'T' | '\\u00E1\\u00B9\\u00AE' | '\\u00E1\\u00B9\\u00AC' | '\\u00E1\\u00B9\\u00B0' | 'd' | '\\u00E1\\u00B8\\uFFFD' | '\\u00E1\\u00B8\\u017D' | 'h\\u00CC\\u00AD' | 'i\\u00CC\\u00AF' | '\\u00C4\\u00B1\\u00CD\\u2014' | '\\u00C4\\u00B1\\u00CD\\u2014\\u00CC\\u00AF' | '\\u00C3\\u00AF' | 'i\\u00CC\\u00AD' | 'I\\u00CD\\u2014' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u00E1\\u00B8\\u00B3' | '\\u00E1\\u00B8\\u00B2' | 'u' | 'u\\u00CC\\u00AF' | 'U' | 'U\\u032F' | '\\u00C4\\uFFFD' | '\\u00C4\\uFFFD\\u00CC\\u00A3' | '\\u00C4\\u0152' | '\\u00C4\\u0152\\u00CC\\u00A3' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00C3\\u2022' | '\\u00C3\\u00A3' | '\\u00C3\\u017E' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=110;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:19: '\\uA722'
            	    {
            	    match('\uA722'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:28: '\\uA723' '\\u02BE'
            	    {
            	    match('\uA723'); 
            	    match('\u02BE'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:46: '\\uA725'
            	    {
            	    match('\uA725'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:55: '\\uA724'
            	    {
            	    match('\uA724'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:64: '\\u00EA\\u0153\\u00A3'
            	    {
            	    match("\u00EA\u0153\u00A3"); 


            	    }
            	    break;
            	case 6 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:85: 'j'
            	    {
            	    match('j'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:89: 'y'
            	    {
            	    match('y'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:93: 'w'
            	    {
            	    match('w'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:97: 'b'
            	    {
            	    match('b'); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:101: 'f'
            	    {
            	    match('f'); 

            	    }
            	    break;
            	case 11 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:105: 'm'
            	    {
            	    match('m'); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:109: 'n'
            	    {
            	    match('n'); 

            	    }
            	    break;
            	case 13 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:113: 'r'
            	    {
            	    match('r'); 

            	    }
            	    break;
            	case 14 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:117: 'h'
            	    {
            	    match('h'); 

            	    }
            	    break;
            	case 15 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:121: '\\u00E1\\u00B8\\u00A5'
            	    {
            	    match("\u00E1\u00B8\u00A5"); 


            	    }
            	    break;
            	case 16 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:142: '\\u00E1\\u00B8\\u00AB'
            	    {
            	    match("\u00E1\u00B8\u00AB"); 


            	    }
            	    break;
            	case 17 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:163: '\\u00E1\\u00BA\\u2013'
            	    {
            	    match("\u00E1\u00BA\u2013"); 


            	    }
            	    break;
            	case 18 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:184: 'H'
            	    {
            	    match('H'); 

            	    }
            	    break;
            	case 19 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:188: '\\u00E1\\u00B8\\u00A4'
            	    {
            	    match("\u00E1\u00B8\u00A4"); 


            	    }
            	    break;
            	case 20 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:209: '\\u00E1\\u00B8\\u00AA'
            	    {
            	    match("\u00E1\u00B8\u00AA"); 


            	    }
            	    break;
            	case 21 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:230: 'H\\u00CC\\u00B1'
            	    {
            	    match("H\u00CC\u00B1"); 


            	    }
            	    break;
            	case 22 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:246: 'H\\u00CC\\u00AD'
            	    {
            	    match("H\u00CC\u00AD"); 


            	    }
            	    break;
            	case 23 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:262: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;
            	case 24 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:266: 's'
            	    {
            	    match('s'); 

            	    }
            	    break;
            	case 25 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:270: '\\u00C5\\u00A1'
            	    {
            	    match("\u00C5\u00A1"); 


            	    }
            	    break;
            	case 26 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:285: '\\u00C5\\u203A'
            	    {
            	    match("\u00C5\u203A"); 


            	    }
            	    break;
            	case 27 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:300: 'S'
            	    {
            	    match('S'); 

            	    }
            	    break;
            	case 28 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:304: '\\u00C5\\u00A0'
            	    {
            	    match("\u00C5\u00A0"); 


            	    }
            	    break;
            	case 29 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:319: '\\u00C5\\u0161'
            	    {
            	    match("\u00C5\u0161"); 


            	    }
            	    break;
            	case 30 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:334: 'q'
            	    {
            	    match('q'); 

            	    }
            	    break;
            	case 31 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:338: 'k'
            	    {
            	    match('k'); 

            	    }
            	    break;
            	case 32 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:342: 'g'
            	    {
            	    match('g'); 

            	    }
            	    break;
            	case 33 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:346: 't'
            	    {
            	    match('t'); 

            	    }
            	    break;
            	case 34 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:350: '\\u00E1\\u00B9\\u00AF'
            	    {
            	    match("\u00E1\u00B9\u00AF"); 


            	    }
            	    break;
            	case 35 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:371: '\\u00E1\\u00B9\\u00AD'
            	    {
            	    match("\u00E1\u00B9\u00AD"); 


            	    }
            	    break;
            	case 36 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:392: '\\u00E1\\u00B9\\u00B1'
            	    {
            	    match("\u00E1\u00B9\u00B1"); 


            	    }
            	    break;
            	case 37 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:413: 'T'
            	    {
            	    match('T'); 

            	    }
            	    break;
            	case 38 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:417: '\\u00E1\\u00B9\\u00AE'
            	    {
            	    match("\u00E1\u00B9\u00AE"); 


            	    }
            	    break;
            	case 39 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:438: '\\u00E1\\u00B9\\u00AC'
            	    {
            	    match("\u00E1\u00B9\u00AC"); 


            	    }
            	    break;
            	case 40 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:459: '\\u00E1\\u00B9\\u00B0'
            	    {
            	    match("\u00E1\u00B9\u00B0"); 


            	    }
            	    break;
            	case 41 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:480: 'd'
            	    {
            	    match('d'); 

            	    }
            	    break;
            	case 42 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:484: '\\u00E1\\u00B8\\uFFFD'
            	    {
            	    match("\u00E1\u00B8\uFFFD"); 


            	    }
            	    break;
            	case 43 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:505: '\\u00E1\\u00B8\\u017D'
            	    {
            	    match("\u00E1\u00B8\u017D"); 


            	    }
            	    break;
            	case 44 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:526: 'h\\u00CC\\u00AD'
            	    {
            	    match("h\u00CC\u00AD"); 


            	    }
            	    break;
            	case 45 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:542: 'i\\u00CC\\u00AF'
            	    {
            	    match("i\u00CC\u00AF"); 


            	    }
            	    break;
            	case 46 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:558: '\\u00C4\\u00B1\\u00CD\\u2014'
            	    {
            	    match("\u00C4\u00B1\u00CD\u2014"); 


            	    }
            	    break;
            	case 47 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:585: '\\u00C4\\u00B1\\u00CD\\u2014\\u00CC\\u00AF'
            	    {
            	    match("\u00C4\u00B1\u00CD\u2014\u00CC\u00AF"); 


            	    }
            	    break;
            	case 48 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:624: '\\u00C3\\u00AF'
            	    {
            	    match("\u00C3\u00AF"); 


            	    }
            	    break;
            	case 49 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:639: 'i\\u00CC\\u00AD'
            	    {
            	    match("i\u00CC\u00AD"); 


            	    }
            	    break;
            	case 50 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:655: 'I\\u00CD\\u2014'
            	    {
            	    match("I\u00CD\u2014"); 


            	    }
            	    break;
            	case 51 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:671: 'I'
            	    {
            	    match('I'); 

            	    }
            	    break;
            	case 52 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:675: 'I\\u032F'
            	    {
            	    match("I\u032F"); 


            	    }
            	    break;
            	case 53 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:685: '\\u00CF'
            	    {
            	    match('\u00CF'); 

            	    }
            	    break;
            	case 54 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:694: '\\u00E1\\u00B8\\u00B3'
            	    {
            	    match("\u00E1\u00B8\u00B3"); 


            	    }
            	    break;
            	case 55 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:715: '\\u00E1\\u00B8\\u00B2'
            	    {
            	    match("\u00E1\u00B8\u00B2"); 


            	    }
            	    break;
            	case 56 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:736: 'u'
            	    {
            	    match('u'); 

            	    }
            	    break;
            	case 57 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:740: 'u\\u00CC\\u00AF'
            	    {
            	    match("u\u00CC\u00AF"); 


            	    }
            	    break;
            	case 58 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:756: 'U'
            	    {
            	    match('U'); 

            	    }
            	    break;
            	case 59 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:760: 'U\\u032F'
            	    {
            	    match("U\u032F"); 


            	    }
            	    break;
            	case 60 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:770: '\\u00C4\\uFFFD'
            	    {
            	    match("\u00C4\uFFFD"); 


            	    }
            	    break;
            	case 61 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:785: '\\u00C4\\uFFFD\\u00CC\\u00A3'
            	    {
            	    match("\u00C4\uFFFD\u00CC\u00A3"); 


            	    }
            	    break;
            	case 62 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:812: '\\u00C4\\u0152'
            	    {
            	    match("\u00C4\u0152"); 


            	    }
            	    break;
            	case 63 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:827: '\\u00C4\\u0152\\u00CC\\u00A3'
            	    {
            	    match("\u00C4\u0152\u00CC\u00A3"); 


            	    }
            	    break;
            	case 64 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:854: 'a'
            	    {
            	    match('a'); 

            	    }
            	    break;
            	case 65 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:858: 'J'
            	    {
            	    match('J'); 

            	    }
            	    break;
            	case 66 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:862: 'Y'
            	    {
            	    match('Y'); 

            	    }
            	    break;
            	case 67 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:866: 'W'
            	    {
            	    match('W'); 

            	    }
            	    break;
            	case 68 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:870: 'B'
            	    {
            	    match('B'); 

            	    }
            	    break;
            	case 69 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:874: 'P'
            	    {
            	    match('P'); 

            	    }
            	    break;
            	case 70 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:878: 'F'
            	    {
            	    match('F'); 

            	    }
            	    break;
            	case 71 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:882: 'M'
            	    {
            	    match('M'); 

            	    }
            	    break;
            	case 72 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:886: 'N'
            	    {
            	    match('N'); 

            	    }
            	    break;
            	case 73 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:890: 'R'
            	    {
            	    match('R'); 

            	    }
            	    break;
            	case 74 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:894: 'L'
            	    {
            	    match('L'); 

            	    }
            	    break;
            	case 75 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:898: 'Z'
            	    {
            	    match('Z'); 

            	    }
            	    break;
            	case 76 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:902: 'Q'
            	    {
            	    match('Q'); 

            	    }
            	    break;
            	case 77 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:906: 'K'
            	    {
            	    match('K'); 

            	    }
            	    break;
            	case 78 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:910: 'G'
            	    {
            	    match('G'); 

            	    }
            	    break;
            	case 79 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:914: 'D'
            	    {
            	    match('D'); 

            	    }
            	    break;
            	case 80 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:918: 'A'
            	    {
            	    match('A'); 

            	    }
            	    break;
            	case 81 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:922: '\\u2C80' .. '\\u2CFF'
            	    {
            	    matchRange('\u2C80','\u2CFF'); 

            	    }
            	    break;
            	case 82 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:941: '\\uD80C\\uDE86'
            	    {
            	    match("\uD80C\uDE86"); 


            	    }
            	    break;
            	case 83 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:956: '\\uD80C\\uDE87'
            	    {
            	    match("\uD80C\uDE87"); 


            	    }
            	    break;
            	case 84 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:971: '\\uD80C\\uDF79'
            	    {
            	    match("\uD80C\uDF79"); 


            	    }
            	    break;
            	case 85 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:986: '\\uD80C\\uDF7A'
            	    {
            	    match("\uD80C\uDF7A"); 


            	    }
            	    break;
            	case 86 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1001: '\\u13379'
            	    {
            	    match("\u13379"); 


            	    }
            	    break;
            	case 87 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1011: '\\u1337A'
            	    {
            	    match("\u1337A"); 


            	    }
            	    break;
            	case 88 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1021: '\\uD80C\\uDE58'
            	    {
            	    match("\uD80C\uDE58"); 


            	    }
            	    break;
            	case 89 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1036: '\\uD80C\\uDE82'
            	    {
            	    match("\uD80C\uDE82"); 


            	    }
            	    break;
            	case 90 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1051: 'p'
            	    {
            	    match('p'); 

            	    }
            	    break;
            	case 91 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1055: 'l'
            	    {
            	    match('l'); 

            	    }
            	    break;
            	case 92 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1059: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 93 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1063: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 94 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1067: '\\u2261'
            	    {
            	    match('\u2261'); 

            	    }
            	    break;
            	case 95 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1076: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 96 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1080: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 97 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1084: '~'
            	    {
            	    match('~'); 

            	    }
            	    break;
            	case 98 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1088: '\\u22EE'
            	    {
            	    match('\u22EE'); 

            	    }
            	    break;
            	case 99 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1097: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 100 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1101: '\\u205D'
            	    {
            	    match('\u205D'); 

            	    }
            	    break;
            	case 101 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1110: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 102 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1119: '\\u00C3\\u2022'
            	    {
            	    match("\u00C3\u2022"); 


            	    }
            	    break;
            	case 103 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1134: '\\u00C3\\u00A3'
            	    {
            	    match("\u00C3\u00A3"); 


            	    }
            	    break;
            	case 104 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1149: '\\u00C3\\u017E'
            	    {
            	    match("\u00C3\u017E"); 


            	    }
            	    break;
            	case 105 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1164: '!'
            	    {
            	    match('!'); 

            	    }
            	    break;
            	case 106 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1168: '\\u0152'
            	    {
            	    match('\u0152'); 

            	    }
            	    break;
            	case 107 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1177: '\\u0153'
            	    {
            	    match('\u0153'); 

            	    }
            	    break;
            	case 108 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1186: '\\u0178'
            	    {
            	    match('\u0178'); 

            	    }
            	    break;
            	case 109 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4957:1195: '\\u00C6'
            	    {
            	    match('\u00C6'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4959:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4959:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4959:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4959:11: '^'
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

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4959:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4961:10: ( ( '0' .. '9' )+ )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4961:12: ( '0' .. '9' )+
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4961:12: ( '0' .. '9' )+
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
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4961:13: '0' .. '9'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4963:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4965:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4965:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4965:24: ( options {greedy=false; } : . )*
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
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4965:52: .
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:41: ( '\\r' )? '\\n'
                    {
                    // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4967:41: '\\r'
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
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4969:16: ( . )
            // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:4969:18: .
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
        // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_WS | RULE_NEWLINE | RULE_CASESTRING | RULE_BETWEEN_HASHES | RULE_COMMNENT_EGYSTRING | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt16=42;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:198: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 33 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:211: RULE_CASESTRING
                {
                mRULE_CASESTRING(); 

                }
                break;
            case 34 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:227: RULE_BETWEEN_HASHES
                {
                mRULE_BETWEEN_HASHES(); 

                }
                break;
            case 35 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:247: RULE_COMMNENT_EGYSTRING
                {
                mRULE_COMMNENT_EGYSTRING(); 

                }
                break;
            case 36 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:271: RULE_EGYSTRING
                {
                mRULE_EGYSTRING(); 

                }
                break;
            case 37 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:294: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:303: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:315: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:331: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.bbaw.bts.corpus.text.dsl.ui/src-gen/org/bbaw/bts/corpus/text/dsl/ui/contentassist/antlr/internal/InternalBTS.g:1:347: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA5_eotS =
        "\1\1\16\uffff\1\111\1\uffff\1\116\15\uffff\1\135\1\uffff\1\137"+
        "\1\141\62\uffff\1\176\1\u0080\52\uffff\1\u0083\2\uffff";
    static final String DFA5_eofS =
        "\u0084\uffff";
    static final String DFA5_minS =
        "\1\41\16\uffff\1\u00cc\1\u00b8\1\u00cc\2\uffff\1\u00a0\7\uffff"+
        "\1\u00cc\1\u00b1\1\u00a3\1\u00cd\1\uffff\1\u00cc\1\u032f\22\uffff"+
        "\1\ude58\1\71\23\uffff\1\u00a4\1\uffff\1\u00ac\1\u00ad\5\uffff\1"+
        "\u00ad\1\u00cd\2\u00cc\45\uffff\1\u2014\4\uffff\1\u00cc\2\uffff";
    static final String DFA5_maxS =
        "\1\ud80c\16\uffff\1\u00cc\1\u00ba\1\u00cc\2\uffff\1\u203a\7\uffff"+
        "\1\u00cc\1\ufffd\1\u2022\1\u032f\1\uffff\1\u00cc\1\u032f\22\uffff"+
        "\1\udf7a\1\101\23\uffff\1\ufffd\1\uffff\2\u00b1\5\uffff\1\u00af"+
        "\1\u00cd\2\u00cc\45\uffff\1\u2014\4\uffff\1\u00cc\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\156\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\15\3\uffff\1\27\1\30\1\uffff\1\33\1\36\1\37\1\40\1\41\1"+
        "\45\1\51\4\uffff\1\65\2\uffff\1\100\1\101\1\102\1\103\1\104\1\105"+
        "\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120"+
        "\1\121\2\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1"+
        "\142\1\143\1\144\1\145\1\151\1\152\1\153\1\154\1\155\1\54\1\16\1"+
        "\uffff\1\21\2\uffff\1\22\1\31\1\32\1\34\1\35\4\uffff\1\60\1\146"+
        "\1\147\1\150\1\62\1\64\1\63\1\71\1\70\1\73\1\72\1\122\1\123\1\124"+
        "\1\125\1\130\1\131\1\126\1\127\1\17\1\20\1\23\1\24\1\52\1\53\1\66"+
        "\1\67\1\42\1\43\1\44\1\46\1\47\1\50\1\25\1\26\1\55\1\61\1\uffff"+
        "\1\75\1\74\1\77\1\76\1\uffff\1\57\1\56";
    static final String DFA5_specialS =
        "\u0084\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\103\12\uffff\1\74\1\uffff\1\75\1\uffff\12\102\1\71\2\uffff"+
            "\1\72\3\uffff\1\63\1\47\1\uffff\1\62\1\uffff\1\51\1\61\1\21"+
            "\1\37\1\44\1\60\1\55\1\52\1\53\1\uffff\1\50\1\57\1\54\1\25\1"+
            "\32\1\42\1\uffff\1\46\1\uffff\1\45\1\56\4\uffff\1\100\1\uffff"+
            "\1\43\1\12\1\uffff\1\33\1\uffff\1\13\1\30\1\17\1\34\1\7\1\27"+
            "\1\70\1\14\1\15\1\uffff\1\67\1\26\1\16\1\23\1\31\1\41\1\uffff"+
            "\1\11\1\uffff\1\10\1\22\3\uffff\1\76\104\uffff\1\36\1\35\1\24"+
            "\1\107\10\uffff\1\40\21\uffff\1\20\10\uffff\1\6\147\uffff\1"+
            "\104\1\105\44\uffff\1\106\u11be\uffff\1\66\u0d25\uffff\1\101"+
            "\u0203\uffff\1\73\u008c\uffff\1\77\u0991\uffff\u0080\64\u7a22"+
            "\uffff\1\2\1\3\1\5\1\4\u30e6\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\112\1\114\1\113",
            "\1\115",
            "",
            "",
            "\1\121\1\117\u00bf\uffff\1\122\u1ed8\uffff\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124\u00a0\uffff\1\126\ufeaa\uffff\1\125",
            "\1\131\13\uffff\1\127\u00ce\uffff\1\132\u1ea3\uffff\1\130",
            "\1\133\u0261\uffff\1\134",
            "",
            "\1\136",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146\51\uffff\1\147\3\uffff\1\142\1\143\u00f1\uffff\1\144"+
            "\1\145",
            "\1\150\7\uffff\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154\1\152\4\uffff\1\155\1\153\6\uffff\1\161\1\160\u00c9"+
            "\uffff\1\157\ufe7f\uffff\1\156",
            "",
            "\1\166\1\163\1\165\1\162\1\167\1\164",
            "\1\171\3\uffff\1\170",
            "",
            "",
            "",
            "",
            "",
            "\1\173\1\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    static class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()+ loopback of 4957:18: ( '\\uA722' | '\\uA723' '\\u02BE' | '\\uA725' | '\\uA724' | '\\u00EA\\u0153\\u00A3' | 'j' | 'y' | 'w' | 'b' | 'f' | 'm' | 'n' | 'r' | 'h' | '\\u00E1\\u00B8\\u00A5' | '\\u00E1\\u00B8\\u00AB' | '\\u00E1\\u00BA\\u2013' | 'H' | '\\u00E1\\u00B8\\u00A4' | '\\u00E1\\u00B8\\u00AA' | 'H\\u00CC\\u00B1' | 'H\\u00CC\\u00AD' | 'z' | 's' | '\\u00C5\\u00A1' | '\\u00C5\\u203A' | 'S' | '\\u00C5\\u00A0' | '\\u00C5\\u0161' | 'q' | 'k' | 'g' | 't' | '\\u00E1\\u00B9\\u00AF' | '\\u00E1\\u00B9\\u00AD' | '\\u00E1\\u00B9\\u00B1' | 'T' | '\\u00E1\\u00B9\\u00AE' | '\\u00E1\\u00B9\\u00AC' | '\\u00E1\\u00B9\\u00B0' | 'd' | '\\u00E1\\u00B8\\uFFFD' | '\\u00E1\\u00B8\\u017D' | 'h\\u00CC\\u00AD' | 'i\\u00CC\\u00AF' | '\\u00C4\\u00B1\\u00CD\\u2014' | '\\u00C4\\u00B1\\u00CD\\u2014\\u00CC\\u00AF' | '\\u00C3\\u00AF' | 'i\\u00CC\\u00AD' | 'I\\u00CD\\u2014' | 'I' | 'I\\u032F' | '\\u00CF' | '\\u00E1\\u00B8\\u00B3' | '\\u00E1\\u00B8\\u00B2' | 'u' | 'u\\u00CC\\u00AF' | 'U' | 'U\\u032F' | '\\u00C4\\uFFFD' | '\\u00C4\\uFFFD\\u00CC\\u00A3' | '\\u00C4\\u0152' | '\\u00C4\\u0152\\u00CC\\u00A3' | 'a' | 'J' | 'Y' | 'W' | 'B' | 'P' | 'F' | 'M' | 'N' | 'R' | 'L' | 'Z' | 'Q' | 'K' | 'G' | 'D' | 'A' | '\\u2C80' .. '\\u2CFF' | '\\uD80C\\uDE86' | '\\uD80C\\uDE87' | '\\uD80C\\uDF79' | '\\uD80C\\uDF7A' | '\\u13379' | '\\u1337A' | '\\uD80C\\uDE58' | '\\uD80C\\uDE82' | 'p' | 'l' | ':' | '=' | '\\u2261' | ',' | '.' | '~' | '\\u22EE' | '_' | '\\u205D' | '0' .. '9' | '\\u00C3\\u2022' | '\\u00C3\\u00A3' | '\\u00C3\\u017E' | '!' | '\\u0152' | '\\u0153' | '\\u0178' | '\\u00C6' )+";
        }
    }
    static final String DFA16_eotS =
        "\1\34\146\uffff";
    static final String DFA16_eofS =
        "\147\uffff";
    static final String DFA16_minS =
        "\1\0\146\uffff";
    static final String DFA16_maxS =
        "\1\uffff\146\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
        "\1\16\1\17\1\20\1\21\1\22\1\23\1\34\1\35\1\36\1\37\2\40\1\41\1\42"+
        "\114\43";
    static final String DFA16_specialS =
        "\1\0\146\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\146\1\26\1\30\2\146\1\27\22\146\1\1\1\134\1\143\1\32\1"+
            "\146\1\3\1\146\1\144\1\11\1\12\2\146\1\125\1\7\1\126\1\145\12"+
            "\133\1\123\1\4\1\13\1\10\1\14\1\16\1\146\1\115\1\101\1\142\1"+
            "\114\1\142\1\103\1\113\1\53\1\71\1\76\1\112\1\107\1\104\1\105"+
            "\1\142\1\102\1\111\1\106\1\57\1\64\1\74\1\142\1\100\1\142\1"+
            "\77\1\110\1\17\1\146\1\20\1\141\1\131\1\146\1\75\1\44\1\31\1"+
            "\65\1\142\1\45\1\62\1\51\1\66\1\41\1\61\1\122\1\46\1\47\1\142"+
            "\1\121\1\60\1\50\1\55\1\63\1\73\1\142\1\43\1\142\1\42\1\54\1"+
            "\21\1\146\1\22\1\127\103\146\1\2\1\70\1\67\1\56\1\140\10\146"+
            "\1\72\21\146\1\52\10\146\1\40\147\146\1\135\1\136\44\146\1\137"+
            "\u11be\146\1\120\u0cdb\146\1\25\111\146\1\132\u0203\146\1\124"+
            "\u008c\146\1\130\u0991\146\u0080\116\u0122\146\1\23\1\24\12"+
            "\146\1\15\u78f3\146\1\33\1\35\1\37\1\36\u30e6\146\1\117\u0373"+
            "\146\1\6\u1487\146\1\5\u0ff7\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_WS | RULE_NEWLINE | RULE_CASESTRING | RULE_BETWEEN_HASHES | RULE_COMMNENT_EGYSTRING | RULE_EGYSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0==' ') ) {s = 1;}

                        else if ( (LA16_0=='\u00C2') ) {s = 2;}

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

                        else if ( (LA16_0=='\uA723') ) {s = 29;}

                        else if ( (LA16_0=='\uA725') ) {s = 30;}

                        else if ( (LA16_0=='\uA724') ) {s = 31;}

                        else if ( (LA16_0=='\u00EA') ) {s = 32;}

                        else if ( (LA16_0=='j') ) {s = 33;}

                        else if ( (LA16_0=='y') ) {s = 34;}

                        else if ( (LA16_0=='w') ) {s = 35;}

                        else if ( (LA16_0=='b') ) {s = 36;}

                        else if ( (LA16_0=='f') ) {s = 37;}

                        else if ( (LA16_0=='m') ) {s = 38;}

                        else if ( (LA16_0=='n') ) {s = 39;}

                        else if ( (LA16_0=='r') ) {s = 40;}

                        else if ( (LA16_0=='h') ) {s = 41;}

                        else if ( (LA16_0=='\u00E1') ) {s = 42;}

                        else if ( (LA16_0=='H') ) {s = 43;}

                        else if ( (LA16_0=='z') ) {s = 44;}

                        else if ( (LA16_0=='s') ) {s = 45;}

                        else if ( (LA16_0=='\u00C5') ) {s = 46;}

                        else if ( (LA16_0=='S') ) {s = 47;}

                        else if ( (LA16_0=='q') ) {s = 48;}

                        else if ( (LA16_0=='k') ) {s = 49;}

                        else if ( (LA16_0=='g') ) {s = 50;}

                        else if ( (LA16_0=='t') ) {s = 51;}

                        else if ( (LA16_0=='T') ) {s = 52;}

                        else if ( (LA16_0=='d') ) {s = 53;}

                        else if ( (LA16_0=='i') ) {s = 54;}

                        else if ( (LA16_0=='\u00C4') ) {s = 55;}

                        else if ( (LA16_0=='\u00C3') ) {s = 56;}

                        else if ( (LA16_0=='I') ) {s = 57;}

                        else if ( (LA16_0=='\u00CF') ) {s = 58;}

                        else if ( (LA16_0=='u') ) {s = 59;}

                        else if ( (LA16_0=='U') ) {s = 60;}

                        else if ( (LA16_0=='a') ) {s = 61;}

                        else if ( (LA16_0=='J') ) {s = 62;}

                        else if ( (LA16_0=='Y') ) {s = 63;}

                        else if ( (LA16_0=='W') ) {s = 64;}

                        else if ( (LA16_0=='B') ) {s = 65;}

                        else if ( (LA16_0=='P') ) {s = 66;}

                        else if ( (LA16_0=='F') ) {s = 67;}

                        else if ( (LA16_0=='M') ) {s = 68;}

                        else if ( (LA16_0=='N') ) {s = 69;}

                        else if ( (LA16_0=='R') ) {s = 70;}

                        else if ( (LA16_0=='L') ) {s = 71;}

                        else if ( (LA16_0=='Z') ) {s = 72;}

                        else if ( (LA16_0=='Q') ) {s = 73;}

                        else if ( (LA16_0=='K') ) {s = 74;}

                        else if ( (LA16_0=='G') ) {s = 75;}

                        else if ( (LA16_0=='D') ) {s = 76;}

                        else if ( (LA16_0=='A') ) {s = 77;}

                        else if ( ((LA16_0>='\u2C80' && LA16_0<='\u2CFF')) ) {s = 78;}

                        else if ( (LA16_0=='\uD80C') ) {s = 79;}

                        else if ( (LA16_0=='\u1337') ) {s = 80;}

                        else if ( (LA16_0=='p') ) {s = 81;}

                        else if ( (LA16_0=='l') ) {s = 82;}

                        else if ( (LA16_0==':') ) {s = 83;}

                        else if ( (LA16_0=='\u2261') ) {s = 84;}

                        else if ( (LA16_0==',') ) {s = 85;}

                        else if ( (LA16_0=='.') ) {s = 86;}

                        else if ( (LA16_0=='~') ) {s = 87;}

                        else if ( (LA16_0=='\u22EE') ) {s = 88;}

                        else if ( (LA16_0=='_') ) {s = 89;}

                        else if ( (LA16_0=='\u205D') ) {s = 90;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 91;}

                        else if ( (LA16_0=='!') ) {s = 92;}

                        else if ( (LA16_0=='\u0152') ) {s = 93;}

                        else if ( (LA16_0=='\u0153') ) {s = 94;}

                        else if ( (LA16_0=='\u0178') ) {s = 95;}

                        else if ( (LA16_0=='\u00C6') ) {s = 96;}

                        else if ( (LA16_0=='^') ) {s = 97;}

                        else if ( (LA16_0=='C'||LA16_0=='E'||LA16_0=='O'||LA16_0=='V'||LA16_0=='X'||LA16_0=='e'||LA16_0=='o'||LA16_0=='v'||LA16_0=='x') ) {s = 98;}

                        else if ( (LA16_0=='\"') ) {s = 99;}

                        else if ( (LA16_0=='\'') ) {s = 100;}

                        else if ( (LA16_0=='/') ) {s = 101;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='$'||LA16_0=='&'||(LA16_0>='*' && LA16_0<='+')||LA16_0=='@'||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='\u007F' && LA16_0<='\u00C1')||(LA16_0>='\u00C7' && LA16_0<='\u00CE')||(LA16_0>='\u00D0' && LA16_0<='\u00E0')||(LA16_0>='\u00E2' && LA16_0<='\u00E9')||(LA16_0>='\u00EB' && LA16_0<='\u0151')||(LA16_0>='\u0154' && LA16_0<='\u0177')||(LA16_0>='\u0179' && LA16_0<='\u1336')||(LA16_0>='\u1338' && LA16_0<='\u2012')||(LA16_0>='\u2014' && LA16_0<='\u205C')||(LA16_0>='\u205E' && LA16_0<='\u2260')||(LA16_0>='\u2262' && LA16_0<='\u22ED')||(LA16_0>='\u22EF' && LA16_0<='\u2C7F')||(LA16_0>='\u2D00' && LA16_0<='\u2E21')||(LA16_0>='\u2E24' && LA16_0<='\u2E2D')||(LA16_0>='\u2E2F' && LA16_0<='\uA721')||(LA16_0>='\uA726' && LA16_0<='\uD80B')||(LA16_0>='\uD80D' && LA16_0<='\uDB7F')||(LA16_0>='\uDB81' && LA16_0<='\uF007')||(LA16_0>='\uF009' && LA16_0<='\uFFFF')) ) {s = 102;}

                        else s = 28;

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