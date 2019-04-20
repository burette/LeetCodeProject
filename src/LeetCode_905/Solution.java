package LeetCode_905;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (!oushu(A[i]) && oushu(A[j])) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
                continue;
            }
            if (oushu(A[i])) {
                i++;
                continue;
            }
            if (!oushu(A[j])) {
                j--;
                continue;
            }

        }
        return A;
    }

    public boolean oushu(int n) {
        if (n == 0) {
            return true;
        }
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
