package LeetCode_21;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode target = null;
        if (l1.val > l2.val) {
            target = l2;
            l2 = l2.next;
        } else {
            target = l1;
            l1 = l1.next;
        }
        ListNode mergeNode = target;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                target.next = l2;
                l2 = l2.next;
            } else {
                target.next = l1;
                l1 = l1.next;
            }
            target = target.next;
            target.next = null;
        }
        if (l1 == null) {
            target.next = l2;
        } else {
            target.next = l1;
        }
        return mergeNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
