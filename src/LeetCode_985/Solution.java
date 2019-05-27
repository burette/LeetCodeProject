package LeetCode_985;

/**
 * @Author: burette
 * @Date: 2019/5/27 11:15
 */
public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int length = queries.length;
        int[] result = new int[length];

        A[queries[0][1]] += queries[0][0];
        result[0] = sum(A);

        for (int i = 1; i < length; i++) {
            if ((A[i] % 2 == 0 && queries[i][0] % 2 == 1) || (A[i] % 2 == 1 && queries[i][0] % 2 == 0)) {
                result[i] = result[i - 1];
            } else if (A[i] % 2 == 0 && queries[i][0] % 2 == 0) {
                result[i] = result[i - 1] + queries[i][0];
            } else if (A[i] % 2 == 1 && queries[i][0] % 2 == 1) {
                result[i] = result[i - 1] + queries[i][0] + A[i];
            }
        }
        return result;
    }

    public int sum(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res += A[i];
            }
        }
        return res;
    }
}
