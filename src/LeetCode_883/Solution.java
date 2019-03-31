package LeetCode_883;

public class Solution {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        sum += n * n;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > temp) {
                    temp = grid[i][j];
                }
                if (grid[i][j] == 0) {  //检查数组中过是否含有0的一项,如果有则将总和减去1
                    sum--;
                }
            }
            sum += temp;
        }
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] > temp) {
                    temp = grid[j][i];
                }
            }
            sum += temp;
        }
        return sum;
    }
}
