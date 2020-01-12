package p25复杂链表的复制;

import utils.RandomListNode;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/12/18 4:30
 * @Created by SunCheng
 */
public class Test {
    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        node1.next = node2;
        node2.next = node3;
        node1.random = node3;
        Solution solution = new Solution();
        solution.Clone(node1);
    }
}
