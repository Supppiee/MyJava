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

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 1;
		rotate2(arr, k);
		
	}
}

