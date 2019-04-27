package LeetCode_445;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = transListNodeToNum(l1) + transListNodeToNum(l2);
        ListNode node = transNumToListNode(num);
        return node;
    }

    public static int transListNodeToNum(ListNode head) {
        if (head == null) {
            return 0;
        } else {
            int res = 0;
            while (head != null) {
                res = res * 10 + head.val;
                head = head.next;
            }
            return res;
        }
    }

    public static ListNode transNumToListNode(long num) {
        if (num == 0) {
            ListNode node = new ListNode(0);
            node.next = null;
            return node;
        }
        ListNode node = new ListNode(0);
        ListNode reNode = node;
        while (num > 0) {
            ListNode temp = new ListNode((int)num % 10);
            num /= 10;
            temp.next = node.next;
            node.next = temp;
        }
        return reNode.next;
    }
}
