package LeetCode_384;

import java.util.Random;

/**
 * @Author: burette
 * @Date: 2019/5/27 15:41
 */
public class Solution {
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return this.nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        if (this.nums.length == 0) {
            return null;
        }
        int[] result = new int[this.nums.length];
        int i = 0;
        Random random = new Random();
        int start = random.nextInt(this.nums.length);
        while (i < this.nums.length) {
            result[i++] = nums[(start++) % nums.length];
        }
        return result;
    }
}
