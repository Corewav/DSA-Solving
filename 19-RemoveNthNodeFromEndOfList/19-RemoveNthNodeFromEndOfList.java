// Last updated: 7/23/2026, 9:36:41 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //    ListNode dummy = new ListNode(0);
    //    dummy.next = head;
    //    ListNode forward = dummy;
    //    ListNode backward = dummy;
    //    for ( int i = 0; i <= n; i++){
    //     forward = forward.next;
    //    }




       ListNode dummy = new ListNode(0,head);
       int length = 0;
       ListNode first = head;
       while(first != null){
        length ++;
        first = first.next;
       }
       length -= n;
       first = dummy;
       while( length > 0){
        length --;
        first = first.next;
       }
       first.next = first.next.next;
       return dummy.next;
    }
}