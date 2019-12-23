package 字符流中第一个不重复字符;

import java.util.ArrayList;

/**
 * @Classname Solution2
 * @Description 数组+list
 * @Date 2019/12/23 11:24
 * @Author Cheng
 */
public class Solution2 {
    int[] record = new int[128];
    ArrayList<Character> chars = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        record[ch-0]++;
        chars.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i = 0;i<chars.size();i++){
            if(record[(int)chars.get(i)] == 1)
                return chars.get(i);
        }
        return '#';
    }
}
