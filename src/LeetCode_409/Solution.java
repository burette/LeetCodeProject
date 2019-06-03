package LeetCode_409;

/**
 * @Author: burette
 * @Date: 2019/6/3 19:36
 */
public class Solution {
    public int longestPalindrome(String s) {

        int len = s.length();
        int res = 0;
        int[] hash = new int[100];
        for (int i = 0; i < len; i++) {
            hash[s.charAt(i) - 'A']++;
        }
        boolean flag = false;
        for (int i = 0; i < 100; i++) {
            if (hash[i] % 2 == 0) {
                res += hash[i];
            } else {
                res += (hash[i] - 1);
                flag = true;
            }
        }
        if (flag) {
            return res + 1;
        } else {
            return res;
        }
    }
}
