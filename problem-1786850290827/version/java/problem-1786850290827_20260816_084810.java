// Last updated: 8/16/2026, 8:48:10 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        Arrays.sort(lights);
4        int n = lights.length;
5        int[] prefixMax = new int[n];
6        prefixMax[0] = lights[0];
7        for(int i = 1; i <n;i++){
8            prefixMax[i] = Math.max(prefixMax[i-1],lights[i]);
9        }
10        int left = 0;
11        int right = period;
12        int answer = period;
13        while(left <= right){
14            int mid = left + (right-left)/2;
15            if(canAchieve(mid,period,lights,prefixMax,arrivalTime)){
16                answer = mid;
17                right = mid-1;
18            }else{
19                left = mid+1;
20            }
21        }
22        return answer;
23    }
24    private boolean canAchieve(int maxWait, int period, int[] lights,int[] prefixMax, int[] arrivalTime){
25        for(int time : arrivalTime){
26            int r = time % period;
27            boolean found = false;
28            if(r < prefixMax[lights.length-1]){
29                found = true;
30            }else{
31                if(maxWait >= period-r){
32                    found = true;
33                }
34            }
35            if(!found){
36                return false;
37            }
38        }
39        return true;        
40    }
41}