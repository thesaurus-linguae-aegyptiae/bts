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
package org.bbaw.bts.core.commons;


/**
 * The Class BTSCoreConstants provides constants for control layer aspects of bts.
 *
 * @author Christoph Plutte
 */
public class BTSCoreConstants
{
	
	/**
	 * Instantiates a new BTS core constants.
	 */
	private BTSCoreConstants()
	{
	}

	// passport
	/** The Constant PASSPORT. */
	public static final String PASSPORT = "Passport";
	
	/** The Constant CATEGORIES. */
	public static final String CATEGORIES = "Categories";
	
	/** The Constant PASSPORT_CATEGORY. */
	public static final String PASSPORT_CATEGORY = "Passport-Category";
	
	/** The Constant PASSPORT_ENTRY_GROUP. */
	public static final String PASSPORT_ENTRY_GROUP = "Passport-Entry-Group";
	
	/** The Constant PASSPORT_ENTRY_ITEM. */
	public static final String PASSPORT_ENTRY_ITEM = "Passport-Entry-Item";

	/** The Constant OBJECT_TYPES. */
	public static final String OBJECT_TYPES = "objectTypes";
	
	/** The Constant MAIN_PROJECT_KEY. */
	public static final String MAIN_PROJECT_KEY = "main_project_key";
	
	/** The Constant OBJECT_TYPE. */
	public static final String OBJECT_TYPE = "objectType";

	/** The Constant AUTHENTICATED_USER. */
	public static final String AUTHENTICATED_USER = "authenticated_user";
	
	/** The Constant OBJECT_TYPE_PATH_DEFAULT. */
	public static final String OBJECT_TYPE_PATH_DEFAULT = "undefined";
	
	/** The Constant OBJECTS_EDITING_DOMAIN_MAP. */
	public static final String OBJECTS_EDITING_DOMAIN_MAP = "objects_editing_domain_map";
	
	/** The Constant LAST_SELECTED_OBJECTS_LIST. */
	public static final String LAST_SELECTED_OBJECTS_LIST = "last_selected_objects_list";
	
	/** The Constant LAST_SELECTED_LIST_SIZE. */
	public static final int LAST_SELECTED_LIST_SIZE = 50;
	
	/** The Constant CORE_EXPRESSION_CAN_UNDO. */
	public static final String CORE_EXPRESSION_CAN_UNDO = "core_expression_can_undo";
	
	/** The Constant CORE_EXPRESSION_CAN_REDO. */
	public static final String CORE_EXPRESSION_CAN_REDO = "core_expression_can_redo";
	
	/** The Constant BASIC_RELATIONS_PARTOF. */
	public static final String BASIC_RELATIONS_PARTOF = "partOf";
	
	/** The Constant BASIC_RELATIONS_ANNOTATION_TARGET. */
	public static final String BASIC_RELATIONS_ANNOTATION_TARGET = "annotationTarget";
	
	public static final String BASIC_RELATIONS_CONTAINS = "contains";

	/** The Constant LANG_DE. */
	public static final String LANG_DE = "de";
	
	/** The Constant LANG_EN. */
	public static final String LANG_EN = "en";
	
	/** The Constant LANG_FR. */
	public static final String LANG_FR = "fr";
	
	/** The Constant LANG_ES. */
	public static final String LANG_ES = "es";
	
	/** The Constant LANG_RU. */
	public static final String LANG_RU = "ru";
	
	/** The Constant LANGS. */
	public static final String[] LANGS = new String[] { LANG_DE, LANG_EN,
			LANG_FR, LANG_ES, LANG_RU };

	/** The Constant WIDGET_TYPE_TEXT. */
	public static final String WIDGET_TYPE_TEXT = "Text";

	/** The Constant WIDGET_TYPE_TEXT_FIELD. */
	public static final String WIDGET_TYPE_TEXT_FIELD = "Text Field";

	/** The Constant WIDGET_TYPE_TEXT_SUGGEST. */
	public static final String WIDGET_TYPE_TEXT_SUGGEST = "Text and Suggest";

	/** The Constant WIDGET_TYPE_DATE. */
	public static final String WIDGET_TYPE_DATE = "Date";

	/** The Constant WIDGET_TYPE_BOOLEAN. */
	public static final String WIDGET_TYPE_BOOLEAN = "Boolean Select";

	/** The Constant WIDGET_TYPE_SELECT_THS. */
	public static final String WIDGET_TYPE_SELECT_THS = "Select from Thesaurus";

	/** The Constant WIDGET_TYPE_SELECT_CONFIG. */
	public static final String WIDGET_TYPE_SELECT_CONFIG = "Select from Configuration";

