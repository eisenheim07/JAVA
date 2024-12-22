/*WAP TO FIND WHETHER THE STRING IS ANAGRAM OR NOT.*/

package javac;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {

	public static void main(String[] args) {
		String str1 = "sadder";
		String str2 = "dreads";
		System.out.println("String 1 Occurrences => " + func(str1));
		System.out.println("String 2 Occurrences => " + func(str2));
		System.out.println("Result => " + (func(str1).toString().equals(func(str2).toString())));
		System.out.println("Result => " + func(str1).equals(func(str2)));
	}

	private static Map<Character, Integer> func(String str) {
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
				}
			}
			map.put(str.charAt(i), count);
			count = 0;
		}
		return map;
	}
}
