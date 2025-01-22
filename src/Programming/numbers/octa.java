package Programming.numbers;

public class octa {
	public static void main(String[] args) {
		int n = 25;
		toOcta(n);
	}

	private static void toOcta(int n) {
		StringBuilder octa = new StringBuilder();
		while(n != 0) {
			octa.append(n%8);
			n=n/8;
		}
		System.out.println("octa : "+octa.reverse().toString());	
	}
}

