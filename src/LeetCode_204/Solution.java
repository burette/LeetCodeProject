package LeetCode_204;

public class Solution {

    //暴力的解法
    //只对奇数进行统计，
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int num = 1;
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i)) {
                num++;
            }
        }
        return num;
    }

    //因为保证了传进来的都是奇数，因此i从3开始，并且是i+=2
    public boolean isPrime(int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public int countPrimes(int n) {
//
//        if (n <= 2) {
//            return 0;
//        }
//        int[] num = new int[n + 1];
//        num[0] = 0;
//        num[1] = 0;
//        num[2] = 0;
//        int count = 0;
//        for (int i = 2; i < n; i++) {
//            if (num[i] == 0) {
//                if (isPrime(i)) {
//                    count++;
//                    for (int j = i; j < n; j += i) {
//                        num[j] = 1;
//                    }
//                }
//            }
//
//        }
//        return count;
//    }
//
//    public boolean isPrime(int n) {
//        for (int i = 2; i * i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
