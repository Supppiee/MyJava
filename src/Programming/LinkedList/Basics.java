package Programming.LinkedList;

public class Basics {
	public static class Node {
		
		//contains data
		int data;
		//contains address of the linking node
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static void reverse(Node head) {
		if (head == null)
			return;
		reverse(head.next);
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		
		//Node creation 
		Node n1 = new Node(3);
		Node n2 = new Node(4);
		Node n3 = new Node(7);
		Node n4 = new Node(5);

		//linking nodes to their next element address using obj.next
		n1.next = n2; //3->4
		n2.next = n3; //3->4->7
		n3.next = n4; //3->4->7->5

		System.out.println(n1.data);

		//printing reverse using recursion
		reverse(n1);

		System.out.println();

		//displaying, creation of a temp Node to preserve the data of head.
		Node temp = n1;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
