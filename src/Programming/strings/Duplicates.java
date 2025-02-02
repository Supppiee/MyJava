package Programming.strings;

import java.util.Set;
import java.util.TreeSet;

public class Duplicates {

	static void removeSet(String str) {
		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		StringBuilder s = new StringBuilder();
		for (char c : set) {
			s.append(c);
		}
		System.out.println("Set : " + s); //agimnopr
	}

	static void removeUsingStringbuilder(String str) {
		StringBuilder s = new StringBuilder();
		str.chars().distinct().forEach(c -> s.append((char)c));
		System.out.println("stringbuilder : " +s); //progamin
	}
	
	static void removeUsingIndexOf(String str) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			int index = str.indexOf(str.charAt(i), i+1);
			if(index == -1) {
				s.append(str.charAt(i));
			}
		}
		System.out.println("indexOf : "+s);
	}
	
	
	static void removeUsingCharArray(String str) {
		StringBuilder s = new StringBuilder();
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			boolean repeated = false;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				s.append(arr[i]);
			}
		}
		System.out.println("char[] : "+s);
	}
	
	public static void main(String[] args) {
		String str = "programming";
		removeSet(str);
		removeUsingStringbuilder(str);
		removeUsingIndexOf(str);
		removeUsingCharArray(str);
	}
}
