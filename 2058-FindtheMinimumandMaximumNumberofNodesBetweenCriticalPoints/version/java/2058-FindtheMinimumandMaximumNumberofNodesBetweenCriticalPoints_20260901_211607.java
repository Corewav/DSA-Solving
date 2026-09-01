// Last updated: 9/1/2026, 9:16:07 PM
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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        ListNode prev = null;
14        ListNode curr = head;
15        List<Integer> ans = new ArrayList<>();
16        int pos = 1;
17        while(curr!=null)
18        {
19
20            if((curr != head && curr.next != null) && ((curr.val < prev.val && curr.val < curr.next.val) 
21            || (curr.val > prev.val && curr.val > curr.next.val)))
22            {
23                ans.add(pos);
24            }
25            prev = curr;
26            curr = curr.next;
27            pos++;
28        }
29        if(ans.size()<2) return new int[]{-1,-1};
30        Collections.sort(ans);
31        int min = Integer.MAX_VALUE;
32        int max = ans.get(ans.size()-1)-ans.get(0);
33        for(int i=1;i<ans.size();i++)
34        {
35            min = Math.min(min, ans.get(i)-ans.get(i-1));
36        }
37        return new int[]{min,max};
38    }
39}