package LeetCode_508;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: burette
 * @Date: 2019/6/4 10:41
 */
public class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        TreeNode node = reverse(root);
        Map<Integer, Integer> map = reverse1(node);
        Map.Entry<Integer, Integer> res = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > res.getValue()) {
                res = entry;
            }
        }

        return null;
    }

    public TreeNode reverse(TreeNode root) {
        while (root != null) {
            reverse(root.left);
            reverse(root.right);
            if (root.left == null && root.right == null) {
                ;
            } else if (root.left != null && root.right == null) {
                root.val = root.val + root.left.val;
            } else if (root.left == null && root.right != null) {
                root.val = root.val + root.right.val;
            } else {
                root.val = root.val + root.right.val + root.left.val;
            }
        }
        return root;
    }

    public Map<Integer, Integer> reverse1(TreeNode node) {
        Map<Integer, Integer> map = new HashMap<>();
        while (node != null) {
            if (map.containsKey(node.val)) {
                map.put(node.val, map.get(node.val) + 1);
            } else {
                map.put(node.val, 1);
            }
            Map<Integer, Integer> map1 = reverse1(node.left);
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (map.containsKey(entry.getKey())) {
                    map.put(entry.getKey(), entry.getValue() + map.get(entry.getKey()));
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            Map<Integer, Integer> map2 = reverse1(node.right);
            for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
                if (map.containsKey(entry.getKey())) {
                    map.put(entry.getKey(), entry.getValue() + map.get(entry.getKey()));
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return map;
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
