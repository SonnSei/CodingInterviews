package p24二叉树中和为某一值的路径;

import utils.TreeNode;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 4:10
 * @Created by Cheng
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ret= new ArrayList<>();
        if(root == null)return ret;
        backTracking(ret, list, root, 0,target);
        return ret;
    }

    private void backTracking(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> list, TreeNode node,int sum, int target) {
        list.add(node.val);
        sum+=node.val;
        if (node.left==null && node.right == null && sum == target) {
            ret.add(new ArrayList<>(list));
        }
        if(node.left!=null)
            backTracking(ret,list,node.left,sum,target);
        if(node.right != null)
            backTracking(ret,list,node.right,sum,target);
        list.remove(list.size() - 1);
        return;
    }
}
