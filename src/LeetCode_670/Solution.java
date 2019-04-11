package LeetCode_670;

import java.util.Arrays;

public class Solution {
    public int maximumSwap(int num) {
        String str = new String(((Integer) num).toString());
        int[] nums = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            // 遍历str将每一位数字添加如intArray
            Character ch = str.charAt(i);
            nums[i] = Integer.parseInt(ch.toString());
        }

        return 0;
    }
}
