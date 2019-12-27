package 字符流中第一个不重复字符;

import java.util.LinkedHashMap;

import java.util.Set;

/**
 * @Classname Solution
 * @Description 哈希链表
 * @Date 2019/12/23 11:14
 * @Author SonnSei
 */
public class Solution {
    //Insert one char from stringstream
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    public void Insert(char ch)
    {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        Set<Character> characters = map.keySet();
        for (char ch : characters) {
            if(map.get(ch)==1)
                return ch;
        }
        return '#';
    }
}
