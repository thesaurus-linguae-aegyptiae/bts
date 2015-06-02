package org.bbaw.bts.app.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;

public class ThemeSwitcherHandler {
	private static final String DEFAULT_THEME = "org.bbaw.bts.app.theme.grey";
	private static final String GREY_BIG_THEME = "org.bbaw.bts.app.theme.greyBig";
	private static final String GREY_EXTRA_BIG_THEME = "org.bbaw.bts.app.theme.greyExtraBig";
	
	private static final String OLIVE_THEME = "org.bbaw.bts.app.theme.olive";
	private static final String OLIVE_BIG_THEME = "org.bbaw.bts.app.theme.oliveBig";
	private static final String OLIVE_EXTRA_BIG_THEME = "org.bbaw.bts.app.theme.oliveExtraBig";

	// Remember the state
	static boolean defaulttheme = true;

	@Execute
	public void switchTheme(IThemeEngine engine) {
		// second argument defines that change is
		// persisted and restored on restart
		String active = engine.getActiveTheme().getId();
		switch (active) {
		case DEFAULT_THEME:
			engine.setTheme(GREY_BIG_THEME, true);
			break;
		case GREY_BIG_THEME:
			engine.setTheme(OLIVE_THEME, true);
			break;
		case OLIVE_THEME:
			engine.setTheme(OLIVE_BIG_THEME, true);
			break;
		case OLIVE_BIG_THEME:
			engine.setTheme(OLIVE_EXTRA_BIG_THEME, true);
			break;
		case OLIVE_EXTRA_BIG_THEME:
			engine.setTheme(GREY_EXTRA_BIG_THEME, true);
			break;
		case GREY_EXTRA_BIG_THEME:
			engine.setTheme(DEFAULT_THEME, true);
			break;
		default:
			engine.setTheme(DEFAULT_THEME, true);
			break;
		}
	}
}