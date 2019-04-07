package LeetCode_279;

public class Solution {
    public static int numSquares(int n) {
        int[] mem = new int[n + 1];
        mem[1] = 1;
        for (Integer i = 2; i <= n; i++) {
            if (iswanquan(i)) {
                mem[i] = 1;
            } else {
                int temp = Integer.MAX_VALUE;
                for (int j = 1; j < i; j++) {
                    temp = Math.min(mem[j] + mem[i - j], temp);
                }
                mem[i] = temp;
            }
        }
        return mem[n];
    }

    public static boolean iswanquan(int num) {
        for (int x = 1; x <= num / 2; x++) {
            if (x * x == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        numSquares(5);
    }
}
