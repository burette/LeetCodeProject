package LeetCode_704;

public class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while (i <= j) {  //等于的时候处理了长度为1的数组
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                i = mid + 1;
            }
            if (target < nums[mid]) {
                j = mid - 1;
            }
        }
        return -1;
    }
}
