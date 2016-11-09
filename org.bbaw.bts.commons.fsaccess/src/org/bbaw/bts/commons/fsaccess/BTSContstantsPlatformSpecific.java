/**
 * This file is part of Thesaurus Linguae Aegyptiae, TLA.
 * 
 * The software TLA serves as a web interface for presenting and working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software TLA was developed at Free University Berlin, www.fu-berlin.de together with 
 * the Berlin-Brandenburg Academy of Sciences and Humanities, 
 * Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2016  Free University of Berlin and Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software TLA was developed by @author: Christoph Plutte.
 * 
 * TLA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * TLA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with TLA.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.commons.fsaccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.fsaccess.internal.Activator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

/**
 * @author plutte
 *
 */
public class BTSContstantsPlatformSpecific {
	
	private static Properties PROPERTIES;
	public static final String BTS_HOME;

	/** file separator. */
	public static final String FS = System.getProperty("file.separator");

	private BTSContstantsPlatformSpecific()
	{
	}

	/* Initialisierung */
	static
	{
		IPath actLoc = Activator.getDefault().getStateLocation();
		IPath p = Platform.getLocation();

		String home = Activator.getBTSHome();
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
		File file = new File(BTSConstants.PROPERTIES_FILENAME);
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
							+ BTSContstantsPlatformSpecific.FS + "bts");
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
	 * In bts case it is the <code>btsInstallationDir</code>/dbdir
	 * 
	 * @deprecated
	 * 
	 * @param btsInsallationDir BTS Installation Directory
	 * @return Database Installation Directory
	 */
	public static String getDBInstallationDir(String btsInsallationDir) {
		if (btsInsallationDir == null)
		{
			btsInsallationDir = getInstallationDir();
		}
		String dbdir = btsInsallationDir + BTSContstantsPlatformSpecific.FS + BTSConstants.DB_DIR;

		return dbdir;
	}
}
