// Last updated: 7/23/2026, 9:34:02 AM
class Solution {

    int[] parent;
    int[] rank;

    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);  
        }
        return parent[x];
    }

    public void union(int x, int y){
        int px = find(x);
        int py = find(y);
        if(px == py) return;  
        if(rank[px] < rank[py]){
            parent[px] = py;
        } else if(rank[px] > rank[py]){
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n];
        rank = new int[n];

        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
        }

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){   
                if(isConnected[i][j] == 1 && i != j){
                    union(i, j);          
                }
            }
        }


        int provinces = 0;
        for(int i = 0; i < n; i++){
            if(parent[i] == i) provinces++;
        }

        return provinces;
    }
}