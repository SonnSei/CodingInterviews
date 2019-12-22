package 和为S的连续正数序列;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 13:02
 * @Author SunCheng
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> lists = solution.FindContinuousSequence(9);
        for (List list : lists) {
            System.out.println(list);
        }
    }
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret= new ArrayList<>();
        if(sum<3)return ret;
        ArrayList<Integer> temp = new ArrayList<>();
        int left = 1, right = 2,tempSum = 3;
        temp.add(left);
        temp.add(right);
        while (right < sum && left < right) {
            if (tempSum == sum) {
                ret.add(new ArrayList<>(temp));
                temp.remove(0);
                tempSum-=left++;
                tempSum+=++right;
                temp.add(right);
            } else if (tempSum > sum) {
                temp.remove(0);
                tempSum-=left;
                left++;
            } else {
                tempSum+=++right;
                temp.add(right);
            }
        }
        return ret;
    }
}
