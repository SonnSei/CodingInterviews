package p6旋转数组的最小数字;

/**
 * @Classname Solution
 * @Description 旋转数组的最小数字
 * @Date 2019/12/17 16:07
 * @Created by Cheng
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left= 0,right = array.length-1;
        while (left < right) {
            int mid = (left+right)>>>1;
            if (array[left] == array[mid] && array[mid] == array[right]) {
                return search(array, left, right);
            }

//            if (array[left] <= array[mid]) {
//                left = mid;
//            } else {
//                right = mid;
//            }

            // ！ ！！！！！这里为什么要从右边开始判断？
            // 因为，二分查找的判断依据是，排除一个区间，然后找另一个区间，在这个题中，当我们找到一个有序区间后（即left的值小于或等于right）
            // 此时并不能将这个区间排除，因为该区间的最小值依然可能是最终答案，那么如何解决呢？
            // 从右边开始判断，如果右区间是有序的，那我们可以把右区间的最左边的值放入下次判断的区间内，这样就不会丢失它
            // 但是如果从左边，那就莫得办法了
            // 同理，如果题目刚好相反，降序排列的旋转数组，然后找最大值，那就需要从左边开始
            if (array[mid] <= array[right]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return array[left];
    }

    private int search(int[] array, int left, int right) {
        for (int i = left; i <right ; i++) {
            if (array[i] > array[i + 1]) {
                return array[i];
            }
        }
        return array[left];
    }
}
