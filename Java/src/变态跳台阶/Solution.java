package 变态跳台阶;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description 变态跳台阶
 * @Date 2019/12/17 16:58
 * @Created by SonnSei
 */
public class Solution {
    /**
     * 数学规律
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }

    /**
     * 动态规划
     * @param target
     * @return
     */
    public int JumpFloorII2(int target) {
        if(target <= 0)return 1;
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target - 1];
    }
}
