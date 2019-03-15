package LeetCode_110;


import static java.lang.Math.abs;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public static int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = getMaxDepth(root.left);
            int right = getMaxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            int left = getMaxDepth(root.left);
            int rigth = getMaxDepth(root.right);
            if(abs(left-rigth)<=1){
                return isBalanced(root.right)&& isBalanced(root.left);
            }
            return false;
        }
        return true;
    }
}