package 字符串的排列;

import java.util.ArrayList;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/12/18 5:08
 * @Created by SunCheng
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> list = solution.Permutation("aa");
        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
