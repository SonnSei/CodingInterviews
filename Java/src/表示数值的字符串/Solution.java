package 表示数值的字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 10:46
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        char[] chars = "+100".toCharArray();
        System.out.println(isNumeric(chars));
    }
    public static boolean isNumeric(char[] str) {
        if(str == null || str.length == 0)return false;
        int start = 0;
        char first = str[0];
        int eCount = 0;
        int dotCount = 0;
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == '+' || c == '-') {
                if(i==0 || str[i-1]=='e'||str[i-1]=='E')
                    continue;
                else
                    return false;
            } else if (c == 'e' || c == 'E') {
                if(i == 0 ||i == str.length-1 || (i == str.length-2 && str[i+1]<'0' && str[i+1]>'9'))return false;
                eCount++;
            } else if (c == '.') {
                if(i == 0 || i == str.length-1)return false;
                if (eCount > 0) return false;
                dotCount++;
            } else if (c < '0' || c > '9') return false;
            if(dotCount>1||eCount>1)return false;
        }
        return true;
    }
}
