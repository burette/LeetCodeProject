package LeetCode_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0,j=0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k]!=val){
                nums[j++] = nums[k];
            }
        }
        return j;
    }
}
