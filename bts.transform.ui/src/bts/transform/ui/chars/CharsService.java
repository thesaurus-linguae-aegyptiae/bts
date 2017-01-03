package bts.transform.ui.chars;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CharsService {

	private static final String PROPERTIES_FILENAME = "D:/AAEW/dev/ws_bts_v04/bts.transform.ui/src/bts/transform/ui/chars/chars.properties";
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
	
	public static String replaceEntities(String originalString, boolean replaceQuotation)
	{
//		return oldReplceString(originalString, replaceQuotation);
		return newReplceString(originalString, replaceQuotation);

		
	}
	public static void main(String[] args)
	{
		String re = null;

		re = "1E6F";// new String((String) PROPERTIES.get(entity));
		Integer i = Integer.parseInt(re, 16);
		
		char[] arr=Character.toChars(i);
		System.out.println(arr);
	}

	private static String newReplceString(String originalString,
			boolean replaceQuotation) {
		if (originalString == null) return null;
//		System.out.println("string before: " + originalString);
		for (Object entity : PROPERTIES.keySet())
		{
//			System.out.println(entity);
			if (entity instanceof String && PROPERTIES.containsKey(entity) && PROPERTIES.get(entity) instanceof String)
			{
				String re2 = "";
				String re =  new String((String) PROPERTIES.get(entity));
				String s = (String)entity;
				if (s.equals("&delVP;"))
				{
					char[] c = new char[3];
					c[0] = Character.toChars(123)[0];
					c[1] = Character.toChars(241)[0];
					c[2] = Character.toChars(125)[0];
					re2 = new String(c);
				}
				else if (re.startsWith("@@@"))
				{
					re = re.substring(15);
					if (re.contains("&"))
					{
						for (String ss : re.split("&"))
						{
							Integer i = Integer.parseInt(ss, 16);
							
							char[] arr=Character.toChars(i);
							re2 += new String(arr);
						}
					}
				}
				else
				{
					 
					
					
					Integer i = Integer.parseInt(re, 16);
					
					char[] arr=Character.toChars(i);
					re2 = new String(arr);
				}


//				System.out.println("replacer: " + s + " with num " + re + " char " + re2);

				originalString = originalString.replaceAll(s, re2);
			}
		}
//		System.out.println("string after: " + originalString);

		// remove <br>
		originalString = originalString.replaceAll("<br>", ", ");
		
		if (originalString.contains(S010))
		{
			originalString = originalString.replaceAll(S010, S010_REPLACE);
		}
		if (originalString.contains(S013))
		{
			originalString = originalString.replaceAll(S013, S013_REPLACE);
		}
		
//		originalString = originalString.replaceAll("i̯", "&");

		if (replaceQuotation)
		{
			originalString = originalString.replaceAll("&quot;", "\"");
			originalString = originalString.replaceAll("&gt;", ""+'\u232A');
			originalString = originalString.replaceAll("&lt;", ""+'\u2329');
			originalString = originalString.replaceAll("&amp;", "&");
			originalString = originalString.replaceAll("&dblLt;", ""+'\u2329'+'\u2329');
			originalString = originalString.replaceAll("&dblGt;", ""+'\u232A'+'\u232A');
			
			originalString = originalString.replaceAll("¿", "⸮");
			
			// remove cartouches
			originalString = originalString.replaceAll("𓉘", "");
			originalString = originalString.replaceAll("𓊂", "");
			
			originalString = originalString.replaceAll("𓊆", "");
			originalString = originalString.replaceAll("𓊆", "");
			
			originalString = originalString.replaceAll("𓍹", "");
			originalString = originalString.replaceAll("𓍺", "");
			
			
			// false vers marker
//			originalString = originalString.replaceAll("&verse;", ""+'\uDB80');
//			originalString = originalString.replaceAll("&versePoint;", ""+'\uDB81');
			originalString = originalString.replaceAll("&delVP;", ""+'\uDB82');
		}	
		
		return originalString;
	}

	private static String oldReplceString(String originalString,
			boolean replaceQuotation) {
		if (originalString == null) return null;
//		System.out.println("string before: " + originalString);
		for (Object entity : PROPERTIES.keySet())
		{
//			System.out.println(entity);
			if (entity instanceof String && PROPERTIES.containsKey(entity) && PROPERTIES.get(entity) instanceof String)
			{
				String re2;
				String re = null;
				String s = (String)entity;
				if (s.equals("&delVP;"))
				{
					char[] c = new char[3];
					c[0] = Character.toChars(123)[0];
					c[1] = Character.toChars(241)[0];
					c[2] = Character.toChars(125)[0];
					re2 = new String(c);
				}
				else
				{
					re = new String((String) PROPERTIES.get(entity));
					re = re.substring(2, re.length() - 1);
					int r = new Integer(re);
					char[] c = Character.toChars(r);
					re2 = new String(c);
				}


//				System.out.println("replacer: " + s + " with num " + re + " char " + re2);

				originalString = originalString.replaceAll(s, re2);
			}
		}
//		System.out.println("string after: " + originalString);

		// remove <br>
		originalString = originalString.replaceAll("<br>", ", ");
		
		if (originalString.contains(S010))
		{
			originalString = originalString.replaceAll(S010, S010_REPLACE);
		}
		if (originalString.contains(S013))
		{
			originalString = originalString.replaceAll(S013, S013_REPLACE);
		}
		if (replaceQuotation && originalString.contains("&quot;"))
		{
			originalString = originalString.replaceAll("&quot;", "\"");
		}
		return originalString;
	}
}
