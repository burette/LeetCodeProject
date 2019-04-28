package LeetCode_876;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        int mid = length / 2 + 1;
        int i = 1;
        while (i < mid) {
            head = head.next;
            i++;
        }
        return head;
    }
}
