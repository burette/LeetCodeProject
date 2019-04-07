package LeetCode_91;

public class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            if (s.charAt(i - 1) == '0') {
                dp[i] = dp[i - 1];
            } else {
                if (10 * Integer.parseInt(String.valueOf(s.charAt(i - 2))) + Integer.parseInt(String.valueOf(s.charAt(i - 1))) > 26) {
                    dp[i] = dp[i - 1];
                } else {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
            }
        }
        return dp[n];
    }
}
