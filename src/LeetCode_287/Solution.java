package LeetCode_287;

import java.util.Arrays;

public class Solution {
    public int findDuplicate(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum-(1+nums.length)*nums.length/2;
    }
}
