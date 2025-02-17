package Programming.stacks;

import java.util.Stack;

public class CopyStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println("Original : " + s);

		Stack<Integer> r = new Stack<>();
		while (s.size() > 0) {
			r.push(s.pop());
		}

		Stack<Integer> f = new Stack<>();
		{
			while (r.size() > 0) {
				f.push(r.pop());
			}
		}
		System.out.println("Copy : " + f);

	}
}
