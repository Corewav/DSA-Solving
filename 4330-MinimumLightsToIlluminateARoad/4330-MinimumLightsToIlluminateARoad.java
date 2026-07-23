// Last updated: 7/23/2026, 9:31:32 AM
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n+1];

        for(int i = 0 ; i < n; i++){
            if(lights[i] > 0){
                int power = lights[i];

                int left = Math.max(0, i - power);
                int right = Math.min(n-1, i + power);

                diff[left]++;
                diff[right + 1]--;
            }
        }

        int answer = 0;
        int currentLight = 0;
        int darkLength = 0;

        for(int i = 0; i < n; i++){
            currentLight += diff[i];

            if(currentLight == 0){
                darkLength++;
            } else {
                answer += (darkLength +2)/3;
                darkLength = 0;
            }
        }

        answer += (darkLength + 2)/3;
        return answer;
    }
}