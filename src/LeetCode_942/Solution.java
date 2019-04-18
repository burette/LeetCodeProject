package LeetCode_942;

public class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int left = 0, right = N;
        int[] result = new int[N + 1];
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = left++;
            } else {
                result[i] = right--;
            }
        }
        result[N] = right;
        return result;
    }
}
