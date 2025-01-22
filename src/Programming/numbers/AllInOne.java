package Programming.numbers;

public class AllInOne {
	public static void main(String[] args) {
		int n = 25;
		convert(n, 2);
		convert(n,8);
		convert(n,16);
		convert(n,3);
	}

	private static void convert(int n, int base) {
		StringBuilder res = new StringBuilder();
		
		int digits[] = {0,1,2,3,4,5,6,7,8,'A','B','C','D','E','F'};
		while(n != 0) {
			res.append(digits[n%base]);
			n = n/base;
		}
		if(base == 2)
			System.out.println("converted to binary : "+res.reverse().toString());
		
		else if(base == 8)
			System.out.println("converted to Octa : "+res.reverse().toString());
		
		else if(base == 16)
			System.out.println("converted to Hexadecimal : "+res.reverse().toString());
		
		else
			System.out.println("Invalid base value");
	}
}
