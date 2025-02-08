package Programming.recursion;

public class PermutationStrings {
	static int count = 0;
	public static void main(String[] args) {
		String str = "ABC";
		findPerms(str, "");
		System.out.println(count);`-
	}

	private static void findPerms(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			findPerms(remaining, ans + ch);
		}
	}
}
