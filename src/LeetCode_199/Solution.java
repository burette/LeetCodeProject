package LeetCode_199;


import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


//思路如下:从根节点开始记录,然后递归记录右子树,为right,左子树为left,如果left的长度
// 大于right,则将超过的一部分加到list里面来
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            List<Integer> right = new ArrayList<>();
            List<Integer> left = new ArrayList<>();
            if (root.right != null) {
                right = rightSideView(root.right);
            }
            if (root.left != null) {
                left = rightSideView(root.left);
            }
            list.addAll(right);
            if (right.size() < left.size()) {
                for (int i = right.size(); i < left.size(); i++) {
                    list.add(left.get(i));
                }
            }
            return list;
        }
        return list;
    }
}