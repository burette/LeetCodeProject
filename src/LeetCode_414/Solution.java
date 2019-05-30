package LeetCode_414;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: burette
 * @Date: 2019/5/30 10:15
 */
public class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.contains(nums[i])) {
                ;
            } else {
                priorityQueue.add(nums[i]);
                if (priorityQueue.size() > 3) {
                    priorityQueue.poll();
                }
            }
        }
        if (priorityQueue.size() < 3) {
            while (priorityQueue.size() != 1) {
                priorityQueue.poll();
            }
            return priorityQueue.peek();
        } else {
            return priorityQueue.peek();
        }
    }
}
