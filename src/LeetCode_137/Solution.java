package LeetCode_137;

public class Solution {
    public int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            two = two | (one & nums[i]);
            one = one ^ nums[i];

            int three = two & one;
            two = two ^ three;
            one = one ^ three;
        }
        return one | two;
    }
}
