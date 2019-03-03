package LeetCode_844;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        if(f(S).equals(f(T))){
            return true;
        }
        else {
            return false;
        }
    }
    public String f(String S){
        Stack<Character> stackS = new Stack<>();
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i) == '#'){
                if(!stackS.empty()){
                    stackS.pop();
                }
            }
            else {
                stackS.push(S.charAt(i));
            }
        }
        String res = new String("");
        while(!stackS.empty()){
            res = stackS.pop() + res;
        }
        return res;
    }
}
