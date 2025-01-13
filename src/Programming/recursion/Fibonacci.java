package Programming.recursion;

public class Fibonacci {
	static int pringing(int n) {
		if(n <= 1) {
			return n;
		}
		return pringing(n-1) + pringing(n-2);
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(pringing(i));
		}
	}
}
