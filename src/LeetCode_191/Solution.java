package LeetCode_191;

/**
 * @Author: burette
 * @Date: 2019/6/8 22:51
 */
public class Solution {
//    public int hammingWeight(int n) {
//        String string = Integer.toBinaryString(n);
//        int len = string.length();
//        int res = 0;
//        for (int i = 0; i < len; i++) {
//            if (string.charAt(i) == '1') {
//                res++;
//            }
//        }
//        return res;
//    }

    public int hammingWeight(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 2;
            n >>= 1;
        }
        return res;
    }
}
