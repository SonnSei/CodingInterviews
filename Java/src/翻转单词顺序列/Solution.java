package 翻转单词顺序列;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 13:26
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        String s = "student. a am I";
        System.out.println(ReverseSentence(s));
    }

    public static String ReverseSentence(String str) {
        // 这个特殊输入有点怪
        if(str.trim().length()==0)return str;
        // !!!!不需要反转，从后往前遍历不就行了
//        String[] strings = str.split(" ");
//        for (int i = 0; i < strings.length/2; i++) {
//            String temp = strings[i];
//            strings[i] = strings[strings.length-1-i];
//            strings[strings.length-1-i] = temp;
//        }
//        StringBuilder ret = new StringBuilder();
//        for(String s:strings)
//            ret.append(s + " ");

        String[] strings = str.split(" ");
        StringBuilder ret = new StringBuilder();
        for (int i = strings.length-1; i >=0 ; i--) {
            ret.append(strings[i]+" ");
        }
        return ret.toString().trim();
    }

}
