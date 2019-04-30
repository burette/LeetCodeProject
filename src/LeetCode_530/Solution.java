package LeetCode_530;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    private static List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            res = Math.min(res, list.get(i) - list.get(i - 1));
        }
        return res;
    }

    public static void traversal(TreeNode root) {
        if (root != null) {
            traversal(root.left);
            list.add(root.val);
            traversal(root.right);
        }
    }
}
