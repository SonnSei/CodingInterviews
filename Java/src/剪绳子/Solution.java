package 剪绳子;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description 动态规划
 * @Date 2019/12/30 7:33
 * @Author SonnSei
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }

    public static int cutRope(int target) {
        if(target<2)return 0;
        if(target == 2)return 1;
        if(target==3)return 2;

        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int max ;
        for (int i = 4; i <=target ; i++) {
            max = 0;
            for (int j = 1; j <=i/2; j++) {
                int temp = dp[j]*dp[i-j];
                max = Math.max(temp, max);
            }
            dp[i] = max;
        }
        return dp[target];
    }
}
