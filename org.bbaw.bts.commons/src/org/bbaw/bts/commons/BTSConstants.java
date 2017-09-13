package org.bbaw.bts.commons;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;

public class BTSConstants
{
	private static final DecimalFormat timeFormat4 = new DecimalFormat("0000;0000");

	public static String PROPERTIES_FILENAME = "btsConfig.properties";


	public static final String ENCODING = "UTF-8";
	public static final String TEXT_VERS_BREAK_MARKER = "VersbreakMarker";
	public static final String TEXT_VERS_FRONTIER_MARKER = "VersFrontierMarker";
	public static final String BROKEN_VERS_MARKER = "BrokenVersbreakMarker";
	public static final String DESTROYED_VERS_MARKER = "DestroyedVersMarker";
	public static final String DISPUTABLE_VERS_MARKER = "DisputableVersMarker";
	public static final String DELETED_VERS_MARKER = "DeletedVersMarker";
	public static final String MISSING_VERS_MARKER = "MissingVersMarker";
	
	public static final String DESTROYEDVERSMARKER   = "DestroyedVersMarker";
	public static final String DELETEDVERSMARKER   = "DeletedVersMarker";
	public static final String DISPUTABLEVERSMARKER  = "DisputableVersMarker";
	public static final String  RESTORATIONOVERRASURMARKER  = "RestorationOverRasurMarker";
	public static final String  ANCIENTEXPANDEDMARKER  = "AncientExpandedMarker";
	public static final String  RASURMARKER  = "RasurMarker";
	public static final String  EMENDATIONVERSMARKER  = "EmendationVersMarker";
	public static final String  DESTROYEDVERSFRONTIERMARKER  = "DestroyedVersFrontierMarker";
	public static final String  PARTIALDESTROYEDVERSMARKER  = "PartialDestroyedVersMarker";
	public static final String  PARTIALDESTROYEDDISPUTABLEVERSMARKER = "PartialDestroyedDisputableVersMarker";
	public static final String  DESTROYEDDISPUTABLEVERSFRONTIERMARKER  = "DestroyedDisputableVersFrontierMarker";
	public static final String  DISPUTABLEDESTROYEDVERSMARKER  = "DisputableDestroyedVersMarker";
	public static final String  DELETEDDISPUTABLEVERSMARKER = "DeletedDisputableVersMarker";
	public static final String  MISSINGDISPUTABLEVERSMARKER  = "MissingDisputableVersMarker";
	
	public static final String  DISPUTABLEDELETEDVERSMARKER   = "DisputableDeletedVersMarker ";
	public static final String  PARTIALDESTROYEDDELETEDVERSMARKER  = "PartialDestroyedDeletedVersMarker";
	public static final String  DESTROYEDDELETEDVERSMARKER   = "DestroyedDeletedVersMarker";
	public static final String  DELETEDDESTROYEDVERSMARKER  = "DeletedDestroyedVersMarker";


	public static final String VERS_BREAK_MARKER_SIGN = "\uDB80\uDC80"; //v
	public static final String VERS_FRONTER_MARKER_SIGN = "\uDB80\uDC81"; //mv

	public static final String BROKEN_VERS_MARKER_SIGN = "\uDB80\uDC82";
	public static final String DISPUTALBE_VERS_MARKER_SIGN = "\u2E2E\uDB80\uDC80?";
	public static final String DELETED_VERS_MARKER_SIGN = "{\uDB80\uDC80}";
	public static final String DESTROYED_VERS_MARKER_SIGN = "[\uDB80\uDC80]";
	public static final String MISSING_VERS_MARKER_SIGN = "\u2329\uDB80\uDC80\u232A";
	
	public static final String DESTROYEDVERSMARKER_SIGN   = "[\uDB80\uDC80]";
	public static final String DELETEDVERSMARKER_SIGN  = "{\uDB80\uDC80}";
	public static final String DISPUTABLEVERSMARKER_SIGN  = "\u2E2E\uDB80\uDC80?";
	public static final String  RESTORATIONOVERRASURMARKER_SIGN  = "[[\uDB80\uDC80]]";
	public static final String  ANCIENTEXPANDEDMARKER_SIGN  = "((\uDB80\uDC80))";
	public static final String  RASURMARKER_SIGN  = "{{\uDB80\uDC80}}";
	public static final String  EMENDATIONVERSMARKER_SIGN  = "(\uDB80\uDC80)";
	public static final String  DESTROYEDVERSFRONTIERMARKER_SIGN  = "[\uDB80\uDC81]";
	public static final String  PARTIALDESTROYEDVERSMARKER_SIGN  = "\u2E22\uDB80\uDC80\u2E23";
	public static final String  PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN = "\u2E22\u2E2E\uDB80\uDC80?\u2E23";
	public static final String  DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN  = "[\u2E2E\uDB80\uDC81?]";
	public static final String  DISPUTABLEDESTROYEDVERSMARKER_SIGN  = "\u2E2E[\uDB80\uDC80]?";
	public static final String  DELETEDDISPUTABLEVERSMARKER_SIGN = "{\u2E2E\uDB80\uDC80?}";
	public static final String  MISSINGDISPUTABLEVERSMARKER_SIGN  = "\u2329\u2E2E\uDB80\uDC80?\u232A";
	
