package LeetCode_11;

public class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}
