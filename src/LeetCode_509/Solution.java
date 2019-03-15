package LeetCode_509;

public class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int[] result = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[N];
    }
}
