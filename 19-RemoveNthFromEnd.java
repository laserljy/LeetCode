/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(n == 0) return head;
        int len = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(dummy.next != null) {
            len++;
            dummy = dummy.next;
        }
        dummy = new ListNode(0);
        dummy.next = head;
        ListNode newHead = dummy;
        while(len > n) {
            dummy = dummy.next;
            len--;
        }
        if(dummy.next != null) dummy.next = dummy.next.next == null? null : dummy.next.next;
        return newHead.next;
    }
}