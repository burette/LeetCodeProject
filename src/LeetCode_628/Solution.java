package LeetCode_628;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: burette
 * @Date: 2019/5/27 9:35
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[length - 1] * nums[length - 2] * nums[length - 3], nums[length - 1] * nums[0] * nums[1]);
    }
}
