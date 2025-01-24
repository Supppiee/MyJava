package Programming.numbers;

public class Factorial {
	
	static int factooo(int n) {
		if(n == 1) {
			return 1;
		}
		return factooo(n-1) * n;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.println(fact);
		System.out.println(factooo(n));
	}
}
