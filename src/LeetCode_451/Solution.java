package LeetCode_451;

import sun.awt.datatransfer.DataTransferer;

import java.util.*;

/**
 * @Author: burette
 * @Date: 2019/5/31 9:19
 */
public class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<Character, Integer> entry : list) {

            for (int i = 0; i < entry.getValue(); i++) {
                stringBuffer.append(entry.getKey());
            }
        }
        return stringBuffer.toString();
    }
}
