package LeetCode_807;

public class Solution {

    //思路：先分别找出横着、竖着每一列的最大值，然后再遍历整个数组，将缺少的部分加和
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = grid[i][0];
            for (int j = 1; j < n; j++) {
                a[i] = Math.max(a[i], grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            b[i] = grid[0][i];
            for (int j = 0; j < n; j++) {
                b[i] = Math.max(b[i], grid[j][i]);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += Math.min(a[i], b[j]) - grid[i][j];
            }
        }

        return res;
    }
}
