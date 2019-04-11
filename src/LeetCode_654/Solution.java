package LeetCode_654;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root;
        int max = Arrays.stream(nums).max().getAsInt();

        return null;
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
