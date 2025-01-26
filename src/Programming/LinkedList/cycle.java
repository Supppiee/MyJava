package Programming.LinkedList;

import Programming.LinkedList.MiddleNode.Node;

public class cycle {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean isCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
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
		n9.next = n3; //cycle
		
		if(isCycle(n1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
		
}
