package LeetCode_3;

/**
 * @Author: burette
 * @Date: 2019/6/3 11:17
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0;
        int r = -1;
        int size = s.length();
        int res = 0;
        while(l<size) {
            if(r+1<size && freq[s.charAt(r+1)] == 0) {
                freq[s.charAt(r+1)]++;
                r++;
            }
            else {
                freq[s.charAt(l)]--;
                l++;
            }
            res = res>r-l+1?res:r-l+1;
        }
        return res;
    }
}
