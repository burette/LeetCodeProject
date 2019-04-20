package LeetCode_207;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] G = new int[numCourses][numCourses];
        for (int[] iter : prerequisites) {
            G[iter[1]][iter[0]] = 1;
        }

        return false;
    }
}