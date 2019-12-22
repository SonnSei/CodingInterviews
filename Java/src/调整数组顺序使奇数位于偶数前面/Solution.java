package 调整数组顺序使奇数位于偶数前面;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/17 20:23
 * @Created by SunCheng
 */
public class Solution {
    /**
     * 统计奇数个数，然后利用辅助空间重新赋值
     * @param array
     */
    public void reOrderArray(int[] array) {
        int left = 0;
        int right = 0;
        for (int val : array) {
            if ((val & 1) == 1)
                right++;
        }
        int[] temp = array.clone();
        for (int val : temp) {
            if ((val & 1) == 1)
                array[left++] = val;
            else
                array[right++] = val;
        }
    }

    /**
     * 冒泡
     * @param array
     */
    public void reOrderArray2(int[] array) {
        for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    swap(array, j, j + 1);
                }
            }
        }
    }
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    /**
     * 这个方法并不能保证顺序一致
     * @param array
     */
//    public void reOrderArray2(int[] array) {
//        int left = 0,right = 0;
//        for (int i = 0; i < array.length; i++) {
//            if ((array[i] & 1) == 1) {
//                swap(array,i,left++);
//            }
//        }
//    }
//    public static void swap(int[] nums,int a,int b){
//        int temp = nums[a];
//        nums[a] = nums[b];
//        nums[b] = temp;
//    }
}
