package Test.测试;

import java.util.Stack;

/**
 * @ClassName _09_用两个栈实现队列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 10:45
 */
public class _09_用两个栈实现队列 {
    private Stack<Integer> a1;
    private Stack<Integer> a2;
    public _09_用两个栈实现队列() {
       a1 = new Stack<>();
       a2 = new Stack<>();
    }

    public void appendTail(int value) {
        while (!a1.isEmpty()){
            a1.push(a2.pop());
        }
        a1.push(value);
    }

    public int deleteHead() {
        while (!a1.isEmpty()){
            a2.push(a1.pop());
        }
        if (a2.isEmpty()){
            return -1;
        }
            return a2.pop();
    }
}