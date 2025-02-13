package Searching_and_sorting;

import java.util.Arrays;

public class practice {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
	}
	
}
