package p30连续子数组的最大和;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/24 15:13
 * @Author Cheng
 */
public class Solution2 {
    /**
     * 动态规划，利用和数组，快速求解区间范围和，O（n^2）
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] sums = new int[nums.length + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
            for (int j = 0; j <= i; j++) {
                int temp = sums[i+1]-sums[j];
                if(temp>max)
                    max = temp;
            }
        }
        return max;
    }
}
