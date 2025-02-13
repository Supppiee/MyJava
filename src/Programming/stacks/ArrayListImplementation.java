package Programming.stacks;

import java.util.ArrayList;

public class ArrayListImplementation {
	static class stack {
		static ArrayList<Integer> list = new ArrayList<>();
		static int size = 0;

		public static Boolean isEmpty() {
			return (list.size() == 0);

		}

		public static void push(int num) {
			list.add(num);
			size++;
		}

		public static void pop() {
			if (isEmpty()) {
				System.out.println("Stack is empty");
			} else {
				int top = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				System.out.println(top + " removed ");
				size--;
			}
		}

		public static void display() {
			System.out.print(list);
		}

		public static void peek() {
			if (isEmpty()) {
				System.out.println("Stack is empty");
			} else
				System.out.println(list.get(list.size() - 1));
		}
	}

	public static void main(String[] args) {
		stack list = new stack();

		list.push(3);
		list.push(2);
		list.push(5);
		list.push(6);
		list.push(9);

		System.out.print("Top element : ");
		list.peek();

		System.out.println("before removing--------->");
		list.display();
		System.out.println();

		System.out.println("After removing--------->");
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.display();
	}
}
