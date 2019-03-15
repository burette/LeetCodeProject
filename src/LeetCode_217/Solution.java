package LeetCode_217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1){
            return false;
        }
        else {
            Set<Integer> set = new HashSet<>(nums.length);
            for(int i: nums){
                if(set.contains(i)){
                    return true;
                }
                else {
                    set.add(i);
                }
            }
        }
        return false;
    }
}