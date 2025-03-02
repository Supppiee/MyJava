package Programming.Arrays;

import java.util.Arrays;

public class ZerosToEnd {
	
	//optimised
	static void moveZeros1(int arr[]) {
		int idx = 0;
		for (int nums : arr) {
			if (nums != 0) {
				arr[idx++] = nums;
			}
		}
		while (idx < arr.length) {
			arr[idx++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//brute
	static void moveZeros2(int arr[]) {
		int temp[] = new int[arr.length];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 8, 0 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Modified--->");
		moveZeros1(arr);
		moveZeros2(arr);
	}
}
