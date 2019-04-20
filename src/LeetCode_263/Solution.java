package LeetCode_263;

public class Solution {
    public boolean isUgly(int num) {

        while (num > 0) {
            if (num == 1) {
                return true;
            }
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
                return false;
            }
            if (num % 2 == 0) {
                num /= 2;
            }
            if (num % 3 == 0) {
                num /= 3;
            }
            if (num % 5 == 0) {
                num /= 5;
            }
        }
        return false;
    }
}
