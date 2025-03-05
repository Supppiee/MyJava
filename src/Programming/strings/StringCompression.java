package Programming.strings;

public class StringCompression {
	public static void main(String[] args) {
		String str = "aabbbccddd";
		String res = "";
		int count = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				res += str.charAt(i) + String.valueOf(count);
				count = 1;
			}
		}
		res += str.charAt(str.length()-1)+String.valueOf(count);
		System.out.println(res);
	}
}
