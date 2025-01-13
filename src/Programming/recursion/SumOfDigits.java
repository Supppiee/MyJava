package Programming.recursion;

public class SumOfDigits {
	static int printing(int n) {
		if (n >= 0 && n < 10) {
			return n;
		}
		return printing(n / 10) + n % 10;
	}

	public static void main(String[] args) {
		System.out.println(printing(123));
	}
}
