package Programming.numbers;

public class swaping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swapByXOR(a,b);
		swapByTemp(a,b);
		swapByOperator(a,b);
	}

	private static void swapByOperator(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("swapping by operator "+a+" and "+b);
	}

	private static void swapByTemp(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swapping by extra variable "+a+" and "+b);
	}

	private static void swapByXOR(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("swapping without extra variable and operator "+a+" and "+b);	
	}
}
