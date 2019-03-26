package LeetCode_136;

public class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        int result = nums[0];
        for (int i = 1; i < length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
