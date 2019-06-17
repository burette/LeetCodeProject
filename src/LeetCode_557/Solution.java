package LeetCode_557;

import java.util.List;

/**
 * @Author: burette
 * @Date: 2019/6/17 10:32
 */
public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(new StringBuffer(strings[i]).reverse().toString());
            if (i < strings.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
