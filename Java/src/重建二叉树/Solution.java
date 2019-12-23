package 重建二叉树;

import utils.TreeNode;

/**
 * @Classname Solution
 * @Description 重建二叉树
 * @Date 2019/12/17 15:36
 * @Created by Cheng
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        // 假设输入都是有效的
        TreeNode root = recursion(pre, 0,pre.length-1,in,0,in.length-1);
        return root;
    }

    private TreeNode recursion(int[] pre, int preStart,int preEnd,int[] in, int inStart, int inEnd) {
        if (inStart>inEnd||preStart>preEnd) {
            return null;
        }
        int val = pre[preStart];
        TreeNode ret = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == val) {
                ret.left = recursion(pre, preStart+1,preStart+(i-inStart),in,inStart,i-1);
                ret.right = recursion(pre, preStart+(i-inStart)+1,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return ret;
    }
}
