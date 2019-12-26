package 和为S的两个数字;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 13:18
 * @Author SonnSei
 */
public class Solution {
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
