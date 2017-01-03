package bts.transform.ui.thsMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ThsMappingService {

	private static final String PROPERTIES_FILENAME = "D:/AAEW/dev/ws_bts_v04/bts.transform.ui/src/bts/transform/ui/thsMapping/thsMapping.properties";
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
	
	public static String[] replaceSigns(String originalString)
	{
		return newReplaceString(originalString);

		
	}
	
	public static void main(String[] args) {
		ThsMappingService m = new ThsMappingService();
		System.out.println(PROPERTIES);
	}

	private static String[] newReplaceString(String originalString) {
		if (originalString == null) return null;
		if (PROPERTIES.containsKey(originalString))
		{
			String result = PROPERTIES.getProperty(originalString);
			if (result.contains("##"))
			{
				result = result.split("##")[0];
				result = result.trim();
			}
			if (result != null)
			{
				return result.split(";");
			}
		}
		return new String[]{originalString};
	}
}
