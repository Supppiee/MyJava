package Programming.Arrays;

import java.util.Arrays;

public class RotateArray {
	
	static void rotate1(int arr[], int k) {
		k = k % arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				System.out.print(arr[arr.length + i - k] + " ");
			} else {
				System.out.print(arr[i - k] + " ");
			}
		}
	}
	static void rotate2(int arr[] , int k) {
		int res[] = new int[arr.length];
		int j = 0;
		k = k%arr.length;
		int n = arr.length;
		for(int i = n-k; i<=n-1; i++) {
			res[j++] = arr[i];
		}
		for(int i=0 ;i <= n-k-1; i++) {
			res[j++] = arr[i];
		}
		System.out.println(Arrays.toString(res));
	}
	

	static void rev(int arr[] ,int start, int end) {
		int n = start+end;
		for(int i=start; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-i];
			arr[n-i] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7};
		int k = 5;
		int n = arr.length;
		//rotate2(arr, k);
		rev(arr, n-k ,n-1);
		rev(arr, 0 , n-k-1);
		rev(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

