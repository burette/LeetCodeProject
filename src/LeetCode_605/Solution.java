package LeetCode_605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if(n == 0){
            return true;
        }
        if (flowerbed.length < n * (n - 1)) {
            return false;
        }

        int count = n;
        if (length < 3) {
            for (int i = 0; i < length; i++) {
                if (flowerbed[i] == 1) {
                    count++;
                }
            }
            if (count == 0) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = 0; i < length ; i += 2) {
            if (i == 0) {
                if (flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 1) {
                    count--;
                }
            }
            else if(i == length-1){
                if(flowerbed[i] == 0&&flowerbed[i-1] == 0){
                    count --;
                }
            }
            else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    count--;
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
