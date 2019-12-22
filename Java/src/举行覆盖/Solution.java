package 举行覆盖;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/17 20:03
 * @Created by SunCheng
 */
public class Solution {

    public int RectCover(int target) {
        if (target == 0) return 0;
        return fib(target + 1);
    }


    public static int fib(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 1, b = 1;
        int ret = a + b;
        for (int i = 3; i <= n; i++) {
            ret = a + b;
            a = b;
            b = ret;
        }
        return ret;
    }
}
