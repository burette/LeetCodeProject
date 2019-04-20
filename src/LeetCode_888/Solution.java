package LeetCode_888;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {

        int sumA = sum(A);
        int sumB = sum(B);
        int result[] = new int[2];
        for (int i = 0; i < A.length; i++) {
            if ((sumA + sumB) / 2 == (sumA > sumB ? (sumA - A[i]) : (sumA + A[i]))) {
                result[0] = A[i];
                break;
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (sumA - B[i] == (sumA + sumB) / 2) {
                result[0] = B[i];
                break;
            }
        }
        return result;
    }

    public int sum(int[] A) {
        int sum = 0;
        for (Integer integer : A) {
            sum += integer;
        }
        return sum;
    }
}
