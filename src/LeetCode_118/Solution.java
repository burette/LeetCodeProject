package LeetCode_118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: burette
 * @Date: 2019/6/8 22:22
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    Integer a = list.get(i - 1).get(j - 1);
                    Integer b = list.get(i - 1).get(j);
                    temp.add(a + b);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
