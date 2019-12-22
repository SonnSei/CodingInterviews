package 合并两个排序的链表;

import utils.ListNode;

/**
 * @Classname Solution
 * @Description 合并两个有序链表
 * @Date 2019/12/18 1:17
 * @Created by SunCheng
 */
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1!=null)cur.next = list1;
        if(list2!=null)cur.next = list2;
        return dummyHead.next;
    }

    public ListNode Merge2(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2 == null)return list1;
        if (list1.val <= list2.val) {
            list1.next = Merge2(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge2(list1, list2.next);
            return list2;
        }
    }
}
