package Programming.Arrays;

import java.util.HashMap;
import java.util.Map;

public class frequencyArray2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,7,2,5,6,7,7,8};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i]))+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		int max = -1;
		int maxElement = -1;
		for(int key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				maxElement = key;
			}
		}
		System.out.println("Max Count:"+max);
		System.out.println("Max Element :"+maxElement);
	}
	
}

