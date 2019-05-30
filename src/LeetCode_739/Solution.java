package LeetCode_739;

import java.util.Stack;

public class Solution {
    //暴力的解法，双重循环，往后走
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        for (int i = 0; i <T.length ; i++) {
            for (int j = i+1; j <T.length ; j++) {
                if (T[j]>T[i]){
                    result[i] = j-i;
                    break;
                }
            }
        }
        return result;
    }
}
