package LeetCode_336;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: burette
 * @Date: 2019/5/31 10:25
 */
public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> res = new LinkedList<>();

        HashSet<String> set = new HashSet<>(); //用于存储拼接成的字符串

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(words[i]);
                    stringBuffer.append(words[j]);
                    if (!set.contains(stringBuffer)) {
                        if (isHuiwen(stringBuffer.toString())) {
                            List<Integer> temp = new LinkedList<>();
                            temp.add(i);
                            temp.add(j);
                            res.add(temp);
                        }
                    }
                }
            }
        }
        return res;
    }

    public boolean isHuiwen(String string) {
        int len = string.length();
        for (int i = 0; i < len / 2; i++) {
            if (string.charAt(i) != string.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
