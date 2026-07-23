// Last updated: 7/23/2026, 9:32:35 AM
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass =mass;
        for(int asteroid : asteroids){
            if(asteroid > currMass){
                return false;
            }
            currMass += asteroid;
        }
        return true;
    }
}