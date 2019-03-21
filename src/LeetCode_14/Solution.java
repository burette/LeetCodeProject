package LeetCode_14;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        else if (l1==null&&l2!=null){
            return l2;
        }
        else if(l1!=null&&l2==null){
            return l1;
        }
        else {
            ListNode result = new ListNode(0);
            ListNode temp = result;
            while(true){
                if(l1 != null){
                    temp.val = temp.val + l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    temp.val = temp.val + l2.val;
                    l2 = l2.next;
                }
                temp.next = new ListNode(temp.val / 10);
                temp.val = temp.val % 10;
                if(l1 == null && l2 == null){
                    temp.next = (temp.next.val==0?null:temp.next);
                    break;
                }
                temp = temp.next;
            }
            return result;
        }
    }
}
