package p36两个链表的第一个公共结点;

import utils.ListNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 12:02
 * @Author Cheng
 */
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode node1 = pHead1, node2 = pHead2;
        while (node2 != node1) {
            node1 = node1 == null?pHead2:node1.next;
            node2 = node2 == null?pHead1:node2.next;

            // 下面看一段错误代码
//            if (node1 == null) node1 = pHead2;
//            if (node2 == null) node2 = pHead1;
//            node1 = node1.next;
//            node2 = node2.next;
            // 乍一看没什么问题，而且在很多情况下也能获得正确结果，但是这段段代码有这么一个隐患：
            // node1或者node2可能在一次循环中移动两次！！！！
            // 这个题的原理是两个节点都移动同样的距离，所以最终才会在正确的地方停止
            // 但是如果有了上面这个问题，那可能就会影响最终结果
            // 来分析一下会出错的情况
            // 按照上面这段错误代码，节点在到达null的时候，下次循环会跳两次
            // 如果两个节点都路过null，都跳了两次，那最终结果依然正确
            // 但是如果其中一个节点没有路过null，整个过程就结束了，那最终结果就会是错误的
            // 而这种情况就是pHead1或者pHead2其中之一一开始就是null
        }
        return node1;
    }
}
