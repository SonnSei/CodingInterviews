package 二叉搜索树的第K个结点;

import utils.TreeNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/29 10:11
 * @Author SonnSei
 */
public class Solution {
    static int count;
    static TreeNode ret;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        count = 0;
        ret = null;
        inOrder(pRoot,k);
        return ret;
    }

    private void inOrder(TreeNode node,int k) {
        if (node == null) {
            return ;
        }
        inOrder(node.left,k);
        count++;
        if (count == k) {
            ret = node;
            return;
        }
        inOrder(node.right,k);
    }
}
