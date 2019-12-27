package 构建乘积数组;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/27 8:12
 * @Author SonnSei
 */
public class Solution {
    public int[] multiply(int[] A) {
        if(A==null || A.length<1)return null;
        int[] ret = new int[A.length];
        ret[0] = 1;
        for (int i = 1; i <ret.length ; i++) {
            ret[i] = ret[i - 1] * A[i - 1];
        }
        int temp = 1;
        for (int i = A.length-2; i >=0 ; i--) {
            temp *= A[i+1];
            ret[i] *= temp;
        }
        return ret;
    }
}
