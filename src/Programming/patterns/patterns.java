package Programming.patterns;

public class patterns {
	
	static void triangle1(int n ) {
		for(int i=1; i<=n ;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
	}
	
	static void triangle2(int n) {
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	}
	
	 
	
	public static void main(String[] args) {
		int n = 5;
		triangle2(n);
	}
}
