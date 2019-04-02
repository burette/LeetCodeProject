package LeetCode_17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String[] a = new String[]{"", "", "abc", "def",
            "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static StringBuffer sb = new StringBuffer();

    public static void zuhe(String digits, int n, List<String> results) {
        if (n == digits.length()) {
            results.add(sb.toString());
            return;
        }
        for (int i = 0; i < a[digits.charAt(n) - '0'].length(); i++) {
            sb.append((a[digits.charAt(n) - '0']).charAt(i));
            zuhe(digits, n + 1, results);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<String>();
        if (digits.length()==0){
            results.clear();
            return results;
        }
        zuhe(digits, 0, results);
        return results;
    }
}
