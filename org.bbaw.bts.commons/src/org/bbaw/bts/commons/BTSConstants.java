package org.bbaw.bts.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.framework.internal.core.BundleURLConnection;

public class BTSConstants
{

	private static Properties PROPERTIES;
	private static String PROPERTIES_FILENAME = "btsConfig.properties";
	public static final String BTS_HOME;

	/** file separator. */
	public static final String FS = System.getProperty("file.separator");

	public static final String ENCODING = "UTF-8";
	public static final String TEXT_VERS_BREAK_MARKER = "VersbreakMarker";
	public static final String TEXT_VERS_FRONTIER_MARKER = "VersFrontierMarker";
	public static final String OBJECT_STATE_ACITVE = "active";
	public static final String OBJECT_STATE_TERMINATED = "terminated";
	public static final String ANNOTATION = "Annotation";
	public static final String CORPUS_OBJECT = "CorpusObject";
	public static final String IMAGE = "Image";
	public static final String WLIST_ENTRY = "ListEntry";
	public static final String TEXT = "Text";
	public static final String TEXT_CORPUS = "TextCorpus";
	public static final String THS_ENTRY = "Thesaurus Entry";

	public static final String[] BASIC_OBJECT_TYPES = new String[] {
			BTSConstants.ANNOTATION, BTSConstants.CORPUS_OBJECT,
			BTSConstants.IMAGE, BTSConstants.WLIST_ENTRY, BTSConstants.TEXT,
			BTSConstants.TEXT_CORPUS, BTSConstants.THS_ENTRY };
	public static final String DB_DIR = "dbdir";

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
}
