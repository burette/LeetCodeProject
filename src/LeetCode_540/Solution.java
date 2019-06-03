package LeetCode_540;

/**
 * @Author: burette
 * @Date: 2019/6/3 19:55
 */

//数组中其他的元素都是两个出现，只有一个元素是唯一的，找出唯一的元素使用异或的方式

public class Solution {
    public int singleNonDuplicate(int[] nums) {

        //以下时间复杂度为O(N),空间复杂度为O（1）
//        int len = nums.length;
//        int res = nums[0];
//        for (int i = 1; i < len; i++) {
//            res = res ^ nums[i];
//        }
//
//        return res;

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];

    }
}
