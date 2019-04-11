package LeetCode_983;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int[] vis = new int[366];
        int len = days.length;
        for (int i = 0; i < len; i++) {
            vis[days[i]] = 1;
        }
        for (int i = 0; i < 366; i++) {
            if (vis[i] == 0) {
                dp[i] = dp[i - 1];
            } else {
                //下标可能会越界，因此需要与0进行比较
                dp[i] = Math.min(dp[i - 1] + costs[0], Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[Math.max(0, i - 30)] + costs[2]));
            }
        }
        return dp[365];
    }
}
