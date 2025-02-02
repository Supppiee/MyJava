package Programming.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class removeDups1 {

	static void usingSet(int arr[]) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

	static void usingArray(int[] arr) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				a.add(arr[i]);
			}
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9 };
		usingSet(arr);
		usingArray(arr);
	}
}
