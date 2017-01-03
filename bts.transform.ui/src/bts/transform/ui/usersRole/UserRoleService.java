package bts.transform.ui.usersRole;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class UserRoleService {

	private static final String PROPERTIES_FILENAME = "D:/AAEW/dev/ws_bts_v04/bts.transform.ui/src/bts/transform/ui/usersRole/roles.properties";
	public static Properties PROPERTIES;


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
		
		return originalString;
	}
	public static String[] findUsers(String name) {
		name = processName(name);
		if (PROPERTIES.containsKey(name))
		{
			String names = PROPERTIES.getProperty(name);
			if (names == null) return new String[]{};
			String researchers = names.split(";")[1];
			return researchers.split(",");
		}
		return new String[]{};
	}
	public static boolean isGuests(String name) {
		name = processName(name);
		if (PROPERTIES.containsKey(name))
		{
			String props = PROPERTIES.getProperty(name);
			if (props == null) return false;
			String guests = props.split(";")[1];
			return guests.equals("guests=true");
		}
		return true;
	}
	
	public static String getVisibility(String name) {
		name = processName(name);
		if (PROPERTIES.containsKey(name))
		{
			String props = PROPERTIES.getProperty(name);
			if (props == null) return "public";
			String guests = props.split(";")[2];
			return guests;
		}
		return "public";
	}
	public static String[] findTranscribers(String name) {
		name = processName(name);
		if (PROPERTIES.containsKey(name))
		{
			String names = PROPERTIES.getProperty(name);
			if (names == null) return new String[]{};
			String researchers = names.split(";")[3];
			return researchers.split(",");
		}
		return new String[]{};
	}
	
	
	
	public static String reviewState(String name) {
		name = processName(name);
		if (PROPERTIES.containsKey(name))
		{
			String props = PROPERTIES.getProperty(name);
			if (props == null) return "inProgress";
			String prop = props.split(";")[4];
			return prop;
		}
		 return "inProgress";
	}
	
	private static String processName(String name) {
		String [] splits = name.split("/");
		String processed = splits[splits.length -1];
		return processed;
	}
	public static String getMainUser(String name) {
		name = processName(name);
		if (PROPERTIES.containsKey(name))
		{
			String props = PROPERTIES.getProperty(name);
			if (props == null) return "0";
			String prop = props.split(";")[5];
			return prop;
		}
		 return "0";
	}
}
