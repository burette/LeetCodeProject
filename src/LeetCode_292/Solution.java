package LeetCode_292;

/**
 * @Author: burette
 * @Date: 2019/6/17 10:50
 */
public class Solution {
    public boolean canWinNim(int n) {
        if (n <= 3) {
            return true;
        } else {
            return canWinNim(n - 3) && canWinNim(n - 2) && canWinNim(n - 1);
        }
    }
}
