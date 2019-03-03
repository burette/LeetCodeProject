package LeetCode_921;

import java.util.Stack;

public class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == ')'){
                if(!stack.empty() && stack.peek()=='('){
                    stack.pop();
                }
                else {
                    stack.push(S.charAt(i));
                }
            }
            else {
                stack.push(S.charAt(i));
            }
        }
        return stack.size();
    }
}
