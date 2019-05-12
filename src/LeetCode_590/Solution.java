package LeetCode_590;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            if (root.children.size() != 0) {
                for (Node node : root.children) {
                    List<Integer> temp = postorder(node);
                    for (Integer integer : temp) {
                        list.add(integer);
                    }
                }
            }
            list.add(root.val);
        }
        return list;
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