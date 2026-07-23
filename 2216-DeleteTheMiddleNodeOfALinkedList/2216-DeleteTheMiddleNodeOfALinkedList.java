// Last updated: 7/23/2026, 9:32:37 AM
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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode slowNode=head;
        ListNode fastNode= head;
        if(fastNode.next == null) return null;
        while(fastNode.next.next!=null && fastNode.next.next.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        slowNode.next= slowNode.next.next;
        return head;
        
    }
}