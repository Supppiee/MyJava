package Programming.Arrays;

import java.util.Arrays;

public class Merge2SortedArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 5, 9 };
		int arr2[] = { 3, 4, 5, 6, 8 };
		int merged[] = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				merged[k++] = arr2[j++];
			} else {
				merged[k++] = arr1[i++];
			}
		}
		while (i > arr1.length) {
			merged[k++] = arr2[j++];
		}
		while (j > arr2.length) {
			merged[k++] = arr1[i++];
		}
		System.out.print(Arrays.toString(merged));
	}
}
