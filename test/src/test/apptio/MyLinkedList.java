package test.apptio;

public class MyLinkedList {

	Node head;
	
	MyLinkedList () {
		
	}
	
	MyLinkedList (Node head) {
		this.head = head;
	}
	
	// 2 4 
	// 3
	public void add(int val) {
		Node node = new Node(val);
		Node temp = head;
		boolean isAdded = false;
		
		if (head == null) {
			head  = new Node(val);
		} else if (head.val > val) {
			node.next = head;
			head = node;
		} else {
			while (temp.next != null) {
				if (temp.next.val > val) {
					node.next = temp.next;
					temp.next = node;
					isAdded = true;
					break;
				} else {
					temp = temp.next;
				}
			}
			if (!isAdded) {
				temp.next = node;
			}
		}
	}
	
	public void printMe() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

}
