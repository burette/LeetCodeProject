package LeetCode_513;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = new TreeNode(root.val);
        while (!queue.isEmpty()) {
            node = queue.peek();
            queue.remove();
            if (node.right != null) {
                queue.add(root.right);
            }
            if (node.left != null) {
                queue.add(root.left);
            }
        }
        return node.val;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

//* Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}