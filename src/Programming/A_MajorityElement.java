package Programming;

public class A_MajorityElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 2, 3, 1 };
		int major = arr[0];
		int c = 1;
		for (int i = 1; i < arr.length; i++) {// start the loop with 1
			if (c == 0) {
				c++;
				major = arr[i];
			} else if (major == arr[i]) {
				c++;
			} else
				c--;
		}
		System.out.println(major);
	}
}
