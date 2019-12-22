package 复杂链表的复制;

import utils.RandomListNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 4:19
 * @Created by SunCheng
 */
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)return null;
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode next = new RandomListNode(cur.label);
            next.next = cur.next;
            cur.next = next;
            cur = next.next;
        }

        cur = pHead;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        RandomListNode cloneHead = pHead.next;
        cur = pHead;
        // 注意cur.next!=null
        while (cur != null&& cur.next!=null) {
            RandomListNode next = cur.next;
            cur.next = cur.next.next;
            cur = next;
        }

        return cloneHead;
    }
}
