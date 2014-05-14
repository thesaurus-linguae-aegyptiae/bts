package org.bbaw.bts.corpus.text.egy.ui.custom;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.parser.IEncodingProvider;

public class BTSEncodingProvider implements IEncodingProvider {

	private static final String ENCODING = "UTF-8";

	@Override
	public String getEncoding(URI uri) {
		return ENCODING;
	}

}
