package Programming.numbers;

public class Hexadecimal {
	public static void main(String[] args) {
		int n = 25;
		tohexa(n);
	}

	private static void tohexa(int n) {
		StringBuilder hexa = new StringBuilder();
		
		int digits[] = {0,1,2,3,4,5,6,7,8,'A','B','C','D','E','F'};
		while(n != 0) {
			hexa.append(digits[n%16]);
			n = n/16;
		}
		System.out.println("hexa : "+hexa.reverse().toString());
	}
}
