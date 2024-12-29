/*WAP TO FIND THE VALID PARENTHESES IN AN EXPRESSION.*/

package javac;

import java.util.Stack;

public class CloseBracket {

    public static void main(String[] args) {
        String brackets = "[]{}()"; //VALID SEQUENCE
//        String brackets = "[}";    //INVALID SEQUENCE
        System.out.print("STATUS => " + func(brackets));
        System.out.println();
        System.out.print("STATUS => " + validateBrackets(brackets));
    }

    public static boolean validateBrackets(String brackets) {
        if (brackets.length() % 2 != 0) {
            return false;
        }
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '}') {
                if (characters.peek() == '{') {
                    characters.pop();
                } else {
                    return false;
                }
            } else if (brackets.charAt(i) == ')') {
                if (characters.peek() == '(') {
                    characters.pop();
                } else {
                    return false;
                }
            } else if (brackets.charAt(i) == ']') {
                if (characters.peek() == '[') {
                    characters.pop();
                } else {
                    return false;
                }
            } else {
                characters.add(brackets.charAt(i));
            }
//            System.out.println(characters);
        }
        return true;
    }

    private static boolean func(String brackets) {
        if (brackets.isEmpty()) {
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
