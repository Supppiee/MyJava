package Searching_and_sorting;

import java.util.Arrays;

public class MergeSort {
	
	// diving the arr into multiple parts
	public static void divide(int arr[], int si, int ei) {
		
		if(si >= ei) {
			return;
		}
		int mid = si + (ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conqure(arr, si, mid, ei);
	}
	
	//again sorting the array to an dup arr n then copying it back to the original array
	private static void conqure(int[] arr, int si, int mid, int ei) {
		//taking a new array named merged[]
		int merged[] = new int[ei - si + 1];
		//again defining si as index1 and mid+1 as index2
		int index1 = si;
		int index2 = mid+1;
		//x is for the merged index;
		int x = 0;
		
		//logic
		while(index1 <= mid && index2 <= ei) {
			if(arr[index1] <= arr[index2]) {
				merged[x++] = arr[index1++];
			}else {
				merged[x++] = arr[index2++];
			}
		}
		
		//if any array is longer than expected, then that part is solved, to handle it we write 2 pther while loops
		while(index1 <= mid) {
			merged[x++] = arr[index1++];
		}
		while(index2 <= ei) {
			merged[x++] = arr[index2++];
		}
		
		//Copying the merged array to the original array
		for(int i=0, j=si; i<merged.length; i++, j++) {
			arr[j] = merged[i];
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {3,2,5,4,6,5,7,6,8};
		divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
