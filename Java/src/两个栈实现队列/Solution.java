package 两个栈实现队列;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description 两个栈实现队列
 * @Date 2019/12/17 16:01
 * @Created by Cheng
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // 如果此时stack2依旧为空，则整个数据为空
        return stack2.pop();
    }

    /**
     * 一个栈+递归栈实习队列
     * @return
     */
    public int pop2() {
        if (stack1.size() == 1) {
            return stack1.pop();
        }
        int temp = stack1.pop();
        int ret = pop2();
        stack1.push(temp);
        return ret;
    }
}
