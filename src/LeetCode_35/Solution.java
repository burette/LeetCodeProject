package LeetCode_35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        if(target > nums[right]){
            return right + 1;
        }
        if(target < nums[left]){
            return 0;
        }
        while (left < right) {
            mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target == nums[mid]) {
                return mid + 1;
            }
        }
        return mid;
    }
}
