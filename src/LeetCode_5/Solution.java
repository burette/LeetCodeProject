package LeetCode_5;

/**
 * @Author: burette
 * @Date: 2019/6/3 11:17
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (isPalindrome(s)){
            return s;
        }
        int len = s.length();
        String res = new String();
        for (int i = 0; i < len; i++) {

            for (int j = len-1; j >i ; j--) {
                String string = new String(s.substring(i,j));
                if (isPalindrome(string)){
                    if (string.length()>res.length()){
                        res = string;
                    }
                }
            }
        }

        return res;
    }

    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
