package p59之字型顺序打印二叉树;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/28 9:15
 * @Author SonnSei
 */
public class Solution2 {
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
