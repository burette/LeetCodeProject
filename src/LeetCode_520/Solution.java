package LeetCode_520;

public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        if (word.charAt(0) <= 'z' && word.charAt(0) >= 'a') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A') {
                    flag = false;
                    return flag;
                }
            }
            return flag;
        }
        if (word.charAt(0) <= 'Z' && word.charAt(0) >= 'A') {
            if (word.length() >= 2) {

                if (word.charAt(1) <= 'Z' && word.charAt(1) >= 'A') {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) <= 'z' && word.charAt(i) >= 'a') {
                            flag = false;
                            return flag;
                        }
                    }
                    return flag;
                } else {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A') {
                            flag = false;
                            return flag;
                        }
                    }
                    return flag;
                }
            }
        }
        return flag;
    }
}
