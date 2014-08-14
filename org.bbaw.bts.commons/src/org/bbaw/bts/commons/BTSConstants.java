package org.bbaw.bts.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.UUID;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.framework.internal.core.BundleURLConnection;

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

	public static final String OBJECT_STATE_ACTIVE = "active";
	public static final String OBJECT_STATE_TERMINATED = "terminated";
	public static final String ANNOTATION = "Annotation";
	public static final String CORPUS_OBJECT = "CorpusObject";
	public static final String IMAGE = "Image";
	public static final String WLIST_ENTRY = "ListEntry";
	public static final String TEXT = "Text";
	public static final String TEXT_CORPUS = "TextCorpus";
	public static final String THS_ENTRY = "Thesaurus Entry";
	private static final String COMMENT = "Comment";

	public static final String[] BASIC_OBJECT_TYPES = new String[] {
			BTSConstants.ANNOTATION, BTSConstants.CORPUS_OBJECT,
			BTSConstants.IMAGE, BTSConstants.WLIST_ENTRY, BTSConstants.TEXT,
			BTSConstants.TEXT_CORPUS, BTSConstants.THS_ENTRY , BTSConstants.COMMENT};
	public static final String DB_DIR = "dbdir";
	public static final String DEFAULT_LOCAL_DB_URL_PORT = "9086";
	public static final String DEFAULT_LOCAL_DB_URL_HOST = "127.0.0.1";
	public static final String DEFAULT_LOCAL_DB_URL_PROTOCOL = "http";
	public static final String DEFAULT_PREF_P2_UPDATE_SITE =  "http://telota.bbaw.de/bts-update/update-3.x/repository/";//
	public static final String DEFAULT_SEARCH_HTTP_ENABLED = "true";
	public static final Object DEFAULT_LOCAL_SEARCH_CLUSTER_NAME = "btsElasticsearch";
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
		URL entry = Platform.getBundle("org.bbaw.bts.commons").getEntry("/META-INF");
		if (entry != null)
		{
		URLConnection connection;
		try {
			connection = entry.openConnection();
			URL fileURL = ((BundleURLConnection) connection).getFileURL();

			URI uri = new URI(fileURL.toString());
			File file = new File(uri);
			File parent = file.getParentFile();
			while(parent != null && !(parent.getName().equals("configuration") && !(parent.getName().equals("workspace"))))
			{
				parent = parent.getParentFile();
			}
			if (parent == null)
			{
				File dir = new File(System.getProperty("user.home") + BTSConstants.FS + "bts");
				if (!dir.exists())
				{
					dir.mkdirs();
				}
				return dir.getAbsolutePath();
			}
			file = parent.getParentFile();
	        String path = file.getAbsolutePath();
			return path;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		}
		return System.getenv("user.home"); 
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
		return val;
	}
}
