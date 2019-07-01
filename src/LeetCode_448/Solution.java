package LeetCode_448;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int flag[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            flag[nums[i]]++;
        }
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (flag[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