	/** The Constant WIDGET_TYPE_SELECT_INTEGER. */
	public static final String WIDGET_TYPE_SELECT_INTEGER = "Select Integer";

	/** The Constant WIDGET_TYPE_REFERENCE_EXTERNAL. */
	public static final String WIDGET_TYPE_REFERENCE_EXTERNAL = "Reference External";

	/** The Constant WIDGET_TYPES. */
	public static final String[] WIDGET_TYPES = new String[] {
			WIDGET_TYPE_TEXT, WIDGET_TYPE_TEXT_SUGGEST, WIDGET_TYPE_TEXT_FIELD,
			WIDGET_TYPE_DATE, WIDGET_TYPE_BOOLEAN, WIDGET_TYPE_SELECT_THS,
			WIDGET_TYPE_SELECT_CONFIG, WIDGET_TYPE_SELECT_INTEGER,
			WIDGET_TYPE_REFERENCE_EXTERNAL };
	
	/** The Constant VISIBILITY_CONFIG. */
	public static final String VISIBILITY_CONFIG = "Visibility";
	
	/** The Constant VISIBILITY_PUBLIC. */
	public static final String VISIBILITY_PUBLIC = "public";
	
	/** The Constant VISIBILITY_ALL_AUTHENTICATED. */
	public static final String VISIBILITY_ALL_AUTHENTICATED = "all_authenticated";
	
	/** The Constant VISIBILITY_PROJECT. */
	public static final String VISIBILITY_PROJECT = "project";
	
	/** The Constant VISIBILITY_GROUP. */
	public static final String VISIBILITY_GROUP = "group";
	
	/** The Constant VISIBILITY_USER. */
	public static final String VISIBILITY_USER = "user";


	/** The Constant REVIEW_STATUS_CONFIG. */
	public static final String REVIEW_STATUS_CONFIG = "Review Status";
	
	/** The Constant USERGROUPS_OF_AUTHENTICATED_USER. */
	public static final String USERGROUPS_OF_AUTHENTICATED_USER = "groups_of_authenticated_user";
	
	/** The Constant CORE_EXPRESSION_MAY_EDIT. */
	public static final String CORE_EXPRESSION_MAY_EDIT = "core_expression_may_edit";
	
	/** The Constant CORE_EXPRESSION_MAY_ADD. */
	public static final String CORE_EXPRESSION_MAY_ADD = "core_expression_may_add";
	
	/** The Constant CORE_EXPRESSION_MAY_ANNOTATE. */
	public static final String CORE_EXPRESSION_MAY_ANNOTATE = "core_expression_may_annotate";
	
	/** The Constant CORE_EXPRESSION_MAY_COMMENT. */
	public static final String CORE_EXPRESSION_MAY_COMMENT = "core_expression_may_comment";
	
	/** The Constant CORE_EXPRESSION_MAY_DELETE. */
	public static final String CORE_EXPRESSION_MAY_DELETE = "core_expression_may_delete";
	
	/** The Constant CORE_EXPRESSION_MAY_EDIT_CONFIG. */
	public static final String CORE_EXPRESSION_MAY_EDIT_CONFIG = "core_expression_may_edit_config";
	
	/** The Constant CORE_EXPRESSION_MAY_EDIT_PERMISSIONS. */
	public static final String CORE_EXPRESSION_MAY_EDIT_PERMISSIONS = "core_expression_may_edit_permissions";
	
	/** The Constant CORE_EXPRESSION_MAY_EDIT_USERS. */
	public static final String CORE_EXPRESSION_MAY_EDIT_USERS = "core_expression_may_edit_users";
	
	/** The Constant CORE_EXPRESSION_MAY_MASTER_EDIT_CONFIG. */
	public static final String CORE_EXPRESSION_MAY_MASTER_EDIT_CONFIG = "core_expression_may_master_edit_config";
	
	/** The Constant CORE_EXPRESSION_MAY_TRANSCRIBE. */
	public static final String CORE_EXPRESSION_MAY_TRANSCRIBE = "core_expression_may_transcribe";
	
	/** The Constant MAIN_PROJECT. */
	public static final String MAIN_PROJECT = "main_project";
	
	/** The Constant USER_ROLE_GUESTS. */
	public static final String USER_ROLE_GUESTS = "guests";
	
	/** The Constant USER_ROLE_ADMINS. */
	public static final String USER_ROLE_ADMINS = "admins";
	
	/** The Constant USER_ROLE_EDITORS. */
	public static final String USER_ROLE_EDITORS = "editors";
	
