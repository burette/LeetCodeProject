package LeetCode_559;

import java.util.List;
import java.util.Map;

/**
 * @Author: burette
 * @Date: 2019/6/22 16:50
 */
public class Solution {
    public int maxDepth(Node root) {

        if (root == null) {
            return 0;
        } else {
            List<Node> list = root.children;
            int ret = 0;
            for (Node node : list) {
                int temp = maxDepth(node);
                ret = Math.max(ret, temp);
            }
            return ret + 1;
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
