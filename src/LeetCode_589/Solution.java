package LeetCode_589;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            list.add(root.val);
            if (root.children.size() != 0) {
                for (Node node : root.children) {
                    List<Integer> temp = new LinkedList<>(preorder(node));
                    for (Integer integer : temp) {
                        list.add(integer);
                    }
                }
            }
        }
        return list;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}