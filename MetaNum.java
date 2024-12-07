/*WAP TO FIND META NUMBER.*/

package practice;

public class MetaNum {

	public static void main(String[] args) {
		int num = 40;
		System.out.print("MetaNumber => " + func(num));
	}

	private static String func(int num) {
		String str = "";
		for (int i = 2; i <= num; i++) {
			if (i % 2 == 0 && i % 4 == 0 && i % 8 == 0 && i % 10 != 0) {
				if (str.equals("")) {
					str = String.valueOf(i);
				} else {
					str = str + ", " + i;
				}
			}
		}
		return str;
	}

}
