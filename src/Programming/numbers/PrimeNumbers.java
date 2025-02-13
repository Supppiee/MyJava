package Programming.numbers;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 21;
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				System.out.println("Not Prime");
				System.exit(0);
			}
		}
		System.out.println("Prime");
	}
}
