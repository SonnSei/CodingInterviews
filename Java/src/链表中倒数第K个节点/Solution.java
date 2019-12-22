package 链表中倒数第K个节点;

import utils.ListNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/17 20:36
 * @Created by SunCheng
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null || k<1)return  null;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            if(fast == null)return null;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
