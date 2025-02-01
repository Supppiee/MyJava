package Programming.strings;

public class ReverseString {
	
	static void reverseCharArray(String str) {
		char[] arr = str.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] =temp;
			i++;
			j--;
		}
		System.out.println(new String(arr));
	}
	
	static void reverseByString(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
	
	static void revByStringbuilder(String str) {
		StringBuilder s = new StringBuilder(str);
		System.out.println(s.reverse());
	}
	
	static void revByStringbuff(String str) {
		StringBuffer s = new StringBuffer(str);
		System.out.println(s.reverse());
	}
	
	
	public static void main(String[] args) {
		String str = "heyyaaa";
		reverseCharArray(str);
		reverseByString(str);
		revByStringbuilder(str);
		revByStringbuff(str);
	}

}
