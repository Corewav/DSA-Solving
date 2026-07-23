// Last updated: 7/23/2026, 9:31:45 AM
import java.util.*;

class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        ArrayList<Integer>[] tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            tree[parent].add(child);
        }

        return dfs(0, tree, baseTime);
    }

    private long dfs(int node, ArrayList<Integer>[] tree, int[] baseTime) {
        if (tree[node].size() == 0) {
            return baseTime[node];
        }

        long earliest = Long.MAX_VALUE;
        long latest = 0;

        for (int child : tree[node]) {
            long childTime = dfs(child, tree, baseTime);

            earliest = Math.min(earliest, childTime);
            latest = Math.max(latest, childTime);
        }

        long ownDuration = (latest - earliest) + baseTime[node];

        return latest + ownDuration;
    }
}