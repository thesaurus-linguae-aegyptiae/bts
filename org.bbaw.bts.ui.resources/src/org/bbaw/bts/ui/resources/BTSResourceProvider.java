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
package org.bbaw.bts.ui.resources;

import org.eclipse.e4.tools.services.IResourceProviderService;
import org.eclipse.swt.widgets.Display;

/**
 * The Interface BTSResourceProvider provides static resource string ids.
 *
 * @author Christoph Plutte
 */
public interface BTSResourceProvider extends IResourceProviderService {

	// images
	/** The Constant IMG_ACTIVITY. */
	public final static String IMG_ACTIVITY = "IMG_ACTIVITY"; //$NON-NLS-1$

	/** The Constant IMG_ACTIVITY_CATEGORY. */
	public final static String IMG_ACTIVITY_CATEGORY = "IMG_ACTIVITY_CATEGORY"; //$NON-NLS-1$

	/** The Constant IMG_ADD. */
	public final static String IMG_ADD = "IMG_ADD"; //$NON-NLS-1$

	/** The Constant IMG_ADD_OBJ. */
	public final static String IMG_ADD_OBJ = "IMG_ADD_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_BLANK. */
	public final static String IMG_BLANK = "IMG_BLANK"; //$NON-NLS-1$

	/** The Constant IMG_CHANGE_OBJ. */
	public final static String IMG_CHANGE_OBJ = "IMG_CHANGE_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_DELETE. */
	public final static String IMG_DELETE = "IMG_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_DELETE_OBJ. */
	public final static String IMG_DELETE_OBJ = "IMG_DELETE_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_ELEMENTS_OBJ. */
	public final static String IMG_ELEMENTS_OBJ = "IMG_ELEMENTS_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_ERROR_TSK. */
	public final static String IMG_ERROR_TSK = "IMG_ERROR_TSK"; //$NON-NLS-1$

	/** The Constant IMG_EXCLAMATION_SMALL. */
	public final static String IMG_EXCLAMATION_SMALL = "IMG_EXCLAMATION_SMALL"; //$NON-NLS-1$

	/** The Constant IMG_FILE_OBJ. */
	public final static String IMG_FILE_OBJ = "IMG_FILE_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_FLDR_OBJ. */
	public final static String IMG_FLDR_OBJ = "IMG_FLDR_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_FONT. */
	public final static String IMG_FONT = "IMG_FONT"; //$NON-NLS-1$

	/** The Constant IMG_GENERIC_ELEMENT. */
	public final static String IMG_GENERIC_ELEMENT = "IMG_GENERIC_ELEMENT"; //$NON-NLS-1$

	/** The Constant IMG_GENERIC_ELEMENTS. */
	public final static String IMG_GENERIC_ELEMENTS = "IMG_GENERIC_ELEMENTS"; //$NON-NLS-1$

	/** The Constant IMG_INFO_TSK. */
	public final static String IMG_INFO_TSK = "IMG_INFO_TSK"; //$NON-NLS-1$

	/** The Constant IMG_KEYGROUPS_OBJ. */
	public final static String IMG_KEYGROUPS_OBJ = "IMG_KEYGROUPS_OBJ"; //$NON-NLS-1$

	/** The Constant IMG_LAYOUT_CO. */
	public final static String IMG_LAYOUT_CO = "IMG_LAYOUT_CO"; //$NON-NLS-1$

	/** The Constant IMG_MENU. */
	public final static String IMG_MENU = "IMG_MENU"; //$NON-NLS-1$

	/** The Constant IMG_MINUS_SMALL. */
	public final static String IMG_MINUS_SMALL = "IMG_MINUS_SMALL"; //$NON-NLS-1$

	/** The Constant IMG_PENCIL_SMALL. */
	public final static String IMG_PENCIL_SMALL = "IMG_PENCIL_SMALL"; //$NON-NLS-1$

	/** The Constant IMG_SEPARATOR. */
	public final static String IMG_SEPARATOR = "IMG_SEPARATOR"; //$NON-NLS-1$

	/** The Constant IMG_SIGNED_NO_TBL. */
	public final static String IMG_SIGNED_NO_TBL = "IMG_SIGNED_NO_TBL"; //$NON-NLS-1$

