package LeetCode_231;

/**
 * @Author: burette
 * @Date: 2019/6/9 10:44
 */
public class Solution {
//    public boolean isPowerOfTwo(int n) {
//        if (n == 1) {
//            return true;
//        } else {
//            if ((n & 1) == 1) {
//                return false;
//            } else {
//                return isPowerOfTwo(n / 2);
//            }
//        }
//    }

    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & -n) == n;
    }

    public static void main(String[] args) {

    }
}
