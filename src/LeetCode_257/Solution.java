package LeetCode_257;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            List<List<Integer>> lists = new LinkedList<>();
            List<Integer> temp = new LinkedList<>();
            temp.add(root.val);
            while (temp!=null){
                ;
            }
            return null;
        }
    }

    public String listToString(List<Integer> list) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            res.append(list.get(i));
            res.append("->");
        }
        res.append(list.get(list.size() - 1));
        return res.toString();
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