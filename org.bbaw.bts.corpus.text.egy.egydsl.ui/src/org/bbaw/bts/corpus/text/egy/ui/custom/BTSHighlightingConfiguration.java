package org.bbaw.bts.corpus.text.egy.ui.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class BTSHighlightingConfiguration implements IHighlightingConfiguration {
	// provide an id string for the highlighting calculator
	public static final String WORD = "Word";
	public static final String MARKER = "Marker";
	public static final String SENTENCE = "Sentence";
	public static final String AMBIVALENCE = "Ambivalence";
	public static final String LEMMA_CASE = "Lemma Case";
	public static final String EXPANDED = "Expanded";
	public static final String EMANDATION = "Emandation";
	public static final String DISPUTABLE_READING = "Disputable Reading";
	public static final String LACUNA = "Lacuna";
	public static final String DELETION = "Deletion";
	public static final String EXPANDED_COLUMN = "Expanded Column";
	public static final String RASUR = "Rasur";
	public static final String ANCIENT_EXPANDED = "Ancient Expanded";
	public static final String RESTORATION_OVER_RASUR = "Restoration over Rasur";
	public static final String PARTIAL_DESTRUCTION = "PartialDestruction";
	public static final String DESTRUCTION = "Destruction";

	public static final String[] ALL_STRINGS = { WORD };
	private static final int NORMAL = 0;
	public static final String ID = "TEST";

	// configure the acceptor providing the id, the description string
	// that will appear in the preference page and the initial text style
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor, WORD, 50, 0, 0, SWT.NORMAL);
		addType(acceptor, MARKER, 50, 50, 0, SWT.BOLD);
		addType(acceptor, SENTENCE, 50, 50, 100, SWT.BOLD);
		addType(acceptor, AMBIVALENCE, 00, 0, 0, NORMAL);
		addType(acceptor, LEMMA_CASE, 50, 0, 0, NORMAL);

		addType(acceptor, EXPANDED, 00, 0, 0, NORMAL);
		addType(acceptor, EMANDATION, 00, 0, 0, NORMAL);
		addType(acceptor, DISPUTABLE_READING, 00, 0, 0, NORMAL);
		addType(acceptor, LACUNA, 00, 0, 0, NORMAL);
		addType(acceptor, DELETION, 00, 0, 0, NORMAL);
		addType(acceptor, EXPANDED_COLUMN, 00, 0, 0, NORMAL);
		addType(acceptor, RASUR, 00, 0, 0, NORMAL);
		addType(acceptor, ANCIENT_EXPANDED, 00, 0, 0, NORMAL);
		addType(acceptor, RESTORATION_OVER_RASUR, 00, 0, 0, NORMAL);
		addType(acceptor, PARTIAL_DESTRUCTION, 00, 0, 0, NORMAL);
		addType(acceptor, DESTRUCTION, 00, 0, 0, NORMAL);

	}

	public void addType(IHighlightingConfigurationAcceptor acceptor, String s,
			int r, int g, int b, int style) {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(r, g, b));
		textStyle.setStyle(style);
		acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}

}