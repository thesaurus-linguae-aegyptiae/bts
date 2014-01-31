package org.bbaw.bts.corpus.text.egy.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEgyBtsLexer extends Lexer {
    public static final int T__40=40;
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
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int RULE_EGYSTRING=4;
    public static final int T__13=13;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalEgyBtsLexer() {;} 
    public InternalEgyBtsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEgyBtsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:11:6: ( '@mv' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:11:8: '@mv'
            {
            match("@mv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:12:6: ( '@v' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:12:8: '@v'
            {
            match("@v"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:13:6: ( '\\u00A7' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:13:8: '\\u00A7'
            {
            match('\u00A7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:14:6: ( ' ' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:14:8: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:15:6: ( '%' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:15:8: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:16:7: ( '; ' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:16:9: '; '
            {
            match("; "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:17:7: ( 'case ' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:17:9: 'case '
            {
            match("case "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:18:7: ( ': ' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:18:9: ': '
            {
            match(": "); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:19:7: ( '#' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:19:9: '#'
            {
            match('#'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:20:7: ( ',' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:20:9: ','
            {
            match(','); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:21:7: ( '.' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:21:9: '.'
            {
            match('.'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:22:7: ( '\\u2261' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:22:9: '\\u2261'
            {
            match('\u2261'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:23:7: ( ':' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:23:9: ':'
            {
            match(':'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:24:7: ( '\\u22EE' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:24:9: '\\u22EE'
            {
            match('\u22EE'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:25:7: ( '-' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:25:9: '-'
            {
            match('-'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:26:7: ( '~' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:26:9: '~'
            {
            match('~'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:27:7: ( '(' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:27:9: '('
            {
            match('('); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:28:7: ( ')' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:28:9: ')'
            {
            match(')'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:29:7: ( '<' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:29:9: '<'
            {
            match('<'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:30:7: ( '>' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:30:9: '>'
            {
            match('>'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:31:7: ( '?' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:31:9: '?'
            {
            match('?'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:32:7: ( '[' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:32:9: '['
            {
            match('['); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:33:7: ( ']' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:33:9: ']'
            {
            match(']'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:34:7: ( '{' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:34:9: '{'
            {
            match('{'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:35:7: ( '}' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:35:9: '}'
            {
            match('}'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:36:7: ( '<<' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:36:9: '<<'
            {
            match("<<"); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:37:7: ( '>>' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:37:9: '>>'
            {
            match(">>"); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:38:7: ( '{{' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:38:9: '{{'
            {
            match("{{"); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:39:7: ( '}}' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:39:9: '}}'
            {
            match("}}"); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:40:7: ( '((' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:40:9: '(('
            {
            match("(("); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:41:7: ( '))' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:41:9: '))'
            {
            match("))"); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:42:7: ( '[[' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:42:9: '[['
            {
            match("[["); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:43:7: ( ']]' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:43:9: ']]'
            {
            match("]]"); 


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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:44:7: ( '\\u2E22' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:44:9: '\\u2E22'
            {
            match('\u2E22'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:45:7: ( '\\u2E23' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:45:9: '\\u2E23'
            {
            match('\u2E23'); 

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
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:46:7: ( '--' )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:46:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_EGYSTRING"
    public final void mRULE_EGYSTRING() throws RecognitionException {
        try {
            int _type = RULE_EGYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:4951:16: ( (~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' ) ) )* )
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:4951:18: (~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' ) ) )*
            {
            // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:4951:18: (~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\"')||LA1_0=='$'||(LA1_0>='&' && LA1_0<='\'')||(LA1_0>='*' && LA1_0<='+')||(LA1_0>='/' && LA1_0<='9')||LA1_0=='='||(LA1_0>='@' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='\u007F' && LA1_0<='\u00A6')||(LA1_0>='\u00A8' && LA1_0<='\u2260')||(LA1_0>='\u2262' && LA1_0<='\u22ED')||(LA1_0>='\u22EF' && LA1_0<='\u2E21')||(LA1_0>='\u2E24' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:4951:18: ~ ( ( ' ' | '\\n' | '\\t' | '\\u00A7' | '#' | '%' | ';' | '.' | ',' | ':' | '-' | '~' | '\\u2261' | '\\u22EE' | '(' | ')' | '<' | '>' | '?' | '{' | '}' | '\\u2E22' | '\\u2E23' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='/' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='@' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='\u007F' && input.LA(1)<='\u00A6')||(input.LA(1)>='\u00A8' && input.LA(1)<='\u2260')||(input.LA(1)>='\u2262' && input.LA(1)<='\u22ED')||(input.LA(1)>='\u22EF' && input.LA(1)<='\u2E21')||(input.LA(1)>='\u2E24' && input.LA(1)<='\uFFFF') ) {
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

    public void mTokens() throws RecognitionException {
        // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_EGYSTRING )
        int alt2=37;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:25: T__8
                {
                mT__8(); 

                }
                break;
            case 5 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:30: T__9
                {
                mT__9(); 

                }
                break;
            case 6 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:35: T__10
                {
                mT__10(); 

                }
                break;
            case 7 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:41: T__11
                {
                mT__11(); 

                }
                break;
            case 8 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:47: T__12
                {
                mT__12(); 

                }
                break;
            case 9 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:53: T__13
                {
                mT__13(); 

                }
                break;
            case 10 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:59: T__14
                {
                mT__14(); 

                }
                break;
            case 11 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:65: T__15
                {
                mT__15(); 

                }
                break;
            case 12 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:71: T__16
                {
                mT__16(); 

                }
                break;
            case 13 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:77: T__17
                {
                mT__17(); 

                }
                break;
            case 14 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:83: T__18
                {
                mT__18(); 

                }
                break;
            case 15 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:89: T__19
                {
                mT__19(); 

                }
                break;
            case 16 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:95: T__20
                {
                mT__20(); 

                }
                break;
            case 17 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:101: T__21
                {
                mT__21(); 

                }
                break;
            case 18 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:107: T__22
                {
                mT__22(); 

                }
                break;
            case 19 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:113: T__23
                {
                mT__23(); 

                }
                break;
            case 20 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:119: T__24
                {
                mT__24(); 

                }
                break;
            case 21 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:125: T__25
                {
                mT__25(); 

                }
                break;
            case 22 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:131: T__26
                {
                mT__26(); 

                }
                break;
            case 23 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:137: T__27
                {
                mT__27(); 

                }
                break;
            case 24 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:143: T__28
                {
                mT__28(); 

                }
                break;
            case 25 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:149: T__29
                {
                mT__29(); 

                }
                break;
            case 26 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:155: T__30
                {
                mT__30(); 

                }
                break;
            case 27 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:161: T__31
                {
                mT__31(); 

                }
                break;
            case 28 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:167: T__32
                {
                mT__32(); 

                }
                break;
            case 29 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:173: T__33
                {
                mT__33(); 

                }
                break;
            case 30 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:179: T__34
                {
                mT__34(); 

                }
                break;
            case 31 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:185: T__35
                {
                mT__35(); 

                }
                break;
            case 32 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:191: T__36
                {
                mT__36(); 

                }
                break;
            case 33 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:197: T__37
                {
                mT__37(); 

                }
                break;
            case 34 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:203: T__38
                {
                mT__38(); 

                }
                break;
            case 35 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:209: T__39
                {
                mT__39(); 

                }
                break;
            case 36 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:215: T__40
                {
                mT__40(); 

                }
                break;
            case 37 :
                // ../org.bbaw.bts.corpus.text.egy.dsl.ui/src-gen/org/bbaw/bts/corpus/text/egy/dsl/ui/contentassist/antlr/internal/InternalEgyBts.g:1:221: RULE_EGYSTRING
                {
                mRULE_EGYSTRING(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\2\32\4\uffff\1\32\1\37\5\uffff\1\41\1\uffff\1\43\1\45\1\47\1\51"+
        "\1\uffff\1\53\1\55\1\57\1\61\3\uffff\1\32\1\63\1\32\14\uffff\1\65"+
        "\1\uffff\1\66\5\uffff\1\67\1\uffff\1\32\3\uffff\1\32\1\uffff";
    static final String DFA2_eofS =
        "\72\uffff";
    static final String DFA2_minS =
        "\1\40\1\155\4\uffff\1\141\1\40\5\uffff\1\55\1\uffff\1\50\1\51\1"+
        "\74\1\76\1\uffff\2\0\1\173\1\175\3\uffff\1\166\1\0\1\163\14\uffff"+
        "\1\0\1\uffff\1\0\5\uffff\1\0\1\uffff\1\145\3\uffff\1\40\1\uffff";
    static final String DFA2_maxS =
        "\1\u2e23\1\166\4\uffff\1\141\1\40\5\uffff\1\55\1\uffff\1\50\1\51"+
        "\1\74\1\76\1\uffff\2\uffff\1\173\1\175\3\uffff\1\166\1\uffff\1\163"+
        "\14\uffff\1\uffff\1\uffff\1\uffff\5\uffff\1\uffff\1\uffff\1\145"+
        "\3\uffff\1\40\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\2\uffff\1\11\1\12\1\13\1\14\1\16\1\uffff"+
        "\1\20\4\uffff\1\25\4\uffff\1\42\1\43\1\45\3\uffff\1\10\1\15\1\44"+
        "\1\17\1\36\1\21\1\37\1\22\1\32\1\23\1\33\1\24\1\uffff\1\26\1\uffff"+
        "\1\27\1\34\1\30\1\35\1\31\1\uffff\1\2\1\uffff\1\40\1\41\1\1\1\uffff"+
        "\1\7";
    static final String DFA2_specialS =
        "\24\uffff\1\0\1\1\6\uffff\1\3\15\uffff\1\4\1\uffff\1\5\5\uffff"+
        "\1\2\7\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\2\uffff\1\10\1\uffff\1\4\2\uffff\1\17\1\20\2\uffff\1\11"+
            "\1\15\1\12\13\uffff\1\7\1\5\1\21\1\uffff\1\22\1\23\1\1\32\uffff"+
            "\1\24\1\uffff\1\25\5\uffff\1\6\27\uffff\1\26\1\uffff\1\27\1"+
            "\16\50\uffff\1\2\u21b9\uffff\1\13\u008c\uffff\1\14\u0b33\uffff"+
            "\1\30\1\31",
            "\1\33\10\uffff\1\34",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "",
            "\1\42",
            "\1\44",
            "\1\46",
            "\1\50",
            "",
            "\11\32\2\uffff\25\32\1\uffff\2\32\1\uffff\1\32\1\uffff\2\32"+
            "\2\uffff\2\32\3\uffff\13\32\3\uffff\1\32\2\uffff\33\32\1\52"+
            "\37\32\1\uffff\1\32\2\uffff\50\32\1\uffff\u21b9\32\1\uffff\u008c"+
            "\32\1\uffff\u0b33\32\2\uffff\ud1dc\32",
            "\11\32\2\uffff\25\32\1\uffff\2\32\1\uffff\1\32\1\uffff\2\32"+
            "\2\uffff\2\32\3\uffff\13\32\3\uffff\1\32\2\uffff\35\32\1\54"+
            "\35\32\1\uffff\1\32\2\uffff\50\32\1\uffff\u21b9\32\1\uffff\u008c"+
            "\32\1\uffff\u0b33\32\2\uffff\ud1dc\32",
            "\1\56",
            "\1\60",
            "",
            "",
            "",
            "\1\62",
            "\11\32\2\uffff\25\32\1\uffff\2\32\1\uffff\1\32\1\uffff\2\32"+
            "\2\uffff\2\32\3\uffff\13\32\3\uffff\1\32\2\uffff\73\32\1\uffff"+
            "\1\32\2\uffff\50\32\1\uffff\u21b9\32\1\uffff\u008c\32\1\uffff"+
            "\u0b33\32\2\uffff\ud1dc\32",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\32\2\uffff\25\32\1\uffff\2\32\1\uffff\1\32\1\uffff\2\32"+
            "\2\uffff\2\32\3\uffff\13\32\3\uffff\1\32\2\uffff\73\32\1\uffff"+
            "\1\32\2\uffff\50\32\1\uffff\u21b9\32\1\uffff\u008c\32\1\uffff"+
            "\u0b33\32\2\uffff\ud1dc\32",
            "",
            "\11\32\2\uffff\25\32\1\uffff\2\32\1\uffff\1\32\1\uffff\2\32"+
            "\2\uffff\2\32\3\uffff\13\32\3\uffff\1\32\2\uffff\73\32\1\uffff"+
            "\1\32\2\uffff\50\32\1\uffff\u21b9\32\1\uffff\u008c\32\1\uffff"+
            "\u0b33\32\2\uffff\ud1dc\32",
            "",
            "",
            "",
            "",
            "",
            "\11\32\2\uffff\25\32\1\uffff\2\32\1\uffff\1\32\1\uffff\2\32"+
            "\2\uffff\2\32\3\uffff\13\32\3\uffff\1\32\2\uffff\73\32\1\uffff"+
            "\1\32\2\uffff\50\32\1\uffff\u21b9\32\1\uffff\u008c\32\1\uffff"+
            "\u0b33\32\2\uffff\ud1dc\32",
            "",
            "\1\70",
            "",
            "",
            "",
            "\1\71",
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
            return "1:1: Tokens : ( T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_EGYSTRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_20 = input.LA(1);

                        s = -1;
                        if ( (LA2_20=='[') ) {s = 42;}

                        else if ( ((LA2_20>='\u0000' && LA2_20<='\b')||(LA2_20>='\u000B' && LA2_20<='\u001F')||(LA2_20>='!' && LA2_20<='\"')||LA2_20=='$'||(LA2_20>='&' && LA2_20<='\'')||(LA2_20>='*' && LA2_20<='+')||(LA2_20>='/' && LA2_20<='9')||LA2_20=='='||(LA2_20>='@' && LA2_20<='Z')||(LA2_20>='\\' && LA2_20<='z')||LA2_20=='|'||(LA2_20>='\u007F' && LA2_20<='\u00A6')||(LA2_20>='\u00A8' && LA2_20<='\u2260')||(LA2_20>='\u2262' && LA2_20<='\u22ED')||(LA2_20>='\u22EF' && LA2_20<='\u2E21')||(LA2_20>='\u2E24' && LA2_20<='\uFFFF')) ) {s = 26;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_21 = input.LA(1);

                        s = -1;
                        if ( (LA2_21==']') ) {s = 44;}

                        else if ( ((LA2_21>='\u0000' && LA2_21<='\b')||(LA2_21>='\u000B' && LA2_21<='\u001F')||(LA2_21>='!' && LA2_21<='\"')||LA2_21=='$'||(LA2_21>='&' && LA2_21<='\'')||(LA2_21>='*' && LA2_21<='+')||(LA2_21>='/' && LA2_21<='9')||LA2_21=='='||(LA2_21>='@' && LA2_21<='\\')||(LA2_21>='^' && LA2_21<='z')||LA2_21=='|'||(LA2_21>='\u007F' && LA2_21<='\u00A6')||(LA2_21>='\u00A8' && LA2_21<='\u2260')||(LA2_21>='\u2262' && LA2_21<='\u22ED')||(LA2_21>='\u22EF' && LA2_21<='\u2E21')||(LA2_21>='\u2E24' && LA2_21<='\uFFFF')) ) {s = 26;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_50 = input.LA(1);

                        s = -1;
                        if ( ((LA2_50>='\u0000' && LA2_50<='\b')||(LA2_50>='\u000B' && LA2_50<='\u001F')||(LA2_50>='!' && LA2_50<='\"')||LA2_50=='$'||(LA2_50>='&' && LA2_50<='\'')||(LA2_50>='*' && LA2_50<='+')||(LA2_50>='/' && LA2_50<='9')||LA2_50=='='||(LA2_50>='@' && LA2_50<='z')||LA2_50=='|'||(LA2_50>='\u007F' && LA2_50<='\u00A6')||(LA2_50>='\u00A8' && LA2_50<='\u2260')||(LA2_50>='\u2262' && LA2_50<='\u22ED')||(LA2_50>='\u22EF' && LA2_50<='\u2E21')||(LA2_50>='\u2E24' && LA2_50<='\uFFFF')) ) {s = 26;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_28 = input.LA(1);

                        s = -1;
                        if ( ((LA2_28>='\u0000' && LA2_28<='\b')||(LA2_28>='\u000B' && LA2_28<='\u001F')||(LA2_28>='!' && LA2_28<='\"')||LA2_28=='$'||(LA2_28>='&' && LA2_28<='\'')||(LA2_28>='*' && LA2_28<='+')||(LA2_28>='/' && LA2_28<='9')||LA2_28=='='||(LA2_28>='@' && LA2_28<='z')||LA2_28=='|'||(LA2_28>='\u007F' && LA2_28<='\u00A6')||(LA2_28>='\u00A8' && LA2_28<='\u2260')||(LA2_28>='\u2262' && LA2_28<='\u22ED')||(LA2_28>='\u22EF' && LA2_28<='\u2E21')||(LA2_28>='\u2E24' && LA2_28<='\uFFFF')) ) {s = 26;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_42 = input.LA(1);

                        s = -1;
                        if ( ((LA2_42>='\u0000' && LA2_42<='\b')||(LA2_42>='\u000B' && LA2_42<='\u001F')||(LA2_42>='!' && LA2_42<='\"')||LA2_42=='$'||(LA2_42>='&' && LA2_42<='\'')||(LA2_42>='*' && LA2_42<='+')||(LA2_42>='/' && LA2_42<='9')||LA2_42=='='||(LA2_42>='@' && LA2_42<='z')||LA2_42=='|'||(LA2_42>='\u007F' && LA2_42<='\u00A6')||(LA2_42>='\u00A8' && LA2_42<='\u2260')||(LA2_42>='\u2262' && LA2_42<='\u22ED')||(LA2_42>='\u22EF' && LA2_42<='\u2E21')||(LA2_42>='\u2E24' && LA2_42<='\uFFFF')) ) {s = 26;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_44 = input.LA(1);

                        s = -1;
                        if ( ((LA2_44>='\u0000' && LA2_44<='\b')||(LA2_44>='\u000B' && LA2_44<='\u001F')||(LA2_44>='!' && LA2_44<='\"')||LA2_44=='$'||(LA2_44>='&' && LA2_44<='\'')||(LA2_44>='*' && LA2_44<='+')||(LA2_44>='/' && LA2_44<='9')||LA2_44=='='||(LA2_44>='@' && LA2_44<='z')||LA2_44=='|'||(LA2_44>='\u007F' && LA2_44<='\u00A6')||(LA2_44>='\u00A8' && LA2_44<='\u2260')||(LA2_44>='\u2262' && LA2_44<='\u22ED')||(LA2_44>='\u22EF' && LA2_44<='\u2E21')||(LA2_44>='\u2E24' && LA2_44<='\uFFFF')) ) {s = 26;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}