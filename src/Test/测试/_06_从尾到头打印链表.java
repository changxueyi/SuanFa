package Test.测试;

import LeetCode.链表.ListNode;

import java.util.Stack;


/**
 * @ClassName _06_从尾到头打印链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 10:18
 */
public class _06_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int a = stack.size();
        int[] arr = new int[a];
        for (int i = 0 ;  i< arr.length;i++){
            arr[i] = stack.pop();
        }
        return arr;
    }
}