	/** The Constant IMG_SIGNED_UNKN_TBL. */
	public final static String IMG_SIGNED_UNKN_TBL = "IMG_SIGNED_UNKN_TBL"; //$NON-NLS-1$

	/** The Constant IMG_SIGNED_YES_TBL. */
	public final static String IMG_SIGNED_YES_TBL = "IMG_SIGNED_YES_TBL"; //$NON-NLS-1$

	/** The Constant IMG_SUBMENU. */
	public final static String IMG_SUBMENU = "IMG_SUBMENU"; //$NON-NLS-1$

	/** The Constant IMG_THEME_CATEGORY. */
	public final static String IMG_THEME_CATEGORY = "IMG_THEME_CATEGORY"; //$NON-NLS-1$


	/** The Constant IMG_TOOLBAR. */
	public final static String IMG_TOOLBAR = "IMG_TOOLBAR"; //$NON-NLS-1$

	/** The Constant IMG_WARN_TSK. */
	public final static String IMG_WARN_TSK = "IMG_WARN_TSK"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_GROUP_ADD. */
	public final static String IMG_WIDGET_GROUP_ADD = "IMG_WIDGET_GROUP_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_GROUP_DELETE. */
	public final static String IMG_WIDGET_GROUP_DELETE = "IMG_WIDGET_GROUP_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_GROUP. */
	public final static String IMG_WIDGET_GROUP = "IMG_WIDGET_GROUP"; //$NON-NLS-1$

	/** The Constant IMG_WORKINGSETS. */
	public final static String IMG_WORKINGSETS = "IMG_WORKINGSETS"; //$NON-NLS-1$

	// bts specific
	/** The Constant IMG_ABSTRACTTEXT_ADD. */
	public final static String IMG_ABSTRACTTEXT_ADD = "IMG_ABSTRACTTEXT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_ABSTRACTTEXT_DELETE. */
	public final static String IMG_ABSTRACTTEXT_DELETE = "IMG_ABSTRACTTEXT_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_ABSTRACTTEXT_EDIT. */
	public final static String IMG_ABSTRACTTEXT_EDIT = "IMG_ABSTRACTTEXT_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_ABSTRACTTEXT_WARNING. */
	public final static String IMG_ABSTRACTTEXT_WARNING = "IMG_ABSTRACTTEXT_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_ABSTRACTTEXT. */
	public final static String IMG_ABSTRACTTEXT = "IMG_ABSTRACTTEXT"; //$NON-NLS-1$

	/** The Constant IMG_ABSTRACTTEXTS. */
	public final static String IMG_ABSTRACTTEXTS = "IMG_ABSTRACTTEXTS"; //$NON-NLS-1$

	/** The Constant IMG_ANNOTATION_ADD. */
	public final static String IMG_ANNOTATION_ADD = "IMG_ANNOTATION_ADD"; //$NON-NLS-1$

	/** The Constant IMG_ANNOTATION_DELETE. */
	public final static String IMG_ANNOTATION_DELETE = "IMG_ANNOTATION_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_ANNOTATION_EDIT. */
	public final static String IMG_ANNOTATION_EDIT = "IMG_ANNOTATION_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_ANNOTATION_WARNING. */
	public final static String IMG_ANNOTATION_WARNING = "IMG_ANNOTATION_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_ANNOTATION. */
	public final static String IMG_ANNOTATION = "IMG_ANNOTATION"; //$NON-NLS-1$

	/** The Constant IMG_ANNOTATIONS. */
	public final static String IMG_ANNOTATIONS = "IMG_ANNOTATIONS"; //$NON-NLS-1$

	/** The Constant IMG_ARRANGEMENT. */
	public final static String IMG_ARRANGEMENT = "IMG_ARRANGEMENT"; //$NON-NLS-1$

	/** The Constant IMG_CAPTION_ADD. */
	public final static String IMG_CAPTION_ADD = "IMG_CAPTION_ADD"; //$NON-NLS-1$

