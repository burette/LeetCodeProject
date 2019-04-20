package LeetCode_258;

public class Solution {
    public int addDigits(int num) {
        //在长度大于1时进行计算
        while (String.valueOf(num).length() > 1) {
            int sum = 0;
            int temp = num;
            //对每个位数进行加和
            while (temp > 0) {
                sum = sum + temp % 10;
                temp /= 10;
            }
            num = sum;
        }

        return num;
    }
}
