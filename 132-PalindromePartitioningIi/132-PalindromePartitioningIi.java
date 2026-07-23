// Last updated: 7/23/2026, 9:35:30 AM
class Solution {

    public int minCut(String s) {
        int n = s.length();

        boolean[][] pal = new boolean[n][n];
        int[] dp = new int[n];
        for(int end = 0; end < n; end++){
            for(int start = 0; start <= end; start++){

                if(s.charAt(start) == s.charAt(end) &&
                   (end - start < 2 || pal[start+1][end-1])){

                    pal[start][end] = true;
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(pal[0][i]){
                dp[i] = 0;
            } else{
                int min = Integer.MAX_VALUE;

                for(int j = 1; j <= i; j++){
                    if(pal[j][i]){
                        min = Math.min(min, dp[j-1] + 1);
                    }
                }

                dp[i] = min;
            }
        }

        return dp[n-1];
    }
}