package bts.transform.ui.chars;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;


public class CodepointTester {
	
	private static CharsetDecoder charsetDecoder;

	public static void main(String[] args)
	{
		String s = "§šd.pl mj n pꜣy Ḥr,w šrj ḥn =f snb n mw,t =f§";
		
		charsetDecoder = Charset.forName("UTF-8").newDecoder();
		byte[] b = s.getBytes(Charset.forName("UTF-8"));
		System.out.println(b);
	    ByteBuffer in = ByteBuffer.wrap(b);
	    CharBuffer out;
	    String codes = "";
		try {
			out = charsetDecoder.decode(in);
		    System.out.println(out.array());
			for (int i = 0; i < out.array().length; i++)
		    {
				String str = Integer.toHexString(out.array()[i]).toUpperCase();
				System.out.println(str + " c:" + out.array()[i]);
				if ("".equals(str) || "0".equals(str))
				{
//					System.out.println(str + " c:" + out.array()[i]);
				}
				if ("20".equals(str)) 
				{
//					System.out.println(str + " c:" + out.array()[i]);

					continue; // whitespace
				}

				switch (str.length())
				{
				case 1 : str = "000" +str;
				break;
				case 2 : str = "00" +str;
				break;
				case 3 : str = "0" +str;
				break;
				default: str = str.substring(0, 4);
				}
				codes += "U+" + str + " ";
		    }
		} catch (CharacterCodingException e) {
			e.printStackTrace();
		}
		System.out.println(codes);

	}

}
