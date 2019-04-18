package LeetCode_728;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isDiviedNum(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isDiviedNum(int n) {
        String num = String.valueOf(n);
        int length = num.length();
        int[] record = new int[length];
        for (int i = 0; i < length; i++) {
            record[i] = num.charAt(i) - '0';
        }
        for (int i = 0; i < length; i++) {
            if (record[i] == 0 || n % record[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
