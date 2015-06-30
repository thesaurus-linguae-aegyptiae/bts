package bts.transform.ui.chars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LemmatizerTester {
public static final String LEMMATIZER_DOUBLE_POINT_PATTERN = "(.+:)(.+)";
	
	public static final String LEMMATIZER_POINT_PATTERN = "([^\\.]+)(.+)";
	
	public static final String LEMMATIZER_TRIPLE_POINT = new String(new char[]{'\u22ee'});

	public static final String LEMMATIZER_TRIPLE_EQUALS = new String(new char[]{'\u2261'});
	
	public static final String[] LEMMATIZER_BRACKETS_PATTERN = new String[]{"\\(", "\\)", "\\{", "\\}", "\\[", "\\]", "<", ">",
		new String(new char[]{'\u2261'}), "\\?",
		"⸢", "⸣",
		"𓉘", "𓊂",
		"𓊆", "𓊇",
		"𓍹", "𓍺"};
private final static Pattern doublePointPattern = Pattern.compile(LEMMATIZER_DOUBLE_POINT_PATTERN);
	
	private final static Pattern pointPattern = Pattern.compile(LEMMATIZER_POINT_PATTERN);
	public static void main(String[] args) {
		String[] tests = new String[]{"sni̯.n", "(S)n⋮m", "S{{n⋮m}}.mn", "Sn⋮m,mn", "Sn:⸢t⸣m.mn", "Sn⋮m≡mn"};
		for (String s : tests)
		{
			System.out.println(s + "=" + processWordChars(s));
		}
	}

	private static String processWordChars(String string) {
		String chars = string;
		
		// remove brackets
		
		// cut left side
		Matcher m = doublePointPattern.matcher(chars);
		if (m.find())
		{
			chars = m.group(2); 
		}
		// cut right side
		if (chars.contains("."))
		{
		m = pointPattern.matcher(chars);
		if (m.find())
		{
			chars = m.group(1); 
		}
		}
		// replace
		chars = chars.replaceAll(LEMMATIZER_TRIPLE_POINT, ":");
		
		chars = chars.replaceAll(",", ".");
		
		chars = chars.replaceAll(LEMMATIZER_TRIPLE_EQUALS, "=");
		
		for (String b : LEMMATIZER_BRACKETS_PATTERN)
		{
			chars = chars.replaceAll(b, "");
		}
		return chars;
	}
}
