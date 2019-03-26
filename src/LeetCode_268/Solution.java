package LeetCode_268;

public class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += nums[i];
        }
        return length * (length + 1) / 2 - result;
    }
}
