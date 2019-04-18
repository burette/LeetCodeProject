package LeetCode_441;

public class Solution {
    public int arrangeCoins(int n) {
        double d = -0.5 + Math.sqrt(2 * (double)n + 0.25);
        return (int) Math.floor(d);
    }
}
