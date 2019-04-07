package LeetCode_507;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == 1) {
                    list.add(1);
                } else {
                    list.add(i);
                    list.add(num / i);
                }
            }
        }
        for (Integer integer : list) {
            num -= integer;
        }
        return num == 0;
    }
}
