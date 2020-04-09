package Test2;

import java.util.Stack;

/**
 * @ClassName _17_两个栈实现一个队列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/8 16:25
 */
public class _17_两个栈实现一个队列 {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public _17_两个栈实现一个队列() {
        in = new Stack<>();
        out = new Stack<>();
    }

    //在队尾删除元素
    public void appendTail(int value) {
        while (!out.isEmpty()){
            in.push(out.pop());
        }
        in.push(value);
    }

    //在对头删除元素
    public int deleteHead() {
        while (!in.isEmpty()){
            out.push(in.pop());
        }
        if (out.isEmpty()){
            return -1;
        }
        return out.pop();
    }



}