package LeetCode.栈;

import java.util.Stack;

/**
 * @ClassName lc_03_04化栈为对
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/15 15:34
 */
public class lc_03_04化栈为对 {
    /** Initialize your data structure here. */
    private Stack<Integer> in;
    private Stack<Integer> out;
    public lc_03_04化栈为对() {
        in = new Stack<>();
        out = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}