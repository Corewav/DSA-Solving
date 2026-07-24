// Last updated: 7/24/2026, 8:22:28 PM
1class Solution {
2    public List<Integer> getRow(int k) {
3        Integer[] arr = new Integer[k + 1];
4        Arrays.fill(arr, 0);
5        arr[0] = 1;
6        for(int i = 1; i <= k; i++){
7            for(int j = i; j > 0; j--){
8                arr[j] = arr[j] + arr[j -1];
9            }
10        }
11        return Arrays.asList(arr);
12    }
13}