package Programming.strings;

import java.util.Scanner;

public class SwapCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
	      StringBuilder str = new StringBuilder(sc.nextLine());
	      int ascii = 0;
	      for(int i=0; i<str.length(); i++){
	        char ch = str.charAt(i);
	        ascii = (int)ch;
	        if(ascii >= 97){
	          str.setCharAt(i,(char)(ch - 32));
	        }else{
	          str.setCharAt(i,(char)(ch + 32));
	        }
	      }
	      System.out.print("String with swapped case : "+str);
	  }
}
