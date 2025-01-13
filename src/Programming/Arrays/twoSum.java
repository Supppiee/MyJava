package Programming.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
	static void twoSum3(int arr[], int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i:arr) {
			int sum = target - arr[i];
			if(sum > 0) {
				if(!map.containsKey(sum)) {
					map.put(sum, arr[i]);
				}
			}
			
		}
		System.out.println(map);
	}
	
	static void twoSum2(int arr[], int target) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		if(arr[i] + arr[j] > target) {
			j--;
		}else {
			i++;
		}
		System.out.println(arr[i] +" " +arr[j]);
	}
	
	static void twoSum1(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,3,2,6,5,7,3,9};
		int target = 8;
		twoSum3(arr, target);
	}
}
