package Programming.strings;

import java.util.HashMap;
import java.util.Map;

public class Occurances {
	
	static void freqArray(String str) {
		int freq[] = new int[128];
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		for(int i=0; i<freq.length; i++) {	
			if(freq[i] > 0) {
				System.out.println(freq[i]+"->"+(char)i);
			}
		}
	}
	
	static void hashMaps(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		String str = "hello";
		freqArray(str);
		hashMaps(str);
	}
}
