package 数值的整数次方;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/17 20:13
 * @Created by Cheng
 */
public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0) {
            if (exponent >= 0)
                return 0;
            throw new IllegalArgumentException("invalid  input");
        } else {
            if (exponent == 0) {
                return 1;
            } else if (exponent > 0) {
                double ret = Power(base,exponent/2)*Power(base,exponent/2);
                if((exponent&1)==1)
                    ret *=base;
                return ret;
            } else {
                return 1 / Power(base, -exponent);
            }
        }
    }
}
