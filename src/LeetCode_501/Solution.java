package LeetCode_501;

import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int[] findMode(TreeNode root) {

        List<Integer> list = inorder(root);

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }

        return null;

    }

    List<Integer> inorder(TreeNode root) {
        if (root != null) {
            List<Integer> ret = new LinkedList<>();
            ret.add(root.val);
            List<Integer> left = inorder(root.left);
            for (Integer i : left) {
                ret.add(i);
            }
            List<Integer> right = inorder(root.right);
            for (Integer i : right) {
                ret.add(i);
            }
            return ret;
        }
        return null;
    }
}