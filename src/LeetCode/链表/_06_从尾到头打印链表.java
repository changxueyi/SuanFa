package LeetCode.链表;

import java.util.*;

/**
 * @ClassName _06_从尾到头打印链表
 * @Description TODO输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @Author changxueyi
 * @Date 2020/2/20 10:05
 */
public class _06_从尾到头打印链表 {
    //方法一：建立一个链表，把元素加在最后面，再建立一个数组，元素都加在最后面
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] arr;
        arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.removeLast();
        }
        return arr;
    }

    //方法二：使用数组加栈
    public int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr;
        arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            //这个位置为什么是stack.size()就出错
            arr[i] = stack.pop();
        }
        return arr;
    }

    //牛客网题模板
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            //加入这个位置，会一次往后排
            list.add(0, tmp.val);
            tmp = tmp.next;
        }
        return list;
    }

    //10点12分 2020/3/12
    public int[] reversePrint2(ListNode head) {
        //输入一个链表的头节点，从为到头返回来每个节点的值，用数组返回
        Stack<Integer> stack = new Stack<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr;
        arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    //20点31分 2020/07/21
    public int[] reversePrint3(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr;
        arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}