	/** The Constant USER_ROLE_RESEARCHERS. */
	public static final String USER_ROLE_RESEARCHERS = "researchers";
	
	/** The Constant USER_ROLE_TRANSCRIBERS. */
	public static final String USER_ROLE_TRANSCRIBERS = "transcribers";
	
	/** The Constant CURRENT_DB_COLLECTION_CONTEXT. */
	public static final String CURRENT_DB_COLLECTION_CONTEXT = "db_collection_context";
	
	/** The Constant CORE_EXPRESSION_USER_CONTEXT_ROLE. */
	public static final String CORE_EXPRESSION_USER_CONTEXT_ROLE = "user_context_role";
	
	/** The Constant MAIN_WORD_LIST. */
	public static final String MAIN_WORD_LIST = "main_word_list";
	
	/** The Constant RELATION. */
	public static final String RELATION = "Relation";
	
	/** The Constant RELATIONS. */
	public static final Object RELATIONS = "Relations";
	
	/** The Constant LOCKING_MAP_KEY. */
	public static final String LOCKING_MAP_KEY = "locking_map_key";
	
	/** The Constant CORE_EXPRESSION_MAY_CREATE_DBCOLLECTION. */
	public static final String CORE_EXPRESSION_MAY_CREATE_DBCOLLECTION = "core_expression_may_create_dbCollection";
	
	/** The Constant CORE_EXPRESSION_MAY_EDIT_PROJECTS. */
	public static final String CORE_EXPRESSION_MAY_EDIT_PROJECTS = "core_expression_may_edit_projects";
	
	/** The Constant ADMIN_SUFFIX. */
	public static final String ADMIN_SUFFIX = "_admin";

	/** The Constant COMMENT. */
	public static final String COMMENT = "_comment";

	/** The Constant LOCAL. */
	public static final String LOCAL = "local";

	/** The Constant SPLIT_PATTERN. */
	public static final String SPLIT_PATTERN = "\\|";

	/** The Constant ADMIN. */
	public static final String ADMIN = "admin";

	/** The Constant SEARCH_RELATION_PARTOF. */
	public static final String SEARCH_RELATION_PARTOF = "search_relation_partOf";

	/** The Constant SEARCH_RELATED_OBJECTS. */
	public static final String SEARCH_RELATED_OBJECTS = "search_relatedObjects";

	/** The Constant USERID_PREFIX. */
	public static final String USERID_PREFIX = "org.couchdb.user:";

	/** The Constant STATUS_MESSAGE_LIST. */
	public static final String STATUS_MESSAGE_LIST = "status_message_list";

	/** The Constant STATUS_MESSAGE_LIST_SIZE. */
	public static final int STATUS_MESSAGE_LIST_SIZE = 25;
	
	/** The Constant EXTENSION_POINT_SEARCH_SERVICE_FACTORY. */
	public static final String EXTENSION_POINT_SEARCH_SERVICE_FACTORY = "org.bbaw.bts.core.services.searchServiceFactory";
	
	/** The Constant EXTENSION_SEARCH_SERVICE_MAP. */
	public static final String EXTENSION_SEARCH_SERVICE_MAP = "extension_search_service_map";

	public static final String OBJECTS_FILTER_BY_PARAM_ID = "objects_filter_by_param";
	
	public static final String OBJECTS_FILTER_PARAM_BY_PROJECTS = "filter_by_projects";

	public static final String OBJECTS_FILTER_PARAM_BY_CREATORS = "filter_by_creators";

	public static final String OBJECTS_FILTER_PARAM_BY_UPDATERS = "filter_by_updaters";

	public static final String OBJECTS_FILTER_PARAM_BY_VISIBILITY = "filter_by_visibility";

	public static final String OBJECTS_FILTER_PARAM_BY_REVIEWSTATUS = "filter_by_reviewStatus";

	public static final String EXTENSION_POINT_MOVE_OBJECT_SERVICE_FACTORY = "org.bbaw.bts.core.services.moveObjectsAmongProjectDBCollectionServiceFactory";

	public static final String PARAM_ID_MOVE_OBEJECT_AMONG_PROJECT_TARGET_DBCOLLECTIONS = "org.bbaw.bts.ui.main.commandparameter.targetDBCollectionKey";

	public static final String IDENTIFIERS = "Identifiers";

	public static final String IDENTIFIER = "Identifier";

	public static final String LISTEN_TO_BACKEND_UPDATES = "listen2Updates";

	public static final String TRANSLATIONS_SUB_DELIMITER = ";";

}
