package p57二叉树的下一个结点;

import utils.TreeLinkNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/28 8:56
 * @Author SonnSei
 */
public class Solution2 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)return null;
        TreeLinkNode root = pNode;
        while(root.next!=null)root = root.next;
        List<TreeLinkNode> list = new ArrayList<>();
        inOrder(list, root);
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1 && list.get(i)==pNode)
                return list.get(i + 1);
        }
        return null;
    }

    private void inOrder(List<TreeLinkNode> list, TreeLinkNode node) {
        if(node == null)return;
        inOrder(list,node.left);
        list.add(node);
        inOrder(list,node.right);
    }
}
