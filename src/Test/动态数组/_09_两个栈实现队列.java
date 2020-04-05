package Test.动态数组;
import java.util.Stack;

/**
 * @ClassName _09_两个栈实现队列
 * @Description TODO
 * 在队列尾部插入整数和在队列头部删除整数的功能(若队列中没有元素，deleteHead 操作返回 -1 )
 * @Author changxueyi
 * @Date 2020/2/19 22:26
 */
public class _09_两个栈实现队列 {
/*    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();*/
    private Stack<Integer> in;
    private Stack<Integer> out;
    public _09_两个栈实现队列() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    public void appendTail(int value) {
        while (!out.isEmpty()){
            in.push(out.pop());
        }
        out.push(value);
    }

    public int deleteHead() {
        while (!in.isEmpty()){
            out.push(in.pop());
        }
        if (out.isEmpty()){
            return -1;}
        return out.pop();
    }
}