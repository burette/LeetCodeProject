package LeetCode_225;

import java.util.LinkedList;
import java.util.Queue;

//两个队列模拟栈:
//进栈:如果T为空,则进S;如果S为空,则进T
//出栈:如果T为空,则将S前size-1个移入到T中,最后一个出队列.反之亦然
//判空:两个队列都空
//求栈顶元素:与出栈相近,知识最后的元素还需要进入另一个队列并同时返回此元素

public class MyStack {
    /** Initialize your data structure here. */
    private Queue<Integer> queueT;
    private Queue<Integer> queueS;

    public MyStack() {
        queueT = new LinkedList<>();
        queueS = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(queueS.isEmpty()&&queueT.isEmpty()){
            queueT.add(x);
        }
        else {
            if(queueT.isEmpty()){
                queueS.add(x);
            }
            else {
                queueT.add(x);
            }
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queueS.isEmpty()&&queueT.isEmpty()){
            return -1;
        }
        else{
            if(queueT.isEmpty()){
                while (queueS.size()!=1){
                    queueT.add(queueS.poll());
                }
                return queueS.poll();
            }
            else {
                while (queueT.size()!=1){
                    queueS.add(queueT.poll());
                }
                return queueT.poll();
            }
        }
    }

    /** Get the top element. */
    public int top() {
        if(queueS.isEmpty()&&queueT.isEmpty()){
            return -1;
        }
        else{
            if(queueT.isEmpty()){
                while (queueS.size()!=1){
                    queueT.add(queueS.poll());
                }
                int res = queueS.poll();
                queueT.add(res);
                return res;
            }
            else {
                while (queueT.size()!=1){
                    queueS.add(queueT.poll());
                }
                int res = queueT.poll();
                queueS.add(res);
                return res;
            }
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queueT.isEmpty()&&queueS.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
