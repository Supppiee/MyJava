package Programming.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
	
	static void longestSubstring(String str) {
		int maxLength = 0;
		int start = 0;
		int end = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		while(end < str.length()) {
			char ch = str.charAt(end);
			
			if(map.containsKey(ch)) {
				start = Math.max(start, map.get(ch)+1);
			}
			map.put(ch, end);
			maxLength = Math.max(end-start+1, maxLength);
			end++;
			
		}
		System.out.println(maxLength);
	}
	
	public static void main(String[] args) {
		String str = "abbcadd";
		longestSubstring(str);
	}
}
