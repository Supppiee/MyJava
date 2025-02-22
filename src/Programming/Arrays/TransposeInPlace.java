package Programming.Arrays;

public class TransposeInPlace {

	static void printing(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("original :");
		printing(arr);
		System.out.println(" ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		System.out.println("transpose :");
		printing(arr);

	}
}
