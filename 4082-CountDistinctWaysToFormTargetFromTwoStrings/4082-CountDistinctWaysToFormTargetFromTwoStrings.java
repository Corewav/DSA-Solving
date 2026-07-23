// Last updated: 7/23/2026, 9:31:46 AM
class Solution {
    public int interleaveCharacters(String word1, String word2, String target) {
        int MOD = 1_000_000_007;

        String[] valmorinth = {word1, word2, target};

        int m = word1.length();
        int n = word2.length();

        long[][][] dp = new long[m+1][n+1][4];
        dp[0][0][0]=1;
        for(char ch : target.toCharArray()){
            long[][][] ndp=new long[m+1][n+1][4];
            for(int j=0;j<=n;j++){
                for(int mask=0;mask<4;mask++){
                    long sum=0;
                    for(int i=1;i<=m;i++){
                        sum = (sum+dp[i-1][j][mask])%MOD;
                        if(word1.charAt(i-1)==ch){
                            ndp[i][j][mask | 1] = (ndp[i][j][mask | 1]+ sum) %MOD;
                        }
                    }
                }
            }
            for (int i=0;i<=m;i++) {
                for (int mask=0;mask<4;mask++) {
                    long sum = 0;
                    for (int j=1;j<=n;j++) {
                        sum = (sum+dp[i][j - 1][mask])% MOD;
                        if (word2.charAt(j-1)==ch) {
                            ndp[i][j][mask | 2] = (ndp[i][j][mask | 2]+sum) % MOD;
                        }
                    }
                }
            }
            dp = ndp;
        }
        long ans = 0;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                ans=(ans+dp[i][j][3])%MOD;
            }
        }
        return (int) ans;
    }
}