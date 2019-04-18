package LeetCode_866;

public class Solution {
    public int primePalindrome(int N) {
        if (N == 1) {
            return 2;
        }
        int num = N;
        while (true) {
            if (isPalindrome(num) & isPrime(num)) {
                return num;
            }
            if (num % 2 == 0) {
                num++;
            } else {
                num += 2;
            }
        }
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int n) {
        String string1 = String.valueOf(n);
        String string2 = new String(new StringBuilder(string1).reverse().toString());
        return string1.equals(string2);
    }
}
