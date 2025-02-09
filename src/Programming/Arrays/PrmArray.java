package Programming.Arrays;

import java.util.Arrays;

public class PrmArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		prem(arr, 0);
	}

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void prem(int arr[], int cid) {

		if (cid == arr.length - 1) {
			System.out.println(Arrays.toString(arr));
			return;
		}

		for (int i = cid; i < arr.length; i++) {
			swap(arr, i, cid);
			prem(arr, cid + 1);
			swap(arr, i, cid);
		}
	}
}
