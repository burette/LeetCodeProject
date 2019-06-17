package LeetCode_160;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: burette
 * @Date: 2019/6/17 10:10
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //set的思想，先储存一个链表，再遍历另一个链表，空间复杂度O（N）
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;

//        while (headA != null && headB != null) {
//            if (headA == headB) {
//                return headA;
//            } else {
//                headA = headA.next;
//                headB = headB.next;
//            }
//        }
//        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}