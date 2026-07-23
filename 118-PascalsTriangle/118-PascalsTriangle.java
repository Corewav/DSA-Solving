// Last updated: 7/23/2026, 9:35:41 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lt = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> inLt = new ArrayList<>();
            int val = 1;
            for (int col = 0; col <= row; col++) {
                inLt.add(val);
                val = val * (row - col) / (col + 1); 
            }
            lt.add(inLt);
        }
        return lt;
    }
}
