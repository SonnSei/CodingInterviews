package 删除链表中重复的节点;

import utils.ListNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 13:46
 * @Author SonnSei
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)return pHead;

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        // 注意这句不能加，pHead可能并不在结果之中
//        dummyHead.next = pHead;
        ListNode temp = pHead;

        while (temp != null) {
            if (temp.next == null || temp.next.val != temp.val) {
                // 先将结点从链表中取下来，切断其与后继的联系
                // 否则，比如 1-2-3-4-4-4，在把3添加到结果链上之后，其后续没有再发生改变，那最终结果也会带着后面的4
                ListNode next = temp.next;
                temp.next = null;
                cur.next = temp;
                cur = cur.next;
                temp = next;
            } else {
                int val = temp.val;
                while (temp != null && temp.val == val) {
                    temp = temp.next;
                }
            }
        }
        return dummyHead.next;
    }
}
