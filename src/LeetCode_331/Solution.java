package LeetCode_331;

import java.util.Stack;

public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack = new Stack<>();
        String[] strings = preorder.split(",");
        for(int i=0;i<strings.length;i++){
            if(strings[i].equals("#") && stack.peek().equals("#")) {
                stack.pop();
                stack.pop();
                if (stack.peek().equals("#")){
                    stack.pop();
                    stack.pop();
                    stack.push("#");
                }
                else {
                    stack.push("#");
                }
            }
            else {
                stack.push("#");
            }
        }
        if(stack.size()==1&&stack.peek().equals("#")){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("9,3,4,#,#,1,#,#,2,#,6,#,#".split(","));
    }
}