package ms;

public class MSMain {

	public static void main(String[] args) {

		ListNode num1 = new ListNode(7, new ListNode(1, new ListNode(4, new ListNode(8))));
		ListNode num2 = new ListNode(3, new ListNode(4, new ListNode(3, new ListNode(3))));
		
//		num1 = reverseList(num1);
//		num2 = reverseList(num2);
		System.out.println(num1);
		System.out.println(num2);
		ListNode sum = addNumbers(num1, num2);
		
		System.out.println(sum);

	}
	
	public static ListNode addNumbers(ListNode num1, ListNode num2) {
		ListNode sumHead = new ListNode(-1);
		ListNode temp = sumHead;
		int carry = 0;
		while (num1 != null || num2 != null) {
			if (num1 != null) {
				carry += num1.val;
				num1 = num1.next;
			}
			if (num2 != null) {
				carry += num2.val;
				num2 = num2.next;
			}
			if (carry > 9) {
				temp.next = new ListNode(carry - 10);
				carry = 1;
			} else {
				temp.next = new ListNode(carry);
				carry = 0;
			}
			temp = temp.next;
		}
		if (carry == 1) {
			temp.next = new ListNode(1);
		}
		
		return sumHead.next;
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode b = head;
		ListNode f = head.next;
		ListNode p = null;
		
		while (f != null) {
			b.next = p;
			p = b;
			b = f;
			f = f.next;
		}
		b.next = p;
		head = b;
		return head;
	}

}
