package 整数中1出现的次数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 8:34
 * @Author SunCheng
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(1410065408));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int ret = 0;
        long i = 1;
        long cur, left, right = 0;
        while ((n / i) != 0) {
            // 当前位
            cur = n / i % 10;
            // 高位数字
            left = n / (i * 10);
            // 低位数字
            right = n % i;

            if (cur == 0) {
                //如果为0,出现1的次数由高位决定,等于高位数字 * 当前位数
                ret += left * i;
            } else if (cur == 1) {
                //如果为1,出现1的次数由高位和低位决定,高位*当前位+低位+1
                ret += left * i + right + 1;
            } else {
                //如果大于1,出现1的次数由高位决定,//（高位数字+1）* 当前位数
                ret += (left + 1) * i;
            }
            i *= 10;
        }
        return ret;
    }
}
