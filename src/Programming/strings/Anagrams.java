package Programming.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "raec";
		checkAnagram1(s1, s2);
		checkAnagram2(s1, s2);
	}

	private static void checkAnagram2(String s1, String s2) {
		Map<Character, Integer> map1 = new HashMap<>();
	      Map<Character, Integer> map2 = new HashMap<>();
	      if(s1.length() == s2.length()){
	        for(int i=0; i<s1.length(); i++){
	          map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
	          map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
	        }
	      }
	      System.out.println((map1.equals(map2))?"Anagram":"Not Anagram");
	}

	static void checkAnagram1(String s1, String s2) {
		if (s1.length() == s2.length()) {

			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			boolean flag = Arrays.equals(c1, c2);
			System.out.println((flag) ? "Anagrams" : "Not Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}
}
