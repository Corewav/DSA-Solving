// Last updated: 7/23/2026, 9:31:26 AM
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                grid[row][col] = '#';
            }
        }
        for (int col = 0; col < n; col++) {
            grid[0][col] = '.';
        }
        for (int row = 0; row < m; row++) {
            grid[row][n - 1] = '.';
        }
        String[] answer = new String[m];
        for (int row = 0; row < m; row++) {
            answer[row] = new String(grid[row]);
        }
        return answer;
    }
}