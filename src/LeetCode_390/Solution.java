package LeetCode_390;

/**
 * @Author: burette
 * @Date: 2019/6/8 21:30
 */
public class Solution {
    public int lastRemaining(int n) {

        if (n == 1) {
            return n;
        }
        boolean flag[] = new boolean[n];
        int count = n;
        boolean zhengxiang = true;
        while (count > 1) {
            for (int i = 0; i < n; ) {
                if (!flag[i]) {
                    flag[i] = true;
                    count--;
                    if (zhengxiang) {
                        i += 2;
                    } else {
                        i -= 2;
                    }
                }
            }
        }
        return count;
    }
}
