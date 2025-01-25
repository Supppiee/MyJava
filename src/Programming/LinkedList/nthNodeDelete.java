package Programming.LinkedList;

import Programming.LinkedList.nthNodeFromLast.Node;

public class nthNodeDelete {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void MydeletionNode(Node head, int n) {
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
	}
	
	public static Node delete(Node head, int n) {
		Node fast = head;
		Node slow = head;
		for(int i=1; i<=n; i++) {
			fast = fast.next;
		}
		if(fast == null) {
			head = head.next;
			return head;
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
	
	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
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
		
		display(n1);
		System.out.println();

		n1 = delete(n1, 4);
		
		display(n1);
		System.out.println();                           
	}
}
