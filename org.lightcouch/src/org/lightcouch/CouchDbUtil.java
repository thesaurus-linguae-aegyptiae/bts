/*
 * Copyright (C) 2011 Ahmed Yehia (ahmed.yehia.m@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.lightcouch;

import static java.lang.String.format;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.http.HttpResponse;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.framework.internal.core.BundleURLConnection;
import org.osgi.framework.Bundle;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Provides various utility methods, for internal use.
 * 
 * @author Ahmed Yehia
 */
final class CouchDbUtil
{

	private CouchDbUtil()
	{
		// Utility class
	}

	public static void assertNotEmpty(Object object, String prefix) throws IllegalArgumentException
	{
		if (object == null)
		{
			throw new IllegalArgumentException(format("%s may not be null.", prefix));
		} else if (object instanceof String && ((String) object).length() == 0)
		{
			throw new IllegalArgumentException(format("%s may not be empty.", prefix));
		}
	}

	public static void assertNull(Object object, String prefix) throws IllegalArgumentException
	{
		if (object != null)
		{
			throw new IllegalArgumentException(format("%s should be null.", prefix));
		}
	}

	public static String generateUUID()
	{
		return UUID.randomUUID().toString().replace("-", "");
	}

	// JSON

	public static <T> T JsonToObject(Gson gson, JsonElement elem, String key, Class<T> classType)
	{
		return gson.fromJson(elem.getAsJsonObject().get(key), classType);
	}

	/**
	 * @return A JSON element as a String, or null if not found.
	 */
	public static String getElement(JsonObject j, String e)
	{
		return (j.get(e) == null) ? null : j.get(e).getAsString();
	}

	public static long getElementAsLong(JsonObject j, String e)
	{
		return (j.get(e) == null) ? 0L : j.get(e).getAsLong();
	}

	public static int getElementAsInt(JsonObject j, String e)
	{
		return (j.get(e) == null) ? 0 : j.get(e).getAsInt();
	}

	// Files

	private static final String LINE_SEP = System.getProperty("line.separator");

	/**
	 * List directory contents for a resource folder. Not recursive. This is
	 * basically a brute-force implementation. Works for regular files and also
	 * JARs.
	 * 
	 * @author Greg Briggs
	 * @param clazz
	 *            Any java class that lives in the same place as the resources
	 *            you want.
	 * @param path
	 *            Should end with "/", but not start with one.
	 * @return Just the name of each member item, not the full paths.
	 */
	public static List<String> listResources(String path)
	{
		URL fileURL = null;
		try
		{
			URL entry = Platform.getBundle("org.lightcouch").getEntry(path);
			File file = null;
			if (entry != null)
			{
			URLConnection connection;
				connection = entry.openConnection();
				fileURL = ((BundleURLConnection) connection).getFileURL();

				URI uri = new URI(fileURL.toString());
				file = new File(uri);
			}
			URL dirURL = file.toPath().toUri().toURL();

			if (dirURL != null && dirURL.getProtocol().equals("file"))
			{
				return Arrays.asList(new File(dirURL.toURI()).list());
			}
			if (dirURL != null && dirURL.getProtocol().equals("jar"))
			{
				String jarPath = dirURL.getPath().substring(5, dirURL.getPath().indexOf("!"));
				JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
				Enumeration<JarEntry> entries = jar.entries();
				Set<String> result = new HashSet<String>();
				while (entries.hasMoreElements())
				{
					String name = entries.nextElement().getName();
					if (name.startsWith(path))
					{
						String entry1 = name.substring(path.length());
						int checkSubdir = entry1.indexOf("/");
						if (checkSubdir >= 0)
						{
							entry1 = entry1.substring(0, checkSubdir);
						}
						if (entry1.length() > 0)
						{
							result.add(entry1);
						}
					}
				}
				return new ArrayList<String>(result);
			}
			return null;
		} catch (Exception e)
		{
			throw new CouchDbException("fileURL: " + fileURL, e);
		}
	}

	public static String readFile(String path)
	{
		InputStream instream = CouchDbUtil.class.getResourceAsStream(path);
		StringBuilder content = new StringBuilder();
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(instream);
			while (scanner.hasNextLine())
			{
				content.append(scanner.nextLine() + LINE_SEP);
			}
		} finally
		{
			scanner.close();
		}
		return content.toString();
	}

	public static String removeExtension(String fileName)
	{
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}

	public static String streamToString(InputStream in)
	{
		Scanner s = new Scanner(in).useDelimiter("\\A");
		String str = s.hasNext() ? s.next() : null;
		close(in);
		return str;
	}

	/**
	 * Closes the response input stream.
	 * 
	 * @param response
	 *            The {@link HttpResponse}
	 */
	public static void close(HttpResponse response)
	{
		try
		{
			close(response.getEntity().getContent());
		} catch (Exception e)
		{
		}
	}

	/**
	 * Closes a resource.
	 * 
	 * @param c
	 *            The {@link Closeable} resource.
	 */
	public static void close(Closeable c)
	{
		try
		{
			c.close();
		} catch (Exception e)
		{
		}
	}
}
