package LeetCode_622;

public class MyCircularQueue1 {
    /** Initialize your data structure here. Set the size of the queue to be k. */
    private int [] queue;
    private int front;
    private int rear;
    private int MAXSIZE;
    private int count;

    public MyCircularQueue1(int k) {
        queue = new int[k];
        front = 1;
        rear = 0;
        MAXSIZE = k;
        count = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        else {
            queue[rear] = value;
            rear = (rear + 1) % MAXSIZE;
            count++;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        else {
            front = (front + 1) % MAXSIZE;
            count--;
            return true;
        }

    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[(front+MAXSIZE) % MAXSIZE];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if ((isEmpty())){
            return -1;
        }
        return queue[(rear-1+MAXSIZE) % MAXSIZE];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(count == MAXSIZE){
            return true;
        }
        return false;
    }
}
