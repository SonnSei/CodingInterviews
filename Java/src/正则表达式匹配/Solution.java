package 正则表达式匹配;

/**
 * @Classname Solution
 * @Description 正则表达式匹配
 * @Date 2019/12/24 10:45
 * @Author Cheng
 */
public class Solution {

    public static void main(String[] args) {
        char[] str = "abaaaa".toCharArray();
        char[] pattern = "a.ba*a".toCharArray();
        boolean ret = match(str, pattern);
        System.out.println(ret);

    }

    /**
     * 递归法
     * @param str
     * @param pattern
     * @return
     */
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        return match(str, 0, pattern, 0);
    }

    private static boolean match(char[] str, int sIndex, char[] pattern, int pIndex) {
        if(pIndex == pattern.length)return sIndex==str.length;
        boolean firstMatch = sIndex < str.length && (str[sIndex] == pattern[pIndex] ||pattern[pIndex]=='.');
        // 发现通配符
        if (pIndex < pattern.length - 1 && pattern[pIndex + 1] == '*') {
            return match(str, sIndex, pattern, pIndex + 2) || (firstMatch && match(str, sIndex + 1, pattern, pIndex));
        } else {
            return firstMatch && match(str, sIndex + 1, pattern, pIndex + 1);
        }
    }


}
