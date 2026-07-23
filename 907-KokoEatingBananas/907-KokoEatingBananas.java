// Last updated: 7/23/2026, 9:33:38 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right = 0;
        for(int pile : piles){
            right = Math.max(right,pile);
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            if(canEarthInTime(piles, mid,h)){
                right = mid -1;
            } else{
                left = mid +1;
            } 
        }
        return left;
    }
    public boolean canEarthInTime(int piles[], int k, int h){
        long hours = 0;
        for(int pile : piles){
            int div = pile /k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }
}