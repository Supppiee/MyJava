package Searching_and_sorting;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		int arr[] = {1,4,3,2,5,3,9,6,7,5,7};
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key; 
		}
		System.out.println(Arrays.toString(arr));
	}
}

/*
Algorithm Steps
1.Start with the second element (assuming the first is already sorted).
2.Compare it with elements in the sorted portion.
3.Shift larger elements one position to the right.
4.Insert the current element into its correct position.
5.Repeat for all elements in the unsorted portion.

time complexity - O(n sqr)
space complexity - O(1)
 */