package 旋转数组的最小数字;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/12/17 16:15
 * @Created by SunCheng
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        Solution solution = new Solution();
        int ret = solution.minNumberInRotateArray(nums);
        System.out.println(ret);
    }
}
