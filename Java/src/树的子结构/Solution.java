package 树的子结构;

import utils.TreeNode;

/**
 * @Classname Solution
 * @Description 树的子结构
 * @Date 2019/12/18 1:22
 * @Created by Cheng
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root2 == null||root1 == null)return false;
        boolean thisIsRoot = root1.val == root2.val? subTreeFromRoot(root1, root2):false;
        return thisIsRoot || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    // 判断两个根节点延申出的树是否为包含与包含关系
    private boolean subTreeFromRoot(TreeNode root1, TreeNode root2) {
        if(root1==null && root2 == null)return true;
        if(root2 == null)return true;
        if(root1 ==null ||root1.val != root2.val )return false;
        return subTreeFromRoot(root1.left, root2.left) && subTreeFromRoot(root1.right, root2.right);
    }
}
