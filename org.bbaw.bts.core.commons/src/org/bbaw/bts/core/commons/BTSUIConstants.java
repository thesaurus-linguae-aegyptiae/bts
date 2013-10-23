package org.bbaw.bts.core.commons;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public class BTSUIConstants
{
	private BTSUIConstants()
	{
	}

	/** Resource Manager for colors and fonts. */
	private static final LocalResourceManager _resources = new LocalResourceManager(JFaceResources.getResources());
	public static final String PASSPORT = "Passport";
	public static final Object CATEGORIES = "Categories";
	public static final Object OBJECT_TYPES = "objectTypes";
	public static final String MAIN_PROJECT = "main_project";
	// GUI Colors
	public static final Color VIEW_BACKGROUND_SELECTED_COLOR = _resources.createColor(new RGB(255, 255, 204));
	public static final Color VIEW_BACKGROUND_DESELECTED_COLOR = _resources.createColor(new RGB(255, 255, 255));
	public static final Color VIEW_BACKGROUND_INVALID_COLOR = _resources.createColor(new RGB(255, 153, 151));

	public static final Color VIEW_FOREGROUND_SELECTED_COLOR = _resources.createColor(new RGB(0, 0, 0));
	public static final Color VIEW_FOREGROUND_DESELECTED_COLOR = _resources.createColor(new RGB(128, 128, 128));
	public static final Color VIEW_TEXT_SELECTED_COLOR = _resources.createColor(new RGB(0, 0, 0));
	public static final Color VIEW_TEXT_DESELECTED_COLOR = _resources.createColor(new RGB(163, 163, 163));
	public static final String AUTHENTICATED_USER = "authenticated_user";
	public static final Color VIEW_FOREGROUND_INVALID_COLOR = _resources.createColor(new RGB(255, 0, 0));

}
