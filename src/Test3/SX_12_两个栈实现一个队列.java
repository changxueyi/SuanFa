package Test3;

import java.util.Stack;

/**
 * @ClassName SX_12_两个栈实现一个队列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 18:06
 */
public class SX_12_两个栈实现一个队列 {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    //进栈
    public void push(int node) {
        in.push(node);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty())
            return -1;
        return out.pop();
    }
}