package LeetCode_220;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int length = nums.length;
        if (k >= length) {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    long a = nums[i];
                    long b = nums[j];
                    long tmp = Math.abs(a - b);
                    long c = t;
                    if (tmp <= c) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < k + i + 1 && j < length; j++) {
                    long a = nums[i];
                    long b = nums[j];
                    long tmp = Math.abs(a - b);
                    long c = t;
                    if (tmp <= c) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
