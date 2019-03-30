package LeetCode_121;

import java.util.Arrays;

public class Solution {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int length = prices.length;
        int profit[] = new int[length];
        prices[0] = 0;
        for (int i = 1; i < length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                profit[i] = prices[i] - min;
            }
        }
        return Arrays.stream(profit).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr ={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
