package p69常数级时间复杂度删除链表节点;

import utils.ListNode;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 8:21
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ListNode node = new ListNode(i);
            if (i > 0) {
                nodes.get(i-1).next = node;
            }
            nodes.add(node);
        }
        ListNode head = nodes.get(0);
        ListNode node = nodes.get(9);
        head = deleteNode(head,node);
        showLinkedList(head);
    }

    public static void showLinkedList(ListNode head) {
        StringBuilder ret = new StringBuilder();
        while (head != null) {
            ret.append(head.val);
            if(head.next!=null)
                ret.append("-->");
            head = head.next;
        }
        System.out.println(ret.toString());
    }
    public static ListNode deleteNode(ListNode head, ListNode node) {
        //链表为空或node无效
        if (head == null || node == null) return null;
        // 删除头节点
        if (head == node) {
            ListNode next = head.next;
            head.next = null;
            head = next;
        }
        // 删除尾节点
        else if (node.next == null) {
            ListNode cur = head;
            while (cur.next != node) {
                cur = cur.next;
            }
            ListNode next = node.next;
            node.next = null;
            cur.next = next;
        }
        // 正常删除节点
        else {
            ListNode next = node.next;
            node.val = next.val;
            node.next = next.next;
            next.next = null;
        }
        return head;
    }
}
