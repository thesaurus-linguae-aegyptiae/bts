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
package org.bbaw.bts.ui.commons.utils;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * The Class BTSUIConstants provides constants on the UI level.
 *
 * @author Christoph Plutte
 */
public class BTSUIConstants {

	/**
	 * Instantiates a new BTSUI constants.
	 */
	private BTSUIConstants() {
	};

	/** The Constant EVENT_TEXT_SELECTION_NEXT. */
	public static final String EVENT_TEXT_SELECTION_NEXT = "event_text_selection/next";
	
	/** The Constant EVENT_TEXT_SELECTION_PREVIOUS. */
	public static final String EVENT_TEXT_SELECTION_PREVIOUS = "event_text_selection/previous";

	/** The Constant EVENT_TEXT_SELECTION_LINE_END. */
	public static final String EVENT_TEXT_SELECTION_LINE_END = "event_text_selection/line_end";
	
	/** The Constant EVENT_TEXT_SELECTION_LINE_START. */
	public static final String EVENT_TEXT_SELECTION_LINE_START = "event_text_selection/line_start";

	/** The Constant EVENT_TEXT_SELECTION_ALL_START. */
	public static final String EVENT_TEXT_SELECTION_ALL_START = "event_text_selection/doc_start";
	
	/** The Constant EVENT_TEXT_SELECTION_ALL_END. */
	public static final String EVENT_TEXT_SELECTION_ALL_END = "event_text_selection/doc_end";
	
	public static final String EVENT_TEXT_SELECTION_NEXT_UNLEMMATIZED =  "event_text_selection/nextUnlemmatized";

	public static final String EVENT_TEXT_SELECTION_NEXT_UNHIEROGLYPHED = "event_text_selection/nextUnhieroglyphed";

	/** The Constant EVENT_TEXT_SELECTION. */
	public static final String EVENT_TEXT_SELECTION = "event_text_selection";
	
	/** The Constant EVENT_HTW_SHORTCUT. */
	public static final String EVENT_HTW_SHORTCUT = "event_htw_shortcut/shortcut";

	/** Resource Manager for colors and fonts. */
	public static final LocalResourceManager _resources = new LocalResourceManager(
			JFaceResources.getResources());
	// GUI Colors
	/** The Constant VIEW_BACKGROUND_SELECTED_COLOR. */
	public static final Color VIEW_BACKGROUND_SELECTED_COLOR = _resources
			.createColor(new RGB(255, 255, 204));
	
	/** The Constant VIEW_BACKGROUND_DESELECTED_COLOR. */
	public static final Color VIEW_BACKGROUND_DESELECTED_COLOR = _resources
			.createColor(new RGB(255, 255, 255));
	
	/** The Constant VIEW_BACKGROUND_INVALID_COLOR. */
	public static final Color VIEW_BACKGROUND_INVALID_COLOR = _resources
			.createColor(new RGB(255, 153, 151));

	/** The Constant VIEW_FOREGROUND_SELECTED_COLOR. */
	public static final Color VIEW_FOREGROUND_SELECTED_COLOR = _resources
			.createColor(new RGB(0, 0, 0));
	
	/** The Constant VIEW_FOREGROUND_DESELECTED_COLOR. */
	public static final Color VIEW_FOREGROUND_DESELECTED_COLOR = _resources
			.createColor(new RGB(128, 128, 128));
	
	/** The Constant VIEW_TEXT_SELECTED_COLOR. */
	public static final Color VIEW_TEXT_SELECTED_COLOR = _resources
			.createColor(new RGB(0, 0, 0));
	
	/** The Constant VIEW_TEXT_DESELECTED_COLOR. */
	public static final Color VIEW_TEXT_DESELECTED_COLOR = _resources
			.createColor(new RGB(163, 163, 163));
	
	/** The Constant VIEW_FOREGROUND_INVALID_COLOR. */
	public static final Color VIEW_FOREGROUND_INVALID_COLOR = _resources
			.createColor(new RGB(255, 0, 0));
	
	/** The Constant COLOR_ANNOTATTION. */
	public static final Color COLOR_ANNOTATTION = _resources
			.createColor(new RGB(200, 200, 200));

	/** The Constant COLOR_COMMENT. */
	public static final Color COLOR_COMMENT = _resources.createColor(new RGB(
			255, 182, 0));

	public static final Color COLOR_SENTENCE = _resources.createColor(new RGB(
			255, 182, 33));

	/** The Constant COLOR_SUBTEXT. */
	public static final Color COLOR_SUBTEXT = _resources.createColor(new RGB(
			10, 30, 255));

	/** The Constant COLOR_LEMMA. */
	public static final Color COLOR_LEMMA = _resources.createColor(new RGB(228,
			255, 255));
	
	/** The Constant COLOR_RUBRUM. */
	public static final Color COLOR_RUBRUM= _resources
			.createColor(new RGB(255, 106, 106));
	
	
	/** The Constant PASSPORT_COLUMN_NUMBER. */
	public static final int PASSPORT_COLUMN_NUMBER = 6;
	
