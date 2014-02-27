package org.bbaw.bts.ui.font.egyFont;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.bbaw.bts.ui.font.BTSFontProvider;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;

public class BTSFontProviderImplEgy implements BTSFontProvider
{

	private static final String FONT_NAME = "FreeSerif";
	private static final String[] FONT_STYLES = new String[] { "normal", "bold", "italic", "bolditalic" };
	private static final String FONT_FILE_NAME = "FreeSerif.ttf";
	private static final String BUNDLE_NAME = "org.bbaw.bts.ui.font.egyFont";
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
		//		URL fontFile = YouClassName.class
		//	            .getResource("/fonts/DS-DIGI.TTF");
		Class<BTSFontProviderImplEgy> clazz = BTSFontProviderImplEgy.class;
		URL dirURL = clazz.getClassLoader().getResource(FOLDER + FONT_FILE_NAME);
		Bundle bundle = Platform.getBundle(BUNDLE_NAME);
		URL fontFile = bundle.getEntry(FOLDER + FONT_FILE_NAME);
		File file = null;
		try
		{
			file = new File(FileLocator.resolve(fontFile).toURI());
			fontFile = file.toPath().toUri().toURL();
			System.out.println(fontFile);

		} catch (URISyntaxException e1)
		{
			e1.printStackTrace();
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
		String fontpath = fontFile.getPath();
		System.out.println(fontpath);
		fontpath = fontpath.substring(1, fontpath.length());
		System.out.println(fontpath);
		boolean isLoaded = Display.getCurrent().loadFont(fontpath);
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
		// TODO Auto-generated method stub
		return FONT_STYLES;
	}

}