package p39平衡二叉树;

import utils.TreeNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 12:39
 * @Author SoonSei
 */
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)return true;
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1?(IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)):false;
    }

    private int maxDepth(TreeNode root) {
        if(root == null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
