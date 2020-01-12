package p53表示数值的字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 10:46
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        char[] chars = "+100".toCharArray();
        System.out.println(isNumeric(chars));
    }
    public static boolean isNumeric(char[] str) {
        if(str == null || str.length == 0)return false;
        int eCount = 0;
        int dotCount = 0;
        for (int i = 0; i < str.length; i++) {
            char c = str[i];

            if (c == '+' || c == '-') {
                // 对于正负号，不允许其出现在末尾或者后面接非数字
                if(i<str.length-1 && str[i+1]<'0' && str[i+1]>'9')
                    return false;
                // 允许的情况（在排除了上面的特殊情况外）
                // 1. 出现在首位
                // 2. 出现在e或者E后面
                if(i==0 || str[i-1]=='e'||str[i-1]=='E')
                    continue;
                else
                    return false;
            }
            else if (c == 'e' || c == 'E') {
                // 对于e或者E，不允许的情况是
                // 1. 出现在首位
                // 2. 出现在末尾
                if(i == 0 ||i == str.length-1 )return false;
                eCount++;
            }
            else if (c == '.') {
                // 不可以出现在首位或者末尾
                if(i == 0 || i == str.length-1)return false;
                // 指数部分里是没有点的
                if (eCount > 0) return false;
                dotCount++;
            }
            // 其余字符
            else if (c < '0' || c > '9') return false;
            // e/E和dot各自的数量不能超过1
            if(dotCount>1||eCount>1)return false;
        }
        return true;
    }
}
