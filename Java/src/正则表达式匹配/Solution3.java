package 正则表达式匹配;

/**
 * @Classname Solution3
 * @Description 自底向上
 * @Date 2019/12/24 14:56
 * @Author SonnSei
 */
public class Solution3 {
    public static boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--) {
            for (int j = pattern.length() - 1; j >= 0; j--) {
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j];
                } else {
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }

    public boolean match(char[] str, char[] pattern) {
        if(str == null || pattern == null)return false;
        boolean[][] dp = new boolean[str.length + 1][pattern.length + 1];
        dp[str.length][pattern.length] = true;
        for (int i = str.length; i >=0 ; i--) {
            for (int j = pattern.length-1; j >=0 ; j--) {
                boolean firstMatch = i < str.length &&
                        (pattern[j] == str[i]||pattern[j]=='.');
                if (j + 1 < pattern.length && pattern[j + 1] == '*') {
                    dp[i][j] = dp[i][j + 2] || firstMatch && dp[i + 1][j];
                } else {
                    dp[i][j] = firstMatch && dp[i+ 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}
