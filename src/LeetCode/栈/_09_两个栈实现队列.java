package LeetCode.栈;

import java.util.Stack;

/**
 * @ClassName _09_两个栈实现队列
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/15 20:38
 */
public class _09_两个栈实现队列 {
    /**
     * 方法一：
     * 思路：1.创建两个栈，一个进栈，一个出栈
     *      2.全部进栈，
     *      3.出栈：必须保证：out不为空情况下，因为为空整个队列就是空的
     *              in 不是空的时候，in可以出栈，进入out，当in为空时候
     */
   Stack<Integer> in = new Stack<Integer>();
   Stack<Integer> out = new Stack<Integer>();

   public void push(int node){
       in.push(node);
   }
   public int pop() throws  Exception{
       if (!out.isEmpty())
           while (!in.isEmpty())
               out.push(in.pop());
       if (out.isEmpty())
           throw new Exception("queue is empty");
       return out.pop();
   }
    /**
     * 方法二：leetcode分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     */
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public _09_两个栈实现队列() {
       stack1 = new Stack<>();
       stack2 = new Stack<>();
    }

    //在out里的都先进in里，再向in里加入一个元素，即可达到在队列尾部插入整数
    public void appendTail(int value) {
        while ((!stack2.isEmpty())){
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    public int deleteHead() {
        while ((!stack1.isEmpty())){
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }
}