package LeetCode_150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> integers = new Stack<>();
        int result;
        for(int i = 0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = integers.pop();
                int b = integers.pop();
                integers.push(b+a);
            }
            else if(tokens[i].equals("-")){
                int a = integers.pop();
                int b = integers.pop();
                integers.push(b-a);
            }
            else if(tokens[i].equals("*")){
                int a = integers.pop();
                int b = integers.pop();
                integers.push(b*a);
            }
            else if(tokens[i].equals("/")){
                int a = integers.pop();
                int b = integers.pop();
                integers.push(b/a);
            }
            else{
                integers.push(Integer.parseInt(tokens[i]));
            }
        }
        result = integers.pop();
        return result;
    }
}
