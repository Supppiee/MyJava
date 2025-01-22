package Programming.numbers;

public class OctalToDecimal {
	public static void main(String[] args) {
		String octal = "35";
		int decimal = 0;
		for (int i = 0; i < octal.length(); i++) {
			int digit = octal.charAt(i) - '0';
			decimal = decimal * 8 + digit;
		}
		System.out.println("Decimal value : " + decimal);
	}
}
