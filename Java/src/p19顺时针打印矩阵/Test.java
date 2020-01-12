package p19顺时针打印矩阵;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/12/18 2:45
 * @Created by SunCheng
 */
public class Test {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        Solution solution = new Solution();
        System.out.println(solution.printMatrix(matrix));
    }
}
