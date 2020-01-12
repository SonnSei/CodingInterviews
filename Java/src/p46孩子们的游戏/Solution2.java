package p46孩子们的游戏;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2019/12/26 20:42
 * @Author SonnSei
 */
public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int ret = solution.LastRemaining_Solution(5, 3);
        System.out.println(ret);
    }
    public int LastRemaining_Solution(int n, int m) {
        if(n<1)return -1;
        if(n==1)return 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() != 1) {
            for (int i = 0; i < m - 1; i++) {
                index++;
            }
            index = index % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}
