package Test4;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName Test01_从尾到头打印链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/28 14:28
 */
public class Test01_从尾到头打印链表 {
    public static int[] reversePrint(ListNode head) {
        if (head == null || head.next == null) return null;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        int[] cur = reversePrint(node1);
        System.out.println(Arrays.toString(cur));

    }


}