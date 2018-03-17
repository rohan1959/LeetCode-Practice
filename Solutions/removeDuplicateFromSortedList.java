Problem : 
    Given a sorted linked list, delete all duplicates such that each element appear only once.

    For example,
    Given 1->1->2, return 1->2.
    Given 1->1->2->3->3, return 1->2->3.

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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current = head;
        if(head == null) {
            return head;
        }
        while(current.next!= null && current!=null){
            
            if( current.val!= current.next.val) {
                    current = current.next;
                }
            else {
                current.next = current.next.next;
            }
        }    
    return head;
        
    }
}