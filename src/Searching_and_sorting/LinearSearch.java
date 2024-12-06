package Searching_and_sorting;

public class LinearSearch {
	public static int search(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,3,2,5,6,4,7,9,6};
		int target = 9;
		System.out.println(search(arr, target));
	}
}
