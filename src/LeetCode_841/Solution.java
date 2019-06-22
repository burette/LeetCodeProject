package LeetCode_841;

import java.util.List;
import java.util.Stack;

/**
 * @Author: burette
 * @Date: 2019/6/22 14:30
 */
public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if (rooms == null || rooms.size() == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        for (Integer i : rooms.get(0)) {
            stack.push(i);
        }

        boolean[] isEnter = new boolean[rooms.size()];
        isEnter[0] = true;

        while (!stack.empty()) {
            int key = stack.pop();
            if (isEnter[key] == true) {
                continue;
            }
            isEnter[key] = true;
            for (int i : rooms.get(key)) {
                stack.push(i);
            }
        }
        boolean res = true;
        for (boolean r : isEnter) {
            if (!r) {
                res = false;
                break;
            }
        }
        return res;
    }
}