	/** The Constant IMG_CAPTION_EDIT. */
	public final static String IMG_CAPTION_EDIT = "IMG_CAPTION_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_CAPTION. */
	public final static String IMG_CAPTION = "IMG_CAPTION"; //$NON-NLS-1$

	/** The Constant IMG_CATEGORIES. */
	public final static String IMG_CATEGORIES = "IMG_CATEGORIES"; //$NON-NLS-1$

	/** The Constant IMG_CATEGORY. */
	public final static String IMG_CATEGORY = "IMG_CATEGORY"; //$NON-NLS-1$

	/** The Constant IMG_COMMENT_ADD. */
	public final static String IMG_COMMENT_ADD = "IMG_COMMENT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_COMMENT_DELETE. */
	public final static String IMG_COMMENT_DELETE = "IMG_COMMENT_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_COMMENT_EDIT. */
	public final static String IMG_COMMENT_EDIT = "IMG_COMMENT_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_COMMENT_WARNING. */
	public final static String IMG_COMMENT_WARNING = "IMG_COMMENT_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_COMMENT. */
	public final static String IMG_COMMENT = "IMG_COMMENT"; //$NON-NLS-1$

	/** The Constant IMG_COMMENTS. */
	public final static String IMG_COMMENTS = "IMG_COMMENTS"; //$NON-NLS-1$

	/** The Constant IMG_CONFIG_ITEM_ADD. */
	public final static String IMG_CONFIG_ITEM_ADD = "IMG_CONFIG_ITEM_ADD"; //$NON-NLS-1$

	/** The Constant IMG_CONFIG_ITEM_DELETE. */
	public final static String IMG_CONFIG_ITEM_DELETE = "IMG_CONFIG_ITEM_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_CONFIG_ITEM. */
	public final static String IMG_CONFIG_ITEM = "IMG_CONFIG_ITEM"; //$NON-NLS-1$

	/** The Constant IMG_CONFIG_TYPE. */
	public final static String IMG_CONFIG_TYPE = "IMG_CONFIG_TYPE"; //$NON-NLS-1$

	/** The Constant IMG_CONFIGURATION_ADD. */
	public final static String IMG_CONFIGURATION_ADD = "IMG_CONFIGURATION_ADD"; //$NON-NLS-1$

	/** The Constant IMG_CONFIGURATION_DELETE. */
	public final static String IMG_CONFIGURATION_DELETE = "IMG_CONFIGURATION_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_CONFIGURATION_EDIT. */
	public final static String IMG_CONFIGURATION_EDIT = "IMG_CONFIGURATION_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_CONFIGURATION_WARNING. */
	public final static String IMG_CONFIGURATION_WARNING = "IMG_CONFIGURATION_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_CONFIGURATION. */
	public final static String IMG_CONFIGURATION = "IMG_CONFIGURATION"; //$NON-NLS-1$

	/** The Constant IMG_CORPORA. */
	public final static String IMG_CORPORA = "IMG_CORPORA"; //$NON-NLS-1$

	/** The Constant IMG_CORPUS_ADD. */
	public final static String IMG_CORPUS_ADD = "IMG_CORPUS_ADD"; //$NON-NLS-1$

	/** The Constant IMG_CORPUS_DELETE. */
	public final static String IMG_CORPUS_DELETE = "IMG_CORPUS_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_CORPUS_EDIT. */
	public final static String IMG_CORPUS_EDIT = "IMG_CORPUS_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_CORPUS_WARNING. */
	public final static String IMG_CORPUS_WARNING = "IMG_CORPUS_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_CORPUS. */
	public final static String IMG_CORPUS = "IMG_CORPUS"; //$NON-NLS-1$

	/** The Constant IMG_DATABASE_ADD. */
	public final static String IMG_DATABASE_ADD = "IMG_DATABASE_ADD"; //$NON-NLS-1$

	/** The Constant IMG_DATABASE_DELETE. */
	public final static String IMG_DATABASE_DELETE = "IMG_DATABASE_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_DATABASE_EDIT. */
	public final static String IMG_DATABASE_EDIT = "IMG_DATABASE_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_DATABASE_WARNING. */
	public final static String IMG_DATABASE_WARNING = "IMG_DATABASE_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_DATABASE. */
	public final static String IMG_DATABASE = "IMG_DATABASE"; //$NON-NLS-1$

