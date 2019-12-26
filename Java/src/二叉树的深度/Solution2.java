package 二叉树的深度;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/26 18:11
 * @Author SonnSei
 */
public class Solution2 {
    public int TreeDepth(TreeNode root) {
        if(root == null)return 0;
        int ret  = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ret++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
            }
        }
        return ret;
    }
}
