package 字符串的排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 4:57
 * @Created by SunCheng
 */
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ret = new ArrayList<>();
        if(str == null || str.length()==0)return ret;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[str.length()];
        StringBuilder tempStr = new StringBuilder();
        recursion(ret,chars,used,tempStr, 0, str.length());
        Collections.sort(ret);
        return ret;
    }

    private void recursion(ArrayList<String> ret, char[] chars, boolean[] used, StringBuilder tempStr, int index, int length) {
        if (index == length) {
            ret.add(tempStr.toString());
            return;
        }

        for (int i = 0; i < length; i++) {
            if(used[i])continue;
            if(i>0 && chars[i]==chars[i-1] && !used[i-1])continue;
            tempStr.append(chars[i]);
            used[i] = true;
            recursion(ret,chars,used,tempStr,index+1,length);
            used[i] = false;
            tempStr.deleteCharAt(tempStr.length() - 1);
        }
    }
}
