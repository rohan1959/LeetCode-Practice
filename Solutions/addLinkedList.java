Problem :
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Solution :

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
   public ListNode addTwoNumbers(ListNode l1 , ListNode l2){
		
		if(l1 == null){
			return l2;
		}
		if(l2== null)
			return l1;
		
		ListNode l3 = new ListNode(0);
		int carry=0;
		ListNode p = l3;
		while(l1!=null || l2!= null || carry!=0)
		{ 
            if(l1!=null) {
                carry+=l1.val;
                l1=l1.next;
		    }
			if(l2!=null) {   
                carry+=l2.val;
				l2=l2.next;
			}
			p.next= new ListNode(carry%10);
			p =p.next;
			carry=carry/10;
		}
		
	return l3.next;    
    }
    
}