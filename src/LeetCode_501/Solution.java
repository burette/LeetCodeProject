package LeetCode_501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<Integer, Integer> map = new HashMap<>();
        inorder(root,map);

        return null;

    }
    void inorder(TreeNode root, Map map){
        if(root!=null){
            inorder(root.left,map);
            if(map.containsKey(root.val)){
                map.put(root.val,(int)map.get(root.val)+1);
            }
            inorder(root.right,map);
        }
    }
}