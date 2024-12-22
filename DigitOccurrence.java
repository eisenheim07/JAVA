/*WAP TO FIND THE OCCURRENCE OF A DIGIT WITHIN A RANGE.*/

package javac;

public class DigitOccurrence {

	public static void main(String[] args) {
		int num = 20;
		int n = 1;
		System.out.print("RESULT => " + func(num, n));
	}

	private static int func(int num, int n) {
		String numbers = "";
		for (int i = 0; i <= 100; i++) {
			numbers = numbers + i;
		}

		int count = 0;
		for (int i = 0; i < numbers.length(); i++) {
			if (numbers.charAt(i) == Character.forDigit(n, 10)) {
				count = count + 1;
			}
		}
		return count;
	}

}