	/** The Constant IMG_GROUP. */
	public final static String IMG_GROUP = "IMG_GROUP"; //$NON-NLS-1$

	/** The Constant IMG_HELP. */
	public final static String IMG_HELP = "IMG_HELP"; //$NON-NLS-1$

	/** The Constant IMG_HIEROGLYPHETW. */
	public final static String IMG_HIEROGLYPHETW = "IMG_HIEROGLYPHETW"; //$NON-NLS-1$

	/** The Constant IMG_IMAGE_DELETE. */
	public final static String IMG_IMAGE_DELETE = "IMG_IMAGE_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_IMAGE_EDIT. */
	public final static String IMG_IMAGE_EDIT = "IMG_IMAGE_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_IMAGE_WARNING. */
	public final static String IMG_IMAGE_WARNING = "IMG_IMAGE_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_IMAGE. */
	public final static String IMG_IMAGE = "IMG_IMAGE"; //$NON-NLS-1$

	/** The Constant IMG_IMAGES. */
	public final static String IMG_IMAGES = "IMG_IMAGES"; //$NON-NLS-1$

	/** The Constant IMG_LEMMA_ADD. */
	public final static String IMG_LEMMA_ADD = "IMG_LEMMA_ADD"; //$NON-NLS-1$

	/** The Constant IMG_LEMMA_DELETE. */
	public final static String IMG_LEMMA_DELETE = "IMG_LEMMA_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_LEMMA_EDITL. */
	public final static String IMG_LEMMA_EDITL = "IMG_LEMMA_EDITL"; //$NON-NLS-1$

	/** The Constant IMG_LEMMA_WARNING. */
	public final static String IMG_LEMMA_WARNING = "IMG_LEMMA_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_LEMMA. */
	public final static String IMG_LEMMA = "IMG_LEMMA"; //$NON-NLS-1$

	/** The Constant IMG_LEMMATA. */
	public final static String IMG_LEMMATA = "IMG_LEMMATA"; //$NON-NLS-1$

	/** The Constant IMG_LEMMATIZER. */
	public final static String IMG_LEMMATIZER = "IMG_LEMMATIZER"; //$NON-NLS-1$

	/** The Constant IMG_PASSPORT_ITEM. */
	public final static String IMG_PASSPORT_ITEM = "IMG_PASSPORT_ITEM"; //$NON-NLS-1$

	/** The Constant IMG_PASSPORT. */
	public final static String IMG_PASSPORT = "IMG_PASSPORT"; //$NON-NLS-1$

	/** The Constant IMG_PREFERENCES. */
	public final static String IMG_PREFERENCES = "IMG_PREFERENCES"; //$NON-NLS-1$

	/** The Constant IMG_PROJECT_ADD. */
	public final static String IMG_PROJECT_ADD = "IMG_PROJECT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_PROJECT_DELETE. */
	public final static String IMG_PROJECT_DELETE = "IMG_PROJECT_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_PROJECT_EDIT. */
	public final static String IMG_PROJECT_EDIT = "IMG_PROJECT_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_PROJECT_WARNING. */
	public final static String IMG_PROJECT_WARNING = "IMG_PROJECT_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_PROJECT. */
	public final static String IMG_PROJECT = "IMG_PROJECT"; //$NON-NLS-1$

	/** The Constant IMG_PROJECTS. */
	public final static String IMG_PROJECTS = "IMG_PROJECTS"; //$NON-NLS-1$

	/** The Constant IMG_REDO. */
	public final static String IMG_REDO = "IMG_REDO"; //$NON-NLS-1$

	/** The Constant IMG_SAVE_ALL. */
	public final static String IMG_SAVE_ALL = "IMG_SAVE_ALL"; //$NON-NLS-1$

	/** The Constant IMG_SAVE. */
	public final static String IMG_SAVE = "IMG_SAVE"; //$NON-NLS-1$

