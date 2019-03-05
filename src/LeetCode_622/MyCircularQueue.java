package LeetCode_622;



//这个是参考网上的解法,自己之前的一直过不去
class MyCircularQueue {

    private int[] content;
    private int head;
    private int tail;
    private int length;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        length = k+1;
        content = new int[k+1];
        head = 0;
        tail = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        content[tail] = value;
        tail = (tail+1)%length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        head = (head+1)%length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return content[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return content[(tail-1+length)%length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head==tail;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (tail+1)%length==head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */