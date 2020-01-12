package p61序列化二叉树;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution1
 * @Description 基于层序遍历
 * @Date 2019/12/29 8:31
 * @Author SonnSei
 */
public class Solution1 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;

        String str = Serialize(null);
        TreeNode root = Deserialize(str);
        System.out.println(root.val);
    }

    public static String Serialize(TreeNode root) {
        if(root == null) return "#!";
        StringBuilder ret = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                ret.append("#!");
            } else {
                ret.append(cur.val + "!");
                queue.add(cur.left);
                queue.add(cur.right);
            }
        }
        return ret.toString();
    }
    public static TreeNode Deserialize(String str) {
        String[] values = str.split("!");
        if(values[0].equals("#"))return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        for (int i = 1; i < values.length; i+=2) {
            TreeNode cur = queue.poll();
            String leftV = values[i];
            String rightV = values[i+1];
            if (!leftV.equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(leftV));
                cur.left = left;
                queue.add(left);
            }
            if (!rightV.equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(rightV));
                cur.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
