package utils;

/**
 * @Classname TreeNode
 * @Description TODO
 * @Date 2019/12/17 15:36
 * @Created by SunCheng
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val+"";
    }
}
