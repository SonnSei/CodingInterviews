package p61序列化二叉树;

/**
 * @Classname Solution3
 * @Description 基于中序遍历——未完成
 * @Date 2019/12/29 9:47
 * @Author SonnSei
 */
public class Solution3 {
//    public static void main(String[] args) {
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(4);
//        node1.left = node2;
//        node1.right = node3;
//        node3.left = node4;
//
//        String str = Serialize(node1);
//        TreeNode root = Deserialize(str);
//        System.out.println(str);
//    }
//
//    public static String Serialize(TreeNode root) {
//        StringBuilder ret = new StringBuilder();
//        inOrder(root, ret);
//        return ret.toString();
//    }
//
//    private static void inOrder(TreeNode node, StringBuilder ret) {
//        if (node == null) {
//            ret.append("#!");
//            return;
//        }
//        inOrder(node.left,ret);
//        ret.append(node.val + "!");
//        inOrder(node.right,ret);
//    }
//
//    public static TreeNode Deserialize(String str) {
//        String[] values = str.split("!");
//        Queue<String> queue = new LinkedList<>();
//        for (String item : values) {
//            queue.add(item);
//        }
//        return deserialize(queue);
//    }
//
//    private static TreeNode deserialize(Queue<String> queue) {
//        String value = queue.peek();
//        if (value.equals("#")) {
//            return null;
//        }
//        TreeNode left = deserialize(queue);
//        TreeNode root= new TreeNode(Integer.parseInt(queue.poll()));
//        TreeNode right = deserialize(queue);
//        root.left = left;root.right = right;
//        return root;
//    }
}
