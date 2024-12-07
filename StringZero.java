/*WAP TO GET ALL THE ZEROES AT THE STARTING AND RETURN THE STRING.*/

package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringZero {

	public static void main(String[] args) {	
		String str = "03020400121200";
		System.out.print("RESULT => " + func(str));
	}

	private static String func(String str) {
		int count = 0;
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				list.add(count, str.charAt(i));
				count = count + 1;
			} else {
				list.add(str.charAt(i));
			}
		}
		return Arrays.toString(list.toArray());
	}

}