package LeetCode_387;

/**
 * @Author: burette
 * @Date: 2019/5/31 9:13
 */
public class Solution {
    public int firstUniqChar(String s) {

        int[] hash = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
            if (hash[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
