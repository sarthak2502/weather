package ms;

public class ListNode {

	int val;
	ListNode next;
	
	public ListNode() {
		
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString() {
		ListNode head = this;
		StringBuilder sb = new StringBuilder();
		while (head != null)  {
			sb.append(head.val + " ");
			head = head.next;
		}
		//sb.append("null");
		return sb.toString(); 
	}

}
