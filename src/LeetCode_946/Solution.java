package LeetCode_946;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> T = new Stack<>();
        for(int i=popped.length-1;i>=0;i--){
            T.push(popped[i]);
        }
        Stack<Integer> S = new Stack<>();
        for(int i=0;i<pushed.length;i++){
            if(pushed[i] == T.peek()){
                T.pop();
                while(!T.empty() && !S.empty()){
                    if(T.peek() == S.peek()){
                        T.pop();
                        S.pop();
                    }
                    else {
                        break;
                    }
                }
            }
            else {
                S.push(pushed[i]);
            }
        }
        return T.equals(S);
    }
}
