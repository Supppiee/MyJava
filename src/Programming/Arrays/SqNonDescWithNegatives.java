package Programming.Arrays;

import java.util.Arrays;
//2 pointer
public class SqNonDescWithNegatives {
	public static void main(String[] args) {
		int arr[] = { -10, -3, -1, 2, 4, 5 };
		int res[] = new int[arr.length];
		int i = 0;
		int j = arr.length - 1;
		int k = 0;
		while (i <= j) {
			if (Math.abs(arr[i]) > arr[j]) {
				res[k++] = arr[i] * arr[i];
				i++;
				
			} else if (Math.abs(arr[i]) < arr[j]) {
				res[k++] = arr[j] * arr[j];
				j--;
				
			}
		}
		System.out.print(Arrays.toString(res));
	}
}
