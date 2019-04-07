package LeetCode_120;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int temp = triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, temp);
            }
        }
        return triangle.get(0).get(0);
    }


//    public int minimumTotal(List<List<Integer>> triangle) {
//        int result = 0;
//        int mem[] = new int[triangle.size()];
//        if (triangle.size() == 0) {
//            return 0;
//        }
//        mem[0] = triangle.get(0).get(0);
//        for (int i = 1; i < triangle.size(); i++) {
//            int index = triangle.get(i - 1).indexOf(mem[i - 1]);
//            mem[i] = Math.min(triangle.get(i).get(index), triangle.get(i).get(index + 1));
//        }
//        for (int i = 0; i < mem.length; i++) {
//            result += mem[i];
//        }
//        return result;
//    }
}
