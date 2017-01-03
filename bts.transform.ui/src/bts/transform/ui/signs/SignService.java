package bts.transform.ui.signs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SignService {

	private static final String PROPERTIES_FILENAME = "D:/AAEW/dev/ws_bts_v04/bts.transform.ui/src/bts/transform/ui/signs/signs.properties";
	public static Properties PROPERTIES;

	private static final String S013 = "&#013"; // carriage return
	private static final String S013_REPLACE = " ";
	
	private static final String S010 = "&#010";
	private static final String S010_REPLACE = ""; // line feed --> 

	static {
		
		/** Properties laden. */
		PROPERTIES = new Properties();
		File file = new File(PROPERTIES_FILENAME);
		if (!file.exists())
		{
			file = new File(PROPERTIES_FILENAME);
		}
		try
		{
			PROPERTIES.load(new FileInputStream(file));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static String replaceSigns(String originalString)
	{
//		return oldReplceString(originalString, replaceQuotation);
		return newReplaceString(originalString);

		
	}
	public static void main(String[] args)
	{
		String re = null;

		re = "1E6F";// new String((String) PROPERTIES.get(entity));
		Integer i = Integer.parseInt(re, 16);
		
		char[] arr=Character.toChars(i);
		System.out.println(arr);
	}

	private static String newReplaceString(String originalString) {
		if (originalString == null) return null;
//		System.out.println("string before: " + originalString);
		for (Object entity : PROPERTIES.keySet())
		{
//			System.out.println(entity);
			if (entity instanceof String && PROPERTIES.containsKey(entity) && PROPERTIES.get(entity) instanceof String)
			{
				String re =  new String((String) PROPERTIES.get(entity));
				if (re.equals("'\u2E2E'"))
				{
					re = "\""+'\u2E2E' + "\"";
				}
				String s = (String)entity;
				

				originalString = originalString.replaceAll(s, re);
			}
		}
		return originalString;
	}
}
