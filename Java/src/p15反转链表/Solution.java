package p15反转链表;

import utils.ListNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/17 20:40
 * @Created by Cheng
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

    public ListNode ReverseList2(ListNode head) {
        if(head == null)return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = reverse(head);
        return dummyHead.next;
    }

    private ListNode reverse(ListNode node) {
        if(node.next==null)
            return node;
        ListNode pre = reverse(node.next);

        // 尾插
        ListNode cur = pre;
        while(cur.next!=null)cur = cur.next;
        cur.next = node;
        node.next = null;
        return pre;
    }
}
