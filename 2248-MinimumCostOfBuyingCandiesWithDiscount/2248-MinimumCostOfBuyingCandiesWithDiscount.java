// Last updated: 7/23/2026, 9:32:34 AM
class Solution {
    public int minimumCost(int[] cost) {
        int count = 0;
        int sum =0;
        Arrays.sort(cost);
        for(int i = cost.length-1; i >= 0; i--){
            count++;
            if(count == 3){
                count =0;
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }
}