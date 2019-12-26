package 跳台阶;

/**
 * @Classname Solution
 * @Description 跳台阶
 * @Date 2019/12/17 16:55
 * @Created by SonnSei
 */
public class Solution {
    public int JumpFloor(int target) {
        return fib(target + 1);
    }

    public static int fib(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 1,b = 1;
        int ret = a+b;
        for (int i = 3; i <= n; i++) {
            ret = a+b;
            a =b;
            b = ret;
        }
        return ret;
    }
}
