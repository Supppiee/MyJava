package Programming.strings;

import java.util.Arrays;

public class SortStrings {
	public static void main(String[] args) {
		String strr = "hello good morning";
		String arr[] = strr.split(" ");
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1].compareTo(arr[i]) > 0) {
				String temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		String str = String.join(" ", arr);
		System.out.println(str);
	}
}
