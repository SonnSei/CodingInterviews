package 滑动窗口的最大值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 16:32
 * @Author Cheng
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {

        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (num == null || size <= 0 || size > num.length) {
            return ret;
        }

        ArrayList<Integer> temp = null;
        int length = num.length;

        for (int i = 0; i < length - size + 1; i++) {
            temp = new ArrayList<Integer>();
            for (int j = i; j < size + i; j++) {
                temp.add(num[j]);
            }
            Collections.sort(temp);
            ret.add(temp.get(temp.size() - 1));
        }

        return ret;
    }
}
