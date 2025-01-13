package Programming.recursion;

public class printNto1 {
		
	static void printing(int n) {
		if(n == 0) {
			return;
		}
		printing(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		printing(12);
	}
}
