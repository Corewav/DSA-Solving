// Last updated: 7/23/2026, 9:33:45 AM
class Solution {
    List<List<Integer>> allPaths = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph,0,graph.length-1,path);
        return allPaths;
    }
    private void dfs(int[][]graph,int source, int destination,List<Integer>path){
        if(source == destination){
            allPaths.add(new ArrayList<>(path));
        }
        for(int node : graph[source]){
            path.add(node);
            dfs(graph,node,destination,path);
            path.remove(path.size() -1);
        }
    }
}