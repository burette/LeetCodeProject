package LeetCode_836;

/**
 * @Author: burette
 * @Date: 2019/5/27 16:14
 */
public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[2] > rec2[0] && rec1[3] > rec2[1] && rec2[2] > rec1[0] && rec2[3] > rec1[1];
    }
}
