package p62二叉搜索树的第K个结点;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/29 10:17
 * @Author SonnSei
 */
public class Solution2 {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(k<1)return null;
        List<TreeNode> list = new ArrayList<>();
        inOrder(pRoot,list);
        return k > list.size() ? null : list.get(k - 1);
    }

    private void inOrder(TreeNode node,List<TreeNode> list) {
        if(node == null)return;
        inOrder(node.left,list);
        list.add(node);
        inOrder(node.right,list);
    }
}
