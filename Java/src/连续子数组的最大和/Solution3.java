package 连续子数组的最大和;

/**
 * @Classname Solution3
 * @Description TODO
 * @Date 2019/12/24 15:13
 * @Author Cheng
 */
public class Solution3 {
    /**
     * 第二种解法的改进，不需要数组记录临时和，只需要维护一个int变量就行了，复杂度不变，空间复杂度变为O(1)
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            //注意这个地方改了
            for (int j = i; j <nums.length; j++) {
                temp+=nums[j];
                if(temp>max)
                    max = temp;
            }
        }
        return max;
    }
}
