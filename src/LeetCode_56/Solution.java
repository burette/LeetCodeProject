package LeetCode_56;

import java.util.*;

public class Solution {
    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start > o2.start) {
                    return 1;
                } else if (o1.start == o2.start) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        List<Interval> result = new ArrayList<>();
        int length = intervals.size();
        if (intervals.isEmpty()) {
            return null;
        }

        result.add(intervals.get(0));

        for (int i = 1; i < length; i++) {
            if (result.get(result.size() - 1).end >= intervals.get(i).start) {
                result.set(result.size() - 1, new Interval(result.get(result.size() - 1).start, Math.max(intervals.get(i).end, result.get(result.size() - 1).end)));
            } else {
                result.add(intervals.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 3));
        list.add(new Interval(2, 6));
        list.add(new Interval(8, 10));
        list.add(new Interval(15, 18));
        System.out.println(merge(list));
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}