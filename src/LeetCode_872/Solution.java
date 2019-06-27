package LeetCode_872;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new LinkedList<>();
        leaves(root1, list1);
        List<Integer> list2 = new LinkedList<>();
        leaves(root2, list2);
        for (int i = 0, j = 0; i < list1.size() && j < list2.size(); i++, j++) {
            if (list1.get(i) != list2.get(j)) {
                return false;
            }
        }
        return true;
    }

    public void leaves(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                leaves(root.left, list);
            }
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }
            if (root.right != null) {
                leaves(root.right, list);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}