package LeetCode_976;

import java.util.Arrays;

public class Solution {

    //排个序以后从后向前逐个扫描
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; ) {
            if (A[i] >= A[i - 1] + A[i - 2]) {
                i--;
            } else {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}