	/** The Constant IMG_SCENE_DELETE. */
	public final static String IMG_SCENE_DELETE = "IMG_SCENE_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_SCENE_EDIT. */
	public final static String IMG_SCENE_EDIT = "IMG_SCENE_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_SCENE_WARNING. */
	public final static String IMG_SCENE_WARNING = "IMG_SCENE_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_SCENE. */
	public final static String IMG_SCENE = "IMG_SCENE"; //$NON-NLS-1$

	/** The Constant IMG_SEARCH_ADVANCED. */
	public final static String IMG_SEARCH_ADVANCED = "IMG_SEARCH_ADVANCED"; //$NON-NLS-1$

	/** The Constant IMG_SEARCH. */
	public final static String IMG_SEARCH = "IMG_SEARCH"; //$NON-NLS-1$

	/** The Constant IMG_SPELLING_ADD. */
	public final static String IMG_SPELLING_ADD = "IMG_SPELLING_ADD"; //$NON-NLS-1$

	/** The Constant IMG_SPELLING_DELETE. */
	public final static String IMG_SPELLING_DELETE = "IMG_SPELLING_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_SPELLING_EDIT. */
	public final static String IMG_SPELLING_EDIT = "IMG_SPELLING_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_SPELLING_WARNING. */
	public final static String IMG_SPELLING_WARNING = "IMG_SPELLING_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_SPELLING. */
	public final static String IMG_SPELLING = "IMG_SPELLING"; //$NON-NLS-1$

	/** The Constant IMG_SPELLINGS. */
	public final static String IMG_SPELLINGS = "IMG_SPELLINGS"; //$NON-NLS-1$

	/** The Constant IMG_SUBTEXT. */
	public final static String IMG_SUBTEXT = "IMG_SUBTEXT"; //$NON-NLS-1$
	
	/** The Constant IMG_SUBTEXT_ADD. */
	public final static String IMG_SUBTEXT_ADD = "IMG_SUBTEXT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_TCOBJECT_ADD. */
	public final static String IMG_TCOBJECT_ADD = "IMG_TCOBJECT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_TCOBJECT_DELETE. */
	public final static String IMG_TCOBJECT_DELETE = "IMG_TCOBJECT_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_TCOBJECT_EDIT. */
	public final static String IMG_TCOBJECT_EDIT = "IMG_TCOBJECT_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_TCOBJECT_WARNING. */
	public final static String IMG_TCOBJECT_WARNING = "IMG_TCOBJECT_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_TCOBJECT. */
	public final static String IMG_TCOBJECT = "IMG_TCOBJECT"; //$NON-NLS-1$

	/** The Constant IMG_TCOBJECTPART. */
	public final static String IMG_TCOBJECTPART = "IMG_TCOBJECTPART"; //$NON-NLS-1$

	/** The Constant IMG_TEXT_ADD. */
	public final static String IMG_TEXT_ADD = "IMG_TEXT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_TEXT_DELETE. */
	public final static String IMG_TEXT_DELETE = "IMG_TEXT_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_TEXT_EDIT. */
	public final static String IMG_TEXT_EDIT = "IMG_TEXT_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_TEXT_ERROR. */
	public final static String IMG_TEXT_ERROR = "IMG_TEXT_ERROR"; //$NON-NLS-1$

	/** The Constant IMG_TEXT_WARNING. */
	public final static String IMG_TEXT_WARNING = "IMG_TEXT_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_TEXT. */
	public final static String IMG_TEXT = "IMG_TEXT"; //$NON-NLS-1$

	/** The Constant IMG_TEXTS. */
	public final static String IMG_TEXTS = "IMG_TEXTS"; //$NON-NLS-1$

	/** The Constant IMG_THS_ADD. */
	public final static String IMG_THS_ADD = "IMG_THS_ADD"; //$NON-NLS-1$

	/** The Constant IMG_THS_DELETE. */
	public final static String IMG_THS_DELETE = "IMG_THS_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_THS_EDIT. */
	public final static String IMG_THS_EDIT = "IMG_THS_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_THS_WARNING. */
	public final static String IMG_THS_WARNING = "IMG_THS_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_THS. */
	public final static String IMG_THS = "IMG_THS"; //$NON-NLS-1$

