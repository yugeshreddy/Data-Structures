class Node {
	int data;
	Node next;

	Node(int x) {
		data = x;
		next = null;
	}
}

class Test {

	public static void main(String args[]) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		printlist(head);
		head = reverse(head);
		printlist(head);

	}

	static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	// Recursive Solution
	static Node recRevL(Node head) {
		if (head == null || head.next == null)
			return head;
		Node rest_head = recRevL(head.next);
		Node rest_tail = head.next;
		rest_tail.next = head;
		head.next = null;
		return rest_head;
	}

	// Reverse Doublylinkkedlist
	static Node reversetheList(Node head) {
		Node temp = null;
		Node current = head;

		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		// if (temp != null) {
		// head = temp.prev;
		// }
		return temp.prev;
	}

	public static void printlist(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}