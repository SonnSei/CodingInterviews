package 和为S的两个数字;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 13:18
 * @Author SunCheng
 */
public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution solution = new Solution();
        System.out.println(solution.FindNumbersWithSum(array, 7));
    }

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int val : array) {
            set.add(val);
        }
        ArrayList<Integer> ret = new ArrayList<>();
        for (int val : array) {
            if (set.contains(sum - val)) {
                ret.add(val);
                ret.add(sum - val);
                return ret;
            }
        }
        return ret;
    }
}
