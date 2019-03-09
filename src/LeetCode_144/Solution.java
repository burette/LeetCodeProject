package LeetCode_144;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
     }

    public void preorder(TreeNode root ,List<Integer> list){
        if(root!=null){
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
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