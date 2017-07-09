/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy.next;
        ListNode second = dummy.next.next;
      
        if(first != null && second != null) {
            first.next = second.next;
            second.next = first;
            dummy.next = second;
            first.next = swapPairs(first.next);
        }
        return dummy.next;
    }   
}