package LeetCode_429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: burette
 * @Date: 2019/7/28 18:27
 */
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                Node cur = nodeQueue.poll();
                temp.add(cur.val);
                if (cur != null) {
                    for (Node node : cur.children) {
                        nodeQueue.offer(node);
                    }
                }
            }
            res.add(temp);
        }
        return res;
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

