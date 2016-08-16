/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
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
			engine.setTheme(GREY_EXTRA_BIG_THEME, true);
			break;
		case GREY_EXTRA_BIG_THEME:
			engine.setTheme(OLIVE_THEME, true);
			break;
		case OLIVE_THEME:
			engine.setTheme(OLIVE_BIG_THEME, true);
			break;
		case OLIVE_BIG_THEME:
			engine.setTheme(OLIVE_EXTRA_BIG_THEME, true);
			break;
		case OLIVE_EXTRA_BIG_THEME:
			engine.setTheme(DEFAULT_THEME, true);
			break;
		
		default:
			engine.setTheme(DEFAULT_THEME, true);
			break;
		}
	}
}