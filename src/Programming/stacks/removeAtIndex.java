package Programming.stacks;

import java.util.Stack;

public class removeAtIndex {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println("Original : " + s);

		int index = 2;
		Stack<Integer> temp = new Stack<>();
		while (s.size() > index) {
			temp.push(s.pop());
		}
		s.pop();
		System.out.println("item popped--->");
		while (temp.size() > 0) {
			s.push(temp.pop());
		}
		System.out.println("result : " + s);

	}
}
