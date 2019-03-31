package LeetCode_877;


/*
* 由于题目的限制条件是石头的堆数是偶数，且石头的总数是奇数，因此Alex可以选择一种策略总是选偶数堆或者奇数堆的石头，则一定可以胜过Lee。简单说，Alex在题目的条件限制下是必胜的。但这里我们需要进行更一般化的分析，例如石头堆数不一定是偶数，石头总数也不一定是奇数，且不但要判断Alex是否能赢，还要判断最多赢多少分，如果输，能不能提供最少输多少分。这里的分数是指多拿的石头数量。

我们每次只能拿两端的石头堆的石头，但我们又不知道拿完后剩下的石头堆的情况，因此我们考虑先解决子问题。例如我们求出2个相邻石头堆的胜负情况，我们可以根据求出的数据求出相邻3个石头堆的胜负情况，以此类推，我们可以根据n-1个相邻石头堆的胜负情况，求出n个相邻石头堆的胜负情况，即我们的原问题。
根据我们的类推我们可以设dp[i][j]为piles[i]~piles[j]Alex最多可以赢Lee的分数。每次取石头堆只能从两端取，因此:dp[i][j] = max(piles[i] - dp[i+1][j], piles[j] - dp[i][j-1])。其中
piles[i] - dp[i+1][j]表示Alex取走i上的石头堆，piles[j] - dp[i][j-1]表示Alex取走的是j上的石头堆。注意，为什么dp[i+1][j]表示piles[i+1]~piles[j]之间Alex最多可以赢Lee的分数，而piles[i]要减去该值而不是加上该值呢？由于我们的要求是每一步Alex和Lee采取的都是最优策略，当取piles[i]时，piles[i+1]~piles[j]中Alex和Lee的走法会调换。意即Lee走Alex的走法，Alex走Lee的走法，因此这里要做减法。

*/


public class Solution {
    public static boolean stoneGame(int[] piles) {
        int length = piles.length;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = piles[i];
        }

        for (int dis = 1; dis < length; dis++) {
            for (int i = 0; i < length - dis; i++) {
                dp[i][i + dis] = Math.max(piles[i] - dp[i + 1][i + dis], piles[i + dis] - dp[i][i + dis - 1]);
            }
        }
        return dp[0][length - 1] > 0;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 5};
        System.out.println(stoneGame(arr));
    }
}
