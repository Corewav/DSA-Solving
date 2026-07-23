// Last updated: 7/23/2026, 9:33:41 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int colm = matrix[0].length;
        int[][] result = new int[colm][rows];
        for(int i=0;i<rows;i++){
            for(int j = 0;j<colm;j++){
                result[j][i]= matrix[i][j];
            }
        }
        return result;
    }
}