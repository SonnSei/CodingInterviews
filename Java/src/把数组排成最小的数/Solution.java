package 把数组排成最小的数;

import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 9:17
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 32, 321};
        System.out.println(PrintMinNumber(nums));

    }

    public static String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0) return "";
        List<Integer> list = new ArrayList<>();
        for (int val : numbers) {
            list.add(val);
        }
        Collections.sort(list,(o1,o2)->(""+o1+o2).compareTo(""+o2+o1));
        StringBuilder sb = new StringBuilder();
        for (int val : list) {
            sb.append(val);
        }
        return sb.toString();
    }
}
