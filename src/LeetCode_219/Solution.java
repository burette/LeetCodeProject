package LeetCode_219;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int length = nums.length;
        if (k >= length) {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        } else {

            for (int i = 0; i < length - k; i++) {
                for (int j = i + 1; j <= k + i + 1 && j < length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
