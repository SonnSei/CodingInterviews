package 链表中环的入口结点;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 11:27
 * @Author SonnSei
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next==null)return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }
        if(fast!=slow)return null;
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
