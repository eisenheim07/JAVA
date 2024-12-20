package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 5;
		System.out.print("RESULT => " + func(num));
	}

	private static String func(int num) {
		int firstTerm = 0, nextTerm = 1, lastTerm = firstTerm + nextTerm;
		StringBuilder str = new StringBuilder();
		str.append(firstTerm).append(", ").append(nextTerm);
//		System.out.print(firstTerm + ", " + nextTerm);
		for (int i = 0; i < num; i++) {
			nextTerm = firstTerm;
			firstTerm = lastTerm;
			lastTerm = firstTerm + nextTerm;
//			System.out.print(", " + lastTerm);
			str.append(", ").append(lastTerm);
		}
		return str.toString();
	}

}
