package p35数组中的逆序对;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/22 10:05
 * @Author Cheng
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 0};
        Solution solution = new Solution();
        System.out.println(solution.InversePairs(nums));
    }

    public int InversePairs(int[] array) {
        int[] ret = new int[1];
        if (array == null || array.length < 2) return 1;
        mergeSort(array, 0, array.length - 1, ret);
        return ret[0];
    }

    private void mergeSort(int[] array, int left, int right, int[] ret) {
        if (left >= right) return;
        int mid = (left + right) >>> 1;
        mergeSort(array, left, mid, ret);
        mergeSort(array, mid + 1, right, ret);
        int l = left, r = mid + 1;
        while (r <= right) {
            while (l <= mid && array[l] < array[r]) {
                l++;
            }
            ret[0]+=mid-l+1;
            ret[0] = ret[0]%1000000007;
            r++;
        }
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int p1 = left, p2 = mid + 1;
        int k = 0;
        while (p1 <= mid && p2 <= right) {
            if (array[p1] <= array[p2]) {
                temp[k] = array[p1++];
            } else {
                temp[k] = array[p2++];
            }
            k++;
        }
        while (p1 <= mid) temp[k++] = array[p1++];
        while (p2 <= right) temp[k++] = array[p2++];
        for (int i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
    }
}
