package LeetCode_852;

public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int i =1;i<A.length;i++){
            if(A[i-1] > A[i]){
                return i-1;
            }
        }
        return 0;
    }
}
