package 对称的二叉树;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/28 9:05
 * @Author SonnSei
 */
public class Solution2 {
    /**
     * 巧妙的迭代方法
     * @param root
     * @return
     */
    public boolean isSymmetrical2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }
            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }
}
