package LeetCode_771;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        int length = S.length();
        for (int i = 0; i < length; i++) {
            if (J.contains(Character.toString(S.charAt(i)))) {
                result++;
            }
        }
        return result;
    }
}
