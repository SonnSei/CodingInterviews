package 最小的K个数;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description 最小的K个数
 * @Date 2019/12/18 15:25
 * @Created by Cheng
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(k > input.length || k<=0)return ret;
        for (int i = 0; i < k; i++) {
            for (int j = input.length-1; j >i ; j--) {
                if (input[j] < input[j - 1]) {
                    swap(input, j, j - 1);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            ret.add(input[i]);
        }
        return ret;
    }
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
