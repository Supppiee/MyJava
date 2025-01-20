package Programming.strings;

public class SortTheString {
	public static void main(String[] args) {
		String str = "have a good day";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].length() > arr[j + 1].length()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		String res = String.join(" ", arr);
		System.out.print(res);
	}
}
