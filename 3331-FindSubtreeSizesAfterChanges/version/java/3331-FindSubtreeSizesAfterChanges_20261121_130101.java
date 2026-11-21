// Last updated: 11/21/2026, 1:01:01 PM
1class Solution {
2    public int[] findSubtreeSizes(int[] parent, String s) {
3        int n = parent.length;
4        int[] head = new int[n], nxt = new int[n];
5        Arrays.fill(head, -1);
6        for (int i = 1; i < n; i++) {
7            nxt[i] = head[parent[i]];
8            head[parent[i]] = i;
9        }
10
11        int[] last = new int[26];
12        Arrays.fill(last, -1);
13        int[] newParent = new int[n], prv = new int[n], order = new int[n], stack = new int[n];
14        int[] cur = head.clone();
15        int cnt = 0, sp = 0;
16
17        int c0 = s.charAt(0) - 'a';
18        prv[0] = last[c0];
19        last[c0] = 0;
20        order[cnt++] = 0;
21        stack[sp++] = 0;
22
23        while (sp > 0) {
24            int x = stack[sp - 1];
25            if (cur[x] != -1) {
26                int y = cur[x];
27                cur[x] = nxt[y];
28                int c = s.charAt(y) - 'a';
29                newParent[y] = (last[c] != -1) ? last[c] : parent[y];
30                prv[y] = last[c];
31                last[c] = y;
32                order[cnt++] = y;
33                stack[sp++] = y;
34            } else {
35                last[s.charAt(x) - 'a'] = prv[x];
36                sp--;
37            }
38        }
39
40        int[] ans = new int[n];
41        Arrays.fill(ans, 1);
42        for (int i = n - 1; i >= 1; i--) {
43            int x = order[i];
44            ans[newParent[x]] += ans[x];
45        }
46        return ans;
47    }
48}