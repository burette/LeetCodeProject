package LeetCode_856;

import java.util.Stack;

public class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> data = new Stack<>();
        Stack<Character> string = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '('){
                string.push(S.charAt(i));
            }
            else {
                string.pop();
                if(string.empty()){
                    data.push(1);
                }
                if(!string.empty()){

                }
            }
        }
        return 0;
    }
}
