package p57二叉树的下一个结点;

import utils.TreeLinkNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 14:01
 * @Author SonnSei
 */
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)return null;
        // 该节点存在右子树，则下一个结点是右子树中的最左
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while(node.left!=null)node = node.left;
            return node;
        }
        // 该节点无右子树，且为父节点的左子树，则下一个节点是父节点
        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }
        // 该节点无右子树，且为其父节点的右子树，则向上找到第一个为父节点左子树的结点返回
        if (pNode.next != null && pNode.next.right == pNode) {
            while(pNode.next!=null && pNode.next.left!=pNode)pNode = pNode.next;
            if(pNode.next!=null)return pNode.next;
        }
        return null;
    }
}
