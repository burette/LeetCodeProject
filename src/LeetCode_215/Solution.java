package LeetCode_215;

import java.util.PriorityQueue;

/**
 * @Author: burette
 * @Date: 2019/5/30 10:11
 */
public class Solution {
    //小顶堆，时间复杂度O（NlogK）
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
