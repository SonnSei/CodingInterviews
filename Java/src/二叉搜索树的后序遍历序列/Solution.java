package 二叉搜索树的后序遍历序列;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 3:45
 * @Created by SunCheng
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        if(start+1>=end)return true;
        int key = sequence[end];
        // 如果只有左子树，mid要停在end'上，如果这里是mid=end-1，下面的for循环可能始终没有给mid赋值，导致后面的判断出问题
        // 测试{1，2，3，4，5}可知
        int mid = end;
        for (int i = start; i <=end ; i++) {
            if (sequence[i] >key) {
                mid = i;
                break;
            }
        }
        // 这样写比较简洁
//        int mid = start;
//        while(mid<end && sequence[mid]<=key)
//            mid++;

        for (int i = mid; i <end ; i++) {
            if(sequence[i]<key)
                return false;
        }
        return verify(sequence, start, mid-1) && verify(sequence, mid , end - 1);
    }

}
