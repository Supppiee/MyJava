package java8;


/*works with only functional interfaces - interface which has only one abstract method and but
can have number of default and static methods
Introduced to enable functional programming.
Syntax: (parameters) -> expression or (parameters) -> { statements }*/


 interface Hello{
	public void sayHi();
	
	default void show() {
		System.out.println("This is showing due to default");
	}
	static void showAgain() {
		System.out.println("This is showing due to static ");
	}
}

public abstract class LambdaExpression implements Hello {
	public static void main(String[] args) {
		Hello hello = ()->System.out.println("This is showing due to Lambda expression");
		hello.sayHi();
		hello.show();
		Hello.showAgain();
	}
}

