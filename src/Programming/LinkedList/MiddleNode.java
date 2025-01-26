package Programming.LinkedList;

import Programming.LinkedList.nthNodeDelete.Node;

public class MiddleNode {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void middle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);

		// fast != null (even)
		// fast.next.next != null (even)
		// fast.next != null (odd)
	}

	public static void main(String[] args) {
		Node n1 = new Node(3);
		Node n2 = new Node(40);
		Node n3 = new Node(7);
		Node n4 = new Node(5);
		Node n5 = new Node(9);
		Node n6 = new Node(12);
		Node n7 = new Node(34);
		Node n8 = new Node(5);
		Node n9 = new Node(89);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;

		middle(n1);
	}
}
