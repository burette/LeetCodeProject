package LeetCode_168;

public class Solution {
    public String convertToTitle(int n) {
        String result = new String();
        while (n > 0) {
            int temp = n % 26;
            if (temp == 0) {
                result = String.valueOf((char) (temp + 26 + 64)) + result;
            } else {
                result = String.valueOf((char) (temp + 64)) + result;
                n /= 26;
            }
        }
        return result;
    }
}
