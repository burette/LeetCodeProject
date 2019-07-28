package LeetCode_103;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: burette
 * @Date: 2019/7/28 20:25
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// 通过所在的层级来判断正反顺序，如果所在为偶数层，则使用add(),反之使用addFirst()
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (level % 2 == 0) {
                    list.add(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
            level++;
        }
        return res;
    }
}
