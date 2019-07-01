package LeetCode_234;

public class Solution {
    //LeetCode 234 回文链表
    public boolean isPalindrome(ListNode head) {
        int length = getLength(head);
        int arr[] = new int[length];
        int i = 0;
        while (head != null) {
            arr[i++] = head.val;
            head = head.next;
        }
        int left = 0, right = length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public int getLength(ListNode head) {
        int result = 0;
        while (head != null) {
            head = head.next;
            result++;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}