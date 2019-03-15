package LeetCode_98;


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

class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int length = list.size();
        for (int i = 1; i < length; i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }
}