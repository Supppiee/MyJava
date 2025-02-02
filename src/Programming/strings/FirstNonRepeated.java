package Programming.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeated {

	static void usingFreq(String str) {
		int freq[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1) {
				System.out.println((char) i);
				break;
			}
		}
	}

	static void usingCollections(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		for(Entry<Character,Integer> entrySet: map.entrySet()) {
			if(entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "aabcdbe";
		usingFreq(str);
		usingCollections(str);
	}
}
