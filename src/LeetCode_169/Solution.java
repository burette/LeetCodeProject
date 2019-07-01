package LeetCode_169;

public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > n / 2) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return 0;
    }
}
