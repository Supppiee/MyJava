package Programming.LinkedList;

import Programming.LinkedList.Basics.Node;

public class nthNodeFromLast {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node nthNode(Node head, int n) {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		int m = size - n + 1;
		Node temp2 = head;
		for (int i = 1; i < m; i++) {
			temp2 = temp2.next;
		}
		return temp2;
	}

	public static Node fastAndSlow(Node head, int n) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static Node fastAndSlow2(Node head, int n) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.data = slow.next.data;
		slow.next = slow.next.next;
		return slow;
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

		// 3->40->7->5->9->12->34->5->89

		Node temp1 = fastAndSlow(n1, 2);
		System.out.println(temp1.data);

	}
}
