package LeetCode_343;

public class Solution {
    public static int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] mem = new int[n + 1];
        mem[1] = 1;
        mem[2] = 2;
        mem[3] = 3;
        for (int i = 4; i <= n; i++) {
            int temp = mem[1] * mem[i - 1];
            for (int j = 1; j <= i / 2; j++) {
                // temp = Math.max(mem[j] * mem[i - j], temp);
                temp = (temp < mem[j] * mem[i - j]) ? mem[j] * mem[i - j] : temp;
            }
            mem[i] = temp;
        }
        return mem[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
