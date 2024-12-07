package practice;

import java.util.regex.Pattern;

public class CountString {

	public static void main(String[] args) {
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		String regex = "^[ab]+$";
		System.out.print("RESULT => " + func(words, regex));
	}

	private static String func(String[] words, String regex) {
		String result = "";
		for (String word : words) {
			result = result + " " + Pattern.matches(regex, word);
		}
		return result;
	}

}
