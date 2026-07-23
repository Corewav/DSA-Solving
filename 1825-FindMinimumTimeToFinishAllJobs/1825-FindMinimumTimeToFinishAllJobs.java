// Last updated: 7/23/2026, 9:33:00 AM
class Solution {
    int[] cnt;
    int ans = Integer.MAX_VALUE;
    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        for(int i=0,j=jobs.length-1;i<j;i++,j--) {
            int temp = jobs[i];
            jobs[i] = jobs[j];
            jobs[j] = temp;
        }
        cnt = new int[k];
        dfs(jobs, 0);
        return ans;
    }
    private void dfs(int[] jobs, int i) {
        if(i == jobs.length) {
            int max = 0;
            for(int x : cnt) max = Math.max(max, x);
            ans = Math.min(ans, max);
            return;
        }
        for(int j = 0; j < cnt.length; j++) {
            if(cnt[j] + jobs[i] >= ans) continue;
            cnt[j] += jobs[i];
            dfs(jobs, i + 1);
            cnt[j] -= jobs[i];
            if(cnt[j] == 0) break;
        }
    }
}