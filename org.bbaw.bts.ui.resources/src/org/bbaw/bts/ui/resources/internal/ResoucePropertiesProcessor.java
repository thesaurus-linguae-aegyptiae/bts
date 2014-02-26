package org.bbaw.bts.ui.resources.internal;

import java.io.File;

public class ResoucePropertiesProcessor {

	public static File folder = new File(
			"E:/GIT/aaew/bts-git/aaew-bts/org.bbaw.bts.ui.resources/icons/full/obj16");
	static String temp = "";
	private static String interfix = "/icons/full/obj16/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading files under the folder "
				+ folder.getAbsolutePath());
		listFilesForFolder(folder);
	}

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