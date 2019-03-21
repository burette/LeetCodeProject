package LeetCode_763;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> partitionLabels(String S) {
        int length = S.length();
        int[] maxIndex = new int[26];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            maxIndex[S.charAt(i) - 'a'] = i;
        }

        int i = 0;
        int maxSubIndex = 0;
        while (i < length) {
            maxSubIndex = maxIndex[S.charAt(i) - 'a'];
            for (int j = i + 1; j <= maxSubIndex && j < length; j++) {
                if (maxIndex[S.charAt(j) - 'a'] > maxSubIndex) {
                    maxSubIndex = maxIndex[S.charAt(j) - 'a'];
                }
            }
            result.add(maxSubIndex - i + 1);
            i = maxSubIndex + 1;
        }
        return result;
    }
}
