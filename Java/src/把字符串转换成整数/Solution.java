package 把字符串转换成整数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 10:04
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        int ret = StrToInt("  133");
        System.out.println(ret);
    }

    public static int StrToInt(String str) {
        if (str == null || (str = str.trim()).length() == 0) return 0;
        int ret = 0;
        boolean minus = false;
        char c = str.charAt(0);
        if (c == '-') {
            str = str.substring(1);
            minus = true;
        } else if (c == '+') str = str.substring(1);
        else if (c < '0' || c > '9') return 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && ch - '7' > 0)) return 0;
            if (ret < Integer.MIN_VALUE / 10 || (ret == Integer.MIN_VALUE / 10 && ch - '8' > 0)) return 0;
            int value = ch - '0';
            if (value < 0 || value > 9) return 0;
            ret = ret * 10;
            ret = minus ? ret - value : ret + value;
        }
        return ret;
    }
}
