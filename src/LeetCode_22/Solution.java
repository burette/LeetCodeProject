package LeetCode_22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void parentheses(String sublist, List<String> results, int leftnum, int rightnum) {
        if (leftnum == 0 && rightnum == 0) { //结束
            results.add(sublist);
        }
        if (rightnum > leftnum) {   //选择和条件,对于不同的if顺序,输出的结果顺序是不一样的,但是构成一样的解空间
            parentheses(sublist + ")", results, leftnum, rightnum - 1);
        }
        if (leftnum > 0) {
            parentheses(sublist + "(", results, leftnum - 1, rightnum);
        }
    }

    public List<String> generateParenthesis(int n) {
        int leftnum = n, rightnum = n;
        List<String> results = new ArrayList<>();
        parentheses("", results, leftnum, rightnum);
        return results;
    }
}
