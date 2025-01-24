package Programming.LinkedList;

public class implementation {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class linkedlist {
		Node head = null;
		Node tail = null;

		void insertAtEnd(int data) {
			Node temp = new Node(data);
			if (head == null)
				head = tail = temp;
			else {
				tail.next = temp;
				tail = temp;
			}
		}

		void insertAtBegining(int data) {
			Node temp = new Node(data);
			if (head == null) {
				head = tail = temp;
			} else {
				temp.next = head;
				head = temp;
			}
		}

		void insertAtMiddle(int index, int data) {
			Node t = new Node(data);
			Node temp = head;
			if (index == 0) {
				insertAtBegining(data);
			} else if (index == size()) {
				insertAtEnd(data);
			} else {
				for (int i = 1; i <= index - 1; i++) {
					temp = temp.next;
				}
				t.next = temp.next;
				temp.next = t;
			}

		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		int size() {
			int count = 0;
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		
		int getAt(int index) {
			if(index<0 || index>size()) {
				System.err.println("Invalid index");
				return 0;
			}
			else {
				int value = 0;
				Node temp = head;
				for(int i=1; i<=index; i++) {
					temp = temp.next;
				}
				value = temp.data;
				return value;
			}
		}
		
		void deleteAt(int index) {
			Node temp = head;
			if(index == 0) {
				head = head.next;
			}
			for(int i=1; i<=index-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			tail = temp;
		}
	}

	public static void main(String[] args) {
		linkedlist link = new linkedlist();
		
		//insert at end
		link.insertAtEnd(1);
		link.insertAtEnd(2);
		link.insertAtEnd(5);

		//insert at beginning
		link.insertAtBegining(9);
		link.insertAtBegining(4);
		link.insertAtBegining(10);

		//insert at middle
		link.insertAtMiddle(2, 16);
		link.insertAtMiddle(5, 12);
		link.insertAtMiddle(0, 100);
		link.insertAtMiddle(0, 99);

		//displaying the list
		link.display();
		
		link.deleteAt(3);
		link.display();
		
		
		//getting the node of that particular index
//		System.out.println("Node : "+link.getAt(100));

		//returns the size of the linked list
		link.size();

	}
}
