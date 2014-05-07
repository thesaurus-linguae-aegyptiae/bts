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
				url = new URL("http://www.bbaw.de");
			}
			URLConnection connection = url.openConnection();

			return true;
		} catch (IOException e)
		{
			return false;
		}
	}

}
