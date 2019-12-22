package 包含min函数的栈;

import java.util.Stack;

/**
 * @Classname Solution2
 * @Description 一个栈实现
 * @Date 2019/12/18 3:00
 * @Created by SunCheng
 */
public class Solution2 {
    Stack<Integer> stack = new Stack<>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        min = Integer.MAX_VALUE;
        return getMin();
    }

    int min = Integer.MAX_VALUE;
    private int getMin() {
        if(stack.isEmpty())
            return Integer.MAX_VALUE;
        int temp = stack.pop();
        min = Math.min(temp, min);
        min = Math.min(getMin(), min);
        stack.push(temp);
        return min;
    }
}
