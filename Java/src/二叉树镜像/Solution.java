package 二叉树镜像;

import utils.TreeNode;

import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 1:30
 * @Created by Cheng
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        Mirror(root.left);
        Mirror(root.right);
    }
}
