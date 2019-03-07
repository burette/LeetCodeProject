package LeetCode_349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set set1 = new HashSet<Integer>();
        Set set2 = new HashSet<Integer>();
        for(int i = 0;nums1 != null && i < nums1.length;i++){
            set1.add(nums1[i]);
        }

        for(int i=0;nums2!=null&&i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        if(set2.size() == 0){
            return new int[0];
        }

        //遍历方式1：
        int[] result = new int[set2.size()];
        int i = 0;
        for(Object object : set2){
            result[i++] = ((Integer)object).intValue();
        }

//        //遍历方式2：
//        Iterator<Integer> integerIterator = set2.iterator();
//        while (integerIterator.hasNext()){
//            result[i++] = integerIterator.next();
//        }
        return result;
    }
}
