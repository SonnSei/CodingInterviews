package p40数组中只出现一次的数字;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 12:41
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 6, 3, 2, 5, 5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        Solution solution = new Solution();
        solution.FindNumsAppearOnce2(nums, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int val : array) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
            if (map.get(val) > 1) {
                map.remove(val);
            }
        }
        Set<Integer> keys= map.keySet();
        int index = 0;
        for (int key : keys) {
            if (index++ == 0) {
                num1[0] = key;
            } else {
                num2[0] = key;
            }
        }
    }

    public void FindNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
        int bitRetStr = 0;
        for (int val : array) {
            bitRetStr^=val;
        }
        int index = getDiffIndex(bitRetStr);
        int bitLeftRet = 0,bitRightRet = 0;
        for (int val : array) {
            if (zeroInIndex(val, index)) {
                bitLeftRet ^= val;
            } else {
                bitRightRet^=val;
            }
        }
        num1[0] = bitLeftRet;
        num2[0] = bitRightRet;
    }

    private boolean zeroInIndex(int val, int index) {
        return ((val>>index) & 1)==0;
    }

    //
    private int getDiffIndex(int bitRetStr) {
        int ret = 0;
        while ((bitRetStr & 1) == 0) {
            ret++;
            bitRetStr>>=1;
        }
        // 因为bitRetStr一定不等于0，所以这个循环一定有出口
        // 注意下面这个写法是错误的，因为需要的是位运算，而不是十进制运算
//        while (bitRetStr % 10 == 0) {
//            ret++;
//            bitRetStr = bitRetStr/10;
//        }
        return ret;
    }
}
