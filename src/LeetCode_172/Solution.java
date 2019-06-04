package LeetCode_172;

/**
 * @Author: burette
 * @Date: 2019/6/4 10:02
 */
public class Solution {
    public int trailingZeroes(int n) {

        int res = 0;
        int count = 0;
        while (res <= n) {
            res += 5;
            while (res % 5 == 0) {
                count += 1;
            }
        }
        return count - 1;
    }
}