	/** The Constant IMG_THSS. */
	public final static String IMG_THSS = "IMG_THSS"; //$NON-NLS-1$

	/** The Constant IMG_UNDO. */
	public final static String IMG_UNDO = "IMG_UNDO"; //$NON-NLS-1$

	/** The Constant IMG_USER_ADD. */
	public final static String IMG_USER_ADD = "IMG_USER_ADD"; //$NON-NLS-1$

	/** The Constant IMG_USER_DELETE. */
	public final static String IMG_USER_DELETE = "IMG_USER_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_USER_EDIT. */
	public final static String IMG_USER_EDIT = "IMG_USER_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_USER_WARNING. */
	public final static String IMG_USER_WARNING = "IMG_USER_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_USER. */
	public final static String IMG_USER = "IMG_USER"; //$NON-NLS-1$

	/** The Constant IMG_USERROLE_ADD. */
	public final static String IMG_USERROLE_ADD = "IMG_USERROLE_ADD"; //$NON-NLS-1$

	/** The Constant IMG_USERROLE_DELETE. */
	public final static String IMG_USERROLE_DELETE = "IMG_USERROLE_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_USERROLE_EDIT. */
	public final static String IMG_USERROLE_EDIT = "IMG_USERROLE_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_USERROLE_WARNING. */
	public final static String IMG_USERROLE_WARNING = "IMG_USERROLE_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_USERROLE. */
	public final static String IMG_USERROLE = "IMG_USERROLE"; //$NON-NLS-1$

	/** The Constant IMG_USERS_ADD. */
	public final static String IMG_USERS_ADD = "IMG_USERS_ADD"; //$NON-NLS-1$

	/** The Constant IMG_USERS_DELETE. */
	public final static String IMG_USERS_DELETE = "IMG_USERS_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_USERS_WARNING. */
	public final static String IMG_USERS_WARNING = "IMG_USERS_WARNING"; //$NON-NLS-1$

	/** The Constant IMG_USERS. */
	public final static String IMG_USERS = "IMG_USERS"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_CHECK_BOX_ADD. */
	public final static String IMG_WIDGET_CHECK_BOX_ADD = "IMG_WIDGET_CHECK_BOX_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_CHECK_BOX_DELETE. */
	public final static String IMG_WIDGET_CHECK_BOX_DELETE = "IMG_WIDGET_CHECK_BOX_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_CHECK_BOX. */
	public final static String IMG_WIDGET_CHECK_BOX = "IMG_WIDGET_CHECK_BOX"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_COMBO_ADD. */
	public final static String IMG_WIDGET_COMBO_ADD = "IMG_WIDGET_COMBO_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_COMBO_DELETE. */
	public final static String IMG_WIDGET_COMBO_DELETE = "IMG_WIDGET_COMBO_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_COMBO. */
	public final static String IMG_WIDGET_COMBO = "IMG_WIDGET_COMBO"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_DATE_ADD. */
	public final static String IMG_WIDGET_DATE_ADD = "IMG_WIDGET_DATE_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_DATE_DELETE. */
	public final static String IMG_WIDGET_DATE_DELETE = "IMG_WIDGET_DATE_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_DATE. */
	public final static String IMG_WIDGET_DATE = "IMG_WIDGET_DATE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_REFERENCE_ADD. */
	public final static String IMG_WIDGET_REFERENCE_ADD = "IMG_WIDGET_REFERENCE_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_REFERENCE_DELETE. */
	public final static String IMG_WIDGET_REFERENCE_DELETE = "IMG_WIDGET_REFERENCE_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_REFERENCE. */
	public final static String IMG_WIDGET_REFERENCE = "IMG_WIDGET_REFERENCE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_SPIN_ADD. */
	public final static String IMG_WIDGET_SPIN_ADD = "IMG_WIDGET_SPIN_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_SPIN_DELETE. */
	public final static String IMG_WIDGET_SPIN_DELETE = "IMG_WIDGET_SPIN_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_SPIN. */
	public final static String IMG_WIDGET_SPIN = "IMG_WIDGET_SPIN"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_TEXT_ADD. */
	public final static String IMG_WIDGET_TEXT_ADD = "IMG_WIDGET_TEXT_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_TEXT_AREA_ADD. */
	public final static String IMG_WIDGET_TEXT_AREA_ADD = "IMG_WIDGET_TEXT_AREA_ADD"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_TEXT_AREA_DELETE. */
	public final static String IMG_WIDGET_TEXT_AREA_DELETE = "IMG_WIDGET_TEXT_AREA_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_TEXT_AREA. */
	public final static String IMG_WIDGET_TEXT_AREA = "IMG_WIDGET_TEXT_AREA"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_TEXT_DELETE. */
	public final static String IMG_WIDGET_TEXT_DELETE = "IMG_WIDGET_TEXT_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_WIDGET_TEXT. */
	public final static String IMG_WIDGET_TEXT = "IMG_WIDGET_TEXT"; //$NON-NLS-1$

