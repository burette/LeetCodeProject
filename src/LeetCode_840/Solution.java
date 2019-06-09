package LeetCode_840;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: burette
 * @Date: 2019/6/8 21:45
 */
public class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;

        int A[][] = new int[3][3];

        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                A = createArray(i, j, grid);
                if (isHuanfang(A)) {
                    res++;
                }
            }
        }
        return res;
    }

    int[][] createArray(int i, int j, int[][] grid) {
        int[][] A = new int[3][3];
        for (int k = 0; k < 3; k++) {
            int tempJ = j;
            for (int l = 0; l < 3; l++) {
                A[k][l] = grid[i][tempJ++];
            }
            i++;
        }
        return A;
    }

    boolean isHuanfang(int A[][]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (set.contains(A[i][j])) {
                    return false;
                } else {
                    set.add(A[i][j]);
                }
            }
        }


        int sum0 = A[0][0] + A[0][1] + A[0][2];
        int sum1 = A[1][0] + A[1][1] + A[1][2];
        int sum2 = A[2][0] + A[2][1] + A[2][2];

        int sum3 = A[0][0] + A[1][0] + A[2][0];
        int sum4 = A[0][1] + A[1][1] + A[2][1];
        int sum5 = A[0][2] + A[1][2] + A[2][2];
        int sum6 = A[0][0] + A[1][1] + A[2][2];
        int sum7 = A[0][2] + A[1][1] + A[2][0];


        return sum0 == sum1 && sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5 && sum5 == sum6 && sum6 == sum7;
    }
}
