package Searching_and_sorting;

import java.util.Arrays;

public class bubble {
	public static void main(String[] args) {
		int arr[] = {1,4,3,2,5,6,3,4,7,8,5,4};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr)); 
	}
}

//space complexity O(1)
//time complexity O(n-sqr)
//good with less data
