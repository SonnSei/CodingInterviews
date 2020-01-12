package p37数字在排序数组中出现的次数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 12:28
 * @Author Cheng
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int l = leftSearch(array, k);
        int r = leftSearch(array,k + 1);
        if(l>=array.length || array[l]!=k)
            return 0;
        return r-l;
        // 注意下面这个错误写法
//        return array[l]==k?r-l:0;
    }

    public static int leftSearch(int[] nums, int target) {
        int l = 0,r = nums.length;
        while (l < r) {
            int mid = (l+r)>>>1;
            //如果数组中不存在target，那就相当于寻找target的插入位置
            //如果遇到target的值，用==的意思就类似于假装它不存在
            if (target <= nums[mid]) {
                r = mid;
            }else
                l = mid+1;
        }
        return l;
    }
}
