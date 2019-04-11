package LeetCode_394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> data = new Stack<>();
        Stack<String> strings = new Stack<>();
        Stack<Character> flag = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '['){
                flag.push('[');
                if(i == 0){
                    data.push(1);
                }
            }
            if(s.charAt(i)>='1'&&s.charAt(i)<='1'){
                flag.push('[');
            }

        }
        return null;
    }
}
