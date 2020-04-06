package Test2;

import LeetCode.链表.ListNode;

import java.util.ArrayList;
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

    public int[] reversePrint02(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head!=null){
            arrayList.add(0,head.val);
            head = head.next;
        }
        int[] arr;
        arr = new int[arrayList.size()];
        for (int i = 0;i<arr.length;i++){
            arr[i] = arrayList.remove(arrayList.size()-1);

        }
        return arr;
    }
}