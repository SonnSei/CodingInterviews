package 数据流中的中位数;

import java.util.PriorityQueue;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/23 16:25
 * @Author SonnSei
 */
public class Solution {
    // 右堆是小顶堆
    PriorityQueue<Integer> right = new PriorityQueue<>();
    // 左堆是大顶堆
    PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    int count = 0;
    public void Insert(Integer num) {
        // 偶数放到左堆
        if ((count & 1) == 0) {
            right.add(num);
            left.add(right.poll());
        }
        // 奇数放到右堆
        else {
            left.add(num);
            right.add(left.poll());
        }
        count++;
    }

    public Double GetMedian() {
        // 如果是偶数个，左堆和右堆顶的值除以2
        if(count%2 == 0)
            return (left.peek()+right.peek())/2.0;
        // 如果是奇数个，去左堆顶
        return left.peek()/1.0;
    }
}
