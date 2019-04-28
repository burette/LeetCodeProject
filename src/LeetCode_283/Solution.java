package LeetCode_283;

public class Solution {

    //利用循环的思想
//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                ;
//            } else {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] != 0) {
//                        int temp = nums[j];
//                        nums[j] = nums[i];
//                        nums[i] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//    }

    //利用双指针的思想,算法明显优于上面
    public void moveZeroes(int[] nums) {

        int i = 0, j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
