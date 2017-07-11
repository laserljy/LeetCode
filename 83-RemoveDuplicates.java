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
        ListNode result = head;
        if(head == null) return null;
        while(result != null) {
            ListNode list = result.next;
            while(list != null && result.val == list.val) {
                list = list.next;
            }
            result.next = list;
            result = result.next;
        }
        return head;
    }
}