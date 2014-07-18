package org.bbaw.bts.core.commons;


public class BTSCoreConstants
{
	private BTSCoreConstants()
	{
	}

	// passport
	public static final String PASSPORT = "Passport";
	public static final String CATEGORIES = "Categories";
	public static final String PASSPORT_CATEGORY = "Passport-Category";
	public static final String PASSPORT_ENTRY_GROUP = "Passport-Entry-Group";
	public static final String PASSPORT_ENTRY_ITEM = "Passport-Entry-Item";

	public static final String OBJECT_TYPES = "objectTypes";
	public static final String MAIN_PROJECT_KEY = "main_project_key";
	public static final String OBJECT_TYPE = "objectType";

	public static final String AUTHENTICATED_USER = "authenticated_user";
	public static final String OBJECT_TYPE_PATH_DEFAULT = "undefined";
	public static final String OBJECTS_EDITING_DOMAIN_MAP = "objects_editing_domain_map";
	public static final String LAST_SELECTED_OBJECTS_LIST = "last_selected_objects_list";
	public static final int LAST_SELECTED_LIST_SIZE = 50;
	public static final String CORE_EXPRESSION_CAN_UNDO = "core_expression_can_undo";
	public static final String CORE_EXPRESSION_CAN_REDO = "core_expression_can_redo";
	
	public static final String BASIC_RELATIONS_PARTOF = "partOf";
	public static final String BASIC_RELATIONS_ANNOTATION_TARGET = "annotationTarget";
	public static final String LANG_DE = "de";
	public static final String LANG_EN = "en";
	public static final String LANG_FR = "fr";
	public static final String LANG_ES = "es";
	public static final String LANG_RU = "ru";
	public static final String[] LANGS = new String[] { LANG_DE, LANG_EN,
			LANG_FR, LANG_ES, LANG_RU };

	public static final String WIDGET_TYPE_TEXT = "Text";

	public static final String WIDGET_TYPE_TEXT_FIELD = "Text Field";

	public static final String WIDGET_TYPE_TEXT_SUGGEST = "Text and Suggest";

	public static final String WIDGET_TYPE_DATE = "Date";

	public static final String WIDGET_TYPE_BOOLEAN = "Boolean Select";

	public static final String WIDGET_TYPE_SELECT_THS = "Select from Thesaurus";

	public static final String WIDGET_TYPE_SELECT_CONFIG = "Select from Configuration";

	public static final String WIDGET_TYPE_SELECT_INTEGER = "Select Integer";

	public static final String WIDGET_TYPE_REFERENCE_EXTERNAL = "Reference External";

	public static final String[] WIDGET_TYPES = new String[] {
			WIDGET_TYPE_TEXT, WIDGET_TYPE_TEXT_SUGGEST, WIDGET_TYPE_TEXT_FIELD,
			WIDGET_TYPE_DATE, WIDGET_TYPE_BOOLEAN, WIDGET_TYPE_SELECT_THS,
			WIDGET_TYPE_SELECT_CONFIG, WIDGET_TYPE_SELECT_INTEGER,
			WIDGET_TYPE_REFERENCE_EXTERNAL };
	public static final String VISIBILITY_CONFIG = "Visibility";
	public static final String VISIBILITY_PUBLIC = "public";
	public static final String VISIBILITY_ALL_AUTHENTICATED = "all_authenticated";
	public static final String VISIBILITY_PROJECT = "project";
	public static final String VISIBILITY_GROUP = "group";
	public static final String VISIBILITY_USER = "user";


	public static final String REVIEW_STATUS_CONFIG = "Review Status";
	public static final String USERGROUPS_OF_AUTHENTICATED_USER = "groups_of_authenticated_user";
	public static final String CORE_EXPRESSION_MAY_EDIT = "core_expression_may_edit";
	public static final String CORE_EXPRESSION_MAY_ADD = "core_expression_may_add";
	public static final String CORE_EXPRESSION_MAY_ANNOTATE = "core_expression_may_annotate";
	public static final String CORE_EXPRESSION_MAY_COMMENT = "core_expression_may_comment";
	public static final String CORE_EXPRESSION_MAY_DELETE = "core_expression_may_delete";
	public static final String CORE_EXPRESSION_MAY_EDIT_CONFIG = "core_expression_may_edit_config";
	public static final String CORE_EXPRESSION_MAY_EDIT_PERMISSIONS = "core_expression_may_edit_permissions";
	public static final String CORE_EXPRESSION_MAY_EDIT_USERS = "core_expression_may_edit_users";
	public static final String CORE_EXPRESSION_MAY_MASTER_EDIT_CONFIG = "core_expression_may_master_edit_config";
	public static final String CORE_EXPRESSION_MAY_TRANSCRIBE = "core_expression_may_transcribe";
	public static final String MAIN_PROJECT = "main_project";
	public static final String USER_ROLE_GUESTS = "guests";
	public static final String USER_ROLE_ADMINS = "admins";
	public static final String USER_ROLE_EDITORS = "editors";
	public static final String USER_ROLE_RESEARCHERS = "researchers";
	public static final String USER_ROLE_TRANSCRIBERS = "transcribers";
	public static final String CURRENT_DB_COLLECTION_CONTEXT = "db_collection_context";
	public static final String CORE_EXPRESSION_USER_CONTEXT_ROLE = "user_context_role";
	public static final String MAIN_WORD_LIST = "main_word_list";
	public static final String RELATION = "Relation";
	public static final Object RELATIONS = "Relations";
	public static final String LOCKING_MAP_KEY = "locking_map_key";
	public static final String CORE_EXPRESSION_MAY_CREATE_DBCOLLECTION = "core_expression_may_create_dbCollection";
	public static final String CORE_EXPRESSION_MAY_EDIT_PROJECTS = "core_expression_may_edit_projects";
	
	public static final String ADMIN_SUFFIX = "_admin";

	public static final String COMMENT = "_comment";

	public static final String LOCAL = "local";

	public static final String SPLIT_PATTERN = "\\|";

	public static final String ADMIN = "admin";

	public static final String SEARCH_RELATION_PARTOF = "search_relation_partOf";

	public static final String SEARCH_RELATED_OBJECTS = "search_relatedObjects";

	public static final String USERID_PREFIX = "org.couchdb.user:";

	public static final String STATUS_MESSAGE_LIST = "status_message_list";

	public static final int STATUS_MESSAGE_LIST_SIZE = 25;
	public static final String EXTENSION_POINT_SEARCH_SERVICE_FACTORY = "org.bbaw.bts.core.services.searchServiceFactory";
	public static final String EXTENSION_SEARCH_SERVICE_MAP = "extension_search_service_map";


}
