package LeetCode_53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int length = nums.length;
        int sum = nums[0];
        for (int i = 1; i < length; i++) {
            if (sum+nums[i] < nums[i]) {
                sum = nums[i];
            }else {
                sum = sum+nums[i];
            }
            result = Math.max(result,sum);
        }
        return result;
    }
}
