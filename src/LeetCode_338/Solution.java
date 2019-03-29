package LeetCode_338;

public class Solution {
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 1) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = result[i / 2];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = countBits(2);
        for (Integer integer : temp) {
            System.out.println(integer);
        }
    }
}
