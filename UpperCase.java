/*WAP TO CONVERT ALL THE FIRST CHARACTER OF A STRING INTO UPPERCASE.*/

package javac;

public class UpperCase {

	public static void main(String[] args) {
		String str = "Here comes the garden";
		System.out.print("result => " + func(str));
	}

	private static String func(String str) {
		String[] strArr = str.split(" ");
		String result = "";
		for (int i = 1; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length(); j++) {
				if (strArr[i].charAt(j) == strArr[i].charAt(0)) {
					result = result + String.valueOf(strArr[i].charAt(0)).toUpperCase();
				} else {
					result = result + String.valueOf(strArr[i].charAt(j));
				}
			}
		}
		return strArr[0] + result;
	}

}
