// Last updated: 7/23/2026, 9:31:37 AM
class Solution {
    public int[] maximumMEX(int[] nums) {
        int n = nums.length,i=0;
        int[] cnt = new int[n+2], seen = new int[n+2];
        for(int x : nums) if (x <= n) cnt[x]++;
        TreeSet<Integer> miss = new TreeSet<>();
        for(int x =0; x <= n+1; x++)
            if(cnt[x] == 0) miss.add(x);
        ArrayList<Integer> ans= new ArrayList<>();
        int mark = 1;
        while(i < n){
            int mex = miss.first();
            ans.add(mex);
            if(mex == 0){
                if(nums[i] <= n && --cnt[nums[i]] ==0) miss.add(nums[i]);
                i++;
            } else {
                int need =mex;
                mark++;

                while (need > 0){
                    int x = nums[i++];
                    if(x <mex && seen[x] != mark){
                        seen[x] = mark;
                        need--;
                    }
                    if(x <= n && --cnt[x] == 0) miss.add(x);
                }
            }
        }
        return ans.stream().mapToInt(x -> x).toArray();
        
    }
}