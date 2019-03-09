package LeetCode_94;


import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
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