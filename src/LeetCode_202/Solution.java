package LeetCode_202;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean isHappy(int n) {
        List<Integer> list = new LinkedList<>();
        list.add(n);
        while (n >= 1) {
            if (n == 1) {
                return true;
            } else {
                //进行计算时用newNum来记录为和，计算完成之后将n更新为newNum,并将n插入到list中，查看是否存在
                int newNum = 0;
                while (n > 0) {
                    newNum += (n % 10) * (n % 10);
                    n /= 10;
                }
                n = newNum;
                if (list.contains(n)) {
                    return false;
                } else {
                    list.add(n);
                }
            }
        }
        return false;
    }
}
