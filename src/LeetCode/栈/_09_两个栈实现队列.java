package LeetCode.栈;

import java.util.Stack;

/**
 * @ClassName _09_两个栈实现队列
 * @Description TODO 总结：栈里面没有==null这样的，直接判空就是isEmpty（），调用去判空
 * @Author changxueyi
 * @Date 2020/2/15 20:38
 */
public class _09_两个栈实现队列 {
    /**
     * 方法一：
     * 思路：1.创建两个栈，一个进栈，一个出栈
     * 2.全部进栈，
     * 3.出栈：必须保证：out不为空情况下，因为为空整个队列就是空的
     * in 不是空的时候，in可以出栈，进入out，当in为空时候
     */
   /* Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception {
        if (!out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());
        if (out.isEmpty())
            throw new Exception("queue is empty");
        return out.pop();
    }
*/
    /**
     * 方法二：leetcode分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     */
    /*private Stack<Integer> stack1;//主栈
    private Stack<Integer> stack2;//辅助栈

    //stack1 相当于out
    //使用的时候，下面的注释记得去掉
    public _09_两个栈实现队列() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //在out里的都先进in里，再向in里加入一个元素，即可达到在队列尾部插入整数
    public void appendTail(int value) {
        while ((!stack2.isEmpty())) {
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    public int deleteHead() {
        while ((!stack1.isEmpty())) {
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }*/
    //leetcode 自己研究的版本
    private Stack<Integer> in;//辅助
    private Stack<Integer> out;//主

    public _09_两个栈实现队列() {
        in = new Stack<>();
        out = new Stack<>();
    }

    //队列的尾部加入一个元素
    public void appendTail(int value) {
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        out.push(value);
    }

    public int deleteHead() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        if (out.isEmpty()) {
            return -1;
        }
        return out.pop();
    }

    //牛客网 两个栈实现一个队列

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //进队列，把元素直接仍第一个栈就可以了
    public void push(int node) {
        stack1.push(node);
    }

    //出栈操作
    public int pop() {
        //如果栈二为空，栈一不空，把栈一元素放栈二
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        //如果栈一为空，栈二也为空，则抛出，队列为空
        if (stack2.isEmpty())
            //此处也可返回 -1
            throw new RuntimeException("Queue is empty!");
        //出队列，就是把栈二元素弹出来
        return stack2.pop();
    }


}