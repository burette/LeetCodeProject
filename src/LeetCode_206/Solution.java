package LeetCode_206;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode nex = null;
        while (head != null) {
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
}
