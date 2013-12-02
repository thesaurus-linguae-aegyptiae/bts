package org.bbaw.bts.ui.font;

import org.eclipse.swt.graphics.Font;

public interface BTSFontProvider
{

	String getFontName();

	String[] getFontStyles();

	Font getFont();

	Font getFont(String style);
}
