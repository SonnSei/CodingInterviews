package 之字型顺序打印二叉树;

import utils.TreeNode;

import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 14:16
 * @Author SonnSei
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
}
