package LeetCode_155;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinStack {

    /** initialize your data structure here. */
    private List<Integer> list;
    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
        Collections.sort(list);
    }

    public void pop() {
        if(!list.isEmpty())
            list.remove(0);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return list.get(0);
    }
}
