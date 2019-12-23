package 求1到n的和;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 9:46
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        int ret = Sum_Solution(10);
        System.out.println(ret);
    }
    public static int Sum_Solution(int n) {
        return n == 1 ? n : n + Sum_Solution(n - 1);
    }
}
