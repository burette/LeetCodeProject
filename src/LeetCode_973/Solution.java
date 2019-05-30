package LeetCode_973;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: burette
 * @Date: 2019/5/30 9:35
 */
public class Solution {
    public int[][] kClosest(int[][] points, int K) {

        int[][] result = new int[K][2];

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o1[0] + o1[1] * o1[1] - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        for (int i = 0; i < K; i++) {
            result[i] = points[i];
        }
        return result;
    }
}
