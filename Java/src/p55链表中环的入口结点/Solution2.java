package p55链表中环的入口结点;

import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/27 9:33
 * @Author SonnSei
 */
public class Solution2 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = pHead;
        while (cur != null) {
            if (set.contains(cur)) {
                return cur;
            }
            set.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
