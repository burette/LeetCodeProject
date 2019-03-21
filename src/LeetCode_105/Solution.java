package LeetCode_105;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        else {
            TreeNode root = new TreeNode(preorder[0]);
//            root.left = buildTree(,System.arraycopy(inorder,0,getIndex(inorder,root.val),))
        }
        return null;
    }
    public int getIndex(int[] array,int value){
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
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