package Programming.Arrays;

import java.util.Set;
import java.util.TreeSet;

public class removeDups1 {
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,5,5,6,7,8,8,9};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}
