package p50数组中的重复元素;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 10:23
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        int[] temp = new int[1];
        System.out.println(duplicate(nums,nums.length,temp));
        System.out.println(temp[0]);
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || numbers.length < 2) {
            duplication[0] = -1;
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != i) {
                if (numbers[numbers[i]] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
