package Searching_and_sorting;

import java.util.Arrays;

public class selection {
	public static void main(String[] args) {
		int arr[] = {1,4,2,4,5,3,5,6,8,6};
		int min = -1;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*
Algorithm Steps
1.Start with the first element as the current minimum.
2.Compare it with all other elements in the unsorted portion of the array.
3.Swap the smallest element found with the first element of the unsorted portion.
4.Move the boundary of the sorted portion one step to the right.
5.Repeat until the entire array is sorted.

Not efficient for larger datasets
space complexity - O(1)
time complexity - O(n sqr)
*/