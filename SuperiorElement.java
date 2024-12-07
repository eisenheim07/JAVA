package practice;

public class SuperiorElement {

	public static void main(String[] args) {
		int arr[] = { 8, 10, 6, 2, 9, 7 };
		System.out.print("COUNT " + func(arr));
	}

	private static int func(int[] arr) {
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = (i + 1); j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					count = count + 1;
					break;
				}
			}
		}
		return count;
	}

}
