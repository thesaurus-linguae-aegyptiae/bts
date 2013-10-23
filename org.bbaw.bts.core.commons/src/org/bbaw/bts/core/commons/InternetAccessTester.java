package org.bbaw.bts.core.commons;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class InternetAccessTester
{

	public static boolean accessToURLExists(URL url)
	{

		try
		{
			if (url == null)
			{
				url = new URL("http://www.google.com");
			}
			URLConnection connection = url.openConnection();

			if (connection.getContentLength() == -1)
			{
				return false;
			}
		} catch (IOException e)
		{
			return false;
		}
		return true;
	}

}
