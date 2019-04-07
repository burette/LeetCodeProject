package LeetCode_64;


//从底向上进行思考，先对边缘进行处理，边缘的一行等于下一行或者下一列加上本身，
public class Solution {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = n - 2; i >= 0; i--) {
            grid[m - 1][i] = grid[m - 1][i + 1] + grid[m - 1][i];
        }
        for (int j = m - 2; j >= 0; j--) {
            grid[j][n - 1] = grid[j][n - 1] + grid[j + 1][n - 1];
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j], grid[i][j + 1]);
            }
        }
        return grid[0][0];
    }
}