	public static final String  DISPUTABLEDELETEDVERSMARKER_SIGN   = "\u2E2E{\uDB80\uDC80}? ";
	public static final String  PARTIALDESTROYEDDELETEDVERSMARKER_SIGN  = "\u2E22{\uDB80\uDC80}\u2E23";
	public static final String  DESTROYEDDELETEDVERSMARKER_SIGN   = "[{\uDB80\uDC80}]";
	public static final String  DELETEDDESTROYEDVERSMARKER_SIGN  = "{[\uDB80\uDC80]}";
	
	
	
	
	public static final String OBJECT_STATE_ACTIVE = "active";
	public static final String OBJECT_STATE_TERMINATED = "terminated";
	public static final String ANNOTATION = "Annotation";
	public static final String CORPUS_OBJECT = "CorpusObject";
	public static final String IMAGE = "Image";
	public static final String WLIST_ENTRY = "Lemma";
	public static final String TEXT = "Text";
	public static final String TEXT_CORPUS = "TextCorpus";
	public static final String THS_ENTRY = "Thesaurus Entry";
	public static final String ABSTRACT_TEXT = "Abstract Text";

	public static final String COMMENT = "Comment";

	public static final String[] BASIC_OBJECT_TYPES = new String[] { BTSConstants.ABSTRACT_TEXT,
			BTSConstants.ANNOTATION, BTSConstants.CORPUS_OBJECT,
			BTSConstants.IMAGE, BTSConstants.WLIST_ENTRY, BTSConstants.TEXT,
			BTSConstants.TEXT_CORPUS, BTSConstants.THS_ENTRY , BTSConstants.COMMENT};
	public static final String DEFAULT_LOCAL_DB_URL_PORT = "9086";//"6984";//
	public static final String DEFAULT_LOCAL_DB_URL_HOST = "127.0.0.1";
	public static final String DEFAULT_LOCAL_DB_URL_PROTOCOL = "http";
	public static final String DEFAULT_PREF_P2_UPDATE_SITE =  "http://telota.bbaw.de/bts-update/update-3.x/repository/";//
	public static final String DEFAULT_SEARCH_HTTP_ENABLED = "true";
	public static final String DEFAULT_LOCAL_SEARCH_CLUSTER_NAME = "btsElasticsearch";
	/**
	 * default time to live of lock in milliseconds.
	 */
	public static final int DEFAULT_LOCK_TTL = 500000;
	public static final String DEFAULT_LOCALE_LANG = "en";
	public static final String BTS_UUID = "bts_uuid";
	public static final String DEFAULT_NTP_SERVERS = "time.bbaw.de|times.tubit.tu-berlin.de";
	public static final String OWNER_REFERENCED_TYPES_SEPERATOR = ">>";
	public static final String OWNER_REFERENCED_TYPES_PATH_SEPERATOR = ".";
	public static final String OWNER_REFERENCED_TYPES_LIST_SEPERATOR = ",";
	public static final String OWNER_REFERENCED_TYPES_ANY = "ANY";
	public static final String ANNOTATION_RUBRUM = "Rubrum";
	public static final String ANNOTATION_SUBTEXT = "Subtext";

	/** The Constant VIEW_ALL_DOCS. */
	public static final String VIEW_ALL_DOCS = "objects/all_docs";

	/** The Constant VIEW_ALL_BTSCONFIGURATIONS. */
	public static final String VIEW_ALL_BTSCONFIGURATIONS = "project_admin/all_btsconfigurations";

	/** The Constant VIEW_ALL_BTSTCOBJECTS. */
	public static final String VIEW_ALL_BTSTCOBJECTS = "objects/all_btstcobjects";

	/** The Constant VIEW_ALL_BTSUSERS. */
	public static final String VIEW_ALL_BTSUSERS = "admin/all_btsusers";

	/** The Constant VIEW_ALL_BTSUSERGROUPS. */
	public static final String VIEW_ALL_BTSUSERGROUPS = "admin/all_btsusergroups";

	
	/** The Constant VIEW_ALL_BTSPROJECTS. */
	public static final String VIEW_ALL_BTSPROJECTS = "admin/all_projects";

	/** The Constant VIEW_ALL_ACTIVE_DOCS. */
	public static final String VIEW_ALL_ACTIVE_DOCS = "objects/all_active_docs";

	/** The Constant VIEW_ALL_ACTIVE_BTSCONFIGURATIONS. */
	public static final String VIEW_ALL_ACTIVE_BTSCONFIGURATIONS = "project_admin/all_active_btsconfigurations";

	/** The Constant VIEW_ALL_ACTIVE_BTSUSERS. */
	public static final String VIEW_ALL_ACTIVE_BTSUSERS = "admin/all_active_btsusers";

