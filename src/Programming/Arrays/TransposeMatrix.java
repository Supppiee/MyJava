package Programming.Arrays;

public class TransposeMatrix {
	static void printing(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6, 8 } };

		//for jagged arrays find the max col size
		int maxColumns = 0;
		for (int[] row : arr) {
			maxColumns = Math.max(maxColumns, row.length);
		}

		//swap rows n col size
		int res[][] = new int[maxColumns][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				res[j][i] = arr[i][j];
			}
		}

		printing(res);
		System.out.println(" ");
		printing(arr);

	}
}