	/** The Constant PASSPORT_PARENT_ENTRY_GROUP. */
	public static final String PASSPORT_PARENT_ENTRY_GROUP = "passport.parent.entry.group";
	
	/** The Constant PASSPORT_ENTRIES. */
	public static final String PASSPORT_ENTRIES = "passport.entries";
	
	/** The Constant PASSPORT_PARENT_ENTRY_EDITOR. */
	public static final String PASSPORT_PARENT_ENTRY_EDITOR = "passport.parent.entry.editor";
	
	/** The Constant PASSPORT_TABITEM_MAIN_COMPOSITE. */
	public static final String PASSPORT_TABITEM_MAIN_COMPOSITE = "passport.tabitem.main.composite";
	
	/** The Constant PASSPORT_ENTRY_PATH. */
	public static final String PASSPORT_ENTRY_PATH = "passport.entry.path";
	
	/** The Constant PART_ID_PASSPORT_EDITOR_PART. */
	public static final String PART_ID_PASSPORT_EDITOR_PART = "org.bbaw.bts.ui.corpus.part.passportEditorPart";
	
	/** The Constant VIEW_BACKGROUND_LABEL_PRESSED. */
	public static final Color VIEW_BACKGROUND_LABEL_PRESSED = _resources
			.createColor(new RGB(220, 217, 185));
	
	/** The Constant DELAY. */
	public static final int DELAY = 400;
	
	/** The Constant SELECTION_TYPE. */
	public static final String SELECTION_TYPE = "selectionType";
	
	/** The Constant SELECTION_TYPE_SECONDARY. */
	public static final Object SELECTION_TYPE_SECONDARY = "selectionType.secondary";
	
	/** The Constant SELECTION_TYPE_PRIMARY. */
	public static final Object SELECTION_TYPE_PRIMARY = "selectionType.primary";
	
	/** The Constant PART_SAVE_ON_DESELCTION. */
	public static final String PART_SAVE_ON_DESELCTION = "save.on.deselection";
	
	/** The Constant COLOR_WIHTE. */
	public static final Color COLOR_WIHTE  = _resources.createColor(new RGB(
			255, 255, 255));
	
	/** The Constant COLOR_BACKGROUND_DISABLED. */
	public static final Color COLOR_BACKGROUND_DISABLED  = _resources.createColor(new RGB(
			205, 205, 205));
	
	/** The Constant EVENT_TEXT_RELATING_OBJECTS_LOADED. */
	public static final String EVENT_TEXT_RELATING_OBJECTS_LOADED = "event_text_relating_objects/loaded";
	
	/** The Constant CSS_UNSELECTED_CLASS_NAME. */
	public static final String CSS_UNSELECTED_CLASS_NAME = "unselected";
	
	/** The Constant CSS_SELECTED_CLASS_NAME. */
	public static final String CSS_SELECTED_CLASS_NAME = "selected";
	
	/** The Constant EVENT_TEXT_RELATING_OBJECTS_SELECTED. */
	public static final String EVENT_TEXT_RELATING_OBJECTS_SELECTED = "event_text_relating_objects/selected";
	
	public static final String EVENT_TEXT_RELATING_OBJECTS_TOGGLE_FILTER = "event_text_relating_objects_toggle_filter";

	/** The Constant EVENT_RELATING_OBJECTS_SELECTED. */
	public static final String EVENT_RELATING_OBJECTS_SELECTED = "event_relating_objects/selected";

	public static final String EVENT_EGY_TEXT_EDITOR_LOAD_LEMMATA = "event_egy_text_editor_load_lemmata/load";
	
	public static final String EVENT_EGY_TEXT_EDITOR_TEXT_REQUESTED = "event_egy_text_editor_text_requested/translation_part";

	public static final Color COLOR_ERROR = _resources.createColor(new RGB(255, 0, 0));

	public static final Color COLOR_WARNING =_resources.createColor(new RGB(235, 235, 10));

	public static final Color COLOR_RULER_COLUMN_BACKGROUND = _resources.createColor(new RGB(233, 233, 233));

	public static final Color COLOR_DB_MANAGER_ERROR =  _resources.createColor(new RGB( 255, 191, 191));

	public static final Color COLOR_DB_MANAGER_INDEX_BEHIND = _resources.createColor(new RGB(255, 255, 190));

	public static final Color COLOR_DB_MANAGER_INDEXING = _resources.createColor(new RGB(255, 255, 140));

	public static final Color COLOR_DB_MANAGER_STATUS_OK = _resources.createColor(new RGB(191, 255, 191));

	public static final Color COLOR_BACKGROUND_GREY = _resources.createColor(new RGB(155, 155, 155));

	public static final String EVENT_TEXT_SELECTION_NEXT_UNFLEXIONED = "event_text_selection/nextUnflexioned";

	public static final Color COLOR_BLACK = _resources.createColor(new RGB(0, 0, 0));




}
