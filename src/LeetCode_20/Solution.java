package LeetCode_20;

import java.util.Stack;

/**
 * @Author: burette
 * @Date: 2019/6/3 11:14
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                st.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                if(st.isEmpty()!=true&&st.lastElement() == '(')
                    st.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == ']') {
                if(st.isEmpty()!=true&&st.lastElement() == '[')
                    st.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == '}') {
                if(st.isEmpty()!=true&&st.lastElement() == '{')
                    st.pop();
                else
                    return false;
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}
