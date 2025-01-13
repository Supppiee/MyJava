package Programming.Arrays;

import java.util.Arrays;

public class Count0and1s {

	static void count(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			}
		}
		int countos = arr.length - count;
		for (int i = 0; i < arr.length; i++) {
			if (i < countos) {
				arr[i] = 0;
			} else
				arr[i] = 1;
		}
		System.out.print(Arrays.toString(arr));
	}

	static void count2(int arr[]) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] == 0) {
				i++;

			} else if (arr[j] == 1) {
				j--;
			} else if (arr[i] == 1 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 1, 0, 1 };
		count(arr);
		count2(arr);
	}
}
