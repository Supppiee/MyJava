package Programming.strings;

public class reverseWords {
	
	static void reverseWords(String str) {
		String arr[] = str.split(" ");
		for(int i=0 ;i<arr.length; i++) {
			arr[i] = reverse(arr[i]);
		}
		String res = String.join(" ", arr);
		System.out.println(res);
		
	}
	
	private static String reverse(String str) {
		 String rev = "";
		 for(int i=str.length()-1; i>=0; i--) {
			 rev += str.charAt(i);
		 }
		return rev;
	}

	public static void main(String[] args) {
		String str = "hello java"; // olleh avaj
		reverseWords(str);
	}

}
