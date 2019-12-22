package 从尾到头打印链表;

import utils.ListNode;

import java.util.ArrayList;

import java.util.Collections;

/**
 * @Classname Solution
 * @Description 从尾到头打印链表
 * @Date 2019/12/17 15:24
 * @Created by SunCheng
 */
public class Solution {
    /**
     * 递归
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null) return ret;
        recursion(ret, listNode);
        return ret;
    }

    private void recursion(ArrayList<Integer> ret, ListNode listNode) {
        if (listNode.next != null)
            recursion(ret, listNode.next);
        ret.add(listNode.val);
    }

    /**
     * 反转链表
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null) return ret;
        listNode = reverseLinkedList(listNode);
        while (listNode != null) {
            ret.add(listNode.val);
            listNode = listNode.next;
        }
        return ret;
    }

    private ListNode reverseLinkedList(ListNode node) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        ListNode next = null;
        while (node != null) {
            next = node.next;
            node.next = dummyHead.next;
            dummyHead.next = node;
            node = next;
        }
        return dummyHead.next;
    }

    /**
     * 反转集合
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null) return ret;
        while (listNode != null) {
            ret.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(ret);
        return ret;
    }
}
