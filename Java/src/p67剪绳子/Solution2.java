package p67剪绳子;

/**
 * @Classname Solution2
 * @Description 贪心
 * @Date 2019/12/30 9:12
 * @Author SonnSei
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(cutRope(10));
    }

    public static int cutRope(int target) {
        if(target<2)return 0;
        if(target == 2)return 1;
        if(target==3)return 2;

        // 要尽量分成长度为3的，除了要把4分成2*2
        int timesOf3 = target / 3;
        int timesOf2 = 0;
        // 当n=4的时候，剪成长度为2的两段
        switch (target % 3) {
            case 0:
                break;
            case 1:
                timesOf2=2;
                timesOf3--;
                break;
            default:
                timesOf2=1;
        }
        return (int) ((Math.pow(3, timesOf3)) * (Math.pow(2, timesOf2)));
    }
}
