package 替换空格;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description 替换空格
 * @Date 2019/12/17 15:11
 * @Created by Cheng
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                list.add('%');
                list.add('2');
                list.add('0');
            } else {
                list.add(c);
            }
        }
        StringBuilder ret = new StringBuilder();
        for (char c :
                list) {
            ret.append(c);
        }
        return ret.toString();
    }

    public String replaceSpace2(StringBuffer str) {
        int left = str.length()-1;
        for (int i = 0; i <=left; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");// two
            }
        }
        int right = str.length()-1;
        for (int i = left; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == ' ') {
                str.setCharAt(right--, '0');
                str.setCharAt(right--, '2');
                str.setCharAt(right--, '%');
            } else {
                str.setCharAt(right--,c);
            }
        }
        return str.toString();
    }
}
