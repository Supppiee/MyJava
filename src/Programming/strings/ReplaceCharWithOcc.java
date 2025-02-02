package Programming.strings;

public class ReplaceCharWithOcc {
	
	static void result(String str, char target) {
		if(str.indexOf(target) == -1){
			System.err.println("Invalid Target");
			System.exit(0);
		}
		char[] arr = str.toCharArray();
		StringBuilder s = new StringBuilder();
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				arr[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		for(char c : arr) {
			s.append(c);
		}
		System.out.println(s);
	}
	
	
	//Preference : high
	static void directlyInString(String str, char target) {
		int count = 1;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == target) {
				str = str.replaceFirst(String.valueOf(target), String.valueOf(count++));
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String str = "javaajkvv";
		char target = 'v';
		result(str, target);
		directlyInString(str, target);
	}
}


/*
 * String.valueOf(count).charAt(0); 
 * 
 * if count is 1 for example
 * first the value of count is converted to string -> "1" (String.valueOf(count))
 * .charAt(0) gives the first char of the string that is 1, converting it to the character.
 * */
