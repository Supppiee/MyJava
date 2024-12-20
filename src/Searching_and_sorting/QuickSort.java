package Searching_and_sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 5, 10, 7, 6, 9 };
			quick(arr, 0, arr.length-1);
			System.out.println(Arrays.toString(arr));
	}

	private static void quick(int[] arr, int low, int high) {
		if(low < high) {
			int pindex = partition(arr, low, high);
			quick(arr, low, pindex-1);
			quick(arr, pindex+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low -1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high]= temp;
		return i;
	}
}
