package org.bbaw.bts.ui.font;

import org.eclipse.swt.graphics.Font;

public interface BTSFontManager
{

	Font getFont(String fontName);

	String[] getAvailableFontNames();
}
