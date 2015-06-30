package bts.transform.ui.chars;

import java.util.Properties;

public class CharTester {

	public static void main(String[] args) {
		Properties p = CharsService.PROPERTIES;
		
		for (Object entity : p.keySet())
		{
//			System.out.println(entity);
			if (entity instanceof String && p.containsKey(entity) && p.get(entity) instanceof String)
			{
				String re2 = "";
				String re =  new String((String) p.get(entity));
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

				System.out.println("original: " + s + " replacement: " + re + " combined: " + re2);
			}
		}

	}

}
