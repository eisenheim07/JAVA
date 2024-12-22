/*WAP TO FIND ALL THE UNIQUE OF AN STRING[].*/

package javac;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arInt[] = { 4, 4, 9, 9, 1, 1, 0 };
		String arString = "hello world";
		System.out.println("RESULT => " + funcInt(arInt));
		System.out.println("RESULT => " + funcStr(arString));
	}

	private static ArrayList<Integer> funcInt(int ar[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			if (!list.contains(ar[i])) {
				for (int j = (i + 1); j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						list.add(ar[i]);
						break;
					}
				}
			}
			if (!list.contains(ar[i])) {
				list.add(ar[i]);
			}
		}
		Collections.sort(list);
		return list;
	}

	private static ArrayList<String> funcStr(String ar) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < ar.length(); i++) {
			if (!list.contains(String.valueOf(ar.charAt(i)))) {
				for (int j = (i + 1); j < ar.length(); j++) {
					if (ar.charAt(i) == ar.charAt(j)) {
						list.add(String.valueOf(ar.charAt(i)));
						break;
					}
				}
			}
			if (!list.contains(String.valueOf(ar.charAt(i)))) {
				list.add(String.valueOf(ar.charAt(i)));
			}
		}
		list.remove(" ");
		Collections.sort(list);
		return list;
	}

}