	/** The Constant IMG_LOCALE. */
	public final static String IMG_LOCALE = "IMG_LOCALE"; //$NON-NLS-1$

	/** The Constant IMG_EDIT. */
	public final static String IMG_EDIT = "IMG_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_EDIT_DISABLED. */
	public final static String IMG_EDIT_DISABLED = "IMG_EDIT_DISABLED"; //$NON-NLS-1$

	/** The Constant IMG_EDIT_LOCKED. */
	public final static String IMG_EDIT_LOCKED = "IMG_EDIT_LOCKED"; //$NON-NLS-1$

	/** The Constant IMG_THSS_ADD. */
	public final static String IMG_THSS_ADD = "IMG_THSS_ADD"; //$NON-NLS-1$

	/** The Constant IMG_THSS_DELETE. */
	public final static String IMG_THSS_DELETE = "IMG_THSS_DELETE"; //$NON-NLS-1$

	/** The Constant IMG_THSS_EDIT. */
	public final static String IMG_THSS_EDIT = "IMG_THSS_EDIT"; //$NON-NLS-1$

	/** The Constant IMG_BIN. */
	public final static String IMG_BIN = "IMG_BIN"; //$NON-NLS-1$
	
	/** The Constant IMG_OVR_LOCK. */
	public final static String IMG_OVR_LOCK = "IMG_OVR_LOCK";

	/** The Constant IMG_OVR_PEN. */
	public static final String IMG_OVR_PEN = "IMG_OVR_PEN";

	/** The Constant IMG_OVR_CONFLICTS. */
	public static final String IMG_OVR_CONFLICTS = "IMG_OVR_CONFLICTS";

	
	/** The Constant IMG_RELATION. */
	public static final String IMG_RELATION = "IMG_RELATION";
	
	/** The Constant IMG_RELATION_ADD. */
	public static final String IMG_RELATION_ADD = "IMG_RELATION_ADD";
	
	/** The Constant IMG_RELATION_EDIT. */
	public static final String IMG_RELATION_EDIT = "IMG_RELATION_EDIT";
	
	/** The Constant IMG_RELATION_DELETE. */
	public static final String IMG_RELATION_DELETE = "IMG_RELATION_DELETE";
	
	/** The Constant IMG_RUBRUM. */
	public static final String IMG_RUBRUM = "IMG_RUBRUM";
	
	/** The Constant IMG_RUBRUM_ADD. */
	public static final String IMG_RUBRUM_ADD = "IMG_RUBRUM_ADD";
	
	public static final String IMG_FLEXION = "IMG_FLEXION";
	
	/** The Constant IMG_OVR_PEN. */
	public static final String IMG_OVR_AWAITING_REVIEW = "IMG_OVR_AWAITING_REVIEW";
	
	public static final String IMG_OVR_AWAITING_UPDATE = "IMG_OVR_AWAITING_UPDATE";

	
	public static final String IMG_OVR_OBSOLETE = "IMG_OVR_OBSOLETE";

	
	public static final String IMG_OVR_REVIEWED = "IMG_OVR_REVIEWED";

	public static final String IMG_OVR_NEW = "IMG_OVR_NEW";

	public static final String IMG_CORPUS_DISABLED = "IMG_CORPUS_DISABLED";
	
	public static final String IMG_ROOT = "IMG_ROOT";

	

}