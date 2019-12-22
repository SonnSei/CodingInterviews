package 二叉搜索树与双向链表;

import utils.TreeNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 4:38
 * @Created by SunCheng
 */
public class Solution {
    TreeNode head = null;
    TreeNode pre = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode node) {
        if(node == null)return ;
        inOrder(node.left);

        if(head == null)head = node;
        node.left = pre;
        if(pre!=null)
            pre.right = node;
        pre = node;

        inOrder(node.right);
    }
}
