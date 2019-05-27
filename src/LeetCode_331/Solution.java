package LeetCode_331;

import java.util.Stack;

public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack = new Stack<>();
        String[] strings = preorder.split(",");
        if (strings.length == 0) {
            return true;
        }
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("#")) {
                stack.push(strings[i]);
            } else {
                while (stack.peek().equals("#")){
                    stack.pop();
                    stack.pop();
                }
                stack.push("#");
            }
        }
        if (stack.size() == 1 && stack.peek().equals("#")) {
            return true;
        } else {
            return false;
        }
    }
}