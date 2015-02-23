package org.bbaw.bts.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.UUID;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

public class BTSConstants
{
	private static final DecimalFormat timeFormat4 = new DecimalFormat("0000;0000");

	private static Properties PROPERTIES;
	private static String PROPERTIES_FILENAME = "btsConfig.properties";
	public static final String BTS_HOME;

	/** file separator. */
	public static final String FS = System.getProperty("file.separator");

	public static final String ENCODING = "UTF-8";
	public static final String TEXT_VERS_BREAK_MARKER = "VersbreakMarker";
	public static final String TEXT_VERS_FRONTIER_MARKER = "VersFrontierMarker";
	public static final String BROKEN_VERS_MARKER = "BrokenVersbreakMarker";
	public static final String DESTROYED_VERS_MARKER = "DestroyedVersMarker";
	public static final String DISPUTABLE_VERS_MARKER = "DisputableVersMarker";
	public static final String DELETED_VERS_MARKER = "DeletedVersMarker";
	public static final String MISSING_VERS_MARKER = "MissingVersMarker";

	
	public static final String OBJECT_STATE_ACTIVE = "active";
	public static final String OBJECT_STATE_TERMINATED = "terminated";
	public static final String ANNOTATION = "Annotation";
	public static final String CORPUS_OBJECT = "CorpusObject";
	public static final String IMAGE = "Image";
	public static final String WLIST_ENTRY = "Lemma";
	public static final String TEXT = "Text";
	public static final String TEXT_CORPUS = "TextCorpus";
	public static final String THS_ENTRY = "Thesaurus Entry";
	private static final String COMMENT = "Comment";

	public static final String[] BASIC_OBJECT_TYPES = new String[] {
			BTSConstants.ANNOTATION, BTSConstants.CORPUS_OBJECT,
			BTSConstants.IMAGE, BTSConstants.WLIST_ENTRY, BTSConstants.TEXT,
			BTSConstants.TEXT_CORPUS, BTSConstants.THS_ENTRY , BTSConstants.COMMENT};
	public static final String DB_DIR = "dbdir";
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
		"updaters", "readers", "name", "revisionState", "visibility"};
	
	public static final SimpleDateFormat ADMIN_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public static final String EOF = "\r\n";

	public static final String REVISION_STRING_SEPARATOR = "@";

	public static final String REVISION_STRING_PATTERN = "(\\d*)" 
														+ REVISION_STRING_SEPARATOR
														+ "(\\d+-\\d+-\\d+T\\d+:\\d+:\\d+)" 
														+ REVISION_STRING_SEPARATOR + "(.+)";

	public static final String[] SEARCH_BASIC_RESPONSE_FIELDS_TRANSLATIONS = new String[]{"_id", "eClass", "type", "subtype",
		"updaters", "readers", "name", "revisionState", "visibility", "translations"};

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


	
	private BTSConstants()
	{
	}

	/* Initialisierung */
	static
	{
		IPath actLoc = BTSCommonsActivator.getDefault().getStateLocation();
		IPath p = Platform.getLocation();

		String home = BTSCommonsActivator.getBTSHome();
		if (home != null)
		{

			BTS_HOME = home;

		} else
		{
			BTS_HOME = getInstallationDir();
//			{
//				if (System.getProperty("os.name").toLowerCase().contains("mac"))
//				{
//					BTS_HOME = actLoc.removeLastSegments(7).toOSString();// + FS +
//				} else
//				{
//					BTS_HOME = actLoc.removeLastSegments(4).toOSString();// + FS +
//				}
//			}
		}
		/** Properties laden. */
		PROPERTIES = new Properties();
		File file = new File(PROPERTIES_FILENAME);
		// try {
		// if (_i) _l.info("Lade: " + file.toURI().toString());

		if (file.exists())
		{
			try
			{
				PROPERTIES.load(new FileInputStream(file));
			} catch (FileNotFoundException e)
			{
				e.printStackTrace();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static String getInstallationDir() {
		URL entry = Platform.getBundle("org.bbaw.bts.commons").getEntry(
				"/META-INF");
		if (entry != null) {
			String fileURL = null;
			try {
				fileURL = FileLocator.toFileURL(entry).getPath();
				fileURL = fileURL.substring(1, fileURL.length());
				File file = new File(fileURL);
				File parent = file.getParentFile();
				while (parent != null
						&& !(parent.getName().equals("configuration") && !(parent
								.getName().equals("workspace")))) {
					parent = parent.getParentFile();
					if (parent != null)
					{
						System.out.println("BTSConstants getInstallationDir: " +parent.getAbsolutePath());
					}
				}
				if (parent == null) {
					File dir = new File(System.getProperty("user.home")
							+ BTSConstants.FS + "bts");
					if (!dir.exists()) {
						dir.mkdirs();
					}
					System.out.println("BTSConstants getInstallationDir return dir: " +dir.getAbsolutePath());
					return dir.getAbsolutePath();
				}
				file = parent.getParentFile();
				String path = file.getAbsolutePath();
				System.out.println("BTSConstants getInstallationDir return path: " +path);
				return path;
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		String userEnvPath = System.getenv("user.home"); 
		System.out.println("BTSConstants getInstallationDir return userEnvPath: " +userEnvPath);
		return userEnvPath;
	}

	
	/** Returns the Database Installation directory within the given btsInstallation directory. 
	 * DBInstallationDir is the directory where the folder 'CouchDB' is located. 
	 * Under an installation of CouchDB using e.g. msi-installer that would be the Programs/Apache Software...
	 * In bts case it is the <btsInstallationDir>/dbdir
	 * 
	 * @param btsInsallationDir BTS Installation Directory
	 * @return Database Installation Directory
	 */
	public static String getDBInstallationDir(String btsInsallationDir) {
		if (btsInsallationDir == null)
		{
			btsInsallationDir = getInstallationDir();
		}
		String dbdir = btsInsallationDir + BTSConstants.FS + BTSConstants.DB_DIR;

		return dbdir;
	}


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
