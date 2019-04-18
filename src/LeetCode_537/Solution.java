package LeetCode_537;

public class Solution {
    public static String complexNumberMultiply(String a, String b) {
        int c, d, e, f;

        String[] strings = a.split("\\+");
        c = Integer.valueOf(strings[0]);
        d = Integer.valueOf(strings[1].replace("i", ""));

        strings = b.split("\\+");
        e = Integer.valueOf(strings[0]);
        f = Integer.valueOf(strings[1].replace("i", ""));

        int g = c * e - d * f;
        int h = c * f + d * e;
        String result = String.valueOf(g) + "+" + String.valueOf(h) + "i";
        return result;
    }

    public static void main(String[] args) {
    }

}
