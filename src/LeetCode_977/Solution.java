package LeetCode_977;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int length = A.length;
        for (int i = 0; i < length; i++) {
            result[i] = A[i]*A[i];
        }
        Arrays.sort(result);
        return result;
    }
}