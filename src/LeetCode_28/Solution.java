package LeetCode_28;

public class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 || haystack.equals(needle)) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int i1 = i;
            int j = 0;
            while (haystack.charAt(i1) == needle.charAt(j)) {
                i1++;
                j++;
                if (j == needle.length() ) {
                    break;
                }
            }
            if (j == needle.length() ) {
                return i;
            }
        }
        return -1;
    }
}
