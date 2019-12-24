package 连续子数组的最大和;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/24 15:12
 * @Author Cheng
 */
public class Solution {
    /**
     * 暴力解法，O(n^3)
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = 0;
                for (int k = j; k <= i; k++) {
                    temp += nums[k];
                }
                max = max > temp ? max : temp;
            }
        }
        return max;
    }
}
