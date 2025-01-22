package Programming.numbers;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String binary = "11001";
		int decimal = 0;
		for (int i = 0; i < binary.length(); i++) {
			
			//to get the integer value of a character
			int digit = binary.charAt(i) - '0';
			
			decimal = decimal * 2 + digit;
		}
		System.out.println("Decimal : " + decimal);
	}
}
