package LeetCode_832;

public class Solution {

    public static int[][] flipAndInvertImage(int[][] A) {
        int length = A.length;
        int[][] result = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = A[i][length-j];
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (result[i][j] == 1) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] B = flipAndInvertImage(A);
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.println(B[i][j]);
            }
        }
    }
}
