/*WAP TO FIND THE PERMUTATIONS FOR A GIVEN STRING.*/

package practice;

import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "ppllmmmmtt";
		System.out.println("FINAL RESULT => " + func(str));
	}

	private static int func(String str) {
		int count = 0;
		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;
				}
			}
			map.put(str.charAt(i), count);
			count = 0;
		}
		System.out.println("MAP => " + map);
		System.out.println();

		int factorial = 1;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			factorial = factorial * factorial(entry.getKey(), entry.getValue());
		}
		System.out.println("TOTAL FACTORIAL => " + factorial);
		System.out.println();
		int fact = factorial(' ', str.length());
		System.out.println();
		return fact / factorial;
	}

	private static int factorial(Character key, int fact) {
		int factorial = 1;
		for (int i = 1; i <= fact; i++) {
			factorial = factorial * i;
		}

		if (key == ' ') {
			System.out.println("FACTORIAL OF " + fact + " => " + factorial);
		} else {
			System.out.println("FACTORIAL OF " + key + ", " + fact + " => " + factorial);
		}

		return factorial;
	}

}
