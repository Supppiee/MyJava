package Programming.LinkedList;

public class reverseList {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private static void disp(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	// recursive
	private static Node rev(Node head) {
		if (head.next == null)
			return head;
		Node newHead = rev(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	private static Node revI(Node head) {
		Node curr = head;
		Node prev = null;
		Node temp = null;
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			
		}
		return prev;
	}

	public static void main(String[] args) {
		Node n1 = new Node(12);
		Node n2 = new Node(24);
		Node n3 = new Node(43);
		Node n4 = new Node(53);
		Node n5 = new Node(24);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		disp(n1);
		System.out.println();
		Node node = revI(n1);
		disp(node);
	}

}
