/*
* generated by Xtext
*/
package org.bbaw.bts.corpus.text.btsdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BTSAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/bbaw/bts/corpus/text/btsdsl/parser/antlr/internal/InternalBTS.tokens");
	}
}