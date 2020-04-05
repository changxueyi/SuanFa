package LeetCode.链表;

import 链表03.LinkedList;

/**
 * @ClassName _206_反转链表https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/12 14:39
 */
public class _206_反转链表 {
    /**
     * 方法一：递归发，先假设问题条件成立，再写其他代码，
     * 写约束条件
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    //16点23分 2020/3/29
    public ListNode reverseList1(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next= null;
        return newHead;
    }


}