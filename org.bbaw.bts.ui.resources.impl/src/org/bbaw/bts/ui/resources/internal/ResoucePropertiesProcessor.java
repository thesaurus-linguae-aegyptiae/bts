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
package org.bbaw.bts.ui.resources.internal;

import java.io.File;

/**
 * The Class ResoucePropertiesProcessor is for testing.
 *
 * @author Christoph Plutte
 */
public class ResoucePropertiesProcessor {

	/** The folder. */
	public static File folder = new File(
			"E:/GIT/aaew/bts-git/aaew-bts/org.bbaw.bts.ui.resources/icons/full/obj16");
	
	/** The temp. */
	static String temp = "";
	
	/** The interfix. */
	private static String interfix = "/icons/full/obj16/";

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading files under the folder "
				+ folder.getAbsolutePath());
		listFilesForFolder(folder);
	}

	/**
	 * List files for folder.
	 *
	 * @param folder the folder
	 */
	public static void listFilesForFolder(final File folder) {

		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				// System.out.println("Reading files under the folder "+folder.getAbsolutePath());
				listFilesForFolder(fileEntry);
			} else {
				if (fileEntry.isFile()) {
					temp = fileEntry.getName();
					String key = temp.substring(0, temp.length() - 4);
					key = key.replace("-", "_");
					key = key.toUpperCase();
					key = "IMG_" + key;

					// System.out.println(key + "=" + interfix + temp);
					System.out.println();

					System.out.println("public final static String " + key
							+ " = \"" + key + "\"; //$NON-NLS-1$");

				}

			}
		}
	}
}