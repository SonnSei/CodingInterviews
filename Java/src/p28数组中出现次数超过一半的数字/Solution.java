package p28数组中出现次数超过一半的数字;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Solution
 * @Description 数组中出现次数超过一半的数字
 * @Date 2019/12/18 5:17
 * @Created by Cheng
 */
public class Solution {
    /**
     * 如果存在出现次数超过一半的数，那排序后的中间元素一定是它
     * 根据题意最后需要在判断
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int val = array[array.length / 2];
        int count = 0;
        for (int item : array) {
            if(item == val)
                count ++;
        }
        return count>array.length/2?val:0;
    }

    /**
     * 多数投票
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution2(int [] array) {
        int master = array[0];
        int count = 1;
        for (int i = 1; i <array.length; i++) {
            count = array[i]==master?count+1:count-1;
            if (count == 0) {
                count = 1;
                master = array[i];
            }
        }
        count = 0;
        for (int item : array) {
            if(item == master)
                count ++;
        }
        return count>array.length/2?master:0;
    }

    /**
     * map做记录
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution3(int [] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int ret = array[0];
        for (int val : array) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
            if (map.get(val) > maxCount) {
                maxCount = map.get(val);
                ret = val;
            }
        }
        return maxCount>array.length/2?ret:0;
    }
}
