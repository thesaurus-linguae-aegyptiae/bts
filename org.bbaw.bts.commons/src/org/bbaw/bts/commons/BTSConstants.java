package org.bbaw.bts.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

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
			//			 develop in eclipse
			// String pdrHome = System.getenv("PDR_HOME");
			// if (pdrHome != null)
			// {
			// AE_HOME = pdrHome;
			// }
			// else
			{
				if (System.getProperty("os.name").toLowerCase().contains("mac"))
				{
					BTS_HOME = actLoc.removeLastSegments(7).toOSString();// + FS +
					// "workspace_ae8"+
					// FS +
					// "ArchivEditor";
				} else
				{
					BTS_HOME = actLoc.removeLastSegments(4).toOSString();// + FS +
					// "workspace_ae_ng";
				}
				// rap
				//				AE_HOME = actLoc.removeLastSegments(8).toOSString();

				// win pc export
				// AE_HOME = actLoc.removeLastSegments(4).toOSString();// + FS +
				// "workspace_ae6"+ FS + "ArchivEditor";
				// mac export
				// AE_HOME = actLoc.removeLastSegments(7).toOSString();// + FS +
				// "workspace_ae6"+ FS + "ArchivEditor";
			}
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
}
