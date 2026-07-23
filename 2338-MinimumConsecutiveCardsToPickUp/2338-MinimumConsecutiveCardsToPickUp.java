// Last updated: 7/23/2026, 9:32:28 AM
class Solution {
    public int minimumCardPickup(int[] cards) {
        int n =cards.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            int el = cards[i];
            if(map.containsKey(el)){
                ans = Math.min(ans,i-map.get(el)+1);
                map.put(el,i);
            }
            else {
                map.put(el,i);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}