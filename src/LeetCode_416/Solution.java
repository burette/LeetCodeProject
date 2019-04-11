package LeetCode_416;

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int integer : nums) {
            sum += integer;
        }
        //奇数直接返回false
        if ((sum & 1) == 1) {
            return false;
        }
        int n = nums.length;
        sum /= 2;
        // dp[i][j] 表示 如果我们取前i个数字，且背包容量为j的情况下，最多能放入多少东西
        int dp[][] = new int[n][sum + 1];
        // dp[0][0] 为初始状态，表示，没有任何没有东西没有体积，其余部分初始化
        for (int i = nums[0]; i <= sum; i++) {
            dp[0][i] = nums[0];
        }
        // 遍历n个数字，即视为n个产品
        for (int i = 1; i < n; i++) {
            // 加入了这种物品后更新状态
            for (int j = nums[i]; j <= sum; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
            }
        }
        // 放满了才能表示正好1/2
        if (dp[n - 1][sum] == sum)
            return true;
        else
            return false;
    }
}
