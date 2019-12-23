package 不用加减乘除做加法;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 9:48
 * @Author Cheng
 */
public class Solution {
    public int Add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}
