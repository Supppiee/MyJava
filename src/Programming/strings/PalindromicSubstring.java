package Programming.strings;

import java.util.Scanner;

public class PalindromicSubstring {
	
	static boolean isPlaindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int count = 0;
		
		System.out.print("Substrings : ");
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				System.out.print(str.substring(i,j)+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count : "+count);
		
	}
}
