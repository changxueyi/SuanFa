package LeetCode.栈;

import java.util.Stack;

/**
 * @ClassName lc_03_02栈的最小值
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 17:07
 */
public class lc_03_02栈的最小值 {
    Stack<Integer> in;
    Stack<Integer> out;

    public lc_03_02栈的最小值() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {

        in.push(x);
        if (out.isEmpty() || out.peek() >= x) {
            out.push(x);
        }
    }

    public void pop() {

    }

    public int top() {
        return 1;
    }

    public int getMin() {
        return 1;
    }
}