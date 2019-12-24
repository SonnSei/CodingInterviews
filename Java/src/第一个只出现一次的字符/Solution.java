package 第一个只出现一次的字符;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 9:56
 * @Author Cheng
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null)return -1;
        int[] arrayMap = new int[128];
        for (int i = 0; i < str.length(); i++) {
            arrayMap[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(arrayMap[str.charAt(i)]==1)
                return i;
        }
        return -1;
    }
}
