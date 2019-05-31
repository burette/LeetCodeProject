package LeetCode_496;

/**
 * @Author: burette
 * @Date: 2019/5/28 18:21
 */
public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = 0;
            boolean flag = true;
            int j;
            for (j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    flag = false;
                }
                if (!flag && nums2[j] > nums1[i]) {
                    break;
                }
            }
            if (j == nums2.length) {
                result[i] = -1;
            } else {
                result[i] = j - index;
            }
        }
        return result;
    }
}
