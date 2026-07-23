// Last updated: 7/23/2026, 9:33:20 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for (int num : temp) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }
}