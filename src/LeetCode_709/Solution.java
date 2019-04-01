package LeetCode_709;

public class Solution {
    public String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += (char)(str.charAt(i) + 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
