package LeetCode_946;

import java.util.Stack;


//思路如下:
//先将出站序列倒叙一次入一个栈B,入栈序列一次入另一个栈A,当入栈元素等于B的栈顶元素的时候,
// 不入栈并且B出栈,一次至入站序列便利结束,此时比较A和B的站定元素,如果相等一次出栈,接着往下比,
// 如果出现不相等的情况,则说明序列不满足条件

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
                    if(T.peek().equals(S.peek())){
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
