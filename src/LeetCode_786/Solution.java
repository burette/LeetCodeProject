package LeetCode_786;

import java.util.PriorityQueue;

/**
 * @Author: burette
 * @Date: 2019/6/4 10:26
 */
public class Solution {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        PriorityQueue<Float> priorityQueue = new PriorityQueue<>();

        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (priorityQueue.size() < 3) {
                priorityQueue.add((float) (left) / (float) (right));
            } else {
                if ((float) (left) / (float) (right) < priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.add((float) (left) / (float) (right));

                }
            }
        }

        return null;
    }
}
