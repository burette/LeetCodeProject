package LeetCode_654;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(0, nums.length - 1, nums);
    }

    public TreeNode dfs(int left, int right, int[] nums) {
        if (right < left) {
            return null;
        } else {
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = left; i <= right; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    idx = i;
                }
            }
            TreeNode node = new TreeNode(max);
            node.left = dfs(left, idx - 1, nums);
            node.right = dfs(idx + 1, right, nums);
            return node;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
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
