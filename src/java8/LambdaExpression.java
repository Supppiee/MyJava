package java8;
//works with only functional interfaces - interface which has only one abstract method and but
//can have number of default and static methods


 interface Hello{
	public void sayHi();
}

public abstract class LambdaExpression implements Hello {
	public static void main(String[] args) {
		Hello hello = ()->System.out.println("hello");
		hello.sayHi();
	}
}

