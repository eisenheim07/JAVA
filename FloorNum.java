package practice;

public class FloorNum {

	public static void main(String[] args) {
		int num = 25;
		System.out.print("NUM " + func(num));
	}

	private static int func(int num) {
		if (num / 10 == 0) {
			return num;
		} else if (num % 2 == 0) {
			return (num - 2) / 2;
		} else {
			return (int) (num / 2);
		}
	}

}
