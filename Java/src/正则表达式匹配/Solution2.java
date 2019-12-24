package 正则表达式匹配;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

/**
 * @Classname Solution2
 * @Description 自顶向下
 * @Date 2019/12/24 14:30
 * @Author Cheng
 */
public class Solution2 {
    public static void main(String[] args) {
        String a = "abaaaa";
        String b = "a.ba*a";
        System.out.println(match(a.toCharArray(), b.toCharArray()));
    }

    /**
     * 备忘录
     *
     * @param str
     * @param pattern
     * @return
     */
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        // 0表示未探查，1表示true，2表示false
        // 为什么数组长度要是length+1？ 因为length可能为0，但是我们的数组是必须要初始化的
        // 大多数情况下数组空间有可能会有冗余
        Boolean[][] dp = new Boolean[str.length + 1][pattern.length + 1];
//        boolean ret = match(str, 0, pattern, 0, dp);
//        for (Boolean[] row : dp) {
//            System.out.println(Arrays.toString(row));
//        }
//        return ret;
        return match(str, 0, pattern, 0, dp);
    }


    private static boolean match(char[] str, int sIndex, char[] pattern, int pIndex, Boolean[][] dp) {
        if (pIndex == pattern.length) return sIndex == str.length;
        Boolean ans;
        if (dp[sIndex][pIndex] != null) {
            ans = dp[sIndex][pIndex];
        } else {
            boolean firstMatch = sIndex < str.length &&
                    (str[sIndex] == pattern[pIndex] || pattern[pIndex] == '.');
            // 发现通配符
            if (pIndex < pattern.length - 1 && pattern[pIndex + 1] == '*') {
                ans = match(str, sIndex, pattern, pIndex + 2, dp) || (firstMatch && match(str, sIndex + 1, pattern, pIndex, dp));
            } else {
                ans = firstMatch && match(str, sIndex + 1, pattern, pIndex + 1, dp);
            }
        }
        dp[sIndex][pIndex] = ans;
        return ans;
    }
}
