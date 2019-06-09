package LeetCode_119;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: burette
 * @Date: 2019/6/8 22:34
 */
public class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    Integer a = list.get(j - 1);
                    Integer b = list.get(j);
                    temp.add(a + b);
                }
            }
            list = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
