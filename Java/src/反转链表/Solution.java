package 反转链表;

import utils.ListNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/17 20:40
 * @Created by SunCheng
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (head != null) {
            ListNode next = head.next;
            head.next = dummyHead.next;
            dummyHead.next = head;
            head = next;
        }
        return dummyHead.next;
    }
}
