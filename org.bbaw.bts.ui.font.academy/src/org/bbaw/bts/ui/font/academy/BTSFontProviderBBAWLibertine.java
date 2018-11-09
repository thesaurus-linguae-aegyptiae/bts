package org.bbaw.bts.ui.font.academy;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.bbaw.bts.ui.font.BTSFontProvider;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public class BTSFontProviderBBAWLibertine implements BTSFontProvider
{

	private static final String FONT_NAME = "BBAWLibertine";
	private static final String[] FONT_STYLES = new String[] { "normal"};//, "bold", "italic", "bolditalic" };
	private static final String FONT_FILE_NAME = "BBAWLibertine_ah.ttf";
	private static final String BUNDLE_NAME = "org.bbaw.bts.ui.font.academy";
	private static final String FOLDER = "font/";
	private static final int SIZE = 12;

	@Override
	public String getFontName()
	{
		return FONT_NAME;
	}

	@Override
	public Font getFont()
	{
		FontData fontdata = getFontData();
		if (fontdata != null)
		{
			fontdata.setHeight(SIZE);
			fontdata.setStyle(SWT.NORMAL);
			return new Font(Display.getCurrent(), fontdata);
		}
		return null;
	}

	private FontData getFontData()
	{
		URL entry = Platform.getBundle(BUNDLE_NAME).getEntry("/" + FOLDER + FONT_FILE_NAME);
		Path fontpath = new Path("/" + FOLDER + FONT_FILE_NAME);
		File fontFile = null;
		if (entry != null) {
			URL fontFileUrl = FileLocator.find(Platform.getBundle(BUNDLE_NAME), fontpath, null);
			try {
				fontFile = new File(FileLocator.toFileURL(fontFileUrl).getPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		boolean isLoaded = Display.getCurrent().loadFont(fontFile.toString());
		FontData fontdata = null;

		if (isLoaded)
		{
			FontData[] fd = Display.getCurrent().getFontList(null, true);
			for (int i = 0; i < fd.length; i++)
			{
				if (fd[i].getName().equals(FONT_NAME))
				{
					fontdata = fd[i];
					break;
				}
			}
			return fontdata;
		}
		return fontdata;
	}

	@Override
	public Font getFont(String style)
	{
		FontData fontdata = getFontData();
		if (fontdata != null)
		{
			fontdata.setHeight(SIZE);
			if ("bold".equals(style))
			{
				fontdata.setStyle(SWT.BOLD);
			} else if ("italic".equals(style))
			{
				fontdata.setStyle(SWT.ITALIC);
			} else if ("bolditalic".equals(style))
			{
				fontdata.setStyle(SWT.BOLD | SWT.ITALIC);
			} else
			{
				fontdata.setStyle(SWT.NORMAL);
			}
			return new Font(Display.getCurrent(), fontdata);
		}
		return null;
	}

	@Override
	public String[] getFontStyles()
	{
		return FONT_STYLES;
	}

}