	/** The Constant VIEW_ALL_ACTIVE_BTSUSERGROUPS. */
	public static final String VIEW_ALL_ACTIVE_BTSUSERGROUPS = "admin/all_active_btsusergroups";

	/** The Constant VIEW_ALL_ACTIVE_BTSPROJECTS. */
	public static final String VIEW_ALL_ACTIVE_BTSPROJECTS = "admin/all_active_projects";

	/** The Constant VIEW_ALL_TERMINATED_DOCS. */
	public static final String VIEW_ALL_TERMINATED_DOCS = "objects/all_terminated_docs";

	/** The Constant VIEW_ALL_TERMINATED_BTSCONFIGURATIONS. */
	public static final String VIEW_ALL_TERMINATED_BTSCONFIGURATIONS = "project_admin/all_terminated_btsconfigurations";

	/** The Constant VIEW_ALL_TERMINATED_BTSUSERS. */
	public static final String VIEW_ALL_TERMINATED_BTSUSERS = "admin/all_terminated_btsusers";

	/** The Constant VIEW_ALL_TERMINATED_BTSUSERGROUPS. */
	public static final String VIEW_ALL_TERMINATED_BTSUSERGROUPS = "admin/all_terminated_btsusergroups";

	/** The Constant VIEW_ALL_TERMINATED_BTSPROJECTS. */
	public static final String VIEW_ALL_TERMINATED_BTSPROJECTS = "admin/all_terminated_projects";

	public static final String VIEW_ID_RESERVATION_OBJECTS = "id_reservation/id_reservation_objects";

	public static final String VIEW_ID_LAST_ID = "id_reservation/last_id";
	
	public static final String ORPHANS_NODE_LABEL = "_Orphans";

	public static final String[] SEARCH_BASIC_RESPONSE_FIELDS = new String[]{"_id", "eClass", "type", "subtype",
		"updaters", "readers", "name", "revisionState", "visibility", "sortKey"};
	
	public static final SimpleDateFormat ADMIN_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public static final String EOF = "\r\n";

	public static final String REVISION_STRING_SEPARATOR = "@";

	public static final String REVISION_STRING_PATTERN = "(\\d*)" 
														+ REVISION_STRING_SEPARATOR
														+ "(\\d+-\\d+-\\d+T\\d+:\\d+:\\d+)" 
														+ REVISION_STRING_SEPARATOR + "(.+)";

	public static final String[] SEARCH_BASIC_RESPONSE_FIELDS_TRANSLATIONS = new String[]{"_id", "eClass", "type", "subtype",
		"updaters", "readers", "name", "revisionState", "visibility", "sortKey"};

	public static final String OBJECT_TYPES_ARRAY = "object_types_array";

	public static final String DESTRUCTION_MARKER = "destruction_marker";

	public static final String BTS_SELECTION_HISTORY = "bts_object_selection_history";
	public static final int BTS_SELECTION_HISTORY_LENGTH = 200;

	public static final String PROPERTIES_STRING_SEPARATOR = "\\|";
	
	public static final String DB_COLLECTION_PROP_RESERVE_ID = "reserveID";

	public static final String DB_COLLECTION_PROP_RESERVE_ID_FORCE_SERVER = "reserveID_force_server";
	
	public static final String DB_COLLECTION_PROP_RESERVE_ID_MIN = "reserveID_min";

	public static final String DB_COLLECTION_PROP_RESERVE_ID_MAX = "reserveID_max";

	public static final String DB_COLLECTION_PROP_RESERVE_ID_STEP = "reserveID_step";

	public static final String DB_COLLECTION_PROP_RESERVE_ID_PREFIX = "reserveID_prefix";

	public static final int DB_COLLECTION_PROP_RESERVE_ID_MIN_DEFAULT = 100;

	public static final int DB_COLLECTION_PROP_RESERVE_ID_MAX_DEFAULT = 200;

	public static final int DB_COLLECTION_PROP_RESERVE_ID_STEP_DEFAULT = 1;

	public static final boolean DB_COLLECTION_PROP_RESERVE_ID_FORCE_SERVER_DEFAULT = true;

	public static final String DB_COLLECTION_PROP_RESERVE_ID_BEGIN = "reserveID_begin";

	public static final int DB_COLLECTION_PROP_RESERVE_ID_BEGIN_DEFAULT = 1000000;



	
	public static String getSidWithCalendar()
	{
		Calendar cal = Calendar.getInstance();
		String val = String.valueOf(cal.get(Calendar.YEAR));
		val += timeFormat4.format(cal.get(Calendar.DAY_OF_YEAR));
		val += UUID.randomUUID().toString().replaceAll("-", "");
		val = val.replace("-", "");
		
		// encode Base64 to reduce size
		byte[] array = DatatypeConverter.parseHexBinary(val);
		val = Base64.encodeBase64URLSafeString(array);
		val = val.replace("-", "Q");
		val = val.replace("_", "W");
		return val;
	}
}
