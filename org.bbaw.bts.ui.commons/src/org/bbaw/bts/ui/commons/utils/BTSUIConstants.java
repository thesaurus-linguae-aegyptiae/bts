package org.bbaw.bts.ui.commons.utils;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public class BTSUIConstants {

	private BTSUIConstants() {
	};

	public static final String EVENT_TEXT_SELECTION_NEXT = "event_text_selection/next";
	public static final String EVENT_TEXT_SELECTION_PREVIOUS = "event_text_selection/previous";

	public static final String EVENT_TEXT_SELECTION_LINE_END = "event_text_selection/line_end";
	public static final String EVENT_TEXT_SELECTION_LINE_START = "event_text_selection/line_start";

	public static final String EVENT_TEXT_SELECTION_ALL_START = "event_text_selection/doc_start";
	public static final String EVENT_TEXT_SELECTION_ALL_END = "event_text_selection/doc_end";
	public static final String EVENT_TEXT_SELECTION = "event_text_selection";
	public static final String EVENT_HTW_SHORTCUT = "event_htw_shortcut/shortcut";

	/** Resource Manager for colors and fonts. */
	public static final LocalResourceManager _resources = new LocalResourceManager(
			JFaceResources.getResources());
	// GUI Colors
	public static final Color VIEW_BACKGROUND_SELECTED_COLOR = _resources
			.createColor(new RGB(255, 255, 204));
	public static final Color VIEW_BACKGROUND_DESELECTED_COLOR = _resources
			.createColor(new RGB(255, 255, 255));
	public static final Color VIEW_BACKGROUND_INVALID_COLOR = _resources
			.createColor(new RGB(255, 153, 151));

	public static final Color VIEW_FOREGROUND_SELECTED_COLOR = _resources
			.createColor(new RGB(0, 0, 0));
	public static final Color VIEW_FOREGROUND_DESELECTED_COLOR = _resources
			.createColor(new RGB(128, 128, 128));
	public static final Color VIEW_TEXT_SELECTED_COLOR = _resources
			.createColor(new RGB(0, 0, 0));
	public static final Color VIEW_TEXT_DESELECTED_COLOR = _resources
			.createColor(new RGB(163, 163, 163));
	public static final Color VIEW_FOREGROUND_INVALID_COLOR = _resources
			.createColor(new RGB(255, 0, 0));
	public static final Color COLOR_ANNOTATTION = _resources
			.createColor(new RGB(0, 0, 0));

	public static final Color COLOR_COMMENT = _resources.createColor(new RGB(
			255, 182, 0));

	public static final Color COLOR_SUBTEXT = _resources.createColor(new RGB(
			10, 30, 255));

	public static final Color COLOR_LEMMA = _resources.createColor(new RGB(228,
			255, 255));
	public static final Color COLOR_RUBRUM= _resources
			.createColor(new RGB(255, 106, 106));
	
	
	public static final int PASSPORT_COLUMN_NUMBER = 6;
	public static final String PASSPORT_PARENT_ENTRY_GROUP = "passport.parent.entry.group";
	public static final String PASSPORT_ENTRIES = "passport.entries";
	public static final String PASSPORT_PARENT_ENTRY_EDITOR = "passport.parent.entry.editor";
	public static final String PASSPORT_TABITEM_MAIN_COMPOSITE = "passport.tabitem.main.composite";
	public static final String PASSPORT_ENTRY_PATH = "passport.entry.path";
	public static final String PART_ID_PASSPORT_EDITOR_PART = "org.bbaw.bts.ui.corpus.part.passportEditorPart";
	public static final Color VIEW_BACKGROUND_LABEL_PRESSED = _resources
			.createColor(new RGB(220, 217, 185));
	public static final int DELAY = 400;
	public static final String SELECTION_TYPE = "selectionType";
	public static final Object SELECTION_TYPE_SECONDARY = "selectionType.secondary";
	public static final Object SELECTION_TYPE_PRIMARY = "selectionType.primary";
	public static final String PART_SAVE_ON_DESELCTION = "save.on.deselection";
	public static final Color COLOR_WIHTE  = _resources.createColor(new RGB(
			255, 255, 255));
	public static final Color COLOR_BACKGROUND_DISABLED  = _resources.createColor(new RGB(
			205, 205, 205));
	public static final String EVENT_TEXT_RELATING_OBJECTS_LOADED = "event_text_relating_objects/loaded";
	public static final String CSS_UNSELECTED_CLASS_NAME = "unselected";
	public static final String CSS_SELECTED_CLASS_NAME = "selected";
	public static final String EVENT_TEXT_RELATING_OBJECTS_SELECTED = "event_text_relating_objects/selected";
	public static final String EVENT_RELATING_OBJECTS_SELECTED = "event_relating_objects/selected";;

}
