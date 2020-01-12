package p68打印1到最大的N位数;

import java.math.BigDecimal;

/**
 * @Classname Solution
 * @Description 打印1到最大的N位数
 * @Date 2019/12/23 7:55
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        printOneToNthDigits2(3);
    }

    public static void printOneToNthDigits(int n) {
        // 输入的数字不能为小于1
        if (n < 1) {
            throw new RuntimeException("The input number must larger than 0");
        }

        int[] arr = new int[n];
        // 分别对每一位赋值0-9
        changeValueOfIndex(arr, 0);
    }

    private static void changeValueOfIndex(int[] arr, int index) {
        if (index >= arr.length) {
            printArray(arr);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            arr[index] = i;
            changeValueOfIndex(arr,index+1);
        }

    }

    public static void printArray(int[] nums) {
        boolean flag = false;
        StringBuilder ret = new StringBuilder();
        for (int val : nums) {
            if (val != 0) {
                flag = true;
            }
            if (flag) {
                ret.append(val);
            }
        }
        System.out.println(ret.length()==0?0:ret.toString());

    }


    /**
     * 借助库函数
     * @param n
     */
    public static void printOneToNthDigits2(int n) {
        // 输入的数字不能为小于1
        if (n < 1) {
            throw new RuntimeException("The input number must larger than 0");
        }

        String numStr = "";
        for (int i = 0; i < n; i++) {
            numStr+=9;
        }
        BigDecimal end = new BigDecimal(numStr);
        BigDecimal begin = new BigDecimal(0);
        BigDecimal one = new BigDecimal(1);
        while (begin.compareTo(end) <= 0) {
            System.out.println(begin.toString());
            begin = begin.add(one);
        }
    }


}
