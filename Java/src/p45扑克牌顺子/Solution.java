package p45扑克牌顺子;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 9:21
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,4};
    }
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length == 0)return false;
        Arrays.sort(numbers);
        int zeroCount = 0;
        for (int val : numbers) {
            if(val == 0)
                zeroCount++;
        }
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]==0)continue;
            int diff = numbers[i + 1] - numbers[i];
            if(diff ==0)return false;
            if (diff> 1) {
                zeroCount-=diff-1;
            }
            if(zeroCount<0)return false;
        }
        return true;
    }
}
