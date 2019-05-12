package LeetCode_657;

public class Solution {
    public boolean judgeCircle(String moves) {
        int a = 0, b = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    a++;
                    break;
                case 'R':
                    a--;
                    break;
                case 'U':
                    b++;
                    break;
                case 'D':
                    b--;
                    break;
            }
        }
        return (a == 0) && (b == 0);
    }
}
