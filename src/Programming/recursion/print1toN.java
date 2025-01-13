package Programming.recursion;

public class print1toN {
	
	static void printing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printing(n-1);
	}
	
	public static void main(String[] args) {
		printing(12);
	}
}
