package p61序列化二叉树;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution2
 * @Description 基于前序遍历
 * @Date 2019/12/29 9:11
 * @Author SonnSei
 */
public class Solution2 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;

        String str = Serialize(node1);
        TreeNode root = Deserialize(str);
        System.out.println(str);
    }

    public static String Serialize(TreeNode root) {
        StringBuilder ret = new StringBuilder();
        preOrder(root, ret);
        return ret.toString();
    }

    private static void preOrder(TreeNode node, StringBuilder ret) {
        if (node == null) {
            ret.append("#!");
            return;
        } else {
            ret.append(node.val + "!");
        }
        preOrder(node.left,ret);
        preOrder(node.right,ret);
    }

    public static TreeNode Deserialize(String str) {
        String[] values = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (String item : values) {
            queue.add(item);
        }
        return deserialize(queue);
    }

    private static TreeNode deserialize(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")) {
            return null;
        }
        TreeNode root= new TreeNode(Integer.parseInt(value));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
        return root;
    }
}
