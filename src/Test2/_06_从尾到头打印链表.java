package Test2;

import LeetCode.链表.ListNode;

import java.util.Stack;

/**
 * @ClassName _06_从尾到头打印链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/21 14:35
 */
public class _06_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
<<<<<<< HEAD
        while (head != null) {
=======
        while (head!= null) {
>>>>>>> a454660e5d5a51bb6461888777cf74cf727f8c22
            stack.push(head.val);
            head = head.next;
        }
        int[] arr;
<<<<<<< HEAD
        arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    public int[] reversePrint01(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (stack != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr;
        arr = new int[stack.size()];
        for (int i =0;i<arr.length;i++){
=======
        arr =new int[stack.size()];
        for (int i = 0 ; i< arr.length; i++){
>>>>>>> a454660e5d5a51bb6461888777cf74cf727f8c22
            arr[i] = stack.pop();
        }
        return arr;
    }
}