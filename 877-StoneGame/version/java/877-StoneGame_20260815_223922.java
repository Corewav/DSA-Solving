// Last updated: 8/15/2026, 10:39:22 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode partition(ListNode head, int x) {
13        ListNode left = new ListNode(0);
14        ListNode right = new ListNode(0);
15        ListNode ltail = left;
16        ListNode rtail = right;
17        while(head != null){
18            if(head.val < x){
19                ltail.next = head;
20                ltail = ltail.next;
21            } else{
22                rtail.next=head;
23                rtail=rtail.next;
24            }
25            head = head.next;
26        }
27        ltail.next = right.next;
28        rtail.next = null;
29        return left.next;
30    }
31}