package LeetCode_62;

public class Solution {
    public int uniquePaths(int m, int n) {
        //动态规划的思路，将区域扩大，在左侧和上侧填充为0.dp[i][j]表示到达此块的路径综合
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m][n];
    }


    //递归的方法
//    public int uniquePaths(int m, int n) {
//        return comb(m+n-2,Math.min(n-1,m-1));
//    }
//    public int comb(int m,int n){
//        if(n==0)
//            return 1;
//        if (n==1)
//            return m;
//        if(n>m/2)
//            return comb(m,m-n);
//        if(n>1)
//            return comb(m-1,n-1)+comb(m-1,n);
//        return -1;
//    }
}
