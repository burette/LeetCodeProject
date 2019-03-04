package LeetCode_232;


import java.util.Stack;

class MyQueue {

    /** Initialize your data structure here. */
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.empty()&&stack2.empty()){
            stack1.push(x);
        }
        else {
            if(stack1.empty()){
                stack2.push(x);
            }
            else {
                stack1.push(x);
            }
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack1.empty()){
            while (stack2.size()!=1){
                stack1.push(stack2.pop());
            }
            int res = stack2.pop();
            while (stack1.size() > 0){
                stack2.push(stack1.pop());
            }
            return res;
        }
        else {
            while (stack1.size()!=1){
                stack2.push(stack1.pop());
            }
            int res = stack1.pop();
            while (stack2.size() > 0){
                stack1.push(stack2.pop());
            }
            return res;
        }
    }

    /** Get the front element. */
    public int peek() {
        if(stack1.empty()){
            while (stack2.size()!=1){
                stack1.push(stack2.pop());
            }
            int res = stack2.pop();
            stack1.push(res);
            return res;
        }
        else {
            while (stack1.size()!=1){
                stack2.push(stack1.pop());
            }
            int res = stack1.pop();
            stack2.push(res);
            return res;
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack2.empty()&&stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */