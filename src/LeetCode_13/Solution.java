package LeetCode_13;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        List<Integer> numbers=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char cc = s.charAt(i);
            if(cc == 'I'){
                numbers.add(1);
            }
            else if(cc == 'V'){
                numbers.add(5);
            }
            else if(cc == 'X'){
                numbers.add(10);
            }
            else if (cc == 'L'){
                numbers.add(50);
            }
            else if(cc == 'C'){
                numbers.add(100);
            }
            else if(cc == 'D'){
                numbers.add(500);
            }
            else {
                numbers.add(1000);
            }
        }
        for (int i=0;i<numbers.size();i++){
            if(i<numbers.size()-1 && numbers.get(i) < numbers.get(i+1) ){
                result -= numbers.get(i);
            }
            else{
                result += numbers.get(i);
            }
        }
        return result;
    }
}
