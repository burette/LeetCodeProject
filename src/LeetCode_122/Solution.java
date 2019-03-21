package LeetCode_122;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int length = prices.length;

        if(length<=0){
            return profit;
        }
        for (int i = 1;i<length;i++){
            int delta = prices[i] - prices[i-1];
            if (delta>0){
                profit += delta;
            }
        }
        return profit;
    }
}
