package LeetCode_684;

public class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int[][] G = new int[edges.length][edges.length];
        for (int[] iter : edges) {
            G[iter[1]][iter[0]] = 1;
        }



        return null;
    }
}
