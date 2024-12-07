package practice;

public class PrimeNum {

	public static void main(String[] args) {
		int num = 141, count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 1) {
			System.out.print("NOT PRIME NUMBER");
		} else {
			System.out.print("PRIME NUMBER");
		}
	}

}
