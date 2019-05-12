package LeetCode_929;

import org.junit.Test;

import java.util.HashSet;

public class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();
        for (String string : emails) {
            String temp = f(string);
            set.add(temp);
        }
        return set.size();
    }

    public String f(String email) {
        int length = email.length();
        int index = email.indexOf('@');

        String res = new String();
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if (i < index) {
                if (email.charAt(i) == '.') {
                    ;
                } else if (email.charAt(i) == '+') {
                    flag = false;
                } else {
                    if (flag == true) {
                        res += email.charAt(i);
                    } else {
                        ;
                    }
                }
            } else {
                res += email.charAt(i);
            }
        }
        return res;
    }
}
