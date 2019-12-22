package 二维数组中的查找;

import java.util.Random;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/12/17 14:48
 * @Created by SunCheng
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int target = 8120;
        final int N = 20000;
        int[][] matrix = new int[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= i+j;
            }
        }
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean result1 = solution.Find(target,matrix);
        long end1 = System.currentTimeMillis();
        boolean result2 = solution.Find2(target,matrix);
        long end2 = System.currentTimeMillis();
        System.out.println("O（n）："+(end1-start)+" ms result:"+result1);
        System.out.println("O（logn）："+(end2-end1)+" ms result:"+result2);
    }
}
