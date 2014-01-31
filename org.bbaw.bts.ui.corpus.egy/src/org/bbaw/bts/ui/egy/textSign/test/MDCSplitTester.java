package org.bbaw.bts.ui.egy.textSign.test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MDCSplitTester {

	static public final String WITH_DELIMITER = "((?<=%1$s) |(?<=%1$s)  |(?=%2$s) |(?=%3$s))";
	public static void main(String[] args) {
		// final String[] aEach = "a-b:c-<d>-l".split(String.format(
		// WITH_DELIMITER,
		// "-", ":", "<", ">", "*"));
		// for (String s : aEach) {
		// System.out.println(s);
		// }

		String input = ":-E23->";
		if (input.endsWith("-") || input.endsWith(":") || input.endsWith("<")
				|| input.endsWith("*") || input.endsWith(">")) {
			String[] res = input
.split("((?=-))");
			for (String s : res)
				System.out.println("post1: " + s);
		}

		for (String s : splitAndKeep(input, "[-:<>*]", 1))
			System.out.println("post: " + s);
		// Pattern p = Pattern.compile("([^-:<>*])*[-:<>*]");
		// Matcher ms = p.matcher(input);
		// String d =
		// "Los  Angeles 9/31-33 Rose St 7 br h $350,000 J M&C Bunker Hill";
		// for (String s : splitAndKeep(d, " [0-9$]", 1))
		// System.out.println(s);
	}

	/**
	 * Splits a String according to a regex, keeping the splitter at the end of
	 * each substring
	 * 
	 * @param input
	 *            The input String
	 * @param regex
	 *            The regular expression upon which to split the input
	 * @param offset
	 *            Shifts the split point by this number of characters to the
	 *            left: should be equal or less than the splitter length
	 * @return An array of Strings
	 */
	public static String[] splitAndKeep(String input, String regex, int offset) {
		ArrayList<String> res = new ArrayList<String>();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		int pos = 0;
		String last = null;
		int index = 0;
		while (m.find()) {
			String next = input.substring(pos, m.end() - offset);
			if (next.endsWith("-") || next.endsWith(":") || next.endsWith("<")
					|| next.endsWith("*")) {
				continue;
			}
 else if (next.endsWith(">")) {
				last = last + next;
				res.remove(index - 1);
				res.add(index, last);
			} else {
				res.add(next);
				index++;
			}
			System.out.println(next);
			pos = m.end() - offset;
			last = next;
		}
		if (pos < input.length())
 {
			String next = input.substring(pos);
			if (next.endsWith("-") || next.endsWith(":") || next.endsWith("<")
					|| next.endsWith("*") || next.endsWith(">")) {
				last = last + next;
				res.remove(index - 1);
				res.add(index - 1, last);
			} else {
				res.add(next);
			}
		}
		return res.toArray(new String[res.size()]);
	}

	/**
	 * Splits a String according to a regex, keeping the splitter at the end of
	 * each substring
	 * 
	 * @param input
	 *            The input String
	 * @param regex
	 *            The regular expression upon which to split the input
	 * @return An array of Strings
	 */
	public static String[] splitAndKeep(String input, String regex) {
		return splitAndKeep(input, regex, 0);
	}
}
