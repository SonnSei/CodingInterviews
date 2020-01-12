package p21栈的压入弹出序列;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/18 3:37
 * @Created by Cheng
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0,popIndex = 0; pushIndex < pushA.length; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
