package LeetCode_729;

import java.util.LinkedList;
import java.util.List;

public class MyCalendar {

    private List<int[]> myCalender = new LinkedList<>();

    public MyCalendar() {

    }

    //有三种情况是不能安排的,两个交叉,和一个包含,因此使用不想交的反例更容易
    public boolean book(int start, int end) {
        for (int[] iterable : myCalender) {
            if (!(start >= iterable[1] || end <= iterable[0])) {
                return false;
            }
        }
        int[] tmp = new int[2];
        tmp[0] = start;
        tmp[1] = end;
        myCalender.add(tmp);
        return true;
    }

    public static void main(String[] args) {
        System.out.println("kkk");
    }
}
