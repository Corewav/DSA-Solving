// Last updated: 7/23/2026, 9:34:53 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
        
    }
}