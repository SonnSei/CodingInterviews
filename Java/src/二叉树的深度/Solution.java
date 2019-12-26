package 二叉树的深度;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 12:36
 * @Author SonnSei
 */
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null)return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
