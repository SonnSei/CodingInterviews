package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Classname ShowTree
 * @Description TODO
 * @Date 2019/12/18 1:51
 * @Created by SunCheng
 */
public class ShowTree {
    public static void showTreeByLevel(TreeNode root) {
        List<List<TreeNode>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<TreeNode> tempList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                tempList.add(cur);
                if (cur != null) {
                    queue.add(cur.left);
                    queue.add(cur.right);
                }
            }
            lists.add(tempList);
        }
        for (List list :
                lists) {
            System.out.println(list);
        }
    }
}
