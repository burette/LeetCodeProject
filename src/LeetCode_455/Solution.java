package LeetCode_455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gFlag = 0;
        int sFlag = 0;

        int result = 0;

        while (sFlag < s.length && gFlag < g.length) {
            if (g[gFlag] <= s[sFlag]) {
                sFlag++;
                gFlag++;
                result++;
            }
            else {
                gFlag++;
            }
        }
        return result;
    }
}
