package 顺时针打印矩阵;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 2:37
 * @Created by Cheng
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(matrix == null || matrix.length<1)return ret;
        int rowUp = 0, rowDown = matrix.length - 1, colLeft = 0, colRight = matrix[0].length - 1;
        // 要把每行每列的最后一个元素扫上，如右上角的元素要放在第一行的从左至右扫描中
        // 反例：下面这段代码在只有一个元素的时候会出错
        /*
            for (int col = colLeft; col < colRight; col++) {
                ret.add(matrix[rowUp][col]);
            }
            for (int row = rowUp; row <rowDown ; row++) {
                ret.add(matrix[row][colRight]);
            }
            if (rowDown != rowUp) {
                for (int col = colRight; col > colLeft; col--) {
                    ret.add(matrix[rowDown][col]);
                }
            }
            if (colLeft != colRight) {
                for (int row = rowDown; row >rowUp; row--) {
                    ret.add(matrix[row][colLeft]);
                }
            }
         */
        while (rowUp <= rowDown && colLeft <= colRight) {
            for (int col = colLeft; col <= colRight; col++) {
                ret.add(matrix[rowUp][col]);
            }
            for (int row = rowUp+1; row <=rowDown ; row++) {
                ret.add(matrix[row][colRight]);
            }
            if (rowDown != rowUp) {
                for (int col = colRight-1; col > colLeft; col--) {
                    ret.add(matrix[rowDown][col]);
                }
            }
            if (colLeft != colRight) {
                for (int row = rowDown-1; row >rowUp; row--) {
                    ret.add(matrix[row][colLeft]);
                }
            }
            rowUp++;rowDown--;colLeft++;colRight--;
        }
        return ret;
    }
}
