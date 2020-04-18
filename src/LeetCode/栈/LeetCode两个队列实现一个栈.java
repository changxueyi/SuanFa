package LeetCode.栈;

import LeetCode.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LeetCode两个队列实现一个栈
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 20:42
 */
public class LeetCode两个队列实现一个栈 {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    //模拟入栈
    public boolean push(int value) {
        if (!queue1.isEmpty()) {
            return queue1.offer(value);
        } else {
            return queue2.offer(value);
        }
    }
    //模拟弹出
    public int pop() {
        if (!queue1.isEmpty()&&queue2.isEmpty()){
            while(queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if (queue1.isEmpty()&&!queue2.isEmpty()){
            while (queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
        return -1;
    }
    @Override
    public String toString() {
        return this.queue1.toString() + ", " +this.queue2.toString();
    }

    public static void main(String[] args) {
        LeetCode两个队列实现一个栈 s = new LeetCode两个队列实现一个栈();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s);
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s);
    }


}