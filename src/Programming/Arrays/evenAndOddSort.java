package Programming.Arrays;

import java.util.Arrays;

public class evenAndOddSort {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] % 2 == 0) {
				i++;
			} else if (arr[j] % 2 == 1) {
				j--;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
