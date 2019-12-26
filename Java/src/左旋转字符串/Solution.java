package 左旋转字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 13:23
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        String str = "abcXYZdef";
        Solution solution = new Solution();
        System.out.println(solution.LeftRotateString(str,3));
    }

    public String LeftRotateString(String str,int n) {
        if(str == null || str.length()==0 || n<0) return "";
        if(str.length()==1 || n == 0)return str;
        // 注意这里是n%str.length()，有一次写反了
        int move = n%str.length();
        return str.substring(move)+str.substring(0,move);
    }
}
