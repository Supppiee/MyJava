package Programming.Arrays;

public class arrays2Dsum {
	static void printing(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

		int sum[][] = new int[3][3];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				sum[i][j] = arr[i][j] + arr2[i][j];
			}
		}

		printing(sum);

	}
}
