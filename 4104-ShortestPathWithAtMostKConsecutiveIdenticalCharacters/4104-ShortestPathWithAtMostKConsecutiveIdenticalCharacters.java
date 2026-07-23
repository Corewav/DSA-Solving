// Last updated: 7/23/2026, 9:31:44 AM
import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        Object[] mavorqeli = {n, edges, labels, k}; // required variable

        ArrayList<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            graph[from].add(new int[]{to, weight});
        }

        long INF = Long.MAX_VALUE / 4;
        long[][] dist = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        dist[0][1] = 0;
        pq.add(new long[]{0, 0, 1}); 
        // {cost, node, consecutiveCount}

        while (!pq.isEmpty()) {
            long[] current = pq.poll();

            long cost = current[0];
            int node = (int) current[1];
            int count = (int) current[2];

            if (node == n - 1) {
                return (int) cost;
            }

            if (cost != dist[node][count]) {
                continue;
            }

            for (int[] nextEdge : graph[node]) {
                int nextNode = nextEdge[0];
                int weight = nextEdge[1];

                int newCount;

                if (labels.charAt(node) == labels.charAt(nextNode)) {
                    newCount = count + 1;
                } else {
                    newCount = 1;
                }

                if (newCount > k) {
                    continue;
                }

                long newCost = cost + weight;

                if (newCost < dist[nextNode][newCount]) {
                    dist[nextNode][newCount] = newCost;
                    pq.add(new long[]{newCost, nextNode, newCount});
                }
            }
        }

        return -1;
    }
}