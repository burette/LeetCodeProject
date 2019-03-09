package LeetCode_875;

import java.util.Arrays;

//先将数组进行排序,如果小时数等于数组的长度,显然直接最大值即可
//最后的结果肯定是在1<piles[piles.length-1]之间的,因此进行二分查找,
// 写个函数判断此时的piles[k]是否可以完成任务.若可以则右边的都可以
//若不可以,则左边的及本身都不可以,往右边移动,
public class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        Arrays.sort(piles);
        if (H == piles.length) {
            return piles[piles.length - 1];
        }
        int left = 1;
        int right = piles[piles.length - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (succeed(piles, H, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean succeed(int[] piles, int H, int k) {
        int time = 0;
        for (int num : piles) {
            if (num % k != 0) {
                time++;
            }
            time += num / k;
        }
        return time <= H;
    }
}