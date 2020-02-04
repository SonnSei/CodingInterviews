package p11二进制中1的个数;

/**
 * @Classname Solution2
 * @Description
 * @Date 2020/2/4 21:43
 * @Author SonnSei
 */
public class Solution2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (myBitCount(i) != Integer.bitCount(i)) {
                System.out.println("fail");
                return;
            }
        }
        System.out.println("success");
    }


    public static int myBitCount(int n) {
        n = n - ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n & 0x0f0f0f0f) + ((n >>> 4) & 0x0f0f0f0f);
        n = (n & 0x00ff00ff) + ((n >>> 8) & 0x00ff00ff);
        n = (n &0x0000ffff) + ((n >>> 16) & 0x0000ffff);
        return n;
    }
}
