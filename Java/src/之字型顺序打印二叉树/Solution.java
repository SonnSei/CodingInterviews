package 之字型顺序打印二叉树;

import utils.TreeNode;

import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 14:16
 * @Author Cheng
 */
public class Solution {
    /**
     * 集合反转
     * @param root
     * @return
     */
    public List<List<Integer>> Print(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                curLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if (reverse) {
                Collections.reverse(curLevel);
            }
            reverse = !reverse;
            ret.add(new ArrayList<>(curLevel));
        }
        return ret;
    }


    /**
     * 两个栈
     * @param root
     * @return
     */
    public List<List<Integer>> Print2(TreeNode root){
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Stack<TreeNode> stackLeft = new Stack<>();
        Stack<TreeNode> stackRight = new Stack<>();
        stackLeft.push(root);
        while (!stackLeft.isEmpty() || !stackRight.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            // 左栈不为空时，其出出栈顺序就是从左往右。将子节点压入右栈时先左后右
            if (!stackLeft.isEmpty()) {
                curLevel.clear();
                while (!stackLeft.isEmpty()) {
                    TreeNode node = stackLeft.pop();
                    curLevel.add(node.val);
                    if (node.left != null) {
                        stackRight.push(node.left);
                    }
                    if (node.right != null) {
                        stackRight.push(node.right);
                    }
                }
                ret.add(new ArrayList<>(curLevel));
            } else {
                curLevel.clear();
                // 右栈不为空时，压左栈的顺序是先右后左
                while (!stackRight.isEmpty()) {
                    TreeNode node = stackRight.pop();
                    curLevel.add(node.val);
                    if (node.right != null) {
                        stackLeft.push(node.right);
                    }
                    if (node.left != null) {
                        stackLeft.push(node.left);
                    }

                }
                ret.add(new ArrayList<>(curLevel));
            }
        }
        return ret;
    }
}
