package LeetCode_63;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int result = comb(m+n-2,Math.min(m-1,n-1));
        for(int i =0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(obstacleGrid[i][j] == 1){
                    
                }
            }
        }

        return 0;
    }

    public int comb(int m, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return m;
        if (n > m / 2)
            return comb(m, m - n);
        if (n > 1)
            return comb(m - 1, n - 1) + comb(m - 1, n);
        return -1;
    }
}

