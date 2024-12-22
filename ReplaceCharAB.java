/*Wap to replace character from a given string.*/

package javac;

public class ReplaceCharAB {

	public static void main(String args[]) {
		String str = "abaaabbcc";
		System.out.print("RESULT => " + func(str));
	}

	private static String func(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				arr[i] = 'b';
			} else if (arr[i] == 'b') {
				arr[i] = 'a';
			}
		}
		return new String(arr);
	}

}
