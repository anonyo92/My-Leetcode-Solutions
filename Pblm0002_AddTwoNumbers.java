/**
 * Definition for singly-linked list.
 * public class ListNode {
 *	 int val;
 *	 ListNode next;
 *	 ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0), ctr1 = l1, ctr2 = l2, ctr3 = result, tail = result;
		int sum = 0, carry = 0;
		
		while(ctr1 != null && ctr2 != null){
			sum = (ctr1.val + ctr2.val + carry)%10;
			carry = (ctr1.val + ctr2.val + carry)/10;
			
			ctr3.val = sum;
			ctr3.next = new ListNode(-1);
			tail = ctr3; ctr3 = ctr3.next;
			
			ctr1 = ctr1.next;
			ctr2 = ctr2.next;
		}
		
		while(ctr1 != null){
			sum = (ctr1.val + carry)%10;
			carry = (ctr1.val + carry)/10;
			
			ctr3.val = sum;
			ctr3.next = new ListNode(-1);
			tail = ctr3; ctr3 = ctr3.next;
			
			ctr1 = ctr1.next;
		}
		
		while(ctr2 != null){
			sum = (ctr2.val + carry)%10;
			carry = (ctr2.val + carry)/10;
			
			ctr3.val = sum;
			ctr3.next = new ListNode(-1);
			tail = ctr3; ctr3 = ctr3.next;
			
			ctr2 = ctr2.next;
		}
		
		if (carry != 0)
			ctr3.val = carry;
		else
			tail.next = null;
		return result;
	}
}