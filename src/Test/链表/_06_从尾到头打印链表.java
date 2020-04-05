package Test.链表;

import LeetCode.链表.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName _06_从尾到头打印链表
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/20 23:24
 */
public class _06_从尾到头打印链表 {
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

    //输入一个链表，从尾到头顺序返回一个ArrayList
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //定义一个链表节点tmp
        ListNode tmp = listNode;
        while (tmp != null) {
            //加入这个位置，会一次往后排
            list.add(0, tmp.val);
            tmp = tmp.next;
        }
        return list;
    }

    //20点27分 2020/3/12

    /**
     * 创建一个栈，栈用泛型，并且栈中的类型为listNode
     * 设初始 head为 temp 这个节点
     * 当temp不为空时候，把元素push进栈中
     * 创建一个数组列表，大小为栈的大小
     * 循环遍历，直到遍历pop完所有的值，最后打印这个输出
     */
    public int[] reversePrint2(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i =0;i<size;i++){
            print[i] = stack.pop().val;
        }
        return print;
    }

    //14点15分
    public static int[] reversePrint3(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        int[] arr ;
        int size = stack.size();
        arr =new int[size];
        for (int i = 0 ; i < size;i++){
            //注意：这个位置是弹出的值，一定是弹出的值，记住啦啊
            arr[i] = stack.pop().val;
        }
        return arr;
    }

}