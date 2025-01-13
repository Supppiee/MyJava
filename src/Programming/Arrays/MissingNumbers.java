package Programming.Arrays;

public class MissingNumbers {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
		int n = arr[arr.length - 1];
		int total_sum = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(total_sum - sum);
	}
}
