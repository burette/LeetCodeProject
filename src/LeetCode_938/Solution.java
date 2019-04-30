package LeetCode_938;


class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        } else {
            if (root.val > R) {
                return rangeSumBST(root.left, L, R);
            } else if (root.val < L) {
                return rangeSumBST(root.right, L, R);
            } else {
                return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
            }
        }
    }
}
