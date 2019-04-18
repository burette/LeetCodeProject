package LeetCode_917;

public class Solution {
    public String reverseOnlyLetters(String S) {
        String string = new String();
        for (int i = S.length() - 1; i >= 0; i--) {
            if ((S.charAt(i) <= 'Z' && S.charAt(i) >= 'A') || (S.charAt(i) <= 'z' && S.charAt(i) >= 'a')) {
                string += S.charAt(i);
            }
        }
        String result = new String();
        for (int i = 0, j = 0; i < S.length(); i++) {
            if ((S.charAt(i) <= 'Z' && S.charAt(i) >= 'A') || (S.charAt(i) <= 'z' && S.charAt(i) >= 'a')) {
                result += string.charAt(j++);
            } else {
                result += S.charAt(i);
            }
        }

        return result;
    }
}
