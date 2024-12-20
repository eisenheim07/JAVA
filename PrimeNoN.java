/*WAP TO PRINT PRIME NUMBERS UPTO Nth RANGE.*/

package practice;

public class PrimeNoN {

	public static void main(String[] args) {	
		int num = 100;
		System.err.println("RESULT => " + func(num));
	}

	private static String func(int num) {
		int count = 0;
		String str = "";
		for (int i = 10; i <= num; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count = 1;
					break;
				}
			}
			if (count == 1) {
				count = 0;
			} else {
				if (str.isEmpty()) {
					str = str + i;
				}else {
					str = str + ", " + i;
				}

//				System.out.println("0" + " " + i);
			}
		}
		return str;
	}

}
