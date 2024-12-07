package practice;

public class CloseBracket {

	public static void main(String args[]) {
		String brackets = "[}";
		System.out.print("STATUS " + func(brackets));
	}

	private static boolean func(String brackets) {
		if (brackets.length() == 0) {
			return false;
		} else if (brackets.length() % 2 != 0) {
			return false;
		} else {
			for (int i = 0; i <= brackets.length(); i++) {
				if (i % 2 == 1) {
					if (brackets.charAt(i) == '[' || brackets.charAt(i) == '{' || brackets.charAt(i) == '(') {
						return false;
					} else if (brackets.charAt(i) == '}') {
						if (brackets.charAt(i - 1) != '{') {
							return false;
						}
					} else if (brackets.charAt(i) == ']') {
						if (brackets.charAt(i - 1) != '[') {
							return false;
						}
					} else if (brackets.charAt(i) == ')') {
						if (brackets.charAt(i - 1) != '(') {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

}
