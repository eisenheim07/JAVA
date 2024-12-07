package practice;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "aabbc";
		System.out.print("RESULT => " + func(str));
	}

	private static String func(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains("" + str.charAt(i))) {
				for (int j = (i + 1); j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						result = result + str.charAt(i);
						break;
					}
				}
			}
		}
		return result;
	}

}
