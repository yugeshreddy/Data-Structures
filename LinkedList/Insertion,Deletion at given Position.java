static Node insertAtGivenPos(Node head, int pos, int data) {
		Node h = new Node(data);
		Node curr = head;

		for (int i = 1; i <= pos - 2 && curr != null; i++) {

			curr = curr.next;
			// System.out.println("curr.next=" + curr.data);
		}
		if (head == null)
			return null;

		h.next = curr.next;
		curr.next = h;
		return head;

	}

	static Node insertInMid(Node head, int data) {
		int count = 0;
		Node curr = head;
		Node h = new Node(data);

		if (head == null) {
			return h;
		}

		while (curr != null) {
			count++;
			curr = curr.next;
		}

		int mid = ((count % 2) == 0) ? (count / 2) : (count + 1) / 2;

		curr = head;

		while (mid-- > 1) {
			curr = curr.next;
		}

		h.next = curr.next;
		curr.next = h;
		return head;

	}

	static Node deleteAtGivenPos(Node head, int pos) {
		Node curr = head;

		for (int i = 1; i <= pos - 2 && curr != null; i++) {
			curr = curr.next;
		}

		curr.next = curr.next.next;

		return head;
	}

	static Node deleteInMid(Node head) {
		Node curr = head;

		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}

		int mid = ((count % 2) == 0) ? count / 2 : (count + 1) / 2;

		curr = head;
		while (mid-- > 1) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}