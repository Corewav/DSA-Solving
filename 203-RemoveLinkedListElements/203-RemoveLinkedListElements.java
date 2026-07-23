// Last updated: 7/23/2026, 9:34:56 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;
        ListNode prev = sentinel,curr = head;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            } else{
                prev = curr;
                curr = curr.next;
            }
        } 
        return sentinel.next;
    }
}