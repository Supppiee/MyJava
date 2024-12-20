package Searching_and_sorting;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,7,8,9};
		BinarySearch(8, arr);
	}

	private static void BinarySearch(int num, int arr[]) {
		int s = arr[0];
		int e = arr.length-1;
		while(s <= e) {
			int m = (s+e)/2;
			if(num == arr[m]) {
				System.out.println("Index is "+m);
				return;
			}else if(num < arr[m]) {
				e = m - 1;
			}else {
				s = m+1;
			}
		}
		System.out.println("Not Found");
	}
}
//Time complexity = O(logN)
//space complexity = O(1)
