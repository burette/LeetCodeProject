package LeetCode_999;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    boolean flag = true;
                    for (int k = j; k > 0; k--) {
                        if (board[i][k] == 'B') {
                            flag = false;
                        }
                        if (board[i][k] == 'p' && flag == true) {
                            result++;
                            break;
                        }
                    }
                    flag = true;
                    for (int k = j; k < n; k++) {
                        if (board[i][k] == 'B') {
                            flag = false;
                        }
                        if (board[i][k] == 'p' && flag == true) {
                            result++;
                            break;
                        }
                    }
                    flag = true;
                    for (int k = i; k > 0; k--) {
                        if (board[k][j] == 'B') {
                            flag = false;
                        }
                        if (board[k][j] == 'p' && flag == true) {
                            result++;
                            break;
                        }
                    }
                    flag = true;
                    for (int k = j; k < m; k++) {
                        if (board[k][j] == 'B') {
                            flag = false;
                        }
                        if (board[k][j] == 'p' && flag == true) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
