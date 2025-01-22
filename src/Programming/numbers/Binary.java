package Programming.numbers;

public class Binary {
	public static void main(String[] args) {
		int n = 25;
		toBinary(n);
	}

	static void toBinary(int n) {
		StringBuilder binary = new StringBuilder();
		
		while(n != 0) {
			binary.append(n%2);
			n=n/2;
		}
		System.out.println("binary : "+binary.reverse().toString());
	}
}
