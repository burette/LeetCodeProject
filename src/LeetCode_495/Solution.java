package LeetCode_495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        int length = timeSeries.length;
        result = duration*length;
        for(int i =1;i<length;i++){
            if(timeSeries[i]-timeSeries[i-1]<duration){
                result -= (duration-(timeSeries[i]-timeSeries[i-1]));
            }
        }
        return result;
    }
}
