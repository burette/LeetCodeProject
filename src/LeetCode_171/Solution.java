package LeetCode_171;

public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i <s.length() ; i++) {
            result = result*10 + (s.charAt(i)-'A'+1);
        }
        return result;
    }
}
