package LeetCode_461;

public class Solution {
    public int hammingDistance(int x, int y) {
//        String xx = toBinaryString(x);
//        String yy = toBinaryString(y);

        //数字的汉明距离就是 xXORy中1的个数
        int val = x ^ y;
        int res = 0;
        while (val != 0) {
            res++;
            val &= val - 1;
        }
        return res;
    }

    public static String toBinaryString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n % 2);
        n /= 2;
        while (n != 0) {
            stringBuilder.insert(0, n % 2);
            n = n / 2;
        }
        return stringBuilder.toString();
    }
}
