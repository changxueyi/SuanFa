package LeetCode.栈;

import java.util.Stack;

/**
 * @ClassName lc_03_04化栈为队
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 19:38
 */
public class lc_03_04化栈为队 {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public lc_03_04化栈为队() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek(){
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty(){
        return in.isEmpty()&&out.isEmpty();
    }
}